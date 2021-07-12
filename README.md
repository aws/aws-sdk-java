# AWS SDK for Java [![Build Status](https://travis-ci.org/aws/aws-sdk-java.png?branch=master)](https://travis-ci.org/aws/aws-sdk-java)

The **AWS SDK for Java** enables Java developers to easily work with [Amazon Web Services][aws] and
build scalable solutions with Amazon S3, Amazon DynamoDB, Amazon Glacier, and more. You can get
started in minutes using ***Maven*** or by downloading a [single zip file][install-jar].

**Note**: A version 2.x of the SDK is available, see the [AWS SDK for Java 2.x](#aws-sdk-for-java-2x) section for more information.

* [SDK Homepage][sdk-website]
* [API Docs][docs-api]
* [Developer Guide][docs-guide] ([source][docs-guide-source])
* [Forum][sdk-forum]
* [Issues][sdk-issues]
* [SDK Blog][blog]
* [Getting Help](#getting-help)

## Release Notes ##
Beginning with 1.11.82 changes to the SDK are tracked in the [CHANGELOG.md][changes-file] file.
Release notes for versions prior to 1.11.82 can still be found on the [AWS Release Notes
Website][release-notes-catalog].

## Getting Started

#### Sign up for AWS ####

Before you begin, you need an AWS account. Please see the [Sign Up for AWS][docs-signup] section of
the developer guide for information about how to create an AWS account and retrieve your AWS
credentials.

#### Minimum requirements ####

To run the SDK you will need **Java 1.7+**. For more information about the requirements and optimum
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
      <version>1.12.22</version>
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

## Getting Help
GitHub [issues][sdk-issues] is the preferred channel to interact with our team. Also check these community resources for getting help:

* Ask a question on [StackOverflow][stack-overflow] and tag it with `aws-java-sdk`
* Come join the AWS Java community chat on [Gitter][gitter]
* Articulate your feature request or upvote existing ones on our [Issues][features] page
* Take a look at the [blog] for plenty of helpful walkthroughs and tips
* Open a case via the [AWS Support Center][support-center] in the [AWS console][console]
* If it turns out that you may have found a bug, please open an [issue][sdk-issues]

## Maintenance and Support for SDK Major Versions
For information about maintenance and support for SDK major versions and their underlying dependencies, see the following in the AWS SDKs and Tools Shared Configuration and Credentials Reference Guide:

* [AWS SDKs and Tools Maintenance Policy][maintenance-policy]
* [AWS SDKs and Tools Version Support Matrix][version-matrix]

## Supported Minor Versions

* **1.12.x** - Recommended.

* **1.11.x** - No longer supported, but migration to 1.12.x should require no code changes.

## AWS SDK for Java 2.x
A version 2.x of the SDK is generally available. It is a major rewrite of the 1.x code base, built on top of Java 8+ and adds several frequently requested features. These include support for non-blocking I/O, improved start-up performance, automatic iteration over paginated responses and the ability to plug in a different HTTP implementation at run time.

For more information see the [AWS SDK for Java 2.x Developer Guide][sdk-v2-dev-guide] or check the project repository in https://github.com/aws/aws-sdk-java-v2.

[aws-iam-credentials]: http://docs.aws.amazon.com/java-sdk/v1/developer-guide/java-dg-roles.html
[aws]: http://aws.amazon.com/
[blog]: https://aws.amazon.com/blogs/developer/category/java/
[docs-api]: http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html
[docs-guide]: http://docs.aws.amazon.com/java-sdk/v1/developer-guide/welcome.html
[docs-guide-source]: https://github.com/awsdocs/aws-java-developer-guide
[docs-java-env]: http://docs.aws.amazon.com/java-sdk/v1/developer-guide/setup-install.html#installing-a-java-development-environment
[docs-signup]: http://docs.aws.amazon.com/java-sdk/v1/developer-guide/signup-create-iam-user.html
[docs-setup]: http://docs.aws.amazon.com/java-sdk/v1/developer-guide/setup-install.html
[install-jar]: http://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip
[sdk-forum]: http://developer.amazonwebservices.com/connect/forum.jspa?forumID=70
[sdk-issues]: https://github.com/aws/aws-sdk-java/issues
[sdk-license]: http://aws.amazon.com/apache2.0/
[sdk-website]: http://aws.amazon.com/sdkforjava
[aws-java-sdk-bom]: https://github.com/aws/aws-sdk-java/tree/master/aws-java-sdk-bom
[release-notes-catalog]: https://aws.amazon.com/releasenotes/Java?browse=1
[changes-file]: ./CHANGELOG.md
[stack-overflow]: http://stackoverflow.com/questions/tagged/aws-java-sdk
[gitter]: https://gitter.im/aws/aws-sdk-java
[features]: https://github.com/aws/aws-sdk-java/issues?q=is%3Aopen+is%3Aissue+label%3A%22feature-request%22
[support-center]: https://console.aws.amazon.com/support/
[console]: https://console.aws.amazon.com
[jackson-deserialization-gadget]: https://medium.com/@cowtowncoder/on-jackson-cves-dont-panic-here-is-what-you-need-to-know-54cd0d6e8062
[sdk-v2-dev-guide]: https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/welcome.html
[maintenance-policy]: https://docs.aws.amazon.com/credref/latest/refdocs/maint-policy.html
[version-matrix]: https://docs.aws.amazon.com/credref/latest/refdocs/version-support-matrix.html
