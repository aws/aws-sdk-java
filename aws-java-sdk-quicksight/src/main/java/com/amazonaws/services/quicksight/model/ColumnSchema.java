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
 * The column schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/ColumnSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnSchema implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column schema.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the column schema.
     * </p>
     */
    private String dataType;
    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     */
    private String geographicRole;

    /**
     * <p>
     * The name of the column schema.
     * </p>
     * 
     * @param name
     *        The name of the column schema.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the column schema.
     * </p>
     * 
     * @return The name of the column schema.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the column schema.
     * </p>
     * 
     * @param name
     *        The name of the column schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSchema withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     * 
     * @param dataType
     *        The data type of the column schema.
     */

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     * 
     * @return The data type of the column schema.
     */

    public String getDataType() {
        return this.dataType;
    }

    /**
     * <p>
     * The data type of the column schema.
     * </p>
     * 
     * @param dataType
     *        The data type of the column schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSchema withDataType(String dataType) {
        setDataType(dataType);
        return this;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     * 
     * @param geographicRole
     *        The geographic role of the column schema.
     */

    public void setGeographicRole(String geographicRole) {
        this.geographicRole = geographicRole;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     * 
     * @return The geographic role of the column schema.
     */

    public String getGeographicRole() {
        return this.geographicRole;
    }

    /**
     * <p>
     * The geographic role of the column schema.
     * </p>
     * 
     * @param geographicRole
     *        The geographic role of the column schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnSchema withGeographicRole(String geographicRole) {
        setGeographicRole(geographicRole);
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
        if (getDataType() != null)
            sb.append("DataType: ").append(getDataType()).append(",");
        if (getGeographicRole() != null)
            sb.append("GeographicRole: ").append(getGeographicRole());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ColumnSchema == false)
            return false;
        ColumnSchema other = (ColumnSchema) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDataType() == null ^ this.getDataType() == null)
            return false;
        if (other.getDataType() != null && other.getDataType().equals(this.getDataType()) == false)
            return false;
        if (other.getGeographicRole() == null ^ this.getGeographicRole() == null)
            return false;
        if (other.getGeographicRole() != null && other.getGeographicRole().equals(this.getGeographicRole()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDataType() == null) ? 0 : getDataType().hashCode());
        hashCode = prime * hashCode + ((getGeographicRole() == null) ? 0 : getGeographicRole().hashCode());
        return hashCode;
    }

    @Override
    public ColumnSchema clone() {
        try {
            return (ColumnSchema) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.ColumnSchemaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
