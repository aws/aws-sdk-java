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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The high-level properties of a firewall policy. This, along with the <a>FirewallPolicy</a>, define the policy. You
 * can retrieve all objects for a firewall policy by calling <a>DescribeFirewallPolicy</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/FirewallPolicyResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallPolicyResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     */
    private String firewallPolicyName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     */
    private String firewallPolicyArn;
    /**
     * <p>
     * The unique identifier for the firewall policy.
     * </p>
     */
    private String firewallPolicyId;
    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     * <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * </p>
     */
    private String firewallPolicyStatus;
    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateless rules.
     * </p>
     */
    private Integer consumedStatelessRuleCapacity;
    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateful rules.
     * </p>
     */
    private Integer consumedStatefulRuleCapacity;
    /**
     * <p>
     * The number of firewalls that are associated with this firewall policy.
     * </p>
     */
    private Integer numberOfAssociations;
    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your firewall
     * policy.
     * </p>
     */
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * <p>
     * The last time that the firewall policy was changed.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.
     */

    public void setFirewallPolicyName(String firewallPolicyName) {
        this.firewallPolicyName = firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @return The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *         create it.
     */

    public String getFirewallPolicyName() {
        return this.firewallPolicyName;
    }

    /**
     * <p>
     * The descriptive name of the firewall policy. You can't change the name of a firewall policy after you create it.
     * </p>
     * 
     * @param firewallPolicyName
     *        The descriptive name of the firewall policy. You can't change the name of a firewall policy after you
     *        create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withFirewallPolicyName(String firewallPolicyName) {
        setFirewallPolicyName(firewallPolicyName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p> <note>
     *        <p>
     *        If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *        ARN is a placeholder that isn't attached to a valid resource.
     *        </p>
     */

    public void setFirewallPolicyArn(String firewallPolicyArn) {
        this.firewallPolicyArn = firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @return The Amazon Resource Name (ARN) of the firewall policy.</p> <note>
     *         <p>
     *         If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *         ARN is a placeholder that isn't attached to a valid resource.
     *         </p>
     */

    public String getFirewallPolicyArn() {
        return this.firewallPolicyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the firewall policy.
     * </p>
     * <note>
     * <p>
     * If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this ARN is
     * a placeholder that isn't attached to a valid resource.
     * </p>
     * </note>
     * 
     * @param firewallPolicyArn
     *        The Amazon Resource Name (ARN) of the firewall policy.</p> <note>
     *        <p>
     *        If this response is for a create request that had <code>DryRun</code> set to <code>TRUE</code>, then this
     *        ARN is a placeholder that isn't attached to a valid resource.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withFirewallPolicyArn(String firewallPolicyArn) {
        setFirewallPolicyArn(firewallPolicyArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The unique identifier for the firewall policy.
     */

    public void setFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
    }

    /**
     * <p>
     * The unique identifier for the firewall policy.
     * </p>
     * 
     * @return The unique identifier for the firewall policy.
     */

    public String getFirewallPolicyId() {
        return this.firewallPolicyId;
    }

    /**
     * <p>
     * The unique identifier for the firewall policy.
     * </p>
     * 
     * @param firewallPolicyId
     *        The unique identifier for the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withFirewallPolicyId(String firewallPolicyId) {
        setFirewallPolicyId(firewallPolicyId);
        return this;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @return A description of the firewall policy.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the firewall policy.
     * </p>
     * 
     * @param description
     *        A description of the firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     * <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * </p>
     * 
     * @param firewallPolicyStatus
     *        The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     *        <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * @see ResourceStatus
     */

    public void setFirewallPolicyStatus(String firewallPolicyStatus) {
        this.firewallPolicyStatus = firewallPolicyStatus;
    }

    /**
     * <p>
     * The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     * <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * </p>
     * 
     * @return The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     *         <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * @see ResourceStatus
     */

    public String getFirewallPolicyStatus() {
        return this.firewallPolicyStatus;
    }

    /**
     * <p>
     * The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     * <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * </p>
     * 
     * @param firewallPolicyStatus
     *        The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     *        <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public FirewallPolicyResponse withFirewallPolicyStatus(String firewallPolicyStatus) {
        setFirewallPolicyStatus(firewallPolicyStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     * <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * </p>
     * 
     * @param firewallPolicyStatus
     *        The current status of the firewall policy. You can retrieve this for a firewall policy by calling
     *        <a>DescribeFirewallPolicy</a> and providing the firewall policy's name or ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceStatus
     */

    public FirewallPolicyResponse withFirewallPolicyStatus(ResourceStatus firewallPolicyStatus) {
        this.firewallPolicyStatus = firewallPolicyStatus.toString();
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @return The key:value pairs to associate with the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key:value pairs to associate with the resource.
     * </p>
     * 
     * @param tags
     *        The key:value pairs to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateless rules.
     * </p>
     * 
     * @param consumedStatelessRuleCapacity
     *        The number of capacity units currently consumed by the policy's stateless rules.
     */

    public void setConsumedStatelessRuleCapacity(Integer consumedStatelessRuleCapacity) {
        this.consumedStatelessRuleCapacity = consumedStatelessRuleCapacity;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateless rules.
     * </p>
     * 
     * @return The number of capacity units currently consumed by the policy's stateless rules.
     */

    public Integer getConsumedStatelessRuleCapacity() {
        return this.consumedStatelessRuleCapacity;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateless rules.
     * </p>
     * 
     * @param consumedStatelessRuleCapacity
     *        The number of capacity units currently consumed by the policy's stateless rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withConsumedStatelessRuleCapacity(Integer consumedStatelessRuleCapacity) {
        setConsumedStatelessRuleCapacity(consumedStatelessRuleCapacity);
        return this;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateful rules.
     * </p>
     * 
     * @param consumedStatefulRuleCapacity
     *        The number of capacity units currently consumed by the policy's stateful rules.
     */

    public void setConsumedStatefulRuleCapacity(Integer consumedStatefulRuleCapacity) {
        this.consumedStatefulRuleCapacity = consumedStatefulRuleCapacity;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateful rules.
     * </p>
     * 
     * @return The number of capacity units currently consumed by the policy's stateful rules.
     */

    public Integer getConsumedStatefulRuleCapacity() {
        return this.consumedStatefulRuleCapacity;
    }

    /**
     * <p>
     * The number of capacity units currently consumed by the policy's stateful rules.
     * </p>
     * 
     * @param consumedStatefulRuleCapacity
     *        The number of capacity units currently consumed by the policy's stateful rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withConsumedStatefulRuleCapacity(Integer consumedStatefulRuleCapacity) {
        setConsumedStatefulRuleCapacity(consumedStatefulRuleCapacity);
        return this;
    }

    /**
     * <p>
     * The number of firewalls that are associated with this firewall policy.
     * </p>
     * 
     * @param numberOfAssociations
     *        The number of firewalls that are associated with this firewall policy.
     */

    public void setNumberOfAssociations(Integer numberOfAssociations) {
        this.numberOfAssociations = numberOfAssociations;
    }

    /**
     * <p>
     * The number of firewalls that are associated with this firewall policy.
     * </p>
     * 
     * @return The number of firewalls that are associated with this firewall policy.
     */

    public Integer getNumberOfAssociations() {
        return this.numberOfAssociations;
    }

    /**
     * <p>
     * The number of firewalls that are associated with this firewall policy.
     * </p>
     * 
     * @param numberOfAssociations
     *        The number of firewalls that are associated with this firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withNumberOfAssociations(Integer numberOfAssociations) {
        setNumberOfAssociations(numberOfAssociations);
        return this;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your firewall
     * policy.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your
     *        firewall policy.
     */

    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your firewall
     * policy.
     * </p>
     * 
     * @return A complex type that contains the Amazon Web Services KMS encryption configuration settings for your
     *         firewall policy.
     */

    public EncryptionConfiguration getEncryptionConfiguration() {
        return this.encryptionConfiguration;
    }

    /**
     * <p>
     * A complex type that contains the Amazon Web Services KMS encryption configuration settings for your firewall
     * policy.
     * </p>
     * 
     * @param encryptionConfiguration
     *        A complex type that contains the Amazon Web Services KMS encryption configuration settings for your
     *        firewall policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        setEncryptionConfiguration(encryptionConfiguration);
        return this;
    }

    /**
     * <p>
     * The last time that the firewall policy was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the firewall policy was changed.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the firewall policy was changed.
     * </p>
     * 
     * @return The last time that the firewall policy was changed.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time that the firewall policy was changed.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time that the firewall policy was changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallPolicyResponse withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getFirewallPolicyName() != null)
            sb.append("FirewallPolicyName: ").append(getFirewallPolicyName()).append(",");
        if (getFirewallPolicyArn() != null)
            sb.append("FirewallPolicyArn: ").append(getFirewallPolicyArn()).append(",");
        if (getFirewallPolicyId() != null)
            sb.append("FirewallPolicyId: ").append(getFirewallPolicyId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getFirewallPolicyStatus() != null)
            sb.append("FirewallPolicyStatus: ").append(getFirewallPolicyStatus()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getConsumedStatelessRuleCapacity() != null)
            sb.append("ConsumedStatelessRuleCapacity: ").append(getConsumedStatelessRuleCapacity()).append(",");
        if (getConsumedStatefulRuleCapacity() != null)
            sb.append("ConsumedStatefulRuleCapacity: ").append(getConsumedStatefulRuleCapacity()).append(",");
        if (getNumberOfAssociations() != null)
            sb.append("NumberOfAssociations: ").append(getNumberOfAssociations()).append(",");
        if (getEncryptionConfiguration() != null)
            sb.append("EncryptionConfiguration: ").append(getEncryptionConfiguration()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallPolicyResponse == false)
            return false;
        FirewallPolicyResponse other = (FirewallPolicyResponse) obj;
        if (other.getFirewallPolicyName() == null ^ this.getFirewallPolicyName() == null)
            return false;
        if (other.getFirewallPolicyName() != null && other.getFirewallPolicyName().equals(this.getFirewallPolicyName()) == false)
            return false;
        if (other.getFirewallPolicyArn() == null ^ this.getFirewallPolicyArn() == null)
            return false;
        if (other.getFirewallPolicyArn() != null && other.getFirewallPolicyArn().equals(this.getFirewallPolicyArn()) == false)
            return false;
        if (other.getFirewallPolicyId() == null ^ this.getFirewallPolicyId() == null)
            return false;
        if (other.getFirewallPolicyId() != null && other.getFirewallPolicyId().equals(this.getFirewallPolicyId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getFirewallPolicyStatus() == null ^ this.getFirewallPolicyStatus() == null)
            return false;
        if (other.getFirewallPolicyStatus() != null && other.getFirewallPolicyStatus().equals(this.getFirewallPolicyStatus()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getConsumedStatelessRuleCapacity() == null ^ this.getConsumedStatelessRuleCapacity() == null)
            return false;
        if (other.getConsumedStatelessRuleCapacity() != null
                && other.getConsumedStatelessRuleCapacity().equals(this.getConsumedStatelessRuleCapacity()) == false)
            return false;
        if (other.getConsumedStatefulRuleCapacity() == null ^ this.getConsumedStatefulRuleCapacity() == null)
            return false;
        if (other.getConsumedStatefulRuleCapacity() != null && other.getConsumedStatefulRuleCapacity().equals(this.getConsumedStatefulRuleCapacity()) == false)
            return false;
        if (other.getNumberOfAssociations() == null ^ this.getNumberOfAssociations() == null)
            return false;
        if (other.getNumberOfAssociations() != null && other.getNumberOfAssociations().equals(this.getNumberOfAssociations()) == false)
            return false;
        if (other.getEncryptionConfiguration() == null ^ this.getEncryptionConfiguration() == null)
            return false;
        if (other.getEncryptionConfiguration() != null && other.getEncryptionConfiguration().equals(this.getEncryptionConfiguration()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFirewallPolicyName() == null) ? 0 : getFirewallPolicyName().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyArn() == null) ? 0 : getFirewallPolicyArn().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyId() == null) ? 0 : getFirewallPolicyId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getFirewallPolicyStatus() == null) ? 0 : getFirewallPolicyStatus().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getConsumedStatelessRuleCapacity() == null) ? 0 : getConsumedStatelessRuleCapacity().hashCode());
        hashCode = prime * hashCode + ((getConsumedStatefulRuleCapacity() == null) ? 0 : getConsumedStatefulRuleCapacity().hashCode());
        hashCode = prime * hashCode + ((getNumberOfAssociations() == null) ? 0 : getNumberOfAssociations().hashCode());
        hashCode = prime * hashCode + ((getEncryptionConfiguration() == null) ? 0 : getEncryptionConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public FirewallPolicyResponse clone() {
        try {
            return (FirewallPolicyResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.FirewallPolicyResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
