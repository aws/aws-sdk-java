# Amazon AWS SDK for Java

The **AWS SDK for Java** enables Java developers to easily work with [Amazon Web Services][aws] and build scalable solutions with Amazon S3, Amazon DynamoDB, Amazon Glacier, and more. You can get started in minutes using ***Maven*** or by downloading a [single zip file][install-jar].

* [API Docs][docs-api]
* [SDK Homepage][sdk-website]
* [Forum][sdk-forum]
* [Issues][sdk-issues]

## Features

* Provides easy-to-use HTTP clients for all supported AWS services, regions, and authentication protocols.
* Client-Side Data Encryption for Amazon S3 - Helps improve the security of storing application data in Amazon S3.
* Amazon DynamoDB Object Mapper - Uses Plain Old Java Object (POJOs) to store and retrieve Amazon DynamoDB data.
* Amazon S3 Transfer Manager - With a simple API, acheive enhanced the throughput, performance, and reliability by using multi-threaded Amazon S3 multipart calls.
* Amazon SQS Client-Side Buffering - Collect and send SQS requests in ansynchronous batches, improving application and network performance.
* Automatically uses [IAM Instance Profile Credentials][aws-iam-credentials] on configured Amazon EC2 instances.
* And more!

## Getting Started

1. **Sign up for AWS** - Before you begin, you need an AWS account. Please see the [AWS Account and Credentials][docs-signup] section of the developer guide for information about how to create an AWS account and retrieve your AWS credentials.
1. **Minimum requirements** - To run the SDK you will need **Java 1.6+**. For more information about the requirements and optimum settings for the SDK, please see the [Java Development Environment][docs-signup] section of the developer guide.
1. **Install the SDK** - Using ***Maven*** is the recommended way to install the AWS SDK for Java. Please see the
   [Install the AWS SDK for Java][docs-signup] section of the user guide for more detailed information about installing the SDK through other means.
1. **Using the SDK** - The best way to become familiar with how to use the SDK is to read the [Developer Guide][docs-guide].

## Building From Source

Once you check out the code from GitHub, you can build it using Maven.  To disable the GPG-signing in the build, use: `mvn clean install -Dgpg.skip=true`

[install-jar]: http://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip
[aws]: http://aws.amazon.com/
[sdk-website]: http://aws.amazon.com/sdkforjava
[sdk-forum]: http://developer.amazonwebservices.com/connect/forum.jspa?forumID=70
[sdk-issues]: https://github.com/aws/aws-sdk-java/issues
[sdk-license]: http://aws.amazon.com/apache2.0/
[docs-api]: http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html
[docs-signup]: http://docs.aws.amazon.com/AWSSdkDocsJava/latest/DeveloperGuide/java-dg-setup.html
[aws-iam-credentials]: http://docs.aws.amazon.com/AWSSdkDocsJava/latest/DeveloperGuide/java-dg-roles.html
[docs-guide]: http://docs.aws.amazon.com/AWSSdkDocsJava/latest/DeveloperGuide/welcome.html
