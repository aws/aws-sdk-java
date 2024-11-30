# __1.12.778__ __2024-11-13__
## __Amazon Kinesis Video Streams__
  - ### Features
    - Update Netty version to `4.1.115.Final`

# __1.12.774__ __2024-10-16__
## __Amazon Simple Storage Service__
  - ### Features
    - Add support for the new optional bucket-region and prefix query parameters in the ListBuckets API. For ListBuckets requests that express pagination, Amazon S3 will now return both the bucket names and associated AWS regions in the response.

# __1.12.771__ __2024-09-04__
## __AWS SDK for Java__
  - ### Features
    - Generate and use AWS-account-based endpoints for DynamoDB requests when the account ID is available. The new endpoint URL pattern will be `https://<account-id>.ddb.<region>.amazonaws.com`. See the documentation for details: https://docs.aws.amazon.com/sdkref/latest/guide/feature-account-endpoints.html

## __Amazon DynamoDB__
  - ### Features
    - Add handler to generate the account endpoint for a request

# __1.12.770__ __2024-08-20__
## __Amazon Simple Storage Service__
  - ### Features
    - Amazon Simple Storage Service / Features : Add support for conditional writes for PutObject and CompleteMultipartUpload APIs.

# __1.12.769__ __2024-08-15__
## __Amazon Simple Storage Service__
  - ### Features
    - Amazon Simple Storage Service / Features  : Adds support for pagination in the S3 ListBuckets API.

# __1.12.768__ __2024-08-14__
## __AWS SDK for Java__
  - ### Features
    - Update Java baseline version to Java 8 and bump Jackson library to 2.17.2

# __1.12.767__ __2024-07-30__
## __AWS CodePipeline__
  - ### Features
    - AWS CodePipeline V2 type pipelines now support stage level conditions to enable development teams to safely release changes that meet quality and compliance requirements.

## __AWS SDK for Java__
  - ### Deprecations
    - The AWS SDK for Java 1.x is now in maintenance mode, and will no longer receive updates for new or existing services, and will not be updated to support new regions. The 1.x SDK will continue to receive critical bug fixes and security updates until December 31, 2025. For more information, see https://aws.amazon.com/blogs/developer/the-aws-sdk-for-java-1-x-is-in-maintenance-mode-effective-july-31-2024/

## __AWS Telco Network Builder__
  - ### Features
    - This release adds Network Service Update, through which customers will be able to update their instantiated networks to a new network package. See the documentation for limitations. The release also enhances the Get network operation API to return parameter overrides used during the operation.

## __Amazon AppStream__
  - ### Features
    - Added support for Red Hat Enterprise Linux 8 on Amazon AppStream 2.0

## __Amazon CloudWatch Logs__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for changes to deletion API.

## __Amazon EventBridge__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds new capabilities to the AMAZON.QnAIntent: Custom prompting, Guardrails integration and ExactResponse support for Bedrock Knowledge Base.

## __Amazon WorkSpaces__
  - ### Features
    - Removing multi-session as it isn't supported for pools

## __Auto Scaling__
  - ### Features
    - Increase the length limit for VPCZoneIdentifier from 2047 to 5000

## __Elastic Load Balancing__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __IAM Roles Anywhere__
  - ### Features
    - IAM RolesAnywhere now supports custom role session name on the CreateSession. This release adds the acceptRoleSessionName option to a profile to control whether a role session name will be accepted in a session request with a given profile.

# __1.12.766__ __2024-07-29__
## __Amazon ElastiCache__
  - ### Features
    - Renaming full service name as it appears in developer documentation.

## __Amazon MemoryDB__
  - ### Features
    - Renaming full service name as it appears in developer documentation.

# __1.12.765__ __2024-07-25__
## __AWS CodeCommit__
  - ### Features
    - CreateRepository API now throws OperationNotAllowedException when the account has been restricted from creating a repository.

## __AWS Network Firewall__
  - ### Features
    - You can now log events that are related to TLS inspection, in addition to the existing alert and flow logging.

## __AWS Outposts__
  - ### Features
    - Adding default vCPU information to GetOutpostSupportedInstanceTypes and GetOutpostInstanceTypes responses

## __AWS Step Functions__
  - ### Features
    - This release adds support to customer managed KMS key encryption in AWS Step Functions.

## __Amazon Bedrock Runtime__
  - ### Features
    - Provides ServiceUnavailableException error message

## __Amazon CloudWatch Application Signals__
  - ### Features
    - CloudWatch Application Signals now supports application logs correlation with traces and operational health metrics of applications running on EC2 instances. Users can view the most relevant telemetry to troubleshoot application health anomalies such as spikes in latency, errors, and availability.

## __Amazon DataZone__
  - ### Features
    - Introduces GetEnvironmentCredentials operation to SDK

## __Amazon EC2 Container Registry__
  - ### Features
    - API and documentation updates for Amazon ECR, adding support for creating, updating, describing and deleting ECR Repository Creation Template.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Fleet now supports using custom identifiers to reference Amazon Machine Images (AMI) in launch requests that are configured to choose from a diversified list of instance types.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release adds support for EKS cluster to manage extended support.

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling is now more responsive to the changes in demand of your SageMaker Inference endpoints. To get started, create or update a Target Tracking policy based on High Resolution CloudWatch metrics.

## __Elastic Load Balancing__
  - ### Features
    - This release adds support for sharing trust stores across accounts and organizations through integration with AWS Resource Access Manager.

# __1.12.764__ __2024-07-24__
## __AWS AppSync__
  - ### Features
    - Adding support for paginators in AppSync list APIs

## __AWS Clean Rooms ML__
  - ### Features
    - Adds SQL query as the source of seed audience for audience generation job.

## __AWS Clean Rooms Service__
  - ### Features
    - This release adds AWS Entity Resolution integration to associate ID namespaces & ID mapping workflow resources as part of ID namespace association and  ID mapping table  in AWS Clean Rooms. It also introduces a new ID_MAPPING_TABLE analysis rule to manage the protection on ID mapping table.
    - Three enhancements to the AWS Clean Rooms: Disallowed Output Columns, Flexible Result Receivers, SQL as a Seed

## __AWS Elemental MediaPackage v2__
  - ### Features
    - This release adds support for Irdeto DRM encryption in DASH manifests.

## __AWS EntityResolution__
  - ### Features
    - Support First Party ID Mapping

## __AWS Health Imaging__
  - ### Features
    - CopyImageSet API adds copying selected instances between image sets, and overriding inconsistent metadata with a force parameter. UpdateImageSetMetadata API enables reverting to prior versions; updates to Study, Series, and SOP Instance UIDs; and updates to private elements, with a force parameter.

## __AWS IoT SiteWise__
  - ### Features
    - Adds support for creating SiteWise Edge gateways that run on a Siemens Industrial Edge Device.

## __Amazon Connect Contact Lens__
  - ### Features
    - Added PostContactSummary segment type on ListRealTimeContactAnalysisSegments API

## __Amazon Connect Service__
  - ### Features
    - Added PostContactSummary segment type on ListRealTimeContactAnalysisSegmentsV2 API

## __Amazon DataZone__
  - ### Features
    - This release removes the deprecated dataProductItem field from Search API output.

## __Amazon DynamoDB__
  - ### Features
    - DynamoDB doc only update for July

## __Amazon Pinpoint SMS Voice V2__
  - ### Features
    - Update for rebrand to AWS End User Messaging SMS and Voice.

# __1.12.763__ __2024-07-22__
## __Amazon DataZone__
  - ### Features
    - This release adds 1/ support of register S3 locations of assets in AWS Lake Formation hybrid access mode for DefaultDataLake blueprint. 2/ support of CRUD operations for Asset Filters.

## __Amazon Interactive Video Service__
  - ### Features
    - Documentation update for IVS Low Latency API Reference.

## __Amazon Neptune Graph__
  - ### Features
    - Amazon Neptune Analytics provides new options for customers to start with smaller graphs at a lower cost. CreateGraph, CreaateGraphImportTask, UpdateGraph and StartImportTask APIs will now allow 32 and 64 for `provisioned-memory`

## __Redshift Serverless__
  - ### Features
    - Adds dualstack support for Redshift Serverless workgroup.

# __1.12.762__ __2024-07-18__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Fix broken waiters for the acm-pca client.  Waiters broke in version 1.13.144 of the Boto3 SDK.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports the SRT protocol via the new SRT Caller input type.

## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect expands search API coverage for additional resources.  Search for hierarchy groups by name, ID, tag, or other criteria (new endpoint). Search for agent statuses by name, ID, tag, or other criteria (new endpoint). Search for users by their assigned proficiencies (enhanced endpoint)

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon VPC IP Address Manager (IPAM) now supports Bring-Your-Own-IP (BYOIP) for IP addresses registered with any Internet Registry. This feature uses DNS TXT records to validate ownership of a public IP address range.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Documentation update for IVS Chat API Reference.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release 1) Add configurable buffering hints for Snowflake as destination. 2) Add ReadFromTimestamp for MSK As Source. Firehose will start reading data from MSK Cluster using offset associated with this timestamp. 3) Gated public beta release to add Apache Iceberg tables as destination.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation to specify an eventual consistency model for DescribePendingMaintenanceActions.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Training supports R5, T3 and R5D instances family. And SageMaker Processing supports G5 and R5D instances family.

## __Amazon Timestream Query__
  - ### Features
    - Doc-only update for TimestreamQuery. Added guidance about the accepted valid value for the QueryPricingModel parameter.

## __Amazon WorkSpaces Thin Client__
  - ### Features
    - Documentation update for WorkSpaces Thin Client.

## __Tax Settings__
  - ### Features
    - Set default endpoint for aws partition. Requests from all regions in aws partition will be forward to us-east-1 endpoint.

# __1.12.761__ __2024-07-12__
## __AWS ARC - Zonal Shift__
  - ### Features
    - Adds the option to subscribe to get notifications when a zonal autoshift occurs in a region.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Minor refactoring of C2J model for AWS Private CA

## __AWS CodeBuild__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Global Accelerator__
  - ### Features
    - This feature adds exceptions to the Customer API to avoid throwing Internal Service errors

## __Amazon DynamoDB__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Pinpoint__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon QuickSight__
  - ### Features
    - Vega ally control options and Support for Reviewed Answers in Topics

## __Amazon Relational Database Service__
  - ### Features
    - Update path for CreateDBCluster resource identifier, and Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Simple Notification Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Auto Scaling__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

# __1.12.760__ __2024-07-10__
## __AWS Batch__
  - ### Features
    - This feature allows AWS Batch Jobs with EKS container orchestration type to be run as Multi-Node Parallel Jobs.

## __AWS Glue__
  - ### Features
    - Add recipe step support for recipe node

## __AWS Ground Station__
  - ### Features
    - Documentation update specifying OEM ephemeris units of measurement

## __AWS License Manager Linux Subscriptions__
  - ### Features
    - Add support for third party subscription providers, starting with RHEL subscriptions through Red Hat Subscription Manager (RHSM). Additionally, add support for tagging subscription provider resources, and detect when an instance has more than one Linux subscription and notify the customer.

## __AWS MediaConnect__
  - ### Features
    - AWS Elemental MediaConnect introduces the ability to disable outputs. Disabling an output allows you to keep the output attached to the flow, but stop streaming to the output destination. A disabled output does not incur data transfer costs.

## __Agents for Amazon Bedrock__
  - ### Features
    - Introduces new data sources and chunking strategies for Knowledge bases, advanced parsing logic using FMs, session summary generation, and code interpretation (preview) for Claude V3 Sonnet and Haiku models. Also introduces Prompt Flows (preview) to link prompts, foundational models, and resources.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - Introduces query decomposition, enhanced Agents integration with Knowledge bases, session summary generation, and code interpretation (preview) for Claude V3 Sonnet and Haiku models. Also introduces Prompt Flows (preview) to link prompts, foundational models, and resources for end-to-end solutions.

## __Amazon Bedrock__
  - ### Features
    - Add support for contextual grounding check for Guardrails for Amazon Bedrock.

## __Amazon Bedrock Runtime__
  - ### Features
    - Add support for contextual grounding check and ApplyGuardrail API for Guardrails for Amazon Bedrock.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add parameters to enable provisioning IPAM BYOIPv4 space at a Local Zone Network Border Group level

# __1.12.759__ __2024-07-09__
## __Amazon DataZone__
  - ### Features
    - This release deprecates dataProductItem field from SearchInventoryResultItem, along with some unused DataProduct shapes

## __Amazon FSx__
  - ### Features
    - Adds support for FSx for NetApp ONTAP 2nd Generation file systems, and FSx for OpenZFS Single AZ HA file systems.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for enabling or disabling Natural Language Query Processing feature for Amazon OpenSearch Service domains, and provides visibility into the current state of the setup or tear-down.

## __Amazon SageMaker Service__
  - ### Features
    - This release 1/ enables optimization jobs that allows customers to perform Ahead-of-time compilation and quantization. 2/ allows customers to control access to Amazon Q integration in SageMaker Studio. 3/ enables AdditionalModelDataSources for CreateModel action.

# __1.12.758__ __2024-07-08__
## __AWS CodeDeploy__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Database Migration Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Device Farm__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Elastic Beanstalk__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Elasticsearch Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon GameLift__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Kinesis Firehose__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Route 53 Resolver__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Simple Email Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __QApps__
  - ### Features
    - This is a general availability (GA) release of Amazon Q Apps, a capability of Amazon Q Business. Q Apps leverages data sources your company has provided to enable users to build, share, and customize apps within your organization.

# __1.12.757__ __2024-07-05__
## __AWS Certificate Manager__
  - ### Features
    - Documentation updates, including fixes for xml formatting, broken links, and ListCertificates description.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release for Amazon ECR makes change to bring the SDK into sync with the API.

## __Payment Cryptography Data Plane__
  - ### Features
    - Added further restrictions on logging of potentially sensitive inputs and outputs.

## __QBusiness__
  - ### Features
    - Add personalization to Q Applications. Customers can enable or disable personalization when creating or updating a Q application with the personalization configuration.

# __1.12.756__ __2024-07-03__
## __AWS Direct Connect__
  - ### Features
    - This update includes documentation for support of new native 400 GBps ports for Direct Connect.

## __AWS Organizations__
  - ### Features
    - Added a new reason under ConstraintViolationException in RegisterDelegatedAdministrator API to prevent registering suspended accounts as delegated administrator of a service.

## __Amazon Rekognition__
  - ### Features
    - This release adds support for tagging projects and datasets with the CreateProject and CreateDataset APIs.

## __Amazon WorkSpaces__
  - ### Features
    - Fix create workspace bundle RootStorage/UserStorage to accept non null values

## __Application Auto Scaling__
  - ### Features
    - Doc only update for Application Auto Scaling that fixes resource name.

# __1.12.755__ __2024-07-02__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Elastic Compute Cloud (EC2).

## __Amazon Simple Storage Service__
  - ### Features
    - Added response overrides to Head Object requests.

## __Firewall Management Service__
  - ### Features
    - Increases Customer API's ManagedServiceData length

# __1.12.754__ __2024-07-01__
## __AWS Step Functions__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS WAFV2__
  - ### Features
    - JSON body inspection: Update documentation to clarify that JSON parsing doesn't include full validation.

## __Amazon API Gateway__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Cognito Identity__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Connect Service__
  - ### Features
    - Authentication profiles are Amazon Connect resources (in gated preview) that allow you to configure authentication settings for users in your contact center. This release adds support for new ListAuthenticationProfiles, DescribeAuthenticationProfile and UpdateAuthenticationProfile APIs.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Updates EKS managed node groups to support EC2 Capacity Blocks for ML

## __Amazon Simple Workflow Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Payment Cryptography Control Plane__
  - ### Features
    - Added further restrictions on logging of potentially sensitive inputs and outputs.

## __Payment Cryptography Data Plane__
  - ### Features
    - Adding support for dynamic keys for encrypt, decrypt, re-encrypt and translate pin functions.  With this change, customers can use one-time TR-31 keys directly in dataplane operations without the need to first import them into the service.

# __1.12.753__ __2024-06-28__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Added CCPC_LEVEL_1_OR_HIGHER KeyStorageSecurityStandard and SM2 KeyAlgorithm and SM3WITHSM2 SigningAlgorithm for China regions.

## __AWS CloudHSM V2__
  - ### Features
    - Added 3 new APIs to support backup sharing: GetResourcePolicy, PutResourcePolicy, and DeleteResourcePolicy. Added BackupArn to the output of the DescribeBackups API. Added support for BackupArn in the CreateCluster API.

## __AWS Glue__
  - ### Features
    - Added AttributesToGet parameter to Glue GetDatabases, allowing caller to limit output to include only the database name.

## __AWS Performance Insights__
  - ### Features
    - Noting that the filter db.sql.db_id isn't available for RDS for SQL Server DB instances.

## __Amazon Connect Service__
  - ### Features
    - This release supports showing PreferredAgentRouting step via DescribeContact API.

## __Amazon EMR__
  - ### Features
    - This release provides the support for new allocation strategies i.e. CAPACITY_OPTIMIZED_PRIORITIZED for Spot and PRIORITIZED for On-Demand by taking input of priority value for each instance type for instance fleet clusters.

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Flink 1.19 in Managed Service for Apache Flink

## __Amazon OpenSearch Service__
  - ### Features
    - This release removes support for enabling or disabling Natural Language Query Processing feature for Amazon OpenSearch Service domains.

## __Amazon WorkSpaces__
  - ### Features
    - Added support for Red Hat Enterprise Linux 8 on Amazon WorkSpaces Personal.

# __1.12.752__ __2024-06-27__
## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - Added Amazon Transcribe multi language identification to Chime SDK call analytics. Enabling customers sending single stream audio to generate call recordings using Chime SDK call analytics

## __Amazon CloudFront__
  - ### Features
    - Doc only update for CloudFront that fixes customer-reported issue

## __Amazon DataZone__
  - ### Features
    - This release supports the data lineage feature of business data catalog in Amazon DataZone.

## __Amazon ElastiCache__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Q Connect__
  - ### Features
    - Adds CreateContentAssociation, ListContentAssociations, GetContentAssociation, and DeleteContentAssociation APIs.

## __Amazon QuickSight__
  - ### Features
    - Adding support for Repeating Sections, Nested Filters

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for TAZ export to S3.

## __Amazon SageMaker Service__
  - ### Features
    - Add capability for Admins to customize Studio experience for the user by showing or hiding Apps and MLTools.

## __Amazon WorkSpaces__
  - ### Features
    - Added support for WorkSpaces Pools.

## __AmazonMQ__
  - ### Features
    - This release makes the EngineVersion field optional for both broker and configuration and uses the latest available version by default. The AutoMinorVersionUpgrade field is also now optional for broker creation and defaults to 'true'.

## __Application Auto Scaling__
  - ### Features
    - Amazon WorkSpaces customers can now use Application Auto Scaling to automatically scale the number of virtual desktops in a WorkSpaces pool.

# __1.12.751__ __2024-06-26__
## __AWS Control Tower__
  - ### Features
    - Added ListLandingZoneOperations API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added support for disabling unmanaged addons during cluster creation.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - IVS Real-Time now offers customers the ability to upload public keys for customer vended participant tokens.

## __Amazon Kinesis Analytics__
  - ### Features
    - This release adds support for new ListApplicationOperations and DescribeApplicationOperation APIs. It adds a new configuration to enable system rollbacks, adds field ApplicationVersionCreateTimestamp for clarity and improves support for pagination for APIs.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for enabling or disabling Natural Language Query Processing feature for Amazon OpenSearch Service domains, and provides visibility into the current state of the setup or tear-down.

# __1.12.750__ __2024-06-25__
## __AWS Network Manager__
  - ### Features
    - This is model changes & documentation update for the Asynchronous Error Reporting feature for AWS Cloud WAN. This feature allows customers to view errors that occur while their resources are being provisioned, enabling customers to fix their resources without needing external support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release is for the launch of the new u7ib-12tb.224xlarge, R8g, c7gn.metal and mac2-m1ultra.metal instance types

## __Amazon WorkSpaces Thin Client__
  - ### Features
    - This release adds the deviceCreationTags field to CreateEnvironment API input, UpdateEnvironment API input and GetEnvironment API output.

## __Auto Scaling__
  - ### Features
    - Doc only update for Auto Scaling's TargetTrackingMetricDataQuery

# __1.12.749__ __2024-06-24__
## __Amazon Bedrock Runtime__
  - ### Features
    - Increases Converse API's document name length

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release includes changes to ProfileObjectType APIs, adds functionality top set and get capacity for profile object types.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Fix EC2 multi-protocol info in models.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add sensitive trait to SSM IPAddress property for CloudTrail redaction

## __Amazon WorkSpaces Web__
  - ### Features
    - Added ability to enable DeepLinking functionality on a Portal via UserSettings as well as added support for IdentityProvider resource tagging.

## __QBusiness__
  - ### Features
    - Allow enable/disable Q Apps when creating/updating a Q application; Return the Q Apps enablement information when getting a Q application.

# __1.12.748__ __2024-06-20__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for Amazon RDS MySQL and RDS PostgreSQL.

## __AWS Glue__
  - ### Features
    - Fix Glue paginators for Jobs, JobRuns, Triggers, Blueprints and Workflows.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for Security Hub

## __Amazon Bedrock Runtime__
  - ### Features
    - This release adds document support to Converse and ConverseStream APIs

## __Amazon DynamoDB__
  - ### Features
    - Doc-only update for DynamoDB. Fixed Important note in 6 Global table APIs - CreateGlobalTable, DescribeGlobalTable, DescribeGlobalTableSettings, ListGlobalTables, UpdateGlobalTable, and UpdateGlobalTableSettings.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - IVS Real-Time now offers customers the ability to record individual stage participants to S3.

## __Amazon SageMaker Service__
  - ### Features
    - Adds support for model references in Hub service, and adds support for cross-account access of Hubs

## __CodeArtifact__
  - ### Features
    - Add support for the Cargo package format.

## __Cost Optimization Hub__
  - ### Features
    - This release enables AWS Cost Optimization Hub to show cost optimization recommendations for Amazon RDS MySQL and RDS PostgreSQL.

# __1.12.747__ __2024-06-19__
## __AWS Artifact__
  - ### Features
    - This release adds an acceptanceType field to the ReportSummary structure (used in the ListReports API response).

## __AWS Cost and Usage Report Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Direct Connect__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Athena__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Elastic Transcoder__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon OpenSearch Service__
  - ### Features
    - This release enables customers to use JSON Web Tokens (JWT) for authentication on their Amazon OpenSearch Service domains.

# __1.12.746__ __2024-06-18__
## __AWS CloudTrail__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Config__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS SDK for Java__
  - ### Features
    - Adds support for EKS IPv4 and IPv6 HTTP loopback addresses as well as token header values provided on file.

## __AWS Shield__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Bedrock Runtime__
  - ### Features
    - This release adds support for using Guardrails with the Converse and ConverseStream APIs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release adds support to surface async fargate customer errors from async path to customer through describe-fargate-profile API response.

## __Amazon Import/Export Snowball__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Lightsail__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Polly__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Rekognition__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon SageMaker Service__
  - ### Features
    - Launched a new feature in SageMaker to provide managed MLflow Tracking Servers for customers to track ML experiments. This release also adds a new capability of attaching additional storage to SageMaker HyperPod cluster instances.

# __1.12.745__ __2024-06-17__
## __AWS Batch__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Doc-only update that adds name constraints as an allowed extension for ImportCertificateAuthorityCertificate.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports global and organization GitHub webhooks

## __AWS Directory Service__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes support for creating I-frame only video segments for DASH trick play.

## __AWS Glue__
  - ### Features
    - This release introduces a new feature, Usage profiles. Usage profiles allow the AWS Glue admin to create different profiles for various classes of users within the account, enforcing limits and defaults for jobs and sessions.

## __AWS Key Management Service__
  - ### Features
    - Updating SDK example for KMS DeriveSharedSecret API.

## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager

## __AWS WAF__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Amazon Elastic File System__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

# __1.12.744__ __2024-06-14__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the ability to search for historical job records within the management console using a search box and/or via the SDK/CLI with partial string matching search on input file name.

## __Amazon DataZone__
  - ### Features
    - This release introduces a new default service blueprint for custom environment creation.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for managing the status of automated sensitive data discovery for individual accounts in an organization, and determining whether individual S3 buckets are included in the scope of the analyses.

## __Amazon Route 53 Domains__
  - ### Features
    - Add v2 smoke tests and smithy smokeTests trait for SDK testing.

# __1.12.743__ __2024-06-14__
## __AWS CloudHSM V2__
  - ### Features
    - Added support for hsm type hsm2m.medium. Added supported for creating a cluster in FIPS or NON_FIPS mode.

## __AWS Elemental MediaPackage v2__
  - ### Features
    - This release adds support for CMAF ingest (DASH-IF live media ingest protocol interface 1)

## __AWS Glue__
  - ### Features
    - This release adds support for configuration of evaluation method for composite rules in Glue Data Quality rulesets.

## __AWS IoT Wireless__
  - ### Features
    - Add RoamingDeviceSNR and RoamingDeviceRSSI to Customer Metrics.

## __AWS Key Management Service__
  - ### Features
    - This feature allows customers to use their keys stored in KMS to derive a shared secret which can then be used to establish a secured channel for communication, provide proof of possession, or establish trust with other parties.

# __1.12.742__ __2024-06-12__
## __AWS Mainframe Modernization Application Testing__
  - ### Features
    - AWS Mainframe Modernization Application Testing is an AWS Mainframe Modernization service feature that automates functional equivalence testing for mainframe application modernization and migration to AWS, and regression testing.

## __AWS Secrets Manager__
  - ### Features
    - Introducing RotationToken parameter for PutSecretValue API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Tagging support for Traffic Mirroring FilterRule resource

## __Amazon OpenSearch Ingestion__
  - ### Features
    - SDK changes for self-managed vpc endpoint to OpenSearch ingestion pipelines.

## __Amazon Redshift__
  - ### Features
    - Updates to remove DC1 and DS2 node types.

## __Amazon Security Lake__
  - ### Features
    - This release updates request validation regex to account for non-commercial aws partitions.

## __Amazon Simple Email Service__
  - ### Features
    - This release adds support for Amazon EventBridge as an email sending events destination.

# __1.12.741__ __2024-06-11__
## __AWS Network Manager__
  - ### Features
    - This is model changes & documentation update for Service Insertion feature for AWS Cloud WAN. This feature allows insertion of AWS/3rd party security services on Cloud WAN. This allows to steer inter/intra segment traffic via security appliances and provide visibility to the route updates.

## __Access Analyzer__
  - ### Features
    - IAM Access Analyzer now provides policy recommendations to help resolve unused permissions for IAM roles and users. Additionally, IAM Access Analyzer now extends its custom policy checks to detect when IAM policies grant public access or access to critical resources ahead of deployments.

## __Amazon GuardDuty__
  - ### Features
    - Added API support for GuardDuty Malware Protection for S3.

## __Amazon SageMaker Service__
  - ### Features
    - Introduced Scope and AuthenticationRequestExtraParams to SageMaker Workforce OIDC configuration; this allows customers to modify these options for their private Workforce IdP integration. Model Registry Cross-account model package groups are discoverable.

## __Private CA Connector for SCEP__
  - ### Features
    - Connector for SCEP allows you to use a managed, cloud CA to enroll mobile devices and networking gear. SCEP is a widely-adopted protocol used by mobile device management (MDM) solutions for enrolling mobile devices. With the connector, you can use AWS Private CA with popular MDM solutions.

# __1.12.740__ __2024-06-10__
## __Amazon CloudWatch Application Signals__
  - ### Features
    - This is the initial SDK release for Amazon CloudWatch Application Signals. Amazon CloudWatch Application Signals provides curated application performance monitoring for developers to monitor and troubleshoot application health using pre-built dashboards and Service Level Objectives.

## __Amazon EC2 Container Service__
  - ### Features
    - This release introduces a new cluster configuration to support the customer-managed keys for ECS managed storage encryption.

## __EC2 Image Builder__
  - ### Features
    - This release updates the regex pattern for Image Builder ARNs.

# __1.12.739__ __2024-06-07__
## __AWS Audit Manager__
  - ### Features
    - New feature: common controls. When creating custom controls, you can now use pre-grouped AWS data sources based on common compliance themes. Also, the awsServices parameter is deprecated because we now manage services in scope for you. If used, the input is ignored and an empty list is returned.

## __AWS B2B Data Interchange__
  - ### Features
    - Added exceptions to B2Bi List operations and ConflictException to B2Bi StartTransformerJob operation. Also made capabilities field explicitly required when creating a Partnership.

## __AWS CodePipeline__
  - ### Features
    - CodePipeline now supports overriding S3 Source Object Key during StartPipelineExecution, as part of Source Overrides.

## __Amazon SageMaker Service__
  - ### Features
    - This release introduces a new optional parameter: InferenceAmiVersion, in ProductionVariant.

## __Amazon Verified Permissions__
  - ### Features
    - This release adds OpenIdConnect (OIDC) configuration support for IdentitySources, allowing for external IDPs to be used in authorization requests.

# __1.12.738__ __2024-06-06__
## __AWS Account__
  - ### Features
    - This release adds 3 new APIs (AcceptPrimaryEmailUpdate, GetPrimaryEmail, and StartPrimaryEmailUpdate) used to centrally manage the root user email address of member accounts within an AWS organization.

## __AWS Glue__
  - ### Features
    - This release adds support for creating and updating Glue Data Catalog Views.

## __AWS IoT Wireless__
  - ### Features
    - Adds support for wireless device to be in Conflict FUOTA Device Status due to a FUOTA Task, so it couldn't be attached to a new one.

## __AWS Storage Gateway__
  - ### Features
    - Adds SoftwareUpdatePreferences to DescribeMaintenanceStartTime and UpdateMaintenanceStartTime, a structure which contains AutomaticUpdatePolicy.

## __Amazon FSx__
  - ### Features
    - This release adds support to increase metadata performance on FSx for Lustre file systems beyond the default level provisioned when a file system is created. This can be done by specifying MetadataConfiguration during the creation of Persistent_2 file systems or by updating it on demand.

## __Amazon Kinesis Firehose__
  - ### Features
    - Adds integration with Secrets Manager for Redshift, Splunk, HttpEndpoint, and Snowflake destinations

## __Amazon Location Service__
  - ### Features
    - Added two new APIs, VerifyDevicePosition and ForecastGeofenceEvents. Added support for putting larger geofences up to 100,000 vertices with Geobuf fields.

## __Amazon Simple Notification Service__
  - ### Features
    - Doc-only update for SNS. These changes include customer-reported issues and TXC3 updates.

## __Amazon Simple Queue Service__
  - ### Features
    - Doc only updates for SQS. These updates include customer-reported issues and TCX3 modifications.

# __1.12.737__ __2024-06-05__
## __AWS Global Accelerator__
  - ### Features
    - This release contains a new optional ip-addresses input field for the update accelerator and update custom routing accelerator apis. This input enables consumers to replace IPv4 addresses on existing accelerators with addresses provided in the input.

## __AWS Glue__
  - ### Features
    - AWS Glue now supports native SaaS connectivity: Salesforce connector available now

## __Amazon Simple Storage Service__
  - ### Features
    - Added new params copySource and key to copyObject API for supporting S3 Access Grants plugin. These changes will not change any of the existing S3 API functionality.

# __1.12.736__ __2024-06-04__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - U7i instances with up to 32 TiB of DDR5 memory and 896 vCPUs are now available. C7i-flex instances are launched and are lower-priced variants of the Amazon EC2 C7i instances that offer a baseline level of CPU performance with the ability to scale up to the full compute performance 95% of the time.

## __Amazon EventBridge Pipes__
  - ### Features
    - This release adds Timestream for LiveAnalytics as a supported target in EventBridge Pipes

## __Amazon SageMaker Service__
  - ### Features
    - Extend DescribeClusterNode response with private DNS hostname and IP address, and placement information about availability zone and availability zone ID.

## __Tax Settings__
  - ### Features
    - Initial release of AWS Tax Settings API

# __1.12.735__ __2024-06-03__
## __AWS Amplify__
  - ### Features
    - This doc-only update identifies fields that are specific to Gen 1 and Gen 2 applications.

## __AWS Batch__
  - ### Features
    - This release adds support for the AWS Batch GetJobQueueSnapshot API operation.

## __AWS IoT TwinMaker__
  - ### Features
    - Support RESET_VALUE UpdateType for PropertyUpdates to reset property value to default or null

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons pod identity associations integration

# __1.12.734__ __2024-05-31__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports Self-hosted GitHub Actions runners for Github Enterprise

## __AWS Launch Wizard__
  - ### Features
    - This release adds support for describing workload deployment specifications, deploying additional workload types, and managing tags for Launch Wizard resources with API operations.

## __Amazon CodeGuru Security__
  - ### Features
    - This release includes minor model updates and documentation updates.

## __Amazon ElastiCache__
  - ### Features
    - Update to attributes of TestFailover and minor revisions.

# __1.12.733__ __2024-05-30__
## __AWS Certificate Manager__
  - ### Features
    - add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __AWS CloudTrail__
  - ### Features
    - CloudTrail Lake returns PartitionKeys in the GetEventDataStore API response. Events are grouped into partitions based on these keys for better query performance. For example, the calendarday key groups events by day, while combining the calendarday key with the hour key groups them by day and hour.

## __Agents for Amazon Bedrock__
  - ### Features
    - With this release, Knowledge bases for Bedrock adds support for Titan Text Embedding v2.

## __Amazon Bedrock Runtime__
  - ### Features
    - This release adds Converse and ConverseStream APIs to Bedrock Runtime

## __Amazon Connect Service__
  - ### Features
    - Adding associatedQueueIds as a SearchCriteria and response field to the SearchRoutingProfiles API

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for Aurora Postgres DBname.

## __Amazon SageMaker Service__
  - ### Features
    - Adds Model Card information as a new component to Model Package. Autopilot launches algorithm selection for TimeSeries modality to generate AutoML candidates per algorithm.

## __EMR Serverless__
  - ### Features
    - The release adds support for spark structured streaming.

# __1.12.732__ __2024-05-29__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports manually creating GitHub webhooks

## __AWS Glue__
  - ### Features
    - Add optional field JobMode to CreateJob and UpdateJob APIs.

## __AWS SecurityHub__
  - ### Features
    - Add ROOT type for TargetType model

## __Amazon Athena__
  - ### Features
    - Throwing validation errors on CreateNotebook with Name containing `/`,`:`,`\`

## __Amazon Connect Service__
  - ### Features
    - This release includes changes to DescribeContact API's response by including ConnectedToSystemTimestamp, RoutingCriteria, Customer, Campaign, AnsweringMachineDetectionStatus, CustomerVoiceActivity, QualityMetrics, DisconnectDetails, and SegmentAttributes information from a contact in Amazon Connect.

# __1.12.731__ __2024-05-28__
## __Amazon DynamoDB__
  - ### Features
    - Doc-only update for DynamoDB. Specified the IAM actions needed to authorize a user to create a table with a resource-based policy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Providing support to accept BgpAsnExtended attribute

## __Amazon Simple Workflow Service__
  - ### Features
    - This release adds new APIs for deleting activity type and workflow type resources.

## __Managed Streaming for Kafka__
  - ### Features
    - Adds ControllerNodeInfo in ListNodes response to support Raft mode for MSK

# __1.12.730__ __2024-05-24__
## __AWS IoT FleetWise__
  - ### Features
    - AWS IoT FleetWise now supports listing vehicles with attributes filter, ListVehicles API is updated to support additional attributes filter.

## __Amazon DynamoDB__
  - ### Features
    - Documentation only updates for DynamoDB.

## __Amazon Managed Blockchain__
  - ### Features
    - This is a minor documentation update to address the impact of the shut down of the Goerli and Polygon networks.

# __1.12.729__ __2024-05-23__
## __AWS OpsWorks__
  - ### Features
    - Documentation-only update for OpsWorks Stacks.

## __EMR Serverless__
  - ### Features
    - This release adds the capability to run interactive workloads using Apache Livy Endpoint.

# __1.12.728__ __2024-05-22__
## __AWS Chatbot__
  - ### Features
    - This change adds support for tagging Chatbot configurations.

## __AWS CloudFormation__
  - ### Features
    - Added DeletionMode FORCE_DELETE_STACK for deleting a stack that is stuck in DELETE_FAILED state due to resource deletion failure.

## __AWS Key Management Service__
  - ### Features
    - This release includes feature to import customer's asymmetric (RSA, ECC and SM2) and HMAC keys into KMS in China.

## __AWS WAFV2__
  - ### Features
    - You can now use Security Lake to collect web ACL traffic data.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for enabling or disabling a data source configured as part of Zero-ETL integration with Amazon S3, by setting its status.

# __1.12.727__ __2024-05-21__
## __AWS Glue__
  - ### Features
    - Add Maintenance window to CreateJob and UpdateJob APIs and JobRun response. Add a new Job Run State for EXPIRED.

## __AWS Performance Insights__
  - ### Features
    - Performance Insights added a new input parameter called AuthorizedActions to support the fine-grained access feature. Performance Insights also restricted the acceptable input characters.

## __AWS Storage Gateway__
  - ### Features
    - Added new SMBSecurityStrategy enum named MandatoryEncryptionNoAes128, new mode enforces encryption and disables AES 128-bit algorithums.

## __Amazon CloudFront__
  - ### Features
    - Model update; no change to SDK functionality.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail instances to switch between dual-stack or IPv4 only and IPv6-only public IP address types.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for Db2 license through AWS Marketplace.

## __MailManager__
  - ### Features
    - This release includes a new Amazon SES feature called Mail Manager, which is a set of email gateway capabilities designed to help customers strengthen their organization's email infrastructure, simplify email workflow management, and streamline email compliance control.

# __1.12.726__ __2024-05-20__
## __AWS Control Tower__
  - ### Features
    - Added ListControlOperations API and filtering support for ListEnabledControls API. Updates also includes added metadata for enabled controls and control operations.

## __AWS Secrets Manager__
  - ### Features
    - add v2 smoke tests and smithy smokeTests trait for SDK testing

## __Agents for Amazon Bedrock__
  - ### Features
    - This release adds support for using Guardrails with Bedrock Agents.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release adds support for using Guardrails with Bedrock Agents.

## __Amazon OpenSearch Ingestion__
  - ### Features
    - Add support for creating an OpenSearch Ingestion pipeline that is attached to a provided VPC. Add information about the destinations of an OpenSearch Ingestion pipeline to the GetPipeline and ListPipelines APIs.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for EngineLifecycleSupport on DBInstances, DBClusters, and GlobalClusters.

# __1.12.725__ __2024-05-17__
## __AWS CodeBuild__
  - ### Features
    - Aws CodeBuild now supports 36 hours build timeout

## __AWS Lake Formation__
  - ### Features
    - Introduces a new API, GetDataLakePrincipal, that returns the identity of the invoking principal

## __AWS Transfer Family__
  - ### Features
    - Enable use of CloudFormation traits in Smithy model to improve generated CloudFormation schema from the Smithy API model.

## __Application Auto Scaling__
  - ### Features
    - add v2 smoke tests and smithy smokeTests trait for SDK testing.

## __Elastic Load Balancing__
  - ### Features
    - This release adds dualstack-without-public-ipv4 IP address type for ALB.

# __1.12.724__ __2024-05-16__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - This release adds support for waiters to fail on AccessDeniedException when having insufficient permissions

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for AWS Secrets Manager

## __Amazon Connect Service__
  - ### Features
    - Adding Contact Flow metrics to the GetMetricDataV2 API

## __Amazon QuickSight__
  - ### Features
    - This release adds DescribeKeyRegistration and UpdateKeyRegistration APIs to manage QuickSight Customer Managed Keys (CMK).

## __Amazon SageMaker Service__
  - ### Features
    - Introduced WorkerAccessConfiguration to SageMaker Workteam. This allows customers to configure resource access for workers in a workteam.

## __AmazonMWAA__
  - ### Features
    - Amazon MWAA now supports Airflow web server auto scaling to automatically handle increased demand from REST APIs, Command Line Interface (CLI), or more Airflow User Interface (UI) users. Customers can specify maximum and minimum web server instances during environment creation and update workflow.

## __Managed Streaming for Kafka__
  - ### Features
    - AWS MSK support for Broker Removal.

# __1.12.723__ __2024-05-15__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild Reserved Capacity VPC Support

## __AWS DataSync__
  - ### Features
    - Task executions now display a CANCELLING status when an execution is in the process of being cancelled.

## __AWS Health Imaging__
  - ### Features
    - Added support for importing medical imaging data from Amazon S3 buckets across accounts and regions.

## __AWS SecurityHub__
  - ### Features
    - Documentation-only update for AWS Security Hub

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - Updating Bedrock Knowledge Base Metadata & Filters feature with two new filters listContains and stringContains

## __Amazon Managed Grafana__
  - ### Features
    - This release adds new ServiceAccount and ServiceAccountToken APIs.

# __1.12.722__ __2024-05-14__
## __Amazon Connect Service__
  - ### Features
    - Amazon Connect provides enhanced search capabilities for flows & flow modules on the Connect admin website and programmatically using APIs. You can search for flows and flow modules by name, description, type, status, and tags, to filter and identify a specific flow in your Connect instances.

## __Amazon Simple Storage Service__
  - ### Features
    - Updated a few x-id in the http uri traits

# __1.12.721__ __2024-05-13__
## __Amazon EventBridge__
  - ### Features
    - Amazon EventBridge introduces KMS customer-managed key (CMK) encryption support for custom and partner events published on EventBridge Event Bus (including default bus) and UpdateEventBus API.

## __Amazon VPC Lattice__
  - ### Features
    - This release adds TLS Passthrough support. It also increases max number of target group per rule to 10.

# __1.12.720__ __2024-05-10__
## __AWS Application Discovery Service__
  - ### Features
    - add v2 smoke tests and smithy smokeTests trait for SDK testing

## __AWS IoT Greengrass V2__
  - ### Features
    - Mark ComponentVersion in ComponentDeploymentSpecification as required.

## __AWS SSO OIDC__
  - ### Features
    - Updated request parameters for PKCE support.

## __Amazon SageMaker Service__
  - ### Features
    - Introduced support for G6 instance types on Sagemaker Notebook Instances and on SageMaker Studio for JupyterLab and CodeEditor applications.

# __1.12.719__ __2024-05-09__
## __AWS Systems Manager for SAP__
  - ### Features
    - Added support for application-aware start/stop of SAP applications running on EC2 instances, with SSM for SAP

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release adds support to provide guardrail configuration and modify inference parameters that are then used in RetrieveAndGenerate API in Agents for Amazon Bedrock.

## __Amazon Pinpoint__
  - ### Features
    - This release adds support for specifying email message headers for Email Templates, Campaigns, Journeys and Send Messages.

## __Amazon Route 53 Resolver__
  - ### Features
    - Update the DNS Firewall settings to correct a spelling issue.

## __Amazon Verified Permissions__
  - ### Features
    - Adds policy effect and actions fields to Policy API's.

# __1.12.718__ __2024-05-08__
## __Amazon Cognito Identity Provider__
  - ### Features
    - Add EXTERNAL_PROVIDER enum value to UserStatusType.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds pull through cache rules support for GitLab container registry in Amazon ECR.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding Precision Hardware Clock (PHC) to public API DescribeInstanceTypes

## __Amazon Polly__
  - ### Features
    - Add new engine - generative - that builds the most expressive conversational voices.

## __Amazon Simple Queue Service__
  - ### Features
    - This release adds MessageSystemAttributeNames to ReceiveMessageRequest to replace AttributeNames.

## __Firewall Management Service__
  - ### Features
    - The policy scope resource tag is always a string value, either a non-empty string or an empty string.

# __1.12.717__ __2024-05-07__
## __AWS B2B Data Interchange__
  - ### Features
    - Documentation update to clarify the MappingTemplate definition.

## __AWS Budgets__
  - ### Features
    - This release adds tag support for budgets and budget actions.

## __AWS Resilience Hub__
  - ### Features
    - AWS Resilience Hub has expanded its drift detection capabilities by introducing a new type of drift detection - application resource drift. This new enhancement detects changes, such as the addition or deletion of resources within the application's input sources.

## __Route 53 Profiles__
  - ### Features
    - Doc only update for Route 53 profiles that fixes some link  issues

# __1.12.716__ __2024-05-06__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports configuring how SCTE 35 passthrough triggers segment breaks in HLS and MediaPackage output groups. Previously, messages triggered breaks in all these output groups. The new option is to trigger segment breaks only in groups that have SCTE 35 passthrough enabled.

# __1.12.715__ __2024-05-03__
## __AWS DataSync__
  - ### Features
    - Updated guidance on using private or self-signed certificate authorities (CAs) with AWS DataSync object storage locations.

## __AWS SDK for Java__
  - ### Features
    - Update Jackson to 2.12.7.2. This fixes the last of the known compatibility issues with Java 17.

## __Agents for Amazon Bedrock__
  - ### Features
    - This release adds support for using Provisioned Throughput with Bedrock Agents.

## __Amazon Connect Cases__
  - ### Features
    - This feature supports the release of Files related items

## __Amazon Connect Service__
  - ### Features
    - This release adds 5 new APIs for managing attachments: StartAttachedFileUpload, CompleteAttachedFileUpload, GetAttachedFile, BatchGetAttachedFileMetadata, DeleteAttachedFile. These APIs can be used to programmatically upload and download attachments to Connect resources, like cases.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Inference now supports m6i, c6i, r6i, m7i, c7i, r7i and g5 instance types for Batch Transform Jobs

## __Amazon Simple Email Service__
  - ### Features
    - Adds support for specifying replacement headers per BulkEmailEntry in SendBulkEmail in SESv2.

## __Inspector2__
  - ### Features
    - This release adds CSV format to GetCisScanReport for Inspector v2

# __1.12.714__ __2024-05-02__
## __Amazon DynamoDB__
  - ### Features
    - This release adds support to specify an optional, maximum OnDemandThroughput for DynamoDB tables and global secondary indexes in the CreateTable or UpdateTable APIs. You can also override the OnDemandThroughput settings by calling the ImportTable, RestoreFromPointInTime, or RestoreFromBackup APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release includes a new API for retrieving the public endorsement key of the EC2 instance's Nitro Trusted Platform Module (NitroTPM).

## __Amazon Personalize__
  - ### Features
    - This releases ability to delete users and their data, including their metadata and interactions data, from a dataset group.

## __Redshift Serverless__
  - ### Features
    - Update Redshift Serverless List Scheduled Actions Output Response to include Namespace Name.

# __1.12.713__ __2024-05-01__
## __AWS SecurityHub__
  - ### Features
    - Updated CreateMembers API request with limits.

## __Agents for Amazon Bedrock__
  - ### Features
    - This release adds support for using MongoDB Atlas as a vector store when creating a knowledge base.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Personalize Runtime__
  - ### Features
    - This release adds support for a Reason attribute for predicted items generated by User-Personalization-v2.

## __Amazon Simple Email Service__
  - ### Features
    - Fixes ListContacts and ListImportJobs APIs to use POST instead of GET.

# __1.12.712__ __2024-04-30__
## __AWS Signer__
  - ### Features
    - Documentation updates for AWS Signer. Adds cross-account signing constraint and definitions for cross-account actions.

## __Amazon Chime SDK Voice__
  - ### Features
    - Due to changes made by the Amazon Alexa service, GetSipMediaApplicationAlexaSkillConfiguration and PutSipMediaApplicationAlexaSkillConfiguration APIs are no longer available for use. For more information, refer to the Alexa Smart Properties page.

## __Amazon Omics__
  - ### Features
    - Add support for workflow sharing and dynamic run storage

## __Amazon OpenSearch Service__
  - ### Features
    - This release enables customers to create Route53 A and AAAA alias record types to point custom endpoint domain to OpenSearch domain's dualstack search endpoint.

## __Amazon Pinpoint SMS Voice V2__
  - ### Features
    - Amazon Pinpoint has added two new features Multimedia services (MMS) and protect configurations. Use the three new MMS APIs to send media messages to a mobile phone which includes image, audio, text, or video files. Use the ten new protect configurations APIs to block messages to specific countries.

## __Amazon QuickSight__
  - ### Features
    - New Q embedding supporting Generative Q&A

## __Amazon Route 53 Resolver__
  - ### Features
    - Release of FirewallDomainRedirectionAction parameter on the Route 53 DNS Firewall Rule.  This allows customers to configure a DNS Firewall rule to inspect all the domains in the DNS redirection chain (default) , such as CNAME, ALIAS, DNAME, etc., or just the first domain and trust the rest.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Training now supports the use of attribute-based access control (ABAC) roles for training job execution roles. Amazon SageMaker Inference now supports G6 instance types.

## __CodeArtifact__
  - ### Features
    - Add support for the Ruby package format.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports the network firewall service stream exception policy feature for accounts within your organization.

## __QBusiness__
  - ### Features
    - This is a general availability (GA) release of Amazon Q Business. Q Business enables employees in an enterprise to get comprehensive answers to complex questions and take actions through a unified, intuitive web-based chat experience - using an enterprise's existing content, data, and systems.

# __1.12.711__ __2024-04-29__
## __AWS Amplify__
  - ### Features
    - Updating max results limit for listing any resources (Job, Artifacts, Branch, BackendResources, DomainAssociation) to 50 with the exception of list apps that where max results can be up to 100.

## __Amazon Connect Cases__
  - ### Features
    - This feature releases DeleteField, DeletedLayout, and DeleteTemplate API's

## __Amazon Timestream Query__
  - ### Features
    - This change allows users to update and describe account settings associated with their accounts.

## __Amazon Transcribe Service__
  - ### Features
    - This update provides error messaging for generative call summarization in Transcribe Call Analytics

## __Inspector2__
  - ### Features
    - Update Inspector2 to include new Agentless API parameters.

## __TrustedAdvisor Public API__
  - ### Features
    - This release adds the BatchUpdateRecommendationResourceExclusion API to support batch updates of Recommendation Resource exclusion statuses and introduces a new exclusion status filter to the ListRecommendationResources and ListOrganizationRecommendationResources APIs.

# __1.12.710__ __2024-04-26__
## __AWS CodePipeline__
  - ### Features
    - Add ability to manually and automatically roll back a pipeline stage to a previously successful execution.

## __AWS Marketplace Entitlement Service__
  - ### Features
    - Releasing minor endpoint updates.

## __AWS Support__
  - ### Features
    - Releasing minor endpoint updates.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Add LimitExceededException to SignUp errors

## __Amazon Relational Database Service__
  - ### Features
    - SupportsLimitlessDatabase field added to describe-db-engine-versions to indicate whether the DB engine version supports Aurora Limitless Database.

## __AmazonConnectCampaignService__
  - ### Features
    - This release adds support for specifying if Answering Machine should wait for prompt sound.

## __CloudWatch Observability Access Manager__
  - ### Features
    - This release introduces support for Source Accounts to define which Metrics and Logs to share with the Monitoring Account

# __1.12.709__ __2024-04-25__
## __AWS AppSync__
  - ### Features
    - UpdateGraphQLAPI documentation update and datasource introspection secret arn update

## __AWS Step Functions__
  - ### Features
    - Add new ValidateStateMachineDefinition operation, which performs syntax checking on the definition of a Amazon States Language (ASL) state machine.

## __Amazon Interactive Video Service__
  - ### Features
    - Bug Fix: IVS does not support arns with the `svs` prefix

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Bug Fix: IVS Real Time does not support ARNs using the `svs` prefix.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for setting local time zones for RDS for Db2 DB instances.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager adds support for network ACL policies to manage Amazon Virtual Private Cloud (VPC) network access control lists (ACLs) for accounts in your organization.

# __1.12.708__ __2024-04-24__
## __AWS DataSync__
  - ### Features
    - This change allows users to disable and enable the schedules associated with their tasks.

## __AWS EntityResolution__
  - ### Features
    - Support Batch Unique IDs Deletion.

## __Amazon EMR Containers__
  - ### Features
    - EMRonEKS Service support for SecurityConfiguration enforcement for Spark Jobs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Launching capability for customers to enable or disable automatic assignment of public IPv4 addresses to their network interface

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift releases container fleets support for public preview. Deploy Linux-based containerized game server software for hosting on Amazon GameLift.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Add SSM DescribeInstanceProperties API to public AWS SDK.

# __1.12.707__ __2024-04-23__
## __AWS Cost Explorer Service__
  - ### Features
    - Added additional metadata that might be applicable to your reservation recommendations.

## __AWS Performance Insights__
  - ### Features
    - Clarifies how aggregation works for GetResourceMetrics in the Performance Insights API.

## __Agents for Amazon Bedrock__
  - ### Features
    - Introducing the ability to create multiple data sources per knowledge base, specify S3 buckets as data sources from external accounts, and exposing levers to define the deletion behavior of the underlying vector store data.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release introduces zero-setup file upload support for the RetrieveAndGenerate API. This allows you to chat with your data without setting up a Knowledge Base.

## __Amazon Bedrock__
  - ### Features
    - This release introduces Model Evaluation and Guardrails for Amazon Bedrock.

## __Amazon Bedrock Runtime__
  - ### Features
    - This release introduces Guardrails for Amazon Bedrock.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces EC2 AMI Deregistration Protection, a new AMI property that can be enabled by customers to protect an AMI against an unintended deregistration. This release also enables the AMI owners to view the AMI 'LastLaunchedTime' in DescribeImages API.

## __Amazon Relational Database Service__
  - ### Features
    - Fix the example ARN for ModifyActivityStreamRequest

## __Amazon WorkSpaces Web__
  - ### Features
    - Added InstanceType and MaxConcurrentSessions parameters on CreatePortal and UpdatePortal Operations as well as the ability to read Customer Managed Key & Additional Encryption Context parameters on supported resources (Portal, BrowserSettings, UserSettings, IPAccessSettings)

# __1.12.706__ __2024-04-22__
## __AWS Cloud Map__
  - ### Features
    - This release adds examples to several Cloud Map actions.

## __AWS Transfer Family__
  - ### Features
    - Adding new API to support remote directory listing using SFTP connector

## __Agents for Amazon Bedrock__
  - ### Features
    - Releasing the support for simplified configuration and return of control

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - Releasing the support for simplified configuration and return of control

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for Real-Time Collaboration and Shared Space for JupyterLab App on SageMaker Studio.

## __Payment Cryptography Control Plane__
  - ### Features
    - Adding support to TR-31/TR-34 exports for optional headers, allowing customers to add additional metadata (such as key version and KSN) when exporting keys from the service.

## __Redshift Serverless__
  - ### Features
    - Updates description of schedule field for scheduled actions.

## __Route 53 Profiles__
  - ### Features
    - Route 53 Profiles allows you to apply a central DNS configuration across many VPCs regardless of account.

# __1.12.705__ __2024-04-19__
## __AWS Glue__
  - ### Features
    - Adding RowFilter in the response for GetUnfilteredTableMetadata API

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This update introduces the GetInternetEvent and ListInternetEvents APIs, which provide access to internet events displayed on the Amazon CloudWatch Internet Weather Map.

## __Amazon Personalize__
  - ### Features
    - This releases auto training capability while creating a solution and automatically syncing latest solution versions when creating/updating a campaign

# __1.12.704__ __2024-04-18__
## __Amazon GuardDuty__
  - ### Features
    - Added IPv6Address fields for local and remote IP addresses

## __Amazon QuickSight__
  - ### Features
    - This release adds support for the Cross Sheet Filter and Control features, and support for warnings in asset imports for any permitted errors encountered during execution

## __Amazon SageMaker Service__
  - ### Features
    - Removed deprecated enum values and updated API documentation.

## __Amazon WorkSpaces__
  - ### Features
    - Adds new APIs for managing and sharing WorkSpaces BYOL configuration across accounts.

## __EMR Serverless__
  - ### Features
    - This release adds the capability to publish detailed Spark engine metrics to Amazon Managed Service for Prometheus (AMP) for  enhanced monitoring for Spark jobs.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Outpost ARN added to Source Server and Recovery Instance

## __IAM Roles Anywhere__
  - ### Features
    - This release introduces the PutAttributeMapping and DeleteAttributeMapping APIs. IAM Roles Anywhere now provides the capability to define a set of mapping rules, allowing customers to specify which data is extracted from their X.509 end-entity certificates.

# __1.12.703__ __2024-04-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Elastic Compute Cloud (EC2).

## __QBusiness__
  - ### Features
    - This release adds support for IAM Identity Center (IDC) as the identity gateway for Q Business. It also allows users to provide an explicit intent for Q Business to identify how the Chat request should be handled.

# __1.12.702__ __2024-04-16__
## __AWS Elemental MediaPackage v2__
  - ### Features
    - Dash v2 is a MediaPackage V2 feature to support egressing on DASH manifest format.

## __AWS EntityResolution__
  - ### Features
    - Cross Account Resource Support .

## __AWS IoT Wireless__
  - ### Features
    - Add PublicGateways in the GetWirelessStatistics call response, indicating the LoRaWAN public network accessed by the device.

## __AWS Lake Formation__
  - ### Features
    - This release adds Lake Formation managed RAM support for the 4 APIs - "DescribeLakeFormationIdentityCenterConfiguration", "CreateLakeFormationIdentityCenterConfiguration", "DescribeLakeFormationIdentityCenterConfiguration", and "DeleteLakeFormationIdentityCenterConfiguration"

## __AWS Outposts__
  - ### Features
    - This release adds new APIs to allow customers to configure their Outpost capacity at order-time.

## __AWS Well-Architected Tool__
  - ### Features
    - AWS Well-Architected now has a Connector for Jira to allow customers to efficiently track workload risks and improvement efforts and create closed-loop mechanisms.

## __AWSMainframeModernization__
  - ### Features
    - Adding new ListBatchJobRestartPoints API and support for restart batch job.

## __Agents for Amazon Bedrock__
  - ### Features
    - For Create Agent API, the agentResourceRoleArn parameter is no longer required.

## __EMR Serverless__
  - ### Features
    - This release adds support for shuffle optimized disks that allow larger disk sizes and higher IOPS to efficiently run shuffle heavy workloads.

# __1.12.701__ __2024-04-12__
## __AWS CloudFormation__
  - ### Features
    - Adding support for the new parameter "IncludePropertyValues" in the CloudFormation DescribeChangeSet API. When this parameter is included, the DescribeChangeSet response will include more detailed information such as before and after values for the resource properties that will change.

## __AWS Config__
  - ### Features
    - Updates documentation for AWS Config

## __AWS Glue__
  - ### Features
    - Modifying request for GetUnfilteredTableMetadata for view-related fields.

## __AWS IoT Fleet Hub__
  - ### Features
    - Documentation updates for AWS IoT Fleet Hub to clarify that Fleet Hub supports organization instance of IAM Identity Center.

## __AWS Key Management Service__
  - ### Features
    - This feature supports the ability to specify a custom rotation period for automatic key rotations, the ability to perform on-demand key rotations, and visibility into your key material rotations.

## __AWS MediaTailor__
  - ### Features
    - Added InsertionMode to PlaybackConfigurations. This setting controls whether players can use stitched or guided ad insertion. The default for players that do not specify an insertion mode is stitched.

## __AWS Outposts__
  - ### Features
    - This release adds EXPEDITORS as a valid shipment carrier.

## __AWS Transfer Family__
  - ### Features
    - This change releases support for importing self signed certificates to the Transfer Family for sending outbound file transfers over TLS/HTTPS.

## __Amazon HealthLake__
  - ### Features
    - Added new CREATE_FAILED status for data stores. Added new errorCause to DescribeFHIRDatastore API and ListFHIRDatastores API response for additional insights into data store creation and deletion workflows.

## __Amazon Neptune Graph__
  - ### Features
    - Update to API documentation to resolve customer reported issues.

## __Amazon Redshift__
  - ### Features
    - Adds support for Amazon Redshift DescribeClusterSnapshots API to include Snapshot ARN response field.

# __1.12.700__ __2024-04-11__
## __AWS Batch__
  - ### Features
    - This release adds the task properties field to attempt details and the name field on EKS container detail.

## __AWS CodeBuild__
  - ### Features
    - Support access tokens for Bitbucket sources

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive introduces workflow monitor, a new feature that enables the visualization and monitoring of your media workflows. Create signal maps of your existing workflows and monitor them by creating notification and monitoring template groups.

## __AWS Identity and Access Management__
  - ### Features
    - For CreateOpenIDConnectProvider API, the ThumbprintList parameter is no longer required.

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control.

## __AWS WAFV2__
  - ### Features
    - Adds an updated version of smoke tests, including smithy trait, for SDK testing.

## __Amazon CloudFront__
  - ### Features
    - CloudFront origin access control extends support to AWS Lambda function URLs and AWS Elemental MediaPackage v2 origins.

## __Amazon CloudWatch__
  - ### Features
    - This release adds support for Metric Characteristics for CloudWatch Anomaly Detection. Anomaly Detector now takes Metric Characteristics object with Periodic Spikes boolean field that tells Anomaly Detection that spikes that repeat at the same time every week are part of the expected pattern.

## __Amazon EventBridge Pipes__
  - ### Features
    - LogConfiguration ARN validation fixes

## __Amazon Omics__
  - ### Features
    - This release adds support for retrieval of S3 direct access metadata on sequence stores and read sets, and adds support for SHA256up and SHA512up HealthOmics ETags.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for Standard Edition 2 support in RDS Custom for Oracle.

# __1.12.699__ __2024-04-10__
## __AWS Clean Rooms Service__
  - ### Features
    - AWS Clean Rooms Differential Privacy is now fully available. Differential privacy protects against user-identification attempts.

## __AWS Supply Chain__
  - ### Features
    - This release includes API SendDataIntegrationEvent for AWS Supply Chain

## __Amazon CloudWatch Network Monitor__
  - ### Features
    - Examples were added to CloudWatch Network Monitor commands.

## __Amazon Connect Service__
  - ### Features
    - This release adds new Submit Auto Evaluation Action for Amazon Connect Rules.

## __Amazon Q Connect__
  - ### Features
    - This release adds a new QiC public API updateSession and updates an existing QiC public API createSession

## __Amazon Rekognition__
  - ### Features
    - Added support for ContentType to content moderation detections.

## __Amazon WorkSpaces Thin Client__
  - ### Features
    - Adding tags field to SoftwareSet. Removing tags fields from Summary objects. Changing the list of exceptions in tagging APIs. Fixing an issue where the SDK returns empty tags in Get APIs.

# __1.12.698__ __2024-04-09__
## __AWS CodeBuild__
  - ### Features
    - Add new webhook filter types for GitHub webhooks

## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes support for bringing your own fonts to use for burn-in or DVB-Sub captioning workflows.

## __Amazon Pinpoint__
  - ### Features
    - The OrchestrationSendingRoleArn has been added to the email channel and is used to send emails from campaigns or journeys.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for specifying the CA certificate to use for the new db instance when restoring from db snapshot, restoring from s3, restoring to point in time, and creating a db instance read replica.

# __1.12.697__ __2024-04-08__
## __AWS Control Catalog__
  - ### Features
    - This is the initial SDK release for AWS Control Catalog, a central catalog for AWS managed controls. This release includes 3 new APIs - ListDomains, ListObjectives, and ListCommonControls - that vend high-level data to categorize controls across the AWS platform.

## __Amazon CloudWatch Network Monitor__
  - ### Features
    - Updated the allowed monitorName length for CloudWatch Network Monitor.

## __Application Migration Service__
  - ### Features
    - Added USE_SOURCE as default option to LaunchConfigurationTemplate bootMode parameter.

# __1.12.696__ __2024-04-05__
## __AWS Resource Groups__
  - ### Features
    - Added a new QueryErrorCode RESOURCE_TYPE_NOT_SUPPORTED that is returned by the ListGroupResources operation if the group query contains unsupported resource types.

## __Amazon QuickSight__
  - ### Features
    - Adding IAMIdentityCenterInstanceArn parameter to CreateAccountSubscription

## __Amazon Verified Permissions__
  - ### Features
    - Adding BatchIsAuthorizedWithToken API which supports multiple authorization requests against a PolicyStore given a bearer token.

# __1.12.695__ __2024-04-04__
## __AWS B2B Data Interchange__
  - ### Features
    - Adding support for X12 5010 HIPAA EDI version and associated transaction sets.

## __AWS Clean Rooms Service__
  - ### Features
    - Feature: New schemaStatusDetails field to the existing Schema object that displays a status on Schema API responses to show whether a schema is queryable or not. New BatchGetSchemaAnalysisRule API to retrieve multiple schemaAnalysisRules using a single API call.

## __Amazon EMR Containers__
  - ### Features
    - This release adds support for integration with EKS AccessEntry APIs to enable automatic Cluster Access for EMR on EKS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 G6 instances powered by NVIDIA L4 Tensor Core GPUs can be used for a wide range of graphics-intensive and machine learning use cases. Gr6 instances also feature NVIDIA L4 GPUs and can be used for graphics workloads with higher memory requirements.

## __Amazon Interactive Video Service__
  - ### Features
    - API update to include an SRT ingest endpoint and passphrase for all channels.

## __Amazon Verified Permissions__
  - ### Features
    - Adds GroupConfiguration field to Identity Source API's

# __1.12.694__ __2024-04-03__
## __AWS Clean Rooms ML__
  - ### Features
    - The release includes a public SDK for AWS Clean Rooms ML APIs, making them globally available to developers worldwide.

## __AWS CloudFormation__
  - ### Features
    - This release would return a new field - PolicyAction in cloudformation's existed DescribeChangeSetResponse, showing actions we are going to apply on the physical resource (e.g., Delete, Retain) according to the user's template

## __AWS Elemental MediaLive__
  - ### Features
    - Cmaf Ingest outputs are now supported in Media Live

## __AWS Ground Station__
  - ### Features
    - This release adds visibilityStartTime and visibilityEndTime to DescribeContact and ListContacts responses.

## __AWS Health Imaging__
  - ### Features
    - SearchImageSets API now supports following enhancements - Additional support for searching on UpdatedAt and SeriesInstanceUID - Support for searching existing filters between dates/times - Support for sorting the search result by Ascending/Descending - Additional parameters returned in the response

## __AWS Lambda__
  - ### Features
    - Add Ruby 3.3 (ruby3.3) support to AWS Lambda

## __AWS Transfer Family__
  - ### Features
    - Add ability to specify Security Policies for SFTP Connectors

## __Amazon DataZone__
  - ### Features
    - This release supports the feature of dataQuality to enrich asset with dataQualityResult in Amazon DataZone.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release adds Global Cluster Switchover capability which enables you to change your global cluster's primary AWS Region, the region that serves writes, while preserving the replication between all regions in the global cluster.

# __1.12.693__ __2024-04-02__
## __AWS Glue__
  - ### Features
    - Adding View related fields to responses of read-only Table APIs.

## __AWS SDK for Java__
  - ### Features
    - Added an interface to AWSCredentials implementations that will be used to return the signing account ID.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update for Amazon ECS.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Doc-only update. Changed "Resources" to "Key Concepts" in docs and updated text.

## __IAM Roles Anywhere__
  - ### Features
    - This release increases the limit on the roleArns request parameter for the *Profile APIs that support it. This parameter can now take up to 250 role ARNs.

# __1.12.692__ __2024-04-01__
## __AWSDeadlineCloud__
  - ### Features
    - AWS Deadline Cloud is a new fully managed service that helps customers set up, deploy, and scale rendering projects in minutes, so they can improve the efficiency of their rendering pipelines and take on more projects.

## __Amazon CloudWatch__
  - ### Features
    - This release adds support for CloudWatch Anomaly Detection on cross-account metrics. SingleMetricAnomalyDetector and MetricDataQuery inputs to Anomaly Detection APIs now take an optional AccountId field.

## __Amazon DataZone__
  - ### Features
    - This release supports the feature of AI recommendations for descriptions to enrich the business data catalog in Amazon DataZone.

## __Amazon EMR__
  - ### Features
    - This release fixes a broken link in the documentation.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to upgrade the TLS version of the distribution.

# __1.12.691__ __2024-03-29__
## __AWS B2B Data Interchange__
  - ### Features
    - Supporting new EDI X12 transaction sets for X12 versions 4010, 4030, and 5010.

## __AWS CodeBuild__
  - ### Features
    - Add new fleet status code for Reserved Capacity.

## __AWS CodeConnections__
  - ### Features
    - Duplicating the CodeStar Connections service into the new, rebranded AWS CodeConnections service.

## __AWS IoT Wireless__
  - ### Features
    - Add support for retrieving key historical and live metrics for LoRaWAN devices and gateways

## __AWS Marketplace Catalog Service__
  - ### Features
    - This release enhances the ListEntities API to support ResaleAuthorizationId filter and sort for OfferEntity in the request and the addition of a ResaleAuthorizationId field in the response of OfferSummary.

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release adds support to allow customers to track cross account monitors through ListMonitor, GetMonitor, ListHealthEvents, GetHealthEvent, StartQuery APIs.

## __Amazon Neptune Graph__
  - ### Features
    - Add the new API Start-Import-Task for Amazon Neptune Analytics.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for custom images for the CodeEditor App on SageMaker Studio

# __1.12.690__ __2024-03-28__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate recommendations with a new customization preference, Memory Utilization.

## __Amazon CodeCatalyst__
  - ### Features
    - This release adds support for understanding pending changes to subscriptions by including two new response parameters for the GetSubscription API for Amazon CodeCatalyst.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 C7gd, M7gd and R7gd metal instances with up to 3.8 TB of local NVMe-based SSD block-level storage have up to 45% improved real-time NVMe storage performance than comparable Graviton2-based instances.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Add multiple customer error code to handle customer caused failure when managing EKS node groups

## __Amazon GuardDuty__
  - ### Features
    - Add EC2 support for GuardDuty Runtime Monitoring auto management.

## __Amazon Neptune Graph__
  - ### Features
    - Update ImportTaskCancelled waiter to evaluate task state correctly and minor documentation changes.

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight: Adds support for setting up VPC Endpoint restrictions for accessing QuickSight Website.

## __CloudWatch Observability Access Manager__
  - ### Features
    - This release adds support for sharing AWS::InternetMonitor::Monitor resources.

# __1.12.689__ __2024-03-27__
## __AWS Batch__
  - ### Features
    - This feature allows AWS Batch to support configuration of imagePullSecrets and allowPrivilegeEscalation for jobs running on EKS

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Agents for Amazon Bedrock__
  - ### Features
    - This changes introduces metadata documents statistics and also updates the documentation for bedrock agent.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release introduces filtering support on Retrieve and RetrieveAndGenerate APIs.

## __Amazon ElastiCache__
  - ### Features
    - Added minimum capacity to  Amazon ElastiCache Serverless. This feature allows customer to ensure minimum capacity even without current load

# __1.12.688__ __2024-03-26__
## __AWS Cost Explorer Service__
  - ### Features
    - Adds support for backfill of cost allocation tags, with new StartCostAllocationTagBackfill and ListCostAllocationTagBackfillHistory API.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release adds support to customize prompts sent through the RetrieveAndGenerate API in Agents for Amazon Bedrock.

## __Amazon EC2 Container Service__
  - ### Features
    - This is a documentation update for Amazon ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Elastic Compute Cloud (EC2).

## __FinSpace User Environment Management service__
  - ### Features
    - Add new operation delete-kx-cluster-node and add status parameter to list-kx-cluster-node operation.

# __1.12.687__ __2024-03-25__
## __AWS CodeBuild__
  - ### Features
    - Supporting GitLab and GitLab Self Managed as source types in AWS CodeBuild.

## __AWS Elemental MediaLive__
  - ### Features
    - Exposing TileMedia H265 options

## __AWS Global Accelerator__
  - ### Features
    - AWS Global Accelerator now supports cross-account sharing for bring your own IP addresses.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update for Amazon ECS.

## __Amazon EMR Containers__
  - ### Features
    - This release increases the number of supported job template parameters from 20 to 100.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for ModifyInstanceMetadataDefaults and GetInstanceMetadataDefaults to set Instance Metadata Service account defaults

## __Amazon SageMaker Service__
  - ### Features
    - Introduced support for the following new instance types on SageMaker Studio for JupyterLab and CodeEditor applications: m6i, m6id, m7i, c6i, c6id, c7i, r6i, r6id, r7i, and p5

# __1.12.686__ __2024-03-22__
## __AWS Price List Service__
  - ### Features
    - Add ResourceNotFoundException to ListPriceLists and GetPriceListFileUrl APIs

## __AWS SecurityHub__
  - ### Features
    - Added new resource detail object to ASFF, including resource for LastKnownExploitAt

## __AWSKendraFrontendService__
  - ### Features
    - Documentation update, March 2024. Corrects some docs for Amazon Kendra.

## __Amazon Kinesis Firehose__
  - ### Features
    - Updates Amazon Firehose documentation for message regarding Enforcing Tags IAM Policy.

## __IAM Roles Anywhere__
  - ### Features
    - This release relaxes constraints on the durationSeconds request parameter for the *Profile APIs that support it. This parameter can now take on values that go up to 43200.

# __1.12.685__ __2024-03-21__
## __CodeArtifact__
  - ### Features
    - This release adds Package groups to CodeArtifact so you can more conveniently configure package origin controls for multiple packages.

# __1.12.684__ __2024-03-20__
## __AWS CodeBuild__
  - ### Features
    - This release adds support for new webhook events (RELEASED and PRERELEASED) and filter types (TAG_NAME and RELEASE_NAME).

## __AWS Savings Plans__
  - ### Features
    - Introducing the Savings Plans Return feature enabling customers to return their Savings Plans within 7 days of purchase.

## __Access Analyzer__
  - ### Features
    - This release adds support for policy validation and external access findings for DynamoDB tables and streams. IAM Access Analyzer helps you author functional and secure resource-based policies and identify cross-account access. Updated service API, documentation, and paginators.

## __Amazon Connect Service__
  - ### Features
    - This release updates the *InstanceStorageConfig APIs to support a new ResourceType: REAL_TIME_CONTACT_ANALYSIS_CHAT_SEGMENTS. Use this resource type to enable streaming for real-time analysis of chat contacts and to associate a Kinesis stream where real-time analysis chat segments will be published.

## __Amazon DynamoDB__
  - ### Features
    - This release introduces 3 new APIs ('GetResourcePolicy', 'PutResourcePolicy' and 'DeleteResourcePolicy') and modifies the existing 'CreateTable' API for the resource-based policy support. It also modifies several APIs to accept a 'TableArn' for the 'TableName' parameter.

## __Amazon Managed Blockchain Query__
  - ### Features
    - AMB Query: update GetTransaction to include transactionId as input

# __1.12.683__ __2024-03-19__
## __AWS CloudFormation__
  - ### Features
    - Documentation update, March 2024. Corrects some formatting.

## __Amazon CloudWatch Logs__
  - ### Features
    - Update LogSamples field in Anomaly model to be a list of LogEvent

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds the new DescribeMacHosts API operation for getting information about EC2 Mac Dedicated Hosts. Users can now see the latest macOS versions that their underlying Apple Mac can support without needing to be updated.

## __Amazon Managed Blockchain Query__
  - ### Features
    - Introduces a new API for Amazon Managed Blockchain Query: ListFilteredTransactionEvents.

## __FinSpace User Environment Management service__
  - ### Features
    - Adding new attributes readWrite and onDemand to dataview models for Database Maintenance operations.

# __1.12.682__ __2024-03-18__
## __AWS CloudFormation__
  - ### Features
    - This release supports for a new API ListStackSetAutoDeploymentTargets, which provider auto-deployment configuration as a describable resource. Customers can now view the specific combinations of regions and OUs that are being auto-deployed.

## __AWS Key Management Service__
  - ### Features
    - Adds the ability to use the default policy name by omitting the policyName parameter in calls to PutKeyPolicy and GetKeyPolicy

## __AWS MediaTailor__
  - ### Features
    - This release adds support to allow customers to show different content within a channel depending on metadata associated with the viewer.

## __Amazon Relational Database Service__
  - ### Features
    - This release launches the ModifyIntegration API and support for data filtering for zero-ETL Integrations.

## __Amazon Simple Storage Service__
  - ### Features
    - Fix two issues with response root node names.

## __Amazon Timestream Query__
  - ### Features
    - Documentation updates, March 2024

# __1.12.681__ __2024-03-15__
## __AWS Backup__
  - ### Features
    - This release introduces a boolean attribute ManagedByAWSBackupOnly as part of ListRecoveryPointsByResource api to filter the recovery points based on ownership. This attribute can be used to filter out the recovery points protected by AWSBackup.

## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports overflow behavior on Reserved Capacity.

## __Amazon Connect Service__
  - ### Features
    - This release adds Hierarchy based Access Control fields to Security Profile public APIs and adds support for UserAttributeFilter to SearchUsers API.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add media accelerator and neuron device information on the describe instance types API.

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Flink 1.18 in Managed Service for Apache Flink

## __Amazon SageMaker Service__
  - ### Features
    - Adds m6i, m6id, m7i, c6i, c6id, c7i, r6i r6id, r7i, p5 instance type support to Sagemaker Notebook Instances and miscellaneous wording fixes for previous Sagemaker documentation.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3.

## __Amazon WorkSpaces Thin Client__
  - ### Features
    - Removed unused parameter kmsKeyArn from UpdateDeviceRequest

# __1.12.680__ __2024-03-14__
## __AWS Amplify__
  - ### Features
    - Documentation updates for Amplify. Identifies the APIs available only to apps created using Amplify Gen 1.

## __AWS EC2 Instance Connect__
  - ### Features
    - This release includes a new exception type "SerialConsoleSessionUnsupportedException" for SendSerialConsoleSSHPublicKey API.

## __AWS Fault Injection Simulator__
  - ### Features
    - This release adds support for previewing target resources before running a FIS experiment. It also adds resource ARNs for actions, experiments, and experiment templates to API responses.

## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for EBCDIC collation for RDS for Db2.

## __Elastic Load Balancing__
  - ### Features
    - This release allows you to configure HTTP client keep-alive duration for communication between clients and Application Load Balancers.

## __Timestream InfluxDB__
  - ### Features
    - This is the initial SDK release for Amazon Timestream for InfluxDB. Amazon Timestream for InfluxDB is a new time-series database engine that makes it easy for application developers and DevOps teams to run InfluxDB databases on AWS for near real-time time-series applications using open source APIs.

# __1.12.679__ __2024-03-13__
## __Amazon Interactive Video Service RealTime__
  - ### Features
    - adds support for multiple new composition layout configuration options (grid, pip)

## __Amazon Kinesis Analytics__
  - ### Features
    - Support new RuntimeEnvironmentUpdate parameter within UpdateApplication API allowing callers to change the Flink version upon which their application runs.

## __Amazon Simple Storage Service__
  - ### Features
    - This release makes the default option for S3 on Outposts request signing to use the SigV4A algorithm when using AWS Common Runtime (CRT).

# __1.12.678__ __2024-03-12__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation documentation update for March, 2024

## __Amazon Connect Service__
  - ### Features
    - This release increases MaxResults limit to 500 in request for SearchUsers, SearchQueues and SearchRoutingProfiles APIs of Amazon Connect.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - March 2024 doc-only updates for Systems Manager.

## __Managed Streaming for Kafka__
  - ### Features
    - Added support for specifying the starting position of topic replication in MSK-Replicator.

# __1.12.677__ __2024-03-11__
## __AWS CodeStar connections__
  - ### Features
    - Added a sync configuration enum to disable publishing of deployment status to source providers (PublishDeploymentStatus). Added a sync configuration enum (TriggerStackUpdateOn) to only trigger changes.

## __AWS Elemental MediaPackage v2__
  - ### Features
    - This release enables customers to safely update their MediaPackage v2 channel groups, channels and origin endpoints using entity tags.

## __Amazon ElastiCache__
  - ### Features
    - Revisions to API text that are now to be carried over to SDK text, changing usages of "SFO" in code examples to "us-west-1", and some other typos.

# __1.12.676__ __2024-03-08__
## __AWS Batch__
  - ### Features
    - This release adds JobStateTimeLimitActions setting to the Job Queue API. It allows you to configure an action Batch can take for a blocking job in front of the queue after the defined period of time. The new parameter applies for ECS, EKS, and FARGATE Job Queues.

## __AWS CloudTrail__
  - ### Features
    - Added exceptions to CreateTrail, DescribeTrails, and ListImportFailures APIs.

## __AWS CodeBuild__
  - ### Features
    - This release adds support for a new webhook event: PULL_REQUEST_CLOSED.

## __AWS Transfer Family__
  - ### Features
    - Added DES_EDE3_CBC to the list of supported encryption algorithms for messages sent with an AS2 connector.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - Documentation update for Bedrock Runtime Agent

## __Amazon Cognito Identity Provider__
  - ### Features
    - Add ConcurrentModificationException to SetUserPoolMfaConfig

## __Amazon GuardDuty__
  - ### Features
    - Add RDS Provisioned and Serverless Usage types

# __1.12.675__ __2024-03-07__
## __AWS Lambda__
  - ### Features
    - Documentation updates for AWS Lambda

## __AWS WAFV2__
  - ### Features
    - You can increase the max request body inspection size for some regional resources. The size setting is in the web ACL association config. Also, the AWSManagedRulesBotControlRuleSet EnableMachineLearning setting now takes a Boolean instead of a primitive boolean type, for languages like Java.

## __Amazon AppConfig__
  - ### Features
    - AWS AppConfig now supports dynamic parameters, which enhance the functionality of AppConfig Extensions by allowing you to provide parameter values to your Extensions at the time you deploy your configuration.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an optional parameter to RegisterImage and CopyImage APIs to support tagging AMIs at the time of creation.

## __Amazon Import/Export Snowball__
  - ### Features
    - Doc-only update for change to EKS-Anywhere ordering.

## __Amazon Managed Grafana__
  - ### Features
    - Adds support for the new GrafanaToken as part of the Amazon Managed Grafana Enterprise plugins upgrade to associate your AWS account with a Grafana Labs account.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for io2 storage for Multi-AZ DB clusters

## __Amazon WorkSpaces__
  - ### Features
    - Added note for user decoupling

## __Payment Cryptography Data Plane__
  - ### Features
    - AWS Payment Cryptography EMV Decrypt Feature  Release

# __1.12.674__ __2024-03-06__
## __Amazon DynamoDB__
  - ### Features
    - Doc only updates for DynamoDB documentation

## __Amazon Redshift__
  - ### Features
    - Update for documentation only. Covers port ranges, definition updates for data sharing, and definition updates to cluster-snapshot documentation.

## __Amazon Relational Database Service__
  - ### Features
    - Updated the input of CreateDBCluster and ModifyDBCluster to support setting CA certificates. Updated the output of DescribeDBCluster to show current CA certificate setting value.

## __Amazon Verified Permissions__
  - ### Features
    - Deprecating details in favor of configuration for GetIdentitySource and ListIdentitySources APIs.

## __AmazonMWAA__
  - ### Features
    - Amazon MWAA adds support for Apache Airflow v2.8.1.

## __EC2 Image Builder__
  - ### Features
    - Add PENDING status to Lifecycle Execution resource status. Add StartTime and EndTime to ListLifecycleExecutionResource API response.

# __1.12.673__ __2024-03-05__
## __AWS Chatbot__
  - ### Features
    - Minor update to documentation.

## __AWS Organizations__
  - ### Features
    - This release contains an endpoint addition

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon Simple Email Service__
  - ### Features
    - Adds support for providing custom headers within SendEmail and SendBulkEmail for SESv2.

# __1.12.672__ __2024-03-04__
## __AWS CloudFormation__
  - ### Features
    - Add DetailedStatus field to DescribeStackEvents and DescribeStacks APIs

## __AWS Organizations__
  - ### Features
    - Documentation update for AWS Organizations

## __Amazon FSx__
  - ### Features
    - Added support for creating FSx for NetApp ONTAP file systems with up to 12 HA pairs, delivering up to 72 GB/s of read throughput and 12 GB/s of write throughput.

# __1.12.671__ __2024-03-01__
## __Access Analyzer__
  - ### Features
    - Fixed a typo in description field.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release, Amazon EC2 Auto Scaling groups, EC2 Fleet, and Spot Fleet improve the default price protection behavior of attribute-based instance type selection of Spot Instances, to consistently select from a wide range of instance types.

## __Auto Scaling__
  - ### Features
    - With this release, Amazon EC2 Auto Scaling groups, EC2 Fleet, and Spot Fleet improve the default price protection behavior of attribute-based instance type selection of Spot Instances, to consistently select from a wide range of instance types.

# __1.12.670__ __2024-02-29__
## __AWS Migration Hub Orchestrator__
  - ### Features
    - Adds new CreateTemplate, UpdateTemplate and DeleteTemplate APIs.

## __Amazon DocumentDB Elastic Clusters__
  - ### Features
    - Launched Elastic Clusters Readable Secondaries, Start/Stop, Configurable Shard Instance count, Automatic Backups and Snapshot Copying

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added support for new AL2023 AMIs to the supported AMITypes.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release makes AMAZON.QnAIntent generally available in Amazon Lex. This generative AI feature leverages large language models available through Amazon Bedrock to automate frequently asked questions (FAQ) experience for end-users.

## __Amazon QuickSight__
  - ### Features
    - TooltipTarget for Combo chart visuals; ColumnConfiguration limit increase to 2000; Documentation Update

## __Amazon SageMaker Service__
  - ### Features
    - Adds support for ModelDataSource in Model Packages to support unzipped models. Adds support to specify SourceUri for models which allows registration of models without mandating a container for hosting. Using SourceUri, customers can decouple the model from hosting information during registration.

## __Amazon Security Lake__
  - ### Features
    - Add capability to update the Data Lake's MetaStoreManager Role in order to perform required data lake updates to use Iceberg table format in their data lake or update the role for any other reason.

# __1.12.669__ __2024-02-28__
## __AWS Batch__
  - ### Features
    - This release adds Batch support for configuration of multicontainer jobs in ECS, Fargate, and EKS. This support is available for all types of jobs, including both array jobs and multi-node parallel jobs.

## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces the new API 'GetApproximateUsageRecords', which retrieves estimated usage records for hourly granularity or resource-level data at daily granularity.

## __AWS IoT__
  - ### Features
    - This release reduces the maximum results returned per query invocation from 500 to 100 for the SearchIndex API. This change has no implications as long as the API is invoked until the nextToken is NULL.

## __AWS WAFV2__
  - ### Features
    - AWS WAF now supports configurable time windows for request aggregation with rate-based rules. Customers can now select time windows of 1 minute, 2 minutes or 10 minutes, in addition to the previously supported 5 minutes.

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release adds support to override search strategy performed by the Retrieve and RetrieveAndGenerate APIs for Amazon Bedrock Agents

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release increases the range of MaxResults for GetNetworkInsightsAccessScopeAnalysisFindings to 1,000.

# __1.12.668__ __2024-02-27__
## __AWS Amplify UI Builder__
  - ### Features
    - We have added the ability to tag resources after they are created

# __1.12.667__ __2024-02-26__
## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for gp3 data volumes for Multi-AZ DB Clusters.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Added volume status to DescribeSourceServer replicated volumes.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - Adds support for tagging, with new TagResource, UntagResource and ListTagsForResource APIs to manage tags and updates to existing APIs to allow tag on create. This release also adds support for the new DeleteWorkerConfiguration API.

# __1.12.666__ __2024-02-23__
## __AWS AppSync__
  - ### Features
    - Documentation only updates for AppSync

## __Amazon QLDB__
  - ### Features
    - Clarify possible values for KmsKeyArn and EncryptionDescription.

## __Amazon Relational Database Service__
  - ### Features
    - Add pattern and length based validations for DBShardGroupIdentifier

## __CloudWatch RUM__
  - ### Features
    - Doc-only update for new RUM metrics that were added

# __1.12.665__ __2024-02-22__
## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release adds IPv4 prefixes to health events

## __Amazon Kinesis Video Streams__
  - ### Features
    - Increasing NextToken parameter length restriction for List APIs from 512 to 1024.

# __1.12.664__ __2024-02-21__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports the ability to restart pipelines in a running channel.

## __AWS IoT Events__
  - ### Features
    - Increase the maximum length of descriptions for Inputs, Detector Models, and Alarm Models

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds a field exposing model quality to read APIs for models. It also adds a model quality field to the API response when creating an inference scheduler.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds support for sharing Systems Manager parameters with other AWS accounts.

# __1.12.663__ __2024-02-20__
## __AWS Lambda__
  - ### Features
    - Add .NET 8 (dotnet8) Runtime support to AWS Lambda.

## __Amazon DynamoDB__
  - ### Features
    - Publishing quick fix for doc only update.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release updates a few Firehose related APIs.

# __1.12.662__ __2024-02-19__
## __AWS Amplify__
  - ### Features
    - This release contains API changes that enable users to configure their Amplify domains with their own custom SSL/TLS certificate.

## __AWS Config__
  - ### Features
    - Documentation updates for the AWS Config CLI

## __AWS MediaTailor__
  - ### Features
    - MediaTailor: marking #AdBreak.OffsetMillis as required.

## __Amazon Interactive Video Service__
  - ### Features
    - Changed description for latencyMode in Create/UpdateChannel and Channel/ChannelSummary.

## __Amazon Keyspaces__
  - ### Features
    - Documentation updates for Amazon Keyspaces

## __chatbot__
  - ### Features
    - This release adds support for AWS Chatbot. You can now monitor, operate, and troubleshoot your AWS resources with interactive ChatOps using the AWS SDK.

# __1.12.661__ __2024-02-16__
## __AWS Lambda__
  - ### Features
    - Documentation-only updates for Lambda to clarify a number of existing actions and properties.

## __Amazon Connect Participant Service__
  - ### Features
    - Doc only update to GetTranscript API reference guide to inform users about presence of events in the chat transcript.

## __Amazon EMR__
  - ### Features
    - adds fine grained control over Unhealthy Node Replacement to Amazon ElasticMapReduce

## __Amazon Kinesis Firehose__
  - ### Features
    - This release adds support for Data Message Extraction for decompressed CloudWatch logs, and to use a custom file extension or time zone for S3 destinations.

## __Amazon Relational Database Service__
  - ### Features
    - Doc only update for a valid option in DB parameter group

## __Amazon Simple Notification Service__
  - ### Features
    - This release marks phone numbers as sensitive inputs.

# __1.12.660__ __2024-02-15__
## __AWS Artifact__
  - ### Features
    - This is the initial SDK release for AWS Artifact. AWS Artifact provides on-demand access to compliance and third-party compliance reports. This release includes access to List and Get reports, along with their metadata. This release also includes access to AWS Artifact notifications settings.

## __AWS CodePipeline__
  - ### Features
    - Add ability to override timeout on action level.

## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager

## __Amazon Detective__
  - ### Features
    - Doc only updates for content enhancement

## __Amazon GuardDuty__
  - ### Features
    - Marked fields IpAddressV4, PrivateIpAddress, Email as Sensitive.

## __Amazon HealthLake__
  - ### Features
    - This release adds a new response parameter, JobProgressReport, to the DescribeFHIRImportJob and ListFHIRImportJobs API operation. JobProgressReport provides details on the progress of the import job on the server.

## __Amazon OpenSearch Service__
  - ### Features
    - Adds additional supported instance types.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds 1 new voice - Burcu (tr-TR)

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new API UpdateClusterSoftware for SageMaker HyperPod. This API allows users to patch HyperPod clusters with latest platform softwares.

# __1.12.659__ __2024-02-14__
## __AWS Control Tower__
  - ### Features
    - Adds support for new Baseline and EnabledBaseline APIs for automating multi-account governance.

## __Amazon Lookout for Equipment__
  - ### Features
    - This feature allows customers to see pointwise model diagnostics results for their models.

## __QBusiness__
  - ### Features
    - This release adds the metadata-boosting feature, which allows customers to easily fine-tune the underlying ranking of retrieved RAG passages in order to optimize Q&A answer relevance. It also adds new feedback reasons for the PutFeedback API.

# __1.12.658__ __2024-02-13__
## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace Catalog API now supports setting intent on requests

## __AWS Resource Explorer__
  - ### Features
    - Resource Explorer now uses newly supported IPv4 'amazonaws.com' endpoints by default.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to upgrade the major version of a database.

## __Amazon Security Lake__
  - ### Features
    - Documentation updates for Security Lake

# __1.12.657__ __2024-02-12__
## __AWS AppSync__
  - ### Features
    - Adds support for new options on GraphqlAPIs, Resolvers and  Data Sources for emitting Amazon CloudWatch metrics for enhanced monitoring of AppSync APIs.

## __Amazon CloudWatch__
  - ### Features
    - This release enables PutMetricData API request payload compression by default.

## __Amazon Neptune Graph__
  - ### Features
    - Adding a new option "parameters" for data plane api ExecuteQuery to support running parameterized query via SDK.

## __Amazon Route 53 Domains__
  - ### Features
    - This release adds bill contact support for RegisterDomain, TransferDomain, UpdateDomainContact and GetDomainDetail API.

# __1.12.656__ __2024-02-09__
## __AWS Batch__
  - ### Features
    - This feature allows Batch to support configuration of repository credentials for jobs running on ECS

## __AWS IoT__
  - ### Features
    - This release allows AWS IoT Core users to enable Online Certificate Status Protocol (OCSP) Stapling for TLS X.509 Server Certificates when creating and updating AWS IoT Domain Configurations with Custom Domain.

## __AWS Price List Service__
  - ### Features
    - Add Throttling Exception to all APIs.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update for Amazon ECS.

## __Amazon Prometheus Service__
  - ### Features
    - Overall documentation updates.

## __Braket__
  - ### Features
    - Creating a job will result in DeviceOfflineException when using an offline device, and DeviceRetiredException when using a retired device.

## __Cost Optimization Hub__
  - ### Features
    - Adding includeMemberAccounts field to the response of ListEnrollmentStatuses API.

# __1.12.655__ __2024-02-08__
## __AWS CodePipeline__
  - ### Features
    - Add ability to execute pipelines with new parallel & queued execution modes and add support for triggers with filtering on branches and file paths.

## __Amazon QuickSight__
  - ### Features
    - General Interactions for Visuals; Waterfall Chart Color Configuration; Documentation Update

## __Amazon WorkSpaces__
  - ### Features
    - This release introduces User-Decoupling feature. This feature allows Workspaces Core customers to provision workspaces without providing users. CreateWorkspaces and DescribeWorkspaces APIs will now take a new optional parameter "WorkspaceName".

# __1.12.654__ __2024-02-07__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports manifests for specifying files or objects to transfer.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces a new bot replication feature as part of Lex Global Resiliency offering. This feature leverages a new set of APIs that allow customers to create bot replicas and replicate changes to bots across regions.

## __Amazon Redshift__
  - ### Features
    - LisRecommendations API to fetch Amazon Redshift Advisor recommendations.

# __1.12.653__ __2024-02-06__
## __AWS AppSync__
  - ### Features
    - Support for environment variables in AppSync GraphQL APIs

## __AWS WAFV2__
  - ### Features
    - You can now delete an API key that you've created for use with your CAPTCHA JavaScript integration API.

## __Amazon CloudWatch Logs__
  - ### Features
    - This release adds a new field, logGroupArn, to the response of the logs:DescribeLogGroups action.

## __Amazon EC2 Container Service__
  - ### Features
    - This release is a documentation only update to address customer issues.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds clear visibility to the customers on the changes that they make on the domain.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds clear visibility to the customers on the changes that they make on the domain.

# __1.12.652__ __2024-02-05__
## __AWS Glue__
  - ### Features
    - Introduce Catalog Encryption Role within Glue Data Catalog Settings. Introduce SASL/PLAIN as an authentication method for Glue Kafka connections

## __Amazon WorkSpaces__
  - ### Features
    - Added definitions of various WorkSpace states

# __1.12.651__ __2024-02-02__
## __Amazon DynamoDB__
  - ### Features
    - Any number of users can execute up to 50 concurrent restores (any type of restore) in a given account.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Canvas adds GenerativeAiSettings support for CanvasAppSettings.

# __1.12.650__ __2024-02-01__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes support for broadcast-mixed audio description tracks.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Added CreateIdentityProvider and UpdateIdentityProvider details for new SAML IdP features

## __Amazon Interactive Video Service__
  - ### Features
    - This release introduces a new resource Playback Restriction Policy which can be used to geo-restrict or domain-restrict channel stream playback when associated with a channel.  New APIs to support this resource were introduced in the form of Create/Delete/Get/Update/List.

## __Amazon Managed Blockchain Query__
  - ### Features
    - This release adds support for transactions that have not reached finality. It also removes support for the status property from the response of the GetTransaction operation. You can use the confirmationStatus and executionStatus properties to determine the status of the transaction.

## __Amazon Neptune Graph__
  - ### Features
    - Adding new APIs in SDK for Amazon Neptune Analytics. These APIs include operations to execute, cancel, list queries and get the graph summary.

# __1.12.649__ __2024-01-31__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation IaC generator allows you to scan existing resources in your account and select resources to generate a template for a new or existing CloudFormation stack.

## __AWS Glue__
  - ### Features
    - Update page size limits for GetJobRuns and GetTriggers APIs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds an optional Duration parameter to StateManager Associations. This allows customers to specify how long an apply-only-on-cron association execution should run. Once the specified Duration is out all the ongoing cancellable commands or automations are cancelled.

## __Elastic Load Balancing__
  - ### Features
    - This release enables unhealthy target draining intervals for Network Load Balancers.

# __1.12.648__ __2024-01-30__
## __Amazon DataZone__
  - ### Features
    - Add new skipDeletionCheck to DeleteDomain. Add new skipDeletionCheck to DeleteProject which also automatically deletes dependent objects

## __Amazon Route 53__
  - ### Features
    - Update the SDKs for text changes in the APIs.

# __1.12.647__ __2024-01-29__
## __Amazon Comprehend__
  - ### Features
    - Comprehend PII analysis now supports Spanish input documents.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Fleet customers who use attribute based instance-type selection can now intuitively define their Spot instances price protection limit as a percentage of the lowest priced On-Demand instance type.

## __Amazon Import/Export Snowball__
  - ### Features
    - Modified description of createaddress to include direction to add path when providing a JSON file.

## __Amazon Relational Database Service__
  - ### Features
    - Introduced support for the InsufficientDBInstanceCapacityFault error in the RDS RestoreDBClusterFromSnapshot and RestoreDBClusterToPointInTime API methods. This provides enhanced error handling, ensuring a more robust experience.

## __AmazonMWAA__
  - ### Features
    - This release adds MAINTENANCE environment status for Amazon MWAA environments.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling customers who use attribute based instance-type selection can now intuitively define their Spot instances price protection limit as a percentage of the lowest priced On-Demand instance type.

# __1.12.646__ __2024-01-26__
## __Amazon Connect Service__
  - ### Features
    - Update list and string length limits for predefined attributes.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now provides an API to programmatically delete tuning jobs.

## __Inspector2__
  - ### Features
    - This release adds ECR container image scanning based on their lastRecordedPullTime.

# __1.12.645__ __2024-01-25__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Private CA now supports an option to omit the CDP extension from issued certificates, when CRL revocation is enabled.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for IPv6-only instance plans.

# __1.12.644__ __2024-01-24__
## __AWS Outposts__
  - ### Features
    - DeviceSerialNumber parameter is now optional in StartConnection API

## __AWS Storage Gateway__
  - ### Features
    - Add DeprecationDate and SoftwareVersion to response of ListGateways.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduced a new clientToken request parameter on CreateNetworkAcl and CreateRouteTable APIs. The clientToken parameter allows idempotent operations on the APIs.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Aurora Limitless Database.

# __1.12.643__ __2024-01-23__
## __Inspector2__
  - ### Features
    - This release adds support for CIS scans on EC2 instances.

# __1.12.642__ __2024-01-22__
## __AWS AppConfig Data__
  - ### Features
    - Fix FIPS Endpoints in aws-us-gov.

## __AWS Cloud9__
  - ### Features
    - Doc-only update around removing AL1 from list of available AMIs for Cloud9

## __AWS Organizations__
  - ### Features
    - Doc only update for quota increase change

## __Amazon CloudFront KeyValueStore__
  - ### Features
    - This release improves upon the DescribeKeyValueStore API by returning two additional fields, Status of the KeyValueStore and the FailureReason in case of failures during creation of KeyValueStore.

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to view audit history on a case and introduces a new parameter, performedBy, for CreateCase and UpdateCase API's.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for Transport Layer Security (TLS) and Configurable Timeout to ECS Service Connect. TLS facilitates privacy and data security for inter-service communications, while Configurable Timeout allows customized per-request timeout and idle timeout for Service Connect services.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Relational Database Service__
  - ### Features
    - Introduced support for the InsufficientDBInstanceCapacityFault error in the RDS CreateDBCluster API method. This provides enhanced error handling, ensuring a more robust experience when creating database clusters with insufficient instance capacity.

## __FinSpace User Environment Management service__
  - ### Features
    - Allow customer to set zip default through command line arguments.

# __1.12.641__ __2024-01-19__
## __AWS CodeBuild__
  - ### Features
    - Release CodeBuild Reserved Capacity feature

## __Amazon Athena__
  - ### Features
    - Introducing new NotebookS3LocationUri parameter to Athena ImportNotebook API. Payload is no longer required and either Payload or NotebookS3LocationUri needs to be provided (not both) for a successful ImportNotebook API call. If both are provided, an InvalidRequestException will be thrown.

## __Amazon DynamoDB__
  - ### Features
    - This release adds support for including ApproximateCreationDateTimePrecision configurations in EnableKinesisStreamingDestination API, adds the same as an optional field in the response of DescribeKinesisStreamingDestination, and adds support for a new UpdateKinesisStreamingDestination API.

## __Amazon Q Connect__
  - ### Features
    - Increased Quick Response name max length to 100

# __1.12.640__ __2024-01-18__
## __AWS B2B Data Interchange__
  - ### Features
    - Increasing TestMapping inputFileContent file size limit to 5MB and adding file size limit 250KB for TestParsing input file. This release also includes exposing InternalServerException for Tag APIs.

## __AWS CloudTrail__
  - ### Features
    - This release adds a new API ListInsightsMetricData to retrieve metric data from CloudTrail Insights.

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 now supports 3 groupings

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for Snowflake as a Kinesis Data Firehose delivery destination.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Increase BatchGetRecord limits from 10 items to 100 items

## __Elastic Disaster Recovery Service__
  - ### Features
    - Removed invalid and unnecessary default values.

# __1.12.639__ __2024-01-17__
## __Amazon DynamoDB__
  - ### Features
    - Updating note for enabling streams for UpdateTable.

## __Amazon Keyspaces__
  - ### Features
    - This release adds support for Multi-Region Replication with provisioned tables, and Keyspaces auto scaling APIs

# __1.12.638__ __2024-01-16__
## __AWS IoT__
  - ### Features
    - Revert release of LogTargetTypes

## __AWS IoT FleetWise__
  - ### Features
    - Updated APIs: SignalNodeType query parameter has been added to ListSignalCatalogNodesRequest and ListVehiclesResponse has been extended with attributes field.

## __AWS SDK for Java__
  - ### Deprecations
    - Remove support for ion-java

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __Amazon Macie 2__
  - ### Features
    - This release adds support for analyzing Amazon S3 objects that are encrypted using dual-layer server-side encryption with AWS KMS keys (DSSE-KMS). It also adds support for reporting DSSE-KMS details in statistics and metadata about encryption settings for S3 buckets and objects.

## __Amazon Personalize__
  - ### Features
    - Documentation updates for Amazon Personalize.

## __Amazon Personalize Runtime__
  - ### Features
    - Documentation updates for Amazon Personalize

## __Amazon Rekognition__
  - ### Features
    - This release adds ContentType and TaxonomyLevel attributes to DetectModerationLabels and GetMediaAnalysisJob API responses.

## __Payment Cryptography Control Plane__
  - ### Features
    - Provide an additional option for key exchange using RSA wrap/unwrap in addition to tr-34/tr-31 in ImportKey and ExportKey operations. Added new key usage (type) TR31_M1_ISO_9797_1_MAC_KEY, for use with Generate/VerifyMac dataplane operations  with ISO9797 Algorithm 1 MAC calculations.

# __1.12.637__ __2024-01-14__
## __Amazon SageMaker Service__
  - ### Features
    - This release will have ValidationException thrown if certain invalid app types are provided. The release will also throw ValidationException if more than 10 account ids are provided in VpcOnlyTrustedAccounts.

# __1.12.636__ __2024-01-12__
## __AWS S3 Control__
  - ### Features
    - S3 On Outposts team adds dualstack endpoints support for S3Control and S3Outposts API calls.

## __AWS SDK for Java__
  - ### Features
    - Add Java SDK v1 End-of-Support Announcement to README.

## __AWS Supply Chain__
  - ### Features
    - This release includes APIs CreateBillOfMaterialsImportJob and GetBillOfMaterialsImportJob.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports static IP addresses for SFTP & AS2 connectors and for async MDNs on AS2 servers.

## __Amazon Connect Participant Service__
  - ### Features
    - Introduce new Supervisor participant role

## __Amazon Connect Service__
  - ### Features
    - Supervisor Barge for Chat is now supported through the MonitorContact API.

## __Amazon Location Service__
  - ### Features
    - Location SDK documentation update. Added missing fonts to the MapConfiguration data type. Updated note for the SubMunicipality property in the place data type.

## __AmazonMWAA__
  - ### Features
    - This Amazon MWAA feature release includes new fields in CreateWebLoginToken response model. The new fields IamIdentity and AirflowIdentity will let you match identifications, as the Airflow identity length is currently hashed to 64 characters.

# __1.12.635__ __2024-01-11__
## __AWS IoT__
  - ### Features
    - Add ConflictException to Update APIs of AWS IoT Software Package Catalog

## __AWS IoT FleetWise__
  - ### Features
    - The following dataTypes have been removed: CUSTOMER_DECODED_INTERFACE in NetworkInterfaceType; CUSTOMER_DECODED_SIGNAL_INFO_IS_NULL in SignalDecoderFailureReason; CUSTOMER_DECODED_SIGNAL_NETWORK_INTERFACE_INFO_IS_NULL in NetworkInterfaceFailureReason; CUSTOMER_DECODED_SIGNAL in SignalDecoderType

## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for adding an ElasticBlockStorage volume configurations in ECS RunTask/StartTask/CreateService/UpdateService APIs. The configuration allows for attaching EBS volumes to ECS Tasks.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for adding an ElasticBlockStorage volume configurations in ECS RunTask/StartTask/CreateService/UpdateService APIs. The configuration allows for attaching EBS volumes to ECS Tasks.

## __Amazon EventBridge__
  - ### Features
    - Adding AppSync as an EventBridge Target

## __Amazon WorkSpaces__
  - ### Features
    - Added AWS Workspaces RebootWorkspaces API - Extended Reboot documentation update

# __1.12.634__ __2024-01-10__
## __AWS SDK for Java__
  - ### Features
    - Add environment option to disable falling back to IMDSv1 if IMDSv2 is not available. To disable the fallback, set either the `AWS_EC2_METADATA_V1_DISABLED` environment variable or `com.amazonaws.sdk.disableEc2MetadataV1` system property to `true`. See https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-instance-metadata-service.html for more information.

## __Amazon CloudWatch Logs__
  - ### Features
    - Add support for account level subscription filter policies to PutAccountPolicy, DescribeAccountPolicies, and DeleteAccountPolicy APIs. Additionally, PutAccountPolicy has been modified with new optional "selectionCriteria" parameter for resource selection.

## __Amazon Connect Wisdom Service__
  - ### Features
    - QueryAssistant and GetRecommendations will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024 you will need to create a new Assistant in the Connect console and integrate the Amazon Q in Connect JavaScript library (amazon-q-connectjs) into your applications.

## __Amazon Location Service__
  - ### Features
    - This release adds API support for custom layers for the maps service APIs: CreateMap, UpdateMap, DescribeMap.

## __Amazon Q Connect__
  - ### Features
    - QueryAssistant and GetRecommendations will be discontinued starting June 1, 2024. To receive generative responses after March 1, 2024 you will need to create a new Assistant in the Connect console and integrate the Amazon Q in Connect JavaScript library (amazon-q-connectjs) into your applications.

## __Amazon Route 53__
  - ### Features
    - Route53 now supports geoproximity routing in AWS regions

## __AmazonConnectCampaignService__
  - ### Features
    - Minor pattern updates for Campaign and Dial Request API fields.

## __Redshift Serverless__
  - ### Features
    - Updates to ConfigParameter for RSS workgroup, removal of use_fips_ssl

# __1.12.633__ __2024-01-08__
## __AWS CodeBuild__
  - ### Features
    - Aws CodeBuild now supports new compute type BUILD_GENERAL1_XLARGE

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 R7iz bare metal instances are powered by custom 4th generation Intel Xeon Scalable processors.

## __Amazon Route 53 Resolver__
  - ### Features
    - This release adds support for query type configuration on firewall rules that enables customers for granular action (ALLOW, ALERT, BLOCK) by DNS query type.

# __1.12.632__ __2024-01-05__
## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS Key Management Service (KMS).

## __Amazon Connect Service__
  - ### Features
    - Minor trait updates for User APIs

## __Amazon Q Connect__
  - ### Features
    - Marked SearchQuickResponses API as readonly.

## __Redshift Serverless__
  - ### Features
    - use_fips_ssl and require_ssl parameter support for Workgroup, UpdateWorkgroup, and CreateWorkgroup

# __1.12.631__ __2024-01-04__
## __AWS Config__
  - ### Features
    - Updated ResourceType enum with new resource types onboarded by AWS Config in November and December 2023.

## __AWS Service Catalog__
  - ### Features
    - Added Idempotency token support to Service Catalog  AssociateServiceActionWithProvisioningArtifact, DisassociateServiceActionFromProvisioningArtifact, DeleteServiceAction API

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Adding PerformanceInsightsEnabled and PerformanceInsightsKMSKeyId fields to DescribeDBInstances Response.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for managed instance draining which facilitates graceful termination of Amazon ECS instances.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds support for new or existing Amazon OpenSearch domains to enable TLS 1.3 or TLS 1.2 with perfect forward secrecy cipher suites for domain endpoints.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to set up an HTTPS endpoint on an instance.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for new or existing Amazon OpenSearch domains to enable TLS 1.3 or TLS 1.2 with perfect forward secrecy cipher suites for domain endpoints.

## __Amazon SageMaker Service__
  - ### Features
    - Adding support for provisioned throughput mode for SageMaker Feature Groups

# __1.12.630__ __2024-01-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes video engine updates including HEVC improvements, support for ingesting VP9 encoded video in MP4 containers, and support for user-specified 3D LUTs.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect, Contact Lens Evaluation API increase evaluation notes max length to 3072.

# __1.12.629__ __2023-12-29__
## __AWS App Runner__
  - ### Features
    - AWS App Runner adds Python 3.11 and Node.js 18 runtimes.

## __Amazon Location Service__
  - ### Features
    - This release introduces a new parameter to bypasses an API key's expiry conditions and delete the key.

## __Amazon QuickSight__
  - ### Features
    - Add LinkEntityArn support for different partitions; Add UnsupportedUserEditionException in UpdateDashboardLinks API; Add support for New Reader Experience Topics

# __1.12.628__ __2023-12-28__
## __AWS CodeStar connections__
  - ### Features
    - New integration with the GitLab self-managed provider type.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - NoDataRetentionException thrown when GetImages requested for a Stream that does not retain data (that is, has a DataRetentionInHours of 0).

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Studio now supports Docker access from within app container

# __1.12.627__ __2023-12-27__
## __Amazon EMR__
  - ### Features
    - Add support for customers to modify cluster attribute auto-terminate post cluster launch

# __1.12.626__ __2023-12-26__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

# __1.12.625__ __2023-12-22__
## __AWS Glue__
  - ### Features
    - This release adds additional configurations for Query Session Context on the following APIs: GetUnfilteredTableMetadata, GetUnfilteredPartitionMetadata, GetUnfilteredPartitionsMetadata.

## __AWS Lake Formation__
  - ### Features
    - This release adds additional configurations on GetTemporaryGlueTableCredentials for Query Session Context.

## __AWS MediaConnect__
  - ### Features
    - This release adds the DescribeSourceMetadata API. This API can be used to view the stream information of the flow's source.

## __AWS Secrets Manager__
  - ### Features
    - Update endpoint rules and examples.

## __Agents for Amazon Bedrock__
  - ### Features
    - Adding Claude 2.1 support to Bedrock Agents

## __Amazon CloudWatch Network Monitor__
  - ### Features
    - CloudWatch Network Monitor is a new service within CloudWatch that will help network administrators and operators continuously monitor network performance metrics such as round-trip-time and packet loss between their AWS-hosted applications and their on-premises locations.

## __Amazon Omics__
  - ### Features
    - Provides minor corrections and an updated description of APIs.

## __Amazon Simple Storage Service__
  - ### Features
    - Added additional examples for some operations.

# __1.12.624__ __2023-12-21__
## __AWS CodeCommit__
  - ### Features
    - AWS CodeCommit now supports customer managed keys from AWS Key Management Service. UpdateRepositoryEncryptionKey is added for updating the key configuration. CreateRepository, GetRepository, BatchGetRepositories are updated with new input or output parameters.

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports the ability to configure the audio that an AWS Elemental Link UHD device produces, when the device is configured as the source for a flow in AWS Elemental MediaConnect.

## __AWS RDS DataService__
  - ### Features
    - This release adds support for using RDS Data API with Aurora PostgreSQL Serverless v2 and provisioned DB clusters.

## __Agents for Amazon Bedrock__
  - ### Features
    - This release introduces Amazon Aurora as a vector store on Knowledge Bases for Amazon Bedrock

## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service adds DeleteApplication API for deleting applications, and updates APIs to support third party applications reacting to workspace events and make data requests to Amazon Connect for agent and contact events.

## __Amazon Connect Service__
  - ### Features
    - Adds APIs to manage User Proficiencies and Predefined Attributes. Enhances StartOutboundVoiceContact API input. Introduces SearchContacts API. Enhances DescribeContact API. Adds an API to update Routing Attributes in QueuePriority and QueueTimeAdjustmentSeconds.

## __Amazon Neptune Graph__
  - ### Features
    - Adds Waiters for successful creation and deletion of Graph, Graph Snapshot, Import Task and Private Endpoints for Neptune Analytics

## __Amazon Prometheus Service__
  - ### Features
    - This release updates Amazon Managed Service for Prometheus APIs to support customer managed KMS keys.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for using RDS Data API with Aurora PostgreSQL Serverless v2 and provisioned DB clusters.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Training now provides model training container access for debugging purposes. Amazon SageMaker Search now provides the ability to use visibility conditions to limit resource access to a single domain or multiple domains.

# __1.12.623__ __2023-12-20__
## __AWS MediaTailor__
  - ### Features
    - Adds the ability to configure time shifting on MediaTailor channels using the TimeShiftConfiguration field

## __AWS SDK for Java__
  - ### Features
    - Adding support for ca-west-1 that is CA_Calgary region

## __Amazon AppStream__
  - ### Features
    - This release introduces configurable clipboard, allowing admins to specify the maximum length of text that can be copied by the users from their device to the remote session and vice-versa.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Add support for cluster insights, new EKS capability that surfaces potentially upgrade impacting issues.

## __Amazon GuardDuty__
  - ### Features
    - This release 1) introduces a new API: GetOrganizationStatistics , and 2) adds a new UsageStatisticType TOP_ACCOUNTS_BY_FEATURE for GetUsageStatistics API

## __Amazon Managed Blockchain Query__
  - ### Features
    - Adding Confirmation Status and Execution Status to GetTransaction Response.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Canada West (Calgary) Region (ca-west-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

# __1.12.622__ __2023-12-19__
## __AWS AppSync__
  - ### Features
    - This release adds additional configurations on GraphQL APIs for limits on query depth, resolver count, and introspection

## __AWS Marketplace Catalog Service__
  - ### Features
    - AWS Marketplace now supports a new API, BatchDescribeEntities, which returns metadata and content for multiple entities.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Add meeting features to specify a maximum camera resolution, a maximum content sharing resolution, and a maximum number of attendees for a given meeting.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Provision BYOIPv4 address ranges and advertise them by specifying the network border groups option in Los Angeles, Phoenix and Dallas AWS Local Zones.

## __Amazon FSx__
  - ### Features
    - Added support for FSx for OpenZFS on-demand data replication across AWS accounts and/or regions.Added the IncludeShared attribute for DescribeSnapshots.Added the CopyStrategy attribute for OpenZFSVolumeConfiguration.

## __Amazon Relational Database Service__
  - ### Features
    - RDS - The release adds two new APIs: DescribeDBRecommendations and ModifyDBRecommendation

# __1.12.621__ __2023-12-18__
## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports trigger versions that define the fields in the request sent to pre token generation Lambda triggers.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Add support for EKS Cluster Access Management.

## __Amazon QuickSight__
  - ### Features
    - A docs-only release to add missing entities to the API reference.

## __Amazon Route 53 Resolver__
  - ### Features
    - Add DOH protocols in resolver endpoints.

# __1.12.620__ __2023-12-15__
## __AWS Cloud9__
  - ### Features
    - Updated Cloud9 API documentation for AL2023 release

## __AWS Key Management Service__
  - ### Features
    - Documentation updates for AWS Key Management Service

## __Amazon Connect Cases__
  - ### Features
    - Increase number of fields that can be included in CaseEventIncludedData from 50 to 200

## __Amazon Connect Service__
  - ### Features
    - Adds relatedContactId field to StartOutboundVoiceContact API input. Introduces PauseContact API and ResumeContact API for Task contacts. Adds pause duration, number of pauses, timestamps for last paused and resumed events to DescribeContact API response. Adds new Rule type and new Rule action.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation by adding code examples

## __Amazon SageMaker Service__
  - ### Features
    - This release 1) introduces a new API: DeleteCompilationJob , and 2) adds InfraCheckConfig for Create/Describe training job API

# __1.12.619__ __2023-12-14__
## __AWS B2B Data Interchange__
  - ### Features
    - Documentation updates for AWS B2B Data Interchange

## __AWS Control Tower__
  - ### Features
    - Documentation updates for AWS Control Tower.

## __AWS IoT__
  - ### Features
    - This release adds the ability to self-manage certificate signing in AWS IoT Core fleet provisioning using the new certificate provider resource.

## __AWSBillingConductor__
  - ### Features
    - Billing Conductor is releasing a new API, GetBillingGroupCostReport, which provides the ability to retrieve/view the Billing Group Cost Report broken down by attributes for a specific billing group.

## __Amazon AppStream__
  - ### Features
    - This release includes support for images of Windows Server 2022 platform.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for more granular billing using tags (key:value pairs)

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift adds the ability to add and update the game properties of active game sessions.

## __Amazon Kinesis Firehose__
  - ### Features
    - This release, 1) adds configurable buffering hints for the Splunk destination, and 2) reduces the minimum configurable buffering interval for supported destinations

## __Amazon Neptune Graph__
  - ### Features
    - This is the initial SDK release for Amazon Neptune Analytics

## __Amazon OpenSearch Service__
  - ### Features
    - Updating documentation for Amazon OpenSearch Service support for new zero-ETL integration with Amazon S3.

## __Amazon QuickSight__
  - ### Features
    - Update Dashboard Links support; SingleAxisOptions support; Scatterplot Query limit support.

## __Amazon WorkSpaces__
  - ### Features
    - Updated note to ensure customers understand running modes.

# __1.12.618__ __2023-12-13__
## __Elastic Disaster Recovery Service__
  - ### Features
    - Adding AgentVersion to SourceServer and RecoveryInstance structures

# __1.12.617__ __2023-12-13__
# __1.12.616__ __2023-12-13__
# __1.12.615__ __2023-12-13__
# __1.12.614__ __2023-12-12__
# __1.12.613__ __2023-12-12__
# __1.12.612__ __2023-12-12__
# __1.12.611__ __2023-12-12__
## __Amazon CloudWatch Logs__
  - ### Features
    - This release introduces the StartLiveTail API to tail ingested logs in near real time.

## __Amazon Location Service__
  - ### Features
    - This release 1)  adds sub-municipality field in Places API for searching and getting places information, and 2) allows optimizing route calculation based on expected arrival time.

## __EC2 Image Builder__
  - ### Features
    - This release adds the Image Workflows feature to give more flexibility and control over the image building and testing process.

# __1.12.610__ __2023-12-11__
## __AWS SecurityHub__
  - ### Features
    - Added new resource detail objects to ASFF, including resources for AwsDynamoDbTable, AwsEc2ClientVpnEndpoint, AwsMskCluster, AwsS3AccessPoint, AwsS3Bucket

## __Amazon Neptune__
  - ### Features
    - This release adds a new parameter configuration setting to the Neptune cluster related APIs that can be leveraged to switch between the underlying supported storage modes.

## __Amazon Pinpoint__
  - ### Features
    - This release includes Amazon Pinpoint API documentation updates pertaining to campaign message sending rate limits.

# __1.12.609__ __2023-12-08__
## __Amazon CloudWatch__
  - ### Features
    - Adds support for the OpenTelemetry 1.0 output format in CloudWatch Metric Streams.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - M2 Mac instances are built on Apple M2 Mac mini computers. I4i instances are powered by 3rd generation Intel Xeon Scalable processors. C7i compute optimized, M7i general purpose and R7i memory optimized instances are powered by custom 4th Generation Intel Xeon Scalable processors.

## __FinSpace User Environment Management service__
  - ### Features
    - Releasing Scaling Group, Dataview, and Volume APIs

# __1.12.608__ __2023-12-07__
## __AWS CodeDeploy__
  - ### Features
    - This release adds support for two new CodeDeploy features: 1) zonal deployments for Amazon EC2 in-place deployments, 2) deployments triggered by Auto Scaling group termination lifecycle hook events.

# __1.12.607__ __2023-12-06__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Add VaultType to the output of DescribeRecoveryPoint, ListRecoveryPointByBackupVault API and add ResourceType to the input of ListRestoreJobs API

## __Amazon Comprehend__
  - ### Features
    - Documentation updates for Trust and Safety features.

## __Amazon Connect Service__
  - ### Features
    - Releasing Tagging Support for Instance Management APIS

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Releasing the new cpuManufacturer attribute within the DescribeInstanceTypes API response which notifies our customers with information on who the Manufacturer is for the processor attached to the instance, for example: Intel.

## __Payment Cryptography Control Plane__
  - ### Features
    - AWS Payment Cryptography IPEK feature release

# __1.12.606__ __2023-12-05__
## __AWS Clean Rooms ML__
  - ### Features
    - Updated service title from cleanroomsml to CleanRoomsML.

## __AWS CloudFormation__
  - ### Features
    - Documentation update, December 2023

## __Amazon Athena__
  - ### Features
    - Adding IdentityCenter enabled request for interactive query

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds A10G, T4G, and H100 as accelerator name options and Habana as an accelerator manufacturer option for attribute based selection

# __1.12.605__ __2023-12-04__
## __AWS Cloud9__
  - ### Features
    - This release adds the requirement to include the imageId parameter in the CreateEnvironmentEC2 API call.

## __AWS CloudFormation__
  - ### Features
    - Including UPDATE_* states as a success status for CreateStack waiter.

## __AWS Elemental MediaLive__
  - ### Features
    - Adds support for custom color correction on channels using 3D LUT files.

## __AWS Service Catalog App Registry__
  - ### Features
    - Documentation-only updates for Dawn

## __AWSBillingConductor__
  - ### Features
    - This release adds the ability to specify a linked account of the billing group for the custom line item resource.

## __Braket__
  - ### Features
    - This release enhances service support to create quantum tasks and hybrid jobs associated with Braket Direct Reservations.

## __FinSpace User Environment Management service__
  - ### Features
    - Release General Purpose type clusters

# __1.12.604__ __2023-12-01__
## __Amazon Q Connect__
  - ### Features
    - This release adds the PutFeedback API and allows providing feedback against the specified assistant for the specified target.

## __Amazon Recycle Bin__
  - ### Features
    - Added resource identifier in the output and updated error handling.

## __Amazon Verified Permissions__
  - ### Features
    - Adds description field to PolicyStore API's and namespaces field to GetSchema.

# __1.12.603__ __2023-11-30__
## __AWS ARC - Zonal Shift__
  - ### Features
    - This release adds a new capability, zonal autoshift. You can configure zonal autoshift so that AWS shifts traffic for a resource away from an Availability Zone, on your behalf, when AWS determines that there is an issue that could potentially affect customers in the Availability Zone.

## __AWS Glue__
  - ### Features
    - Adds observation and analyzer support to the GetDataQualityResult and BatchGetDataQualityResult APIs.

## __AWS Marketplace Agreement Service__
  - ### Features
    - The AWS Marketplace Agreement Service provides an API interface that helps AWS Marketplace sellers manage their agreements, including listing, filtering, and viewing details about their agreements.

## __AWS Marketplace Catalog Service__
  - ### Features
    - This release enhances the ListEntities API to support new entity type-specific strongly typed filters in the request and entity type-specific strongly typed summaries in the response.

## __AWS Marketplace Deployment Service__
  - ### Features
    - AWS Marketplace Deployment is a new service that provides essential features that facilitate the deployment of software, data, and services procured through AWS Marketplace.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for 1/ Code Editor, based on Code-OSS, Visual Studio Code Open Source, a new fully managed IDE option in SageMaker Studio  2/ JupyterLab, a new fully managed JupyterLab IDE experience in SageMaker Studio

## __Redshift Serverless__
  - ### Features
    - This release adds the following support for Amazon Redshift Serverless: 1) cross-account cross-VPCs, 2) copying snapshots across Regions, 3) scheduling snapshot creation, and 4) restoring tables from a recovery point.

# __1.12.600__ __2023-11-29__
## __AWS Clean Rooms Service__
  - ### Features
    - AWS Clean Rooms now provides differential privacy to protect against user-identification attempts and machine learning modeling to allow two parties to identify similar users in their data.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __Amazon OpenSearch Service__
  - ### Features
    - Launching Amazon OpenSearch Service support for new zero-ETL integration with Amazon S3. Customers can now manage their direct query data sources to Amazon S3 programatically

## __Amazon SageMaker Runtime__
  - ### Features
    - This release adds InferenceComponentName to InvokeEndpoint and InvokeEndpointWithResponseStream APIs to get inferences from the deployed InferenceComponents.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds following support 1/ Improved SDK tooling for model deployment. 2/ New Inference Component based features to lower inference costs and latency 3/ SageMaker HyperPod management. 4/ Additional parameters for FM Fine Tuning in Autopilot

## __Application Auto Scaling__
  - ### Features
    - Amazon SageMaker customers can now use Application Auto Scaling to automatically scale the number of Inference Component copies across an endpoint to meet the varying demand of their workloads.

## __OpenSearch Service Serverless__
  - ### Features
    - Amazon OpenSearch Serverless collections support an additional attribute called standby-replicas. This allows to specify whether a collection should have redundancy enabled.

## __cleanrooms-ml__
  - ### Features
    - Public Preview SDK release of AWS Clean Rooms ML APIs

# __1.12.599__ __2023-11-28__
## __AWS S3 Control__
  - ### Features
    - Adds support for S3 Express One Zone, and InvocationSchemaVersion 2.0 for S3 Batch Operations.

## __Access Analyzer__
  - ### Features
    - This release adds support for external access findings for S3 directory buckets to help you easily identify cross-account access. Updated service API, documentation, and paginators.

## __Agents for Amazon Bedrock__
  - ### Features
    - This release introduces Agents for Amazon Bedrock

## __Agents for Amazon Bedrock Runtime__
  - ### Features
    - This release introduces Agents for Amazon Bedrock Runtime

## __Amazon Bedrock__
  - ### Features
    - This release adds support for customization types, model life cycle status and minor versions/aliases for model identifiers.

## __Amazon Bedrock Runtime__
  - ### Features
    - This release adds support for minor versions/aliases for invoke model identifier.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces DetectProfileObjectType API to auto generate object type mapping.

## __Amazon Connect Service__
  - ### Features
    - Added support for following capabilities: Amazon Connect's in-app, web, and video calling. Two-way SMS integrations. Contact Lens real-time chat analytics feature. Amazon Connect Analytics Datalake capability. Capability to configure real time chat rules.

## __Amazon Q Connect__
  - ### Features
    - Amazon Q in Connect, an LLM-enhanced evolution of Amazon Connect Wisdom. This release adds generative AI support to Amazon Q Connect QueryAssistant and GetRecommendations APIs.

## __Amazon Simple Storage Service__
  - ### Features
    - Adds support for S3 Express One Zone.

## __QBusiness__
  - ### Features
    - Amazon Q - a generative AI powered application that your employees can use to ask questions and get answers from knowledge spread across disparate content repositories, summarize reports, write articles, take actions, and much more - all within their company's connected content repositories.

# __1.12.598__ __2023-11-28__
## __Amazon ElastiCache__
  - ### Features
    - Launching Amazon ElastiCache Serverless that enables you to create a cache in under a minute without any capacity management. ElastiCache Serverless monitors the cache's memory, CPU, and network usage and scales both vertically and horizontally to support your application's requirements.

# __1.12.597__ __2023-11-27__
## __AWS AppSync__
  - ### Features
    - This update enables introspection of Aurora cluster databases using the RDS Data API

## __AWS B2B Data Interchange__
  - ### Features
    - This is the initial SDK release for AWS B2B Data Interchange.

## __AWS Backup__
  - ### Features
    - AWS Backup now supports restore testing, a new feature that allows customers to automate restore testing and validating their backups. Additionally, this release adds support for EBS Snapshots Archive tier.

## __AWS Control Tower__
  - ### Features
    - This release adds the following support: 1. The EnableControl API can configure controls that are configurable.  2. The GetEnabledControl API shows the configured parameters on an enabled control. 3. The new UpdateEnabledControl API can change parameters on an enabled control.

## __AWS Fault Injection Simulator__
  - ### Features
    - AWS FIS adds support for multi-account experiments & empty target resolution. This release also introduces the CreateTargetAccountConfiguration API that allows experiments across multiple AWS accounts, and the ListExperimentResolvedTargets API to list target details.

## __AWS Glue__
  - ### Features
    - add observations support to DQ CodeGen config model + update document for connectiontypes supported by ConnectorData entities

## __AWS SecurityHub__
  - ### Features
    - Adds and updates APIs to support central configuration. This feature allows the Security Hub delegated administrator to configure Security Hub for their entire AWS Org across multiple regions from a home Region. With this release, findings also include account name and application metadata.

## __Amazon Elastic File System__
  - ### Features
    - Adding support for EFS Replication to existing file system.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for support for RDS for Db2.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for AWS HealthScribe APIs within Amazon Transcribe

# __1.12.596__ __2023-11-27__
## __AWS Billing and Cost Management Data Exports__
  - ### Features
    - Users can create, read, update, delete Exports of billing and cost management data.  Users can get details of Export Executions and details of Tables for exporting.  Tagging support is provided for Exports

## __AWS CloudTrail__
  - ### Features
    - CloudTrail Lake now supports federating event data stores. giving users the ability to run queries against their event data using Amazon Athena.

## __AWS CodeStar connections__
  - ### Features
    - This release adds support for the CloudFormation Git sync feature. Git sync enables updating a CloudFormation stack from a template stored in a Git repository.

## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate recommendations with customization and discounts preferences.

## __AWS Config__
  - ### Features
    - Support Periodic Recording for Configuration Recorder

## __AWS Control Tower__
  - ### Features
    - Add APIs to create and manage a landing zone.

## __AWS Free Tier__
  - ### Features
    - This is the initial SDK release for the AWS Free Tier GetFreeTierUsage API

## __AWS IoT FleetWise__
  - ### Features
    - AWS IoT FleetWise introduces new APIs for vision system data, such as data collected from cameras, radars, and lidars. You can now model and decode complex data types.

## __AWS Lake Formation__
  - ### Features
    - This release adds four new APIs "DescribeLakeFormationIdentityCenterConfiguration", "CreateLakeFormationIdentityCenterConfiguration", "DescribeLakeFormationIdentityCenterConfiguration", and "DeleteLakeFormationIdentityCenterConfiguration", and also updates the corresponding documentation.

## __AWS S3 Control__
  - ### Features
    - Introduce Amazon S3 Access Grants, a new S3 access control feature that maps identities in directories such as Active Directory, or AWS Identity and Access Management (IAM) Principals, to datasets in S3.

## __AWS Secrets Manager__
  - ### Features
    - AWS Secrets Manager has released the BatchGetSecretValue API, which allows customers to fetch up to 20 Secrets with a single request using a list of secret names or filters.

## __AWS SecurityHub__
  - ### Features
    - Adds and updates APIs to support customizable security controls. This feature allows Security Hub customers to provide custom parameters for security controls. With this release, findings for controls that support custom parameters will include the parameters used to generate the findings.

## __AWS Step Functions__
  - ### Features
    - Adds new TestState operation which accepts the definition of a single state and executes it. You can test a state without creating a state machine or updating an existing state machine.

## __AWS re:Post Private__
  - ### Features
    - Initial release of AWS re:Post Private

## __Access Analyzer__
  - ### Features
    - IAM Access Analyzer now continuously monitors IAM roles and users in your AWS account or organization to generate findings for unused access. Additionally, IAM Access Analyzer now provides custom policy checks to validate that IAM policies adhere to your security standards ahead of deployments.

## __Amazon CloudWatch Logs__
  - ### Features
    - Added APIs to Create, Update, Get, List and Delete LogAnomalyDetectors and List and Update Anomalies in Detector. Added LogGroupClass attribute for LogGroups to classify loggroup as Standard loggroup with all capabilities or InfrequentAccess loggroup with limited capabilities.

## __Amazon Detective__
  - ### Features
    - Added new APIs in Detective to support resource investigations

## __Amazon EC2 Container Service__
  - ### Features
    - Adds a new 'type' property to the Setting structure. Adds a new AccountSetting - guardDutyActivate for ECS.

## __Amazon EKS Auth__
  - ### Features
    - This release adds support for EKS Pod Identity feature. EKS Pod Identity makes it easy for customers to obtain IAM permissions for their applications running in the EKS clusters.

## __Amazon Elastic File System__
  - ### Features
    - Adding support for EFS Archive lifecycle configuration.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - This release adds support for EKS Pod Identity feature. EKS Pod Identity makes it easy for customers to obtain IAM permissions for the applications running in their EKS clusters.

## __Amazon FSx__
  - ### Features
    - Added support for FSx for ONTAP scale-out file systems and FlexGroup volumes. Added the HAPairs field and ThroughputCapacityPerHAPair for filesystem. Added AggregateConfiguration (containing Aggregates and ConstituentsPerAggregate) and SizeInBytes for volume.

## __Amazon GuardDuty__
  - ### Features
    - Add support for Runtime Monitoring for ECS and ECS-EC2.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces new generative AI features in AWS Lex: Assisted Slot Resolution, Descriptive Bot Building, and Sample Utterance Generation. These features leverage large language models available through Amazon Bedrock to improve the bot builder and customer experiences.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release introduces support for interpretationSource in the runtime service response.

## __Amazon Managed Blockchain__
  - ### Features
    - Add optional NetworkType property to Accessor APIs

## __Amazon Personalize__
  - ### Features
    - Enables metadata in recommendations, recommendations with themes, and next best action recommendations

## __Amazon Personalize Events__
  - ### Features
    - This release enables PutActions and PutActionInteractions

## __Amazon Personalize Runtime__
  - ### Features
    - Enables metadata in recommendations and next best action recommendations

## __Amazon Prometheus Service__
  - ### Features
    - This release adds support for the Amazon Managed Service for Prometheus collector, a fully managed, agentless Prometheus metrics scraping capability.

## __Amazon QuickSight__
  - ### Features
    - This release launches new APIs for trusted identity propagation setup and supports creating datasources using trusted identity propagation as authentication method for QuickSight accounts configured with IAM Identity Center.

## __Amazon Redshift__
  - ### Features
    - This release adds support for multi-data warehouse writes through data sharing.

## __Amazon Simple Storage Service__
  - ### Features
    - Adding new params - Key and Prefix, to S3 API operations for supporting S3 Access Grants. Note - These updates will not change any of the existing S3 API functionality.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for transcriptions from audio sources in 64 new languages and introduces generative call summarization in Transcribe Call Analytics (Post call)

## __Amazon WorkSpaces__
  - ### Features
    - The release introduces Multi-Region Resilience one-way data replication that allows you to replicate data from your primary WorkSpace to a standby WorkSpace in another AWS Region. DescribeWorkspaces now returns the status of data replication.

## __Amazon WorkSpaces Thin Client__
  - ### Features
    - Initial release of Amazon WorkSpaces Thin Client

## __Cost Optimization Hub__
  - ### Features
    - This release launches Cost Optimization Hub, a new AWS Billing and Cost Management feature that helps you consolidate and prioritize cost optimization recommendations across your AWS Organizations member accounts and AWS Regions, so that you can get the most out of your AWS spend.

## __Elastic Load Balancing__
  - ### Features
    - This release enables both mutual authentication (mTLS), and Automatic Target Weights (ATW) for Application Load Balancers.

# __1.12.595__ __2023-11-22__
## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations now manages buckets or prefixes in a single step.

## __Amazon Kinesis__
  - ### Features
    - This release adds support for resource based policies on streams and consumers.

## __Amazon SageMaker Service__
  - ### Features
    - This feature adds the end user license agreement status as a model access configuration parameter.

# __1.12.594__ __2023-11-21__
## __AWS IoT SiteWise__
  - ### Features
    - Adds 1/ user-defined unique identifier for asset and model metadata, 2/ asset model components, and 3/ query API for asset metadata and telemetry data. Supports 4/ multi variate anomaly detection using Amazon Lookout for Equipment, 5/ warm storage tier, and 6/ buffered ingestion of time series data.

## __AWS IoT TwinMaker__
  - ### Features
    - This release adds following support. 1. New APIs for metadata bulk operations. 2. Modify the component type API to support composite component types - nesting component types within one another. 3. New list APIs for components and properties. 4. Support the larger scope digital twin modeling.

## __Amazon CloudFront__
  - ### Features
    - This release adds support for CloudFront KeyValueStore, a globally managed key value datastore associated with CloudFront Functions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for automatic date based partitioning in S3 Server Access Logs.

## __Inspector Scan__
  - ### Features
    - This release adds support for the new Amazon Inspector Scan API. The new Inspector Scan API can synchronously scan SBOMs adhering to the CycloneDX v1.5 format.

# __1.12.593__ __2023-11-20__
## __AWS CodeStar connections__
  - ### Features
    - This release updates a few CodeStar Connections related APIs.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Amazon DocumentDB updates for new cluster storage configuration: Amazon DocumentDB I/O-Optimized.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Security group referencing over Transit gateways, enabling you to simplify Security group management and control of instance-to-instance traffic across VPCs that are connected by Transit gateway.

# __1.12.592__ __2023-11-17__
## __AWS App Mesh__
  - ### Features
    - Change the default value of these fields from 0 to null: MaxConnections, MaxPendingRequests, MaxRequests, HealthCheckThreshold, PortNumber, and HealthCheckPolicy -> port. Users are not expected to perceive the change, except that badRequestException is thrown when required fields missing configured.

## __AWS Cloud9__
  - ### Features
    - A minor doc only update related to changing the date of an API change.

## __AWS CloudFormation__
  - ### Features
    - This release adds a new flag ImportExistingResources to CreateChangeSet. Specify this parameter on a CREATE- or UPDATE-type change set to import existing resources with custom names instead of recreating them.

## __AWS CodePipeline__
  - ### Features
    - CodePipeline now supports overriding source revisions to achieve manual re-deploy of a past revision

## __AWS CodeStar connections__
  - ### Features
    - This release adds support for the CloudFormation Git sync feature. Git sync enables updating a CloudFormation stack from a template stored in a Git repository.

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive has now added support for per-output static image overlay.

## __AWS SSO OIDC__
  - ### Features
    - Adding support for `sso-oauth:CreateTokenWithIAM`.

## __AWS Security Token Service__
  - ### Features
    - API updates for the AWS Security Token Service

## __AWS Single Sign-On Admin__
  - ### Features
    - Improves support for configuring RefreshToken and TokenExchange grants on applications.

## __Amazon Athena__
  - ### Features
    - Adding SerivicePreProcessing time metric

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - Adds new querying capabilities for running data queries on a monitor

## __Amazon Connect Service__
  - ### Features
    - This release adds WISDOM_QUICK_RESPONSES as new IntegrationType of Connect IntegrationAssociation resource and bug fixes.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release adds QuickResponse as a new Wisdom resource and Wisdom APIs for import, create, read, search, update and delete QuickResponse resources.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added support for SAP HANA in Amazon Data Lifecycle Manager EBS snapshot lifecycle policies with pre and post scripts.

## __Amazon EC2 Container Registry__
  - ### Features
    - Documentation and operational updates for Amazon ECR, adding support for pull through cache rules for upstream registries that require authentication.

## __Amazon EMR__
  - ### Features
    - Launch support for IAM Identity Center Trusted Identity Propagation and workspace storage encryption using AWS KMS in EMR Studio

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds new features for Amazon VPC IP Address Manager (IPAM) Allowing a choice between Free and Advanced Tiers, viewing public IP address insights across regions and in Amazon Cloudwatch, use IPAM to plan your subnet IPs within a VPC and bring your own autonomous system number to IPAM.

## __Amazon EventBridge__
  - ### Features
    - Introduces a new rule state ENABLED_WITH_ALL_CLOUDTRAIL_MANAGEMENT_EVENTS for matching with Get, List and Describe AWS API call events from CloudTrail.

## __Amazon EventBridge Pipes__
  - ### Features
    - TargetParameters now properly supports BatchJobParameters.ArrayProperties.Size and BatchJobParameters.RetryStrategy.Attempts being optional, and EcsTaskParameters.Overrides.EphemeralStorage.SizeInGiB now properly required when setting EphemeralStorage

## __Amazon Interactive Video Service__
  - ### Features
    - type & defaulting refinement to various range properties

## __Amazon Interactive Video Service Chat__
  - ### Features
    - type & defaulting refinement to various range properties

## __Amazon Kinesis Video Streams__
  - ### Features
    - Docs only build to bring up-to-date with public docs.

## __Amazon Location Service__
  - ### Features
    - Remove default value and allow nullable for request parameters having minimum value larger than zero.

## __Amazon OpenSearch Ingestion__
  - ### Features
    - Add support for enabling a persistent buffer when creating or updating an OpenSearch Ingestion pipeline. Add tags to Pipeline and PipelineSummary response models.

## __Amazon Redshift__
  - ### Features
    - Updated SDK for Amazon Redshift, which you can use to configure a connection with IAM Identity Center to manage access to databases. With these, you can create a connection through a managed application. You can also change a managed application, delete it, or get information about an existing one.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for option groups and replica enhancements to Amazon RDS Custom.

## __Amazon Simple Storage Service__
  - ### Features
    - Removes all default 0 values for numbers and false values for booleans

## __Amazon Verified Permissions__
  - ### Features
    - Adding BatchIsAuthorized API which supports multiple authorization requests against a PolicyStore

## __Application Migration Service__
  - ### Features
    - Removed invalid and unnecessary default values.

## __Redshift Serverless__
  - ### Features
    - Updated SDK for Amazon Redshift Serverless, which provides the ability to configure a connection with IAM Identity Center to manage user and group access to databases.

## __TrustedAdvisor Public API__
  - ### Features
    - AWS Trusted Advisor introduces new APIs to enable you to programmatically access Trusted Advisor best practice checks, recommendations, and prioritized recommendations. Trusted Advisor APIs enable you to integrate Trusted Advisor with your operational tools to automate your workloads.

# __1.12.591__ __2023-11-16__
## __AWS Elemental MediaPackage__
  - ### Features
    - DRM_TOP_LEVEL_COMPACT allows placing content protection elements at the MPD level and referenced at the AdaptationSet level

## __AWS Glue__
  - ### Features
    - Introduces new column statistics APIs to support statistics generation for tables within the Glue Data Catalog.

## __AWS IoT__
  - ### Features
    - GA release the ability to index and search devices based on their GeoLocation data. With GeoQueries you can narrow your search to retrieve devices located in the desired geographic boundary.

## __AWS Lambda__
  - ### Features
    - Adds support for logging configuration in Lambda Functions. Customers will have more control how their function logs are captured and to which cloud watch log group they are delivered also.

## __AWS Single Sign-On Admin__
  - ### Features
    - Instances bound to a single AWS account, API operations for managing instances and applications, and assignments to applications are now supported. Trusted identity propagation is also supported, with new API operations for managing trusted token issuers and application grants and scopes.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Introduces new APIs ListIncidentFindings and BatchGetIncidentFindings to use findings related to an incident.

## __AWS Transfer Family__
  - ### Features
    - Introduced S3StorageOptions for servers to enable directory listing optimizations and added Type fields to logical directory mappings.

## __Amazon CodeCatalyst__
  - ### Features
    - This release includes updates to the Dev Environment APIs to include an optional vpcConnectionName parameter that supports using Dev Environments with Amazon VPC.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release adds support for Amazon Data Lifecycle Manager default policies for EBS snapshots and EBS-backed AMIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Enable use of tenant-specific PublicSigningKeyUrl from device trust providers and onboard jumpcloud as a new device trust provider.

## __Amazon FSx__
  - ### Features
    - Enables customers to update their PerUnitStorageThroughput on their Lustre file systems.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - This release introduces server side composition and recording for stages.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for configuring Macie to assume an IAM role when retrieving sample occurrences of sensitive data reported by findings.

## __Amazon Pinpoint SMS Voice V2__
  - ### Features
    - Amazon Pinpoint now offers additional operations as part of version 2 of the SMS and voice APIs. This release includes 26 new APIs to create and manage phone number registrations, add verified destination numbers, and request sender IDs.

## __Amazon Polly__
  - ### Features
    - Add new engine - long-form - dedicated for longer content, such as news articles, training materials, or marketing videos.

## __Amazon QuickSight__
  - ### Features
    - Custom permission support for QuickSight roles; Three new datasources STARBURST, TRINO, BIGQUERY; Lenient mode changes the default behavior to allow for exporting and importing with certain UI allowed errors, Support for permissions and tags export and import.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Studio now supports Trainium instance types - trn1.2xlarge, trn1.32xlarge, trn1n.32xlarge.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release introduces the ability to filter automation execution steps which have parent steps. In addition, runbook variable information is returned by GetAutomationExecution and parent step information is returned by the DescribeAutomationStepExecutions API.

## __EC2 Image Builder__
  - ### Features
    - This release adds the Image Lifecycle Management feature to automate the process of deprecating, disabling and deleting outdated images and their associated resources.

## __Managed Streaming for Kafka__
  - ### Features
    - Added a new API response field which determines if there is an action required from the customer regarding their cluster.

# __1.12.590__ __2023-11-15__
## __AWS CloudTrail__
  - ### Features
    - The Lake Repricing feature lets customers configure a BillingMode for an event data store. The BillingMode determines the cost for ingesting and storing events and the default and maximum retention period for the event data store.

## __AWS Lambda__
  - ### Features
    - Add Java 21 (java21) support to AWS Lambda

## __AWS S3 Control__
  - ### Features
    - Add 5 APIs to create, update, get, list, delete S3 Storage Lens group(eg. CreateStorageLensGroup), 3 APIs for tagging(TagResource,UntagResource,ListTagsForResource), and update to StorageLensConfiguration to allow metrics to be aggregated on Storage Lens groups.

## __AWS Systems Manager for SAP__
  - ### Features
    - Update the default value of MaxResult to 50.

## __Amazon CodeCatalyst__
  - ### Features
    - This release adds functionality for retrieving information about workflows and workflow runs and starting workflow runs in Amazon CodeCatalyst.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS EBS now supports Snapshot Lock, giving users the ability to lock an EBS Snapshot to prohibit deletion of the snapshot. This release introduces the LockSnapshot, UnlockSnapshot & DescribeLockedSnapshots APIs to manage lock configuration for snapshots. The release also includes the dl2q_24xlarge.

## __Amazon Redshift__
  - ### Features
    - The custom domain name SDK for Amazon Redshift provisioned clusters is updated with additional required parameters for modify and delete operations. Additionally, users can provide domain names with longer top-level domains.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for support for upgrading RDS for MySQL snapshots from version 5.7 to version 8.0.

## __AmazonMWAA__
  - ### Features
    - This Amazon MWAA release adds support for customer-managed VPC endpoints. This lets you choose whether to create, and manage your environment's VPC endpoints, or to have Amazon MWAA create, and manage them for you.

## __Auto Scaling__
  - ### Features
    - This release introduces Instance Maintenance Policy, a new EC2 Auto Scaling capability that allows customers to define whether instances are launched before or after existing instances are terminated during instance replacement operations.

## __FinSpace Public API__
  - ### Features
    - Adding deprecated trait to APIs in this name space.

## __FinSpace User Environment Management service__
  - ### Features
    - Adding deprecated trait on Dataset Browser Environment APIs

# __1.12.589__ __2023-11-14__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Provide Job Summary for your backup activity.

## __AWS Clean Rooms Service__
  - ### Features
    - This feature provides the ability for the collaboration creator to configure either the member who can run queries or a different member in the collaboration to be billed for query compute costs.

## __AWS Glue__
  - ### Features
    - Introduces new storage optimization APIs to support automatic compaction of Apache Iceberg tables.

## __AWS IoT__
  - ### Features
    - This release introduces new attributes in API CreateSecurityProfile, UpdateSecurityProfile and DescribeSecurityProfile to support management of Metrics Export for AWS IoT Device Defender Detect.

## __AWS Lambda__
  - ### Features
    - Add Python 3.12 (python3.12) support to AWS Lambda

## __AWS MediaTailor__
  - ### Features
    - Removed unnecessary default values.

## __AWS Resource Explorer__
  - ### Features
    - Resource Explorer supports multi-account search. You can now use Resource Explorer to search and discover resources across AWS accounts within your organization or organizational unit.

## __AWS Signer__
  - ### Features
    - Documentation updates for AWS Signer

## __AWS Step Functions__
  - ### Features
    - This release adds support to redrive executions in AWS Step Functions with a new RedriveExecution operation.

## __Amazon Connect Service__
  - ### Features
    - Introducing SegmentAttributes parameter for StartChatContact API

## __Amazon EventBridge Pipes__
  - ### Features
    - Added support (via new LogConfiguration field in CreatePipe and UpdatePipe APIs) for logging to Amazon CloudWatch Logs, Amazon Simple Storage Service (Amazon S3), and Amazon Kinesis Data Firehose

## __Amazon SageMaker Service__
  - ### Features
    - This release makes Model Registry Inference Specification fields as not required.

# __1.12.588__ __2023-11-13__
## __AWS Data Exchange__
  - ### Features
    - Removed Required trait for DataSet.OriginDetails.ProductId.

## __AWS Database Migration Service__
  - ### Features
    - Added new Db2 LUW Target endpoint with related endpoint settings. New executeTimeout endpoint setting for mysql endpoint. New ReplicationDeprovisionTime field for serverless describe-replications.

## __AWS Service Catalog App Registry__
  - ### Features
    - When the customer associates a resource collection to their application with this new feature, then a new application tag will be applied to all supported resources that are part of that collection. This allows customers to more easily find the application that is associated with those resources.

## __Amazon EC2 Container Service__
  - ### Features
    - Adds a Client Token parameter to the ECS RunTask API. The Client Token parameter allows for idempotent RunTask requests.

## __Amazon EMR__
  - ### Features
    - Updated GetClusterSessionCredentials API  to allow Amazon SageMaker Studio to connect to EMR on EC2 clusters to support IdentityCenter/PEZ integration.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds the new EC2 DescribeInstanceTopology API, which you can use to retrieve the network topology of your running instances on select platform types to determine their relative proximity to each other.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release enables customers to call the AWS Transcribe streaming service with the capability of identifying multiple languages in the stream.

# __1.12.587__ __2023-11-10__
## __AWS Control Tower__
  - ### Features
    - AWS Control Tower supports tagging for enabled controls. This release introduces TagResource, UntagResource and ListTagsForResource APIs to manage tags in existing enabled controls. It updates EnabledControl API to tag resources at creation time.

## __AWS Cost and Usage Report Service__
  - ### Features
    - This release adds support for tagging and customers can now tag report definitions. Additionally, ReportStatus is now added to report definition to show when the last delivered time stamp and if it succeeded or not.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes the ability to specify any input source as the primary input for corresponding follow modes, and allows users to specify fit and fill behaviors without resizing content.

## __AWS Marketplace Entitlement Service__
  - ### Features
    - Add paginators to GetEntitlements.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 adds API updates to enable ENA Express at instance launch time.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for zero-ETL integrations.

## __Firewall Management Service__
  - ### Features
    - Adds optimizeUnassociatedWebACL flag to ManagedServiceData, updates third-party firewall examples, and other minor documentation updates.

# __1.12.586__ __2023-11-09__
## __AWS CloudFormation__
  - ### Features
    - Added new ConcurrencyMode feature for AWS CloudFormation StackSets for faster deployments to target accounts.

## __AWS CloudTrail__
  - ### Features
    - The Insights in Lake feature lets customers enable CloudTrail Insights on a source CloudTrail Lake event data store and create a destination event data store to collect Insights events based on unusual management event activity in the source event data store.

## __AWS Lambda__
  - ### Features
    - Add Custom runtime on Amazon Linux 2023 (provided.al2023) support to AWS Lambda.

## __Amazon CloudWatch Logs__
  - ### Features
    - Update to support new APIs for delivery of logs from AWS services.

## __Amazon Comprehend__
  - ### Features
    - This release adds support for toxicity detection and prompt safety classification.

## __Amazon Connect Service__
  - ### Features
    - This release adds the ability to integrate customer lambda functions with Connect attachments for scanning and updates the ListIntegrationAssociations API to support filtering on IntegrationArn.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - AWS EBS now supports Block Public Access for EBS Snapshots. This release introduces the EnableSnapshotBlockPublicAccess, DisableSnapshotBlockPublicAccess and GetSnapshotBlockPublicAccessState APIs to manage account-level public access settings for EBS Snapshots in an AWS Region.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding EKS Anywhere subscription related operations.

## __Amazon Omics__
  - ### Features
    - Support UBAM filetype for Omics Storage and make referenceArn optional

# __1.12.585__ __2023-11-08__
## __Amazon Simple Queue Service__
  - ### Features
    - This release enables customers to call SQS using AWS JSON-1.0 protocol and bug fix.

# __1.12.584__ __2023-11-08__
## __AWS DataSync__
  - ### Features
    - This change allows for 0 length access keys and secret keys for object storage locations. Users can now pass in empty string credentials.

## __AWS Lambda__
  - ### Features
    - Add Node 20 (nodejs20.x) support to AWS Lambda.

## __AWS Resilience Hub__
  - ### Features
    - AWS Resilience Hub enhances Resiliency Score, providing actionable recommendations to improve application resilience. Amazon Elastic Kubernetes Service (EKS) operational recommendations have been added to help improve the resilience posture of your applications.

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to add/view comment authors through CreateRelatedItem and SearchRelatedItems API. For more information see https://docs.aws.amazon.com/cases/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - This release clarifies in our public documentation that InstanceId is a requirement for SearchUsers API requests.

## __Amazon GuardDuty__
  - ### Features
    - Added API support for new GuardDuty EKS Audit Log finding types.

## __Amazon Lex Model Building V2__
  - ### Features
    - AWS Lex now supports selective log capture in conversation logs. When you enable this option within the conversation log settings, only the utterances that trigger intents and slots specified in session attributes will be logged.

## __Amazon Omics__
  - ### Features
    - Adding Run UUID and Run Output URI: GetRun and StartRun API response has two new fields "uuid" and "runOutputUri".

## __Amazon Relational Database Service__
  - ### Features
    - This Amazon RDS release adds support for patching the OS of an RDS Custom for Oracle DB instance. You can now upgrade the database or operating system using the modify-db-instance command.

## __Amazon Simple Queue Service__
  - ### Features
    - This release enables customers to call SQS using AWS JSON-1.0 protocol.

## __Redshift Serverless__
  - ### Features
    - Added a new parameter in the workgroup that helps you control your cost for compute resources. This feature provides a ceiling for RPUs that Amazon Redshift Serverless can scale up to. When automatic compute scaling is required, having a higher value for MaxRPU can enhance query throughput.

# __1.12.583__ __2023-11-07__
## __AWS Data Exchange__
  - ### Features
    - Updated SendDataSetNotificationRequest Comment to be maximum length 4096.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added support for pre and post scripts in Amazon Data Lifecycle Manager EBS snapshot lifecycle policies.

## __Amazon Relational Database Service__
  - ### Features
    - This Amazon RDS release adds support for the multi-tenant configuration. In this configuration, an RDS DB instance can contain multiple tenant databases. In RDS for Oracle, a tenant database is a pluggable database (PDB).

# __1.12.582__ __2023-11-06__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now supports AWS Lambda compute.

## __AWS Cost Explorer Service__
  - ### Features
    - This release extends the GetReservationPurchaseRecommendation API to support recommendations for Amazon MemoryDB reservations.

## __AWS Identity and Access Management__
  - ### Features
    - Add partitional endpoint for iso-e.

## __Amazon Connect Service__
  - ### Features
    - Added new API that allows Amazon Connect Outbound Campaigns to create contacts in Amazon Connect when ingesting your dial requests.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Update the input of CreateDBInstance and ModifyDBInstance to support setting CA Certificates. Update the output of DescribeDBInstance and DescribeDBEngineVersions to show current and supported CA certificates.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new US English voices - Danielle and Gregory. Danielle and Gregory are available as Neural voices only.

## __Amazon Route 53__
  - ### Features
    - Add partitional endpoints for iso-e and iso-f.

## __AmazonMWAA__
  - ### Features
    - This release adds support for Apache Airflow version 2.7.2. This version release includes support for deferrable operators and triggers.

# __1.12.581__ __2023-11-03__
## __AWS Config__
  - ### Features
    - Updated ResourceType enum with new resource types onboarded by AWS Config in October 2023.

## __AWS IoT Wireless__
  - ### Features
    - Added LoRaWAN version 1.0.4 support

## __AWS Launch Wizard__
  - ### Features
    - AWS Launch Wizard is a service that helps reduce the time it takes to deploy applications to the cloud while providing a guided deployment experience.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat introduces Create Persistent Contact Association API, allowing customers to choose when to resume previous conversations from previous chats, eliminating the need to repeat themselves and allowing agents to provide personalized service with access to entire conversation history.

# __1.12.580__ __2023-11-02__
## __AWS App Runner__
  - ### Features
    - AWS App Runner now supports using dual-stack address type for the public endpoint of your incoming traffic.

## __AWS Glue__
  - ### Features
    - This release introduces Google BigQuery Source and Target in AWS Glue CodeGenConfigurationNode.

## __AWS Network Firewall__
  - ### Features
    - This release introduces the stateless rule analyzer, which enables you to analyze your stateless rules for asymmetric routing.

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 API: Update to include new metrics PERCENT_NON_TALK_TIME, PERCENT_TALK_TIME, PERCENT_TALK_TIME_AGENT, PERCENT_TALK_TIME_CUSTOMER

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift adds support for shared credentials, which allows applications that are deployed on managed EC2 fleets to interact with other AWS resources.

## __Amazon QuickSight__
  - ### Features
    - This release introduces Float Decimal Type as SubType in QuickSight SPICE datasets and Custom week start and Custom timezone options in Analysis and Dashboard.

# __1.12.579__ __2023-11-01__
## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now support accelerators with cross account endpoints.

## __Amazon Connect Service__
  - ### Features
    - Adds the BatchGetFlowAssociation API which returns flow associations (flow-resource) corresponding to the list of resourceArns supplied in the request. This release also adds IsDefault, LastModifiedRegion and LastModifiedTime fields to the responses of several Describe and List APIs.

## __Amazon Redshift__
  - ### Features
    - Added support for Multi-AZ deployments for Provisioned RA3 clusters that provide 99.99% SLA availability.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for customized networking resources to Amazon RDS Custom.

## __Amazon SageMaker Service__
  - ### Features
    - Support for batch transform input in Model dashboard

# __1.12.578__ __2023-10-31__
## __AWS Amplify__
  - ### Features
    - Add backend field to CreateBranch and UpdateBranch requests. Add pagination support for ListApps, ListDomainAssociations, ListBranches, and ListJobs

## __AWSMainframeModernization__
  - ### Features
    - Added name filter ability for ListDataSets API, added ForceUpdate for Updating environment and BatchJob submission using S3BatchJobIdentifier

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Automate attaching managed policies

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Capacity Blocks for ML are a new EC2 purchasing option for reserving GPU instances on a future date to support short duration machine learning (ML) workloads. Capacity Blocks automatically place instances close together inside Amazon EC2 UltraClusters for low-latency, high-throughput networking.

## __Amazon NeptuneData__
  - ### Features
    - Minor change to not retry CancelledByUserException

## __Amazon Translate__
  - ### Features
    - Added support for Brevity translation settings feature.

# __1.12.577__ __2023-10-30__
## __AWS Data Exchange__
  - ### Features
    - We added a new API action: SendDataSetNotification.

## __AWS DataSync__
  - ### Features
    - Platform version changes to support AL1 deprecation initiative.

## __AWS Elemental MediaPackage v2__
  - ### Features
    - This feature allows customers to create a combination of manifest filtering, startover and time delay configuration that applies to all egress requests by default.

## __AWS Resilience Hub__
  - ### Features
    - Introduced the ability to filter applications by their last assessment date and time and have included metrics for the application's estimated workload Recovery Time Objective (RTO) and estimated workload Recovery Point Objective (RPO).

## __Amazon Connect Service__
  - ### Features
    - This release adds InstanceId field for phone number APIs.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release added necessary API documents on creating a Wisdom knowledge base to integrate with S3.

## __Amazon Relational Database Service__
  - ### Features
    - This release launches the CreateIntegration, DeleteIntegration, and DescribeIntegrations APIs to manage zero-ETL Integrations.

## __Amazon S3 on Outposts__
  - ### Features
    - Updated ListOutpostsWithS3 API response to include S3OutpostArn for use with AWS RAM.

## __FinSpace User Environment Management service__
  - ### Features
    - Introducing new API UpdateKxClusterCodeConfiguration, introducing new cache types for clusters and introducing new deployment modes for updating clusters.

## __Redshift Serverless__
  - ### Features
    - Added support for custom domain names for Amazon Redshift Serverless workgroups. This feature enables customers to create a custom domain name and use ACM to generate fully secure connections to it.

# __1.12.576__ __2023-10-27__
## __AWS WAFV2__
  - ### Features
    - Updates the descriptions for the calls that manage web ACL associations, to provide information for customer-managed IAM policies.

## __Amazon EMR__
  - ### Features
    - Updated CreateCluster API request and DescribeCluster API responses to include EbsRootVolumeIops, and EbsRootVolumeThroughput attributes that specify the user configured root volume IOPS and throughput for Amazon EBS root device volume. This feature will be available from Amazon EMR releases 6.15.0

## __Amazon Neptune__
  - ### Features
    - Update TdeCredentialPassword type to SensitiveString

## __Amazon Pinpoint__
  - ### Features
    - Updated documentation to describe the case insensitivity for EndpointIds.

## __Amazon Redshift__
  - ### Features
    - added support to create a dual stack cluster

# __1.12.575__ __2023-10-26__
## __AWS Network Firewall__
  - ### Features
    - Network Firewall now supports inspection of outbound SSL/TLS traffic.

## __AWS Systems Manager for SAP__
  - ### Features
    - AWS Systems Manager for SAP added support for registration and discovery of SAP ABAP applications

## __AWS Transfer Family__
  - ### Features
    - No API changes from previous release. This release migrated the model to Smithy keeping all features unchanged.

## __Amazon AppStream__
  - ### Features
    - This release introduces multi-session fleets, allowing customers to provision more than one user session on a single fleet instance.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Launching GetSecurityGroupsForVpc API. This API gets security groups that can be associated by the AWS account making the request with network interfaces in the specified VPC.

## __Amazon OpenSearch Service__
  - ### Features
    - You can specify ipv4 or dualstack IPAddressType for cluster endpoints. If you specify IPAddressType as dualstack, the new endpoint will be visible under the 'EndpointV2' parameter and will support IPv4 and IPv6 requests. Whereas, the 'Endpoint' will continue to serve IPv4 requests.

## __Amazon Redshift__
  - ### Features
    - Add Redshift APIs GetResourcePolicy, DeleteResourcePolicy, PutResourcePolicy and DescribeInboundIntegrations for the new Amazon Redshift Zero-ETL integration feature, which can be used to control data ingress into Redshift namespace, and view inbound integrations.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon Sagemaker Autopilot now supports Text Generation jobs.

## __Amazon Simple Notification Service__
  - ### Features
    - Message Archiving and Replay is now supported in Amazon SNS for FIFO topics.

# __1.12.574__ __2023-10-25__
## __AWS Ground Station__
  - ### Features
    - This release will allow KMS alias names to be used when creating Mission Profiles

## __AWS Identity and Access Management__
  - ### Features
    - Updates to GetAccessKeyLastUsed action to replace NoSuchEntity error with AccessDeniedException error.

## __Amazon Connect Cases__
  - ### Features
    - Increase maximum length of CommentBody to 3000, and increase maximum length of StringValue to 1500

# __1.12.573__ __2023-10-24__
## __AWS CodePipeline__
  - ### Features
    - Add ability to trigger pipelines from git tags, define variables at pipeline level and new pipeline type V2.

## __AWS Identity and Access Management__
  - ### Features
    - Add the partitional endpoint for IAM in iso-f.

## __AWS Migration Hub Config__
  - ### Features
    - This release introduces DeleteHomeRegionControl API that customers can use to delete the Migration Hub Home Region configuration

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release updates the documentation for InstanceInterruptionBehavior and HibernationOptionsRequest to more accurately describe the behavior of these two parameters when using Spot hibernation.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added support for Cluster Subnet and Security Group mutability.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - This release introduces multi-data-source feature in Migration Hub Strategy Recommendations. This feature now supports vCenter as a data source to fetch inventory in addition to ADS and Import from file workflow that is currently supported with MHSR collector.

## __OpenSearch Service Serverless__
  - ### Features
    - This release includes the following new APIs: CreateLifecyclePolicy, UpdateLifecyclePolicy, BatchGetLifecyclePolicy, DeleteLifecyclePolicy, ListLifecyclePolicies and BatchGetEffectiveLifecyclePolicy to support the data lifecycle management feature.

# __1.12.572__ __2023-10-23__
## __AWS Marketplace Commerce Analytics__
  - ### Features
    - The StartSupportDataExport operation has been deprecated as part of the Product Support Connection deprecation. As of December 2022, Product Support Connection is no longer supported.

## __AWS Network Manager__
  - ### Features
    - This release adds API support for Tunnel-less Connect (NoEncap Protocol) for AWS Cloud WAN

## __Amazon Rekognition__
  - ### Features
    - Amazon Rekognition introduces StartMediaAnalysisJob, GetMediaAnalysisJob, and ListMediaAnalysisJobs operations to run a bulk analysis of images with a Detect Moderation model.

## __Redshift Serverless__
  - ### Features
    - This release adds support for customers to see the patch version and workgroup version in Amazon Redshift Serverless.

# __1.12.571__ __2023-10-20__
## __AWS Application Discovery Service__
  - ### Features
    - This release introduces three new APIs: StartBatchDeleteConfigurationTask, DescribeBatchDeleteConfigurationTask, and BatchDeleteAgents.

## __AWS Health Imaging__
  - ### Features
    - Updates on documentation links

## __Amazon AppConfig__
  - ### Features
    - Update KmsKeyIdentifier constraints to support AWS KMS multi-Region keys.

## __Amazon AppIntegrations Service__
  - ### Features
    - Updated ScheduleConfig to be an optional input to CreateDataIntegration to support event driven downloading of files from sources such as Amazon s3 using Amazon Connect AppIntegrations.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for updating phone number metadata, such as phone number description.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release introduces a new API: DeleteOpsItem. This allows deletion of an OpsItem.

# __1.12.570__ __2023-10-19__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS Service Catalog__
  - ### Features
    - Introduce support for EXTERNAL product and provisioning artifact type in CreateProduct and CreateProvisioningArtifact APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 C7a instances, powered by 4th generation AMD EPYC processors, are ideal for high performance, compute-intensive workloads such as high performance computing. Amazon EC2 R7i instances are next-generation memory optimized and powered by custom 4th Generation Intel Xeon Scalable processors.

## __Amazon Managed Blockchain Query__
  - ### Features
    - This release adds support for Ethereum Sepolia network

## __Amazon NeptuneData__
  - ### Features
    - Doc changes to add IAM action mappings for the data actions.

## __Amazon Omics__
  - ### Features
    - This change enables customers to retrieve failure reasons with detailed status messages for their failed runs

## __Amazon OpenSearch Service__
  - ### Features
    - Added Cluster Administrative options for node restart, opensearch process restart and opensearch dashboard restart for Multi-AZ without standby domains

## __Amazon QuickSight__
  - ### Features
    - This release adds the following: 1) Trino and Starburst Database Connectors 2) Custom total for tables and pivot tables 3) Enable restricted folders 4) Add rolling dates for time equality filters 5) Refine DataPathValue and introduce DataPathType 6) Add SeriesType to ReferenceLineDataConfiguration

## __Amazon Verified Permissions__
  - ### Features
    - Improving Amazon Verified Permissions Create experience

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for WorkSpaces

# __1.12.569__ __2023-10-18__
## __AWS Cloud9__
  - ### Features
    - Update to imageId parameter behavior and dates updated.

## __AWSKendraFrontendService__
  - ### Features
    - Changes for a new feature in Amazon Kendra's Query API to Collapse/Expand query results

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release adds an max limit of 25 recommendation ids for NotifyRecommendationsReceived API.

## __Amazon DynamoDB__
  - ### Features
    - Updating descriptions for several APIs.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for upgrading the storage file system configuration on the DB instance using a blue/green deployment or a read replica.

# __1.12.568__ __2023-10-17__
## __AWS Application Discovery Service__
  - ### Features
    - This release introduces three new APIs: StartBatchDeleteConfigurationTask, DescribeBatchDeleteConfigurationTask, and BatchDeleteAgents.

## __AWS CodePipeline__
  - ### Features
    - Add retryMode ALL_ACTIONS to RetryStageExecution API that retries a failed stage starting from first action in the stage

## __AWS Global Accelerator__
  - ### Features
    - Fixed error where ListCustomRoutingEndpointGroups did not have a paginator

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Adds permissions for GetResourcePolicy to support returning details about AWS Resource Access Manager resource policies for shared resources.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only updates to address Amazon ECS tickets.

## __Amazon GuardDuty__
  - ### Features
    - Add domainWithSuffix finding field to dnsRequestAction

## __Managed Streaming for Kafka__
  - ### Features
    - AWS Managed Streaming for Kafka is launching MSK Replicator, a new feature that enables customers to reliably replicate data across Amazon MSK clusters in same or different AWS regions. You can now use SDK to create, list, describe, delete, update, and manage tags of MSK Replicators.

## __Route53 Recovery Cluster__
  - ### Features
    - Adds Owner field to ListRoutingControls API.

# __1.12.567__ __2023-10-16__
## __AWS CloudFormation__
  - ### Features
    - SDK and documentation updates for UpdateReplacePolicy

## __AWS Elemental MediaPackage v2__
  - ### Features
    - This release allows customers to manage MediaPackage v2 resource using CloudFormation.

## __AWS EntityResolution__
  - ### Features
    - This launch expands our matching techniques to include provider-based matching to help customer match, link, and enhance records with minimal data movement. With data service providers, we have removed the need for customers to build bespoke integrations,.

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AWS Transfer Family

## __AWS X-Ray__
  - ### Features
    - This releases enhances GetTraceSummaries API to support new TimeRangeType Service to query trace summaries by segment end time.

## __Amazon Managed Blockchain Query__
  - ### Features
    - This release introduces two new APIs: GetAssetContract and ListAssetContracts. This release also adds support for Bitcoin Testnet.

## __Amazon OpenSearch Service__
  - ### Features
    - This release allows customers to list and associate optional plugin packages with compatible Amazon OpenSearch Service clusters for enhanced functionality.

## __Amazon Redshift__
  - ### Features
    - Added support for managing credentials of provisioned cluster admin using AWS Secrets Manager.

## __Amazon Simple Email Service__
  - ### Features
    - This release provides enhanced visibility into your SES identity verification status. This will offer you more actionable insights, enabling you to promptly address any verification-related issues.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Updated exsiting API to allow AWS Elastic Disaster Recovery support of launching recovery into existing EC2 instances.

## __Redshift Serverless__
  - ### Features
    - Added support for managing credentials of serverless namespace admin using AWS Secrets Manager.

# __1.12.566__ __2023-10-12__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new limit to the awsAccounts parameter. When you create or update an assessment, there is now a limit of 200 AWS accounts that can be specified in the assessment scope.

## __AWS Config__
  - ### Features
    - Add enums for resource types supported by Config

## __AWS Control Tower__
  - ### Features
    - Added new EnabledControl resource details to ListEnabledControls API and added new GetEnabledControl API.

## __AWS Glue__
  - ### Features
    - Extending version control support to GitLab and Bitbucket from AWSGlue

## __AWS Lambda__
  - ### Features
    - Adds support for Lambda functions to access Dual-Stack subnets over IPv6, via an opt-in flag in CreateFunction and UpdateFunctionConfiguration APIs

## __AWS Price List Service__
  - ### Features
    - Documentation updates for Price List

## __Amazon Connect Customer Profiles__
  - ### Features
    - Adds sensitive trait to various shapes in Customer Profiles Calculated Attribute API model.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds Ubuntu Pro as a supported platform for On-Demand Capacity Reservations and adds support for setting an Amazon Machine Image (AMI) to disabled state. Disabling the AMI makes it private if it was previously shared, and prevents new EC2 instance launches from it.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Update GetParticipant to return additional metadata.

## __Amazon Location Service__
  - ### Features
    - This release adds endpoint updates for all AWS Location resource operations.

## __Amazon Machine Learning__
  - ### Features
    - This release marks Password field as sensitive

## __Amazon Rekognition__
  - ### Features
    - Amazon Rekognition introduces support for Custom Moderation. This allows the enhancement of accuracy for detect moderation labels operations by creating custom adapters tuned on customer data.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for adding a dedicated log volume to open-source RDS instances.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Canvas adds KendraSettings and DirectDeploySettings support for CanvasAppSettings

## __Amazon Textract__
  - ### Features
    - This release adds 9 new APIs for adapter and adapter version management, 3 new APIs for tagging, and updates AnalyzeDocument and StartDocumentAnalysis API parameters for using adapters.

## __Amazon Transcribe Service__
  - ### Features
    - This release is to enable m4a format to customers

## __Amazon WorkSpaces__
  - ### Features
    - Updated the CreateWorkspaces action documentation to clarify that the PCoIP protocol is only available for Windows bundles.

## __Auto Scaling__
  - ### Features
    - Update the NotificationMetadata field to only allow visible ascii characters. Add paginators to DescribeInstanceRefreshes, DescribeLoadBalancers, and DescribeLoadBalancerTargetGroups

## __Elastic Load Balancing__
  - ### Features
    - This release enables routing policies with Availability Zone affinity for Network Load Balancers.

## __Inspector2__
  - ### Features
    - Add MacOs ec2 platform support

# __1.12.565__ __2023-10-06__
## __AWS Marketplace Catalog Service__
  - ### Features
    - This release adds support for Document type as an alternative for stringified JSON for StartChangeSet, DescribeChangeSet and DescribeEntity APIs

## __AWS Transfer Family__
  - ### Features
    - This release updates the max character limit of PreAuthenticationLoginBanner and PostAuthenticationLoginBanner to 4096 characters

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Elastic Compute Cloud (EC2).

## __Amazon FSx__
  - ### Features
    - After performing steps to repair the Active Directory configuration of a file system, use this action to initiate the process of attempting to recover to the file system.

## __Amazon QuickSight__
  - ### Features
    - NullOption in FilterListConfiguration; Dataset schema/table max length increased; Support total placement for pivot table visual; Lenient mode relaxes the validation to create resources with definition; Data sources can be added to folders; Redshift data sources support IAM Role-based authentication

# __1.12.564__ __2023-10-05__
## __AWS SecurityHub__
  - ### Features
    - Added new resource detail objects to ASFF, including resources for AwsEventsEventbus, AwsEventsEndpoint, AwsDmsEndpoint, AwsDmsReplicationTask, AwsDmsReplicationInstance, AwsRoute53HostedZone, and AwsMskCluster

## __AWS Storage Gateway__
  - ### Features
    - Add SoftwareVersion to response of DescribeGatewayInformation.

## __Amazon Omics__
  - ### Features
    - Add Etag Support for Omics Storage in ListReadSets and GetReadSetMetadata API

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for corrections and minor improvements.

## __Amazon Route 53__
  - ### Features
    - Add hostedzonetype filter to ListHostedZones API.

## __Amazon WorkSpaces__
  - ### Features
    - This release introduces Manage applications. This feature allows users to manage their WorkSpaces applications by associating or disassociating their WorkSpaces with applications. The DescribeWorkspaces API will now additionally return OperatingSystemName in its responses.

# __1.12.563__ __2023-10-04__
## __AWS MediaTailor__
  - ### Features
    - Updates DescribeVodSource to include a list of ad break opportunities in the response

## __Amazon AppConfig__
  - ### Features
    - AWS AppConfig introduces KMS customer-managed key (CMK) encryption support for data saved to AppConfig's hosted configuration store.

## __Amazon DataZone__
  - ### Features
    - Initial release of Amazon DataZone

## __Amazon SageMaker Service__
  - ### Features
    - Adding support for AdditionalS3DataSource, a data source used for training or inference that is in addition to the input dataset or model data.

## __Application Migration Service__
  - ### Features
    - This release includes the following new APIs: ListConnectors, CreateConnector,  UpdateConnector, DeleteConnector and UpdateSourceServer to support the source action framework feature.

# __1.12.562__ __2023-10-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds the ability to replace video frames without modifying the audio essence.

## __AWS Well-Architected Tool__
  - ### Features
    - AWS Well-Architected now supports Review Templates that allows you to create templates with pre-filled answers for Well-Architected and Custom Lens best practices.

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 API: Update to include new metrics CONTACTS_RESOLVED_IN_X , AVG_HOLD_TIME_ALL_CONTACTS , AVG_RESOLUTION_TIME , ABANDONMENT_RATE , AGENT_NON_RESPONSE_WITHOUT_CUSTOMER_ABANDONS with added features: Interval Period, TimeZone, Negate MetricFilters, Extended date time range.

## __Amazon Location Service__
  - ### Features
    - Amazon Location Service adds support for bounding polygon queries. Additionally, the GeofenceCount field has been added to the DescribeGeofenceCollection API response.

## __Amazon SageMaker Service__
  - ### Features
    - This release allows users to run Selective Execution in SageMaker Pipelines without SourcePipelineExecutionArn if selected steps do not have any dependent steps.

## __CloudWatch Observability Access Manager__
  - ### Features
    - This release adds support for sharing AWS::ApplicationInsights::Application resources.

# __1.12.561__ __2023-10-02__
## __AWS Security Token Service__
  - ### Features
    - STS API updates for assumeRole

## __AWS Single Sign-On__
  - ### Features
    - Fix FIPS Endpoints in aws-us-gov.

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AWS Transfer Family

## __Amazon Bedrock__
  - ### Features
    - Provisioned throughput feature with Amazon and third-party base models, and update validators for model identifier and taggable resource ARNs.

## __Amazon Bedrock Runtime__
  - ### Features
    - Add model timeout exception for InvokeModelWithResponseStream API and update validator for invoke model identifier.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introducing Amazon EC2 R7iz instances with 3.9 GHz sustained all-core turbo frequency and deliver up to 20% better performance than previous generation z1d instances.

## __Amazon Managed Blockchain__
  - ### Features
    - Remove Rinkeby as option from Ethereum APIs

## __Amazon Relational Database Service__
  - ### Features
    - Adds DefaultCertificateForNewLaunches field in the DescribeCertificates API response.

# __1.12.560__ __2023-09-28__
## __AWS Budgets__
  - ### Features
    - Update DescribeBudgets and DescribeBudgetNotificationsForAccount MaxResults limit to 1000.

## __AWS IoT FleetWise__
  - ### Features
    - AWS IoT FleetWise now supports encryption through a customer managed AWS KMS key. The PutEncryptionConfiguration and GetEncryptionConfiguration APIs were added.

## __AWS WAFV2__
  - ### Features
    - Correct and improve the documentation for the FieldToMatch option JA3 fingerprint.

## __Amazon Bedrock__
  - ### Features
    - Model Invocation logging added to enable or disable logs in customer account. Model listing and description support added. Provisioned Throughput feature added. Custom model support added for creating custom models. Also includes list, and delete functions for custom model.

## __Amazon Bedrock Runtime__
  - ### Features
    - Run Inference: Added support to run the inference on models.  Includes set of APIs for running inference in streaming and non-streaming mode.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for Customer Managed Key encryption for Amazon Verified Access resources

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Feature Store supports read/write of records with collection type features.

## __Amazon SageMaker Service__
  - ### Features
    - Online store feature groups supports Standard and InMemory tier storage types for low latency storage for real-time data retrieval. The InMemory tier supports collection types List, Set, and Vector.

# __1.12.559__ __2023-09-27__
## __AWS IoT__
  - ### Features
    - Added support for IoT Rules Engine Kafka Action Headers

## __Amazon Cognito Identity Provider__
  - ### Features
    - The UserPoolType Status field is no longer used.

## __Amazon Kinesis Firehose__
  - ### Features
    - Features : Adding support for new data ingestion source to Kinesis Firehose - AWS Managed Services Kafka.

## __Amazon Textract__
  - ### Features
    - This release adds new feature - Layout to Analyze Document API which can automatically extract layout elements such as titles, paragraphs, headers, section headers, lists, page numbers, footers, table areas, key-value areas and figure areas and order the elements as a human would read.

# __1.12.558__ __2023-09-26__
## __AWS App Runner__
  - ### Features
    - This release allows an App Runner customer to specify a custom source directory to run the build & start command. This change allows App Runner to support monorepo based repositories

## __AWS CodeDeploy__
  - ### Features
    - CodeDeploy now supports In-place and Blue/Green EC2 deployments with multiple Classic Load Balancers and multiple Target Groups.

## __AWS Lake Formation__
  - ### Features
    - This release adds three new API support "CreateLakeFormationOptIn", "DeleteLakeFormationOptIn" and "ListLakeFormationOptIns", and also updates the corresponding documentation.

## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service adds a set of APIs (in preview) to manage third party applications to be used in Amazon Connect agent workspace.

## __Amazon Connect Service__
  - ### Features
    - This release updates a set of Amazon Connect APIs that provides the ability to integrate third party applications in the Amazon Connect agent workspace.

## __Amazon DynamoDB__
  - ### Features
    - Amazon DynamoDB now supports Incremental Export as an enhancement to the existing Export Table

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The release includes AWS verified access to support FIPs compliance in North America regions

## __Amazon Pinpoint__
  - ### Features
    - Update documentation for RemoveAttributes to more accurately reflect its behavior when attributes are deleted.

## __Amazon Simple Storage Service__
  - ### Features
    - This release adds a new field COMPLETED to the ReplicationStatus Enum. You can now use this field to validate the replication status of S3 objects using the AWS SDK.

# __1.12.557__ __2023-09-25__
## __AWS Amplify UI Builder__
  - ### Features
    - Support for generating code that is compatible with future versions of amplify project dependencies.

## __AWS WAFV2__
  - ### Features
    - You can now perform an exact match against the web request's JA3 fingerprint.

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - Adds support for sending WebRTC audio to Amazon Kineses Video Streams.

## __Amazon QuickSight__
  - ### Features
    - Added ability to tag users upon creation.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release updates the enum values for ResourceType in SSM DescribeInstanceInformation input and ConnectionStatus in GetConnectionStatus output.

## __EMR Serverless__
  - ### Features
    - This release adds support for application-wide default job configurations.

## __FinSpace Public API__
  - ### Features
    - Adding sensitive trait to attributes. Change max SessionDuration from 720 to 60. Correct "ApiAccess" attribute to "apiAccess" to maintain consistency between APIs.

# __1.12.556__ __2023-09-22__
## __AWS Database Migration Service__
  - ### Features
    - new vendors for DMS CSF: MongoDB, MariaDB, DocumentDb and Redshift

## __AWS Elemental MediaConvert__
  - ### Features
    - This release supports the creation of of audio-only tracks in CMAF output groups.

## __Amazon CloudWatch Events__
  - ### Features
    - Adds sensitive trait to various shapes in Jetstream Connections API model.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 M2 Pro Mac instances are powered by Apple M2 Pro Mac Mini computers featuring 12 core CPU, 19 core GPU, 32 GiB of memory, and 16 core Apple Neural Engine and uniquely enabled by the AWS Nitro System through high-speed Thunderbolt connections.

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for Elastic File System

## __Amazon GuardDuty__
  - ### Features
    - Add `EKS_CLUSTER_NAME` to filter and sort key.

## __Braket__
  - ### Features
    - This release adds support to view the device queue depth (the number of queued quantum tasks and hybrid jobs on a device) and queue position for a quantum task and hybrid job.

# __1.12.555__ __2023-09-20__
## __AWS App Runner__
  - ### Features
    - This release adds improvements for managing App Runner auto scaling configuration resources. New APIs: UpdateDefaultAutoScalingConfiguration and ListServicesForAutoScalingConfiguration. Updated API: DeleteAutoScalingConfiguration.

## __AWS Cloud Map__
  - ### Features
    - Adds a new DiscoverInstancesRevision API and also adds InstanceRevision field to the DiscoverInstances API response.

## __AWS SSO OIDC__
  - ### Features
    - Update FIPS endpoints in aws-us-gov.

## __Amazon AppConfig__
  - ### Features
    - Enabling boto3 paginators for list APIs and adding documentation around ServiceQuotaExceededException errors

## __Amazon CloudWatch Logs__
  - ### Features
    - Add ClientToken to QueryDefinition CFN Handler in CWL

## __Amazon Kinesis Video Streams__
  - ### Features
    - Updated DescribeMediaStorageConfiguration, StartEdgeConfigurationUpdate, ImageGenerationConfiguration$SamplingInterval, and UpdateMediaStorageConfiguration to match AWS Docs.

## __Amazon Simple Storage Service__
  - ### Features
    - Fix an issue where the SDK can fail to unmarshall response due to NumberFormatException

## __CodeArtifact__
  - ### Features
    - Add support for the Swift package format.

# __1.12.554__ __2023-09-19__
## __AWS Outposts__
  - ### Features
    - This release adds the InstanceFamilies field to the ListAssets response.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for C7i, and R7a instance types.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for one-time model monitoring schedules that are executed immediately without delay, explicit data analysis windows for model monitoring schedules and exclude features attributes to remove features from model monitor analysis.

# __1.12.553__ __2023-09-18__
## __AWS Application Discovery Service__
  - ### Features
    - Add sensitive protection for customer information

## __Amazon Macie 2__
  - ### Features
    - This release changes the default managedDataIdentifierSelector setting for new classification jobs to RECOMMENDED. By default, new classification jobs now use the recommended set of managed data identifiers.

## __Amazon WorkMail__
  - ### Features
    - This release includes four new APIs UpdateUser, UpdateGroup, ListGroupsForEntity and DescribeEntity, along with RemoteUsers and some enhancements to existing APIs.

# __1.12.552__ __2023-09-15__
## __AWS DataSync__
  - ### Features
    - Documentation-only updates for AWS DataSync.

## __Amazon AppStream__
  - ### Features
    - This release introduces app block builder, allowing customers to provision a resource to package applications into an app block

## __Amazon Connect Service__
  - ### Features
    - New rule type (OnMetricDataUpdate) has been added

## __Amazon SageMaker Service__
  - ### Features
    - This release introduces Skip Model Validation for Model Packages

# __1.12.551__ __2023-09-14__
## __AWS CloudFormation__
  - ### Features
    - Documentation updates for AWS CloudFormation

## __AWS EntityResolution__
  - ### Features
    - Changed "ResolutionTechniques" and "MappedInputFields" in workflow and schema mapping operations to be required fields.

## __AWS SDK for Java__
  - ### Bugfixes
    - Fix an issue where the SDK can fail to unmarshal JSON responses containing unknown members in some situations.

## __Amazon AppStream__
  - ### Features
    - This release introduces multi-session fleets, allowing customers to provision more than one user session on a single fleet instance.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds APIs for the new scheduled retraining feature.

# __1.12.550__ __2023-09-13__
## __AWS Cloud9__
  - ### Features
    - Update to include information on Ubuntu 18 deprecation.

## __AWS SimSpace Weaver__
  - ### Features
    - Edited the introductory text for the API reference.

## __AWS X-Ray__
  - ### Features
    - Add StartTime field in GetTraceSummaries API response for each TraceSummary.

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release updates the Amazon CloudWatch Internet Monitor API domain name.

## __Amazon GuardDuty__
  - ### Features
    - Add `managementType` field to ListCoverage API response.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Doc only update that changes description for ParticipantToken.

## __Amazon Kinesis Firehose__
  - ### Features
    - DocumentIdOptions has been added for the Amazon OpenSearch destination.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Updated existing APIs and added new ones to support using AWS Elastic Disaster Recovery post-launch actions. Added support for new regions.

# __1.12.549__ __2023-09-12__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports confidence score buckets for retrieved passage results using the Retrieve API.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for restricting public sharing of AMIs through AMI Block Public Access

## __Amazon EventBridge__
  - ### Features
    - Adds sensitive trait to various shapes in Jetstream Connections API model.

# __1.12.548__ __2023-09-11__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental Link now supports attaching a Link UHD device to a MediaConnect flow.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release will have ValidationException be thrown from ECR LifecyclePolicy APIs in regions LifecyclePolicy is not supported, this includes existing Amazon Dedicated Cloud (ADC) regions. This release will also change Tag: TagValue and Tag: TagKey to required.

## __Amazon QuickSight__
  - ### Features
    - This release launches new updates to QuickSight KPI visuals - support for sparklines, new templated layout and new targets for conditional formatting rules.

# __1.12.547__ __2023-09-08__
## __AWS Single Sign-On Admin__
  - ### Features
    - Content updates to IAM Identity Center API for China Regions.

## __Amazon FSx__
  - ### Features
    - Amazon FSx documentation fixes

## __Amazon SageMaker Service__
  - ### Features
    - Autopilot APIs will now support holiday featurization for Timeseries models. The models will now hold holiday metadata and should be able to accommodate holiday effect during inference.

## __Amazon WorkSpaces__
  - ### Features
    - A new field "ErrorDetails" will be added to the output of "DescribeWorkspaceImages" API call. This field provides in-depth details about the error occurred during image import process. These details include the possible causes of the errors and troubleshooting information.

# __1.12.546__ __2023-09-07__
## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __AWS SimSpace Weaver__
  - ### Features
    - BucketName and ObjectKey are now required for the S3Location data type. BucketName is now required for the S3Destination data type.

## __Amazon NeptuneData__
  - ### Features
    - Minor changes to send unsigned requests to Neptune clusters

# __1.12.545__ __2023-09-06__
## __AWS Elemental MediaLive__
  - ### Features
    - Adds advanced Output Locking options for Epoch Locking: Custom Epoch and Jam Sync Time

## __AWS WAFV2__
  - ### Features
    - The targeted protection level of the Bot Control managed rule group now provides optional, machine-learning analysis of traffic statistics to detect some bot-related activity. You can enable or disable the machine learning functionality through the API.

## __Amazon Appflow__
  - ### Features
    - Adding OAuth2.0 support for servicenow connector.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds 'outpost' location type to the DescribeInstanceTypeOfferings API, allowing customers that have been allowlisted for outpost to query their offerings in the API.

## __Elastic Load Balancing__
  - ### Features
    - This release enables default UDP connection termination and disabling unhealthy target connection termination for Network Load Balancers.

# __1.12.544__ __2023-09-05__
## __AWS Cloud9__
  - ### Features
    - Added support for Ubuntu 22.04 that was not picked up in a previous Trebuchet request. Doc-only update.

## __AWS Compute Optimizer__
  - ### Features
    - This release adds support to provide recommendations for G4dn and P3 instances that use NVIDIA GPUs.

## __AWSBillingConductor__
  - ### Features
    - This release adds support for line item filtering in for the custom line item resource.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update for Amazon ECS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introducing Amazon EC2 C7gd, M7gd, and R7gd Instances with up to 3.8 TB of local NVMe-based SSD block-level storage. These instances are powered by AWS Graviton3 processors, delivering up to 25% better performance over Graviton2-based instances.

## __Amazon EventBridge__
  - ### Features
    - Improve Endpoint Ruleset test coverage.

## __Amazon Relational Database Service__
  - ### Features
    - Add support for feature integration with AWS Backup.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Neo now supports data input shape derivation for Pytorch 2.0  and XGBoost compilation job for cloud instance targets. You can skip DataInputConfig field during compilation job creation. You can also access derived information from model in DescribeCompilationJob response.

## __Amazon VPC Lattice__
  - ### Features
    - This release adds Lambda event structure version config support for LAMBDA target groups. It also adds newline support for auth policies.

# __1.12.543__ __2023-09-01__
## __AWS SSO Identity Store__
  - ### Features
    - New Identity Store content for China Region launch

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - This release adds support for the Voice Analytics feature for customer-owned KVS streams as part of the Amazon Chime SDK call analytics.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect adds the ability to read, create, update, delete, and list view resources, and adds the ability to read, create, delete, and list view versions.

## __Amazon NeptuneData__
  - ### Features
    - Removed the descriptive text in the introduction.

# __1.12.542__ __2023-08-31__
## __AWS Health APIs and Notifications__
  - ### Features
    - Adds new API DescribeEntityAggregatesForOrganization that retrieves entity aggregates across your organization. Also adds support for resource status filtering in DescribeAffectedEntitiesForOrganization, resource status aggregates in the DescribeEntityAggregates response, and new resource statuses.

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - This release adds support for feature Voice Enhancement for Call Recording as part of Amazon Chime SDK call analytics.

## __Amazon CloudHSM__
  - ### Features
    - Deprecating CloudHSM Classic API Service.

## __Amazon CloudWatch Events__
  - ### Features
    - Documentation updates for CloudWatch Events.

## __Amazon Connect Customer Profiles__
  - ### Features
    - Adds sensitive trait to various shapes in Customer Profiles API model.

## __Amazon Connect Participant Service__
  - ### Features
    - Amazon Connect Participant Service adds the ability to get a view resource using a view token, which is provided in a participant message, with the release of the DescribeView API.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for an account-level setting that you can use to configure the number of days for AWS Fargate task retirement.

## __Amazon Interactive Video Service__
  - ### Features
    - Updated "type" description for CreateChannel, UpdateChannel, Channel, and ChannelSummary.

## __Amazon Managed Grafana__
  - ### Features
    - Marking SAML RoleValues attribute as sensitive and updating VpcConfiguration attributes to match documentation.

## __Amazon SageMaker Runtime__
  - ### Features
    - This release adds a new InvokeEndpointWithResponseStream API to support streaming of model responses.

## __AmazonConnectCampaignService__
  - ### Features
    - Amazon Connect outbound campaigns has launched agentless dialing mode which enables customers to make automated outbound calls without agent engagement. This release updates three of the campaign management API's to support the new agentless dialing mode and the new dialing capacity field.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - Minor model changes for Kafka Connect as well as endpoint updates.

## __Payment Cryptography Data Plane__
  - ### Features
    - Make KeyCheckValue field optional when using asymmetric keys as Key Check Values typically only apply to symmetric keys

# __1.12.541__ __2023-08-30__
## __AWS App Runner__
  - ### Features
    - App Runner adds support for Bitbucket. You can now create App Runner connection that connects to your Bitbucket repositories and deploy App Runner service with the source code stored in a Bitbucket repository.

## __AWS Audit Manager__
  - ### Features
    - This release marks some assessment metadata as sensitive. We added a sensitive trait to the following attributes: assessmentName, emailAddress, scope, createdBy, lastUpdatedBy, and userName.

## __AWS Clean Rooms Service__
  - ### Features
    - This release decouples member abilities in a collaboration. With this change, the member who can run queries no longer needs to be the same as the member who can receive results.

## __AWS DataSync__
  - ### Features
    - AWS DataSync introduces Task Reports, a new feature that provides detailed reports of data transfer operations for each task execution.

## __AWS Network Firewall__
  - ### Features
    - Network Firewall increasing pagination token string length

## __Amazon Appflow__
  - ### Features
    - Add SAP source connector parallel and pagination feature

## __Amazon NeptuneData__
  - ### Features
    - Allows customers to execute data plane actions like bulk loading graphs, issuing graph queries using Gremlin and openCypher directly from the SDK.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Canvas adds IdentityProviderOAuthSettings support for CanvasAppSettings

## __PcaConnectorAd__
  - ### Features
    - The Connector for AD allows you to use a fully-managed AWS Private CA as a drop-in replacement for your self-managed enterprise CAs without local agents or proxy servers. Enterprises that use AD to manage Windows environments can reduce their private certificate authority (CA) costs and complexity.

# __1.12.540__ __2023-08-29__
## __Amazon Cognito Identity Provider__
  - ### Features
    - Added API example requests and responses for several operations. Fixed the validation regex for user pools Identity Provider name.

## __Amazon FSx__
  - ### Features
    - Documentation updates for project quotas.

## __Amazon Omics__
  - ### Features
    - Add RetentionMode support for Runs.

## __Amazon Simple Email Service__
  - ### Features
    - Adds support for the new Export and Message Insights features: create, get, list and cancel export jobs; get message insights.

# __1.12.539__ __2023-08-28__
## __AWS Backup__
  - ### Features
    - Add support for customizing time zone for backup window in backup plan rules.

## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate licensing optimization recommendations for sql server running on EC2 instances.

## __AWS Organizations__
  - ### Features
    - Documentation updates for permissions and links.

## __Amazon Security Lake__
  - ### Features
    - Remove incorrect regex enforcement on pagination tokens.

## __Amazon WorkSpaces Web__
  - ### Features
    - WorkSpaces Web now enables Admins to configure which cookies are synchronized from an end-user's local browser to the in-session browser. In conjunction with a browser extension, this feature enables enhanced Single-Sign On capability by reducing the number of times an end-user has to authenticate.

## __Service Quotas__
  - ### Features
    - Service Quotas now supports viewing the applied quota value and requesting a quota increase for a specific resource in an AWS account.

# __1.12.538__ __2023-08-25__
## __AWS CloudTrail__
  - ### Features
    - Add ThrottlingException with error code 429 to handle CloudTrail Delegated Admin request rate exceeded on organization resources.

## __Amazon CloudWatch__
  - ### Features
    - Doc-only update to get doc bug fixes into the SDK docs

## __Amazon Detective__
  - ### Features
    - Added protections to interacting with fields containing customer information.

# __1.12.537__ __2023-08-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes additional audio channel tags in Quicktime outputs, support for film grain synthesis for AV1 outputs, ability to create audio-only FLAC outputs, and ability to specify Amazon S3 destination storage class.

## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports passthrough of KLV data to a HLS output group with a TS container. MediaLive now supports setting an attenuation mode for AC3 audio when the coding mode is 3/2 LFE. MediaLive now supports specifying whether to include filler NAL units in RTMP output group settings.

## __AWS Glue__
  - ### Features
    - Added API attributes that help in the monitoring of sessions.

## __AWS MediaTailor__
  - ### Features
    - Adds new source location AUTODETECT_SIGV4 access type.

## __AWS S3 Control__
  - ### Features
    - Updates to endpoint ruleset tests to address Smithy validation issues and standardize the capitalization of DualStack.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 M7a instances, powered by 4th generation AMD EPYC processors, deliver up to 50% higher performance compared to M6a instances. Amazon EC2 Hpc7a instances, powered by 4th Gen AMD EPYC processors, deliver up to 2.5x better performance compared to Amazon EC2 Hpc6a instances.

## __Amazon QuickSight__
  - ### Features
    - Excel support in Snapshot Export APIs. Removed Required trait for some insight Computations. Namespace-shared Folders support. Global Filters support. Table pin Column support.

## __Amazon Relational Database Service__
  - ### Features
    - This release updates the supported versions for Percona XtraBackup in Aurora MySQL.

## __Amazon Simple Storage Service__
  - ### Features
    - Updates to endpoint ruleset tests to address Smithy validation issues.

## __Amazon Verified Permissions__
  - ### Features
    - Documentation updates for Amazon Verified Permissions.

# __1.12.536__ __2023-08-23__
## __Amazon API Gateway__
  - ### Features
    - This release adds RootResourceId to GetRestApi response.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Marking fields as sensitive on BundleTask and GetPasswordData

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds 1 new voice - Zayd (ar-AE)

# __1.12.535__ __2023-08-22__
## __AWS Cost Explorer Service__
  - ### Features
    - This release adds the LastUpdatedDate and LastUsedDate timestamps to help you manage your cost allocation tags.

## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now supports Client Ip Preservation for Network Load Balancer endpoints.

## __Amazon Relational Database Service__
  - ### Features
    - Adding parameters to CreateCustomDbEngineVersion reserved for future use.

## __Amazon Verified Permissions__
  - ### Features
    - Documentation updates for Amazon Verified Permissions. Increases max results per page for ListPolicyStores, ListPolicies, and ListPolicyTemplates APIs from 20 to 50.

# __1.12.534__ __2023-08-21__
## __AWS Cloud9__
  - ### Features
    - Doc only update to add Ubuntu 22.04 as an Image ID option for Cloud9

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The DeleteKeyPair API has been updated to return the keyPairId when an existing key pair is deleted.

## __Amazon Relational Database Service__
  - ### Features
    - Adding support for RDS Aurora Global Database Unplanned Failover

## __Amazon Route 53 Domains__
  - ### Features
    - Fixed typos in description fields

## __FinSpace User Environment Management service__
  - ### Features
    - Allow customers to manage outbound traffic from their Kx Environment when attaching a transit gateway by providing network acl entries. Allow the customer to choose how they want to update the databases on a cluster allowing updates to possibly be faster than usual.

# __1.12.533__ __2023-08-18__
## __AWS CodeCommit__
  - ### Features
    - Add new ListFileCommitHistory operation to retrieve commits which introduced changes to a specific file.

## __AWS SecurityHub__
  - ### Features
    - Added Inspector Lambda code Vulnerability section to ASFF, including GeneratorDetails, EpssScore, ExploitAvailable, and CodeVulnerabilities.

# __1.12.532__ __2023-08-17__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for SubnetConfigurations to allow users to select their own IPv4 and IPv6 addresses for Interface VPC endpoints

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift updates its instance types support.

# __1.12.531__ __2023-08-16__
## __Amazon CloudWatch__
  - ### Features
    - Doc-only update to incorporate several doc bug fixes

## __Amazon Lex Model Building V2__
  - ### Features
    - This release updates the Custom Vocabulary Weight field to support a value of 0.

# __1.12.530__ __2023-08-15__
## __AWS Glue__
  - ### Features
    - AWS Glue Crawlers can now accept SerDe overrides from a custom csv classifier. The two SerDe options are LazySimpleSerDe and OpenCSVSerDe. In case, the user wants crawler to do the selection, "None" can be selected for this purpose.

## __AWS Performance Insights__
  - ### Features
    - AWS Performance Insights for Amazon RDS is launching Performance Analysis On Demand, a new feature that allows you to analyze database performance metrics and find out the performance issues. You can now use SDK to create, list, get, delete, and manage tags of performance analysis reports.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Updated API documentation to include additional exceptions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Elastic Compute Cloud (EC2).

## __Amazon Route 53 Domains__
  - ### Features
    - Provide explanation if CheckDomainTransferability return false. Provide requestId if a request is already submitted.  Add sensitive protection for customer information

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now provides SupportedResponseMIMETypes from DescribeInferenceRecommendationsJob response

# __1.12.529__ __2023-08-14__
## __AWS Elemental MediaPackage__
  - ### Features
    - Fix SDK logging of certain fields.

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AWS Transfer Family

## __Amazon Omics__
  - ### Features
    - This release provides support for annotation store versioning and cross account sharing for Omics Analytics

# __1.12.528__ __2023-08-11__
## __AWS Config__
  - ### Features
    - Updated ResourceType enum with new resource types onboarded by AWS Config in July 2023.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 P5 instances, powered by the latest NVIDIA H100 Tensor Core GPUs, deliver the highest performance in EC2 for deep learning (DL) and HPC applications. M7i-flex and M7i instances are next-generation general purpose instances powered by custom 4th Generation Intel Xeon Scalable processors.

## __Amazon QuickSight__
  - ### Features
    - New Authentication method for Account subscription - IAM Identity Center. Hierarchy layout support, default column width support and related style properties for pivot table visuals. Non-additive topic field aggregations for Topic API

## __Amazon Simple Email Service__
  - ### Features
    - Doc only updates to include: 1) Clarified which part of an email address where it's okay to have Punycode when it contains non-ASCII characters for the SendRawEmail action and other actions where this is applicable. 2) Updated S3Action description with new MB max bucket size from 30 to 40.

## __Amazon Simple Workflow Service__
  - ### Features
    - This release adds new API parameters to override workflow task list for workflow executions.

## __AmplifyBackend__
  - ### Features
    - Adds sensitive trait to required input shapes.

# __1.12.527__ __2023-08-10__
## __AWS CloudTrail__
  - ### Features
    - Documentation updates for CloudTrail.

## __AWS Secrets Manager__
  - ### Features
    - Add additional InvalidRequestException to list of possible exceptions for ListSecret.

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AW Transfer Family

## __Amazon Connect Service__
  - ### Features
    - This release adds APIs to provision agents that are global / available in multiple AWS regions and distribute them across these regions by percentage.

## __Amazon Omics__
  - ### Features
    - This release adds instanceType to GetRunTask & ListRunTasks responses.

## __Elastic Load Balancing__
  - ### Features
    - This release enables configuring security groups for Network Load Balancers

# __1.12.526__ __2023-08-09__
## __AWS Global Accelerator__
  - ### Features
    - Documentation update for dualstack EC2 endpoint support

## __Amazon Chime SDK Voice__
  - ### Features
    - Updating CreatePhoneNumberOrder, UpdatePhoneNumber and BatchUpdatePhoneNumbers APIs, adding phone number name

## __Amazon FSx__
  - ### Features
    - For FSx for Lustre, add new data repository task type, RELEASE_DATA_FROM_FILESYSTEM, to release files that have been archived to S3. For FSx for Windows, enable support for configuring and updating SSD IOPS, and for updating storage type. For FSx for OpenZFS, add new deployment type, MULTI_AZ_1.

## __Amazon GuardDuty__
  - ### Features
    - Added autoEnable ALL to UpdateOrganizationConfiguration and DescribeOrganizationConfiguration APIs.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for cross account access for SageMaker Model Cards through AWS RAM.

# __1.12.525__ __2023-08-08__
## __AWS Backup__
  - ### Features
    - This release introduces a new logically air-gapped vault (Preview) in AWS Backup that stores immutable backup copies, which are locked by default and isolated with encryption using AWS owned keys. Logically air-gapped vault (Preview) allows secure recovery of application data across accounts.

## __AWS Service Catalog__
  - ### Features
    - Introduce support for HashiCorp Terraform Cloud in Service Catalog by addying TERRAFORM_CLOUD product type in CreateProduct and CreateProvisioningArtifact API.

## __Amazon ElastiCache__
  - ### Features
    - Added support for cluster mode in online migration and test migration API

# __1.12.524__ __2023-08-07__
## __Amazon Detective__
  - ### Features
    - Updated the email validation regex to be in line with the TLD name specifications.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Add QUOTA_EXCEEDED and PUBLISHER_NOT_FOUND to EventErrorCode for stage health events.

## __Amazon Kinesis Video Streams__
  - ### Features
    - This release enables minimum of Images SamplingInterval to be as low as 200 milliseconds in Kinesis Video Stream Image feature.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - This release enables minimum of Images SamplingInterval to be as low as 200 milliseconds in Kinesis Video Stream Image feature.

## __Amazon Rekognition__
  - ### Features
    - This release adds code snippets for Amazon Rekognition Custom Labels.

# __1.12.523__ __2023-08-04__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Documentation correction for AWS Private CA

## __AWS DataSync__
  - ### Features
    - Display cloud storage used capacity at a cluster level.

## __Amazon Connect Service__
  - ### Features
    - Added a new API UpdateRoutingProfileAgentAvailabilityTimer to update agent availability timer of a routing profile.

## __Amazon EC2 Container Service__
  - ### Features
    - This is a documentation update to address various tickets.

## __Amazon SageMaker Service__
  - ### Features
    - Including DataCaptureConfig key in the Amazon Sagemaker Search's transform job object

# __1.12.522__ __2023-08-03__
## __AWS Cloud9__
  - ### Features
    - Updated the deprecation date for Amazon Linux. Doc only update.

## __AWS Database Migration Service__
  - ### Features
    - The release makes public API for DMS Schema Conversion feature.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds new parameter isPrimaryIPv6 to  allow assigning an IPv6 address as a primary IPv6 address to a network interface which cannot be changed to give equivalent functionality available for network interfaces with primary IPv4 address.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on p5.48xlarge instance types.

## __Auto Scaling__
  - ### Features
    - Documentation changes related to Amazon EC2 Auto Scaling APIs.

# __1.12.521__ __2023-08-02__
## __AWS Budgets__
  - ### Features
    - As part of CAE tagging integration we need to update our budget names regex filter to prevent customers from using "/action/" in their budget names.

## __AWS Glue__
  - ### Features
    - This release includes additional Glue Streaming KAKFA SASL property types.

## __AWS Resilience Hub__
  - ### Features
    - Drift Detection capability added when applications policy has moved from a meet to breach state. Customers will be able to exclude operational recommendations and receive credit in their resilience score. Customers can now add ARH permissions to an existing or new role.

## __Amazon Cognito Identity Provider__
  - ### Features
    - New feature that logs Cognito user pool error messages to CloudWatch logs.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender introduces a new API GetScalingConfigurationRecommendation to recommend auto scaling policies based on completed Inference Recommender jobs.

# __1.12.520__ __2023-08-01__
## __AWS Batch__
  - ### Features
    - This release adds support for price capacity optimized allocation strategy for Spot Instances.

## __AWS Database Migration Service__
  - ### Features
    - Adding new API describe-engine-versions which provides information about the lifecycle of a replication instance's version.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental Link devices now report their Availability Zone. Link devices now support the ability to change their Availability Zone.

## __AWS SDK for Java__
  - ### Features
    - Adding support for il-central-1 that is TLV_Israel region

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release adds a new feature for Amazon CloudWatch Internet Monitor that enables customers to set custom thresholds, for performance and availability drops, for impact limited to a single city-network to trigger creation of a health event.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new French Belgian voice - Isabelle. Isabelle is available as Neural voice only.

## __Amazon Relational Database Service__
  - ### Features
    - Added support for deleted clusters PiTR.

## __Amazon SageMaker Service__
  - ### Features
    - Add Stairs TrafficPattern and FlatInvocations to RecommendationJobStoppingConditions

# __1.12.519__ __2023-07-31__
## __AWS Amplify UI Builder__
  - ### Features
    - Amplify Studio releases GraphQL support for codegen job action.

## __AWS Clean Rooms Service__
  - ### Features
    - This release introduces custom SQL queries - an expanded set of SQL you can run. This release adds analysis templates, a new resource for storing pre-defined custom SQL queries ahead of time. This release also adds the Custom analysis rule, which lets you approve analysis templates for querying.

## __AWS CodeStar connections__
  - ### Features
    - New integration with the Gitlab provider type.

## __Amazon EventBridge Scheduler__
  - ### Features
    - This release introduces automatic deletion of schedules in EventBridge Scheduler. If configured, EventBridge Scheduler automatically deletes a schedule after the schedule has completed its last invocation.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release includes new import resource, model versioning and resource policy features.

## __Amazon Omics__
  - ### Features
    - Add CreationType filter for ListReadSets

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Aurora MySQL local write forwarding, which allows for forwarding of write operations from reader DB instances to the writer DB instance.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Israel (Tel Aviv) Region (il-central-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Auto Scaling__
  - ### Features
    - You can now configure an instance refresh to set its status to 'failed' when it detects that a specified CloudWatch alarm has gone into the ALARM state. You can also choose to roll back the instance refresh automatically when the alarm threshold is met.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Add support for in-aws right sizing

## __Inspector2__
  - ### Features
    - This release adds 1 new API: BatchGetFindingDetails to retrieve enhanced vulnerability intelligence details for findings.

# __1.12.518__ __2023-07-28__
## __AWS CloudFormation__
  - ### Features
    - This SDK release is for the feature launch of AWS CloudFormation RetainExceptOnCreate. It adds a new parameter retainExceptOnCreate in the following APIs: CreateStack, UpdateStack, RollbackStack, ExecuteChangeSet.

## __Amazon CloudFront__
  - ### Features
    - Add a new JavaScript runtime version for CloudFront Functions.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - This release enable customer to add/remove/update more than one workload for a component

## __Amazon Connect Service__
  - ### Features
    - This release adds support for new number types.

## __Amazon Pinpoint__
  - ### Features
    - Added support for sending push notifications using the FCM v1 API with json credentials. Amazon Pinpoint customers can now deliver messages to Android devices using both FCM v1 API and the legacy FCM/GCM API

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has introduced new versions of ListClusterOperations and DescribeClusterOperation APIs. These v2 APIs provide information and insights into the ongoing operations of both MSK Provisioned and MSK Serverless clusters.

# __1.12.517__ __2023-07-27__
## __Amazon Simple Queue Service__
  - ### Features
    - Documentation changes related to SQS APIs.

# __1.12.516__ __2023-07-27__
## __Amazon Elastic Block Store__
  - ### Features
    - SDK and documentation updates for Amazon Elastic Block Store API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - SDK and documentation updates for Amazon Elastic Block Store APIs

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Add multiple customer error code to handle customer caused failure when managing EKS node groups

## __Amazon SageMaker Service__
  - ### Features
    - Expose ProfilerConfig attribute in SageMaker Search API response.

## __Auto Scaling__
  - ### Features
    - This release updates validation for instance types used in the AllowedInstanceTypes and ExcludedInstanceTypes parameters of the InstanceRequirements property of a MixedInstancesPolicy.

# __1.12.515__ __2023-07-26__
## __AWS Cloud Control API__
  - ### Features
    - Updates the documentation for CreateResource.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes general updates to user documentation.

## __AWS EntityResolution__
  - ### Features
    - AWS Entity Resolution can effectively match a source record from a customer relationship management (CRM) system with a source record from a marketing system containing campaign information.

## __AWS Glue__
  - ### Features
    - Release Glue Studio Snowflake Connector Node for SDK/CLI

## __Amazon HealthLake__
  - ### Features
    - Updating the HealthLake service documentation.

## __Amazon Managed Blockchain Query__
  - ### Features
    - Amazon Managed Blockchain (AMB) Query provides serverless access to standardized, multi-blockchain datasets with developer-friendly APIs.

## __Amazon Omics__
  - ### Features
    - The service is renaming as a part of AWS Health.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds 1 new voice - Lisa (nl-BE)

## __Amazon Route 53__
  - ### Features
    - Update that corrects the documents for received feedback.

## __OpenSearch Service Serverless__
  - ### Features
    - This release adds new collection type VectorSearch.

# __1.12.514__ __2023-07-25__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Microsoft Azure Blob Storage locations.

## __AWS Lambda__
  - ### Features
    - Add Python 3.11 (python3.11) support to AWS Lambda

## __AWS Security Token Service__
  - ### Features
    - API updates for the AWS Security Token Service

## __AWS SecurityHub__
  - ### Features
    - Add support for CONTAINS and NOT_CONTAINS comparison operators for Automation Rules string filters and map filters

## __AWS Transfer Family__
  - ### Features
    - This release adds support for SFTP Connectors.

## __AWSBillingConductor__
  - ### Features
    - Added support for Auto-Assocate Billing Groups for CreateBillingGroup, UpdateBillingGroup, and ListBillingGroups.

## __Amazon Connect Customer Profiles__
  - ### Features
    - Amazon Connect Customer Profiles now supports rule-based resolution to match and merge similar profiles into unified profiles, helping companies deliver faster and more personalized customer service by providing access to relevant customer information for agents and automated experiences.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release added two new data types: AssistantIntegrationConfiguration, and SessionIntegrationConfiguration to support Wisdom integration with Amazon Connect Chat

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for DynamoDB

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds an instance's peak and baseline network bandwidth as well as the memory sizes of an instance's inference accelerators to DescribeInstanceTypes.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for monitoring storage optimization progress on the DescribeDBInstances API.

## __Amazon SageMaker Service__
  - ### Features
    - Mark ContentColumn and TargetLabelColumn as required Targets in TextClassificationJobConfig in CreateAutoMLJobV2API

## __EMR Serverless__
  - ### Features
    - This release adds support for publishing application logs to CloudWatch.

# __1.12.513__ __2023-07-24__
## __AWS CloudFormation__
  - ### Features
    - This release supports filtering by DRIFT_STATUS for existing API ListStackInstances and adds support for a new API ListStackInstanceResourceDrifts. Customers can now view resource drift information from their StackSet management accounts.

## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces the new API 'GetSavingsPlanPurchaseRecommendationDetails', which retrieves the details for a Savings Plan recommendation. It also updates the existing API 'GetSavingsPlansPurchaseRecommendation' to include the recommendation detail ID.

## __AWS Glue__
  - ### Features
    - Added support for Data Preparation Recipe node in Glue Studio jobs

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - AWS Media Pipeline compositing enhancement and Media Insights Pipeline auto language identification.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add "disabled" enum value to SpotInstanceState.

## __Amazon QuickSight__
  - ### Features
    - This release launches new Snapshot APIs for CSV and PDF exports, adds support for info icon for filters and parameters in Exploration APIs, adds modeled exception to the DeleteAccountCustomization API, and introduces AttributeAggregationFunction's ability to add UNIQUE_VALUE aggregation in tooltips.

## __AmazonApiGatewayV2__
  - ### Features
    - Documentation updates for Amazon API Gateway.

# __1.12.512__ __2023-07-21__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes improvements to Preserve 444 handling, compatibility of HEVC sources without frame rates, and general improvements to MP4 outputs.

## __AWS Glue__
  - ### Features
    - This release adds support for AWS Glue Crawler with Apache Hudi Tables, allowing Crawlers to discover Hudi Tables in S3 and register them in Glue Data Catalog for query engines to query against.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for the DBSystemID parameter of CreateDBInstance to RDS Custom for Oracle.

## __Amazon WorkSpaces__
  - ### Features
    - Fixed VolumeEncryptionKey descriptions

# __1.12.511__ __2023-07-20__
## __Amazon CodeCatalyst__
  - ### Features
    - This release adds support for updating and deleting spaces and projects in Amazon CodeCatalyst. It also adds support for creating, getting, and deleting source repositories in CodeCatalyst projects.

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to assign a case to a queue or user.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release updates type for Channel field in SessionSpecification and UtteranceSpecification

## __Amazon Route 53 Resolver__
  - ### Features
    - This release adds support for Route 53 On Outposts, a new feature that allows customers to run Route 53 Resolver and Resolver endpoints locally on their Outposts.

## __Amazon S3__
  - ### Features
    - Add ability to set a server-side encryption customer managed key for `CompleteMultipartUpload`.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Cross account support for SageMaker Feature Store

## __Amazon SageMaker Service__
  - ### Features
    - Cross account support for SageMaker Feature Store

## __Amazon Security Lake__
  - ### Features
    - Adding support for Tags on Create and Resource Tagging API.

## __Amazon Simple Storage Service__
  - ### Features
    - Improve performance of S3 clients by simplifying and optimizing endpoint resolution.

## __Amazon Transcribe Service__
  - ### Features
    - Added API argument --toxicity-detection to startTranscriptionJob API, which allows users to view toxicity scores of submitted audio.

# __1.12.510__ __2023-07-19__
## __AWS Savings Plans__
  - ### Features
    - Savings Plans endpoints update

# __1.12.509__ __2023-07-19__
## __AWS CloudFormation__
  - ### Features
    - SDK and documentation updates for GetTemplateSummary API (unrecognized resources)

## __AWS Health Imaging__
  - ### Features
    - General Availability (GA) release of AWS Health Imaging, enabling customers to store, transform, and analyze medical imaging data at petabyte-scale.

## __AWS Resource Access Manager__
  - ### Features
    - This release adds support for securely sharing with AWS service principals.

## __AWS Systems Manager for SAP__
  - ### Features
    - Added support for SAP Hana High Availability discovery (primary and secondary nodes) and Backint agent installation with SSM for SAP.

## __AWS WAFV2__
  - ### Features
    - Added the URI path to the custom aggregation keys that you can specify for a rate-based rule.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 documentation updates.

## __Amazon Managed Grafana__
  - ### Features
    - Amazon Managed Grafana now supports grafanaVersion update for existing workspaces with UpdateWorkspaceConfiguration API. DescribeWorkspaceConfiguration API additionally returns grafanaVersion. A new ListVersions API lists available versions or, if given a workspaceId, the versions it can upgrade to.

# __1.12.508__ __2023-07-18__
## __AWSMainframeModernization__
  - ### Features
    - Allows UpdateEnvironment to update the environment to 0 host capacity. New GetSignedBluinsightsUrl API

## __Amazon CodeGuru Security__
  - ### Features
    - Documentation updates for CodeGuru Security.

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 API: Update to include Contact Lens Conversational Analytics Metrics

## __Amazon Elasticsearch Service__
  - ### Features
    - Regex Validation on the ElasticSearch Engine Version attribute

## __Amazon Import/Export Snowball__
  - ### Features
    - Adds support for RACK_5U_C. This is the first AWS Snow Family device designed to meet U.S. Military Ruggedization Standards (MIL-STD-810H) with 208 vCPU device in a portable, compact 5U, half-rack width form-factor.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Lex Developers to view analytics for their bots.

## __Amazon Translate__
  - ### Features
    - Added DOCX word document support to TranslateDocument API

# __1.12.507__ __2023-07-17__
## __AWS Glue__
  - ### Features
    - Adding new supported permission type flags to get-unfiltered endpoints that callers may pass to indicate support for enforcing Lake Formation fine-grained access control on nested column attributes.

## __AWS Lake Formation__
  - ### Features
    - Adds supports for ReadOnlyAdmins and AllowFullTableExternalDataAccess. Adds NESTED_PERMISSION and NESTED_CELL_PERMISSION to SUPPORTED_PERMISSION_TYPES enum. Adds CREATE_LF_TAG on catalog resource and ALTER, DROP, and GRANT_WITH_LF_TAG_EXPRESSION on LF Tag resource.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Added major version upgrade option in ModifyDBCluster API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add Nitro TPM support on DescribeInstanceTypes

## __Amazon Interactive Video Service__
  - ### Features
    - This release provides the flexibility to configure what renditions or thumbnail qualities to record when creating recording configuration.

## __CodeArtifact__
  - ### Features
    - Doc only update for AWS CodeArtifact

# __1.12.506__ __2023-07-13__
## __AWS DataSync__
  - ### Features
    - Added LunCount to the response object of DescribeStorageSystemResourcesResponse, LunCount represents the number of LUNs on a storage system resource.

## __AWS Database Migration Service__
  - ### Features
    - Enhanced PostgreSQL target endpoint settings for providing Babelfish support.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS MediaTailor__
  - ### Features
    - Adds categories to MediaTailor channel assembly alerts

## __AWS Proton__
  - ### Features
    - This release adds support for deployment history for Proton provisioned resources

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Amazon Cognito Identity Provider__
  - ### Features
    - API model updated in Amazon Cognito

## __Amazon Connect Service__
  - ### Features
    - Add support for deleting Queues and Routing Profiles.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for the C7gn and Hpc7g instances. C7gn instances are powered by AWS Graviton3 processors and the fifth-generation AWS Nitro Cards. Hpc7g instances are powered by AWS Graviton 3E processors and provide up to 200 Gbps network bandwidth.

## __Amazon FSx__
  - ### Features
    - Amazon FSx for NetApp ONTAP now supports SnapLock, an ONTAP feature that enables you to protect your files in a volume by transitioning them to a write once, read many (WORM) state.

## __Amazon Personalize__
  - ### Features
    - This release provides ability to customers to change schema associated with their datasets in Amazon Personalize

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Canvas adds WorkspeceSettings support for CanvasAppSettings

## __Amazon Simple Storage Service__
  - ### Features
    - S3 Inventory now supports Object Access Control List and Object Owner as available object metadata fields in inventory reports.

# __1.12.505__ __2023-07-11__
## __Amazon Cognito Identity Provider__
  - ### Features
    - API model updated in Amazon Cognito

# __1.12.504__ __2023-07-07__
## __AWS Database Migration Service__
  - ### Features
    - Releasing DMS Serverless. Adding support for PostgreSQL 15.x as source and target endpoint. Adding support for DocDB Elastic Clusters with sharded collections, PostgreSQL datatype mapping customization and disabling hostname validation of the certificate authority in Kafka endpoint settings

## __AWS Elemental MediaLive__
  - ### Features
    - This release enables the use of Thumbnails in AWS Elemental MediaLive.

## __AWS Glue__
  - ### Features
    - This release enables customers to create new Apache Iceberg tables and associated metadata in Amazon S3 by using native AWS Glue CreateTable operation.

## __AWS MediaTailor__
  - ### Features
    - The AWS Elemental MediaTailor SDK for Channel Assembly has added support for EXT-X-CUE-OUT and EXT-X-CUE-IN tags to specify ad breaks in HLS outputs, including support for EXT-OATCLS, EXT-X-ASSET, and EXT-X-CUE-OUT-CONT accessory tags.

## __Amazon CloudWatch Logs__
  - ### Features
    - Add CMK encryption support for CloudWatch Logs Insights query result data

# __1.12.503__ __2023-07-06__
## __AWS Outposts__
  - ### Features
    - Added paginator support to several APIs. Added the ISOLATED enum value to AssetState.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add Nitro Enclaves support on DescribeInstanceTypes

## __Amazon Location Service__
  - ### Features
    - This release adds support for authenticating with Amazon Location Service's Places & Routes APIs with an API Key. Also, with this release developers can publish tracked device position updates to Amazon EventBridge.

## __Amazon QuickSight__
  - ### Features
    - This release includes below three changes: small multiples axes improvement, field based coloring, removed required trait from Aggregation function for TopBottomFilter.

## __Amazon Relational Database Service__
  - ### Features
    - Updates Amazon RDS documentation for creating DB instances and creating Aurora global clusters.

# __1.12.502__ __2023-07-05__
## __AWS Comprehend Medical__
  - ### Features
    - Update to Amazon Comprehend Medical documentation.

## __AWS Key Management Service__
  - ### Features
    - Added Dry Run Feature to cryptographic and cross-account mutating KMS APIs (14 in all). This feature allows users to test their permissions and parameters before making the actual API call.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 API: Channels filters do not count towards overall limitation of 100 filter values.

## __Application Migration Service__
  - ### Features
    - This release introduces the Global view feature and new Replication state APIs.

# __1.12.501__ __2023-07-03__
## __AWS Batch__
  - ### Features
    - This feature allows customers to use AWS Batch with Linux with ARM64 CPU Architecture and X86_64 CPU Architecture with Windows OS on Fargate Platform.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now accepts new fields SupportedEndpointType and ServerlessConfiguration to support serverless endpoints.

# __1.12.500__ __2023-06-30__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release includes improved color handling of overlays and general updates to user documentation.

## __AWS Transfer Family__
  - ### Features
    - Add outbound Basic authentication support to AS2 connectors

## __Amazon EC2 Container Service__
  - ### Features
    - Added new field  "credentialspecs" to the ecs task definition to support gMSA of windows/linux in both domainless and domain-joined mode

## __Amazon Interactive Video Service__
  - ### Features
    - Corrects the HTTP response code in the generated docs for PutMetadata and DeleteRecordingConfiguration APIs.

## __Amazon Prometheus Service__
  - ### Features
    - AWS SDK service model  generation tool version upgrade.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for rolling deployment in SageMaker Inference.

## __Amazon Verified Permissions__
  - ### Features
    - This release corrects several broken links in the documentation.

# __1.12.499__ __2023-06-29__
## __AWS Clean Rooms Service__
  - ### Features
    - This release adds support for the OR operator in RSQL join match conditions and the ability to control which operators (AND, OR) are allowed in a join match condition.

## __AWS Glue__
  - ### Features
    - This release adds support for AWS Glue Crawler with Iceberg Tables, allowing Crawlers to discover Iceberg Tables in S3 and register them in Glue Data Catalog for query engines to query against.

## __Amazon AppStream__
  - ### Features
    - This release introduces app block builder, allowing customers to provision a resource to package applications into an app block

## __Amazon Chime__
  - ### Features
    - The Amazon Chime SDK APIs in the Chime namespace are no longer supported.  Customers should use APIs in the dedicated Amazon Chime SDK namespaces: ChimeSDKIdentity, ChimeSDKMediaPipelines, ChimeSDKMeetings, ChimeSDKMessaging, and ChimeSDKVoice.

## __Amazon DynamoDB__
  - ### Features
    - This release adds ReturnValuesOnConditionCheckFailure parameter to PutItem, UpdateItem, DeleteItem, ExecuteStatement, BatchExecuteStatement and ExecuteTransaction APIs. When set to ALL_OLD,  API returns a copy of the item as it was when a conditional write failed

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift now supports game builds that use the Amazon Linux 2023 (AL2023) operating system.

## __Amazon SageMaker Service__
  - ### Features
    - Adding support for timeseries forecasting in the CreateAutoMLJobV2 API.

# __1.12.498__ __2023-06-28__
## __AWS Lambda__
  - ### Features
    - Surface ResourceConflictException in DeleteEventSourceMapping

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release adds a new feature for Amazon CloudWatch Internet Monitor that enables customers to set custom thresholds, for performance and availability drops, for triggering when to create a health event.

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for new runtime environment in Kinesis Data Analytics Studio: Zeppelin-0.10, Apache Flink-1.15

## __Amazon Omics__
  - ### Features
    - Add Common Workflow Language (CWL) as a supported language for Omics workflows

## __Amazon Relational Database Service__
  - ### Features
    - Amazon Relational Database Service (RDS) now supports joining a RDS for SQL Server instance to a self-managed Active Directory.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for Model Cards Model Registry integration.

## __Amazon Simple Storage Service__
  - ### Features
    - The S3 LISTObjects, ListObjectsV2 and ListObjectVersions API now supports a new optional header x-amz-optional-object-attributes. If header contains RestoreStatus as the value, then S3 will include Glacier restore status i.e. isRestoreInProgress and RestoreExpiryDate in List response.

# __1.12.497__ __2023-06-27__
## __AWS Private 5G__
  - ### Features
    - This release allows Private5G customers to choose different commitment plans (60-days, 1-year, 3-years) when placing new orders, enables automatic renewal option for 1-year and 3-years commitments. It also allows customers to update the commitment plan of an existing radio unit.

## __Amazon Appflow__
  - ### Features
    - This release adds support to bypass SSO with the SAPOData connector when connecting to an SAP instance.

## __Amazon Interactive Video Service__
  - ### Features
    - IVS customers can now revoke the viewer session associated with an auth token, to prevent and stop playback using that token.

## __Amazon Kinesis Video Streams__
  - ### Features
    - General Availability (GA) release of Kinesis Video Streams at Edge, enabling customers to provide a configuration for the Kinesis Video Streams EdgeAgent running on an on-premise IoT device. Customers can now locally record from cameras and stream videos to the cloud on a configured schedule.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for configuring new classification jobs to use the set of managed data identifiers that we recommend for jobs. For the managed data identifier selection type (managedDataIdentifierSelector), specify RECOMMENDED.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Introducing TTL for online store records for feature groups.

## __Amazon SageMaker Service__
  - ### Features
    - Introducing TTL for online store records in feature groups.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Systems Manager doc-only update for June 2023.

## __Amazon Verified Permissions__
  - ### Features
    - This update fixes several broken links to the Cedar documentation.

## __AppFabric__
  - ### Features
    - Initial release of AWS AppFabric for connecting SaaS applications for better productivity and security.

## __EMR Serverless__
  - ### Features
    - This release adds support to update the release label of an EMR Serverless application to upgrade it to a different version of Amazon EMR via UpdateApplication API.

# __1.12.496__ __2023-06-26__
## __AWS Glue__
  - ### Features
    - Timestamp Starting Position For Kinesis and Kafka Data Sources in a Glue Streaming Job

## __AWS Identity and Access Management__
  - ### Features
    - Support for a new API "GetMFADevice" to present MFA device metadata such as device certifications

## __Amazon Connect Service__
  - ### Features
    - This release provides a way to search for existing tags within an instance. Before tagging a resource, ensure consistency by searching for pre-existing key:value pairs.

## __Amazon GuardDuty__
  - ### Features
    - Add support for user.extra.sessionName in Kubernetes Audit Logs Findings.

## __Amazon Pinpoint__
  - ### Features
    - Added time zone estimation support for journeys

# __1.12.495__ __2023-06-23__
## __Amazon DevOps Guru__
  - ### Features
    - This release adds support for encryption via customer managed keys.

## __Amazon FSx__
  - ### Features
    - Update to Amazon FSx documentation.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation improvements for create, describe, and modify DB clusters and DB instances.

## __Amazon Verified Permissions__
  - ### Features
    - Added improved descriptions and new code samples to SDK documentation.

# __1.12.494__ __2023-06-23__
## __AWS Step Functions__
  - ### Features
    - Adds support for Versions and Aliases. Adds 8 operations: PublishStateMachineVersion, DeleteStateMachineVersion, ListStateMachineVersions, CreateStateMachineAlias, DescribeStateMachineAlias, UpdateStateMachineAlias, DeleteStateMachineAlias, ListStateMachineAliases

## __AWSKendraFrontendService__
  - ### Features
    - Introducing Amazon Kendra Retrieve API that can be used to retrieve relevant passages or text excerpts given an input query.

## __Amazon Chime SDK Identity__
  - ### Features
    - AppInstanceBots can be configured to be invoked or not using the Target or the CHIME.mentions attribute for ChannelMessages

## __Amazon Chime SDK Messaging__
  - ### Features
    - ChannelMessages can be made visible to sender and intended recipient rather than all channel members with the target attribute. For example, a user can send messages to a bot and receive messages back in a group channel without other members seeing them.

# __1.12.493__ __2023-06-21__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release introduces the bandwidth reduction filter for the HEVC encoder, increases the limits of outputs per job, and updates support for the Nagra SDK to version 1.14.7.

## __AWS Transfer Family__
  - ### Features
    - This release adds a new parameter StructuredLogDestinations to CreateServer, UpdateServer APIs.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for DynamoDB

## __Amazon EMR__
  - ### Features
    - This release introduces a new Amazon EMR EPI called ListSupportedInstanceTypes that returns a list of all instance types supported by a given EMR release.

## __Amazon SageMaker Service__
  - ### Features
    - This release provides support in SageMaker for output files in training jobs to be uploaded without compression and enable customer to deploy uncompressed model from S3 to real-time inference Endpoints. In addition, ml.trn1n.32xlarge is added to supported instance type list in training job.

## __AmazonMQ__
  - ### Features
    - The Cross Region Disaster Recovery feature allows to replicate a brokers state from one region to another in order to provide customers with multi-region resiliency in the event of a regional outage.

## __Inspector2__
  - ### Features
    - This release adds support for Software Bill of Materials (SBOM) export and the general availability of code scanning for AWS Lambda functions.

# __1.12.492__ __2023-06-20__
## __AWS Config__
  - ### Features
    - Updated ResourceType enum with new resource types onboarded by AWS Config in May 2023.

## __AWS Lambda__
  - ### Features
    - This release adds RecursiveInvocationException to the Invoke API and InvokeWithResponseStream API.

## __Amazon Appflow__
  - ### Features
    - This release adds new API to reset connector metadata cache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for targeting Dedicated Host allocations by assetIds in AWS Outposts

## __Amazon Redshift__
  - ### Features
    - Added support for custom domain names for Redshift Provisioned clusters. This feature enables customers to create a custom domain name and use ACM to generate fully secure connections to it.

# __1.12.491__ __2023-06-19__
## __AWS CloudFormation__
  - ### Features
    - Specify desired CloudFormation behavior in the event of ChangeSet execution failure using the CreateChangeSet OnStackFailure parameter

## __AWS Glue__
  - ### Features
    - This release adds support for creating cross region table/database resource links

## __AWS Price List Service__
  - ### Features
    - This release updates the PriceListArn regex pattern.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address various tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - API changes to AWS Verified Access to include data from trust providers in logs

## __Amazon Route 53 Domains__
  - ### Features
    - Update MaxItems upper bound to 1000 for ListPricesRequest

## __Amazon SageMaker Service__
  - ### Features
    - Amazon Sagemaker Autopilot releases CreateAutoMLJobV2 and DescribeAutoMLJobV2 for Autopilot customers with ImageClassification, TextClassification and Tabular problem type config support.

# __1.12.490__ __2023-06-16__
## __AWS Account__
  - ### Features
    - Improve pagination support for ListRegions

## __AWS Application Discovery Service__
  - ### Features
    - Add Amazon EC2 instance recommendations export

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __Amazon Connect Service__
  - ### Features
    - Updates the *InstanceStorageConfig APIs to support a new ResourceType: SCREEN_RECORDINGS to enable screen recording and specify the storage configurations for publishing the recordings. Also updates DescribeInstance and ListInstances APIs to include InstanceAccessUrl attribute in the API response.

## __Amazon Simple Storage Service__
  - ### Features
    - This release adds SDK support for request-payer request header and request-charged response header in the "GetBucketAccelerateConfiguration", "ListMultipartUploads", "ListObjects", "ListObjectsV2" and "ListObjectVersions" S3 APIs.

# __1.12.489__ __2023-06-15__
## __AWS Audit Manager__
  - ### Features
    - This release introduces 2 Audit Manager features: CSV exports and new manual evidence options. You can now export your evidence finder results in CSV format. In addition, you can now add manual evidence to a control by entering free-form text or uploading a file from your browser.

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for EFS.

## __Amazon GuardDuty__
  - ### Features
    - Updated descriptions for some APIs.

## __Amazon Location Service__
  - ### Features
    - Amazon Location Service adds categories to places, including filtering on those categories in searches. Also, you can now add metadata properties to your geofences.

# __1.12.488__ __2023-06-13__
## __AWS CloudTrail__
  - ### Features
    - This feature allows users to view dashboards for CloudTrail Lake event data stores.

## __AWS SecurityHub__
  - ### Features
    - Add support for Security Hub Automation Rules

## __AWS SimSpace Weaver__
  - ### Features
    - This release fixes using aws-us-gov ARNs in API calls and adds documentation for snapshot APIs.

## __AWS WAFV2__
  - ### Features
    - You can now detect and block fraudulent account creation attempts with the new AWS WAF Fraud Control account creation fraud prevention (ACFP) managed rule group AWSManagedRulesACFPRuleSet.

## __AWS Well-Architected Tool__
  - ### Features
    - AWS Well-Architected now supports Profiles that help customers prioritize which questions to focus on first by providing a list of prioritized questions that are better aligned with their business goals and outcomes.

## __Amazon CodeGuru Security__
  - ### Features
    - Initial release of Amazon CodeGuru Security APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces a new feature, EC2 Instance Connect Endpoint, that enables you to connect to a resource over TCP, without requiring the resource to have a public IPv4 address.

## __Amazon Lightsail__
  - ### Features
    - This release adds pagination for the Get Certificates API operation.

## __Amazon Simple Storage Service__
  - ### Features
    - Integrate double encryption feature to SDKs.

## __Amazon Verified Permissions__
  - ### Features
    - GA release of Amazon Verified Permissions.

## __EC2 Image Builder__
  - ### Features
    - Change the Image Builder ImagePipeline dateNextRun field to more accurately describe the data.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Added APIs to support network replication and recovery using AWS Elastic Disaster Recovery.

# __1.12.487__ __2023-06-12__
## __AWS Amplify UI Builder__
  - ### Features
    - AWS Amplify UIBuilder is launching Codegen UI, a new feature that enables you to generate your amplify uibuilder components and forms.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for DynamoDB

## __Amazon DynamoDB Streams__
  - ### Features
    - Documentation updates for DynamoDB Streams

## __Amazon FSx__
  - ### Features
    - Amazon FSx for NetApp ONTAP now supports joining a storage virtual machine (SVM) to Active Directory after the SVM has been created.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for SkipUnavailable connection property for cross cluster search

## __Amazon Rekognition__
  - ### Features
    - This release adds support for improved accuracy with user vector in Amazon Rekognition Face Search. Adds new APIs: AssociateFaces, CreateUser, DeleteUser, DisassociateFaces, ListUsers, SearchUsers, SearchUsersByImage. Also adds new face metadata that can be stored: user vector.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Neo now supports compilation for inferentia2 (ML_INF2) and Trainium1 (ML_TRN1) as available targets. With these devices, you can run your workloads at highest performance with lowest cost. inferentia2 (ML_INF2) is available in CMH and Trainium1 (ML_TRN1) is available in IAD currently

# __1.12.486__ __2023-06-09__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Document-only update to refresh CLI  documentation for AWS Private CA. No change to the service.

## __Amazon Connect Service__
  - ### Features
    - This release adds search APIs for Prompts, Quick Connects and Hours of Operations, which can be used to search for those resources within a Connect Instance.

# __1.12.485__ __2023-06-08__
## __AWS Comprehend Medical__
  - ### Features
    - This release supports a new set of entities and traits.

## __AWS Service Catalog__
  - ### Features
    - New parameter added in ServiceCatalog DescribeProvisioningArtifact api - IncludeProvisioningArtifactParameters. This parameter can be used to return information about the parameters used to provision the product

## __Amazon Athena__
  - ### Features
    - You can now define custom spark properties at start of the session for use cases like cluster encryption, table formats, and general Spark tuning.

## __Amazon Timestream Write__
  - ### Features
    - This release adds the capability for customers to define how their data should be partitioned, optimizing for certain access patterns. This definition will take place as a part of the table creation.

## __Payment Cryptography Control Plane__
  - ### Features
    - Initial release of AWS Payment Cryptography Control Plane service for creating and managing cryptographic keys used during card payment processing.

## __Payment Cryptography Data Plane__
  - ### Features
    - Initial release of AWS Payment Cryptography DataPlane Plane service for performing cryptographic operations typically used during card payment processing.

# __1.12.484__ __2023-06-07__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation StackSets is updating the deployment experience for all stackset operations to skip suspended AWS accounts during deployments. StackSets will skip target AWS accounts that are suspended and set the Detailed Status of the corresponding stack instances as SKIPPED_SUSPENDED_ACCOUNT

## __AWS Direct Connect__
  - ### Features
    - This update corrects the jumbo frames mtu values from 9100 to 8500 for transit virtual interfaces.

## __AWS IoT Core Device Advisor__
  - ### Features
    - AWS IoT Core Device Advisor now supports new Qualification Suite test case list. With this update, customers can more easily create new qualification test suite with an empty rootGroup input.

## __Amazon CloudWatch Logs__
  - ### Features
    - This change adds support for account level data protection policies using 3 new APIs, PutAccountPolicy, DeleteAccountPolicy and DescribeAccountPolicy. DescribeLogGroup API has been modified to indicate if account level policy is applied to the LogGroup via "inheritedProperties" list in the response.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces event stream related APIs.

## __Amazon EMR Containers__
  - ### Features
    - EMR on EKS adds support for log rotation of Spark container logs with EMR-6.11.0 onwards, to the StartJobRun API.

# __1.12.483__ __2023-06-06__
## __AWS Identity and Access Management__
  - ### Features
    - This release updates the AccountAlias regex pattern with the same length restrictions enforced by the length constraint.

## __AWS IoT__
  - ### Features
    - Adding IoT Device Management Software Package Catalog APIs to register, store, and report system software packages, along with their versions and metadata in a centralized location.

## __AWS IoT Data Plane__
  - ### Features
    - Update thing shadow name regex to allow '$' character

## __AWS Signer__
  - ### Features
    - AWS Signer is launching Container Image Signing, a new feature that enables you to sign and verify container images. This feature enables you to validate that only container images you approve are used in your enterprise.

## __Amazon Connect Service__
  - ### Features
    - GetMetricDataV2 API is now available in AWS GovCloud(US) region.

## __Amazon EMR__
  - ### Features
    - This release provides customers the ability to specify an allocation strategies amongst PRICE_CAPACITY_OPTIMIZED, CAPACITY_OPTIMIZED, LOWEST_PRICE, DIVERSIFIED for Spot instances in Instance Feet cluster. This enables customers to choose an allocation strategy best suited for their workload.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Lex Developers to create test sets and to execute those test-sets against their bots.

## __Amazon QuickSight__
  - ### Features
    - QuickSight support for pivot table field collapse state, radar chart range scale and multiple scope options in conditional formatting.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds three new APIs - StartMessageMoveTask, CancelMessageMoveTask, and ListMessageMoveTasks to automate redriving messages from dead-letter queues to source queues or a custom destination.

## __Inspector2__
  - ### Features
    - Adds new response properties and request parameters for 'last scanned at' on the ListCoverage operation. This feature allows you to search and view the date of which your resources were last scanned by Inspector.

# __1.12.482__ __2023-06-05__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation StackSets provides customers with three new APIs to activate, deactivate, and describe AWS Organizations trusted access which is needed to get started with service-managed StackSets.

## __AWS Key Management Service__
  - ### Features
    - This release includes feature to import customer's asymmetric (RSA and ECC) and HMAC keys into KMS.  It also includes feature to allow customers to specify number of days to schedule a KMS key deletion as a policy condition key.

## __AWS Lambda__
  - ### Features
    - Add Ruby 3.2 (ruby3.2) Runtime support to AWS Lambda.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Making InstanceTagAttribute as the required parameter for the DeregisterInstanceEventNotificationAttributes and RegisterInstanceEventNotificationAttributes APIs.

## __Amazon Fraud Detector__
  - ### Features
    - Added new variable types, new DateTime data type, and new rules engine functions for interacting and working with DateTime data types.

## __Amazon Keyspaces__
  - ### Features
    - This release adds support for MRR GA launch, and includes multiregion support in create-keyspace, get-keyspace, and list-keyspace.

## __AmazonMWAA__
  - ### Features
    - This release adds ROLLING_BACK and CREATING_SNAPSHOT environment statuses for Amazon MWAA environments.

## __FinSpace User Environment Management service__
  - ### Features
    - Releasing new Managed kdb Insights APIs

# __1.12.481__ __2023-06-02__
## __AWS CloudTrail__
  - ### Features
    - This feature allows users to start and stop event ingestion on a CloudTrail Lake event data store.

## __AWS WAFV2__
  - ### Features
    - Added APIs to describe managed products. The APIs retrieve information about rule groups that are managed by AWS and by AWS Marketplace sellers.

## __Amazon Athena__
  - ### Features
    - This release introduces the DeleteCapacityReservation API and the ability to manage capacity reservations using CloudFormation

## __Amazon SageMaker Service__
  - ### Features
    - This release adds Selective Execution feature that allows SageMaker Pipelines users to run selected steps in a pipeline.

# __1.12.480__ __2023-06-01__
## __AWS WAFV2__
  - ### Features
    - Corrected the information for the header order FieldToMatch setting

## __Alexa For Business__
  - ### Features
    - Alexa for Business has been deprecated and is no longer supported.

## __Amazon Appflow__
  - ### Features
    - Added ability to select DataTransferApiType for DescribeConnector and CreateFlow requests when using Async supported connectors. Added supportedDataTransferType to DescribeConnector/DescribeConnectors/ListConnector response.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces calculated attribute related APIs.

## __Amazon Interactive Video Service__
  - ### Features
    - API Update for IVS Advanced Channel type

## __Amazon SageMaker Service__
  - ### Features
    - Amazon Sagemaker Autopilot adds support for Parquet file input to NLP text classification jobs.

# __1.12.479__ __2023-05-31__
## __AWS Config__
  - ### Features
    - Resource Types Exclusion feature launch by AWS Config

## __AWS Service Catalog__
  - ### Features
    - Documentation updates for ServiceCatalog.

## __AWSMainframeModernization__
  - ### Features
    - Adds an optional create-only 'roleArn' property to Application resources.  Enables PS and PO data set org types.

## __Amazon Fraud Detector__
  - ### Features
    - This release enables publishing event predictions from Amazon Fraud Detector (AFD) to Amazon EventBridge. For example, after getting predictions from AFD, Amazon EventBridge rules can be configured to trigger notification through an SNS topic, send a message with SES, or trigger Lambda workflows.

## __Amazon HealthLake__
  - ### Features
    - This release adds a new request parameter to the CreateFHIRDatastore API operation. IdentityProviderConfiguration specifies how you want to authenticate incoming requests to your Healthlake Data Store.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for changing the engine for Oracle using the ModifyDbInstance API

## __Amazon WorkSpaces Web__
  - ### Features
    - WorkSpaces Web now allows you to control which IP addresses your WorkSpaces Web portal may be accessed from.

# __1.12.478__ __2023-05-30__
## __AWS Glue__
  - ### Features
    - Added Runtime parameter to allow selection of Ray Runtime

## __AWS Ground Station__
  - ### Features
    - Updating description of GetMinuteUsage to be clearer.

## __AWS IoT FleetWise__
  - ### Features
    - Campaigns now support selecting Timestream or S3 as the data destination, Signal catalogs now support "Deprecation" keyword released in VSS v2.1 and "Comment" keyword released in VSS v3.0

## __AWS SecurityHub__
  - ### Features
    - Added new resource detail objects to ASFF, including resources for AwsGuardDutyDetector, AwsAmazonMqBroker, AwsEventSchemasRegistry, AwsAppSyncGraphQlApi and AwsStepFunctionStateMachine.

## __AWS WAFV2__
  - ### Features
    - This SDK release provides customers the ability to use Header Order as a field to match.

## __Amazon Chime SDK Voice__
  - ### Features
    - Added optional CallLeg field to StartSpeakerSearchTask API request

## __Amazon Location Service__
  - ### Features
    - This release adds API support for political views for the maps service APIs: CreateMap, UpdateMap, DescribeMap.

## __Amazon MemoryDB__
  - ### Features
    - Amazon MemoryDB for Redis now supports AWS Identity and Access Management authentication access to Redis clusters starting with redis-engine version 7.0

## __Amazon Personalize__
  - ### Features
    - This release provides support for the exclusion of certain columns for training when creating a solution and creating or updating a recommender with Amazon Personalize.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds 2 new voices - Sofie (da-DK) and Niamh (en-IE)

## __Amazon Security Lake__
  - ### Features
    - Log sources are now versioned. AWS log sources and custom sources will now come with a version identifier that enables producers to vend multiple schema versions to subscribers. Security Lake API have been refactored to more closely align with AWS API conventions.

# __1.12.477__ __2023-05-26__
## __AWS IoT Wireless__
  - ### Features
    - Add Multicast Group support in Network Analyzer Configuration.

## __Amazon Connect Service__
  - ### Features
    - Documentation update for a new Initiation Method value in DescribeContact API

## __Amazon SageMaker Service__
  - ### Features
    - Added ml.p4d and ml.inf1 as supported instance type families for SageMaker Notebook Instances.

# __1.12.476__ __2023-05-25__
## __AWS CodePipeline__
  - ### Features
    - Add PollingDisabledAt time information in PipelineMetadata object of GetPipeline API.

## __AWS Glue__
  - ### Features
    - Added ability to create data quality rulesets for shared, cross-account Glue Data Catalog tables. Added support for dataset comparison rules through a new parameter called AdditionalDataSources. Enhanced the data quality results with a map containing profiled metric values.

## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This SDK update allows for path parameter syntax to be passed to the CreateRoute API. Path parameter syntax require parameters to be enclosed in {} characters. This update also includes a new AppendSourcePath field which lets users forward the source path to the Service URL endpoint.

## __Amazon GameLift__
  - ### Features
    - GameLift FleetIQ users can now filter game server claim requests to exclude servers on instances that are draining.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports enabling Autotune for tuning jobs which can choose tuning job configurations.

## __Application Auto Scaling__
  - ### Features
    - With this release, ElastiCache customers will be able to use predefined metricType "ElastiCacheDatabaseCapacityUsageCountedForEvictPercentage" for their ElastiCache instances.

# __1.12.475__ __2023-05-24__
## __AWS AppSync__
  - ### Features
    - This release introduces AppSync Merged APIs, which provide the ability to compose multiple source APIs into a single federated/merged API.

## __AWS Cost and Usage Report Service__
  - ### Features
    - Add support for split cost allocation data on a report.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Evaluation Capabilities: validation improvements

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker now provides an instantaneous deployment recommendation through the DescribeModel API

# __1.12.474__ __2023-05-23__
## __Amazon SageMaker Service__
  - ### Features
    - Added ModelNameEquals, ModelPackageVersionArnEquals in request and ModelName, SamplePayloadUrl, ModelPackageVersionArn in response of ListInferenceRecommendationsJobs API. Added Invocation timestamps in response of DescribeInferenceRecommendationsJob API & ListInferenceRecommendationsJobSteps API.

## __Amazon Translate__
  - ### Features
    - Added support for calling TranslateDocument API.

## __Firewall Management Service__
  - ### Features
    - Fixes issue that could cause calls to GetAdminScope and ListAdminAccountsForOrganization to return a 500 Internal Server error.

# __1.12.473__ __2023-05-22__
## __AWS Backup__
  - ### Features
    - Added support for tags on restore.

## __Amazon Pinpoint__
  - ### Features
    - Amazon Pinpoint is deprecating the tags parameter in the UpdateSegment, UpdateCampaign, UpdateEmailTemplate, UpdateSmsTemplate, UpdatePushTemplate, UpdateInAppTemplate and UpdateVoiceTemplate. Amazon Pinpoint will end support tags parameter by May 22, 2023.

## __Amazon QuickSight__
  - ### Features
    - Add support for Asset Bundle, Geospatial Heatmaps.

# __1.12.472__ __2023-05-19__
## __AWS Backup__
  - ### Features
    - Add  ResourceArn, ResourceType, and BackupVaultName to ListRecoveryPointsByLegalHold API response.

## __AWS Elemental MediaPackage v2__
  - ### Features
    - Adds support for the MediaPackage Live v2 API

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to create fields with type Url through the CreateField API. For more information see https://docs.aws.amazon.com/cases/latest/APIReference/Welcome.html

## __Amazon Simple Email Service__
  - ### Features
    - This release allows customers to update scaling mode property of dedicated IP pools with PutDedicatedIpPoolScalingAttributes call.

# __1.12.471__ __2023-05-18__
## __AWS CloudTrail__
  - ### Features
    - Add ConflictException to PutEventSelectors, add (Channel/EDS)ARNInvalidException to Tag APIs. These exceptions provide customers with more specific error messages instead of internal errors.

## __AWS Compute Optimizer__
  - ### Features
    - In this launch, we add support for showing integration status with external metric providers such as Instana, Datadog ...etc in GetEC2InstanceRecommendations and ExportEC2InstanceRecommendations apis

## __AWS Elemental MediaConvert__
  - ### Features
    - This release introduces a new MXF Profile for XDCAM which is strictly compliant with the SMPTE RDD 9 standard and improved handling of output name modifiers.

## __AWS Security Token Service__
  - ### Features
    - API updates for the AWS Security Token Service

## __Amazon Athena__
  - ### Features
    - Removing SparkProperties from EngineConfiguration object for StartSession API call

## __Amazon Connect Service__
  - ### Features
    - You can programmatically create and manage prompts using APIs, for example, to extract prompts stored within Amazon Connect and add them to your Amazon S3 bucket. AWS CloudTrail, AWS CloudFormation and tagging are supported.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only release to address various tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add support for i4g.large, i4g.xlarge, i4g.2xlarge, i4g.4xlarge, i4g.8xlarge and i4g.16xlarge instances powered by AWS Graviton2 processors that deliver up to 15% better compute performance than our other storage-optimized instances.

## __Amazon Relational Database Service__
  - ### Features
    - RDS documentation update for the EngineVersion parameter of ModifyDBSnapshot

## __Amazon SageMaker geospatial capabilities__
  - ### Features
    - This release makes ExecutionRoleArn a required field in the StartEarthObservationJob API.

# __1.12.470__ __2023-05-16__
## __AWS Direct Connect__
  - ### Features
    - This release includes an update to the mtu value for CreateTransitVirtualInterface from 9001 mtu to 8500 mtu.

## __AWS Glue__
  - ### Features
    - Add Support for Tags for Custom Entity Types

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS WAFV2__
  - ### Features
    - My AWS Service (placeholder) - You can now rate limit web requests based on aggregation keys other than IP addresses, and you can aggregate using combinations of keys. You can also rate limit all requests that match a scope-down statement, without further aggregation.

## __Amazon Detective__
  - ### Features
    - Added and updated API operations in Detective to support the integration of ASFF Security Hub findings.

# __1.12.469__ __2023-05-15__
## __AWS Transfer Family__
  - ### Features
    - This release introduces the ability to require both password and SSH key when users authenticate to your Transfer Family servers that use the SFTP protocol.

## __Amazon Athena__
  - ### Features
    - You can now define custom spark properties at start of the session for use cases like cluster encryption, table formats, and general Spark tuning.

## __Amazon CodeCatalyst__
  - ### Features
    - With this release, the users can list the active sessions connected to their Dev Environment on AWS CodeCatalyst

## __Amazon Rekognition__
  - ### Features
    - This release adds a new EyeDirection attribute in Amazon Rekognition DetectFaces and IndexFaces APIs which predicts the yaw and pitch angles of a person's eye gaze direction for each face detected in the image.

## __IAM Roles Anywhere__
  - ### Features
    - Adds support for custom notification settings in a trust anchor. Introduces PutNotificationSettings and ResetNotificationSettings API's. Updates DurationSeconds max value to 3600.

## __Managed Streaming for Kafka__
  - ### Features
    - Added a fix to make clusterarn a required field in ListClientVpcConnections and RejectClientVpcConnection APIs

# __1.12.468__ __2023-05-11__
## __AWS Health APIs and Notifications__
  - ### Features
    - Add support for regional endpoints

## __AWS Support__
  - ### Features
    - This release adds 2 new Support APIs, DescribeCreateCaseOptions and DescribeSupportedLanguages. You can use these new APIs to get available support languages.

## __Amazon Connect Service__
  - ### Features
    - This release updates GetMetricDataV2 API, to support metric data up-to last 35 days

## __Amazon ElastiCache__
  - ### Features
    - Added support to modify the cluster mode configuration for the existing ElastiCache ReplicationGroups. Customers can now modify the configuration from cluster mode disabled to cluster mode enabled.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release fixes DescribePackages API error with null filter value parameter.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Add methods for inspecting and debugging stages: ListStageSessions, GetStageSession, ListParticipants, GetParticipant, and ListParticipantEvents.

## __Amazon Omics__
  - ### Features
    - This release provides support for Ready2Run and GPU workflows, an improved read set filter, the direct upload of read sets into Omics Storage, and annotation parsing for analytics stores.

## __Amazon OpenSearch Service__
  - ### Features
    - This release fixes DescribePackages API error with null filter value parameter.

## __Amazon Route 53 Resolver__
  - ### Features
    - Update FIPS endpoints for GovCloud (US) regions in SDK.

# __1.12.467__ __2023-05-10__
## __Amazon EMR__
  - ### Features
    - EMR Studio now supports programmatically executing a Notebooks on an EMR on EKS cluster.  In addition, notebooks can now be executed by specifying its location in S3.

## __Amazon Relational Database Service__
  - ### Features
    - Amazon Relational Database Service (RDS) updates for the new Aurora I/O-Optimized storage type for Amazon Aurora DB clusters

## __Amazon Simple Workflow Service__
  - ### Features
    - This release adds a new API parameter to exclude old history events from decision tasks.

# __1.12.466__ __2023-05-09__
## __AWS Glue__
  - ### Features
    - This release adds AmazonRedshift Source and Target nodes in addition to DynamicTransform OutputSchemas

## __Amazon SageMaker Service__
  - ### Features
    - This release includes support for (1) Provisioned Concurrency for Amazon SageMaker Serverless Inference and (2) UpdateEndpointWeightsAndCapacities API for Serverless endpoints.

## __Application Auto Scaling__
  - ### Features
    - With this release, Amazon SageMaker Serverless Inference customers can use Application Auto Scaling to auto scale the provisioned concurrency of their serverless endpoints.

# __1.12.465__ __2023-05-08__
## __AWS Glue__
  - ### Features
    - Support large worker types G.4x and G.8x for Glue Spark.

## __AWS IoT SiteWise__
  - ### Features
    - Provide support for 20,000 max results for GetAssetPropertyValueHistory/BatchGetAssetPropertyValueHistory and 15 minute aggregate resolution for GetAssetPropertyAggregates/BatchGetAssetPropertyAggregates

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __Amazon GuardDuty__
  - ### Features
    - Add AccessDeniedException 403 Error message code to support 3 Tagging related APIs

# __1.12.464__ __2023-05-05__
## __AWS MediaTailor__
  - ### Features
    - This release adds support for AFTER_LIVE_EDGE mode configuration for avail suppression, and adding a fill-policy setting that sets the avail suppression to PARTIAL_AVAIL or FULL_AVAIL_ONLY when AFTER_LIVE_EDGE is enabled.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support the inf2 and trn1n instances. inf2 instances are purpose built for deep learning inference while trn1n instances are powered by AWS Trainium accelerators and they build on the capabilities of Trainium-powered trn1 instances.

## __Amazon Simple Queue Service__
  - ### Features
    - Revert previous SQS protocol change.

## __Inspector2__
  - ### Features
    - Amazon Inspector now allows customers to search its vulnerability intelligence database if any of the Inspector scanning types are activated.

# __1.12.463__ __2023-05-04__
## __AWS Config__
  - ### Features
    - Updated ResourceType enum with new resource types onboarded by AWS Config in April 2023.

## __AWS Network Firewall__
  - ### Features
    - This release adds support for the Suricata REJECT option in midstream exception configurations.

## __AWS SecurityHub__
  - ### Features
    - Add support for Finding History.

## __Amazon CloudWatch__
  - ### Features
    - Adds support for filtering by metric names in CloudWatch Metric Streams.

## __Amazon Connect Service__
  - ### Features
    - Remove unused InvalidParameterException from CreateParticipant API

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for new error type NamespaceNotFoundException for CreateCluster and UpdateCluster

## __Amazon OpenSearch Service__
  - ### Features
    - DescribeDomainNodes: A new API that provides configuration information for nodes part of the domain

## __Amazon QuickSight__
  - ### Features
    - Add support for Topic, Dataset parameters and VPC

## __Amazon Rekognition__
  - ### Features
    - This release adds a new attribute FaceOccluded. Additionally, you can now select attributes individually (e.g. ["DEFAULT", "FACE_OCCLUDED", "AGE_RANGE"] instead of ["ALL"]), which can reduce response time.

## __Amazon S3__
  - ### Bugfixes
    - Fixed a bug where operations against DNS-incompatible buckets, keys with a prefix / and path-style access disabled would result in an extra '/' being appended to the key.

## __Amazon SageMaker Service__
  - ### Features
    - We added support for ml.inf2 and ml.trn1 family of instances on Amazon SageMaker for deploying machine learning (ML) models for Real-time and Asynchronous inference. You can use these instances to achieve high performance at a low cost for generative artificial intelligence (AI) models.

## __Amazon Simple Queue Service__
  - ### Features
    - This release enables customers to call SQS using AWS JSON-1.0 protocol.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __1.12.462__ __2023-05-03__
## __AWS AppSync__
  - ### Features
    - Private API support for AWS AppSync. With Private APIs, you can now create GraphQL APIs that can only be accessed from your Amazon Virtual Private Cloud ("VPC").

## __AWS IoT TwinMaker__
  - ### Features
    - This release adds a field for GetScene API to return error code and message from dependency services.

## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall now supports policy level HOME_NET variable overrides.

## __AWS Well-Architected Tool__
  - ### Features
    - This release deepens integration with AWS Service Catalog AppRegistry to improve workload resource discovery.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds an SDK paginator for GetNetworkInsightsAccessScopeAnalysisFindings

## __Amazon OpenSearch Service__
  - ### Features
    - Amazon OpenSearch Service adds the option to deploy a domain across multiple Availability Zones, with each AZ containing a complete copy of data and with nodes in one AZ acting as a standby. This option provides 99.99% availability and consistent performance in the event of infrastructure failure.

## __Inspector2__
  - ### Features
    - This feature provides deep inspection for linux based instance

# __1.12.461__ __2023-05-02__
## __AWS Resilience Hub__
  - ### Features
    - This release will improve resource level transparency in applications by discovering previously hidden resources.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports configuring document fields/attributes via the GetQuerySuggestions API. You can now base query suggestions on the contents of document fields.

## __Amazon Appflow__
  - ### Features
    - This release adds new API to cancel flow executions.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Service Rules API update: Added OnContactEvaluationSubmit event source to support user configuring evaluation form rules.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address Amazon ECS tickets.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon Sagemaker Autopilot supports training models with sample weights and additional objective metrics.

# __1.12.460__ __2023-05-01__
## __AWS Compute Optimizer__
  - ### Features
    - support for tag filtering within compute optimizer. ability to filter recommendation results by tag and tag key value pairs. ability to filter by inferred workload type added.

## __AWS Key Management Service__
  - ### Features
    - This release makes the NitroEnclave request parameter Recipient and the response field for CiphertextForRecipient available in AWS SDKs. It also adds the regex pattern for CloudHsmClusterId validation.

## __Amazon S3__
  - ### Bugfixes
    - URL encode bucket name for path style requests. Avoid using slash '/' in the bucket name as this may cause signature mismatch errors. See [#2976](https://github.com/aws/aws-sdk-java/discussions/2976).

# __1.12.459__ __2023-04-28__
## __AWS Direct Connect__
  - ### Features
    - This release corrects the jumbo frames MTU from 9100 to 8500.

## __AWS IoT__
  - ### Features
    - This release allows AWS IoT Core users to specify a TLS security policy when creating and updating AWS IoT Domain Configurations.

## __AWS SimSpace Weaver__
  - ### Features
    - Added a new CreateSnapshot API. For the StartSimulation API, SchemaS3Location is now optional, added a new SnapshotS3Location parameter. For the DescribeSimulation API, added SNAPSHOT_IN_PROGRESS simulation state, deprecated SchemaError, added new fields: StartError and SnapshotS3Location.

## __AWS WAFV2__
  - ### Features
    - You can now associate a web ACL with a Verified Access instance.

## __Amazon Appflow__
  - ### Features
    - Adds Jwt Support for Salesforce Credentials.

## __Amazon Athena__
  - ### Features
    - You can now use capacity reservations on Amazon Athena to run SQL queries on fully-managed compute capacity.

## __Amazon Elastic File System__
  - ### Features
    - This release adds PAUSED and PAUSING state as a returned value for DescribeReplicationConfigurations response.

## __Amazon Managed Grafana__
  - ### Features
    - This release adds support for the grafanaVersion parameter in CreateWorkspace.

## __Amazon Rekognition__
  - ### Features
    - Added support for aggregating moderation labels by video segment timestamps for Stored Video Content Moderation APIs and added additional information about the job to all Stored Video Get API responses.

## __Amazon WorkSpaces__
  - ### Features
    - Added Windows 11 to support Microsoft_Office_2019

# __1.12.458__ __2023-04-27__
## __AWS IoT Core Device Advisor__
  - ### Features
    - AWS IoT Core Device Advisor now supports MQTT over WebSocket. With this update, customers can run all three test suites of AWS IoT Core Device Advisor - qualification, custom, and long duration tests - using Signature Version 4 for MQTT over WebSocket.

## __AWS Lambda__
  - ### Features
    - Add Java 17 (java17) support to AWS Lambda

## __AWS Marketplace Catalog Service__
  - ### Features
    - Enabled Pagination for List Entities and List Change Sets operations

## __AWS X-Ray__
  - ### Features
    - Updated X-Ray documentation with Resource Policy API descriptions.

## __Amazon EMR Containers__
  - ### Features
    - This release adds GetManagedEndpointSessionCredentials, a new API that allows customers to generate an auth token to connect to a managed endpoint, enabling features such as self-hosted Jupyter notebooks for EMR on EKS.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for AMD SEV-SNP on EC2 instances.

## __Amazon GuardDuty__
  - ### Features
    - Added API support to initiate on-demand malware scan on specific resources.

## __Amazon OpenSearch Ingestion__
  - ### Features
    - Documentation updates for OpenSearch Ingestion

## __Amazon QLDB__
  - ### Features
    - Documentation updates for Amazon QLDB

## __Amazon SageMaker Service__
  - ### Features
    - Added ml.p4d.24xlarge and ml.p4de.24xlarge as supported instances for SageMaker Studio

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added new APIs that allows multi-VPC private connectivity and cluster policy support for Amazon MSK clusters that simplify connectivity and access between your Apache Kafka clients hosted in different VPCs and AWS accounts and your Amazon MSK clusters.

# __1.12.457__ __2023-04-26__
## __Amazon OpenSearch Ingestion__
  - ### Features
    - Initial release for OpenSearch Ingestion

# __1.12.456__ __2023-04-25__
## __AWS DataSync__
  - ### Features
    - This release adds 13 new APIs to support AWS DataSync Discovery GA.

## __AWS Directory Service__
  - ### Features
    - New field added in AWS Managed Microsoft AD DescribeSettings response and regex pattern update for UpdateSettings value.  Added length validation to RemoteDomainName.

## __Amazon Chime SDK Messaging__
  - ### Features
    - Remove non actionable field from UpdateChannelReadMarker and DeleteChannelRequest.  Add precise exceptions to DeleteChannel and DeleteStreamingConfigurations error cases.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect, Contact Lens Evaluation API release including ability to manage forms and to submit contact evaluations.

## __Amazon Pinpoint__
  - ### Features
    - Adds support for journey runs and querying journey execution metrics based on journey runs. Adds execution metrics to campaign activities. Updates docs for Advanced Quiet Time.

# __1.12.455__ __2023-04-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - This release introduces a noise reduction pre-filter, linear interpolation deinterlace mode, video pass-through, updated default job settings, and expanded LC-AAC Stereo audio bitrate ranges.

## __Amazon Appflow__
  - ### Features
    - Increased the max length for RefreshToken and AuthCode from 2048 to 4096.

## __Amazon CodeCatalyst__
  - ### Features
    - Documentation updates for Amazon CodeCatalyst.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - API changes to AWS Verified Access related to identity providers' information.

## __Amazon Rekognition__
  - ### Features
    - Added new status result to Liveness session status.

# __1.12.454__ __2023-04-21__
## __Amazon Connect Service__
  - ### Features
    - This release adds a new API CreateParticipant. For Amazon Connect Chat, you can use this new API to customize chat flow experiences.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update to address various Amazon ECS tickets.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager adds support for multiple administrators. You can now delegate more than one administrator per organization.

# __1.12.453__ __2023-04-20__
## __AWS IoT__
  - ### Features
    - Support additional OTA states in GetOTAUpdate API

## __AWS WAFV2__
  - ### Features
    - You can now create encrypted API keys to use in a client application integration of the JavaScript CAPTCHA API . You can also retrieve a list of your API keys and the JavaScript application integration URL.

## __Amazon Chime__
  - ### Features
    - Adds support for Hindi and Thai languages and additional Amazon Transcribe parameters to the StartMeetingTranscription API.

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - This release adds support for specifying the recording file format in an S3 recording sink configuration.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for Hindi and Thai languages and additional Amazon Transcribe parameters to the StartMeetingTranscription API.

## __Amazon GameLift__
  - ### Features
    - Amazon GameLift supports creating Builds for Windows 2016 operating system.

## __Amazon GuardDuty__
  - ### Features
    - This release adds support for the new Lambda Protection feature.

## __Amazon Import/Export Snowball__
  - ### Features
    - Adds support for Amazon S3 compatible storage. AWS Snow Family customers can now use Amazon S3 compatible storage on Snowball Edge devices. Also adds support for V3_5S. This is a refreshed AWS Snowball Edge Storage Optimized device type with 210TB SSD (customer usable).

## __Amazon S3__
  - ### Bugfixes
    - Fixed bug where GetObject requests for the object key / via an access point would return the results of the ListObjects operation.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Canvas adds ModelRegisterSettings support for CanvasAppSettings.

# __1.12.452__ __2023-04-19__
## __AWS Resource Access Manager__
  - ### Features
    - This release adds support for customer managed permissions. Customer managed permissions enable customers to author and manage tailored permissions for resources shared using RAM.

## __AWS S3 Control__
  - ### Features
    - Provides support for overriding endpoint when region is "snow". This will enable bucket APIs for Amazon S3 Compatible storage on Snow Family devices.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Update that adds SDK code examples for Security Hub

## __Amazon Comprehend__
  - ### Features
    - This release supports native document models for custom classification, in addition to plain-text models. You train native document models using documents (PDF, Word, images) in their native format.

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports the Account Setting "TagResourceAuthorization" that allows for enhanced Tagging security controls.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for the ImageId parameter of CreateCustomDBEngineVersion to RDS Custom for Oracle

## __Amazon Simple Storage Service__
  - ### Features
    - Provides support for "Snow" Storage class.

# __1.12.451__ __2023-04-17__
## __AWS IoT Wireless__
  - ### Features
    - Supports the new feature of LoRaWAN roaming, allows to configure MaxEirp for LoRaWAN gateway, and allows to configure PingSlotPeriod for LoRaWAN multicast group

## __AWS Lambda__
  - ### Features
    - Add Python 3.10 (python3.10) support to AWS Lambda

## __Amazon Appflow__
  - ### Features
    - This release adds a Client Token parameter to the following AppFlow APIs: Create/Update Connector Profile, Create/Update Flow, Start Flow, Register Connector, Update Connector Registration. The Client Token parameter allows idempotent operations for these APIs.

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release includes a new configurable value, TrafficPercentageToMonitor, which allows users to adjust the amount of traffic monitored by percentage

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for DynamoDB API

## __EMR Serverless__
  - ### Features
    - The GetJobRun API has been updated to include the job's billed resource utilization. This utilization shows the aggregate vCPU, memory and storage that AWS has billed for the job run. The billed resources include a 1-minute minimum usage for workers, plus additional storage over 20 GB per worker.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Changed existing APIs and added new APIs to support using an account-level launch configuration template with AWS Elastic Disaster Recovery.

# __1.12.450__ __2023-04-14__
## __AWS Lambda__
  - ### Features
    - This release adds SnapStart related exceptions to InvokeWithResponseStream API. IAM access related documentation is also added for this API.

## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - Doc only update for Refactor Spaces environments without network bridge feature.

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports  ephemeral storage for AWS Fargate Windows containers.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support of modifying the engine mode of database clusters.

# __1.12.449__ __2023-04-13__
## __AWS MediaConnect__
  - ### Features
    - Gateway is a new feature of AWS Elemental MediaConnect. Gateway allows the deployment of on-premises resources for the purpose of transporting live video to and from the AWS Cloud.

## __Amazon Chime SDK Voice__
  - ### Features
    - This release adds tagging support for Voice Connectors and SIP Media Applications

# __1.12.448__ __2023-04-12__
## __AWS Ground Station__
  - ### Features
    - AWS Ground Station Wideband DigIF GA Release

## __Amazon Managed Blockchain__
  - ### Features
    - Removal of the Ropsten network. The Ethereum foundation ceased support of Ropsten on December 31st, 2022..

# __1.12.447__ __2023-04-11__
## __AWS IoT__
  - ### Features
    - Re-release to remove unexpected API changes
    - This release allows AWS IoT Core users to specify a TLS security policy when creating and updating AWS IoT Domain Configurations.

## __AWS IoT Data Plane__
  - ### Features
    - This release adds support for MQTT5 user properties when calling the AWS IoT GetRetainedMessage API

## __AWS WAFV2__
  - ### Features
    - For web ACLs that protect CloudFront protections, the default request body inspection size is now 16 KB, and you can use the new association configuration to increase the inspection size further, up to 64 KB. Sizes over 16 KB can incur additional costs.

## __Amazon Elastic Container Registry Public__
  - ### Features
    - This release will allow using registry alias as registryId in BatchDeleteImage request.

## __Amazon EventBridge__
  - ### Features
    - EventBridge PutTarget support for multiple SQL arguments on RedshiftDataParameters

## __EMR Serverless__
  - ### Features
    - This release extends GetJobRun API to return job run timeout (executionTimeoutMinutes) specified during StartJobRun call (or default timeout of 720 minutes if none was specified).

# __1.12.446__ __2023-04-10__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK now supports conversion of 608 paint-on captions to pop-on captions for SCC sources.

## __AWS Marketplace Catalog Service__
  - ### Features
    - Added three new APIs to support resource sharing: GetResourcePolicy, PutResourcePolicy, and DeleteResourcePolicy. Added new OwnershipType field to ListEntities request to let users filter on entities that are shared with them. Increased max page size of ListEntities response from 20 to 50 results.

## __Amazon Connect Service__
  - ### Features
    - This release adds the ability to configure an agent's routing profile to receive contacts from multiple channels at the same time via extending the UpdateRoutingProfileConcurrency, CreateRoutingProfile and DescribeRoutingProfile APIs.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for enabling FIPS compliance on Amazon ECS Fargate tasks

## __Amazon Omics__
  - ### Features
    - Remove unexpected API changes.

## __Amazon Rekognition__
  - ### Features
    - This release adds support for Face Liveness APIs in Amazon Rekognition. Updates UpdateStreamProcessor to return ResourceInUseException Exception. Minor updates to API documentation.

# __1.12.445__ __2023-04-07__
## __AWS Lambda__
  - ### Features
    - This release adds a new Lambda InvokeWithResponseStream API to support streaming Lambda function responses. The release also adds a new InvokeMode parameter to Function Url APIs to control whether the response will be streamed or buffered.

## __AWS Service Catalog__
  - ### Features
    - Updates description for property

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Updated timestamp format for GetLifecyclePolicy API

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - This release adds a new parameter 'DBClusterParameterGroupName' to 'RestoreDBClusterFromSnapshot' API to associate the name of the DB cluster parameter group while performing restore.

## __Amazon FSx__
  - ### Features
    - Amazon FSx for Lustre now supports creating data repository associations on Persistent_1 and Scratch_2 file systems.

## __Amazon QuickSight__
  - ### Features
    - This release has two changes: adding the OR condition to tag-based RLS rules in CreateDataSet and UpdateDataSet; adding RefreshSchedule and Incremental RefreshProperties operations for users to programmatically configure SPICE dataset ingestions.

## __Redshift Data API Service__
  - ### Features
    - Update documentation of API descriptions as needed in support of temporary credentials with IAM identity.

# __1.12.444__ __2023-04-06__
## __AWS CloudFormation__
  - ### Features
    - Including UPDATE_COMPLETE as a failed status for DeleteStack waiter.

## __AWS IoT Greengrass V2__
  - ### Features
    - Add support for SUCCEEDED value in coreDeviceExecutionStatus field. Documentation updates for Greengrass V2.

## __AWS Proton__
  - ### Features
    - This release adds support for the AWS Proton service sync feature. Service sync enables managing an AWS Proton service (creating and updating instances) and all of it's corresponding service instances from a Git repository.

## __Amazon Relational Database Service__
  - ### Features
    - Adds and updates the SDK examples

# __1.12.443__ __2023-04-05__
## __AWS App Runner__
  - ### Features
    - App Runner adds support for seven new vCPU and memory configurations.

## __AWS Config__
  - ### Features
    - This release adds resourceType enums for types released in March 2023.

## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall now supports IPv6-only subnets.

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for Identity Store CLI command reference.

## __AWS Service Catalog__
  - ### Features
    - removed incorrect product type value

## __Amazon EC2 Container Service__
  - ### Features
    - This is a document only updated to add information about Amazon Elastic Inference (EI).

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Fix ParticipantToken ExpirationTime format

## __Amazon VPC Lattice__
  - ### Features
    - This release removes the entities in the API doc model package for auth policies.

# __1.12.442__ __2023-04-04__
## __AWS Amplify UI Builder__
  - ### Features
    - Support StorageField and custom displays for data-bound options in form builder. Support non-string operands for predicates in collections. Support choosing client to get token from.

## __AWS Data Exchange__
  - ### Features
    - This release updates the value of MaxResults.

## __AWS WAFV2__
  - ### Features
    - This release rolls back association config feature for webACLs that protect CloudFront protections.

## __Amazon Elastic  Inference__
  - ### Features
    - Updated public documentation for the Describe and Tagging APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6in, M6in, M6idn, R6in and R6idn bare metal instances are powered by 3rd Generation Intel Xeon Scalable processors and offer up to 200 Gbps of network bandwidth.

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Asynchronous Inference now provides customers a FailureLocation as a response parameter in InvokeEndpointAsync API to capture the model failure responses.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Asynchronous Inference now allows customer's to receive failure model responses in S3 and receive success/failure model responses in SNS notifications.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling

# __1.12.441__ __2023-04-03__
## __AWS Glue__
  - ### Features
    - Add support for database-level federation

## __AWS Lake Formation__
  - ### Features
    - Add support for database-level federation

## __AWS License Manager__
  - ### Features
    - This release adds grant override options to the CreateGrantVersion API. These options can be used to specify grant replacement behavior during grant activation.

## __AWS Service Catalog__
  - ### Features
    - This release introduces Service Catalog support for Terraform open source. It enables 1. The notify* APIs to Service Catalog. These APIs are used by the terraform engine to notify the result of the provisioning engine execution. 2. Adds a new TERRAFORM_OPEN_SOURCE product type in CreateProduct API.

## __AWS WAFV2__
  - ### Features
    - For web ACLs that protect CloudFront protections, the default request body inspection size is now 16 KB, and you can use the new association configuration to increase the inspection size further, up to 64 KB. Sizes over 16 KB can incur additional costs.

## __AmazonMWAA__
  - ### Features
    - This Amazon MWAA release adds the ability to customize the Apache Airflow environment by launching a shell script at startup. This shell script is hosted in your environment's Amazon S3 bucket. Amazon MWAA runs the script before installing requirements and initializing the Apache Airflow process.

# __1.12.440__ __2023-03-31__
## __AWS Resilience Hub__
  - ### Features
    - Adding EKS related documentation for appTemplateBody

## __AWS Server Migration Service__
  - ### Features
    - Deprecating AWS Server Migration Service.

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - This release adds a new feature for Amazon CloudWatch Internet Monitor that enables customers to deliver internet measurements to Amazon S3 buckets as well as CloudWatch Logs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2 On Demand Capacity Reservations

## __Amazon S3__
  - ### Bugfixes
    - Fix a bug that causes the endpoint to not be updated correctly when using Dualstack and Global Bucket Access together.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - In this release, you can now chose between soft delete and hard delete when calling the DeleteRecord API, so you have more flexibility when it comes to managing online store data.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __1.12.439__ __2023-03-30__
## __AWS Batch__
  - ### Features
    - This feature allows Batch on EKS to support configuration of Pod Labels through Metadata for Batch on EKS Jobs.

## __AWS Compute Optimizer__
  - ### Features
    - This release adds support for HDD EBS volume types and io2 Block Express. We are also adding support for 61 new instance types and instances that have non consecutive runtime.

## __AWS Glue__
  - ### Features
    - This release adds support for AWS Glue Data Quality, which helps you evaluate and monitor the quality of your data and includes the API for creating, deleting, or updating data quality rulesets, runs and evaluations.

## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall added TLS inspection configurations to allow TLS traffic inspection.

## __AWS Well-Architected Tool__
  - ### Features
    - AWS Well-Architected SDK now supports getting consolidated report metrics and generating a consolidated report PDF.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports featured results for a query.

## __Amazon Athena__
  - ### Features
    - Make DefaultExecutorDpuSize and CoordinatorDpuSize  fields optional  in StartSession

## __Amazon EMR__
  - ### Features
    - Updated DescribeCluster and ListClusters API responses to include ErrorDetail that specifies error code, programmatically accessible error data,and an error message. ErrorDetail provides the underlying reason for cluster failure and recommends actions to simplify troubleshooting of EMR clusters.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Tunnel Endpoint Lifecycle control, a new feature that provides Site-to-Site VPN customers with better visibility and control of their VPN tunnel maintenance updates.

## __Amazon GuardDuty__
  - ### Features
    - Added EKS Runtime Monitoring feature support to existing detector, finding APIs and introducing new Coverage APIs

## __Amazon Interactive Video Service__
  - ### Features
    - Amazon Interactive Video Service (IVS) now offers customers the ability to configure IVS channels to allow insecure RTMP ingest.

## __Amazon SageMaker geospatial capabilities__
  - ### Features
    - Amazon SageMaker geospatial capabilities now supports server-side encryption with customer managed KMS key and SageMaker notebooks with a SageMaker geospatial image in a Amazon SageMaker Domain with VPC only mode.

## __Amazon VPC Lattice__
  - ### Features
    - General Availability (GA) release of Amazon VPC Lattice

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports Elastic Load Balancing traffic sources with the AttachTrafficSources, DetachTrafficSources, and DescribeTrafficSources APIs. This release also introduces a new activity status, "WaitingForConnectionDraining", for VPC Lattice to the DescribeScalingActivities API.

## __EC2 Image Builder__
  - ### Features
    - Adds support for new image workflow details and image vulnerability detection.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Adding a field to the replication configuration APIs to support the auto replicate new disks feature. We also deprecated RetryDataReplication.

# __1.12.438__ __2023-03-29__
## __Amazon Relational Database Service__
  - ### Features
    - Add support for creating a read replica DB instance from a Multi-AZ DB cluster.

## __OpenSearch Service Serverless__
  - ### Features
    - This release includes two new exception types "ServiceQuotaExceededException" and "OcuLimitExceededException".

# __1.12.437__ __2023-03-28__
## __AWS IoT Data Plane__
  - ### Features
    - Add endpoint ruleset support for cn-north-1.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Increased maximum length of "TriggerDetails.rawData" to 10K characters and "IncidentSummary" to 8K characters.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - This release adds 12 new APIs as part of Oncall Schedule feature release, adds support for a new contact type: ONCALL_SCHEDULE. Check public documentation for AWS ssm-contacts for more information

# __1.12.436__ __2023-03-27__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports ID3 tag insertion for audio only HLS output groups. AWS Elemental Link devices now support tagging.

## __AWS IoT Wireless__
  - ### Features
    - Introducing new APIs that enable Sidewalk devices to communicate with AWS IoT Core through Sidewalk gateways. This will empower AWS customers to connect Sidewalk devices with other AWS IoT Services, creating  possibilities for seamless integration and advanced device management.

## __AWS SecurityHub__
  - ### Features
    - Added new resource detail objects to ASFF, including resources for AwsEksCluster, AWSS3Bucket, AwsEc2RouteTable and AwsEC2Instance.

## __AWS Service Catalog App Registry__
  - ### Features
    - In this release, we started supporting ARN in applicationSpecifier and attributeGroupSpecifier. GetAttributeGroup, ListAttributeGroups and ListAttributeGroupsForApplication APIs will now have CreatedBy field in the response.

## __Amazon Athena__
  - ### Features
    - Enforces a minimal level of encryption for the workgroup for query and calculation results that are written to Amazon S3. When enabled, workgroup users can set encryption only to the minimum level set by the administrator or higher when they submit queries.

## __Amazon Chime SDK Voice__
  - ### Features
    - Documentation updates for Amazon Chime SDK Voice.

## __Amazon Connect Participant Service__
  - ### Features
    - This release provides an update to the SendMessage API to handle interactive message response content-types.

## __Amazon Connect Service__
  - ### Features
    - This release introduces support for RelatedContactId in the StartChatContact API. Interactive message and interactive message response have been added to the list of supported message content types for this API as well.

## __Amazon SageMaker Service__
  - ### Features
    - Fixed some improperly rendered links in SDK documentation.

## __Amazon Voice ID__
  - ### Features
    - Amazon Connect Voice ID now supports multiple fraudster watchlists. Every domain has a default watchlist where all existing fraudsters are placed by default. Custom watchlists may now be created, managed, and evaluated against for known fraudster detection.

# __1.12.435__ __2023-03-24__
## __Amazon CloudWatch__
  - ### Features
    - Doc-only update to correct alarm actions list

## __Amazon Comprehend__
  - ### Features
    - This release adds a new field (FlywheelArn) to the EntitiesDetectionJobProperties object. The FlywheelArn field is returned in the DescribeEntitiesDetectionJob and ListEntitiesDetectionJobs responses when the EntitiesDetection job is started with a FlywheelArn instead of an EntityRecognizerArn .

## __Amazon Relational Database Service__
  - ### Features
    - Added error code CreateCustomDBEngineVersionFault for when the create custom engine version for Custom engines fails.

# __1.12.434__ __2023-03-23__
## __AWS Batch__
  - ### Features
    - This feature allows Batch to support configuration of ephemeral storage size for jobs running on FARGATE

## __AWS Cloud Map__
  - ### Features
    - Reverted the throttling exception RequestLimitExceeded for AWS Cloud Map APIs introduced in SDK version 1.12.424 2023-03-09 to previous exception specified in the ErrorCode.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK now supports passthrough of ID3v2 tags for audio inputs to audio-only HLS outputs.

## __Amazon Chime SDK Identity__
  - ### Features
    - AppInstanceBots can be used to add a bot powered by Amazon Lex to chat channels.  ExpirationSettings provides automatic resource deletion for AppInstanceUsers.

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - This release adds Amazon Chime SDK call analytics. Call analytics include voice analytics, which provides speaker search and voice tone analysis. These capabilities can be used with Amazon Transcribe and Transcribe Call Analytics to generate machine-learning-powered insights from real-time audio.

## __Amazon Chime SDK Messaging__
  - ### Features
    - ExpirationSettings provides automatic resource deletion for Channels.

## __Amazon Chime SDK Voice__
  - ### Features
    - This release adds Amazon Chime SDK call analytics. Call analytics include voice analytics, which provides speaker search and voice tone analysis. These capabilities can be used with Amazon Transcribe and Transcribe Call Analytics to generate machine-learning-powered insights from real-time audio.

## __Amazon GuardDuty__
  - ### Features
    - Adds AutoEnableOrganizationMembers attribute to DescribeOrganizationConfiguration and UpdateOrganizationConfiguration APIs.

## __Amazon Interactive Video Service RealTime__
  - ### Features
    - Initial release of the Amazon Interactive Video Service RealTime API.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds two new APIs - CreateAutoMLJobV2 and DescribeAutoMLJobV2. Amazon SageMaker Notebook Instances now supports the ml.geospatial.interactive instance type.

## __Amazon Textract__
  - ### Features
    - The AnalyzeDocument - Tables feature adds support for new elements in the API: table titles, footers, section titles, summary cells/tables, and table type.

## __CodeArtifact__
  - ### Features
    - Repository CreationTime is added to the CreateRepository and ListRepositories API responses.

# __1.12.433__ __2023-03-22__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS IoT TwinMaker__
  - ### Features
    - This release adds support of adding metadata when creating a new scene or updating an existing scene.

## __AWS Network Manager__
  - ### Features
    - This release includes an update to create-transit-gateway-route-table-attachment, showing example usage for TransitGatewayRouteTableArn.

## __AWS Resilience Hub__
  - ### Features
    - This release provides customers with the ability to import resources from within an EKS cluster and assess the resiliency of EKS cluster workloads.

## __Amazon EventBridge Pipes__
  - ### Features
    - This release improves validation on the ARNs in the API model

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating, updating, and deleting Patch Baselines for AmazonLinux2023, AlmaLinux.

# __1.12.432__ __2023-03-21__
## __AWS Clean Rooms Service__
  - ### Features
    - GA Release of AWS Clean Rooms, Added Tagging Functionality

## __AWS IoT SiteWise__
  - ### Features
    - Provide support for tagging of data streams and enabling tag based authorization for property alias

## __Amazon Chime SDK Messaging__
  - ### Features
    - Amazon Chime SDK messaging customers can now manage streaming configuration for messaging data for archival and analysis.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for AWS Network Firewall, AWS PrivateLink, and Gateway Load Balancers to Amazon VPC Reachability Analyzer, and it makes the path destination optional as long as a destination address in the filter at source is provided.

## __Application Migration Service__
  - ### Features
    - This release introduces the Import and export feature and expansion of the post-launch actions

# __1.12.431__ __2023-03-20__
## __Amazon Neptune__
  - ### Features
    - This release makes following few changes. db-cluster-identifier is now a required parameter of create-db-instance. describe-db-cluster will now return PendingModifiedValues and GlobalClusterIdentifier fields in the response.

## __Amazon S3 on Outposts__
  - ### Features
    - S3 On Outposts added support for endpoint status, and a failed endpoint reason, if any

## __Amazon WorkDocs__
  - ### Features
    - This release adds a new API, SearchResources, which enable users to search through metadata and content of folders, documents, document versions and comments in a WorkDocs site.

## __Application Auto Scaling__
  - ### Features
    - With this release customers can now tag their Application Auto Scaling registered targets with key-value pairs and manage IAM permissions for all the tagged resources centrally.

# __1.12.430__ __2023-03-17__
## __AWS Config__
  - ### Features
    - This release adds resourceType enums for types released from October 2022 through February 2023.

## __AWS Database Migration Service__
  - ### Features
    - S3 setting to create AWS Glue Data Catalog. Oracle setting to control conversion of timestamp column. Support for Kafka SASL Plain authentication. Setting to map boolean from PostgreSQL to Redshift. SQL Server settings to force lob lookup on inline LOBs and to control access of database logs.

## __AWS SDK for Java__
  - ### Features
    - Update InstanceProfileCredentialsProvider to refresh credentials more aggressively after IMDS failures.

## __AWSBillingConductor__
  - ### Features
    - This release adds a new filter to ListAccountAssociations API and a new filter to ListBillingGroups API.

# __1.12.429__ __2023-03-16__
## __AWS Resource Explorer__
  - ### Features
    - Documentation updates for APIs.

## __Amazon GuardDuty__
  - ### Features
    - Updated 9 APIs for feature enablement to reflect expansion of GuardDuty to features. Added new APIs and updated existing APIs to support RDS Protection GA.

## __Amazon SageMaker Runtime__
  - ### Features
    - Documentation updates for SageMaker Runtime

# __1.12.428__ __2023-03-15__
## __AWS S3 Control__
  - ### Features
    - Added support for S3 Object Lambda aliases.

## __Amazon Security Lake__
  - ### Features
    - Make Create/Get/ListSubscribers APIs return resource share ARN and name so they can be used to validate the RAM resource share to accept. GetDatalake can be used to track status of UpdateDatalake and DeleteDatalake requests.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - This release adds the binary analysis that analyzes IIS application DLLs on Windows and Java applications on Linux to provide anti-pattern report without configuring access to the source code.

# __1.12.427__ __2023-03-14__
## __AWS Data Exchange__
  - ### Features
    - This release enables data providers to license direct access to S3 objects encrypted with Customer Managed Keys (CMK) in AWS KMS through AWS Data Exchange. Subscribers can use these keys to decrypt, then use the encrypted S3 objects shared with them, without creating or managing copies.

## __AWS Direct Connect__
  - ### Features
    - describe-direct-connect-gateway-associations includes a new status, updating, indicating that the association is currently in-process of updating.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation only updates to correct customer-reported issues

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new DnsOptions key (PrivateDnsOnlyForInboundResolverEndpoint) to CreateVpcEndpoint and ModifyVpcEndpoint APIs.

## __Amazon Keyspaces__
  - ### Features
    - Adding support for client-side timestamps

## __Application Auto Scaling__
  - ### Features
    - Application Auto Scaling customers can now use mathematical functions to customize the metric used with Target Tracking policies within the policy configuration itself, saving the cost and effort of publishing the customizations as a separate metric.

# __1.12.426__ __2023-03-13__
## __AWS Lake Formation__
  - ### Features
    - This release updates the documentation regarding Get/Update DataCellsFilter

## __AWS S3 Control__
  - ### Features
    - Added support for cross-account Multi-Region Access Points. Added support for S3 Replication for S3 on Outposts.

## __AWS Telco Network Builder__
  - ### Features
    - This release adds tagging support to the following Network Instance APIs : Instantiate, Update, Terminate.

## __Amazon AppIntegrations Service__
  - ### Features
    - Adds FileConfiguration to Amazon AppIntegrations CreateDataIntegration supporting scheduled downloading of third party files into Amazon Connect from sources such as Microsoft SharePoint.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release extends Wisdom CreateKnowledgeBase API to support SharePoint connector type by removing the @required trait for objectField

# __1.12.425__ __2023-03-10__
## __AWS Secrets Manager__
  - ### Features
    - The type definitions of SecretString and SecretBinary now have a minimum length of 1 in the model to match the exception thrown when you pass in empty values.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - This release adds a new exception returned when calling AWS IVS chat UpdateLoggingConfiguration. Now UpdateLoggingConfiguration can return ConflictException when invalid updates are made in sequence to Logging Configurations.

# __1.12.424__ __2023-03-09__
## __AWS Cloud Map__
  - ### Features
    - Updated all AWS Cloud Map APIs to provide consistent throttling exception (RequestLimitExceeded)

## __AWS Network Manager__
  - ### Features
    - This update provides example usage for TransitGatewayRouteTableArn.

## __Amazon CloudWatch Evidently__
  - ### Features
    - Updated entity override documentation

## __Amazon Connect Service__
  - ### Features
    - This release adds a new API, GetMetricDataV2, which returns metric data for Amazon Connect.

## __Amazon QuickSight__
  - ### Features
    - This release has two changes: add state persistence feature for embedded dashboard and console in GenerateEmbedUrlForRegisteredUser API; add properties for hidden collapsed row dimensions in PivotTableOptions.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Inference now allows SSM access to customer's model container by setting the "EnableSSMAccess" parameter for a ProductionVariant in CreateEndpointConfig API.

## __Amazon Simple Email Service__
  - ### Features
    - This release introduces a new recommendation in Virtual Deliverability Manager Advisor, which detects missing or misconfigured Brand Indicator for Message Identification (BIMI) DNS records for customer sending identities.

## __CodeArtifact__
  - ### Features
    - This release introduces the generic package format, a mechanism for storing arbitrary binary assets. It also adds a new API, PublishPackageVersion, to allow for publishing generic packages.

## __Redshift Data API Service__
  - ### Features
    - Added support for Redshift Serverless workgroup-arn wherever the WorkgroupName parameter is available.

# __1.12.423__ __2023-03-08__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release provides the date and time live resources were created.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - This release provides the date and time VOD resources were created.

## __AWS Lake Formation__
  - ### Features
    - This release adds two new API support "GetDataCellsFiler" and "UpdateDataCellsFilter", and also updates the corresponding documentation.

## __Amazon Athena__
  - ### Features
    - A new field SubstatementType is added to GetQueryExecution API, so customers have an error free way to detect the query type and interpret the result.

## __Amazon DynamoDB__
  - ### Features
    - Adds deletion protection support to DynamoDB tables. Tables with deletion protection enabled cannot be deleted. Deletion protection is disabled by default, can be enabled via the CreateTable or UpdateTable APIs, and is visible in TableDescription. This setting is not replicated for Global Tables.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introducing Amazon EC2 C7g, M7g and R7g instances, powered by the latest generation AWS Graviton3 processors and deliver up to 25% better performance over Graviton2-based instances.

## __Amazon Route 53 Resolver__
  - ### Features
    - Add dual-stack and IPv6 support for Route 53 Resolver Endpoint,Add IPv6 target IP in Route 53 Resolver Forwarding Rule

## __Amazon SageMaker Service__
  - ### Features
    - There needs to be a user identity to specify the SageMaker user who perform each action regarding the entity. However, these is a not a unified concept of user identity across SageMaker service that could be used today.

# __1.12.422__ __2023-03-07__
## __AWS Database Migration Service__
  - ### Features
    - This release adds DMS Fleet Advisor Target Recommendation APIs and exposes functionality for DMS Fleet Advisor. It adds functionality to start Target Recommendation calculation.

## __Amazon Location Service__
  - ### Features
    - Documentation update for the release of 3 additional map styles for use with Open Data Maps: Open Data Standard Dark, Open Data Visualization Light & Open Data Visualization Dark.

# __1.12.421__ __2023-03-06__
## __AWS Account__
  - ### Features
    - AWS Account alternate contact email addresses can now have a length of 254 characters and contain the character "|".

## __Amazon Interactive Video Service__
  - ### Features
    - Updated text description in DeleteChannel, Stream, and StreamSummary.

# __1.12.420__ __2023-03-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has improved handling for different input and output color space combinations.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive adds support for Nielsen watermark timezones.

## __Amazon DynamoDB__
  - ### Features
    - Documentation updates for DynamoDB.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for a new boot mode for EC2 instances called 'UEFI Preferred'.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports role access for these API operations: CreateVocabulary, UpdateVocabulary, CreateVocabularyFilter, and UpdateVocabularyFilter.

# __1.12.419__ __2023-03-02__
## __AWS IoT__
  - ### Features
    - A recurring maintenance window is an optional configuration used for rolling out the job document to all devices in the target group observing a predetermined start time, duration, and frequency that the maintenance window occurs.

## __AWS Organizations__
  - ### Features
    - This release introduces a new reason code, ACCOUNT_CREATION_NOT_COMPLETE, to ConstraintViolationException in CreateOrganization API.

## __AWS Performance Insights__
  - ### Features
    - This release adds a new field PeriodAlignment to allow the customer specifying the returned timestamp of time periods to be either the start or end time.

## __Amazon EventBridge Pipes__
  - ### Features
    - This release fixes some input parameter range and patterns.

## __Amazon SageMaker Service__
  - ### Features
    - Add a new field "EndpointMetrics" in SageMaker Inference Recommender "ListInferenceRecommendationsJobSteps" API response.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - This release updates the File Import API to allow importing servers already discovered by customers with reduced pre-requisites.

# __1.12.418__ __2023-03-01__
## __AWS Price List Service__
  - ### Features
    - This release adds 2 new APIs - ListPriceLists which returns a list of applicable price lists, and GetPriceListFileUrl which outputs a URL to retrieve your price lists from the generated file from ListPriceLists

## __Amazon CodeCatalyst__
  - ### Features
    - Published Dev Environments StopDevEnvironmentSession API

## __Amazon S3 on Outposts__
  - ### Features
    - S3 on Outposts introduces a new API ListOutpostsWithS3, with this API you can list all your Outposts with S3 capacity.

# __1.12.417__ __2023-02-28__
## __AWS Key Management Service__
  - ### Features
    - AWS KMS is deprecating the RSAES_PKCS1_V1_5 wrapping algorithm option in the GetParametersForImport API that is used in the AWS KMS Import Key Material feature. AWS KMS will end support for this wrapping algorithm by October 1, 2023.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports flywheels to help you train and manage new model versions for custom models.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows IMDS support to be set to v2-only on an existing AMI, so that all future instances launched from that AMI will use IMDSv2 by default.

## __Amazon Lightsail__
  - ### Features
    - This release adds Lightsail for Research feature support, such as GUI session access, cost estimates, stop instance on idle, and disk auto mount.

## __Amazon Managed Blockchain__
  - ### Features
    - This release adds support for tagging to the accessor resource in Amazon Managed Blockchain

## __Amazon Omics__
  - ### Features
    - Minor model changes to accomodate batch imports feature

# __1.12.416__ __2023-02-27__
## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has added support for HDR10 to SDR tone mapping, and animated GIF video input sources.

## __AWS Lambda__
  - ### Features
    - This release adds the ability to create ESMs with Document DB change streams as event source. For more information see  https://docs.aws.amazon.com/lambda/latest/dg/with-documentdb.html.

## __Amazon CloudWatch Internet Monitor__
  - ### Features
    - CloudWatch Internet Monitor is a a new service within CloudWatch that will help application developers and network engineers continuously monitor internet performance metrics such as availability and performance between their AWS-hosted applications and end-users of these applications

## __Amazon DevOps Guru__
  - ### Features
    - This release adds the description field on ListAnomaliesForInsight and DescribeAnomaly API responses for proactive anomalies.

## __Amazon Timestream Write__
  - ### Features
    - This release adds the ability to ingest batched historical data or migrate data in bulk from S3 into Timestream using CSV files.

## __Elastic Disaster Recovery Service__
  - ### Features
    - New fields were added to reflect availability zone data in source server and recovery instance description commands responses, as well as source server launch status.

# __1.12.415__ __2023-02-24__
## __AWS SecurityHub__
  - ### Features
    - New Security Hub APIs and updates to existing APIs that help you consolidate control findings and enable and disable controls across all supported standards

## __AWS Service Catalog__
  - ### Features
    - Documentation updates for Service Catalog

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to delete domains through the DeleteDomain API. For more information see https://docs.aws.amazon.com/cases/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - StartTaskContact API now supports linked task creation with a new optional RelatedContactId parameter

## __Amazon Redshift__
  - ### Features
    - Documentation updates for Redshift API bringing it in line with IAM best practices.

# __1.12.414__ __2023-02-23__
## __AWS IoT Wireless__
  - ### Features
    - In this release, we add additional capabilities for the FUOTA which allows user to configure the fragment size, the sending interval and the redundancy ratio of the FUOTA tasks

## __AWS WAFV2__
  - ### Features
    - You can now associate an AWS WAF v2 web ACL with an AWS App Runner service.

## __Amazon Appflow__
  - ### Features
    - This release enables the customers to choose whether to use Private Link for Metadata and Authorization call when using a private Salesforce connections

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports deleting Amazon ECS task definitions that are in the INACTIVE state.

## __Amazon GuardDuty__
  - ### Features
    - Updated API and data types descriptions for CreateFilter, UpdateFilter, and TriggerDetails.

## __Amazon Location Service__
  - ### Features
    - This release adds support for using Maps APIs with an API Key in addition to AWS Cognito. This includes support for adding, listing, updating and deleting API Keys.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for a new finding type, Policy:IAMUser/S3BucketSharedWithCloudFront, and S3 bucket metadata that indicates if a bucket is shared with an Amazon CloudFront OAI or OAC.

## __Amazon Managed Grafana__
  - ### Features
    - Doc-only update. Updated information on attached role policies for customer provided roles

# __1.12.413__ __2023-02-22__
## __AWS DataSync__
  - ### Features
    - AWS DataSync has relaxed the minimum length constraint of AccessKey for Object Storage locations to 1.

## __Amazon Chime SDK Voice__
  - ### Features
    - This release introduces support for Voice Connector media metrics in the Amazon Chime SDK Voice namespace

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports block lists in origin request policies so that you can forward all headers, cookies, or query string from viewer requests to the origin *except* for those specified in the block list.

## __Amazon OpenSearch Service__
  - ### Features
    - This release lets customers configure Off-peak window and software update related properties for a new/existing domain. It enhances the capabilities of StartServiceSoftwareUpdate API; adds 2 new APIs - ListScheduledActions & UpdateScheduledAction; and allows Auto-tune to make use of Off-peak window.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Document only update for Feb 2023

## __CloudWatch RUM__
  - ### Features
    - CloudWatch RUM now supports CloudWatch Custom Metrics

# __1.12.412__ __2023-02-21__
## __AWS Resilience Hub__
  - ### Features
    - In this release we improved resilience hub application creation and maintenance by introducing new resource and app component crud APIs, improving visibility and maintenance of application input sources and added support for additional information attributes to be provided by customers.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __AWS Telco Network Builder__
  - ### Features
    - This is the initial SDK release for AWS Telco Network Builder (TNB). AWS Telco Network Builder is a network automation service that helps you deploy and manage telecom networks.

## __Amazon QuickSight__
  - ### Features
    - S3 data sources now accept a custom IAM role.

# __1.12.411__ __2023-02-20__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a ServiceQuotaExceededException to the UpdateAssessmentFrameworkShare API operation.

## __AWS SDK for Java__
  - ### Features
    - Improve the `DEBUG` logging in `AWSCredentialsProviderChain`, by including the full stacktrace of the error thrown by `AWSCredentialsProvider` that failed in chain.

## __Amazon Connect Service__
  - ### Features
    - Reasons for failed diff has been approved by SDK Reviewer

# __1.12.410__ __2023-02-17__
## __AWS App Runner__
  - ### Features
    - This release supports removing MaxSize limit for AutoScalingConfiguration.

## __AWS Glue__
  - ### Features
    - Release of Delta Lake Data Lake Format for Glue Studio Service

# __1.12.409__ __2023-02-16__
## __AWS WAFV2__
  - ### Features
    - Added a notice for account takeover prevention (ATP). The interface incorrectly lets you to configure ATP response inspection in regional web ACLs in Region US East (N. Virginia), without returning an error. ATP response inspection is only available in web ACLs that protect CloudFront distributions.

## __Amazon EMR__
  - ### Features
    - This release provides customers the ability to define a timeout period for procuring capacity during a resize operation for Instance Fleet clusters. Customers can specify this timeout using the ResizeSpecifications parameter supported by RunJobFlow, ModifyInstanceFleet and AddInstanceFleet APIs.

## __Amazon Interactive Video Service__
  - ### Features
    - Doc-only update. Updated text description in DeleteChannel, Stream, and StreamSummary.

## __Amazon Managed Grafana__
  - ### Features
    - With this release Amazon Managed Grafana now supports inbound Network Access Control that helps you to restrict user access to your Grafana workspaces

# __1.12.408__ __2023-02-15__
## __AWS CloudTrail__
  - ### Features
    - This release adds an InsufficientEncryptionPolicyException type to the StartImport endpoint

## __AWS Glue__
  - ### Features
    - Fix DirectJDBCSource not showing up in CLI code gen

## __AWS Private 5G__
  - ### Features
    - This release introduces a new StartNetworkResourceUpdate API, which enables return/replacement of hardware from a NetworkSite.

## __AWS WAFV2__
  - ### Features
    - For protected CloudFront distributions, you can now use the AWS WAF Fraud Control account takeover prevention (ATP) managed rule group to block new login attempts from clients that have recently submitted too many failed login attempts.

## __Amazon Elastic File System__
  - ### Features
    - Documentation update for EFS to support IAM best practices.

## __Amazon Fraud Detector__
  - ### Features
    - This release introduces Lists feature which allows customers to reference a set of values in Fraud Detector's rules. With Lists, customers can dynamically manage these attributes in real time. Lists can be created/deleted and its contents can be modified using the Fraud Detector API.

## __Amazon Relational Database Service__
  - ### Features
    - Database Activity Stream support for RDS for SQL Server.

# __1.12.407__ __2023-02-14__
## __AWS DataSync__
  - ### Features
    - With this launch, we are giving customers the ability to use older SMB protocol versions, enabling them to use DataSync to copy data to and from their legacy storage arrays.

## __Amazon AppConfig__
  - ### Features
    - AWS AppConfig now offers the option to set a version label on hosted configuration versions. Version labels allow you to identify specific hosted configuration versions based on an alternate versioning scheme that you define.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - With this release customers can turn host maintenance on or off when allocating or modifying a supported dedicated host. Host maintenance is turned on by default for supported hosts.

# __1.12.406__ __2023-02-13__
## __AWS Account__
  - ### Features
    - This release of the Account Management API enables customers to view and manage whether AWS Opt-In Regions are enabled or disabled for their Account. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/manage-acct-regions.html

## __AWS AppConfig Data__
  - ### Features
    - AWS AppConfig now offers the option to set a version label on hosted configuration versions. If a labeled hosted configuration version is deployed, its version label is available in the GetLatestConfiguration response.

## __Amazon Import/Export Snowball__
  - ### Features
    - Adds support for EKS Anywhere on Snowball. AWS Snow Family customers can now install EKS Anywhere service on Snowball Edge Compute Optimized devices.

# __1.12.405__ __2023-02-10__
## __Amazon Connect Service__
  - ### Features
    - This update provides the Wisdom session ARN for contacts enabled for Wisdom in the chat channel.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for waiters that automatically poll for an imported snapshot until it reaches the completed state.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds two new neural Japanese voices - Kazuha, Tomoko

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds support for selecting algorithms in CreateAutoMLJob API.

## __Amazon Simple Notification Service__
  - ### Features
    - This release adds support for SNS X-Ray active tracing as well as other updates.

## __Auto Scaling__
  - ### Features
    - You can now either terminate/replace, ignore, or wait for EC2 Auto Scaling instances on standby or protected from scale in. Also, you can also roll back changes from a failed instance refresh.

# __1.12.404__ __2023-02-09__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This release adds support for creating environments with a network fabric type of NONE

## __Amazon Chime SDK Meetings__
  - ### Features
    - Documentation updates for Chime Meetings SDK

## __Amazon CloudWatch Evidently__
  - ### Features
    - Updated entity overrides parameter to accept up to 2500 overrides or a total of 40KB.

## __Amazon EMR Containers__
  - ### Features
    - EMR on EKS allows configuring retry policies for job runs through the StartJobRun API. Using retry policies, a job cause a driver pod to be restarted automatically if it fails or is deleted. The job's status can be seen in the DescribeJobRun and ListJobRun APIs and monitored using CloudWatch events.

## __Amazon Lex Model Building V2__
  - ### Features
    - AWS Lex now supports Network of Bots.

## __Amazon Lex Runtime V2__
  - ### Features
    - AWS Lex now supports Network of Bots.

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon WorkDocs__
  - ### Features
    - Doc only update for the WorkDocs APIs.

## __Amazon WorkSpaces__
  - ### Features
    - Removed Windows Server 2016 BYOL and made changes based on IAM campaign.

# __1.12.403__ __2023-02-08__
## __AWS Backup__
  - ### Features
    - This release added one attribute (resource name) in the output model of our 9 existing APIs in AWS backup so that customers will see the resource name at the output. No input required from Customers.

## __AWS Glue__
  - ### Features
    - DirectJDBCSource + Glue 4.0 streaming options

## __AWS Lake Formation__
  - ### Features
    - This release removes the LFTagpolicyResource expression limits.

## __Amazon CloudFront__
  - ### Features
    - CloudFront Origin Access Control extends support to AWS Elemental MediaStore origins.

# __1.12.402__ __2023-02-07__
## __AWS Transfer Family__
  - ### Features
    - Updated the documentation for the ImportCertificate API call, and added examples.

# __1.12.401__ __2023-02-06__
## __AWS Compute Optimizer__
  - ### Features
    - AWS Compute optimizer can now infer if Kafka is running on an instance.

## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has added improved scene change detection capabilities and a bandwidth reduction filter, along with video quality enhancements, to the AVC encoder.

## __AWS Outposts__
  - ### Features
    - Adds OrderType to Order structure. Adds PreviousOrderId and PreviousLineItemId to LineItem structure. Adds new line item status REPLACED. Increases maximum length of pagination token.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release deprecates the PartyType and Gender enum data types from the Profile model and replaces them with new PartyTypeString and GenderString attributes, which accept any string of length up to 255.

## __Amazon Fraud Detector__
  - ### Features
    - My AWS Service (Amazon Fraud Detector) - This release introduces Cold Start Model Training which optimizes training for small datasets and adds intelligent methods for treating unlabeled data. You can now train Online Fraud Insights or Transaction Fraud Insights models with minimal historical-data.

# __1.12.400__ __2023-02-03__
## __AWS Proton__
  - ### Features
    - Add new GetResourcesSummary API

## __Amazon Redshift__
  - ### Features
    - Corrects descriptions of the parameters for the API operations RestoreFromClusterSnapshot, RestoreTableFromClusterSnapshot, and CreateCluster.

# __1.12.399__ __2023-02-02__
## __AWS Single Sign-On Admin__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon AppConfig__
  - ### Features
    - AWS AppConfig introduces KMS customer-managed key (CMK) encryption of configuration data, along with AWS Secrets Manager as a new configuration data source. S3 objects using SSE-KMS encryption and SSM Parameter Store SecureStrings are also now supported.

## __Amazon Connect Service__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Keyspaces__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon QuickSight__
  - ### Features
    - QuickSight support for Radar Chart and Dashboard Publish Options

## __Amazon Redshift__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Elastic Load Balancing__
  - ### Features
    - The GWLB Flex Health Check project updates the default values of healthy-threshold-count from 3 to 5 and unhealthy-threshold-count from 3 to 2

# __1.12.398__ __2023-02-01__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS MediaTailor__
  - ### Features
    - The AWS Elemental MediaTailor SDK for Channel Assembly has added support for program updates, and the ability to clip the end of VOD sources in programs.

## __Amazon DevOps Guru__
  - ### Features
    - This release adds filter support ListAnomalyForInsight API.

## __Amazon Forecast Service__
  - ### Features
    - This release will enable customer select INCREMENTAL as ImportModel in Forecast's CreateDatasetImportJob API. Verified latest SDK containing required attribute, following https://w.amazon.com/bin/view/AWS-Seer/Launch/Trebuchet/

## __Amazon Simple Notification Service__
  - ### Features
    - Additional attributes added for set-topic-attributes.

# __1.12.397__ __2023-01-31__
## __AWS AppSync__
  - ### Features
    - This release introduces the feature to support EventBridge as AppSync data source.

## __AWS CloudTrail__
  - ### Features
    - Add new "Channel" APIs to enable users to manage channels used for CloudTrail Lake integrations, and "Resource Policy" APIs to enable users to manage the resource-based permissions policy attached to a channel.

## __AWS CloudTrail Data Service__
  - ### Features
    - Add CloudTrail Data Service to enable users to ingest activity events from non-AWS sources into CloudTrail Lake.

## __AWS Ground Station__
  - ### Features
    - DigIF Expansion changes to the Customer APIs.

## __AWS IoT__
  - ### Features
    - Added support for IoT Rules Engine Cloudwatch Logs action batch mode.

## __AWS Outposts__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __AWS SecurityHub__
  - ### Features
    - New fields have been added to the AWS Security Finding Format. Compliance.SecurityControlId is a unique identifier for a security control across standards. Compliance.AssociatedStandards contains all enabled standards in which a security control is enabled.

## __AWS Support__
  - ### Features
    - This fixes incorrect endpoint construction when a customer is explicitly setting a region.

## __Access Analyzer__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon Connect Participant Service__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This launch allows customers to associate up to 8 IP addresses to their NAT Gateways to increase the limit on concurrent connections to a single destination by eight times from 55K to 440K.

## __Amazon Kinesis__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon OpenSearch Service__
  - ### Features
    - Amazon OpenSearch Service adds the option for a VPC endpoint connection between two domains when the local domain uses OpenSearch version 1.3 or 2.3. You can now use remote reindex to copy indices from one VPC domain to another without a reverse proxy.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds two new neural American English voices - Ruth, Stephen

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports more completion criteria for Hyperparameter Optimization.

## __CodeArtifact__
  - ### Features
    - This release introduces a new DeletePackage API, which enables deletion of a package and all of its versions from a repository.

# __1.12.396__ __2023-01-30__
## __AWS Application Discovery Service__
  - ### Features
    - Update ImportName validation to 255 from the current length of 100

## __AWS CloudFormation__
  - ### Features
    - This feature provides a method of obtaining which regions a stackset has stack instances deployed in.

## __AWS Elemental MediaConvert__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon CloudDirectory__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - We add Prefix Lists as a new route destination option for LocalGatewayRoutes. This will allow customers to create routes to Prefix Lists. Prefix List routes will allow customers to group individual CIDR routes with the same target into a single route.

## __Amazon Simple Workflow Service__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __EC2 Image Builder__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Managed Streaming for Kafka__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

# __1.12.395__ __2023-01-27__
## __AWS Elastic Beanstalk__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __AWS Fault Injection Simulator__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __AWS Greengrass__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __AWS IoT Greengrass V2__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) in SDK.

## __AWS MediaTailor__
  - ### Features
    - This release introduces the As Run logging type, along with API and documentation updates.

## __AWS Outposts__
  - ### Features
    - Adding support for payment term in GetOrder, CreateOrder responses.

## __AWSServerlessApplicationRepository__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon AppStream__
  - ### Features
    - Fixing the issue where Appstream waiters hang for fleet_started and fleet_stopped.

## __Amazon Glacier__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime which supports InvokeEndpointAsync asynchronously can now invoke endpoints with custom timeout values. Asynchronous invocations support longer processing times.

## __Amazon SageMaker Service__
  - ### Features
    - This release supports running SageMaker Training jobs with container images that are in a private Docker registry.

## __Application Auto Scaling__
  - ### Features
    - Enabled FIPS endpoints for GovCloud (US) regions in SDK.

# __1.12.394__ __2023-01-26__
## __AWS IoT FleetWise__
  - ### Features
    - Add model validation to BatchCreateVehicle and BatchUpdateVehicle operations that invalidate requests with an empty vehicles list.

## __Amazon EventBridge__
  - ### Features
    - Minor comments for Redshift Serverless workgroup target support.

## __Amazon Simple Storage Service__
  - ### Features
    - Allow FIPS to be used with path-style URLs.

# __1.12.393__ __2023-01-25__
## __AWS CloudFormation__
  - ### Features
    - Enabled FIPS aws-us-gov endpoints in SDK.

## __AWS S3 Control__
  - ### Features
    - Add additional endpoint tests for S3 Control. Fix missing endpoint parameters for PutBucketVersioning and GetBucketVersioning. Prior to this fix, those operations may have resulted in an invalid endpoint being resolved.

## __AWS Security Token Service__
  - ### Features
    - Doc only change to update wording in a key topic

## __AWSMainframeModernization__
  - ### Features
    - Add returnCode, batchJobIdentifier in GetBatchJobExecution response, for user to view the batch job execution result & unique identifier from engine. Also removed unused headers from REST APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds new functionality that allows customers to provision IPv6 CIDR blocks through Amazon VPC IP Address Manager (IPAM) as well as allowing customers to utilize IPAM Resource Discovery APIs.

## __Amazon Polly__
  - ### Features
    - Add 5 new neural voices - Sergio (es-ES), Andres (es-MX), Remi (fr-FR), Adriano (it-IT) and Thiago (pt-BR).

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now decouples from Model Registry and could accept Model Name to invoke inference recommendations job; Inference Recommender now provides CPU/Memory Utilization metrics data in recommendation output.

## __Redshift Serverless__
  - ### Features
    - Added query monitoring rules as possible parameters for create and update workgroup operations.

# __1.12.391__ __2023-01-24__
## __AWS Glue DataBrew__
  - ### Features
    - Enabled FIPS us-gov-west-1 endpoints in SDK.

## __AWS Systems Manager for SAP__
  - ### Features
    - This release provides updates to documentation and support for listing operations performed by AWS Systems Manager for SAP.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Asia Pacific (Melbourne) Region (ap-southeast-4) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

# __1.12.390__ __2023-01-23__
## __AWS Lambda__
  - ### Features
    - Release Lambda RuntimeManagementConfig, enabling customers to better manage runtime updates to their Lambda functions. This release adds two new APIs, GetRuntimeManagementConfig and PutRuntimeManagementConfig, as well as support on existing Create/Get/Update function APIs.

## __AWS SDK for Java__
  - ### Features
    - Adding support for ap-southeast-4 that is MEL_Melbourne region.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Inference now supports P4de instance types.

# __1.12.389__ __2023-01-20__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6in, M6in, M6idn, R6in and R6idn instances are powered by 3rd Generation Intel Xeon Scalable processors (code named Ice Lake) with an all-core turbo frequency of 3.5 GHz.

## __Amazon Interactive Video Service__
  - ### Features
    - API and Doc update. Update to arns field in BatchGetStreamKey. Also updates to operations and structures.

## __Amazon QuickSight__
  - ### Features
    - This release adds support for data bars in QuickSight table and increases pivot table field well limit.

# __1.12.388__ __2023-01-19__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive adds support for SCTE 35 preRollMilliSeconds.

## __AWS Glue__
  - ### Features
    - Release Glue Studio Hudi Data Lake Format for SDK/CLI

## __AWS Ground Station__
  - ### Features
    - Add configurable prepass and postpass times for DataflowEndpointGroup. Add Waiter to allow customers to wait for a contact that was reserved through ReserveContact

## __AWS Panorama__
  - ### Features
    - Added AllowMajorVersionUpdate option to OTAJobConfig to make appliance software major version updates opt-in.

## __Amazon Appflow__
  - ### Features
    - Adding support for Salesforce Pardot connector in Amazon AppFlow.

## __Amazon CloudWatch Logs__
  - ### Features
    - Bug fix - Removed the regex pattern validation from CoralModel to avoid potential security issue.

## __Amazon Connect Participant Service__
  - ### Features
    - This release updates Amazon Connect Participant's GetTranscript api to provide transcripts of past chats on a persistent chat session.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat introduces Persistent Chat, allowing customers to resume previous conversations with context and transcripts carried over from previous chats, eliminating the need to repeat themselves and allowing agents to provide personalized service with access to entire conversation history.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds SSM Parameter Resource Aliasing support to EC2 Launch Templates. Launch Templates can now store parameter aliases in place of AMI Resource IDs. CreateLaunchTemplateVersion and DescribeLaunchTemplateVersions now support a convenience flag, ResolveAlias, to return the resolved parameter value.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds the enhanced dry run option, that checks for validation errors that might occur when deploying configuration changes and provides a summary of these errors, if any. The feature will also indicate whether a blue/green deployment will be required to apply a change.

## __Amazon SageMaker Service__
  - ### Features
    - HyperParameterTuningJobs now allow passing environment variables into the corresponding TrainingJobs

## __CodeArtifact__
  - ### Features
    - Documentation updates for CodeArtifact

# __1.12.387__ __2023-01-18__
## __AWS WAFV2__
  - ### Features
    - Improved the visibility of the guidance for updating AWS WAF resources, such as web ACLs and rule groups.

## __Amazon CloudWatch__
  - ### Features
    - Enable cross-account streams in CloudWatch Metric Streams via Observability Access Manager.

## __Amazon Elastic File System__
  - ### Features
    - Documentation updates for EFS access points limit increase

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Updates the range for a Chat Room's maximumMessageRatePerSecond field.

# __1.12.386__ __2023-01-17__
## __AWS Cloud9__
  - ### Features
    - Added minimum value to AutomaticStopTimeMinutes parameter.

## __AWS Network Firewall__
  - ### Features
    - Network Firewall now allows creation of dual stack endpoints, enabling inspection of IPv6 traffic.

## __AWSBillingConductor__
  - ### Features
    - This release adds support for SKU Scope for pricing plans.

## __EC2 Image Builder__
  - ### Features
    - Add support for AWS Marketplace product IDs as input during CreateImageRecipe for the parent-image parameter. Add support for listing third-party components.

# __1.12.385__ __2023-01-13__
## __AWS Outposts__
  - ### Features
    - This release adds POWER_30_KVA as an option for PowerDrawKva. PowerDrawKva is part of the RackPhysicalProperties structure in the CreateSite request.

## __AWS Resource Groups__
  - ### Features
    - AWS Resource Groups customers can now turn on Group Lifecycle Events in their AWS account. When you turn this on, Resource Groups monitors your groups for changes to group state or membership. Those changes are sent to Amazon EventBridge as events that you can respond to using rules you create.

## __Amazon Connect Service__
  - ### Features
    - This release updates the responses of UpdateContactFlowContent, UpdateContactFlowMetadata, UpdateContactFlowName and DeleteContactFlow API with empty responses.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

# __1.12.384__ __2023-01-12__
## __AWS Clean Rooms Service__
  - ### Features
    - Initial release of AWS Clean Rooms

## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has added support for compact DASH manifest generation, audio normalization using TruePeak measurements, and the ability to clip the sample range in the color corrector.

## __AWS Lambda__
  - ### Features
    - Add support for MaximumConcurrency parameter for SQS event source. Customers can now limit the maximum concurrent invocations for their SQS Event Source Mapping.

## __AWS Secrets Manager__
  - ### Features
    - Update documentation for new ListSecrets and DescribeSecret parameters

## __Amazon CloudWatch Logs__
  - ### Features
    - Bug fix: logGroupName is now not a required field in GetLogEvents, FilterLogEvents, GetLogGroupFields, and DescribeLogStreams APIs as logGroupIdentifier can be provided instead

# __1.12.383__ __2023-01-11__
## __AWSKendraFrontendService__
  - ### Features
    - This release adds support to new document types - RTF, XML, XSLT, MS_EXCEL, CSV, JSON, MD

# __1.12.382__ __2023-01-10__
## __Amazon Location Service__
  - ### Features
    - This release adds support for two new route travel models, Bicycle and Motorcycle which can be used with Grab data source.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for configuring allocated storage on the CreateDBInstanceReadReplica, RestoreDBInstanceFromDBSnapshot, and RestoreDBInstanceToPointInTime APIs.

# __1.12.381__ __2023-01-09__
## __AWS Network Firewall__
  - ### Features
    - Network Firewall now supports the Suricata rule action reject, in addition to the actions pass, drop, and alert.

## __AWS Resource Access Manager__
  - ### Features
    - Enabled FIPS aws-us-gov endpoints in SDK.

## __Amazon Elastic Container Registry Public__
  - ### Features
    - This release for Amazon ECR Public makes several change to bring the SDK into sync with the API.

## __Amazon Kendra Intelligent Ranking__
  - ### Features
    - Introducing Amazon Kendra Intelligent Ranking, a new set of Kendra APIs that leverages Kendra semantic ranking capabilities to improve the quality of search results from other search services (i.e. OpenSearch, ElasticSearch, Solr).

## __Amazon WorkSpaces Web__
  - ### Features
    - This release adds support for a new portal authentication type: AWS IAM Identity Center (successor to AWS Single Sign-On).

# __1.12.380__ __2023-01-06__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new data retention option in your Audit Manager settings. You can now use the DeregistrationPolicy parameter to specify if you want to delete your data when you deregister Audit Manager.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Added revocation parameter validation: bucket names must match S3 bucket naming rules and CNAMEs conform to RFC2396 restrictions on the use of special characters in URIs.

# __1.12.379__ __2023-01-05__
## __AWS App Runner__
  - ### Features
    - This release adds support of securely referencing secrets and configuration data that are stored in Secrets Manager and SSM Parameter Store by adding them as environment secrets in your App Runner service.

## __Amazon Connect Service__
  - ### Features
    - Documentation update for a new Initiation Method value in DescribeContact API

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Amazon Lightsail.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for specifying which certificate authority (CA) to use for a DB instance's server certificate during DB instance creation, as well as other CA enhancements.

## __AmazonMWAA__
  - ### Features
    - MWAA supports Apache Airflow version 2.4.3.

## __AmplifyBackend__
  - ### Features
    - Updated GetBackendAPIModels response to include ModelIntrospectionSchema json string

## __EMR Serverless__
  - ### Features
    - Adds support for customized images. You can now provide runtime images when creating or updating EMR Serverless Applications.

# __1.12.378__ __2023-01-04__
## __Amazon CloudWatch Logs__
  - ### Features
    - Update to remove sequenceToken as a required field in PutLogEvents calls.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding support for QuickSetup Document Type in Systems Manager

## __Application Auto Scaling__
  - ### Features
    - Customers can now use the existing DescribeScalingActivities API to also see the detailed and machine-readable reasons for Application Auto Scaling not scaling their resources and, if needed, take the necessary corrective actions.

# __1.12.377__ __2023-01-03__
## __Amazon Security Lake__
  - ### Features
    - Allow CreateSubscriber API to take string input that allows setting more descriptive SubscriberDescription field. Make souceTypes field required in model level for UpdateSubscriberRequest as it is required for every API call on the backend. Allow ListSubscribers take any String as nextToken param.

# __1.12.376__ __2022-12-30__
## __AWS IoT FleetWise__
  - ### Features
    - Update documentation - correct the epoch constant value of default value for expiryTime field in CreateCampaign request.

## __Amazon CloudFront__
  - ### Features
    - Extend response headers policy to support removing headers from viewer responses

# __1.12.375__ __2022-12-29__
## __AWS Secrets Manager__
  - ### Features
    - Added owning service filter, include planned deletion flag, and next rotation date response parameter in ListSecrets.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release extends Wisdom CreateContent and StartContentUpload APIs to support PDF and MicrosoftWord docx document uploading.

## __Amazon EMR__
  - ### Features
    - Added GetClusterSessionCredentials API to allow Amazon SageMaker Studio to connect to EMR on EC2 clusters with runtime roles and AWS Lake Formation-based access control for Apache Spark, Apache Hive, and Presto queries.

# __1.12.374__ __2022-12-28__
## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall now provides status messages for firewalls to help you troubleshoot when your endpoint fails.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Added support for Python paginators in the route53-recovery-control-config List* APIs.

## __Amazon ElastiCache__
  - ### Features
    - This release allows you to modify the encryption in transit setting, for existing Redis clusters. You can now change the TLS configuration of your Redis clusters without the need to re-build or re-provision the clusters or impact application availability.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Custom Engine Version (CEV) on RDS Custom SQL Server.

# __1.12.373__ __2022-12-27__
## __AWS Transfer Family__
  - ### Features
    - Add additional operations to throw ThrottlingExceptions

## __Amazon MemoryDB__
  - ### Features
    - This release adds support for MemoryDB Reserved nodes which provides a significant discount compared to on-demand node pricing. Reserved nodes are not physical nodes, but rather a billing discount applied to the use of on-demand nodes in your account.

# __1.12.372__ __2022-12-23__
## __Amazon Connect Participant Service__
  - ### Features
    - Amazon Connect Chat introduces the Message Receipts feature. This feature allows agents and customers to receive message delivered and read receipts after they send a chat message.

## __Amazon Connect Service__
  - ### Features
    - Support for Routing Profile filter, SortCriteria, and grouping by Routing Profiles for GetCurrentMetricData API. Support for RoutingProfiles, UserHierarchyGroups, and Agents as filters, NextStatus and AgentStatusName for GetCurrentUserData. Adds ApproximateTotalCount to both APIs.

## __Amazon Detective__
  - ### Features
    - This release adds a missed AccessDeniedException type to several endpoints.

## __Amazon FSx__
  - ### Features
    - Fix a bug where a recent release might break certain existing SDKs.

## __Inspector2__
  - ### Features
    - Amazon Inspector adds support for scanning NodeJS 18.x and Go 1.x AWS Lambda function runtimes.

# __1.12.371__ __2022-12-22__
## __AWS Compute Optimizer__
  - ### Features
    - This release enables AWS Compute Optimizer to analyze and generate optimization recommendations for ecs services running on Fargate.

## __AWS IoT Core Device Advisor__
  - ### Features
    - This release adds the following new features: 1) Documentation updates for IoT Device Advisor APIs. 2) Updated required request parameters for IoT Device Advisor APIs. 3) Added new service feature: ability to provide the test endpoint when customer executing the StartSuiteRun API.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat introduces the Idle Participant/Autodisconnect feature, which allows users to set timeouts relating to the activity of chat participants, using the new UpdateParticipantRoleConfig API.

## __Amazon Kinesis Video WebRTC Storage__
  - ### Features
    - Amazon Kinesis Video Streams offers capabilities to stream video and audio in real-time via WebRTC to the cloud for storage, playback, and analytical processing. Customers can use our enhanced WebRTC SDK and cloud APIs to enable real-time streaming, as well as media ingestion to the cloud.

## __Amazon Relational Database Service__
  - ### Features
    - Add support for managing master user password in AWS Secrets Manager for the DBInstance and DBCluster.

# __1.12.370__ __2022-12-21__
## __AWS License Manager Linux Subscriptions__
  - ### Features
    - AWS License Manager now offers cross-region, cross-account tracking of commercial Linux subscriptions on AWS. This includes subscriptions purchased as part of EC2 subscription-included AMIs, on the AWS Marketplace, or brought to AWS via Red Hat Cloud Access Program.

## __AWS Support__
  - ### Features
    - Documentation updates for the AWS Support API

## __AWS Transfer Family__
  - ### Features
    - This release adds support for Decrypt as a workflow step type.

## __Amazon Connect Participant Service__
  - ### Features
    - Amazon Connect Chat now allows for JSON (application/json) message types to be sent in the SendMessage API.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now allows for JSON (application/json) message types to be sent as part of the initial message in the StartChatContact API.

## __Amazon EventBridge Scheduler__
  - ### Features
    - Updated the ListSchedules and ListScheduleGroups APIs to allow the NamePrefix field to start with a number. Updated the validation for executionRole field to support any role name.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for analyzing Amazon S3 objects that use the S3 Glacier Instant Retrieval (Glacier_IR) storage class.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables adding RStudio Workbench support to an existing Amazon SageMaker Studio domain. It allows setting your RStudio on SageMaker environment configuration parameters and also updating the RStudioConnectUrl and RStudioPackageManagerUrl parameters for existing domains

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Doc-only updates for December 2022.

# __1.12.369__ __2022-12-20__
## __AWS Batch__
  - ### Features
    - Adds isCancelled and isTerminated to DescribeJobs response.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for two new features to AWS Elemental MediaLive. First, you can now burn-in timecodes to your MediaLive outputs. Second, we now now support the ability to decode Dolby E audio when it comes in on an input.

## __AWS Resource Explorer__
  - ### Features
    - Documentation updates for AWS Resource Explorer.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for pagination in the EC2 DescribeImages API.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds support for listing inference schedulers by status.

## __Amazon Route 53 Domains__
  - ### Features
    - Use Route 53 domain APIs to change owner, create/delete DS record, modify IPS tag, resend authorization. New: AssociateDelegationSignerToDomain, DisassociateDelegationSignerFromDomain, PushDomain, ResendOperationAuthorization. Updated: UpdateDomainContact, ListOperations, CheckDomainTransferability.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds support for new objective metrics in CreateAutoMLJob API.

## __Amazon Transcribe Service__
  - ### Features
    - Enable our batch transcription jobs for Swedish and Vietnamese.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio now supports configuring session storage volumes and persistence, as well as backup and restore sessions through launch profiles.

# __1.12.368__ __2022-12-19__
## __Amazon Athena__
  - ### Features
    - Add missed InvalidRequestException in GetCalculationExecutionCode,StopCalculationExecution APIs. Correct required parameters (Payload and Type) in UpdateNotebook API. Change Notebook size from 15 Mb to 10 Mb.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for alarm-based rollbacks in ECS, a new feature that allows customers to add automated safeguards for Amazon ECS service rolling updates.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Amazon Kinesis Video Streams offers capabilities to stream video and audio in real-time via WebRTC to the cloud for storage, playback, and analytical processing. Customers can use our enhanced WebRTC SDK and cloud APIs to enable real-time streaming, as well as media ingestion to the cloud.

## __Amazon Kinesis Video WebRTC Storage__
  - ### Features
    - Amazon Kinesis Video Streams offers capabilities to stream video and audio in real-time via WebRTC to the cloud for storage, playback, and analytical processing. Customers can use our enhanced WebRTC SDK and cloud APIs to enable real-time streaming, as well as media ingestion to the cloud.

## __Amazon Relational Database Service__
  - ### Features
    - Add support for --enable-customer-owned-ip to RDS create-db-instance-read-replica API for RDS on Outposts.

## __Amazon SageMaker Service__
  - ### Features
    - AWS Sagemaker - Sagemaker Images now supports Aliases as secondary identifiers for ImageVersions. SageMaker Images now supports additional metadata for ImageVersions for better images management.

# __1.12.367__ __2022-12-16__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports the use of tags with task executions. With this new feature, you can apply tags each time you execute a task, giving you greater control and management over your task executions.

## __AWS IoT FleetWise__
  - ### Features
    - Updated error handling for empty resource names in "UpdateSignalCatalog" and "GetModelManifest" operations.

## __Amazon Appflow__
  - ### Features
    - This release updates the ListConnectorEntities API action so that it returns paginated responses that customers can retrieve with next tokens.

## __Amazon CloudFront__
  - ### Features
    - Updated documentation for CloudFront

## __Amazon Elastic File System__
  - ### Features
    - General documentation updates for EFS.

## __Amazon GuardDuty__
  - ### Features
    - This release provides the valid characters for the Description and Name field.

## __Amazon SageMaker Service__
  - ### Features
    - AWS sagemaker - Features: This release adds support for random seed, it's an integer value used to initialize a pseudo-random number generator. Setting a random seed will allow the hyperparameter tuning search strategies to produce more consistent configurations for the same tuning job.

# __1.12.366__ __2022-12-15__
## __AWS Backup Gateway__
  - ### Features
    - This release adds support for VMware vSphere tags, enabling customer to protect VMware virtual machines using tag-based policies for AWS tags mapped from vSphere tags. This release also adds support for customer-accessible gateway-hypervisor interaction log and upload bandwidth rate limit schedule.

## __AWS Glue__
  - ### Features
    - This release adds support for AWS Glue Crawler with native DeltaLake tables, allowing Crawlers to classify Delta Lake format tables and catalog them for query engines to query against.

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for AwsEc2LaunchTemplate, AwsSageMakerNotebookInstance, AwsWafv2WebAcl and AwsWafv2RuleGroup.

## __AWSMainframeModernization__
  - ### Features
    - Adds an optional create-only `KmsKeyId` property to Environment and Application resources.

## __Amazon Connect Service__
  - ### Features
    - Added support for "English - New Zealand" and "English - South African" to be used with Amazon Connect Custom Vocabulary APIs.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for container port ranges in ECS, a new capability that allows customers to provide container port ranges to simplify use cases where multiple ports are in use in a container. This release updates TaskDefinition mutation APIs and the Task description APIs.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Add support for Windows managed nodes groups.

## __Amazon Kinesis__
  - ### Features
    - Added StreamARN parameter for Kinesis Data Streams APIs. Added a new opaque pagination token for ListStreams. SDKs will auto-generate Account Endpoint when accessing Kinesis Data Streams.

## __Amazon Location Service__
  - ### Features
    - This release adds support for a new style, "VectorOpenDataStandardLight" which can be used with the new data source, "Open Data Maps (Preview)".

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now allows customers to load tests their models on various instance types using private VPC.

## __Amazon Translate__
  - ### Features
    - Raised the input byte size limit of the Text field in the TranslateText API to 10000 bytes.

# __1.12.365__ __2022-12-14__
## __AWS Cost Explorer Service__
  - ### Features
    - This release supports percentage-based thresholds on Cost Anomaly Detection alert subscriptions.

## __AWS Network Manager__
  - ### Features
    - Appliance Mode support for AWS Cloud WAN.

## __Amazon CloudWatch__
  - ### Features
    - Adding support for Metrics Insights Alarms

## __Amazon SageMaker Metrics Service__
  - ### Features
    - Update SageMaker Metrics documentation.

## __Redshift Data API Service__
  - ### Features
    - This release adds a new --client-token field to ExecuteStatement and BatchExecuteStatement operations. Customers can now run queries with the additional client token parameter to ensures idempotency.

# __1.12.364__ __2022-12-13__
## __AWS CloudTrail__
  - ### Features
    - Merging mainline branch for service model into mainline release branch. There are no new APIs.

## __Amazon Relational Database Service__
  - ### Features
    - This deployment adds ClientPasswordAuthType field to the Auth structure of the DBProxy.

# __1.12.363__ __2022-12-12__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This release adds support for Lambda alias service endpoints. Lambda alias ARNs can now be passed into CreateService.

## __AWS WAFV2__
  - ### Features
    - Documents the naming requirement for logging destinations that you use with web ACLs.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release allows custom strings in PartyType and Gender through 2 new attributes in the CreateProfile and UpdateProfile APIs: PartyTypeString and GenderString.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release updates DescribeFpgaImages to show supported instance types of AFIs in its response.

## __Amazon Kinesis Video Streams__
  - ### Features
    - This release adds support for public preview of Kinesis Video Stream at Edge enabling customers to provide configuration for the Kinesis Video Stream EdgeAgent running on an on-premise IoT device. Customers can now locally record from cameras and stream videos to the cloud on configured schedule.

## __Amazon Lookout for Vision__
  - ### Features
    - This documentation update adds kms:GenerateDataKey as a required permission to StartModelPackagingJob.

## __Amazon Rekognition__
  - ### Features
    - Adds support for "aliases" and "categories", inclusion and exclusion filters for labels and label categories, and aggregating labels by video segment timestamps for Stored Video Label Detection APIs.

## __Amazon Relational Database Service__
  - ### Features
    - Update the RDS API model to support copying option groups during the CopyDBSnapshot operation

## __Amazon SageMaker Metrics Service__
  - ### Features
    - This release introduces support SageMaker Metrics APIs.

# __1.12.362__ __2022-12-09__
## __AWS Elemental MediaLive__
  - ### Features
    - Link devices now support buffer size (latency) configuration. A higher latency value means a longer delay in transmitting from the device to MediaLive, but improved resiliency. A lower latency value means a shorter delay, but less resiliency.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - This release provides the approximate number of assets in a packaging group.

## __AWS IoT FleetWise__
  - ### Features
    - Deprecated assignedValue property for actuators and attributes.  Added a message to invalid nodes and invalid decoder manifest exceptions.

## __Amazon CloudWatch Logs__
  - ### Features
    - Doc-only update for CloudWatch Logs, for Tagging Permissions clarifications

# __1.12.361__ __2022-12-08__
## __AWS IoT TwinMaker__
  - ### Features
    - This release adds the following new features: 1) New APIs for managing a continuous sync of assets and asset models from AWS IoT SiteWise. 2) Support user friendly names for component types (ComponentTypeName) and properties (DisplayName).

## __Auto Scaling__
  - ### Features
    - Adds support for metric math for target tracking scaling policies, saving you the cost and effort of publishing a custom metric to CloudWatch. Also adds support for VPC Lattice by adding the Attach/Detach/DescribeTrafficSources APIs and a new health check type to the CreateAutoScalingGroup API.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - This release adds known application filtering, server selection for assessments, support for potential recommendations, and indications for configuration and assessment status. For more information, see the AWS Migration Hub documentation at https://docs.aws.amazon.com/migrationhub/index.html

# __1.12.360__ __2022-12-07__
## __AWS Cost Explorer Service__
  - ### Features
    - This release adds the LinkedAccountName field to the GetAnomalies API response under RootCause

## __AWS Key Management Service__
  - ### Features
    - Updated examples and exceptions for External Key Store (XKS).

## __Amazon CloudFront__
  - ### Features
    - Introducing UpdateDistributionWithStagingConfig that can be used to promote the staging configuration to the production.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons configurationValues fields and DescribeAddonConfiguration function

# __1.12.359__ __2022-12-06__
## __AWSBillingConductor__
  - ### Features
    - This release adds the Tiering Pricing Rule feature.

## __Amazon Connect Service__
  - ### Features
    - This release provides APIs that enable you to programmatically manage rules for Contact Lens conversational analytics and third party applications. For more information, see   https://docs.aws.amazon.com/connect/latest/APIReference/rules-api.html

## __Amazon DynamoDB__
  - ### Features
    - Endpoint Ruleset update: Use http instead of https for the "local" region.

## __Amazon DynamoDB Streams__
  - ### Features
    - Endpoint Ruleset update: Use http instead of https for the "local" region.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the BlueGreenDeploymentNotFoundFault to the AddTagsToResource, ListTagsForResource, and RemoveTagsFromResource operations.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - For online + offline Feature Groups, added ability to target PutRecord and DeleteRecord actions to only online store, or only offline store. If target store parameter is not specified, actions will apply to both stores.

# __1.12.358__ __2022-12-05__
## __AWS Cost Explorer Service__
  - ### Features
    - This release introduces two new APIs that offer a 1-click experience to refresh Savings Plans recommendations. The two APIs are StartSavingsPlansPurchaseRecommendationGeneration and ListSavingsPlansPurchaseRecommendationGeneration.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Adds PendingVerification error type to messaging APIs to block the resource usage for accounts identified as being fraudulent.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the InvalidDBInstanceStateFault to the RestoreDBClusterFromSnapshot operation.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports creating custom language models in the following languages: Japanese (ja-JP) and German (de-DE).

# __1.12.357__ __2022-12-02__
## __AWS AppSync__
  - ### Features
    - Fixes the URI for the evaluatecode endpoint to include the /v1 prefix (ie. "/v1/dataplane-evaluatecode").

## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has added support for configurable ID3 eMSG box attributes and the ability to signal them with InbandEventStream tags in DASH and CMAF outputs.

## __AWS Elemental MediaLive__
  - ### Features
    - Updates to Event Signaling and Management (ESAM) API and documentation.

## __AWS Proton__
  - ### Features
    - CreateEnvironmentAccountConnection RoleArn input is now optional

## __AWS Step Functions__
  - ### Features
    - This release adds support for the AWS Step Functions Map state in Distributed mode. The changes include a new MapRun resource and several new and modified APIs.

## __Amazon CodeCatalyst__
  - ### Features
    - This release adds operations that support customers using the AWS Toolkits and Amazon CodeCatalyst, a unified software development service that helps developers develop, deploy, and maintain applications in the cloud. For more information, see the documentation.

## __Amazon Comprehend__
  - ### Features
    - Comprehend now supports semi-structured documents (such as PDF files or image files) as inputs for custom analysis using the synchronous APIs (ClassifyDocument and DetectEntities).

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for Amazon ECS

## __Amazon EventBridge Pipes__
  - ### Features
    - AWS introduces new Amazon EventBridge Pipes which allow you to connect sources (SQS, Kinesis, DDB, Kafka, MQ) to Targets (14+ EventBridge Targets) without any code, with filtering, batching, input transformation, and an optional Enrichment stage (Lambda, StepFunctions, ApiGateway, ApiDestinations)

## __Amazon GameLift__
  - ### Features
    - GameLift introduces a new feature, GameLift Anywhere. GameLift Anywhere allows you to integrate your own compute resources with GameLift. You can also use GameLift Anywhere to iteratively test your game servers without uploading the build to GameLift for every iteration.

## __Amazon Polly__
  - ### Features
    - Add language code for Finnish (fi-FI)

## __Amazon Simple Notification Service__
  - ### Features
    - This release adds the message payload-filtering feature to the SNS Subscribe, SetSubscriptionAttributes, and GetSubscriptionAttributes API actions

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports Fortigate Cloud Native Firewall as a Service as a third-party policy type.

## __Redshift Serverless__
  - ### Features
    - Add Table Level Restore operations for Amazon Redshift Serverless. Add multi-port support for Amazon Redshift Serverless endpoints. Add Tagging support to Snapshots and Recovery Points in Amazon Redshift Serverless.

# __1.12.355__ __2022-12-01__
## __AWS Step Functions__
  - ### Features
    - This release adds support for the AWS Step Functions Map state in Distributed mode. The changes include a new MapRun resource and several new and modified APIs.

## __Amazon CodeCatalyst__
  - ### Features
    - This release adds operations that support customers using the AWS Toolkits and Amazon CodeCatalyst, a unified software development service that helps developers develop, deploy, and maintain applications in the cloud. For more information, see the documentation.

## __Amazon Comprehend__
  - ### Features
    - Comprehend now supports semi-structured documents (such as PDF files or image files) as inputs for custom analysis using the synchronous APIs (ClassifyDocument and DetectEntities).

## __Amazon EventBridge Pipes__
  - ### Features
    - AWS introduces new Amazon EventBridge Pipes which allow you to connect sources (SQS, Kinesis, DDB, Kafka, MQ) to Targets (14+ EventBridge Targets) without any code, with filtering, batching, input transformation, and an optional Enrichment stage (Lambda, StepFunctions, ApiGateway, ApiDestinations)

## __Amazon GameLift__
  - ### Features
    - GameLift introduces a new feature, GameLift Anywhere. GameLift Anywhere allows you to integrate your own compute resources with GameLift. You can also use GameLift Anywhere to iteratively test your game servers without uploading the build to GameLift for every iteration.

# __1.12.354__ __2022-12-01__
## __AWS Step Functions__
  - ### Features
    - This release adds support for the AWS Step Functions Map state in Distributed mode. The changes include a new MapRun resource and several new and modified APIs.

## __Amazon CodeCatalyst__
  - ### Features
    - This release adds operations that support customers using the AWS Toolkits and Amazon CodeCatalyst, a unified software development service that helps developers develop, deploy, and maintain applications in the cloud. For more information, see the documentation.

## __Amazon Comprehend__
  - ### Features
    - Comprehend now supports semi-structured documents (such as PDF files or image files) as inputs for custom analysis using the synchronous APIs (ClassifyDocument and DetectEntities).

## __Amazon EventBridge Pipes__
  - ### Features
    - AWS introduces new Amazon EventBridge Pipes which allow you to connect sources (SQS, Kinesis, DDB, Kafka, MQ) to Targets (14+ EventBridge Targets) without any code, with filtering, batching, input transformation, and an optional Enrichment stage (Lambda, StepFunctions, ApiGateway, ApiDestinations)

## __Amazon GameLift__
  - ### Features
    - GameLift introduces a new feature, GameLift Anywhere. GameLift Anywhere allows you to integrate your own compute resources with GameLift. You can also use GameLift Anywhere to iteratively test your game servers without uploading the build to GameLift for every iteration.

# __1.12.353__ __2022-11-30__
## __AWS Data Exchange__
  - ### Features
    - This release enables data providers to license direct access to data in their Amazon S3 buckets or AWS Lake Formation data lakes through AWS Data Exchange. Subscribers get read-only access to the data and can use it in downstream AWS services, like Amazon Athena, without creating or managing copies.

## __AWS Glue__
  - ### Features
    - This release adds support for AWS Glue Data Quality, which helps you evaluate and monitor the quality of your data and includes the API for creating, deleting, or updating data quality rulesets, runs and evaluations.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 now supports cross-account access points. S3 bucket owners can now allow trusted AWS accounts to create access points associated with their bucket.

## __Access Analyzer__
  - ### Features
    - This release adds support for S3 cross account access points. IAM Access Analyzer will now produce public or cross account findings when it detects bucket delegation to external account access points.

## __Amazon Athena__
  - ### Features
    - This release includes support for using Apache Spark in Amazon Athena.

## __Amazon DocumentDB Elastic Clusters__
  - ### Features
    - Launched Amazon DocumentDB Elastic Clusters. You can now use the SDK to create, list, update and delete Amazon DocumentDB Elastic Cluster resources

## __Amazon SageMaker Service__
  - ### Features
    - Added Models as part of the Search API. Added Model shadow deployments in realtime inference, and shadow testing in managed inference. Added support for shared spaces, geospatial APIs, Model Cards, AutoMLJobStep in pipelines, Git repositories on user profiles and domains, Model sharing in Jumpstart.

## __Amazon SageMaker geospatial capabilities__
  - ### Features
    - This release provides Amazon SageMaker geospatial APIs to build, train, deploy and visualize geospatial models.

# __1.12.352__ __2022-11-29__
## __AWS Key Management Service__
  - ### Features
    - AWS KMS introduces the External Key Store (XKS), a new feature for customers who want to protect their data with encryption keys stored in an external key management system under their control.

## __AWS SimSpace Weaver__
  - ### Features
    - AWS SimSpace Weaver is a new service that helps customers build spatial simulations at new levels of scale - resulting in virtual worlds with millions of dynamic entities. See the AWS SimSpace Weaver developer guide for more details on how to get started. https://docs.aws.amazon.com/simspaceweaver

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for AWS Verified Access and the Hpc6id Amazon EC2 compute optimized instance type, which features 3rd generation Intel Xeon Scalable processors.

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for the Serverless offering for Amazon OpenSearch Service as a Kinesis Data Firehose delivery destination.

## __Amazon Omics__
  - ### Features
    - Amazon Omics is a new, purpose-built service that can be used by healthcare and life science organizations to store, query, and analyze omics data. The insights from that data can be used to accelerate scientific discoveries and improve healthcare.

## __Amazon Security Lake__
  - ### Features
    - Amazon Security Lake automatically centralizes security data from cloud, on-premises, and custom sources into a purpose-built data lake stored in your account. Security Lake makes it easier to analyze security data, so you can improve the protection of your workloads, applications, and data

## __OpenSearch Service Serverless__
  - ### Features
    - Publish SDK for Amazon OpenSearch Serverless

# __1.12.351__ __2022-11-28__
## __AWS ARC - Zonal Shift__
  - ### Features
    - Amazon Route 53 Application Recovery Controller Zonal Shift is a new service that makes it easy to shift traffic away from an Availability Zone in a Region. See the developer guide for more information: https://docs.aws.amazon.com/r53recovery/latest/dg/what-is-route53-recovery.html

## __AWS Compute Optimizer__
  - ### Features
    - Adds support for a new recommendation preference that makes it possible for customers to optimize their EC2 recommendations by utilizing an external metrics ingestion service to provide metrics.

## __AWS Config__
  - ### Features
    - With this release, you can use AWS Config to evaluate your resources for compliance with Config rules before they are created or updated. Using Config rules in proactive mode enables you to test and build compliant resource templates or check resource configurations at the time they are provisioned.

## __AWS Glue__
  - ### Features
    - This release allows the creation of Custom Visual Transforms (Dynamic Transforms) to be created via AWS Glue CLI/SDK.

## __AWS Lambda__
  - ### Features
    - Adds support for Lambda SnapStart, which helps improve the startup performance of functions. Customers can now manage SnapStart based functions via CreateFunction and UpdateFunctionConfiguration APIs

## __AWS License Manager User Subscriptions__
  - ### Features
    - AWS now offers fully-compliant, Amazon-provided licenses for Microsoft Office Professional Plus 2021 Amazon Machine Images (AMIs) on Amazon EC2. These AMIs are now available on the Amazon EC2 console and on AWS Marketplace to launch instances on-demand without any long-term licensing commitments.

## __AWS S3 Control__
  - ### Features
    - Added two new APIs to support Amazon S3 Multi-Region Access Point failover controls: GetMultiRegionAccessPointRoutes and SubmitMultiRegionAccessPointRoutes. The failover control APIs are supported in the following Regions: us-east-1, us-west-2, eu-west-1, ap-southeast-2, and ap-northeast-1.

## __AWS SecurityHub__
  - ### Features
    - Adding StandardsManagedBy field to DescribeStandards API response

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Introduces ENA Express, which uses AWS SRD and dynamic routing to increase throughput and minimize latency, adds support for trust relationships between Reachability Analyzer and AWS Organizations to enable cross-account analysis, and adds support for Infrastructure Performance metric subscriptions.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for additional EKS add-ons metadata and filtering fields

## __Amazon FSx__
  - ### Features
    - This release adds support for 4GB/s / 160K PIOPS FSx for ONTAP file systems and 10GB/s / 350K PIOPS FSx for OpenZFS file systems (Single_AZ_2). For FSx for ONTAP, this also adds support for DP volumes, snapshot policy, copy tags to backups, and Multi-AZ route table updates.

## __Amazon Macie 2__
  - ### Features
    - Added support for configuring Macie to continually sample objects from S3 buckets and inspect them for sensitive data. Results appear in statistics, findings, and other data that Macie provides.

## __Amazon QuickSight__
  - ### Features
    - This release adds new Describe APIs and updates Create and Update APIs to support the data model for Dashboards, Analyses, and Templates.

## __Inspector2__
  - ### Features
    - This release adds support for Inspector to scan AWS Lambda.

# __1.12.350__ __2022-11-27__
## __AWS Backup__
  - ### Features
    - AWS Backup introduces support for legal hold and application stack backups. AWS Backup Audit Manager introduces support for cross-Region, cross-account reports.

## __AWS IoT__
  - ### Features
    - Job scheduling enables the scheduled rollout of a Job with start and end times and a customizable end behavior when end time is reached. This is available for continuous and snapshot jobs. Added support for MQTT5 properties to AWS IoT TopicRule Republish Action.

## __AWS IoT Data Plane__
  - ### Features
    - This release adds support for MQTT5 properties to AWS IoT HTTP Publish API.

## __AWS IoT Wireless__
  - ### Features
    - This release includes a new feature for customers to calculate the position of their devices by adding three new APIs: UpdateResourcePosition, GetResourcePosition, and GetPositionEstimate.

## __AWS Organizations__
  - ### Features
    - This release introduces delegated administrator for AWS Organizations, a new feature to help you delegate the management of your Organizations policies, enabling you to govern your AWS organization in a decentralized way. You can now allow member accounts to manage Organizations policies.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports preview of table information from HTML tables in the search results. The most relevant cells with their corresponding rows, columns are displayed as a preview in the search result. The most relevant table cell or cells are also highlighted in table preview.

## __Amazon CloudWatch__
  - ### Features
    - Adds cross-account support to the GetMetricData API. Adds cross-account support to the ListMetrics API through the usage of the IncludeLinkedAccounts flag and the new OwningAccounts field.

## __Amazon CloudWatch Logs__
  - ### Features
    - Updates to support CloudWatch Logs data protection and CloudWatch cross-account observability

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for ECS Service Connect, a new capability that simplifies writing and operating resilient distributed applications. This release updates the TaskDefinition, Cluster, Service mutation APIs with Service connect constructs and also adds a new ListServicesByNamespace API.

## __Amazon Elastic File System__
  - ### Features
    - This release adds elastic as a new ThroughputMode value for EFS file systems and adds AFTER_1_DAY as a value for TransitionToIARules.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables new Aurora and RDS feature called Blue/Green Deployments that makes updates to databases safer, simpler and faster.

## __Amazon Textract__
  - ### Features
    - This release adds support for classifying and splitting lending documents by type, and extracting information by using the Analyze Lending APIs. This release also includes support for summarized information of the processed lending document package, in addition to per document results.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for 'inputType' for post-call and real-time (streaming) Call Analytics within Amazon Transcribe.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds support for real-time (streaming) and post-call Call Analytics within Amazon Transcribe.

## __Application Migration Service__
  - ### Features
    - This release adds support for Application and Wave management. We also now support custom post-launch actions.

## __CloudWatch Observability Access Manager__
  - ### Features
    - Amazon CloudWatch Observability Access Manager is a new service that allows configuration of the CloudWatch cross-account observability feature.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Non breaking changes to existing APIs, and additional APIs added to support in-AWS failing back using AWS Elastic Disaster Recovery.

# __1.12.349__ __2022-11-23__
## __Amazon Managed Grafana__
  - ### Features
    - This release includes support for configuring a Grafana workspace to connect to a datasource within a VPC as well as new APIs for configuring Grafana settings.

## __Amazon Recycle Bin__
  - ### Features
    - This release adds support for Rule Lock for Recycle Bin, which allows you to lock retention rules so that they can no longer be modified or deleted.

# __1.12.348__ __2022-11-22__
## __Amazon Appflow__
  - ### Features
    - Adding support for Amazon AppFlow to transfer the data to Amazon Redshift databases through Amazon Redshift Data API service. This feature will support the Redshift destination connector on both public and private accessible Amazon Redshift Clusters and Amazon Redshift Serverless.

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Apache Flink 1.15 in Kinesis Data Analytics.

# __1.12.347__ __2022-11-21__
## __AWS SDK for Java__
  - ### Features
    - Adding support for ap-south-2 that is AP_Hyderabad region.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Asia Pacific (Hyderabad) Region (ap-south-2) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

# __1.12.346__ __2022-11-18__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Evidence finder. You can now use evidence finder to quickly query your evidence, and add the matching evidence results to an assessment report.

## __AWS Glue__
  - ### Features
    - AWSGlue Crawler - Adding support for Table and Column level Comments with database level datatypes for JDBC based crawler.

## __AWS IoT RoboRunner__
  - ### Features
    - AWS IoT RoboRunner is a new service that makes it easy to build applications that help multi-vendor robots work together seamlessly. See the IoT RoboRunner developer guide for more details on getting started. https://docs.aws.amazon.com/iotroborunner/latest/dev/iotroborunner-welcome.html

## __AWS Service Catalog__
  - ### Features
    - This release 1. adds support for Principal Name Sharing with Service Catalog portfolio sharing. 2. Introduces repo sourced products which are created and managed with existing SC APIs. These products are synced to external repos and auto create new product versions based on changes in the repo.

## __AWS Step Functions__
  - ### Features
    - This release adds support for using Step Functions service integrations to invoke any cross-account AWS resource, even if that service doesn't support resource-based policies or cross-account calls. See https://docs.aws.amazon.com/step-functions/latest/dg/concepts-access-cross-acct-resources.html

## __AWS Systems Manager for SAP__
  - ### Features
    - AWS Systems Manager for SAP provides simplified operations and management of SAP applications such as SAP HANA. With this release, SAP customers and partners can automate and simplify their SAP system administration tasks such as backup/restore of SAP HANA.

## __AWS Transfer Family__
  - ### Features
    - Adds a NONE encryption algorithm type to AS2 connectors, providing support for skipping encryption of the AS2 message body when a HTTPS URL is also specified.

## __Amazon Appflow__
  - ### Features
    - AppFlow provides a new API called UpdateConnectorRegistration to update a custom connector that customers have previously registered. With this API, customers no longer need to unregister and then register a connector to make an update.

## __Amazon Chime SDK Voice__
  - ### Features
    - Amazon Chime Voice Connector, Voice Connector Group and PSTN Audio Service APIs are now available in the Amazon Chime SDK Voice namespace. See https://docs.aws.amazon.com/chime-sdk/latest/dg/sdk-available-regions.html for more details.

## __Amazon CloudFront__
  - ### Features
    - CloudFront API support for staging distributions and associated traffic management policies.

## __Amazon Connect Service__
  - ### Features
    - Added AllowedAccessControlTags and TagRestrictedResource for Tag Based Access Control on Amazon Connect Webpage

## __Amazon DynamoDB__
  - ### Features
    - Updated minor fixes for DynamoDB documentation.

## __Amazon DynamoDB Streams__
  - ### Features
    - Updated minor fixes for DynamoDB documentation.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for copying an Amazon Machine Image's tags when copying an AMI.

## __Amazon QuickSight__
  - ### Features
    - This release adds the following: 1) Asset management for centralized assets governance 2) QuickSight Q now supports public embedding 3) New Termination protection flag to mitigate accidental deletes 4) Athena data sources now accept a custom IAM role 5) QuickSight supports connectivity to Databricks

## __Amazon SageMaker Service__
  - ### Features
    - Added DisableProfiler flag as a new field in ProfilerConfig

# __1.12.345__ __2022-11-17__
## __AWS Amplify__
  - ### Features
    - Adds a new value (WEB_COMPUTE) to the Platform enum that allows customers to create Amplify Apps with Server-Side Rendering support.

## __AWS AppSync__
  - ### Features
    - This release introduces the APPSYNC_JS runtime, and adds support for JavaScript in AppSync functions and AppSync pipeline resolvers.

## __AWS Database Migration Service__
  - ### Features
    - Adds support for Internet Protocol Version 6 (IPv6) on DMS Replication Instances

## __AWS Lambda__
  - ### Features
    - Add Node 18 (nodejs18.x) support to AWS Lambda.

## __AWS S3 Control__
  - ### Features
    - Added 34 new S3 Storage Lens metrics to support additional customer use cases.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS SecurityHub__
  - ### Features
    - Added SourceLayerArn and SourceLayerHash field for security findings.  Updated AwsLambdaFunction Resource detail

## __AWS Service Catalog App Registry__
  - ### Features
    - This release adds support for tagged resource associations, which allows you to associate a group of resources with a defined resource tag key and value to the application.

## __Amazon Appflow__
  - ### Features
    - AppFlow simplifies the preparation and cataloging of SaaS data into the AWS Glue Data Catalog where your data can be discovered and accessed by AWS analytics and ML services. AppFlow now also supports data field partitioning and file size optimization to improve query performance and reduce cost.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new optional parameter "privateIpAddress" for the CreateNatGateway API. PrivateIPAddress will allow customers to select a custom Private IPv4 address instead of having it be auto-assigned.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Adds LoggingConfiguration APIs for IVS Chat - a feature that allows customers to store and record sent messages in a chat room to S3 buckets, CloudWatch logs, or Kinesis firehose.

## __Amazon Personalize__
  - ### Features
    - This release provides support for creation and use of metric attributions in AWS Personalize

## __Amazon Polly__
  - ### Features
    - Add two new neural voices - Ola (pl-PL) and Hala (ar-AE).

## __Amazon Textract__
  - ### Features
    - This release adds support for specifying and extracting information from documents using the Signatures feature within Analyze Document API

## __Amazon WorkSpaces__
  - ### Features
    - The release introduces CreateStandbyWorkspaces, an API that allows you to create standby WorkSpaces associated with a primary WorkSpace in another Region. DescribeWorkspaces now includes related WorkSpaces properties. DescribeWorkspaceBundles and CreateWorkspaceBundle now return more bundle details.

## __CloudWatch RUM__
  - ### Features
    - CloudWatch RUM now supports custom events. To use custom events, create an app monitor or update an app monitor with CustomEvent Status as ENABLED.

## __EMR Serverless__
  - ### Features
    - Adds support for AWS Graviton2 based applications. You can now select CPU architecture when creating new applications or updating existing ones.

## __Elastic Load Balancing__
  - ### Features
    - Provides new target group attributes to turn on/off cross zone load balancing and configure target group health for Network Load Balancers and Application Load Balancers. Provides improvements to health check configuration for Network Load Balancers.

# __1.12.344__ __2022-11-16__
## __AWS Batch__
  - ### Features
    - Documentation updates related to Batch on EKS

## __AWS CloudFormation__
  - ### Features
    - Added UnsupportedTarget HandlerErrorCode for use with CFN Resource Hooks

## __AWS Comprehend Medical__
  - ### Features
    - This release supports new set of entities and traits. It also adds new category (BEHAVIORAL_ENVIRONMENTAL_SOCIAL).

## __AWS IoT TwinMaker__
  - ### Features
    - This release adds the following: 1) ExecuteQuery API allows users to query their AWS IoT TwinMaker Knowledge Graph 2) Pricing plan APIs allow users to configure and manage their pricing mode 3) Support for property groups and tabular property values in existing AWS IoT TwinMaker APIs.

## __AWS Proton__
  - ### Features
    - Add support for sorting and filtering in ListServiceInstances

## __AWS SDK for Java__
  - ### Features
    - Adding support for eu-south-2 that is EU_Spain region

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Add support for PagerDuty integrations on ResponsePlan, IncidentRecord, and RelatedItem APIs

## __AWS Transfer Family__
  - ### Features
    - Allow additional operations to throw ThrottlingException

## __AWS X-Ray__
  - ### Features
    - This release adds new APIs - PutResourcePolicy, DeleteResourcePolicy, ListResourcePolicies for supporting resource based policies for AWS X-Ray.

## __AWSBillingConductor__
  - ### Features
    - This release adds a new feature BillingEntity pricing rule.

## __Amazon Connect Service__
  - ### Features
    - This release adds a new MonitorContact API for initiating monitoring of ongoing Voice and Chat contacts.

## __Amazon ElastiCache__
  - ### Features
    - for Redis now supports AWS Identity and Access Management authentication access to Redis clusters starting with redis-engine version 7.0

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for customer-provided placement groups for Kubernetes control plane instances when creating local EKS clusters on Outposts

## __Amazon Personalize Events__
  - ### Features
    - This release provides support for creation and use of metric attributions in AWS Personalize

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for container databases (CDBs) to Amazon RDS Custom for Oracle. A CDB contains one PDB at creation. You can add more PDBs using Oracle SQL. You can also customize your database installation by setting the Oracle base, Oracle home, and the OS user name and group.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds support for cross account access in CreateOpsItem, UpdateOpsItem and GetOpsItem. It introduces new APIs to setup resource policies for SSM resources: PutResourcePolicy, GetResourcePolicies and DeleteResourcePolicy.

# __1.12.343__ __2022-11-15__
## __AWS IoT Greengrass V2__
  - ### Features
    - Adds new parent target ARN paramater to CreateDeployment, GetDeployment, and ListDeployments APIs for the new subdeployments feature.

## __AWS Systems Manager for SAP__
  - ### Features
    - AWS Systems Manager for SAP provides simplified operations and management of SAP applications such as SAP HANA. With this release, SAP customers and partners can automate and simplify their SAP system administration tasks such as backup/restore of SAP HANA.

## __Amazon Connect Service__
  - ### Features
    - This release updates the APIs: UpdateInstanceAttribute, DescribeInstanceAttribute, and ListInstanceAttributes. You can use it to programmatically enable/disable enhanced contact monitoring using attribute type ENHANCED_CONTACT_MONITORING on the specified Amazon Connect instance.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Europe (Spain) Region (eu-south-2) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon WorkSpaces__
  - ### Features
    - This release introduces ModifyCertificateBasedAuthProperties, a new API that allows control of certificate-based auth properties associated with a WorkSpaces directory. The DescribeWorkspaceDirectories API will now additionally return certificate-based auth properties in its responses.

# __1.12.342__ __2022-11-14__
## __AWS Lake Formation__
  - ### Features
    - This release adds a new parameter "Parameters" in the DataLakeSettings.

## __AWS Proton__
  - ### Features
    - Add support for CodeBuild Provisioning

## __AWS X-Ray__
  - ### Features
    - This release enhances GetServiceGraph API to support new type of edge to represent links between SQS and Lambda in event-driven applications.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release enhances the SearchProfiles API by providing functionality to search for profiles using multiple keys and logical operators.

## __Amazon Managed Blockchain__
  - ### Features
    - Updating the API docs data type: NetworkEthereumAttributes, and the operations DeleteNode, and CreateNode to also include the supported Goerli network.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for restoring an RDS Multi-AZ DB cluster snapshot to a Single-AZ deployment or a Multi-AZ DB instance deployment.

## __Amazon WorkDocs__
  - ### Features
    - Added 2 new document related operations, DeleteDocumentVersion and RestoreDocumentVersions.

# __1.12.341__ __2022-11-11__
## __AWS Glue__
  - ### Features
    - Added links related to enabling job bookmarks.

## __AWS IoT__
  - ### Features
    - This release add new api listRelatedResourcesForAuditFinding and new member type IssuerCertificates for Iot device device defender Audit.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now supports onboarded Management Accounts or Delegated Admins to view granted licenses aggregated from all accounts in the organization.

## __AWS Marketplace Catalog Service__
  - ### Features
    - Added three new APIs to support tagging and tag-based authorization: TagResource, UntagResource, and ListTagsForResource. Added optional parameters to the StartChangeSet API to support tagging a resource while making a request to create it.

## __AWS SDK for Java__
  - ### Features
    - Adding region eu-central-2 (ZRH) to message manager
    - Adding support for eu-central-2 that is EU_Zurich region

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for Security Hub

## __AWS Systems Manager Incident Manager__
  - ### Features
    - RelatedItems now have an ID field which can be used for referencing them else where. Introducing event references in TimelineEvent API and increasing maximum length of "eventData" to 12K characters.

## __Amazon Rekognition__
  - ### Features
    - Adding support for ImageProperties feature to detect dominant colors and image brightness, sharpness, and contrast, inclusion and exclusion filters for labels and label categories, new fields to the API response, "aliases" and "categories"

# __1.12.340__ __2022-11-10__
## __AWS Resource Explorer__
  - ### Features
    - Text only updates to some Resource Explorer descriptions.

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for task scale-in protection with updateTaskProtection and getTaskProtection APIs. UpdateTaskProtection API can be used to protect a service managed task from being terminated by scale-in events and getTaskProtection API to get the scale-in protection status of a task.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new price capacity optimized allocation strategy for Spot Instances to help customers optimize provisioning of Spot Instances via EC2 Auto Scaling, EC2 Fleet, and Spot Fleet. It allocates Spot Instances based on both spare capacity availability and Spot Instance price.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon OpenSearch Service now offers managed VPC endpoints to connect to your Amazon OpenSearch Service VPC-enabled domain in a Virtual Private Cloud (VPC). This feature allows you to privately access OpenSearch Service domain without using public IPs or requiring traffic to traverse the Internet.

## __Amazon EventBridge Scheduler__
  - ### Features
    - AWS introduces the new Amazon EventBridge Scheduler. EventBridge Scheduler is a serverless scheduler that allows you to create, run, and manage tasks from one central, managed service.

## __Auto Scaling__
  - ### Features
    - This release adds a new price capacity optimized allocation strategy for Spot Instances to help customers optimize provisioning of Spot Instances via EC2 Auto Scaling, EC2 Fleet, and Spot Fleet. It allocates Spot Instances based on both spare capacity availability and Spot Instance price.

# __1.12.339__ __2022-11-09__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - This release adds "IncludeIframeOnlyStream" for Dash endpoints.

## __AWS Ground Station__
  - ### Features
    - This release adds the preview of customer-provided ephemeris support for AWS Ground Station, allowing space vehicle owners to provide their own position and trajectory information for a satellite.

## __Amazon Connect Cases__
  - ### Features
    - This release adds the ability to disable templates through the UpdateTemplate API. Disabling templates prevents customers from creating cases using the template. For more information see https://docs.aws.amazon.com/cases/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - This release adds new fields SignInUrl, UserArn, and UserId to GetFederationToken response payload.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 Trn1 instances, powered by AWS Trainium chips, are purpose built for high-performance deep learning training. u-24tb1.112xlarge and u-18tb1.112xlarge High Memory instances are purpose-built to run large in-memory databases.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This will release hi-IN and th-TH

# __1.12.338__ __2022-11-08__
## __AWS Certificate Manager__
  - ### Features
    - Support added for requesting elliptic curve certificate key algorithm types P-256 (EC_prime256v1) and P-384 (EC_secp384r1).

## __AWS Resource Explorer__
  - ### Features
    - This is the initial SDK release for AWS Resource Explorer. AWS Resource Explorer lets your users search for and discover your AWS resources across the AWS Regions in your account.

## __AWSBillingConductor__
  - ### Features
    - This release adds the Recurring Custom Line Item feature along with a new API ListCustomLineItemVersions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release enables sharing of EC2 Placement Groups across accounts and within AWS Organizations using Resource Access Manager

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Amazon Lightsail to automate the delegation of domains registered through Amazon Route 53 to Lightsail DNS management and to automate record creation for DNS validation of Lightsail SSL/TLS certificates.

## __Amazon OpenSearch Service__
  - ### Features
    - Amazon OpenSearch Service now offers managed VPC endpoints to connect to your Amazon OpenSearch Service VPC-enabled domain in a Virtual Private Cloud (VPC). This feature allows you to privately access OpenSearch Service domain without using public IPs or requiring traffic to traverse the Internet.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new voices: Elin (sv-SE), Ida (nb-NO), Laura (nl-NL) and Suvi (fi-FI). They are available as neural voices only.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Europe (Zurich) Region (eu-central-2) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports importing existing AWS Network Firewall firewalls into Firewall Manager policies.

# __1.12.337__ __2022-11-07__
## __AWS CloudTrail__
  - ### Features
    - This release includes support for configuring a delegated administrator to manage an AWS Organizations organization CloudTrail trails and event data stores, and AWS Key Management Service encryption of CloudTrail Lake event data stores.

## __AWS Elemental MediaConvert__
  - ### Features
    - The AWS Elemental MediaConvert SDK has added support for setting the SDR reference white point for HDR conversions and conversion of HDR10 to DolbyVision without mastering metadata.

## __AWS WAFV2__
  - ### Features
    - The geo match statement now adds labels for country and region. You can match requests at the region level by combining a geo match statement with label match statements.

## __AWS Well-Architected Tool__
  - ### Features
    - This release adds support for integrations with AWS Trusted Advisor and AWS Service Catalog AppRegistry to improve workload discovery and speed up your workload reviews.

## __Amazon Athena__
  - ### Features
    - Adds support for using Query Result Reuse

## __Amazon ElastiCache__
  - ### Features
    - Added support for IPv6 and dual stack for Memcached and Redis clusters. Customers can now launch new Redis and Memcached clusters with IPv6 and dual stack networking support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for two new attributes for attribute-based instance type selection - NetworkBandwidthGbps and AllowedInstanceTypes.

## __Amazon Lex Model Building V2__
  - ### Features
    - Amazon Lex now supports new APIs for viewing and editing Custom Vocabulary in bots.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release includes support for applying a CloudWatch alarm to multi account multi region Systems Manager Automation

## __Amazon WorkSpaces__
  - ### Features
    - This release adds protocols attribute to workspaces properties data type. This enables customers to migrate workspaces from PC over IP (PCoIP) to WorkSpaces Streaming Protocol (WSP) using create and modify workspaces public APIs.

## __Auto Scaling__
  - ### Features
    - This release adds support for two new attributes for attribute-based instance type selection - NetworkBandwidthGbps and AllowedInstanceTypes.

# __1.12.336__ __2022-11-04__
## __Amazon CloudWatch Logs__
  - ### Features
    - Doc-only update for bug fixes and support of export to buckets encrypted with SSE-KMS

## __Amazon EMR Containers__
  - ### Features
    - Adding support for Job templates. Job templates allow you to create and store templates to configure Spark applications parameters. This helps you ensure consistent settings across applications by reusing and enforcing configuration overrides in data pipelines.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds API support for the recipient of an AMI account share to remove shared AMI launch permissions.

# __1.12.335__ __2022-11-03__
## __Amazon MemoryDB__
  - ### Features
    - Adding support for r6gd instances for MemoryDB Redis with data tiering. In a cluster with data tiering enabled, when available memory capacity is exhausted, the least recently used data is automatically tiered to solid state drives for cost-effective capacity scaling with minimal performance impact.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on ml.trn1 instance types.

# __1.12.334__ __2022-11-02__
## __AWS IoT SiteWise__
  - ### Features
    - This release adds the ListAssetModelProperties and ListAssetProperties APIs. You can list all properties that belong to a single asset model or asset using these two new APIs.

## __AWS S3 Control__
  - ### Features
    - S3 on Outposts launches support for Lifecycle configuration for Outposts buckets. With S3 Lifecycle configuration, you can mange objects so they are stored cost effectively. You can manage objects using size-based rules and specify how many noncurrent versions bucket will retain.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Adds support for tagging replication-set on creation.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates Framework model regex for ModelPackage to support new Framework version xgboost, sklearn.

# __1.12.333__ __2022-11-01__
## __Amazon Relational Database Service__
  - ### Features
    - Relational Database Service - This release adds support for configuring Storage Throughput on RDS database instances.

## __Amazon Textract__
  - ### Features
    - Add ocr results in AnalyzeIDResponse as blocks

# __1.12.332__ __2022-10-31__
## __AWS App Runner__
  - ### Features
    - This release adds support for private App Runner services. Services may now be configured to be made private and only accessible from a VPC. The changes include a new VpcIngressConnection resource and several new and modified APIs.

## __AWS IoT__
  - ### Features
    - This release adds the Amazon Location action to IoT Rules Engine.

## __Amazon CloudWatch Logs__
  - ### Features
    - SDK release to support tagging for destinations and log groups with TagResource. Also supports tag on create with PutDestination.

## __Amazon Connect Service__
  - ### Features
    - Amazon connect now support a new API DismissUserContact to dismiss or remove terminated contacts in Agent CCP

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Elastic IP transfer is a new Amazon VPC feature that allows you to transfer your Elastic IP addresses from one AWS Account to another.

## __Amazon Simple Email Service__
  - ### Features
    - This release includes support for interacting with the Virtual Deliverability Manager, allowing you to opt in/out of the feature and to retrieve recommendations and metric data.

## __Amazon Textract__
  - ### Features
    - This release introduces additional support for 30+ normalized fields such as vendor address and currency. It also includes OCR output in the response and accuracy improvements for the already supported fields in previous version

# __1.12.331__ __2022-10-28__
## __AWS App Runner__
  - ### Features
    - AWS App Runner adds .NET 6, Go 1, PHP 8.1 and Ruby 3.1 runtimes.

## __AWS Cloud9__
  - ### Features
    - Update to the documentation section of the Cloud9 API Reference guide.

## __AWS CloudFormation__
  - ### Features
    - This release adds more fields to improves visibility of AWS CloudFormation StackSets information in following APIs: ListStackInstances, DescribeStackInstance, ListStackSetOperationResults, ListStackSetOperations, DescribeStackSetOperation.

## __AWS MediaTailor__
  - ### Features
    - This release introduces support for SCTE-35 segmentation descriptor messages which can be sent within time signal messages.

## __AWS Private 5G__
  - ### Features
    - Fix incorrect endpoint-prefix in endpoint ruleset.

## __AWS Support App__
  - ### Features
    - Fix incorrect endpoint-prefix in endpoint ruleset.

## __Amazon AppStream__
  - ### Features
    - This release includes CertificateBasedAuthProperties in CreateDirectoryConfig and UpdateDirectoryConfig.

## __GameSparks__
  - ### Features
    - Add LATEST as a possible GameSDK Version on snapshot

# __1.12.330__ __2022-10-27__
## __AWS Glue__
  - ### Features
    - Added support for custom datatypes when using custom csv classifier.

## __AWS WAFV2__
  - ### Features
    - This release adds the following: Challenge rule action, to silently verify client browsers; rule group rule action override to any valid rule action, not just Count; token sharing between protected applications for challenge/CAPTCHA token; targeted rules option for Bot Control managed rule group.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Feature supports the replacement of instance root volume using an updated AMI without requiring customers to stop their instance.

## __Amazon Redshift__
  - ### Features
    - This release clarifies use for the ElasticIp parameter of the CreateCluster and RestoreFromClusterSnapshot APIs.

## __Amazon SageMaker Service__
  - ### Features
    - This change allows customers to provide a custom entrypoint script for the docker container to be run while executing training jobs, and provide custom arguments to the entrypoint script.

## __Firewall Management Service__
  - ### Features
    - Add support NetworkFirewall Managed Rule Group Override flag in GetViolationDetails API

# __1.12.329__ __2022-10-26__
## __AWS Identity and Access Management__
  - ### Features
    - Doc only update that corrects instances of CLI not using an entity.

## __Amazon Neptune__
  - ### Features
    - Added a new cluster-level attribute to set the capacity range for Neptune Serverless instances.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports specifying Grid Search strategy for tuning jobs, which evaluates all hyperparameter combinations exhaustively based on the categorical hyperparameters provided.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds support for Tiered Storage. UpdateStorage allows you to control the Storage Mode for supported storage tiers.

# __1.12.328__ __2022-10-25__
## __AWS MediaTailor__
  - ### Features
    - This release is a documentation update

## __Access Analyzer__
  - ### Features
    - This release adds support for six new resource types in IAM Access Analyzer to help you easily identify public and cross-account access to your AWS resources. Updated service API, documentation, and paginators.

## __Amazon Location Service__
  - ### Features
    - Added new map styles with satellite imagery for map resources using HERE as a data provider.

## __Amazon Relational Database Service__
  - ### Features
    - Relational Database Service - This release adds support for exporting DB cluster data to Amazon S3.

## __Amazon WorkSpaces__
  - ### Features
    - This release adds new enums for supporting Workspaces Core features, including creating Manual running mode workspaces, importing regular Workspaces Core images and importing g4dn Workspaces Core images.

# __1.12.327__ __2022-10-24__
## __AWS Batch__
  - ### Features
    - This release adds support for AWS Batch on Amazon EKS.

## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Private Certificate Authority (AWS Private CA) now offers usage modes which are combination of features to address specific use cases.

## __AWS DataSync__
  - ### Features
    - Added support for self-signed certificates when using object storage locations; added BytesCompressed to the TaskExecution response.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now supports a new API ListInferenceRecommendationJobSteps to return the details of all the benchmark we create for an inference recommendation job.

# __1.12.326__ __2022-10-21__
## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new "DeletionProtection" field to the UserPool in Cognito. Application admins can configure this value with either ACTIVE or INACTIVE value. Setting this field to ACTIVE will prevent a user pool from accidental deletion.

## __Amazon SageMaker Service__
  - ### Features
    - CreateInferenceRecommenderjob API now supports passing endpoint details directly, that will help customers to identify the max invocation and max latency they can achieve for their model and the associated endpoint along with getting recommendations on other instances.

## __Amazon Simple Storage Service__
  - ### Features
    - S3 on Outposts launches support for automatic bucket-style alias. You can use the automatic access point alias instead of an access point ARN for any object-level operation in an Outposts bucket.

# __1.12.325__ __2022-10-20__
## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now supports AddEndpoints and RemoveEndpoints operations for standard endpoint groups.

## __AWS Resilience Hub__
  - ### Features
    - In this release, we are introducing support for regional optimization for AWS Resilience Hub applications. It also includes a few documentation updates to improve clarity.

## __Amazon DevOps Guru__
  - ### Features
    - This release adds information about the resources DevOps Guru is analyzing.

## __CloudWatch RUM__
  - ### Features
    - CloudWatch RUM now supports Extended CloudWatch Metrics with Additional Dimensions

# __1.12.324__ __2022-10-19__
## __AWS CloudTrail__
  - ### Features
    - This release includes support for exporting CloudTrail Lake query results to an Amazon S3 bucket.

## __AWS Config__
  - ### Features
    - This release adds resourceType enums for AppConfig, AppSync, DataSync, EC2, EKS, Glue, GuardDuty, SageMaker, ServiceDiscovery, SES, Route53 types.

## __AWS S3 Control__
  - ### Features
    - Updates internal logic for constructing API endpoints. We have added rule-based endpoints and internal model parameters.

## __AWS Support App__
  - ### Features
    - This release adds the RegisterSlackWorkspaceForOrganization API. You can use the API to register a Slack workspace for an AWS account that is part of an organization.

## __Amazon Chime SDK Messaging__
  - ### Features
    - Documentation updates for Chime Messaging SDK

## __Amazon Connect Service__
  - ### Features
    - This release adds API support for managing phone numbers that can be used across multiple AWS regions through telephony traffic distribution.

## __Amazon EventBridge__
  - ### Features
    - Updates internal logic for constructing API endpoints. We have added rule-based endpoints and internal model parameters.

## __Amazon Managed Blockchain__
  - ### Features
    - Adding new Accessor APIs for Amazon Managed Blockchain

## __Amazon Simple Storage Service__
  - ### Features
    - Updates internal logic for constructing API endpoints. We have added rule-based endpoints and internal model parameters.

## __Amazon WorkSpaces Web__
  - ### Features
    - WorkSpaces Web now supports user access logging for recording session start, stop, and URL navigation.

# __1.12.323__ __2022-10-18__
## __AWS Cloud Map__
  - ### Features
    - Updated the ListNamespaces API to support the NAME and HTTP_NAME filters, and the BEGINS_WITH filter condition.

## __Amazon Fraud Detector__
  - ### Features
    - Documentation Updates for Amazon Fraud Detector

## __Amazon SageMaker Service__
  - ### Features
    - This change allows customers to enable data capturing while running a batch transform job, and configure monitoring schedule to monitoring the captured data.

## __Amazon Simple Email Service__
  - ### Features
    - This release allows subscribers to enable Dedicated IPs (managed) to send email via a fully managed dedicated IP experience. It also adds identities' VerificationStatus in the response of GetEmailIdentity and ListEmailIdentities APIs, and ImportJobs counts in the response of ListImportJobs API.

# __1.12.322__ __2022-10-17__
## __AWS Greengrass__
  - ### Features
    - This change allows customers to specify FunctionRuntimeOverride in FunctionDefinitionVersion. This configuration can be used if the runtime on the device is different from the AWS Lambda runtime specified for that function.

## __AWS SDK for Java__
  - ### Features
    - Adding regions me-central-1 (DXB) and ap-southeast-3 (CGK) to message manager
    - Bump jackson-databind version to 2.12.7.1

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for C7g, C6g, C6gd, C6gn, M6g, M6gd, R6g, and R6gn Graviton instance types in Amazon SageMaker Inference.

# __1.12.321__ __2022-10-14__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports specifying the minimum percentage of the HRD buffer available at the end of each encoded video segment.

# __1.12.320__ __2022-10-13__
## __AWS Amplify UI Builder__
  - ### Features
    - We are releasing the ability for fields to be configured as arrays.

## __AWS Directory Service__
  - ### Features
    - This release adds support for describing and updating AWS Managed Microsoft AD set up.

## __AWS Elemental MediaLive__
  - ### Features
    - AWS Elemental MediaLive now supports forwarding SCTE-35 messages through the Event Signaling and Management (ESAM) API, and can read those SCTE-35 messages from an inactive source.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - This release adds SPEKE v2 support for MediaPackage VOD. Speke v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, based on an encryption contract selected by the customer.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for the AWS Identity and Access Management API Reference.

## __AWS IoT FleetWise__
  - ### Features
    - Documentation update for AWS IoT FleetWise

## __AWS Panorama__
  - ### Features
    - Pause and resume camera stream processing with SignalApplicationInstanceNodeInstances. Reboot an appliance with CreateJobForDevices. More application state information in DescribeApplicationInstance response.

## __AWS RDS DataService__
  - ### Features
    - Doc update to reflect no support for schema parameter on BatchExecuteStatement API

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Update RelatedItem enum to support Tasks

## __AWS Transfer Family__
  - ### Features
    - This release adds an option for customers to configure workflows that are triggered when files are only partially received from a client due to premature session disconnect.

## __Amazon Appflow__
  - ### Features
    - With this update, you can choose which Salesforce API is used by Amazon AppFlow to transfer data to or from your Salesforce account. You can choose the Salesforce REST API or Bulk API 2.0. You can also choose for Amazon AppFlow to pick the API automatically.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for a secondary email and a mobile number for Amazon Connect instance users.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release updates the GetRecommendations API to include a trigger event list for classifying and grouping recommendations.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update to address tickets.

## __Amazon GuardDuty__
  - ### Features
    - Add UnprocessedDataSources to CreateDetectorResponse which specifies the data sources that couldn't be enabled during the CreateDetector request. In addition, update documentations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Support of AmazonLinux2022 by Patch Manager

## __Amazon Translate__
  - ### Features
    - This release enables customers to specify multiple target languages in asynchronous batch translation requests.

# __1.12.319__ __2022-10-07__
## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds error status details for deployments and components that failed on a device and adds features to improve visibility into component installation.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Documentation update to replace broken link.

## __Amazon QuickSight__
  - ### Features
    - Amazon QuickSight now supports SecretsManager Secret ARN in place of CredentialPair for DataSource creation and update. This release also has some minor documentation updates and removes CountryCode as a required parameter in GeoSpatialColumnGroup

## __Elastic Load Balancing__
  - ### Features
    - Gateway Load Balancer adds a new feature (target_failover) for customers to rebalance existing flows to a healthy target after marked unhealthy or deregistered. This allows graceful patching/upgrades of target appliances during maintenance windows, and helps reduce unhealthy target failover time.

# __1.12.318__ __2022-10-06__
## __AWS Resilience Hub__
  - ### Features
    - Documentation change for AWS Resilience Hub. Doc-only update to fix Documentation layout

# __1.12.317__ __2022-10-05__
## __AWS Glue__
  - ### Features
    - This SDK release adds support to sync glue jobs with source control provider. Additionally, a new parameter called SourceControlDetails will be added to Job model.

## __AWS Network Firewall__
  - ### Features
    - StreamExceptionPolicy configures how AWS Network Firewall processes traffic when a network connection breaks midstream

## __AWS Outposts__
  - ### Features
    - This release adds the Asset state information to the ListAssets response. The ListAssets request supports filtering on Asset state.

# __1.12.316__ __2022-10-04__
## __AWS S3 Control__
  - ### Features
    - S3 Object Lambda adds support to allow customers to intercept HeadObject and ListObjects requests and introduce their own compute. These requests were previously proxied to S3.

## __Amazon Connect Cases__
  - ### Features
    - This release adds APIs for Amazon Connect Cases. Cases allows your agents to quickly track and manage customer issues that require multiple interactions, follow-up tasks, and teams in your contact center.  For more information, see https://docs.aws.amazon.com/cases/latest/APIReference/Welcome.html

## __Amazon Connect Service__
  - ### Features
    - Updated the CreateIntegrationAssociation API to support the CASES_DOMAIN IntegrationType.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates to address various Amazon ECS tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added EnableNetworkAddressUsageMetrics flag for ModifyVpcAttribute, DescribeVpcAttribute APIs.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for impersonation roles in Amazon WorkMail.

# __1.12.315__ __2022-10-03__
## __Access Analyzer__
  - ### Features
    - AWS IAM Access Analyzer policy validation introduces new checks for role trust policies. As customers author a policy, IAM Access Analyzer policy validation evaluates the policy for any issues to make it easier for customers to author secure policies.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding an imdsSupport attribute to EC2 AMIs

## __Amazon Import/Export Snowball__
  - ### Features
    - Adds support for V3_5C. This is a refreshed AWS Snowball Edge Compute Optimized device type with 28TB SSD, 104 vCPU and 416GB memory (customer usable).

# __1.12.314__ __2022-09-30__
## __AWS CodeDeploy__
  - ### Features
    - This release allows you to override the alarm configurations when creating a deployment.

## __AWS SSO OIDC__
  - ### Features
    - Documentation updates for the IAM Identity Center OIDC CLI Reference.

## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release adds support for archival of single-volume snapshots created by Amazon Data Lifecycle Manager policies

## __Amazon DevOps Guru__
  - ### Features
    - This release adds filter feature on AddNotificationChannel API, enable customer to configure the SNS notification messages by Severity or MessageTypes

## __Amazon SageMaker Runtime__
  - ### Features
    - A new parameter called EnableExplanations is added to InvokeEndpoint API to enable on-demand SageMaker Clarify online explainability requests.

## __Amazon SageMaker Service__
  - ### Features
    - A new parameter called ExplainerConfig is added to CreateEndpointConfig API to enable SageMaker Clarify online explainability feature.

# __1.12.313__ __2022-09-29__
## __AWS Certificate Manager__
  - ### Features
    - This update returns additional certificate details such as certificate SANs and allows sorting in the ListCertificates API.

## __AWS Migration Hub Orchestrator__
  - ### Features
    - Introducing AWS MigrationHubOrchestrator. This is the first public release of AWS MigrationHubOrchestrator.

## __AWS Proton__
  - ### Features
    - This release adds an option to delete pipeline provisioning repositories using the UpdateAccountSettings API

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Amazon Elastic Compute Cloud__
  - ### Features
    - u-3tb1 instances are powered by Intel Xeon Platinum 8176M (Skylake) processors and are purpose-built to run large in-memory databases.

## __Amazon FSx__
  - ### Features
    - This release adds support for Amazon File Cache.

## __Amazon Polly__
  - ### Features
    - Added support for the new Cantonese voice - Hiujin. Hiujin is available as a Neural voice only.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Training Managed Warm Pools let you retain provisioned infrastructure to reduce latency for repetitive training workloads.

## __Amazon Translate__
  - ### Features
    - This release enables customers to access control rights on Translate resources like Parallel Data and Custom Terminology using Tag Based Authorization.

## __Amazon WorkSpaces__
  - ### Features
    - This release includes diagnostic log uploading feature. If it is enabled, the log files of WorkSpaces Windows client will be sent to Amazon WorkSpaces automatically for troubleshooting. You can use modifyClientProperty api to enable/disable this feature.

## __EMR Serverless__
  - ### Features
    - This release adds API support to debug Amazon EMR Serverless jobs in real-time with live application UIs

# __1.12.312__ __2022-09-27__
## __AWS Cost Explorer Service__
  - ### Features
    - This release is to support retroactive Cost Categories. The new field will enable you to retroactively apply new and existing cost category rules to previous months.

## __AWSKendraFrontendService__
  - ### Features
    - My AWS Service (placeholder) - Amazon Kendra now provides a data source connector for DropBox. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-dropbox.html

## __Amazon Location Service__
  - ### Features
    - This release adds place IDs, which are unique identifiers of places, along with a new GetPlace operation, which can be used with place IDs to find a place again later. UnitNumber and UnitType are also added as new properties of places.

# __1.12.311__ __2022-09-26__
## __AWS Cost and Usage Report Service__
  - ### Features
    - This release adds two new support regions(me-central-1/eu-south-2) for OSG.

## __AWS IoT FleetWise__
  - ### Features
    - General availability (GA) for AWS IoT Fleetwise. It adds AWS IoT Fleetwise to AWS SDK. For more information, see https://docs.aws.amazon.com/iot-fleetwise/latest/APIReference/Welcome.html.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release includes support for applying a CloudWatch alarm to Systems Manager capabilities like Automation, Run Command, State Manager, and Maintenance Windows.

# __1.12.310__ __2022-09-23__
## __AWS App Runner__
  - ### Features
    - AWS App Runner adds a Node.js 16 runtime.

## __AWS WAFV2__
  - ### Features
    - Add the default specification for ResourceType in ListResourcesForWebACL.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Letting external AWS customers provide ImageId as a Launch Template override in FleetLaunchTemplateOverridesRequest

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces additional optional parameters promptAttemptsSpecification to PromptSpecification, which enables the users to configure interrupt setting and Audio, DTMF and Text input configuration for the initial and retry prompt played by the Bot

## __Amazon Lightsail__
  - ### Features
    - This release adds Instance Metadata Service (IMDS) support for Lightsail instances.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds new SSM document types ConformancePackTemplate and CloudFormation

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for on-demand Amazon Elastic Compute Cloud (EC2) G3 and G5 instances, allowing customers to utilize additional GPU instance types for their creative projects.

# __1.12.309__ __2022-09-22__
## __AWS Backup Gateway__
  - ### Features
    - Changes include: new GetVirtualMachineApi to fetch a single user's VM, improving ListVirtualMachines to fetch filtered VMs as well as all VMs, and improving GetGatewayApi to now also return the gateway's MaintenanceStartTime.

## __AWS Device Farm__
  - ### Features
    - This release adds the support for VPC-ENI based connectivity for private devices on AWS Device Farm.

## __AWS Glue__
  - ### Features
    - Added support for S3 Event Notifications for Catalog Target Crawlers.

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for the Identity Store CLI Reference.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

# __1.12.308__ __2022-09-21__
## __AWS S3 Control__
  - ### Features
    - S3 on Outposts launches support for object versioning for Outposts buckets. With S3 Versioning, you can preserve, retrieve, and restore every version of every object stored in your buckets. You can recover from both unintended user actions and application failures.

## __AWS SDK for Java__
  - ### Bugfixes
    - Evaluates blank session token as a null token in EnvironmentVariableCredentialsProvider

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports synchronous mode for targeted sentiment API operations.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker now allows customization on Canvas Application settings, including enabling/disabling time-series forecasting and specifying an Amazon Forecast execution role at both the Domain and UserProfile levels.

# __1.12.307__ __2022-09-20__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for blocked paths to Amazon VPC Reachability Analyzer.

# __1.12.306__ __2022-09-19__
## __AWS CloudTrail__
  - ### Features
    - This release includes support for importing existing trails into CloudTrail Lake.

## __AWS MediaConnect__
  - ### Features
    - This change allows the customer to use the SRT Caller protocol as part of their flows

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds CapacityAllocations field to DescribeCapacityReservations

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Proxy with SQL Server compatibility.

# __1.12.305__ __2022-09-16__
## __AWS CodeStar Notifications__
  - ### Features
    - This release adds tag based access control for the UntagResource API.

## __Amazon EC2 Container Service__
  - ### Features
    - This release supports new task definition sizes.

# __1.12.304__ __2022-09-15__
## __Amazon DynamoDB__
  - ### Features
    - Increased DynamoDB transaction limit from 25 to 100.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This feature allows customers to create tags for vpc-endpoint-connections and vpc-endpoint-service-permissions.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports specifying Hyperband strategy for tuning jobs, which uses a multi-fidelity based tuning strategy to stop underperforming hyperparameter configurations early.

# __1.12.303__ __2022-09-14__
## __AWS Amplify UI Builder__
  - ### Features
    - Amplify Studio UIBuilder is introducing forms functionality. Forms can be configured from Data Store models, JSON, or from scratch. These forms can then be generated in your project and used like any other React components.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This update introduces API operations to manage and create local gateway route tables, CoIP pools, and VIF group associations.

# __1.12.302__ __2022-09-13__
## __AWS Transfer Family__
  - ### Features
    - This release introduces the ability to have multiple server host keys for any of your Transfer Family servers that use the SFTP protocol.

## __AWSKendraFrontendService__
  - ### Features
    - This release enables our customer to choose the option of Sharepoint 2019 for the on-premise Sharepoint connector.

## __Amazon CloudWatch Evidently__
  - ### Features
    - This release adds support for the client-side evaluation - powered by AWS AppConfig feature.

## __Amazon Connect Customer Profiles__
  - ### Features
    - Added isUnstructured in response for Customer Profiles Integration APIs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Two new features for local gateway route tables: support for static routes targeting Elastic Network Interfaces and direct VPC routing.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Fixed the data type of lagDuration that is returned in Describe Source Server API

# __1.12.301__ __2022-09-12__
## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding support for local Amazon EKS clusters on Outposts

# __1.12.300__ __2022-09-09__
## __AWS CloudTrail__
  - ### Features
    - This release adds CloudTrail getChannel and listChannels APIs to allow customer to view the ServiceLinkedChannel configurations.

## __AWS Performance Insights__
  - ### Features
    - Increases the maximum values of two RDS Performance Insights APIs. The maximum value of the Limit parameter of DimensionGroup is 25. The MaxResult maximum is now 25 for the following APIs: DescribeDimensionKeys, GetResourceMetrics, ListAvailableResourceDimensions, and ListAvailableResourceMetrics.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release is for supporting Composite Slot Type feature in AWS Lex V2. Composite Slot Type will help developer to logically group coherent slots and maintain their inter-relationships in runtime conversation.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release is for supporting Composite Slot Type feature in AWS Lex V2. Composite Slot Type will help developer to logically group coherent slots and maintain their inter-relationships in runtime conversation.

## __Amazon Redshift__
  - ### Features
    - This release updates documentation for AQUA features and other description updates.

# __1.12.299__ __2022-09-08__
## __AWS Elemental MediaLive__
  - ### Features
    - This change exposes API settings which allow Dolby Atmos and Dolby Vision to be used when running a channel using Elemental Media Live

## __AWS SDK for Java__
  - ### Features
    - Adding support for me-central-1 region

## __Amazon EMR Containers__
  - ### Features
    - EMR on EKS now allows running Spark SQL using the newly introduced Spark SQL Job Driver in the Start Job Run API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to send VPC Flow Logs to kinesis-data-firehose as new destination type

## __Amazon Lookout for Metrics__
  - ### Features
    - Release dimension value filtering feature to allow customers to define dimension filters for including only a subset of their dataset to be used by LookoutMetrics.

## __Amazon Route 53__
  - ### Features
    - Amazon Route 53 now supports the Middle East (UAE) Region (me-central-1) for latency records, geoproximity records, and private DNS for Amazon VPCs in that region.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds Mode to AutoMLJobConfig.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds support for Systems Manager State Manager Association tagging.

# __1.12.298__ __2022-09-07__
## __AWS Data Exchange__
  - ### Features
    - Documentation updates for AWS Data Exchange.

## __AWS IoT SiteWise__
  - ### Features
    - Allow specifying units in Asset Properties

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS Addons ResolveConflicts "preserve" flag. Also adds new update failed status for EKS Addons.

## __Amazon FSx__
  - ### Features
    - Documentation update for Amazon FSx.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Hosting now allows customization on ML instance storage volume size, model data download timeout and inference container startup ping health check timeout for each ProductionVariant in CreateEndpointConfig API.

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS introduces the Data Protection Policy APIs, which enable customers to attach a data protection policy to an SNS topic. This allows topic owners to enable the new message data protection feature to audit and block sensitive data that is exchanged through their topics.

## __Inspector2__
  - ### Features
    - This release adds new fields like fixAvailable, fixedInVersion and remediation to the finding model. The requirement to have vulnerablePackages in the finding model has also been removed. The documentation has been updated to reflect these changes.

# __1.12.297__ __2022-09-06__
## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for the Identity Store CLI Reference.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds HyperParameterTuningJob type in Search API.

# __1.12.296__ __2022-09-02__
## __AWS Elemental MediaPackage__
  - ### Features
    - Added support for AES_CTR encryption to CMAF origin endpoints

## __Amazon Cognito Identity Provider__
  - ### Features
    - This release adds a new "AuthSessionValidity" field to the UserPoolClient in Cognito. Application admins can configure this value for their users' authentication duration, which is currently fixed at 3 minutes, up to 15 minutes. Setting this field will also apply to the SMS MFA authentication flow.

## __Amazon Connect Service__
  - ### Features
    - This release adds search APIs for Routing Profiles and Queues, which can be used to search for those resources within a Connect Instance.

## __Amazon SageMaker Service__
  - ### Features
    - This release enables administrators to attribute user activity and API calls from Studio notebooks, Data Wrangler and Canvas to specific users even when users share the same execution IAM role.  ExecutionRoleIdentityConfig at Sagemaker domain level enables this feature.

# __1.12.295__ __2022-09-01__
## __AWS Control Tower__
  - ### Features
    - This release contains the first SDK for AWS Control Tower. It introduces  a new set of APIs: EnableControl, DisableControl, GetControlOperation, and ListEnabledControls.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Documentation updates to fix formatting issues in CLI and SDK documentation.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for Amazon Route 53.

# __1.12.294__ __2022-08-31__
## __AWS IoT Things Graph__
  - ### Features
    - This release deprecates all APIs of the ThingsGraph service

## __AWS RDS DataService__
  - ### Features
    - Documentation updates for RDS Data API

## __AWS SSO Identity Store__
  - ### Features
    - Expand IdentityStore API to support Create, Read, Update, Delete and Get operations for User, Group and GroupMembership resources.

## __Amazon CloudFront__
  - ### Features
    - Update API documentation for CloudFront origin access control (OAC)

## __Amazon Interactive Video Service__
  - ### Features
    - IVS Merge Fragmented Streams. This release adds support for recordingReconnectWindow field in IVS recordingConfigurations. For more information see https://docs.aws.amazon.com/ivs/latest/APIReference/Welcome.html

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now accepts Inference Recommender fields: Domain, Task, Framework, SamplePayloadUrl, SupportedContentTypes, SupportedInstanceTypes, directly in our CreateInferenceRecommendationsJob API through ContainerConfig

# __1.12.293__ __2022-08-30__
## __AWS IoT Greengrass V2__
  - ### Features
    - Adds topologyFilter to ListInstalledComponentsRequest which allows filtration of components by ROOT or ALL (including root and dependency components). Adds lastStatusChangeTimestamp to ListInstalledComponents response to show the last time a component changed state on a device.

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for the Identity Store CLI Reference.

## __AWS Single Sign-On__
  - ### Features
    - Documentation updates for the AWS IAM Identity Center Portal CLI Reference.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for the AWS IAM Identity Center CLI Reference.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds new apis for providing labels.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API adds support for using allow lists to define specific text and text patterns to ignore when inspecting data sources for sensitive data.

# __1.12.292__ __2022-08-29__
## __Amazon FSx__
  - ### Features
    - Documentation updates for Amazon FSx for NetApp ONTAP.

## __Amazon Voice ID__
  - ### Features
    - Amazon Connect Voice ID now detects voice spoofing.  When a prospective fraudster tries to spoof caller audio using audio playback or synthesized speech, Voice ID will return a risk score and outcome to indicate the how likely it is that the voice is spoofed.

# __1.12.291__ __2022-08-29__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds Ads AdTriggers and AdsOnDeliveryRestrictions to describe calls for CMAF endpoints on MediaPackage.

## __Amazon Relational Database Service__
  - ### Features
    - Removes support for RDS Custom from DBInstanceClass in ModifyDBInstance

# __1.12.290__ __2022-08-25__
## __AWS IoT Wireless__
  - ### Features
    - This release includes a new feature for the customers to enable the LoRa gateways to send out beacons for Class B devices and an option to select one or more gateways for Class C devices when sending the LoRaWAN downlink messages.

## __AWS Panorama__
  - ### Features
    - Support sorting and filtering in ListDevices API, and add more fields to device listings and single device detail

## __AWS SSO OIDC__
  - ### Features
    - Updated required request parameters on IAM Identity Center's OIDC CreateToken action.

## __Amazon GameLift__
  - ### Features
    - This release adds support for eight EC2 local zones as fleet locations; Atlanta, Chicago, Dallas, Denver, Houston, Kansas City (us-east-1-mci-1a), Los Angeles, and Phoenix. It also adds support for C5d, C6a, C6i, and R5d EC2 instance families.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Documentation change for IVS Chat API Reference. Doc-only update to add a paragraph on ARNs to the Welcome section.

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for ELBv2.  Gateway Load Balancer now supports Configurable Flow Stickiness, enabling you to configure the hashing used to maintain stickiness of flows to a specific target appliance.

# __1.12.289__ __2022-08-24__
## __AWS Config__
  - ### Features
    - AWS Config now supports ConformancePackTemplate documents in SSM Docs for the deployment and update of conformance packs.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AWS Transfer Family

## __Amazon CloudFront__
  - ### Features
    - Adds support for CloudFront origin access control (OAC), making it possible to restrict public access to S3 bucket origins in all AWS Regions, those with SSE-KMS, and more.

## __Amazon Interactive Video Service__
  - ### Features
    - Documentation Change for IVS API Reference - Doc-only update to type field description for CreateChannel and UpdateChannel actions and for Channel data type. Also added Amazon Resource Names (ARNs) paragraph to Welcome section.

## __Amazon QuickSight__
  - ### Features
    - Added a new optional property DashboardVisual under ExperienceConfiguration parameter of GenerateEmbedUrlForAnonymousUser and GenerateEmbedUrlForRegisteredUser API operations. This supports embedding of specific visuals in QuickSight dashboards.

# __1.12.288__ __2022-08-23__
## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __Amazon Relational Database Service__
  - ### Features
    - RDS for Oracle supports Oracle Data Guard switchover and read replica backups.

# __1.12.287__ __2022-08-22__
## __AWS IoT SiteWise__
  - ### Features
    - Enable non-unique asset names under different hierarchies

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for AwsBackupBackupVault, AwsBackupBackupPlan and AwsBackupRecoveryPoint. Added FixAvailable, FixedInVersion and Remediation  to Vulnerability.

## __AWS Support App__
  - ### Features
    - This is the initial SDK release for the AWS Support App in Slack.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Update document for volume clone

## __Amazon Elastic Compute Cloud__
  - ### Features
    - R6a instances are powered by 3rd generation AMD EPYC (Milan) processors delivering all-core turbo frequency of 3.6 GHz. C6id, M6id, and R6id instances are powered by 3rd generation Intel Xeon Scalable processor (Ice Lake) delivering all-core turbo frequency of 3.5 GHz.

## __Amazon Forecast Query Service__
  - ### Features
    - releasing What-If Analysis APIs

## __Amazon Forecast Service__
  - ### Features
    - releasing What-If Analysis APIs and update ARN regex pattern to be more strict in accordance with security recommendation

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces a new feature to stop a running BotRecommendation Job for Automated Chatbot Designer.

# __1.12.286__ __2022-08-19__
## __AWSKendraFrontendService__
  - ### Features
    - This release adds support for a new authentication type - Personal Access Token (PAT) for confluence server.

## __Amazon Connect Service__
  - ### Features
    - This release adds SearchSecurityProfiles API which can be used to search for Security Profile resources within a Connect Instance.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Documentation Change for IVS Chat API Reference - Doc-only update to change text/description for tags field.

## __Amazon Lookout for Metrics__
  - ### Features
    - This release is to make GetDataQualityMetrics API publicly available.

# __1.12.285__ __2022-08-18__
## __AWS Network Manager__
  - ### Features
    - Add TransitGatewayPeeringAttachmentId property to TransitGatewayPeering Model

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - The Amazon Chime SDK now supports live streaming of real-time video from the Amazon Chime SDK sessions to streaming platforms such as Amazon IVS and Amazon Elemental MediaLive. We have also added support for concatenation to create a single media capture file.

## __Amazon CloudWatch__
  - ### Features
    - Add support for managed Contributor Insights Rules

## __Amazon Cognito Identity Provider__
  - ### Features
    - This change is being made simply to fix the public documentation based on the models. We have included the PasswordChange and ResendCode events, along with the Pass, Fail and InProgress status. We have removed the Success and Failure status which are never returned by our APIs.

## __Amazon DynamoDB__
  - ### Features
    - This release adds support for importing data from S3 into a new DynamoDB table

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for VPN log options , a new feature allowing S2S VPN connections to send IKE activity logs to CloudWatch Logs

# __1.12.284__ __2022-08-17__
## __AWS App Mesh__
  - ### Features
    - AWS App Mesh release to support Multiple Listener and Access Log Format feature

## __AWS Lake Formation__
  - ### Features
    - This release adds a new API support "AssumeDecoratedRoleWithSAML" and also release updates the corresponding documentation.

## __AWS Lambda__
  - ### Features
    - Added support for customization of Consumer Group ID for MSK and Kafka Event Source Mappings.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager.

## __AWSKendraFrontendService__
  - ### Features
    - This release adds Zendesk connector (which allows you to specify Zendesk SAAS platform as data source), Proxy Support for Sharepoint and Confluence Server (which allows you to specify the proxy configuration if proxy is required to connect to your Sharepoint/Confluence Server as data source).

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces support for enhanced conversation design with the ability to define custom conversation flows with conditional branching and new bot responses.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Internet Protocol Version 6 (IPv6) for RDS Aurora database clusters.

## __AmazonConnectCampaignService__
  - ### Features
    - Updated exceptions for Amazon Connect Outbound Campaign api's.

# __1.12.283__ __2022-08-16__
## __AWS Service Catalog__
  - ### Features
    - Documentation updates for Service Catalog

## __Amazon Rekognition__
  - ### Features
    - This release adds APIs which support copying an Amazon Rekognition Custom Labels model and managing project policies across AWS account.

# __1.12.282__ __2022-08-15__
## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __AWS Single Sign-On__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __Amazon CloudFront__
  - ### Features
    - Adds Http 3 support to distributions

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release introduces a new API PutFeedback that allows submitting feedback to Wisdom on content relevance.

# __1.12.281__ __2022-08-12__
## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports channels with up to one million participants with elastic channels.

## __Amazon Interactive Video Service__
  - ### Features
    - Updates various list api MaxResults ranges

## __Amazon Personalize Runtime__
  - ### Features
    - This release provides support for promotions in AWS Personalize runtime.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds log APIs that allow customers to manage logging for their Amazon Managed Service for Prometheus workspaces.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for RDS Custom to DBInstanceClass in ModifyDBInstance

# __1.12.280__ __2022-08-11__
## __AWS Backup Storage__
  - ### Features
    - This is the first public release of AWS Backup Storage. We are exposing some previously-internal APIs for use by external services. These APIs are not meant to be used directly by customers.

## __AWS Glue__
  - ### Features
    - Add support for Python 3.9 AWS Glue Python Shell jobs

## __AWS Private 5G__
  - ### Features
    - This is the initial SDK release for AWS Private 5G. AWS Private 5G is a managed service that makes it easy to deploy, operate, and scale your own private mobile network at your on-premises location.

# __1.12.279__ __2022-08-10__
## __Amazon Data Lifecycle Manager__
  - ### Features
    - This release adds support for excluding specific data (non-boot) volumes from multi-volume snapshot sets created by snapshot lifecycle policies

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for excluding specific data (non-root) volumes from multi-volume snapshot sets created from instances.

# __1.12.278__ __2022-08-09__
## __Amazon Augmented AI Runtime__
  - ### Features
    - Fix bug with parsing ISO-8601 CreationTime in Java SDK in DescribeHumanLoop

## __Amazon CloudWatch__
  - ### Features
    - Various quota increases related to dimensions and custom metrics

## __Amazon Location Service__
  - ### Features
    - Amazon Location Service now allows circular geofences in BatchPutGeofence, PutGeofence, and GetGeofence  APIs.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Automatic Model Tuning now supports specifying multiple alternate EC2 instance types to make tuning jobs more robust when the preferred instance type is not available due to insufficient capacity.

# __1.12.277__ __2022-08-08__
## __AWS Glue__
  - ### Features
    - Add an option to run non-urgent or non-time sensitive Glue Jobs on spare capacity

## __AWS IoT Wireless__
  - ### Features
    - AWS IoT Wireless release support for sidewalk data reliability.

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __AWS SSO OIDC__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __AWS Single Sign-On__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates to reflect service rename - AWS IAM Identity Center (successor to AWS Single Sign-On)

## __Amazon Pinpoint__
  - ### Features
    - Adds support for Advance Quiet Time in Journeys. Adds RefreshOnSegmentUpdate and WaitForQuietTime to JourneyResponse.

## __Amazon QuickSight__
  - ### Features
    - A series of documentation updates to the QuickSight API reference.

# __1.12.276__ __2022-08-04__
## __AWS Config__
  - ### Features
    - Add resourceType enums for Athena, GlobalAccelerator, Detective and EC2 types

## __AWS Database Migration Service__
  - ### Features
    - Documentation updates for Database Migration Service (DMS).

## __AWS IoT__
  - ### Features
    - The release is to support attach a provisioning template to CACert for JITP function,  Customer now doesn't have to hardcode a roleArn and templateBody during register a CACert to enable JITP.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for Tags on Amazon Chime SDK WebRTC sessions

# __1.12.275__ __2022-08-03__
## __AWS WAFV2__
  - ### Features
    - You can now associate an AWS WAF web ACL with an Amazon Cognito user pool.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Add a new exception type, ForbiddenException, that is returned when request is not allowed

# __1.12.274__ __2022-08-02__
## __AWS License Manager User Subscriptions__
  - ### Features
    - This release supports user based subscription for Microsoft Visual Studio Professional and Enterprise on EC2.

## __Amazon Personalize__
  - ### Features
    - This release adds support for incremental bulk ingestion for the Personalize CreateDatasetImportJob API.

# __1.12.273__ __2022-08-01__
## __AWS Config__
  - ### Features
    - Documentation update for PutConfigRule and PutOrganizationConfigRule

## __Amazon WorkSpaces__
  - ### Features
    - This release introduces ModifySamlProperties, a new API that allows control of SAML properties associated with a WorkSpaces directory. The DescribeWorkspaceDirectories API will now additionally return SAML properties in its responses.

# __1.12.272__ __2022-07-29__
## __AWS Shield__
  - ### Features
    - AWS Shield Advanced now supports filtering for ListProtections and ListProtectionGroups.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon FSx__
  - ### Features
    - Documentation updates for Amazon FSx

# __1.12.271__ __2022-07-28__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for VM Import/Export.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds support for gp3 EBS (Elastic Block Store) storage.

## __Amazon Lookout for Vision__
  - ### Features
    - This release introduces support for image segmentation models and updates CPU accelerator options for models hosted on edge devices.

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds support for gp3 EBS (Elastic Block Store) storage.

# __1.12.270__ __2022-07-27__
## __AWS Audit Manager__
  - ### Features
    - This release adds an exceeded quota exception to several APIs. We added a ServiceQuotaExceededException for the following operations: CreateAssessment, CreateControl, CreateAssessmentFramework, and UpdateAssessmentStatus.

## __AWS Config__
  - ### Features
    - This release adds ListConformancePackComplianceScores API to support the new compliance score feature, which provides a percentage of the number of compliant rule-resource combinations in a conformance pack compared to the number of total possible rule-resource combinations in the conformance pack.

## __AWS Global Accelerator__
  - ### Features
    - Global Accelerator now supports dual-stack accelerators, enabling support for IPv4 and IPv6 traffic.

## __AWS Marketplace Catalog Service__
  - ### Features
    - The SDK for the StartChangeSet API will now automatically set and use an idempotency token in the ClientRequestToken request parameter if the customer does not provide it.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector will now support ValidateE911Address which will allow customers to prevalidate their addresses included in their SIP invites for emergency calling

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new English and Hindi voice - Kajal. Kajal is available as Neural voice only.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adding doc updates for OpsCenter support in Service Setting actions.

## __Amazon WorkSpaces__
  - ### Features
    - Added CreateWorkspaceImage API to create a new WorkSpace image from an existing WorkSpace.

# __1.12.269__ __2022-07-26__
## __AWS AppSync__
  - ### Features
    - Adds support for a new API to evaluate mapping templates with mock data, allowing you to remotely unit test your AppSync resolvers and functions.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for AWS Security Hub

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports Applicability Statement 2 (AS2), a network protocol used for the secure and reliable transfer of critical Business-to-Business (B2B) data over the public internet using HTTP/HTTPS as the transport mechanism.

## __Amazon Detective__
  - ### Features
    - Added the ability to get data source package information for the behavior graph. Graph administrators can now start (or stop) optional datasources on the behavior graph.

## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty introduces a new Malware Protection feature that triggers malware scan on selected EC2 instance resources, after the service detects a potentially malicious activity.

## __Amazon Lookout for Vision__
  - ### Features
    - This release introduces support for the automatic scaling of inference units used by Amazon Lookout for Vision models.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for retrieving (revealing) sample occurrences of sensitive data that Amazon Macie detects and reports in findings.

## __Amazon Rekognition__
  - ### Features
    - This release introduces support for the automatic scaling of inference units used by Amazon Rekognition Custom Labels models.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for using RDS Proxies with RDS for MariaDB databases.

# __1.12.268__ __2022-07-25__
## __Auto Scaling__
  - ### Features
    - Documentation update for Amazon EC2 Auto Scaling.

# __1.12.267__ __2022-07-22__
## __AWS Account__
  - ### Features
    - This release enables customers to manage the primary contact information for their AWS accounts. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/API_Operations.html

## __AWS Elemental MediaLive__
  - ### Features
    - Link devices now support remote rebooting. Link devices now support maintenance windows. Maintenance windows allow a Link device to install software updates without stopping the MediaLive channel. The channel will experience a brief loss of input from the device while updates are installed.

## __AWS IoT Core Device Advisor__
  - ### Features
    - Added new service feature (Early access only) - Long Duration Test, where customers can test the IoT device to observe how it behaves when the device is in operation for longer period.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for EC2 M1 Mac instances. For more information, please visit aws.amazon.com/mac.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the "ModifyActivityStream" API with support for audit policy state locking and unlocking.

## __Amazon Transcribe Service__
  - ### Features
    - Remove unsupported language codes for StartTranscriptionJob and update VocabularyFileUri for UpdateMedicalVocabulary

# __1.12.266__ __2022-07-21__
## __AWS Database Migration Service__
  - ### Features
    - Documentation updates for Database Migration Service (DMS).

## __AWS EC2 Instance Connect__
  - ### Features
    - This release includes a new exception type "EC2InstanceUnavailableException" for SendSSHPublicKey and SendSerialConsoleSSHPublicKey APIs.

## __AWS IoT SiteWise__
  - ### Features
    - Added asynchronous API to ingest bulk historical and current data into IoT SiteWise.

## __AWS Network Firewall__
  - ### Features
    - Network Firewall now supports referencing dynamic IP sets from stateful rule groups, for IP sets stored in Amazon VPC prefix lists.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides Oauth2 support for SharePoint Online. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-sharepoint.html

## __Amazon Athena__
  - ### Features
    - This feature allows customers to retrieve runtime statistics for completed queries

## __Amazon CloudWatch__
  - ### Features
    - Adding support for the suppression of Composite Alarm actions

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Enable copy-on-write restore type

## __Amazon Fraud Detector__
  - ### Features
    - The release introduces Account Takeover Insights (ATI) model. The ATI model detects fraud relating to account takeover. This release also adds support for new variable types: ARE_CREDENTIALS_VALID and SESSION_ID and adds new structures to Model Version APIs.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for creating an RDS Proxy for an RDS for MariaDB database.

# __1.12.265__ __2022-07-20__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private Certificate Authority (PCA) documentation updates

## __AWS IoT__
  - ### Features
    - GA release the ability to enable/disable IoT Fleet Indexing for Device Defender and Named Shadow information, and search them through IoT Fleet Indexing APIs. This includes Named Shadow Selection as a part of the UpdateIndexingConfiguration API.

# __1.12.264__ __2022-07-19__
## __AWS Glue__
  - ### Features
    - Documentation updates for AWS Glue Job Timeout and Autoscaling

## __Amazon DevOps Guru__
  - ### Features
    - Added new APIs for log anomaly detection feature.

## __Amazon SageMaker Service__
  - ### Features
    - Fixed an issue with cross account QueryLineage

## __Amazon Sagemaker Edge Manager__
  - ### Features
    - Amazon SageMaker Edge Manager provides lightweight model deployment feature to deploy machine learning models on requested devices.

## __Amazon WorkSpaces__
  - ### Features
    - Increased the character limit of the login message from 850 to 2000 characters.

# __1.12.263__ __2022-07-18__
## __AWS Application Discovery Service__
  - ### Features
    - Add AWS Agentless Collector details to the GetDiscoverySummary API response

## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds "IncludeIframeOnlyStream" for Dash endpoints and increases the number of supported video and audio encryption presets for Speke v2

## __AWS Key Management Service__
  - ### Features
    - Added support for the SM2 KeySpec in China Partition Regions

## __AWS Single Sign-On Admin__
  - ### Features
    - AWS SSO now supports attaching customer managed policies and a permissions boundary to your permission sets. This release adds new API operations to manage and view the customer managed policies and the permissions boundary for a given permission set.

## __Amazon ElastiCache__
  - ### Features
    - Adding AutoMinorVersionUpgrade in the DescribeReplicationGroups API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Edge Manager provides lightweight model deployment feature to deploy machine learning models on requested devices.

# __1.12.262__ __2022-07-15__
## __AWS DataSync__
  - ### Features
    - Documentation updates for AWS DataSync regarding configuring Amazon FSx for ONTAP location security groups and SMB user permissions.

## __AWS WAFV2__
  - ### Features
    - This SDK release provide customers ability to add sensitivity level for WAF SQLI Match Statements.

## __Amazon CloudWatch Evidently__
  - ### Features
    - This release adds support for the new segmentation feature.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Changed existing APIs to allow choosing a dynamic volume type for replicating volumes, to reduce costs for customers.

# __1.12.261__ __2022-07-14__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Route53Resolver, Batch, DMS, Workspaces, Stepfunctions, SageMaker, ElasticLoadBalancingV2, MSK types

## __AWS Glue__
  - ### Features
    - This release adds an additional worker type for Glue Streaming jobs.

## __AWS Outposts__
  - ### Features
    - This release adds the ShipmentInformation and AssetInformationList fields to the GetOrder API response.

## __AWSKendraFrontendService__
  - ### Features
    - This release adds AccessControlConfigurations which allow you to redefine your document level access control without the need for content re-indexing.

## __Amazon Athena__
  - ### Features
    - This release updates data types that contain either QueryExecutionId, NamedQueryId or ExpectedBucketOwner. Ids must be between 1 and 128 characters and contain only non-whitespace characters. ExpectedBucketOwner must be 12-digit string.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds flow logs for Transit Gateway to  allow customers to gain deeper visibility and insights into network traffic through their Transit Gateways.

## __Amazon S3__
  - ### Bugfixes
    - Fixed possible issue in TransferManager's downloadDirectory operation where files could be downloaded to some sibling directories of the destination directory if the key contained specially-crafted relative paths.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for G5, P4d, and C6i instance types in Amazon SageMaker Inference and increases the number of hyperparameters that can be searched from 20 to 30 in Amazon SageMaker Automatic Model Tuning

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for IAM-based access to AWS resources for Nimble Studio components and custom studio components. Studio Component scripts use these roles on Nimble Studio workstation to mount filesystems, access S3 buckets, or other configured resources in the Studio's AWS account

## __CodeArtifact__
  - ### Features
    - This release introduces Package Origin Controls, a mechanism used to counteract Dependency Confusion attacks. Adds two new APIs, PutPackageOriginConfiguration and DescribePackage, and updates the ListPackage, DescribePackageVersion and ListPackageVersion APIs in support of the feature.

## __Firewall Management Service__
  - ### Features
    - Adds support for strict ordering in stateful rule groups in Network Firewall policies.

## __Inspector2__
  - ### Features
    - This release adds support for Inspector V2 scan configurations through the get and update configuration APIs. Currently this allows configuring ECR automated re-scan duration to lifetime or 180 days or 30 days.

# __1.12.260__ __2022-07-13__
## __Amazon AppConfig__
  - ### Features
    - Adding Create, Get, Update, Delete, and List APIs for new two new resources: Extensions and ExtensionAssociations.

# __1.12.259__ __2022-07-12__
## __AWS Network Manager__
  - ### Features
    - This release adds general availability API support for AWS Cloud WAN.

# __1.12.258__ __2022-07-11__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Build, manage, and monitor a unified global network that connects resources running across your cloud and on-premises environments using the AWS Cloud WAN APIs.

## __Amazon Redshift__
  - ### Features
    - This release adds a new --snapshot-arn field for describe-cluster-snapshots, describe-node-configuration-options, restore-from-cluster-snapshot, authorize-snapshot-acsess, and revoke-snapshot-acsess APIs. It allows customers to give a Redshift snapshot ARN or a Redshift Serverless ARN as input.

## __Redshift Serverless__
  - ### Features
    - Removed prerelease language for GA launch.

# __1.12.257__ __2022-07-08__
## __AWS Backup__
  - ### Features
    - This release adds support for authentication using IAM user identity instead of passed IAM role, identified by excluding the IamRoleArn field in the StartRestoreJob API. This feature applies to only resource clients with a destructive restore nature (e.g. SAP HANA).

# __1.12.256__ __2022-07-07__
## __AWS Database Migration Service__
  - ### Features
    - New api to migrate event subscriptions to event bridge rules

## __AWS IoT__
  - ### Features
    - This release adds support to register a CA certificate without having to provide a verification certificate. This also allows multiple AWS accounts to register the same CA in the same region.

## __AWS IoT Wireless__
  - ### Features
    - Adds 5 APIs: PutPositionConfiguration, GetPositionConfiguration, ListPositionConfigurations, UpdatePosition, GetPosition for the new Positioning Service feature which enables customers to configure solvers to calculate position of LoRaWAN devices, or specify position of LoRaWAN devices & gateways.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for AppKeys and TenantIds in Amazon Chime SDK WebRTC sessions

## __Amazon SageMaker Service__
  - ### Features
    - Heterogeneous clusters: the ability to launch training jobs with multiple instance types. This enables running component of the training job on the instance type that is most suitable for it. e.g. doing data processing and augmentation on CPU instances and neural network training on GPU instances

# __1.12.255__ __2022-07-06__
## __AWS CloudFormation__
  - ### Features
    - My AWS Service (placeholder) - Add a new feature Account-level Targeting for StackSet operation

## __Synthetics__
  - ### Features
    - This release introduces Group feature, which enables users to group cross-region canaries.

# __1.12.254__ __2022-07-05__
## __AWS Config__
  - ### Features
    - Updating documentation service limits

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Adds support for tagging incident-record on creation by providing incident tags in the template within a response-plan.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces additional optional parameters "messageSelectionStrategy" to PromptSpecification, which enables the users to configure the bot to play messages in orderly manner.

## __Amazon QuickSight__
  - ### Features
    - This release allows customers to programmatically create QuickSight accounts with Enterprise and Enterprise + Q editions. It also releases allowlisting domains for embedding QuickSight dashboards at runtime through the embedding APIs.

## __Amazon Relational Database Service__
  - ### Features
    - Adds waiters support for DBCluster.

## __IAM Roles Anywhere__
  - ### Features
    - IAM Roles Anywhere allows your workloads such as servers, containers, and applications to obtain temporary AWS credentials and use the same IAM roles and policies that you have configured for your AWS workloads to access AWS resources.

# __1.12.253__ __2022-07-01__
## __AWS Database Migration Service__
  - ### Features
    - Added new features for AWS DMS version 3.4.7 that includes new endpoint settings for S3, OpenSearch, Postgres, SQLServer and Oracle.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for additional retention periods to Performance Insights.

# __1.12.252__ __2022-06-30__
## __AWS Glue__
  - ### Features
    - This release adds tag as an input of CreateDatabase

## __AWS Price List Service__
  - ### Features
    - Documentation update for GetProducts Response.

## __AWS Well-Architected Tool__
  - ### Features
    - Added support for UpdateGlobalSettings API. Added status filter to ListWorkloadShares and ListLensShares.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for alfresco

## __Amazon Athena__
  - ### Features
    - This feature introduces the API support for Athena's parameterized query and BatchGetPreparedStatement API.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release adds the optional MinAllowedConfidenceScoreForMerging parameter to the CreateDomain, UpdateDomain, and GetAutoMergingPreview APIs in Customer Profiles. This parameter is used as a threshold to influence the profile auto-merging step of the Identity Resolution process.

## __Amazon EMR__
  - ### Features
    - This release adds support for the ExecutionRoleArn parameter in the AddJobFlowSteps and DescribeStep APIs. Customers can use ExecutionRoleArn to specify the IAM role used for each job they submit using the AddJobFlowSteps API.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for managing user availability configurations in Amazon WorkMail.

## __AmazonMWAA__
  - ### Features
    - Documentation updates for Amazon Managed Workflows for Apache Airflow.

# __1.12.251__ __2022-06-29__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for automatic renewal of MediaLive reservations at the end of each reservation term. Automatic renewal is optional. This release also adds support for labelling accessibility-focused audio and caption tracks in HLS outputs.

## __Amazon AppStream__
  - ### Features
    - Includes support for StreamingExperienceSettings in CreateStack and UpdateStack APIs

## __Amazon EMR__
  - ### Features
    - This release introduces additional optional parameter "Throughput" to VolumeSpecification to enable user to configure throughput for gp3 ebs volumes.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds: UpdateFeatureGroup, UpdateFeatureMetadata, DescribeFeatureMetadata APIs; FeatureMetadata type in Search API; LastModifiedTime, LastUpdateStatus, OnlineStoreTotalSizeBytes in DescribeFeatureGroup API.

## __Amazon Translate__
  - ### Features
    - Added ListLanguages API which can be used to list the languages supported by Translate.

## __Elastic Load Balancing__
  - ### Features
    - This release adds two attributes for ALB. One, helps to preserve the host header and the other helps to modify, preserve, or remove the X-Forwarded-For header in the HTTP request.

## __Redshift Serverless__
  - ### Features
    - Add new API operations for Amazon Redshift Serverless, a new way of using Amazon Redshift without needing to manually manage provisioned clusters. The new operations let you interact with Redshift Serverless resources, such as create snapshots, list VPC endpoints, delete resource policies, and more.

# __1.12.250__ __2022-06-28__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Amazon FSx for NetApp ONTAP locations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new spread placement group to EC2 Placement Groups: host level spread, which spread instances between physical hosts, available to Outpost customers only. CreatePlacementGroup and DescribePlacementGroups APIs were updated with a new parameter: SpreadLevel to support this feature.

## __Amazon Polly__
  - ### Features
    - Add 4 new neural voices - Pedro (es-US), Liam (fr-CA), Daniel (de-DE) and Arthur (en-GB).

## __FinSpace Public API__
  - ### Features
    - Release new API GetExternalDataViewAccessDetails

# __1.12.249__ __2022-06-27__
## __AWS IoT__
  - ### Features
    - This release ease the restriction for the input of tag value to align with AWS standard, now instead of min length 1, we change it to min length 0.

# __1.12.248__ __2022-06-24__
## __AWS Glue__
  - ### Features
    - This release enables the new ListCrawls API for viewing the AWS Glue Crawler run history.

## __AWS RDS DataService__
  - ### Features
    - Documentation updates for RDS Data API

# __1.12.247__ __2022-06-23__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has released support for automatic DolbyVision metadata generation when converting HDR10 to DolbyVision.

## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This release adds the new API UpdateRoute that allows route to be updated to ACTIVE/INACTIVE state. In addition, CreateRoute API will now allow users to create route in ACTIVE/INACTIVE state.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds visualizations to the scheduled inference results. Users will be able to see interference results, including diagnostic results from their running inference schedulers.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Ground Truth now supports Virtual Private Cloud. Customers can launch labeling jobs and access to their private workforce in VPC mode.

## __Application Migration Service__
  - ### Features
    - New and modified APIs for the Post-Migration Framework

# __1.12.246__ __2022-06-22__
## __AWS Price List Service__
  - ### Features
    - This release introduces 1 update to the GetProducts API. The serviceCode attribute is now required when you use the GetProductsRequest.

## __AWS Transfer Family__
  - ### Features
    - Until today, the service supported only RSA host keys and user keys. Now with this launch, Transfer Family has expanded the support for ECDSA and ED25519 host keys and user keys, enabling customers to support a broader set of clients by choosing RSA, ECDSA, and ED25519 host and user keys.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

# __1.12.245__ __2022-06-21__
## __AWS Well-Architected Tool__
  - ### Features
    - Adds support for lens tagging, Adds support for multiple helpful-resource urls and multiple improvement-plan urls.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS UpdateService now supports the following parameters: PlacementStrategies, PlacementConstraints and CapacityProviderStrategy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Private IP VPNs, a new feature allowing S2S VPN connections to use private ip addresses as the tunnel outside ip address over Direct Connect as transport.

# __1.12.244__ __2022-06-20__
## __AWS Directory Service__
  - ### Features
    - This release adds support for describing and updating AWS Managed Microsoft AD settings

## __AWS Outposts__
  - ### Features
    - This release adds the AssetLocation structure to the ListAssets response. AssetLocation includes the RackElevation for an Asset.

## __Managed Streaming for Kafka__
  - ### Features
    - Documentation updates to use Az Id during cluster creation.

# __1.12.243__ __2022-06-17__
## __Amazon Connect Service__
  - ### Features
    - This release updates these APIs: UpdateInstanceAttribute, DescribeInstanceAttribute and ListInstanceAttributes. You can use it to programmatically enable/disable High volume outbound communications using attribute type HIGH_VOLUME_OUTBOUND on the specified Amazon Connect instance.

## __Amazon DynamoDB__
  - ### Features
    - Doc only update for DynamoDB service

## __Amazon DynamoDB Streams__
  - ### Features
    - Doc only update for DynamoDB service

## __AmazonConnectCampaignService__
  - ### Features
    - Added Amazon Connect high volume outbound communications SDK.

# __1.12.242__ __2022-06-16__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Added Threats field for security findings. Added new resource details for ECS Container, ECS Task, RDS SecurityGroup, Kinesis Stream, EC2 TransitGateway, EFS AccessPoint, CloudFormation Stack, CloudWatch Alarm, VPC Peering Connection and WAF Rules

## __Redshift Data API Service__
  - ### Features
    - This release adds a new --workgroup-name field to operations that connect to an endpoint. Customers can now execute queries against their serverless workgroups.

# __1.12.241__ __2022-06-15__
## __AWS Service Catalog App Registry__
  - ### Features
    - This release adds a new API ListAttributeGroupsForApplication that returns associated attribute groups of an application. In addition, the UpdateApplication and UpdateAttributeGroup APIs will not allow users to update the 'Name' attribute.

## __Amazon GuardDuty__
  - ### Features
    - Adds finding fields available from GuardDuty Console. Adds FreeTrial related operations. Deprecates the use of various APIs related to Master Accounts and Replace them with Administrator Accounts.

## __Amazon WorkSpaces__
  - ### Features
    - Added new field "reason" to OperationNotSupportedException. Receiving this exception in the DeregisterWorkspaceDirectory API will now return a reason giving more context on the failure.

## __FinSpace Public API__
  - ### Features
    - This release adds a new set of APIs, GetPermissionGroup, DisassociateUserFromPermissionGroup, AssociateUserToPermissionGroup, ListPermissionGroupsByUser, ListUsersByPermissionGroup.

# __1.12.240__ __2022-06-14__
## __AWS Budgets__
  - ### Features
    - Add a budgets ThrottlingException. Update the CostFilters value pattern.

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for rules that constrain Automatic-ABR rendition selection when generating ABR package ladders.

## __Amazon Lookout for Metrics__
  - ### Features
    - Adding filters to Alert and adding new UpdateAlert API.

# __1.12.239__ __2022-06-13__
## __AWS Outposts__
  - ### Features
    - This release adds API operations AWS uses to install Outpost servers.

# __1.12.238__ __2022-06-10__
## __Amazon Fraud Detector__
  - ### Features
    - Documentation updates for Amazon Fraud Detector (AWSHawksNest)

# __1.12.237__ __2022-06-09__
## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for live transcription in AWS GovCloud (US) Regions.

# __1.12.236__ __2022-06-08__
## __AWS Database Migration Service__
  - ### Features
    - This release adds DMS Fleet Advisor APIs and exposes functionality for DMS Fleet Advisor. It adds functionality to create and modify fleet advisor instances, and to collect and analyze information about the local data infrastructure.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWSMainframeModernization__
  - ### Features
    - AWS Mainframe Modernization service is a managed mainframe service and set of tools for planning, migrating, modernizing, and running mainframe workloads on AWS

## __Amazon Neptune__
  - ### Features
    - This release adds support for Neptune to be configured as a global database, with a primary DB cluster in one region, and up to five secondary DB clusters in other regions.

## __Amazon Redshift__
  - ### Features
    - Adds new API GetClusterCredentialsWithIAM to return temporary credentials.

# __1.12.235__ __2022-06-07__
## __AWS Audit Manager__
  - ### Features
    - This release introduces 2 updates to the Audit Manager API. The roleType and roleArn attributes are now required when you use the CreateAssessment or UpdateAssessment operation. We also added a throttling exception to the RegisterAccount API operation.

## __AWS Cost Explorer Service__
  - ### Features
    - Added two new APIs to support cost allocation tags operations: ListCostAllocationTags, UpdateCostAllocationTagsStatus.

# __1.12.234__ __2022-06-06__
## __Amazon Chime SDK Messaging__
  - ### Features
    - This release adds support for searching channels by members via the SearchChannels API, removes required restrictions for Name and Mode in UpdateChannel API and enhances CreateChannel API by exposing member and moderator list as well as channel id as optional parameters.

## __Amazon Connect Service__
  - ### Features
    - This release adds a new API, GetCurrentUserData, which returns real-time details about users' current activity.

# __1.12.233__ __2022-06-02__
## __AWS Proton__
  - ### Features
    - Add new "Components" API to enable users to Create, Delete and Update AWS Proton components.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for GitHub. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-github.html

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Provide Account Level onboarding support through CFN/CLI

## __Amazon Connect Service__
  - ### Features
    - This release adds the following features: 1) New APIs to manage (create, list, update) task template resources, 2) Updates to startTaskContact API to support task templates, and 3) new TransferContact API to programmatically transfer in-progress tasks via a contact flow.

## __Amazon Voice ID__
  - ### Features
    - Added a new attribute ServerSideEncryptionUpdateDetails to Domain and DomainSummary.

## __CodeArtifact__
  - ### Features
    - Documentation updates for CodeArtifact

# __1.12.232__ __2022-06-01__
## __AWS Backup Gateway__
  - ### Features
    - Adds GetGateway and UpdateGatewaySoftwareNow API and adds hypervisor name to UpdateHypervisor API

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for centrally controlling each participant's ability to send and receive audio, video and screen share within a WebRTC session.  Attendee capabilities can be specified when the attendee is created and updated during the session with the new BatchUpdateAttendeeCapabilitiesExcept API.

## __Amazon Forecast Service__
  - ### Features
    - Added Format field to Import and Export APIs in Amazon Forecast. Added TimeSeriesSelector to Create Forecast API.

## __Amazon Route 53__
  - ### Features
    - Add new APIs to support Route 53 IP Based Routing

# __1.12.231__ __2022-05-31__
## __AWS IoT SiteWise__
  - ### Features
    - This release adds the following new optional field to the IoT SiteWise asset resource: assetDescription.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports IP Address propagation for all unauthenticated APIs (e.g. SignUp, ForgotPassword).

## __Amazon Lookout for Metrics__
  - ### Features
    - Adding backtest mode to detectors using the Cloudwatch data source.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Notebook Instances now support Jupyter Lab 3.

## __Amazon Transcribe Service__
  - ### Features
    - Amazon Transcribe now supports automatic language identification for multi-lingual audio in batch mode.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Changed existing APIs and added new APIs to accommodate using multiple AWS accounts with AWS Elastic Disaster Recovery.

# __1.12.230__ __2022-05-27__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports TLS encryption in transit, file system policies and access points for EFS locations.

## __Amazon Appflow__
  - ### Features
    - Adding the following features/changes: Parquet output that preserves typing from the source connector, Failed executions threshold before deactivation for scheduled flows, increasing max size of access and refresh token from 2048 to 4096

## __Amazon EMR Serverless Web Service__
  - ### Bugfixes
    - Removed `AWSEMRServerlessWebClient`, which was released with the incorrect name

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Notebook Instances now allows configuration of Instance Metadata Service version and Amazon SageMaker Studio now supports G5 instance types.

## __EMR Serverless__
  - ### Features
    - This release adds support for Amazon EMR Serverless, a serverless runtime environment that simplifies running analytics applications using the latest open source frameworks such as Apache Spark and Apache Hive.

# __1.12.229__ __2022-05-26__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - C7g instances, powered by the latest generation AWS Graviton3 processors, provide the best price performance in Amazon EC2 for compute-intensive workloads.

## __Amazon Forecast Service__
  - ### Features
    - Introduced a new field in Auto Predictor as Time Alignment Boundary. It helps in aligning the timestamps generated during Forecast exports

## __Amazon Lightsail__
  - ### Features
    - Amazon Lightsail now supports the ability to configure a Lightsail Container Service to pull images from Amazon ECR private repositories in your account.

## __EMR Serverless Web Service__
  - ### Features
    - This release adds support for Amazon EMR Serverless, a serverless runtime environment that simplifies running analytics applications using the latest open source frameworks such as Apache Spark and Apache Hive.

# __1.12.228__ __2022-05-25__
## __AWS App Runner__
  - ### Features
    - Documentation-only update added for CodeConfiguration.

## __AWS CloudFormation__
  - ### Features
    - Add a new parameter statusReason to DescribeStackSetOperation output for additional details

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon FSx__
  - ### Features
    - This release adds root squash support to FSx for Lustre to restrict root level access from clients by mapping root users to a less-privileged user/group with limited permissions.

## __Amazon Lookout for Metrics__
  - ### Features
    - Adding AthenaSourceConfig for MetricSet APIs to support Athena as a data source.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds support for manually selecting features from the input dataset using the CreateAutoMLJob API.

## __Amazon Voice ID__
  - ### Features
    - VoiceID will now automatically expire Speakers if they haven't been accessed for Enrollment, Re-enrollment or Successful Auth for three years. The Speaker APIs now return a "LastAccessedAt" time for Speakers, and the EvaluateSession API returns "SPEAKER_EXPIRED" Auth Decision for EXPIRED Speakers.

# __1.12.227__ __2022-05-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for rules that constrain Automatic-ABR rendition selection when generating ABR package ladders.

## __AWS Network Manager__
  - ### Features
    - This release adds Multi Account API support for a TGW Global Network, to enable and disable AWSServiceAccess with AwsOrganizations for Network Manager service and dependency CloudFormation StackSets service.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports requiring attribute verification (ex. email and phone number) before update.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Stop Protection feature enables customers to protect their instances from accidental stop actions.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Doc-only update. For MessageReviewHandler structure, added timeout period in the description of the fallbackResult field

# __1.12.226__ __2022-05-23__
## __Amazon ElastiCache__
  - ### Features
    - Added support for encryption in transit for Memcached clusters. Customers can now launch Memcached cluster with encryption in transit enabled when using Memcached version 1.6.12 or later.

## __Amazon Forecast Service__
  - ### Features
    - New APIs for Monitor that help you understand how your predictors perform over time.

## __Amazon Personalize__
  - ### Features
    - Adding modelMetrics as part of DescribeRecommender API response for Personalize.

# __1.12.225__ __2022-05-20__
## __Amazon CloudWatch Logs__
  - ### Features
    - Doc-only update to publish the new valid values for log retention

## __Amazon Comprehend__
  - ### Features
    - Comprehend releases 14 new entity types for DetectPiiEntities and ContainsPiiEntities APIs.

# __1.12.224__ __2022-05-19__
## __Amazon Lookout for Metrics__
  - ### Features
    - In this release we added SnsFormat to SNSConfiguration to support human readable alert.

## __GameSparks__
  - ### Features
    - This release adds an optional DeploymentResult field in the responses of GetStageDeploymentIntegrationTests and ListStageDeploymentIntegrationTests APIs.

# __1.12.223__ __2022-05-18__
## __AWS App Mesh__
  - ### Features
    - This release updates the existing Create and Update APIs for meshes and virtual nodes by adding a new IP preference field. This new IP preference field can be used to control the IP versions being used with the mesh and allows for IPv6 support within App Mesh.

## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS IoT Events Data__
  - ### Features
    - Introducing new API for deleting detectors: BatchDeleteDetector.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds the new DeleteDeployment API operation that you can use to delete deployment resources. This release also adds support for discontinued AWS-provided components, so AWS can communicate when a component has any issues that you should consider before you deploy it.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports SetStat server configuration option, which provides the ability to ignore SetStat command issued by file transfer clients, enabling customers to upload files without any errors.

## __Amazon QuickSight__
  - ### Features
    - API UpdatePublicSharingSettings enables IAM admins to enable/disable account level setting for public access of dashboards. When enabled, owners/co-owners for dashboards can enable public access on their dashboards. These dashboards can only be accessed through share link or embedding.

# __1.12.222__ __2022-05-17__
## __AWS Glue__
  - ### Features
    - This release adds a new optional parameter called codeGenNodeConfiguration to CRUD job APIs that allows users to manage visual jobs via APIs. The updated CreateJob and UpdateJob will create jobs that can be viewed in Glue Studio as a visual graph. GetJob can be used to get codeGenNodeConfiguration.

## __AWS Key Management Service__
  - ### Features
    - Add HMAC best practice tip, annual rotation of AWS managed keys.

# __1.12.221__ __2022-05-16__
## __AWS Application Discovery Service__
  - ### Features
    - Add Migration Evaluator Collector details to the GetDiscoverySummary API response

## __AWS Resilience Hub__
  - ### Features
    - In this release, we are introducing support for Amazon Elastic Container Service, Amazon Route 53, AWS Elastic Disaster Recovery, AWS Backup in addition to the existing supported Services.  This release also supports Terraform file input from S3 and scheduling daily assessments

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Service Catalog__
  - ### Features
    - Updated the descriptions for the ListAcceptedPortfolioShares API description and the PortfolioShareType parameters.

## __Amazon CloudFront__
  - ### Features
    - Introduced a new error (TooLongCSPInResponseHeadersPolicy) that is returned when the value of the Content-Security-Policy header in a response headers policy exceeds the maximum allowed length.

## __Amazon Rekognition__
  - ### Features
    - Documentation updates for Amazon Rekognition.

## __Amazon WorkSpaces Web__
  - ### Features
    - Amazon WorkSpaces Web now supports Administrator timeout control

# __1.12.220__ __2022-05-13__
## __Amazon Managed Grafana__
  - ### Features
    - This release adds APIs for creating and deleting API keys in an Amazon Managed Grafana workspace.

# __1.12.219__ __2022-05-12__
## __AWS IoT__
  - ### Features
    - Documentation update for China region ListMetricValues for IoT

## __AWS Lambda__
  - ### Features
    - Lambda releases NodeJs 16 managed runtime to be available in all commercial regions.

## __AWS Outposts__
  - ### Features
    - Documentation updates for AWS Outposts.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Adding support for dynamic SSM Runbook parameter values. Updating validation pattern for engagements. Adding ConflictException to UpdateReplicationSet API contract.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now accepts ECDSA keys for server host keys

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Jira. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-jira.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces a target type Gateway Load Balancer Endpoint for mirrored traffic. Customers can now specify GatewayLoadBalancerEndpoint option during the creation of a traffic mirror target.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Documentation-only updates for IVS Chat API Reference.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to include inactive database bundles in the response of the GetRelationalDatabaseBundles request.

## __Amazon WorkSpaces__
  - ### Features
    - Increased the character limit of the login message from 600 to 850 characters.

## __FinSpace Public API__
  - ### Features
    - We've now deprecated CreateSnapshot permission for creating a data view, instead use CreateDataView permission.

# __1.12.218__ __2022-05-11__
## __AWS Secrets Manager__
  - ### Features
    - Doc only update for Secrets Manager that fixes several customer-reported issues.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release updates AWS PrivateLink APIs to support IPv6 for PrivateLink Services and Endpoints of type 'Interface'.

# __1.12.217__ __2022-05-10__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - AWS Migration Hub Refactor Spaces documentation only update to fix a formatting issue.

## __Amazon EMR__
  - ### Features
    - This release updates the Amazon EMR ModifyInstanceGroups API to support "MERGE" type cluster reconfiguration. Also, added the ability to specify a particular Amazon Linux release for all nodes in a cluster launch request.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added support for using NitroTPM and UEFI Secure Boot on EC2 instances.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds BOTTLEROCKET_ARM_64_NVIDIA and BOTTLEROCKET_x86_64_NVIDIA AMI types to EKS managed nodegroups

# __1.12.216__ __2022-05-09__
## __AWS Cloud Control API__
  - ### Features
    - SDK release for Cloud Control API to include paginators for Python SDK.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Fixed an error in the DescribeEngagement example for AWS Incident Manager.

## __Amazon CloudWatch Evidently__
  - ### Features
    - Add detail message inside GetExperimentResults API response to indicate experiment result availability

# __1.12.215__ __2022-05-06__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds Dvb Dash 2014 as an available profile option for Dash Origin Endpoints.

## __AWS SecurityHub__
  - ### Features
    - Documentation updates for Security Hub API reference

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add new state values for IPAMs, IPAM Scopes, and IPAM Pools.

## __Amazon Location Service__
  - ### Features
    - Amazon Location Service now includes a MaxResults parameter for ListGeofences requests.

## __Amazon Redshift__
  - ### Features
    - Introduces new field 'LoadSampleData' in CreateCluster operation. Customers can now specify 'LoadSampleData' option during creation of a cluster, which results in loading of sample data in the cluster that is created.

## __Amazon Relational Database Service__
  - ### Features
    - Various documentation improvements.

# __1.12.214__ __2022-05-05__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports a new ObjectTags Task API option that can be used to control whether Object Tags are transferred.

## __AWS IoT__
  - ### Features
    - AWS IoT Jobs now allows you to create up to 100,000 active continuous and snapshot jobs by using concurrency control.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports hierarchical facets for a query. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/filtering.html

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 I4i instances are powered by 3rd generation Intel Xeon Scalable processors and feature up to 30 TB of local AWS Nitro SSD storage

# __1.12.213__ __2022-05-04__
## __AWS Backup__
  - ### Features
    - Adds support to 2 new filters about job complete time for 3 list jobs APIs in AWS Backup

## __AWS IoT Secure Tunneling__
  - ### Features
    - This release introduces a new API RotateTunnelAccessToken that allow revoking the existing tokens and generate new tokens

## __Amazon Lightsail__
  - ### Features
    - Documentation updates for Lightsail

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This release adds the TargetMaps parameter in SSM State Manager API.

# __1.12.212__ __2022-05-03__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for allocating Dedicated Hosts on AWS  Outposts. The AllocateHosts API now accepts an OutpostArn request  parameter, and the DescribeHosts API now includes an OutpostArn response parameter.

## __Amazon Kinesis Video Streams__
  - ### Features
    - Add support for multiple image feature related APIs for configuring image generation and notification of a video stream. Add "GET_IMAGES" to the list of supported API names for the GetDataEndpoint API.

## __Amazon Kinesis Video Streams Archived Media__
  - ### Features
    - Add support for GetImages API  for retrieving images from a video stream

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Autopilot adds new metrics for all candidate models generated by Autopilot experiments; RStudio on SageMaker now allows users to bring your own development environment in a custom image.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation only update for doc bug fixes for the S3 API docs.

# __1.12.211__ __2022-05-02__
## __AWS Organizations__
  - ### Features
    - This release adds the INVALID_PAYMENT_INSTRUMENT as a fail reason and an error message.

## __AWS Outposts__
  - ### Features
    - This release adds a new API called ListAssets to the Outposts SDK, which lists the hardware assets in an Outpost.

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics has introduced a new feature to provide customers with an option to delete the underlying resources that Synthetics canary creates when the user chooses to delete the canary.

# __1.12.210__ __2022-04-29__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK nows supports creation of Dolby Vision profile 8.1, the ability to generate black frames of video, and introduces audio-only DASH and CMAF support.

## __AWS WAFV2__
  - ### Features
    - You can now inspect all request headers and all cookies. You can now specify how to handle oversize body contents in your rules that inspect the body.

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Amazon CodeGuru Reviewer now supports suppressing recommendations from being generated on specific files and directories.

## __Amazon Relational Database Service__
  - ### Features
    - Feature - Adds support for Internet Protocol Version 6 (IPv6) on RDS database instances.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Update the StartChangeRequestExecution, adding TargetMaps to the Runbook parameter

# __1.12.209__ __2022-04-28__
## __AWS Audit Manager__
  - ### Features
    - This release adds documentation updates for Audit Manager. We provided examples of how to use the Custom_ prefix for the keywordValue attribute. We also provided more details about the DeleteAssessmentReport operation.

## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall adds support for stateful threat signature AWS managed rule groups.

## __Amazon Connect Service__
  - ### Features
    - This release introduces an API for changing the current agent status of a user in Connect.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to query the public key and creation date of EC2 Key Pairs. Additionally, the format (pem or ppk) of a key pair can be specified when creating a new key pair.

## __Amazon GuardDuty__
  - ### Features
    - Documentation update for API description.

## __Braket__
  - ### Features
    - This release enables Braket Hybrid Jobs with Embedded Simulators to have multiple instances.

# __1.12.208__ __2022-04-27__
## __AWS Amplify__
  - ### Features
    - Documentation only update to support the Amplify GitHub App feature launch

## __AWS CloudTrail__
  - ### Features
    - Increases the retention period maximum to 2557 days. Deprecates unused fields of the ListEventDataStores API response. Updates documentation.

## __AWS IoT Wireless__
  - ### Features
    - Add list support for event configurations, allow to get and update event configurations by resource type, support LoRaWAN events; Make NetworkAnalyzerConfiguration as a resource, add List, Create, Delete API support; Add FCntStart attribute support for ABP WirelessDevice.

## __Amazon Chime SDK Media Pipelines__
  - ### Features
    - For Amazon Chime SDK meetings, the Amazon Chime Media Pipelines SDK allows builders to capture audio, video, and content share streams. You can also capture meeting events, live transcripts, and data messages. The pipelines save the artifacts to an Amazon S3 bucket that you designate.

## __Amazon Lookout for Equipment__
  - ### Features
    - This release adds the following new features: 1) Introduces an option for automatic schema creation 2) Now allows for Ingestion of data containing most common errors and allows automatic data cleaning 3) Introduces new API ListSensorStatistics that gives further information about the ingested data

## __Amazon Rekognition__
  - ### Features
    - This release adds support to configure stream-processor resources for label detections on streaming-videos. UpateStreamProcessor API is also launched with this release, which could be used to update an existing stream-processor.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds support for custom validation dataset and validation ratio through the CreateAutoMLJob and DescribeAutoMLJob APIs.

# __1.12.207__ __2022-04-26__
## __AWS Glue__
  - ### Features
    - This release adds documentation for the APIs to create, read, delete, list, and batch read of AWS Glue custom patterns, and for Lake Formation configuration settings in the AWS Glue crawler.

## __AWS Network Firewall__
  - ### Features
    - AWS Network Firewall now enables customers to use a customer managed AWS KMS key for the encryption of their firewall resources.

## __AWS Price List Service__
  - ### Features
    - Documentation updates for Price List API

## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports the Server-Timing header in HTTP responses sent from CloudFront. You can use this header to view metrics that help you gain insights about the behavior and performance of CloudFront. To use this header, enable it in a response headers policy.

## __Amazon Interactive Video Service Chat__
  - ### Features
    - Adds new APIs for IVS Chat, a feature for building interactive chat experiences alongside an IVS broadcast.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for Lightsail load balancer HTTP to HTTPS redirect and TLS policy configuration.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker Inference Recommender now accepts customer KMS key ID for encryption of endpoints and compilation outputs created during inference recommendation.

# __1.12.206__ __2022-04-25__
## __AWS RDS DataService__
  - ### Features
    - Support to receive SQL query results in the form of a simplified JSON string. This enables developers using the new JSON string format to more easily convert it to an object using popular JSON string parsing libraries.

## __AWS SecurityHub__
  - ### Features
    - Security Hub now lets you opt-out of auto-enabling the defaults standards (CIS and FSBP) in accounts that are auto-enabled with Security Hub via Security Hub's integration with AWS Organizations.

## __Amazon Connect Service__
  - ### Features
    - This release adds SearchUsers API which can be used to search for users with a Connect Instance

## __Amazon GameLift__
  - ### Features
    - Documentation updates for Amazon GameLift.

## __AmazonMQ__
  - ### Features
    - This release adds the CRITICAL_ACTION_REQUIRED broker state and the ActionRequired API property. CRITICAL_ACTION_REQUIRED informs you when your broker is degraded. ActionRequired provides you with a code which you can use to find instructions in the Developer Guide on how to resolve the issue.

# __1.12.205__ __2022-04-22__
## __Amazon Chime SDK Meetings__
  - ### Features
    - Include additional exceptions types.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for waiters that automatically poll for a deleted NAT Gateway until it reaches the deleted state.

# __1.12.204__ __2022-04-21__
## __AWS Glue__
  - ### Features
    - This release adds APIs to create, read, delete, list, and batch read of Glue custom entity types

## __AWS IoT SiteWise__
  - ### Features
    - This release adds 3 new batch data query APIs : BatchGetAssetPropertyValue, BatchGetAssetPropertyValueHistory and BatchGetAssetPropertyAggregates

## __AWS IoT TwinMaker__
  - ### Features
    - General availability (GA) for AWS IoT TwinMaker. For more information, see https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/Welcome.html

## __AWS MediaTailor__
  - ### Features
    - This release introduces tiered channels and adds support for live sources. Customers using a STANDARD channel can now create programs using live sources.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS Storage Gateway__
  - ### Features
    - This release adds support for minimum of 5 character length virtual tape barcodes.

## __Amazon Connect Wisdom Service__
  - ### Features
    - This release updates the GetRecommendations API to include a trigger event list for classifying and grouping recommendations.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Lookout for Metrics__
  - ### Features
    - Added DetectMetricSetConfig API for detecting configuration required for creating metric set from provided S3 data source.

# __1.12.203__ __2022-04-20__
## __Amazon Connect Service__
  - ### Features
    - This release adds APIs to search, claim, release, list, update, and describe phone numbers. You can also use them to associate and disassociate contact flows to phone numbers.

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now indicate how Macie found the sensitive data that produced a finding (originType).

## __Amazon Relational Database Service__
  - ### Features
    - Added a new cluster-level attribute to set the capacity range for Aurora Serverless v2 instances.

## __Application Migration Service__
  - ### Features
    - Removed required annotation from input fields in Describe operations requests. Added quotaValue to ServiceQuotaExceededException

# __1.12.202__ __2022-04-19__
## __AWS Key Management Service__
  - ### Features
    - Adds support for KMS keys and APIs that generate and verify HMAC codes

## __AWS Transfer Family__
  - ### Features
    - This release contains corrected HomeDirectoryMappings examples for several API functions: CreateAccess, UpdateAccess, CreateUser, and UpdateUser,.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Quip. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-quip.html

## __Amazon Personalize__
  - ### Features
    - Adding StartRecommender and StopRecommender APIs for Personalize.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new Austrian German voice - Hannah. Hannah is available as Neural voice only.

## __Amazon Redshift__
  - ### Features
    - Introduces new fields for LogDestinationType and LogExports on EnableLogging requests and Enable/Disable/DescribeLogging responses. Customers can now select CloudWatch Logs as a destination for their Audit Logs.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added offset support for specifying the number of days to wait after the date and time specified by a CRON expression when creating SSM association.

## __Amazon Textract__
  - ### Features
    - This release adds support for specifying and extracting information from documents using the Queries feature within Analyze Document API

## __Amazon WorkLink__
  - ### Features
    - Amazon WorkLink is no longer supported. This will be removed in a future version of the SDK.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling now adds default instance warm-up times for all scaling activities, health check replacements, and other replacement events in the Auto Scaling instance lifecycle.

# __1.12.201__ __2022-04-15__
## __Amazon Athena__
  - ### Features
    - This release adds subfields, ErrorMessage, Retryable, to the AthenaError response object in the GetQueryExecution API when a query fails.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to describe the synchronization status of the account-level block public access feature for your Amazon Lightsail buckets.

## __Amazon Relational Database Service__
  - ### Features
    - Removes Amazon RDS on VMware with the deletion of APIs related to Custom Availability Zones and Media installation

# __1.12.200__ __2022-04-14__
## __AWS Batch__
  - ### Features
    - Enables configuration updates for compute environments with BEST_FIT_PROGRESSIVE and SPOT_CAPACITY_OPTIMIZED allocation strategies.

## __AWS Glue__
  - ### Features
    - Auto Scaling for Glue version 3.0 and later jobs to dynamically scale compute resources. This SDK change provides customers with the auto-scaled DPU usage

## __AWS SDK for Java__
  - ### Features
    - Pass _X_AMZN_TRACE_ID environment variable through to X-Amzn-Trace-Id header for AWS services running on Lambda.

## __Amazon AppStream__
  - ### Features
    - Includes updates for create and update fleet APIs to manage the session scripts locations for Elastic fleets.

## __Amazon Appflow__
  - ### Features
    - Enables users to pass custom token URL parameters for Oauth2 authentication during create connector profile

## __Amazon CloudWatch__
  - ### Features
    - Updates documentation for additional statistics in CloudWatch Metric Streams.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

# __1.12.199__ __2022-04-13__
## __Amazon CloudWatch__
  - ### Features
    - Adds support for additional statistics in CloudWatch Metric Streams.

## __Amazon FSx__
  - ### Features
    - This release adds support for deploying FSx for ONTAP file systems in a single Availability Zone.

# __1.12.198__ __2022-04-12__
## __AWS IoT TwinMaker__
  - ### Features
    - This release adds the following new features: 1) ListEntities API now supports search using ExternalId. 2) BatchPutPropertyValue and GetPropertyValueHistory API now allows users to represent time in sub-second level precisions.

## __Amazon DevOps Guru__
  - ### Features
    - This release adds new APIs DeleteInsight to deletes the insight along with the associated anomalies, events and recommendations.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - X2idn and X2iedn instances are powered by 3rd generation Intel Xeon Scalable processors with an all-core turbo frequency up to 3.5 GHzAmazon EC2. C6a instances are powered by 3rd generation AMD EPYC processors.

## __Amazon Elastic File System__
  - ### Features
    - Amazon EFS adds support for a ThrottlingException when using the CreateAccessPoint API if the account is nearing the AccessPoint limit(120).

# __1.12.197__ __2022-04-11__
## __AWS Amplify UI Builder__
  - ### Features
    - In this release, we have added the ability to bind events to component level actions.

## __AWS App Runner__
  - ### Features
    - This release adds tracing for App Runner services with X-Ray using AWS Distro for OpenTelemetry. New APIs: CreateObservabilityConfiguration, DescribeObservabilityConfiguration, ListObservabilityConfigurations, and DeleteObservabilityConfiguration. Updated APIs: CreateService and UpdateService.

## __Amazon WorkSpaces__
  - ### Features
    - Added API support that allows customers to create GPU-enabled WorkSpaces using EC2 G4dn instances.

# __1.12.196__ __2022-04-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for the pass-through of WebVTT styling to WebVTT outputs, pass-through of KLV metadata to supported formats, and improved filter support for processing 444/RGB content.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - This release adds ScteMarkersSource as an available field for Dash Packaging Configurations. When set to MANIFEST, MediaPackage will source the SCTE-35 markers from the manifest. When set to SEGMENTS, MediaPackage will source the SCTE-35 markers from the segments.

## __AWS WAFV2__
  - ### Features
    - Add a new CurrentDefaultVersion field to ListAvailableManagedRuleGroupVersions API response; add a new VersioningSupported boolean to each ManagedRuleGroup returned from ListAvailableManagedRuleGroups API response.

# __1.12.195__ __2022-04-07__
## __AWS Performance Insights__
  - ### Features
    - Adds support for DocumentDB to the Performance Insights API.

## __Amazon API Gateway__
  - ### Features
    - ApiGateway CLI command get-usage now includes usagePlanId, startDate, and endDate fields in the output to match documentation.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - Added support to enable/disable performance insights when creating or modifying db instances

## __Amazon EventBridge__
  - ### Features
    - Adds new EventBridge Endpoint resources for disaster recovery, multi-region failover, and cross-region replication capabilities to help you build resilient event-driven applications.

## __Amazon Personalize__
  - ### Features
    - This release provides tagging support in AWS Personalize.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon Sagemaker Notebook Instances now supports G5 instance types

# __1.12.194__ __2022-04-06__
## __AWS Config__
  - ### Features
    - Add resourceType enums for AWS::EMR::SecurityConfiguration and AWS::SageMaker::CodeRepository

## __AWS Lambda__
  - ### Features
    - This release adds new APIs for creating and managing Lambda Function URLs and adds a new FunctionUrlAuthType parameter to the AddPermission API. Customers can use Function URLs to create built-in HTTPS endpoints on their functions.

## __AWS Panorama__
  - ### Features
    - Added Brand field to device listings.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Box. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-box.html

# __1.12.193__ __2022-04-05__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Amazon FSx for OpenZFS locations.

## __AWS S3 Control__
  - ### Features
    - Documentation-only update for doc bug fixes for the S3 Control API docs.

## __AWS SecurityHub__
  - ### Features
    - Added additional ASFF details for RdsSecurityGroup AutoScalingGroup, ElbLoadBalancer, CodeBuildProject and RedshiftCluster.

## __Amazon FSx__
  - ### Features
    - Provide customers more visibility into file system status by adding new "Misconfigured Unavailable" status for Amazon FSx for Windows File Server.

# __1.12.192__ __2022-04-04__
## __AWS IoT__
  - ### Features
    - AWS IoT - AWS IoT Device Defender adds support to list metric datapoints collected for IoT devices through the ListMetricValues API

## __AWS Proton__
  - ### Features
    - SDK release to support tagging for AWS Proton Repository resource

## __AWS Server Migration Service__
  - ### Features
    - Revised product update notice for SMS console deprecation.

## __AWS Service Catalog__
  - ### Features
    - This release adds ProvisioningArtifictOutputKeys to DescribeProvisioningParameters to reference the outputs of a Provisioned Product and deprecates ProvisioningArtifactOutputs.

# __1.12.191__ __2022-04-01__
## __Amazon Connect Service__
  - ### Features
    - This release updates these APIs: UpdateInstanceAttribute, DescribeInstanceAttribute and ListInstanceAttributes. You can use it to programmatically enable/disable multi-party conferencing using attribute type MULTI_PARTY_CONFERENCING on the specified Amazon Connect instance.

# __1.12.190__ __2022-03-31__
## __AWS Audit Manager__
  - ### Features
    - This release adds documentation updates for Audit Manager. The updates provide data deletion guidance when a customer deregisters Audit Manager or deregisters a delegated administrator.

## __AWS Cloud Control API__
  - ### Features
    - SDK release for Cloud Control API in Amazon Web Services China (Beijing) Region, operated by Sinnet, and Amazon Web Services China (Ningxia) Region, operated by NWCD

## __AWS Glue DataBrew__
  - ### Features
    - This AWS Glue Databrew release adds feature to support ORC as an input format.

## __Amazon Managed Grafana__
  - ### Features
    - This release adds tagging support to the Managed Grafana service. New APIs: TagResource, UntagResource and ListTagsForResource. Updates: add optional field tags to support tagging while calling CreateWorkspace.

## __Amazon Pinpoint SMS Voice V2__
  - ### Features
    - Amazon Pinpoint now offers a version 2.0 suite of SMS and voice APIs, providing increased control over sending and configuration. This release is a new SDK for sending SMS and voice messages called PinpointSMSVoiceV2.

## __Amazon WorkSpaces__
  - ### Features
    - Added APIs that allow you to customize the logo, login message, and help links in the WorkSpaces client login page. To learn more, visit https://docs.aws.amazon.com/workspaces/latest/adminguide/customize-branding.html

## __Route53 Recovery Cluster__
  - ### Features
    - This release adds a new API "ListRoutingControls" to list routing control states using the highly reliable Route 53 ARC data plane endpoints.

# __1.12.189__ __2022-03-30__
## __AWS IoT__
  - ### Features
    - Doc only update for IoT that fixes customer-reported issues.

## __AWS IoT Data Plane__
  - ### Features
    - Update the default AWS IoT Core Data Plane endpoint from VeriSign signed to ATS signed. If you have firewalls with strict egress rules, configure the rules to grant you access to data-ats.iot.[region].amazonaws.com or data-ats.iot.[region].amazonaws.com.cn.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release simplifies the auto-recovery configuration process enabling customers to set the recovery behavior to disabled or default

## __Amazon FSx__
  - ### Features
    - This release adds support for modifying throughput capacity for FSx for ONTAP file systems.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports the configuration of third-party policies that can use either the centralized or distributed deployment models.

# __1.12.188__ __2022-03-29__
## __AWS Organizations__
  - ### Features
    - This release provides the new CloseAccount API that enables principals in the management account to close any member account within an organization.

# __1.12.187__ __2022-03-28__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Updating service name entities

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for selecting a maintenance window.

## __AWS SDK for Java__
  - ### Features
    - Bump Jackson version to 2.12.6.1
    - Improve resilience of instance profile credentials provider to short-term outages. Credentials that are close to expiration or expired can still be used to sign calls when the instance metadata service appears to be having issues. Services are now responsible for determining whether the credentials have actually expired.

# __1.12.186__ __2022-03-25__
## __AWS Batch__
  - ### Features
    - Bug Fix: Fixed a bug where shapes were marked as unboxed and were not serialized and sent over the wire, causing an API error from the service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This is release adds support for Amazon VPC Reachability Analyzer to analyze path through a Transit Gateway.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating, updating, and deleting Patch Baselines for Rocky Linux OS.

# __1.12.185__ __2022-03-24__
## __AWS Config__
  - ### Features
    - Added new APIs GetCustomRulePolicy and GetOrganizationCustomRulePolicy, and updated existing APIs PutConfigRule, DescribeConfigRule, DescribeConfigRuleEvaluationStatus, PutOrganizationConfigRule, DescribeConfigRule to support a new feature for building AWS Config rules with AWS CloudFormation Guard

## __AWS Lambda__
  - ### Features
    - Adds support for increased ephemeral storage (/tmp) up to 10GB for Lambda functions. Customers can now provision up to 10 GB of ephemeral storage per function instance, a 20x increase over the previous limit of 512 MB.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds an additional parameter for subtitling with Amazon Transcribe batch jobs: outputStartIndex.

# __1.12.184__ __2022-03-23__
## __AWS Audit Manager__
  - ### Features
    - This release updates 1 API parameter, the SnsArn attribute. The character length and regex pattern for the SnsArn attribute have been updated, which enables you to deselect an SNS topic when using the UpdateSettings operation.

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for AWS Transfer Family to describe how to remove an associated workflow from a server.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Block Store__
  - ### Features
    - Increased the maximum supported value for the Timeout parameter of the StartSnapshot API from 60 minutes to 4320 minutes.  Changed the HTTP error code for ConflictException from 503 to 409.

## __Amazon Redshift__
  - ### Features
    - This release adds a new [--encrypted | --no-encrypted] field in restore-from-cluster-snapshot API. Customers can now restore an unencrypted snapshot to a cluster encrypted with AWS Managed Key or their own KMS key.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Update AddTagsToResource, ListTagsForResource, and RemoveTagsFromResource APIs to reflect the support for tagging Automation resources. Includes other minor documentation updates.

## __GameSparks__
  - ### Features
    - Released the preview of Amazon GameSparks, a fully managed AWS service that provides a multi-service backend for game developers.

# __1.12.183__ __2022-03-22__
## __AWS Cost Explorer Service__
  - ### Features
    - Added three new APIs to support tagging and resource-level authorization on Cost Explorer resources: TagResource, UntagResource, ListTagsForResource.  Added optional parameters to CreateCostCategoryDefinition, CreateAnomalySubscription and CreateAnomalyMonitor APIs to support Tag On Create.

## __AWS Lake Formation__
  - ### Features
    - The release fixes the incorrect permissions called out in the documentation - DESCRIBE_TAG, ASSOCIATE_TAG, DELETE_TAG, ALTER_TAG. This trebuchet release fixes the corresponding SDK and documentation.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets

## __Amazon Location Service__
  - ### Features
    - Amazon Location Service now includes a MaxResults parameter for GetDevicePositionHistory requests.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new Catalan voice - Arlet. Arlet is available as Neural voice only.

# __1.12.182__ __2022-03-21__
## __AWS MediaConnect__
  - ### Features
    - This release adds support for selecting a maintenance window.

## __AWS Resource Access Manager__
  - ### Features
    - Document improvements to the RAM API operations and parameter descriptions.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Add support for media replication to link multiple WebRTC media sessions together to reach larger and global audiences. Participants connected to a replica session can be granted access to join the primary session and can switch sessions with their existing WebRTC connection

## __Amazon EC2 Container Registry__
  - ### Features
    - This release includes a fix in the DescribeImageScanFindings paginated output.

## __Amazon QuickSight__
  - ### Features
    - AWS QuickSight Service Features - Expand public API support for group management.

# __1.12.181__ __2022-03-18__
## __AWS Glue__
  - ### Features
    - Added 9 new APIs for AWS Glue Interactive Sessions: ListSessions, StopSession, CreateSession, GetSession, DeleteSession, RunStatement, GetStatement, ListStatements, CancelStatement

# __1.12.180__ __2022-03-16__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - AWS Certificate Manager (ACM) Private Certificate Authority (CA) now supports customizable certificate subject names and extensions.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Removed incorrect validation pattern for IncidentRecordSource.invokedBy

## __AWSBillingConductor__
  - ### Features
    - This is the initial SDK release for AWS Billing Conductor. The AWS Billing Conductor is a customizable billing service, allowing you to customize your billing data to match your desired business structure.

## __Amazon S3 on Outposts__
  - ### Features
    - S3 on Outposts is releasing a new API, ListSharedEndpoints, that lists all endpoints associated with S3 on Outpost, that has been shared by Resource Access Manager (RAM).

## __AmplifyBackend__
  - ### Features
    - Adding the ability to customize Cognito verification messages for email and SMS in CreateBackendAuth and UpdateBackendAuth. Adding deprecation documentation for ForgotPassword in CreateBackendAuth and UpdateBackendAuth

# __1.12.179__ __2022-03-15__
## __AWS Data Exchange__
  - ### Features
    - This feature enables data providers to use the RevokeRevision operation to revoke subscriber access to a given revision. Subscribers are unable to interact with assets within a revoked revision.

## __AWS RoboMaker__
  - ### Features
    - This release deprecates ROS, Ubuntu and Gazbeo from RoboMaker Simulation Service Software Suites in favor of user-supplied containers and Relaxed Software Suites.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Updated EmailConfigurationType and SmsConfigurationType to reflect that you can now choose Amazon SES and Amazon SNS resources in the same Region.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds the Cascade parameter to the DeleteIpam API. Customers can use this parameter to automatically delete their IPAM, including non-default scopes, pools, cidrs, and allocations. There mustn't be any pools provisioned in the default public scope to use this parameter.

## __Amazon Keyspaces__
  - ### Features
    - Fixing formatting issues in CLI and SDK documentation

## __Amazon Location Service__
  - ### Features
    - New HERE style "VectorHereExplore" and "VectorHereExploreTruck".

## __Amazon Relational Database Service__
  - ### Features
    - Various documentation improvements

# __1.12.178__ __2022-03-14__
## __AWS Config__
  - ### Features
    - Add resourceType enums for AWS::ECR::PublicRepository and AWS::EC2::LaunchTemplate

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Slack. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-slack.html

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Timestream Query__
  - ### Features
    - Amazon Timestream Scheduled Queries now support Timestamp datatype in a multi-measure record.

# __1.12.177__ __2022-03-11__
## __AWS Lambda__
  - ### Features
    - Adds PrincipalOrgID support to AddPermission API. Customers can use it to manage permissions to lambda functions at AWS Organizations level.

## __AWS Outposts__
  - ### Features
    - This release adds address filters for listSites

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector Logging APIs will now support MediaMetricLogs. Also CreateMeetingDialOut now returns AccessDeniedException.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for enabling Rich Messaging when starting a new chat session via the StartChatContact API. Rich Messaging enables the following formatting options: bold, italics, hyperlinks, bulleted lists, and numbered lists.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe StartTranscription API now supports additional parameters for Language Identification feature: customVocabularies and customFilterVocabularies

# __1.12.176__ __2022-03-10__
## __AWS Transfer Family__
  - ### Features
    - Adding more descriptive error types for managed workflows

## __Amazon Lex Model Building V2__
  - ### Features
    - This release makes slotTypeId an optional parameter in CreateSlot and UpdateSlot APIs in Amazon Lex V2 for model building. Customers can create and update slots without specifying a slot type id.

## __Amazon Transcribe Service__
  - ### Features
    - Documentation fix for API `StartMedicalTranscriptionJobRequest`, now showing min sample rate as 16khz

# __1.12.175__ __2022-03-09__
## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports extracting the sentiment associated with entities such as brands, products and services from text documents.

# __1.12.174__ __2022-03-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for reading timecode from AVCHD sources and now provides the ability to segment WebVTT at the same interval as the video and audio in HLS packages.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Introducing a new enum for NodeGroup error code: Ec2SubnetMissingIpv6Assignment

## __Amazon Keyspaces__
  - ### Features
    - Adding link to CloudTrail section in Amazon Keyspaces Developer Guide

# __1.12.173__ __2022-03-07__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - AWS Migration Hub Refactor Spaces documentation update.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds support for Transcribe language identification feature to the StartMeetingTranscription API.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS UpdateService API now supports additional parameters: loadBalancers, propagateTags, enableECSManagedTags, and serviceRegistries

# __1.12.172__ __2022-03-04__
## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Transfer Family__
  - ### Features
    - Add waiters for server online and offline.

## __Amazon Connect Service__
  - ### Features
    - This release updates the *InstanceStorageConfig APIs so they support a new ResourceType: REAL_TIME_CONTACT_ANALYSIS_SEGMENTS. Use this resource type to enable streaming for real-time contact analysis and to associate the Kinesis stream where real-time contact analysis segments will be published.

## __Amazon DevOps Guru__
  - ### Features
    - Amazon DevOps Guru now integrates with Amazon CodeGuru Profiler. You can view CodeGuru Profiler recommendations for your AWS Lambda function in DevOps Guru. This feature is enabled by default for new customers as of 3/4/2022. Existing customers can enable this feature with UpdateEventSourcesConfig.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for Amazon EC2.

## __Amazon Macie__
  - ### Features
    - Amazon Macie Classic (macie) has been discontinued and is no longer available. A new Amazon Macie (macie2) is now available with significant design improvements and additional features.

## __Synthetics__
  - ### Features
    - Allow custom handler function.

# __1.12.171__ __2022-03-03__
## __AWS IoT Greengrass V2__
  - ### Features
    - Doc only update that clarifies Create Deployment section.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now suggests spell corrections for a query. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/query-spell-check.html

## __Amazon Appflow__
  - ### Features
    - Launching Amazon AppFlow Marketo as a destination connector SDK.

## __Amazon FSx__
  - ### Features
    - This release adds support for data repository associations to use root ("/") as the file system path

## __Amazon Timestream Query__
  - ### Features
    - Documentation only update for SDK and CLI

# __1.12.170__ __2022-03-02__
## __AWS CloudTrail__
  - ### Features
    - Add bytesScanned field into responses of DescribeQuery and GetQueryResults.

## __Amazon Athena__
  - ### Features
    - This release adds support for S3 Object Ownership by allowing the S3 bucket owner full control canned ACL to be set when Athena writes query results to S3 buckets.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds support for tracking images lastRecordedPullTime.

## __Amazon GameLift__
  - ### Features
    - Minor updates to address errors.

## __Amazon Keyspaces__
  - ### Features
    - This release adds support for data definition language (DDL) operations

# __1.12.169__ __2022-03-01__
## __AWS Elemental MediaPackage__
  - ### Features
    - This release adds Hybridcast as an available profile option for Dash Origin Endpoints.

## __Amazon Relational Database Service__
  - ### Features
    - Documentation updates for Multi-AZ DB clusters.

## __Application Migration Service__
  - ### Features
    - Add support for GP3 and IO2 volume types. Add bootMode to LaunchConfiguration object (and as a parameter to UpdateLaunchConfigurationRequest).

## __Managed Streaming for Kafka Connect__
  - ### Features
    - Adds operation for custom plugin deletion (DeleteCustomPlugin) and adds new StateDescription field to DescribeCustomPlugin and DescribeConnector responses to return errors from asynchronous resource creation.

# __1.12.168__ __2022-02-28__
## __AWS Amplify__
  - ### Features
    - Add repositoryCloneMethod field for hosting an Amplify app. This field shows what authorization method is used to clone the repo: SSH, TOKEN, or SIGV4.

## __AWS Amplify UI Builder__
  - ### Features
    - We are adding the ability to configure workflows and actions for components.

## __AWS Fault Injection Simulator__
  - ### Features
    - This release adds logging support for AWS Fault Injection Simulator experiments. Experiment templates can now be configured to send experiment activity logs to Amazon CloudWatch Logs or to an S3 bucket.

## __AWS Service Catalog App Registry__
  - ### Features
    - AppRegistry is deprecating Application and Attribute-Group Name update feature. In this release, we are marking the name attributes for Update APIs as deprecated to give a heads up to our customers.

## __Amazon Athena__
  - ### Features
    - This release adds support for updating an existing named query.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for new AMI property 'lastLaunchedTime'

## __Amazon FSx__
  - ### Features
    - This release adds support for the following FSx for OpenZFS features: snapshot lifecycle transition messages, force flag for deleting file systems with child resources, LZ4 data compression, custom record sizes, and unsetting volume quotas and reservations.

## __FinSpace Public API__
  - ### Features
    - Add new APIs for managing Users and Permission Groups.

## __Route53 Recovery Cluster__
  - ### Features
    - This release adds a new API option to enable overriding safety rules to allow routing control state updates.

# __1.12.167__ __2022-02-25__
## __AWS Panorama__
  - ### Features
    - Added NTP server configuration parameter to ProvisionDevice operation. Added alternate software fields to DescribeDevice response

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

# __1.12.166__ __2022-02-24__
## __AWS Glue DataBrew__
  - ### Features
    - This AWS Glue Databrew release adds feature to merge job outputs into a max number of files for S3 File output type.

## __AWS S3 Control__
  - ### Features
    - Amazon S3 Batch Operations adds support for new integrity checking capabilities in Amazon S3.

## __AWS Transfer Family__
  - ### Features
    - Support automatic pagination when listing AWS Transfer Family resources.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to delete and create Lightsail default key pairs that you can use with Lightsail instances.

## __Amazon Route 53__
  - ### Features
    - SDK doc update for Route 53 to update some parameters with new information.

## __Amazon Simple Storage Service__
  - ### Features
    - This release adds support for new integrity checking capabilities in Amazon S3. You can choose from four supported checksum algorithms for data integrity checking on your upload and download requests. In addition, AWS SDK can automatically calculate a checksum as it streams data into S3

## __Auto Scaling__
  - ### Features
    - You can now hibernate instances in a warm pool to stop instances without deleting their RAM contents. You can now also return instances to the warm pool on scale in, instead of always terminating capacity that you will need later.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports the configuration of AWS Network Firewall policies with either centralized or distributed deployment models. This release also adds support for custom endpoint configuration, where you can choose which Availability Zones to create firewall endpoints in.

# __1.12.165__ __2022-02-23__
## __AWS Lambda__
  - ### Features
    - Lambda releases .NET 6 managed runtime to be available in all commercial regions.

## __AWS Transfer Family__
  - ### Features
    - The file input selection feature provides the ability to use either the originally uploaded file or the output file from the previous workflow step, enabling customers to make multiple copies of the original file while keeping the source file intact for file archival.

## __Amazon Textract__
  - ### Features
    - Added support for merged cells and column header for table response.

# __1.12.164__ __2022-02-22__
## __AWS App Runner__
  - ### Features
    - AWS App Runner adds a Java platform (Corretto 8, Corretto 11 runtimes) and a Node.js 14 runtime.

## __AWS WAFV2__
  - ### Features
    - Updated descriptions for logging configuration.

## __Amazon Translate__
  - ### Features
    - This release enables customers to use translation settings for formality customization in their synchronous translation output.

# __1.12.163__ __2022-02-21__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces apis CreateIntegrationWorkflow, DeleteWorkflow, ListWorkflows, GetWorkflow and GetWorkflowSteps. These apis are used to manage and view integration workflows.

## __Amazon DynamoDB__
  - ### Features
    - DynamoDB ExecuteStatement API now supports Limit as a request parameter to specify the maximum number of items to evaluate. If specified, the service will process up to the Limit and the results will include a LastEvaluatedKey value to continue the read in a subsequent operation.

## __EC2 Image Builder__
  - ### Features
    - This release adds support to enable faster launching for Windows AMIs created by EC2 Image Builder.

# __1.12.162__ __2022-02-18__
## __AWS Budgets__
  - ### Features
    - This change introduces DescribeBudgetNotificationsForAccount API which returns budget notifications for the specified account

## __AWS Transfer Family__
  - ### Features
    - Properties for Transfer Family used with SFTP, FTP, and FTPS protocols. Display Banners are bodies of text that can be displayed before and/or after a user authenticates onto a server using one of the previously mentioned protocols.

## __Amazon GameLift__
  - ### Features
    - Increase string list limit from 10 to 100.

# __1.12.161__ __2022-02-17__
## __AWS Backup__
  - ### Features
    - AWS Backup add new S3_BACKUP_OBJECT_FAILED and S3_RESTORE_OBJECT_FAILED event types in BackupVaultNotifications events list.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __Amazon CloudWatch Evidently__
  - ### Features
    - Add support for filtering list of experiments and launches by status

## __Amazon Redshift__
  - ### Features
    - SDK release for Cross region datasharing and cost-control for cross region datasharing

# __1.12.160__ __2022-02-16__
## __AWS Budgets__
  - ### Features
    - Adds support for auto-adjusting budgets, a new budget method alongside fixed and planned. Auto-adjusting budgets introduces new metadata to configure a budget limit baseline using a historical lookback average or current period forecast.

## __AWS Cost Explorer Service__
  - ### Features
    - AWS Cost Anomaly Detection now supports SNS FIFO topic subscribers.

## __AWS Glue__
  - ### Features
    - Support for optimistic locking in UpdateTable

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Assorted ticket fixes and updates for AWS Systems Manager.

# __1.12.159__ __2022-02-14__
## __Amazon Appflow__
  - ### Features
    - Launching Amazon AppFlow SAP as a destination connector SDK.

## __Amazon Athena__
  - ### Features
    - This release adds a subfield, ErrorType, to the AthenaError response object in the GetQueryExecution API when a query fails.

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for determining which Aurora PostgreSQL versions support Babelfish.

# __1.12.158__ __2022-02-11__
## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for AWS Systems Manager.

# __1.12.157__ __2022-02-10__
## __AWS CloudFormation__
  - ### Features
    - This SDK release adds AWS CloudFormation Hooks HandlerErrorCodes

## __AWS WAFV2__
  - ### Features
    - Adds support for AWS WAF Fraud Control account takeover prevention (ATP), with configuration options for the new managed rule group AWSManagedRulesATPRuleSet and support for application integration SDKs for Android and iOS mobile apps.

## __Amazon Lookout for Vision__
  - ### Features
    - This release makes CompilerOptions in Lookout for Vision's StartModelPackagingJob's Configuration object optional.

## __Amazon Pinpoint__
  - ### Features
    - This SDK release adds a new paramater creation date for GetApp and GetApps Api call

## __Amazon Simple Notification Service__
  - ### Features
    - Customer requested typo fix in API documentation.

# __1.12.156__ __2022-02-09__
## __AWS CloudFormation__
  - ### Features
    - This SDK release is for the feature launch of AWS CloudFormation Hooks.

# __1.12.155__ __2022-02-08__
## __AWS App Runner__
  - ### Features
    - This release adds support for App Runner to route outbound network traffic of a service through an Amazon VPC. New API: CreateVpcConnector, DescribeVpcConnector, ListVpcConnectors, and DeleteVpcConnector. Updated API: CreateService, DescribeService, and UpdateService.

## __AWS S3 Control__
  - ### Features
    - This release adds support for S3 Batch Replication. Batch Replication lets you replicate existing objects, already replicated objects to new destinations, and objects that previously failed to replicate. Customers will receive object-level visibility of progress and a detailed completion report.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Amazon FSx. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-fsx.html

## __Amazon SageMaker Service__
  - ### Features
    - Autopilot now generates an additional report with information on the performance of the best model, such as a Confusion matrix and  Area under the receiver operating characteristic (AUC-ROC). The path to the report can be found in CandidateArtifactLocations.

# __1.12.154__ __2022-02-07__
## __AWS Audit Manager__
  - ### Features
    - This release updates 3 API parameters. UpdateAssessmentFrameworkControlSet now requires the controls attribute, and CreateAssessmentFrameworkControl requires the id attribute. Additionally, UpdateAssessmentFramework now has a minimum length constraint for the controlSets attribute.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Update RelatedItem enum to support SSM Automation

## __Amazon EventBridge__
  - ### Features
    - Documentation updates for EventBridge

## __Synthetics__
  - ### Features
    - Adding names parameters to the Describe APIs.

# __1.12.153__ __2022-02-04__
## __AWS Lake Formation__
  - ### Features
    - Add support for calling Update Table Objects without a TransactionId.

## __Amazon Athena__
  - ### Features
    - You can now optionally specify the account ID that you expect to be the owner of your query results output location bucket in Athena. If the account ID of the query results bucket owner does not match the specified account ID, attempts to output to the bucket will fail with an S3 permissions error.

## __Amazon Relational Database Service__
  - ### Features
    - updates for RDS Custom for Oracle 12.1 support

# __1.12.152__ __2022-02-03__
## __AWS RoboMaker__
  - ### Features
    - The release deprecates the use various APIs of RoboMaker Deployment Service in favor of AWS IoT GreenGrass v2.0.

## __AWSMarketplace Metering__
  - ### Features
    - Add CustomerAWSAccountId to ResolveCustomer API response and increase UsageAllocation limit to 2500.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - adds support for AMIs in Recycle Bin

## __Amazon Recycle Bin__
  - ### Features
    - Add EC2 Image recycle bin support.

# __1.12.151__ __2022-02-02__
## __AWS Cost Explorer Service__
  - ### Features
    - Doc-only update for Cost Explorer API that adds INVOICING_ENTITY dimensions

## __AWS Fault Injection Simulator__
  - ### Features
    - Added GetTargetResourceType and ListTargetResourceTypesAPI actions. These actions return additional details about resource types and parameters that can be targeted by FIS actions. Added a parameters field for the targets that can be specified in experiment templates.

## __AWS Glue__
  - ### Features
    - Launch Protobuf support for AWS Glue Schema Registry

## __AWS IoT__
  - ### Features
    - This release adds support for configuring AWS IoT logging level per client ID, source IP, or principal ID.

## __Amazon Appflow__
  - ### Features
    - Launching Amazon AppFlow Custom Connector SDK.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports sharing and importing custom trained models from one AWS account to another within the same region.

## __Amazon DynamoDB__
  - ### Features
    - Documentation update for DynamoDB Java SDK.

## __Amazon EMR__
  - ### Features
    - Documentation updates for Amazon EMR.

## __Amazon ElastiCache__
  - ### Features
    - Documentation update for AWS ElastiCache

## __Amazon Elasticsearch Service__
  - ### Features
    - Allows customers to get progress updates for blue/green deployments

## __Amazon Personalize__
  - ### Features
    - Adding minRecommendationRequestsPerSecond attribute to recommender APIs.

# __1.12.150__ __2022-01-28__
## __AWS AppConfig Data__
  - ### Features
    - Documentation updates for AWS AppConfig Data.

## __AWS Secrets Manager__
  - ### Features
    - Feature are ready to release on Jan 28th

## __Amazon AppConfig__
  - ### Features
    - Documentation updates for AWS AppConfig

## __Amazon Athena__
  - ### Features
    - This release adds a field, AthenaError, to the GetQueryExecution response object when a query fails.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Doc updates for Cognito user pools API Reference.

## __Amazon SageMaker Service__
  - ### Features
    - This release added a new NNA accelerator compilation support for Sagemaker Neo.

# __1.12.149__ __2022-01-27__
## __AWS Amplify__
  - ### Features
    - Doc only update to the description of basicauthcredentials to describe the required encoding and format.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for configuring a custom chat duration when starting a new chat session via the StartChatContact API. The default value for chat duration is 25 hours, minimum configurable value is 1 hour (60 minutes) and maximum configurable value is 7 days (10,080 minutes).

## __Amazon Elastic Compute Cloud__
  - ### Features
    - X2ezn instances are powered by Intel Cascade Lake CPUs that deliver turbo all core frequency of up to 4.5 GHz and up to 100 Gbps of networking bandwidth

## __Amazon OpenSearch Service__
  - ### Features
    - Allows customers to get progress updates for blue/green deployments

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has updated the CreateCluster and UpdateBrokerStorage API that allows you to specify volume throughput during cluster creation and broker volume updates.

# __1.12.148__ __2022-01-26__
## __AWS SecurityHub__
  - ### Features
    - Adding top level Sample boolean field

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Added failure state and adjusted timeout in waiter

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS Direct APIs.

## __Amazon Fraud Detector__
  - ### Features
    - Added new APIs for viewing past predictions and obtaining prediction metadata including prediction explanations: ListEventPredictions and GetEventPredictionMetadata

## __Amazon SageMaker Service__
  - ### Features
    - API changes relating to Fail steps in model building pipeline and add PipelineExecutionFailureReason in PipelineExecutionSummary.

# __1.12.147__ __2022-01-25__
## __Amazon Connect Service__
  - ### Features
    - This release adds support for custom vocabularies to be used with Contact Lens. Custom vocabularies improve transcription accuracy for one or more specific words.

## __Amazon Elastic File System__
  - ### Features
    - Use Amazon EFS Replication to replicate your Amazon EFS file system in the AWS Region of your preference.

## __Amazon FSx__
  - ### Features
    - This release adds support for growing SSD storage capacity and growing/shrinking SSD IOPS for FSx for ONTAP file systems.

## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty expands threat detection coverage to protect Amazon Elastic Kubernetes Service (EKS) workloads.

# __1.12.146__ __2022-01-24__
## __AWS Route53 Recovery Readiness__
  - ### Features
    - Updated documentation for Route53 Recovery Readiness APIs.

# __1.12.145__ __2022-01-21__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for 4K AV1 output resolutions & 10-bit AV1 color, the ability to ingest sidecar Dolby Vision XML metadata files, and the ability to flag WebVTT and IMSC tracks for accessibility in HLS.

## __Amazon Transcribe Service__
  - ### Features
    - Add support for granular PIIEntityTypes when using Batch ContentRedaction.

# __1.12.144__ __2022-01-20__
## __AWS Fault Injection Simulator__
  - ### Features
    - Added action startTime and action endTime timestamp fields to the ExperimentAction object

## __AWS MediaTailor__
  - ### Features
    - This release adds support for multiple Segment Delivery Configurations. Users can provide a list of names and URLs when creating or editing a source location. When retrieving content, users can send a header to choose which URL should be used to serve content.

## __Amazon Connect Service__
  - ### Features
    - This release adds tagging support for UserHierarchyGroups resource.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6i, M6i and R6i instances are powered by a third-generation Intel Xeon Scalable processor (Ice Lake) delivering all-core turbo frequency of 3.5 GHz

## __Amazon GuardDuty__
  - ### Features
    - Amazon GuardDuty findings now include remoteAccountDetails under AwsApiCallAction section if instance credential is exfiltrated.

# __1.12.143__ __2022-01-19__
## __AWS EC2 Instance Connect__
  - ### Features
    - Adds support for ED25519 keys. PushSSHPublicKey Availability Zone parameter is now optional. Adds EC2InstanceStateInvalidException for instances that are not running. This was previously a service exception, so this may require updating your code to handle this new exception.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces stricter validation of requests to create custom data identifiers.

# __1.12.142__ __2022-01-18__
## __AWS CloudTrail__
  - ### Features
    - This release fixes a documentation bug in the description for the readOnly field selector in advanced event selectors. The description now clarifies that users omit the readOnly field selector to select both Read and Write management events.

## __AWS Storage Gateway__
  - ### Features
    - Documentation update for adding bandwidth throttling support for S3 File Gateways.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Add support for AWS Client VPN client login banner and session timeout.

## __Amazon Interactive Video Service__
  - ### Features
    - This release adds support for the new Thumbnail Configuration property for Recording Configurations. For more information see https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html

## __Amazon Location Service__
  - ### Features
    - This release adds the CalculateRouteMatrix API which calculates routes for the provided departure and destination positions. The release also deprecates the use of pricing plan across all verticals.

# __1.12.141__ __2022-01-14__
## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for CodeDeploy, EC2 and Kinesis resources

## __AWS Resource Access Manager__
  - ### Features
    - This release adds the ListPermissionVersions API which lists the versions for a given permission.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Application Insights support for Active Directory and SharePoint

## __Amazon Honeycode__
  - ### Features
    - Added read and write api support for multi-select picklist. And added errorcode field to DescribeTableDataImportJob API output, when import job fails.

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds a new DeactivateAnomalyDetector API operation.

# __1.12.140__ __2022-01-13__
## __AWS Glue__
  - ### Features
    - This SDK release adds support to pass run properties when starting a workflow run

## __Amazon ElastiCache__
  - ### Features
    - AWS ElastiCache for Redis has added a new Engine Log LogType in LogDelivery feature. You can now publish the Engine Log from your Amazon ElastiCache for Redis clusters to Amazon CloudWatch Logs and Amazon Kinesis Data Firehose.

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for sending hints to Amazon Lex V2 runtime APIs. Bot developers can provide runtime hints to help improve the recognition of slot values.

## __Amazon Pinpoint__
  - ### Features
    - Adds JourneyChannelSettings to WriteJourneyRequest

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - AWS Systems Manager adds category support for DescribeDocument API

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio now supports validation for Launch Profiles. Launch Profiles now report static validation results after create/update to detect errors in network or active directory configuration.

# __1.12.139__ __2022-01-12__
## __AWS Performance Insights__
  - ### Features
    - This release adds three Performance Insights APIs. Use ListAvailableResourceMetrics to get available metrics, GetResourceMetadata to get feature metadata, and ListAvailableResourceDimensions to list available dimensions. The AdditionalMetrics field in DescribeDimensionKeys retrieves per-SQL metrics.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Hpc6a instances are powered by a third-generation AMD EPYC processors (Milan) delivering all-core turbo frequency of 3.4 GHz

## __Amazon Honeycode__
  - ### Features
    - Honeycode is releasing new APIs to allow user to create, delete and list tags on resources.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Custom vocabulary in Amazon Lex V2 APIs for model building. Customers can give Amazon Lex V2 more information about how to process audio conversations with a bot by creating a custom vocabulary in a specific language.

## __Firewall Management Service__
  - ### Features
    - Shield Advanced policies for Amazon CloudFront resources now support automatic application layer DDoS mitigation. The max length for SecurityServicePolicyData ManagedServiceData is now 8192 characters, instead of 4096.

# __1.12.138__ __2022-01-11__
## __AWS Cost Explorer Service__
  - ### Features
    - Doc only update for Cost Explorer API that fixes missing clarifications for MatchOptions definitions

## __AWS IoT Events Data__
  - ### Features
    - This release provides documentation updates for Timer.timestamp in the IoT Events API Reference Guide.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports advanced query language and query-less search.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 Capacity Reservations now supports RHEL instance platforms (RHEL with SQL Server Standard, RHEL with SQL Server Enterprise, RHEL with SQL Server Web, RHEL with HA, RHEL with HA and SQL Server Standard, RHEL with HA and SQL Server Enterprise)

## __Amazon Relational Database Service__
  - ### Features
    - This release adds the db-proxy event type to support subscribing to RDS Proxy events.

## __Amazon WorkSpaces__
  - ### Features
    - Introducing new APIs for Workspaces audio optimization with Amazon Connect: CreateConnectClientAddIn, DescribeConnectClientAddIns, UpdateConnectClientAddIn and DeleteConnectClientAddIn.

## __FinSpace Public API__
  - ### Features
    - Documentation updates for FinSpace.

# __1.12.137__ __2022-01-10__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for new Compute Optimizer capability that makes it easier for customers to optimize their EC2 instances by leveraging multiple CPU architectures.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for specifying a Bucket Owner for an S3 location.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - New feature: Updated EC2 API to support faster launching for Windows images. Optimized images are pre-provisioned, using snapshots to launch instances up to 65% faster.

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds FailureType in the response of DescribeAnomalyDetector.

## __Amazon Transcribe Service__
  - ### Features
    - Documentation updates for Amazon Transcribe.

# __1.12.136__ __2022-01-07__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for selecting the Program Date Time (PDT) Clock source algorithm for HLS outputs.

# __1.12.135__ __2022-01-06__
## __AWS AppSync__
  - ### Features
    - AppSync: AWS AppSync now supports configurable batching sizes for AWS Lambda resolvers, Direct AWS Lambda resolvers and pipeline functions

## __AWS IoT Wireless__
  - ### Features
    - Downlink Queue Management feature provides APIs for customers to manage the queued messages destined to device inside AWS IoT Core for LoRaWAN. Customer can view, delete or purge the queued message(s). It allows customer to preempt the queued messages and let more urgent messages go through.

## __AWS MediaTailor__
  - ### Features
    - This release adds support for filler slate when updating MediaTailor channels that use the linear playback mode.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release introduces On-Demand Capacity Reservation support for Cluster Placement Groups, adds Tags on instance Metadata, and includes documentation updates for Amazon EC2.

## __Amazon Elasticsearch Service__
  - ### Features
    - Amazon OpenSearch Service adds support for Fine Grained Access Control for existing domains running Elasticsearch version 6.7 and above

## __Amazon OpenSearch Service__
  - ### Features
    - Amazon OpenSearch Service adds support for Fine Grained Access Control for existing domains running Elasticsearch version 6.7 and above

## __AmazonMWAA__
  - ### Features
    - This release adds a "Source" field that provides the initiator of an update, such as due to an automated patch from AWS or due to modification via Console or API.

# __1.12.134__ __2022-01-05__
## __AWS CloudTrail__
  - ### Features
    - This release adds support for CloudTrail Lake, a new feature that lets you run SQL-based queries on events that you have aggregated into event data stores. New APIs have been added for creating and managing event data stores, and creating, running, and managing queries in CloudTrail Lake.

## __AWS Glue__
  - ### Features
    - Add Delta Lake target support for Glue Crawler and 3rd Party Support for Lake Formation

## __AWS IoT__
  - ### Features
    - This release adds an automatic retry mechanism for AWS IoT Jobs. You can now define a maximum number of retries for each Job rollout, along with the criteria to trigger the retry for FAILED/TIMED_OUT/ALL(both FAILED an TIMED_OUT) job.

## __AWS Lake Formation__
  - ### Features
    - Add new APIs for 3rd Party Support for Lake Formation

## __Amazon AppStream__
  - ### Features
    - Includes APIs for App Entitlement management regarding entitlement and entitled application association.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for ticket fixes.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new API called ModifyVpcEndpointServicePayerResponsibility which allows VPC endpoint service owners to take payer responsibility of their VPC Endpoint connections.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Amazon EKS now supports running applications using IPv6 address space

## __Amazon Import/Export Snowball__
  - ### Features
    - Updating validation rules for interfaces used in the Snowball API to tighten security of service.

## __Amazon QuickSight__
  - ### Features
    - Multiple Doc-only updates for Amazon QuickSight.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports running training jobs on ml.g5 instance types.

# __1.12.133__ __2022-01-04__
## __AWS S3 Control__
  - ### Features
    - Documentation updates for the renaming of Glacier to Glacier Flexible Retrieval.

## __Amazon Rekognition__
  - ### Features
    - This release introduces a new field IndexFacesModelVersion, which is the version of the face detect and storage model that was used when indexing the face vector.

## __Amazon Simple Storage Service__
  - ### Features
    - Minor doc-based updates based on feedback bugs received.

# __1.12.132__ __2022-01-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added strength levels to the Sharpness Filter and now permits OGG files to be specified as sidecar audio inputs.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds the API operations to manage the Greengrass role associated with your account and to manage the core device connectivity information. Greengrass V2 customers can now depend solely on Greengrass V2 SDK for all the API operations needed to manage their fleets.

## __Amazon Detective__
  - ### Features
    - Added and updated API operations to support the Detective integration with AWS Organizations. New actions are used to manage the delegated administrator account and the integration configuration.

## __Amazon Relational Database Service__
  - ### Features
    - Multiple doc-only updates for Relational Database Service (RDS)

## __Amazon SageMaker Service__
  - ### Features
    - The release allows users to pass pipeline definitions as Amazon S3 locations and control the pipeline execution concurrency using ParallelismConfiguration. It also adds support of EMR jobs as pipeline steps.

# __1.12.131__ __2021-12-21__
## __AWS MediaConnect__
  - ### Features
    - You can now use the Fujitsu-QoS protocol for your MediaConnect sources and outputs to transport content to and from Fujitsu devices.

## __AWS Transfer Family__
  - ### Features
    - Property for Transfer Family used with the FTPS protocol. TLS Session Resumption provides a mechanism to resume or share a negotiated secret key between the control and data connection for an FTPS session.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports updating message attributes via channel flows

## __Amazon Lookout for Metrics__
  - ### Features
    - This release adds support for Causal Relationships. Added new ListAnomalyGroupRelatedMetrics API operation and InterMetricImpactDetails API data type

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports journal exports in JSON and Ion Binary formats. This release adds an optional OutputFormat parameter to the ExportJournalToS3 API.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their email monitoring configuration in Amazon WorkMail.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to upload files during a streaming session using NICE DCV native client or browser.

## __EC2 Image Builder__
  - ### Features
    - Added a note to infrastructure configuration actions and data types concerning delivery of Image Builder event messages to encrypted SNS topics. The key that's used to encrypt the SNS topic must reside in the account that Image Builder runs under.

# __1.12.130__ __2021-12-20__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports FSx Lustre Locations.

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for Firewall, and RuleGroup, FirewallPolicy Added additional details for AutoScalingGroup, LaunchConfiguration, and S3 buckets.

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release adds an optional parameter, ObjectTypeNames to the PutIntegration API to support multiple object types per integration option. Besides, this release introduces Standard Order Objects which contain data from third party systems and each order object belongs to a specific profile.

## __Amazon DevOps Guru__
  - ### Features
    - Adds Tags support to DescribeOrganizationResourceCollectionHealth

## __Amazon Forecast Service__
  - ### Features
    - Adds ForecastDimensions field to the DescribeAutoPredictorResponse

## __Amazon Location Service__
  - ### Features
    - Making PricingPlan optional as part of create resource API.

## __Amazon Redshift__
  - ### Features
    - This release adds API support for managed Redshift datashares. Customers can now interact with a Redshift datashare that is managed by a different service, such as AWS Data Exchange.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new ContentType field in AutoMLChannel for SageMaker CreateAutoMLJob InputDataConfig.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for importing and exporting VM Images as part of the Image Creation workflow via EC2 VM Import/Export.

## __FinSpace Public API__
  - ### Features
    - Make dataset description optional and allow s3 export for dataviews

# __1.12.129__ __2021-12-13__
## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

# __1.12.128__ __2021-12-09__
## __AWS Network Firewall__
  - ### Features
    - This release adds support for managed rule groups.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - This release adds tagging supports to Route53 Recovery Control Configuration. New APIs: TagResource, UntagResource and ListTagsForResource. Updates: add optional field `tags` to support tagging while calling CreateCluster, CreateControlPanel and CreateSafetyRule.

## __AWS Savings Plans__
  - ### Features
    - Adds the ability to specify Savings Plans hourly commitments using five digits after the decimal point.

## __AWS Server Migration Service__
  - ### Features
    - This release adds SMS discontinuation information to the API and CLI references.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds waiters support for internet gateways.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for grammar slot type in Amazon Lex. You can author your own grammar in the XML format per the SRGS specification to collect information in a conversation.

## __Amazon Route 53 Domains__
  - ### Features
    - Amazon Route 53 domain registration APIs now support filtering and sorting in the ListDomains API, deleting a domain by using the DeleteDomain API and getting domain pricing information by using the ListPrices API.

# __1.12.127__ __2021-12-08__
## __AWS Comprehend Medical__
  - ### Features
    - This release adds a new set of APIs (synchronous and batch) to support the SNOMED-CT ontology.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health

## __AWS IoT__
  - ### Features
    - This release allows customer to enable caching of custom authorizer on HTTP protocol for clients that use persistent or Keep-Alive connection in order to reduce the number of Lambda invocations.

## __AWS Outposts__
  - ### Features
    - This release adds the UpdateOutpost API.

## __AWS Support__
  - ### Features
    - Documentation updates for AWS Support.

## __Amazon CloudWatch Logs__
  - ### Features
    - This release adds AWS Organizations support as condition key in destination policy for cross account Subscriptions in CloudWatch Logs.

## __Amazon Lookout for Vision__
  - ### Features
    - This release adds new APIs for packaging an Amazon Lookout for Vision model as an AWS IoT Greengrass component.

## __Amazon SageMaker Service__
  - ### Features
    - This release added a new Ambarella device(amba_cv2) compilation support for Sagemaker Neo.

# __1.12.126__ __2021-12-06__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports custom domain names, allowing you to associate a domain name that you own with an AppSync API in your account.

## __Amazon Location Service__
  - ### Features
    - This release adds support for Accuracy position filtering, position metadata and autocomplete for addresses and points of interest based on partial or misspelled free-form text.

## __Amazon Route 53__
  - ### Features
    - Add PriorRequestNotComplete exception to UpdateHostedZoneComment API

# __1.12.125__ __2021-12-03__
## __Amazon Rekognition__
  - ### Features
    - This release added new KnownGender types for Celebrity Recognition.

# __1.12.124__ __2021-12-02__
## __AWS Amplify UI Builder__
  - ### Features
    - This release introduces the actions and data types for the new Amplify UI Builder API. The Amplify UI Builder API provides a programmatic interface for creating and configuring user interface (UI) component libraries and themes for use in Amplify applications.

## __AWS Network Manager__
  - ### Features
    - This release adds API support for AWS Cloud WAN.

## __AWS Resource Access Manager__
  - ### Features
    - This release adds the ability to use the new ResourceRegionScope parameter on List operations that return lists of resources or resource types. This new parameter filters the results by letting you differentiate between global or regional resource types.

# __1.12.123__ __2021-12-01__
## __AWS Direct Connect__
  - ### Features
    - Adds SiteLink support to private and transit virtual interfaces. SiteLink is a new Direct Connect feature that allows routing between Direct Connect points of presence.

## __AWS Shield__
  - ### Features
    - This release adds API support for Automatic Application Layer DDoS Mitigation for AWS Shield Advanced. Customers can now enable automatic DDoS mitigation in count or block mode for layer 7 protected resources.

## __AWSKendraFrontendService__
  - ### Features
    - Experience Builder allows customers to build search applications without writing code. Analytics Dashboard provides quality and usability metrics for Kendra indexes. Custom Document Enrichment allows customers to build a custom ingestion pipeline to pre-process documents and generate metadata.

## __Amazon DevOps Guru__
  - ### Features
    - DevOps Guru now provides detailed, database-specific analyses of performance issues and recommends corrective actions for Amazon Aurora database instances with Performance Insights turned on. You can also use AWS tags to choose which resources to analyze and define your applications.

## __Amazon DynamoDB__
  - ### Features
    - Add support for Table Classes and introduce the Standard Infrequent Access table class.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Amazon VPC IP Address Manager (IPAM), which enables you to plan, track, and monitor IP addresses for your workloads. This release also adds support for VPC Network Access Analyzer, which enables you to analyze network access to resources in your Virtual Private Clouds.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release introduces a new feature, Automated Chatbot Designer, that helps customers automatically create a bot design from existing conversation transcripts. The feature uses machine learning to discover most common intents and the information needed to fulfill them.

## __Amazon SageMaker Runtime__
  - ### Features
    - Adding new exception types for InvokeEndpoint

## __Amazon SageMaker Service__
  - ### Features
    - This release enables - 1/ Inference endpoint configuration recommendations and ability to run custom load tests to meet performance needs. 2/ Deploy serverless inference endpoints. 3/ Query, filter and retrieve end-to-end ML lineage graph, and incorporate model quality/bias detection in ML workflow.

# __1.12.122__ __2021-11-30__
## __AWS Backup Gateway__
  - ### Features
    - Initial release of AWS Backup gateway which enables you to centralize and automate protection of on-premises VMware and VMware Cloud on AWS workloads using AWS Backup.

## __AWS Glue__
  - ### Features
    - Support for DataLake transactions

## __AWS IoT__
  - ### Features
    - Added the ability to enable/disable IoT Fleet Indexing for Device Defender and Named Shadow information, and search them through IoT Fleet Indexing APIs.

## __AWS IoT TwinMaker__
  - ### Features
    - AWS IoT TwinMaker makes it faster and easier to create, visualize and monitor digital twins of real-world systems like buildings, factories and industrial equipment to optimize operations. Learn more: https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/Welcome.html (New Service) (Preview)

## __AWS Lake Formation__
  - ### Features
    - This release adds support for row and cell-based access control in Lake Formation. It also adds support for Lake Formation Governed Tables, which support ACID transactions and automatic storage optimizations.

## __AWS Outposts__
  - ### Features
    - This release adds the SupportedHardwareType parameter to CreateOutpost.

## __AWS Storage Gateway__
  - ### Features
    - Added gateway type VTL_SNOW. Added new SNOWBALL HostEnvironment for gateways running on a Snowball device. Added new field HostEnvironmentId to serve as an identifier for the HostEnvironment on which the gateway is running.

## __Access Analyzer__
  - ### Features
    - AWS IAM Access Analyzer now supports policy validation for resource policies attached to S3 buckets and access points. You can run additional policy checks by specifying the S3 resource type you want to attach to your resource policy.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for Is4gen and Im4gn instances. This release also adds a new subnet attribute, enableLniAtDeviceIndex, to support local network interfaces, which are logical networking components that connect an EC2 instance to your on-premises network.

## __Amazon FSx__
  - ### Features
    - This release adds support for the FSx for OpenZFS file system type, FSx for Lustre file systems with the Persistent_2 deployment type, and FSx for Lustre file systems with Amazon S3 data repository associations and automatic export policies.

## __Amazon Import/Export Snowball__
  - ### Features
    - Tapeball is to integrate tape gateway onto snowball, it enables customer to transfer local data on the tape to snowball,and then ingest the data into tape gateway on the cloud.

## __Amazon Kinesis__
  - ### Features
    - Amazon Kinesis Data Streams now supports on demand streams.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce Amazon S3 Glacier Instant Retrieval storage class and a new setting in S3 Object Ownership to disable ACLs for bucket and the objects in it.

## __Amazon WorkSpaces Web__
  - ### Features
    - This is the initial SDK release for Amazon WorkSpaces Web. Amazon WorkSpaces Web is a low-cost, fully managed WorkSpace built to deliver secure web-based workloads and software-as-a-service (SaaS) application access to users within existing web browsers.

## __Managed Streaming for Kafka__
  - ### Features
    - This release adds three new V2 APIs. CreateClusterV2 for creating both provisioned and serverless clusters. DescribeClusterV2 for getting information about provisioned and serverless clusters and ListClustersV2 for listing all clusters (both provisioned and serverless) in your account.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless queries.

# __1.12.121__ __2021-11-29__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for the enhanced infrastructure metrics paid feature. Also adds support for two new sets of resource efficiency metrics, including savings opportunity metrics and performance improvement opportunity metrics.

## __AWS Data Exchange__
  - ### Features
    - This release enables providers and subscribers to use Data Set, Job, and Asset operations to work with API assets from Amazon API Gateway. In addition, this release enables subscribers to use the SendApiAsset operation to invoke a provider's Amazon API Gateway API that they are entitled to.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now supports retention configuration for the hot tier storage.

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to use custom lens features.

## __Amazon CloudWatch Evidently__
  - ### Features
    - Introducing Amazon CloudWatch Evidently. This is the first public release of Amazon CloudWatch Evidently.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds supports for pull through cache rules and enhanced scanning.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G5g and M6a instances. This release also adds support for Amazon EBS Snapshots Archive, a feature that enables you to archive your EBS snapshots; and Recycle Bin, a feature that enables you to protect your EBS snapshots against accidental deletion.

## __Amazon Recycle Bin__
  - ### Features
    - This release adds support for Recycle Bin.

## __Amazon Simple Storage Service__
  - ### Features
    - Amazon S3 Event Notifications adds Amazon EventBridge as a destination and supports additional event types. The PutBucketNotificationConfiguration API can now skip validation of Amazon SQS, Amazon SNS and AWS Lambda destinations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added two new attributes to DescribeInstanceInformation called SourceId and SourceType along with new string filters SourceIds and SourceTypes to filter instance records.

## __CloudWatch RUM__
  - ### Features
    - This is the first public release of CloudWatch RUM

## __Inspector2__
  - ### Features
    - This release adds support for the new Amazon Inspector API. The new Amazon Inspector can automatically discover and scan Amazon EC2 instances and Amazon ECR container images for software vulnerabilities and unintended network exposure, and report centralized findings across multiple AWS accounts.

# __1.12.120__ __2021-11-29__
## __AWS Migration Hub Refactor Spaces__
  - ### Features
    - This is the initial SDK release for AWS Migration Hub Refactor Spaces

## __Amazon Personalize__
  - ### Features
    - This release adds API support for Recommenders and BatchSegmentJobs.

## __Amazon Personalize Runtime__
  - ### Features
    - This release adds inference support for Recommenders.

## __Amazon Textract__
  - ### Features
    - This release adds support for synchronously analyzing identity documents through a new API: AnalyzeID

# __1.12.119__ __2021-11-26__
## __AWS IoT Core Device Advisor__
  - ### Features
    - Documentation update for Device Advisor GetEndpoint API

## __AWS Outposts__
  - ### Features
    - This release adds new APIs for working with Outpost sites and orders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation updates for EC2.

## __Amazon Pinpoint__
  - ### Features
    - Added a One-Time Password (OTP) management feature. You can use the Amazon Pinpoint API to generate OTP codes and send them to your users as SMS messages. Your apps can then call the API to verify the OTP codes that your users input

## __Application Migration Service__
  - ### Features
    - Application Migration Service now supports an additional replication method that does not require agent installation on each source server. This option is available for source servers running on VMware vCenter versions 6.7 and 7.0.

## __Auto Scaling__
  - ### Features
    - Documentation updates for Amazon EC2 Auto Scaling.

# __1.12.118__ __2021-11-24__
## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise now accepts data streams that aren't associated with any asset properties. You can organize data by updating data stream associations.

## __AWS Lambda__
  - ### Features
    - Remove Lambda function url apis

## __AWS Proton__
  - ### Features
    - This release adds APIs for getting the outputs and provisioned stacks for Environments, Pipelines, and ServiceInstances.  You can now add tags to EnvironmentAccountConnections.  It also adds APIs for working with PR-based provisioning.  Also, it adds APIs for syncing templates with a git repository.

## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces a new auto-merging feature for profile matching. The auto-merging configurations can be set via CreateDomain API or UpdateDomain API. You can use GetIdentityResolutionJob API and ListIdentityResolutionJobs API to fetch job status.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Timestream Query__
  - ### Features
    - Releasing Amazon Timestream Scheduled Queries. It makes real-time analytics more performant and cost-effective for customers by calculating and storing frequently accessed aggregates, and other computations, typically used in operational dashboards, business reports, and other analytics applications

## __Amazon Timestream Write__
  - ### Features
    - This release adds support for multi-measure records and magnetic store writes. Multi-measure records allow customers to store multiple measures in a single table row. Magnetic store writes enable customers to write late arrival data (data with timestamp in the past) directly into the magnetic store.

## __Amazon Translate__
  - ### Features
    - This release enables customers to use translation settings to mask profane words and phrases in their translation output.

## __Auto Scaling__
  - ### Features
    - Customers can now configure predictive scaling policies to proactively scale EC2 Auto Scaling groups based on any CloudWatch metrics that more accurately represent the load on the group than the four predefined metrics. They can also use math expressions to further customize the metrics.

## __EC2 Image Builder__
  - ### Features
    - This release adds support for sharing AMIs with Organizations within an EC2 Image Builder Distribution Configuration.

# __1.12.117__ __2021-11-23__
## __AWS Backup__
  - ### Features
    - This release adds new opt-in settings for advanced features for DynamoDB backups

## __AWS IoT__
  - ### Features
    - This release introduces a new feature, Managed Job Template, for AWS IoT Jobs Service. Customers can now use service provided managed job templates to easily create jobs for supported standard job actions.

## __AWS IoT Core Device Advisor__
  - ### Features
    - This release introduces a new feature for Device Advisor: ability to execute multiple test suites in parallel for given customer account. You can use GetEndpoint API to get the device-level test endpoint and call StartSuiteRun with "parallelRun=true" to run suites in parallel.

## __AWS IoT Wireless__
  - ### Features
    - Two new APIs, GetNetworkAnalyzerConfiguration and UpdateNetworkAnalyzerConfiguration, are added for the newly released Network Analyzer feature which enables customers to view real-time frame information and logs from LoRaWAN devices and gateways.

## __AWS Lambda__
  - ### Features
    - Release Lambda event source filtering for SQS, Kinesis Streams, and DynamoDB Streams.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __Amazon DynamoDB__
  - ### Features
    - DynamoDB PartiQL now supports ReturnConsumedCapacity, which returns capacity units consumed by PartiQL APIs if the request specified returnConsumedCapacity parameter. PartiQL APIs include ExecuteStatement, BatchExecuteStatement, and ExecuteTransaction.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation update for ARM support on Amazon ECS.

## __Amazon ElastiCache__
  - ### Features
    - Adding support for r6gd instances for Redis with data tiering. In a cluster with data tiering enabled, when available memory capacity is exhausted, the least recently used data is automatically tiered to solid state drives for cost-effective capacity scaling with minimal performance impact.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new parameter ipv6Native to the allow creation of IPv6-only subnets using the CreateSubnet operation, and the operation ModifySubnetAttribute includes new parameters to modify subnet attributes to use resource-based naming and enable DNS resolutions for Private DNS name.

## __Amazon Macie 2__
  - ### Features
    - Documentation updates for Amazon Macie

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon Redshift__
  - ### Features
    - This release adds support for reserved node exchange with restore/resize

## __Amazon Relational Database Service__
  - ### Features
    - Adds support for Multi-AZ DB clusters for RDS for MySQL and RDS for PostgreSQL.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, SqsManagedSseEnabled, which enables server-side queue encryption using SQS owned encryption keys.

## __Amazon Simple Storage Service__
  - ### Features
    - Introduce two new Filters to S3 Lifecycle configurations - ObjectSizeGreaterThan and ObjectSizeLessThan. Introduce a new way to trigger actions on noncurrent versions by providing the number of newer noncurrent versions along with noncurrent days.

## __Amazon WorkSpaces__
  - ### Features
    - Documentation updates for Amazon WorkSpaces

## __Elastic Load Balancing__
  - ### Features
    - This release allows you to create internal Application and Network Load Balancers in dualstack mode. This release also adds an attribute to block internet gateway (IGW) access to the load balancer, preventing unintended access to your internal load balancers through an internet gateway.

## __FinSpace Public API__
  - ### Features
    - Update documentation for createChangeset API.

# __1.12.116__ __2021-11-22__
## __AWS CloudFormation__
  - ### Features
    - This release include SDK changes for the feature launch of Stack Import to Service Managed StackSet.

## __AWS Database Migration Service__
  - ### Features
    - Added new S3 endpoint settings to allow to convert the current UTC time into a specified time zone when a date partition folder is created. Using with 'DatePartitionedEnabled'.

## __AWS S3 Control__
  - ### Features
    - Added Amazon CloudWatch publishing option for S3 Storage Lens metrics.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Added new APIs for enabling Echo Reduction with Voice Focus.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for UpdateContactFlowMetadata, DeleteContactFlow and module APIs. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding missing exceptions to RegisterCluster operation

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter dry-run for the UpdateElasticsearchDomainConfig API to perform basic validation checks, and detect the deployment type that will be required for the configuration change, without actually applying the change.

## __Amazon QuickSight__
  - ### Features
    - Add support for Exasol data source, 1 click enterprise embedding and email customization.

## __Amazon Relational Database Service__
  - ### Features
    - Adds local backup support to Amazon RDS on AWS Outposts.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds new parameter to CreateActivation API . This parameter is for "internal use only".

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds language identification support for streaming transcription.

## __Braket__
  - ### Features
    - This release adds support for Amazon Braket Hybrid Jobs.

## __FinSpace Public API__
  - ### Features
    - Add new APIs for managing Datasets, Changesets, and Dataviews.

# __1.12.115__ __2021-11-19__
## __AWS Batch__
  - ### Features
    - Documentation updates for AWS Batch.

## __AWS CloudFormation__
  - ### Features
    - The StackSets ManagedExecution feature will allow concurrency for non-conflicting StackSet operations and queuing the StackSet operations that conflict at a given time for later execution.

## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for specifying a SCTE-35 PID on input. MediaLive now supports SCTE-35 PID selection on inputs containing one or more active SCTE-35 PIDs.

## __AWS Lambda__
  - ### Features
    - Add support for Lambda Function URLs. Customers can use Function URLs to create built-in HTTPS endpoints on their functions.

## __Amazon AppStream__
  - ### Features
    - Includes APIs for managing resources for Elastic fleets: applications, app blocks, and application-fleet associations.

## __Amazon CloudWatch Application Insights__
  - ### Features
    - Application Insights now supports monitoring for HANA

## __Amazon Lex Runtime V2__
  - ### Features
    - Now supports styled slots in Lex V2 runtime. Customers can provide inputs like "a as in apple b for beta" which will be resolved to "ab" as slot value.

## __Amazon Redshift__
  - ### Features
    - Added support of default IAM role for CreateCluster, RestoreFromClusterSnapshot and ModifyClusterIamRoles APIs

# __1.12.114__ __2021-11-18__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Dashboard views. You can now view insights data for your active assessments, and quickly identify non-compliant evidence that needs to be remediated.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds the following new features: 1) PII detection in profile jobs, 2) Data quality rules, enabling validation of data quality in profile jobs, 3) SQL query-based datasets for Amazon Redshift and Snowflake data sources, and 4) Connecting DataBrew datasets with Amazon AppFlow flows.

## __AWS Lambda__
  - ### Features
    - Added support for CLIENT_CERTIFICATE_TLS_AUTH and SERVER_ROOT_CA_CERTIFICATE as SourceAccessType for MSK and Kafka event source mappings.

## __Amazon AppConfig__
  - ### Features
    - Add Type to support feature flag configuration profiles

## __Amazon Chime__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Adds new Transcribe API parameters to StartMeetingTranscription, including support for content identification and redaction (PII & PHI), partial results stabilization, and custom language models.

## __Amazon CloudWatch__
  - ### Features
    - CloudWatch Anomaly Detection now supports anomaly detectors that use metric math as input.

## __Amazon Forecast Service__
  - ### Features
    - NEW CreateExplanability API that helps you understand how attributes such as price, promotion, etc. contributes to your forecasted values; NEW CreateAutoPredictor API that trains up to 40% more accurate forecasting model, saves up to 50% of retraining time, and provides model level explainability.

## __Amazon Interactive Video Service__
  - ### Features
    - Add APIs for retrieving stream session information and support for filtering live streams by health.  For more information, see https://docs.aws.amazon.com/ivs/latest/userguide/stream-health.html

## __Amazon Lex Model Building V2__
  - ### Features
    - Added support for Polly Neural TTS (NTTS) voices. Customers can choose between 'standard' and 'neural' for Polly Engine configuration per locale when creating or updating an Amazon Lex bot.

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the connectivity settings for an existing cluster to enable public accessibility.

## __Redshift Data API Service__
  - ### Features
    - Rolling back Data API serverless features until dependencies are live.

# __1.12.113__ __2021-11-17__
## __AWS AppConfig Data__
  - ### Features
    - AWS AppConfig Data is a new service that allows you to retrieve configuration deployed by AWS AppConfig. See the AppConfig user guide for more details on getting started. https://docs.aws.amazon.com/appconfig/latest/userguide/what-is-appconfig.html

## __Amazon API Gateway__
  - ### Features
    - Documentation updates for Amazon API Gateway.

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for DescribeResourceCollectionHealth

## __Amazon Simple Notification Service__
  - ### Features
    - Amazon SNS introduces the PublishBatch API, which enables customers to publish up to 10 messages per API request. The new API is valid for Standard and FIFO topics.

## __AmplifyBackend__
  - ### Features
    - New APIs to support the Amplify Storage category. Add and manage file storage in your Amplify app backend.

## __Elastic Disaster Recovery Service__
  - ### Features
    - Introducing AWS Elastic Disaster Recovery (AWS DRS), a new service that minimizes downtime and data loss with fast, reliable recovery of on-premises and cloud-based applications using affordable storage, minimal compute, and point-in-time recovery.

## __Redshift Data API Service__
  - ### Features
    - Data API now supports serverless requests.

# __1.12.112__ __2021-11-16__
## __AWS CloudTrail__
  - ### Features
    - CloudTrail Insights now supports ApiErrorRateInsight, which enables customers to identify unusual activity in their AWS account based on API error codes and their rate.

## __Amazon Location Service__
  - ### Features
    - This release adds the support for Relevance, Distance, Time Zone, Language and Interpolated Address for Geocoding and Reverse Geocoding.

# __1.12.111__ __2021-11-15__
## __AWS Database Migration Service__
  - ### Features
    - Add Settings in JSON format for the source GCP MySQL endpoint

## __AWS SDK for Java__
  - ### Bugfixes
    - "Update the REST-JSON marshalling logic to conform to the standard expected behavior with respect to the `Content-Type` of the request."

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family now supports integrating a custom identity provider using AWS Lambda

## __AWS WAFV2__
  - ### Features
    - Your options for logging web ACL traffic now include Amazon CloudWatch Logs log groups and Amazon S3 buckets.

## __Amazon AppStream__
  - ### Features
    - This release includes support for images of AmazonLinux2 platform type.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds a new VPC Subnet attribute "EnableDns64." When enabled on IPv6 Subnets, the Amazon-Provided DNS Resolver returns synthetic IPv6 addresses for IPv4-only destinations.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding Tags support to Cluster Registrations.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Adds support for Session Reason and Max Session Duration for Systems Manager Session Manager.

## __Migration Hub Strategy Recommendations__
  - ### Features
    - AWS SDK for Migration Hub Strategy Recommendations. It includes APIs to start the portfolio assessment, import portfolio data for assessment, and to retrieve recommendations. For more information, see the AWS Migration Hub documentation at https://docs.aws.amazon.com/migrationhub/index.html

# __1.12.110__ __2021-11-12__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added automatic modes for GOP configuration and added the ability to ingest screen recordings generated by Safari on MacOS 12 Monterey.

## __Amazon Connect Service__
  - ### Features
    - This release adds APIs for creating and managing scheduled tasks. Additionally, adds APIs to describe and update a contact and list associated references.

## __Amazon DevOps Guru__
  - ### Features
    - Add support for cross account APIs.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - C6i instances are powered by a third-generation Intel Xeon Scalable processor (Ice Lake) delivering all-core turbo frequency of 3.5 GHz. G5 instances feature up to 8 NVIDIA A10G Tensor Core GPUs and second generation AMD EPYC processors.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - This Patch Manager release supports creating Patch Baselines for RaspberryPi OS (formerly Raspbian)

# __1.12.109__ __2021-11-11__
## __Amazon DynamoDB__
  - ### Features
    - Updated Help section for "dynamodb update-contributor-insights" API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release provides an additional route target for the VPC route table.

## __Amazon Translate__
  - ### Features
    - This release enables customers to import Multi-Directional Custom Terminology and use Multi-Directional Custom Terminology in both real-time translation and asynchronous batch translation.

# __1.12.108__ __2021-11-10__
## __AWS Backup__
  - ### Features
    - AWS Backup SDK provides new options when scheduling backups: select supported services and resources that are assigned to a particular tag, linked to a combination of tags, or can be identified by a partial tag value, and exclude resources from their assignments.

## __AWS Resilience Hub__
  - ### Features
    - Initial release of AWS Resilience Hub, a managed service that enables you to define, validate, and track the resilience of your applications on AWS

## __Amazon EC2 Container Service__
  - ### Features
    - This release adds support for container instance health.

# __1.12.107__ __2021-11-09__
## __AWS Batch__
  - ### Features
    - Adds support for scheduling policy APIs.

## __AWS Health APIs and Notifications__
  - ### Features
    - Documentation updates for AWS Health.

## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for Greengrass core devices running Windows. You can now specify name of a Windows user to run a component.

# __1.12.106__ __2021-11-08__
## __AWS WAFV2__
  - ### Features
    - You can now configure rules to run a CAPTCHA check against web requests and, as needed, send a CAPTCHA challenge to the client.

## __Amazon Chime SDK Meetings__
  - ### Features
    - Updated format validation for ids and regions.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds internal validation on the GatewayAssociationState field

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker CreateEndpoint and UpdateEndpoint APIs now support additional deployment configuration to manage traffic shifting options and automatic rollback monitoring. DescribeEndpoint now shows new in-progress deployment details with stage status.

# __1.12.105__ __2021-11-05__
## __AWS Resource Groups Tagging API__
  - ### Features
    - Documentation updates and improvements.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns customer-owned IP addresses for instances running on an AWS Outpost.

## __Amazon Translate__
  - ### Features
    - This release enable customers to use their own KMS keys to encrypt output files when they submit a batch transform job.

# __1.12.104__ __2021-11-04__
## __AWS IoT Wireless__
  - ### Features
    - Adding APIs for the FUOTA (firmware update over the air) and multicast for LoRaWAN devices and APIs to support event notification opt-in feature for Sidewalk related events. A few existing APIs need to be modified for this new feature.

## __Amazon Chime SDK Meetings__
  - ### Features
    - The Amazon Chime SDK Meetings APIs allow software developers to create meetings and attendees for interactive audio, video, screen and content sharing in custom meeting applications which use the Amazon Chime SDK.

## __Amazon Connect Service__
  - ### Features
    - This release adds CRUD operation support for Security profile resource in Amazon Connect

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new instance replacement strategy for EC2 Fleet, Spot Fleet. Now you can select an action to perform when your instance gets a rebalance notification. EC2 Fleet, Spot Fleet can launch a replacement then terminate the instance that received notification after a termination delay

## __Amazon SageMaker Service__
  - ### Features
    - ListDevices and DescribeDevice now show Edge Manager agent version.

# __1.12.103__ __2021-11-04__
## __AWS IoT Wireless__
  - ### Features
    - Adding APIs for the FUOTA (firmware update over the air) and multicast for LoRaWAN devices and APIs to support event notification opt-in feature for Sidewalk related events. A few existing APIs need to be modified for this new feature.

## __Amazon Chime SDK Meetings__
  - ### Features
    - The Amazon Chime SDK Meetings APIs allow software developers to create meetings and attendees for interactive audio, video, screen and content sharing in custom meeting applications which use the Amazon Chime SDK.

## __Amazon Connect Service__
  - ### Features
    - This release adds CRUD operation support for Security profile resource in Amazon Connect

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new instance replacement strategy for EC2 Fleet, Spot Fleet. Now you can select an action to perform when your instance gets a rebalance notification. EC2 Fleet, Spot Fleet can launch a replacement then terminate the instance that received notification after a termination delay

## __Amazon SageMaker Service__
  - ### Features
    - ListDevices and DescribeDevice now show Edge Manager agent version.

# __1.12.102__ __2021-11-03__
## __AWS DataSync__
  - ### Features
    - AWS DataSync now supports Hadoop Distributed File System (HDFS) Locations

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying the severity of findings that a custom data identifier produces, based on the number of occurrences of text that matches the detection criteria.

## __FinSpace User Environment Management service__
  - ### Features
    - Adds superuser and data-bundle parameters to CreateEnvironment API

# __1.12.101__ __2021-11-02__
## __Amazon CloudFront__
  - ### Features
    - CloudFront now supports response headers policies to add HTTP headers to the responses that CloudFront sends to viewers. You can use these policies to add CORS headers, control browser caching, and more, without modifying your origin or writing any code.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __AmazonNimbleStudio__
  - ### Features
    - Amazon Nimble Studio adds support for users to stop and start streaming sessions.

# __1.12.100__ __2021-11-01__
## __AWS Network Manager__
  - ### Features
    - This release adds API support to aggregate resources, routes, and telemetry data across a Global Network.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to enable access logging for buckets in the Lightsail object storage service.

## __Amazon Neptune__
  - ### Features
    - Adds support for major version upgrades to ModifyDbCluster API

## __Amazon Rekognition__
  - ### Features
    - This Amazon Rekognition Custom Labels release introduces the management of datasets with  projects

# __1.12.99__ __2021-10-29__
## __Amazon CloudWatch Application Insights__
  - ### Features
    - Added Monitoring support for SQL Server Failover Cluster Instance. Additionally, added a new API to allow one-click monitoring of containers resources.

## __Amazon Connect Service__
  - ### Features
    - Amazon Connect Chat now supports real-time message streaming.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for AMI sharing with organizations and organizational units in ModifyImageAttribute API

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition Video GetCelebrityRecognition API operations.

## __Amazon Transcribe Service__
  - ### Features
    - Transcribe and Transcribe Call Analytics now support automatic language identification along with custom vocabulary, vocabulary filter, custom language model and PII redaction.

# __1.12.98__ __2021-10-28__
## __AWS Systems Manager Incident Manager__
  - ### Features
    - Updating documentation, adding new field to ConflictException to indicate earliest retry timestamp for some operations, increase maximum length of nextToken fields

## __Amazon Connect Participant Service__
  - ### Features
    - This release adds a new boolean attribute - Connect Participant - to the CreateParticipantConnection API, which can be used to mark the participant as connected.

## __Amazon EC2 Container Service__
  - ### Features
    - Amazon ECS now supports running Fargate tasks on Windows Operating Systems Families which includes Windows Server 2019 Core and Windows Server 2019 Full.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added new read-only DenyAllIGWTraffic network interface attribute. Added support for DL1 24xlarge instances powered by Habana Gaudi Accelerators for deep learning model training workloads

## __Amazon GameLift__
  - ### Features
    - Added support for Arm-based AWS Graviton2 instances, such as M6g, C6g, and R6g.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for RStudio on SageMaker.

# __1.12.97__ __2021-10-27__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds: attribute-based instance type selection for EC2 Fleet, Spot Fleet, a feature that lets customers express instance requirements as attributes like vCPU, memory, and storage; and Spot placement score, a feature that helps customers identify an optimal location to run Spot workloads.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - EKS managed node groups now support BOTTLEROCKET_x86_64 and BOTTLEROCKET_ARM_64 AMI types.

## __Amazon SageMaker Service__
  - ### Features
    - This release allows customers to describe one or more versioned model packages through BatchDescribeModelPackage, update project via UpdateProject, modify and read customer metadata properties using Create, Update and Describe ModelPackage and enables cross account registration of model packages.

## __Amazon Textract__
  - ### Features
    - This release adds support for asynchronously analyzing invoice and receipt documents through two new APIs: StartExpenseAnalysis and GetExpenseAnalysis

## __Auto Scaling__
  - ### Features
    - This release adds support for attribute-based instance type selection, a new EC2 Auto Scaling feature that lets customers express their instance requirements as a set of attributes, such as vCPU, memory, and storage.

# __1.12.96__ __2021-10-26__
## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now supports push notifications through Amazon Pinpoint

## __Amazon EMR Containers__
  - ### Features
    - This feature enables auto-generation of certificate  to secure the managed-endpoint and removes the need for customer provided certificate-arn during managed-endpoint setup.

# __1.12.95__ __2021-10-25__
## __AWS Audit Manager__
  - ### Features
    - This release introduces a new feature for Audit Manager: Custom framework sharing. You can now share your custom frameworks with another AWS account, or replicate them into another AWS Region under your own account.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support to create a VPN Connection that is not attached to a Gateway at the time of creation. Use this to create VPNs associated with Core Networks, or modify your VPN and attach a gateway using the modify API after creation.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for Amazon RDS Custom, which is a new RDS management type that gives you full access to your database and operating system. For more information, see https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/rds-custom.html

## __Amazon Route 53 Resolver__
  - ### Features
    - New API for ResolverConfig, which allows autodefined rules for reverse DNS resolution to be disabled for a VPC

# __1.12.94__ __2021-10-22__
## __AWS Audit Manager__
  - ### Features
    - This release introduces character restrictions for ControlSet names. We updated regex patterns for the following attributes: ControlSet, CreateAssessmentFrameworkControlSet, and UpdateAssessmentFrameworkControlSet.

## __Amazon Chime__
  - ### Features
    - Chime VoiceConnector and VoiceConnectorGroup APIs will now return an ARN.

## __Amazon QuickSight__
  - ### Features
    - Added QSearchBar option for GenerateEmbedUrlForRegisteredUser ExperienceConfiguration to support Q search bar embedding

# __1.12.93__ __2021-10-21__
## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect hours of operation API for general availability (GA). This API also supports AWS CloudFormation. For more information, see Amazon Connect Resource Type Reference in the AWS CloudFormation User Guide.

# __1.12.92__ __2021-10-20__
## __AWS Direct Connect__
  - ### Features
    - This release adds 4 new APIS, which needs to be public able

## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added support for specifying caption time delta in milliseconds and the ability to apply color range legalization to source content other than AVC video.

## __AWS Elemental MediaPackage__
  - ### Features
    - When enabled, MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage passes through digital video broadcasting (DVB) subtitles into the output.

## __AWS Panorama__
  - ### Features
    - General availability for AWS Panorama. AWS SDK for Panorama includes APIs to manage your devices and nodes, and deploy computer vision applications to the edge. For more information, see the AWS Panorama documentation at http://docs.aws.amazon.com/panorama

## __AWS SecurityHub__
  - ### Features
    - Added support for cross-Region finding aggregation, which replicates findings from linked Regions to a single aggregation Region. Added operations to view, enable, update, and delete the finding aggregation.

## __Amazon Appflow__
  - ### Features
    - Feature to add support for  JSON-L format for S3 as a source.

## __Amazon Transcribe Streaming Service__
  - ### Features
    - This release adds custom language support for streaming transcription.

# __1.12.91__ __2021-10-19__
## __AWS Data Exchange__
  - ### Features
    - This release adds support for our public preview of AWS Data Exchange for Amazon Redshift. This enables data providers to list products including AWS Data Exchange datashares for Amazon Redshift, giving subscribers read-only access to provider data in Amazon Redshift.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK now allows developers to execute business logic on in-flight messages before they are delivered to members of a messaging channel with channel flows.

# __1.12.90__ __2021-10-18__
## __Amazon Interactive Video Service__
  - ### Features
    - Bug fix: remove unsupported maxResults and nextToken pagination parameters from ListTagsForResource

## __Amazon QuickSight__
  - ### Features
    - AWS QuickSight Service  Features    - Add IP Restriction UI and public APIs support.

# __1.12.89__ __2021-10-15__
## __AWS Glue__
  - ### Features
    - Enable S3 event base crawler API.

## __Amazon Elastic File System__
  - ### Features
    - EFS adds documentation for a new exception for short identifiers to be thrown after its migration to long resource identifiers.

## __Amazon Simple Notification Service__
  - ### Bugfixes
    - Add additional validation to the SNS SigningCert

# __1.12.88__ __2021-10-14__
## __AWS RoboMaker__
  - ### Features
    - Adding support to GPU simulation jobs as well as non-ROS simulation jobs.

## __Amazon SageMaker Service__
  - ### Features
    - This release updates the provisioning artifact ID to an optional parameter in CreateProject API. The provisioning artifact ID defaults to the latest provisioning artifact ID of the product if you don't provide one.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling now supports filtering describe Auto Scaling groups API using tags

## __Elastic Load Balancing__
  - ### Features
    - Adds new option to filter by availability on each type of load balancer when describing ssl policies.

# __1.12.87__ __2021-10-13__
## __AWS Config__
  - ### Features
    - Adding Config support for AWS::OpenSearch::Domain

## __AWS Storage Gateway__
  - ### Features
    - Adding support for Audit Logs on NFS shares and Force Closing Files on SMB shares.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for additional VPC Flow Logs delivery options to S3, such as Apache Parquet formatted files, Hourly partitions and Hive-compatible S3 prefixes

## __Amazon Kinesis Analytics__
  - ### Features
    - Support for Apache Flink 1.13 in Kinesis Data Analytics. Changed the required status of some Update properties to better fit the corresponding Create properties.

## __Amazon WorkMail__
  - ### Features
    - This release adds APIs for adding, removing and retrieving details of mail domains

# __1.12.86__ __2021-10-12__
## __AWS MediaTailor__
  - ### Features
    - MediaTailor now supports ad prefetching.

## __Amazon CloudSearch__
  - ### Features
    - Adds an additional validation exception for Amazon CloudSearch configuration APIs for better error handling.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation only update to address tickets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EncryptionSupport for InstanceStorageInfo added to DescribeInstanceTypes API

# __1.12.85__ __2021-10-11__
## __AWS Elemental MediaLive__
  - ### Features
    - This release adds support for Transport Stream files as an input type to MediaLive encoders.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Documentation update for Amazon EC2.

## __Amazon Fraud Detector__
  - ### Features
    - New model type: Transaction Fraud Insights, which is optimized for online transaction fraud. Stored Events, which allows customers to send and store data directly within Amazon Fraud Detector. Batch Import, which allows customers to upload a CSV file of historic event data for processing and storage

## __Elastic Load Balancing__
  - ### Features
    - Enable support for ALB IPv6 Target Groups (IP Address Type)

# __1.12.84__ __2021-10-08__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert has added the ability to set account policies which control access restrictions for HTTP, HTTPS, and S3 content sources.

## __AWS Secrets Manager__
  - ### Features
    - Documentation updates for Secrets Manager

## __AWS SecurityHub__
  - ### Features
    - Added new resource details objects to ASFF, including resources for WAF rate-based rules, EC2 VPC endpoints, ECR repositories, EKS clusters, X-Ray encryption, and OpenSearch domains. Added additional details for CloudFront distributions, CodeBuild projects, ELB V2 load balancers, and S3 buckets.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes a requirement for filters on SearchLocalGatewayRoutes operations.

## __Amazon Lex Model Building V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

## __Amazon Lex Runtime V2__
  - ### Features
    - Added configuration support for an Amazon Lex bot to provide fulfillment progress updates to users while their requests are being processed. See documentation for more details: https://docs.aws.amazon.com/lexv2/latest/dg/streaming-progress.html

# __1.12.83__ __2021-10-07__
## __AWS Backup__
  - ### Features
    - Launch of AWS Backup Vault Lock, which protects your backups from malicious and accidental actions, works with existing backup policies, and helps you meet compliance requirements.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports indexing and querying documents in different languages.

## __Amazon Chime__
  - ### Features
    - This release enables customers to configure Chime MediaCapturePipeline via API.

## __Amazon Kinesis Firehose__
  - ### Features
    - Allow support for Amazon Opensearch Service(successor to Amazon Elasticsearch Service) as a Kinesis Data Firehose delivery destination.

## __Amazon Managed Grafana__
  - ### Features
    - Initial release of the SDK for Amazon Managed Grafana API.

## __Schemas__
  - ### Features
    - Removing unused request/response objects.

# __1.12.82__ __2021-10-06__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports integration with AWS SSO

## __Amazon FSx__
  - ### Features
    - This release adds support for Lustre 2.12 to FSx for Lustre.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds a new TrainingInputMode FastFile for SageMaker Training APIs.

## __AmplifyBackend__
  - ### Features
    - Adding a new field 'AmplifyFeatureFlags' to the response of the GetBackend operation. It will return a stringified version of the cli.json file for the given Amplify project.

# __1.12.81__ __2021-10-05__
## __AWS Backup__
  - ### Features
    - AWS Backup Audit Manager framework report.

## __AWS Glue__
  - ### Features
    - This release adds tag as an input of CreateConnection

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Released Capacity Reservation Fleet, a feature of Amazon EC2 Capacity Reservations, which provides a way to manage reserved capacity across instance types. For more information: https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/cr-fleets.html

## __Amazon Location Service__
  - ### Features
    - Add support for PositionFiltering.

## __Amazon WorkMail__
  - ### Features
    - This release allows customers to change their inbound DMARC settings in Amazon WorkMail.

## __Application Auto Scaling__
  - ### Features
    - With this release, Application Auto Scaling adds support for Amazon Neptune. Customers can now automatically add or remove Read Replicas of their Neptune clusters to keep the average CPU Utilization at the target value specified by the customers.

# __1.12.80__ __2021-10-04__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Key Management Service__
  - ### Features
    - Added SDK examples for ConnectCustomKeyStore, CreateCustomKeyStore, CreateKey, DeleteCustomKeyStore, DescribeCustomKeyStores, DisconnectCustomKeyStore, GenerateDataKeyPair, GenerateDataKeyPairWithoutPlaintext, GetPublicKey, ReplicateKey, Sign, UpdateCustomKeyStore and Verify APIs

## __Amazon Elastic File System__
  - ### Features
    - EFS adds a new exception for short identifiers to be thrown after its migration to long resource identifiers.

# __1.12.79__ __2021-10-01__
## __AWS App Runner__
  - ### Features
    - This release contains several minor bug fixes.

## __AWS SDK for Java__
  - ### Features
    - Fall back to 'profile X' if the SDK is configured with profile 'X' and 'X' does not exist in the SDK configuration files. No longer log when a configuration file includes 'profile X'.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - When "AutoApprovable" is true for a Change Template, then specifying --auto-approve (boolean) in Start-Change-Request-Execution will create a change request that bypasses approver review. (except for change calendar restrictions)

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now enables customers to choose a customer managed AWS KMS key or an Amazon S3-managed key instead of an AWS managed key (default) for the encryption of artifacts that the canary stores in Amazon S3. CloudWatch Synthetics also supports artifact S3 location updation now.

# __1.12.78__ __2021-09-30__
## __AWS Account__
  - ### Features
    - This release of the Account Management API enables customers to manage the alternate contacts for their AWS accounts. For more information, see https://docs.aws.amazon.com/accounts/latest/reference/accounts-welcome.html

## __AWS Cloud Control API__
  - ### Features
    - Initial release of the SDK for AWS Cloud Control API

## __AWS Data Exchange__
  - ### Features
    - This release enables subscribers to set up automatic exports of newly published revisions using the new EventAction API.

## __AWS Network Firewall__
  - ### Features
    - This release adds support for strict ordering for stateful rule groups. Using strict ordering, stateful rules are evaluated in the exact order in which you provide them.

## __Amazon Macie 2__
  - ### Features
    - Amazon S3 bucket metadata now indicates whether an error or a bucket's permissions settings prevented Amazon Macie from retrieving data about the bucket or the bucket's objects.

## __Amazon WorkMail__
  - ### Features
    - This release adds support for mobile device access overrides management in Amazon WorkMail.

## __Amazon WorkSpaces__
  - ### Features
    - Added CreateUpdatedWorkspaceImage API to update WorkSpace images with latest software and drivers. Updated DescribeWorkspaceImages API to display if there are updates available for WorkSpace images.

# __1.12.77__ __2021-09-29__
## __AWS Lambda__
  - ### Features
    - Adds support for Lambda functions powered by AWS Graviton2 processors. Customers can now select the CPU architecture for their functions.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds alert manager and rule group namespace APIs

## __Amazon Simple Email Service__
  - ### Features
    - This release includes the ability to use 2048 bits RSA key pairs for DKIM in SES, either with Easy DKIM or Bring Your Own DKIM.

# __1.12.76__ __2021-09-28__
## __AWS Transfer Family__
  - ### Features
    - Added changes for managed workflows feature APIs.

## __EC2 Image Builder__
  - ### Features
    - Fix description for AmiDistributionConfiguration Name property, which actually refers to the output AMI name. Also updated for consistent terminology to use "base" image, and another update to fix description text.

# __1.12.75__ __2021-09-27__
## __Amazon AppIntegrations Service__
  - ### Features
    - The Amazon AppIntegrations service enables you to configure and reuse connections to external applications.

## __Amazon Connect Service__
  - ### Features
    - This release updates a set of APIs: CreateIntegrationAssociation, ListIntegrationAssociations, CreateUseCase, and StartOutboundVoiceContact. You can use it to create integrations with Amazon Pinpoint for the Amazon Connect Campaigns use case, Amazon Connect Voice ID, and Amazon Connect Wisdom.

## __Amazon Connect Wisdom Service__
  - ### Features
    - Released Amazon Connect Wisdom, a feature of Amazon Connect, which provides real-time recommendations and search functionality in general availability (GA).  For more information, see https://docs.aws.amazon.com/wisdom/latest/APIReference/Welcome.html.

## __Amazon Pinpoint__
  - ### Features
    - Added support for journey with contact center activity

## __Amazon Voice ID__
  - ### Features
    - Released the Amazon Voice ID SDK, for usage with the Amazon Connect Voice ID feature released for Amazon Connect.

## __Elastic Load Balancing__
  - ### Features
    - Adds new ALB-type target group to facilitate forwarding traffic from NLB to ALB

# __1.12.74__ __2021-09-24__
## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to get the LicenseArn in the Checkout API Response.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - DescribeInstances now returns Platform Details, Usage Operation, and Usage Operation Update Time.

# __1.12.73__ __2021-09-23__
## __AWS AppSync__
  - ### Features
    - Documented the new OpenSearchServiceDataSourceConfig data type. Added deprecation notes to the ElasticsearchDataSourceConfig data type.

## __AWS Elemental MediaConvert__
  - ### Features
    - This release adds style and positioning support for caption or subtitle burn-in from rich text sources such as TTML. This release also introduces configurable image-based trick play track generation.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Added cutoff behavior support for preventing new task invocations from starting when the maintenance window cutoff time is reached.

# __1.12.72__ __2021-09-22__
## __AWS Elemental MediaPackage VOD__
  - ### Features
    - MediaPackage VOD will now return the current processing statuses of an asset's endpoints. The status can be QUEUED, PROCESSING, PLAYABLE, or FAILED.

## __AWS Identity and Access Management__
  - ### Features
    - Added changes to OIDC API about not using port numbers in the URL.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows customers to change their Windows Server or SQL license types from Bring-Your-Own-License (BYOL) to License Included or vice-versa (using the customer's media).

## __AWS MediaTailor__
  - ### Features
    - This release adds support to configure logs for playback configuration.

## __AWS WAFV2__
  - ### Features
    - Added the regex match rule statement, for matching web requests against a single regular expression.

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for utterances statistics for bots built using Lex V2 console and APIs. For details, see: https://docs.aws.amazon.com/lexv2/latest/dg/monitoring-utterances.html

## __EC2 Image Builder__
  - ### Features
    - This feature adds support for specifying GP3 volume throughput and configuring instance metadata options for instances launched by EC2 Image Builder.

# __1.12.71__ __2021-09-21__
## __AWS IoT__
  - ### Features
    - This release adds support for verifying, viewing and filtering AWS IoT Device Defender detect violations with four verification states.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now supports versioning of custom models, improved training with ONE_DOC_PER_FILE text documents for custom entity recognition, ability to provide specific test sets during training, and live migration to new model endpoints.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release adds additional support for repository replication

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This update adds support for downloading configuration templates using new APIs (GetVpnConnectionDeviceTypes and GetVpnConnectionDeviceSampleConfiguration) and Internet Key Exchange version 2 (IKEv2) parameters for many popular CGW devices.

## __Managed Streaming for Kafka__
  - ### Features
    - Added StateInfo to ClusterInfo

# __1.12.70__ __2021-09-17__
## __AWS Database Migration Service__
  - ### Features
    - Optional flag force-planned-failover added to reboot-replication-instance API call. This flag can be used to test a planned failover scenario used during some maintenance operations.

## __Amazon Elasticsearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

## __Amazon OpenSearch Service__
  - ### Features
    - This release adds an optional parameter in the ListDomainNames API to filter domains based on the engine type (OpenSearch/Elasticsearch).

# __1.12.69__ __2021-09-16__
## __AWS RoboMaker__
  - ### Features
    - Adding support to create container based Robot and Simulation applications by introducing an environment field

## __Amazon Macie 2__
  - ### Features
    - This release adds support for specifying which managed data identifiers are used by a classification job, and retrieving a list of managed data identifiers that are available.

## __Amazon Pinpoint__
  - ### Features
    - This SDK release adds a new feature for Pinpoint campaigns, in-app messaging.

## __Amazon SageMaker Service__
  - ### Features
    - Add API for users to retry a failed pipeline execution or resume a stopped one.

## __Amazon Simple Storage Service__
  - ### Features
    - Add support for access point arn filtering in S3 CW Request Metrics

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for subtitling with Amazon Transcribe batch jobs.

## __Managed Streaming for Kafka Connect__
  - ### Features
    - This is the initial SDK release for Amazon Managed Streaming for Apache Kafka Connect (MSK Connect).

# __1.12.68__ __2021-09-14__
## __AWS WAFV2__
  - ### Features
    - This release adds support for including rate based rules in a rule group.

## __Amazon Chime__
  - ### Features
    - Adds support for SipHeaders parameter for CreateSipMediaApplicationCall.

## __Amazon Comprehend__
  - ### Features
    - Amazon Comprehend now allows you to train and run PDF and Word documents for custom entity recognition. With PDF and Word formats, you can extract information from documents containing headers, lists and tables.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for vt1 3xlarge, 6xlarge and 24xlarge instances powered by Xilinx Alveo U30 Media Accelerators for video transcoding workloads

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Project Search"

## __Amazon Transcribe Streaming Service__
  - ### Features
    - Amazon Transcribe now supports PII Identification and Redaction for streaming transcription.

# __1.12.67__ __2021-09-13__
## __AWS IoT__
  - ### Features
    - AWS IoT Rules Engine adds OpenSearch action. The OpenSearch rule action lets you stream data from IoT sensors and applications to Amazon OpenSearch Service which is a successor to Amazon Elasticsearch Service.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adds support for T3 instances on Amazon EC2 Dedicated Hosts.

# __1.12.66__ __2021-09-10__
## __AWS CloudFormation__
  - ### Features
    - Doc only update for CloudFormation that fixes several customer-reported issues.

## __Amazon EC2 Container Registry__
  - ### Features
    - This release updates terminology around KMS keys.

## __Amazon QuickSight__
  - ### Features
    - Add new data source type for Amazon OpenSearch (successor to Amazon ElasticSearch).

## __Amazon Relational Database Service__
  - ### Features
    - This release adds support for providing a custom timeout value for finding a scaling point during autoscaling in Aurora Serverless v1.

## __Amazon SageMaker Service__
  - ### Features
    - This release adds support for "Lifecycle Configurations" to SageMaker Studio

## __Amazon Transcribe Service__
  - ### Features
    - This release adds an API option for startTranscriptionJob and startMedicalTranscriptionJob that allows the user to specify encryption context key value pairs for batch jobs.

# __1.12.65__ __2021-09-09__
## __Amazon CodeGuru Reviewer__
  - ### Features
    - The Amazon CodeGuru Reviewer API now includes the RuleMetadata data object and a Severity attribute on a RecommendationSummary object. A RuleMetadata object contains information about a rule that generates a recommendation. Severity indicates how severe the issue associated with a recommendation is.

## __Amazon EMR__
  - ### Features
    - This release enables customers to login to EMR Studio using AWS Identity and Access Management (IAM) identities or identities in their Identity Provider (IdP) via IAM.

## __Amazon Lookout for Equipment__
  - ### Features
    - Added OffCondition parameter to CreateModel API

# __1.12.64__ __2021-09-08__
## __AWS Resource Access Manager__
  - ### Features
    - A minor text-only update that fixes several customer issues.

## __Amazon OpenSearch Service__
  - ### Features
    - Updated Configuration APIs for Amazon OpenSearch Service (successor to Amazon Elasticsearch Service)

## __Managed Streaming for Kafka__
  - ### Features
    - Amazon MSK has added a new API that allows you to update the encrypting and authentication settings for an existing cluster.

# __1.12.63__ __2021-09-07__
## __AWS Elemental MediaPackage__
  - ### Features
    - SPEKE v2 support for live CMAF packaging type. SPEKE v2 is an upgrade to the existing SPEKE API to support multiple encryption keys, it supports live DASH currently.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added SDK examples for SSM-Contacts.

## __AWS X-Ray__
  - ### Features
    - Updated references to AWS KMS keys and customer managed keys to reflect current terminology.

## __Amazon ElastiCache__
  - ### Features
    - Doc only update for ElastiCache

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding RegisterCluster and DeregisterCluster operations, to support connecting external clusters to EKS.

## __Amazon Forecast Service__
  - ### Features
    - Predictor creation now supports selecting an accuracy metric to optimize in AutoML and hyperparameter optimization. This release adds additional accuracy metrics for predictors - AverageWeightedQuantileLoss, MAPE and MASE.

## __Amazon Prometheus Service__
  - ### Features
    - This release adds tagging support for Amazon Managed Service for Prometheus workspace.

# __1.12.62__ __2021-09-03__
## __AWS Outposts__
  - ### Features
    - This release adds a new API CreateOrder.

## __Amazon Chime SDK Identity__
  - ### Features
    - Documentation updates for Chime

## __Amazon Chime SDK Messaging__
  - ### Features
    - Documentation updates for Chime

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Added support for CodeInconsistencies detectors

## __Amazon Fraud Detector__
  - ### Features
    - Enhanced GetEventPrediction API response to include risk scores from imported SageMaker models

# __1.12.61__ __2021-09-02__
## __AWS Certificate Manager Private Certificate Authority__
  - ### Features
    - Private Certificate Authority Service now allows customers to enable an online certificate status protocol (OCSP) responder service on their private certificate authorities. Customers can also optionally configure a custom CNAME for their OCSP responder.

## __AWS S3 Control__
  - ### Features
    - S3 Multi-Region Access Points provide a single global endpoint to access a data set that spans multiple S3 buckets in different AWS Regions.

## __AWS SecurityHub__
  - ### Features
    - New ASFF Resources: AwsAutoScalingLaunchConfiguration, AwsEc2VpnConnection, AwsEcrContainerImage. Added KeyRotationStatus to AwsKmsKey. Added AccessControlList, BucketLoggingConfiguration,BucketNotificationConfiguration and BucketNotificationConfiguration to AwsS3Bucket.

## __AWS Transfer Family__
  - ### Features
    - AWS Transfer Family introduces Managed Workflows for creating, executing, monitoring, and standardizing post file transfer processing

## __Access Analyzer__
  - ### Features
    - Updates service API, documentation, and paginators to support multi-region access points from Amazon S3.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Elastic File System__
  - ### Features
    - Adds support for EFS Intelligent-Tiering, which uses EFS Lifecycle Management to monitor file access patterns and is designed to automatically transition files to and from your corresponding Infrequent Access (IA) storage classes.

## __Amazon FSx__
  - ### Features
    - Announcing Amazon FSx for NetApp ONTAP, a new service that provides fully managed shared storage in the AWS Cloud with the data access and management capabilities of ONTAP.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports Korean (ko-KR) locale.

## __Amazon QuickSight__
  - ### Features
    - This release adds support for referencing parent datasets as sources in a child dataset.

## __Amazon S3__
  - ### Features
    - Adds a warning message that multi-region access point ARNs are not supported for AWS Java SDK v1

## __Schemas__
  - ### Features
    - This update include the support for Schema Discoverer to discover the events sent to the bus from another account. The feature will be enabled by default when discoverer is created or updated but can also be opt-in or opt-out  by specifying the value for crossAccount.

# __1.12.60__ __2021-09-01__
## __AWS CloudTrail__
  - ### Features
    - Documentation updates for CloudTrail

## __AWS Config__
  - ### Features
    - Documentation updates for config

## __AWS MediaTailor__
  - ### Features
    - This release adds support for wall clock programs in LINEAR channels.

## __AWS Service Catalog App Registry__
  - ### Features
    - Introduction of GetAssociatedResource API and GetApplication response extension for Resource Groups support.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added LaunchTemplate support for the IMDS IPv6 endpoint

# __1.12.59__ __2021-08-31__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __AWS DynamoDB Document__
  - ### Bugfixes
    - Switches filterexpression and projectionexpression arguments in two Index query() methods so that underlying implementation gets expected arguments

## __AWS IoT__
  - ### Features
    - Added Create/Update/Delete/Describe/List APIs for a new IoT resource named FleetMetric. Added a new Fleet Indexing query API named GetBucketsAggregation. Added a new field named DisconnectedReason in Fleet Indexing query response. Updated their related documentations.

## __Amazon MemoryDB__
  - ### Features
    - Documentation updates for MemoryDB

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new South African English voice - Ayanda. Ayanda is available as Neural voice only.

## __Amazon Simple Queue Service__
  - ### Features
    - Amazon SQS adds a new queue attribute, RedriveAllowPolicy, which includes the dead-letter queue redrive permission parameters. It defines which source queues can specify dead-letter queues as a JSON object.

# __1.12.58__ __2021-08-30__
## __AWS CloudFormation__
  - ### Features
    - AWS CloudFormation allows you to iteratively develop your applications when failures are encountered without rolling back successfully provisioned resources. By specifying stack failure options, you can troubleshoot resources in a CREATE_FAILED or UPDATE_FAILED status.

## __AWS CodeBuild__
  - ### Features
    - Documentation updates for CodeBuild

## __AWS Key Management Service__
  - ### Features
    - This release has changes to KMS nomenclature to remove the word master from both the "Customer master key" and "CMK" abbreviation and replace those naming conventions with "KMS key".

## __Amazon Kinesis Firehose__
  - ### Features
    - This release adds the Dynamic Partitioning feature to Kinesis Data Firehose service for S3 destinations.

# __1.12.57__ __2021-08-27__
## __Amazon EMR__
  - ### Features
    - Amazon EMR now supports auto-terminating idle EMR clusters. You can specify the idle timeout value when enabling auto-termination for both running and new clusters and Amazon EMR automatically terminates the cluster when idle timeout kicks in.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds the BootMode flag to the ImportImage API and showing the detected BootMode of an ImportImage task.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3.

# __1.12.56__ __2021-08-26__
## __AWS Compute Optimizer__
  - ### Features
    - Adds support for 1) the AWS Graviton (AWS_ARM64) recommendation preference for Amazon EC2 instance and Auto Scaling group recommendations, and 2) the ability to get the enrollment statuses for all member accounts of an organization.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for resizing VPC prefix lists

## __Amazon Rekognition__
  - ### Features
    - This release added new attributes to Rekognition RecognizeCelebities and GetCelebrityInfo API operations.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for batch transcription in six new languages - Afrikaans, Danish, Mandarin Chinese (Taiwan), New Zealand English, South African English, and Thai.

# __1.12.55__ __2021-08-25__
## __AWS DataSync__
  - ### Features
    - Added include filters to CreateTask and UpdateTask, and added exclude filters to StartTaskExecution, giving customers more granular control over how DataSync transfers files, folders, and objects.

## __Amazon CloudWatch Events__
  - ### Features
    - AWS CWEvents adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Support added for IMDS IPv6 endpoint

## __Amazon EventBridge__
  - ### Features
    - AWS EventBridge adds an enum of EXTERNAL for EcsParameters LaunchType for PutTargets API

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports triggering resource cleanup workflow when account or resource goes out of policy scope for AWS WAF, Security group, AWS Network Firewall, and Amazon Route 53 Resolver DNS Firewall policies.

# __1.12.54__ __2021-08-24__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added MBAFF encoding support for AVC video and the ability to pass encryption context from the job settings to S3.

## __AWS IoT Data Plane__
  - ### Features
    - Updated Publish with support for new Retain flag and added two new API operations: GetRetainedMessage, ListRetainedMessages.

## __Amazon Polly__
  - ### Features
    - Amazon Polly adds new New Zealand English voice - Aria. Aria is available as Neural voice only.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Updated Parameter Store property for logging improvements.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for feature tagging with Amazon Transcribe batch jobs.

# __1.12.53__ __2021-08-23__
## __AWS Backup__
  - ### Features
    - AWS Backup - Features: Evaluate your backup activity and generate audit reports.

## __AWS Database Migration Service__
  - ### Features
    - Amazon AWS DMS service now support Redis target endpoint migration. Now S3 endpoint setting is capable to setup features which are used to be configurable only in extract connection attributes.

## __AWS Glue__
  - ### Features
    - Add support for Custom Blueprints

## __AWS IoT SiteWise__
  - ### Features
    - Documentation updates for AWS IoT SiteWise

## __Amazon API Gateway__
  - ### Features
    - Adding some of the pending releases (1) Adding WAF Filter to GatewayResponseType enum (2) Ensuring consistent error model for all operations (3) Add missing BRE to GetVpcLink operation

## __Amazon Data Lifecycle Manager__
  - ### Features
    - Added AMI deprecation support for Amazon Data Lifecycle Manager EBS-backed AMI policies.

## __Amazon Fraud Detector__
  - ### Features
    - Updated an element of the DescribeModelVersion API response (LogitMetrics -> logOddsMetrics) for clarity. Added new exceptions to several APIs to protect against unlikely scenarios.

# __1.12.52__ __2021-08-20__
## __AWS RoboMaker__
  - ### Features
    - Documentation updates for RoboMaker

## __Amazon Comprehend__
  - ### Features
    - Add tagging support for Comprehend async inference job.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - encryptionInTransitSupported added to DescribeInstanceTypes API

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adds support for EKS add-ons "preserve" flag, which allows customers to maintain software on their EKS clusters after removing it from EKS add-ons management.

# __1.12.51__ __2021-08-19__
## __Amazon Appflow__
  - ### Features
    - This release adds support for SAPOData connector and extends Veeva connector for document extraction.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - The ImportImage API now supports the ability to create AMIs with AWS-managed licenses for Microsoft SQL Server for both Windows and Linux.

## __Amazon MemoryDB__
  - ### Features
    - AWS MemoryDB  SDK now supports all APIs for newly launched MemoryDB service.

## __Application Auto Scaling__
  - ### Features
    - This release extends Application Auto Scaling support for replication group of Amazon ElastiCache Redis clusters. Auto Scaling monitors and automatically expands node group count and number of replicas per node group when a critical usage threshold is met or according to customer-defined schedule.

# __1.12.50__ __2021-08-18__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __Amazon Route 53 Resolver__
  - ### Features
    - Documentation updates for Route 53 Resolver

## __Amazon SageMaker Runtime__
  - ### Features
    - Amazon SageMaker Runtime now supports InvokeEndpointAsync to asynchronously invoke endpoints that were created with the AsyncInferenceConfig object in the EndpointConfig. Asynchronous invocations support larger payload sizes in Amazon S3 and longer processing times.

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker now supports Asynchronous Inference endpoints. Adds PlatformIdentifier field that allows Notebook Instance creation with different platform selections. Increases the maximum number of containers in multi-container endpoints to 15. Adds more instance types to InstanceType field.

# __1.12.49__ __2021-08-17__
## __AWS Cloud9__
  - ### Features
    - Added DryRun parameter to CreateEnvironmentEC2 API. Added ManagedCredentialsActions parameter to UpdateEnvironment API

## __AWS Cost Explorer Service__
  - ### Features
    - This release is a new feature for Cost Categories: Split charge rules. Split charge rules enable you to allocate shared costs between your cost category values.

## __Amazon CloudDirectory__
  - ### Features
    - Documentation updates for clouddirectory

## __Amazon CloudWatch Logs__
  - ### Features
    - Documentation-only update for CloudWatch Logs

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for EC2 ED25519 key pairs for authentication

# __1.12.48__ __2021-08-16__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to select how batch build statuses are sent to the source provider for a project.

## __AWS Config__
  - ### Features
    - Update ResourceType enum with values for Backup Plan, Selection, Vault, RecoveryPoint; ECS Cluster, Service, TaskDefinition; EFS AccessPoint, FileSystem; EKS Cluster; ECR Repository resources

## __AWS Directory Service__
  - ### Features
    - This release adds support for describing client authentication settings.

## __AWS IoT SiteWise__
  - ### Features
    - AWS IoT SiteWise added query window for the interpolation interval. AWS IoT SiteWise computes each interpolated value by using data points from the timestamp of each interval minus the window to the timestamp of each interval plus the window.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows end users to call CheckoutLicense API using new CheckoutType PERPETUAL. Perpetual checkouts allow sellers to check out a quantity of entitlements to be drawn down for consumption.

## __Amazon Simple Storage Service__
  - ### Features
    - Documentation updates for Amazon S3

# __1.12.47__ __2021-08-13__
## __Amazon Connect Customer Profiles__
  - ### Features
    - This release introduces Standard Profile Objects, namely Asset and Case which contain values populated by data from third party systems and belong to a specific profile. This release adds an optional parameter, ObjectFilter to the ListProfileObjects API in order to search for these Standard Objects.

## __Amazon EMR__
  - ### Features
    - Amazon EMR customers can now specify custom AMIs at the instance level in their clusters. This allows using custom AMIs in clusters that have instances with different instruction set architectures, e.g. m5.xlarge (x86) and m6g.xlarge (ARM).

## __Amazon ElastiCache__
  - ### Features
    - This release adds ReplicationGroupCreateTime field to ReplicationGroup which indicates the UTC time when ElastiCache ReplicationGroup is created

## __Amazon QuickSight__
  - ### Features
    - Documentation updates for QuickSight.

# __1.12.46__ __2021-08-12__
## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds support for the output of a recipe job results to Tableau Hyper format.

## __AWS Lambda__
  - ### Features
    - Lambda Python 3.9 runtime launch

## __Amazon API Gateway__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

## __Amazon SageMaker Service__
  - ### Features
    - Amazon SageMaker Autopilot adds new metrics for all candidate models generated by Autopilot experiments.

## __AmazonApiGatewayV2__
  - ### Features
    - Adding support for ACM imported or private CA certificates for mTLS enabled domain names

# __1.12.45__ __2021-08-11__
## __AWS CodeBuild__
  - ### Features
    - CodeBuild now allows you to make the build results for your build projects available to the public without requiring access to an AWS account.

## __AWS SDK for Java__
  - ### Bugfixes
    - Use full jitter and update base delay for STANDARD retry mode defaults

## __AWS Snow Device Management__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices.

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for ECS.

## __Amazon Elastic Block Store__
  - ### Features
    - Documentation updates for Amazon EBS direct APIs.

## __Amazon Route 53__
  - ### Features
    - Documentation updates for route53

## __AmazonNimbleStudio__
  - ### Features
    - Add new attribute 'ownedBy' in Streaming Session APIs. 'ownedBy' represents the AWS SSO Identity Store User ID of the owner of the Streaming Session resource.

# __1.12.44__ __2021-08-10__
## __Amazon Chime__
  - ### Features
    - Add support for "auto" in Region field of StartMeetingTranscription API request.

# __1.12.43__ __2021-08-09__
## __AWS WAFV2__
  - ### Features
    - This release adds APIs to support versioning feature of AWS WAF Managed rule groups

## __Amazon Rekognition__
  - ### Features
    - This release adds support for four new types of segments (opening credits, content segments, slates, and studio logos), improved accuracy for credits and shot detection and new filters to control black frame detection.

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Documentation updates for AWS Systems Manager.

# __1.12.42__ __2021-08-06__
## __Amazon Athena__
  - ### Features
    - Documentation updates for Athena.

## __Amazon Chime SDK Identity__
  - ### Features
    - The Amazon Chime SDK Identity APIs allow software developers to create and manage unique instances of their messaging applications.

## __Amazon Chime SDK Messaging__
  - ### Features
    - The Amazon Chime SDK Messaging APIs allow software developers to send and receive messages in custom messaging applications.

## __Amazon Connect Service__
  - ### Features
    - This release adds support for agent status and hours of operation. For details, see the Release Notes in the Amazon Connect Administrator Guide.

## __Amazon Lightsail__
  - ### Features
    - This release adds support to track when a bucket access key was last used.

## __Synthetics__
  - ### Features
    - Documentation updates for Visual Monitoring feature and other doc ticket fixes.

# __1.12.41__ __2021-08-05__
## __Amazon Lex Model Building V2__
  - ### Features
    - Customers can now toggle the active field on prompts and responses.

## __Auto Scaling__
  - ### Features
    - EC2 Auto Scaling adds configuration checks and Launch Template validation to Instance Refresh.

# __1.12.40__ __2021-08-04__
## __AWS SDK for Java__
  - ### Features
    - Moving 1.11.x changes to a separate changelog file.

## __AWS Systems Manager Incident Manager__
  - ### Features
    - Documentation updates for Incident Manager.

## __Amazon EventBridge__
  - ### Features
    - Documentation updates to add EC2 Image Builder as a target on PutTargets.

## __Amazon Relational Database Service__
  - ### Features
    - This release adds AutomaticRestartTime to the DescribeDBInstances and DescribeDBClusters operations. AutomaticRestartTime indicates the time when a stopped DB instance or DB cluster is restarted automatically.

## __Amazon Transcribe Service__
  - ### Features
    - This release adds support for call analytics (batch) within Amazon Transcribe.

## __EC2 Image Builder__
  - ### Features
    - Updated list actions to include a list of valid filters that can be used in the request.

# __1.12.39__ __2021-08-03__
## __AWS Elemental MediaConvert__
  - ### Features
    - AWS Elemental MediaConvert SDK has added control over the passthrough of XDS captions metadata to outputs.

## __AWS Glue__
  - ### Features
    - Add ConcurrentModificationException to create-table, delete-table, create-database, update-database, delete-database

## __AWS IoT SiteWise__
  - ### Features
    - My AWS Service (placeholder) - This release introduces custom Intervals and offset for tumbling window in metric for AWS IoT SiteWise.

## __AWS Proton__
  - ### Features
    - Docs only add idempotent create apis

## __AWS SDK for Java__
  - ### Features
    - Allow configuring the EC2 metadata connect/read timeout via the AWS_METADATA_SERVICE_TIMEOUT environment variable

  - ### Bugfixes
    - Prevent deadlock in Jackson-databind's PropertyNamingStrategy (only when Jackson-databind 2.12.x is on the classpath): https://github.com/FasterXML/jackson-databind/issues/2715

## __Amazon Redshift__
  - ### Features
    - API support for Redshift Data Sharing feature.

# __1.12.38__ __2021-08-02__
## __AWS IoT Greengrass V2__
  - ### Features
    - This release adds support for component system resource limits and idempotent Create operations. You can now specify the maximum amount of CPU and memory resources that each component can use.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Added new attribute in AcceptCode API. AcceptCodeValidation takes in two values - ENFORCE, IGNORE. ENFORCE forces validation of accept code and IGNORE ignores it which is also the default behavior; Corrected TagKeyList length from 200 to 50

# __1.12.37__ __2021-07-30__
## __AWS AppSync__
  - ### Features
    - AWS AppSync now supports a new authorization mode allowing you to define your own authorization logic using an AWS Lambda function.

## __AWS Secrets Manager__
  - ### Features
    - Add support for KmsKeyIds in the ListSecretVersionIds API response

## __Amazon SageMaker Service__
  - ### Features
    - API changes with respect to Lambda steps in model building pipelines. Adds several waiters to async Sagemaker Image APIs. Add more instance types to AppInstanceType field

## __Elastic Load Balancing__
  - ### Features
    - Client Port Preservation ALB Attribute Launch

# __1.12.36__ __2021-07-29__
## __AWS IoT__
  - ### Features
    - Increase maximum credential duration of role alias to 12 hours.

## __AWS IoT SiteWise__
  - ### Features
    - Added support for AWS IoT SiteWise Edge. You can now create an AWS IoT SiteWise gateway that runs on AWS IoT Greengrass V2. With the gateway,  you can collect local server and equipment data, process the data, and export the selected data from the edge to the AWS Cloud.

## __AWS Savings Plans__
  - ### Features
    - Documentation update for valid Savings Plans offering ID pattern

## __Amazon Chime__
  - ### Features
    - Adds support for live transcription of meetings with Amazon Transcribe and Amazon Transcribe Medical.  The new APIs, StartMeetingTranscription and StopMeetingTranscription, control the generation of user-attributed transcriptions sent to meeting clients via Amazon Chime SDK data messages.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for G4ad xlarge and 2xlarge instances powered by AMD Radeon Pro V520 GPUs and AMD 2nd Generation EPYC processors

# __1.12.35__ __2021-07-28__
## __AWS CloudFormation__
  - ### Features
    - SDK update to support Importing existing Stacks to new/existing Self Managed StackSet - Stack Import feature.

## __AWS Single Sign-On Admin__
  - ### Features
    - Documentation updates for arn:aws:trebuchet:::service:v1:03a2216d-1cda-4696-9ece-1387cb6f6952

# __1.12.34__ __2021-07-28__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.33__ __2021-07-27__
## __AWS Batch__
  - ### Features
    - Add support for ListJob filters

## __AWS IoT Analytics__
  - ### Features
    - IoT Analytics now supports creating a dataset resource with IoT SiteWise MultiLayerStorage data stores, enabling customers to query industrial data within the service. This release includes adding JOIN functionality for customers to query multiple data sources in a dataset.

## __AWS IoT Wireless__
  - ### Features
    - Add SidewalkManufacturingSn as an identifier to allow Customer to query WirelessDevice, in the response, AmazonId is added in the case that Sidewalk device is return.

## __AWS Route53 Recovery Control Config__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Configuration APIs help you create and delete clusters, control panels, routing controls and safety rules. State changes (On/Off) of routing controls are not part of configuration APIs.

## __AWS Route53 Recovery Readiness__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's readiness check capability continually monitors resource quotas, capacity, and network routing policies to ensure that the recovery environment is scaled and configured to take over when needed.

## __AWS Shield__
  - ### Features
    - Change name of DDoS Response Team (DRT) to Shield Response Team (SRT)

## __Amazon Lex Model Building V2__
  - ### Features
    - Add waiters that automatically poll for resource status for asynchronous operations, such as building a bot

## __Amazon QuickSight__
  - ### Features
    - Add support to use row-level security with tags when embedding dashboards for users not provisioned in QuickSight

## __Amazon Route 53__
  - ### Features
    - This release adds support for the RECOVERY_CONTROL health check type to be used in conjunction with Route53 Application Recovery Controller.

## __Redshift Data API Service__
  - ### Features
    - Added structures to support new Data API operation BatchExecuteStatement, used to execute multiple SQL statements within a single transaction.

## __Route53 Recovery Cluster__
  - ### Features
    - Amazon Route 53 Application Recovery Controller's routing control - Routing Control Data Plane APIs help you update the state (On/Off) of the routing controls to reroute traffic across application replicas in a 100% available manner.

# __1.12.32__ __2021-07-26__
## __AWS Proton__
  - ### Features
    - Documentation-only update links

## __AWS S3 Control__
  - ### Features
    - S3 Access Point aliases can be used anywhere you use S3 bucket names to access data in S3

## __AWS SSO Identity Store__
  - ### Features
    - Documentation updates for SSO API Ref.

## __Amazon CloudWatch__
  - ### Features
    - SDK update to support creation of Cross-Account Metric Alarms and update API documentation.

## __Amazon Textract__
  - ### Features
    - Adds support for AnalyzeExpense, a new API to extract relevant data such as contact information, items purchased, and vendor name, from almost any invoice or receipt without the need for any templates or configuration.

## __Synthetics__
  - ### Features
    - CloudWatch Synthetics now supports visual testing in its canaries.

# __1.12.31__ __2021-07-23__
## __AWS SecurityHub__
  - ### Features
    - Added product name, company name, and Region fields for security findings. Added details objects for RDS event subscriptions and AWS ECS services. Added fields to the details for AWS Elasticsearch domains.

## __Amazon S3 on Outposts__
  - ### Features
    - Add on-premise access type support for endpoints

## __EC2 Image Builder__
  - ### Features
    - Update to documentation to reapply missing change to SSM uninstall switch default value and improve description.

# __1.12.30__ __2021-07-22__
## __AWS Elemental MediaLive__
  - ### Features
    - MediaLive now supports passing through style data on WebVTT caption outputs.

## __AWS Glue DataBrew__
  - ### Features
    - This SDK release adds two new features: 1) Output to Native JDBC destinations and 2) Adding configurations to profile jobs

## __AWS S3 Control__
  - ### Features
    - Documentation updates for Amazon S3-control

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release allows customers to assign prefixes to their elastic network interface and to reserve IP blocks in their subnet CIDRs. These reserved blocks can be used to assign prefixes to elastic network interfaces or be excluded from auto-assignment.

## __Amazon QLDB__
  - ### Features
    - Amazon QLDB now supports ledgers encrypted with customer managed KMS keys. Changes in CreateLedger, UpdateLedger and DescribeLedger APIs to support the changes.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.29__ __2021-07-21__
## __AWS CodeBuild__
  - ### Features
    - AWS CodeBuild now allows you to set the access permissions for build artifacts, project artifacts, and log files that are uploaded to an Amazon S3 bucket that is owned by another account.

## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS Lambda__
  - ### Features
    - New ResourceConflictException error code for PutFunctionEventInvokeConfig, UpdateFunctionEventInvokeConfig, and DeleteFunctionEventInvokeConfig operations.

## __AWS Proton__
  - ### Features
    - Documentation updates for AWS Proton

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now provides a data source connector for Amazon WorkDocs. For more information, see https://docs.aws.amazon.com/kendra/latest/dg/data-source-workdocs.html

## __Amazon Elastic MapReduce__
  - ### Features
    - EMR now supports new DescribeReleaseLabel and ListReleaseLabel APIs. They can provide Amazon EMR release label details. You can programmatically list available releases and applications for a specific Amazon EMR release label.

## __Amazon Personalize__
  - ### Features
    - My AWS Service (placeholder) - Making minProvisionedTPS an optional parameter when creating a campaign. If not provided, it defaults to 1.

## __Amazon Relational Database Service__
  - ### Features
    - Adds the OriginalSnapshotCreateTime field to the DBSnapshot response object. This field timestamps the underlying data of a snapshot and doesn't change when the snapshot is copied.

## __Elastic Load Balancing__
  - ### Features
    - Adds support for enabling TLS protocol version and cipher suite headers to be sent to backend targets for Application Load Balancers.

# __1.12.28__ __2021-07-20__
## __AWS Compute Optimizer__
  - ### Features
    - Documentation updates for Compute Optimizer

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Added idempotency to the CreateVolume API using the ClientToken request parameter

# __1.12.27__ __2021-07-19__
## __AWS Direct Connect__
  - ### Features
    - Documentation updates for directconnect

## __AWS Health APIs and Notifications__
  - ### Features
    - In the Health API, the maximum number of entities for the EventFilter and EntityFilter data types has changed from 100 to 99. This change is related to an internal optimization of the AWS Health service.

## __AWS RoboMaker__
  - ### Features
    - This release allows customers to create a new version of WorldTemplates with support for Doors.

## __Amazon EMR Containers__
  - ### Features
    - Updated DescribeManagedEndpoint and ListManagedEndpoints to return failureReason and stateDetails in API response.

## __Amazon Location Service__
  - ### Features
    - Add five new API operations: UpdateGeofenceCollection, UpdateMap, UpdatePlaceIndex, UpdateRouteCalculator, UpdateTracker.

## __EC2 Image Builder__
  - ### Features
    - Documentation updates for reversal of default value for additional instance configuration SSM switch, plus improved descriptions for semantic versioning.

# __1.12.26__ __2021-07-16__
## __AWS Audit Manager__
  - ### Features
    - This release relaxes the S3 URL character restrictions in AWS Audit Manager. Regex patterns have been updated for the following attributes: s3RelativePath, destination, and s3ResourcePath. 'AWS' terms have also been replaced with entities to align with China Rebrand documentation efforts.

## __Amazon AppIntegrations Service__
  - ### Features
    - Documentation update for AppIntegrations Service

## __Amazon Chime__
  - ### Features
    - This SDK release adds Account Status as one of the attributes in Account API response

# __1.12.25__ __2021-07-15__
## __AWS IoT SiteWise__
  - ### Features
    - Update the default endpoint for the APIs used to manage asset models, assets, gateways, tags, and account configurations. If you have firewalls with strict egress rules, configure the rules to grant you access to api.iotsitewise.[region].amazonaws.com or api.iotsitewise.[cn-region].amazonaws.com.cn.

## __AWS SDK for Java__
  - ### Features
    - Adaptive retry mode dynamically limits the rate of AWS requests to maximize success rate. This may be at the expense of
      request latency. Adaptive retry mode is not recommended when predictable latency is important. 

      Warning: Adaptive retry mode assumes that the client is working against a single resource (e.g. one DynamoDB Table or
      one S3 Bucket). If you use a single client for multiple resources, throttling or outages associated with one resource
      will result in increased latency and failures when accessing all other resources via the same client. When using
      adaptive retry mode, we recommend using a single client per resource.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon EC2 Container Service__
  - ### Features
    - Documentation updates for support of awsvpc mode on Windows.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This feature enables customers  to specify weekly recurring time window(s) for scheduled events that reboot, stop or terminate EC2 instances.

## __Amazon Lex Model Building Service__
  - ### Features
    - Lex now supports the en-IN locale

# __1.12.24__ __2021-07-14__
## __AWS Certificate Manager__
  - ### Features
    - Added support for RSA 3072 SSL certificate import

## __AWS Database Migration Service__
  - ### Features
    - Release of feature needed for ECA-Endpoint settings. This allows customer to delete a field in endpoint settings by using --exact-settings flag in modify-endpoint api. This also displays default values for certain required fields of endpoint settings in describe-endpoint-settings api.

## __AWS Glue__
  - ### Features
    - Add support for Event Driven Workflows

## __AWS Well-Architected Tool__
  - ### Features
    - This update provides support for Well-Architected API users to mark answer choices as not applicable.

## __Amazon HealthLake__
  - ### Features
    - General availability for Amazon HealthLake. StartFHIRImportJob and StartFHIRExportJob APIs now require AWS KMS parameter. For more information, see the Amazon HealthLake Documentation https://docs.aws.amazon.com/healthlake/index.html.

## __Amazon Lightsail__
  - ### Features
    - This release adds support for the Amazon Lightsail object storage service, which allows you to create buckets and store objects.

# __1.12.23__ __2021-07-13__
## __AWS Direct Connect__
  - ### Features
    - This release adds a new filed named awsLogicalDeviceId that it displays the AWS Direct Connect endpoint which terminates a physical connection's BGP Sessions.

## __AWS Price List Service__
  - ### Features
    - Documentation updates for api.pricing

## __Amazon DevOps Guru__
  - ### Features
    - Add paginator for GetCostEstimation

## __Amazon Lex Model Building Service__
  - ### Features
    - Customers can now migrate bots built with Lex V1 APIs to V2 APIs. This release adds APIs to initiate and manage the migration of a bot.

## __Amazon Redshift__
  - ### Features
    - Release new APIs to support new Redshift feature - Authentication Profile

## __Amazon Simple Systems Manager (SSM)__
  - ### Features
    - Changes to OpsCenter APIs to support a new feature, operational insights.

## __AmplifyBackend__
  - ### Features
    - Added Sign in with Apple OAuth provider.

# __1.12.22__ __2021-07-12__
## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports Principal Store

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Documentation updates for Wesley to support the parallel node upgrade feature.

# __1.12.21__ __2021-07-09__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert now supports color, style and position information passthrough from 608 and Teletext to SRT and WebVTT subtitles. MediaConvert now also supports Automatic QVBR quality levels for QVBR RateControlMode.

## __Amazon Fraud Detector__
  - ### Features
    - This release adds support for ML Explainability to display model variable importance value in Amazon Fraud Detector.

## __Amazon SageMaker Service__
  - ### Features
    - Releasing new APIs related to Tuning steps in model building pipelines.

# __1.12.20__ __2021-07-08__
## __AWS MediaTailor__
  - ### Features
    - Add ListAlerts for Channel, Program, Source Location, and VOD Source to return alerts for resources.

## __AWS Outposts__
  - ### Features
    - Added property filters for listOutposts

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Updated description for CreateContactChannel contactId.

## __Amazon DevOps Guru__
  - ### Features
    - Add AnomalyReportedTimeRange field to include open and close time of anomalies.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added waiters for EKS FargateProfiles.

## __Firewall Management Service__
  - ### Features
    - AWS Firewall Manager now supports route table monitoring, and provides remediation action recommendations to security administrators for AWS Network Firewall policies with misconfigured routes.

# __1.12.19__ __2021-07-07__
## __AWS Identity and Access Management__
  - ### Features
    - Documentation updates for AWS Identity and Access Management (IAM).

## __AWS IoT SiteWise__
  - ### Features
    - This release add storage configuration APIs for AWS IoT SiteWise.

## __AWS Security Token Service__
  - ### Features
    - Documentation updates for AWS Security Token Service.

## __AWS Storage Gateway__
  - ### Features
    - Adding support for oplocks for SMB file shares,  S3 Access Point and S3 Private Link for all file shares and IP address support for file system associations

## __Amazon Chime__
  - ### Features
    - Releasing new APIs for AWS Chime MediaCapturePipeline

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront now provides two new APIs, ListConflictingAliases and AssociateAlias, that help locate and move Alternate Domain Names (CNAMEs) if you encounter the CNAMEAlreadyExists error code.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds resource ids and tagging support for VPC security group rules.

## __AmazonMQ__
  - ### Features
    - adds support for modifying the maintenance window for brokers.

# __1.12.18__ __2021-07-06__
## __AWS Lambda__
  - ### Features
    - Added support for AmazonMQRabbitMQ as an event source. Added support for VIRTUAL_HOST as SourceAccessType for streams event source mappings.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Adding new error code UnsupportedAddonModification for Addons in EKS

## __Amazon Macie 2__
  - ### Features
    - Sensitive data findings in Amazon Macie now include enhanced location data for JSON and JSON Lines files

## __Amazon Simple Notification Service__
  - ### Features
    - Documentation updates for Amazon SNS.

## __Application Migration Service__
  - ### Features
    - Bug fix: Remove not supported EBS encryption type "NONE"

## __EC2 Image Builder__
  - ### Features
    - Adds support for specifying parameters to customize components for recipes. Expands configuration of the Amazon EC2 instances that are used for building and testing images, including the ability to specify commands to run on launch, and more control over installation and removal of the SSM agent.

# __1.12.17__ __2021-07-02__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release removes network-insights-boundary

## __Elastic Load Balancing__
  - ### Features
    - Documentation updates for elasticloadbalancingv2

# __1.12.16__ __2021-07-01__
## __Amazon Elastic Compute Cloud__
  - ### Features
    - Adding a new reserved field to support future infrastructure improvements for Amazon EC2 Fleet.

## __Amazon SageMaker Service__
  - ### Features
    - SageMaker model registry now supports up to 5 containers and associated environment variables.

## __Amazon Simple Queue Service__
  - ### Features
    - Documentation updates for Amazon SQS.

# __1.12.15__ __2021-06-30__
## __AWS Cloud Map__
  - ### Features
    - AWS Cloud Map now allows configuring the TTL of the SOA record for a hosted zone to control the negative caching for new services.

## __AWS Elemental MediaPackage VOD__
  - ### Features
    - Add support for Widevine DRM on CMAF packaging configurations. Both Widevine and FairPlay DRMs can now be used simultaneously, with CBCS encryption.

## __AWS Glue DataBrew__
  - ### Features
    - Adds support for the output of job results to the AWS Glue Data Catalog.

## __AWS Systems Manager Incident Manager Contacts__
  - ### Features
    - Fixes the tag key length range to 128 chars,  tag value length to 256 chars; Adds support for UTF-8 chars for contact and channel names, Allows users to unset name in UpdateContact API; Adds throttling exception to StopEngagement API, validation exception to APIs UntagResource, ListTagsForResource

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra Enterprise Edition now offered in smaller more granular units to enable customers with smaller workloads. Virtual Storage Capacity units now offer scaling in increments of 100,000 documents (up to 30GB) per unit and Virtual Query Units offer scaling increments of 8,000 queries per day.

## __Auto Scaling__
  - ### Features
    - Amazon EC2 Auto Scaling infrastructure improvements and optimizations.

# __1.12.14__ __2021-06-28__
## __AWS Elemental MediaConvert__
  - ### Features
    - MediaConvert adds support for HDR10+, ProRes 4444,  and XAVC outputs, ADM/DAMF support for Dolby Atmos ingest, and alternative audio and WebVTT caption ingest via HLS inputs. MediaConvert also now supports creating trickplay outputs for Roku devices for HLS, CMAF, and DASH output groups.

## __AWS Glue__
  - ### Features
    - Add JSON Support for Glue Schema Registry

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the DisableLogging API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Service__
  - ### Features
    - Sagemaker Neo now supports running compilation jobs using customer's Amazon VPC

# __1.12.13__ __2021-06-25__
## __AWS Proton__
  - ### Features
    - Added waiters for template registration, service operations, and environment deployments.

## __Amazon Import/Export Snowball__
  - ### Features
    - AWS Snow Family customers can remotely monitor and operate their connected AWS Snowcone devices. AWS Snowball Edge Storage Optimized customers can now import and export their data using NFS.

## __AmplifyBackend__
  - ### Features
    - Imports an existing backend authentication resource.

# __1.12.12__ __2021-06-24__
## __AWS Cloud9__
  - ### Features
    - Minor update to AWS Cloud9 documentation to allow correct parsing of outputted text

## __AWS CodeBuild__
  - ### Features
    - BucketOwnerAccess is currently not supported

## __AWS SecurityHub__
  - ### Features
    - Added new resource details for ECS clusters and ECS task definitions. Added additional information for S3 buckets, Elasticsearch domains, and API Gateway V2 stages.

## __AWS Transfer Family__
  - ### Features
    - Customers can successfully use legacy clients with Transfer Family endpoints enabled for FTPS and FTP behind routers, firewalls, and load balancers by providing a Custom IP address used for data channel communication.

## __AWS WAFV2__
  - ### Features
    - Added support for 15 new text transformation.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports SharePoint 2013 and SharePoint 2016 when using a SharePoint data source.

## __Amazon Chime__
  - ### Features
    - Adds EventIngestionUrl field to MediaPlacement

## __Amazon Connect Service__
  - ### Features
    - Released Amazon Connect quick connects management API for general availability (GA). For more information, see https://docs.aws.amazon.com/connect/latest/APIReference/Welcome.html

## __Amazon DynamoDB Accelerator (DAX)__
  - ### Features
    - Add support for encryption in transit to DAX clusters.

# __1.12.11__ __2021-06-23__
## __AWS Cloud9__
  - ### Features
    - Updated documentation for CreateEnvironmentEC2 to explain that because Amazon Linux AMI has ended standard support as of December 31, 2020, we recommend you choose Amazon Linux 2--which includes long term support through 2023--for new AWS Cloud9 environments.

## __AWS License Manager__
  - ### Features
    - AWS License Manager now allows license administrators and end users to communicate to each other by setting custom status reasons when updating the status on a granted license.

## __AWS MediaTailor__
  - ### Features
    - Update GetChannelSchedule to return information on ad breaks.

## __Amazon CloudFront__
  - ### Features
    - Amazon CloudFront adds support for a new security policy, TLSv1.2_2021.

## __Amazon CloudSearch__
  - ### Features
    - This release replaces previous generation CloudSearch instances with equivalent new instances that provide better stability at the same price.

## __Amazon CloudWatch Events__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon CodeGuru Reviewer__
  - ### Features
    - Adds support for S3 based full repository analysis and changed lines scan.

## __Amazon DocumentDB with MongoDB compatibility__
  - ### Features
    - DocumentDB documentation-only edits

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for provisioning your own IP (BYOIP) range in multiple regions. This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon EventBridge__
  - ### Features
    - Added the following parameters to ECS targets: CapacityProviderStrategy, EnableECSManagedTags, EnableExecuteCommand, PlacementConstraints, PlacementStrategy, PropagateTags, ReferenceId, and Tags

## __Amazon QuickSight__
  - ### Features
    - Releasing new APIs for AWS QuickSight Folders

# __1.12.10__ __2021-06-21__
## __AWS CloudFormation__
  - ### Features
    - CloudFormation registry service now supports 3rd party public type sharing

# __1.12.9__ __2021-06-17__
## __AWS SDK for Java__
  - ### Bugfixes
    - Removed 'in-amazon-1' region.

## __AWSKendraFrontendService__
  - ### Features
    - Amazon Kendra now supports the indexing of web documents for search through the web crawler.

## __Amazon Chime__
  - ### Features
    - This release adds a new API UpdateSipMediaApplicationCall, to update an in-progress call for SipMediaApplication.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables Database Activity Streams for RDS Oracle

## __Amazon SageMaker Service__
  - ### Features
    - Enable ml.g4dn instance types for SageMaker Batch Transform and SageMaker Processing

# __1.12.8__ __2021-06-16__
## __AWS Key Management Service__
  - ### Features
    - Adds support for multi-Region keys

## __AWS MediaTailor__
  - ### Features
    - Adds AWS Secrets Manager Access Token Authentication for Source Locations

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds support for VLAN-tagged network traffic over an Elastic Network Interface (ENI). This feature is in limited Preview for this release. Contact your account manager if you are interested in this feature.

## __Amazon Relational Database Service__
  - ### Features
    - This release enables fast cloning in Aurora Serverless. You can now clone between Aurora Serverless clusters and Aurora Provisioned clusters.

# __1.12.7__ __2021-06-15__
## __AWS SDK for Java__
  - ### Features
    - Launch new region in-amazon-1 in India (Begumpet)

## __Amazon Connect Service__
  - ### Features
    - This release adds new sets of APIs: AssociateBot, DisassociateBot, and ListBots. You can use it to programmatically add an Amazon Lex bot or Amazon Lex V2 bot on the specified Amazon Connect instance

## __Amazon Elastic Compute Cloud__
  - ### Features
    - EC2 M5n, M5dn, R5n, R5dn metal instances with 100 Gbps network performance and Elastic Fabric Adapter (EFA) for ultra low latency

## __Amazon Lex Model Building V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for model building

## __Amazon Lex Runtime V2__
  - ### Features
    - This release adds support for Multi Valued slots in Amazon Lex V2 APIs for runtime

## __Redshift Data API Service__
  - ### Features
    - Redshift Data API service now supports SQL parameterization.

# __1.12.6__ __2021-06-14__
## __AWS IoT Analytics__
  - ### Features
    - Adds support for data store partitions.

## __AWS IoT Greengrass V2__
  - ### Features
    - We have verified the APIs being released here and are ready to release

## __AWS SDK for Java__
  - ### Bugfixes
    - Added path normalization when creating a canonical request for signers. Supports pathnames with dots.

## __Amazon Lookout for Metrics__
  - ### Features
    - Added "LEARNING" status for anomaly detector and updated description for "Offset" parameter in MetricSet APIs.

# __1.12.5__ __2021-06-11__
## __AWS Elemental MediaLive__
  - ### Features
    - AWS MediaLive now supports OCR-based conversion of DVB-Sub and SCTE-27 image-based source captions to WebVTT, and supports ingest of ad avail decorations in HLS input manifests.

## __AWS MediaConnect__
  - ### Features
    - When you enable source failover, you can now designate one of two sources as the primary source. You can choose between two failover modes to prevent any disruption to the video stream. Merge combines the sources into a single stream. Failover allows switching between a primary and a backup stream.

## __Amazon Elastic Compute Cloud__
  - ### Features
    - Amazon EC2 adds new AMI property to flag outdated AMIs

# __1.12.4__ __2021-06-10__
## __AWS App Mesh__
  - ### Features
    - AppMesh now supports additional routing capabilities in match and rewrites for Gateway Routes and Routes. Additionally, App Mesh also supports specifying DNS Response Types in Virtual Nodes.

## __AWS Resource Access Manager__
  - ### Features
    - AWS Resource Access Manager (RAM) is releasing new field isResourceTypeDefault in ListPermissions and GetPermission response, and adding permissionArn parameter to GetResourceShare request to filter by permission attached

## __Amazon Appflow__
  - ### Features
    - Adding MAP_ALL task type support.

## __Amazon Chime__
  - ### Features
    - This SDK release adds support for UpdateAccount API to allow users to update their default license on Chime account.

## __Amazon Cognito Identity Provider__
  - ### Features
    - Amazon Cognito now supports targeted sign out through refresh token revocation

## __Amazon Elastic Compute Cloud__
  - ### Features
    - This release adds a new optional parameter connectivityType (public, private) for the CreateNatGateway API. Private NatGateway does not require customers to attach an InternetGateway to the VPC and can be used for communication with other VPCs and on-premise networks.

## __Amazon Managed Blockchain__
  - ### Features
    - This release supports KMS customer-managed Customer Master Keys (CMKs) on member-specific Hyperledger Fabric resources.

## __Amazon Redshift__
  - ### Features
    - Added InvalidClusterStateFault to the ModifyAquaConfiguration API, thrown when calling the API on a non available cluster.

## __Amazon SageMaker Feature Store Runtime__
  - ### Features
    - Release BatchGetRecord API for AWS SageMaker Feature Store Runtime.

## __Amazon SageMaker Service__
  - ### Features
    - Using SageMaker Edge Manager with AWS IoT Greengrass v2 simplifies accessing, maintaining, and deploying models to your devices. You can now create deployable IoT Greengrass components during edge packaging jobs. You can choose to create a device fleet with or without creating an AWS IoT role alias.

# __1.12.3__ __2021-06-09__
## __AWS Proton__
  - ### Features
    - This is the initial SDK release for AWS Proton

## __AWS Transfer Family__
  - ### Features
    - Documentation updates for the AWS Transfer Family service.

## __AWSKendraFrontendService__
  - ### Features
    - AWS Kendra now supports checking document status.

## __Amazon Personalize Events__
  - ### Features
    - Support for unstructured text inputs in the items dataset to to automatically extract key information from product/content description as an input when creating solution versions.

# __1.12.2__ __2021-06-08__
## __AWS Service Catalog__
  - ### Features
    - increase max pagesize for List/Search apis

## __Amazon Cognito Identity Provider__
  - ### Features
    - Documentation updates for cognito-idp

## __Amazon FSx__
  - ### Features
    - This release adds support for auditing end-user access to files, folders, and file shares using Windows event logs, enabling customers to meet their security and compliance needs.

## __Amazon Macie 2__
  - ### Features
    - This release of the Amazon Macie API introduces stricter validation of S3 object criteria for classification jobs.

# __1.12.1__ __2021-06-07__
## __AWS Glue__
  - ### Features
    - Add SampleSize variable to S3Target to enable s3-sampling feature through API.

## __Amazon Elastic Kubernetes Service__
  - ### Features
    - Added updateConfig option that allows customers to control upgrade velocity in Managed Node Group.

## __Amazon Personalize__
  - ### Features
    - Update regex validation in kmsKeyArn and s3 path API parameters for AWS Personalize APIs

## __Amazon SageMaker Service__
  - ### Features
    - AWS SageMaker - Releasing new APIs related to Callback steps in model building pipelines. Adds experiment integration to model building pipelines.

