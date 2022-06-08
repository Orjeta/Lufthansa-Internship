package session_1;

import java.util.ArrayList;

public class Survey {
    private String title,description,topic;
    private ArrayList<Questions> questions = new ArrayList<Questions>();

    public Survey(String title, String description, String topic, ArrayList<Questions> questions) {
        this.title = title;
        this.description = description;
        this.topic = topic;
        this.questions = questions;
    }

    }

