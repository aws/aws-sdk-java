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

