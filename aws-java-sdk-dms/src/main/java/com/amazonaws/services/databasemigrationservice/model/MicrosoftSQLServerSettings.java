/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a Microsoft SQL Server endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MicrosoftSQLServerSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MicrosoftSQLServerSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Endpoint TCP port.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The maximum size of the packets (in bytes) used to transfer data using BCP.
     * </p>
     */
    private Integer bcpPacketSize;
    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal AWS DMS
     * control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the specified filegroup.
     * </p>
     */
    private String controlTablesFileGroup;
    /**
     * <p>
     * Endpoint connection password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and doesn't
     * read from the active transaction log file during ongoing replication. Setting this parameter to <code>Y</code>
     * enables you to control active transaction log file growth during full load and ongoing replication tasks.
     * However, it can add some source latency to ongoing replication.
     * </p>
     */
    private Boolean readBackupOnly;
    /**
     * <p>
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using
     * one of the following two methods.
     * </p>
     * <p>
     * <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS prevents
     * TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that
     * appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your
     * database, then you must choose this method.
     * </p>
     * <p>
     * <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the changes and
     * then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve
     * any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this
     * method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel
     * AWS DMS tasks against the same database, use the default method.
     * </p>
     */
    private String safeguardPolicy;
    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * Endpoint connection user name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an
     * identity column that does not exist in the source table, you must disable the use BCP for loading table option.
     * </p>
     */
    private Boolean useBcpFullLoad;

    /**
     * <p>
     * Endpoint TCP port.
     * </p>
     * 
     * @param port
     *        Endpoint TCP port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Endpoint TCP port.
     * </p>
     * 
     * @return Endpoint TCP port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * Endpoint TCP port.
     * </p>
     * 
     * @param port
     *        Endpoint TCP port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The maximum size of the packets (in bytes) used to transfer data using BCP.
     * </p>
     * 
     * @param bcpPacketSize
     *        The maximum size of the packets (in bytes) used to transfer data using BCP.
     */

    public void setBcpPacketSize(Integer bcpPacketSize) {
        this.bcpPacketSize = bcpPacketSize;
    }

    /**
     * <p>
     * The maximum size of the packets (in bytes) used to transfer data using BCP.
     * </p>
     * 
     * @return The maximum size of the packets (in bytes) used to transfer data using BCP.
     */

    public Integer getBcpPacketSize() {
        return this.bcpPacketSize;
    }

    /**
     * <p>
     * The maximum size of the packets (in bytes) used to transfer data using BCP.
     * </p>
     * 
     * @param bcpPacketSize
     *        The maximum size of the packets (in bytes) used to transfer data using BCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withBcpPacketSize(Integer bcpPacketSize) {
        setBcpPacketSize(bcpPacketSize);
        return this;
    }

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @return Database name for the endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal AWS DMS
     * control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the specified filegroup.
     * </p>
     * 
     * @param controlTablesFileGroup
     *        Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal
     *        AWS DMS control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the
     *        specified filegroup.
     */

    public void setControlTablesFileGroup(String controlTablesFileGroup) {
        this.controlTablesFileGroup = controlTablesFileGroup;
    }

    /**
     * <p>
     * Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal AWS DMS
     * control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the specified filegroup.
     * </p>
     * 
     * @return Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal
     *         AWS DMS control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the
     *         specified filegroup.
     */

    public String getControlTablesFileGroup() {
        return this.controlTablesFileGroup;
    }

    /**
     * <p>
     * Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal AWS DMS
     * control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the specified filegroup.
     * </p>
     * 
     * @param controlTablesFileGroup
     *        Specify a filegroup for the AWS DMS internal tables. When the replication task starts, all the internal
     *        AWS DMS control tables (awsdms_ apply_exception, awsdms_apply, awsdms_changes) are created on the
     *        specified filegroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withControlTablesFileGroup(String controlTablesFileGroup) {
        setControlTablesFileGroup(controlTablesFileGroup);
        return this;
    }

    /**
     * <p>
     * Endpoint connection password.
     * </p>
     * 
     * @param password
     *        Endpoint connection password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Endpoint connection password.
     * </p>
     * 
     * @return Endpoint connection password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Endpoint connection password.
     * </p>
     * 
     * @param password
     *        Endpoint connection password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and doesn't
     * read from the active transaction log file during ongoing replication. Setting this parameter to <code>Y</code>
     * enables you to control active transaction log file growth during full load and ongoing replication tasks.
     * However, it can add some source latency to ongoing replication.
     * </p>
     * 
     * @param readBackupOnly
     *        When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and
     *        doesn't read from the active transaction log file during ongoing replication. Setting this parameter to
     *        <code>Y</code> enables you to control active transaction log file growth during full load and ongoing
     *        replication tasks. However, it can add some source latency to ongoing replication.
     */

    public void setReadBackupOnly(Boolean readBackupOnly) {
        this.readBackupOnly = readBackupOnly;
    }

    /**
     * <p>
     * When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and doesn't
     * read from the active transaction log file during ongoing replication. Setting this parameter to <code>Y</code>
     * enables you to control active transaction log file growth during full load and ongoing replication tasks.
     * However, it can add some source latency to ongoing replication.
     * </p>
     * 
     * @return When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and
     *         doesn't read from the active transaction log file during ongoing replication. Setting this parameter to
     *         <code>Y</code> enables you to control active transaction log file growth during full load and ongoing
     *         replication tasks. However, it can add some source latency to ongoing replication.
     */

    public Boolean getReadBackupOnly() {
        return this.readBackupOnly;
    }

    /**
     * <p>
     * When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and doesn't
     * read from the active transaction log file during ongoing replication. Setting this parameter to <code>Y</code>
     * enables you to control active transaction log file growth during full load and ongoing replication tasks.
     * However, it can add some source latency to ongoing replication.
     * </p>
     * 
     * @param readBackupOnly
     *        When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and
     *        doesn't read from the active transaction log file during ongoing replication. Setting this parameter to
     *        <code>Y</code> enables you to control active transaction log file growth during full load and ongoing
     *        replication tasks. However, it can add some source latency to ongoing replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withReadBackupOnly(Boolean readBackupOnly) {
        setReadBackupOnly(readBackupOnly);
        return this;
    }

    /**
     * <p>
     * When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and doesn't
     * read from the active transaction log file during ongoing replication. Setting this parameter to <code>Y</code>
     * enables you to control active transaction log file growth during full load and ongoing replication tasks.
     * However, it can add some source latency to ongoing replication.
     * </p>
     * 
     * @return When this attribute is set to <code>Y</code>, AWS DMS only reads changes from transaction log backups and
     *         doesn't read from the active transaction log file during ongoing replication. Setting this parameter to
     *         <code>Y</code> enables you to control active transaction log file growth during full load and ongoing
     *         replication tasks. However, it can add some source latency to ongoing replication.
     */

    public Boolean isReadBackupOnly() {
        return this.readBackupOnly;
    }

    /**
     * <p>
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using
     * one of the following two methods.
     * </p>
     * <p>
     * <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS prevents
     * TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that
     * appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your
     * database, then you must choose this method.
     * </p>
     * <p>
     * <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the changes and
     * then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve
     * any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this
     * method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel
     * AWS DMS tasks against the same database, use the default method.
     * </p>
     * 
     * @param safeguardPolicy
     *        Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation
     *        using one of the following two methods.</p>
     *        <p>
     *        <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS
     *        prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is
     *        open, changes that appear after the transaction started aren't truncated. If you need Microsoft
     *        Replication to be enabled in your database, then you must choose this method.
     *        </p>
     *        <p>
     *        <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the
     *        changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this
     *        method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't
     *        running. Also, when using this method, only one AWS DMS task can access the database at any given time.
     *        Therefore, if you need to run parallel AWS DMS tasks against the same database, use the default method.
     * @see SafeguardPolicy
     */

    public void setSafeguardPolicy(String safeguardPolicy) {
        this.safeguardPolicy = safeguardPolicy;
    }

    /**
     * <p>
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using
     * one of the following two methods.
     * </p>
     * <p>
     * <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS prevents
     * TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that
     * appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your
     * database, then you must choose this method.
     * </p>
     * <p>
     * <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the changes and
     * then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve
     * any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this
     * method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel
     * AWS DMS tasks against the same database, use the default method.
     * </p>
     * 
     * @return Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation
     *         using one of the following two methods.</p>
     *         <p>
     *         <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS
     *         prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is
     *         open, changes that appear after the transaction started aren't truncated. If you need Microsoft
     *         Replication to be enabled in your database, then you must choose this method.
     *         </p>
     *         <p>
     *         <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the
     *         changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this
     *         method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't
     *         running. Also, when using this method, only one AWS DMS task can access the database at any given time.
     *         Therefore, if you need to run parallel AWS DMS tasks against the same database, use the default method.
     * @see SafeguardPolicy
     */

    public String getSafeguardPolicy() {
        return this.safeguardPolicy;
    }

    /**
     * <p>
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using
     * one of the following two methods.
     * </p>
     * <p>
     * <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS prevents
     * TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that
     * appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your
     * database, then you must choose this method.
     * </p>
     * <p>
     * <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the changes and
     * then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve
     * any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this
     * method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel
     * AWS DMS tasks against the same database, use the default method.
     * </p>
     * 
     * @param safeguardPolicy
     *        Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation
     *        using one of the following two methods.</p>
     *        <p>
     *        <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS
     *        prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is
     *        open, changes that appear after the transaction started aren't truncated. If you need Microsoft
     *        Replication to be enabled in your database, then you must choose this method.
     *        </p>
     *        <p>
     *        <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the
     *        changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this
     *        method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't
     *        running. Also, when using this method, only one AWS DMS task can access the database at any given time.
     *        Therefore, if you need to run parallel AWS DMS tasks against the same database, use the default method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SafeguardPolicy
     */

    public MicrosoftSQLServerSettings withSafeguardPolicy(String safeguardPolicy) {
        setSafeguardPolicy(safeguardPolicy);
        return this;
    }

    /**
     * <p>
     * Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation using
     * one of the following two methods.
     * </p>
     * <p>
     * <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS prevents
     * TLOG truncation by mimicking a transaction in the database. As long as such a transaction is open, changes that
     * appear after the transaction started aren't truncated. If you need Microsoft Replication to be enabled in your
     * database, then you must choose this method.
     * </p>
     * <p>
     * <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the changes and
     * then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this method doesn't involve
     * any transactional activities, it can only be used when Microsoft Replication isn't running. Also, when using this
     * method, only one AWS DMS task can access the database at any given time. Therefore, if you need to run parallel
     * AWS DMS tasks against the same database, use the default method.
     * </p>
     * 
     * @param safeguardPolicy
     *        Use this attribute to minimize the need to access the backup log and enable AWS DMS to prevent truncation
     *        using one of the following two methods.</p>
     *        <p>
     *        <i>Start transactions in the database:</i> This is the default method. When this method is used, AWS DMS
     *        prevents TLOG truncation by mimicking a transaction in the database. As long as such a transaction is
     *        open, changes that appear after the transaction started aren't truncated. If you need Microsoft
     *        Replication to be enabled in your database, then you must choose this method.
     *        </p>
     *        <p>
     *        <i>Exclusively use sp_repldone within a single task</i>: When this method is used, AWS DMS reads the
     *        changes and then uses sp_repldone to mark the TLOG transactions as ready for truncation. Although this
     *        method doesn't involve any transactional activities, it can only be used when Microsoft Replication isn't
     *        running. Also, when using this method, only one AWS DMS task can access the database at any given time.
     *        Therefore, if you need to run parallel AWS DMS tasks against the same database, use the default method.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SafeguardPolicy
     */

    public MicrosoftSQLServerSettings withSafeguardPolicy(SafeguardPolicy safeguardPolicy) {
        this.safeguardPolicy = safeguardPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @param serverName
     *        Fully qualified domain name of the endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @return Fully qualified domain name of the endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     * 
     * @param serverName
     *        Fully qualified domain name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * Endpoint connection user name.
     * </p>
     * 
     * @param username
     *        Endpoint connection user name.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * Endpoint connection user name.
     * </p>
     * 
     * @return Endpoint connection user name.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * Endpoint connection user name.
     * </p>
     * 
     * @param username
     *        Endpoint connection user name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an
     * identity column that does not exist in the source table, you must disable the use BCP for loading table option.
     * </p>
     * 
     * @param useBcpFullLoad
     *        Use this to attribute to transfer data for full-load operations using BCP. When the target table contains
     *        an identity column that does not exist in the source table, you must disable the use BCP for loading table
     *        option.
     */

    public void setUseBcpFullLoad(Boolean useBcpFullLoad) {
        this.useBcpFullLoad = useBcpFullLoad;
    }

    /**
     * <p>
     * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an
     * identity column that does not exist in the source table, you must disable the use BCP for loading table option.
     * </p>
     * 
     * @return Use this to attribute to transfer data for full-load operations using BCP. When the target table contains
     *         an identity column that does not exist in the source table, you must disable the use BCP for loading
     *         table option.
     */

    public Boolean getUseBcpFullLoad() {
        return this.useBcpFullLoad;
    }

    /**
     * <p>
     * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an
     * identity column that does not exist in the source table, you must disable the use BCP for loading table option.
     * </p>
     * 
     * @param useBcpFullLoad
     *        Use this to attribute to transfer data for full-load operations using BCP. When the target table contains
     *        an identity column that does not exist in the source table, you must disable the use BCP for loading table
     *        option.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MicrosoftSQLServerSettings withUseBcpFullLoad(Boolean useBcpFullLoad) {
        setUseBcpFullLoad(useBcpFullLoad);
        return this;
    }

    /**
     * <p>
     * Use this to attribute to transfer data for full-load operations using BCP. When the target table contains an
     * identity column that does not exist in the source table, you must disable the use BCP for loading table option.
     * </p>
     * 
     * @return Use this to attribute to transfer data for full-load operations using BCP. When the target table contains
     *         an identity column that does not exist in the source table, you must disable the use BCP for loading
     *         table option.
     */

    public Boolean isUseBcpFullLoad() {
        return this.useBcpFullLoad;
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getBcpPacketSize() != null)
            sb.append("BcpPacketSize: ").append(getBcpPacketSize()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getControlTablesFileGroup() != null)
            sb.append("ControlTablesFileGroup: ").append(getControlTablesFileGroup()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getReadBackupOnly() != null)
            sb.append("ReadBackupOnly: ").append(getReadBackupOnly()).append(",");
        if (getSafeguardPolicy() != null)
            sb.append("SafeguardPolicy: ").append(getSafeguardPolicy()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getUseBcpFullLoad() != null)
            sb.append("UseBcpFullLoad: ").append(getUseBcpFullLoad());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MicrosoftSQLServerSettings == false)
            return false;
        MicrosoftSQLServerSettings other = (MicrosoftSQLServerSettings) obj;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getBcpPacketSize() == null ^ this.getBcpPacketSize() == null)
            return false;
        if (other.getBcpPacketSize() != null && other.getBcpPacketSize().equals(this.getBcpPacketSize()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getControlTablesFileGroup() == null ^ this.getControlTablesFileGroup() == null)
            return false;
        if (other.getControlTablesFileGroup() != null && other.getControlTablesFileGroup().equals(this.getControlTablesFileGroup()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getReadBackupOnly() == null ^ this.getReadBackupOnly() == null)
            return false;
        if (other.getReadBackupOnly() != null && other.getReadBackupOnly().equals(this.getReadBackupOnly()) == false)
            return false;
        if (other.getSafeguardPolicy() == null ^ this.getSafeguardPolicy() == null)
            return false;
        if (other.getSafeguardPolicy() != null && other.getSafeguardPolicy().equals(this.getSafeguardPolicy()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getUseBcpFullLoad() == null ^ this.getUseBcpFullLoad() == null)
            return false;
        if (other.getUseBcpFullLoad() != null && other.getUseBcpFullLoad().equals(this.getUseBcpFullLoad()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getBcpPacketSize() == null) ? 0 : getBcpPacketSize().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getControlTablesFileGroup() == null) ? 0 : getControlTablesFileGroup().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getReadBackupOnly() == null) ? 0 : getReadBackupOnly().hashCode());
        hashCode = prime * hashCode + ((getSafeguardPolicy() == null) ? 0 : getSafeguardPolicy().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getUseBcpFullLoad() == null) ? 0 : getUseBcpFullLoad().hashCode());
        return hashCode;
    }

    @Override
    public MicrosoftSQLServerSettings clone() {
        try {
            return (MicrosoftSQLServerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.MicrosoftSQLServerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
