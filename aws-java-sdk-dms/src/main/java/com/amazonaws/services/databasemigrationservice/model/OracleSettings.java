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
 * Provides information that defines an Oracle endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/OracleSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OracleSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables
     * PRIMARY KEY supplemental logging on all tables selected for a migration task.
     * </p>
     * <p>
     * If you use this option, you still need to enable database-level supplemental logging.
     * </p>
     */
    private Boolean addSupplementalLogging;
    /**
     * <p>
     * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the
     * v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an
     * archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are
     * accessed from the outset.
     * </p>
     */
    private Integer archivedLogDestId;
    /**
     * <p>
     * Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is useful in
     * the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to
     * read changes. This need arises because the previous primary instance is now a standby instance after switchover.
     * </p>
     */
    private Integer additionalArchivedLogDestId;
    /**
     * <p>
     * Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are nested
     * tables or defined types.
     * </p>
     */
    private Boolean allowSelectNestedTables;
    /**
     * <p>
     * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC)
     * load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default)
     * and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code> attribute.
     * </p>
     */
    private Integer parallelAsmReadThreads;
    /**
     * <p>
     * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture
     * (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the
     * default) and 200,000 (the maximum).
     * </p>
     */
    private Integer readAheadBlocks;
    /**
     * <p>
     * Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path
     * prefix replacement using direct file access.
     * </p>
     */
    private Boolean accessAlternateDirectly;
    /**
     * <p>
     * Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all
     * online redo logs.
     * </p>
     */
    private Boolean useAlternateFolderForOnline;
    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
     * </p>
     */
    private String oraclePathPrefix;
    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root
     * to access the redo logs.
     * </p>
     */
    private String usePathPrefix;
    /**
     * <p>
     * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle
     * as the source. This setting tells DMS instance to replace the default Oracle root with the specified
     * <code>usePathPrefix</code> setting to access the redo logs.
     * </p>
     */
    private Boolean replacePathPrefix;
    /**
     * <p>
     * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the
     * same tablespace on the target.
     * </p>
     */
    private Boolean enableHomogenousTablespace;
    /**
     * <p>
     * When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target database by
     * writing directly to tables and not writing a trail to database logs.
     * </p>
     */
    private Boolean directPathNoLog;
    /**
     * <p>
     * When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived redo logs
     * are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * </p>
     */
    private Boolean archivedLogsOnly;
    /**
     * <p>
     * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value
     * from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the comma-separated value
     * that you set to the <code>Password</code> request parameter when you create the endpoint to access transaction
     * logs using Binary Reader. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     */
    private String asmPassword;
    /**
     * <p>
     * For an Oracle source endpoint, your ASM server address. You can set this value from the <code>asm_server</code>
     * value. You set <code>asm_server</code> as part of the extra connection attribute string to access an Oracle
     * server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     */
    private String asmServer;
    /**
     * <p>
     * For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code> value.
     * You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle server with
     * Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     */
    private String asmUser;
    /**
     * <p>
     * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character
     * column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the character column length
     * is in bytes.
     * </p>
     * <p>
     * Example: <code>charLengthSemantics=CHAR;</code>
     * </p>
     */
    private String charLengthSemantics;
    /**
     * <p>
     * Database name for the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * When set to <code>true</code>, this attribute specifies a parallel load when <code>useDirectPathFullLoad</code>
     * is set to <code>Y</code>. This attribute also only applies when you use the AWS DMS parallel load feature. Note
     * that the target table cannot have any constraints or indexes.
     * </p>
     */
    private Boolean directPathParallelLoad;
    /**
     * <p>
     * When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     * greater than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead of
     * truncating the LOB data.
     * </p>
     */
    private Boolean failTasksOnLobTruncation;
    /**
     * <p>
     * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data
     * type is converted to precision 38, scale 10.
     * </p>
     * <p>
     * Example: <code>numberDataTypeScale=12</code>
     * </p>
     */
    private Integer numberDatatypeScale;
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
     * When set to <code>true</code>, this attribute supports tablespace replication.
     * </p>
     */
    private Boolean readTableSpaceName;
    /**
     * <p>
     * Specifies the number of seconds that the system waits before resending a query.
     * </p>
     * <p>
     * Example: <code>retryInterval=6;</code>
     * </p>
     */
    private Integer retryInterval;
    /**
     * <p>
     * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access
     * Oracle redo logs encrypted by TDE using Binary Reader. It is also the <code> <i>TDE_Password</i> </code> part of
     * the comma-separated value you set to the <code>Password</code> request parameter when you create the endpoint.
     * The <code>SecurityDbEncryptian</code> setting is related to this <code>SecurityDbEncryptionName</code> setting.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     */
    private String securityDbEncryption;
    /**
     * <p>
     * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns
     * and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the
     * <code>SecurityDbEncryption</code> setting. For more information on setting the key name value of
     * <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     * <code>securityDbEncryptionName</code> extra connection attribute in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     */
    private String securityDbEncryptionName;
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
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Oracle endpoint.
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
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Oracle
     * endpoint connection details.
     * </p>
     */
    private String secretsManagerSecretId;
    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role that
     * specifies AWS DMS as the trusted entity and grants the required permissions to access the
     * <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret value
     * that allows access to the Oracle ASM of the endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for <code>AsmUserName</code>,
     * <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify both. For more information on
     * creating this <code>SecretsManagerOracleAsmSecret</code> and the
     * <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code> required to
     * access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     */
    private String secretsManagerOracleAsmAccessRoleArn;
    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or friendly
     * name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection details for the
     * Oracle endpoint.
     * </p>
     */
    private String secretsManagerOracleAsmSecretId;

    /**
     * <p>
     * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables
     * PRIMARY KEY supplemental logging on all tables selected for a migration task.
     * </p>
     * <p>
     * If you use this option, you still need to enable database-level supplemental logging.
     * </p>
     * 
     * @param addSupplementalLogging
     *        Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute
     *        enables PRIMARY KEY supplemental logging on all tables selected for a migration task.</p>
     *        <p>
     *        If you use this option, you still need to enable database-level supplemental logging.
     */

    public void setAddSupplementalLogging(Boolean addSupplementalLogging) {
        this.addSupplementalLogging = addSupplementalLogging;
    }

    /**
     * <p>
     * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables
     * PRIMARY KEY supplemental logging on all tables selected for a migration task.
     * </p>
     * <p>
     * If you use this option, you still need to enable database-level supplemental logging.
     * </p>
     * 
     * @return Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute
     *         enables PRIMARY KEY supplemental logging on all tables selected for a migration task.</p>
     *         <p>
     *         If you use this option, you still need to enable database-level supplemental logging.
     */

    public Boolean getAddSupplementalLogging() {
        return this.addSupplementalLogging;
    }

    /**
     * <p>
     * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables
     * PRIMARY KEY supplemental logging on all tables selected for a migration task.
     * </p>
     * <p>
     * If you use this option, you still need to enable database-level supplemental logging.
     * </p>
     * 
     * @param addSupplementalLogging
     *        Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute
     *        enables PRIMARY KEY supplemental logging on all tables selected for a migration task.</p>
     *        <p>
     *        If you use this option, you still need to enable database-level supplemental logging.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAddSupplementalLogging(Boolean addSupplementalLogging) {
        setAddSupplementalLogging(addSupplementalLogging);
        return this;
    }

    /**
     * <p>
     * Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute enables
     * PRIMARY KEY supplemental logging on all tables selected for a migration task.
     * </p>
     * <p>
     * If you use this option, you still need to enable database-level supplemental logging.
     * </p>
     * 
     * @return Set this attribute to set up table-level supplemental logging for the Oracle database. This attribute
     *         enables PRIMARY KEY supplemental logging on all tables selected for a migration task.</p>
     *         <p>
     *         If you use this option, you still need to enable database-level supplemental logging.
     */

    public Boolean isAddSupplementalLogging() {
        return this.addSupplementalLogging;
    }

    /**
     * <p>
     * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the
     * v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an
     * archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are
     * accessed from the outset.
     * </p>
     * 
     * @param archivedLogDestId
     *        Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in
     *        the v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to
     *        specify an archived redo logs location identifier. Doing this improves performance by ensuring that the
     *        correct logs are accessed from the outset.
     */

    public void setArchivedLogDestId(Integer archivedLogDestId) {
        this.archivedLogDestId = archivedLogDestId;
    }

    /**
     * <p>
     * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the
     * v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an
     * archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are
     * accessed from the outset.
     * </p>
     * 
     * @return Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number
     *         in the v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you
     *         to specify an archived redo logs location identifier. Doing this improves performance by ensuring that
     *         the correct logs are accessed from the outset.
     */

    public Integer getArchivedLogDestId() {
        return this.archivedLogDestId;
    }

    /**
     * <p>
     * Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in the
     * v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to specify an
     * archived redo logs location identifier. Doing this improves performance by ensuring that the correct logs are
     * accessed from the outset.
     * </p>
     * 
     * @param archivedLogDestId
     *        Specifies the destination of the archived redo logs. The value should be the same as the DEST_ID number in
     *        the v$archived_log table. When working with multiple log destinations (DEST_ID), we recommend that you to
     *        specify an archived redo logs location identifier. Doing this improves performance by ensuring that the
     *        correct logs are accessed from the outset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withArchivedLogDestId(Integer archivedLogDestId) {
        setArchivedLogDestId(archivedLogDestId);
        return this;
    }

    /**
     * <p>
     * Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is useful in
     * the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to
     * read changes. This need arises because the previous primary instance is now a standby instance after switchover.
     * </p>
     * 
     * @param additionalArchivedLogDestId
     *        Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is
     *        useful in the case of a switchover. In this case, AWS DMS needs to know which destination to get archive
     *        redo logs from to read changes. This need arises because the previous primary instance is now a standby
     *        instance after switchover.
     */

    public void setAdditionalArchivedLogDestId(Integer additionalArchivedLogDestId) {
        this.additionalArchivedLogDestId = additionalArchivedLogDestId;
    }

    /**
     * <p>
     * Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is useful in
     * the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to
     * read changes. This need arises because the previous primary instance is now a standby instance after switchover.
     * </p>
     * 
     * @return Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is
     *         useful in the case of a switchover. In this case, AWS DMS needs to know which destination to get archive
     *         redo logs from to read changes. This need arises because the previous primary instance is now a standby
     *         instance after switchover.
     */

    public Integer getAdditionalArchivedLogDestId() {
        return this.additionalArchivedLogDestId;
    }

    /**
     * <p>
     * Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is useful in
     * the case of a switchover. In this case, AWS DMS needs to know which destination to get archive redo logs from to
     * read changes. This need arises because the previous primary instance is now a standby instance after switchover.
     * </p>
     * 
     * @param additionalArchivedLogDestId
     *        Set this attribute with <code>archivedLogDestId</code> in a primary/ standby setup. This attribute is
     *        useful in the case of a switchover. In this case, AWS DMS needs to know which destination to get archive
     *        redo logs from to read changes. This need arises because the previous primary instance is now a standby
     *        instance after switchover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAdditionalArchivedLogDestId(Integer additionalArchivedLogDestId) {
        setAdditionalArchivedLogDestId(additionalArchivedLogDestId);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are nested
     * tables or defined types.
     * </p>
     * 
     * @param allowSelectNestedTables
     *        Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are
     *        nested tables or defined types.
     */

    public void setAllowSelectNestedTables(Boolean allowSelectNestedTables) {
        this.allowSelectNestedTables = allowSelectNestedTables;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are nested
     * tables or defined types.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that
     *         are nested tables or defined types.
     */

    public Boolean getAllowSelectNestedTables() {
        return this.allowSelectNestedTables;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are nested
     * tables or defined types.
     * </p>
     * 
     * @param allowSelectNestedTables
     *        Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are
     *        nested tables or defined types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAllowSelectNestedTables(Boolean allowSelectNestedTables) {
        setAllowSelectNestedTables(allowSelectNestedTables);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that are nested
     * tables or defined types.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> to enable replication of Oracle tables containing columns that
     *         are nested tables or defined types.
     */

    public Boolean isAllowSelectNestedTables() {
        return this.allowSelectNestedTables;
    }

    /**
     * <p>
     * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC)
     * load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default)
     * and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code> attribute.
     * </p>
     * 
     * @param parallelAsmReadThreads
     *        Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture
     *        (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2
     *        (the default) and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code>
     *        attribute.
     */

    public void setParallelAsmReadThreads(Integer parallelAsmReadThreads) {
        this.parallelAsmReadThreads = parallelAsmReadThreads;
    }

    /**
     * <p>
     * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC)
     * load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default)
     * and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code> attribute.
     * </p>
     * 
     * @return Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture
     *         (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2
     *         (the default) and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code>
     *         attribute.
     */

    public Integer getParallelAsmReadThreads() {
        return this.parallelAsmReadThreads;
    }

    /**
     * <p>
     * Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture (CDC)
     * load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2 (the default)
     * and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code> attribute.
     * </p>
     * 
     * @param parallelAsmReadThreads
     *        Set this attribute to change the number of threads that DMS configures to perform a Change Data Capture
     *        (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 2
     *        (the default) and 8 (the maximum). Use this attribute together with the <code>readAheadBlocks</code>
     *        attribute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withParallelAsmReadThreads(Integer parallelAsmReadThreads) {
        setParallelAsmReadThreads(parallelAsmReadThreads);
        return this;
    }

    /**
     * <p>
     * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture
     * (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the
     * default) and 200,000 (the maximum).
     * </p>
     * 
     * @param readAheadBlocks
     *        Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data
     *        Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value
     *        between 1000 (the default) and 200,000 (the maximum).
     */

    public void setReadAheadBlocks(Integer readAheadBlocks) {
        this.readAheadBlocks = readAheadBlocks;
    }

    /**
     * <p>
     * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture
     * (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the
     * default) and 200,000 (the maximum).
     * </p>
     * 
     * @return Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data
     *         Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value
     *         between 1000 (the default) and 200,000 (the maximum).
     */

    public Integer getReadAheadBlocks() {
        return this.readAheadBlocks;
    }

    /**
     * <p>
     * Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data Capture
     * (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value between 1000 (the
     * default) and 200,000 (the maximum).
     * </p>
     * 
     * @param readAheadBlocks
     *        Set this attribute to change the number of read-ahead blocks that DMS configures to perform a Change Data
     *        Capture (CDC) load using Oracle Automatic Storage Management (ASM). You can specify an integer value
     *        between 1000 (the default) and 200,000 (the maximum).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withReadAheadBlocks(Integer readAheadBlocks) {
        setReadAheadBlocks(readAheadBlocks);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path
     * prefix replacement using direct file access.
     * </p>
     * 
     * @param accessAlternateDirectly
     *        Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an
     *        Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any
     *        specified path prefix replacement using direct file access.
     */

    public void setAccessAlternateDirectly(Boolean accessAlternateDirectly) {
        this.accessAlternateDirectly = accessAlternateDirectly;
    }

    /**
     * <p>
     * Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path
     * prefix replacement using direct file access.
     * </p>
     * 
     * @return Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an
     *         Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any
     *         specified path prefix replacement using direct file access.
     */

    public Boolean getAccessAlternateDirectly() {
        return this.accessAlternateDirectly;
    }

    /**
     * <p>
     * Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path
     * prefix replacement using direct file access.
     * </p>
     * 
     * @param accessAlternateDirectly
     *        Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an
     *        Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any
     *        specified path prefix replacement using direct file access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAccessAlternateDirectly(Boolean accessAlternateDirectly) {
        setAccessAlternateDirectly(accessAlternateDirectly);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any specified path
     * prefix replacement using direct file access.
     * </p>
     * 
     * @return Set this attribute to <code>false</code> in order to use the Binary Reader to capture change data for an
     *         Amazon RDS for Oracle as the source. This tells the DMS instance to not access redo logs through any
     *         specified path prefix replacement using direct file access.
     */

    public Boolean isAccessAlternateDirectly() {
        return this.accessAlternateDirectly;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all
     * online redo logs.
     * </p>
     * 
     * @param useAlternateFolderForOnline
     *        Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an
     *        Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement
     *        to access all online redo logs.
     */

    public void setUseAlternateFolderForOnline(Boolean useAlternateFolderForOnline) {
        this.useAlternateFolderForOnline = useAlternateFolderForOnline;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all
     * online redo logs.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an
     *         Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement
     *         to access all online redo logs.
     */

    public Boolean getUseAlternateFolderForOnline() {
        return this.useAlternateFolderForOnline;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all
     * online redo logs.
     * </p>
     * 
     * @param useAlternateFolderForOnline
     *        Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an
     *        Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement
     *        to access all online redo logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withUseAlternateFolderForOnline(Boolean useAlternateFolderForOnline) {
        setUseAlternateFolderForOnline(useAlternateFolderForOnline);
        return this;
    }

    /**
     * <p>
     * Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an Amazon
     * RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement to access all
     * online redo logs.
     * </p>
     * 
     * @return Set this attribute to <code>true</code> in order to use the Binary Reader to capture change data for an
     *         Amazon RDS for Oracle as the source. This tells the DMS instance to use any specified prefix replacement
     *         to access all online redo logs.
     */

    public Boolean isUseAlternateFolderForOnline() {
        return this.useAlternateFolderForOnline;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
     * </p>
     * 
     * @param oraclePathPrefix
     *        Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *        for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access
     *        the redo logs.
     */

    public void setOraclePathPrefix(String oraclePathPrefix) {
        this.oraclePathPrefix = oraclePathPrefix;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
     * </p>
     * 
     * @return Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *         for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access
     *         the redo logs.
     */

    public String getOraclePathPrefix() {
        return this.oraclePathPrefix;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access the redo logs.
     * </p>
     * 
     * @param oraclePathPrefix
     *        Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *        for an Amazon RDS for Oracle as the source. This value specifies the default Oracle root used to access
     *        the redo logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withOraclePathPrefix(String oraclePathPrefix) {
        setOraclePathPrefix(oraclePathPrefix);
        return this;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root
     * to access the redo logs.
     * </p>
     * 
     * @param usePathPrefix
     *        Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *        for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the
     *        default Oracle root to access the redo logs.
     */

    public void setUsePathPrefix(String usePathPrefix) {
        this.usePathPrefix = usePathPrefix;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root
     * to access the redo logs.
     * </p>
     * 
     * @return Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *         for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the
     *         default Oracle root to access the redo logs.
     */

    public String getUsePathPrefix() {
        return this.usePathPrefix;
    }

    /**
     * <p>
     * Set this string attribute to the required value in order to use the Binary Reader to capture change data for an
     * Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the default Oracle root
     * to access the redo logs.
     * </p>
     * 
     * @param usePathPrefix
     *        Set this string attribute to the required value in order to use the Binary Reader to capture change data
     *        for an Amazon RDS for Oracle as the source. This value specifies the path prefix used to replace the
     *        default Oracle root to access the redo logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withUsePathPrefix(String usePathPrefix) {
        setUsePathPrefix(usePathPrefix);
        return this;
    }

    /**
     * <p>
     * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle
     * as the source. This setting tells DMS instance to replace the default Oracle root with the specified
     * <code>usePathPrefix</code> setting to access the redo logs.
     * </p>
     * 
     * @param replacePathPrefix
     *        Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for
     *        Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the
     *        specified <code>usePathPrefix</code> setting to access the redo logs.
     */

    public void setReplacePathPrefix(Boolean replacePathPrefix) {
        this.replacePathPrefix = replacePathPrefix;
    }

    /**
     * <p>
     * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle
     * as the source. This setting tells DMS instance to replace the default Oracle root with the specified
     * <code>usePathPrefix</code> setting to access the redo logs.
     * </p>
     * 
     * @return Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for
     *         Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the
     *         specified <code>usePathPrefix</code> setting to access the redo logs.
     */

    public Boolean getReplacePathPrefix() {
        return this.replacePathPrefix;
    }

    /**
     * <p>
     * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle
     * as the source. This setting tells DMS instance to replace the default Oracle root with the specified
     * <code>usePathPrefix</code> setting to access the redo logs.
     * </p>
     * 
     * @param replacePathPrefix
     *        Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for
     *        Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the
     *        specified <code>usePathPrefix</code> setting to access the redo logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withReplacePathPrefix(Boolean replacePathPrefix) {
        setReplacePathPrefix(replacePathPrefix);
        return this;
    }

    /**
     * <p>
     * Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for Oracle
     * as the source. This setting tells DMS instance to replace the default Oracle root with the specified
     * <code>usePathPrefix</code> setting to access the redo logs.
     * </p>
     * 
     * @return Set this attribute to true in order to use the Binary Reader to capture change data for an Amazon RDS for
     *         Oracle as the source. This setting tells DMS instance to replace the default Oracle root with the
     *         specified <code>usePathPrefix</code> setting to access the redo logs.
     */

    public Boolean isReplacePathPrefix() {
        return this.replacePathPrefix;
    }

    /**
     * <p>
     * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the
     * same tablespace on the target.
     * </p>
     * 
     * @param enableHomogenousTablespace
     *        Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under
     *        the same tablespace on the target.
     */

    public void setEnableHomogenousTablespace(Boolean enableHomogenousTablespace) {
        this.enableHomogenousTablespace = enableHomogenousTablespace;
    }

    /**
     * <p>
     * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the
     * same tablespace on the target.
     * </p>
     * 
     * @return Set this attribute to enable homogenous tablespace replication and create existing tables or indexes
     *         under the same tablespace on the target.
     */

    public Boolean getEnableHomogenousTablespace() {
        return this.enableHomogenousTablespace;
    }

    /**
     * <p>
     * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the
     * same tablespace on the target.
     * </p>
     * 
     * @param enableHomogenousTablespace
     *        Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under
     *        the same tablespace on the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withEnableHomogenousTablespace(Boolean enableHomogenousTablespace) {
        setEnableHomogenousTablespace(enableHomogenousTablespace);
        return this;
    }

    /**
     * <p>
     * Set this attribute to enable homogenous tablespace replication and create existing tables or indexes under the
     * same tablespace on the target.
     * </p>
     * 
     * @return Set this attribute to enable homogenous tablespace replication and create existing tables or indexes
     *         under the same tablespace on the target.
     */

    public Boolean isEnableHomogenousTablespace() {
        return this.enableHomogenousTablespace;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target database by
     * writing directly to tables and not writing a trail to database logs.
     * </p>
     * 
     * @param directPathNoLog
     *        When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target
     *        database by writing directly to tables and not writing a trail to database logs.
     */

    public void setDirectPathNoLog(Boolean directPathNoLog) {
        this.directPathNoLog = directPathNoLog;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target database by
     * writing directly to tables and not writing a trail to database logs.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target
     *         database by writing directly to tables and not writing a trail to database logs.
     */

    public Boolean getDirectPathNoLog() {
        return this.directPathNoLog;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target database by
     * writing directly to tables and not writing a trail to database logs.
     * </p>
     * 
     * @param directPathNoLog
     *        When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target
     *        database by writing directly to tables and not writing a trail to database logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withDirectPathNoLog(Boolean directPathNoLog) {
        setDirectPathNoLog(directPathNoLog);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target database by
     * writing directly to tables and not writing a trail to database logs.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute helps to increase the commit rate on the Oracle target
     *         database by writing directly to tables and not writing a trail to database logs.
     */

    public Boolean isDirectPathNoLog() {
        return this.directPathNoLog;
    }

    /**
     * <p>
     * When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived redo logs
     * are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * </p>
     * 
     * @param archivedLogsOnly
     *        When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived
     *        redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     */

    public void setArchivedLogsOnly(Boolean archivedLogsOnly) {
        this.archivedLogsOnly = archivedLogsOnly;
    }

    /**
     * <p>
     * When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived redo logs
     * are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * </p>
     * 
     * @return When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived
     *         redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     */

    public Boolean getArchivedLogsOnly() {
        return this.archivedLogsOnly;
    }

    /**
     * <p>
     * When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived redo logs
     * are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * </p>
     * 
     * @param archivedLogsOnly
     *        When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived
     *        redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withArchivedLogsOnly(Boolean archivedLogsOnly) {
        setArchivedLogsOnly(archivedLogsOnly);
        return this;
    }

    /**
     * <p>
     * When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived redo logs
     * are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     * </p>
     * 
     * @return When this field is set to <code>Y</code>, AWS DMS only accesses the archived redo logs. If the archived
     *         redo logs are stored on Oracle ASM only, the AWS DMS user account needs to be granted ASM privileges.
     */

    public Boolean isArchivedLogsOnly() {
        return this.archivedLogsOnly;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value
     * from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the comma-separated value
     * that you set to the <code>Password</code> request parameter when you create the endpoint to access transaction
     * logs using Binary Reader. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmPassword
     *        For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this
     *        value from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the
     *        comma-separated value that you set to the <code>Password</code> request parameter when you create the
     *        endpoint to access transaction logs using Binary Reader. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public void setAsmPassword(String asmPassword) {
        this.asmPassword = asmPassword;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value
     * from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the comma-separated value
     * that you set to the <code>Password</code> request parameter when you create the endpoint to access transaction
     * logs using Binary Reader. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @return For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this
     *         value from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the
     *         comma-separated value that you set to the <code>Password</code> request parameter when you create the
     *         endpoint to access transaction logs using Binary Reader. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *         >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public String getAsmPassword() {
        return this.asmPassword;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this value
     * from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the comma-separated value
     * that you set to the <code>Password</code> request parameter when you create the endpoint to access transaction
     * logs using Binary Reader. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmPassword
     *        For an Oracle source endpoint, your Oracle Automatic Storage Management (ASM) password. You can set this
     *        value from the <code> <i>asm_user_password</i> </code> value. You set this value as part of the
     *        comma-separated value that you set to the <code>Password</code> request parameter when you create the
     *        endpoint to access transaction logs using Binary Reader. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAsmPassword(String asmPassword) {
        setAsmPassword(asmPassword);
        return this;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM server address. You can set this value from the <code>asm_server</code>
     * value. You set <code>asm_server</code> as part of the extra connection attribute string to access an Oracle
     * server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmServer
     *        For an Oracle source endpoint, your ASM server address. You can set this value from the
     *        <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *        string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public void setAsmServer(String asmServer) {
        this.asmServer = asmServer;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM server address. You can set this value from the <code>asm_server</code>
     * value. You set <code>asm_server</code> as part of the extra connection attribute string to access an Oracle
     * server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @return For an Oracle source endpoint, your ASM server address. You can set this value from the
     *         <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *         string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *         >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public String getAsmServer() {
        return this.asmServer;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM server address. You can set this value from the <code>asm_server</code>
     * value. You set <code>asm_server</code> as part of the extra connection attribute string to access an Oracle
     * server with Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmServer
     *        For an Oracle source endpoint, your ASM server address. You can set this value from the
     *        <code>asm_server</code> value. You set <code>asm_server</code> as part of the extra connection attribute
     *        string to access an Oracle server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAsmServer(String asmServer) {
        setAsmServer(asmServer);
        return this;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code> value.
     * You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle server with
     * Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmUser
     *        For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code>
     *        value. You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle
     *        server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public void setAsmUser(String asmUser) {
        this.asmUser = asmUser;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code> value.
     * You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle server with
     * Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @return For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code>
     *         value. You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle
     *         server with Binary Reader that uses ASM. For more information, see <a href=
     *         "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *         >Configuration for change data capture (CDC) on an Oracle source database</a>.
     */

    public String getAsmUser() {
        return this.asmUser;
    }

    /**
     * <p>
     * For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code> value.
     * You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle server with
     * Binary Reader that uses ASM. For more information, see <a href=
     * "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     * >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * </p>
     * 
     * @param asmUser
     *        For an Oracle source endpoint, your ASM user name. You can set this value from the <code>asm_user</code>
     *        value. You set <code>asm_user</code> as part of the extra connection attribute string to access an Oracle
     *        server with Binary Reader that uses ASM. For more information, see <a href=
     *        "https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.CDC.Configuration"
     *        >Configuration for change data capture (CDC) on an Oracle source database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withAsmUser(String asmUser) {
        setAsmUser(asmUser);
        return this;
    }

    /**
     * <p>
     * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character
     * column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the character column length
     * is in bytes.
     * </p>
     * <p>
     * Example: <code>charLengthSemantics=CHAR;</code>
     * </p>
     * 
     * @param charLengthSemantics
     *        Specifies whether the length of a character column is in bytes or in characters. To indicate that the
     *        character column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the
     *        character column length is in bytes.</p>
     *        <p>
     *        Example: <code>charLengthSemantics=CHAR;</code>
     * @see CharLengthSemantics
     */

    public void setCharLengthSemantics(String charLengthSemantics) {
        this.charLengthSemantics = charLengthSemantics;
    }

    /**
     * <p>
     * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character
     * column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the character column length
     * is in bytes.
     * </p>
     * <p>
     * Example: <code>charLengthSemantics=CHAR;</code>
     * </p>
     * 
     * @return Specifies whether the length of a character column is in bytes or in characters. To indicate that the
     *         character column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the
     *         character column length is in bytes.</p>
     *         <p>
     *         Example: <code>charLengthSemantics=CHAR;</code>
     * @see CharLengthSemantics
     */

    public String getCharLengthSemantics() {
        return this.charLengthSemantics;
    }

    /**
     * <p>
     * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character
     * column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the character column length
     * is in bytes.
     * </p>
     * <p>
     * Example: <code>charLengthSemantics=CHAR;</code>
     * </p>
     * 
     * @param charLengthSemantics
     *        Specifies whether the length of a character column is in bytes or in characters. To indicate that the
     *        character column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the
     *        character column length is in bytes.</p>
     *        <p>
     *        Example: <code>charLengthSemantics=CHAR;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CharLengthSemantics
     */

    public OracleSettings withCharLengthSemantics(String charLengthSemantics) {
        setCharLengthSemantics(charLengthSemantics);
        return this;
    }

    /**
     * <p>
     * Specifies whether the length of a character column is in bytes or in characters. To indicate that the character
     * column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the character column length
     * is in bytes.
     * </p>
     * <p>
     * Example: <code>charLengthSemantics=CHAR;</code>
     * </p>
     * 
     * @param charLengthSemantics
     *        Specifies whether the length of a character column is in bytes or in characters. To indicate that the
     *        character column length is in characters, set this attribute to <code>CHAR</code>. Otherwise, the
     *        character column length is in bytes.</p>
     *        <p>
     *        Example: <code>charLengthSemantics=CHAR;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CharLengthSemantics
     */

    public OracleSettings withCharLengthSemantics(CharLengthSemantics charLengthSemantics) {
        this.charLengthSemantics = charLengthSemantics.toString();
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

    public OracleSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute specifies a parallel load when <code>useDirectPathFullLoad</code>
     * is set to <code>Y</code>. This attribute also only applies when you use the AWS DMS parallel load feature. Note
     * that the target table cannot have any constraints or indexes.
     * </p>
     * 
     * @param directPathParallelLoad
     *        When set to <code>true</code>, this attribute specifies a parallel load when
     *        <code>useDirectPathFullLoad</code> is set to <code>Y</code>. This attribute also only applies when you use
     *        the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
     */

    public void setDirectPathParallelLoad(Boolean directPathParallelLoad) {
        this.directPathParallelLoad = directPathParallelLoad;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute specifies a parallel load when <code>useDirectPathFullLoad</code>
     * is set to <code>Y</code>. This attribute also only applies when you use the AWS DMS parallel load feature. Note
     * that the target table cannot have any constraints or indexes.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute specifies a parallel load when
     *         <code>useDirectPathFullLoad</code> is set to <code>Y</code>. This attribute also only applies when you
     *         use the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
     */

    public Boolean getDirectPathParallelLoad() {
        return this.directPathParallelLoad;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute specifies a parallel load when <code>useDirectPathFullLoad</code>
     * is set to <code>Y</code>. This attribute also only applies when you use the AWS DMS parallel load feature. Note
     * that the target table cannot have any constraints or indexes.
     * </p>
     * 
     * @param directPathParallelLoad
     *        When set to <code>true</code>, this attribute specifies a parallel load when
     *        <code>useDirectPathFullLoad</code> is set to <code>Y</code>. This attribute also only applies when you use
     *        the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withDirectPathParallelLoad(Boolean directPathParallelLoad) {
        setDirectPathParallelLoad(directPathParallelLoad);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute specifies a parallel load when <code>useDirectPathFullLoad</code>
     * is set to <code>Y</code>. This attribute also only applies when you use the AWS DMS parallel load feature. Note
     * that the target table cannot have any constraints or indexes.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute specifies a parallel load when
     *         <code>useDirectPathFullLoad</code> is set to <code>Y</code>. This attribute also only applies when you
     *         use the AWS DMS parallel load feature. Note that the target table cannot have any constraints or indexes.
     */

    public Boolean isDirectPathParallelLoad() {
        return this.directPathParallelLoad;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     * greater than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead of
     * truncating the LOB data.
     * </p>
     * 
     * @param failTasksOnLobTruncation
     *        When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     *        greater than the specified <code>LobMaxSize</code>.</p>
     *        <p>
     *        If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead
     *        of truncating the LOB data.
     */

    public void setFailTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
        this.failTasksOnLobTruncation = failTasksOnLobTruncation;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     * greater than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead of
     * truncating the LOB data.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column
     *         is greater than the specified <code>LobMaxSize</code>.</p>
     *         <p>
     *         If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead
     *         of truncating the LOB data.
     */

    public Boolean getFailTasksOnLobTruncation() {
        return this.failTasksOnLobTruncation;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     * greater than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead of
     * truncating the LOB data.
     * </p>
     * 
     * @param failTasksOnLobTruncation
     *        When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     *        greater than the specified <code>LobMaxSize</code>.</p>
     *        <p>
     *        If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead
     *        of truncating the LOB data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withFailTasksOnLobTruncation(Boolean failTasksOnLobTruncation) {
        setFailTasksOnLobTruncation(failTasksOnLobTruncation);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column is
     * greater than the specified <code>LobMaxSize</code>.
     * </p>
     * <p>
     * If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead of
     * truncating the LOB data.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute causes a task to fail if the actual size of an LOB column
     *         is greater than the specified <code>LobMaxSize</code>.</p>
     *         <p>
     *         If a task is set to limited LOB mode and this option is set to <code>true</code>, the task fails instead
     *         of truncating the LOB data.
     */

    public Boolean isFailTasksOnLobTruncation() {
        return this.failTasksOnLobTruncation;
    }

    /**
     * <p>
     * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data
     * type is converted to precision 38, scale 10.
     * </p>
     * <p>
     * Example: <code>numberDataTypeScale=12</code>
     * </p>
     * 
     * @param numberDatatypeScale
     *        Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the
     *        NUMBER data type is converted to precision 38, scale 10.</p>
     *        <p>
     *        Example: <code>numberDataTypeScale=12</code>
     */

    public void setNumberDatatypeScale(Integer numberDatatypeScale) {
        this.numberDatatypeScale = numberDatatypeScale;
    }

    /**
     * <p>
     * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data
     * type is converted to precision 38, scale 10.
     * </p>
     * <p>
     * Example: <code>numberDataTypeScale=12</code>
     * </p>
     * 
     * @return Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the
     *         NUMBER data type is converted to precision 38, scale 10.</p>
     *         <p>
     *         Example: <code>numberDataTypeScale=12</code>
     */

    public Integer getNumberDatatypeScale() {
        return this.numberDatatypeScale;
    }

    /**
     * <p>
     * Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the NUMBER data
     * type is converted to precision 38, scale 10.
     * </p>
     * <p>
     * Example: <code>numberDataTypeScale=12</code>
     * </p>
     * 
     * @param numberDatatypeScale
     *        Specifies the number scale. You can select a scale up to 38, or you can select FLOAT. By default, the
     *        NUMBER data type is converted to precision 38, scale 10.</p>
     *        <p>
     *        Example: <code>numberDataTypeScale=12</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withNumberDatatypeScale(Integer numberDatatypeScale) {
        setNumberDatatypeScale(numberDatatypeScale);
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

    public OracleSettings withPassword(String password) {
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

    public OracleSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute supports tablespace replication.
     * </p>
     * 
     * @param readTableSpaceName
     *        When set to <code>true</code>, this attribute supports tablespace replication.
     */

    public void setReadTableSpaceName(Boolean readTableSpaceName) {
        this.readTableSpaceName = readTableSpaceName;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute supports tablespace replication.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute supports tablespace replication.
     */

    public Boolean getReadTableSpaceName() {
        return this.readTableSpaceName;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute supports tablespace replication.
     * </p>
     * 
     * @param readTableSpaceName
     *        When set to <code>true</code>, this attribute supports tablespace replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withReadTableSpaceName(Boolean readTableSpaceName) {
        setReadTableSpaceName(readTableSpaceName);
        return this;
    }

    /**
     * <p>
     * When set to <code>true</code>, this attribute supports tablespace replication.
     * </p>
     * 
     * @return When set to <code>true</code>, this attribute supports tablespace replication.
     */

    public Boolean isReadTableSpaceName() {
        return this.readTableSpaceName;
    }

    /**
     * <p>
     * Specifies the number of seconds that the system waits before resending a query.
     * </p>
     * <p>
     * Example: <code>retryInterval=6;</code>
     * </p>
     * 
     * @param retryInterval
     *        Specifies the number of seconds that the system waits before resending a query.</p>
     *        <p>
     *        Example: <code>retryInterval=6;</code>
     */

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    /**
     * <p>
     * Specifies the number of seconds that the system waits before resending a query.
     * </p>
     * <p>
     * Example: <code>retryInterval=6;</code>
     * </p>
     * 
     * @return Specifies the number of seconds that the system waits before resending a query.</p>
     *         <p>
     *         Example: <code>retryInterval=6;</code>
     */

    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * <p>
     * Specifies the number of seconds that the system waits before resending a query.
     * </p>
     * <p>
     * Example: <code>retryInterval=6;</code>
     * </p>
     * 
     * @param retryInterval
     *        Specifies the number of seconds that the system waits before resending a query.</p>
     *        <p>
     *        Example: <code>retryInterval=6;</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withRetryInterval(Integer retryInterval) {
        setRetryInterval(retryInterval);
        return this;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access
     * Oracle redo logs encrypted by TDE using Binary Reader. It is also the <code> <i>TDE_Password</i> </code> part of
     * the comma-separated value you set to the <code>Password</code> request parameter when you create the endpoint.
     * The <code>SecurityDbEncryptian</code> setting is related to this <code>SecurityDbEncryptionName</code> setting.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param securityDbEncryption
     *        For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to
     *        access Oracle redo logs encrypted by TDE using Binary Reader. It is also the
     *        <code> <i>TDE_Password</i> </code> part of the comma-separated value you set to the <code>Password</code>
     *        request parameter when you create the endpoint. The <code>SecurityDbEncryptian</code> setting is related
     *        to this <code>SecurityDbEncryptionName</code> setting. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *        > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide</i>.
     */

    public void setSecurityDbEncryption(String securityDbEncryption) {
        this.securityDbEncryption = securityDbEncryption;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access
     * Oracle redo logs encrypted by TDE using Binary Reader. It is also the <code> <i>TDE_Password</i> </code> part of
     * the comma-separated value you set to the <code>Password</code> request parameter when you create the endpoint.
     * The <code>SecurityDbEncryptian</code> setting is related to this <code>SecurityDbEncryptionName</code> setting.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @return For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to
     *         access Oracle redo logs encrypted by TDE using Binary Reader. It is also the
     *         <code> <i>TDE_Password</i> </code> part of the comma-separated value you set to the <code>Password</code>
     *         request parameter when you create the endpoint. The <code>SecurityDbEncryptian</code> setting is related
     *         to this <code>SecurityDbEncryptionName</code> setting. For more information, see <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *         > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *         Migration Service User Guide</i>.
     */

    public String getSecurityDbEncryption() {
        return this.securityDbEncryption;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to access
     * Oracle redo logs encrypted by TDE using Binary Reader. It is also the <code> <i>TDE_Password</i> </code> part of
     * the comma-separated value you set to the <code>Password</code> request parameter when you create the endpoint.
     * The <code>SecurityDbEncryptian</code> setting is related to this <code>SecurityDbEncryptionName</code> setting.
     * For more information, see <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param securityDbEncryption
     *        For an Oracle source endpoint, the transparent data encryption (TDE) password required by AWM DMS to
     *        access Oracle redo logs encrypted by TDE using Binary Reader. It is also the
     *        <code> <i>TDE_Password</i> </code> part of the comma-separated value you set to the <code>Password</code>
     *        request parameter when you create the endpoint. The <code>SecurityDbEncryptian</code> setting is related
     *        to this <code>SecurityDbEncryptionName</code> setting. For more information, see <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *        > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withSecurityDbEncryption(String securityDbEncryption) {
        setSecurityDbEncryption(securityDbEncryption);
        return this;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns
     * and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the
     * <code>SecurityDbEncryption</code> setting. For more information on setting the key name value of
     * <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     * <code>securityDbEncryptionName</code> extra connection attribute in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param securityDbEncryptionName
     *        For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the
     *        columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the
     *        value of the <code>SecurityDbEncryption</code> setting. For more information on setting the key name value
     *        of <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     *        <code>securityDbEncryptionName</code> extra connection attribute in <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *        > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide</i>.
     */

    public void setSecurityDbEncryptionName(String securityDbEncryptionName) {
        this.securityDbEncryptionName = securityDbEncryptionName;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns
     * and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the
     * <code>SecurityDbEncryption</code> setting. For more information on setting the key name value of
     * <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     * <code>securityDbEncryptionName</code> extra connection attribute in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @return For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the
     *         columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the
     *         value of the <code>SecurityDbEncryption</code> setting. For more information on setting the key name
     *         value of <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     *         <code>securityDbEncryptionName</code> extra connection attribute in <a
     *         href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *         > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *         Migration Service User Guide</i>.
     */

    public String getSecurityDbEncryptionName() {
        return this.securityDbEncryptionName;
    }

    /**
     * <p>
     * For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the columns
     * and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the value of the
     * <code>SecurityDbEncryption</code> setting. For more information on setting the key name value of
     * <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     * <code>securityDbEncryptionName</code> extra connection attribute in <a
     * href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption">
     * Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database Migration
     * Service User Guide</i>.
     * </p>
     * 
     * @param securityDbEncryptionName
     *        For an Oracle source endpoint, the name of a key used for the transparent data encryption (TDE) of the
     *        columns and tablespaces in an Oracle source database that is encrypted using TDE. The key value is the
     *        value of the <code>SecurityDbEncryption</code> setting. For more information on setting the key name value
     *        of <code>SecurityDbEncryptionName</code>, see the information and example for setting the
     *        <code>securityDbEncryptionName</code> extra connection attribute in <a
     *        href="https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.Oracle.html#CHAP_Source.Oracle.Encryption"
     *        > Supported encryption methods for using Oracle as a source for AWS DMS</a> in the <i>AWS Database
     *        Migration Service User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withSecurityDbEncryptionName(String securityDbEncryptionName) {
        setSecurityDbEncryptionName(securityDbEncryptionName);
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

    public OracleSettings withServerName(String serverName) {
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

    public OracleSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the Oracle endpoint.
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
     *        the Oracle endpoint.</p> <note>
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
     * has the value of the AWS Secrets Manager secret that allows access to the Oracle endpoint.
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
     *         the Oracle endpoint.</p> <note>
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
     * has the value of the AWS Secrets Manager secret that allows access to the Oracle endpoint.
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
     *        the Oracle endpoint.</p> <note>
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

    public OracleSettings withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Oracle
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        Oracle endpoint connection details.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Oracle
     * endpoint connection details.
     * </p>
     * 
     * @return The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *         Oracle endpoint connection details.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the Oracle
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        Oracle endpoint connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withSecretsManagerSecretId(String secretsManagerSecretId) {
        setSecretsManagerSecretId(secretsManagerSecretId);
        return this;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role that
     * specifies AWS DMS as the trusted entity and grants the required permissions to access the
     * <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret value
     * that allows access to the Oracle ASM of the endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for <code>AsmUserName</code>,
     * <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify both. For more information on
     * creating this <code>SecretsManagerOracleAsmSecret</code> and the
     * <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code> required to
     * access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerOracleAsmAccessRoleArn
     *        Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role
     *        that specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *        <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret
     *        value that allows access to the Oracle ASM of the endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for
     *        <code>AsmUserName</code>, <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify
     *        both. For more information on creating this <code>SecretsManagerOracleAsmSecret</code> and the
     *        <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code>
     *        required to access it, see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     */

    public void setSecretsManagerOracleAsmAccessRoleArn(String secretsManagerOracleAsmAccessRoleArn) {
        this.secretsManagerOracleAsmAccessRoleArn = secretsManagerOracleAsmAccessRoleArn;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role that
     * specifies AWS DMS as the trusted entity and grants the required permissions to access the
     * <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret value
     * that allows access to the Oracle ASM of the endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for <code>AsmUserName</code>,
     * <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify both. For more information on
     * creating this <code>SecretsManagerOracleAsmSecret</code> and the
     * <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code> required to
     * access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @return Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role
     *         that specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *         <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the
     *         secret value that allows access to the Oracle ASM of the endpoint.</p> <note>
     *         <p>
     *         You can specify one of two sets of values for these permissions. You can specify the values for this
     *         setting and <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for
     *         <code>AsmUserName</code>, <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify
     *         both. For more information on creating this <code>SecretsManagerOracleAsmSecret</code> and the
     *         <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code>
     *         required to access it, see <a href=
     *         "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *         >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *         Service User Guide</i>.
     *         </p>
     */

    public String getSecretsManagerOracleAsmAccessRoleArn() {
        return this.secretsManagerOracleAsmAccessRoleArn;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role that
     * specifies AWS DMS as the trusted entity and grants the required permissions to access the
     * <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret value
     * that allows access to the Oracle ASM of the endpoint.
     * </p>
     * <note>
     * <p>
     * You can specify one of two sets of values for these permissions. You can specify the values for this setting and
     * <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for <code>AsmUserName</code>,
     * <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify both. For more information on
     * creating this <code>SecretsManagerOracleAsmSecret</code> and the
     * <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code> required to
     * access it, see <a href=
     * "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     * >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration Service
     * User Guide</i>.
     * </p>
     * </note>
     * 
     * @param secretsManagerOracleAsmAccessRoleArn
     *        Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN of the IAM role
     *        that specifies AWS DMS as the trusted entity and grants the required permissions to access the
     *        <code>SecretsManagerOracleAsmSecret</code>. This <code>SecretsManagerOracleAsmSecret</code> has the secret
     *        value that allows access to the Oracle ASM of the endpoint.</p> <note>
     *        <p>
     *        You can specify one of two sets of values for these permissions. You can specify the values for this
     *        setting and <code>SecretsManagerOracleAsmSecretId</code>. Or you can specify clear-text values for
     *        <code>AsmUserName</code>, <code>AsmPassword</code>, and <code>AsmServerName</code>. You can't specify
     *        both. For more information on creating this <code>SecretsManagerOracleAsmSecret</code> and the
     *        <code>SecretsManagerOracleAsmAccessRoleArn</code> and <code>SecretsManagerOracleAsmSecretId</code>
     *        required to access it, see <a href=
     *        "https://docs.aws.amazon.com/https:/docs.aws.amazon.com/dms/latest/userguide/CHAP_Security.html#security-iam-secretsmanager"
     *        >Using secrets to access AWS Database Migration Service resources</a> in the <i>AWS Database Migration
     *        Service User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withSecretsManagerOracleAsmAccessRoleArn(String secretsManagerOracleAsmAccessRoleArn) {
        setSecretsManagerOracleAsmAccessRoleArn(secretsManagerOracleAsmAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or friendly
     * name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection details for the
     * Oracle endpoint.
     * </p>
     * 
     * @param secretsManagerOracleAsmSecretId
     *        Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or
     *        friendly name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection
     *        details for the Oracle endpoint.
     */

    public void setSecretsManagerOracleAsmSecretId(String secretsManagerOracleAsmSecretId) {
        this.secretsManagerOracleAsmSecretId = secretsManagerOracleAsmSecretId;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or friendly
     * name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection details for the
     * Oracle endpoint.
     * </p>
     * 
     * @return Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or
     *         friendly name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection
     *         details for the Oracle endpoint.
     */

    public String getSecretsManagerOracleAsmSecretId() {
        return this.secretsManagerOracleAsmSecretId;
    }

    /**
     * <p>
     * Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or friendly
     * name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection details for the
     * Oracle endpoint.
     * </p>
     * 
     * @param secretsManagerOracleAsmSecretId
     *        Required only if your Oracle endpoint uses Advanced Storage Manager (ASM). The full ARN, partial ARN, or
     *        friendly name of the <code>SecretsManagerOracleAsmSecret</code> that contains the Oracle ASM connection
     *        details for the Oracle endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OracleSettings withSecretsManagerOracleAsmSecretId(String secretsManagerOracleAsmSecretId) {
        setSecretsManagerOracleAsmSecretId(secretsManagerOracleAsmSecretId);
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
        if (getAddSupplementalLogging() != null)
            sb.append("AddSupplementalLogging: ").append(getAddSupplementalLogging()).append(",");
        if (getArchivedLogDestId() != null)
            sb.append("ArchivedLogDestId: ").append(getArchivedLogDestId()).append(",");
        if (getAdditionalArchivedLogDestId() != null)
            sb.append("AdditionalArchivedLogDestId: ").append(getAdditionalArchivedLogDestId()).append(",");
        if (getAllowSelectNestedTables() != null)
            sb.append("AllowSelectNestedTables: ").append(getAllowSelectNestedTables()).append(",");
        if (getParallelAsmReadThreads() != null)
            sb.append("ParallelAsmReadThreads: ").append(getParallelAsmReadThreads()).append(",");
        if (getReadAheadBlocks() != null)
            sb.append("ReadAheadBlocks: ").append(getReadAheadBlocks()).append(",");
        if (getAccessAlternateDirectly() != null)
            sb.append("AccessAlternateDirectly: ").append(getAccessAlternateDirectly()).append(",");
        if (getUseAlternateFolderForOnline() != null)
            sb.append("UseAlternateFolderForOnline: ").append(getUseAlternateFolderForOnline()).append(",");
        if (getOraclePathPrefix() != null)
            sb.append("OraclePathPrefix: ").append(getOraclePathPrefix()).append(",");
        if (getUsePathPrefix() != null)
            sb.append("UsePathPrefix: ").append(getUsePathPrefix()).append(",");
        if (getReplacePathPrefix() != null)
            sb.append("ReplacePathPrefix: ").append(getReplacePathPrefix()).append(",");
        if (getEnableHomogenousTablespace() != null)
            sb.append("EnableHomogenousTablespace: ").append(getEnableHomogenousTablespace()).append(",");
        if (getDirectPathNoLog() != null)
            sb.append("DirectPathNoLog: ").append(getDirectPathNoLog()).append(",");
        if (getArchivedLogsOnly() != null)
            sb.append("ArchivedLogsOnly: ").append(getArchivedLogsOnly()).append(",");
        if (getAsmPassword() != null)
            sb.append("AsmPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAsmServer() != null)
            sb.append("AsmServer: ").append(getAsmServer()).append(",");
        if (getAsmUser() != null)
            sb.append("AsmUser: ").append(getAsmUser()).append(",");
        if (getCharLengthSemantics() != null)
            sb.append("CharLengthSemantics: ").append(getCharLengthSemantics()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDirectPathParallelLoad() != null)
            sb.append("DirectPathParallelLoad: ").append(getDirectPathParallelLoad()).append(",");
        if (getFailTasksOnLobTruncation() != null)
            sb.append("FailTasksOnLobTruncation: ").append(getFailTasksOnLobTruncation()).append(",");
        if (getNumberDatatypeScale() != null)
            sb.append("NumberDatatypeScale: ").append(getNumberDatatypeScale()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getReadTableSpaceName() != null)
            sb.append("ReadTableSpaceName: ").append(getReadTableSpaceName()).append(",");
        if (getRetryInterval() != null)
            sb.append("RetryInterval: ").append(getRetryInterval()).append(",");
        if (getSecurityDbEncryption() != null)
            sb.append("SecurityDbEncryption: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecurityDbEncryptionName() != null)
            sb.append("SecurityDbEncryptionName: ").append(getSecurityDbEncryptionName()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getSecretsManagerAccessRoleArn() != null)
            sb.append("SecretsManagerAccessRoleArn: ").append(getSecretsManagerAccessRoleArn()).append(",");
        if (getSecretsManagerSecretId() != null)
            sb.append("SecretsManagerSecretId: ").append(getSecretsManagerSecretId()).append(",");
        if (getSecretsManagerOracleAsmAccessRoleArn() != null)
            sb.append("SecretsManagerOracleAsmAccessRoleArn: ").append(getSecretsManagerOracleAsmAccessRoleArn()).append(",");
        if (getSecretsManagerOracleAsmSecretId() != null)
            sb.append("SecretsManagerOracleAsmSecretId: ").append(getSecretsManagerOracleAsmSecretId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OracleSettings == false)
            return false;
        OracleSettings other = (OracleSettings) obj;
        if (other.getAddSupplementalLogging() == null ^ this.getAddSupplementalLogging() == null)
            return false;
        if (other.getAddSupplementalLogging() != null && other.getAddSupplementalLogging().equals(this.getAddSupplementalLogging()) == false)
            return false;
        if (other.getArchivedLogDestId() == null ^ this.getArchivedLogDestId() == null)
            return false;
        if (other.getArchivedLogDestId() != null && other.getArchivedLogDestId().equals(this.getArchivedLogDestId()) == false)
            return false;
        if (other.getAdditionalArchivedLogDestId() == null ^ this.getAdditionalArchivedLogDestId() == null)
            return false;
        if (other.getAdditionalArchivedLogDestId() != null && other.getAdditionalArchivedLogDestId().equals(this.getAdditionalArchivedLogDestId()) == false)
            return false;
        if (other.getAllowSelectNestedTables() == null ^ this.getAllowSelectNestedTables() == null)
            return false;
        if (other.getAllowSelectNestedTables() != null && other.getAllowSelectNestedTables().equals(this.getAllowSelectNestedTables()) == false)
            return false;
        if (other.getParallelAsmReadThreads() == null ^ this.getParallelAsmReadThreads() == null)
            return false;
        if (other.getParallelAsmReadThreads() != null && other.getParallelAsmReadThreads().equals(this.getParallelAsmReadThreads()) == false)
            return false;
        if (other.getReadAheadBlocks() == null ^ this.getReadAheadBlocks() == null)
            return false;
        if (other.getReadAheadBlocks() != null && other.getReadAheadBlocks().equals(this.getReadAheadBlocks()) == false)
            return false;
        if (other.getAccessAlternateDirectly() == null ^ this.getAccessAlternateDirectly() == null)
            return false;
        if (other.getAccessAlternateDirectly() != null && other.getAccessAlternateDirectly().equals(this.getAccessAlternateDirectly()) == false)
            return false;
        if (other.getUseAlternateFolderForOnline() == null ^ this.getUseAlternateFolderForOnline() == null)
            return false;
        if (other.getUseAlternateFolderForOnline() != null && other.getUseAlternateFolderForOnline().equals(this.getUseAlternateFolderForOnline()) == false)
            return false;
        if (other.getOraclePathPrefix() == null ^ this.getOraclePathPrefix() == null)
            return false;
        if (other.getOraclePathPrefix() != null && other.getOraclePathPrefix().equals(this.getOraclePathPrefix()) == false)
            return false;
        if (other.getUsePathPrefix() == null ^ this.getUsePathPrefix() == null)
            return false;
        if (other.getUsePathPrefix() != null && other.getUsePathPrefix().equals(this.getUsePathPrefix()) == false)
            return false;
        if (other.getReplacePathPrefix() == null ^ this.getReplacePathPrefix() == null)
            return false;
        if (other.getReplacePathPrefix() != null && other.getReplacePathPrefix().equals(this.getReplacePathPrefix()) == false)
            return false;
        if (other.getEnableHomogenousTablespace() == null ^ this.getEnableHomogenousTablespace() == null)
            return false;
        if (other.getEnableHomogenousTablespace() != null && other.getEnableHomogenousTablespace().equals(this.getEnableHomogenousTablespace()) == false)
            return false;
        if (other.getDirectPathNoLog() == null ^ this.getDirectPathNoLog() == null)
            return false;
        if (other.getDirectPathNoLog() != null && other.getDirectPathNoLog().equals(this.getDirectPathNoLog()) == false)
            return false;
        if (other.getArchivedLogsOnly() == null ^ this.getArchivedLogsOnly() == null)
            return false;
        if (other.getArchivedLogsOnly() != null && other.getArchivedLogsOnly().equals(this.getArchivedLogsOnly()) == false)
            return false;
        if (other.getAsmPassword() == null ^ this.getAsmPassword() == null)
            return false;
        if (other.getAsmPassword() != null && other.getAsmPassword().equals(this.getAsmPassword()) == false)
            return false;
        if (other.getAsmServer() == null ^ this.getAsmServer() == null)
            return false;
        if (other.getAsmServer() != null && other.getAsmServer().equals(this.getAsmServer()) == false)
            return false;
        if (other.getAsmUser() == null ^ this.getAsmUser() == null)
            return false;
        if (other.getAsmUser() != null && other.getAsmUser().equals(this.getAsmUser()) == false)
            return false;
        if (other.getCharLengthSemantics() == null ^ this.getCharLengthSemantics() == null)
            return false;
        if (other.getCharLengthSemantics() != null && other.getCharLengthSemantics().equals(this.getCharLengthSemantics()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDirectPathParallelLoad() == null ^ this.getDirectPathParallelLoad() == null)
            return false;
        if (other.getDirectPathParallelLoad() != null && other.getDirectPathParallelLoad().equals(this.getDirectPathParallelLoad()) == false)
            return false;
        if (other.getFailTasksOnLobTruncation() == null ^ this.getFailTasksOnLobTruncation() == null)
            return false;
        if (other.getFailTasksOnLobTruncation() != null && other.getFailTasksOnLobTruncation().equals(this.getFailTasksOnLobTruncation()) == false)
            return false;
        if (other.getNumberDatatypeScale() == null ^ this.getNumberDatatypeScale() == null)
            return false;
        if (other.getNumberDatatypeScale() != null && other.getNumberDatatypeScale().equals(this.getNumberDatatypeScale()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getReadTableSpaceName() == null ^ this.getReadTableSpaceName() == null)
            return false;
        if (other.getReadTableSpaceName() != null && other.getReadTableSpaceName().equals(this.getReadTableSpaceName()) == false)
            return false;
        if (other.getRetryInterval() == null ^ this.getRetryInterval() == null)
            return false;
        if (other.getRetryInterval() != null && other.getRetryInterval().equals(this.getRetryInterval()) == false)
            return false;
        if (other.getSecurityDbEncryption() == null ^ this.getSecurityDbEncryption() == null)
            return false;
        if (other.getSecurityDbEncryption() != null && other.getSecurityDbEncryption().equals(this.getSecurityDbEncryption()) == false)
            return false;
        if (other.getSecurityDbEncryptionName() == null ^ this.getSecurityDbEncryptionName() == null)
            return false;
        if (other.getSecurityDbEncryptionName() != null && other.getSecurityDbEncryptionName().equals(this.getSecurityDbEncryptionName()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
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
        if (other.getSecretsManagerOracleAsmAccessRoleArn() == null ^ this.getSecretsManagerOracleAsmAccessRoleArn() == null)
            return false;
        if (other.getSecretsManagerOracleAsmAccessRoleArn() != null
                && other.getSecretsManagerOracleAsmAccessRoleArn().equals(this.getSecretsManagerOracleAsmAccessRoleArn()) == false)
            return false;
        if (other.getSecretsManagerOracleAsmSecretId() == null ^ this.getSecretsManagerOracleAsmSecretId() == null)
            return false;
        if (other.getSecretsManagerOracleAsmSecretId() != null
                && other.getSecretsManagerOracleAsmSecretId().equals(this.getSecretsManagerOracleAsmSecretId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddSupplementalLogging() == null) ? 0 : getAddSupplementalLogging().hashCode());
        hashCode = prime * hashCode + ((getArchivedLogDestId() == null) ? 0 : getArchivedLogDestId().hashCode());
        hashCode = prime * hashCode + ((getAdditionalArchivedLogDestId() == null) ? 0 : getAdditionalArchivedLogDestId().hashCode());
        hashCode = prime * hashCode + ((getAllowSelectNestedTables() == null) ? 0 : getAllowSelectNestedTables().hashCode());
        hashCode = prime * hashCode + ((getParallelAsmReadThreads() == null) ? 0 : getParallelAsmReadThreads().hashCode());
        hashCode = prime * hashCode + ((getReadAheadBlocks() == null) ? 0 : getReadAheadBlocks().hashCode());
        hashCode = prime * hashCode + ((getAccessAlternateDirectly() == null) ? 0 : getAccessAlternateDirectly().hashCode());
        hashCode = prime * hashCode + ((getUseAlternateFolderForOnline() == null) ? 0 : getUseAlternateFolderForOnline().hashCode());
        hashCode = prime * hashCode + ((getOraclePathPrefix() == null) ? 0 : getOraclePathPrefix().hashCode());
        hashCode = prime * hashCode + ((getUsePathPrefix() == null) ? 0 : getUsePathPrefix().hashCode());
        hashCode = prime * hashCode + ((getReplacePathPrefix() == null) ? 0 : getReplacePathPrefix().hashCode());
        hashCode = prime * hashCode + ((getEnableHomogenousTablespace() == null) ? 0 : getEnableHomogenousTablespace().hashCode());
        hashCode = prime * hashCode + ((getDirectPathNoLog() == null) ? 0 : getDirectPathNoLog().hashCode());
        hashCode = prime * hashCode + ((getArchivedLogsOnly() == null) ? 0 : getArchivedLogsOnly().hashCode());
        hashCode = prime * hashCode + ((getAsmPassword() == null) ? 0 : getAsmPassword().hashCode());
        hashCode = prime * hashCode + ((getAsmServer() == null) ? 0 : getAsmServer().hashCode());
        hashCode = prime * hashCode + ((getAsmUser() == null) ? 0 : getAsmUser().hashCode());
        hashCode = prime * hashCode + ((getCharLengthSemantics() == null) ? 0 : getCharLengthSemantics().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDirectPathParallelLoad() == null) ? 0 : getDirectPathParallelLoad().hashCode());
        hashCode = prime * hashCode + ((getFailTasksOnLobTruncation() == null) ? 0 : getFailTasksOnLobTruncation().hashCode());
        hashCode = prime * hashCode + ((getNumberDatatypeScale() == null) ? 0 : getNumberDatatypeScale().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getReadTableSpaceName() == null) ? 0 : getReadTableSpaceName().hashCode());
        hashCode = prime * hashCode + ((getRetryInterval() == null) ? 0 : getRetryInterval().hashCode());
        hashCode = prime * hashCode + ((getSecurityDbEncryption() == null) ? 0 : getSecurityDbEncryption().hashCode());
        hashCode = prime * hashCode + ((getSecurityDbEncryptionName() == null) ? 0 : getSecurityDbEncryptionName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerOracleAsmAccessRoleArn() == null) ? 0 : getSecretsManagerOracleAsmAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerOracleAsmSecretId() == null) ? 0 : getSecretsManagerOracleAsmSecretId().hashCode());
        return hashCode;
    }

    @Override
    public OracleSettings clone() {
        try {
            return (OracleSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.OracleSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
