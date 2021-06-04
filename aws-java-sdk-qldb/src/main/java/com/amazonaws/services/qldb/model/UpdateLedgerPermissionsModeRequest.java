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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/UpdateLedgerPermissionsMode" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLedgerPermissionsModeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The permissions mode to assign to the ledger. This parameter can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity for
     * ledgers.
     * </p>
     * <p>
     * This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all PartiQL
     * commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode disregards any
     * table-level or command-level IAM permissions policies that you create for the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer granularity
     * for ledgers, tables, and PartiQL commands.
     * </p>
     * <p>
     * By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow
     * PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL
     * actions, in addition to the <code>SendCommand</code> API permission for the ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting started
     * with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your ledger
     * data.
     * </p>
     * </note>
     */
    private String permissionsMode;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLedgerPermissionsModeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger. This parameter can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity for
     * ledgers.
     * </p>
     * <p>
     * This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all PartiQL
     * commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode disregards any
     * table-level or command-level IAM permissions policies that you create for the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer granularity
     * for ledgers, tables, and PartiQL commands.
     * </p>
     * <p>
     * By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow
     * PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL
     * actions, in addition to the <code>SendCommand</code> API permission for the ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting started
     * with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your ledger
     * data.
     * </p>
     * </note>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger. This parameter can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity
     *        for ledgers.
     *        </p>
     *        <p>
     *        This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all
     *        PartiQL commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode
     *        disregards any table-level or command-level IAM permissions policies that you create for the ledger.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer
     *        granularity for ledgers, tables, and PartiQL commands.
     *        </p>
     *        <p>
     *        By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger.
     *        To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources
     *        and PartiQL actions, in addition to the <code>SendCommand</code> API permission for the ledger. For
     *        information, see <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting
     *        started with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your
     *        ledger data.
     *        </p>
     * @see PermissionsMode
     */

    public void setPermissionsMode(String permissionsMode) {
        this.permissionsMode = permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger. This parameter can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity for
     * ledgers.
     * </p>
     * <p>
     * This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all PartiQL
     * commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode disregards any
     * table-level or command-level IAM permissions policies that you create for the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer granularity
     * for ledgers, tables, and PartiQL commands.
     * </p>
     * <p>
     * By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow
     * PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL
     * actions, in addition to the <code>SendCommand</code> API permission for the ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting started
     * with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your ledger
     * data.
     * </p>
     * </note>
     * 
     * @return The permissions mode to assign to the ledger. This parameter can have one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity
     *         for ledgers.
     *         </p>
     *         <p>
     *         This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all
     *         PartiQL commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode
     *         disregards any table-level or command-level IAM permissions policies that you create for the ledger.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer
     *         granularity for ledgers, tables, and PartiQL commands.
     *         </p>
     *         <p>
     *         By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger.
     *         To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources
     *         and PartiQL actions, in addition to the <code>SendCommand</code> API permission for the ledger. For
     *         information, see <a
     *         href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting
     *         started with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your
     *         ledger data.
     *         </p>
     * @see PermissionsMode
     */

    public String getPermissionsMode() {
        return this.permissionsMode;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger. This parameter can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity for
     * ledgers.
     * </p>
     * <p>
     * This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all PartiQL
     * commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode disregards any
     * table-level or command-level IAM permissions policies that you create for the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer granularity
     * for ledgers, tables, and PartiQL commands.
     * </p>
     * <p>
     * By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow
     * PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL
     * actions, in addition to the <code>SendCommand</code> API permission for the ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting started
     * with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your ledger
     * data.
     * </p>
     * </note>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger. This parameter can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity
     *        for ledgers.
     *        </p>
     *        <p>
     *        This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all
     *        PartiQL commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode
     *        disregards any table-level or command-level IAM permissions policies that you create for the ledger.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer
     *        granularity for ledgers, tables, and PartiQL commands.
     *        </p>
     *        <p>
     *        By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger.
     *        To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources
     *        and PartiQL actions, in addition to the <code>SendCommand</code> API permission for the ledger. For
     *        information, see <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting
     *        started with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your
     *        ledger data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public UpdateLedgerPermissionsModeRequest withPermissionsMode(String permissionsMode) {
        setPermissionsMode(permissionsMode);
        return this;
    }

    /**
     * <p>
     * The permissions mode to assign to the ledger. This parameter can have one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity for
     * ledgers.
     * </p>
     * <p>
     * This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all PartiQL
     * commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode disregards any
     * table-level or command-level IAM permissions policies that you create for the ledger.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer granularity
     * for ledgers, tables, and PartiQL commands.
     * </p>
     * <p>
     * By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger. To allow
     * PartiQL commands to run, you must create IAM permissions policies for specific table resources and PartiQL
     * actions, in addition to the <code>SendCommand</code> API permission for the ledger. For information, see <a
     * href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting started
     * with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your ledger
     * data.
     * </p>
     * </note>
     * 
     * @param permissionsMode
     *        The permissions mode to assign to the ledger. This parameter can have one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALLOW_ALL</code>: A legacy permissions mode that enables access control with API-level granularity
     *        for ledgers.
     *        </p>
     *        <p>
     *        This mode allows users who have the <code>SendCommand</code> API permission for this ledger to run all
     *        PartiQL commands (hence, <code>ALLOW_ALL</code>) on any tables in the specified ledger. This mode
     *        disregards any table-level or command-level IAM permissions policies that you create for the ledger.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STANDARD</code>: (<i>Recommended</i>) A permissions mode that enables access control with finer
     *        granularity for ledgers, tables, and PartiQL commands.
     *        </p>
     *        <p>
     *        By default, this mode denies all user requests to run any PartiQL commands on any tables in this ledger.
     *        To allow PartiQL commands to run, you must create IAM permissions policies for specific table resources
     *        and PartiQL actions, in addition to the <code>SendCommand</code> API permission for the ledger. For
     *        information, see <a
     *        href="https://docs.aws.amazon.com/qldb/latest/developerguide/getting-started-standard-mode.html">Getting
     *        started with the standard permissions mode</a> in the <i>Amazon QLDB Developer Guide</i>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        We strongly recommend using the <code>STANDARD</code> permissions mode to maximize the security of your
     *        ledger data.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionsMode
     */

    public UpdateLedgerPermissionsModeRequest withPermissionsMode(PermissionsMode permissionsMode) {
        this.permissionsMode = permissionsMode.toString();
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
        if (getPermissionsMode() != null)
            sb.append("PermissionsMode: ").append(getPermissionsMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLedgerPermissionsModeRequest == false)
            return false;
        UpdateLedgerPermissionsModeRequest other = (UpdateLedgerPermissionsModeRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPermissionsMode() == null ^ this.getPermissionsMode() == null)
            return false;
        if (other.getPermissionsMode() != null && other.getPermissionsMode().equals(this.getPermissionsMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPermissionsMode() == null) ? 0 : getPermissionsMode().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLedgerPermissionsModeRequest clone() {
        return (UpdateLedgerPermissionsModeRequest) super.clone();
    }

}
