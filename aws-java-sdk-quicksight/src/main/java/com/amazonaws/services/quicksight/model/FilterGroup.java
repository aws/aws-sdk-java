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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A grouping of individual filters. Filter groups are applied to the same group of visuals.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/quicksight/latest/user/add-a-compound-filter.html">Adding filter conditions (group
 * filters) with AND and OR operators</a> in the <i>Amazon QuickSight User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FilterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilterGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     * </p>
     */
    private String filterGroupId;
    /**
     * <p>
     * The list of filters that are present in a <code>FilterGroup</code>.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * The configuration that specifies what scope to apply to a <code>FilterGroup</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     */
    private FilterScopeConfiguration scopeConfiguration;
    /**
     * <p>
     * The status of the <code>FilterGroup</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The filter new feature which can apply filter group to all data sets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_DATASETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_DATASET</code>
     * </p>
     * </li>
     * </ul>
     */
    private String crossDataset;

    /**
     * <p>
     * The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     * </p>
     * 
     * @param filterGroupId
     *        The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     */

    public void setFilterGroupId(String filterGroupId) {
        this.filterGroupId = filterGroupId;
    }

    /**
     * <p>
     * The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     * </p>
     * 
     * @return The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     */

    public String getFilterGroupId() {
        return this.filterGroupId;
    }

    /**
     * <p>
     * The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     * </p>
     * 
     * @param filterGroupId
     *        The value that uniquely identifies a <code>FilterGroup</code> within a dashboard, template, or analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterGroup withFilterGroupId(String filterGroupId) {
        setFilterGroupId(filterGroupId);
        return this;
    }

    /**
     * <p>
     * The list of filters that are present in a <code>FilterGroup</code>.
     * </p>
     * 
     * @return The list of filters that are present in a <code>FilterGroup</code>.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The list of filters that are present in a <code>FilterGroup</code>.
     * </p>
     * 
     * @param filters
     *        The list of filters that are present in a <code>FilterGroup</code>.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * The list of filters that are present in a <code>FilterGroup</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The list of filters that are present in a <code>FilterGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterGroup withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of filters that are present in a <code>FilterGroup</code>.
     * </p>
     * 
     * @param filters
     *        The list of filters that are present in a <code>FilterGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterGroup withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The configuration that specifies what scope to apply to a <code>FilterGroup</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @param scopeConfiguration
     *        The configuration that specifies what scope to apply to a <code>FilterGroup</code>.</p>
     *        <p>
     *        This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     */

    public void setScopeConfiguration(FilterScopeConfiguration scopeConfiguration) {
        this.scopeConfiguration = scopeConfiguration;
    }

    /**
     * <p>
     * The configuration that specifies what scope to apply to a <code>FilterGroup</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @return The configuration that specifies what scope to apply to a <code>FilterGroup</code>.</p>
     *         <p>
     *         This is a union type structure. For this structure to be valid, only one of the attributes can be
     *         defined.
     */

    public FilterScopeConfiguration getScopeConfiguration() {
        return this.scopeConfiguration;
    }

    /**
     * <p>
     * The configuration that specifies what scope to apply to a <code>FilterGroup</code>.
     * </p>
     * <p>
     * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * </p>
     * 
     * @param scopeConfiguration
     *        The configuration that specifies what scope to apply to a <code>FilterGroup</code>.</p>
     *        <p>
     *        This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilterGroup withScopeConfiguration(FilterScopeConfiguration scopeConfiguration) {
        setScopeConfiguration(scopeConfiguration);
        return this;
    }

    /**
     * <p>
     * The status of the <code>FilterGroup</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>FilterGroup</code>.
     * @see WidgetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the <code>FilterGroup</code>.
     * </p>
     * 
     * @return The status of the <code>FilterGroup</code>.
     * @see WidgetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the <code>FilterGroup</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>FilterGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public FilterGroup withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the <code>FilterGroup</code>.
     * </p>
     * 
     * @param status
     *        The status of the <code>FilterGroup</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WidgetStatus
     */

    public FilterGroup withStatus(WidgetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The filter new feature which can apply filter group to all data sets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_DATASETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_DATASET</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param crossDataset
     *        The filter new feature which can apply filter group to all data sets. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_DATASETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_DATASET</code>
     *        </p>
     *        </li>
     * @see CrossDatasetTypes
     */

    public void setCrossDataset(String crossDataset) {
        this.crossDataset = crossDataset;
    }

    /**
     * <p>
     * The filter new feature which can apply filter group to all data sets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_DATASETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_DATASET</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The filter new feature which can apply filter group to all data sets. Choose one of the following
     *         options:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL_DATASETS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SINGLE_DATASET</code>
     *         </p>
     *         </li>
     * @see CrossDatasetTypes
     */

    public String getCrossDataset() {
        return this.crossDataset;
    }

    /**
     * <p>
     * The filter new feature which can apply filter group to all data sets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_DATASETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_DATASET</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param crossDataset
     *        The filter new feature which can apply filter group to all data sets. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_DATASETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_DATASET</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrossDatasetTypes
     */

    public FilterGroup withCrossDataset(String crossDataset) {
        setCrossDataset(crossDataset);
        return this;
    }

    /**
     * <p>
     * The filter new feature which can apply filter group to all data sets. Choose one of the following options:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL_DATASETS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SINGLE_DATASET</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param crossDataset
     *        The filter new feature which can apply filter group to all data sets. Choose one of the following
     *        options:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL_DATASETS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SINGLE_DATASET</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CrossDatasetTypes
     */

    public FilterGroup withCrossDataset(CrossDatasetTypes crossDataset) {
        this.crossDataset = crossDataset.toString();
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
        if (getFilterGroupId() != null)
            sb.append("FilterGroupId: ").append(getFilterGroupId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getScopeConfiguration() != null)
            sb.append("ScopeConfiguration: ").append(getScopeConfiguration()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCrossDataset() != null)
            sb.append("CrossDataset: ").append(getCrossDataset());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilterGroup == false)
            return false;
        FilterGroup other = (FilterGroup) obj;
        if (other.getFilterGroupId() == null ^ this.getFilterGroupId() == null)
            return false;
        if (other.getFilterGroupId() != null && other.getFilterGroupId().equals(this.getFilterGroupId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getScopeConfiguration() == null ^ this.getScopeConfiguration() == null)
            return false;
        if (other.getScopeConfiguration() != null && other.getScopeConfiguration().equals(this.getScopeConfiguration()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCrossDataset() == null ^ this.getCrossDataset() == null)
            return false;
        if (other.getCrossDataset() != null && other.getCrossDataset().equals(this.getCrossDataset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterGroupId() == null) ? 0 : getFilterGroupId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getScopeConfiguration() == null) ? 0 : getScopeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCrossDataset() == null) ? 0 : getCrossDataset().hashCode());
        return hashCode;
    }

    @Override
    public FilterGroup clone() {
        try {
            return (FilterGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FilterGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
