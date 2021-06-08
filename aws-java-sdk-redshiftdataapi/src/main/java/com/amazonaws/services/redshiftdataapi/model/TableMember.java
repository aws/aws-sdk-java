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
 * The properties of a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-data-2019-12-20/TableMember" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableMember implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the table.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The schema containing the table.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL TEMPORARY,
     * ALIAS, and SYNONYM.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @return The name of the table.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the table.
     * </p>
     * 
     * @param name
     *        The name of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMember withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The schema containing the table.
     * </p>
     * 
     * @param schema
     *        The schema containing the table.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The schema containing the table.
     * </p>
     * 
     * @return The schema containing the table.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The schema containing the table.
     * </p>
     * 
     * @param schema
     *        The schema containing the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMember withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL TEMPORARY,
     * ALIAS, and SYNONYM.
     * </p>
     * 
     * @param type
     *        The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL
     *        TEMPORARY, ALIAS, and SYNONYM.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL TEMPORARY,
     * ALIAS, and SYNONYM.
     * </p>
     * 
     * @return The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL
     *         TEMPORARY, ALIAS, and SYNONYM.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL TEMPORARY,
     * ALIAS, and SYNONYM.
     * </p>
     * 
     * @param type
     *        The type of the table. Possible values include TABLE, VIEW, SYSTEM TABLE, GLOBAL TEMPORARY, LOCAL
     *        TEMPORARY, ALIAS, and SYNONYM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableMember withType(String type) {
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
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
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

        if (obj instanceof TableMember == false)
            return false;
        TableMember other = (TableMember) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
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
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public TableMember clone() {
        try {
            return (TableMember) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.redshiftdataapi.model.transform.TableMemberMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
