/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

    AWSACMCertificate("AWS::ACM::Certificate"),
    AWSApiGatewayDomainName("AWS::ApiGateway::DomainName"),
    AWSApiGatewayMethod("AWS::ApiGateway::Method"),
    AWSApiGatewayRestApi("AWS::ApiGateway::RestApi"),
    AWSApiGatewayStage("AWS::ApiGateway::Stage"),
    AWSApiGatewayV2Api("AWS::ApiGatewayV2::Api"),
    AWSApiGatewayV2DomainName("AWS::ApiGatewayV2::DomainName"),
    AWSApiGatewayV2Stage("AWS::ApiGatewayV2::Stage"),
    AWSAutoScalingAutoScalingGroup("AWS::AutoScaling::AutoScalingGroup"),
    AWSAutoScalingLaunchConfiguration("AWS::AutoScaling::LaunchConfiguration"),
    AWSAutoScalingScalingPolicy("AWS::AutoScaling::ScalingPolicy"),
    AWSAutoScalingScheduledAction("AWS::AutoScaling::ScheduledAction"),
    AWSCloudFormationStack("AWS::CloudFormation::Stack"),
    AWSCloudFrontDistribution("AWS::CloudFront::Distribution"),
    AWSCloudFrontStreamingDistribution("AWS::CloudFront::StreamingDistribution"),
    AWSCloudTrailTrail("AWS::CloudTrail::Trail"),
    AWSCloudWatchAlarm("AWS::CloudWatch::Alarm"),
    AWSCodeBuildProject("AWS::CodeBuild::Project"),
    AWSCodePipelinePipeline("AWS::CodePipeline::Pipeline"),
    AWSConfigResourceCompliance("AWS::Config::ResourceCompliance"),
    AWSDynamoDBTable("AWS::DynamoDB::Table"),
    AWSEC2CustomerGateway("AWS::EC2::CustomerGateway"),
    AWSEC2EgressOnlyInternetGateway("AWS::EC2::EgressOnlyInternetGateway"),
    AWSEC2EIP("AWS::EC2::EIP"),
    AWSEC2FlowLog("AWS::EC2::FlowLog"),
    AWSEC2Host("AWS::EC2::Host"),
    AWSEC2Instance("AWS::EC2::Instance"),
    AWSEC2InternetGateway("AWS::EC2::InternetGateway"),
    AWSEC2NatGateway("AWS::EC2::NatGateway"),
    AWSEC2NetworkAcl("AWS::EC2::NetworkAcl"),
    AWSEC2NetworkInterface("AWS::EC2::NetworkInterface"),
    AWSEC2RegisteredHAInstance("AWS::EC2::RegisteredHAInstance"),
    AWSEC2RouteTable("AWS::EC2::RouteTable"),
    AWSEC2SecurityGroup("AWS::EC2::SecurityGroup"),
    AWSEC2Subnet("AWS::EC2::Subnet"),
    AWSEC2Volume("AWS::EC2::Volume"),
    AWSEC2VPC("AWS::EC2::VPC"),
    AWSEC2VPCEndpoint("AWS::EC2::VPCEndpoint"),
    AWSEC2VPCEndpointService("AWS::EC2::VPCEndpointService"),
    AWSEC2VPCPeeringConnection("AWS::EC2::VPCPeeringConnection"),
    AWSEC2VPNConnection("AWS::EC2::VPNConnection"),
    AWSEC2VPNGateway("AWS::EC2::VPNGateway"),
    AWSECRRepository("AWS::ECR::Repository"),
    AWSECSCluster("AWS::ECS::Cluster"),
    AWSECSPrimaryTaskSet("AWS::ECS::PrimaryTaskSet"),
    AWSECSService("AWS::ECS::Service"),
    AWSECSTaskDefinition("AWS::ECS::TaskDefinition"),
    AWSECSTaskSet("AWS::ECS::TaskSet"),
    AWSEKSCluster("AWS::EKS::Cluster"),
    AWSEKSNodegroup("AWS::EKS::Nodegroup"),
    AWSElasticBeanstalkApplication("AWS::ElasticBeanstalk::Application"),
    AWSElasticBeanstalkApplicationVersion("AWS::ElasticBeanstalk::ApplicationVersion"),
    AWSElasticBeanstalkEnvironment("AWS::ElasticBeanstalk::Environment"),
    AWSElasticLoadBalancingLoadBalancer("AWS::ElasticLoadBalancing::LoadBalancer"),
    AWSElasticLoadBalancingV2LoadBalancer("AWS::ElasticLoadBalancingV2::LoadBalancer"),
    AWSElasticsearchDomain("AWS::Elasticsearch::Domain"),
    AWSIAMGroup("AWS::IAM::Group"),
    AWSIAMPolicy("AWS::IAM::Policy"),
    AWSIAMRole("AWS::IAM::Role"),
    AWSIAMUser("AWS::IAM::User"),
    AWSKinesisStream("AWS::Kinesis::Stream"),
    AWSKinesisStreamConsumer("AWS::Kinesis::StreamConsumer"),
    AWSKinesisAnalyticsApplication("AWS::KinesisAnalytics::Application"),
    AWSKinesisAnalyticsApplicationOutput("AWS::KinesisAnalytics::ApplicationOutput"),
    AWSKinesisAnalyticsApplicationReferenceDataSource("AWS::KinesisAnalytics::ApplicationReferenceDataSource"),
    AWSKinesisAnalyticsV2Application("AWS::KinesisAnalyticsV2::Application"),
    AWSKinesisAnalyticsV2ApplicationCloudWatchLoggingOption("AWS::KinesisAnalyticsV2::ApplicationCloudWatchLoggingOption"),
    AWSKinesisAnalyticsV2ApplicationOutput("AWS::KinesisAnalyticsV2::ApplicationOutput"),
    AWSKinesisAnalyticsV2ApplicationReferenceDataSource("AWS::KinesisAnalyticsV2::ApplicationReferenceDataSource"),
    AWSKinesisFirehoseDeliveryStream("AWS::KinesisFirehose::DeliveryStream"),
    AWSKMSKey("AWS::KMS::Key"),
    AWSLambdaAlias("AWS::Lambda::Alias"),
    AWSLambdaFunction("AWS::Lambda::Function"),
    AWSLicenseManagerLicenseConfiguration("AWS::LicenseManager::LicenseConfiguration"),
    AWSMobileHubProject("AWS::MobileHub::Project"),
    AWSQLDBLedger("AWS::QLDB::Ledger"),
    AWSRDSDBCluster("AWS::RDS::DBCluster"),
    AWSRDSDBClusterParameterGroup("AWS::RDS::DBClusterParameterGroup"),
    AWSRDSDBClusterSnapshot("AWS::RDS::DBClusterSnapshot"),
    AWSRDSDBInstance("AWS::RDS::DBInstance"),
    AWSRDSDBOptionGroup("AWS::RDS::DBOptionGroup"),
    AWSRDSDBParameterGroup("AWS::RDS::DBParameterGroup"),
    AWSRDSDBSecurityGroup("AWS::RDS::DBSecurityGroup"),
    AWSRDSDBSnapshot("AWS::RDS::DBSnapshot"),
    AWSRDSDBSubnetGroup("AWS::RDS::DBSubnetGroup"),
    AWSRDSEventSubscription("AWS::RDS::EventSubscription"),
    AWSRedshiftCluster("AWS::Redshift::Cluster"),
    AWSRedshiftClusterParameterGroup("AWS::Redshift::ClusterParameterGroup"),
    AWSRedshiftClusterSecurityGroup("AWS::Redshift::ClusterSecurityGroup"),
    AWSRedshiftClusterSnapshot("AWS::Redshift::ClusterSnapshot"),
    AWSRedshiftClusterSubnetGroup("AWS::Redshift::ClusterSubnetGroup"),
    AWSRedshiftEventSubscription("AWS::Redshift::EventSubscription"),
    AWSS3AccountPublicAccessBlock("AWS::S3::AccountPublicAccessBlock"),
    AWSS3Bucket("AWS::S3::Bucket"),
    AWSSecretsManagerSecret("AWS::SecretsManager::Secret"),
    AWSServiceCatalogCloudFormationProduct("AWS::ServiceCatalog::CloudFormationProduct"),
    AWSServiceCatalogCloudFormationProvisionedProduct("AWS::ServiceCatalog::CloudFormationProvisionedProduct"),
    AWSServiceCatalogPortfolio("AWS::ServiceCatalog::Portfolio"),
    AWSShieldProtection("AWS::Shield::Protection"),
    AWSShieldRegionalProtection("AWS::ShieldRegional::Protection"),
    AWSSNSTopic("AWS::SNS::Topic"),
    AWSSQSQueue("AWS::SQS::Queue"),
    AWSSSMAssociationCompliance("AWS::SSM::AssociationCompliance"),
    AWSSSMManagedInstanceInventory("AWS::SSM::ManagedInstanceInventory"),
    AWSSSMPatchCompliance("AWS::SSM::PatchCompliance"),
    AWSWAFRateBasedRule("AWS::WAF::RateBasedRule"),
    AWSWAFRule("AWS::WAF::Rule"),
    AWSWAFRuleGroup("AWS::WAF::RuleGroup"),
    AWSWAFWebACL("AWS::WAF::WebACL"),
    AWSWAFRegionalRateBasedRule("AWS::WAFRegional::RateBasedRule"),
    AWSWAFRegionalRule("AWS::WAFRegional::Rule"),
    AWSWAFRegionalRuleGroup("AWS::WAFRegional::RuleGroup"),
    AWSWAFRegionalWebACL("AWS::WAFRegional::WebACL"),
    AWSWAFv2WebACL("AWS::WAFv2::WebACL"),
    AWSWAFv2RuleGroup("AWS::WAFv2::RuleGroup"),
    AWSWAFv2IPSet("AWS::WAFv2::IPSet"),
    AWSWAFv2RegexPatternSet("AWS::WAFv2::RegexPatternSet"),
    AWSWAFv2ManagedRuleSet("AWS::WAFv2::ManagedRuleSet"),
    AWSXRayEncryptionConfig("AWS::XRay::EncryptionConfig");

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
