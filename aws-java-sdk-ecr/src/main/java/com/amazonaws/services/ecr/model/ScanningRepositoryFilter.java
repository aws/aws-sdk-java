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
package com.amazonaws.services.ecr.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a scanning repository filter. For more information on how to use filters, see <a
 * href="https://docs.aws.amazon.com/AmazonECR/latest/userguide/image-scanning.html#image-scanning-filters">Using
 * filters</a> in the <i>Amazon Elastic Container Registry User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecr-2015-09-21/ScanningRepositoryFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScanningRepositoryFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The filter to use when scanning.
     * </p>
     */
    private String filter;
    /**
     * <p>
     * The type associated with the filter.
     * </p>
     */
    private String filterType;

    /**
     * <p>
     * The filter to use when scanning.
     * </p>
     * 
     * @param filter
     *        The filter to use when scanning.
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * The filter to use when scanning.
     * </p>
     * 
     * @return The filter to use when scanning.
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * The filter to use when scanning.
     * </p>
     * 
     * @param filter
     *        The filter to use when scanning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScanningRepositoryFilter withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The type associated with the filter.
     * </p>
     * 
     * @param filterType
     *        The type associated with the filter.
     * @see ScanningRepositoryFilterType
     */

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    /**
     * <p>
     * The type associated with the filter.
     * </p>
     * 
     * @return The type associated with the filter.
     * @see ScanningRepositoryFilterType
     */

    public String getFilterType() {
        return this.filterType;
    }

    /**
     * <p>
     * The type associated with the filter.
     * </p>
     * 
     * @param filterType
     *        The type associated with the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanningRepositoryFilterType
     */

    public ScanningRepositoryFilter withFilterType(String filterType) {
        setFilterType(filterType);
        return this;
    }

    /**
     * <p>
     * The type associated with the filter.
     * </p>
     * 
     * @param filterType
     *        The type associated with the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanningRepositoryFilterType
     */

    public ScanningRepositoryFilter withFilterType(ScanningRepositoryFilterType filterType) {
        this.filterType = filterType.toString();
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getFilterType() != null)
            sb.append("FilterType: ").append(getFilterType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScanningRepositoryFilter == false)
            return false;
        ScanningRepositoryFilter other = (ScanningRepositoryFilter) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getFilterType() == null ^ this.getFilterType() == null)
            return false;
        if (other.getFilterType() != null && other.getFilterType().equals(this.getFilterType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getFilterType() == null) ? 0 : getFilterType().hashCode());
        return hashCode;
    }

    @Override
    public ScanningRepositoryFilter clone() {
        try {
            return (ScanningRepositoryFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecr.model.transform.ScanningRepositoryFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
