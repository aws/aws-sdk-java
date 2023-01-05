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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/LockRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LockRuleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The retention rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The resource type retained by the retention rule.
     * </p>
     */
    private String resourceType;

    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;
    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * resources.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about the retention rule lock configuration.
     * </p>
     */
    private LockConfiguration lockConfiguration;
    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String lockState;

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @return The unique ID of the retention rule.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @return The retention rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule.
     * </p>
     * 
     * @return The resource type retained by the retention rule.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type retained by the retention rule.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LockRuleResult withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type retained by the retention rule.
     * </p>
     * 
     * @param resourceType
     *        The resource type retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public LockRuleResult withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * @param retentionPeriod
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * @return
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * @param retentionPeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @return Information about the resource tags used to identify resources that are retained by the retention rule.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     */

    public void setResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        if (resourceTags == null) {
            this.resourceTags = null;
            return;
        }

        this.resourceTags = new java.util.ArrayList<ResourceTag>(resourceTags);
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withResourceTags(ResourceTag... resourceTags) {
        if (this.resourceTags == null) {
            setResourceTags(new java.util.ArrayList<ResourceTag>(resourceTags.length));
        }
        for (ResourceTag ele : resourceTags) {
            this.resourceTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the resource tags used to identify resources that are retained by the retention rule.
     * </p>
     * 
     * @param resourceTags
     *        Information about the resource tags used to identify resources that are retained by the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * resources.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        resources.
     * @see RuleStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * resources.
     * </p>
     * 
     * @return The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *         resources.
     * @see RuleStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * resources.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public LockRuleResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     * resources.
     * </p>
     * 
     * @param status
     *        The state of the retention rule. Only retention rules that are in the <code>available</code> state retain
     *        resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RuleStatus
     */

    public LockRuleResult withStatus(RuleStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about the retention rule lock configuration.
     * </p>
     * 
     * @param lockConfiguration
     *        Information about the retention rule lock configuration.
     */

    public void setLockConfiguration(LockConfiguration lockConfiguration) {
        this.lockConfiguration = lockConfiguration;
    }

    /**
     * <p>
     * Information about the retention rule lock configuration.
     * </p>
     * 
     * @return Information about the retention rule lock configuration.
     */

    public LockConfiguration getLockConfiguration() {
        return this.lockConfiguration;
    }

    /**
     * <p>
     * Information about the retention rule lock configuration.
     * </p>
     * 
     * @param lockConfiguration
     *        Information about the retention rule lock configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LockRuleResult withLockConfiguration(LockConfiguration lockConfiguration) {
        setLockConfiguration(lockConfiguration);
        return this;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @see LockState
     */

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lock state for the retention rule.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock
     *         delay period. The retention rule can be modified or deleted only after the unlock delay period has
     *         expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *         the required permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *         can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *         transition back to <code>null</code>.
     *         </p>
     *         </li>
     * @see LockState
     */

    public String getLockState() {
        return this.lockState;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public LockRuleResult withLockState(String lockState) {
        setLockState(lockState);
        return this;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public LockRuleResult withLockState(LockState lockState) {
        this.lockState = lockState.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLockConfiguration() != null)
            sb.append("LockConfiguration: ").append(getLockConfiguration()).append(",");
        if (getLockState() != null)
            sb.append("LockState: ").append(getLockState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LockRuleResult == false)
            return false;
        LockRuleResult other = (LockRuleResult) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLockConfiguration() == null ^ this.getLockConfiguration() == null)
            return false;
        if (other.getLockConfiguration() != null && other.getLockConfiguration().equals(this.getLockConfiguration()) == false)
            return false;
        if (other.getLockState() == null ^ this.getLockState() == null)
            return false;
        if (other.getLockState() != null && other.getLockState().equals(this.getLockState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLockConfiguration() == null) ? 0 : getLockConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLockState() == null) ? 0 : getLockState().hashCode());
        return hashCode;
    }

    @Override
    public LockRuleResult clone() {
        try {
            return (LockRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
