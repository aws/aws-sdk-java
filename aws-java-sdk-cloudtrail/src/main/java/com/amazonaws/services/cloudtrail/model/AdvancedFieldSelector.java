/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A single selector statement in an advanced event selector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudtrail-2013-11-01/AdvancedFieldSelector" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdvancedFieldSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A field in a CloudTrail event record on which to filter events to be logged. For event data stores for CloudTrail
     * Insights events, Config configuration items, Audit Manager evidence, or events outside of Amazon Web Services,
     * the field is used only for selecting events as filtering is not supported.
     * </p>
     * <p>
     * For CloudTrail management events, supported fields include <code>readOnly</code>, <code>eventCategory</code>, and
     * <code>eventSource</code>.
     * </p>
     * <p>
     * For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     * <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <p>
     * For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence, or
     * events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and <code>write</code>
     * events. A value of <code>true</code> logs only <code>read</code> events. A value of <code>false</code> logs only
     * <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     * <code>rdsdata.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have multiple
     * values for this ﬁeld, separated by commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail management events, the value must be <code>Management</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail data events, the value must be <code>Data</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are used only for event data stores:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail Insights events, the value must be <code>Insight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Config configuration items, the value must be <code>ConfigurationItem</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Audit Manager evidence, the value must be <code>Evidence</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     * <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Lambda::Function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::AppConfig::Configuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::B2BI::Transformer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::AgentAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::KnowledgeBase</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cassandra::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudFront::KeyValueStore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudTrail::Channel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Customization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Profile</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cognito::IdentityPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EC2::Snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EMRWAL::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::FinSpace::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Glue::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::ComponentVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::Deployment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GuardDuty::Detector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Certificate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Thing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::Asset</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::TimeSeries</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Entity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KendraRanking::ExecutionPlan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KinesisVideo::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Node</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::MedicalImaging::Datastore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::NeptuneGraph::Graph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::PCAConnectorAD::Connector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Application</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Index</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::WebExperience</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::RDS::DBCluster</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3ObjectLambda::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3Outposts::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::Endpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::ExperimentTrialComponent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::FeatureGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Namespace </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Service</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SCN::Instance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::PlatformEndpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::Topic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SWF::Domain</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SQS::Queue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SSMMessages::ControlChannel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Database</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::VerifiedPermissions::PolicyStore</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one resource
     * type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To log all data events for all
     * objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and include only the bucket ARN as the
     * matching value.
     * </p>
     * <p>
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than symbols
     * (&lt;&gt;) with resource-specific information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log events on
     * all objects in an S3 access point, we recommend that you use only the access point ARN, don’t include the object
     * path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the operator
     * is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String field;
    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> equals;
    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> startsWith;
    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> endsWith;
    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notEquals;
    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notStartsWith;
    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notEndsWith;

    /**
     * <p>
     * A field in a CloudTrail event record on which to filter events to be logged. For event data stores for CloudTrail
     * Insights events, Config configuration items, Audit Manager evidence, or events outside of Amazon Web Services,
     * the field is used only for selecting events as filtering is not supported.
     * </p>
     * <p>
     * For CloudTrail management events, supported fields include <code>readOnly</code>, <code>eventCategory</code>, and
     * <code>eventSource</code>.
     * </p>
     * <p>
     * For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     * <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <p>
     * For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence, or
     * events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and <code>write</code>
     * events. A value of <code>true</code> logs only <code>read</code> events. A value of <code>false</code> logs only
     * <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     * <code>rdsdata.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have multiple
     * values for this ﬁeld, separated by commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail management events, the value must be <code>Management</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail data events, the value must be <code>Data</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are used only for event data stores:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail Insights events, the value must be <code>Insight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Config configuration items, the value must be <code>ConfigurationItem</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Audit Manager evidence, the value must be <code>Evidence</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     * <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Lambda::Function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::AppConfig::Configuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::B2BI::Transformer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::AgentAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::KnowledgeBase</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cassandra::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudFront::KeyValueStore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudTrail::Channel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Customization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Profile</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cognito::IdentityPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EC2::Snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EMRWAL::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::FinSpace::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Glue::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::ComponentVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::Deployment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GuardDuty::Detector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Certificate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Thing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::Asset</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::TimeSeries</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Entity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KendraRanking::ExecutionPlan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KinesisVideo::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Node</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::MedicalImaging::Datastore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::NeptuneGraph::Graph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::PCAConnectorAD::Connector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Application</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Index</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::WebExperience</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::RDS::DBCluster</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3ObjectLambda::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3Outposts::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::Endpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::ExperimentTrialComponent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::FeatureGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Namespace </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Service</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SCN::Instance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::PlatformEndpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::Topic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SWF::Domain</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SQS::Queue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SSMMessages::ControlChannel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Database</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::VerifiedPermissions::PolicyStore</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one resource
     * type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To log all data events for all
     * objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and include only the bucket ARN as the
     * matching value.
     * </p>
     * <p>
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than symbols
     * (&lt;&gt;) with resource-specific information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log events on
     * all objects in an S3 access point, we recommend that you use only the access point ARN, don’t include the object
     * path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the operator
     * is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param field
     *        A field in a CloudTrail event record on which to filter events to be logged. For event data stores for
     *        CloudTrail Insights events, Config configuration items, Audit Manager evidence, or events outside of
     *        Amazon Web Services, the field is used only for selecting events as filtering is not supported.</p>
     *        <p>
     *        For CloudTrail management events, supported fields include <code>readOnly</code>,
     *        <code>eventCategory</code>, and <code>eventSource</code>.
     *        </p>
     *        <p>
     *        For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     *        <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     *        </p>
     *        <p>
     *        For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence,
     *        or events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *        or <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and
     *        <code>write</code> events. A value of <code>true</code> logs only <code>read</code> events. A value of
     *        <code>false</code> logs only <code>write</code> events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     *        <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     *        <code>rdsdata.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *        event logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have
     *        multiple values for this ﬁeld, separated by commas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For CloudTrail management events, the value must be <code>Management</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For CloudTrail data events, the value must be <code>Data</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are used only for event data stores:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For CloudTrail Insights events, the value must be <code>Insight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Config configuration items, the value must be <code>ConfigurationItem</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Audit Manager evidence, the value must be <code>Evidence</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     *        <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::DynamoDB::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Lambda::Function</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3::Object</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::AppConfig::Configuration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::B2BI::Transformer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Bedrock::AgentAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Bedrock::KnowledgeBase</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Cassandra::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CloudFront::KeyValueStore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CloudTrail::Channel</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CodeWhisperer::Customization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CodeWhisperer::Profile</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Cognito::IdentityPool</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::DynamoDB::Stream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::Snapshot</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::EMRWAL::Workspace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::FinSpace::Environment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Glue::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GreengrassV2::ComponentVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GreengrassV2::Deployment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GuardDuty::Detector</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoT::Certificate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoT::Thing</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTSiteWise::Asset</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTSiteWise::TimeSeries</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTTwinMaker::Entity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTTwinMaker::Workspace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::KendraRanking::ExecutionPlan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::KinesisVideo::Stream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ManagedBlockchain::Network</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ManagedBlockchain::Node</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::MedicalImaging::Datastore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::NeptuneGraph::Graph</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::PCAConnectorAD::Connector</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::Application</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::Index</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::WebExperience</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::RDS::DBCluster</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3::AccessPoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3ObjectLambda::AccessPoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3Outposts::Object</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::Endpoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::ExperimentTrialComponent</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::FeatureGroup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ServiceDiscovery::Namespace </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ServiceDiscovery::Service</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SCN::Instance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SNS::PlatformEndpoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SNS::Topic</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SWF::Domain</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SQS::Queue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SSMMessages::ControlChannel</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ThinClient::Device</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ThinClient::Environment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Timestream::Database</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Timestream::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::VerifiedPermissions::PolicyStore</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one
     *        resource type, add another selector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you
     *        use <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid
     *        resource of the type you've speciﬁed in the template as the value of resources.type. For example, if
     *        resources.type equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To
     *        log all data events for all objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and
     *        include only the bucket ARN as the matching value.
     *        </p>
     *        <p>
     *        The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than
     *        symbols (&lt;&gt;) with resource-specific information.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator
     *        is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator
     *        is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log
     *        events on all objects in an S3 access point, we recommend that you use only the access point ARN, don’t
     *        include the object path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the
     *        operator is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setField(String field) {
        this.field = field;
    }

    /**
     * <p>
     * A field in a CloudTrail event record on which to filter events to be logged. For event data stores for CloudTrail
     * Insights events, Config configuration items, Audit Manager evidence, or events outside of Amazon Web Services,
     * the field is used only for selecting events as filtering is not supported.
     * </p>
     * <p>
     * For CloudTrail management events, supported fields include <code>readOnly</code>, <code>eventCategory</code>, and
     * <code>eventSource</code>.
     * </p>
     * <p>
     * For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     * <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <p>
     * For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence, or
     * events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and <code>write</code>
     * events. A value of <code>true</code> logs only <code>read</code> events. A value of <code>false</code> logs only
     * <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     * <code>rdsdata.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have multiple
     * values for this ﬁeld, separated by commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail management events, the value must be <code>Management</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail data events, the value must be <code>Data</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are used only for event data stores:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail Insights events, the value must be <code>Insight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Config configuration items, the value must be <code>ConfigurationItem</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Audit Manager evidence, the value must be <code>Evidence</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     * <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Lambda::Function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::AppConfig::Configuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::B2BI::Transformer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::AgentAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::KnowledgeBase</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cassandra::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudFront::KeyValueStore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudTrail::Channel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Customization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Profile</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cognito::IdentityPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EC2::Snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EMRWAL::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::FinSpace::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Glue::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::ComponentVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::Deployment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GuardDuty::Detector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Certificate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Thing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::Asset</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::TimeSeries</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Entity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KendraRanking::ExecutionPlan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KinesisVideo::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Node</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::MedicalImaging::Datastore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::NeptuneGraph::Graph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::PCAConnectorAD::Connector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Application</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Index</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::WebExperience</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::RDS::DBCluster</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3ObjectLambda::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3Outposts::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::Endpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::ExperimentTrialComponent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::FeatureGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Namespace </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Service</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SCN::Instance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::PlatformEndpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::Topic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SWF::Domain</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SQS::Queue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SSMMessages::ControlChannel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Database</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::VerifiedPermissions::PolicyStore</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one resource
     * type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To log all data events for all
     * objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and include only the bucket ARN as the
     * matching value.
     * </p>
     * <p>
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than symbols
     * (&lt;&gt;) with resource-specific information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log events on
     * all objects in an S3 access point, we recommend that you use only the access point ARN, don’t include the object
     * path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the operator
     * is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return A field in a CloudTrail event record on which to filter events to be logged. For event data stores for
     *         CloudTrail Insights events, Config configuration items, Audit Manager evidence, or events outside of
     *         Amazon Web Services, the field is used only for selecting events as filtering is not supported.</p>
     *         <p>
     *         For CloudTrail management events, supported fields include <code>readOnly</code>,
     *         <code>eventCategory</code>, and <code>eventSource</code>.
     *         </p>
     *         <p>
     *         For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     *         <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     *         </p>
     *         <p>
     *         For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence,
     *         or events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *         or <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and
     *         <code>write</code> events. A value of <code>true</code> logs only <code>read</code> events. A value of
     *         <code>false</code> logs only <code>write</code> events.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     *         <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     *         <code>rdsdata.amazonaws.com</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *         event logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have
     *         multiple values for this ﬁeld, separated by commas.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For CloudTrail management events, the value must be <code>Management</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For CloudTrail data events, the value must be <code>Data</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The following are used only for event data stores:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For CloudTrail Insights events, the value must be <code>Insight</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Config configuration items, the value must be <code>ConfigurationItem</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For Audit Manager evidence, the value must be <code>Evidence</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     *         <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AWS::DynamoDB::Table</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Lambda::Function</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::S3::Object</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::AppConfig::Configuration</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::B2BI::Transformer</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Bedrock::AgentAlias</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Bedrock::KnowledgeBase</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Cassandra::Table</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::CloudFront::KeyValueStore</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::CloudTrail::Channel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::CodeWhisperer::Customization</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::CodeWhisperer::Profile</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Cognito::IdentityPool</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::DynamoDB::Stream</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::EC2::Snapshot</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::EMRWAL::Workspace</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::FinSpace::Environment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Glue::Table</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::GreengrassV2::ComponentVersion</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::GreengrassV2::Deployment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::GuardDuty::Detector</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoT::Certificate</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoT::Thing</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoTSiteWise::Asset</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoTSiteWise::TimeSeries</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoTTwinMaker::Entity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::IoTTwinMaker::Workspace</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::KendraRanking::ExecutionPlan</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::KinesisVideo::Stream</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ManagedBlockchain::Network</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ManagedBlockchain::Node</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::MedicalImaging::Datastore</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::NeptuneGraph::Graph</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::PCAConnectorAD::Connector</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::QBusiness::Application</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::QBusiness::DataSource</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::QBusiness::Index</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::QBusiness::WebExperience</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::RDS::DBCluster</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::S3::AccessPoint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::S3ObjectLambda::AccessPoint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::S3Outposts::Object</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SageMaker::Endpoint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SageMaker::ExperimentTrialComponent</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SageMaker::FeatureGroup</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ServiceDiscovery::Namespace </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ServiceDiscovery::Service</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SCN::Instance</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SNS::PlatformEndpoint</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SNS::Topic</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SWF::Domain</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SQS::Queue</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::SSMMessages::ControlChannel</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ThinClient::Device</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::ThinClient::Environment</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Timestream::Database</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::Timestream::Table</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS::VerifiedPermissions::PolicyStore</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one
     *         resource type, add another selector.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if
     *         you use <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid
     *         resource of the type you've speciﬁed in the template as the value of resources.type. For example, if
     *         resources.type equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To
     *         log all data events for all objects in a specific S3 bucket, use the <code>StartsWith</code> operator,
     *         and include only the bucket ARN as the matching value.
     *         </p>
     *         <p>
     *         The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than
     *         symbols (&lt;&gt;) with resource-specific information.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the
     *         operator is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following
     *         format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator
     *         is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log
     *         events on all objects in an S3 access point, we recommend that you use only the access point ARN, don’t
     *         include the object path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator
     *         is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the
     *         operator is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following
     *         format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator
     *         is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator
     *         is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is
     *         set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set
     *         to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     *         <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getField() {
        return this.field;
    }

    /**
     * <p>
     * A field in a CloudTrail event record on which to filter events to be logged. For event data stores for CloudTrail
     * Insights events, Config configuration items, Audit Manager evidence, or events outside of Amazon Web Services,
     * the field is used only for selecting events as filtering is not supported.
     * </p>
     * <p>
     * For CloudTrail management events, supported fields include <code>readOnly</code>, <code>eventCategory</code>, and
     * <code>eventSource</code>.
     * </p>
     * <p>
     * For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     * <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     * </p>
     * <p>
     * For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence, or
     * events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code> or
     * <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and <code>write</code>
     * events. A value of <code>true</code> logs only <code>read</code> events. A value of <code>false</code> logs only
     * <code>write</code> events.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     * <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     * <code>rdsdata.amazonaws.com</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data event
     * logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have multiple
     * values for this ﬁeld, separated by commas.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail management events, the value must be <code>Management</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For CloudTrail data events, the value must be <code>Data</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The following are used only for event data stores:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For CloudTrail Insights events, the value must be <code>Insight</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Config configuration items, the value must be <code>ConfigurationItem</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For Audit Manager evidence, the value must be <code>Evidence</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     * <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Lambda::Function</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::AppConfig::Configuration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::B2BI::Transformer</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::AgentAlias</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Bedrock::KnowledgeBase</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cassandra::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudFront::KeyValueStore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CloudTrail::Channel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Customization</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::CodeWhisperer::Profile</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Cognito::IdentityPool</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::DynamoDB::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EC2::Snapshot</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::EMRWAL::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::FinSpace::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Glue::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::ComponentVersion</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GreengrassV2::Deployment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::GuardDuty::Detector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Certificate</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoT::Thing</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::Asset</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTSiteWise::TimeSeries</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Entity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::IoTTwinMaker::Workspace</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KendraRanking::ExecutionPlan</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::KinesisVideo::Stream</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Network</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ManagedBlockchain::Node</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::MedicalImaging::Datastore</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::NeptuneGraph::Graph</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::PCAConnectorAD::Connector</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Application</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::DataSource</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::Index</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::QBusiness::WebExperience</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::RDS::DBCluster</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3ObjectLambda::AccessPoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::S3Outposts::Object</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::Endpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::ExperimentTrialComponent</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SageMaker::FeatureGroup</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Namespace </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ServiceDiscovery::Service</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SCN::Instance</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::PlatformEndpoint</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SNS::Topic</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SWF::Domain</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SQS::Queue</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::SSMMessages::ControlChannel</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Device</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::ThinClient::Environment</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Database</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::Timestream::Table</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS::VerifiedPermissions::PolicyStore</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one resource
     * type, add another selector.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you use
     * <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid resource of the
     * type you've speciﬁed in the template as the value of resources.type. For example, if resources.type equals
     * <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To log all data events for all
     * objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and include only the bucket ARN as the
     * matching value.
     * </p>
     * <p>
     * The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than symbols
     * (&lt;&gt;) with resource-specific information.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to <code>Equals</code> or
     * <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to <code>Equals</code>
     * or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator is set
     * to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log events on
     * all objects in an S3 access point, we recommend that you use only the access point ARN, don’t include the object
     * path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the operator
     * is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     * <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param field
     *        A field in a CloudTrail event record on which to filter events to be logged. For event data stores for
     *        CloudTrail Insights events, Config configuration items, Audit Manager evidence, or events outside of
     *        Amazon Web Services, the field is used only for selecting events as filtering is not supported.</p>
     *        <p>
     *        For CloudTrail management events, supported fields include <code>readOnly</code>,
     *        <code>eventCategory</code>, and <code>eventSource</code>.
     *        </p>
     *        <p>
     *        For CloudTrail data events, supported fields include <code>readOnly</code>, <code>eventCategory</code>,
     *        <code>eventName</code>, <code>resources.type</code>, and <code>resources.ARN</code>.
     *        </p>
     *        <p>
     *        For event data stores for CloudTrail Insights events, Config configuration items, Audit Manager evidence,
     *        or events outside of Amazon Web Services, the only supported field is <code>eventCategory</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>readOnly</code> </b> - Optional. Can be set to <code>Equals</code> a value of <code>true</code>
     *        or <code>false</code>. If you do not add this field, CloudTrail logs both <code>read</code> and
     *        <code>write</code> events. A value of <code>true</code> logs only <code>read</code> events. A value of
     *        <code>false</code> logs only <code>write</code> events.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventSource</code> </b> - For filtering management events only. This can be set to
     *        <code>NotEquals</code> <code>kms.amazonaws.com</code> or <code>NotEquals</code>
     *        <code>rdsdata.amazonaws.com</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventName</code> </b> - Can use any operator. You can use it to ﬁlter in or ﬁlter out any data
     *        event logged to CloudTrail, such as <code>PutBucket</code> or <code>GetSnapshotBlock</code>. You can have
     *        multiple values for this ﬁeld, separated by commas.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>eventCategory</code> </b> - This is required and must be set to <code>Equals</code>.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For CloudTrail management events, the value must be <code>Management</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For CloudTrail data events, the value must be <code>Data</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The following are used only for event data stores:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For CloudTrail Insights events, the value must be <code>Insight</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Config configuration items, the value must be <code>ConfigurationItem</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For Audit Manager evidence, the value must be <code>Evidence</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For non-Amazon Web Services events, the value must be <code>ActivityAuditLog</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.type</code> </b> - This ﬁeld is required for CloudTrail data events.
     *        <code>resources.type</code> can only use the <code>Equals</code> operator, and the value can be one of the
     *        following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AWS::DynamoDB::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Lambda::Function</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3::Object</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::AppConfig::Configuration</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::B2BI::Transformer</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Bedrock::AgentAlias</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Bedrock::KnowledgeBase</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Cassandra::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CloudFront::KeyValueStore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CloudTrail::Channel</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CodeWhisperer::Customization</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::CodeWhisperer::Profile</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Cognito::IdentityPool</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::DynamoDB::Stream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::EC2::Snapshot</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::EMRWAL::Workspace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::FinSpace::Environment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Glue::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GreengrassV2::ComponentVersion</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GreengrassV2::Deployment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::GuardDuty::Detector</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoT::Certificate</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoT::Thing</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTSiteWise::Asset</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTSiteWise::TimeSeries</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTTwinMaker::Entity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::IoTTwinMaker::Workspace</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::KendraRanking::ExecutionPlan</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::KinesisVideo::Stream</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ManagedBlockchain::Network</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ManagedBlockchain::Node</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::MedicalImaging::Datastore</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::NeptuneGraph::Graph</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::PCAConnectorAD::Connector</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::Application</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::DataSource</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::Index</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::QBusiness::WebExperience</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::RDS::DBCluster</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3::AccessPoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3ObjectLambda::AccessPoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::S3Outposts::Object</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::Endpoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::ExperimentTrialComponent</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SageMaker::FeatureGroup</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ServiceDiscovery::Namespace </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ServiceDiscovery::Service</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SCN::Instance</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SNS::PlatformEndpoint</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SNS::Topic</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SWF::Domain</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SQS::Queue</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::SSMMessages::ControlChannel</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ThinClient::Device</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::ThinClient::Environment</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Timestream::Database</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::Timestream::Table</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS::VerifiedPermissions::PolicyStore</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can have only one <code>resources.type</code> ﬁeld per selector. To log data events on more than one
     *        resource type, add another selector.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>resources.ARN</code> </b> - You can use any operator with <code>resources.ARN</code>, but if you
     *        use <code>Equals</code> or <code>NotEquals</code>, the value must exactly match the ARN of a valid
     *        resource of the type you've speciﬁed in the template as the value of resources.type. For example, if
     *        resources.type equals <code>AWS::S3::Object</code>, the ARN must be in one of the following formats. To
     *        log all data events for all objects in a specific S3 bucket, use the <code>StartsWith</code> operator, and
     *        include only the bucket ARN as the matching value.
     *        </p>
     *        <p>
     *        The trailing slash is intentional; do not exclude it. Replace the text between less than and greater than
     *        symbols (&lt;&gt;) with resource-specific information.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:::&lt;bucket_name&gt;/&lt;object_path&gt;/</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::DynamoDB::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Lambda::Function</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account_ID&gt;:function:&lt;function_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::AppConfig::Configuration</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:appconfig:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/environment/&lt;environment_ID&gt;/configuration/&lt;configuration_profile_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::B2BI::Transformer</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:b2bi:&lt;region&gt;:&lt;account_ID&gt;:transformer/&lt;transformer_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Bedrock::AgentAlias</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:agent-alias/&lt;agent_ID&gt;/&lt;alias_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Bedrock::KnowledgeBase</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:bedrock:&lt;region&gt;:&lt;account_ID&gt;:knowledge-base/&lt;knowledge_base_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Cassandra::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cassandra:&lt;region&gt;:&lt;account_ID&gt;:/keyspace/&lt;keyspace_name&gt;/table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CloudFront::KeyValueStore</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cloudfront:&lt;region&gt;:&lt;account_ID&gt;:key-value-store/&lt;KVS_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CloudTrail::Channel</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cloudtrail:&lt;region&gt;:&lt;account_ID&gt;:channel/&lt;channel_UUID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CodeWhisperer::Customization</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:customization/&lt;customization_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::CodeWhisperer::Profile</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:codewhisperer:&lt;region&gt;:&lt;account_ID&gt;:profile/&lt;profile_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::Cognito::IdentityPool</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:cognito-identity:&lt;region&gt;:&lt;account_ID&gt;:identitypool/&lt;identity_pool_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::DynamoDB::Stream</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:dynamodb:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;table_name&gt;/stream/&lt;date_time&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::EC2::Snapshot</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:ec2:&lt;region&gt;::snapshot/&lt;snapshot_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::EMRWAL::Workspace</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:emrwal:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::FinSpace::Environment</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:finspace:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Glue::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:glue:&lt;region&gt;:&lt;account_ID&gt;:table/&lt;database_name&gt;/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GreengrassV2::ComponentVersion</code>, and the operator
     *        is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:components/&lt;component_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GreengrassV2::Deployment</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:greengrass:&lt;region&gt;:&lt;account_ID&gt;:deployments/&lt;deployment_ID</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::GuardDuty::Detector</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:guardduty:&lt;region&gt;:&lt;account_ID&gt;:detector/&lt;detector_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoT::Certificate</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:cert/&lt;certificate_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoT::Thing</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iot:&lt;region&gt;:&lt;account_ID&gt;:thing/&lt;thing_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTSiteWise::Asset</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:asset/&lt;asset_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTSiteWise::TimeSeries</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iotsitewise:&lt;region&gt;:&lt;account_ID&gt;:timeseries/&lt;timeseries_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Entity</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;/entity/&lt;entity_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::IoTTwinMaker::Workspace</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:iottwinmaker:&lt;region&gt;:&lt;account_ID&gt;:workspace/&lt;workspace_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::KendraRanking::ExecutionPlan</code>, and the operator
     *        is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:kendra-ranking:&lt;region&gt;:&lt;account_ID&gt;:rescore-execution-plan/&lt;rescore_execution_plan_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::KinesisVideo::Stream</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:kinesisvideo:&lt;region&gt;:&lt;account_ID&gt;:stream/&lt;stream_name&gt;/&lt;creation_time&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Network</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:managedblockchain:::networks/&lt;network_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ManagedBlockchain::Node</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:managedblockchain:&lt;region&gt;:&lt;account_ID&gt;:nodes/&lt;node_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::MedicalImaging::Datastore</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:medical-imaging:&lt;region&gt;:&lt;account_ID&gt;:datastore/&lt;data_store_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::NeptuneGraph::Graph</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:neptune-graph:&lt;region&gt;:&lt;account_ID&gt;:graph/&lt;graph_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::PCAConnectorAD::Connector</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:pca-connector-ad:&lt;region&gt;:&lt;account_ID&gt;:connector/&lt;connector_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::Application</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::DataSource</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;/data-source/&lt;datasource_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::Index</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/index/&lt;index_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::QBusiness::WebExperience</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:qbusiness:&lt;region&gt;:&lt;account_ID&gt;:application/&lt;application_ID&gt;/web-experience/&lt;web_experience_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::RDS::DBCluster</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:rds:&lt;region&gt;:&lt;account_ID&gt;:cluster/&lt;cluster_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3::AccessPoint</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in one of the following formats. To log
     *        events on all objects in an S3 access point, we recommend that you use only the access point ARN, don’t
     *        include the object path, and use the <code>StartsWith</code> or <code>NotStartsWith</code> operators.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;/object/&lt;object_path&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3ObjectLambda::AccessPoint</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3-object-lambda:&lt;region&gt;:&lt;account_ID&gt;:accesspoint/&lt;access_point_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::S3Outposts::Object</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:s3-outposts:&lt;region&gt;:&lt;account_ID&gt;:&lt;object_path&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::Endpoint</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::ExperimentTrialComponent</code>, and the
     *        operator is set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:experiment-trial-component/&lt;experiment_trial_component_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SageMaker::FeatureGroup</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sagemaker:&lt;region&gt;:&lt;account_ID&gt;:feature-group/&lt;feature_group_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SCN::Instance</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:scn:&lt;region&gt;:&lt;account_ID&gt;:instance/&lt;instance_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Namespace</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:namespace/&lt;namespace_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ServiceDiscovery::Service</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:servicediscovery:&lt;region&gt;:&lt;account_ID&gt;:service/&lt;service_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SNS::PlatformEndpoint</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:endpoint/&lt;endpoint_type&gt;/&lt;endpoint_name&gt;/&lt;endpoint_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SNS::Topic</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sns:&lt;region&gt;:&lt;account_ID&gt;:&lt;topic_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SWF::Domain</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:swf:&lt;region&gt;:&lt;account_ID&gt;:domain/&lt;domain_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SQS::Queue</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:sqs:&lt;region&gt;:&lt;account_ID&gt;:&lt;queue_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::SSMMessages::ControlChannel</code>, and the operator is
     *        set to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:ssmmessages:&lt;region&gt;:&lt;account_ID&gt;:control-channel/&lt;channel_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ThinClient::Device</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:device/&lt;device_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::ThinClient::Environment</code>, and the operator is set
     *        to <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:thinclient:&lt;region&gt;:&lt;account_ID&gt;:environment/&lt;environment_ID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Timestream::Database</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When <code>resources.type</code> equals <code>AWS::Timestream::Table</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:timestream:&lt;region&gt;:&lt;account_ID&gt;:database/&lt;database_name&gt;/table/&lt;table_name&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        When resources.type equals <code>AWS::VerifiedPermissions::PolicyStore</code>, and the operator is set to
     *        <code>Equals</code> or <code>NotEquals</code>, the ARN must be in the following format:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>arn:&lt;partition&gt;:verifiedpermissions:&lt;region&gt;:&lt;account_ID&gt;:policy-store/&lt;policy_store_UUID&gt;</code>
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withField(String field) {
        setField(field);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @return An operator that includes events that match the exact value of the event record field specified as the
     *         value of <code>Field</code>. This is the only valid operator that you can use with the
     *         <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     */

    public java.util.List<String> getEquals() {
        if (equals == null) {
            equals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return equals;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     */

    public void setEquals(java.util.Collection<String> equals) {
        if (equals == null) {
            this.equals = null;
            return;
        }

        this.equals = new com.amazonaws.internal.SdkInternalList<String>(equals);
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquals(java.util.Collection)} or {@link #withEquals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(String... equals) {
        if (this.equals == null) {
            setEquals(new com.amazonaws.internal.SdkInternalList<String>(equals.length));
        }
        for (String ele : equals) {
            this.equals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>. This is the only valid operator that you can use with the <code>readOnly</code>,
     * <code>eventCategory</code>, and <code>resources.type</code> fields.
     * </p>
     * 
     * @param equals
     *        An operator that includes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>. This is the only valid operator that you can use with the
     *        <code>readOnly</code>, <code>eventCategory</code>, and <code>resources.type</code> fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that includes events that match the first few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getStartsWith() {
        if (startsWith == null) {
            startsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return startsWith;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     */

    public void setStartsWith(java.util.Collection<String> startsWith) {
        if (startsWith == null) {
            this.startsWith = null;
            return;
        }

        this.startsWith = new com.amazonaws.internal.SdkInternalList<String>(startsWith);
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStartsWith(java.util.Collection)} or {@link #withStartsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(String... startsWith) {
        if (this.startsWith == null) {
            setStartsWith(new com.amazonaws.internal.SdkInternalList<String>(startsWith.length));
        }
        for (String ele : startsWith) {
            this.startsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param startsWith
     *        An operator that includes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withStartsWith(java.util.Collection<String> startsWith) {
        setStartsWith(startsWith);
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that includes events that match the last few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getEndsWith() {
        if (endsWith == null) {
            endsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return endsWith;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     */

    public void setEndsWith(java.util.Collection<String> endsWith) {
        if (endsWith == null) {
            this.endsWith = null;
            return;
        }

        this.endsWith = new com.amazonaws.internal.SdkInternalList<String>(endsWith);
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndsWith(java.util.Collection)} or {@link #withEndsWith(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(String... endsWith) {
        if (this.endsWith == null) {
            setEndsWith(new com.amazonaws.internal.SdkInternalList<String>(endsWith.length));
        }
        for (String ele : endsWith) {
            this.endsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that includes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param endsWith
     *        An operator that includes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withEndsWith(java.util.Collection<String> endsWith) {
        setEndsWith(endsWith);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the exact value of the event record field specified as the
     *         value of <code>Field</code>.
     */

    public java.util.List<String> getNotEquals() {
        if (notEquals == null) {
            notEquals = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEquals;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     */

    public void setNotEquals(java.util.Collection<String> notEquals) {
        if (notEquals == null) {
            this.notEquals = null;
            return;
        }

        this.notEquals = new com.amazonaws.internal.SdkInternalList<String>(notEquals);
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEquals(java.util.Collection)} or {@link #withNotEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(String... notEquals) {
        if (this.notEquals == null) {
            setNotEquals(new com.amazonaws.internal.SdkInternalList<String>(notEquals.length));
        }
        for (String ele : notEquals) {
            this.notEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the exact value of the event record field specified as the value of
     * <code>Field</code>.
     * </p>
     * 
     * @param notEquals
     *        An operator that excludes events that match the exact value of the event record field specified as the
     *        value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the first few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getNotStartsWith() {
        if (notStartsWith == null) {
            notStartsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notStartsWith;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     */

    public void setNotStartsWith(java.util.Collection<String> notStartsWith) {
        if (notStartsWith == null) {
            this.notStartsWith = null;
            return;
        }

        this.notStartsWith = new com.amazonaws.internal.SdkInternalList<String>(notStartsWith);
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotStartsWith(java.util.Collection)} or {@link #withNotStartsWith(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(String... notStartsWith) {
        if (this.notStartsWith == null) {
            setNotStartsWith(new com.amazonaws.internal.SdkInternalList<String>(notStartsWith.length));
        }
        for (String ele : notStartsWith) {
            this.notStartsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the first few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notStartsWith
     *        An operator that excludes events that match the first few characters of the event record field specified
     *        as the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotStartsWith(java.util.Collection<String> notStartsWith) {
        setNotStartsWith(notStartsWith);
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @return An operator that excludes events that match the last few characters of the event record field specified
     *         as the value of <code>Field</code>.
     */

    public java.util.List<String> getNotEndsWith() {
        if (notEndsWith == null) {
            notEndsWith = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notEndsWith;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     */

    public void setNotEndsWith(java.util.Collection<String> notEndsWith) {
        if (notEndsWith == null) {
            this.notEndsWith = null;
            return;
        }

        this.notEndsWith = new com.amazonaws.internal.SdkInternalList<String>(notEndsWith);
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEndsWith(java.util.Collection)} or {@link #withNotEndsWith(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(String... notEndsWith) {
        if (this.notEndsWith == null) {
            setNotEndsWith(new com.amazonaws.internal.SdkInternalList<String>(notEndsWith.length));
        }
        for (String ele : notEndsWith) {
            this.notEndsWith.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An operator that excludes events that match the last few characters of the event record field specified as the
     * value of <code>Field</code>.
     * </p>
     * 
     * @param notEndsWith
     *        An operator that excludes events that match the last few characters of the event record field specified as
     *        the value of <code>Field</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdvancedFieldSelector withNotEndsWith(java.util.Collection<String> notEndsWith) {
        setNotEndsWith(notEndsWith);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getField() != null)
            sb.append("Field: ").append(getField()).append(",");
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals()).append(",");
        if (getStartsWith() != null)
            sb.append("StartsWith: ").append(getStartsWith()).append(",");
        if (getEndsWith() != null)
            sb.append("EndsWith: ").append(getEndsWith()).append(",");
        if (getNotEquals() != null)
            sb.append("NotEquals: ").append(getNotEquals()).append(",");
        if (getNotStartsWith() != null)
            sb.append("NotStartsWith: ").append(getNotStartsWith()).append(",");
        if (getNotEndsWith() != null)
            sb.append("NotEndsWith: ").append(getNotEndsWith());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdvancedFieldSelector == false)
            return false;
        AdvancedFieldSelector other = (AdvancedFieldSelector) obj;
        if (other.getField() == null ^ this.getField() == null)
            return false;
        if (other.getField() != null && other.getField().equals(this.getField()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getStartsWith() == null ^ this.getStartsWith() == null)
            return false;
        if (other.getStartsWith() != null && other.getStartsWith().equals(this.getStartsWith()) == false)
            return false;
        if (other.getEndsWith() == null ^ this.getEndsWith() == null)
            return false;
        if (other.getEndsWith() != null && other.getEndsWith().equals(this.getEndsWith()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        if (other.getNotStartsWith() == null ^ this.getNotStartsWith() == null)
            return false;
        if (other.getNotStartsWith() != null && other.getNotStartsWith().equals(this.getNotStartsWith()) == false)
            return false;
        if (other.getNotEndsWith() == null ^ this.getNotEndsWith() == null)
            return false;
        if (other.getNotEndsWith() != null && other.getNotEndsWith().equals(this.getNotEndsWith()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getField() == null) ? 0 : getField().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getStartsWith() == null) ? 0 : getStartsWith().hashCode());
        hashCode = prime * hashCode + ((getEndsWith() == null) ? 0 : getEndsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        hashCode = prime * hashCode + ((getNotStartsWith() == null) ? 0 : getNotStartsWith().hashCode());
        hashCode = prime * hashCode + ((getNotEndsWith() == null) ? 0 : getNotEndsWith().hashCode());
        return hashCode;
    }

    @Override
    public AdvancedFieldSelector clone() {
        try {
            return (AdvancedFieldSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudtrail.model.transform.AdvancedFieldSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
