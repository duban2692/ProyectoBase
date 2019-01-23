#duban2692@gmial.com
Feature: Google Translate
 As a web user
 I want to use Google Translate
 to translate words between different languages
 
  Scenario: Translate from English to Spanish
  Given that susan wants to translate a word
  When she  translates the word  cheese from  English to Spanish
  Then she should see the word queso in the  screen
  
  ##that_susan_wants_to_translate_a_word()
  ## una vez se ejecute el runner va buscar el feature del escenario
  ##snippet metodos java que mapean la anotación de gerkin
 
 