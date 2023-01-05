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
 * The options to configure an upsert operation when writing to a Redshift target .
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/UpsertRedshiftTargetOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpsertRedshiftTargetOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The physical location of the Redshift table.
     * </p>
     */
    private String tableLocation;
    /**
     * <p>
     * The name of the connection to use to write to Redshift.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * The keys used to determine whether to perform an update or insert.
     * </p>
     */
    private java.util.List<String> upsertKeys;

    /**
     * <p>
     * The physical location of the Redshift table.
     * </p>
     * 
     * @param tableLocation
     *        The physical location of the Redshift table.
     */

    public void setTableLocation(String tableLocation) {
        this.tableLocation = tableLocation;
    }

    /**
     * <p>
     * The physical location of the Redshift table.
     * </p>
     * 
     * @return The physical location of the Redshift table.
     */

    public String getTableLocation() {
        return this.tableLocation;
    }

    /**
     * <p>
     * The physical location of the Redshift table.
     * </p>
     * 
     * @param tableLocation
     *        The physical location of the Redshift table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRedshiftTargetOptions withTableLocation(String tableLocation) {
        setTableLocation(tableLocation);
        return this;
    }

    /**
     * <p>
     * The name of the connection to use to write to Redshift.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to write to Redshift.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to write to Redshift.
     * </p>
     * 
     * @return The name of the connection to use to write to Redshift.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to write to Redshift.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to write to Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRedshiftTargetOptions withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * The keys used to determine whether to perform an update or insert.
     * </p>
     * 
     * @return The keys used to determine whether to perform an update or insert.
     */

    public java.util.List<String> getUpsertKeys() {
        return upsertKeys;
    }

    /**
     * <p>
     * The keys used to determine whether to perform an update or insert.
     * </p>
     * 
     * @param upsertKeys
     *        The keys used to determine whether to perform an update or insert.
     */

    public void setUpsertKeys(java.util.Collection<String> upsertKeys) {
        if (upsertKeys == null) {
            this.upsertKeys = null;
            return;
        }

        this.upsertKeys = new java.util.ArrayList<String>(upsertKeys);
    }

    /**
     * <p>
     * The keys used to determine whether to perform an update or insert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpsertKeys(java.util.Collection)} or {@link #withUpsertKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param upsertKeys
     *        The keys used to determine whether to perform an update or insert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRedshiftTargetOptions withUpsertKeys(String... upsertKeys) {
        if (this.upsertKeys == null) {
            setUpsertKeys(new java.util.ArrayList<String>(upsertKeys.length));
        }
        for (String ele : upsertKeys) {
            this.upsertKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The keys used to determine whether to perform an update or insert.
     * </p>
     * 
     * @param upsertKeys
     *        The keys used to determine whether to perform an update or insert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpsertRedshiftTargetOptions withUpsertKeys(java.util.Collection<String> upsertKeys) {
        setUpsertKeys(upsertKeys);
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
        if (getTableLocation() != null)
            sb.append("TableLocation: ").append(getTableLocation()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getUpsertKeys() != null)
            sb.append("UpsertKeys: ").append(getUpsertKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpsertRedshiftTargetOptions == false)
            return false;
        UpsertRedshiftTargetOptions other = (UpsertRedshiftTargetOptions) obj;
        if (other.getTableLocation() == null ^ this.getTableLocation() == null)
            return false;
        if (other.getTableLocation() != null && other.getTableLocation().equals(this.getTableLocation()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getUpsertKeys() == null ^ this.getUpsertKeys() == null)
            return false;
        if (other.getUpsertKeys() != null && other.getUpsertKeys().equals(this.getUpsertKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableLocation() == null) ? 0 : getTableLocation().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getUpsertKeys() == null) ? 0 : getUpsertKeys().hashCode());
        return hashCode;
    }

    @Override
    public UpsertRedshiftTargetOptions clone() {
        try {
            return (UpsertRedshiftTargetOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.UpsertRedshiftTargetOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
