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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a single entry in the list of values for <code>SqlAliases</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SqlAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SqlAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A table, or a column in a table.
     * </p>
     */
    private String from;
    /**
     * <p>
     * A temporary name given to a table, or a column in a table.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * A table, or a column in a table.
     * </p>
     * 
     * @param from
     *        A table, or a column in a table.
     */

    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * <p>
     * A table, or a column in a table.
     * </p>
     * 
     * @return A table, or a column in a table.
     */

    public String getFrom() {
        return this.from;
    }

    /**
     * <p>
     * A table, or a column in a table.
     * </p>
     * 
     * @param from
     *        A table, or a column in a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlAlias withFrom(String from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * A temporary name given to a table, or a column in a table.
     * </p>
     * 
     * @param alias
     *        A temporary name given to a table, or a column in a table.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * A temporary name given to a table, or a column in a table.
     * </p>
     * 
     * @return A temporary name given to a table, or a column in a table.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * A temporary name given to a table, or a column in a table.
     * </p>
     * 
     * @param alias
     *        A temporary name given to a table, or a column in a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SqlAlias withAlias(String alias) {
        setAlias(alias);
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
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getAlias() != null)
            sb.append("Alias: ").append(getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SqlAlias == false)
            return false;
        SqlAlias other = (SqlAlias) obj;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public SqlAlias clone() {
        try {
            return (SqlAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SqlAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
