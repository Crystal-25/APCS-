import java.util.Random;
class ChatbotResponse {

  private Random random;

  public ChatbotResponse
    random = new Random();

  public String getResponse(String userInput) {
    String[] greetings = {"Hello!", "Hi there!", "Hey!"};
    String[] questions = {"How are you?", "What can I help you with?", "What brings you here today?"};
    String[] goodbyes = {"Goodbye!", "Bye!", "See you later!"};

    String response = "";
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

    return response;
  
  }
}
