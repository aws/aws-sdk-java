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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReloadReplicationTables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReloadReplicationTablesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name of the replication config for which to reload tables.
     * </p>
     */
    private String replicationConfigArn;
    /**
     * <p>
     * The list of tables to reload.
     * </p>
     */
    private java.util.List<TableToReload> tablesToReload;
    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the replication.
     * </p>
     */
    private String reloadOption;

    /**
     * <p>
     * The Amazon Resource Name of the replication config for which to reload tables.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication config for which to reload tables.
     */

    public void setReplicationConfigArn(String replicationConfigArn) {
        this.replicationConfigArn = replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication config for which to reload tables.
     * </p>
     * 
     * @return The Amazon Resource Name of the replication config for which to reload tables.
     */

    public String getReplicationConfigArn() {
        return this.replicationConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the replication config for which to reload tables.
     * </p>
     * 
     * @param replicationConfigArn
     *        The Amazon Resource Name of the replication config for which to reload tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadReplicationTablesRequest withReplicationConfigArn(String replicationConfigArn) {
        setReplicationConfigArn(replicationConfigArn);
        return this;
    }

    /**
     * <p>
     * The list of tables to reload.
     * </p>
     * 
     * @return The list of tables to reload.
     */

    public java.util.List<TableToReload> getTablesToReload() {
        return tablesToReload;
    }

    /**
     * <p>
     * The list of tables to reload.
     * </p>
     * 
     * @param tablesToReload
     *        The list of tables to reload.
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
     * The list of tables to reload.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTablesToReload(java.util.Collection)} or {@link #withTablesToReload(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param tablesToReload
     *        The list of tables to reload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadReplicationTablesRequest withTablesToReload(TableToReload... tablesToReload) {
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
     * The list of tables to reload.
     * </p>
     * 
     * @param tablesToReload
     *        The list of tables to reload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReloadReplicationTablesRequest withTablesToReload(java.util.Collection<TableToReload> tablesToReload) {
        setTablesToReload(tablesToReload);
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the replication.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the replication.
     * @see ReloadOptionValue
     */

    public void setReloadOption(String reloadOption) {
        this.reloadOption = reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the replication.
     * </p>
     * 
     * @return Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *         is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *         validation is enabled for the replication.
     * @see ReloadOptionValue
     */

    public String getReloadOption() {
        return this.reloadOption;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the replication.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReloadOptionValue
     */

    public ReloadReplicationTablesRequest withReloadOption(String reloadOption) {
        setReloadOption(reloadOption);
        return this;
    }

    /**
     * <p>
     * Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation is
     * enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when validation is
     * enabled for the replication.
     * </p>
     * 
     * @param reloadOption
     *        Options for reload. Specify <code>data-reload</code> to reload the data and re-validate it if validation
     *        is enabled. Specify <code>validate-only</code> to re-validate the table. This option applies only when
     *        validation is enabled for the replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReloadOptionValue
     */

    public ReloadReplicationTablesRequest withReloadOption(ReloadOptionValue reloadOption) {
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
        if (getReplicationConfigArn() != null)
            sb.append("ReplicationConfigArn: ").append(getReplicationConfigArn()).append(",");
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

        if (obj instanceof ReloadReplicationTablesRequest == false)
            return false;
        ReloadReplicationTablesRequest other = (ReloadReplicationTablesRequest) obj;
        if (other.getReplicationConfigArn() == null ^ this.getReplicationConfigArn() == null)
            return false;
        if (other.getReplicationConfigArn() != null && other.getReplicationConfigArn().equals(this.getReplicationConfigArn()) == false)
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

        hashCode = prime * hashCode + ((getReplicationConfigArn() == null) ? 0 : getReplicationConfigArn().hashCode());
        hashCode = prime * hashCode + ((getTablesToReload() == null) ? 0 : getTablesToReload().hashCode());
        hashCode = prime * hashCode + ((getReloadOption() == null) ? 0 : getReloadOption().hashCode());
        return hashCode;
    }

    @Override
    public ReloadReplicationTablesRequest clone() {
        return (ReloadReplicationTablesRequest) super.clone();
    }

}
