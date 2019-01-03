/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Specifies a version of a table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/TableVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The table in question
     * </p>
     */
    private Table table;
    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     * integer. Each version is incremented by 1.
     * </p>
     */
    private String versionId;

    /**
     * <p>
     * The table in question
     * </p>
     * 
     * @param table
     *        The table in question
     */

    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * <p>
     * The table in question
     * </p>
     * 
     * @return The table in question
     */

    public Table getTable() {
        return this.table;
    }

    /**
     * <p>
     * The table in question
     * </p>
     * 
     * @param table
     *        The table in question
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableVersion withTable(Table table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     * integer. Each version is incremented by 1.
     * </p>
     * 
     * @param versionId
     *        The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     *        integer. Each version is incremented by 1.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     * integer. Each version is incremented by 1.
     * </p>
     * 
     * @return The ID value that identifies this table version. A <code>VersionId</code> is a string representation of
     *         an integer. Each version is incremented by 1.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     * integer. Each version is incremented by 1.
     * </p>
     * 
     * @param versionId
     *        The ID value that identifies this table version. A <code>VersionId</code> is a string representation of an
     *        integer. Each version is incremented by 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableVersion withVersionId(String versionId) {
        setVersionId(versionId);
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
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableVersion == false)
            return false;
        TableVersion other = (TableVersion) obj;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        return hashCode;
    }

    @Override
    public TableVersion clone() {
        try {
            return (TableVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
