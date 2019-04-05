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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/Endpoint" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     */
    private String endpointIdentifier;
    /**
     * <p>
     * The type of endpoint.
     * </p>
     */
    private String endpointType;
    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     */
    private String engineName;
    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     */
    private String engineDisplayName;
    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     */
    private String extraConnectionAttributes;
    /**
     * <p>
     * The status of the endpoint.
     * </p>
     */
    private String status;
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
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     */
    private String sslMode;
    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     */
    private String serviceAccessRoleArn;
    /**
     * <p>
     * The external table definition.
     * </p>
     */
    private String externalTableDefinition;
    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent
     * call to CreateEndpoint to create the endpoint with a cross-account.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     * structure.
     * </p>
     */
    private DynamoDbSettings dynamoDbSettings;
    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     * </p>
     */
    private S3Settings s3Settings;
    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use GZIP, set
     * this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these attributes is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these attributes is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     */
    private DmsTransferSettings dmsTransferSettings;
    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     * structure.
     * </p>
     */
    private MongoDbSettings mongoDbSettings;
    /**
     * <p>
     * The settings for the Amazon Kinesis source endpoint. For more information, see the <code>KinesisSettings</code>
     * structure.
     * </p>
     */
    private KinesisSettings kinesisSettings;
    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information, see the
     * <code>ElasticsearchSettings</code> structure.
     * </p>
     */
    private ElasticsearchSettings elasticsearchSettings;
    /**
     * <p>
     * Settings for the Amazon Redshift endpoint
     * </p>
     */
    private RedshiftSettings redshiftSettings;

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public void setEndpointIdentifier(String endpointIdentifier) {
        this.endpointIdentifier = endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @return The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *         digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     */

    public String getEndpointIdentifier() {
        return this.endpointIdentifier;
    }

    /**
     * <p>
     * The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters, digits,
     * and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * </p>
     * 
     * @param endpointIdentifier
     *        The database endpoint identifier. Identifiers must begin with a letter; must contain only ASCII letters,
     *        digits, and hyphens; and must not end with a hyphen or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointIdentifier(String endpointIdentifier) {
        setEndpointIdentifier(endpointIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(String endpointType) {
        this.endpointType = endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @return The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public String getEndpointType() {
        return this.endpointType;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public Endpoint withEndpointType(String endpointType) {
        setEndpointType(endpointType);
        return this;
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @see ReplicationEndpointTypeValue
     */

    public void setEndpointType(ReplicationEndpointTypeValue endpointType) {
        withEndpointType(endpointType);
    }

    /**
     * <p>
     * The type of endpoint.
     * </p>
     * 
     * @param endpointType
     *        The type of endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationEndpointTypeValue
     */

    public Endpoint withEndpointType(ReplicationEndpointTypeValue endpointType) {
        this.endpointType = endpointType.toString();
        return this;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *        mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *        sqlserver.
     */

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @return The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *         mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *         sqlserver.
     */

    public String getEngineName() {
        return this.engineName;
    }

    /**
     * <p>
     * The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres, mariadb,
     * aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and sqlserver.
     * </p>
     * 
     * @param engineName
     *        The database engine name. Valid values, depending on the EndPointType, include mysql, oracle, postgres,
     *        mariadb, aurora, aurora-postgresql, redshift, s3, db2, azuredb, sybase, sybase, dynamodb, mongodb, and
     *        sqlserver.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEngineName(String engineName) {
        setEngineName(engineName);
        return this;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @param engineDisplayName
     *        The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *        this value would be "Amazon Aurora MySQL."
     */

    public void setEngineDisplayName(String engineDisplayName) {
        this.engineDisplayName = engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @return The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *         this value would be "Amazon Aurora MySQL."
     */

    public String getEngineDisplayName() {
        return this.engineDisplayName;
    }

    /**
     * <p>
     * The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora," this
     * value would be "Amazon Aurora MySQL."
     * </p>
     * 
     * @param engineDisplayName
     *        The expanded name for the engine name. For example, if the <code>EngineName</code> parameter is "aurora,"
     *        this value would be "Amazon Aurora MySQL."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEngineDisplayName(String engineDisplayName) {
        setEngineDisplayName(engineDisplayName);
        return this;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @param username
     *        The user name used to connect to the endpoint.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @return The user name used to connect to the endpoint.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name used to connect to the endpoint.
     * </p>
     * 
     * @param username
     *        The user name used to connect to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server at the endpoint.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @return The name of the server at the endpoint.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * The name of the server at the endpoint.
     * </p>
     * 
     * @param serverName
     *        The name of the server at the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port value used to access the endpoint.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @return The port value used to access the endpoint.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port value used to access the endpoint.
     * </p>
     * 
     * @param port
     *        The port value used to access the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @param databaseName
     *        The name of the database at the endpoint.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @return The name of the database at the endpoint.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database at the endpoint.
     * </p>
     * 
     * @param databaseName
     *        The name of the database at the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional connection attributes used to connect to the endpoint.
     */

    public void setExtraConnectionAttributes(String extraConnectionAttributes) {
        this.extraConnectionAttributes = extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @return Additional connection attributes used to connect to the endpoint.
     */

    public String getExtraConnectionAttributes() {
        return this.extraConnectionAttributes;
    }

    /**
     * <p>
     * Additional connection attributes used to connect to the endpoint.
     * </p>
     * 
     * @param extraConnectionAttributes
     *        Additional connection attributes used to connect to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withExtraConnectionAttributes(String extraConnectionAttributes) {
        setExtraConnectionAttributes(extraConnectionAttributes);
        return this;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @return The status of the endpoint.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the endpoint.
     * </p>
     * 
     * @param status
     *        The status of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withStatus(String status) {
        setStatus(status);
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

    public Endpoint withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The Amazon Resource Name (ARN) used for SSL connection to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(String sslMode) {
        this.sslMode = sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @return The SSL mode used to connect to the endpoint.</p>
     *         <p>
     *         SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *         </p>
     *         <p>
     *         The default value is none.
     * @see DmsSslModeValue
     */

    public String getSslMode() {
        return this.sslMode;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public Endpoint withSslMode(String sslMode) {
        setSslMode(sslMode);
        return this;
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @see DmsSslModeValue
     */

    public void setSslMode(DmsSslModeValue sslMode) {
        withSslMode(sslMode);
    }

    /**
     * <p>
     * The SSL mode used to connect to the endpoint.
     * </p>
     * <p>
     * SSL mode can be one of four values: none, require, verify-ca, verify-full.
     * </p>
     * <p>
     * The default value is none.
     * </p>
     * 
     * @param sslMode
     *        The SSL mode used to connect to the endpoint.</p>
     *        <p>
     *        SSL mode can be one of four values: none, require, verify-ca, verify-full.
     *        </p>
     *        <p>
     *        The default value is none.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DmsSslModeValue
     */

    public Endpoint withSslMode(DmsSslModeValue sslMode) {
        this.sslMode = sslMode.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role.
     */

    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) used by the service access IAM role.
     */

    public String getServiceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) used by the service access IAM role.
     * </p>
     * 
     * @param serviceAccessRoleArn
     *        The Amazon Resource Name (ARN) used by the service access IAM role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withServiceAccessRoleArn(String serviceAccessRoleArn) {
        setServiceAccessRoleArn(serviceAccessRoleArn);
        return this;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     */

    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @return The external table definition.
     */

    public String getExternalTableDefinition() {
        return this.externalTableDefinition;
    }

    /**
     * <p>
     * The external table definition.
     * </p>
     * 
     * @param externalTableDefinition
     *        The external table definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withExternalTableDefinition(String externalTableDefinition) {
        setExternalTableDefinition(externalTableDefinition);
        return this;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent
     * call to CreateEndpoint to create the endpoint with a cross-account.
     * </p>
     * 
     * @param externalId
     *        Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a
     *        subsequent call to CreateEndpoint to create the endpoint with a cross-account.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent
     * call to CreateEndpoint to create the endpoint with a cross-account.
     * </p>
     * 
     * @return Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a
     *         subsequent call to CreateEndpoint to create the endpoint with a cross-account.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a subsequent
     * call to CreateEndpoint to create the endpoint with a cross-account.
     * </p>
     * 
     * @param externalId
     *        Value returned by a call to CreateEndpoint that can be used for cross-account validation. Use it on a
     *        subsequent call to CreateEndpoint to create the endpoint with a cross-account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     * structure.
     * </p>
     * 
     * @param dynamoDbSettings
     *        The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     *        structure.
     */

    public void setDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        this.dynamoDbSettings = dynamoDbSettings;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     * structure.
     * </p>
     * 
     * @return The settings for the target DynamoDB database. For more information, see the
     *         <code>DynamoDBSettings</code> structure.
     */

    public DynamoDbSettings getDynamoDbSettings() {
        return this.dynamoDbSettings;
    }

    /**
     * <p>
     * The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     * structure.
     * </p>
     * 
     * @param dynamoDbSettings
     *        The settings for the target DynamoDB database. For more information, see the <code>DynamoDBSettings</code>
     *        structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withDynamoDbSettings(DynamoDbSettings dynamoDbSettings) {
        setDynamoDbSettings(dynamoDbSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     * </p>
     * 
     * @param s3Settings
     *        The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     */

    public void setS3Settings(S3Settings s3Settings) {
        this.s3Settings = s3Settings;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     * </p>
     * 
     * @return The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     */

    public S3Settings getS3Settings() {
        return this.s3Settings;
    }

    /**
     * <p>
     * The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     * </p>
     * 
     * @param s3Settings
     *        The settings for the S3 target endpoint. For more information, see the <code>S3Settings</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withS3Settings(S3Settings s3Settings) {
        setS3Settings(s3Settings);
        return this;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use GZIP, set
     * this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these attributes is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these attributes is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     * 
     * @param dmsTransferSettings
     *        The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *        <p>
     *        Possible attributes include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bucketName</code> - The name of the S3 bucket to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use
     *        GZIP, set this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this
     *        value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Shorthand syntax for these attributes is as follows:
     *        <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *        </p>
     *        <p>
     *        JSON syntax for these attributes is as follows:
     *        <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     */

    public void setDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        this.dmsTransferSettings = dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use GZIP, set
     * this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these attributes is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these attributes is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     * 
     * @return The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *         <p>
     *         Possible attributes include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>bucketName</code> - The name of the S3 bucket to use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use
     *         GZIP, set this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this
     *         value.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Shorthand syntax for these attributes is as follows:
     *         <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *         </p>
     *         <p>
     *         JSON syntax for these attributes is as follows:
     *         <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     */

    public DmsTransferSettings getDmsTransferSettings() {
        return this.dmsTransferSettings;
    }

    /**
     * <p>
     * The settings in JSON format for the DMS transfer type of source endpoint.
     * </p>
     * <p>
     * Possible attributes include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>bucketName</code> - The name of the S3 bucket to use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use GZIP, set
     * this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this value.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Shorthand syntax for these attributes is as follows:
     * <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     * </p>
     * <p>
     * JSON syntax for these attributes is as follows:
     * <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * </p>
     * 
     * @param dmsTransferSettings
     *        The settings in JSON format for the DMS transfer type of source endpoint. </p>
     *        <p>
     *        Possible attributes include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>serviceAccessRoleArn</code> - The IAM role that has permission to access the Amazon S3 bucket.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>bucketName</code> - The name of the S3 bucket to use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>compressionType</code> - An optional parameter to use GZIP to compress the target files. To use
     *        GZIP, set this value to <code>NONE</code> (the default). To keep the files uncompressed, don't use this
     *        value.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Shorthand syntax for these attributes is as follows:
     *        <code>ServiceAccessRoleArn=string,BucketName=string,CompressionType=string</code>
     *        </p>
     *        <p>
     *        JSON syntax for these attributes is as follows:
     *        <code>{ "ServiceAccessRoleArn": "string", "BucketName": "string", "CompressionType": "none"|"gzip" } </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withDmsTransferSettings(DmsTransferSettings dmsTransferSettings) {
        setDmsTransferSettings(dmsTransferSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     * structure.
     * </p>
     * 
     * @param mongoDbSettings
     *        The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     *        structure.
     */

    public void setMongoDbSettings(MongoDbSettings mongoDbSettings) {
        this.mongoDbSettings = mongoDbSettings;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     * structure.
     * </p>
     * 
     * @return The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     *         structure.
     */

    public MongoDbSettings getMongoDbSettings() {
        return this.mongoDbSettings;
    }

    /**
     * <p>
     * The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     * structure.
     * </p>
     * 
     * @param mongoDbSettings
     *        The settings for the MongoDB source endpoint. For more information, see the <code>MongoDbSettings</code>
     *        structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withMongoDbSettings(MongoDbSettings mongoDbSettings) {
        setMongoDbSettings(mongoDbSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis source endpoint. For more information, see the <code>KinesisSettings</code>
     * structure.
     * </p>
     * 
     * @param kinesisSettings
     *        The settings for the Amazon Kinesis source endpoint. For more information, see the
     *        <code>KinesisSettings</code> structure.
     */

    public void setKinesisSettings(KinesisSettings kinesisSettings) {
        this.kinesisSettings = kinesisSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis source endpoint. For more information, see the <code>KinesisSettings</code>
     * structure.
     * </p>
     * 
     * @return The settings for the Amazon Kinesis source endpoint. For more information, see the
     *         <code>KinesisSettings</code> structure.
     */

    public KinesisSettings getKinesisSettings() {
        return this.kinesisSettings;
    }

    /**
     * <p>
     * The settings for the Amazon Kinesis source endpoint. For more information, see the <code>KinesisSettings</code>
     * structure.
     * </p>
     * 
     * @param kinesisSettings
     *        The settings for the Amazon Kinesis source endpoint. For more information, see the
     *        <code>KinesisSettings</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withKinesisSettings(KinesisSettings kinesisSettings) {
        setKinesisSettings(kinesisSettings);
        return this;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information, see the
     * <code>ElasticsearchSettings</code> structure.
     * </p>
     * 
     * @param elasticsearchSettings
     *        The settings for the Elasticsearch source endpoint. For more information, see the
     *        <code>ElasticsearchSettings</code> structure.
     */

    public void setElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        this.elasticsearchSettings = elasticsearchSettings;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information, see the
     * <code>ElasticsearchSettings</code> structure.
     * </p>
     * 
     * @return The settings for the Elasticsearch source endpoint. For more information, see the
     *         <code>ElasticsearchSettings</code> structure.
     */

    public ElasticsearchSettings getElasticsearchSettings() {
        return this.elasticsearchSettings;
    }

    /**
     * <p>
     * The settings for the Elasticsearch source endpoint. For more information, see the
     * <code>ElasticsearchSettings</code> structure.
     * </p>
     * 
     * @param elasticsearchSettings
     *        The settings for the Elasticsearch source endpoint. For more information, see the
     *        <code>ElasticsearchSettings</code> structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withElasticsearchSettings(ElasticsearchSettings elasticsearchSettings) {
        setElasticsearchSettings(elasticsearchSettings);
        return this;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint
     * </p>
     * 
     * @param redshiftSettings
     *        Settings for the Amazon Redshift endpoint
     */

    public void setRedshiftSettings(RedshiftSettings redshiftSettings) {
        this.redshiftSettings = redshiftSettings;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint
     * </p>
     * 
     * @return Settings for the Amazon Redshift endpoint
     */

    public RedshiftSettings getRedshiftSettings() {
        return this.redshiftSettings;
    }

    /**
     * <p>
     * Settings for the Amazon Redshift endpoint
     * </p>
     * 
     * @param redshiftSettings
     *        Settings for the Amazon Redshift endpoint
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withRedshiftSettings(RedshiftSettings redshiftSettings) {
        setRedshiftSettings(redshiftSettings);
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
        if (getEndpointIdentifier() != null)
            sb.append("EndpointIdentifier: ").append(getEndpointIdentifier()).append(",");
        if (getEndpointType() != null)
            sb.append("EndpointType: ").append(getEndpointType()).append(",");
        if (getEngineName() != null)
            sb.append("EngineName: ").append(getEngineName()).append(",");
        if (getEngineDisplayName() != null)
            sb.append("EngineDisplayName: ").append(getEngineDisplayName()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append(getUsername()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getExtraConnectionAttributes() != null)
            sb.append("ExtraConnectionAttributes: ").append(getExtraConnectionAttributes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getSslMode() != null)
            sb.append("SslMode: ").append(getSslMode()).append(",");
        if (getServiceAccessRoleArn() != null)
            sb.append("ServiceAccessRoleArn: ").append(getServiceAccessRoleArn()).append(",");
        if (getExternalTableDefinition() != null)
            sb.append("ExternalTableDefinition: ").append(getExternalTableDefinition()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getDynamoDbSettings() != null)
            sb.append("DynamoDbSettings: ").append(getDynamoDbSettings()).append(",");
        if (getS3Settings() != null)
            sb.append("S3Settings: ").append(getS3Settings()).append(",");
        if (getDmsTransferSettings() != null)
            sb.append("DmsTransferSettings: ").append(getDmsTransferSettings()).append(",");
        if (getMongoDbSettings() != null)
            sb.append("MongoDbSettings: ").append(getMongoDbSettings()).append(",");
        if (getKinesisSettings() != null)
            sb.append("KinesisSettings: ").append(getKinesisSettings()).append(",");
        if (getElasticsearchSettings() != null)
            sb.append("ElasticsearchSettings: ").append(getElasticsearchSettings()).append(",");
        if (getRedshiftSettings() != null)
            sb.append("RedshiftSettings: ").append(getRedshiftSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getEndpointIdentifier() == null ^ this.getEndpointIdentifier() == null)
            return false;
        if (other.getEndpointIdentifier() != null && other.getEndpointIdentifier().equals(this.getEndpointIdentifier()) == false)
            return false;
        if (other.getEndpointType() == null ^ this.getEndpointType() == null)
            return false;
        if (other.getEndpointType() != null && other.getEndpointType().equals(this.getEndpointType()) == false)
            return false;
        if (other.getEngineName() == null ^ this.getEngineName() == null)
            return false;
        if (other.getEngineName() != null && other.getEngineName().equals(this.getEngineName()) == false)
            return false;
        if (other.getEngineDisplayName() == null ^ this.getEngineDisplayName() == null)
            return false;
        if (other.getEngineDisplayName() != null && other.getEngineDisplayName().equals(this.getEngineDisplayName()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
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
        if (other.getExtraConnectionAttributes() == null ^ this.getExtraConnectionAttributes() == null)
            return false;
        if (other.getExtraConnectionAttributes() != null && other.getExtraConnectionAttributes().equals(this.getExtraConnectionAttributes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getSslMode() == null ^ this.getSslMode() == null)
            return false;
        if (other.getSslMode() != null && other.getSslMode().equals(this.getSslMode()) == false)
            return false;
        if (other.getServiceAccessRoleArn() == null ^ this.getServiceAccessRoleArn() == null)
            return false;
        if (other.getServiceAccessRoleArn() != null && other.getServiceAccessRoleArn().equals(this.getServiceAccessRoleArn()) == false)
            return false;
        if (other.getExternalTableDefinition() == null ^ this.getExternalTableDefinition() == null)
            return false;
        if (other.getExternalTableDefinition() != null && other.getExternalTableDefinition().equals(this.getExternalTableDefinition()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getDynamoDbSettings() == null ^ this.getDynamoDbSettings() == null)
            return false;
        if (other.getDynamoDbSettings() != null && other.getDynamoDbSettings().equals(this.getDynamoDbSettings()) == false)
            return false;
        if (other.getS3Settings() == null ^ this.getS3Settings() == null)
            return false;
        if (other.getS3Settings() != null && other.getS3Settings().equals(this.getS3Settings()) == false)
            return false;
        if (other.getDmsTransferSettings() == null ^ this.getDmsTransferSettings() == null)
            return false;
        if (other.getDmsTransferSettings() != null && other.getDmsTransferSettings().equals(this.getDmsTransferSettings()) == false)
            return false;
        if (other.getMongoDbSettings() == null ^ this.getMongoDbSettings() == null)
            return false;
        if (other.getMongoDbSettings() != null && other.getMongoDbSettings().equals(this.getMongoDbSettings()) == false)
            return false;
        if (other.getKinesisSettings() == null ^ this.getKinesisSettings() == null)
            return false;
        if (other.getKinesisSettings() != null && other.getKinesisSettings().equals(this.getKinesisSettings()) == false)
            return false;
        if (other.getElasticsearchSettings() == null ^ this.getElasticsearchSettings() == null)
            return false;
        if (other.getElasticsearchSettings() != null && other.getElasticsearchSettings().equals(this.getElasticsearchSettings()) == false)
            return false;
        if (other.getRedshiftSettings() == null ^ this.getRedshiftSettings() == null)
            return false;
        if (other.getRedshiftSettings() != null && other.getRedshiftSettings().equals(this.getRedshiftSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointIdentifier() == null) ? 0 : getEndpointIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndpointType() == null) ? 0 : getEndpointType().hashCode());
        hashCode = prime * hashCode + ((getEngineName() == null) ? 0 : getEngineName().hashCode());
        hashCode = prime * hashCode + ((getEngineDisplayName() == null) ? 0 : getEngineDisplayName().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getExtraConnectionAttributes() == null) ? 0 : getExtraConnectionAttributes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getSslMode() == null) ? 0 : getSslMode().hashCode());
        hashCode = prime * hashCode + ((getServiceAccessRoleArn() == null) ? 0 : getServiceAccessRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalTableDefinition() == null) ? 0 : getExternalTableDefinition().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getDynamoDbSettings() == null) ? 0 : getDynamoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getS3Settings() == null) ? 0 : getS3Settings().hashCode());
        hashCode = prime * hashCode + ((getDmsTransferSettings() == null) ? 0 : getDmsTransferSettings().hashCode());
        hashCode = prime * hashCode + ((getMongoDbSettings() == null) ? 0 : getMongoDbSettings().hashCode());
        hashCode = prime * hashCode + ((getKinesisSettings() == null) ? 0 : getKinesisSettings().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchSettings() == null) ? 0 : getElasticsearchSettings().hashCode());
        hashCode = prime * hashCode + ((getRedshiftSettings() == null) ? 0 : getRedshiftSettings().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
