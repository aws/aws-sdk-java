# Amazon EC2 Spot Instance Advanced Sample

This is a sample that demonstrates persistent vs. one-time spot requests, launch groups, and availability groups

## Prerequisites

*   You must have a valid Amazon Web Services developer account.
*   Requires the AWS SDK for Java. For more information on the AWS SDK for Java, see [http://aws.amazon.com/sdkforjava](http://aws.amazon.com/sdkforjava).
*   You must be signed up to use Amazon EC2. For more information on Amazon EC2, see [http://aws.amazon.com/EC2](http://aws.amazon.com/ec2).

## Running the Sample

The basic steps for running the Amazon EC2 Spot Instance sample are:

1.  Create a credentials file in the location ~/.aws with name "credentials".

2.  Under the `default` profile fill in your Access Key ID and Secret Access Key:

  ```
  [default]
  aws_access_key_id =
  aws_secret_access_key =
  ```

3.  Save the file.

4.  Run the `CreateSecurityGroupApp.java` file, located in the same directory as the properties file. To use ant to run the file, type "ant CreateSecurityGroupApp"

5.  Run the `GettingStartedApp.java` file, located in the same directory as the properties file. The sample prints information to the standard output. To use ant to run the file, type "ant GettingStartedApp"

**NOTE:** The sample also includes an Ant build.xml file to run the sample.

See the [AWS Developer Guide for Java](http://docs.amazonwebservices.com/AWSSdkDocsJava/latest/DeveloperGuide/tutorial-spot-advanced-java.html) for more information about running this sample.
