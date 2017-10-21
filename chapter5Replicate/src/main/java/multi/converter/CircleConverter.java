package multi.converter;

import com.opensymphony.xwork2.LocaleProvider;
import com.opensymphony.xwork2.conversion.TypeConversionException;
import multi.beans.Circle;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Locale;
import java.util.Map;

public class CircleConverter extends StrutsTypeConverter implements LocaleProvider{

    private static final String SYNTAX_RADIUS_PREFIX = "C:R";
    private static final String BAD_SYNTAX ="Bad Syntax";
    private static final String BAD_RADIUS ="Radius not correct!";

    public Object convertFromString(Map context, String[] values, Class toClass) {
        final String radius_complete_form = values[0];
        Circle circle;
        if (!(radius_complete_form.startsWith(SYNTAX_RADIUS_PREFIX))) {
            throw new TypeConversionException("Bad Syntax");
        }
        try
        {
            String radius = radius_complete_form.substring(radius_complete_form.indexOf("R"));
            circle = new Circle(Double.valueOf(radius));
        }catch(Exception e)
        {
            throw new TypeConversionException(BAD_RADIUS);
        }

        return circle;
    }

    public String convertToString(Map context, Object o) {
        Circle circle = (Circle) o;
        return SYNTAX_RADIUS_PREFIX.concat(((Circle) o).getRadius().toString());
    }

    public Locale getLocale() {
        return null;
    }
}
