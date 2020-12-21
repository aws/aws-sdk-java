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
 * Provides information that defines a DocumentDB endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DocDbSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocDbSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name you use to access the DocumentDB source endpoint.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The password for the user account you use to access the DocumentDB source endpoint.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The name of the server on the DocumentDB source endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value for the DocumentDB source endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The database name on the DocumentDB source endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     * <code>"one"</code> to use table mode.
     * </p>
     */
    private String nestingLevel;
    /**
     * <p>
     * Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     */
    private Boolean extractDocId;
    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this setting when
     * <code>NestingLevel</code> is set to <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     * </p>
     */
    private Integer docsToInvestigate;
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
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
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
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the DocumentDB
     * endpoint connection details.
     * </p>
     */
    private String secretsManagerSecretId;

    /**
     * <p>
     * The user name you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @param username
     *        The user name you use to access the DocumentDB source endpoint.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @return The user name you use to access the DocumentDB source endpoint.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @param username
     *        The user name you use to access the DocumentDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The password for the user account you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @param password
     *        The password for the user account you use to access the DocumentDB source endpoint.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the user account you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @return The password for the user account you use to access the DocumentDB source endpoint.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the user account you use to access the DocumentDB source endpoint.
     * </p>
     * 
     * @param password
     *        The password for the user account you use to access the DocumentDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The name of the server on the DocumentDB source endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server on the DocumentDB source endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server on the DocumentDB source endpoint.
     * </p>
     * 
     * @return The name of the server on the DocumentDB source endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server on the DocumentDB source endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server on the DocumentDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value for the DocumentDB source endpoint.
     * </p>
     * 
     * @param port
     *        The port value for the DocumentDB source endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value for the DocumentDB source endpoint.
     * </p>
     * 
     * @return The port value for the DocumentDB source endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value for the DocumentDB source endpoint.
     * </p>
     * 
     * @param port
     *        The port value for the DocumentDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The database name on the DocumentDB source endpoint.
     * </p>
     * 
     * @param databaseName
     *        The database name on the DocumentDB source endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database name on the DocumentDB source endpoint.
     * </p>
     * 
     * @return The database name on the DocumentDB source endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database name on the DocumentDB source endpoint.
     * </p>
     * 
     * @param databaseName
     *        The database name on the DocumentDB source endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     * <code>"one"</code> to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     *        <code>"one"</code> to use table mode.
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
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     * <code>"one"</code> to use table mode.
     * </p>
     * 
     * @return Specifies either document or table mode. </p>
     *         <p>
     *         Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     *         <code>"one"</code> to use table mode.
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
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     * <code>"one"</code> to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     *        <code>"one"</code> to use table mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NestingLevelValue
     */

    public DocDbSettings withNestingLevel(String nestingLevel) {
        setNestingLevel(nestingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies either document or table mode.
     * </p>
     * <p>
     * Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     * <code>"one"</code> to use table mode.
     * </p>
     * 
     * @param nestingLevel
     *        Specifies either document or table mode. </p>
     *        <p>
     *        Default value is <code>"none"</code>. Specify <code>"none"</code> to use document mode. Specify
     *        <code>"one"</code> to use table mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NestingLevelValue
     */

    public DocDbSettings withNestingLevel(NestingLevelValue nestingLevel) {
        this.nestingLevel = nestingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     * 
     * @param extractDocId
     *        Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     *        </p>
     *        <p>
     *        Default value is <code>"false"</code>.
     */

    public void setExtractDocId(Boolean extractDocId) {
        this.extractDocId = extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     * 
     * @return Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     *         </p>
     *         <p>
     *         Default value is <code>"false"</code>.
     */

    public Boolean getExtractDocId() {
        return this.extractDocId;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     * 
     * @param extractDocId
     *        Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     *        </p>
     *        <p>
     *        Default value is <code>"false"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withExtractDocId(Boolean extractDocId) {
        setExtractDocId(extractDocId);
        return this;
    }

    /**
     * <p>
     * Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     * </p>
     * <p>
     * Default value is <code>"false"</code>.
     * </p>
     * 
     * @return Specifies the document ID. Use this setting when <code>NestingLevel</code> is set to <code>"none"</code>.
     *         </p>
     *         <p>
     *         Default value is <code>"false"</code>.
     */

    public Boolean isExtractDocId() {
        return this.extractDocId;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this setting when
     * <code>NestingLevel</code> is set to <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     * </p>
     * 
     * @param docsToInvestigate
     *        Indicates the number of documents to preview to determine the document organization. Use this setting when
     *        <code>NestingLevel</code> is set to <code>"one"</code>. </p>
     *        <p>
     *        Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     */

    public void setDocsToInvestigate(Integer docsToInvestigate) {
        this.docsToInvestigate = docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this setting when
     * <code>NestingLevel</code> is set to <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     * </p>
     * 
     * @return Indicates the number of documents to preview to determine the document organization. Use this setting
     *         when <code>NestingLevel</code> is set to <code>"one"</code>. </p>
     *         <p>
     *         Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     */

    public Integer getDocsToInvestigate() {
        return this.docsToInvestigate;
    }

    /**
     * <p>
     * Indicates the number of documents to preview to determine the document organization. Use this setting when
     * <code>NestingLevel</code> is set to <code>"one"</code>.
     * </p>
     * <p>
     * Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     * </p>
     * 
     * @param docsToInvestigate
     *        Indicates the number of documents to preview to determine the document organization. Use this setting when
     *        <code>NestingLevel</code> is set to <code>"one"</code>. </p>
     *        <p>
     *        Must be a positive value greater than <code>0</code>. Default value is <code>1000</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withDocsToInvestigate(Integer docsToInvestigate) {
        setDocsToInvestigate(docsToInvestigate);
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

    public DocDbSettings withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The full Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and grants the
     * required permissions to access the value in <code>SecretsManagerSecret</code>. <code>SecretsManagerSecret</code>
     * has the value of the AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
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
     *        the DocumentDB endpoint.</p> <note>
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
     * has the value of the AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
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
     *         the DocumentDB endpoint.</p> <note>
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
     * has the value of the AWS Secrets Manager secret that allows access to the DocumentDB endpoint.
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
     *        the DocumentDB endpoint.</p> <note>
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

    public DocDbSettings withSecretsManagerAccessRoleArn(String secretsManagerAccessRoleArn) {
        setSecretsManagerAccessRoleArn(secretsManagerAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the DocumentDB
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        DocumentDB endpoint connection details.
     */

    public void setSecretsManagerSecretId(String secretsManagerSecretId) {
        this.secretsManagerSecretId = secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the DocumentDB
     * endpoint connection details.
     * </p>
     * 
     * @return The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *         DocumentDB endpoint connection details.
     */

    public String getSecretsManagerSecretId() {
        return this.secretsManagerSecretId;
    }

    /**
     * <p>
     * The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the DocumentDB
     * endpoint connection details.
     * </p>
     * 
     * @param secretsManagerSecretId
     *        The full ARN, partial ARN, or friendly name of the <code>SecretsManagerSecret</code> that contains the
     *        DocumentDB endpoint connection details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocDbSettings withSecretsManagerSecretId(String secretsManagerSecretId) {
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
        if (getNestingLevel() != null)
            sb.append("NestingLevel: ").append(getNestingLevel()).append(",");
        if (getExtractDocId() != null)
            sb.append("ExtractDocId: ").append(getExtractDocId()).append(",");
        if (getDocsToInvestigate() != null)
            sb.append("DocsToInvestigate: ").append(getDocsToInvestigate()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
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

        if (obj instanceof DocDbSettings == false)
            return false;
        DocDbSettings other = (DocDbSettings) obj;
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
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getNestingLevel() == null) ? 0 : getNestingLevel().hashCode());
        hashCode = prime * hashCode + ((getExtractDocId() == null) ? 0 : getExtractDocId().hashCode());
        hashCode = prime * hashCode + ((getDocsToInvestigate() == null) ? 0 : getDocsToInvestigate().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerAccessRoleArn() == null) ? 0 : getSecretsManagerAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSecretsManagerSecretId() == null) ? 0 : getSecretsManagerSecretId().hashCode());
        return hashCode;
    }

    @Override
    public DocDbSettings clone() {
        try {
            return (DocDbSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.DocDbSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
