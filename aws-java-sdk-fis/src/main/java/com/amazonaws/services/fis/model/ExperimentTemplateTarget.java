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
 * Describes a target for an experiment template.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fis-2020-12-01/ExperimentTemplateTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExperimentTemplateTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the targets.
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
    private java.util.List<ExperimentTemplateTargetFilter> filters;
    /**
     * <p>
     * Scopes the identified resources to a specific count or percentage.
     * </p>
     */
    private String selectionMode;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTarget withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the targets.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of the targets.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of the targets.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the targets.
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
     * The Amazon Resource Names (ARNs) of the targets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTarget withResourceArns(String... resourceArns) {
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
     * The Amazon Resource Names (ARNs) of the targets.
     * </p>
     * 
     * @param resourceArns
     *        The Amazon Resource Names (ARNs) of the targets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTarget withResourceArns(java.util.Collection<String> resourceArns) {
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

    public ExperimentTemplateTarget withResourceTags(java.util.Map<String, String> resourceTags) {
        setResourceTags(resourceTags);
        return this;
    }

    /**
     * Add a single ResourceTags entry
     *
     * @see ExperimentTemplateTarget#withResourceTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTarget addResourceTagsEntry(String key, String value) {
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

    public ExperimentTemplateTarget clearResourceTagsEntries() {
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

    public java.util.List<ExperimentTemplateTargetFilter> getFilters() {
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

    public void setFilters(java.util.Collection<ExperimentTemplateTargetFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ExperimentTemplateTargetFilter>(filters);
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

    public ExperimentTemplateTarget withFilters(ExperimentTemplateTargetFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ExperimentTemplateTargetFilter>(filters.length));
        }
        for (ExperimentTemplateTargetFilter ele : filters) {
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

    public ExperimentTemplateTarget withFilters(java.util.Collection<ExperimentTemplateTargetFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count or percentage.
     * </p>
     * 
     * @param selectionMode
     *        Scopes the identified resources to a specific count or percentage.
     */

    public void setSelectionMode(String selectionMode) {
        this.selectionMode = selectionMode;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count or percentage.
     * </p>
     * 
     * @return Scopes the identified resources to a specific count or percentage.
     */

    public String getSelectionMode() {
        return this.selectionMode;
    }

    /**
     * <p>
     * Scopes the identified resources to a specific count or percentage.
     * </p>
     * 
     * @param selectionMode
     *        Scopes the identified resources to a specific count or percentage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExperimentTemplateTarget withSelectionMode(String selectionMode) {
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

        if (obj instanceof ExperimentTemplateTarget == false)
            return false;
        ExperimentTemplateTarget other = (ExperimentTemplateTarget) obj;
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
    public ExperimentTemplateTarget clone() {
        try {
            return (ExperimentTemplateTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fis.model.transform.ExperimentTemplateTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
