package swati4star.createpdf.util;

import android.content.Context;

import com.itextpdf.text.Font;

import java.util.ArrayList;

import swati4star.createpdf.R;
import swati4star.createpdf.model.EnhancementOptionsEntity;

public class TextEnhancementOptionsUtils {

    private static class SingletonHolder {
        static final TextEnhancementOptionsUtils INSTANCE = new TextEnhancementOptionsUtils();
    }

    public static TextEnhancementOptionsUtils getInstance() {
        return TextEnhancementOptionsUtils.SingletonHolder.INSTANCE;
    }

    public ArrayList<EnhancementOptionsEntity> getEnhancementOptions(Context context,
                                                                            String fontTitle,
                                                                            Font.FontFamily fontFamily) {
        ArrayList<EnhancementOptionsEntity> options = new ArrayList<>();

        options.add(new EnhancementOptionsEntity(
                context.getResources().getDrawable(R.drawable.ic_font_black_24dp),
                fontTitle));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.ic_font_family_24dp,
                String.format(context.getString(R.string.default_font_family_text), fontFamily.name())));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.ic_page_size_24dp, R.string.set_page_size_text));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.baseline_enhanced_encryption_24, R.string.set_password));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.ic_color, R.string.font_color));
        options.add(new EnhancementOptionsEntity(
                context, R.drawable.ic_page_color, R.string.page_color));
        return options;
    }
}
