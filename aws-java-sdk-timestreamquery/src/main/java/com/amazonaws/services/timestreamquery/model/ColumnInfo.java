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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the meta data for query results such as the column names, data types, and other attributes.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/ColumnInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ColumnInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the result set column. The name of the result set is available for columns of all data types except
     * for arrays.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The data type of the result set column. The data type can be a scalar or complex. Scalar data types are integers,
     * strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and others.
     * </p>
     */
    private Type type;

    /**
     * <p>
     * The name of the result set column. The name of the result set is available for columns of all data types except
     * for arrays.
     * </p>
     * 
     * @param name
     *        The name of the result set column. The name of the result set is available for columns of all data types
     *        except for arrays.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the result set column. The name of the result set is available for columns of all data types except
     * for arrays.
     * </p>
     * 
     * @return The name of the result set column. The name of the result set is available for columns of all data types
     *         except for arrays.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the result set column. The name of the result set is available for columns of all data types except
     * for arrays.
     * </p>
     * 
     * @param name
     *        The name of the result set column. The name of the result set is available for columns of all data types
     *        except for arrays.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The data type of the result set column. The data type can be a scalar or complex. Scalar data types are integers,
     * strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and others.
     * </p>
     * 
     * @param type
     *        The data type of the result set column. The data type can be a scalar or complex. Scalar data types are
     *        integers, strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and
     *        others.
     */

    public void setType(Type type) {
        this.type = type;
    }

    /**
     * <p>
     * The data type of the result set column. The data type can be a scalar or complex. Scalar data types are integers,
     * strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and others.
     * </p>
     * 
     * @return The data type of the result set column. The data type can be a scalar or complex. Scalar data types are
     *         integers, strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and
     *         others.
     */

    public Type getType() {
        return this.type;
    }

    /**
     * <p>
     * The data type of the result set column. The data type can be a scalar or complex. Scalar data types are integers,
     * strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and others.
     * </p>
     * 
     * @param type
     *        The data type of the result set column. The data type can be a scalar or complex. Scalar data types are
     *        integers, strings, doubles, booleans, and others. Complex data types are types such as arrays, rows, and
     *        others.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ColumnInfo withType(Type type) {
        setType(type);
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

        if (obj instanceof ColumnInfo == false)
            return false;
        ColumnInfo other = (ColumnInfo) obj;
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
    public ColumnInfo clone() {
        try {
            return (ColumnInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamquery.model.transform.ColumnInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
