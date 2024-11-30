# AWS SDK for Java

The **AWS SDK for Java** enables Java developers to easily work with [Amazon Web Services][aws] and
build scalable solutions with Amazon S3, Amazon DynamoDB, Amazon Glacier, and more. 

See the [AWS SDK for Java 2.x][aws-sdk-for-java-2x] for how to get started.

## In Maintenance Mode as of July 31, 2024 ##

[The AWS SDK for Java 1.x is in maintenance mode][maintenance-mode-post]. The AWS SDK for Java 1.x entered maintenance 
mode on July 31, 2024 and will reaching end-of-support on December 31, 2025. During maintenance mode, AWS will limit 
SDK releases to address critical bug fixes and security issues only. The SDK will not receive API updates for new or 
existing services, or be updated to support new regions. 

We recommend that you [migrate to the AWS SDK for Java 2.x][migration-guide]. The AWS SDK for Java 2.x provides 
improved features, enhanced performance, and continued support from AWS. By adopting the latest version of the SDK, 
developers can ensure the security, compatibility, and stability of their solutions on AWS. Updating also allows you to 
leverage the latest services and innovations from AWS.

## End-of-Support on December 31, 2025 ##

[The AWS SDK for Java 1.x will reach end-of-support on December 31, 2025][deprecation-announcement-post]. After end-of-
support, AWS will no longer receive updates or releases. Previously published releases will continue to be available 
via public package managers and the code will remain on GitHub.

## Release Notes ##
Changes to the SDK beginning with version 1.12.1 (June 2021) are tracked in [CHANGELOG.md][changes-file].

Changes in the _retired_ 1.11.x series of the SDK, beginning with version 1.11.82, 
are listed in the [CHANGELOG-1.11.x.md](./changelogs/CHANGELOG-1.11.x.md) file.

## Getting Started with AWS

Use [the AWS SDK for Java 2.x to get started][sdk-v2-getting-started].

## Using the AWS SDK for Java 1.x

The AWS SDK for Java 1.x is in [maintenance mode][maintenance-mode-post], so we recommend that you use the 
[AWS SDK for Java 2.x][aws-sdk-for-java-2x].

#### Minimum requirements ####

To run the AWS SDK for Java 1.x, you will need **Java 1.8+**. For more information about the requirements and optimum
settings for the SDK, please see the [Installing a Java Development Environment][docs-java-env]
section of the developer guide.

#### Install the 1.x SDK ####

You can use the AWS SDK for Java 1.x in your project by consuming it from Maven. Import
the [aws-java-sdk-bom][] and specify the SDK Maven modules that your project needs in the
dependencies.

##### Importing the 1.x BOM #####

```xml
<dependencyManagement>
  <dependencies>
    <dependency>
      <groupId>com.amazonaws</groupId>
      <artifactId>aws-java-sdk-bom</artifactId>
      <version>1.12.779</version>
      <type>pom</type>
      <scope>import</scope>
    </dependency>
  </dependencies>
</dependencyManagement>
```

##### Using the 1.x SDK Maven modules #####

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

See the [Set up the AWS SDK for Java 1.x][docs-setup] section of the developer guide for more
information about installing the 1.x SDK through other means.

## Building From Source

Once you check out the code from GitHub, you can build it using Maven. To disable the GPG-signing
in the build, use:

```sh
mvn clean install -Dgpg.skip=true
```

## Getting Help
GitHub [issues][sdk-issues] is the preferred channel to interact with our team. Also check these community resources for getting help:

* Ask a question on [StackOverflow][stack-overflow] and tag it with `aws-java-sdk`
* Articulate your feature request or upvote existing ones on our [Issues][features] page
* Take a look at the [blog] for plenty of helpful walkthroughs and tips
* Open a case via the [AWS Support Center][support-center] in the [AWS console][console]
* If it turns out that you may have found a bug, please open an [issue][sdk-issues]

## Maintenance and Support for SDK Major Versions

For information about maintenance and support for SDK major versions and their underlying dependencies, see the following in the AWS SDKs and Tools Reference Guide:

* [AWS SDKs and Tools Maintenance Policy][maintenance-policy]
* [AWS SDKs and Tools Version Support Matrix][version-matrix]

## Supported Minor Versions

* **1.12.x** - In [maintenance mode][maintenance-mode-post]. We recommend migrating to the [AWS SDK for Java 2.x][aws-sdk-for-java-2x].

* **1.11.x** - No longer supported, but migration to 1.12.x should require no code changes.

## AWS SDK for Java 2.x

A version 2.x of the SDK is generally available. It is a major rewrite of the 1.x code base, built on top of Java 8+ and adds several frequently requested features. These include support for non-blocking I/O, improved start-up performance, automatic iteration over paginated responses and the ability to plug in a different HTTP implementation at run time.

For more information see the [AWS SDK for Java 2.x Developer Guide][sdk-v2-dev-guide] or check the project repository in https://github.com/aws/aws-sdk-java-v2.

## Maintenance and Support for Java Versions

The AWS SDK for Java 1.x supports Java versions from 7 to 17, but may not be updated to support future Java versions. To ensure long-term compatibility with the latest JDK versions, we recommend that you migrate to the
[AWS SDK for Java 2.x][aws-sdk-for-java-2x]. 

[aws-iam-credentials]: https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-roles.html
[aws]: https://aws.amazon.com/
[blog]: https://aws.amazon.com/blogs/developer/category/java/
[docs-api]: https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html
[docs-guide]: https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/welcome.html
[docs-guide-source]: https://github.com/awsdocs/aws-java-developer-guide
[docs-java-env]: https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-install.html#installing-a-java-development-environment
[docs-signup]: https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/signup-create-iam-user.html
[docs-setup]: https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/setup-install.html
[install-jar]: https://sdk-for-java.amazonwebservices.com/latest/aws-java-sdk.zip
[sdk-issues]: https://github.com/aws/aws-sdk-java/issues
[sdk-license]: https://aws.amazon.com/apache2.0/
[sdk-website]: https://aws.amazon.com/sdkforjava
[aws-java-sdk-bom]: https://github.com/aws/aws-sdk-java/tree/master/aws-java-sdk-bom
[release-notes-catalog]: https://aws.amazon.com/releasenotes/Java?browse=1
[changes-file]: ./CHANGELOG.md
[stack-overflow]: https://stackoverflow.com/questions/tagged/aws-java-sdk
[features]: https://github.com/aws/aws-sdk-java/issues?q=is%3Aopen+is%3Aissue+label%3A%22feature-request%22
[support-center]: https://console.aws.amazon.com/support/
[console]: https://console.aws.amazon.com
[jackson-deserialization-gadget]: https://medium.com/@cowtowncoder/on-jackson-cves-dont-panic-here-is-what-you-need-to-know-54cd0d6e8062
[sdk-v2-dev-guide]: https://docs.aws.amazon.com/sdk-for-java/v2/developer-guide/welcome.html
[maintenance-policy]: https://docs.aws.amazon.com/credref/latest/refdocs/maint-policy.html
[version-matrix]: https://docs.aws.amazon.com/credref/latest/refdocs/version-support-matrix.html
[aws-sdk-for-java-2x]: https://github.com/aws/aws-sdk-java-v2
[deprecation-announcement-post]: https://aws.amazon.com/blogs/developer/announcing-end-of-support-for-aws-sdk-for-java-v1-x-on-december-31-2025
[maintenance-mode-post]: https://aws.amazon.com/blogs/developer/the-aws-sdk-for-java-1-x-is-in-maintenance-mode-effective-july-31-2024/
[migration-guide]: https://docs.aws.amazon.com/sdk-for-java/latest/developer-guide/migration.html
[sdk-v2-getting-started]: https://github.com/aws/aws-sdk-java-v2/?tab=readme-ov-file#getting-started