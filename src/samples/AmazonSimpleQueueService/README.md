# Amazon SQS Sample

This is a sample that demonstrates how to make basic requests to Amazon SQS using the AWS SDK for Java.

## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   You must be signed up to use Amazon SQS. For more information on Amazon SQS, see [http://aws.amazon.com/sqs](http://aws.amazon.com/sqs).

## Running the Sample

The basic steps for running the Amazon SQS sample are:

1.  Create a credentials file in the location ~/.aws with name "credentials".

2.  Under the `default` profile fill in your Access Key ID and Secret Access Key:

  ```
  [default]
  aws_access_key_id =
  aws_secret_access_key =
  ```

3.  Save the file.

4.  Run the `SimpleQueueServiceSample.java` file, located in the same directory as the properties file. The sample prints information to the standard output.

**NOTE:** The sample also includes an Ant build.xml file to run the sample.

For detailed descriptions on how to work with Amazon SQS using Java, see the [tutorials](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-tutorials.html) in the _Amazon SQS Developer Guide_.
