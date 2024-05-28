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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extra details specific to the affected scope in this LF data set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/LakeFormationTagPolicyDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationTagPolicyDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The underlying Glue database that the notification is referring to.
     * </p>
     */
    private String database;
    /**
     * <p>
     * The underlying Glue table that the notification is referring to.
     * </p>
     */
    private String table;

    /**
     * <p>
     * The underlying Glue database that the notification is referring to.
     * </p>
     * 
     * @param database
     *        The underlying Glue database that the notification is referring to.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The underlying Glue database that the notification is referring to.
     * </p>
     * 
     * @return The underlying Glue database that the notification is referring to.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The underlying Glue database that the notification is referring to.
     * </p>
     * 
     * @param database
     *        The underlying Glue database that the notification is referring to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationTagPolicyDetails withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * The underlying Glue table that the notification is referring to.
     * </p>
     * 
     * @param table
     *        The underlying Glue table that the notification is referring to.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The underlying Glue table that the notification is referring to.
     * </p>
     * 
     * @return The underlying Glue table that the notification is referring to.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The underlying Glue table that the notification is referring to.
     * </p>
     * 
     * @param table
     *        The underlying Glue table that the notification is referring to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationTagPolicyDetails withTable(String table) {
        setTable(table);
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
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationTagPolicyDetails == false)
            return false;
        LakeFormationTagPolicyDetails other = (LakeFormationTagPolicyDetails) obj;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationTagPolicyDetails clone() {
        try {
            return (LakeFormationTagPolicyDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.LakeFormationTagPolicyDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
