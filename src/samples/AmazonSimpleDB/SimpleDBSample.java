/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
import java.util.ArrayList;
import java.util.List;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpledb.AmazonSimpleDB;
import com.amazonaws.services.simpledb.AmazonSimpleDBClient;
import com.amazonaws.services.simpledb.model.Attribute;
import com.amazonaws.services.simpledb.model.BatchPutAttributesRequest;
import com.amazonaws.services.simpledb.model.CreateDomainRequest;
import com.amazonaws.services.simpledb.model.DeleteAttributesRequest;
import com.amazonaws.services.simpledb.model.DeleteDomainRequest;
import com.amazonaws.services.simpledb.model.Item;
import com.amazonaws.services.simpledb.model.PutAttributesRequest;
import com.amazonaws.services.simpledb.model.ReplaceableAttribute;
import com.amazonaws.services.simpledb.model.ReplaceableItem;
import com.amazonaws.services.simpledb.model.SelectRequest;

/**
 * This sample demonstrates how to make basic requests to Amazon SimpleDB using
 * the AWS SDK for Java.
 * <p>
 * <b>Prerequisites:</b> You must have a valid Amazon Web Services developer
 * account, and be signed up to use Amazon SimpleDB. For more information on
 * Amazon SimpleDB, see http://aws.amazon.com/simpledb.
 * <p>
 * <b>Important:</b> Be sure to fill in your AWS access credentials in the
 *                   AwsCredentials.properties file before you try to run this
 *                   sample.
 * http://aws.amazon.com/security-credentials
 */
public class SimpleDBSample {

    public static void main(String[] args) throws Exception {
        /*
         * This credentials provider implementation loads your AWS credentials
         * from a properties file at the root of your classpath.
         *
         * Important: Be sure to fill in your AWS access credentials in the
         *            AwsCredentials.properties file before you try to run this
         *            sample.
         * http://aws.amazon.com/security-credentials
         */
        AmazonSimpleDB sdb = new AmazonSimpleDBClient(new ClasspathPropertiesFileCredentialsProvider());
		Region usWest2 = Region.getRegion(Regions.US_WEST_2);
		sdb.setRegion(usWest2);

        System.out.println("===========================================");
        System.out.println("Getting Started with Amazon SimpleDB");
        System.out.println("===========================================\n");

        try {
            // Create a domain
            String myDomain = "MyStore";
            System.out.println("Creating domain called " + myDomain + ".\n");
            sdb.createDomain(new CreateDomainRequest(myDomain));

            // List domains
            System.out.println("Listing all domains in your account:\n");
            for (String domainName : sdb.listDomains().getDomainNames()) {
                System.out.println("  " + domainName);
            }
            System.out.println();

            // Put data into a domain
            System.out.println("Putting data into " + myDomain + " domain.\n");
            sdb.batchPutAttributes(new BatchPutAttributesRequest(myDomain, createSampleData()));

            // Select data from a domain
            // Notice the use of backticks around the domain name in our select expression.
            String selectExpression = "select * from `" + myDomain + "` where Category = 'Clothes'";
            System.out.println("Selecting: " + selectExpression + "\n");
            SelectRequest selectRequest = new SelectRequest(selectExpression);
            for (Item item : sdb.select(selectRequest).getItems()) {
                System.out.println("  Item");
                System.out.println("    Name: " + item.getName());
                for (Attribute attribute : item.getAttributes()) {
                    System.out.println("      Attribute");
                    System.out.println("        Name:  " + attribute.getName());
                    System.out.println("        Value: " + attribute.getValue());
                }
            }
            System.out.println();

            // Delete values from an attribute
            System.out.println("Deleting Blue attributes in Item_O3.\n");
            Attribute deleteValueAttribute = new Attribute("Color", "Blue");
            sdb.deleteAttributes(new DeleteAttributesRequest(myDomain, "Item_03")
                    .withAttributes(deleteValueAttribute));

            // Delete an attribute and all of its values
            System.out.println("Deleting attribute Year in Item_O3.\n");
            sdb.deleteAttributes(new DeleteAttributesRequest(myDomain, "Item_03")
                    .withAttributes(new Attribute().withName("Year")));

            // Replace an attribute
            System.out.println("Replacing Size of Item_03 with Medium.\n");
            List<ReplaceableAttribute> replaceableAttributes = new ArrayList<ReplaceableAttribute>();
            replaceableAttributes.add(new ReplaceableAttribute("Size", "Medium", true));
            sdb.putAttributes(new PutAttributesRequest(myDomain, "Item_03", replaceableAttributes));

            // Delete an item and all of its attributes
            System.out.println("Deleting Item_03.\n");
            sdb.deleteAttributes(new DeleteAttributesRequest(myDomain, "Item_03"));

            // Delete a domain
            System.out.println("Deleting " + myDomain + " domain.\n");
            sdb.deleteDomain(new DeleteDomainRequest(myDomain));
        } catch (AmazonServiceException ase) {
            System.out.println("Caught an AmazonServiceException, which means your request made it "
                    + "to Amazon SimpleDB, but was rejected with an error response for some reason.");
            System.out.println("Error Message:    " + ase.getMessage());
            System.out.println("HTTP Status Code: " + ase.getStatusCode());
            System.out.println("AWS Error Code:   " + ase.getErrorCode());
            System.out.println("Error Type:       " + ase.getErrorType());
            System.out.println("Request ID:       " + ase.getRequestId());
        } catch (AmazonClientException ace) {
            System.out.println("Caught an AmazonClientException, which means the client encountered "
                    + "a serious internal problem while trying to communicate with SimpleDB, "
                    + "such as not being able to access the network.");
            System.out.println("Error Message: " + ace.getMessage());
        }
    }

    /**
     * Creates an array of SimpleDB ReplaceableItems populated with sample data.
     *
     * @return An array of sample item data.
     */
    private static List<ReplaceableItem> createSampleData() {
        List<ReplaceableItem> sampleData = new ArrayList<ReplaceableItem>();

        sampleData.add(new ReplaceableItem("Item_01").withAttributes(
                new ReplaceableAttribute("Category", "Clothes", true),
                new ReplaceableAttribute("Subcategory", "Sweater", true),
                new ReplaceableAttribute("Name", "Cathair Sweater", true),
                new ReplaceableAttribute("Color", "Siamese", true),
                new ReplaceableAttribute("Size", "Small", true),
                new ReplaceableAttribute("Size", "Medium", true),
                new ReplaceableAttribute("Size", "Large", true)));

        sampleData.add(new ReplaceableItem("Item_02").withAttributes(
                new ReplaceableAttribute("Category", "Clothes", true),
                new ReplaceableAttribute("Subcategory","Pants", true),
                new ReplaceableAttribute("Name", "Designer Jeans", true),
                new ReplaceableAttribute("Color", "Paisley Acid Wash", true),
                new ReplaceableAttribute("Size", "30x32", true),
                new ReplaceableAttribute("Size", "32x32", true),
                new ReplaceableAttribute("Size", "32x34", true)));

        sampleData.add(new ReplaceableItem("Item_03").withAttributes(
                new ReplaceableAttribute("Category", "Clothes", true),
                new ReplaceableAttribute("Subcategory", "Pants", true),
                new ReplaceableAttribute("Name", "Sweatpants", true),
                new ReplaceableAttribute("Color", "Blue", true),
                new ReplaceableAttribute("Color", "Yellow", true),
                new ReplaceableAttribute("Color", "Pink", true),
                new ReplaceableAttribute("Size", "Large", true),
                new ReplaceableAttribute("Year", "2006", true),
                new ReplaceableAttribute("Year", "2007", true)));

        sampleData.add(new ReplaceableItem("Item_04").withAttributes(
                new ReplaceableAttribute("Category", "Car Parts", true),
                new ReplaceableAttribute("Subcategory", "Engine", true),
                new ReplaceableAttribute("Name", "Turbos", true),
                new ReplaceableAttribute("Make", "Audi", true),
                new ReplaceableAttribute("Model", "S4", true),
                new ReplaceableAttribute("Year", "2000", true),
                new ReplaceableAttribute("Year", "2001", true),
                new ReplaceableAttribute("Year", "2002", true)));

        sampleData.add(new ReplaceableItem("Item_05").withAttributes(
                new ReplaceableAttribute("Category", "Car Parts", true),
                new ReplaceableAttribute("Subcategory", "Emissions", true),
                new ReplaceableAttribute("Name", "O2 Sensor", true),
                new ReplaceableAttribute("Make", "Audi", true),
                new ReplaceableAttribute("Model", "S4", true),
                new ReplaceableAttribute("Year", "2000", true),
                new ReplaceableAttribute("Year", "2001", true),
                new ReplaceableAttribute("Year", "2002", true)));

        return sampleData;
    }
}
