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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReloadTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     */
    private java.util.List<TableToReload> tablesToReload;
    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     */
    private String reloadOption;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadTablesRequest withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * 
     * @return The name and schema of the table to be reloaded.
     */

    public java.util.List<TableToReload> getTablesToReload() {
        return tablesToReload;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * 
     * @param tablesToReload
     *        The name and schema of the table to be reloaded.
     */

    public void setTablesToReload(java.util.Collection<TableToReload> tablesToReload) {
        if (tablesToReload == null) {
            this.tablesToReload = null;
            return;
        }

        this.tablesToReload = new java.util.ArrayList<TableToReload>(tablesToReload);
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTablesToReload(java.util.Collection)} or {@link #withTablesToReload(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tablesToReload
     *        The name and schema of the table to be reloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadTablesRequest withTablesToReload(TableToReload... tablesToReload) {
        if (this.tablesToReload == null) {
            setTablesToReload(new java.util.ArrayList<TableToReload>(tablesToReload.length));
        }
        for (TableToReload ele : tablesToReload) {
            this.tablesToReload.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name and schema of the table to be reloaded.
     * </p>
     * 
     * @param tablesToReload
     *        The name and schema of the table to be reloaded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadTablesRequest withTablesToReload(java.util.Collection<TableToReload> tablesToReload) {
        setTablesToReload(tablesToReload);
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the task. </p>
     *        <p>
     *        Valid values: data-reload, validate-only
     *        </p>
     *        <p>
     *        Default value is data-reload.
     * @see ReloadOptionValue
     */

    public void setReloadOption(String reloadOption) {
        this.reloadOption = reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * 
     * @return Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *         is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *         validation is enabled for the task. </p>
     *         <p>
     *         Valid values: data-reload, validate-only
     *         </p>
     *         <p>
     *         Default value is data-reload.
     * @see ReloadOptionValue
     */

    public String getReloadOption() {
        return this.reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the task. </p>
     *        <p>
     *        Valid values: data-reload, validate-only
     *        </p>
     *        <p>
     *        Default value is data-reload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReloadOptionValue
     */

    public ReloadTablesRequest withReloadOption(String reloadOption) {
        setReloadOption(reloadOption);
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the task.
     * </p>
     * <p>
     * Valid values: data-reload, validate-only
     * </p>
     * <p>
     * Default value is data-reload.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the task. </p>
     *        <p>
     *        Valid values: data-reload, validate-only
     *        </p>
     *        <p>
     *        Default value is data-reload.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReloadOptionValue
     */

    public ReloadTablesRequest withReloadOption(ReloadOptionValue reloadOption) {
        this.reloadOption = reloadOption.toString();
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
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getTablesToReload() != null)
            sb.append("TablesToReload: ").append(getTablesToReload()).append(",");
        if (getReloadOption() != null)
            sb.append("ReloadOption: ").append(getReloadOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReloadTablesRequest == false)
            return false;
        ReloadTablesRequest other = (ReloadTablesRequest) obj;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getTablesToReload() == null ^ this.getTablesToReload() == null)
            return false;
        if (other.getTablesToReload() != null && other.getTablesToReload().equals(this.getTablesToReload()) == false)
            return false;
        if (other.getReloadOption() == null ^ this.getReloadOption() == null)
            return false;
        if (other.getReloadOption() != null && other.getReloadOption().equals(this.getReloadOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getTablesToReload() == null) ? 0 : getTablesToReload().hashCode());
        hashCode = prime * hashCode + ((getReloadOption() == null) ? 0 : getReloadOption().hashCode());
        return hashCode;
    }

    @Override
    public ReloadTablesRequest clone() {
        return (ReloadTablesRequest) super.clone();
    }

}
