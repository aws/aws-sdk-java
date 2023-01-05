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
 * The dimension filter, containing DimensionName and DimensionValueList.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DimensionFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dimension to filter on.
     * </p>
     */
    private String dimensionName;
    /**
     * <p>
     * The list of values for the dimension specified in DimensionName that you want to filter on.
     * </p>
     */
    private java.util.List<String> dimensionValueList;

    /**
     * <p>
     * The name of the dimension to filter on.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension to filter on.
     */

    public void setDimensionName(String dimensionName) {
        this.dimensionName = dimensionName;
    }

    /**
     * <p>
     * The name of the dimension to filter on.
     * </p>
     * 
     * @return The name of the dimension to filter on.
     */

    public String getDimensionName() {
        return this.dimensionName;
    }

    /**
     * <p>
     * The name of the dimension to filter on.
     * </p>
     * 
     * @param dimensionName
     *        The name of the dimension to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionFilter withDimensionName(String dimensionName) {
        setDimensionName(dimensionName);
        return this;
    }

    /**
     * <p>
     * The list of values for the dimension specified in DimensionName that you want to filter on.
     * </p>
     * 
     * @return The list of values for the dimension specified in DimensionName that you want to filter on.
     */

    public java.util.List<String> getDimensionValueList() {
        return dimensionValueList;
    }

    /**
     * <p>
     * The list of values for the dimension specified in DimensionName that you want to filter on.
     * </p>
     * 
     * @param dimensionValueList
     *        The list of values for the dimension specified in DimensionName that you want to filter on.
     */

    public void setDimensionValueList(java.util.Collection<String> dimensionValueList) {
        if (dimensionValueList == null) {
            this.dimensionValueList = null;
            return;
        }

        this.dimensionValueList = new java.util.ArrayList<String>(dimensionValueList);
    }

    /**
     * <p>
     * The list of values for the dimension specified in DimensionName that you want to filter on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensionValueList(java.util.Collection)} or {@link #withDimensionValueList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param dimensionValueList
     *        The list of values for the dimension specified in DimensionName that you want to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionFilter withDimensionValueList(String... dimensionValueList) {
        if (this.dimensionValueList == null) {
            setDimensionValueList(new java.util.ArrayList<String>(dimensionValueList.length));
        }
        for (String ele : dimensionValueList) {
            this.dimensionValueList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of values for the dimension specified in DimensionName that you want to filter on.
     * </p>
     * 
     * @param dimensionValueList
     *        The list of values for the dimension specified in DimensionName that you want to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionFilter withDimensionValueList(java.util.Collection<String> dimensionValueList) {
        setDimensionValueList(dimensionValueList);
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
        if (getDimensionValueList() != null)
            sb.append("DimensionValueList: ").append(getDimensionValueList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionFilter == false)
            return false;
        DimensionFilter other = (DimensionFilter) obj;
        if (other.getDimensionName() == null ^ this.getDimensionName() == null)
            return false;
        if (other.getDimensionName() != null && other.getDimensionName().equals(this.getDimensionName()) == false)
            return false;
        if (other.getDimensionValueList() == null ^ this.getDimensionValueList() == null)
            return false;
        if (other.getDimensionValueList() != null && other.getDimensionValueList().equals(this.getDimensionValueList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDimensionName() == null) ? 0 : getDimensionName().hashCode());
        hashCode = prime * hashCode + ((getDimensionValueList() == null) ? 0 : getDimensionValueList().hashCode());
        return hashCode;
    }

    @Override
    public DimensionFilter clone() {
        try {
            return (DimensionFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutmetrics.model.transform.DimensionFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
