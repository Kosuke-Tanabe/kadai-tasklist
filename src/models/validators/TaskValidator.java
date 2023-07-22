package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Task t) {
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(t.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_errors = validateContent(t.getContent());
        if(!content_errors.equals("")) {
            errors.add(content_errors);
        }

        return errors;
    }



    private static String validateTitle(String title) {
        if (title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String validateContent(String content) {
        if (content == null || content.equals("")) {
            return "メッセージ内容を入力してください。";
        }

        return "";
    }

}
