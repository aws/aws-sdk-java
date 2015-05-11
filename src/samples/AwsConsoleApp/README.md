# AWS Console Sample

This is a sample that demonstrates how to make basic requests to multiple services using the AWS SDK for Java.

## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   You must be signed up for the following services:
    *   Amazon EC2. For more information, see [http://aws.amazon.com/ec2](http://aws.amazon.com/ec2).
    *   Amazon SimpleDB. For more information, see [http://aws.amazon.com/simpledb](http://aws.amazon.com/simpledb).
    *   Amazon S3. For more information, see [http://aws.amazon.com/s3](http://aws.amazon.com/s3).

## Running the Sample

The basic steps for running the AWS Console sample are:

1.  Open the `AwsCredentials.properties` in the sample folder.

2.  Locate the following section and fill in your Access Key ID and Secret Access Key:  

    ```
    # Fill in your AWS Access Key ID and Secret Access Key  
    # http://aws.amazon.com/security-credentials
    accessKey =  
    secretKey =
    ```  

3.  Save the file.

4.  Run the `AwsConsoleApp.java` file, located in the same directory as the properties file. The sample prints information to the standard output.

**NOTE:** The sample also includes an Ant build.xml file to run the sample.
