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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A dimension name and value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DimensionNameValue" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionNameValue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dimension.
     * </p>
     */
    private String dimensionName;
    /**
     * <p>
     * The value of the dimension.
     * </p>
     */
    private String dimensionValue;

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension.
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @return The name of the dimension.
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * The name of the dimension.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionNameValue withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @param dimensionValue
     *        The value of the dimension.
     */

    public void setDimensionValue(String dimensionValue) {
        this.dimensionValue = dimensionValue;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @return The value of the dimension.
     */

    public String getDimensionValue() {
        return this.dimensionValue;
    }

    /**
     * <p>
     * The value of the dimension.
     * </p>
     * 
     * @param dimensionValue
     *        The value of the dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionNameValue withDimensionValue(String dimensionValue) {
        setDimensionValue(dimensionValue);
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
        if (getDimensionName() != null)
            sb.append("DimensionName: ").append(getDimensionName()).append(",");
        if (getDimensionValue() != null)
            sb.append("DimensionValue: ").append(getDimensionValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionNameValue == false)
            return false;
        DimensionNameValue other = (DimensionNameValue) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionValue() == null ^ this.getDimensionValue() == null)
            return false;
        if (other.getDimensionValue() != null && other.getDimensionValue().equals(this.getDimensionValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getDimensionValue() == null) ? 0 : getDimensionValue().hashCode());
        return hashCode;
    }

    @Override
    public DimensionNameValue clone() {
        try {
            return (DimensionNameValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DimensionNameValueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
