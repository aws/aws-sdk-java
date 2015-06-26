# Amazon DynamoDB Sample

This is a sample that demonstrates how to make basic requests to the Amazon DynamoDB service.
## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   You must be signed up for the following services:
    *   AWS DynamoDB
    *   AWS Identity and Access Management. For more information, see [http://aws.amazon.com/iam](http://aws.amazon.com/iam).

## Running the Sample

The basic steps for running the Amazon DynamoDB sample are:

1.  Create a credentials file in the location ~/.aws with name "credentials".

2.  Under the `default` profile fill in your Access Key ID and Secret Access Key:

  ```
  [default]
  aws_access_key_id =
  aws_secret_access_key =
  ```

3.  Save the file.

4.  Run the `AmazonDynamoDBSample.java` file, located in the same directory as the properties file. The sample prints information to the standard output.

**NOTE:** The sample also includes an Ant build.xml file to run the sample.
