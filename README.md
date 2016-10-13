# AWS SDK for Java [![Build Status](https://travis-ci.org/aws/aws-sdk-java.png?branch=master)](https://travis-ci.org/aws/aws-sdk-java)

The **AWS SDK for Java** enables Java developers to easily work with [Amazon Web Services][aws] and
build scalable solutions with Amazon S3, Amazon DynamoDB, Amazon Glacier, and more. You can get
started in minutes using ***Maven*** or by downloading a [single zip file][install-jar].

* [SDK Homepage][sdk-website]
* [API Docs][docs-api]
* [Developer Guide][docs-guide] ([source][docs-guide-source])
* [Forum][sdk-forum]
* [Issues][sdk-issues]
* [SDK Blog][blog]
* [Release Notes][release-notes]

## Getting Started

#### Sign up for AWS ####

Before you begin, you need an AWS account. Please see the [Sign Up for AWS][docs-signup] section of
the developer guide for information about how to create an AWS account and retrieve your AWS
credentials.

#### Minimum requirements ####

To run the SDK you will need **Java 1.6+**. For more information about the requirements and optimum
settings for the SDK, please see the [Installing a Java Development Environment][docs-java-env]
section of the developer guide.

#### Install the SDK ####

The recommended way to use the AWS SDK for Java in your project is to consume it from Maven. Import
the [aws-java-sdk-bom][] and specify the SDK Maven modules that your project needs in the
dependencies.

##### Importing the BOM #####

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.amazonaws</groupId>
      <artifactId>aws-java-sdk-bom</artifactId>
      <version>1.11.43</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```

##### Using the SDK Maven modules #####

```xml
<dependencies>
  <dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-ec2</artifactId>
  </dependency>
  <dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-s3</artifactId>
  </dependency>
  <dependency>
    <groupId>com.amazonaws</groupId>
    <artifactId>aws-java-sdk-dynamodb</artifactId>
  </dependency>
</dependencies>
```

See the [Set up the AWS SDK for Java][docs-setup] section of the developer guide for more
information about installing the SDK through other means.

## Features

* Provides easy-to-use HTTP clients for all supported AWS services, regions, and authentication
    protocols.

* Client-Side Data Encryption for Amazon S3 - Helps improve the security of storing application data
    in Amazon S3.

* Amazon DynamoDB Object Mapper - Uses Plain Old Java Object (POJOs) to store and retrieve Amazon
    DynamoDB data.

* Amazon S3 Transfer Manager - With a simple API, achieve enhanced the throughput, performance, and
    reliability by using multi-threaded Amazon S3 multipart calls.

* Amazon SQS Client-Side Buffering - Collect and send SQS requests in asynchronous batches,
    improving application and network performance.

* Automatically uses [IAM Instance Profile Credentials][aws-iam-credentials] on configured Amazon
    EC2 instances.

* And more!

## Building From Source

Once you check out the code from GitHub, you can build it using Maven. To disable the GPG-signing
in the build, use:

```sh
mvn clean install -Dgpg.skip=true
```

## Supported Versions

* **1.11.x** - Recommended.

* **1.10.x** - Approved. Only major critical bugs will be fixed. To get the new features, upgrade to
    1.11.x version of the SDK.

[aws-iam-credentials]: http://docs.aws.amazon.com/java-sdk/latest/developer-guide/java-dg-roles.html
[aws]: http://aws.amazon.com/
[blog]: https://java.awsblog.com
[docs-api]: http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html
[docs-guide]: http://docs.aws.amazon.com/java-sdk/latest/developer-guide/welcome.html
[docs-guide-source]: https://github.com/awsdocs/aws-java-developer-guide
[docs-java-env]: http://docs.aws.amazon.com/java-sdk/latest/developer-guide/setup-install.html#installing-a-java-development-environment
[docs-signup]: http://docs.aws.amazon.com/java-sdk/latest/developer-guide/signup-create-iam-user.html
[docs-setup]: http://docs.aws.amazon.com/java-sdk/latest/developer-guide/setup-install.html
[install-jar]: http://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip
[sdk-forum]: http://developer.amazonwebservices.com/connect/forum.jspa?forumID=70
[sdk-issues]: https://github.com/aws/aws-sdk-java/issues
[sdk-license]: http://aws.amazon.com/apache2.0/
[sdk-website]: http://aws.amazon.com/sdkforjava
[aws-java-sdk-bom]: https://github.com/aws/aws-sdk-java/tree/master/aws-java-sdk-bom
[release-notes]: https://aws.amazon.com/releasenotes/Java?browse=1
