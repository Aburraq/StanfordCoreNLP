# Stanford NLP Pipeline

This Java class, `Pipeline`, provides a configuration setup for the Stanford CoreNLP library to facilitate Natural Language Processing (NLP) tasks. It initializes a pipeline with specific annotators to perform various NLP operations on textual data.

## About

The `Pipeline` class is designed to create an instance of Stanford CoreNLP with the following annotators:
- Tokenization
- Sentence splitting
- Part-of-Speech tagging (POS)
- Lemmatization
- Named Entity Recognition (NER)
- Parsing
- Sentiment analysis

## Usage

To utilize this pipeline:
1. Ensure you have the Stanford CoreNLP library configured in your project.
2. Add Stanford CoreNLP as a dependency. You can do this by including the following Maven dependency in your project's `pom.xml` file:
   
   ```xml
<dependency>
    <groupId>edu.stanford.nlp</groupId>
    <artifactId>stanford-corenlp</artifactId>
    <version>4.0.0</version> <!-- Adjust version as needed -->
</dependency>

4. Import the `Pipeline` class into your Java application.
5. Access the pipeline instance using the `getPipeline()` method to perform NLP tasks.

```java
// Example usage in your Java code
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class YourNLPApplication {

    public static void main(String[] args) {
        // Access the pipeline instance
        StanfordCoreNLP pipeline = Pipeline.getPipeline();

        // Use the pipeline for NLP operations
        // ... (perform NLP tasks using the pipeline)
    }
}
