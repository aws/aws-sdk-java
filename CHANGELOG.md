# __1.11.364__ __2018-07-10__
## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

# __1.11.363__ __2018-07-09__
## __AWS Cost Explorer Service__
  - ### Features
    - AWS Cost Explorer provides you with Reserved Instance (RI) purchase recommendations based on your total cross-account Amazon EC2 and Amazon RDS usage. Starting today, linked accounts can also access custom RI purchase recommendations for specific linked accounts directly via AWS Cost Explorer API.

## __AWS Database Migration Service__
  - ### Features
    - Added support for DmsTransfer endpoint type and support for re-validate option in table reload API.

## __AWS Lambda__
  - ### Features
    - Add support for .NET Core 2.1 to Lambda.

## __Amazon Transcribe Service__
  - ### Features
    - You can now specify an Amazon S3 output bucket to store the transcription of your audio file when you call the StartTranscriptionJob operation. 

## __Application Auto Scaling__
  - ### Features
    - The release adds support for custom resource auto scaling.

# __1.11.362__ __2018-07-06__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds support for the following 1) users can specify tags to be attached to queues, presets, and templates during creation of those resources on MediaConvert. 2) users can now view the count of jobs in submitted state and in progressing state on a per queue basis.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added required fields and documentation updates for AWS Serverless Application Repository.

# __1.11.361__ __2018-07-05__
## __Amazon Pinpoint__
  - ### Features
    - This release of the Amazon Pinpoint SDK adds the ability to create complex segments and validate phone numbers for SMS messages. It also adds the ability to get or delete endpoints based on user IDs, remove attributes from endpoints, and list the defined channels for an app.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker NotebookInstances supports 'Updating' as a NotebookInstanceStatus.  In addition, DescribeEndpointOutput now includes Docker repository digest of deployed Model images.

# __1.11.360__ __2018-07-03__
## __AWS Certificate Manager__
  - ### Features
    - Adds a "CertificateValidated" waiter to AWS Certificate Manager clients, which polls on a new certificate's validation state.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for customers to tag EC2 Dedicated Hosts

## __Amazon Redshift__
  - ### Features
    - Feature 1 - On-demand cluster release version - When Amazon Redshift releases a new cluster version, you can choose to upgrade to that version immediately instead of waiting until your next maintenance window. You can also choose to roll back to a previous version. The two new APIs added for managing cluster release version are - ModifyClusterDbRevision, DescribeClusterDbRevisions. Feature 2 - Upgradeable reserved instance - You can now exchange one Reserved Instance for a new Reserved Instance with no changes to the terms of your existing Reserved Instance (term, payment type, or number of nodes). The two new APIs added for managing these upgrades are - AcceptReservedNodeExchange, GetReservedNodeExchangeOfferings. 

# __1.11.359__ __2018-07-02__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Execution History and StartAssociationOnce release for State Manager. Users now have the ability to view association execution history with DescribeAssociationExecutions and DescribeAssociationExecutionTargets. Users can also execute an association by calling StartAssociationOnce.

# __1.11.358__ __2018-06-29__
## __AWS Secrets Manager__
  - ### Features
    - New SDK code snippet examples for the new APIs released for the Resource-based Policy support in Secrets Manager

# __1.11.357__ __2018-06-28__
## __AWS Elastic Beanstalk__
  - ### Features
    - Elastic Beanstalk adds "Suspended" health status to the EnvironmentHealthStatus enum type and updates document.

## __AWS Lambda__
  - ### Features
    - Support for SQS as an event source.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to use Server Message Block (SMB) protocol  to store and access objects in Amazon Simple Storage Service (S3). 

# __1.11.356__ __2018-06-27__
## __AWS CodePipeline__
  - ### Features
    - UpdatePipeline may now throw a LimitExceededException when adding or updating Source Actions that use periodic checks for change detection

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon CloudFront__
  - ### Features
    - Unpublish delete-service-linked-role API.

## __Amazon Comprehend__
  - ### Features
    - This release gives customers the option to batch process a set of documents stored within an S3 bucket in addition to the existing synchronous nature of the current Comprehend API.

# __1.11.355__ __2018-06-26__
## __AWS Secrets Manager__
  - ### Features
    - This release adds support for resource-based policies that attach directly to your secrets. These policies provide an additional way to control who can access your secrets and what they can do with them. For more information, see https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_resource-based-policies.html in the Secrets Manager User Guide.

## __Amazon Inspector__
  - ### Features
    - Introduce four new APIs to view and preview Exclusions.  Exclusions show which intended security checks are excluded from an assessment, along with reasons and recommendations to fix.  The APIs are CreateExclusionsPreview, GetExclusionsPreview, ListExclusions, and DescribeExclusions.

## __Amazon Simple Storage Service__
  - ### Features
    - Add AllowQuotedRecordDelimiter to Amazon S3 Select API. Please refer to https://docs.aws.amazon.com/AmazonS3/latest/API/RESTObjectSELECTContent.html for usage details.

# __1.11.354__ __2018-06-22__
## __Alexa For Business__
  - ### Features
    -  Introduce DeviceNotRegisteredException for AWSMoneypenny

## __Amazon AppStream__
  - ### Features
    - This API update enables customers to find their VPC private IP address and ENI ID associated with AppStream streaming sessions.

# __1.11.353__ __2018-06-21__
## __Amazon CloudDirectory__
  - ### Features
    - SDK release to support Flexible Schema initiative being carried out by Amazon Cloud Directory. This feature lets customers using new capabilities like: variant typed attributes, dynamic facets and AWS managed Cloud Directory schemas.

## __Amazon Macie__
  - ### Features
    - Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect sensitive data in AWS. With this release, we are launching the following Macie HTTPS API operations: AssociateMemberAccount, AssociateS3Resources, DisassociateMemberAccount, DisassociateS3Resources, ListMemberAccounts, ListS3Resources, and UpdateS3Resources. With these API operations you can issue HTTPS requests directly to the service.

## __Amazon Neptune__
  - ### Features
    - Deprecates the PubliclyAccessible parameter that is not supported by Amazon Neptune.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds Amazon Linux 2 support to Patch Manager

# __1.11.352__ __2018-06-21__
## __Amazon Macie__
  - ### Features
    - Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect sensitive data in AWS. With this release, we are launching the following Macie HTTPS API operations: AssociateMemberAccount, AssociateS3Resources, DisassociateMemberAccount, DisassociateS3Resources, ListMemberAccounts, ListS3Resources, and UpdateS3Resources. With these API operations you can issue HTTPS requests directly to the service.

## __Amazon Neptune__
  - ### Features
    - Deprecates the PubliclyAccessible parameter that is not supported by Amazon Neptune.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds Amazon Linux 2 support to Patch Manager

# __1.11.351__ __2018-06-20__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - CA Restore is a new feature within AWS Certificate Manager Private Certificate Authority (ACM PCA) that allows you to restore a private certificate authority that has been deleted. When you issue the DeleteCertificateAuthority call, you can now specify the number of days (7-30, with 30 being the default) in which the private certificate authority will remain in the DELETED state. During this time, the private certificate authority can be restored with the RestoreCertificateAuthority API call and then be returned to the PENDING_CERTIFICATE or DISABLED state, depending upon the state prior to deletion.  Summary of API Changes: 1). Added RestoreCertificateAuthority API call; 2). Added optional PermanentDeletionTimeInDays parameter to DeleteCertificateAuthority API call. If this parameter is not specified, the DeleteCertificateAuthority API call will use a 30 day restore period as default.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now makes Reserved Outputs and Inputs available through the AWS Management Console and API. You can reserve outputs and inputs with a 12 month commitment in exchange for discounted hourly rates. Pricing is available at https://aws.amazon.com/medialive/pricing/

## __Amazon Relational Database Service__
  - ### Features
    - This release adds a new parameter to specify the retention period for Performance Insights data for RDS instances. You can either choose 7 days (default) or 731 days. For more information, see Amazon RDS Documentation.

# __1.11.350__ __2018-06-19__
## __Amazon Rekognition__
  - ### Features
    - Documentation updates for rekognition

# __1.11.349__ __2018-06-15__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds language code support according to the ISO-639-3 standard. Custom 3-character language codes are now supported on input and output for both audio and captions.

# __1.11.348__ __2018-06-14__
## __AWS IoT Analytics__
  - ### Features
    - With this release, AWS IoT Analytics allows you to tag resources. Tags are metadata that you can create and use to manage your IoT Analytics resources. For more information about tagging, see AWS Tagging Strategies. For technical documentation, look for the tagging operations in the AWS IoT Analytics API reference or User Guide.

## __Amazon API Gateway__
  - ### Features
    - Support for PRIVATE endpoint configuration type

## __Amazon DynamoDB__
  - ### Features
    - Added two new fields SSEType and KMSMasterKeyArn to SSEDescription block in describe-table output.

# __1.11.347__ __2018-06-13__
## __AWS Service Catalog__
  - ### Features
    - Introduced new length limitations for few of the product fields.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for new parameter, CloudWatchOutputConfig, for SendCommand API. Users can now have RunCommand output sent to CloudWatchLogs.

# __1.11.346__ __2018-06-12__
## __AWS Device Farm__
  - ### Features
    - Adding VPCEndpoint support for Remote access. Allows customers to be able to access their private endpoints/services running in their VPC during remote access.

## __AWS Security Token Service__
  - ### Bugfixes
    - Removed client side validation for session duration in STSAssumeRoleSessionCredentialsProvider. Please note that the limits still apply and you will get a runtime exception if the specified value in out of valid range.

## __Amazon EC2 Container Service__
  - ### Features
    - Introduces daemon scheduling capability to deploy one task per instance on selected instances in a cluster.  Adds a "force" flag to the DeleteService API to delete a service without requiring to scale down the number of tasks to zero.

## __Amazon SNS__
  - ### Bugfixes
    - Fix SnsMessageManager class to use proper certificate names for AWS China and AWS GovCloud regions.

# __1.11.345__ __2018-06-11__
## __AWS Storage Gateway__
  - ### Features
    -  AWS Storage Gateway now enables you to create cached volumes and tapes with AWS KMS support.

## __Amazon CloudDirectory__
  - ### Features
    - Amazon Cloud Directory now supports optional attributes on Typed Links, giving users the ability to associate and manage data on Typed Links. 

## __Amazon Relational Database Service__
  - ### Features
    - Changed lists of valid EngineVersion values to links to the RDS User Guide.

# __1.11.344__ __2018-06-08__
## __AWS MediaTailor__
  - ### Features
    - Fixes a bug in the request URIs for MediaTailor PlaybackConfiguration operations.

# __1.11.343__ __2018-06-07__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now makes channel log information available through Amazon CloudWatch Logs. You can set up each MediaLive channel with a logging level; when the channel is run, logs will automatically be published to your account on Amazon CloudWatch Logs

# __1.11.342__ __2018-06-05__
## __AWS Cost Explorer Service__
  - ### Features
    - Cost Explorer API is providing programmatic access to RI saving metrics to enable customers to optimize their reservations.

## __AWS SDK for Java__
  - ### Features
    - Caching `XPathFactory` to improve performance of exception handling for services using XML protocol

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __AWS Shield__
  - ### Features
    - DDoS Response Team access management for AWS Shield

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new French voice - "Lea"

## __Amazon Relational Database Service__
  - ### Features
    - This release adds customizable processor features for RDS instances.

# __1.11.341__ __2018-06-04__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the support for Common Media Application Format (CMAF) fragmented outputs, RF64 WAV audio output format, and HEV1 or HEVC1 MP4 packaging types when using HEVC in DASH or CMAF outputs.

## __AWS Migration Hub__
  - ### Features
    - Documentation updates for AWS Migration Hub

## __Amazon AppStream__
  - ### Features
    - Amazon AppStream 2.0 adds support for Google Drive for G Suite. With this feature, customers will be able to connect their G Suite accounts with AppStream 2.0 and enable Google Drive access for an AppStream 2.0 stack. Users of the stack can then link their Google Drive using their G Suite login credentials and use their existing files stored in Drive with their AppStream 2.0 applications. File changes will be synced automatically to Google cloud. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You are now able to use instance storage (up to 3600 GB of NVMe based SSD) on M5 instances, the next generation of EC2's General Purpose instances in us-east-1, us-west-2, us-east-2, eu-west-1 and ca-central-1. M5 instances offer up to 96 vCPUs, 384 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes and provide a balance of compute, memory and network resources for many applications.

## __Amazon Elastic Container Service for Kubernetes__
  - ### Features
    - Amazon Elastic Container Service for Kubernetes (Amazon EKS) is a fully managed service that makes it easy to deploy, manage, and scale containerized applications using Kubernetes on AWS. Amazon EKS runs the Kubernetes control plane for you across multiple AWS availability zones to eliminate a single point of failure. Amazon EKS is certified Kubernetes conformant so you can use existing tooling and plugins from partners and the Kubernetes community. Applications running on any standard Kubernetes environment are fully compatible and can be easily migrated to Amazon EKS. 

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker has added the ability to run hyperparameter tuning jobs. A hyperparameter tuning job will create and evaluate multiple training jobs while tuning algorithm hyperparameters, to optimize a customer specified objective metric.

# __1.11.340__ __2018-06-01__
## __AWS Directory Service__
  - ### Features
    - Added ResetUserPassword API. Customers can now reset their users' passwords without providing the old passwords in Simple AD and Microsoft AD.

## __AWS IoT__
  - ### Features
    - We are releasing force CancelJob and CancelJobExecution functionalities to customers.

## __AWS MediaTailor__
  - ### Features
    - AWS Elemental MediaTailor is a personalization and monetization service that allows scalable server-side ad insertion. The service enables you to serve targeted ads to viewers while maintaining broadcast quality in over-the-top (OTT) video applications. This SDK allows user access to the AWS Elemental MediaTailor configuration interface.

## __Amazon Redshift__
  - ### Features
    - Documentation updates for redshift

## __Amazon Simple Notification Service__
  - ### Features
    - The SNS Subscribe API has been updated with two new optional parameters: Attributes and ReturnSubscriptionArn. Attributes is a map of subscription attributes which can be one or more of: FilterPolicy, DeliveryPolicy, and RawMessageDelivery. ReturnSubscriptionArn is a boolean parameter that overrides the default behavior of returning "pending confirmation" for subscriptions that require confirmation instead of returning the subscription ARN.

# __1.11.339__ __2018-05-30__
## __Amazon Neptune__
  - ### Features
    - Amazon Neptune is a fast, reliable graph database service that makes it easy to build and run applications that work with highly connected datasets. Neptune supports popular graph models Property Graph and W3C's Resource Description Frame (RDF), and their respective query languages Apache TinkerPop Gremlin 3.3.2 and SPARQL 1.1. 

## __Amazon Route53__
  - ### Bugfixes
    - Reverting a breaking change in ListHostedZonesByNameResult behavior introduced in version 1.11.321. See https://github.com/aws/aws-sdk-java/pull/1555 for more details.

## __Elastic Load Balancing__
  - ### Features
    - This release of Elastic Load Balancing introduces user authentication on Application Load Balancer.

# __1.11.338__ __2018-05-29__
## __AWS Performance Insights__
  - ### Features
    - Performance Insights is a feature of Amazon Relational Database Service (RDS) that helps you quickly assess the load on your database, and determine when and where to take action. You can use the SDK to retrieve Performance Insights data and integrate your monitoring solutions.

# __1.11.337__ __2018-05-25__
## __AWS Config__
  - ### Features
    - AWS Config adds support for retention period, allowing you to specify a retention period for your AWS Config configuration items.

## __AWS Glue__
  - ### Features
    - AWS Glue now sends a delay notification to Amazon CloudWatch Events when an ETL job runs longer than the specified delay notification threshold.

## __AWS IoT__
  - ### Features
    - We are exposing DELETION_IN_PROGRESS as a new job status in regards to the release of DeleteJob API.

## __Amazon AppStream__
  - ### Features
    - This API update enables customers to control whether users can transfer data between their local devices and their streaming applications through file uploads and downloads, clipboard operations, or printing to local devices

# __1.11.336__ __2018-05-24__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild Adds Support for Windows Builds.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon Relational Database Service__
  - ### Features
    - This release adds CloudWatch Logs integration capabilities to RDS Aurora MySQL clusters

## __Elastic Load Balancing__
  - ### Features
    - Updated elasticloadbalancingV2 documentation with slow start mode details.  The slow start mode can be used to gradually increase the number of requests forwarded by a load balancer to a newly added target in a target group. It provides a new target an opportunity to warm up before it can handle its fair share of requests received from the load balancer. Slow start mode is disabled by default and can be enabled on a per target group basis.

# __1.11.335__ __2018-05-22__
## __AWS SDK for Java__
  - ### Features
    - The default [`Socket`](https://docs.oracle.com/javase/6/docs/api/java/net/Socket.html) implementation tries to resolve an appropriate proxy via the configured [`ProxySelector`](https://docs.oracle.com/javase/6/docs/api/java/net/ProxySelector.html) when connecting to a remote host if it was not constructed with an explicit [`Proxy`](https://docs.oracle.com/javase/6/docs/api/java/net/Proxy.html). For example, if the system properties `socksProxyHost` and `socksProxyPort` are defined, then the default `ProxySelector` will return that as the proxy to use for the socket. This feature introduces a new setting, `ClientConfiguration#disableSocketProxy(boolean)`, to prevent the socket from resolving a proxy. This is useful for example, when the SOCKS proxy properties must be defined for other components, but the the client should not connect to it.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) adds service discovery for services that use host or bridged network mode. ECS can now also register instance IPs for active tasks using bridged and host networking with Route 53, making them available via DNS.

## __Amazon Inspector__
  - ### Features
    - We are launching the ability to target all EC2 instances. With this launch, resourceGroupArn is now optional for CreateAssessmentTarget and UpdateAssessmentTarget. If resourceGroupArn is not specified, all EC2 instances in the account in the AWS region are included in the assessment target.

# __1.11.334__ __2018-05-21__
## __AWS CloudFormation__
  - ### Features
    - 1) Filtered Update for StackSet based on Accounts and Regions: This feature will allow flexibility for the customers to roll out updates on a StackSet based on specific Accounts and Regions.   2) Support for customized ExecutionRoleName: This feature will allow customers to attach ExecutionRoleName to the StackSet thus ensuring more security and controlling the behavior of any AWS resources in the target accounts.

# __1.11.333__ __2018-05-18__
## __AWS IoT__
  - ### Features
    - We are releasing DeleteJob and DeleteJobExecution APIs to allow customer to delete resources created using AWS IoT Jobs.

## __Amazon Simple Email Service__
  - ### Features
    - Fixed a broken link in the documentation for S3Action.

# __1.11.332__ __2018-05-17__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for codedeploy

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito User Pools now supports federation for users to sign up and sign in with any identity provider following the OpenID Connect standard. Amazon Cognito User Pools now returns the User Pool's Amazon Resource Name (ARN) from the CreateUserPool, UpdateUserPool, and DescribeUserPool APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - You are now able to use instance storage (up to 1800 GB of NVMe based SSD) on C5 instances, the next generation of EC2's compute optimized instances in us-east-1, us-west-2, us-east-2, eu-west-1 and ca-central-1. C5 instances offer up to 72 vCPUs, 144 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes to deliver improved performance for compute-intensive workloads.You can now run bare metal workloads on EC2 with i3.metal instances. As a new instance size belonging to the I3 instance family, i3.metal instances have the same characteristics as other instances in the family, including NVMe SSD-backed instance storage optimized for low latency, very high random I/O performance, and high sequential read throughput. I3.metal instances are powered by 2.3 GHz Intel Xeon processors, offering 36 hyper-threaded cores (72 logical processors), 512 GiB of memory, and 15.2 TB of NVMe SSD-backed instance storage. These instances deliver high networking throughput and lower latency with up to 25 Gbps of aggregate network bandwidth using Elastic Network Adapter (ENA)-based Enhanced Networking.

# __1.11.331__ __2018-05-16__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __AWS Service Catalog__
  - ### Features
    - Users can now pass a new option to ListAcceptedPortfolioShares called portfolio-share-type with a value of AWS_SERVICECATALOG in order to access Getting Started Portfolios that contain selected products representing common customer use cases.

# __1.11.330__ __2018-05-15__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for XRay resource

# __1.11.329__ __2018-05-14__
## __AWS CodeBuild__
  - ### Features
    - Adding support for more override fields for StartBuild API, add support for idempotency token field  for StartBuild API in AWS CodeBuild.

## __AWS IoT 1-Click Devices Service__
  - ### Features
    - AWS IoT 1-Click makes it easy for customers to incorporate simple ready-to-use IoT devices into their workflows. These devices can trigger AWS Lambda functions that implement business logic. In order to build applications using AWS IoT 1-Click devices, programmers can use the AWS IoT 1-Click Devices API and the AWS IoT 1-Click Projects API. Learn more at https://aws.amazon.com/documentation/iot-1-click/

## __AWS IoT 1-Click Projects Service__
  - ### Features
    - AWS IoT 1-Click makes it easy for customers to incorporate simple ready-to-use IoT devices into their workflows. These devices can trigger AWS Lambda functions that implement business logic. In order to build applications using AWS IoT 1-Click devices, programmers can use the AWS IoT 1-Click Devices API and the AWS IoT 1-Click Projects API. Learn more at https://aws.amazon.com/documentation/iot-1-click/.

## __AWS Organizations__
  - ### Features
    - Documentation updates for organizations

# __1.11.328__ __2018-05-10__
## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose can convert the format of your input data from JSON to Apache Parquet or Apache ORC before storing the data in Amazon S3. Parquet and ORC are columnar data formats that save space and enable faster queries compared to row-oriented formats like JSON.

# __1.11.327__ __2018-05-10__
## __Amazon GameLift__
  - ### Features
    - AutoScaling Target Tracking scaling simplification along with StartFleetActions and StopFleetActions APIs to suspend and resume automatic scaling at will.

# __1.11.326__ __2018-05-09__
## __AWS Budgets__
  - ### Features
    - Updating the regex for the NumericValue fields.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Enable support for latest flag with Get Console Output

## __Amazon Relational Database Service__
  - ### Features
    - Changes to support the Aurora MySQL Backtrack feature.

# __1.11.325__ __2018-05-08__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Enable support for specifying CPU options during instance launch.

## __Amazon Relational Database Service__
  - ### Features
    - Correction to the documentation about copying unencrypted snapshots.

# __1.11.324__ __2018-05-07__
## __AWS Budgets__
  - ### Features
    - "With this release, customers can use AWS Budgets to monitor how much of their Amazon EC2, Amazon RDS, Amazon Redshift, and Amazon ElastiCache instance usage is covered by reservations, and receive alerts when their coverage falls below the threshold they define."

## __Alexa For Business__
  - ### Features
    - This release adds the new Device status "DEREGISTERED". This release also adds DEVICE_STATUS as the new DeviceEventType.

## __Amazon Elasticsearch Service__
  - ### Features
    - This change brings support for Reserved Instances to AWS Elasticsearch.

# __1.11.323__ __2018-05-04__
## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty is adding five new API operations for creating and managing filters. For each filter, you can specify a criteria and an action. The action you specify is applied to findings that match the specified criteria.

# __1.11.322__ __2018-05-04__
## __AWS AppSync__
  - ### Features
    - This release adds support for authorizing your AWS AppSync endpoint with an OpenID Connect compliant service and also to configure your AWS AppSync endpoint to log requests to Amazon CloudWatch Logs.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Lambda, ElasticBeanstalk, WAF and ElasticLoadBalancing resources

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

# __1.11.321__ __2018-05-02__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS CodePipeline__
  - ### Features
    - Added support for webhooks with accompanying definitions as needed in the AWS CodePipeline API Guide.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Fleet is a new feature that simplifies the provisioning of Amazon EC2 capacity across different EC2 instance types, Availability Zones, and the On-Demand, Reserved Instance, and Spot Instance purchase models. With a single API call, you can now provision capacity to achieve desired scale, performance, and cost.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added support for new parameter, DocumentVersion, for SendCommand API. Users can now specify version of SSM document to be executed on the target(s).

# __1.11.320__ __2018-04-30__
## __Alexa For Business__
  - ### Features
    - Adds ListDeviceEvents API to get a paginated list of device events (such as ConnectionStatus). This release also adds ConnectionStatus field to GetDevice and SearchDevices API.

## __Amazon DynamoDB__
  - ### Features
    - Adds two new APIs UpdateGlobalTableSettings and DescribeGlobalTableSettings. This update introduces new constraints in the CreateGlobalTable and UpdateGlobalTable APIs . Tables must have the same write capacity units. If Global Secondary Indexes exist then they must have the same write capacity units and key schema.

## __Amazon GuardDuty__
  - ### Features
    - You can disable the email notification when inviting GuardDuty members using the disableEmailNotification parameter in the InviteMembers operation.

## __Amazon Route 53 Domains__
  - ### Features
    - This release adds a SubmittedSince attribute to the ListOperations API, so you can list operations that were submitted after a specified date and time.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker has added support for VPC configuration for both Endpoints and Training Jobs. This allows you to connect from the instances running the Endpoint or Training Job to your VPC and any resources reachable in the VPC rather than being restricted to resources that were internet accessible.

## __Amazon WorkSpaces__
  - ### Features
    - Added new IP Access Control APIs, an API to change the state of a Workspace, and the ADMIN_MAINTENANCE WorkSpace state. With the new IP Access Control APIs, you can now create/delete IP Access Control Groups, add/delete/update rules for IP Access Control Groups, Associate/Disassociate IP Access Control Groups to/from a WorkSpaces Directory, and Describe IP Based Access Control Groups.

# __1.11.319__ __2018-04-26__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

## __Amazon Glacier__
  - ### Features
    - Documentation updates for Glacier to fix a broken link

# __1.11.318__ __2018-04-25__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy has a new exception that indicates when a GitHub token is not valid.

## __AWS X-Ray__
  - ### Features
    - Added PutEncryptionConfig and GetEncryptionConfig APIs for managing data encryption settings. Use PutEncryptionConfig to configure X-Ray to use an AWS Key Management Service customer master key to encrypt trace data at rest.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition.

# __1.11.317__ __2018-04-24__
## __AWS Elastic Beanstalk__
  - ### Features
    - Support tracking Elastic Beanstalk resources in AWS Config.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for secretsmanager

# __1.11.316__ __2018-04-23__
## __AWS Auto Scaling Plans__
  - ### Features
    - The release adds the operation UpdateScalingPlan for updating a scaling plan and the support for tag filters as an application source.

## __AWS IoT__
  - ### Features
    - Add IotAnalyticsAction which sends message data to an AWS IoT Analytics channel

## __AWS IoT Analytics__
  - ### Features
    - Introducing AWS IoT Analytics SDK. AWS IoT Analytics provides advanced data analysis for AWS IoT. It allows you to collect large amounts of device data, process messages, store them, and then query the data and run sophisticated analytics to make accurate decisions in your IoT applications and machine learning use cases. AWS IoT Analytics enables advanced data exploration through integration with Jupyter Notebooks and data visualization through integration with Amazon QuickSight.

# __1.11.315__ __2018-04-20__
## __AWS Elemental MediaLive__
  - ### Features
    - With AWS Elemental MediaLive you can now output live channels as RTMP (Real-Time Messaging Protocol) and RTMPS as the encrypted version of the protocol (Secure, over SSL/TLS). RTMP is the preferred protocol for sending live streams to popular social platforms which  means you can send live channel content to social and sharing platforms in a secure and reliable way while continuing to stream to your own website, app or network.

## __Amazon Kinesis Firehose__
  - ### Features
    - With this release, Amazon Kinesis Data Firehose allows you to tag your delivery streams. Tags are metadata that you can create and use to manage your delivery streams. For more information about tagging, see AWS Tagging Strategies. For technical documentation, look for the tagging operations in the Amazon Kinesis Firehose API reference.

# __1.11.314__ __2018-04-19__
## __AWS CodePipeline__
  - ### Features
    - Added new SourceRevision structure to Execution Summary with accompanying definitions as needed in the AWS CodePipeline API Guide.

## __AWS Cost Explorer Service__
  - ### Features
    - Starting today, you can identify opportunities for Amazon RDS cost savings using AWS Cost Explorer's API to access your Amazon RDS Reserved Instance Purchase Recommendations

## __AWS Device Farm__
  - ### Features
    - Adding support for VPCEndpoint feature. Allows customers to be able to access their private endpoints/services running in their VPC during test automation.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for customers to see the time at which a Dedicated Host was allocated or released.

## __Amazon Relational Database Service__
  - ### Features
    - The ModifyDBCluster operation now includes an EngineVersion parameter. You can use this to upgrade the engine for a clustered database.

## __Amazon S3__
  - ### Bugfixes
    - Updated SelectRecordsInputStream for the new S3 select feature to not read to the end of the stream when it is closed.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added new APIs DeleteInventory and DescribeInventoryDeletions, for customers to delete their custom inventory data.

# __1.11.313__ __2018-04-10__
## __AWS Database Migration Service__
  - ### Features
    - Native Change Data Capture start point and task recovery support in Database Migration Service.  

## __AWS Elemental MediaPackage__
  - ### Features
    - Adds a new OriginEndpoint package type CmafPackage in MediaPackage. Origin endpoints can now be configured to use the Common Media Application Format (CMAF) media streaming format. This version of CmafPackage only supports HTTP Live Streaming (HLS) manifests with fragmented MP4.

## __AWS Glue__
  - ### Features
    - "AWS Glue now supports timeout values for ETL jobs. With this release, all new ETL jobs have a default timeout value of 48 hours. AWS Glue also now supports the ability to start a schedule or job events trigger when it is created."

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added TooManyUpdates exception for AddTagsToResource and RemoveTagsFromResource API

## __Amazon WorkMail__
  - ### Features
    - Amazon WorkMail adds the ability to grant users and groups with "Full Access", "Send As" and "Send on Behalf" permissions on a given mailbox.

# __1.11.312__ __2018-04-09__
## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory customers can fetch attributes within a facet on an object with the new GetObjectAttributes API and can fetch attributes from multiple facets or objects with the BatchGetObjectAttributes operation.

# __1.11.311__ __2018-04-06__
## __AWS Batch__
  - ### Features
    - Support for Timeout in SubmitJob and RegisterJobDefinition

# __1.11.310__ __2018-04-05__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for ec2

# __1.11.309__ __2018-04-04__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added support for AWS Certificate Manager Private Certificate Authority (CA). Customers can now request private certificates with the RequestCertificate API, and also export private certificates with the ExportCertificate API.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private Certificate Authority (CA) is a managed private CA service that helps you easily and securely manage the lifecycle of your private certificates. ACM Private CA provides you a highly-available private CA service without the upfront investment and ongoing maintenance costs of operating your own private CA. ACM Private CA extends ACM's certificate management capabilities to private certificates, enabling you to manage public and private certificates centrally.

## __AWS Config__
  - ### Features
    - AWS Config introduces multi-account multi-region data aggregation features. Customers can create an aggregator (a new resource type) in AWS Config that collects AWS Config data from multiple source accounts and regions into an aggregator account. Customers can aggregate data from individual account(s) or an organization and multiple regions. In this release, AWS Config adds several API's for multi-account multi-region data aggregation.

## __AWS Secrets Manager__
  - ### Features
    - AWS Secrets Manager enables you to easily create and manage the secrets that you use in your customer-facing apps.  Instead of embedding credentials into your source code, you can dynamically query Secrets Manager from your app whenever you need credentials.  You can automatically and frequently rotate your secrets without having to deploy updates to your apps.  All secret values are encrypted when they're at rest with AWS KMS, and while they're in transit with HTTPS and TLS.

## __Amazon CloudWatch__
  - ### Features
    - The new GetMetricData API enables you to collect batch amounts of metric data and optionally perform math expressions on the data. With one GetMetricData call you can retrieve as many as 100 different metrics and a total of 100,800 data points.

## __Amazon S3__
  - ### Features
    - Amazon S3 Select is an Amazon S3 feature that makes it easy to retrieve specific data from the contents of an object using simple SQL expressions without having to retrieve the entire object. With this release of the Amazon S3 SDK, S3 Select API (SelectObjectContent) is now generally available in all public regions. This release supports retrieval of a subset of data using SQL clauses, like SELECT and WHERE, from delimited text files and JSON objects in Amazon S3 through the SelectObjectContent API available in AWS S3 SDK.
    - ONEZONE_IA storage class stores object data in only one Availability Zone at a lower price than STANDARD_IA. This SDK release provides API support for this new storage class.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker is now supporting many additional instance types in previously supported families for Notebooks, Training Jobs, and Endpoints. Training Jobs and Endpoints now support instances in the m5 family in addition to the previously supported instance families. For specific instance types supported please see the documentation for the SageMaker API.

## __Amazon Simple Storage Service__
  - ### Features
    - ONEZONE_IA storage class stores object data in only one Availability Zone at a lower price than STANDARD_IA. This SDK release provides API support for this new storage class.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe is an automatic speech recognition (ASR) service that makes it easy for developers to add speech to text capability to their applications. 

## __Firewall Management Service__
  - ### Features
    - This release is the initial release version for AWS Firewall Manager, a new AWS service that makes it easy for customers to centrally configure WAF rules across all their resources (ALBs and CloudFront distributions) and across accounts.

# __1.11.308__ __2018-04-03__
## __AWS Device Farm__
  - ### Features
    - Added Private Device Management feature. Customers can now manage their private devices efficiently - view their status, set labels and apply profiles on them. Customers can also schedule automated tests and remote access sessions on individual instances in their private device fleet.

## __AWS Lambda__
  - ### Features
    - added nodejs8.10 as a valid runtime

## __Amazon Translate__
  - ### Features
    - This release increases the maximum size of input text to 5,000 bytes. Amazon Translate now supports automatic language detection of the input text. The translation models have been improved to increase accuracy. See the documentation for more information.

# __1.11.307__ __2018-04-02__
## __Amazon API Gateway__
  - ### Features
    - Amazon API Gateway now supports resource policies for APIs making it easier to set access controls for invoking APIs.

## __Amazon CloudFront__
  - ### Features
    - You can now use a new Amazon CloudFront capability called Field-Level Encryption to further enhance the security of sensitive data, such as credit card numbers or personally identifiable information (PII) like social security numbers. CloudFront's field-level encryption further encrypts sensitive data in an HTTPS form using field-specific encryption keys (which you supply) before a POST request is forwarded to your origin. This ensures that sensitive data can only be decrypted and viewed by certain components or services in your application stack. Field-level encryption is easy to setup. Simply configure the fields that have to be further encrypted by CloudFront using the public keys you specify and you can reduce attack surface for your sensitive data.

## __Amazon Elasticsearch Service__
  - ### Features
    - This adds Amazon Cognito authentication support to Kibana.

# __1.11.306__ __2018-03-30__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect is a contact center as a service (CCaS) solution that offers easy, self-service configuration and enables dynamic, personal, and natural customer engagement at any scale. With this release of the Amazon Connect SDK, Outbound APIs (StartOutboundVoiceContact, StopContact) are now generally available. This release supports CTR generation for calls generated through the new APIs. Additionally IAM permissions are supported for the new APIs. 

# __1.11.305__ __2018-03-29__
## __AWS CloudFormation__
  - ### Features
    - Enabling resource level permission control for StackSets APIs. Adding support for customers to use customized AdministrationRole to create security boundaries between different users.

## __AWS Greengrass__
  - ### Features
    - Greengrass APIs now support creating Machine Learning resource types and configuring binary data as the input payload for Greengrass Lambda functions.

## __Alexa For Business__
  - ### Features
    - Adds operations for creating and managing address books of phone contacts for use in A4B managed shared devices.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating patch baselines for CentOS.

# __1.11.304__ __2018-03-28__
## __AWS Identity and Access Management__
  - ### Features
    - Add support for Longer Role Sessions. Four APIs manage max session duration: GetRole, ListRoles, CreateRole, and the new API UpdateRole. The max session duration integer attribute is measured in seconds.

## __AWS Security Token Service__
  - ### Features
    - Change utilizes the Max Session Duration attribute introduced for IAM Roles and allows STS customers to request session duration up to the Max Session Duration of 12 hours from AssumeRole based APIs.

## __Amazon Mechanical Turk__
  - ### Features
    - Added a new attribute "ActionsGuarded" to QualificationRequirement: This update allows MTurk Requester customers using the AWS SDK to control which Workers can see and preview their HITs. We now support hiding HITs from unqualified Workers' search results.

# __1.11.303__ __2018-03-27__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager has added support for customers to disable Certificate Transparency logging on a per-certificate basis.

# __1.11.302__ __2018-03-26__
## __Amazon DynamoDB__
  - ### Features
    - Point-in-time recovery (PITR) provides continuous backups of your DynamoDB table data. With PITR, you do not have to worry about creating, maintaining, or scheduling backups. You enable PITR on your table and your backup is available for restore at any point in time from the moment you enable it, up to a maximum of the 35 preceding days. PITR provides continuous backups until you explicitly disable it. For more information, see the Amazon DynamoDB Developer Guide.

# __1.11.301__ __2018-03-23__
## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS

# __1.11.300__ __2018-03-22__
## __AWS CodeBuild__
  - ### Features
    - Adding support for branch filtering when using webhooks with AWS CodeBuild. 

## __Amazon AppStream__
  - ### Features
    - Feedback URL allows admins to provide a feedback link or a survey link for collecting user feedback while streaming sessions. When a feedback link is provided, streaming users will see a "Send Feedback" choice in their streaming session toolbar. On selecting this choice, user will be redirected to the link provided in a new browser tab. If a feedback link is not provided, users will not see the "Send Feedback" option. 

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) now includes integrated Service Discovery using Route 53 Auto Naming. Customers can now specify a Route 53 Auto Naming service as part of an ECS service. ECS will register task IPs with Route 53, making them available via DNS in your VPC.

# __1.11.299__ __2018-03-21__
## __AWSServerlessApplicationRepository__
  - ### Features
    - Documentation updates for Serverless Application Respository

# __1.11.298__ __2018-03-20__
## __AWS Config__
  - ### Features
    - AWS Config adds support for BatchGetResourceConfig API, allowing you to batch-retrieve the current state of one or more of your resources.

## __AWS Cost Explorer Service__
  - ### Features
    - This launch will allow customers to access their Amazon EC2 Reserved Instance (RI) purchase recommendations programmatically via the AWS Cost Explorer API. 

## __AWS Elastic Beanstalk__
  - ### Features
    - Documentation updates for the new Elastic Beanstalk API DescribeAccountAttributes.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive has added support for updating Inputs and Input Security Groups. You can update Input Security Groups at any time and it will update all channels using that Input Security Group. Inputs can be updated as long as they are not attached to a currently running channel.

## __AWS Glue__
  - ### Features
    - API Updates for DevEndpoint: PublicKey is now optional for CreateDevEndpoint. The new DevEndpoint field PrivateAddress will be populated for DevEndpoints associated with a VPC.

## __AWS SDK for Java__
  - ### Features
    - Add support for defining and serializing NotResource elements in IAM policies.
    - Update latency logging level in metric collection to debug level. [#1514](https://github.com/aws/aws-sdk-java/issues/1514)

## __Amazon CloudWatch Events__
  - ### Features
    - Added SQS FIFO queue target support

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now mount a temporary volume in memory in containers and specify the shared memory that a container can use through the use of docker's 'tmpfs' and 'shm-size' features respectively. These fields can be specified under linuxParameters in ContainerDefinition in the Task Definition Template.

# __1.11.297__ __2018-03-16__
## __AWS Elastic Beanstalk__
  - ### Features
    - AWS Elastic Beanstalk is launching a new public API named DescribeAccountAttributes which allows customers to access account level attributes. In this release, the API will support quotas for resources such as applications, application versions, and environments.

# __1.11.296__ __2018-03-15__
## __AWS Organizations__
  - ### Features
    - This release adds additional reason codes to improve clarity to exceptions that can occur.

## __Amazon Pinpoint__
  - ### Features
    - With this release, you can delete endpoints from your Amazon Pinpoint projects. Customers can now specify one of their leased dedicated long or short codes to send text messages.

## __Amazon SageMaker Service__
  - ### Features
    - This release provides support for ml.p3.xlarge instance types for notebook instances.  Lifecycle configuration is now available to customize your notebook instances on start; the configuration can be reused between multiple notebooks.  If a notebook instance is attached to a VPC you can now opt out of internet access that by default is provided by SageMaker.

# __1.11.295__ __2018-03-14__
## __Amazon Lightsail__
  - ### Features
    - Updates to existing Lightsail documentation

# __1.11.294__ __2018-03-13__
## __Amazon Route 53 Auto Naming__
  - ### Features
    - This release adds support for custom health checks, which let you check the health of resources that aren't accessible over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC.

# __1.11.293__ __2018-03-12__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for discovery

## __AWS CloudHSM V2__
  - ### Features
    - CreateCluster can now take both 8 and 17 character Subnet IDs. DeleteHsm can now take both 8 and 17 character ENI IDs.

## __AWS IoT__
  - ### Features
    - We added new fields to the response of the following APIs. (1) describe-certificate: added new generationId, customerVersion fields (2) describe-ca-certificate: added new generationId, customerVersion and lastModifiedDate fields (3) get-policy: added generationId, creationDate and lastModifiedDate fields

## __Amazon Redshift__
  - ### Features
    - DescribeClusterSnapshotsMessage with ClusterExists flag returns snapshots of existing clusters. Else both existing and deleted cluster snapshots are returned

# __1.11.292__ __2018-03-08__
## __AWS Migration Hub__
  - ### Features
    - Unused key LABEL removed from ResourceAttrbute

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (ECS) now supports container health checks. Customers can now specify a docker container health check command and parameters in their task definition. ECS will monitor, report and take scheduling action based on the health status.

## __Amazon Pinpoint__
  - ### Features
    - With this release, you can export endpoints from your Amazon Pinpoint projects. You can export a) all of the endpoints assigned to a project or b) the subset of endpoints assigned to a segment.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for RDS

# __1.11.291__ __2018-03-07__
## __AWS Elemental MediaLive__
  - ### Features
    - Updates API to model required traits and minimum/maximum constraints.

# __1.11.290__ __2018-03-06__
## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS

# __1.11.289__ __2018-03-01__
## __AWS Service Catalog__
  - ### Features
    - This release of ServiceCatalog adds the DeleteTagOption API.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway (File) support for two new file share attributes are added.           1. Users can specify the S3 Canned ACL to use for new objects created in the file share.         2. Users can create file shares for requester-pays buckets.

## __Amazon CloudWatch Events__
  - ### Features
    - Added BatchParameters to the PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for modifying Placement Group association of instances via ModifyInstancePlacement API.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Inventory release supports the status message details reported by the last sync for the resource data sync API.

# __1.11.288__ __2018-02-28__
## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of SageMaker Production Variants on an Endpoint.

# __1.11.287__ __2018-02-27__
## __Amazon EC2 Container Registry__
  - ### Features
    - Documentation updates for Amazon ECR.

# __1.11.286__ __2018-02-26__
## __AWS Security Token Service__
  - ### Features
    - Increased SAMLAssertion parameter size from 50000 to 100000 for AWS Security Token Service AssumeRoleWithSAML API to allow customers to pass bigger SAML assertions

## __Amazon Route 53__
  - ### Features
    - Added support for creating LBR rules using ap-northeast-3 region.

# __1.11.285__ __2018-02-23__
## __AWS SDK for Java__
  - ### Features
    - Add support for AWS_EC2_METADATA_DISABLED environment variable to disable EC2 Metadata Service usage to retrieve credentials and region.

## __Amazon AppStream__
  - ### Features
    - This API update is to enable customers to copy their Amazon AppStream 2.0 images within and between AWS Regions

# __1.11.284__ __2018-02-22__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding a file directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Cost Explorer Service__
  - ### Features
    - Added GetReservationCoverage API for retrieving reservation coverage information.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added support for delete-application API and the ability for developers to set a homepage for their application. The homepage is a URL with more information about the application, for example the location of your GitHub repository for the application. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for tagging an EBS snapshot as part of the API call that creates the EBS snapshot

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

## __Elastic Load Balancing__
  - ### Features
    - Added a new load balancer attribute related to Network Load Balancers that enables cross zone capabilities. This feature allows Network Load Balancers to distribute requests regardless of Availability Zone.

# __1.11.283__ __2018-02-21__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS CodeCommit__
  - ### Features
    - This release adds an API for adding a file directly to an AWS CodeCommit repository without requiring a Git client.

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Added support for delete-application API and the ability for developers to set a homepage for their application. The homepage is a URL with more information about the application, for example the location of your GitHub repository for the application. 

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for tagging an EBS snapshot as part of the API call that creates the EBS snapshot

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

# __1.11.282__ __2018-02-20__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __AWS WAF__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __AWS WAF Regional__
  - ### Features
    - The new PermissionPolicy APIs in AWS WAF Regional allow customers to attach resource-based policies to their entities.

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling support for service-linked roles

# __1.11.281__ __2018-02-19__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports for None Data Source, CreateApiKey now supports setting expiration on API keys, new API UpdateApiKey supports updating expiration on API keys. 

## __AWS Config__
  - ### Features
    - With this release, AWS Config updated the ConfigurationItemStatus enum values. The values prior to this update did not represent appropriate values returned by GetResourceConfigHistory. You must update your code to enumerate the new enum values so this is a breaking change.  To map old properties to new properties, use the following descriptions: New discovered resource - Old property: Discovered, New property: ResourceDiscovered. Updated resource - Old property: Ok, New property: OK. Deleted resource - Old property: Deleted, New property: ResourceDeleted or ResourceDeletedNotRecorded. Not-recorded resource - Old property: N/A, New property: ResourceNotRecorded or ResourceDeletedNotRecorded.

## __AWS Elemental MediaConvert__
  - ### Features
    - Nielsen ID3 tags can now be inserted into transport stream (TS) and HLS outputs. For more information on Nielsen configuration you can go to https://docs.aws.amazon.com/mediaconvert/latest/apireference/jobs.html#jobs-nielsenconfiguration

## __Amazon GameLift__
  - ### Features
    - Updates to allow Fleets to run on On-Demand or Spot instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now provides the ability to export and import your Amazon Lex chatbot definition as a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Updates RDS API to indicate whether a DBEngine supports read replicas.

# __1.11.277__ __2018-02-13__
## __Amazon Glacier__
  - ### Features
    - Documentation updates for glacier

## __Amazon Route 53__
  - ### Features
    - Added support for creating Private Hosted Zones and metric-based healthchecks in the ap-northeast-3 region for whitelisted customers.

# __1.11.276__ __2018-02-12__
## __AWS Key Management Service__
  - ### Features
    - This release of AWS Key Management Service includes support for InvalidArnException in the RetireGrant API.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Support for user migration using AWS Lambda trigger. Support to obtain signing certificate for user pools.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Network interfaces now supply the following additional status of "associated" to better distinguish the current status.

## __Amazon GuardDuty__
  - ### Features
    - Added PortProbeAction information to the Action section of the port probe-type finding.

## __Amazon Relational Database Service__
  - ### Features
    - Aurora MySQL now supports MySQL 5.7.

# __1.11.275__ __2018-02-09__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Users can now better understand the longer ID opt-in status of their account using the two new APIs DescribeAggregateIdFormat and DescribePrincipalIdFormat

## __Amazon Lex Model Building Service__
  - ### Features
    - You can now define a response for your Amazon Lex chatbot directly from the AWS console. A response consists of messages dynamically selected from a group of pre-defined messages, populated by the developer.

## __Amazon Lex Runtime Service__
  - ### Features
    - You can now define a response for your Amazon Lex chatbot directly from the AWS console. A response consists of messages dynamically selected from a group of pre-defined messages, populated by the developer.

# __1.11.274__ __2018-02-08__
## __AWS Budgets__
  - ### Features
    - Making budgetLimit and timePeriod optional, and updating budgets docs. 

## __AWS Database Migration Service__
  - ### Features
    - This release includes the addition of two new APIs: describe replication instance task logs and reboot instance. The first allows user to see how much storage each log for a task on a given instance is occupying. The second gives users the option to reboot the application software on the instance and force a fail over for MAZ instances to test robustness of their integration with our service. 

## __AWS Directory Service__
  - ### Features
    - Updated the regex of some input parameters to support longer EC2 identifiers.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive has added support for updating channel settings for idle channels. You can now update channel name, channel outputs and output destinations, encoder settings, user role ARN, and input specifications. Channel settings can be updated in the console or with API calls. Please note that running channels need to be stopped before they can be updated. We've also deprecated the 'Reserved' field.

## __AWS Elemental MediaStore__
  - ### Features
    - AWS Elemental MediaStore now supports per-container CORS configuration.

## __Amazon AppStream__
  - ### Features
    - Adds support for allowing customers to provide a redirect URL for a stack. Users will be redirected to the link provided by the admin at the end of their streaming session. 

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports server-side encryption using a default service key (alias/aws/dynamodb) from the AWS Key Management Service (KMS). AWS KMS is a service that combines secure, highly available hardware and software to provide a key management system scaled for the cloud. AWS KMS is used via the AWS Management Console or APIs to centrally create encryption keys, define the policies that control how keys can be used, and audit key usage to prove they are being used correctly. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift FlexMatch added the StartMatchBackfill API.  This API allows developers to add new players to an existing game session using the same matchmaking rules and player data that were used to initially create the session.

## __Amazon SNS__
  - ### Features
    - Adding a new utility ([SnsMessageManager](https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/services/sns/message/SnsMessageManager.html)) to parse and validate SNS messages published to an HTTP/HTTPs endpoint. See this [blog post](https://aws.amazon.com/blogs/developer/publishing-to-https-endpoints-using-sns-and-the-aws-sdk-for-java/) for more information.

# __1.11.273__ __2018-02-06__
## __AWS Glue__
  - ### Features
    - This new feature will now allow customers to add a customized json classifier. They can specify a json path to indicate the object, array or field of the json documents they'd like crawlers to inspect when they crawl json files. 

## __AWS Service Catalog__
  - ### Features
    - This release of Service Catalog adds SearchProvisionedProducts API and ProvisionedProductPlan APIs.

## __Amazon Route 53 Auto Naming__
  - ### Features
    - This release adds support for registering CNAME record types and creating Route 53 alias records that route traffic to Amazon Elastic Load Balancers using Amazon Route 53 Auto Naming APIs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports configuring Linux repos as part of patch baselines, controlling updates of non-OS security packages and also creating patch baselines for SUSE12

# __1.11.272__ __2018-02-05__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for acm

## __AWS Cloud9__
  - ### Features
    - API usage examples for AWS Cloud9.

## __AWS OpsWorks__
  - ### Features
    - AWS OpsWorks Stacks supports EBS encryption and HDD volume types. Also, a new DescribeOperatingSystems API is available, which lists all operating systems supported by OpsWorks Stacks.

## __Amazon Kinesis__
  - ### Features
    - Using ListShards a Kinesis Data Streams customer or client can get information about shards in a data stream (including meta-data for each shard) without obtaining data stream level information.

## __Amazon S3__
  - ### Bugfixes
    - Multi-part downloads through TransferManager now use a shorter temporary file name to prevent file system limitations with long file names.

# __1.11.271__ __2018-01-26__
## __AWS Device Farm__
  - ### Features
    - Add InteractionMode in CreateRemoteAccessSession for DirectDeviceAccess feature.

## __AWS Elemental MediaLive__
  - ### Features
    - Add InputSpecification to CreateChannel (specification of input attributes is used for channel sizing and affects pricing);  add NotFoundException to DeleteInputSecurityGroups.

## __Amazon Mechanical Turk__
  - ### Features
    - Documentation updates for mturk-requester

# __1.11.270__ __2018-01-25__
## __AWS CodeBuild__
  - ### Features
    - Adding support for Shallow Clone and GitHub Enterprise in AWS CodeBuild.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports Revision ID on your function versions and aliases, to track and apply conditional updates when you are updating your function version or alias resources.

## __Alexa For Business__
  - ### Features
    - Supports new field for DeviceStatusInfo which provides details about the DeviceStatus following a DeviceSync operation.

## __Amazon GuardDuty__
  - ### Features
    - Added the missing AccessKeyDetails object to the resource shape.

# __1.11.269__ __2018-01-22__
## __AWS Budgets__
  - ### Features
    - Add additional costTypes: IncludeDiscount, UseAmortized,  to support finer control for different charges included in a cost budget.

# __1.11.268__ __2018-01-19__
## __AWS Glue__
  - ### Features
    - New AWS Glue DataCatalog APIs to manage table versions and a new feature to skip archiving of the old table version when updating table. 

# __1.11.267__ __2018-01-18__
## __Amazon SageMaker Service__
  - ### Features
    - CreateTrainingJob and CreateEndpointConfig now supports KMS Key for volume encryption. 

# __1.11.266__ __2018-01-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for autoscaling-plans

# __1.11.265__ __2018-01-16__
## __Amazon Relational Database Service__
  - ### Features
    - With this release you can now integrate RDS DB instances with CloudWatch Logs. We have added parameters to the operations for creating and modifying DB instances (for example CreateDBInstance) to allow you to take advantage of this capability through the CLI and API. Once you enable this feature, a stream of log events will publish to CloudWatch Logs for each log type you enable.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling is adding support for Target Tracking Scaling for ECS services.

# __1.11.264__ __2018-01-15__
## __AWS Lambda__
  - ### Features
    - Support for creating Lambda Functions using 'dotnetcore2.0' and 'go1.x'. 

# __1.11.263__ __2018-01-12__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for AWS Application Discovery Service.

## __AWS CodeDeploy__
  - ### Features
    - The AWS CodeDeploy API was updated to support DeleteGitHubAccountToken, a new method that deletes a GitHub account connection.

## __AWS Directory Service__
  - ### Features
    - On October 24 we introduced AWS Directory Service for Microsoft Active Directory (Standard Edition), also known as AWS Microsoft AD (Standard Edition), which is a managed Microsoft Active Directory (AD) that is optimized for small and midsize businesses (SMBs). With this SDK release, you can now create an AWS Microsoft AD directory using API. This enables you to run typical SMB workloads using a cost-effective, highly available, and managed Microsoft AD in the AWS Cloud.

## __AWS Glue__
  - ### Features
    - Support is added to generate ETL scripts in Scala which can now be run by  AWS Glue ETL jobs. In addition, the trigger API now supports firing when any conditions are met (in addition to all conditions). Also, jobs can be triggered based on a "failed" or "stopped" job run (in addition to a "succeeded" job run). 

## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS KMS

## __Amazon Import/Export Snowball__
  - ### Features
    - Documentation updates for snowball

## __Amazon Inspector__
  - ### Features
    - Added 2 new attributes to the DescribeAssessmentTemplate response, indicating the total number of assessment runs and last assessment run ARN (if present.)

## __Amazon Route 53__
  - ### Features
    - This release adds an exception to the CreateTrafficPolicyVersion API operation.

# __1.11.262__ __2018-01-11__
## __Amazon Relational Database Service__
  - ### Features
    - Read Replicas for Amazon RDS for MySQL, MariaDB, and PostgreSQL now support Multi-AZ deployments.Amazon RDS Read Replicas enable you to create one or more read-only copies of your database instance within the same AWS Region or in a different AWS Region. Updates made to the source database are asynchronously copied to the Read Replicas. In addition to providing scalability for read-heavy workloads, you can choose to promote a Read Replica to become standalone a DB instance when needed.Amazon RDS Multi-AZ Deployments provide enhanced availability for database instances within a single AWS Region. With Multi-AZ, your data is synchronously replicated to a standby in a different Availability Zone (AZ). In case of an infrastructure failure, Amazon RDS performs an automatic failover to the standby, minimizing disruption to your applications.You can now combine Read Replicas with Multi-AZ as part of a disaster recovery strategy for your production databases. A well-designed and tested plan is critical for maintaining business continuity after a disaster. Since Read Replicas can also be created in different regions than the source database, your Read Replica can be promoted to become the new production database in case of a regional disruption.You can also combine Read Replicas with Multi-AZ for your database engine upgrade process. You can create a Read Replica of your production database instance and upgrade it to a new database engine version. When the upgrade is complete, you can stop applications, promote the Read Replica to a standalone database instance and switch over your applications. Since the database instance is already a Multi-AZ deployment, no additional steps are needed.For more information, see the Amazon RDS User Guide.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updates documentation for the HierarchyLevelLimitExceededException error.

## __Elastic Load Balancing__
  - ### Features
    - Added OperationNotPermittedException to indicate that you cannot create a load balancer while deleting the Elastic Load Balancing service-linked role.

# __1.11.261__ __2018-01-09__
## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS KMS

# __1.11.260__ __2018-01-09__
## __AWS Directory Service__
  - ### Features
    - On October 24 we introduced AWS Directory Service for Microsoft Active Directory (Standard Edition), also known as AWS Microsoft AD (Standard Edition), which is a managed Microsoft Active Directory (AD) that is optimized for small and midsize businesses (SMBs). With this SDK release, you can now create an AWS Microsoft AD directory using API. This enables you to run typical SMB workloads using a cost-effective, highly available, and managed Microsoft AD in the AWS Cloud.

# __1.11.259__ __2018-01-08__
## __AWS Application Discovery Service__
  - ### Features
    - Documentation updates for AWS Application Discovery Service.

## __AWS CodeDeploy__
  - ### Features
    - The AWS CodeDeploy API was updated to support DeleteGitHubAccountToken, a new method that deletes a GitHub account connection.

## __Amazon Route 53__
  - ### Features
    - This release adds an exception to the CreateTrafficPolicyVersion API operation.

# __1.11.258__ __2018-01-05__
## __Amazon Import/Export Snowball__
  - ### Features
    - Documentation updates for snowball

## __Amazon Inspector__
  - ### Features
    - Added 2 new attributes to the DescribeAssessmentTemplate response, indicating the total number of assessment runs and last assessment run ARN (if present.)

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for ssm

# __1.11.257__ __2018-01-02__
## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for rds

# __1.11.256__ __2017-12-29__
## __Amazon WorkSpaces__
  - ### Features
    - Modify WorkSpaces have been updated with flexible storage and switching of hardware bundles feature. The following configurations have been added to ModifyWorkSpacesProperties: storage and compute. This update provides the capability to configure the storage of a WorkSpace. It also adds the capability of switching hardware bundle of a WorkSpace by specifying an eligible compute (Value, Standard, Performance, Power).

# __1.11.255__ __2017-12-22__
## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now set a health check initialization wait period of their ECS services, the services that are associated with an Elastic Load Balancer (ELB) will wait for a period of time before the ELB become healthy. You can now configure this in Create and Update Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release fixes an issue with tags not showing in DescribeAddresses responses.

## __Amazon Inspector__
  - ### Features
    - PreviewAgents API now returns additional fields within the AgentPreview data type. The API now shows the agent health and availability status for all instances included in the assessment target. This allows users to check the health status of Inspector Agents before running an assessment. In addition, it shows the instance ID, hostname, and IP address of the targeted instances.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Models no longer support SupplementalContainers.  API's that have been affected are CreateModel and DescribeModel.

# __1.11.254__ __2017-12-21__
## __AWS CodeBuild__
  - ### Features
    - Adding support allowing AWS CodeBuild customers to select specific curated image versions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Elastic IP tagging enables you to add key and value metadata to your Elastic IPs so that you can search, filter, and organize them according to your organization's needs.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics now supports AWS Lambda functions as output.

# __1.11.253__ __2017-12-20__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for WAF, WAFRegional, and CloudFront resources

## __AWS IoT__
  - ### Features
    - This release adds support for code signed Over-the-air update functionality for Amazon FreeRTOS. Users can now create and schedule Over-the-air updates to their Amazon FreeRTOS devices using these new APIs. 

# __1.11.252__ __2017-12-19__
## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - Documentation updates for mediastore

## __Amazon API Gateway__
  - ### Features
    - API Gateway now adds support for calling API with compressed payloads using one of the supported content codings, tagging an API stage for cost allocation, and returning API keys from a custom authorizer for use with a usage plan.

## __Amazon Route 53__
  - ### Features
    - Route 53 added support for a new China (Ningxia) region, cn-northwest-1. You can now specify cn-northwest-1 as the region for latency-based or geoproximity routing. Route 53 also added support for a new EU (Paris) region, eu-west-3. You can now associate VPCs in eu-west-3 with private hosted zones and create alias records that route traffic to resources in eu-west-3.

# __1.11.251__ __2017-12-19__
## __Amazon CloudWatch__
  - ### Features
    - Documentation updates for monitoring

# __1.11.250__ __2017-12-15__
## __Amazon AppStream__
  - ### Features
    - This API update is to enable customers to add tags to their Amazon AppStream 2.0 resources

# __1.11.249__ __2017-12-14__
## __Amazon API Gateway__
  - ### Features
    - Adds support for Cognito Authorizer scopes at the API method level.

## __Amazon Simple Email Service__
  - ### Features
    - Added information about the maximum number of transactions per second for the SendCustomVerificationEmail operation.

# __1.11.248__ __2017-12-12__
## __AWS CodeDeploy__
  - ### Features
    - Documentation updates for CodeDeploy.

## __Amazon WorkMail__
  - ### Features
    - Today, Amazon WorkMail released an administrative SDK and enabled AWS CloudTrail integration. With the administrative SDK, you can natively integrate WorkMail with your existing services. The SDK enables programmatic user, resource, and group management through API calls. This means your existing IT tools and workflows can now automate WorkMail management, and third party applications can streamline WorkMail migrations and account actions. 

# __1.11.247__ __2017-12-11__
## __Amazon Cognito Identity Provider__
  - ### Features
    - Exposing the hosted UI domain name for a user pool that has a domain configured.

## __Amazon Lex Model Building Service__
  - ### Features
    - The GetBotChannelAssociation API now returns the status and failure reason, if any, for a bot channel.

## __Amazon SageMaker Service__
  - ### Features
    - CreateModel API Update:  The request parameter 'ExecutionRoleArn' has changed from optional to required.

# __1.11.246__ __2017-12-08__
## __Amazon AppStream__
  - ### Features
    - This API update is to support the feature that allows customers to automatically consume the latest Amazon AppStream 2.0 agent as and when published by AWS.

## __Amazon CloudWatch__
  - ### Features
    - With this launch, you can now create a CloudWatch alarm that alerts you when M out of N datapoints of a metric are breaching your predefined threshold, such as three out of five times in any given five minutes interval or two out of six times in a thirty minutes interval. When M out of N datapoints are not breaching your threshold in an interval, the alarm will be in OK state. Please note that the M datapoints out of N datapoints in an interval can be of any order and does not need to be consecutive. Consequently, you can now get alerted even when the spikes in your metrics are intermittent over an interval.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Windows containers.

# __1.11.245__ __2017-12-07__
## __Amazon Elasticsearch Service__
  - ### Features
    - Added support for encryption of data at rest on Amazon Elasticsearch Service using AWS KMS

## __Amazon Simple Email Service__
  - ### Features
    - Customers can customize the emails that Amazon SES sends when verifying new identities. This feature is helpful for developers whose applications send email through Amazon SES on behalf of their customers.

# __1.11.244__ __2017-12-06__
## __AWS Elastic Beanstalk__
  - ### Features
    - Documentation updates for AWS Elastic Beanstalk.

## __Amazon CloudDirectory__
  - ### Features
    - Amazon Cloud Directory makes it easier for you to apply schema changes across your directories with in-place schema upgrades. Your directories now remain available while backward-compatible schema changes are being applied, such as the addition of new fields. You also can view the history of your schema changes in Cloud Directory by using both major and minor version identifiers, which can help you track and audit schema versions across directories.

## __Amazon SageMaker Service__
  - ### Features
    - Initial waiters for common SageMaker workflows.

# __1.11.243__ __2017-12-05__
## __AWS IoT__
  - ### Features
    - Add error action API for RulesEngine. 

## __AWS Service Catalog__
  - ### Features
    - ServiceCatalog has two distinct personas for its use, an "admin" persona (who creates sets of products with different versions and prescribes who has access to them) and an "end-user" persona (who can launch cloud resources based on the configuration data their admins have given them access to).  This API update will allow admin users to deactivate/activate product versions, end-user will only be able to access and launch active product versions. 

## __Amazon Route 53 Auto Naming__
  - ### Features
    - Amazon Route 53 Auto Naming lets you configure public or private namespaces that your microservice applications run in. When instances of the service become available, you can call the Auto Naming API to register the instance, and Amazon Route 53 automatically creates up to five DNS records and an optional health check. Clients that submit DNS queries for the service receive an answer that contains up to eight healthy records.

# __1.11.242__ __2017-12-04__
## __AWS Budgets__
  - ### Features
    - Add additional costTypes to support finer control for different charges included in a cost budget.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ecs

# __1.11.241__ __2017-12-01__
## __Amazon SageMaker Service__
  - ### Features
    - Preparing to release updated waiters week of December 4, 2017 for all supported SDKs.

# __1.11.240__ __2017-11-30__
## __AWS Cloud9__
  - ### Features
    - Adds support for creating and managing AWS Cloud9 development environments. AWS Cloud9 is a cloud-based integrated development environment (IDE) that you use to write, run, and debug code.

## __AWS Lambda__
  - ### Features
    - AWS Lambda now supports the ability to set the concurrency limits for individual functions, and increasing memory to 3008MB.

## __AWS Serverless Application Repository__
  - ### Features
    - First release of the AWS Serverless Application Repository SDK

## __Alexa For Business__
  - ### Features
    - Alexa for Business is now generally available for production use. Alexa for Business makes it easy for you to use Alexa in your organization. The Alexa for Business SDK gives you APIs to manage Alexa devices, enroll users, and assign skills at scale. For more information about Alexa for Business, go to https://aws.amazon.com/alexaforbusiness 

## __Amazon API Gateway__
  - ### Features
    - Added support Private Integration and VPC Link features in API Gateway. This allows to create an API with the API Gateway private integration, thus providing clients access to HTTP/HTTPS resources in an Amazon VPC from outside of the VPC through a VpcLink resource.

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. Spread Placement ensures that instances are placed on distinct hardware in order to reduce correlated failures. 2. Inter-region VPC Peering allows customers to peer VPCs across different AWS regions without requiring additional gateways, VPN connections or physical hardware 

# __1.11.239__ __2017-11-29__
## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups lets you search and group AWS resources from multiple services based on their tags.

## __AWS WAF__
  - ### Features
    - This release adds support for rule group and managed rule group. Rule group is a container of rules that customers can create, put rules in it and associate the rule group to a WebACL. All rules in a rule group will function identically as they would if each rule was individually associated to the WebACL. Managed rule group is a pre-configured rule group composed by our security partners and made available via the AWS Marketplace. Customers can subscribe to these managed rule groups, associate the managed rule group to their WebACL and start using them immediately to protect their resources.

## __AWS WAF Regional__
  - ### Features
    - This release adds support for rule group and managed rule group. Rule group is a container of rules that customers can create, put rules in it and associate the rule group to a WebACL. All rules in a rule group will function identically as they would if each rule was individually associated to the WebACL. Managed rule group is a pre-configured rule group composed by our security partners and made available via the AWS Marketplace. Customers can subscribe to these managed rule groups, associate the managed rule group to their WebACL and start using them immediately to protect their resources.

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. T2 Unlimited enables high CPU performance for any period of time whenever required 2. You are now able to create and launch EC2 m5 and h1 instances

## __Amazon Lightsail__
  - ### Features
    - This release adds support for load balancer and TLS/SSL certificate management. This set of APIs allows customers to create, manage, and scale secure load balanced applications on Lightsail infrastructure. To provide support for customers who manage their DNS on Lightsail, we've added the ability create an Alias A type record which can point to a load balancer DNS name via the CreateDomainEntry API http://docs.aws.amazon.com/lightsail/2016-11-28/api-reference/API_CreateDomainEntry.html.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates AWS Systems Manager APIs to enable executing automations at controlled rate, target resources in a resource groups and execute entire automation at once or single step at a time. It is now also possible to use YAML, in addition to JSON, when creating Systems Manager documents.

## __Auto Scaling__
  - ### Features
    - You can now use Auto Scaling with EC2 Launch Templates via the CreateAutoScalingGroup and UpdateAutoScalingGroup APIs.

# __1.11.238__ __2017-11-29__
## __AWS Greengrass__
  - ### Features
    - Greengrass OTA feature allows updating Greengrass Core and Greengrass OTA Agent. Local Resource Access feature allows Greengrass Lambdas to access local resources such as peripheral devices and volumes.

## __AWS IoT__
  - ### Features
    - This release adds support for a number of new IoT features, including AWS IoT Device Management (Jobs, Fleet Index and Thing Registration), Thing Groups, Policies on Thing Groups, Registry & Job Events, JSON Logs, Fine-Grained Logging Controls, Custom Authorization and AWS Service Authentication Using X.509 Certificates.

## __AWS IoT Jobs Data Plane__
  - ### Features
    - This release adds support for new the service called Iot Jobs. This client is built for the device SDK to use Iot Jobs Device specific APIs.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend is an AWS service for gaining insight into the content of text and documents . It develops insights by recognizing the entities, key phrases, language, sentiments, and other common elements in a document. For more information, go to the Amazon Comprehend product page. To get started, see the Amazon Comprehend Developer Guide.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports the following features: Global Table and On-Demand Backup. Global Table is a fully-managed, multi-region, multi-master database. DynamoDB customers can now write anywhere and read anywhere with single-digit millisecond latency by performing database operations closest to where end users reside. Global Table also enables customers to disaster-proof their applications, keeping them running and data accessible even in the face of natural disasters or region disruptions. Customers can set up Global Table with just a few clicks in the AWS Management Console-no application rewrites required. On-Demand Backup capability is to protect data from loss due to application errors, and meet customers' archival needs for compliance and regulatory reasons. Customers can backup and restore their DynamoDB table data anytime, with a single-click in the AWS management console or a single API call. Backup and restore actions execute with zero impact on table performance or availability. For more information, see the Amazon DynamoDB Developer Guide.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon Elastic Container Service (Amazon ECS) released a new launch type for running containers on a serverless infrastructure. The Fargate launch type allows you to run your containerized applications without the need to provision and manage the backend infrastructure. Just register your task definition and Fargate launches the container for you. 

## __Amazon Glacier__
  - ### Features
    - This release includes support for Glacier Select, a new feature that allows you to filter and analyze your Glacier archives and store the results in a user-specified S3 location.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Kinesis Video Streams Media__
  - ### Features
    - Announcing Amazon Kinesis Video Streams, a fully managed video ingestion and storage service. Kinesis Video Streams makes it easy to securely stream video from connected devices to AWS for machine learning, analytics, and processing. You can also stream other time-encoded data like RADAR and LIDAR signals using Kinesis Video Streams.

## __Amazon Rekognition__
  - ### Features
    - This release introduces Amazon Rekognition support for video analysis.

## __Amazon S3__
  - ### Features
    - This release includes support for Glacier Select, a new feature that allows you to filter and analyze your Glacier archives and store the results in a user-specified S3 location.

  - ### Deprecations
    - Deprecating AmazonS3#restoreObject in favor of the newly introduced AmazonS3#restoreObjectV2. The new method returns `RestoreObjectResult` as response.

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker is a fully-managed service that enables data scientists and developers to quickly and easily build, train, and deploy machine learning models, at scale.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker is a fully-managed service that enables data scientists and developers to quickly and easily build, train, and deploy machine learning models, at scale.

## __Amazon Translate__
  - ### Features
    - Public preview release of Amazon Translate and the Amazon Translate Developer Guide. For more information, see the Amazon Translate Developer Guide.

# __1.11.237__ __2017-11-29__
## __AWS AppSync__
  - ### Features
    - AWS AppSync is an enterprise-level, fully managed GraphQL service with real-time data synchronization and offline programming features.

## __AWS Batch__
  - ### Features
    - Add support for Array Jobs which allow users to easily submit many copies of a job with a single API call.  This change also enhances the job dependency model to support N_TO_N and sequential dependency chains. The ListJobs and DescribeJobs APIs now have the ability to list or describe the status of entire Array Jobs or individual elements within the array.

## __AWS CodeDeploy__
  - ### Features
    - Support for AWS Lambda function deployment - AWS CodeDeploy now supports the deployment of AWS Lambda functions. A Lambda deployment uses a Lambda function alias to shift traffic to a new version. You select a deployment configuration that specifies exactly how traffic shifts to your new version. Success of a deployment can be validated using Lambda functions that are referenced by the deployment. This provides the opportunity to rollback if necessary.

## __AWS Lambda__
  - ### Features
    - Lambda aliases can now shift traffic between two function versions, based on preassigned weights.

## __Amazon API Gateway__
  - ### Features
    - Changes related to CanaryReleaseDeployment feature. Enables API developer to create a deployment as canary deployment and test API changes with percentage of customers before promoting changes to all customers.

## __Amazon Cognito Identity Provider__
  - ### Features
    - AWS Cognito SDK has been updated to support new Cognito user-pool objects and operations for advanced security

## __Amazon EC2__
  - ### Features
    - Adds the following updates: 1. You are now able to host a service powered by AWS PrivateLink to provide private connectivity to other VPCs. You are now also able to create endpoints to other services powered by PrivateLink including AWS services, Marketplace Seller services or custom services created by yourself or other AWS VPC customers. 2. You are now able to save launch parameters in a single template that can be used with Auto Scaling, Spot Fleet, Spot, and On Demand instances. 3. You are now able to launch Spot instances via the RunInstances API, using a single additional parameter. RunInstances will response synchronously with an instance ID should capacity be available for your Spot request. 4. A simplified Spot pricing model which delivers low, predictable prices that adjust gradually, based on long-term trends in supply and demand. 5. Amazon EC2 Spot can now hibernate Amazon EBS-backed instances in the event of an interruption, so your workloads pick up from where they left off. Spot can fulfill your request by resuming instances from a hibernated state when capacity is available.

## __Amazon GuardDuty__
  - ### Features
    - Enable Amazon GuardDuty to continuously monitor and process AWS data sources to identify threats to your AWS accounts and workloads.  You can add customization by uploading additional threat intelligence lists and IP safe lists. You can list security findings, suspend, and disable the service. 

## __AmazonMQ__
  - ### Features
    - This is the initial SDK release for Amazon MQ. Amazon MQ is a managed message broker service for Apache ActiveMQ that makes it easy to set up and operate message brokers in the cloud. 

# __1.11.236__ __2017-11-27__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert is a file-based video conversion service that transforms media into formats required for traditional broadcast and for internet streaming to multi-screen devices.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive is a video service that lets you easily create live outputs for broadcast and streaming delivery.

## __AWS Elemental MediaPackage__
  - ### Features
    - AWS Elemental MediaPackage is a just-in-time video packaging and origination service that lets you format highly secure and reliable live outputs for a variety of devices.

## __AWS Elemental MediaStore__
  - ### Features
    - AWS Elemental MediaStore is an AWS storage service optimized for media. It gives you the performance, consistency, and low latency required to deliver live and on-demand video content. AWS Elemental MediaStore acts as the origin store in your video workflow.

## __AWS Elemental MediaStore Data Plane__
  - ### Features
    - AWS Elemental MediaStore is an AWS storage service optimized for media. It gives you the performance, consistency, and low latency required to deliver live and on-demand video content. AWS Elemental MediaStore acts as the origin store in your video workflow.

# __1.11.235__ __2017-11-22__
## __AWS Certificate Manager__
  - ### Features
    - AWS Certificate Manager now supports the ability to import domainless certs and additional Key Types as well as an additional validation method for DNS.

# __1.11.234__ __2017-11-21__
## __AWS Cloud Formation__
  - ### Features
    - 1) Instance-level parameter overrides (CloudFormation-StackSet feature): This feature will allow the customers to override the template parameters on specific stackInstances. Customers will also have ability to update their existing instances with/without parameter-overrides using a new API "UpdateStackInstances"                                                                                                                                                                                                                                                         2) Add support for SSM parameters in CloudFormation - This feature will allow the customers to use Systems Manager parameters in CloudFormation templates. They will be able to see values for these parameters in Describe APIs.

## __AWS CodeBuild__
  - ### Features
    - Adding support for accessing Amazon VPC resources from AWS CodeBuild, dependency caching and build badges.

## __AWS Shield__
  - ### Features
    - The AWS Shield SDK has been updated in order to support Elastic IP address protections, the addition of AttackProperties objects in DescribeAttack responses, and a new GetSubscriptionState operation.

## __AWS Storage Gateway__
  - ### Features
    - AWS Storage Gateway now enables you to get notification when all your files written to your NFS file share have been uploaded to Amazon S3. Storage Gateway also enables guessing of the MIME type for uploaded objects based on file extensions.

## __AWS X-Ray__
  - ### Features
    - Added automatic pagination support for AWS X-Ray APIs in the SDKs that support this feature.

## __Amazon API Gateway__
  - ### Features
    - Add support for Access logs and customizable integration timeouts

## __Amazon Elastic MapReduce__
  - ### Features
    - Enable Kerberos on Amazon EMR. 

## __Amazon Rekognition__
  - ### Features
    - This release includes updates to Amazon Rekognition for the following APIs. The new DetectText API allows you to recognize and extract textual content from images. Face Model Versioning has been added to operations that deal with face detection.

# __1.11.233__ __2017-11-20__
## __AWS CodeCommit__
  - ### Features
    - AWS CodeCommit now supports pull requests. You can use pull requests to collaboratively review code changes for minor changes or fixes, major feature additions, or new versions of your released software.

## __AWS Cost Explorer Service__
  - ### Features
    - The AWS Cost Explorer API gives customers programmatic access to AWS cost and usage information, allowing them to perform adhoc queries and build interactive cost management applications that leverage this dataset.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Apigateway

## __Amazon Kinesis__
  - ### Features
    - Customers can now obtain the important characteristics of their stream with DescribeStreamSummary. The response will not include the shard list for the stream but will have the number of open shards, and all the other fields included in the DescribeStream response.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release includes a new Kinesis Firehose feature that supports Splunk as Kinesis Firehose delivery destination. You can now use Kinesis Firehose to ingest real-time data to Splunk in a serverless, reliable, and salable manner. This release also includes a new feature that allows you to configure Lambda buffer size in Kinesis Firehose data transformation feature. You can now customize the data buffer size before invoking Lambda function in Kinesis Firehose for data transformation. This feature allows you to flexibly trade-off processing and delivery latency with cost and efficiency based on your specific use cases and requirements. 

## __Amazon WorkDocs__
  - ### Features
    - DescribeGroups API and miscellaneous enhancements

# __1.11.232__ __2017-11-17__
## __AWS Database Migration Service__
  - ### Features
    - Support for migration task assessment. Support for data validation after the migration.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Amazon RDS now supports importing MySQL databases by using backup files from Amazon S3.

## __Application Auto Scaling__
  - ### Features
    - This SDK update contains support for Target Tracking scaling for EC2 Spot Fleet. It allows you to scale an EC2 Spot Fleet using a Target Tracking scaling policy.

## __Elastic Load Balancing__
  - ### Features
    - This release adds Proxy Protocol v2 support for Network Load Balancer. Proxy protocol provides a convenient way to transport connection information (such as a client's source IP address/port and destination IP address/port) for a TCP connection across multiple layers of NAT or TCP proxies.

# __1.11.231__ __2017-11-16__
## __AWS Glue__
  - ### Features
    - API update for AWS Glue. New crawler configuration attribute enables customers to specify crawler behavior. New XML classifier enables classification of XML data.

## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Documentation updates for OpsWorks-cm: a new feature, OpsWorks for Puppet Enterprise, that allows users to create and manage OpsWorks-hosted Puppet Enterprise servers.

## __AWS Organizations__
  - ### Features
    - This release adds APIs that you can use to enable and disable integration with AWS services designed to work with AWS Organizations. This integration allows the AWS service to perform operations on your behalf on all of the accounts in your organization. Although you can use these APIs yourself, we recommend that you instead use the commands provided in the other AWS service to enable integration with AWS Organizations.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 x1e smaller instance sizes

## __Amazon Route 53__
  - ### Features
    - You can use Route 53's GetAccountLimit/GetHostedZoneLimit/GetReusableDelegationSetLimit APIs to view your current limits (including custom set limits) on Route 53 resources such as hosted zones and health checks. These APIs also return the number of each resource you're currently using to enable comparison against your current limits.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of Amazon Aurora replicas

# __1.11.230__ __2017-11-15__
## __AWS Step Functions__
  - ### Features
    - You can now use the UpdateStateMachine API to update your state machine definition and role ARN. Existing executions will continue to use the previous definition and role ARN. You can use the DescribeStateMachineForExecution API to determine which state machine definition and role ARN is associated with an execution

## __Amazon API Gateway__
  - ### Features
    - 1. Extended GetDocumentationParts operation to support retrieving documentation parts resources without contents.  2. Added hosted zone ID in the custom domain response.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds Korean language support with new female voice - "Seoyeon" and new Indian English female voice - "Aditi"

## __Amazon Simple Email Service__
  - ### Features
    - SES launches Configuration Set Reputation Metrics and Email Pausing Today, two features that build upon the capabilities of the reputation dashboard. The first is the ability to export reputation metrics for individual configuration sets. The second is the ability to temporarily pause email sending, either at the configuration set level, or across your entire Amazon SES account.

# __1.11.229__ __2017-11-14__
## __Amazon EC2 Container Service__
  - ### Features
    - Added new mode for Task Networking in ECS, called awsvpc mode. Mode configuration parameters to be passed in via awsvpcConfiguration. Updated APIs now use/show this new mode - RegisterTaskDefinition, CreateService, UpdateService, RunTask, StartTask.

## __Amazon Lightsail__
  - ### Features
    - Lightsail now supports attached block storage, which allows you to scale your applications and protect application data with additional SSD-backed storage disks. This feature allows Lightsail customers to attach secure storage disks to their Lightsail instances and manage their attached disks, including creating and deleting disks, attaching and detaching disks from instances, and backing up disks via snapshot.

## __Amazon Route 53__
  - ### Features
    - When a Route 53 health check or hosted zone is created by a linked AWS service, the object now includes information about the service that created it. Hosted zones or health checks that are created by a linked service can't be updated or deleted using Route 53.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager GetInventory API adds support for aggregation.

# __1.11.228__ __2017-11-09__
## __Amazon DynamoDB__
  - ### Bugfixes
    - When using the Dynamo DB documents API, a query spec can now be reused for multiple queries.

## __Amazon EC2__
  - ### Features
    - Introduces the following features: 1. Create a default subnet in an Availability Zone if no default subnet exists. 2. Spot Fleet integrates with Elastic Load Balancing to enable you to attach one or more load balancers to a Spot Fleet request. When you attach the load balancer, it automatically registers the instance in the Spot Fleet to the load balancers which distributes incoming traffic across the instances. 

# __1.11.227__ __2017-11-08__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __Amazon EC2__
  - ### Features
    - AWS PrivateLink for Amazon Services - Customers can now privately access Amazon services from their Amazon Virtual Private Cloud (VPC), without using public IPs, and without requiring the traffic to traverse across the Internet.

## __Amazon ElastiCache__
  - ### Features
    - This release adds online resharding for ElastiCache for Redis offering, providing the ability to add and remove shards from a running cluster. Developers can now dynamically scale-out or scale-in their Redis cluster workloads to adapt to changes in demand. ElastiCache will resize the cluster by adding or removing shards and redistribute hash slots uniformly across the new shard configuration, all while the cluster continues to stay online and serves requests.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling customers are now able to schedule adjustments to their MinCapacity and MaxCapacity, which makes it possible to pre-provision adequate capacity for anticipated demand and then reduce the provisioned capacity as demand lulls.

# __1.11.226__ __2017-11-07__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - DescribeOrderableDBInstanceOptions now returns the minimum and maximum allowed values for storage size, total provisioned IOPS, and provisioned IOPS per GiB for a DB instance.

## __Amazon S3__
  - ### Features
    - This releases adds support for 4 features: 1. Default encryption for S3 Bucket, 2. Encryption status in inventory and Encryption support for inventory. 3. Cross region replication of KMS-encrypted objects, and 4. ownership overwrite for CRR.

## __Elastic Load Balancing__
  - ### Features
    - Added a new limit related to Network Load Balancers on the number of targets per load balancer per AZ.

# __1.11.225__ __2017-11-06__
## __AWS Key Management Service (KMS)__
  - ### Features
    - Documentation updates for AWS KMS. 

## __AWS Organizations__
  - ### Features
    - This release updates permission statements for several API operations, and corrects some other minor errors.

## __AWS Pricing__
  - ### Features
    - This is the initial release of AWS Price List Service.

## __AWS Step Functions__
  - ### Features
    - Documentation update.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 C5 instances, the next generation of EC2's compute-optimized instances, in us-east-1, us-west-2 and eu-west-1. C5 instances offer up to 72 vCPUs, 144 GiB of DDR4 instance memory, 25 Gbps in Network bandwidth and improved EBS and Networking bandwidth on smaller instance sizes to deliver improved performance for compute-intensive workloads.

# __1.11.224__ __2017-11-03__
## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now add devices to their containers and enable init process in containers through the use of docker's 'devices' and 'init' features. These fields can be specified under linuxParameters in ContainerDefinition in the Task Definition Template. 

# __1.11.223__ __2017-11-02__
## __Amazon API Gateway__
  - ### Features
    - This release supports creating and managing Regional and Edge-Optimized API endpoints.

# __1.11.222__ __2017-11-01__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates for ACM

## __AWS CloudHSM V2__
  - ### Features
    - Minor documentation update for AWS CloudHSM (cloudhsmv2).

## __AWS Direct Connect__
  - ### Features
    - AWS DirectConnect now provides support for Global Access for Virtual Private Cloud (VPC) via a new feature called Direct Connect Gateway. A Direct Connect Gateway will allow you to group multiple Direct Connect Private Virtual Interfaces (DX-VIF) and Private Virtual Gateways (VGW) from different AWS regions (but belonging to the same AWS Account) and pass traffic from any DX-VIF to any VPC in the grouping.

# __1.11.221__ __2017-10-26__
## __Amazon CloudFront__
  - ### Features
    - You can now specify additional options for MinimumProtocolVersion, which controls the SSL/TLS protocol that CloudFront uses to communicate with viewers. The minimum protocol version that you choose also determines the ciphers that CloudFront uses to encrypt the content that it returns to viewers.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 P3 instance, next generation GPU instances, optimized for machine learning and high performance computing applications. With up to eight NVIDIA Tesla V100 GPUs, P3 instances provide up to one petaflop of mixed-precision, 125 teraflops of single-precision, and 62 teraflops of double-precision floating point performance, as well as a 300 GB/s second-generation NVLink interconnect that enables high-speed, low-latency GPU-to-GPU communication. P3 instances also feature up to 64 vCPUs based on custom Intel Xeon E5 (Broadwell) processors, 488 GB of DRAM, and 25 Gbps of dedicated aggregate network bandwidth using the Elastic Network Adapter (ENA).

# __1.11.220__ __2017-10-24__
## __AWS Config__
  - ### Features
    - AWS Config support for CodeBuild Project resource type

## __AWS Glue__
  - ### Features
    - AWS Glue: Adding a new API, BatchStopJobRun, to stop one or more job runs for a specified Job. 

## __Amazon ElastiCache__
  - ### Features
    - Amazon ElastiCache for Redis today announced support for data encryption both for data in-transit and data at-rest. The new encryption in-transit functionality enables ElastiCache for Redis customers to encrypt data for all communication between clients and Redis engine, and all intra-cluster Redis communication. The encryption at-rest functionality allows customers to encrypt their S3 based backups. Customers can begin using the new functionality by simply enabling this functionality via AWS console, and a small configuration change in their Redis clients. The ElastiCache for Redis service automatically manages life cycle of the certificates required for encryption, including the issuance, renewal and expiration of certificates. Additionally, as part of this launch, customers will gain the ability to start using the Redis AUTH command that provides an added level of authentication.

## __Amazon Pinpoint__
  - ### Features
    - Added support for APNs VoIP messages. Added support for collapsible IDs, message priority, and TTL for APNs and FCM/GCM.

# __1.11.219__ __2017-10-23__
## __AWS Organizations__
  - ### Features
    - This release supports integrating other AWS services with AWS Organizations through the use of an IAM service-linked role called AWSServiceRoleForOrganizations. Certain operations automatically create that role if it does not already exist.

# __1.11.218__ __2017-10-20__
## __Amazon EC2__
  - ### Features
    - Adding pagination support for DescribeSecurityGroups for EC2 Classic and VPC Security Groups

# __1.11.217__ __2017-10-19__
## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Added support for tracking cost allocation by adding, updating, removing, and listing the metadata tags of Amazon SQS queues.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager versioning support for Parameter Store. Also support for referencing parameter versions in SSM Documents.

# __1.11.216__ __2017-10-18__
## __Amazon Lightsail__
  - ### Features
    - This release adds support for Windows Server-based Lightsail instances. The GetInstanceAccessDetails API now returns the password of your Windows Server-based instance when using the default key pair. GetInstanceAccessDetails also returns a PasswordData object for Windows Server instances containing the ciphertext and keyPairName. The Blueprint data type now includes a list of platform values (LINUX_UNIX or WINDOWS). The Bundle data type now includes a list of SupportedPlatforms values (LINUX_UNIX or WINDOWS).

# __1.11.215__ __2017-10-17__
## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds support for VPC access to Amazon Elasticsearch Service.

# __1.11.214__ __2017-10-16__
## __AWS CloudHSM__
  - ### Features
    - Documentation updates for AWS CloudHSM Classic.

## __AWS WAF__
  - ### Features
    - This release adds support for regular expressions as match conditions in rules, and support for geographical location by country of request IP address as a match condition in rules.

## __AWS WAF Regional__
  - ### Features
    - This release adds support for regular expressions as match conditions in rules, and support for geographical location by country of request IP address as a match condition in rules.

## __Amazon EC2__
  - ### Features
    - You can now change the tenancy of your VPC from dedicated to default with a single API operation. For more details refer to the documentation for changing VPC tenancy.

## __Amazon Elasticsearch Service__
  - ### Features
    - AWS Elasticsearch adds support for enabling slow log publishing. Using slow log publishing options customers can configure and enable index/query slow log publishing of their domain to preferred AWS Cloudwatch log group.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Adds waiters for DBSnapshotAvailable and DBSnapshotDeleted.

# __1.11.213__ __2017-10-12__
## __AWS CodeCommit__
  - ### Features
    - This release includes the DeleteBranch API and a change to the contents of a Commit object.

## __AWS Database Migration Service__
  - ### Features
    - This change includes addition of new optional parameter to an existing API

## __AWS Elastic Beanstalk__
  - ### Features
    - Added the ability to add, delete or update Tags

## __Amazon Polly__
  - ### Features
    - Amazon Polly exposes two new voices: "Matthew" (US English) and "Takumi" (Japanese)

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - You can now call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB instance. You can use this information when you call ModifyDBInstance.

# __1.11.212__ __2017-10-11__
## __Amazon EC2 Container Registry__
  - ### Features
    - Adds support for new API set used to manage Amazon ECR repository lifecycle policies. Amazon ECR lifecycle policies enable you to specify the lifecycle management of images in a repository. The configuration is a set of one or more rules, where each rule defines an action for Amazon ECR to apply to an image. This allows the automation of cleaning up unused images, for example expiring images based on age or status. A lifecycle policy preview API is provided as well, which allows you to see the impact of a lifecycle policy on an image repository before you execute it

## __Amazon Simple Email Service__
  - ### Features
    - Added content related to email template management and templated email sending operations.

# __1.11.211__ __2017-10-10__
## __AWS OpsWorks for Chef Automate__
  - ### Features
    - Provide engine specific information for node associations.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed potential XXE injection security issue with XML parsers. See [OWASP XXE Cheat Sheet](https://www.owasp.org/index.php/XML_External_Entity_(XXE)_Prevention_Cheat_Sheet).

## __Amazon EC2__
  - ### Features
    - This release includes updates to AWS Virtual Private Gateway.

## __Elastic Load Balancing__
  - ### Features
    - Server Name Indication (SNI) is an extension to the TLS protocol by which a client indicates the hostname to connect to at the start of the TLS handshake. The load balancer can present multiple certificates through the same secure listener, which enables it to support multiple secure websites using a single secure listener. Application Load Balancers also support a smart certificate selection algorithm with SNI. If the hostname indicated by a client matches multiple certificates, the load balancer determines the best certificate to use based on multiple factors including the capabilities of the client.

# __1.11.210__ __2017-10-06__
## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Documentation updates regarding availability of FIFO queues and miscellaneous corrections.

# __1.11.209__ __2017-10-05__
## __Amazon Redshift__
  - ### Features
    - DescribeEventSubscriptions API supports tag keys and tag values as request parameters. 

# __1.11.208__ __2017-10-04__
## __AWS SDK for Java__
  - ### Bugfixes
    - Reverts a potential breaking change introduced in version 1.11.167 as a fix for https://github.com/aws/aws-sdk-java/issues/1226. This change removes the jackson annotations on enum getters and setters. Customers who rely on the annotations will see 'conflicting setter definitions for property' error during serialization and deserialization. They should either upgrade to Jackson 2.7+ or add custom MixIns for all classes (that contain enums) you want to serialize/deserialize.

## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics now supports schema discovery on objects in S3.  Additionally, Kinesis Analytics now supports input data preprocessing through Lambda.

## __Amazon Route 53 Domains__
  - ### Features
    - Added a new API that checks whether a domain name can be transferred to Amazon Route 53.

# __1.11.207__ __2017-10-03__
## __Amazon EC2__
  - ### Features
    - This release includes service updates to AWS VPN.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - EC2 Systems Manager support for tagging SSM Documents. Also support for tag-based permissions to restrict access to SSM Documents based on these tags.

# __1.11.206__ __2017-10-02__
## __AWS CloudHSM__
  - ### Features
    - Documentation updates for CloudHSM

# __1.11.205__ __2017-09-29__
## __AWS CodeBuild__
  - ### Features
    - Adding support for Building GitHub Pull Requests in AWS CodeBuild

## __AWS Organizations__
  - ### Features
    - This release flags the HandshakeParty structure's Type and Id fields as 'required'. They effectively were required in the past, as you received an error if you did not include them. This is now reflected at the API definition level. 

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1110. Calls to EC2MetadataUtils#getItems correctly handle potential nulls when the path does not exist.

## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing and accessing image builders, and deleting images.

## __Amazon Mechanical Turk Requester Service__
  - ### Features
    - Today, Amazon Mechanical Turk (MTurk) supports SQS Notifications being delivered to Customers' SQS queues when different stages of the MTurk workflow are complete.  We are going to create new functionality so that Customers can leverage SNS topics as a destination for notification messages when various stages of the MTurk workflow are complete. 

## __Amazon Route 53__
  - ### Features
    - This change allows customers to reset elements of health check.

## __Amazon S3__
  - ### Bugfixes
    - Allow the use of MD5 implementations that cannot be cloned when performing checksum validation on uploaded objects. The use of such implementations will now potentially fail on request retries instead of on the initial request attempt.

# __1.11.204__ __2017-09-27__
## __Amazon Pinpoint__
  - ### Features
    - Added two new push notification channels: Amazon Device Messaging (ADM) and, for push notification support in China, Baidu Cloud Push. Added support for APNs auth via .p8 key file. Added operation for direct message deliveries to user IDs, enabling you to message an individual user on multiple endpoints.

# __1.11.203__ __2017-09-26__
## __AWS Cloud Formation__
  - ### Features
    - You can now prevent a stack from being accidentally deleted by enabling termination protection on the stack. If you attempt to delete a stack with termination protection enabled, the deletion fails and the stack, including its status, remains unchanged. You can enable termination protection on a stack when you create it. Termination protection on stacks is disabled by default. After creation, you can set termination protection on a stack whose status is CREATE_COMPLETE, UPDATE_COMPLETE, or UPDATE_ROLLBACK_COMPLETE.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1243 by adding full list of reserved keywords to code generator.
    - Fixing issue https://github.com/aws/aws-sdk-java/issues/1262. When the SDK was being loaded by the bootstrap classloader, looking up global request handlers would throw an NPE.

# __1.11.202__ __2017-09-22__
## __AWS Config__
  - ### Features
    - AWS Config support for DynamoDB tables and Auto Scaling resource types

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS users can now add and drop Linux capabilities to their containers through the use of docker's cap-add and cap-drop features. Customers can specify the capabilities they wish to add or drop for each container in their task definition. 

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Documentation updates for rds

# __1.11.201__ __2017-09-21__
## __AWS Budgets__
  - ### Features
    - Including "DuplicateRecordException" in UpdateNotification and UpdateSubscriber. 

## __Amazon CloudWatch Logs__
  - ### Features
    - Adds support for associating LogGroups with KMS Keys.

## __Amazon EC2__
  - ### Features
    - Add EC2 APIs to copy Amazon FPGA Images (AFIs) within the same region and across multiple regions, delete AFIs, and modify AFI attributes. AFI attributes include name, description and granting/denying other AWS accounts to load the AFI.

## __Amazon S3__
  - ### Deprecations
    - Deprecating AmazonS3#doesBucketExist in favor of the newly introduced AmazonS3#doesBucketExistV2. The new method is more reliable when called with incorrect credentials. See https://github.com/aws/aws-sdk-java/issues/1256 for a full discussion.

# __1.11.200__ __2017-09-20__
## __AWS CodePipeline__
  - ### Features
    - This change includes a PipelineMetadata object that is part of the output from the GetPipeline API that includes the Pipeline ARN, created, and updated timestamp.

## __AWS Greengrass__
  - ### Features
    - Reset Deployments feature allows you to clean-up the cloud resource so you can delete the group. It also cleans up the core so that it goes back to the pre-deployment state.

## __Amazon AppStream__
  - ### Features
    - API updates for supporting On-Demand fleets.

## __Amazon Lex__
  - ### Features
    - Request attributes can be used to pass client specific information from the client to Amazon Lex as part of each request.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Introduces the --option-group-name parameter to the ModifyDBSnapshot CLI command. You can specify this parameter when you upgrade an Oracle DB snapshot. The same option group considerations apply when upgrading a DB snapshot as when upgrading a DB instance.  For more information, see http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Oracle.html#USER_UpgradeDBInstance.Oracle.OGPG.OG

# __1.11.199__ __2017-09-20__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing ElasticGpuSet from being set.

# __1.11.198__ __2017-09-18__
## __AWS Identity and Access Management (IAM)__
  - ### Features
    - A new API, DeleteServiceLinkedRole, submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to check the status of the deletion.

## __Amazon EC2__
  - ### Features
    - Amazon EC2 now lets you opt for Spot instances to be stopped in the event of an interruption instead of being terminated.  Your Spot request can be fulfilled again by restarting instances from a previously stopped state, subject to availability of capacity at or below your preferred price.  When you submit a persistent Spot request, you can choose from "terminate" or "stop" as the instance interruption behavior.  Choosing "stop" will shutdown your Spot instances so you can continue from this stopped state later on.  This feature is only available for instances with Amazon EBS volume as their root device.

## __Amazon Simple Email Service__
  - ### Features
    - Amazon Simple Email Service (Amazon SES) now lets you customize the domains used for tracking open and click events. Previously, open and click tracking links referred to destinations hosted on domains operated by Amazon SES. With this feature, you can use your own branded domains for capturing open and click events.

# __1.11.197__ __2017-09-15__
## __Amazon API Gateway__
  - ### Features
    - Add a new enum "REQUEST" to '--type <value>' field in the current create-authorizer API, and make "identitySource" optional.

# __1.11.196__ __2017-09-14__
## __AWS CodeBuild__
  - ### Features
    - Supporting Parameter Store in environment variables for AWS CodeBuild

## __AWS Organizations__
  - ### Features
    - Documentation updates for AWS Organizations

## __AWS Service Catalog__
  - ### Features
    - This release of Service Catalog adds API support to copy products.

# __1.11.195__ __2017-09-13__
## __AWS Batch__
  - ### Features
    - Documentation updates for batch

## __Amazon CloudWatch Events__
  - ### Features
    - Exposes ConcurrentModificationException as one of the valid exceptions for PutPermission and RemovePermission operation.

## __Amazon EC2__
  - ### Features
    - You are now able to create and launch EC2 x1e.32xlarge instance, a new EC2 instance in the X1 family, in us-east-1, us-west-2, eu-west-1, and ap-northeast-1. x1e.32xlarge offers 128 vCPUs, 3,904 GiB of DDR4 instance memory, high memory bandwidth, large L3 caches, and leading reliability capabilities to boost the performance and reliability of in-memory applications.

## __Auto Scaling__
  - ### Features
    - Customers can create Life Cycle Hooks at the time of creating Auto Scaling Groups through the CreateAutoScalingGroup API

# __1.11.194__ __2017-09-12__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing HostOfferingSet from being set

# __1.11.193__ __2017-09-11__
## __AWS Device Farm__
  - ### Features
    - DeviceFarm has added support for two features - RemoteDebugging and Customer Artifacts. Customers  can now do remote Debugging on their Private Devices and can now retrieve custom files generated by their tests on the device and the device host (execution environment) on both public and private devices. 

# __1.11.192__ __2017-09-08__
## __Amazon CloudWatch Logs__
  - ### Features
    - Adds support for the PutResourcePolicy, DescribeResourcePolicy and DeleteResourcePolicy APIs.

# __1.11.191__ __2017-09-07__
## __Amazon EC2__
  - ### Features
    - With Tagging support, you can add Key and Value metadata to search, filter and organize your NAT Gateways according to your organization's needs.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex provides the ability to export your Amazon Lex chatbot definition as a JSON file that can be added to the target platform. The JSON configuration file contains the structure of your Amazon Lex chatbot, including the intent schema with utterances, slots, prompts and slot-types.

## __Amazon Route 53__
  - ### Features
    - You can configure Amazon Route 53 to log information about the DNS queries that Amazon Route 53 receives for your domains and subdomains. When you configure query logging, Amazon Route 53 starts to send logs to CloudWatch Logs. You can use various tools, including the AWS console, to access the query logs.

## __Amazon S3__
  - ### Features
    - The metadata directive can now be explicitly specified for CopyObjectRequest. See https://github.com/aws/aws-sdk-java/issues/1283

## __Application Auto Scaling__
  - ### Features
    - Documentation updates for application-autoscaling

## __Elastic Load Balancing__
  - ### Features
    - The feature enables the new Network Load Balancer that is optimized to handle volatile traffic patterns while using a single static IP address per Availability Zone. Network Load Balancer operates at the connection level (Layer 4), routing connections to Amazon EC2 instances and containers, within Amazon Virtual Private Cloud (Amazon VPC) based on IP protocol data.

# __1.11.190__ __2017-09-06__
## __AWS Budgets__
  - ### Features
    - Add an optional "thresholdType" to notifications to support percentage or absolute value thresholds.

## __Amazon S3__
  - ### Bugfixes
    - Fixing https://github.com/aws/aws-sdk-java/issues/1256. doesBucketExist now throws an exception when credentials are invalid rather than always returning true.

# __1.11.189__ __2017-09-05__
## __AWS CodeStar__
  - ### Features
    - Added support to tag CodeStar projects. Tags can be used to organize and find CodeStar projects on key-value pairs that you can choose. For example, you could add a tag with a key of "Release" and a value of "Beta" to projects your organization is working on for an upcoming beta release.

# __1.11.188__ __2017-09-01__
## __AWS Mobile__
  - ### Features
    - AWS Mobile Hub is an integrated experience designed to help developers build, test, configure and release cloud-based applications for mobile devices using Amazon Web Services. AWS Mobile Hub provides a console and API for developers, allowing them to quickly select desired features and integrate them into mobile applications. Features include NoSQL Database, Cloud Logic, Messaging and Analytics. With AWS Mobile Hub, you pay only for the underlying services that Mobile Hub provisions based on the features you choose in the Mobile Hub console.

## __Amazon GameLift__
  - ### Features
    - GameLift VPC resources can be peered with any other AWS VPC. R4 memory-optimized instances now available to deploy.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding KMS encryption support to SSM Inventory Resource Data Sync. Exposes the ClientToken parameter on SSM StartAutomationExecution to provide idempotent execution requests.

# __1.11.187__ __2017-08-31__
## __AWS CodeBuild__
  - ### Features
    - The AWS CodeBuild HTTP API now provides the BatchDeleteBuilds operation, which enables you to delete existing builds.

## __Amazon EC2__
  - ### Features
    - Descriptions for Security Group Rules enables customers to be able to define a description for ingress and egress security group rules . The Descriptions for Security Group Rules feature supports one description field per Security Group rule for both ingress and egress rules . Descriptions for Security Group Rules provides a simple way to describe the purpose or function of a Security Group Rule allowing for easier customer identification of configuration elements .      Prior to the release of Descriptions for Security Group Rules , customers had to maintain a separate system outside of AWS if they wanted to track Security Group Rule mapping and their purpose for being implemented. If a security group rule has already been created and you would like to update or change your description for that security group rule you can use the UpdateSecurityGroupRuleDescription API.

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex now supports synonyms for slot type values. If the user inputs a synonym, it will be resolved to the corresponding slot value.

## __Elastic Load Balancing__
  - ### Features
    - This change now allows Application Load Balancers to distribute traffic to AWS resources using their IP addresses as targets in addition to the instance IDs. You can also load balance to resources outside the VPC hosting the load balancer using their IP addresses as targets. This includes resources in peered VPCs, EC2-Classic, and on-premises locations reachable over AWS Direct Connect or a VPN connection.

# __1.11.186__ __2017-08-30__
## __AWS Organizations__
  - ### Features
    - The exception ConstraintViolationException now contains a new reason subcode MASTERACCOUNT_MISSING_CONTACT_INFO to make it easier to understand why attempting to remove an account from an Organization can fail. We also improved several other of the text descriptions and examples.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports the DisableScaleIn option for Target Tracking Scaling Policies. This allows customers to create scaling policies that will only add capacity to the target.

# __1.11.185__ __2017-08-29__
## __AWS Config__
  - ### Features
    - Increased the internal size limit of resourceId

## __Amazon EC2__
  - ### Features
    - Provides capability to add secondary CIDR blocks to a VPC.

# __1.11.184__ __2017-08-25__
## __AWS Cloud Formation__
  - ### Features
    - Rollback triggers enable you to have AWS CloudFormation monitor the state of your application during stack creation and updating, and to roll back that operation if the application breaches the threshold of any of the alarms you've specified.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fixed bug in SigV4 signing for services that have different signing name and endpoint prefix when sending requests to non-standard endpoints like China region.

## __Amazon GameLift__
  - ### Features
    - Update spelling of MatchmakingTicket status values for internal consistency.

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Option group options now contain additional properties that identify requirements for certain options. Check these properties to determine if your DB instance must be in a VPC or have auto minor upgrade turned on before you can use an option. Check to see if you can downgrade the version of an option after you have installed it.

# __1.11.183__ __2017-08-24__
## __Amazon Rekognition__
  - ### Features
    - Update the enum value of LandmarkType and GenderType to be consistent with service response

# __1.11.182__ __2017-08-23__
## __Amazon AppStream__
  - ### Features
    - Documentation updates for appstream

# __1.11.181__ __2017-08-22__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to associations in Systems Manager State Manager can now be recorded. Previously, when you edited associations, you could not go back and review older association settings. Now, associations are versioned, and can be named using human-readable strings, allowing you to see a trail of association changes. You can also perform rate-based scheduling, which allows you to schedule associations more granularly.

# __1.11.180__ __2017-08-21__
## __AWS SDK for Java__
  - ### Bugfixes
    - Fixes a bug where the client time offset is not updated for clock skew errors when retries are disabled.

## __Amazon Kinesis Firehose__
  - ### Features
    - This change will allow customers to attach a Firehose delivery stream to an existing Kinesis stream directly. You no longer need a forwarder to move data from a Kinesis stream to a Firehose delivery stream. You can now run your streaming applications on your Kinesis stream and easily attach a Firehose delivery stream to it for data delivery to S3, Redshift, or Elasticsearch concurrently.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports CAA resource record type. A CAA record controls which certificate authorities are allowed to issue certificates for the domain or subdomain.

# __1.11.179__ __2017-08-16__
## __Amazon GameLift__
  - ### Features
    - The Matchmaking Grouping Service is a new feature that groups player match requests for a given game together into game sessions based on developer configured rules.

# __1.11.178__ __2017-08-15__
## __Amazon EC2__
  - ### Features
    - Fixed bug in EC2 clients preventing HostReservation from being set

# __1.11.177__ __2017-08-14__
## __AWS Batch__
  - ### Features
    - This release enhances the DescribeJobs API to include the CloudWatch logStreamName attribute in ContainerDetail and ContainerDetailAttempt

## __AWS CloudHSM V2__
  - ### Features
    - CloudHSM provides hardware security modules for protecting sensitive data and cryptographic keys within an EC2 VPC, and enable the customer to maintain control over key access and use. This is a second-generation of the service that will improve security, lower cost and provide better customer usability.

## __AWS Glue__
  - ### Features
    - AWS Glue is a fully managed extract, transform, and load (ETL) service that makes it easy for customers to prepare and load their data for analytics. You can create and run an ETL job with a few clicks in the AWS Management Console. You simply point AWS Glue to your data stored on AWS, and AWS Glue discovers your data and stores the associated metadata (e.g. table definition and schema) in the AWS Glue Data Catalog. Once cataloged, your data is immediately searchable, queryable, and available for ETL. AWS Glue generates the code to execute your data transformations and data loading processes. AWS Glue generates Python code that is entirely customizable, reusable, and portable. Once your ETL job is ready, you can schedule it to run on AWS Glue's fully managed, scale-out Spark environment. AWS Glue provides a flexible scheduler with dependency resolution, job monitoring, and alerting. AWS Glue is serverless, so there is no infrastructure to buy, set up, or manage. It automatically provisions the environment needed to complete the job, and customers pay only for the compute resources consumed while running ETL jobs. With AWS Glue, data can be available for analytics in minutes.

## __AWS Migration Hub__
  - ### Features
    - AWS Migration Hub provides a single location to track migrations across multiple AWS and partner solutions. Using Migration Hub allows you to choose the AWS and partner migration tools that best fit your needs, while providing visibility into the status of your entire migration portfolio. Migration Hub also provides key metrics and progress for individual applications, regardless of which tools are being used to migrate them. For example, you might use AWS Database Migration Service, AWS Server Migration Service, and partner migration tools to migrate an application comprised of a database, virtualized web servers, and a bare metal server. Using Migration Hub will provide you with a single screen that shows the migration progress of all the resources in the application. This allows you to quickly get progress updates across all of your migrations, easily identify and troubleshoot any issues, and reduce the overall time and effort spent on your migration projects. Migration Hub is available to all AWS customers at no additional charge. You only pay for the cost of the migration tools you use, and any resources being consumed on AWS. 

## __AWS Storage Gateway__
  - ### Features
    - Add optional field ForceDelete to DeleteFileShare api.

## __Amazon Elastic File System__
  - ### Features
    - Customers can create encrypted EFS file systems and specify a KMS master key to encrypt it with.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager Maintenance Windows include the following changes or enhancements: New task options using Systems Manager Automation, AWS Lambda, and AWS Step Functions; enhanced ability to edit the targets of a Maintenance Window, including specifying a target name and description, and ability to edit the owner field; enhanced ability to edits tasks; enhanced support for Run Command parameters; and you can now use a --safe flag when attempting to deregister a target. If this flag is enabled when you attempt to deregister a target, the system returns an error if the target is referenced by any task. Also, Systems Manager now includes Configuration Compliance to scan your fleet of managed instances for patch compliance and configuration inconsistencies. You can collect and aggregate data from multiple AWS accounts and Regions, and then drill down into specific resources that aren't compliant.

# __1.11.176__ __2017-08-11__
## __AWS CodeDeploy__
  - ### Features
    - Adds support for specifying Application Load Balancers in deployment groups, for both in-place and blue/green deployments.

## __Amazon Cognito Identity Provider__
  - ### Features
    - We have added support for features for Amazon Cognito User Pools that enable application developers to easily add and customize a sign-up and sign-in user experience, use OAuth 2.0, and integrate with Facebook, Google, Login with Amazon, and SAML-based identity providers.

## __Amazon EC2__
  - ### Features
    - Provides customers an opportunity to recover an EIP that was released

# __1.11.175__ __2017-08-10__
## __AWS CodeBuild__
  - ### Features
    - Supporting Bitbucket as source type in AWS CodeBuild.

## __Amazon CloudDirectory__
  - ### Features
    - Enable BatchDetachPolicy

# __1.11.174__ __2017-08-09__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Documentation updates for RDS.

# __1.11.173__ __2017-08-08__
## __AWS Elastic Beanstalk__
  - ### Features
    - Add support for paginating the result of DescribeEnvironments     Include the ARN of described environments in DescribeEnvironments output

# __1.11.172__ __2017-08-01__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy now supports the use of multiple tag groups in a single deployment group (an intersection of tags) to identify the instances for a deployment. When you create or update a deployment group, use the new ec2TagSet and onPremisesTagSet structures to specify up to three groups of tags. Only instances that are identified by at least one tag in each of the tag groups are included in the deployment group.

## __AWS Config__
  - ### Features
    - Added new API, GetDiscoveredResourceCounts, which returns the resource types, the number of each resource type, and the total number of resources that AWS Config is recording in the given region for your AWS account.

## __Amazon EC2__
  - ### Features
    - Ec2 SpotInstanceRequestFulfilled waiter update

## __Amazon Pinpoint__
  - ### Features
    - This release of the Pinpoint SDK enables App management - create, delete, update operations, Raw Content delivery for APNs and GCM campaign messages and From Address override.

## __Amazon Simple Email Service__
  - ### Features
    - This update adds information about publishing email open and click events. This update also adds information about publishing email events to Amazon Simple Notification Service (Amazon SNS).

## __Elastic Load Balancing__
  - ### Features
    - Add TargetInService and TargetDeregistered waiters 

# __1.11.171__ __2017-07-31__
## __Amazon Inspector__
  - ### Features
    - Inspector's StopAssessmentRun API has been updated with a new input option - stopAction. This request parameter can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default value, and the previous behavior) stops the AWS agent data collection and begins the results evaluation for findings generation based on the data collected so far. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds a SendAutomationSignal API to SSM Service. This API is used to send a signal to an automation execution to change the current behavior or status of the execution.

# __1.11.170__ __2017-07-27__
## __Amazon EC2__
  - ### Features
    - The CreateDefaultVPC API enables you to create a new default VPC . You no longer need to contact AWS support, if your default VPC has been deleted.

## __Amazon Kinesis Analytics__
  - ### Features
    - Added additional exception types and clarified documentation.

# __1.11.169__ __2017-07-26__
## __Amazon CloudWatch__
  - ### Features
    - This release adds high resolution features to CloudWatch, with support for Custom Metrics down to 1 second and Alarms down to 10 seconds.

## __Amazon EC2__
  - ### Features
    - Amazon EC2 Elastic GPUs allow you to easily attach low-cost graphics acceleration to current generation EC2 instances. With Amazon EC2 Elastic GPUs, you can configure the right amount of graphics acceleration to your particular workload without being constrained by fixed hardware configurations and limited GPU selection.

# __1.11.168__ __2017-07-25__
## __AWS Cloud Formation__
  - ### Features
    - AWS CloudFormation StackSets enables you to manage stacks across multiple accounts and regions.

## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory adds support for additional batch operations.

# __1.11.167__ __2017-07-24__
## __Amazon AppStream__
  - ### Features
    - Amazon AppStream 2.0 image builders and fleets can now access applications and network resources that rely on Microsoft Active Directory (AD) for authentication and permissions. This new feature allows you to join your streaming instances to your AD, so you can use your existing AD user management tools. 

## __Amazon EC2__
  - ### Features
    - Spot Fleet tagging capability allows customers to automatically tag instances launched by Spot Fleet. You can use this feature to label or distinguish instances created by distinct Spot Fleets. Tagging your EC2 instances also enables you to see instance cost allocation by tag in your AWS bill.

## __Amazon Kinesis__
  - ### Bugfixes
    - **Breaking change** to remove an overload of Record#setEncryptionType that takes an enum due to serialization issues with AWS Lambda. See [Issue #1226](https://github.com/aws/aws-sdk-java/issues/1226) for more details.

# __1.11.166__ __2017-07-20__
## __Amazon Elastic MapReduce__
  - ### Features
    - Amazon EMR now includes the ability to use a custom Amazon Linux AMI and adjustable root volume size when launching a cluster.

# __1.11.165__ __2017-07-19__
## __AWS Budgets__
  - ### Features
    - Update budget Management API's to list/create/update RI_UTILIZATION type budget. Update budget Management API's to support DAILY timeUnit for RI_UTILIZATION type budget.

# __1.11.164__ __2017-07-17__
## __AWS Lambda__
  - ### Features
    - Lambda@Edge lets you run code closer to your end users without provisioning or managing servers. With Lambda@Edge, your code runs in AWS edge locations, allowing you to respond to your end users at the lowest latency. Your code is triggered by Amazon CloudFront events, such as requests to and from origin servers and viewers, and it is ready to execute at every AWS edge location whenever a request for content is received. You just upload your Node.js code to AWS Lambda and Lambda takes care of everything required to run and scale your code with high availability. You only pay for the compute time you consume - there is no charge when your code is not running.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Allows developers to configure user pools for email/phone based signup and sign-in.

# __1.11.163__ __2017-07-14__
## __AWS Application Discovery Service__
  - ### Features
    - Adding feature to the Export API for Discovery Service to allow filters for the export task to allow export based on per agent id.

## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Update to Documentation Model For New Report Cadence / Reformat of Docs

## __Amazon EC2__
  - ### Features
    - New EC2 GPU Graphics instance

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where a warning about unread data in the `S3ObjectInputStream` is still logged when `close()` is called, even after the stream has been aborted.

      Fixes [#1211](https://github.com/aws/aws-sdk-java/issues/1211)

# __1.11.162__ __2017-07-13__
## __Amazon API Gateway__
  - ### Features
    - Adds support for management of gateway responses.

## __Amazon EC2__
  - ### Features
    - X-ENI (or Cross-Account ENI) is a new feature that allows the attachment or association of Elastic Network Interfaces (ENI) between VPCs in different AWS accounts located in the same availability zone. With this new capability, service providers and partners can deliver managed solutions in a variety of new architectural patterns where the provider and consumer of the service are in different AWS accounts.

## __Amazon Lex Model Building Service__
  - ### Features
    - Fixed broken links to reference and conceptual content.

# __1.11.161__ __2017-07-12__
## __AWS Security Token Service__
  - ### Features
    - Added the ability to close `STSAssumeRoleSessionCredentialProvider`s and `STSSessionCredentialProvider`s in order to immediately release the thread used for asynchronous credential refreshes.

  - ### Bugfixes
    - Fixed thread and memory leak triggered by creating a large number of `STSAssumeRoleSessionCredentialProvider`s and `STSSessionCredentialProvider`s.

## __Amazon Simple Workflow Service (SWF)__
  - ### Features
    - Added support for attaching control data to Lambda tasks. Control data lets you attach arbitrary strings to your decisions and history events.

## __Auto Scaling__
  - ### Features
    - Auto Scaling now supports a new type of scaling policy called target tracking scaling policies that you can use to set up dynamic scaling for your application.

# __1.11.160__ __2017-07-06__
## __AWS Directory Service__
  - ### Features
    - You can now improve the resilience and performance of your Microsoft AD directory by deploying additional domain controllers. Added UpdateNumberofDomainControllers API that allows you to update the number of domain controllers you want for your directory, and DescribeDomainControllers API that allows you to describe the detailed information of each domain controller of your directory. Also added the 'DesiredNumberOfDomainControllers' field to the DescribeDirectories API output for Microsoft AD.

## __AWS Key Management Service (KMS)__
  - ### Features
    - This release of AWS Key Management Service introduces the ability to determine whether a key is AWS managed or customer managed.

## __Amazon Kinesis__
  - ### Features
    - You can now encrypt your data at rest within an Amazon Kinesis Stream using server-side encryption. Server-side encryption via AWS KMS makes it easy for customers to meet strict data management requirements by encrypting their data at rest within the Amazon Kinesis Streams, a fully managed real-time data processing service.

## __Amazon S3__
  - ### Features
    - Allow requester-pays access for list-objects requests.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Amazon EC2 Systems Manager now expands Patching support to Amazon Linux, Red Hat and Ubuntu in addition to the already supported Windows Server.

# __1.11.159__ __2017-07-05__
## __Amazon CloudWatch__
  - ### Features
    - We are excited to announce the availability of APIs and CloudFormation support for CloudWatch Dashboards. You can use the new dashboard APIs or CloudFormation templates to dynamically build and maintain dashboards to monitor your infrastructure and applications. There are four new dashboard APIs - PutDashboard, GetDashboard, DeleteDashboards, and ListDashboards APIs. PutDashboard is used to create a new dashboard or modify an existing one whereas GetDashboard is the API to get the details of a specific dashboard. ListDashboards and DeleteDashboards are used to get the names or delete multiple dashboards respectively. Getting started with dashboard APIs is similar to any other AWS APIs. The APIs can be accessed through AWS SDK or through CLI tools.

## __Amazon Route 53__
  - ### Features
    - Bug fix for InvalidChangeBatch exception.

# __1.11.158__ __2017-06-30__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - Documentation updates for AWS Marketplace Commerce Analytics.

## __Amazon S3__
  - ### Features
    - Adding Object Tagging Header to MultipartUpload Initialization

# __1.11.157__ __2017-06-29__
## __Amazon CloudWatch Events__
  - ### Features
    - CloudWatch Events now allows different AWS accounts to share events with each other through a new resource called event bus. Event buses accept events from AWS services, other AWS accounts and PutEvents API calls. Currently all AWS accounts have one default event bus. To send events to another account, customers simply write rules to match the events of interest and attach an event bus in the receiving account as the target to the rule. The PutTargets API has been updated to allow adding cross account event buses as targets. In addition, we have released two new APIs - PutPermission and RemovePermission - that enables customers to add/remove permissions to their default event bus.

## __Amazon GameLift__
  - ### Features
    - Allow developers to download GameLift fleet creation logs to assist with debugging.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding Resource Data Sync support to SSM Inventory.<br/>New APIs:<br/>CreateResourceDataSync - creates a new resource data sync configuration<br/>ListResourceDataSync - lists existing resource data sync configurations<br/>DeleteResourceDataSync - deletes an existing resource data sync configuration.

# __1.11.156__ __2017-06-27__
## __AWS Service Catalog__
  - ### Features
    - Proper tagging of resources is critical to post-launch operations such as billing, cost allocation, and resource management. By using Service Catalog's TagOption Library, administrators can define a library of re-usable TagOptions that conform to company standards, and associate these with Service Catalog portfolios and products. Learn how to move your current tags to the new library, create new TagOptions, and view and associate your library items with portfolios and products. Understand how to ensure that the right tags are created on products launched through Service Catalog and how to provide users with defined selectable tags.

# __1.11.155__ __2017-06-23__
## __AWS Lambda__
  - ### Features
    - The Lambda Invoke API will now throw new exception InvalidRuntimeException (status code 502) for invokes with deprecated runtimes.

# __1.11.154__ __2017-06-22__
## __AWS CodePipeline__
  - ### Features
    - A new API, ListPipelineExecutions, enables you to retrieve summary information about the most recent executions in a pipeline, including pipeline execution ID, status, start time, and last updated time. You can request information for a maximum of 100 executions. Pipeline execution data is available for the most recent 12 months of activity.

## __AWS Database Migration Service__
  - ### Features
    - Added tagging for DMS certificates.

## __Amazon Lightsail__
  - ### Features
    - This release adds a new nextPageToken property to the result of the GetOperationsForResource API. Developers can now get the next set of items in a list by making subsequent calls to GetOperationsForResource API with the token from the previous call. This release also deprecates the nextPageCount property, which previously returned null (use the nextPageToken property instead). This release also deprecates the customImageName property on the CreateInstancesRequest class, which was previously ignored by the API.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports multivalue answers in response to DNS queries, which lets you route traffic approximately randomly to multiple resources, such as web servers. Create one multivalue answer record for each resource and, optionally, associate an Amazon Route 53 health check with each record, and Amazon Route 53 responds to DNS queries with up to eight healthy records.

## __Elastic Load Balancing__
  - ### Features
    - Add retry error state to InstanceInService waiter for ElasticLoadBalancer

# __1.11.153__ __2017-06-21__
## __AWS WAF__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __AWS WAF Regional__
  - ### Features
    - You can now create, edit, update, and delete a new type of WAF rule with a rate tracking component.

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Amazon DynamoDB Accelerator (DAX) is a fully managed, highly available, in-memory cache for DynamoDB that delivers up to a 10x performance improvement - from milliseconds to microseconds - even at millions of requests per second. DAX does all the heavy lifting required to add in-memory acceleration to your DynamoDB tables, without requiring developers to manage cache invalidation, data population, or cluster management.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding hierarchy support to the SSM Parameter Store API. Added support tor tagging. New APIs: GetParameter - retrieves one parameter, DeleteParameters - deletes multiple parameters (max number 10), GetParametersByPath - retrieves parameters located in the hierarchy. Updated APIs: PutParameter - added ability to enforce parameter value by applying regex (AllowedPattern), DescribeParameters - modified to support Tag filtering.

# __1.11.152__ __2017-06-20__
## __Amazon WorkDocs__
  - ### Features
    - This release provides a new API to retrieve the activities performed by WorkDocs users.

# __1.11.151__ __2017-06-19__
## __AWS Organizations__
  - ### Features
    - Improvements to Exception Modeling

# __1.11.150__ __2017-06-16__
## __AWS X-Ray__
  - ### Features
    - Add a response time histogram to the services in response of GetServiceGraph API.

# __1.11.149__ __2017-06-15__
## __AWS IoT__
  - ### Features
    - Revert the last release: remove CertificatePem from DescribeCertificate API.

## __AWS Service Catalog__
  - ### Features
    - Added ProvisioningArtifactSummaries to DescribeProductAsAdmin's output to show the provisioning artifacts belong to the product. Allow filtering by SourceProductId in SearchProductsAsAdmin for AWS Marketplace products. Added a verbose option to DescribeProvisioningArtifact to display the CloudFormation template used to create the provisioning artifact.Added DescribeProvisionedProduct API. Changed the type of ProvisionedProduct's Status to be distinct from Record's Status. New ProvisionedProduct's Status are AVAILABLE, UNDER_CHANGE, TAINTED, ERROR. Changed Record's Status set of values to CREATED, IN_PROGRESS, IN_PROGRESS_IN_ERROR, SUCCEEDED, FAILED.

## __Amazon EC2__
  - ### Features
    - Adds API to describe Amazon FPGA Images (AFIs) available to customers, which includes public AFIs, private AFIs that you own, and AFIs owned by other AWS accounts for which you have load permissions.

## __Amazon EC2 Container Service__
  - ### Features
    - Added support for cpu, memory, and memory reservation container overrides on the RunTask and StartTask APIs.

# __1.11.148__ __2017-06-14__
## __Amazon CloudDirectory__
  - ### Features
    - Documentation update for Cloud Directory

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling now supports automatic scaling of read and write throughput capacity for DynamoDB tables and global secondary indexes.

# __1.11.147__ __2017-06-13__
## __AWS Config__
  - ### Features
    - With this release AWS Config supports the Amazon CloudWatch alarm resource type.

# __1.11.146__ __2017-06-12__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - API Update for RDS: this update enables copy-on-write, a new Aurora MySQL Compatible Edition feature that allows users to restore their database, and support copy of TDE enabled snapshot cross region.

# __1.11.145__ __2017-06-09__
## __AWS OpsWorks__
  - ### Features
    - Tagging Support for AWS OpsWorks Stacks

# __1.11.144__ __2017-06-08__
## __AWS IoT__
  - ### Features
    - In addition to using certificate ID, AWS IoT customers can now obtain the description of a certificate with the certificate PEM.

## __Amazon Pinpoint__
  - ### Features
    - Starting today Amazon Pinpoint adds SMS Text and Email Messaging support in addition to Mobile Push Notifications, providing developers, product managers and marketers with multi-channel messaging capabilities to drive user engagement in their applications. Pinpoint also enables backend services and applications to message users directly and provides advanced user and app analytics to understand user behavior and messaging performance.

## __Amazon Rekognition__
  - ### Features
    - API Update for AmazonRekognition: Adding RecognizeCelebrities API

# __1.11.143__ __2017-06-07__
## __AWS CodeBuild__
  - ### Features
    - Add support to APIs for privileged containers. This change would allow performing privileged operations like starting the Docker daemon inside builds possible in custom docker images.

## __AWS Greengrass__
  - ### Features
    - AWS Greengrass is software that lets you run local compute, messaging, and device state synchronization for connected devices in a secure way. With AWS Greengrass, connected devices can run AWS Lambda functions, keep device data in sync, and communicate with other devices securely even when not connected to the Internet. Using AWS Lambda, Greengrass ensures your IoT devices can respond quickly to local events, operate with intermittent connections, and minimize the cost of transmitting IoT data to the cloud.

# __1.11.142__ __2017-06-06__
## __AWS Certificate Manager__
  - ### Features
    - Documentation update for AWS Certificate Manager.

## __AWS IoT__
  - ### Features
    - Update client side validation for SalesForce action.

## __Amazon CloudFront__
  - ### Features
    - Doc update to fix incorrect prefix in S3OriginConfig

# __1.11.141__ __2017-06-05__
## __AWS IoT__
  - ### Features
    -  Added Salesforce action to IoT Rules Engine.

## __Amazon AppStream__
  - ### Features
    - AppStream 2.0 Custom Security Groups allows you to easily control what network resources your streaming instances and images have access to. You can assign up to 5 security groups per Fleet to control the inbound and outbound network access to your streaming instances to specific IP ranges, network protocols, or ports.

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug where a bucket's region is not marshalled from a 301 error response if it includes a body. Fixes [#1151](https://github.com/aws/aws-sdk-java/issues/1151).

## __Auto Scaling__
  - ### Features
    - Autoscaling resource model update.

# __1.11.140__ __2017-06-02__
## __Amazon Kinesis Analytics__
  - ### Features
    - Kinesis Analytics publishes error messages CloudWatch logs in case of application misconfigurations

## __Amazon S3__
  - ### Bugfixes
    - Fixes bug where TransferManager#download fails when requesterPays is enabled on GetObjectRequest. https://github.com/aws/aws-sdk-java/issues/1175

## __Amazon WorkDocs__
  - ### Features
    - This release includes new APIs to manage tags and custom metadata on resources and also new APIs to add and retrieve comments at the document level.

# __1.11.139__ __2017-06-01__
## __AWS CodeDeploy__
  - ### Features
    - AWS CodeDeploy has improved how it manages connections to GitHub accounts and repositories. You can now create and store up to 25 connections to GitHub accounts in order to associate AWS CodeDeploy applications with GitHub repositories. Each connection can support multiple repositories. You can create connections to up to 25 different GitHub accounts, or create more than one connection to a single account. The ListGitHubAccountTokenNames command has been introduced to retrieve the names of stored connections to GitHub accounts that you have created. The name of the connection to GitHub used for an AWS CodeDeploy application is also included in the ApplicationInfo structure.  Two new fields, lastAttemptedDeployment and lastSuccessfulDeployment, have been added to DeploymentGroupInfo to improve the handling of deployment group information in the AWS CodeDeploy console. Information about these latest deployments can also be retrieved using the GetDeploymentGroup and BatchGetDeployment group requests. Also includes a region update  (us-gov-west-1).

## __Amazon Cognito Identity Provider__
  - ### Features
    - Added support within Amazon Cognito User Pools for 1) a customizable hosted UI for user sign up and sign in and 2) integration of external identity providers.

## __Amazon Lex Model Building Service__
  - ### Features
    - Updated documentation and added examples for Amazon Lex Model Building Service.

## __Elastic Load Balancing__
  - ### Features
    - Update the existing DescribeRules API to support pagination.

# __1.11.138__ __2017-05-31__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - Amazon RDS customers can now easily and quickly stop and start their DB instances.

# __1.11.137__ __2017-05-30__
## __Amazon CloudDirectory__
  - ### Features
    - Cloud Directory has launched support for Typed Links, enabling customers to create object-to-object relationships that are not hierarchical in nature. Typed Links enable customers to quickly query for data along these relationships. Customers can also enforce referential integrity using Typed Links, ensuring data in use is not inadvertently deleted.

# __1.11.136__ __2017-05-25__
## __Amazon AppStream__
  - ### Features
    - Support added for persistent user storage, backed by S3.

## __Amazon Rekognition__
  - ### Features
    - Updated the CompareFaces API response to include orientation information, unmatched faces, landmarks, pose, and quality of the compared faces.

# __1.11.135__ __2017-05-24__
## __AWS Identity and Access Management (IAM)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128

## __AWS Security Token Service (STS)__
  - ### Features
    - The unique ID and access key lengths were extended from 32 to 128.

## __AWS Storage Gateway__
  - ### Features
    - Two Storage Gateway data types, Tape and TapeArchive, each have a new response element, TapeUsedInBytes. This element helps you manage your virtual tapes. By using TapeUsedInBytes, you can see the amount of data written to each virtual tape.

# __1.11.134__ __2017-05-23__
## __AWS Database Migration Service__
  - ### Features
    - This release adds support for using Amazon S3 and Amazon DynamoDB as targets for database migration, and using MongoDB as a source for database migration. For more information, see the AWS Database Migration Service documentation.

# __1.11.133__ __2017-05-22__
## __AWS Resource Groups Tagging API__
  - ### Features
    - You can now specify the number of resources returned per page in GetResources operation, as an optional parameter, to easily manage the list of resources returned by your queries.

# __1.11.132__ __2017-05-18__
## __Amazon Athena__
  - ### Features
    - This release adds support for Amazon Athena. Amazon Athena is an interactive query service that makes it easy to analyze data in Amazon S3 using standard SQL. Athena is serverless, so there is no infrastructure to manage, and you pay only for the queries that you run.

## __Amazon Lightsail__
  - ### Features
    - This release adds new APIs that make it easier to set network port configurations on Lightsail instances. Developers can now make a single request to both open and close public ports on an instance using the PutInstancePublicPorts operation.

# __1.11.131__ __2017-05-17__
## __Amazon CloudWatch Events__
  - ### Features
    - Various CloudWatch Events documentation updates.

## __Amazon CloudWatch Logs__
  - ### Features
    - Various CloudWatch Logs documentation updates.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new German voice "Vicki"

## __Auto Scaling__
  - ### Features
    - Various Auto Scaling documentation updates

# __1.11.130__ __2017-05-16__
## __AWS CodeDeploy__
  - ### Features
    - This release introduces the previousRevision field in the responses to the GetDeployment and BatchGetDeployments actions. previousRevision provides information about the application revision that was deployed to the deployment group before the most recent successful deployment.  Also, the fileExistsBehavior parameter has been added for CreateDeployment action requests. In the past, if the AWS CodeDeploy agent detected files in a target location that weren't part of the application revision from the most recent successful deployment, it would fail the current deployment by default. This new parameter provides options for how the agent handles these files: fail the deployment, retain the content, or overwrite the content.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Update documentation for KMS.

## __AWS Step Functions__
  - ### Bugfixes
    - Fixes [Issue 1150]( https://github.com/aws/aws-sdk-java/issues/1150) by preserving explicit null values for InputPath, OutputPath, and ResultPath.

## __Amazon GameLift__
  - ### Features
    - Allow developers to specify how metrics are grouped in CloudWatch for their GameLift fleets. Developers can also specify how many concurrent game sessions activate on a per-instance basis.

## __Amazon Inspector__
  - ### Features
    - Adds ability to produce an assessment report that includes detailed and comprehensive results of a specified assessment run.

## __Amazon S3__
  - ### Bugfixes
    - All API methods in AmazonS3Client now call beforeClientExecution in the RequestHandler2 interface.

# __1.11.129__ __2017-05-15__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - UpdateAssociation API now supports updating document name and targets of an association. GetAutomationExecution API can return FailureDetails as an optional field to the StepExecution Object, which contains failure type, failure stage as well as other failure related information for a failed step.

# __1.11.128__ __2017-05-11__
## __AWS Organizations__
  - ### Features
    - AWS Organizations APIs that return an Account object now include the email address associated with the account's root user.

## __Amazon Lex Model Building Service__
  - ### Features
    - Releasing new DeleteBotVersion, DeleteIntentVersion and DeleteSlotTypeVersion APIs.

## __Elastic Load Balancing__
  - ### Features
    - Add a new API to allow customers to describe their account limits, such as load balancer limit, target group limit etc.

# __1.11.127__ __2017-05-09__
## __AWS SDK for Java__
  - ### Features
    - This change includes documentation updates for Amazon Workspaces and AWS CodeStar

# __1.11.126__ __2017-05-04__
## __AWS Lambda__
  - ### Features
    - Support for UpdateFunctionCode DryRun option

## __AWS Marketplace Entitlement Service__
  - ### Features
    - AWS Marketplace Entitlement Service enables AWS Marketplace sellers to determine the capacity purchased by their customers.

## __AWS Organizations__
  - ### Bugfixes
    - Updated model classes to match AWS Organizations API [specification](http://docs.aws.amazon.com/organizations/latest/APIReference/Welcome.html). This includes the following updates to the model objects:

      #### Renamed Operation
      * `AWSOrganizations.enableFullControl` renamed to `AWSOrganizations.enableAllFeatures`
        * Previously this operation would never have completed successfully.

      #### Operation Exceptions Changed
      * `AWSOrganizations.acceptHandshake`
         * Exceptions Removed:
            * `AlreadyInOrganizationException` 
            * `ConstraintViolationException`
            * `OrganizationFromDifferentSellerOfRecordException`
         * Exceptions Added:
            * `HandshakeConstraintViolationException` (new to model)
            * `HandshakeAlreadyInStateException` (new to model)
            * `ConcurrentModificationException`
      * `AWSOrganizations.cancelHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.declineHandshake`
         * Exception Added:
            * `HandshakeAlreadyInStateException` (new to model)
      * `AWSOrganizations.createOrganization`
         * Exception Removed:
            * `PaymentInstrumentRequiredException` 
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.createPolicy`
         * Exception Added:
            * `MalformedPolicyDocumentException`
      * `AWSOrganizations.moveAccount`
         * Exception Added:
            * `DuplicateAccountException`
      * `AWSOrganizations.inviteAccountToOrganization`
         * Exceptions Removed:
            * `ConstraintViolationException`
            * `InvitationsDisabledDuringOrganizationModeChangeException`
         * Exception Added:
            * `HandshakeConstraintViolationException`
      * `AWSOrganizations.leaveOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.removeAccountFromOrganization`
         * Exception Removed:
            * `AccountCannotLeaveOrganizationException`
         * Exception Added:
            * `ConstraintViolationException`
      * `AWSOrganizations.updatePolicy`
         * Exception Added:
            * `ConstraintViolationException`

      #### Deprecated Exceptions
      The following exceptions are no longer in use and have been deprecated:
      * `AccountCannotLeaveOrganizationException`
      * `FullControlAlreadyEnabledException`
      * `PaymentInstrumentRequiredException`
      * `OrganizationFromDifferentSellerOfRecordException`
      * `InvitationsDisabledDuringOrganizationModeChangeException`

      #### Model Changes
      * `mode` property on `Organization` object renamed to `featureSet`
      * `mode` property on `CreateOrganizationRequest` object renamed to `featureSet`
      * Enum `ActionType` values renamed:
        * `ENABLE_FULL_CONTROL` renamed to `ENABLE_ALL_FEATURES`
        * `APPROVE_FULL_CONTROL` renamed to `APPROVE_ALL_FEATURES`
      * Enum `OrganizationMode` removed

## __Amazon EC2 Container Service__
  - ### Features
    - Exposes container instance registration time in ECS:DescribeContainerInstances.

## __Amazon Relational Database Service (RDS)__
  - ### Bugfixes
    - Fixed the DBInstanceAvailable waiter. Previously it would always throw a NullPointerException.

## __Amazon S3__
  - ### Features
    - Added the ability to specify a filter to `TransferManager`'s `downloadDirectory` operation.

  - ### Bugfixes
    - Fixed possible security issue in `TransferManager`s `downloadDirectory` operation where files could be downloaded to a directory outside the destination directory if the key contained relative paths.

# __1.11.125__ __2017-04-28__
## __AWS Cloud Formation__
  - ### Features
    - API update for CloudFormation: New optional parameter ClientRequestToken which can be used as an idempotency token to safely retry certain operations as well as tagging StackEvents.

## __Amazon Import/Export Snowball__
  - ### Features
    - The Snowball API has a new exception that can be thrown for list operation requests.

## __Amazon Rekognition__
  - ### Features
    - Fix for missing file type check

## __Amazon Relational Database Service (RDS)__
  - ### Features
    - The DescribeDBClusterSnapshots API now returns a SourceDBClusterSnapshotArn field which identifies the source DB cluster snapshot of a copied snapshot.

## __Amazon Simple Queue Service (SQS)__
  - ### Features
    - Adding server-side encryption (SSE) support to SQS by integrating with AWS KMS; adding new queue attributes to SQS CreateQueue, SetQueueAttributes and GetQueueAttributes APIs to support SSE.

# __1.11.124__ __2017-04-26__
## __Amazon Relational Database Service (RDS)__
  - ### Features
    - With Amazon Relational Database Service (Amazon RDS) running MySQL or Amazon Aurora, you can now authenticate to your DB instance using IAM database authentication.

# __1.11.123__ __2017-04-21__
## __AWS SDK for Java__
  - ### Features
    - Added the ability to override the proxy authentication methods used for requests.

## __Amazon AppStream__
  - ### Features
    - The new feature named "Default Internet Access" will enable Internet access from AppStream 2.0 instances - image builders and fleet instances. Admins will check a flag either through AWS management console for AppStream 2.0 or through API while creating an image builder or while creating/updating a fleet.

## __Amazon Kinesis__
  - ### Features
    - Adds a new waiter, StreamNotExists, to Kinesis.

## __Amazon S3__
  - ### Bugfixes
    - Fix bug to make standard AmazonS3ClientBuilder use S3CredentialsProviderChain instead of DefaultAWSCredentialsProviderChain.

# __1.11.122__ __2017-04-20__
## __AWS Device Farm__
  - ### Features
    - API Update for AWS Device Farm: Support for Deals and Promotions 

## __AWS Direct Connect__
  - ### Features
    - Documentation updates for AWS Direct Connect.

## __AWS Key Management Service (KMS)__
  - ### Features
    - Doc-only update for Key Management Service (KMS): Update docs for GrantConstraints and GenerateRandom

## __Amazon Route 53__
  - ### Features
    - SDK documentation now includes examples for ChangeResourceRecordSets for all types of resource record set, such as weighted, alias, and failover.

## __Amazon Route 53 Domains__
  - ### Features
    - Adding examples and other documentation updates.

## __Elastic Load Balancing__
  - ### Features
    - Adding LoadBalancersDeleted waiter for Elasticloadbalancingv2

# __1.11.121__ __2017-04-19__
## __AWS CodeStar__
  - ### Features
    - AWS CodeStar is a cloud-based service for creating, managing, and working with software development projects on AWS. An AWS CodeStar project creates and integrates AWS services for your project development toolchain. AWS CodeStar also manages the permissions required for project users.

## __AWS Identity and Access Management (IAM)__
  - ### Features
    - This changes introduces a new IAM role type, Service Linked Role, which works like a normal role but must be managed via services' control. 

## __AWS Lambda__
  - ### Features
    - Lambda integration with AWS X-Ray service to enable customers to enable tracing for the Lambda functions and send trace information to the AWS X-Ray service.

## __Amazon API Gateway__
  - ### Features
    - Add support for "embed" property.

## __Amazon EC2__
  - ### Features
    - Adds support for creating an Amazon FPGA Image (AFI) from a specified design checkpoint (DCP).

## __Amazon Lex Model Building Service__
  - ### Features
    - Amazon Lex is a service for building conversational interfaces into any application using voice and text.

## __Amazon Polly__
  - ### Features
    - API Update for Amazon Polly: Add support for speech marks

## __Amazon Rekognition__
  - ### Features
    - Given an image, the API detects explicit or suggestive adult content in the image and returns a list of corresponding labels with confidence scores, as well as a taxonomy (parent-child relation) for each label.

# __1.11.120__ __2017-04-18__
## __AWS Lambda__
  - ### Features
    - You can use tags to group and filter your Lambda functions, making it easier to analyze them for billing allocation purposes. For more information, see Tagging Lambda Functions.  You can now write or upgrade your Lambda functions using Python version 3.6. For more information, see Programming Model for Authoring Lambda Functions in Python. Note: Features will be rolled out in the US regions on 4/19.

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

