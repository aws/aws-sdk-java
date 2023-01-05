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
 * The data path options for the pivot table field options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableDataPathOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableDataPathOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of data path values for the data path options.
     * </p>
     */
    private java.util.List<DataPathValue> dataPathList;
    /**
     * <p>
     * The width of the data path option.
     * </p>
     */
    private String width;

    /**
     * <p>
     * The list of data path values for the data path options.
     * </p>
     * 
     * @return The list of data path values for the data path options.
     */

    public java.util.List<DataPathValue> getDataPathList() {
        return dataPathList;
    }

    /**
     * <p>
     * The list of data path values for the data path options.
     * </p>
     * 
     * @param dataPathList
     *        The list of data path values for the data path options.
     */

    public void setDataPathList(java.util.Collection<DataPathValue> dataPathList) {
        if (dataPathList == null) {
            this.dataPathList = null;
            return;
        }

        this.dataPathList = new java.util.ArrayList<DataPathValue>(dataPathList);
    }

    /**
     * <p>
     * The list of data path values for the data path options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataPathList(java.util.Collection)} or {@link #withDataPathList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataPathList
     *        The list of data path values for the data path options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableDataPathOption withDataPathList(DataPathValue... dataPathList) {
        if (this.dataPathList == null) {
            setDataPathList(new java.util.ArrayList<DataPathValue>(dataPathList.length));
        }
        for (DataPathValue ele : dataPathList) {
            this.dataPathList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data path values for the data path options.
     * </p>
     * 
     * @param dataPathList
     *        The list of data path values for the data path options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableDataPathOption withDataPathList(java.util.Collection<DataPathValue> dataPathList) {
        setDataPathList(dataPathList);
        return this;
    }

    /**
     * <p>
     * The width of the data path option.
     * </p>
     * 
     * @param width
     *        The width of the data path option.
     */

    public void setWidth(String width) {
        this.width = width;
    }

    /**
     * <p>
     * The width of the data path option.
     * </p>
     * 
     * @return The width of the data path option.
     */

    public String getWidth() {
        return this.width;
    }

    /**
     * <p>
     * The width of the data path option.
     * </p>
     * 
     * @param width
     *        The width of the data path option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableDataPathOption withWidth(String width) {
        setWidth(width);
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
        if (getDataPathList() != null)
            sb.append("DataPathList: ").append(getDataPathList()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableDataPathOption == false)
            return false;
        PivotTableDataPathOption other = (PivotTableDataPathOption) obj;
        if (other.getDataPathList() == null ^ this.getDataPathList() == null)
            return false;
        if (other.getDataPathList() != null && other.getDataPathList().equals(this.getDataPathList()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataPathList() == null) ? 0 : getDataPathList().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableDataPathOption clone() {
        try {
            return (PivotTableDataPathOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableDataPathOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
