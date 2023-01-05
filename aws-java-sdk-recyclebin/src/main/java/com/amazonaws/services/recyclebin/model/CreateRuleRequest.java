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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/CreateRule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRuleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * The retention rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the tags to assign to the retention rule.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs
     * are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule.
     * For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of
     * the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the
     * specified tag key and value pairs, it is immediately deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any
     * resource tags specified. It retains all deleted resources of the specified resource type in the Region in which
     * the rule is created, even if the resources are not tagged.
     * </p>
     */
    private java.util.List<ResourceTag> resourceTags;
    /**
     * <p>
     * Information about the retention rule lock configuration.
     * </p>
     */
    private LockConfiguration lockConfiguration;

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @return Information about the retention period for which the retention rule is to retain resources.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
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

    public CreateRuleRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the tags to assign to the retention rule.
     * </p>
     * 
     * @return Information about the tags to assign to the retention rule.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Information about the tags to assign to the retention rule.
     * </p>
     * 
     * @param tags
     *        Information about the tags to assign to the retention rule.
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
     * Information about the tags to assign to the retention rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Information about the tags to assign to the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTags(Tag... tags) {
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
     * Information about the tags to assign to the retention rule.
     * </p>
     * 
     * @param tags
     *        Information about the tags to assign to the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs
     * are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and
     *        EBS-backed AMIs are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs
     * are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @return The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and
     *         EBS-backed AMIs are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain
     *         EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs
     * are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and
     *        EBS-backed AMIs are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateRuleRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and EBS-backed AMIs
     * are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain EBS-backed AMIs, specify
     * <code>EC2_IMAGE</code>.
     * </p>
     * 
     * @param resourceType
     *        The resource type to be retained by the retention rule. Currently, only Amazon EBS snapshots and
     *        EBS-backed AMIs are supported. To retain snapshots, specify <code>EBS_SNAPSHOT</code>. To retain
     *        EBS-backed AMIs, specify <code>EC2_IMAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateRuleRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule.
     * For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of
     * the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the
     * specified tag key and value pairs, it is immediately deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any
     * resource tags specified. It retains all deleted resources of the specified resource type in the Region in which
     * the rule is created, even if the resources are not tagged.
     * </p>
     * 
     * @return Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention
     *         rule. For tag-level retention rules, only deleted resources, of the specified resource type, that have
     *         one or more of the specified tag key and value pairs are retained. If a resource is deleted, but it does
     *         not have any of the specified tag key and value pairs, it is immediately deleted without being retained
     *         by the retention rule.</p>
     *         <p>
     *         You can add the same tag key and value pair to a maximum or five retention rules.
     *         </p>
     *         <p>
     *         To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have
     *         any resource tags specified. It retains all deleted resources of the specified resource type in the
     *         Region in which the rule is created, even if the resources are not tagged.
     */

    public java.util.List<ResourceTag> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule.
     * For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of
     * the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the
     * specified tag key and value pairs, it is immediately deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any
     * resource tags specified. It retains all deleted resources of the specified resource type in the Region in which
     * the rule is created, even if the resources are not tagged.
     * </p>
     * 
     * @param resourceTags
     *        Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention
     *        rule. For tag-level retention rules, only deleted resources, of the specified resource type, that have one
     *        or more of the specified tag key and value pairs are retained. If a resource is deleted, but it does not
     *        have any of the specified tag key and value pairs, it is immediately deleted without being retained by the
     *        retention rule.</p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
     *        </p>
     *        <p>
     *        To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have
     *        any resource tags specified. It retains all deleted resources of the specified resource type in the Region
     *        in which the rule is created, even if the resources are not tagged.
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
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule.
     * For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of
     * the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the
     * specified tag key and value pairs, it is immediately deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any
     * resource tags specified. It retains all deleted resources of the specified resource type in the Region in which
     * the rule is created, even if the resources are not tagged.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTags(java.util.Collection)} or {@link #withResourceTags(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceTags
     *        Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention
     *        rule. For tag-level retention rules, only deleted resources, of the specified resource type, that have one
     *        or more of the specified tag key and value pairs are retained. If a resource is deleted, but it does not
     *        have any of the specified tag key and value pairs, it is immediately deleted without being retained by the
     *        retention rule.</p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
     *        </p>
     *        <p>
     *        To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have
     *        any resource tags specified. It retains all deleted resources of the specified resource type in the Region
     *        in which the rule is created, even if the resources are not tagged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withResourceTags(ResourceTag... resourceTags) {
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
     * Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention rule.
     * For tag-level retention rules, only deleted resources, of the specified resource type, that have one or more of
     * the specified tag key and value pairs are retained. If a resource is deleted, but it does not have any of the
     * specified tag key and value pairs, it is immediately deleted without being retained by the retention rule.
     * </p>
     * <p>
     * You can add the same tag key and value pair to a maximum or five retention rules.
     * </p>
     * <p>
     * To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have any
     * resource tags specified. It retains all deleted resources of the specified resource type in the Region in which
     * the rule is created, even if the resources are not tagged.
     * </p>
     * 
     * @param resourceTags
     *        Specifies the resource tags to use to identify resources that are to be retained by a tag-level retention
     *        rule. For tag-level retention rules, only deleted resources, of the specified resource type, that have one
     *        or more of the specified tag key and value pairs are retained. If a resource is deleted, but it does not
     *        have any of the specified tag key and value pairs, it is immediately deleted without being retained by the
     *        retention rule.</p>
     *        <p>
     *        You can add the same tag key and value pair to a maximum or five retention rules.
     *        </p>
     *        <p>
     *        To create a Region-level retention rule, omit this parameter. A Region-level retention rule does not have
     *        any resource tags specified. It retains all deleted resources of the specified resource type in the Region
     *        in which the rule is created, even if the resources are not tagged.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRuleRequest withResourceTags(java.util.Collection<ResourceTag> resourceTags) {
        setResourceTags(resourceTags);
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

    public CreateRuleRequest withLockConfiguration(LockConfiguration lockConfiguration) {
        setLockConfiguration(lockConfiguration);
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
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getLockConfiguration() != null)
            sb.append("LockConfiguration: ").append(getLockConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRuleRequest == false)
            return false;
        CreateRuleRequest other = (CreateRuleRequest) obj;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getLockConfiguration() == null ^ this.getLockConfiguration() == null)
            return false;
        if (other.getLockConfiguration() != null && other.getLockConfiguration().equals(this.getLockConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getLockConfiguration() == null) ? 0 : getLockConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateRuleRequest clone() {
        return (CreateRuleRequest) super.clone();
    }

}
