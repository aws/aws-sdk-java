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
package com.amazonaws.services.shield.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Narrows the set of protection groups that the call retrieves. You can retrieve a single protection group by its name
 * and you can retrieve all protection groups that are configured with a specific pattern, aggregation, or resource
 * type. You can provide up to one criteria per filter type. Shield Advanced returns the protection groups that exactly
 * match all of the search criteria that you provide.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/InclusionProtectionGroupFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InclusionProtectionGroupFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the protection group that you want to retrieve.
     * </p>
     */
    private java.util.List<String> protectionGroupIds;
    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     */
    private java.util.List<String> patterns;
    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     */
    private java.util.List<String> resourceTypes;
    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     */
    private java.util.List<String> aggregations;

    /**
     * <p>
     * The ID of the protection group that you want to retrieve.
     * </p>
     * 
     * @return The ID of the protection group that you want to retrieve.
     */

    public java.util.List<String> getProtectionGroupIds() {
        return protectionGroupIds;
    }

    /**
     * <p>
     * The ID of the protection group that you want to retrieve.
     * </p>
     * 
     * @param protectionGroupIds
     *        The ID of the protection group that you want to retrieve.
     */

    public void setProtectionGroupIds(java.util.Collection<String> protectionGroupIds) {
        if (protectionGroupIds == null) {
            this.protectionGroupIds = null;
            return;
        }

        this.protectionGroupIds = new java.util.ArrayList<String>(protectionGroupIds);
    }

    /**
     * <p>
     * The ID of the protection group that you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtectionGroupIds(java.util.Collection)} or {@link #withProtectionGroupIds(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param protectionGroupIds
     *        The ID of the protection group that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionGroupFilters withProtectionGroupIds(String... protectionGroupIds) {
        if (this.protectionGroupIds == null) {
            setProtectionGroupIds(new java.util.ArrayList<String>(protectionGroupIds.length));
        }
        for (String ele : protectionGroupIds) {
            this.protectionGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The ID of the protection group that you want to retrieve.
     * </p>
     * 
     * @param protectionGroupIds
     *        The ID of the protection group that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InclusionProtectionGroupFilters withProtectionGroupIds(java.util.Collection<String> protectionGroupIds) {
        setProtectionGroupIds(protectionGroupIds);
        return this;
    }

    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     * 
     * @return The pattern specification of the protection groups that you want to retrieve.
     * @see ProtectionGroupPattern
     */

    public java.util.List<String> getPatterns() {
        return patterns;
    }

    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param patterns
     *        The pattern specification of the protection groups that you want to retrieve.
     * @see ProtectionGroupPattern
     */

    public void setPatterns(java.util.Collection<String> patterns) {
        if (patterns == null) {
            this.patterns = null;
            return;
        }

        this.patterns = new java.util.ArrayList<String>(patterns);
    }

    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPatterns(java.util.Collection)} or {@link #withPatterns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param patterns
     *        The pattern specification of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupPattern
     */

    public InclusionProtectionGroupFilters withPatterns(String... patterns) {
        if (this.patterns == null) {
            setPatterns(new java.util.ArrayList<String>(patterns.length));
        }
        for (String ele : patterns) {
            this.patterns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param patterns
     *        The pattern specification of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupPattern
     */

    public InclusionProtectionGroupFilters withPatterns(java.util.Collection<String> patterns) {
        setPatterns(patterns);
        return this;
    }

    /**
     * <p>
     * The pattern specification of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param patterns
     *        The pattern specification of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupPattern
     */

    public InclusionProtectionGroupFilters withPatterns(ProtectionGroupPattern... patterns) {
        java.util.ArrayList<String> patternsCopy = new java.util.ArrayList<String>(patterns.length);
        for (ProtectionGroupPattern value : patterns) {
            patternsCopy.add(value.toString());
        }
        if (getPatterns() == null) {
            setPatterns(patternsCopy);
        } else {
            getPatterns().addAll(patternsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     * 
     * @return The resource type configuration of the protection groups that you want to retrieve. In the protection
     *         group configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     *         <code>BY_RESOURCE_TYPE</code>.
     * @see ProtectedResourceType
     */

    public java.util.List<String> getResourceTypes() {
        return resourceTypes;
    }

    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type configuration of the protection groups that you want to retrieve. In the protection
     *        group configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     *        <code>BY_RESOURCE_TYPE</code>.
     * @see ProtectedResourceType
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new java.util.ArrayList<String>(resourceTypes);
    }

    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTypes(java.util.Collection)} or {@link #withResourceTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type configuration of the protection groups that you want to retrieve. In the protection
     *        group configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     *        <code>BY_RESOURCE_TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionGroupFilters withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new java.util.ArrayList<String>(resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type configuration of the protection groups that you want to retrieve. In the protection
     *        group configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     *        <code>BY_RESOURCE_TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionGroupFilters withResourceTypes(java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The resource type configuration of the protection groups that you want to retrieve. In the protection group
     * configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     * <code>BY_RESOURCE_TYPE</code>.
     * </p>
     * 
     * @param resourceTypes
     *        The resource type configuration of the protection groups that you want to retrieve. In the protection
     *        group configuration, you specify the resource type when you set the group's <code>Pattern</code> to
     *        <code>BY_RESOURCE_TYPE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectedResourceType
     */

    public InclusionProtectionGroupFilters withResourceTypes(ProtectedResourceType... resourceTypes) {
        java.util.ArrayList<String> resourceTypesCopy = new java.util.ArrayList<String>(resourceTypes.length);
        for (ProtectedResourceType value : resourceTypes) {
            resourceTypesCopy.add(value.toString());
        }
        if (getResourceTypes() == null) {
            setResourceTypes(resourceTypesCopy);
        } else {
            getResourceTypes().addAll(resourceTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     * 
     * @return The aggregation setting of the protection groups that you want to retrieve.
     * @see ProtectionGroupAggregation
     */

    public java.util.List<String> getAggregations() {
        return aggregations;
    }

    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param aggregations
     *        The aggregation setting of the protection groups that you want to retrieve.
     * @see ProtectionGroupAggregation
     */

    public void setAggregations(java.util.Collection<String> aggregations) {
        if (aggregations == null) {
            this.aggregations = null;
            return;
        }

        this.aggregations = new java.util.ArrayList<String>(aggregations);
    }

    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAggregations(java.util.Collection)} or {@link #withAggregations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param aggregations
     *        The aggregation setting of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupAggregation
     */

    public InclusionProtectionGroupFilters withAggregations(String... aggregations) {
        if (this.aggregations == null) {
            setAggregations(new java.util.ArrayList<String>(aggregations.length));
        }
        for (String ele : aggregations) {
            this.aggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param aggregations
     *        The aggregation setting of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupAggregation
     */

    public InclusionProtectionGroupFilters withAggregations(java.util.Collection<String> aggregations) {
        setAggregations(aggregations);
        return this;
    }

    /**
     * <p>
     * The aggregation setting of the protection groups that you want to retrieve.
     * </p>
     * 
     * @param aggregations
     *        The aggregation setting of the protection groups that you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionGroupAggregation
     */

    public InclusionProtectionGroupFilters withAggregations(ProtectionGroupAggregation... aggregations) {
        java.util.ArrayList<String> aggregationsCopy = new java.util.ArrayList<String>(aggregations.length);
        for (ProtectionGroupAggregation value : aggregations) {
            aggregationsCopy.add(value.toString());
        }
        if (getAggregations() == null) {
            setAggregations(aggregationsCopy);
        } else {
            getAggregations().addAll(aggregationsCopy);
        }
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
        if (getProtectionGroupIds() != null)
            sb.append("ProtectionGroupIds: ").append(getProtectionGroupIds()).append(",");
        if (getPatterns() != null)
            sb.append("Patterns: ").append(getPatterns()).append(",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: ").append(getResourceTypes()).append(",");
        if (getAggregations() != null)
            sb.append("Aggregations: ").append(getAggregations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InclusionProtectionGroupFilters == false)
            return false;
        InclusionProtectionGroupFilters other = (InclusionProtectionGroupFilters) obj;
        if (other.getProtectionGroupIds() == null ^ this.getProtectionGroupIds() == null)
            return false;
        if (other.getProtectionGroupIds() != null && other.getProtectionGroupIds().equals(this.getProtectionGroupIds()) == false)
            return false;
        if (other.getPatterns() == null ^ this.getPatterns() == null)
            return false;
        if (other.getPatterns() != null && other.getPatterns().equals(this.getPatterns()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getAggregations() == null ^ this.getAggregations() == null)
            return false;
        if (other.getAggregations() != null && other.getAggregations().equals(this.getAggregations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtectionGroupIds() == null) ? 0 : getProtectionGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPatterns() == null) ? 0 : getPatterns().hashCode());
        hashCode = prime * hashCode + ((getResourceTypes() == null) ? 0 : getResourceTypes().hashCode());
        hashCode = prime * hashCode + ((getAggregations() == null) ? 0 : getAggregations().hashCode());
        return hashCode;
    }

    @Override
    public InclusionProtectionGroupFilters clone() {
        try {
            return (InclusionProtectionGroupFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.shield.model.transform.InclusionProtectionGroupFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
