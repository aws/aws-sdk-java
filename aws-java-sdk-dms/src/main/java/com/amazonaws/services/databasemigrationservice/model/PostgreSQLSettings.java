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
 * Provides information that defines a PostgreSQL endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/PostgreSQLSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PostgreSQLSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user triggers to
     * reduce the time it takes to bulk load data.
     * </p>
     * <p>
     * Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     * </p>
     */
    private String afterConnectScript;
    /**
     * <p>
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can
     * later remove these artifacts.
     * </p>
     * <p>
     * If this value is set to <code>N</code>, you don't have to create tables or triggers on the source database.
     * </p>
     */
    private Boolean captureDdls;
    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     */
    private Integer maxFileSize;
    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The schema in which the operational DDL database artifacts are created.
     * </p>
     * <p>
     * Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     * </p>
     */
    private String ddlArtifactsSchema;
    /**
     * <p>
     * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds.
     * </p>
     * <p>
     * Example: <code>executeTimeout=100;</code>
     * </p>
     */
    private Integer executeTimeout;
    /**
     * <p>
     * When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is greater
     * than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB
     * data.
     * </p>
     */
    private Boolean failTasksOnLobTruncation;
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
     * Endpoint connection user name.
     * </p>
     */
    private String username;
    /**
     * <p>
     * Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source instance.
     * </p>
     * <p>
     * When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also enables using
     * native CDC start points.
     * </p>
     */
    private String slotName;
    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     */
    private String secretsManagerAccessRoleArn;
    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the PostgreSQL
     * endpoint connection details.
     * </p>
     */
    private String secretsManagerSecretId;

    /**
     * <p>
     * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user triggers to
     * reduce the time it takes to bulk load data.
     * </p>
     * <p>
     * Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     * </p>
     * 
     * @param afterConnectScript
     *        For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user
     *        triggers to reduce the time it takes to bulk load data.</p>
     *        <p>
     *        Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     */

    public void setAfterConnectScript(String afterConnectScript) {
        this.afterConnectScript = afterConnectScript;
    }

    /**
     * <p>
     * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user triggers to
     * reduce the time it takes to bulk load data.
     * </p>
     * <p>
     * Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     * </p>
     * 
     * @return For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user
     *         triggers to reduce the time it takes to bulk load data.</p>
     *         <p>
     *         Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     */

    public String getAfterConnectScript() {
        return this.afterConnectScript;
    }

    /**
     * <p>
     * For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user triggers to
     * reduce the time it takes to bulk load data.
     * </p>
     * <p>
     * Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     * </p>
     * 
     * @param afterConnectScript
     *        For use with change data capture (CDC) only, this attribute has AWS DMS bypass foreign keys and user
     *        triggers to reduce the time it takes to bulk load data.</p>
     *        <p>
     *        Example: <code>afterConnectScript=SET session_replication_role='replica'</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withAfterConnectScript(String afterConnectScript) {
        setAfterConnectScript(afterConnectScript);
        return this;
    }

    /**
     * <p>
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can
     * later remove these artifacts.
     * </p>
     * <p>
     * If this value is set to <code>N</code>, you don't have to create tables or triggers on the source database.
     * </p>
     * 
     * @param captureDdls
     *        To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts.
     *        You can later remove these artifacts.</p>
     *        <p>
     *        If this value is set to <code>N</code>, you don't have to create tables or triggers on the source
     *        database.
     */

    public void setCaptureDdls(Boolean captureDdls) {
        this.captureDdls = captureDdls;
    }

    /**
     * <p>
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can
     * later remove these artifacts.
     * </p>
     * <p>
     * If this value is set to <code>N</code>, you don't have to create tables or triggers on the source database.
     * </p>
     * 
     * @return To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts.
     *         You can later remove these artifacts.</p>
     *         <p>
     *         If this value is set to <code>N</code>, you don't have to create tables or triggers on the source
     *         database.
     */

    public Boolean getCaptureDdls() {
        return this.captureDdls;
    }

    /**
     * <p>
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can
     * later remove these artifacts.
     * </p>
     * <p>
     * If this value is set to <code>N</code>, you don't have to create tables or triggers on the source database.
     * </p>
     * 
     * @param captureDdls
     *        To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts.
     *        You can later remove these artifacts.</p>
     *        <p>
     *        If this value is set to <code>N</code>, you don't have to create tables or triggers on the source
     *        database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withCaptureDdls(Boolean captureDdls) {
        setCaptureDdls(captureDdls);
        return this;
    }

    /**
     * <p>
     * To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts. You can
     * later remove these artifacts.
     * </p>
     * <p>
     * If this value is set to <code>N</code>, you don't have to create tables or triggers on the source database.
     * </p>
     * 
     * @return To capture DDL events, AWS DMS creates various artifacts in the PostgreSQL database when the task starts.
     *         You can later remove these artifacts.</p>
     *         <p>
     *         If this value is set to <code>N</code>, you don't have to create tables or triggers on the source
     *         database.
     */

    public Boolean isCaptureDdls() {
        return this.captureDdls;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @param maxFileSize
     *        Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.</p>
     *        <p>
     *        Example: <code>maxFileSize=512</code>
     */

    public void setMaxFileSize(Integer maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @return Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.</p>
     *         <p>
     *         Example: <code>maxFileSize=512</code>
     */

    public Integer getMaxFileSize() {
        return this.maxFileSize;
    }

    /**
     * <p>
     * Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.
     * </p>
     * <p>
     * Example: <code>maxFileSize=512</code>
     * </p>
     * 
     * @param maxFileSize
     *        Specifies the maximum size (in KB) of any .csv file used to transfer data to PostgreSQL.</p>
     *        <p>
     *        Example: <code>maxFileSize=512</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withMaxFileSize(Integer maxFileSize) {
        setMaxFileSize(maxFileSize);
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

    public PostgreSQLSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The schema in which the operational DDL database artifacts are created.
     * </p>
     * <p>
     * Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     * </p>
     * 
     * @param ddlArtifactsSchema
     *        The schema in which the operational DDL database artifacts are created.</p>
     *        <p>
     *        Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     */

    public void setDdlArtifactsSchema(String ddlArtifactsSchema) {
        this.ddlArtifactsSchema = ddlArtifactsSchema;
    }

    /**
     * <p>
     * The schema in which the operational DDL database artifacts are created.
     * </p>
     * <p>
     * Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     * </p>
     * 
     * @return The schema in which the operational DDL database artifacts are created.</p>
     *         <p>
     *         Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     */

    public String getDdlArtifactsSchema() {
        return this.ddlArtifactsSchema;
    }

    /**
     * <p>
     * The schema in which the operational DDL database artifacts are created.
     * </p>
     * <p>
     * Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     * </p>
     * 
     * @param ddlArtifactsSchema
     *        The schema in which the operational DDL database artifacts are created.</p>
     *        <p>
     *        Example: <code>ddlArtifactsSchema=xyzddlschema;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withDdlArtifactsSchema(String ddlArtifactsSchema) {
        setDdlArtifactsSchema(ddlArtifactsSchema);
        return this;
    }

    /**
     * <p>
     * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds.
     * </p>
     * <p>
     * Example: <code>executeTimeout=100;</code>
     * </p>
     * 
     * @param executeTimeout
     *        Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60
     *        seconds.</p>
     *        <p>
     *        Example: <code>executeTimeout=100;</code>
     */

    public void setExecuteTimeout(Integer executeTimeout) {
        this.executeTimeout = executeTimeout;
    }

    /**
     * <p>
     * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds.
     * </p>
     * <p>
     * Example: <code>executeTimeout=100;</code>
     * </p>
     * 
     * @return Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60
     *         seconds.</p>
     *         <p>
     *         Example: <code>executeTimeout=100;</code>
     */

    public Integer getExecuteTimeout() {
        return this.executeTimeout;
    }

    /**
     * <p>
     * Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60 seconds.
     * </p>
     * <p>
     * Example: <code>executeTimeout=100;</code>
     * </p>
     * 
     * @param executeTimeout
     *        Sets the client statement timeout for the PostgreSQL instance, in seconds. The default value is 60
     *        seconds.</p>
     *        <p>
     *        Example: <code>executeTimeout=100;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withExecuteTimeout(Integer executeTimeout) {
        setExecuteTimeout(executeTimeout);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is greater
     * than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB
     * data.
     * </p>
     * 
     * @param failTasksOnLobTruncation
     *        When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is
     *        greater than the specified <code>LobMaxSize</code>.</p>
     *        <p>
     *        If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating
     *        the LOB data.
     */

    public void setFailTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
        this.failTasksOnLobTruncation = failTasksOnLobTruncation;
    }

    /**
     * <p>
     * When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is greater
     * than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB
     * data.
     * </p>
     * 
     * @return When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is
     *         greater than the specified <code>LobMaxSize</code>.</p>
     *         <p>
     *         If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating
     *         the LOB data.
     */

    public Boolean getFailTasksOnLobTruncation() {
        return this.failTasksOnLobTruncation;
    }

    /**
     * <p>
     * When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is greater
     * than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB
     * data.
     * </p>
     * 
     * @param failTasksOnLobTruncation
     *        When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is
     *        greater than the specified <code>LobMaxSize</code>.</p>
     *        <p>
     *        If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating
     *        the LOB data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withFailTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
        setFailTasksOnLobTruncation(failTasksOnLobTruncation);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is greater
     * than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating the LOB
     * data.
     * </p>
     * 
     * @return When set to <code>true</code>, this value causes a task to fail if the actual size of a LOB column is
     *         greater than the specified <code>LobMaxSize</code>.</p>
     *         <p>
     *         If task is set to Limited LOB mode and this option is set to true, the task fails instead of truncating
     *         the LOB data.
     */

    public Boolean isFailTasksOnLobTruncation() {
        return this.failTasksOnLobTruncation;
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

    public PostgreSQLSettings withPassword(String password) {
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

    public PostgreSQLSettings withPort(Integer port) {
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

    public PostgreSQLSettings withServerName(String serverName) {
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

    public PostgreSQLSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source instance.
     * </p>
     * <p>
     * When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also enables using
     * native CDC start points.
     * </p>
     * 
     * @param slotName
     *        Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source
     *        instance.</p>
     *        <p>
     *        When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also
     *        enables using native CDC start points.
     */

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    /**
     * <p>
     * Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source instance.
     * </p>
     * <p>
     * When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also enables using
     * native CDC start points.
     * </p>
     * 
     * @return Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source
     *         instance.</p>
     *         <p>
     *         When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also
     *         enables using native CDC start points.
     */

    public String getSlotName() {
        return this.slotName;
    }

    /**
     * <p>
     * Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source instance.
     * </p>
     * <p>
     * When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also enables using
     * native CDC start points.
     * </p>
     * 
     * @param slotName
     *        Sets the name of a previously created logical replication slot for a CDC load of the PostgreSQL source
     *        instance.</p>
     *        <p>
     *        When used with the AWS DMS API <code>CdcStartPosition</code> request parameter, this attribute also
     *        enables using native CDC start points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withSlotName(String slotName) {
        setSlotName(slotName);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *        grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *        <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *        the PostgreSQL endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     */

    public void setSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @return The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *         grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *         <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *         the PostgreSQL endpoint.</p> <note>
     *         <p>
     *         You can specify one of two sets of values for these permissions. You can specify the values for this
     *         setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *         <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *         specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *         <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *         see <a href=
     *         "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *         >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *         Service User Guide</i>.
     *         </p>
     */

    public String getSecretsManagerAccessRoleArn() {
        return this.secretsManagerAccessRoleArn;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the PostgreSQL endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for <code>UserName</code>,
     * <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't specify both. For more
     * information on creating this <code>SecretsManagerSecret</code> and the <code>SecretsManagerAccessRoleArn</code>
     * and <code>SecretsManagerSecretId</code> required to access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerAccessRoleArn
     *        The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and
     *        grants the required permissions to access the value in <code>SecretsManagerSecret</code>.
     *        <code>SecretsManagerSecret</code> has the value of the AWS Secrets Manager secret that allows access to
     *        the PostgreSQL endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerSecretId</code>. Or you can specify clear-text values for
     *        <code>UserName</code>, <code>Password</code>, <code>ServerName</code>, and <code>Port</code>. You can't
     *        specify both. For more information on creating this <code>SecretsManagerSecret</code> and the
     *        <code>SecretsManagerAccessRoleArn</code> and <code>SecretsManagerSecretId</code> required to access it,
     *        see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the PostgreSQL
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        PostgreSQL endpoint connection details.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the PostgreSQL
     * endpoint connection details.
     * </p>
     * 
     * @return The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *         PostgreSQL endpoint connection details.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the PostgreSQL
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        PostgreSQL endpoint connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PostgreSQLSettings withSecretsManagerSecretId(String secretsManagerSecretId) {
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
        if (getCaptureDdls() != null)
            sb.append("CaptureDdls: ").append(getCaptureDdls()).append(",");
        if (getMaxFileSize() != null)
            sb.append("MaxFileSize: ").append(getMaxFileSize()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDdlArtifactsSchema() != null)
            sb.append("DdlArtifactsSchema: ").append(getDdlArtifactsSchema()).append(",");
        if (getExecuteTimeout() != null)
            sb.append("ExecuteTimeout: ").append(getExecuteTimeout()).append(",");
        if (getFailTasksOnLobTruncation() != null)
            sb.append("FailTasksOnLobTruncation: ").append(getFailTasksOnLobTruncation()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getSlotName() != null)
            sb.append("SlotName: ").append(getSlotName()).append(",");
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

        if (obj instanceof PostgreSQLSettings == false)
            return false;
        PostgreSQLSettings other = (PostgreSQLSettings) obj;
        if (other.getAfterConnectScript() == null ^ this.getAfterConnectScript() == null)
            return false;
        if (other.getAfterConnectScript() != null && other.getAfterConnectScript().equals(this.getAfterConnectScript()) == false)
            return false;
        if (other.getCaptureDdls() == null ^ this.getCaptureDdls() == null)
            return false;
        if (other.getCaptureDdls() != null && other.getCaptureDdls().equals(this.getCaptureDdls()) == false)
            return false;
        if (other.getMaxFileSize() == null ^ this.getMaxFileSize() == null)
            return false;
        if (other.getMaxFileSize() != null && other.getMaxFileSize().equals(this.getMaxFileSize()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDdlArtifactsSchema() == null ^ this.getDdlArtifactsSchema() == null)
            return false;
        if (other.getDdlArtifactsSchema() != null && other.getDdlArtifactsSchema().equals(this.getDdlArtifactsSchema()) == false)
            return false;
        if (other.getExecuteTimeout() == null ^ this.getExecuteTimeout() == null)
            return false;
        if (other.getExecuteTimeout() != null && other.getExecuteTimeout().equals(this.getExecuteTimeout()) == false)
            return false;
        if (other.getFailTasksOnLobTruncation() == null ^ this.getFailTasksOnLobTruncation() == null)
            return false;
        if (other.getFailTasksOnLobTruncation() != null && other.getFailTasksOnLobTruncation().equals(this.getFailTasksOnLobTruncation()) == false)
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
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getSlotName() == null ^ this.getSlotName() == null)
            return false;
        if (other.getSlotName() != null && other.getSlotName().equals(this.getSlotName()) == false)
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
        hashCode = prime * hashCode + ((getCaptureDdls() == null) ? 0 : getCaptureDdls().hashCode());
        hashCode = prime * hashCode + ((getMaxFileSize() == null) ? 0 : getMaxFileSize().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDdlArtifactsSchema() == null) ? 0 : getDdlArtifactsSchema().hashCode());
        hashCode = prime * hashCode + ((getExecuteTimeout() == null) ? 0 : getExecuteTimeout().hashCode());
        hashCode = prime * hashCode + ((getFailTasksOnLobTruncation() == null) ? 0 : getFailTasksOnLobTruncation().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getSlotName() == null) ? 0 : getSlotName().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        return hashCode;
    }

    @Override
    public PostgreSQLSettings clone() {
        try {
            return (PostgreSQLSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.PostgreSQLSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
