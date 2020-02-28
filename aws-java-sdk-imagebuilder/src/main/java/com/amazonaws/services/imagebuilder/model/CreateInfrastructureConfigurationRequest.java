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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/CreateInfrastructureConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateInfrastructureConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify one or more instance types to use for
     * this build. The service will pick one of these instance types based on availability.
     * </p>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The instance profile to associate with the instance used to customize your EC2 AMI.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * The security group IDs to associate with the instance used to customize your EC2 AMI.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2 AMI.
     * </p>
     */
    private String subnetId;
    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     */
    private Logging logging;
    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to
     * create your image.
     * </p>
     */
    private String keyPair;
    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image
     * Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
     * </p>
     */
    private Boolean terminateInstanceOnFailure;
    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @param name
     *        The name of the infrastructure configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @return The name of the infrastructure configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the infrastructure configuration.
     * </p>
     * 
     * @param name
     *        The name of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @param description
     *        The description of the infrastructure configuration.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @return The description of the infrastructure configuration.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the infrastructure configuration.
     * </p>
     * 
     * @param description
     *        The description of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify one or more instance types to use for
     * this build. The service will pick one of these instance types based on availability.
     * </p>
     * 
     * @return The instance types of the infrastructure configuration. You can specify one or more instance types to use
     *         for this build. The service will pick one of these instance types based on availability.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify one or more instance types to use for
     * this build. The service will pick one of these instance types based on availability.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration. You can specify one or more instance types to use
     *        for this build. The service will pick one of these instance types based on availability.
     */

    public void setInstanceTypes(java.util.Collection<String> instanceTypes) {
        if (instanceTypes == null) {
            this.instanceTypes = null;
            return;
        }

        this.instanceTypes = new java.util.ArrayList<String>(instanceTypes);
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify one or more instance types to use for
     * this build. The service will pick one of these instance types based on availability.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration. You can specify one or more instance types to use
     *        for this build. The service will pick one of these instance types based on availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withInstanceTypes(String... instanceTypes) {
        if (this.instanceTypes == null) {
            setInstanceTypes(new java.util.ArrayList<String>(instanceTypes.length));
        }
        for (String ele : instanceTypes) {
            this.instanceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration. You can specify one or more instance types to use for
     * this build. The service will pick one of these instance types based on availability.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration. You can specify one or more instance types to use
     *        for this build. The service will pick one of these instance types based on availability.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param instanceProfileName
     *        The instance profile to associate with the instance used to customize your EC2 AMI.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @return The instance profile to associate with the instance used to customize your EC2 AMI.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The instance profile to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param instanceProfileName
     *        The instance profile to associate with the instance used to customize your EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @return The security group IDs to associate with the instance used to customize your EC2 AMI.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to associate with the instance used to customize your EC2 AMI.
     */

    public void setSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        if (securityGroupIds == null) {
            this.securityGroupIds = null;
            return;
        }

        this.securityGroupIds = new java.util.ArrayList<String>(securityGroupIds);
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize your EC2 AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to associate with the instance used to customize your EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withSecurityGroupIds(String... securityGroupIds) {
        if (this.securityGroupIds == null) {
            setSecurityGroupIds(new java.util.ArrayList<String>(securityGroupIds.length));
        }
        for (String ele : securityGroupIds) {
            this.securityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The security group IDs to associate with the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs to associate with the instance used to customize your EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID in which to place the instance used to customize your EC2 AMI.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @return The subnet ID in which to place the instance used to customize your EC2 AMI.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID in which to place the instance used to customize your EC2 AMI.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID in which to place the instance used to customize your EC2 AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withSubnetId(String subnetId) {
        setSubnetId(subnetId);
        return this;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     * 
     * @param logging
     *        The logging configuration of the infrastructure configuration.
     */

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     * 
     * @return The logging configuration of the infrastructure configuration.
     */

    public Logging getLogging() {
        return this.logging;
    }

    /**
     * <p>
     * The logging configuration of the infrastructure configuration.
     * </p>
     * 
     * @param logging
     *        The logging configuration of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withLogging(Logging logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to
     * create your image.
     * </p>
     * 
     * @param keyPair
     *        The key pair of the infrastructure configuration. This can be used to log on to and debug the instance
     *        used to create your image.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to
     * create your image.
     * </p>
     * 
     * @return The key pair of the infrastructure configuration. This can be used to log on to and debug the instance
     *         used to create your image.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to
     * create your image.
     * </p>
     * 
     * @param keyPair
     *        The key pair of the infrastructure configuration. This can be used to log on to and debug the instance
     *        used to create your image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withKeyPair(String keyPair) {
        setKeyPair(keyPair);
        return this;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image
     * Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
     * </p>
     * 
     * @param terminateInstanceOnFailure
     *        The terminate instance on failure setting of the infrastructure configuration. Set to false if you want
     *        Image Builder to retain the instance used to configure your AMI if the build or test phase of your
     *        workflow fails.
     */

    public void setTerminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image
     * Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
     * </p>
     * 
     * @return The terminate instance on failure setting of the infrastructure configuration. Set to false if you want
     *         Image Builder to retain the instance used to configure your AMI if the build or test phase of your
     *         workflow fails.
     */

    public Boolean getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image
     * Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
     * </p>
     * 
     * @param terminateInstanceOnFailure
     *        The terminate instance on failure setting of the infrastructure configuration. Set to false if you want
     *        Image Builder to retain the instance used to configure your AMI if the build or test phase of your
     *        workflow fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withTerminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
        setTerminateInstanceOnFailure(terminateInstanceOnFailure);
        return this;
    }

    /**
     * <p>
     * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image
     * Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
     * </p>
     * 
     * @return The terminate instance on failure setting of the infrastructure configuration. Set to false if you want
     *         Image Builder to retain the instance used to configure your AMI if the build or test phase of your
     *         workflow fails.
     */

    public Boolean isTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic on which to send image build events.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * 
     * @return The SNS topic on which to send image build events.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic on which to send image build events.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic on which to send image build events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @return The tags of the infrastructure configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the infrastructure configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     * 
     * @param tags
     *        The tags of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateInfrastructureConfigurationRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @return The idempotency token used to make this request idempotent.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotency token used to make this request idempotent.
     * </p>
     * 
     * @param clientToken
     *        The idempotency token used to make this request idempotent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateInfrastructureConfigurationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getInstanceTypes() != null)
            sb.append("InstanceTypes: ").append(getInstanceTypes()).append(",");
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
        if (getSecurityGroupIds() != null)
            sb.append("SecurityGroupIds: ").append(getSecurityGroupIds()).append(",");
        if (getSubnetId() != null)
            sb.append("SubnetId: ").append(getSubnetId()).append(",");
        if (getLogging() != null)
            sb.append("Logging: ").append(getLogging()).append(",");
        if (getKeyPair() != null)
            sb.append("KeyPair: ").append(getKeyPair()).append(",");
        if (getTerminateInstanceOnFailure() != null)
            sb.append("TerminateInstanceOnFailure: ").append(getTerminateInstanceOnFailure()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInfrastructureConfigurationRequest == false)
            return false;
        CreateInfrastructureConfigurationRequest other = (CreateInfrastructureConfigurationRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getInstanceTypes() == null ^ this.getInstanceTypes() == null)
            return false;
        if (other.getInstanceTypes() != null && other.getInstanceTypes().equals(this.getInstanceTypes()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
            return false;
        if (other.getSecurityGroupIds() == null ^ this.getSecurityGroupIds() == null)
            return false;
        if (other.getSecurityGroupIds() != null && other.getSecurityGroupIds().equals(this.getSecurityGroupIds()) == false)
            return false;
        if (other.getSubnetId() == null ^ this.getSubnetId() == null)
            return false;
        if (other.getSubnetId() != null && other.getSubnetId().equals(this.getSubnetId()) == false)
            return false;
        if (other.getLogging() == null ^ this.getLogging() == null)
            return false;
        if (other.getLogging() != null && other.getLogging().equals(this.getLogging()) == false)
            return false;
        if (other.getKeyPair() == null ^ this.getKeyPair() == null)
            return false;
        if (other.getKeyPair() != null && other.getKeyPair().equals(this.getKeyPair()) == false)
            return false;
        if (other.getTerminateInstanceOnFailure() == null ^ this.getTerminateInstanceOnFailure() == null)
            return false;
        if (other.getTerminateInstanceOnFailure() != null && other.getTerminateInstanceOnFailure().equals(this.getTerminateInstanceOnFailure()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getInstanceTypes() == null) ? 0 : getInstanceTypes().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroupIds() == null) ? 0 : getSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getSubnetId() == null) ? 0 : getSubnetId().hashCode());
        hashCode = prime * hashCode + ((getLogging() == null) ? 0 : getLogging().hashCode());
        hashCode = prime * hashCode + ((getKeyPair() == null) ? 0 : getKeyPair().hashCode());
        hashCode = prime * hashCode + ((getTerminateInstanceOnFailure() == null) ? 0 : getTerminateInstanceOnFailure().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateInfrastructureConfigurationRequest clone() {
        return (CreateInfrastructureConfigurationRequest) super.clone();
    }

}
