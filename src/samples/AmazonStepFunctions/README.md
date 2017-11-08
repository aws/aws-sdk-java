# Amazon Step Functions Sample

This is a sample that demonstrates how to make basic requests to Amazon Step Functions using the AWS SDK for Java.

## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   Compile dependencies:
    * aws-java-sdk-1.11.227
    * aws-java-sdk-core-1.11.227
    * aws-java-sdk-stepfunctions-1.11.227
* Runtime dependencies:
    * commons-logging-1.2.jar
    * httpclient-4.5.3.jar
    * httpcore-4.4.8.jar
    * jackson-annotations-2.9.0.jar
    * jackson-core-2.9.2.jar
    * jackson-databind-2.9.2.jar
    * joda-time-2.9.9.jar
     
## Running the Sample

The basic steps for running the Amazon Step Functions sample are:

1.  Create a credentials file in the location ~/.aws with name "credentials".
2.  Under the `default` profile fill in your Access Key ID and Secret Access Key:

  ```
  [default]
  aws_access_key_id =
  aws_secret_access_key =
  ```

3.  Save the file.
4.  Run the `StepFunctionsSample.java` file or execute `$ ant` in the same directory as build.xml file.

**NOTE:** The sample also includes an Ant build.xml file to run the sample.

For detailed descriptions on how to work with Amazon Step Functions using Java, see the [tutorials](http://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) in the _AWS Step Functions Developer Guide_.
