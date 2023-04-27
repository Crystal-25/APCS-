/*
import processing.core.*;
import java.util.Random;

public class Chatbot extends PApplet {

  private ChatbotResponse chatbotResponse;
  private String userInput;
  private boolean isTyping;
  private int textboxX; //horozontal position of textbook on the screen
  private int textboxY;
  private int textboxWidth;
  private int textboxHeight;
  private String aiResponse;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    textAlign(LEFT, TOP);
    textSize(18);
    chatbotResponse = new ChatbotResponse();
    //assign it to variable so I can call the chatbotResponse object
    userInput = " ";
    isTyping = false;
    textboxX = 20;
    textboxY = 320;
    textboxWidth = 360;
    textboxHeight = 40;
    aiResponse = "";
  }

  public void draw() {

    background(255);
    fill(240);
    rect(textboxX, textboxY, textboxWidth, textboxHeight);
    fill(0);
    text("You: " + userInput, 20, 20);
    text("AI: " + chatbotResponse.getResponse(userInput)
     + (isTyping ? "|" : ""), 20, 60);
    System.out.print(chatbotResponse.getResponse(userInput));
    if(!isTyping){
      aiResponse = chatbotResponse.getResponse(userInput);
      //getResponse = chatbotResponse: user's argument (object)
      //(20, 20) = top left corner of the screen window
    }
  }

  public void keyTyped() {

    if (key == BACKSPACE) {
      if (userInput.length() > 0) {
        userInput = userInput.substring(0, userInput.length() - 1);
      }
    }
    else if (key == ENTER || key == RETURN) {
      userInput += "\n"; //new line
      isTyping = false;
      aiResponse = chatbotResponse.getResponse(userInput);
      //gets AI response
      userInput = ""; //clear user input
      isTyping = true; //Makes AI type
      chatbotResponse.resetResponse();
      System.out.println(userInput);
    }
    else if (key >= ' ' && key <= '~') {
      userInput += key;
    }
    isTyping = true;
  }

  public void mousePressed() {
    if (mouseX >= textboxX && mouseX <= textboxX + textboxWidth
    && mouseY >= textboxY && mouseY <= textboxY + textboxHeight) {
      isTyping = true;
    }
    else{
      isTyping = false;
    }
  }

  public static void main(String[] args) {
    PApplet.main("Chatbot");
  }
}

class ChatbotResponse {
  private Random random;
  private boolean hasResponded;

  public ChatbotResponse() {
    random = new Random();
    hasResponded = false;
  }

  public String getResponse(String userInput) {
    String[] greetings = {"Hello!", "Hi there!", "Hey!"};
    String[] questions = {"How are you?", "What can I help you with?", "What brings you here today?"};
    String[] goodbyes = {"Goodbye!", "Bye!", "See you later!"};

    String response = "";

    if (!hasResponded) {
      //System.out.println("Hello!");
      if (userInput.contains("hi") || userInput.contains("hello")) {
        response = greetings[random.nextInt(greetings.length)];
        System.out.println(greetings[random.nextInt(greetings.length)]);
      } else if (userInput.contains("how") && userInput.contains("you")) {
        response = "I'm doing well, thank you for asking!";
      } else if (userInput.contains("what") && userInput.contains("name")) {
        response = "My name is Chatbot, nice to meet you!";
      } else if (userInput.contains("bye")) {
        response = goodbyes[random.nextInt(goodbyes.length)];
      } else {
        response = questions[random.nextInt(questions.length)];
      }

      hasResponded = true;
    }

    return response;
  }

  public void resetResponse() {
    hasResponded = false;

}
*/
import processing.core.*;

public class Chatbot extends PApplet {

  private String[] greetings = {"Hello!", "Hi there!", "Hey!"};
  private String[] questions = {
  "How are you?", "What can I help you with?",
  "What brings you here today?"};
  private String[] goodbyes = {
  "Goodbye!", "Bye!", "See you later!"};

  private String userInput = "";
  private String aiResponse = "";
  private int textboxWidth;
  private int textboxHeight;
  private int textboxX;
  private int textboxY;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    textAlign(LEFT, TOP);
    textSize(18);
    textboxX = 20;
    textboxY = 320;
    textboxWidth = 360;
    textboxHeight = 40;
  }

  public void draw() {
    background(255);
    fill(240);
    rect(textboxX, textboxY, textboxWidth, textboxHeight);
    fill(0);
    text("You: " + userInput, 20, 20);
    text("Kim Kardashian: " + aiResponse, 20, 60);
  }

  public void keyPressed() {
    if (keyCode == ENTER) {
      aiResponse = getResponse(userInput);
      userInput = "";
    }
    else if (keyCode == BACKSPACE && userInput.length() > 0) {
      userInput = userInput.substring(0, userInput.length() - 1);
    }
    else if (keyCode >= ' ' && keyCode <= '~') {
      userInput += key;
    }
  }

  private String getResponse(String userInput) {
    String response = "";
    if (userInput.toLowerCase().contains("hi") || userInput.toLowerCase().contains("hello")) {
      response = greetings[(int) random(greetings.length)];
    } else if (userInput.toLowerCase().contains("how") && userInput.toLowerCase().contains("you")) {
      response = "I'm doing well, thank you for asking!";
    } else if (userInput.toLowerCase().contains("what") && userInput.toLowerCase().contains("name")) {
      response = "My name is Chatbot, nice to meet you!";
    } else if (userInput.toLowerCase().contains("bye")) {
      response = goodbyes[(int) random(goodbyes.length)];
    } else {
      response = questions[(int) random(questions.length)];
    }
    return response;
  }

  public static void main(String[] args) {
    PApplet.main("Chatbot");
  }

}
