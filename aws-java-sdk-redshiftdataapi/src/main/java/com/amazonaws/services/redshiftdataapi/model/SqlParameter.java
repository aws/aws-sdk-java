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
package com.amazonaws.services.redshiftdataapi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter used in a SQL statement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/SqlParameter" target="_top">AWS API
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
     * The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more inforation, see
     * <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data types</a> in the
     * <i>Amazon Redshift Database Developer Guide</i>.
     * </p>
     */
    private String value;

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
     * The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more inforation, see
     * <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data types</a> in the
     * <i>Amazon Redshift Database Developer Guide</i>.
     * </p>
     * 
     * @param value
     *        The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more
     *        inforation, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data
     *        types</a> in the <i>Amazon Redshift Database Developer Guide</i>.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more inforation, see
     * <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data types</a> in the
     * <i>Amazon Redshift Database Developer Guide</i>.
     * </p>
     * 
     * @return The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more
     *         inforation, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data
     *         types</a> in the <i>Amazon Redshift Database Developer Guide</i>.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more inforation, see
     * <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data types</a> in the
     * <i>Amazon Redshift Database Developer Guide</i>.
     * </p>
     * 
     * @param value
     *        The value of the parameter. Amazon Redshift implicitly converts to the proper data type. For more
     *        inforation, see <a href="https://docs.aws.amazon.com/redshift/latest/dg/c_Supported_data_types.html">Data
     *        types</a> in the <i>Amazon Redshift Database Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlParameter withValue(String value) {
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
        com.amazonaws.services.redshiftdataapi.model.transform.SqlParameterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
