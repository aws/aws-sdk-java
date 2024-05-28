/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Output column.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/OutputColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OutputColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The display name of the column..
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for a column.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The data type of the column.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The sub data type of the column.
     * </p>
     */
    private String subType;

    /**
     * <p>
     * The display name of the column..
     * </p>
     * 
     * @param name
     *        The display name of the column..
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The display name of the column..
     * </p>
     * 
     * @return The display name of the column..
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The display name of the column..
     * </p>
     * 
     * @param name
     *        The display name of the column..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputColumn withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for a column.
     * </p>
     * 
     * @param description
     *        A description for a column.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for a column.
     * </p>
     * 
     * @return A description for a column.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for a column.
     * </p>
     * 
     * @param description
     *        A description for a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputColumn withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     * @see ColumnDataType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @return The data type of the column.
     * @see ColumnDataType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public OutputColumn withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The data type of the column.
     * </p>
     * 
     * @param type
     *        The data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public OutputColumn withType(ColumnDataType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The sub data type of the column.
     * </p>
     * 
     * @param subType
     *        The sub data type of the column.
     * @see ColumnDataSubType
     */

    public void setSubType(String subType) {
        this.subType = subType;
    }

    /**
     * <p>
     * The sub data type of the column.
     * </p>
     * 
     * @return The sub data type of the column.
     * @see ColumnDataSubType
     */

    public String getSubType() {
        return this.subType;
    }

    /**
     * <p>
     * The sub data type of the column.
     * </p>
     * 
     * @param subType
     *        The sub data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataSubType
     */

    public OutputColumn withSubType(String subType) {
        setSubType(subType);
        return this;
    }

    /**
     * <p>
     * The sub data type of the column.
     * </p>
     * 
     * @param subType
     *        The sub data type of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataSubType
     */

    public OutputColumn withSubType(ColumnDataSubType subType) {
        this.subType = subType.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSubType() != null)
            sb.append("SubType: ").append(getSubType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputColumn == false)
            return false;
        OutputColumn other = (OutputColumn) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSubType() == null ^ this.getSubType() == null)
            return false;
        if (other.getSubType() != null && other.getSubType().equals(this.getSubType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSubType() == null) ? 0 : getSubType().hashCode());
        return hashCode;
    }

    @Override
    public OutputColumn clone() {
        try {
            return (OutputColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.OutputColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
