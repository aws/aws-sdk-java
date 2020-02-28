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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Additional details about a resource related to a finding.
 * </p>
 * <p>
 * To provide the details, use the object that corresponds to the resource type. For example, if the resource type is
 * <code>AwsEc2Instance</code>, then you use the <code>AwsEc2Instance</code> object to provide the details.
 * </p>
 * <p>
 * If the type-specific object does not contain all of the fields you want to populate, then you use the
 * <code>Other</code> object to populate those additional fields.
 * </p>
 * <p>
 * You also use the <code>Other</code> object to populate the details when the selected type does not have a
 * corresponding object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     */
    private AwsCodeBuildProjectDetails awsCodeBuildProject;
    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     */
    private AwsCloudFrontDistributionDetails awsCloudFrontDistribution;
    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     */
    private AwsEc2InstanceDetails awsEc2Instance;
    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     */
    private AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface;
    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     */
    private AwsEc2SecurityGroupDetails awsEc2SecurityGroup;
    /**
     * <p>
     * Details about a load balancer.
     * </p>
     */
    private AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer;
    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     */
    private AwsElasticsearchDomainDetails awsElasticsearchDomain;
    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     */
    private AwsS3BucketDetails awsS3Bucket;
    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     */
    private AwsIamAccessKeyDetails awsIamAccessKey;
    /**
     * <p>
     * Details about an IAM role.
     * </p>
     */
    private AwsIamRoleDetails awsIamRole;
    /**
     * <p>
     * Details about a KMS key.
     * </p>
     */
    private AwsKmsKeyDetails awsKmsKey;
    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     */
    private AwsLambdaFunctionDetails awsLambdaFunction;
    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     */
    private AwsLambdaLayerVersionDetails awsLambdaLayerVersion;
    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     */
    private AwsRdsDbInstanceDetails awsRdsDbInstance;
    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     */
    private AwsSnsTopicDetails awsSnsTopic;
    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     */
    private AwsSqsQueueDetails awsSqsQueue;
    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     */
    private AwsWafWebAclDetails awsWafWebAcl;
    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     */
    private ContainerDetails container;
    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> other;

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     * 
     * @param awsCodeBuildProject
     *        Details for an AWS CodeBuild project.
     */

    public void setAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        this.awsCodeBuildProject = awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     * 
     * @return Details for an AWS CodeBuild project.
     */

    public AwsCodeBuildProjectDetails getAwsCodeBuildProject() {
        return this.awsCodeBuildProject;
    }

    /**
     * <p>
     * Details for an AWS CodeBuild project.
     * </p>
     * 
     * @param awsCodeBuildProject
     *        Details for an AWS CodeBuild project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCodeBuildProject(AwsCodeBuildProjectDetails awsCodeBuildProject) {
        setAwsCodeBuildProject(awsCodeBuildProject);
        return this;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @param awsCloudFrontDistribution
     *        Details about a CloudFront distribution.
     */

    public void setAwsCloudFrontDistribution(AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        this.awsCloudFrontDistribution = awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @return Details about a CloudFront distribution.
     */

    public AwsCloudFrontDistributionDetails getAwsCloudFrontDistribution() {
        return this.awsCloudFrontDistribution;
    }

    /**
     * <p>
     * Details about a CloudFront distribution.
     * </p>
     * 
     * @param awsCloudFrontDistribution
     *        Details about a CloudFront distribution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsCloudFrontDistribution(AwsCloudFrontDistributionDetails awsCloudFrontDistribution) {
        setAwsCloudFrontDistribution(awsCloudFrontDistribution);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        Details about an Amazon EC2 instance related to a finding.
     */

    public void setAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        this.awsEc2Instance = awsEc2Instance;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     * 
     * @return Details about an Amazon EC2 instance related to a finding.
     */

    public AwsEc2InstanceDetails getAwsEc2Instance() {
        return this.awsEc2Instance;
    }

    /**
     * <p>
     * Details about an Amazon EC2 instance related to a finding.
     * </p>
     * 
     * @param awsEc2Instance
     *        Details about an Amazon EC2 instance related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2Instance(AwsEc2InstanceDetails awsEc2Instance) {
        setAwsEc2Instance(awsEc2Instance);
        return this;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterface
     *        Details for an AWS EC2 network interface.
     */

    public void setAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        this.awsEc2NetworkInterface = awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     * 
     * @return Details for an AWS EC2 network interface.
     */

    public AwsEc2NetworkInterfaceDetails getAwsEc2NetworkInterface() {
        return this.awsEc2NetworkInterface;
    }

    /**
     * <p>
     * Details for an AWS EC2 network interface.
     * </p>
     * 
     * @param awsEc2NetworkInterface
     *        Details for an AWS EC2 network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2NetworkInterface(AwsEc2NetworkInterfaceDetails awsEc2NetworkInterface) {
        setAwsEc2NetworkInterface(awsEc2NetworkInterface);
        return this;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @param awsEc2SecurityGroup
     *        Details for an EC2 security group.
     */

    public void setAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        this.awsEc2SecurityGroup = awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @return Details for an EC2 security group.
     */

    public AwsEc2SecurityGroupDetails getAwsEc2SecurityGroup() {
        return this.awsEc2SecurityGroup;
    }

    /**
     * <p>
     * Details for an EC2 security group.
     * </p>
     * 
     * @param awsEc2SecurityGroup
     *        Details for an EC2 security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsEc2SecurityGroup(AwsEc2SecurityGroupDetails awsEc2SecurityGroup) {
        setAwsEc2SecurityGroup(awsEc2SecurityGroup);
        return this;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @param awsElbv2LoadBalancer
     *        Details about a load balancer.
     */

    public void setAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        this.awsElbv2LoadBalancer = awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @return Details about a load balancer.
     */

    public AwsElbv2LoadBalancerDetails getAwsElbv2LoadBalancer() {
        return this.awsElbv2LoadBalancer;
    }

    /**
     * <p>
     * Details about a load balancer.
     * </p>
     * 
     * @param awsElbv2LoadBalancer
     *        Details about a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElbv2LoadBalancer(AwsElbv2LoadBalancerDetails awsElbv2LoadBalancer) {
        setAwsElbv2LoadBalancer(awsElbv2LoadBalancer);
        return this;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @param awsElasticsearchDomain
     *        Details for an Elasticsearch domain.
     */

    public void setAwsElasticsearchDomain(AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        this.awsElasticsearchDomain = awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @return Details for an Elasticsearch domain.
     */

    public AwsElasticsearchDomainDetails getAwsElasticsearchDomain() {
        return this.awsElasticsearchDomain;
    }

    /**
     * <p>
     * Details for an Elasticsearch domain.
     * </p>
     * 
     * @param awsElasticsearchDomain
     *        Details for an Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsElasticsearchDomain(AwsElasticsearchDomainDetails awsElasticsearchDomain) {
        setAwsElasticsearchDomain(awsElasticsearchDomain);
        return this;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     * 
     * @param awsS3Bucket
     *        Details about an Amazon S3 Bucket related to a finding.
     */

    public void setAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        this.awsS3Bucket = awsS3Bucket;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     * 
     * @return Details about an Amazon S3 Bucket related to a finding.
     */

    public AwsS3BucketDetails getAwsS3Bucket() {
        return this.awsS3Bucket;
    }

    /**
     * <p>
     * Details about an Amazon S3 Bucket related to a finding.
     * </p>
     * 
     * @param awsS3Bucket
     *        Details about an Amazon S3 Bucket related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsS3Bucket(AwsS3BucketDetails awsS3Bucket) {
        setAwsS3Bucket(awsS3Bucket);
        return this;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        Details about an IAM access key related to a finding.
     */

    public void setAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        this.awsIamAccessKey = awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @return Details about an IAM access key related to a finding.
     */

    public AwsIamAccessKeyDetails getAwsIamAccessKey() {
        return this.awsIamAccessKey;
    }

    /**
     * <p>
     * Details about an IAM access key related to a finding.
     * </p>
     * 
     * @param awsIamAccessKey
     *        Details about an IAM access key related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamAccessKey(AwsIamAccessKeyDetails awsIamAccessKey) {
        setAwsIamAccessKey(awsIamAccessKey);
        return this;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @param awsIamRole
     *        Details about an IAM role.
     */

    public void setAwsIamRole(AwsIamRoleDetails awsIamRole) {
        this.awsIamRole = awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @return Details about an IAM role.
     */

    public AwsIamRoleDetails getAwsIamRole() {
        return this.awsIamRole;
    }

    /**
     * <p>
     * Details about an IAM role.
     * </p>
     * 
     * @param awsIamRole
     *        Details about an IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsIamRole(AwsIamRoleDetails awsIamRole) {
        setAwsIamRole(awsIamRole);
        return this;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     * 
     * @param awsKmsKey
     *        Details about a KMS key.
     */

    public void setAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        this.awsKmsKey = awsKmsKey;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     * 
     * @return Details about a KMS key.
     */

    public AwsKmsKeyDetails getAwsKmsKey() {
        return this.awsKmsKey;
    }

    /**
     * <p>
     * Details about a KMS key.
     * </p>
     * 
     * @param awsKmsKey
     *        Details about a KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsKmsKey(AwsKmsKeyDetails awsKmsKey) {
        setAwsKmsKey(awsKmsKey);
        return this;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @param awsLambdaFunction
     *        Details about a Lambda function.
     */

    public void setAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        this.awsLambdaFunction = awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @return Details about a Lambda function.
     */

    public AwsLambdaFunctionDetails getAwsLambdaFunction() {
        return this.awsLambdaFunction;
    }

    /**
     * <p>
     * Details about a Lambda function.
     * </p>
     * 
     * @param awsLambdaFunction
     *        Details about a Lambda function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsLambdaFunction(AwsLambdaFunctionDetails awsLambdaFunction) {
        setAwsLambdaFunction(awsLambdaFunction);
        return this;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @param awsLambdaLayerVersion
     *        Details for a Lambda layer version.
     */

    public void setAwsLambdaLayerVersion(AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        this.awsLambdaLayerVersion = awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @return Details for a Lambda layer version.
     */

    public AwsLambdaLayerVersionDetails getAwsLambdaLayerVersion() {
        return this.awsLambdaLayerVersion;
    }

    /**
     * <p>
     * Details for a Lambda layer version.
     * </p>
     * 
     * @param awsLambdaLayerVersion
     *        Details for a Lambda layer version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsLambdaLayerVersion(AwsLambdaLayerVersionDetails awsLambdaLayerVersion) {
        setAwsLambdaLayerVersion(awsLambdaLayerVersion);
        return this;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     * 
     * @param awsRdsDbInstance
     *        Details for an RDS database instance.
     */

    public void setAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        this.awsRdsDbInstance = awsRdsDbInstance;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     * 
     * @return Details for an RDS database instance.
     */

    public AwsRdsDbInstanceDetails getAwsRdsDbInstance() {
        return this.awsRdsDbInstance;
    }

    /**
     * <p>
     * Details for an RDS database instance.
     * </p>
     * 
     * @param awsRdsDbInstance
     *        Details for an RDS database instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsRdsDbInstance(AwsRdsDbInstanceDetails awsRdsDbInstance) {
        setAwsRdsDbInstance(awsRdsDbInstance);
        return this;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @param awsSnsTopic
     *        Details about an SNS topic.
     */

    public void setAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        this.awsSnsTopic = awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @return Details about an SNS topic.
     */

    public AwsSnsTopicDetails getAwsSnsTopic() {
        return this.awsSnsTopic;
    }

    /**
     * <p>
     * Details about an SNS topic.
     * </p>
     * 
     * @param awsSnsTopic
     *        Details about an SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSnsTopic(AwsSnsTopicDetails awsSnsTopic) {
        setAwsSnsTopic(awsSnsTopic);
        return this;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @param awsSqsQueue
     *        Details about an SQS queue.
     */

    public void setAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        this.awsSqsQueue = awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @return Details about an SQS queue.
     */

    public AwsSqsQueueDetails getAwsSqsQueue() {
        return this.awsSqsQueue;
    }

    /**
     * <p>
     * Details about an SQS queue.
     * </p>
     * 
     * @param awsSqsQueue
     *        Details about an SQS queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsSqsQueue(AwsSqsQueueDetails awsSqsQueue) {
        setAwsSqsQueue(awsSqsQueue);
        return this;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     * 
     * @param awsWafWebAcl
     *        Details for a WAF WebACL.
     */

    public void setAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        this.awsWafWebAcl = awsWafWebAcl;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     * 
     * @return Details for a WAF WebACL.
     */

    public AwsWafWebAclDetails getAwsWafWebAcl() {
        return this.awsWafWebAcl;
    }

    /**
     * <p>
     * Details for a WAF WebACL.
     * </p>
     * 
     * @param awsWafWebAcl
     *        Details for a WAF WebACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withAwsWafWebAcl(AwsWafWebAclDetails awsWafWebAcl) {
        setAwsWafWebAcl(awsWafWebAcl);
        return this;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @param container
     *        Details about a container resource related to a finding.
     */

    public void setContainer(ContainerDetails container) {
        this.container = container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @return Details about a container resource related to a finding.
     */

    public ContainerDetails getContainer() {
        return this.container;
    }

    /**
     * <p>
     * Details about a container resource related to a finding.
     * </p>
     * 
     * @param container
     *        Details about a container resource related to a finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withContainer(ContainerDetails container) {
        setContainer(container);
        return this;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Details about a resource that are not available in a type-specific details object. Use the
     *         <code>Other</code> object in the following cases.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The type-specific object does not contain all of the fields that you want to populate. In this case,
     *         first use the type-specific object to populate those fields. Use the <code>Other</code> object to
     *         populate the fields that are missing from the type-specific object.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The resource type does not have a corresponding object. This includes resources for which the type is
     *         <code>Other</code>.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getOther() {
        return other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param other
     *        Details about a resource that are not available in a type-specific details object. Use the
     *        <code>Other</code> object in the following cases.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type-specific object does not contain all of the fields that you want to populate. In this case, first
     *        use the type-specific object to populate those fields. Use the <code>Other</code> object to populate the
     *        fields that are missing from the type-specific object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type does not have a corresponding object. This includes resources for which the type is
     *        <code>Other</code>.
     *        </p>
     *        </li>
     */

    public void setOther(java.util.Map<String, String> other) {
        this.other = other;
    }

    /**
     * <p>
     * Details about a resource that are not available in a type-specific details object. Use the <code>Other</code>
     * object in the following cases.
     * </p>
     * <ul>
     * <li>
     * <p>
     * The type-specific object does not contain all of the fields that you want to populate. In this case, first use
     * the type-specific object to populate those fields. Use the <code>Other</code> object to populate the fields that
     * are missing from the type-specific object.
     * </p>
     * </li>
     * <li>
     * <p>
     * The resource type does not have a corresponding object. This includes resources for which the type is
     * <code>Other</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param other
     *        Details about a resource that are not available in a type-specific details object. Use the
     *        <code>Other</code> object in the following cases.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The type-specific object does not contain all of the fields that you want to populate. In this case, first
     *        use the type-specific object to populate those fields. Use the <code>Other</code> object to populate the
     *        fields that are missing from the type-specific object.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The resource type does not have a corresponding object. This includes resources for which the type is
     *        <code>Other</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails withOther(java.util.Map<String, String> other) {
        setOther(other);
        return this;
    }

    /**
     * Add a single Other entry
     *
     * @see ResourceDetails#withOther
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails addOtherEntry(String key, String value) {
        if (null == this.other) {
            this.other = new java.util.HashMap<String, String>();
        }
        if (this.other.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.other.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Other.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceDetails clearOtherEntries() {
        this.other = null;
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
        if (getAwsCodeBuildProject() != null)
            sb.append("AwsCodeBuildProject: ").append(getAwsCodeBuildProject()).append(",");
        if (getAwsCloudFrontDistribution() != null)
            sb.append("AwsCloudFrontDistribution: ").append(getAwsCloudFrontDistribution()).append(",");
        if (getAwsEc2Instance() != null)
            sb.append("AwsEc2Instance: ").append(getAwsEc2Instance()).append(",");
        if (getAwsEc2NetworkInterface() != null)
            sb.append("AwsEc2NetworkInterface: ").append(getAwsEc2NetworkInterface()).append(",");
        if (getAwsEc2SecurityGroup() != null)
            sb.append("AwsEc2SecurityGroup: ").append(getAwsEc2SecurityGroup()).append(",");
        if (getAwsElbv2LoadBalancer() != null)
            sb.append("AwsElbv2LoadBalancer: ").append(getAwsElbv2LoadBalancer()).append(",");
        if (getAwsElasticsearchDomain() != null)
            sb.append("AwsElasticsearchDomain: ").append(getAwsElasticsearchDomain()).append(",");
        if (getAwsS3Bucket() != null)
            sb.append("AwsS3Bucket: ").append(getAwsS3Bucket()).append(",");
        if (getAwsIamAccessKey() != null)
            sb.append("AwsIamAccessKey: ").append(getAwsIamAccessKey()).append(",");
        if (getAwsIamRole() != null)
            sb.append("AwsIamRole: ").append(getAwsIamRole()).append(",");
        if (getAwsKmsKey() != null)
            sb.append("AwsKmsKey: ").append(getAwsKmsKey()).append(",");
        if (getAwsLambdaFunction() != null)
            sb.append("AwsLambdaFunction: ").append(getAwsLambdaFunction()).append(",");
        if (getAwsLambdaLayerVersion() != null)
            sb.append("AwsLambdaLayerVersion: ").append(getAwsLambdaLayerVersion()).append(",");
        if (getAwsRdsDbInstance() != null)
            sb.append("AwsRdsDbInstance: ").append(getAwsRdsDbInstance()).append(",");
        if (getAwsSnsTopic() != null)
            sb.append("AwsSnsTopic: ").append(getAwsSnsTopic()).append(",");
        if (getAwsSqsQueue() != null)
            sb.append("AwsSqsQueue: ").append(getAwsSqsQueue()).append(",");
        if (getAwsWafWebAcl() != null)
            sb.append("AwsWafWebAcl: ").append(getAwsWafWebAcl()).append(",");
        if (getContainer() != null)
            sb.append("Container: ").append(getContainer()).append(",");
        if (getOther() != null)
            sb.append("Other: ").append(getOther());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceDetails == false)
            return false;
        ResourceDetails other = (ResourceDetails) obj;
        if (other.getAwsCodeBuildProject() == null ^ this.getAwsCodeBuildProject() == null)
            return false;
        if (other.getAwsCodeBuildProject() != null && other.getAwsCodeBuildProject().equals(this.getAwsCodeBuildProject()) == false)
            return false;
        if (other.getAwsCloudFrontDistribution() == null ^ this.getAwsCloudFrontDistribution() == null)
            return false;
        if (other.getAwsCloudFrontDistribution() != null && other.getAwsCloudFrontDistribution().equals(this.getAwsCloudFrontDistribution()) == false)
            return false;
        if (other.getAwsEc2Instance() == null ^ this.getAwsEc2Instance() == null)
            return false;
        if (other.getAwsEc2Instance() != null && other.getAwsEc2Instance().equals(this.getAwsEc2Instance()) == false)
            return false;
        if (other.getAwsEc2NetworkInterface() == null ^ this.getAwsEc2NetworkInterface() == null)
            return false;
        if (other.getAwsEc2NetworkInterface() != null && other.getAwsEc2NetworkInterface().equals(this.getAwsEc2NetworkInterface()) == false)
            return false;
        if (other.getAwsEc2SecurityGroup() == null ^ this.getAwsEc2SecurityGroup() == null)
            return false;
        if (other.getAwsEc2SecurityGroup() != null && other.getAwsEc2SecurityGroup().equals(this.getAwsEc2SecurityGroup()) == false)
            return false;
        if (other.getAwsElbv2LoadBalancer() == null ^ this.getAwsElbv2LoadBalancer() == null)
            return false;
        if (other.getAwsElbv2LoadBalancer() != null && other.getAwsElbv2LoadBalancer().equals(this.getAwsElbv2LoadBalancer()) == false)
            return false;
        if (other.getAwsElasticsearchDomain() == null ^ this.getAwsElasticsearchDomain() == null)
            return false;
        if (other.getAwsElasticsearchDomain() != null && other.getAwsElasticsearchDomain().equals(this.getAwsElasticsearchDomain()) == false)
            return false;
        if (other.getAwsS3Bucket() == null ^ this.getAwsS3Bucket() == null)
            return false;
        if (other.getAwsS3Bucket() != null && other.getAwsS3Bucket().equals(this.getAwsS3Bucket()) == false)
            return false;
        if (other.getAwsIamAccessKey() == null ^ this.getAwsIamAccessKey() == null)
            return false;
        if (other.getAwsIamAccessKey() != null && other.getAwsIamAccessKey().equals(this.getAwsIamAccessKey()) == false)
            return false;
        if (other.getAwsIamRole() == null ^ this.getAwsIamRole() == null)
            return false;
        if (other.getAwsIamRole() != null && other.getAwsIamRole().equals(this.getAwsIamRole()) == false)
            return false;
        if (other.getAwsKmsKey() == null ^ this.getAwsKmsKey() == null)
            return false;
        if (other.getAwsKmsKey() != null && other.getAwsKmsKey().equals(this.getAwsKmsKey()) == false)
            return false;
        if (other.getAwsLambdaFunction() == null ^ this.getAwsLambdaFunction() == null)
            return false;
        if (other.getAwsLambdaFunction() != null && other.getAwsLambdaFunction().equals(this.getAwsLambdaFunction()) == false)
            return false;
        if (other.getAwsLambdaLayerVersion() == null ^ this.getAwsLambdaLayerVersion() == null)
            return false;
        if (other.getAwsLambdaLayerVersion() != null && other.getAwsLambdaLayerVersion().equals(this.getAwsLambdaLayerVersion()) == false)
            return false;
        if (other.getAwsRdsDbInstance() == null ^ this.getAwsRdsDbInstance() == null)
            return false;
        if (other.getAwsRdsDbInstance() != null && other.getAwsRdsDbInstance().equals(this.getAwsRdsDbInstance()) == false)
            return false;
        if (other.getAwsSnsTopic() == null ^ this.getAwsSnsTopic() == null)
            return false;
        if (other.getAwsSnsTopic() != null && other.getAwsSnsTopic().equals(this.getAwsSnsTopic()) == false)
            return false;
        if (other.getAwsSqsQueue() == null ^ this.getAwsSqsQueue() == null)
            return false;
        if (other.getAwsSqsQueue() != null && other.getAwsSqsQueue().equals(this.getAwsSqsQueue()) == false)
            return false;
        if (other.getAwsWafWebAcl() == null ^ this.getAwsWafWebAcl() == null)
            return false;
        if (other.getAwsWafWebAcl() != null && other.getAwsWafWebAcl().equals(this.getAwsWafWebAcl()) == false)
            return false;
        if (other.getContainer() == null ^ this.getContainer() == null)
            return false;
        if (other.getContainer() != null && other.getContainer().equals(this.getContainer()) == false)
            return false;
        if (other.getOther() == null ^ this.getOther() == null)
            return false;
        if (other.getOther() != null && other.getOther().equals(this.getOther()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsCodeBuildProject() == null) ? 0 : getAwsCodeBuildProject().hashCode());
        hashCode = prime * hashCode + ((getAwsCloudFrontDistribution() == null) ? 0 : getAwsCloudFrontDistribution().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2Instance() == null) ? 0 : getAwsEc2Instance().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2NetworkInterface() == null) ? 0 : getAwsEc2NetworkInterface().hashCode());
        hashCode = prime * hashCode + ((getAwsEc2SecurityGroup() == null) ? 0 : getAwsEc2SecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getAwsElbv2LoadBalancer() == null) ? 0 : getAwsElbv2LoadBalancer().hashCode());
        hashCode = prime * hashCode + ((getAwsElasticsearchDomain() == null) ? 0 : getAwsElasticsearchDomain().hashCode());
        hashCode = prime * hashCode + ((getAwsS3Bucket() == null) ? 0 : getAwsS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getAwsIamAccessKey() == null) ? 0 : getAwsIamAccessKey().hashCode());
        hashCode = prime * hashCode + ((getAwsIamRole() == null) ? 0 : getAwsIamRole().hashCode());
        hashCode = prime * hashCode + ((getAwsKmsKey() == null) ? 0 : getAwsKmsKey().hashCode());
        hashCode = prime * hashCode + ((getAwsLambdaFunction() == null) ? 0 : getAwsLambdaFunction().hashCode());
        hashCode = prime * hashCode + ((getAwsLambdaLayerVersion() == null) ? 0 : getAwsLambdaLayerVersion().hashCode());
        hashCode = prime * hashCode + ((getAwsRdsDbInstance() == null) ? 0 : getAwsRdsDbInstance().hashCode());
        hashCode = prime * hashCode + ((getAwsSnsTopic() == null) ? 0 : getAwsSnsTopic().hashCode());
        hashCode = prime * hashCode + ((getAwsSqsQueue() == null) ? 0 : getAwsSqsQueue().hashCode());
        hashCode = prime * hashCode + ((getAwsWafWebAcl() == null) ? 0 : getAwsWafWebAcl().hashCode());
        hashCode = prime * hashCode + ((getContainer() == null) ? 0 : getContainer().hashCode());
        hashCode = prime * hashCode + ((getOther() == null) ? 0 : getOther().hashCode());
        return hashCode;
    }

    @Override
    public ResourceDetails clone() {
        try {
            return (ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
