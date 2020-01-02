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
package com.amazonaws.services.rdsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter used in a SQL statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-data-2018-08-01/SqlParameter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlParameter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the parameter.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A hint that specifies the correct object type for data type mapping.
     * </p>
     * <p>
     * <b>Values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DECIMAL</code> type to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String typeHint;
    /**
     * <p>
     * The value of the parameter.
     * </p>
     */
    private Field value;

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @return The name of the parameter.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the parameter.
     * </p>
     * 
     * @param name
     *        The name of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlParameter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A hint that specifies the correct object type for data type mapping.
     * </p>
     * <p>
     * <b>Values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DECIMAL</code> type to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeHint
     *        A hint that specifies the correct object type for data type mapping.</p>
     *        <p>
     *        <b>Values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DECIMAL</code> type to the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     *        </p>
     *        </li>
     * @see TypeHint
     */

    public void setTypeHint(String typeHint) {
        this.typeHint = typeHint;
    }

    /**
     * <p>
     * A hint that specifies the correct object type for data type mapping.
     * </p>
     * <p>
     * <b>Values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DECIMAL</code> type to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A hint that specifies the correct object type for data type mapping.</p>
     *         <p>
     *         <b>Values:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *         <code>DECIMAL</code> type to the database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *         <code>TIMESTAMP</code> type to the database. The accepted format is
     *         <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *         <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *         <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     *         </p>
     *         </li>
     * @see TypeHint
     */

    public String getTypeHint() {
        return this.typeHint;
    }

    /**
     * <p>
     * A hint that specifies the correct object type for data type mapping.
     * </p>
     * <p>
     * <b>Values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DECIMAL</code> type to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeHint
     *        A hint that specifies the correct object type for data type mapping.</p>
     *        <p>
     *        <b>Values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DECIMAL</code> type to the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeHint
     */

    public SqlParameter withTypeHint(String typeHint) {
        setTypeHint(typeHint);
        return this;
    }

    /**
     * <p>
     * A hint that specifies the correct object type for data type mapping.
     * </p>
     * <p>
     * <b>Values:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DECIMAL</code> type to the database.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     * <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param typeHint
     *        A hint that specifies the correct object type for data type mapping.</p>
     *        <p>
     *        <b>Values:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DECIMAL</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DECIMAL</code> type to the database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIMESTAMP</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIMESTAMP</code> type to the database. The accepted format is <code>YYYY-MM-DD HH:MM:SS[.FFF]</code>
     *        .
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TIME</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>TIME</code> type to the database. The accepted format is <code>HH:MM:SS[.FFF]</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DATE</code> - The corresponding <code>String</code> parameter value is sent as an object of
     *        <code>DATE</code> type to the database. The accepted format is <code>YYYY-MM-DD</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TypeHint
     */

    public SqlParameter withTypeHint(TypeHint typeHint) {
        this.typeHint = typeHint.toString();
        return this;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param value
     *        The value of the parameter.
     */

    public void setValue(Field value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @return The value of the parameter.
     */

    public Field getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the parameter.
     * </p>
     * 
     * @param value
     *        The value of the parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlParameter withValue(Field value) {
        setValue(value);
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
        if (getTypeHint() != null)
            sb.append("TypeHint: ").append(getTypeHint()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlParameter == false)
            return false;
        SqlParameter other = (SqlParameter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTypeHint() == null ^ this.getTypeHint() == null)
            return false;
        if (other.getTypeHint() != null && other.getTypeHint().equals(this.getTypeHint()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTypeHint() == null) ? 0 : getTypeHint().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public SqlParameter clone() {
        try {
            return (SqlParameter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rdsdata.model.transform.SqlParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
