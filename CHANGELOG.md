# __1.11.119__ __2017-04-11__
## __AWS Batch__
  - ### Features
    - API Update for AWS Batch: Customer provided AMI for MANAGED Compute Environment 

## __AWS OpsWorks__
  - ### Features
    - Cloudwatch Logs agent configuration can now be attached to OpsWorks Layers using CreateLayer and UpdateLayer. OpsWorks will then automatically install and manage the CloudWatch Logs agent on the instances part of the OpsWorks Layer.

## __Amazon API Gateway__
  - ### Features
    - API Gateway request validators

## __Amazon GameLift__
  - ### Features
    - Allows developers to utilize an improved workflow when calling our Queues API and introduces a new feature that allows developers to specify a maximum allowable latency per Queue.

## __Amazon S3__
  - ### Bugfixes
    - Fix a race condition that can occur with multiple calls to `CopyMonitor#setFuture` and `UploadMonitor#setFuture` that can cause an infinite loop in `AbstractTransfer#waitForCompletion`.

      This fixes [#1102](https://github.com/aws/aws-sdk-java/issues/1102)

# __1.11.118__ __2017-04-07__
## __Amazon Redshift__
  - ### Features
    - This update adds the GetClusterCredentials API which is used to get temporary login credentials to the cluster. AccountWithRestoreAccess now has a new member AccountAlias, this is the identifier of the AWS support account authorized to restore the specified snapshot. This is added to support the feature where the customer can share their snapshot with the Amazon Redshift Support Account without having to manually specify the AWS Redshift Service account ID on the AWS Console/API.

# __1.11.117__ __2017-04-06__
## __Elastic Load Balancing__
  - ### Features
    - Adds support for a new host-header condition in CreateRule and ModifyRule

# __1.11.116__ __2017-04-05__
## __Amazon ElastiCache__
  - ### Features
    - ElastiCache added support for testing the Elasticache Multi-AZ feature with Automatic Failover.

# __1.11.115__ __2017-04-04__
## __Amazon CloudWatch__
  - ### Features
    - Amazon Web Services announced the immediate availability of two additional alarm configuration rules for Amazon CloudWatch Alarms. The first rule is for configuring missing data treatment. Customers have the options to treat missing data as alarm threshold breached, alarm threshold not breached, maintain alarm state and the current default treatment. The second rule is for alarms based on percentiles metrics that can trigger unnecassarily if the percentile is calculated from a small number of samples. The new rule can treat percentiles with low sample counts as same as missing data. If the first rule is enabled, the same treatment will be applied when an alarm encounters a percentile with low sample counts.

# __1.11.114__ __2017-04-03__
## __Amazon Lex__
  - ### Features
    - Adds support to PostContent for speech input

# __1.11.113__ __2017-03-31__
## __Amazon CloudDirectory__
  - ### Features
    - ListObjectAttributes now supports filtering by facet.

# __1.11.112__ __2017-03-30__
## __AWS Cloud Formation__
  - ### Features
    - Adding paginators for ListExports and ListImports

## __AWS Resource Groups Tagging API__
  - ### Features
    - Resource Groups Tagging APIs can help you organize your resources and enable you to simplify resource management, access management, and cost allocation.

## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. Once a file share is created, any changes made externally to the S3 bucket will not be reflected by the gateway. Using the cache refresh feature in this update, the customer can trigger an on-demand scan of the keys in their S3 bucket and refresh the file namespace cached on the gateway. It takes as an input the fileShare ARN and refreshes the cache for only that file share. Additionally there is new functionality on file gateway that allows you configure what squash options they would like on their file share, this allows a customer to configure their gateway to not squash root permissions. This can be done by setting options in NfsOptions for CreateNfsFileShare and UpdateNfsFileShare APIs.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now supports user configurable HTTP Read and Keep-Alive Idle Timeouts for your Custom Origin Servers

# __1.11.111__ __2017-03-28__
## __AWS Batch__
  - ### Features
    - Customers can now provide a retryStrategy as part of the RegisterJobDefinition and SubmitJob API calls. The retryStrategy object has a number value for attempts. This is the number of non successful executions before a job is considered FAILED. In addition, the JobDetail object now has an attempts field and shows all execution attempts.

## __Amazon EC2__
  - ### Features
    - Customers can now tag their Amazon EC2 Instances and Amazon EBS Volumes at the time of their creation. You can do this from the EC2 Instance launch wizard or through the RunInstances or CreateVolume APIs. By tagging resources at the time of creation, you can eliminate the need to run custom tagging scripts after resource creation. In addition, you can now set resource-level permissions on the CreateVolume, CreateTags, DeleteTags, and the RunInstances APIs. This allows you to implement stronger security policies by giving you more granular control over which users and groups have access to these APIs. You can also enforce the use of tagging and control what tag keys and values are set on your resources. When you combine tag usage and resource-level IAM policies together, you can ensure your instances and volumes are properly secured upon creation and achieve more accurate cost allocation reporting. These new features are provided at no additional cost. 

# __1.11.110__ __2017-03-27__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated validation rules for SendCommand and RegisterTaskWithMaintenanceWindow APIs.

# __1.11.109__ __2017-03-23__
## __AWS CloudTrail__
  - ### Features
    - Doc-only Update for CloudTrail: Add required parameters for GetEventSelectors and PutEventSelectors

## __Application Auto Scaling__
  - ### Features
    - Application AutoScaling is launching support for a new target resource (AppStream 2.0 Fleets) as a scalable target.

# __1.11.108__ __2017-03-22__
## __AWS Application Discovery Service__
  - ### Features
    - Adds export configuration options to the AWS Discovery Service API.

## __AWS Lambda__
  - ### Features
    - Adds support for new runtime Node.js v6.10 for AWS Lambda service

## __Elastic Load Balancing__
  - ### Features
    - Adding waiters for Elastic Load Balancing V2

# __1.11.107__ __2017-03-21__
## __AWS Direct Connect__
  - ### Deprecations
    - Deprecated DescribeConnectionLoa, DescribeInterconnectLoa, AllocateConnectionOnInterconnect and DescribeConnectionsOnInterconnect operations in favor of DescribeLoa, DescribeLoa, AllocateHostedConnection and DescribeHostedConnections respectively.

# __1.11.106__ __2017-03-20__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - This update adds a new data set, us_sales_and_use_tax_records, which enables AWS Marketplace sellers to programmatically access to their U.S. Sales and Use Tax report data.

## __AWS SDK for Java__
  - ### Bugfixes
    - `XMLStreamException`s encountered during XML response parsing that are caused by `IOException` are now wrapped in `IOException` before being thrown so that they are passed to the configured retry policies.

      This fixes [#1068](https://github.com/aws/aws-sdk-java/issues/1068).

## __Amazon API Gateway__
  - ### Bugfixes
    - Fix a bug that forced all requests to have an `Accept` header value of `application/json`.

## __Amazon EC2__
  - ### Deprecations
    - Deprecated no-args `revokeSecurityGroupIngress` method on `AmazonEC2` which will always fail. Fixes [#1059](https://github.com/aws/aws-sdk-java/issues/1059).

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint User Segmentation * Added ability to segment endpoints by user attributes in addition to endpoint attributes.

      Amazon Pinpoint Event Stream Preview * Added functionality to publish raw app analytics and campaign events data as events streams to Kinesis and Kinesis Firehose * The feature provides developers with increased flexibility of exporting raw events to S3, Redshift, Elasticsearch using a Kinesis Firehose stream or enable real time event processing use cases using a Kinesis stream.

## __Amazon S3__
  - ### Bugfixes
    - Add the `sequencer` property to `S3ObjectEntity`.
    - Correctly unwraps nested levels of ExecutionException. Fixes [#1046](https://github.com/aws/aws-sdk-java/issues/1046).
    - Remove unnecessary call to `File#deleteOnExit()` in `MultiFileOutputStream`. This avoids leaking memory during long running applications that use `AmazonS3EncryptionClient#uploadObject`.

  - ### Deprecations
    - Deprecate the `S3ObjectEntity(String key, Long size, String eTag, String versionId)` constructor in favor of `S3ObjectEntity(String key, Long size, String eTag, String versionId, String sequencer)`.

## __Core__
  - ### Bugfixes
    - Adding `shutdown` to service waiters so that running `ExecutorService` can be shutdown from the client. Fixes [#1056](https://github.com/aws/aws-sdk-java/issues/1056). For example :

      ```java
      final AmazonEC2 ec2 = AmazonEC2ClientBuilder.defaultClient();
      try {
          ec2.waiters().instanceExists().runAsync(
              new WaiterParameters<>(new DescribeInstancesRequest()), 
              new WaiterHandler() {...}
          );
      } finally {
          ec2.shutdown(); //this will now shutdown the waiters as well as the client    
      }
      ```

# __1.11.105__ __2017-03-13__
## __AWS Device Farm__
  - ### Features
    - Network shaping allows users to simulate network connections and conditions while testing their Android, iOS, and web apps with AWS Device Farm.

## __Amazon CloudWatch Events__
  - ### Features
    - This update extends Target Data Type for configuring Target behavior during invocation.

# __1.11.104__ __2017-03-10__
## __Amazon EMR__
  - ### Features
    - This release includes support for instance fleets in Amazon EMR.

# __1.11.103__ __2017-03-09__
## __Amazon API Gateway__
  - ### Features
    - API Gateway has added support for ACM certificates on custom domain names. Both Amazon-issued certificates and uploaded third-part certificates are supported.

## __Amazon CloudDirectory__
  - ### Features
    - Introduces a new Cloud Directory API that enables you to retrieve all available parent paths for any type of object (a node, leaf node, policy node, and index node) in a hierarchy.

# __1.11.102__ __2017-03-08__
## __Core__
  - ### Bugfixes
    - Removing @JsonIgnore annotation introduced in 1.11.101 from Enum helper setters on models (eg https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-ecs/src/main/java/com/amazonaws/services/ecs/model/PortMapping.java#L351) as this caused a regression that affected some waiters.

# __1.11.101__ __2017-03-08__
## __AWS SDK for Java__
  - ### Features
    - The service models are no longer included with individual SDK client modules. This reduces the overall size of the SDK JARs as they can be quite large. For users wishing to inspect them, the model files may still be found in the [aws-java-sdk-models](./aws-java-sdk-models) module.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixed an issue where a ChoiceState with no Default transition was throwing a NPE during validation.

## __Amazon WorkDocs__
  - ### Features
    - **(New Service)** The Administrative SDKs for Amazon WorkDocs provides full administrator level access to WorkDocs site resources, allowing developers to integrate their applications to manage WorkDocs users, content and permissions programmatically

# __1.11.100__ __2017-03-07__
## __Amazon RDS__
  - ### Features
    - Add support to using encrypted clusters as cross-region replication masters.
    - Update CopyDBClusterSnapshot API to support encrypted cross region copy of Aurora cluster snapshots.

# __1.11.99__ __2017-03-06__
## __AWS Budgets__
  - ### Features
    - When creating or editing a budget via the AWS Budgets API you can define notifications that are sent to subscribers when the actual or forecasted value for cost or usage exceeds the notificationThreshold associated with the budget notification object. Starting today, the maximum allowed value for the notificationThreshold was raised from 100 to 300. This change was made to give you more flexibility when setting budget notifications.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - OpsWorks for Chef Automate has added a new field "AssociatePublicIpAddress" to the CreateServer request, "CloudFormationStackArn" to the Server model and "TERMINATED" server state.

## __Amazon S3__
  - ### Features
    - Add improved detection of end-of-stream for object input streams and improved logging when the stream is aborted.

  - ### Bugfixes
    - Fix a bug in `TransferManager` where the Requester Pays flag set on a `CopyObjectRequest` or `PutObjectRequest` was not being preserved in the multipart copy or upload requests if the original request was promoted to multipart.

# __1.11.98__ __2017-02-27__
## __AWS Organizations__
  - ### Features
    - **(New Service)** AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an organization and centrally manage your accounts and their resources.

## __Amazon DynamoDB__
  - ### Features
    - Time to Live (TTL) is a feature that allows you to define when items in a table expire and can be purged from the database, so that you don't have to track expired data and delete it manually. With TTL enabled on a DynamoDB table, you can set a timestamp for deletion on a per-item basis, allowing you to limit storage usage to only those records that are relevant.

## __Amazon Identity and Access Management__
  - ### Features
    - This release adds support for AWS Organizations service control policies (SCPs) to SimulatePrincipalPolicy operation. If there are SCPs associated with the simulated user's account, their effect on the result is captured in the OrganizationDecisionDetail element in the EvaluationResult.

## __Amazon Mechanical Turk__
  - ### Features
    - **(New Service)** Amazon Mechanical Turk is a web service that provides an on-demand, scalable, human workforce to complete jobs that humans can do better than computers, for example, recognizing objects in photos.

# __1.11.97__ __2017-02-24__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixes a **serious regression** introduced in 1.11.94 where an overridden Content-Type was not being respected. This can cause issues with Amazon CloudSearch Domains, see [Issue [#1034](https://github.com/aws/aws-sdk-java/issues/1034)](https://github.com/aws/aws-sdk-java/issues/1034) for more details.

## __Amazon Elasticsearch Service__
  - ### Features
    - Added three new API calls to existing Amazon Elasticsearch service to expose Amazon Elasticsearch imposed limits to customers

# __1.11.96__ __2017-02-23__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed bug reported in [Issue #1018](https://github.com/aws/aws-sdk-java/issues/1018) where CRC32 was not always calculated correctly.

## __Amazon EC2__
  - ### Features
    - New EC2 I3 instance type

# __1.11.95__ __2017-02-22__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds support for creating and managing custom platform.

## __Amazon Cloud Directory__
  - ### Features
    - ListObjectAttributes documentation updated based on forum feedback

## __Amazon GameLift__
  - ### Features
    - Allow developers to configure global queues for creating GameSessions. Allow PlayerData on PlayerSessions to store player-specific data.

## __Amazon Route 53__
  - ### Features
    - Added support for operations CreateVPCAssociationAuthorization and DeleteVPCAssociationAuthorization to throw a ConcurrentModification error when a conflicting modification occurs in parallel to the authorizations in place for a given hosted zone.

# __1.11.94__ __2017-02-22__
## __AWS SDK for Java__
  - ### Features
    - Major refactoring of marshallers for all JSON based services. This may have different performance characteristics than previous releases.

## __Amazon EC2__
  - ### Features
    - Added the billingProduct parameter to the RegisterImage API.

# __1.11.93__ __2017-02-17__
## __AWS Direct Connect__
  - ### Features
    - This update will introduce the ability for Direct Connect customers to take advantage of Link Aggregation (LAG). This allows you to bundle many individual physical interfaces into a single logical interface, referred to as a LAG. This makes administration much simpler as the majority of configuration is done on the LAG while you are free to add or remove physical interfaces from the bundle as bandwidth demand increases or decreases. A concrete example of the simplification added by LAG is that customers need only a single BGP session as opposed to one session per physical connection.

# __1.11.92__ __2017-02-16__
## __AWS Config__
  - ### Features
    - AWS Config now supports a new test mode for the PutEvaluations API. Set the TestMode parameter to true in your custom rule to verify whether your AWS Lambda function will deliver evaluation results to AWS Config. No updates occur to your existing evaluations, and evaluation results are not sent to AWS Config.

## __Amazon Cognito Identity__
  - ### Features
    - Allow createIdentityPool and updateIdentityPool API to set server side token check value on identity pool.

# __1.11.91__ __2017-02-15__
## __AWS Key Management Service__
  - ### Features
    - This release of AWS Key Management Service introduces the ability to tag keys. Tagging keys can help you organize your keys and track your KMS costs in the cost allocation report. This release also increases the maximum length of a key ID to accommodate ARNs that include a long key alias.

## __AWS SDK for Java for OSGi__
  - ### Bugfixes
    - Fixing [Issue #979](https://github.com/aws/aws-sdk-java/issues/979) by including the jmespath-java module in the OSGi bundle.

## __Amazon Glacier__
  - ### Features
    - Introduce `ArchiveTransferManaggerBuilder`. This builder allows using references to `AmazonGlacier`, `AmazonSNS` and AmazonSQS` rather than the concrete implementations.

  - ### Deprecations
    - Deprecate all constructors for `ArchiveTransferManager`.

# __1.11.90__ __2017-02-14__
## __Amazon EC2__
  - ### Features
    - Adds support for the new Modify Volumes apis.

# __1.11.89__ __2017-02-10__
## __AWS Storage Gateway__
  - ### Features
    - File gateway mode in AWS Storage gateway provides access to objects in S3 as files on a Network File System (NFS) mount point. This is done by creating Nfs file shares using existing APIs CreateNfsFileShare. Using the feature in this update, the customer can restrict the clients that have read/write access to the gateway by specifying the list of clients as a list of IP addresses or CIDR blocks. This list can be specified using the API CreateNfsFileShare while creating new file shares, or UpdateNfsFileShare while update existing file shares. To find out the list of clients that have access, the existing API DescribeNfsFileShare will now output the list of clients that have access.

# __1.11.88__ __2017-02-09__
## __Amazon EC2__
  - ### Features
    - This feature allows customers to associate an IAM profile to running instances that do not have any.

## __Amazon Rekognition__
  - ### Features
    - DetectFaces and IndexFaces operations now return an estimate of the age of the face as an age range.

# __1.11.87__ __2017-02-08__
## __Amazon Lex__
  - ### Features
    - **(NewService)** Amazon Lex is a service for building conversational interactions into any application using voice or text.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug in `TransferManager` where the [`TransferManager#copy`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/transfer/TransferManager.html#copy-com.amazonaws.services.s3.model.CopyObjectRequest-) method was retrieving the metadata for the latest version of the source object even when supplying a specific version via `CopyObjectRequest#withSourceVersionId`.

      This fixes Issue [#1009](https://github.com/aws/aws-sdk-java/issues/1009).
    - Fix an integer overflow bug in [`LegacyS3ProgressListener`](http://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/s3/model/LegacyS3ProgressListener.html). Note that this class is deprecated and users are discouraged from using it.

      This fixes Issue [#1008](https://github.com/aws/aws-sdk-java/issues/1008).

# __1.11.86__ __2017-01-26__
## __AWS CodeDeploy__
  - ### Features
    - This release of AWS CodeDeploy introduces support for blue/green deployments. In a blue/green deployment, the current set of instances in a deployment group is replaced by new instances that have the latest application revision installed on them. After traffic is rerouted behind a load balancer to the replacement instances, the original instances can be terminated automatically or kept running for other uses.

## __AWS Step Functions__
  - ### Features
    - Initial release of a fluent builder API to create state machine JSON documents.

## __Amazon CloudDirectory__
  - ### Features
    - **(New Service)** Amazon Cloud Directory is a component of the AWS Directory Service that simplifies the development and management of cloud-scale web, mobile and IoT applications. This guide describes the Cloud Directory operations that you can call programatically and includes detailed information on data types and errors. For information about AWS Directory Services features, see [AWS Directory Service](https://aws.amazon.com/directoryservice/) and the [AWS Directory Service Administration Guide](http://docs.aws.amazon.com/directoryservice/latest/admin-guide/what_is.html).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds instance health check functionality to replace unhealthy EC2 Spot fleet instances with fresh ones.

## __Amazon Relational Database Service__
  - ### Features
    - Snapshot Engine Version Upgrade

## __Amazon S3__
  - ### Features
    - Adding [builder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/AmazonS3EncryptionClientBuilder.java) for AmazonS3EncryptionClient.
    - Adding `disableParallelDownloads` option to [TransferManagerBuilder](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManagerBuilder.java#L400).

  - ### Deprecations
    - Constructors on the AmazonS3EncryptionClient have been deprecated in favor of using the AmazonS3EncryptionClientBuilder.

# __1.11.85__ __2017-01-25__
## __Amazon Relational Database Service__
  - ### Features
    - Cross Region Read Replica Copying

## __Elastic Load Balancing__
  - ### Features
    - Application Load Balancers now support native Internet Protocol version 6 (IPv6) in an Amazon Virtual Private Cloud (VPC). With this ability, clients can now connect to the Application Load Balancer in a dual-stack mode via either IPv4 or IPv6.

# __1.11.84__ __2017-01-24__
## __AWS CodeCommit__
  - ### Features
    - Now includes the option to view the differences between a commit and its parent commit.

## __AWS SDK for Java__
  - ### Features
    - Adding ability to set custom endpoint and signing region on client builders. For example

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withEndpointConfiguration(new EndpointConfiguration("http://sns-custom-endpoint.amazon.com", "us-east-1")).build();
      ```
      _NB: This should only be used if a custom endpoint is required, the recommended approach for configuring a client is via set/withRegion on the builder_
    - Bundled dependency of AWS SDK jar available as a new maven module 'aws-java-sdk-bundle'. This module includes all service and dependent JARs with third-party libraries relocated to different namespaces.

  - ### Deprecations
    - Deprecating `com.amazonaws.regions.Region.createClient`, clients should be created via their builder implementation for example:

      ```java
      AmazonSNSClientBuilder.standard().withRegion(region).build();
      ```
    - Deprecating client constructors & mutation methods on clients (eg `setRegion`) in favor of creating a client via the client builders. The following mechanism for creating clients is deprecated:

      ```java
      AmazonSNSClient client = new AmazonSNSClient(clientConfiguration); //client constructor is deprecated
      client.setRegion(RegionUtils.getRegion("us-east-1"));              //mutating the client via setRegion is deprecated
      ```

      Clients should now be constructed using the builder:

      ```java
      AmazonSNS client = AmazonSNSClientBuilder.standard().withClientConfiguration(clientConfiguration).withRegion("us-east-1").build();
      ```

## __Amazon EC2 Container Service__
  - ### Features
    - Now supports a state for container instances that can be used to drain a container instance in preparation for maintenance or cluster scale down.

## __Amazon S3__
  - ### Deprecations
    - Deprecating constructors and mutable methods (eg `setConfiguration()`) on [TransferManager](https://github.com/aws/aws-sdk-java/blob/master/aws-java-sdk-s3/src/main/java/com/amazonaws/services/s3/transfer/TransferManager.java) in favor of creating via the builder for example:

      ```java
      TransferManager tm = TransferManagerBuilder.standard().withS3Client(s3Client).build();
      ```

# __1.11.83__ __2017-01-20__
## __AWS Certificate Manager__
  - ### Features
    - Updated response elements for DescribeCertificate API in support of managed renewal.

# __1.11.82__ __2017-01-20__
## __Amazon DynamoDB__
  - ### Deprecations
    - Deprecating [waitForActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActiveOrDelete--) and [waitForAllActiveOrDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForAllActiveOrDelete--) methods in Table class which can give incorrect results if they are called immediatedly after creating or deleting a table. This is due to dynamoDb operations being eventually consistent and might take a few seconds to propagate the new status. Use [waitForActive](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForActive--) and [waitForDelete](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/dynamodbv2/document/Table.html#waitForDelete--) instead.

