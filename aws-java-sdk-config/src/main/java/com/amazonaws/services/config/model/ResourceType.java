/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
    AWSIAMGroup("AWS::IAM::Group"),
    AWSIAMPolicy("AWS::IAM::Policy"),
    AWSIAMRole("AWS::IAM::Role"),
    AWSIAMUser("AWS::IAM::User"),
    AWSElasticLoadBalancingV2LoadBalancer("AWS::ElasticLoadBalancingV2::LoadBalancer"),
    AWSACMCertificate("AWS::ACM::Certificate"),
    AWSRDSDBInstance("AWS::RDS::DBInstance"),
    AWSRDSDBParameterGroup("AWS::RDS::DBParameterGroup"),
    AWSRDSDBOptionGroup("AWS::RDS::DBOptionGroup"),
    AWSRDSDBSubnetGroup("AWS::RDS::DBSubnetGroup"),
    AWSRDSDBSecurityGroup("AWS::RDS::DBSecurityGroup"),
    AWSRDSDBSnapshot("AWS::RDS::DBSnapshot"),
    AWSRDSDBCluster("AWS::RDS::DBCluster"),
    AWSRDSDBClusterParameterGroup("AWS::RDS::DBClusterParameterGroup"),
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
    AWSLambdaAlias("AWS::Lambda::Alias"),
    AWSLambdaFunction("AWS::Lambda::Function"),
    AWSElasticBeanstalkApplication("AWS::ElasticBeanstalk::Application"),
    AWSElasticBeanstalkApplicationVersion("AWS::ElasticBeanstalk::ApplicationVersion"),
    AWSElasticBeanstalkEnvironment("AWS::ElasticBeanstalk::Environment"),
    AWSMobileHubProject("AWS::MobileHub::Project"),
    AWSXRayEncryptionConfig("AWS::XRay::EncryptionConfig"),
    AWSSSMAssociationCompliance("AWS::SSM::AssociationCompliance"),
    AWSSSMPatchCompliance("AWS::SSM::PatchCompliance"),
    AWSShieldProtection("AWS::Shield::Protection"),
    AWSShieldRegionalProtection("AWS::ShieldRegional::Protection"),
    AWSConfigResourceCompliance("AWS::Config::ResourceCompliance"),
    AWSLicenseManagerLicenseConfiguration("AWS::LicenseManager::LicenseConfiguration"),
    AWSApiGatewayDomainName("AWS::ApiGateway::DomainName"),
    AWSApiGatewayMethod("AWS::ApiGateway::Method"),
    AWSApiGatewayStage("AWS::ApiGateway::Stage"),
    AWSApiGatewayRestApi("AWS::ApiGateway::RestApi"),
    AWSApiGatewayV2DomainName("AWS::ApiGatewayV2::DomainName"),
    AWSApiGatewayV2Stage("AWS::ApiGatewayV2::Stage"),
    AWSApiGatewayV2Api("AWS::ApiGatewayV2::Api"),
    AWSCodePipelinePipeline("AWS::CodePipeline::Pipeline"),
    AWSServiceCatalogCloudFormationProvisionedProduct("AWS::ServiceCatalog::CloudFormationProvisionedProduct"),
    AWSServiceCatalogCloudFormationProduct("AWS::ServiceCatalog::CloudFormationProduct"),
    AWSServiceCatalogPortfolio("AWS::ServiceCatalog::Portfolio");

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
