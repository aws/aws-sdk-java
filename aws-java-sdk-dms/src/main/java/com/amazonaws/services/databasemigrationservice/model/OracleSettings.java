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
     * Database name for the endpoint.
     * </p>
     */
    private String databaseName;
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
        if (getAsmPassword() != null)
            sb.append("AsmPassword: ").append("***Sensitive Data Redacted***").append(",");
        if (getAsmServer() != null)
            sb.append("AsmServer: ").append(getAsmServer()).append(",");
        if (getAsmUser() != null)
            sb.append("AsmUser: ").append(getAsmUser()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getSecurityDbEncryption() != null)
            sb.append("SecurityDbEncryption: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecurityDbEncryptionName() != null)
            sb.append("SecurityDbEncryptionName: ").append(getSecurityDbEncryptionName()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername());
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
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAsmPassword() == null) ? 0 : getAsmPassword().hashCode());
        hashCode = prime * hashCode + ((getAsmServer() == null) ? 0 : getAsmServer().hashCode());
        hashCode = prime * hashCode + ((getAsmUser() == null) ? 0 : getAsmUser().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getSecurityDbEncryption() == null) ? 0 : getSecurityDbEncryption().hashCode());
        hashCode = prime * hashCode + ((getSecurityDbEncryptionName() == null) ? 0 : getSecurityDbEncryptionName().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
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
