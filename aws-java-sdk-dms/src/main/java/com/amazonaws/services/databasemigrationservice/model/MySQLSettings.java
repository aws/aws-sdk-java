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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a MySQL endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MySQLSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MySQLSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues running
     * regardless if the SQL statement succeeds or fails.
     * </p>
     * <p>
     * For this parameter, provide the code of the script itself, not the name of a file containing the script.
     * </p>
     */
    private String afterConnectScript;
    /**
     * <p>
     * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always
     * On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction
     * backups, set this attribute to <code>false</code>.
     * </p>
     */
    private Boolean cleanSourceMetadataOnMismatch;
    /**
     * <p>
     * Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the database
     * using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a MySQL
     * endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database
     * only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     * </p>
     * <p>
     * Example: <code>eventsPollInterval=5;</code>
     * </p>
     * <p>
     * In the example, DMS checks for changes in the binary logs every five seconds.
     * </p>
     */
    private Integer eventsPollInterval;
    /**
     * <p>
     * Specifies where to migrate source tables on the target, either to a single database or multiple databases.
     * </p>
     * <p>
     * Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * </p>
     */
    private String targetDbType;
    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     */
    private Integer maxFileSize;
    /**
     * <p>
     * Improves performance when loading data into the MySQL-compatible target database. Specifies how many threads to
     * use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an
     * adverse effect on database performance, because a separate connection is required for each thread.
     * </p>
     * <p>
     * Example: <code>parallelLoadThreads=1</code>
     * </p>
     */
    private Integer parallelLoadThreads;
    /**
     * <p>
     * Endpoint connection password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Endpoint TCP port.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Fully qualified domain name of the endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * Specifies the time zone for the source MySQL database.
     * </p>
     * <p>
     * Example: <code>serverTimezone=US/Pacific;</code>
     * </p>
     * <p>
     * Note: Do not enclose time zones in single quotes.
     * </p>
     */
    private String serverTimezone;
    /**
     * <p>
     * Endpoint connection user name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     * <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web Services
     * Secrets Manager secret that allows access to the MySQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager">Using
     * secrets to access Database Migration Service resources</a> in the <i>Database Migration Service User Guide</i>.
     * </p>
     * </note>
     */
    private String secretsManagerAccessRoleArn;
    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the MySQL
     * endpoint connection details.
     * </p>
     */
    private String secretsManagerSecretId;

    /**
     * <p>
     * Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues running
     * regardless if the SQL statement succeeds or fails.
     * </p>
     * <p>
     * For this parameter, provide the code of the script itself, not the name of a file containing the script.
     * </p>
     * 
     * @param afterConnectScript
     *        Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues
     *        running regardless if the SQL statement succeeds or fails.</p>
     *        <p>
     *        For this parameter, provide the code of the script itself, not the name of a file containing the script.
     */

    public void setAfterConnectScript(String afterConnectScript) {
        this.afterConnectScript = afterConnectScript;
    }

    /**
     * <p>
     * Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues running
     * regardless if the SQL statement succeeds or fails.
     * </p>
     * <p>
     * For this parameter, provide the code of the script itself, not the name of a file containing the script.
     * </p>
     * 
     * @return Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues
     *         running regardless if the SQL statement succeeds or fails.</p>
     *         <p>
     *         For this parameter, provide the code of the script itself, not the name of a file containing the script.
     */

    public String getAfterConnectScript() {
        return this.afterConnectScript;
    }

    /**
     * <p>
     * Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues running
     * regardless if the SQL statement succeeds or fails.
     * </p>
     * <p>
     * For this parameter, provide the code of the script itself, not the name of a file containing the script.
     * </p>
     * 
     * @param afterConnectScript
     *        Specifies a script to run immediately after DMS connects to the endpoint. The migration task continues
     *        running regardless if the SQL statement succeeds or fails.</p>
     *        <p>
     *        For this parameter, provide the code of the script itself, not the name of a file containing the script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withAfterConnectScript(String afterConnectScript) {
        setAfterConnectScript(afterConnectScript);
        return this;
    }

    /**
     * <p>
     * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always
     * On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction
     * backups, set this attribute to <code>false</code>.
     * </p>
     * 
     * @param cleanSourceMetadataOnMismatch
     *        Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an
     *        Always On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for
     *        transaction backups, set this attribute to <code>false</code>.
     */

    public void setCleanSourceMetadataOnMismatch(Boolean cleanSourceMetadataOnMismatch) {
        this.cleanSourceMetadataOnMismatch = cleanSourceMetadataOnMismatch;
    }

    /**
     * <p>
     * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always
     * On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction
     * backups, set this attribute to <code>false</code>.
     * </p>
     * 
     * @return Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of
     *         an Always On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster
     *         for transaction backups, set this attribute to <code>false</code>.
     */

    public Boolean getCleanSourceMetadataOnMismatch() {
        return this.cleanSourceMetadataOnMismatch;
    }

    /**
     * <p>
     * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always
     * On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction
     * backups, set this attribute to <code>false</code>.
     * </p>
     * 
     * @param cleanSourceMetadataOnMismatch
     *        Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an
     *        Always On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for
     *        transaction backups, set this attribute to <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withCleanSourceMetadataOnMismatch(Boolean cleanSourceMetadataOnMismatch) {
        setCleanSourceMetadataOnMismatch(cleanSourceMetadataOnMismatch);
        return this;
    }

    /**
     * <p>
     * Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of an Always
     * On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster for transaction
     * backups, set this attribute to <code>false</code>.
     * </p>
     * 
     * @return Adjusts the behavior of DMS when migrating from an SQL Server source database that is hosted as part of
     *         an Always On availability group cluster. If you need DMS to poll all the nodes in the Always On cluster
     *         for transaction backups, set this attribute to <code>false</code>.
     */

    public Boolean isCleanSourceMetadataOnMismatch() {
        return this.cleanSourceMetadataOnMismatch;
    }

    /**
     * <p>
     * Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the database
     * using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a MySQL
     * endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database
     * only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the
     *        database using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code>
     *        or <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a
     *        MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     *        the database only when you specify the schema in the table-mapping rules of the DMS task.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the database
     * using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a MySQL
     * endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database
     * only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * 
     * @return Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the
     *         database using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code>
     *         or <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a
     *         MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     *         the database only when you specify the schema in the table-mapping rules of the DMS task.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the database
     * using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code> or
     * <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a MySQL
     * endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify the database
     * only when you specify the schema in the table-mapping rules of the DMS task.
     * </p>
     * 
     * @param databaseName
     *        Database name for the endpoint. For a MySQL source or target endpoint, don't explicitly specify the
     *        database using the <code>DatabaseName</code> request parameter on either the <code>CreateEndpoint</code>
     *        or <code>ModifyEndpoint</code> API call. Specifying <code>DatabaseName</code> when you create or modify a
     *        MySQL endpoint replicates all the task tables to this single database. For MySQL endpoints, you specify
     *        the database only when you specify the schema in the table-mapping rules of the DMS task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     * </p>
     * <p>
     * Example: <code>eventsPollInterval=5;</code>
     * </p>
     * <p>
     * In the example, DMS checks for changes in the binary logs every five seconds.
     * </p>
     * 
     * @param eventsPollInterval
     *        Specifies how often to check the binary log for new changes/events when the database is idle.</p>
     *        <p>
     *        Example: <code>eventsPollInterval=5;</code>
     *        </p>
     *        <p>
     *        In the example, DMS checks for changes in the binary logs every five seconds.
     */

    public void setEventsPollInterval(Integer eventsPollInterval) {
        this.eventsPollInterval = eventsPollInterval;
    }

    /**
     * <p>
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     * </p>
     * <p>
     * Example: <code>eventsPollInterval=5;</code>
     * </p>
     * <p>
     * In the example, DMS checks for changes in the binary logs every five seconds.
     * </p>
     * 
     * @return Specifies how often to check the binary log for new changes/events when the database is idle.</p>
     *         <p>
     *         Example: <code>eventsPollInterval=5;</code>
     *         </p>
     *         <p>
     *         In the example, DMS checks for changes in the binary logs every five seconds.
     */

    public Integer getEventsPollInterval() {
        return this.eventsPollInterval;
    }

    /**
     * <p>
     * Specifies how often to check the binary log for new changes/events when the database is idle.
     * </p>
     * <p>
     * Example: <code>eventsPollInterval=5;</code>
     * </p>
     * <p>
     * In the example, DMS checks for changes in the binary logs every five seconds.
     * </p>
     * 
     * @param eventsPollInterval
     *        Specifies how often to check the binary log for new changes/events when the database is idle.</p>
     *        <p>
     *        Example: <code>eventsPollInterval=5;</code>
     *        </p>
     *        <p>
     *        In the example, DMS checks for changes in the binary logs every five seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withEventsPollInterval(Integer eventsPollInterval) {
        setEventsPollInterval(eventsPollInterval);
        return this;
    }

    /**
     * <p>
     * Specifies where to migrate source tables on the target, either to a single database or multiple databases.
     * </p>
     * <p>
     * Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * </p>
     * 
     * @param targetDbType
     *        Specifies where to migrate source tables on the target, either to a single database or multiple
     *        databases.</p>
     *        <p>
     *        Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * @see TargetDbType
     */

    public void setTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
    }

    /**
     * <p>
     * Specifies where to migrate source tables on the target, either to a single database or multiple databases.
     * </p>
     * <p>
     * Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * </p>
     * 
     * @return Specifies where to migrate source tables on the target, either to a single database or multiple
     *         databases.</p>
     *         <p>
     *         Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * @see TargetDbType
     */

    public String getTargetDbType() {
        return this.targetDbType;
    }

    /**
     * <p>
     * Specifies where to migrate source tables on the target, either to a single database or multiple databases.
     * </p>
     * <p>
     * Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * </p>
     * 
     * @param targetDbType
     *        Specifies where to migrate source tables on the target, either to a single database or multiple
     *        databases.</p>
     *        <p>
     *        Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDbType
     */

    public MySQLSettings withTargetDbType(String targetDbType) {
        setTargetDbType(targetDbType);
        return this;
    }

    /**
     * <p>
     * Specifies where to migrate source tables on the target, either to a single database or multiple databases.
     * </p>
     * <p>
     * Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * </p>
     * 
     * @param targetDbType
     *        Specifies where to migrate source tables on the target, either to a single database or multiple
     *        databases.</p>
     *        <p>
     *        Example: <code>targetDbType=MULTIPLE_DATABASES</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetDbType
     */

    public MySQLSettings withTargetDbType(TargetDbType targetDbType) {
        this.targetDbType = targetDbType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @param maxFileSize
     *        Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible
     *        database.</p>
     *        <p>
     *        Example: <code>maxFileSize=512</code>
     */

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @return Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible
     *         database.</p>
     *         <p>
     *         Example: <code>maxFileSize=512</code>
     */

    public Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible database.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @param maxFileSize
     *        Specifies the maximum size (in KB) of any .csv file used to transfer data to a MySQL-compatible
     *        database.</p>
     *        <p>
     *        Example: <code>maxFileSize=512</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withMaxFileSize(Integer maxFileSize) {
        setMaxFileSize(maxFileSize);
        return this;
    }

    /**
     * <p>
     * Improves performance when loading data into the MySQL-compatible target database. Specifies how many threads to
     * use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an
     * adverse effect on database performance, because a separate connection is required for each thread.
     * </p>
     * <p>
     * Example: <code>parallelLoadThreads=1</code>
     * </p>
     * 
     * @param parallelLoadThreads
     *        Improves performance when loading data into the MySQL-compatible target database. Specifies how many
     *        threads to use to load the data into the MySQL-compatible target database. Setting a large number of
     *        threads can have an adverse effect on database performance, because a separate connection is required for
     *        each thread.</p>
     *        <p>
     *        Example: <code>parallelLoadThreads=1</code>
     */

    public void setParallelLoadThreads(Integer parallelLoadThreads) {
        this.parallelLoadThreads = parallelLoadThreads;
    }

    /**
     * <p>
     * Improves performance when loading data into the MySQL-compatible target database. Specifies how many threads to
     * use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an
     * adverse effect on database performance, because a separate connection is required for each thread.
     * </p>
     * <p>
     * Example: <code>parallelLoadThreads=1</code>
     * </p>
     * 
     * @return Improves performance when loading data into the MySQL-compatible target database. Specifies how many
     *         threads to use to load the data into the MySQL-compatible target database. Setting a large number of
     *         threads can have an adverse effect on database performance, because a separate connection is required for
     *         each thread.</p>
     *         <p>
     *         Example: <code>parallelLoadThreads=1</code>
     */

    public Integer getParallelLoadThreads() {
        return this.parallelLoadThreads;
    }

    /**
     * <p>
     * Improves performance when loading data into the MySQL-compatible target database. Specifies how many threads to
     * use to load the data into the MySQL-compatible target database. Setting a large number of threads can have an
     * adverse effect on database performance, because a separate connection is required for each thread.
     * </p>
     * <p>
     * Example: <code>parallelLoadThreads=1</code>
     * </p>
     * 
     * @param parallelLoadThreads
     *        Improves performance when loading data into the MySQL-compatible target database. Specifies how many
     *        threads to use to load the data into the MySQL-compatible target database. Setting a large number of
     *        threads can have an adverse effect on database performance, because a separate connection is required for
     *        each thread.</p>
     *        <p>
     *        Example: <code>parallelLoadThreads=1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withParallelLoadThreads(Integer parallelLoadThreads) {
        setParallelLoadThreads(parallelLoadThreads);
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

    public MySQLSettings withPassword(String password) {
        setPassword(password);
        return this;
    }

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

    public MySQLSettings withPort(Integer port) {
        setPort(port);
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

    public MySQLSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * Specifies the time zone for the source MySQL database.
     * </p>
     * <p>
     * Example: <code>serverTimezone=US/Pacific;</code>
     * </p>
     * <p>
     * Note: Do not enclose time zones in single quotes.
     * </p>
     * 
     * @param serverTimezone
     *        Specifies the time zone for the source MySQL database.</p>
     *        <p>
     *        Example: <code>serverTimezone=US/Pacific;</code>
     *        </p>
     *        <p>
     *        Note: Do not enclose time zones in single quotes.
     */

    public void setServerTimezone(String serverTimezone) {
        this.serverTimezone = serverTimezone;
    }

    /**
     * <p>
     * Specifies the time zone for the source MySQL database.
     * </p>
     * <p>
     * Example: <code>serverTimezone=US/Pacific;</code>
     * </p>
     * <p>
     * Note: Do not enclose time zones in single quotes.
     * </p>
     * 
     * @return Specifies the time zone for the source MySQL database.</p>
     *         <p>
     *         Example: <code>serverTimezone=US/Pacific;</code>
     *         </p>
     *         <p>
     *         Note: Do not enclose time zones in single quotes.
     */

    public String getServerTimezone() {
        return this.serverTimezone;
    }

    /**
     * <p>
     * Specifies the time zone for the source MySQL database.
     * </p>
     * <p>
     * Example: <code>serverTimezone=US/Pacific;</code>
     * </p>
     * <p>
     * Note: Do not enclose time zones in single quotes.
     * </p>
     * 
     * @param serverTimezone
     *        Specifies the time zone for the source MySQL database.</p>
     *        <p>
     *        Example: <code>serverTimezone=US/Pacific;</code>
     *        </p>
     *        <p>
     *        Note: Do not enclose time zones in single quotes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withServerTimezone(String serverTimezone) {
        setServerTimezone(serverTimezone);
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

    public MySQLSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     * <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web Services
     * Secrets Manager secret that allows access to the MySQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager">Using
     * secrets to access Database Migration Service resources</a> in the <i>Database Migration Service User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants
     *        the required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     *        <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web
     *        Services Secrets Manager secret that allows access to the MySQL endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access Database Migration Service resources</a> in the <i>Database Migration Service
     *        User Guide</i>.
     *        </p>
     */

    public void setSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     * <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web Services
     * Secrets Manager secret that allows access to the MySQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager">Using
     * secrets to access Database Migration Service resources</a> in the <i>Database Migration Service User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants
     *         the required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow
     *         the <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web
     *         Services Secrets Manager secret that allows access to the MySQL endpoint.</p> <note>
     *         <p>
     *         You can specify one of two sets of values for these permissions. You can specify the values for this
     *         setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *         <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *         specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *         <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *         see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *         >Using secrets to access Database Migration Service resources</a> in the <i>Database Migration Service
     *         User Guide</i>.
     *         </p>
     */

    public String getSecretsManagerAccessRoleArn() {
        return this.secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     * <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web Services
     * Secrets Manager secret that allows access to the MySQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager">Using
     * secrets to access Database Migration Service resources</a> in the <i>Database Migration Service User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies DMS as the trusted entity and grants
     *        the required permissions to access the value in <code>SecretsManagerSecret</code>. The role must allow the
     *        <code>iam:PassRole</code> action. <code>SecretsManagerSecret</code> has the value of the Amazon Web
     *        Services Secrets Manager secret that allows access to the MySQL endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access Database Migration Service resources</a> in the <i>Database Migration Service
     *        User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the MySQL
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        MySQL endpoint connection details.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the MySQL
     * endpoint connection details.
     * </p>
     * 
     * @return The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *         MySQL endpoint connection details.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the MySQL
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        MySQL endpoint connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MySQLSettings withSecretsManagerSecretId(String secretsManagerSecretId) {
        setSecretsManagerSecretId(secretsManagerSecretId);
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
        if (getAfterConnectScript() != null)
            sb.append("AfterConnectScript: ").append(getAfterConnectScript()).append(",");
        if (getCleanSourceMetadataOnMismatch() != null)
            sb.append("CleanSourceMetadataOnMismatch: ").append(getCleanSourceMetadataOnMismatch()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getEventsPollInterval() != null)
            sb.append("EventsPollInterval: ").append(getEventsPollInterval()).append(",");
        if (getTargetDbType() != null)
            sb.append("TargetDbType: ").append(getTargetDbType()).append(",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: ").append(getMaxFileSize()).append(",");
        if (getParallelLoadThreads() != null)
            sb.append("ParallelLoadThreads: ").append(getParallelLoadThreads()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getServerTimezone() != null)
            sb.append("ServerTimezone: ").append(getServerTimezone()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getSecretsManagerAccessRoleArn() != null)
            sb.append("SecretsManagerAccessRoleArn: ").append(getSecretsManagerAccessRoleArn()).append(",");
        if (getSecretsManagerSecretId() != null)
            sb.append("SecretsManagerSecretId: ").append(getSecretsManagerSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MySQLSettings == false)
            return false;
        MySQLSettings other = (MySQLSettings) obj;
        if (other.getAfterConnectScript() == null ^ this.getAfterConnectScript() == null)
            return false;
        if (other.getAfterConnectScript() != null && other.getAfterConnectScript().equals(this.getAfterConnectScript()) == false)
            return false;
        if (other.getCleanSourceMetadataOnMismatch() == null ^ this.getCleanSourceMetadataOnMismatch() == null)
            return false;
        if (other.getCleanSourceMetadataOnMismatch() != null
                && other.getCleanSourceMetadataOnMismatch().equals(this.getCleanSourceMetadataOnMismatch()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getEventsPollInterval() == null ^ this.getEventsPollInterval() == null)
            return false;
        if (other.getEventsPollInterval() != null && other.getEventsPollInterval().equals(this.getEventsPollInterval()) == false)
            return false;
        if (other.getTargetDbType() == null ^ this.getTargetDbType() == null)
            return false;
        if (other.getTargetDbType() != null && other.getTargetDbType().equals(this.getTargetDbType()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getParallelLoadThreads() == null ^ this.getParallelLoadThreads() == null)
            return false;
        if (other.getParallelLoadThreads() != null && other.getParallelLoadThreads().equals(this.getParallelLoadThreads()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getServerTimezone() == null ^ this.getServerTimezone() == null)
            return false;
        if (other.getServerTimezone() != null && other.getServerTimezone().equals(this.getServerTimezone()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getSecretsManagerAccessRoleArn() == null ^ this.getSecretsManagerAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerAccessRoleArn() != null && other.getSecretsManagerAccessRoleArn().equals(this.getSecretsManagerAccessRoleArn()) == false)
            return false;
        if (other.getSecretsManagerSecretId() == null ^ this.getSecretsManagerSecretId() == null)
            return false;
        if (other.getSecretsManagerSecretId() != null && other.getSecretsManagerSecretId().equals(this.getSecretsManagerSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfterConnectScript() == null) ? 0 : getAfterConnectScript().hashCode());
        hashCode = prime * hashCode + ((getCleanSourceMetadataOnMismatch() == null) ? 0 : getCleanSourceMetadataOnMismatch().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getEventsPollInterval() == null) ? 0 : getEventsPollInterval().hashCode());
        hashCode = prime * hashCode + ((getTargetDbType() == null) ? 0 : getTargetDbType().hashCode());
        hashCode = prime * hashCode + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode + ((getParallelLoadThreads() == null) ? 0 : getParallelLoadThreads().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getServerTimezone() == null) ? 0 : getServerTimezone().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        return hashCode;
    }

    @Override
    public MySQLSettings clone() {
        try {
            return (MySQLSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.MySQLSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
