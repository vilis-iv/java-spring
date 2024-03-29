package com.example.restservice.greeting;

/**Using record**/
public record Greeting(long id, String content) { }

/*
**Using POJO class**
public class Greeting {
    long id;
    String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
*/

