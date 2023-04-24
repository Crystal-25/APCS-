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
  }

  public void draw() {
    //String aiResponse = chatResponse.getResponse(userInput);
    background(255);
    fill(240);
    rect(textboxX, textboxY, textboxWidth, textboxHeight);
    fill(0);
    text("You: " + userInput, 20, 20);
    //text("AI: " + aiResponse, 20, 60);
    text("AI: " + chatbotResponse.getResponse(userInput) + (isTyping ? "|" : ""), 20, 60);
    if(!isTyping){
      text("AI: " + chatbotResponse.getResponse(userInput), 20, 60);
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
      String aiResponse = chatbotResponse.getResponse(userInput);
      //gets AI response
      userInput = ""; //clear user input
      isTyping = true; //Makes AI type
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
    } else {
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
      if (userInput.contains("hi") || userInput.contains("hello")) {
        response = greetings[random.nextInt(greetings.length)];
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
}
