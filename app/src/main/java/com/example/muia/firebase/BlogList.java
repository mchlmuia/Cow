package com.example.muia.firebase;

public class BlogList {
    private String Username;
    private String Timestamp;
    private String Title;
    private String Description;


    public BlogList(){}

    public BlogList(String username, String timestamp, String title, String description) {
        Username = username;
        Timestamp = timestamp;
        Title = title;
        Description = description;
    }

    public String getUsername() { return Username;
    }

    public String getTimestamp() { return Timestamp;
    }

    public String getTitle() {return Title;
    }

    public String getDescription() { return Description;
    }

    public void setUsername(String username) { Username = username;
    }

    public void setTimestamp(String timestamp) { Timestamp = timestamp;
    }

    public void setTitle(String title) { Title = title;
    }

    public void setDescription(String description) { Description = description;
    }
}

