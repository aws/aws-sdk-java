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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of the infrastructure configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/InfrastructureConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfrastructureConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     */
    private String arn;
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
     * The instance types of the infrastructure configuration.
     * </p>
     */
    private java.util.List<String> instanceTypes;
    /**
     * <p>
     * The instance profile of the infrastructure configuration.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * The security group IDs of the infrastructure configuration.
     * </p>
     */
    private java.util.List<String> securityGroupIds;
    /**
     * <p>
     * The subnet ID of the infrastructure configuration.
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
     * The EC2 key pair of the infrastructure configuration.
     * </p>
     */
    private String keyPair;
    /**
     * <p>
     * The terminate instance on failure configuration of the infrastructure configuration.
     * </p>
     */
    private Boolean terminateInstanceOnFailure;
    /**
     * <p>
     * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     */
    private String dateCreated;
    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     */
    private String dateUpdated;
    /**
     * <p>
     * The tags of the infrastructure configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withArn(String arn) {
        setArn(arn);
        return this;
    }

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

    public InfrastructureConfiguration withName(String name) {
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

    public InfrastructureConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration.
     * </p>
     * 
     * @return The instance types of the infrastructure configuration.
     */

    public java.util.List<String> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * <p>
     * The instance types of the infrastructure configuration.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration.
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
     * The instance types of the infrastructure configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceTypes(java.util.Collection)} or {@link #withInstanceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withInstanceTypes(String... instanceTypes) {
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
     * The instance types of the infrastructure configuration.
     * </p>
     * 
     * @param instanceTypes
     *        The instance types of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withInstanceTypes(java.util.Collection<String> instanceTypes) {
        setInstanceTypes(instanceTypes);
        return this;
    }

    /**
     * <p>
     * The instance profile of the infrastructure configuration.
     * </p>
     * 
     * @param instanceProfileName
     *        The instance profile of the infrastructure configuration.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The instance profile of the infrastructure configuration.
     * </p>
     * 
     * @return The instance profile of the infrastructure configuration.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The instance profile of the infrastructure configuration.
     * </p>
     * 
     * @param instanceProfileName
     *        The instance profile of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * The security group IDs of the infrastructure configuration.
     * </p>
     * 
     * @return The security group IDs of the infrastructure configuration.
     */

    public java.util.List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * <p>
     * The security group IDs of the infrastructure configuration.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs of the infrastructure configuration.
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
     * The security group IDs of the infrastructure configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroupIds(java.util.Collection)} or {@link #withSecurityGroupIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withSecurityGroupIds(String... securityGroupIds) {
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
     * The security group IDs of the infrastructure configuration.
     * </p>
     * 
     * @param securityGroupIds
     *        The security group IDs of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withSecurityGroupIds(java.util.Collection<String> securityGroupIds) {
        setSecurityGroupIds(securityGroupIds);
        return this;
    }

    /**
     * <p>
     * The subnet ID of the infrastructure configuration.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID of the infrastructure configuration.
     */

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    /**
     * <p>
     * The subnet ID of the infrastructure configuration.
     * </p>
     * 
     * @return The subnet ID of the infrastructure configuration.
     */

    public String getSubnetId() {
        return this.subnetId;
    }

    /**
     * <p>
     * The subnet ID of the infrastructure configuration.
     * </p>
     * 
     * @param subnetId
     *        The subnet ID of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withSubnetId(String subnetId) {
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

    public InfrastructureConfiguration withLogging(Logging logging) {
        setLogging(logging);
        return this;
    }

    /**
     * <p>
     * The EC2 key pair of the infrastructure configuration.
     * </p>
     * 
     * @param keyPair
     *        The EC2 key pair of the infrastructure configuration.
     */

    public void setKeyPair(String keyPair) {
        this.keyPair = keyPair;
    }

    /**
     * <p>
     * The EC2 key pair of the infrastructure configuration.
     * </p>
     * 
     * @return The EC2 key pair of the infrastructure configuration.
     */

    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * <p>
     * The EC2 key pair of the infrastructure configuration.
     * </p>
     * 
     * @param keyPair
     *        The EC2 key pair of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withKeyPair(String keyPair) {
        setKeyPair(keyPair);
        return this;
    }

    /**
     * <p>
     * The terminate instance on failure configuration of the infrastructure configuration.
     * </p>
     * 
     * @param terminateInstanceOnFailure
     *        The terminate instance on failure configuration of the infrastructure configuration.
     */

    public void setTerminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
        this.terminateInstanceOnFailure = terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure configuration of the infrastructure configuration.
     * </p>
     * 
     * @return The terminate instance on failure configuration of the infrastructure configuration.
     */

    public Boolean getTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The terminate instance on failure configuration of the infrastructure configuration.
     * </p>
     * 
     * @param terminateInstanceOnFailure
     *        The terminate instance on failure configuration of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withTerminateInstanceOnFailure(Boolean terminateInstanceOnFailure) {
        setTerminateInstanceOnFailure(terminateInstanceOnFailure);
        return this;
    }

    /**
     * <p>
     * The terminate instance on failure configuration of the infrastructure configuration.
     * </p>
     * 
     * @return The terminate instance on failure configuration of the infrastructure configuration.
     */

    public Boolean isTerminateInstanceOnFailure() {
        return this.terminateInstanceOnFailure;
    }

    /**
     * <p>
     * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @return The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic Amazon Resource Name (ARN) of the infrastructure configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which the infrastructure configuration was created.
     */

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @return The date on which the infrastructure configuration was created.
     */

    public String getDateCreated() {
        return this.dateCreated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was created.
     * </p>
     * 
     * @param dateCreated
     *        The date on which the infrastructure configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withDateCreated(String dateCreated) {
        setDateCreated(dateCreated);
        return this;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which the infrastructure configuration was last updated.
     */

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @return The date on which the infrastructure configuration was last updated.
     */

    public String getDateUpdated() {
        return this.dateUpdated;
    }

    /**
     * <p>
     * The date on which the infrastructure configuration was last updated.
     * </p>
     * 
     * @param dateUpdated
     *        The date on which the infrastructure configuration was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration withDateUpdated(String dateUpdated) {
        setDateUpdated(dateUpdated);
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

    public InfrastructureConfiguration withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see InfrastructureConfiguration#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public InfrastructureConfiguration addTagsEntry(String key, String value) {
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

    public InfrastructureConfiguration clearTagsEntries() {
        this.tags = null;
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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
        if (getDateCreated() != null)
            sb.append("DateCreated: ").append(getDateCreated()).append(",");
        if (getDateUpdated() != null)
            sb.append("DateUpdated: ").append(getDateUpdated()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InfrastructureConfiguration == false)
            return false;
        InfrastructureConfiguration other = (InfrastructureConfiguration) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
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
        if (other.getDateCreated() == null ^ this.getDateCreated() == null)
            return false;
        if (other.getDateCreated() != null && other.getDateCreated().equals(this.getDateCreated()) == false)
            return false;
        if (other.getDateUpdated() == null ^ this.getDateUpdated() == null)
            return false;
        if (other.getDateUpdated() != null && other.getDateUpdated().equals(this.getDateUpdated()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
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
        hashCode = prime * hashCode + ((getDateCreated() == null) ? 0 : getDateCreated().hashCode());
        hashCode = prime * hashCode + ((getDateUpdated() == null) ? 0 : getDateUpdated().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InfrastructureConfiguration clone() {
        try {
            return (InfrastructureConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.InfrastructureConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
