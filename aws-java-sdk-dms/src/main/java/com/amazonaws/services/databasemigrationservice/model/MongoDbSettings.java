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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MongoDbSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MongoDbSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password for the user account you use to access the MongoDB source endpoint.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     */
    private String authMechanism;
    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     */
    private String nestingLevel;
    /**
     * <p>
     * Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE.
     * </p>
     * <p>
     * Default value is false.
     * </p>
     */
    private String extractDocId;
    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this attribute when
     * <code>NestingLevel</code> is set to ONE.
     * </p>
     * <p>
     * Must be a positive value greater than 0. Default value is 1000.
     * </p>
     */
    private String docsToInvestigate;
    /**
     * <p>
     * The MongoDB database name. This attribute is not used when <code>authType=NO</code>.
     * </p>
     * <p>
     * The default is admin.
     * </p>
     */
    private String authSource;
    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify
     * a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @param username
     *        The user name you use to access the MongoDB source endpoint.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @return The user name you use to access the MongoDB source endpoint.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @param username
     *        The user name you use to access the MongoDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @param password
     *        The password for the user account you use to access the MongoDB source endpoint.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @return The password for the user account you use to access the MongoDB source endpoint.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the user account you use to access the MongoDB source endpoint.
     * </p>
     * 
     * @param password
     *        The password for the user account you use to access the MongoDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server on the MongoDB source endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     * 
     * @return The name of the server on the MongoDB source endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server on the MongoDB source endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server on the MongoDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     * 
     * @param port
     *        The port value for the MongoDB source endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     * 
     * @return The port value for the MongoDB source endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value for the MongoDB source endpoint.
     * </p>
     * 
     * @param port
     *        The port value for the MongoDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     * 
     * @param databaseName
     *        The database name on the MongoDB source endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     * 
     * @return The database name on the MongoDB source endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name on the MongoDB source endpoint.
     * </p>
     * 
     * @param databaseName
     *        The database name on the MongoDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     * 
     * @param authType
     *        The authentication type you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: NO, PASSWORD
     *        </p>
     *        <p>
     *        When NO is selected, user name and password parameters are not used and can be empty.
     * @see AuthTypeValue
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     * 
     * @return The authentication type you use to access the MongoDB source endpoint.</p>
     *         <p>
     *         Valid values: NO, PASSWORD
     *         </p>
     *         <p>
     *         When NO is selected, user name and password parameters are not used and can be empty.
     * @see AuthTypeValue
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     * 
     * @param authType
     *        The authentication type you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: NO, PASSWORD
     *        </p>
     *        <p>
     *        When NO is selected, user name and password parameters are not used and can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTypeValue
     */

    public MongoDbSettings withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     * 
     * @param authType
     *        The authentication type you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: NO, PASSWORD
     *        </p>
     *        <p>
     *        When NO is selected, user name and password parameters are not used and can be empty.
     * @see AuthTypeValue
     */

    public void setAuthType(AuthTypeValue authType) {
        withAuthType(authType);
    }

    /**
     * <p>
     * The authentication type you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: NO, PASSWORD
     * </p>
     * <p>
     * When NO is selected, user name and password parameters are not used and can be empty.
     * </p>
     * 
     * @param authType
     *        The authentication type you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: NO, PASSWORD
     *        </p>
     *        <p>
     *        When NO is selected, user name and password parameters are not used and can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthTypeValue
     */

    public MongoDbSettings withAuthType(AuthTypeValue authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     * 
     * @param authMechanism
     *        The authentication mechanism you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     *        </p>
     *        <p>
     *        DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This
     *        attribute is not used when authType=No.
     * @see AuthMechanismValue
     */

    public void setAuthMechanism(String authMechanism) {
        this.authMechanism = authMechanism;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     * 
     * @return The authentication mechanism you use to access the MongoDB source endpoint.</p>
     *         <p>
     *         Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     *         </p>
     *         <p>
     *         DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This
     *         attribute is not used when authType=No.
     * @see AuthMechanismValue
     */

    public String getAuthMechanism() {
        return this.authMechanism;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     * 
     * @param authMechanism
     *        The authentication mechanism you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     *        </p>
     *        <p>
     *        DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This
     *        attribute is not used when authType=No.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMechanismValue
     */

    public MongoDbSettings withAuthMechanism(String authMechanism) {
        setAuthMechanism(authMechanism);
        return this;
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     * 
     * @param authMechanism
     *        The authentication mechanism you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     *        </p>
     *        <p>
     *        DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This
     *        attribute is not used when authType=No.
     * @see AuthMechanismValue
     */

    public void setAuthMechanism(AuthMechanismValue authMechanism) {
        withAuthMechanism(authMechanism);
    }

    /**
     * <p>
     * The authentication mechanism you use to access the MongoDB source endpoint.
     * </p>
     * <p>
     * Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     * </p>
     * <p>
     * DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This attribute is
     * not used when authType=No.
     * </p>
     * 
     * @param authMechanism
     *        The authentication mechanism you use to access the MongoDB source endpoint.</p>
     *        <p>
     *        Valid values: DEFAULT, MONGODB_CR, SCRAM_SHA_1
     *        </p>
     *        <p>
     *        DEFAULT – For MongoDB version 2.x, use MONGODB_CR. For MongoDB version 3.x, use SCRAM_SHA_1. This
     *        attribute is not used when authType=No.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthMechanismValue
     */

    public MongoDbSettings withAuthMechanism(AuthMechanismValue authMechanism) {
        this.authMechanism = authMechanism.toString();
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Valid values: NONE, ONE
     *        </p>
     *        <p>
     *        Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * @see NestingLevelValue
     */

    public void setNestingLevel(String nestingLevel) {
        this.nestingLevel = nestingLevel;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     * 
     * @return Specifies either document or table mode. </p>
     *         <p>
     *         Valid values: NONE, ONE
     *         </p>
     *         <p>
     *         Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * @see NestingLevelValue
     */

    public String getNestingLevel() {
        return this.nestingLevel;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Valid values: NONE, ONE
     *        </p>
     *        <p>
     *        Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NestingLevelValue
     */

    public MongoDbSettings withNestingLevel(String nestingLevel) {
        setNestingLevel(nestingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Valid values: NONE, ONE
     *        </p>
     *        <p>
     *        Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * @see NestingLevelValue
     */

    public void setNestingLevel(NestingLevelValue nestingLevel) {
        withNestingLevel(nestingLevel);
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Valid values: NONE, ONE
     * </p>
     * <p>
     * Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Valid values: NONE, ONE
     *        </p>
     *        <p>
     *        Default value is NONE. Specify NONE to use document mode. Specify ONE to use table mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NestingLevelValue
     */

    public MongoDbSettings withNestingLevel(NestingLevelValue nestingLevel) {
        this.nestingLevel = nestingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE.
     * </p>
     * <p>
     * Default value is false.
     * </p>
     * 
     * @param extractDocId
     *        Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE. </p>
     *        <p>
     *        Default value is false.
     */

    public void setExtractDocId(String extractDocId) {
        this.extractDocId = extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE.
     * </p>
     * <p>
     * Default value is false.
     * </p>
     * 
     * @return Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE. </p>
     *         <p>
     *         Default value is false.
     */

    public String getExtractDocId() {
        return this.extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE.
     * </p>
     * <p>
     * Default value is false.
     * </p>
     * 
     * @param extractDocId
     *        Specifies the document ID. Use this attribute when <code>NestingLevel</code> is set to NONE. </p>
     *        <p>
     *        Default value is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withExtractDocId(String extractDocId) {
        setExtractDocId(extractDocId);
        return this;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this attribute when
     * <code>NestingLevel</code> is set to ONE.
     * </p>
     * <p>
     * Must be a positive value greater than 0. Default value is 1000.
     * </p>
     * 
     * @param docsToInvestigate
     *        Indicates the number of documents to preview to determine the document organization. Use this attribute
     *        when <code>NestingLevel</code> is set to ONE. </p>
     *        <p>
     *        Must be a positive value greater than 0. Default value is 1000.
     */

    public void setDocsToInvestigate(String docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this attribute when
     * <code>NestingLevel</code> is set to ONE.
     * </p>
     * <p>
     * Must be a positive value greater than 0. Default value is 1000.
     * </p>
     * 
     * @return Indicates the number of documents to preview to determine the document organization. Use this attribute
     *         when <code>NestingLevel</code> is set to ONE. </p>
     *         <p>
     *         Must be a positive value greater than 0. Default value is 1000.
     */

    public String getDocsToInvestigate() {
        return this.docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this attribute when
     * <code>NestingLevel</code> is set to ONE.
     * </p>
     * <p>
     * Must be a positive value greater than 0. Default value is 1000.
     * </p>
     * 
     * @param docsToInvestigate
     *        Indicates the number of documents to preview to determine the document organization. Use this attribute
     *        when <code>NestingLevel</code> is set to ONE. </p>
     *        <p>
     *        Must be a positive value greater than 0. Default value is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withDocsToInvestigate(String docsToInvestigate) {
        setDocsToInvestigate(docsToInvestigate);
        return this;
    }

    /**
     * <p>
     * The MongoDB database name. This attribute is not used when <code>authType=NO</code>.
     * </p>
     * <p>
     * The default is admin.
     * </p>
     * 
     * @param authSource
     *        The MongoDB database name. This attribute is not used when <code>authType=NO</code>. </p>
     *        <p>
     *        The default is admin.
     */

    public void setAuthSource(String authSource) {
        this.authSource = authSource;
    }

    /**
     * <p>
     * The MongoDB database name. This attribute is not used when <code>authType=NO</code>.
     * </p>
     * <p>
     * The default is admin.
     * </p>
     * 
     * @return The MongoDB database name. This attribute is not used when <code>authType=NO</code>. </p>
     *         <p>
     *         The default is admin.
     */

    public String getAuthSource() {
        return this.authSource;
    }

    /**
     * <p>
     * The MongoDB database name. This attribute is not used when <code>authType=NO</code>.
     * </p>
     * <p>
     * The default is admin.
     * </p>
     * 
     * @param authSource
     *        The MongoDB database name. This attribute is not used when <code>authType=NO</code>. </p>
     *        <p>
     *        The default is admin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withAuthSource(String authSource) {
        setAuthSource(authSource);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify
     * a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't
     *        specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key.
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify
     * a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     * 
     * @return The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't
     *         specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key.
     *         AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *         encryption key for each AWS Region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't specify
     * a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key. AWS KMS creates
     * the default encryption key for your AWS account. Your AWS account has a different default encryption key for each
     * AWS Region.
     * </p>
     * 
     * @param kmsKeyId
     *        The AWS KMS key identifier that is used to encrypt the content on the replication instance. If you don't
     *        specify a value for the <code>KmsKeyId</code> parameter, then AWS DMS uses your default encryption key.
     *        AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default
     *        encryption key for each AWS Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MongoDbSettings withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getAuthMechanism() != null)
            sb.append("AuthMechanism: ").append(getAuthMechanism()).append(",");
        if (getNestingLevel() != null)
            sb.append("NestingLevel: ").append(getNestingLevel()).append(",");
        if (getExtractDocId() != null)
            sb.append("ExtractDocId: ").append(getExtractDocId()).append(",");
        if (getDocsToInvestigate() != null)
            sb.append("DocsToInvestigate: ").append(getDocsToInvestigate()).append(",");
        if (getAuthSource() != null)
            sb.append("AuthSource: ").append(getAuthSource()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MongoDbSettings == false)
            return false;
        MongoDbSettings other = (MongoDbSettings) obj;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getAuthMechanism() == null ^ this.getAuthMechanism() == null)
            return false;
        if (other.getAuthMechanism() != null && other.getAuthMechanism().equals(this.getAuthMechanism()) == false)
            return false;
        if (other.getNestingLevel() == null ^ this.getNestingLevel() == null)
            return false;
        if (other.getNestingLevel() != null && other.getNestingLevel().equals(this.getNestingLevel()) == false)
            return false;
        if (other.getExtractDocId() == null ^ this.getExtractDocId() == null)
            return false;
        if (other.getExtractDocId() != null && other.getExtractDocId().equals(this.getExtractDocId()) == false)
            return false;
        if (other.getDocsToInvestigate() == null ^ this.getDocsToInvestigate() == null)
            return false;
        if (other.getDocsToInvestigate() != null && other.getDocsToInvestigate().equals(this.getDocsToInvestigate()) == false)
            return false;
        if (other.getAuthSource() == null ^ this.getAuthSource() == null)
            return false;
        if (other.getAuthSource() != null && other.getAuthSource().equals(this.getAuthSource()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getAuthMechanism() == null) ? 0 : getAuthMechanism().hashCode());
        hashCode = prime * hashCode + ((getNestingLevel() == null) ? 0 : getNestingLevel().hashCode());
        hashCode = prime * hashCode + ((getExtractDocId() == null) ? 0 : getExtractDocId().hashCode());
        hashCode = prime * hashCode + ((getDocsToInvestigate() == null) ? 0 : getDocsToInvestigate().hashCode());
        hashCode = prime * hashCode + ((getAuthSource() == null) ? 0 : getAuthSource().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public MongoDbSettings clone() {
        try {
            return (MongoDbSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.MongoDbSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
