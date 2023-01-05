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
package com.amazonaws.services.route53recoveryreadiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Name of a resource set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-readiness-2019-12-02/UpdateResourceSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateResourceSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of a resource set.
     * </p>
     */
    private String resourceSetName;
    /**
     * <p>
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * </p>
     * <p>
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm,
     * AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer,
     * AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster,
     * AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * </p>
     */
    private String resourceSetType;
    /**
     * <p>
     * A list of resource objects.
     * </p>
     */
    private java.util.List<Resource> resources;

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @param resourceSetName
     *        Name of a resource set.
     */

    public void setResourceSetName(String resourceSetName) {
        this.resourceSetName = resourceSetName;
    }

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @return Name of a resource set.
     */

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    /**
     * <p>
     * Name of a resource set.
     * </p>
     * 
     * @param resourceSetName
     *        Name of a resource set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResourceSetName(String resourceSetName) {
        setResourceSetName(resourceSetName);
        return this;
    }

    /**
     * <p>
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * </p>
     * <p>
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm,
     * AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer,
     * AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster,
     * AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * </p>
     * 
     * @param resourceSetType
     *        The resource type of the resources in the resource set. Enter one of the following values for resource
     *        type:</p>
     *        <p>
     *        AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     *        AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     *        AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function,
     *        AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic,
     *        AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway,
     *        AWS::Route53RecoveryReadiness::DNSTargetResource
     */

    public void setResourceSetType(String resourceSetType) {
        this.resourceSetType = resourceSetType;
    }

    /**
     * <p>
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * </p>
     * <p>
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm,
     * AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer,
     * AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster,
     * AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * </p>
     * 
     * @return The resource type of the resources in the resource set. Enter one of the following values for resource
     *         type:</p>
     *         <p>
     *         AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     *         AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     *         AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer,
     *         AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck,
     *         AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection,
     *         AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     */

    public String getResourceSetType() {
        return this.resourceSetType;
    }

    /**
     * <p>
     * The resource type of the resources in the resource set. Enter one of the following values for resource type:
     * </p>
     * <p>
     * AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup, AWS::CloudWatch::Alarm,
     * AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume, AWS::ElasticLoadBalancing::LoadBalancer,
     * AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function, AWS::MSK::Cluster, AWS::RDS::DBCluster,
     * AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic, AWS::SNS::Subscription, AWS::EC2::VPC,
     * AWS::EC2::VPNConnection, AWS::EC2::VPNGateway, AWS::Route53RecoveryReadiness::DNSTargetResource
     * </p>
     * 
     * @param resourceSetType
     *        The resource type of the resources in the resource set. Enter one of the following values for resource
     *        type:</p>
     *        <p>
     *        AWS::ApiGateway::Stage, AWS::ApiGatewayV2::Stage, AWS::AutoScaling::AutoScalingGroup,
     *        AWS::CloudWatch::Alarm, AWS::EC2::CustomerGateway, AWS::DynamoDB::Table, AWS::EC2::Volume,
     *        AWS::ElasticLoadBalancing::LoadBalancer, AWS::ElasticLoadBalancingV2::LoadBalancer, AWS::Lambda::Function,
     *        AWS::MSK::Cluster, AWS::RDS::DBCluster, AWS::Route53::HealthCheck, AWS::SQS::Queue, AWS::SNS::Topic,
     *        AWS::SNS::Subscription, AWS::EC2::VPC, AWS::EC2::VPNConnection, AWS::EC2::VPNGateway,
     *        AWS::Route53RecoveryReadiness::DNSTargetResource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResourceSetType(String resourceSetType) {
        setResourceSetType(resourceSetType);
        return this;
    }

    /**
     * <p>
     * A list of resource objects.
     * </p>
     * 
     * @return A list of resource objects.
     */

    public java.util.List<Resource> getResources() {
        return resources;
    }

    /**
     * <p>
     * A list of resource objects.
     * </p>
     * 
     * @param resources
     *        A list of resource objects.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<Resource>(resources);
    }

    /**
     * <p>
     * A list of resource objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResources(java.util.Collection)} or {@link #withResources(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resources
     *        A list of resource objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new java.util.ArrayList<Resource>(resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resource objects.
     * </p>
     * 
     * @param resources
     *        A list of resource objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateResourceSetRequest withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
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
        if (getResourceSetName() != null)
            sb.append("ResourceSetName: ").append(getResourceSetName()).append(",");
        if (getResourceSetType() != null)
            sb.append("ResourceSetType: ").append(getResourceSetType()).append(",");
        if (getResources() != null)
            sb.append("Resources: ").append(getResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateResourceSetRequest == false)
            return false;
        UpdateResourceSetRequest other = (UpdateResourceSetRequest) obj;
        if (other.getResourceSetName() == null ^ this.getResourceSetName() == null)
            return false;
        if (other.getResourceSetName() != null && other.getResourceSetName().equals(this.getResourceSetName()) == false)
            return false;
        if (other.getResourceSetType() == null ^ this.getResourceSetType() == null)
            return false;
        if (other.getResourceSetType() != null && other.getResourceSetType().equals(this.getResourceSetType()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null && other.getResources().equals(this.getResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSetName() == null) ? 0 : getResourceSetName().hashCode());
        hashCode = prime * hashCode + ((getResourceSetType() == null) ? 0 : getResourceSetType().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        return hashCode;
    }

    @Override
    public UpdateResourceSetRequest clone() {
        return (UpdateResourceSetRequest) super.clone();
    }

}
