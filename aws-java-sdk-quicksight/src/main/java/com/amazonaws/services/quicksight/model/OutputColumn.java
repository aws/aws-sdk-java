/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * A display name for the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @return A display name for the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A display name for the dataset.
     * </p>
     * 
     * @param name
     *        A display name for the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OutputColumn withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @see ColumnDataType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @return Type.
     * @see ColumnDataType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public OutputColumn withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type.
     * </p>
     * 
     * @param type
     *        Type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataType
     */

    public OutputColumn withType(ColumnDataType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
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
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
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
