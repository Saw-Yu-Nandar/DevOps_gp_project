package devops.codereview;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        // Connect to MongoDB with port 27000
        MongoClient mongoClient = new MongoClient("localhost", 27000);
        // Create a database
        MongoDatabase database = mongoClient.getDatabase("ourdb");
        // database get collection
        MongoCollection<Document> collection = database.getCollection("test");
        // Create a document information - expire 13
        Document doc = new Document("name", "Teamof4")
                .append("class", "Hon5")
                .append("year", "2022")
                .append("result", new Document("CW", 96).append("EX", 13));
        // Combine document to collection
        collection.insertOne(doc);

        // Check document in collection
        Document myDoc = collection.find().first();
        System.out.println(myDoc.toJson());
    }
}