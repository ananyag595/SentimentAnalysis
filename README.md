# SentimentAnalysis
Creating a project to learn sentiment analyis in springboot using Stanford NLP Core model in English. This project uses gradle and java 17.

To run the project -> Use "sh run.sh"

Above command will clean, build and deploy the project on http://localhost:8080/

When you see logs saying springboot app started, you can visit http://localhost:8080/ and interact with UI. Note, if you provide a long sentence, will take time to load. As there is no loader in UI, use the network tab on devtools of browser to see the status of network call.

# The application has following APIS:

To list all apis(GET): http://localhost:8080/actuator/mappings

To send payload for server to analyse the sentiment(POST): http://localhost:8080/api/sentiment

Example JSON payload: { "text": "I am happy" }