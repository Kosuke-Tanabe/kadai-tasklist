package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Tasks;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Tasks t) {
        List<String> errors = new ArrayList<String>();

        String content_errors = validateContent(t.getContent());
        if(!content_errors.equals("")) {
            errors.add(content_errors);
        }

        return errors;
    }

    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return "タスクを入力してください。";
        }

        return "";
    }

}
