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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about dimensions within a dimension group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DimensionGroupDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DimensionGroupDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the dimension group.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The dimensions within a dimension group.
     * </p>
     */
    private java.util.List<DimensionDetail> dimensions;

    /**
     * <p>
     * The name of the dimension group.
     * </p>
     * 
     * @param group
     *        The name of the dimension group.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the dimension group.
     * </p>
     * 
     * @return The name of the dimension group.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the dimension group.
     * </p>
     * 
     * @param group
     *        The name of the dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroupDetail withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The dimensions within a dimension group.
     * </p>
     * 
     * @return The dimensions within a dimension group.
     */

    public java.util.List<DimensionDetail> getDimensions() {
        return dimensions;
    }

    /**
     * <p>
     * The dimensions within a dimension group.
     * </p>
     * 
     * @param dimensions
     *        The dimensions within a dimension group.
     */

    public void setDimensions(java.util.Collection<DimensionDetail> dimensions) {
        if (dimensions == null) {
            this.dimensions = null;
            return;
        }

        this.dimensions = new java.util.ArrayList<DimensionDetail>(dimensions);
    }

    /**
     * <p>
     * The dimensions within a dimension group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDimensions(java.util.Collection)} or {@link #withDimensions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dimensions
     *        The dimensions within a dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroupDetail withDimensions(DimensionDetail... dimensions) {
        if (this.dimensions == null) {
            setDimensions(new java.util.ArrayList<DimensionDetail>(dimensions.length));
        }
        for (DimensionDetail ele : dimensions) {
            this.dimensions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dimensions within a dimension group.
     * </p>
     * 
     * @param dimensions
     *        The dimensions within a dimension group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DimensionGroupDetail withDimensions(java.util.Collection<DimensionDetail> dimensions) {
        setDimensions(dimensions);
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
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getDimensions() != null)
            sb.append("Dimensions: ").append(getDimensions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DimensionGroupDetail == false)
            return false;
        DimensionGroupDetail other = (DimensionGroupDetail) obj;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getDimensions() == null ^ this.getDimensions() == null)
            return false;
        if (other.getDimensions() != null && other.getDimensions().equals(this.getDimensions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getDimensions() == null) ? 0 : getDimensions().hashCode());
        return hashCode;
    }

    @Override
    public DimensionGroupDetail clone() {
        try {
            return (DimensionGroupDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.DimensionGroupDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
