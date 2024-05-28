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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Optional Snowflake destination description
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SnowflakeDestinationDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeDestinationDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * URL for accessing your Snowflake account. This URL must include your <a
     * href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that the
     * protocol (https://) and port number are optional.
     * </p>
     */
    private String accountUrl;
    /**
     * <p>
     * User login name for the Snowflake account.
     * </p>
     */
    private String user;
    /**
     * <p>
     * All data in Snowflake is maintained in databases.
     * </p>
     */
    private String database;
    /**
     * <p>
     * Each database consists of one or more schemas, which are logical groupings of database objects, such as tables
     * and views
     * </p>
     */
    private String schema;
    /**
     * <p>
     * All data in Snowflake is stored in database tables, logically structured as collections of columns and rows.
     * </p>
     */
    private String table;
    /**
     * <p>
     * Optionally configure a Snowflake role. Otherwise the default user role will be used.
     * </p>
     */
    private SnowflakeRoleConfiguration snowflakeRoleConfiguration;
    /**
     * <p>
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is mapped
     * to a record content column and source metadata is mapped to a record metadata column.
     * </p>
     */
    private String dataLoadingOption;
    /**
     * <p>
     * The name of the record metadata column
     * </p>
     */
    private String metaDataColumnName;
    /**
     * <p>
     * The name of the record content column
     * </p>
     */
    private String contentColumnName;
    /**
     * <p>
     * The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     * com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     * href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp; Snowflake</a>
     * </p>
     */
    private SnowflakeVpcConfiguration snowflakeVpcConfiguration;

    private CloudWatchLoggingOptions cloudWatchLoggingOptions;

    private ProcessingConfiguration processingConfiguration;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Snowflake role
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     */
    private SnowflakeRetryOptions retryOptions;
    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationDescription s3DestinationDescription;

    /**
     * <p>
     * URL for accessing your Snowflake account. This URL must include your <a
     * href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that the
     * protocol (https://) and port number are optional.
     * </p>
     * 
     * @param accountUrl
     *        URL for accessing your Snowflake account. This URL must include your <a
     *        href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that
     *        the protocol (https://) and port number are optional.
     */

    public void setAccountUrl(String accountUrl) {
        this.accountUrl = accountUrl;
    }

    /**
     * <p>
     * URL for accessing your Snowflake account. This URL must include your <a
     * href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that the
     * protocol (https://) and port number are optional.
     * </p>
     * 
     * @return URL for accessing your Snowflake account. This URL must include your <a
     *         href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note
     *         that the protocol (https://) and port number are optional.
     */

    public String getAccountUrl() {
        return this.accountUrl;
    }

    /**
     * <p>
     * URL for accessing your Snowflake account. This URL must include your <a
     * href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that the
     * protocol (https://) and port number are optional.
     * </p>
     * 
     * @param accountUrl
     *        URL for accessing your Snowflake account. This URL must include your <a
     *        href="https://docs.snowflake.com/en/user-guide/admin-account-identifier">account identifier</a>. Note that
     *        the protocol (https://) and port number are optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withAccountUrl(String accountUrl) {
        setAccountUrl(accountUrl);
        return this;
    }

    /**
     * <p>
     * User login name for the Snowflake account.
     * </p>
     * 
     * @param user
     *        User login name for the Snowflake account.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * User login name for the Snowflake account.
     * </p>
     * 
     * @return User login name for the Snowflake account.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * User login name for the Snowflake account.
     * </p>
     * 
     * @param user
     *        User login name for the Snowflake account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * All data in Snowflake is maintained in databases.
     * </p>
     * 
     * @param database
     *        All data in Snowflake is maintained in databases.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * All data in Snowflake is maintained in databases.
     * </p>
     * 
     * @return All data in Snowflake is maintained in databases.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * All data in Snowflake is maintained in databases.
     * </p>
     * 
     * @param database
     *        All data in Snowflake is maintained in databases.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * Each database consists of one or more schemas, which are logical groupings of database objects, such as tables
     * and views
     * </p>
     * 
     * @param schema
     *        Each database consists of one or more schemas, which are logical groupings of database objects, such as
     *        tables and views
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * Each database consists of one or more schemas, which are logical groupings of database objects, such as tables
     * and views
     * </p>
     * 
     * @return Each database consists of one or more schemas, which are logical groupings of database objects, such as
     *         tables and views
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * Each database consists of one or more schemas, which are logical groupings of database objects, such as tables
     * and views
     * </p>
     * 
     * @param schema
     *        Each database consists of one or more schemas, which are logical groupings of database objects, such as
     *        tables and views
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * All data in Snowflake is stored in database tables, logically structured as collections of columns and rows.
     * </p>
     * 
     * @param table
     *        All data in Snowflake is stored in database tables, logically structured as collections of columns and
     *        rows.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * All data in Snowflake is stored in database tables, logically structured as collections of columns and rows.
     * </p>
     * 
     * @return All data in Snowflake is stored in database tables, logically structured as collections of columns and
     *         rows.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * All data in Snowflake is stored in database tables, logically structured as collections of columns and rows.
     * </p>
     * 
     * @param table
     *        All data in Snowflake is stored in database tables, logically structured as collections of columns and
     *        rows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * Optionally configure a Snowflake role. Otherwise the default user role will be used.
     * </p>
     * 
     * @param snowflakeRoleConfiguration
     *        Optionally configure a Snowflake role. Otherwise the default user role will be used.
     */

    public void setSnowflakeRoleConfiguration(SnowflakeRoleConfiguration snowflakeRoleConfiguration) {
        this.snowflakeRoleConfiguration = snowflakeRoleConfiguration;
    }

    /**
     * <p>
     * Optionally configure a Snowflake role. Otherwise the default user role will be used.
     * </p>
     * 
     * @return Optionally configure a Snowflake role. Otherwise the default user role will be used.
     */

    public SnowflakeRoleConfiguration getSnowflakeRoleConfiguration() {
        return this.snowflakeRoleConfiguration;
    }

    /**
     * <p>
     * Optionally configure a Snowflake role. Otherwise the default user role will be used.
     * </p>
     * 
     * @param snowflakeRoleConfiguration
     *        Optionally configure a Snowflake role. Otherwise the default user role will be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withSnowflakeRoleConfiguration(SnowflakeRoleConfiguration snowflakeRoleConfiguration) {
        setSnowflakeRoleConfiguration(snowflakeRoleConfiguration);
        return this;
    }

    /**
     * <p>
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is mapped
     * to a record content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is
     *        mapped to a record content column and source metadata is mapped to a record metadata column.
     * @see SnowflakeDataLoadingOption
     */

    public void setDataLoadingOption(String dataLoadingOption) {
        this.dataLoadingOption = dataLoadingOption;
    }

    /**
     * <p>
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is mapped
     * to a record content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @return Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content
     *         is mapped to a record content column and source metadata is mapped to a record metadata column.
     * @see SnowflakeDataLoadingOption
     */

    public String getDataLoadingOption() {
        return this.dataLoadingOption;
    }

    /**
     * <p>
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is mapped
     * to a record content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is
     *        mapped to a record content column and source metadata is mapped to a record metadata column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeDataLoadingOption
     */

    public SnowflakeDestinationDescription withDataLoadingOption(String dataLoadingOption) {
        setDataLoadingOption(dataLoadingOption);
        return this;
    }

    /**
     * <p>
     * Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is mapped
     * to a record content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        Choose to load JSON keys mapped to table column names or choose to split the JSON payload where content is
     *        mapped to a record content column and source metadata is mapped to a record metadata column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeDataLoadingOption
     */

    public SnowflakeDestinationDescription withDataLoadingOption(SnowflakeDataLoadingOption dataLoadingOption) {
        this.dataLoadingOption = dataLoadingOption.toString();
        return this;
    }

    /**
     * <p>
     * The name of the record metadata column
     * </p>
     * 
     * @param metaDataColumnName
     *        The name of the record metadata column
     */

    public void setMetaDataColumnName(String metaDataColumnName) {
        this.metaDataColumnName = metaDataColumnName;
    }

    /**
     * <p>
     * The name of the record metadata column
     * </p>
     * 
     * @return The name of the record metadata column
     */

    public String getMetaDataColumnName() {
        return this.metaDataColumnName;
    }

    /**
     * <p>
     * The name of the record metadata column
     * </p>
     * 
     * @param metaDataColumnName
     *        The name of the record metadata column
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withMetaDataColumnName(String metaDataColumnName) {
        setMetaDataColumnName(metaDataColumnName);
        return this;
    }

    /**
     * <p>
     * The name of the record content column
     * </p>
     * 
     * @param contentColumnName
     *        The name of the record content column
     */

    public void setContentColumnName(String contentColumnName) {
        this.contentColumnName = contentColumnName;
    }

    /**
     * <p>
     * The name of the record content column
     * </p>
     * 
     * @return The name of the record content column
     */

    public String getContentColumnName() {
        return this.contentColumnName;
    }

    /**
     * <p>
     * The name of the record content column
     * </p>
     * 
     * @param contentColumnName
     *        The name of the record content column
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withContentColumnName(String contentColumnName) {
        setContentColumnName(contentColumnName);
        return this;
    }

    /**
     * <p>
     * The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     * com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     * href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp; Snowflake</a>
     * </p>
     * 
     * @param snowflakeVpcConfiguration
     *        The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     *        com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     *        href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp;
     *        Snowflake</a>
     */

    public void setSnowflakeVpcConfiguration(SnowflakeVpcConfiguration snowflakeVpcConfiguration) {
        this.snowflakeVpcConfiguration = snowflakeVpcConfiguration;
    }

    /**
     * <p>
     * The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     * com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     * href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp; Snowflake</a>
     * </p>
     * 
     * @return The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     *         com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     *         href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp;
     *         Snowflake</a>
     */

    public SnowflakeVpcConfiguration getSnowflakeVpcConfiguration() {
        return this.snowflakeVpcConfiguration;
    }

    /**
     * <p>
     * The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     * com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     * href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp; Snowflake</a>
     * </p>
     * 
     * @param snowflakeVpcConfiguration
     *        The VPCE ID for Firehose to privately connect with Snowflake. The ID format is
     *        com.amazonaws.vpce.[region].vpce-svc-&lt;[id]&gt;. For more information, see <a
     *        href="https://docs.snowflake.com/en/user-guide/admin-security-privatelink">Amazon PrivateLink &amp;
     *        Snowflake</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withSnowflakeVpcConfiguration(SnowflakeVpcConfiguration snowflakeVpcConfiguration) {
        setSnowflakeVpcConfiguration(snowflakeVpcConfiguration);
        return this;
    }

    /**
     * @param cloudWatchLoggingOptions
     */

    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    /**
     * @return
     */

    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return this.cloudWatchLoggingOptions;
    }

    /**
     * @param cloudWatchLoggingOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        setCloudWatchLoggingOptions(cloudWatchLoggingOptions);
        return this;
    }

    /**
     * @param processingConfiguration
     */

    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    /**
     * @return
     */

    public ProcessingConfiguration getProcessingConfiguration() {
        return this.processingConfiguration;
    }

    /**
     * @param processingConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        setProcessingConfiguration(processingConfiguration);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Snowflake role
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Snowflake role
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Snowflake role
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Snowflake role
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Snowflake role
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of the Snowflake role
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @param retryOptions
     *        The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     */

    public void setRetryOptions(SnowflakeRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @return The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     */

    public SnowflakeRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * </p>
     * 
     * @param retryOptions
     *        The time period where Firehose will retry sending data to the chosen HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withRetryOptions(SnowflakeRetryOptions retryOptions) {
        setRetryOptions(retryOptions);
        return this;
    }

    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     * 
     * @param s3BackupMode
     *        Choose an S3 backup mode
     * @see SnowflakeS3BackupMode
     */

    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     * 
     * @return Choose an S3 backup mode
     * @see SnowflakeS3BackupMode
     */

    public String getS3BackupMode() {
        return this.s3BackupMode;
    }

    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     * 
     * @param s3BackupMode
     *        Choose an S3 backup mode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeS3BackupMode
     */

    public SnowflakeDestinationDescription withS3BackupMode(String s3BackupMode) {
        setS3BackupMode(s3BackupMode);
        return this;
    }

    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     * 
     * @param s3BackupMode
     *        Choose an S3 backup mode
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeS3BackupMode
     */

    public SnowflakeDestinationDescription withS3BackupMode(SnowflakeS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3DestinationDescription
     */

    public void setS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        this.s3DestinationDescription = s3DestinationDescription;
    }

    /**
     * @return
     */

    public S3DestinationDescription getS3DestinationDescription() {
        return this.s3DestinationDescription;
    }

    /**
     * @param s3DestinationDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationDescription withS3DestinationDescription(S3DestinationDescription s3DestinationDescription) {
        setS3DestinationDescription(s3DestinationDescription);
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
        if (getAccountUrl() != null)
            sb.append("AccountUrl: ").append("***Sensitive Data Redacted***").append(",");
        if (getUser() != null)
            sb.append("User: ").append("***Sensitive Data Redacted***").append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append("***Sensitive Data Redacted***").append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append("***Sensitive Data Redacted***").append(",");
        if (getTable() != null)
            sb.append("Table: ").append("***Sensitive Data Redacted***").append(",");
        if (getSnowflakeRoleConfiguration() != null)
            sb.append("SnowflakeRoleConfiguration: ").append(getSnowflakeRoleConfiguration()).append(",");
        if (getDataLoadingOption() != null)
            sb.append("DataLoadingOption: ").append(getDataLoadingOption()).append(",");
        if (getMetaDataColumnName() != null)
            sb.append("MetaDataColumnName: ").append("***Sensitive Data Redacted***").append(",");
        if (getContentColumnName() != null)
            sb.append("ContentColumnName: ").append("***Sensitive Data Redacted***").append(",");
        if (getSnowflakeVpcConfiguration() != null)
            sb.append("SnowflakeVpcConfiguration: ").append(getSnowflakeVpcConfiguration()).append(",");
        if (getCloudWatchLoggingOptions() != null)
            sb.append("CloudWatchLoggingOptions: ").append(getCloudWatchLoggingOptions()).append(",");
        if (getProcessingConfiguration() != null)
            sb.append("ProcessingConfiguration: ").append(getProcessingConfiguration()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getRetryOptions() != null)
            sb.append("RetryOptions: ").append(getRetryOptions()).append(",");
        if (getS3BackupMode() != null)
            sb.append("S3BackupMode: ").append(getS3BackupMode()).append(",");
        if (getS3DestinationDescription() != null)
            sb.append("S3DestinationDescription: ").append(getS3DestinationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeDestinationDescription == false)
            return false;
        SnowflakeDestinationDescription other = (SnowflakeDestinationDescription) obj;
        if (other.getAccountUrl() == null ^ this.getAccountUrl() == null)
            return false;
        if (other.getAccountUrl() != null && other.getAccountUrl().equals(this.getAccountUrl()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getSnowflakeRoleConfiguration() == null ^ this.getSnowflakeRoleConfiguration() == null)
            return false;
        if (other.getSnowflakeRoleConfiguration() != null && other.getSnowflakeRoleConfiguration().equals(this.getSnowflakeRoleConfiguration()) == false)
            return false;
        if (other.getDataLoadingOption() == null ^ this.getDataLoadingOption() == null)
            return false;
        if (other.getDataLoadingOption() != null && other.getDataLoadingOption().equals(this.getDataLoadingOption()) == false)
            return false;
        if (other.getMetaDataColumnName() == null ^ this.getMetaDataColumnName() == null)
            return false;
        if (other.getMetaDataColumnName() != null && other.getMetaDataColumnName().equals(this.getMetaDataColumnName()) == false)
            return false;
        if (other.getContentColumnName() == null ^ this.getContentColumnName() == null)
            return false;
        if (other.getContentColumnName() != null && other.getContentColumnName().equals(this.getContentColumnName()) == false)
            return false;
        if (other.getSnowflakeVpcConfiguration() == null ^ this.getSnowflakeVpcConfiguration() == null)
            return false;
        if (other.getSnowflakeVpcConfiguration() != null && other.getSnowflakeVpcConfiguration().equals(this.getSnowflakeVpcConfiguration()) == false)
            return false;
        if (other.getCloudWatchLoggingOptions() == null ^ this.getCloudWatchLoggingOptions() == null)
            return false;
        if (other.getCloudWatchLoggingOptions() != null && other.getCloudWatchLoggingOptions().equals(this.getCloudWatchLoggingOptions()) == false)
            return false;
        if (other.getProcessingConfiguration() == null ^ this.getProcessingConfiguration() == null)
            return false;
        if (other.getProcessingConfiguration() != null && other.getProcessingConfiguration().equals(this.getProcessingConfiguration()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getRetryOptions() == null ^ this.getRetryOptions() == null)
            return false;
        if (other.getRetryOptions() != null && other.getRetryOptions().equals(this.getRetryOptions()) == false)
            return false;
        if (other.getS3BackupMode() == null ^ this.getS3BackupMode() == null)
            return false;
        if (other.getS3BackupMode() != null && other.getS3BackupMode().equals(this.getS3BackupMode()) == false)
            return false;
        if (other.getS3DestinationDescription() == null ^ this.getS3DestinationDescription() == null)
            return false;
        if (other.getS3DestinationDescription() != null && other.getS3DestinationDescription().equals(this.getS3DestinationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountUrl() == null) ? 0 : getAccountUrl().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getSnowflakeRoleConfiguration() == null) ? 0 : getSnowflakeRoleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataLoadingOption() == null) ? 0 : getDataLoadingOption().hashCode());
        hashCode = prime * hashCode + ((getMetaDataColumnName() == null) ? 0 : getMetaDataColumnName().hashCode());
        hashCode = prime * hashCode + ((getContentColumnName() == null) ? 0 : getContentColumnName().hashCode());
        hashCode = prime * hashCode + ((getSnowflakeVpcConfiguration() == null) ? 0 : getSnowflakeVpcConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3DestinationDescription() == null) ? 0 : getS3DestinationDescription().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeDestinationDescription clone() {
        try {
            return (SnowflakeDestinationDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SnowflakeDestinationDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
