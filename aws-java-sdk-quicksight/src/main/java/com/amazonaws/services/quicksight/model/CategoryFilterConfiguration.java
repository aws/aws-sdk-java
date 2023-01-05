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
 * The configuration for a <code>CategoryFilter</code>.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/CategoryFilterConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CategoryFilterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter list.
     * </p>
     */
    private FilterListConfiguration filterListConfiguration;
    /**
     * <p>
     * A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom filter
     * list.
     * </p>
     */
    private CustomFilterListConfiguration customFilterListConfiguration;
    /**
     * <p>
     * A custom filter that filters based on a single value. This filter can be partially matched.
     * </p>
     */
    private CustomFilterConfiguration customFilterConfiguration;

    /**
     * <p>
     * A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter list.
     * </p>
     * 
     * @param filterListConfiguration
     *        A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter
     *        list.
     */

    public void setFilterListConfiguration(FilterListConfiguration filterListConfiguration) {
        this.filterListConfiguration = filterListConfiguration;
    }

    /**
     * <p>
     * A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter list.
     * </p>
     * 
     * @return A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter
     *         list.
     */

    public FilterListConfiguration getFilterListConfiguration() {
        return this.filterListConfiguration;
    }

    /**
     * <p>
     * A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter list.
     * </p>
     * 
     * @param filterListConfiguration
     *        A list of filter configurations. In the Amazon QuickSight console, this filter type is called a filter
     *        list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryFilterConfiguration withFilterListConfiguration(FilterListConfiguration filterListConfiguration) {
        setFilterListConfiguration(filterListConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom filter
     * list.
     * </p>
     * 
     * @param customFilterListConfiguration
     *        A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom
     *        filter list.
     */

    public void setCustomFilterListConfiguration(CustomFilterListConfiguration customFilterListConfiguration) {
        this.customFilterListConfiguration = customFilterListConfiguration;
    }

    /**
     * <p>
     * A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom filter
     * list.
     * </p>
     * 
     * @return A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom
     *         filter list.
     */

    public CustomFilterListConfiguration getCustomFilterListConfiguration() {
        return this.customFilterListConfiguration;
    }

    /**
     * <p>
     * A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom filter
     * list.
     * </p>
     * 
     * @param customFilterListConfiguration
     *        A list of custom filter values. In the Amazon QuickSight console, this filter type is called a custom
     *        filter list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryFilterConfiguration withCustomFilterListConfiguration(CustomFilterListConfiguration customFilterListConfiguration) {
        setCustomFilterListConfiguration(customFilterListConfiguration);
        return this;
    }

    /**
     * <p>
     * A custom filter that filters based on a single value. This filter can be partially matched.
     * </p>
     * 
     * @param customFilterConfiguration
     *        A custom filter that filters based on a single value. This filter can be partially matched.
     */

    public void setCustomFilterConfiguration(CustomFilterConfiguration customFilterConfiguration) {
        this.customFilterConfiguration = customFilterConfiguration;
    }

    /**
     * <p>
     * A custom filter that filters based on a single value. This filter can be partially matched.
     * </p>
     * 
     * @return A custom filter that filters based on a single value. This filter can be partially matched.
     */

    public CustomFilterConfiguration getCustomFilterConfiguration() {
        return this.customFilterConfiguration;
    }

    /**
     * <p>
     * A custom filter that filters based on a single value. This filter can be partially matched.
     * </p>
     * 
     * @param customFilterConfiguration
     *        A custom filter that filters based on a single value. This filter can be partially matched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CategoryFilterConfiguration withCustomFilterConfiguration(CustomFilterConfiguration customFilterConfiguration) {
        setCustomFilterConfiguration(customFilterConfiguration);
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
        if (getFilterListConfiguration() != null)
            sb.append("FilterListConfiguration: ").append(getFilterListConfiguration()).append(",");
        if (getCustomFilterListConfiguration() != null)
            sb.append("CustomFilterListConfiguration: ").append(getCustomFilterListConfiguration()).append(",");
        if (getCustomFilterConfiguration() != null)
            sb.append("CustomFilterConfiguration: ").append(getCustomFilterConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CategoryFilterConfiguration == false)
            return false;
        CategoryFilterConfiguration other = (CategoryFilterConfiguration) obj;
        if (other.getFilterListConfiguration() == null ^ this.getFilterListConfiguration() == null)
            return false;
        if (other.getFilterListConfiguration() != null && other.getFilterListConfiguration().equals(this.getFilterListConfiguration()) == false)
            return false;
        if (other.getCustomFilterListConfiguration() == null ^ this.getCustomFilterListConfiguration() == null)
            return false;
        if (other.getCustomFilterListConfiguration() != null
                && other.getCustomFilterListConfiguration().equals(this.getCustomFilterListConfiguration()) == false)
            return false;
        if (other.getCustomFilterConfiguration() == null ^ this.getCustomFilterConfiguration() == null)
            return false;
        if (other.getCustomFilterConfiguration() != null && other.getCustomFilterConfiguration().equals(this.getCustomFilterConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilterListConfiguration() == null) ? 0 : getFilterListConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomFilterListConfiguration() == null) ? 0 : getCustomFilterListConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomFilterConfiguration() == null) ? 0 : getCustomFilterConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CategoryFilterConfiguration clone() {
        try {
            return (CategoryFilterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.CategoryFilterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
