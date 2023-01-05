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
 * Specifies a Delta data store to crawl one or more Delta tables.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeltaTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeltaTarget implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the Amazon S3 paths to the Delta tables.
     * </p>
     */
    private java.util.List<String> deltaTables;
    /**
     * <p>
     * The name of the connection to use to connect to the Delta table target.
     * </p>
     */
    private String connectionName;
    /**
     * <p>
     * Specifies whether to write the manifest files to the Delta table path.
     * </p>
     */
    private Boolean writeManifest;
    /**
     * <p>
     * Specifies whether the crawler will create native tables, to allow integration with query engines that support
     * querying of the Delta transaction log directly.
     * </p>
     */
    private Boolean createNativeDeltaTable;

    /**
     * <p>
     * A list of the Amazon S3 paths to the Delta tables.
     * </p>
     * 
     * @return A list of the Amazon S3 paths to the Delta tables.
     */

    public java.util.List<String> getDeltaTables() {
        return deltaTables;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to the Delta tables.
     * </p>
     * 
     * @param deltaTables
     *        A list of the Amazon S3 paths to the Delta tables.
     */

    public void setDeltaTables(java.util.Collection<String> deltaTables) {
        if (deltaTables == null) {
            this.deltaTables = null;
            return;
        }

        this.deltaTables = new java.util.ArrayList<String>(deltaTables);
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to the Delta tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeltaTables(java.util.Collection)} or {@link #withDeltaTables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param deltaTables
     *        A list of the Amazon S3 paths to the Delta tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTarget withDeltaTables(String... deltaTables) {
        if (this.deltaTables == null) {
            setDeltaTables(new java.util.ArrayList<String>(deltaTables.length));
        }
        for (String ele : deltaTables) {
            this.deltaTables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to the Delta tables.
     * </p>
     * 
     * @param deltaTables
     *        A list of the Amazon S3 paths to the Delta tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTarget withDeltaTables(java.util.Collection<String> deltaTables) {
        setDeltaTables(deltaTables);
        return this;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Delta table target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Delta table target.
     */

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Delta table target.
     * </p>
     * 
     * @return The name of the connection to use to connect to the Delta table target.
     */

    public String getConnectionName() {
        return this.connectionName;
    }

    /**
     * <p>
     * The name of the connection to use to connect to the Delta table target.
     * </p>
     * 
     * @param connectionName
     *        The name of the connection to use to connect to the Delta table target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTarget withConnectionName(String connectionName) {
        setConnectionName(connectionName);
        return this;
    }

    /**
     * <p>
     * Specifies whether to write the manifest files to the Delta table path.
     * </p>
     * 
     * @param writeManifest
     *        Specifies whether to write the manifest files to the Delta table path.
     */

    public void setWriteManifest(Boolean writeManifest) {
        this.writeManifest = writeManifest;
    }

    /**
     * <p>
     * Specifies whether to write the manifest files to the Delta table path.
     * </p>
     * 
     * @return Specifies whether to write the manifest files to the Delta table path.
     */

    public Boolean getWriteManifest() {
        return this.writeManifest;
    }

    /**
     * <p>
     * Specifies whether to write the manifest files to the Delta table path.
     * </p>
     * 
     * @param writeManifest
     *        Specifies whether to write the manifest files to the Delta table path.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTarget withWriteManifest(Boolean writeManifest) {
        setWriteManifest(writeManifest);
        return this;
    }

    /**
     * <p>
     * Specifies whether to write the manifest files to the Delta table path.
     * </p>
     * 
     * @return Specifies whether to write the manifest files to the Delta table path.
     */

    public Boolean isWriteManifest() {
        return this.writeManifest;
    }

    /**
     * <p>
     * Specifies whether the crawler will create native tables, to allow integration with query engines that support
     * querying of the Delta transaction log directly.
     * </p>
     * 
     * @param createNativeDeltaTable
     *        Specifies whether the crawler will create native tables, to allow integration with query engines that
     *        support querying of the Delta transaction log directly.
     */

    public void setCreateNativeDeltaTable(Boolean createNativeDeltaTable) {
        this.createNativeDeltaTable = createNativeDeltaTable;
    }

    /**
     * <p>
     * Specifies whether the crawler will create native tables, to allow integration with query engines that support
     * querying of the Delta transaction log directly.
     * </p>
     * 
     * @return Specifies whether the crawler will create native tables, to allow integration with query engines that
     *         support querying of the Delta transaction log directly.
     */

    public Boolean getCreateNativeDeltaTable() {
        return this.createNativeDeltaTable;
    }

    /**
     * <p>
     * Specifies whether the crawler will create native tables, to allow integration with query engines that support
     * querying of the Delta transaction log directly.
     * </p>
     * 
     * @param createNativeDeltaTable
     *        Specifies whether the crawler will create native tables, to allow integration with query engines that
     *        support querying of the Delta transaction log directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeltaTarget withCreateNativeDeltaTable(Boolean createNativeDeltaTable) {
        setCreateNativeDeltaTable(createNativeDeltaTable);
        return this;
    }

    /**
     * <p>
     * Specifies whether the crawler will create native tables, to allow integration with query engines that support
     * querying of the Delta transaction log directly.
     * </p>
     * 
     * @return Specifies whether the crawler will create native tables, to allow integration with query engines that
     *         support querying of the Delta transaction log directly.
     */

    public Boolean isCreateNativeDeltaTable() {
        return this.createNativeDeltaTable;
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
        if (getDeltaTables() != null)
            sb.append("DeltaTables: ").append(getDeltaTables()).append(",");
        if (getConnectionName() != null)
            sb.append("ConnectionName: ").append(getConnectionName()).append(",");
        if (getWriteManifest() != null)
            sb.append("WriteManifest: ").append(getWriteManifest()).append(",");
        if (getCreateNativeDeltaTable() != null)
            sb.append("CreateNativeDeltaTable: ").append(getCreateNativeDeltaTable());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeltaTarget == false)
            return false;
        DeltaTarget other = (DeltaTarget) obj;
        if (other.getDeltaTables() == null ^ this.getDeltaTables() == null)
            return false;
        if (other.getDeltaTables() != null && other.getDeltaTables().equals(this.getDeltaTables()) == false)
            return false;
        if (other.getConnectionName() == null ^ this.getConnectionName() == null)
            return false;
        if (other.getConnectionName() != null && other.getConnectionName().equals(this.getConnectionName()) == false)
            return false;
        if (other.getWriteManifest() == null ^ this.getWriteManifest() == null)
            return false;
        if (other.getWriteManifest() != null && other.getWriteManifest().equals(this.getWriteManifest()) == false)
            return false;
        if (other.getCreateNativeDeltaTable() == null ^ this.getCreateNativeDeltaTable() == null)
            return false;
        if (other.getCreateNativeDeltaTable() != null && other.getCreateNativeDeltaTable().equals(this.getCreateNativeDeltaTable()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeltaTables() == null) ? 0 : getDeltaTables().hashCode());
        hashCode = prime * hashCode + ((getConnectionName() == null) ? 0 : getConnectionName().hashCode());
        hashCode = prime * hashCode + ((getWriteManifest() == null) ? 0 : getWriteManifest().hashCode());
        hashCode = prime * hashCode + ((getCreateNativeDeltaTable() == null) ? 0 : getCreateNativeDeltaTable().hashCode());
        return hashCode;
    }

    @Override
    public DeltaTarget clone() {
        try {
            return (DeltaTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.DeltaTargetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
