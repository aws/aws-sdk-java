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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a filter for choosing a subset of dimension values. Each filter consists of the dimension that you want to
 * include and the condition statement. The condition statement is specified in the <code>FilterOperation</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/Filter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Filter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The value that you want to include in the filter.
     * </p>
     */
    private String dimensionValue;
    /**
     * <p>
     * The condition to apply.
     * </p>
     */
    private String filterOperation;

    /**
     * <p>
     * The value that you want to include in the filter.
     * </p>
     * 
     * @param dimensionValue
     *        The value that you want to include in the filter.
     */

    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    /**
     * <p>
     * The value that you want to include in the filter.
     * </p>
     * 
     * @return The value that you want to include in the filter.
     */

    public String getDimensionValue() {
        return this.dimensionValue;
    }

    /**
     * <p>
     * The value that you want to include in the filter.
     * </p>
     * 
     * @param dimensionValue
     *        The value that you want to include in the filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Filter withDimensionValue(String dimensionValue) {
        setDimensionValue(dimensionValue);
        return this;
    }

    /**
     * <p>
     * The condition to apply.
     * </p>
     * 
     * @param filterOperation
     *        The condition to apply.
     * @see FilterOperation
     */

    public void setFilterOperation(String filterOperation) {
        this.filterOperation = filterOperation;
    }

    /**
     * <p>
     * The condition to apply.
     * </p>
     * 
     * @return The condition to apply.
     * @see FilterOperation
     */

    public String getFilterOperation() {
        return this.filterOperation;
    }

    /**
     * <p>
     * The condition to apply.
     * </p>
     * 
     * @param filterOperation
     *        The condition to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperation
     */

    public Filter withFilterOperation(String filterOperation) {
        setFilterOperation(filterOperation);
        return this;
    }

    /**
     * <p>
     * The condition to apply.
     * </p>
     * 
     * @param filterOperation
     *        The condition to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperation
     */

    public Filter withFilterOperation(FilterOperation filterOperation) {
        this.filterOperation = filterOperation.toString();
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
        if (getDimensionValue() != null)
            sb.append("DimensionValue: ").append(getDimensionValue()).append(",");
        if (getFilterOperation() != null)
            sb.append("FilterOperation: ").append(getFilterOperation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getDimensionValue() == null ^ this.getDimensionValue() == null)
            return false;
        if (other.getDimensionValue() != null && other.getDimensionValue().equals(this.getDimensionValue()) == false)
            return false;
        if (other.getFilterOperation() == null ^ this.getFilterOperation() == null)
            return false;
        if (other.getFilterOperation() != null && other.getFilterOperation().equals(this.getFilterOperation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionValue() == null) ? 0 : getDimensionValue().hashCode());
        hashCode = prime * hashCode + ((getFilterOperation() == null) ? 0 : getFilterOperation().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.FilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
