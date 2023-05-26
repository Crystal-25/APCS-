
import processing.core.*;
import java.util.ArrayList;

public class Chatbot extends PApplet {

  private String[] greetings = {"Hello!", "Hi there!", "Hey!"};
  private String[] questions = {
  "How are you?", "What can I help you with?",
  "What brings you here today?"};
  private String[] goodbyes = {
  "Goodbye!", "Bye!", "See you later!"};

  private String userInput = "";
  private String aiResponse = "";

  private int cursorColor = 0;
  private int cursorX;
  private int cursorY;
  private int cursorTimer = 0;

  int textSize = 30;
  int textX = 60;
  int textY = 40;
  int textWidth = 300;
  int textHeight = 400;

  PImage aiImage, userImage;

  public void settings() {
    fullScreen();
  }

  public void setup() {
    textAlign(LEFT, TOP);
    textSize(textSize);

    //userImg = loadImage("user.webp");

    frameRate(60);
    aiImage = loadImage("kimK.png");
    userImage = loadImage("user.png");
  }

  public void draw() {
    background(255);

    image(userImage, 50, 60, 50, 55);
    image(aiImage, 50, 130, 50, 70);

    fill(0);

    text("You: " + userInput, 120, 80);
    text("Kim Kardashian: " + aiResponse, 120, 150);

    // draw cursor
    if (cursorTimer % 60 < 30) {
      stroke(cursorColor);
      strokeWeight(2);
      line(cursorX, cursorY, cursorX, cursorY + 25);
    }
    cursorTimer++;
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

  private void drawCursor() {
   float cursorX = textWidth("You: " + userInput.substring(0, mouseX - 20)) + 20;
   line(cursorX, 30, cursorX, 50);
 }

  public void mouseClicked() {
    cursorX = mouseX;
    cursorY = mouseY;
  }

  private String getResponse(String userInput) {
    String response = "";
    if (userInput.toLowerCase().contains("hi") || userInput.toLowerCase().contains("hello")) {
      response = greetings[(int) random(greetings.length)];
    } else if (userInput.toLowerCase().contains("how") && userInput.toLowerCase().contains("you")) {
      response = "I'm doing well, thank you for asking!";
    } else if (userInput.toLowerCase().contains("what") && userInput.toLowerCase().contains("name")) {
      response = "I'm Kim Kardashian West, and I just lost my diamond earring!";
    } else if (userInput.toLowerCase().contains("bye")) {
      response = goodbyes[(int) random(goodbyes.length)];
    } else if (userInput.toLowerCase().contains("i") && userInput.toLowerCase().contains("you")){
      response = "Me too";
    }else {
      response = questions[(int) random(questions.length)];
    }
    return response;
  }

  public static void main(String[] args) {
    PApplet.main("Chatbot");
  }
}
