/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum ResourceType {

    AWSEC2CustomerGateway("AWS::EC2::CustomerGateway"),
    AWSEC2EIP("AWS::EC2::EIP"),
    AWSEC2Host("AWS::EC2::Host"),
    AWSEC2Instance("AWS::EC2::Instance"),
    AWSEC2InternetGateway("AWS::EC2::InternetGateway"),
    AWSEC2NetworkAcl("AWS::EC2::NetworkAcl"),
    AWSEC2NetworkInterface("AWS::EC2::NetworkInterface"),
    AWSEC2RouteTable("AWS::EC2::RouteTable"),
    AWSEC2SecurityGroup("AWS::EC2::SecurityGroup"),
    AWSEC2Subnet("AWS::EC2::Subnet"),
    AWSCloudTrailTrail("AWS::CloudTrail::Trail"),
    AWSEC2Volume("AWS::EC2::Volume"),
    AWSEC2VPC("AWS::EC2::VPC"),
    AWSEC2VPNConnection("AWS::EC2::VPNConnection"),
    AWSEC2VPNGateway("AWS::EC2::VPNGateway"),
    AWSEC2RegisteredHAInstance("AWS::EC2::RegisteredHAInstance"),
    AWSEC2NatGateway("AWS::EC2::NatGateway"),
    AWSEC2EgressOnlyInternetGateway("AWS::EC2::EgressOnlyInternetGateway"),
    AWSEC2VPCEndpoint("AWS::EC2::VPCEndpoint"),
    AWSEC2VPCEndpointService("AWS::EC2::VPCEndpointService"),
    AWSEC2FlowLog("AWS::EC2::FlowLog"),
    AWSEC2VPCPeeringConnection("AWS::EC2::VPCPeeringConnection"),
    AWSElasticsearchDomain("AWS::Elasticsearch::Domain"),
    AWSIAMGroup("AWS::IAM::Group"),
    AWSIAMPolicy("AWS::IAM::Policy"),
    AWSIAMRole("AWS::IAM::Role"),
    AWSIAMUser("AWS::IAM::User"),
    AWSElasticLoadBalancingV2LoadBalancer("AWS::ElasticLoadBalancingV2::LoadBalancer"),
    AWSACMCertificate("AWS::ACM::Certificate"),
    AWSRDSDBInstance("AWS::RDS::DBInstance"),
    AWSRDSDBSubnetGroup("AWS::RDS::DBSubnetGroup"),
    AWSRDSDBSecurityGroup("AWS::RDS::DBSecurityGroup"),
    AWSRDSDBSnapshot("AWS::RDS::DBSnapshot"),
    AWSRDSDBCluster("AWS::RDS::DBCluster"),
    AWSRDSDBClusterSnapshot("AWS::RDS::DBClusterSnapshot"),
    AWSRDSEventSubscription("AWS::RDS::EventSubscription"),
    AWSS3Bucket("AWS::S3::Bucket"),
    AWSS3AccountPublicAccessBlock("AWS::S3::AccountPublicAccessBlock"),
    AWSRedshiftCluster("AWS::Redshift::Cluster"),
    AWSRedshiftClusterSnapshot("AWS::Redshift::ClusterSnapshot"),
    AWSRedshiftClusterParameterGroup("AWS::Redshift::ClusterParameterGroup"),
    AWSRedshiftClusterSecurityGroup("AWS::Redshift::ClusterSecurityGroup"),
    AWSRedshiftClusterSubnetGroup("AWS::Redshift::ClusterSubnetGroup"),
    AWSRedshiftEventSubscription("AWS::Redshift::EventSubscription"),
    AWSSSMManagedInstanceInventory("AWS::SSM::ManagedInstanceInventory"),
    AWSCloudWatchAlarm("AWS::CloudWatch::Alarm"),
    AWSCloudFormationStack("AWS::CloudFormation::Stack"),
    AWSElasticLoadBalancingLoadBalancer("AWS::ElasticLoadBalancing::LoadBalancer"),
    AWSAutoScalingAutoScalingGroup("AWS::AutoScaling::AutoScalingGroup"),
    AWSAutoScalingLaunchConfiguration("AWS::AutoScaling::LaunchConfiguration"),
    AWSAutoScalingScalingPolicy("AWS::AutoScaling::ScalingPolicy"),
    AWSAutoScalingScheduledAction("AWS::AutoScaling::ScheduledAction"),
    AWSDynamoDBTable("AWS::DynamoDB::Table"),
    AWSCodeBuildProject("AWS::CodeBuild::Project"),
    AWSWAFRateBasedRule("AWS::WAF::RateBasedRule"),
    AWSWAFRule("AWS::WAF::Rule"),
    AWSWAFRuleGroup("AWS::WAF::RuleGroup"),
    AWSWAFWebACL("AWS::WAF::WebACL"),
    AWSWAFRegionalRateBasedRule("AWS::WAFRegional::RateBasedRule"),
    AWSWAFRegionalRule("AWS::WAFRegional::Rule"),
    AWSWAFRegionalRuleGroup("AWS::WAFRegional::RuleGroup"),
    AWSWAFRegionalWebACL("AWS::WAFRegional::WebACL"),
    AWSCloudFrontDistribution("AWS::CloudFront::Distribution"),
    AWSCloudFrontStreamingDistribution("AWS::CloudFront::StreamingDistribution"),
    AWSLambdaFunction("AWS::Lambda::Function"),
    AWSNetworkFirewallFirewall("AWS::NetworkFirewall::Firewall"),
    AWSNetworkFirewallFirewallPolicy("AWS::NetworkFirewall::FirewallPolicy"),
    AWSNetworkFirewallRuleGroup("AWS::NetworkFirewall::RuleGroup"),
    AWSElasticBeanstalkApplication("AWS::ElasticBeanstalk::Application"),
    AWSElasticBeanstalkApplicationVersion("AWS::ElasticBeanstalk::ApplicationVersion"),
    AWSElasticBeanstalkEnvironment("AWS::ElasticBeanstalk::Environment"),
    AWSWAFv2WebACL("AWS::WAFv2::WebACL"),
    AWSWAFv2RuleGroup("AWS::WAFv2::RuleGroup"),
    AWSWAFv2IPSet("AWS::WAFv2::IPSet"),
    AWSWAFv2RegexPatternSet("AWS::WAFv2::RegexPatternSet"),
    AWSWAFv2ManagedRuleSet("AWS::WAFv2::ManagedRuleSet"),
    AWSXRayEncryptionConfig("AWS::XRay::EncryptionConfig"),
    AWSSSMAssociationCompliance("AWS::SSM::AssociationCompliance"),
    AWSSSMPatchCompliance("AWS::SSM::PatchCompliance"),
    AWSShieldProtection("AWS::Shield::Protection"),
    AWSShieldRegionalProtection("AWS::ShieldRegional::Protection"),
    AWSConfigConformancePackCompliance("AWS::Config::ConformancePackCompliance"),
    AWSConfigResourceCompliance("AWS::Config::ResourceCompliance"),
    AWSApiGatewayStage("AWS::ApiGateway::Stage"),
    AWSApiGatewayRestApi("AWS::ApiGateway::RestApi"),
    AWSApiGatewayV2Stage("AWS::ApiGatewayV2::Stage"),
    AWSApiGatewayV2Api("AWS::ApiGatewayV2::Api"),
    AWSCodePipelinePipeline("AWS::CodePipeline::Pipeline"),
    AWSServiceCatalogCloudFormationProvisionedProduct("AWS::ServiceCatalog::CloudFormationProvisionedProduct"),
    AWSServiceCatalogCloudFormationProduct("AWS::ServiceCatalog::CloudFormationProduct"),
    AWSServiceCatalogPortfolio("AWS::ServiceCatalog::Portfolio"),
    AWSSQSQueue("AWS::SQS::Queue"),
    AWSKMSKey("AWS::KMS::Key"),
    AWSQLDBLedger("AWS::QLDB::Ledger"),
    AWSSecretsManagerSecret("AWS::SecretsManager::Secret"),
    AWSSNSTopic("AWS::SNS::Topic"),
    AWSSSMFileData("AWS::SSM::FileData"),
    AWSBackupBackupPlan("AWS::Backup::BackupPlan"),
    AWSBackupBackupSelection("AWS::Backup::BackupSelection"),
    AWSBackupBackupVault("AWS::Backup::BackupVault"),
    AWSBackupRecoveryPoint("AWS::Backup::RecoveryPoint"),
    AWSECRRepository("AWS::ECR::Repository"),
    AWSECSCluster("AWS::ECS::Cluster"),
    AWSECSService("AWS::ECS::Service"),
    AWSECSTaskDefinition("AWS::ECS::TaskDefinition"),
    AWSEFSAccessPoint("AWS::EFS::AccessPoint"),
    AWSEFSFileSystem("AWS::EFS::FileSystem"),
    AWSEKSCluster("AWS::EKS::Cluster"),
    AWSOpenSearchDomain("AWS::OpenSearch::Domain"),
    AWSEC2TransitGateway("AWS::EC2::TransitGateway"),
    AWSKinesisStream("AWS::Kinesis::Stream"),
    AWSKinesisStreamConsumer("AWS::Kinesis::StreamConsumer"),
    AWSCodeDeployApplication("AWS::CodeDeploy::Application"),
    AWSCodeDeployDeploymentConfig("AWS::CodeDeploy::DeploymentConfig"),
    AWSCodeDeployDeploymentGroup("AWS::CodeDeploy::DeploymentGroup"),
    AWSEC2LaunchTemplate("AWS::EC2::LaunchTemplate"),
    AWSECRPublicRepository("AWS::ECR::PublicRepository"),
    AWSGuardDutyDetector("AWS::GuardDuty::Detector"),
    AWSEMRSecurityConfiguration("AWS::EMR::SecurityConfiguration"),
    AWSSageMakerCodeRepository("AWS::SageMaker::CodeRepository"),
    AWSRoute53ResolverResolverEndpoint("AWS::Route53Resolver::ResolverEndpoint"),
    AWSRoute53ResolverResolverRule("AWS::Route53Resolver::ResolverRule"),
    AWSRoute53ResolverResolverRuleAssociation("AWS::Route53Resolver::ResolverRuleAssociation"),
    AWSDMSReplicationSubnetGroup("AWS::DMS::ReplicationSubnetGroup"),
    AWSDMSEventSubscription("AWS::DMS::EventSubscription"),
    AWSMSKCluster("AWS::MSK::Cluster"),
    AWSStepFunctionsActivity("AWS::StepFunctions::Activity"),
    AWSWorkSpacesWorkspace("AWS::WorkSpaces::Workspace"),
    AWSWorkSpacesConnectionAlias("AWS::WorkSpaces::ConnectionAlias"),
    AWSSageMakerModel("AWS::SageMaker::Model"),
    AWSElasticLoadBalancingV2Listener("AWS::ElasticLoadBalancingV2::Listener"),
    AWSStepFunctionsStateMachine("AWS::StepFunctions::StateMachine"),
    AWSBatchJobQueue("AWS::Batch::JobQueue"),
    AWSBatchComputeEnvironment("AWS::Batch::ComputeEnvironment"),
    AWSAccessAnalyzerAnalyzer("AWS::AccessAnalyzer::Analyzer"),
    AWSAthenaWorkGroup("AWS::Athena::WorkGroup"),
    AWSAthenaDataCatalog("AWS::Athena::DataCatalog"),
    AWSDetectiveGraph("AWS::Detective::Graph"),
    AWSGlobalAcceleratorAccelerator("AWS::GlobalAccelerator::Accelerator"),
    AWSGlobalAcceleratorEndpointGroup("AWS::GlobalAccelerator::EndpointGroup"),
    AWSGlobalAcceleratorListener("AWS::GlobalAccelerator::Listener"),
    AWSEC2TransitGatewayAttachment("AWS::EC2::TransitGatewayAttachment"),
    AWSEC2TransitGatewayRouteTable("AWS::EC2::TransitGatewayRouteTable"),
    AWSDMSCertificate("AWS::DMS::Certificate"),
    AWSAppConfigApplication("AWS::AppConfig::Application"),
    AWSAppSyncGraphQLApi("AWS::AppSync::GraphQLApi"),
    AWSDataSyncLocationSMB("AWS::DataSync::LocationSMB"),
    AWSDataSyncLocationFSxLustre("AWS::DataSync::LocationFSxLustre"),
    AWSDataSyncLocationS3("AWS::DataSync::LocationS3"),
    AWSDataSyncLocationEFS("AWS::DataSync::LocationEFS"),
    AWSDataSyncTask("AWS::DataSync::Task"),
    AWSDataSyncLocationNFS("AWS::DataSync::LocationNFS"),
    AWSEC2NetworkInsightsAccessScopeAnalysis("AWS::EC2::NetworkInsightsAccessScopeAnalysis"),
    AWSEKSFargateProfile("AWS::EKS::FargateProfile"),
    AWSGlueJob("AWS::Glue::Job"),
    AWSGuardDutyThreatIntelSet("AWS::GuardDuty::ThreatIntelSet"),
    AWSGuardDutyIPSet("AWS::GuardDuty::IPSet"),
    AWSSageMakerWorkteam("AWS::SageMaker::Workteam"),
    AWSSageMakerNotebookInstanceLifecycleConfig("AWS::SageMaker::NotebookInstanceLifecycleConfig"),
    AWSServiceDiscoveryService("AWS::ServiceDiscovery::Service"),
    AWSServiceDiscoveryPublicDnsNamespace("AWS::ServiceDiscovery::PublicDnsNamespace"),
    AWSSESContactList("AWS::SES::ContactList"),
    AWSSESConfigurationSet("AWS::SES::ConfigurationSet"),
    AWSRoute53HostedZone("AWS::Route53::HostedZone");

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return ResourceType corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceType enumEntry : ResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
