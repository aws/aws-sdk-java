/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fis.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a target for an experiment. You must specify at least one Amazon Resource Name (ARN) or at least one
 * resource tag. You cannot specify both ARNs and tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/CreateExperimentTemplateTargetInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentTemplateTargetInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS resource type. The resource type must be supported for the specified action.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * The tags for the target resources.
     * </p>
     */
    private java.util.Map<String, String> resourceTags;
    /**
     * <p>
     * The filters to apply to identify target resources using specific attributes.
     * </p>
     */
    private java.util.List<ExperimentTemplateTargetInputFilter> filters;
    /**
     * <p>
     * Scopes the identified resources to a specific count of the resources at random, or a percentage of the resources.
     * All identified resources are included in the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ALL - Run the action on all identified targets. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at random. For
     * example, COUNT(1) selects one of the targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at random.
     * For example, PERCENT(25) selects 25% of the targets.
     * </p>
     * </li>
     * </ul>
     */
    private String selectionMode;

    /**
     * <p>
     * The AWS resource type. The resource type must be supported for the specified action.
     * </p>
     * 
     * @param resourceType
     *        The AWS resource type. The resource type must be supported for the specified action.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The AWS resource type. The resource type must be supported for the specified action.
     * </p>
     * 
     * @return The AWS resource type. The resource type must be supported for the specified action.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The AWS resource type. The resource type must be supported for the specified action.
     * </p>
     * 
     * @param resourceType
     *        The AWS resource type. The resource type must be supported for the specified action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the resources.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the resources.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * The tags for the target resources.
     * </p>
     * 
     * @return The tags for the target resources.
     */

    public java.util.Map<String, String> getResourceTags() {
        return resourceTags;
    }

    /**
     * <p>
     * The tags for the target resources.
     * </p>
     * 
     * @param resourceTags
     *        The tags for the target resources.
     */

    public void setResourceTags(java.util.Map<String, String> resourceTags) {
        this.resourceTags = resourceTags;
    }

    /**
     * <p>
     * The tags for the target resources.
     * </p>
     * 
     * @param resourceTags
     *        The tags for the target resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withResourceTags(java.util.Map<String, String> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * Add a single ResourceTags entry
     *
     * @see CreateExperimentTemplateTargetInput#withResourceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput addResourceTagsEntry(String key, String value) {
        if (null == this.resourceTags) {
            this.resourceTags = new java.util.HashMap<String, String>();
        }
        if (this.resourceTags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.resourceTags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ResourceTags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput clearResourceTagsEntries() {
        this.resourceTags = null;
        return this;
    }

    /**
     * <p>
     * The filters to apply to identify target resources using specific attributes.
     * </p>
     * 
     * @return The filters to apply to identify target resources using specific attributes.
     */

    public java.util.List<ExperimentTemplateTargetInputFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filters to apply to identify target resources using specific attributes.
     * </p>
     * 
     * @param filters
     *        The filters to apply to identify target resources using specific attributes.
     */

    public void setFilters(java.util.Collection<ExperimentTemplateTargetInputFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ExperimentTemplateTargetInputFilter>(filters);
    }

    /**
     * <p>
     * The filters to apply to identify target resources using specific attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The filters to apply to identify target resources using specific attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withFilters(ExperimentTemplateTargetInputFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ExperimentTemplateTargetInputFilter>(filters.length));
        }
        for (ExperimentTemplateTargetInputFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters to apply to identify target resources using specific attributes.
     * </p>
     * 
     * @param filters
     *        The filters to apply to identify target resources using specific attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withFilters(java.util.Collection<ExperimentTemplateTargetInputFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count of the resources at random, or a percentage of the resources.
     * All identified resources are included in the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ALL - Run the action on all identified targets. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at random. For
     * example, COUNT(1) selects one of the targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at random.
     * For example, PERCENT(25) selects 25% of the targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectionMode
     *        Scopes the identified resources to a specific count of the resources at random, or a percentage of the
     *        resources. All identified resources are included in the target.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ALL - Run the action on all identified targets. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at
     *        random. For example, COUNT(1) selects one of the targets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at
     *        random. For example, PERCENT(25) selects 25% of the targets.
     *        </p>
     *        </li>
     */

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count of the resources at random, or a percentage of the resources.
     * All identified resources are included in the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ALL - Run the action on all identified targets. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at random. For
     * example, COUNT(1) selects one of the targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at random.
     * For example, PERCENT(25) selects 25% of the targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Scopes the identified resources to a specific count of the resources at random, or a percentage of the
     *         resources. All identified resources are included in the target.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         ALL - Run the action on all identified targets. This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at
     *         random. For example, COUNT(1) selects one of the targets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at
     *         random. For example, PERCENT(25) selects 25% of the targets.
     *         </p>
     *         </li>
     */

    public String getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count of the resources at random, or a percentage of the resources.
     * All identified resources are included in the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * ALL - Run the action on all identified targets. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at random. For
     * example, COUNT(1) selects one of the targets.
     * </p>
     * </li>
     * <li>
     * <p>
     * PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at random.
     * For example, PERCENT(25) selects 25% of the targets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param selectionMode
     *        Scopes the identified resources to a specific count of the resources at random, or a percentage of the
     *        resources. All identified resources are included in the target.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        ALL - Run the action on all identified targets. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        COUNT(n) - Run the action on the specified number of targets, chosen from the identified targets at
     *        random. For example, COUNT(1) selects one of the targets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PERCENT(n) - Run the action on the specified percentage of targets, chosen from the identified targets at
     *        random. For example, PERCENT(25) selects 25% of the targets.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentTemplateTargetInput withSelectionMode(String selectionMode) {
        setSelectionMode(selectionMode);
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getResourceTags() != null)
            sb.append("ResourceTags: ").append(getResourceTags()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSelectionMode() != null)
            sb.append("SelectionMode: ").append(getSelectionMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExperimentTemplateTargetInput == false)
            return false;
        CreateExperimentTemplateTargetInput other = (CreateExperimentTemplateTargetInput) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourceTags() == null ^ this.getResourceTags() == null)
            return false;
        if (other.getResourceTags() != null && other.getResourceTags().equals(this.getResourceTags()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSelectionMode() == null ^ this.getSelectionMode() == null)
            return false;
        if (other.getSelectionMode() != null && other.getSelectionMode().equals(this.getSelectionMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getResourceTags() == null) ? 0 : getResourceTags().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSelectionMode() == null) ? 0 : getSelectionMode().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentTemplateTargetInput clone() {
        try {
            return (CreateExperimentTemplateTargetInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.CreateExperimentTemplateTargetInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
