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
 * Update to configuration settings
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/SnowflakeDestinationUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeDestinationUpdate implements Serializable, Cloneable, StructuredPojo {

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
     * The private key used to encrypt your Snowflake client. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     */
    private String keyPassphrase;
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
     * JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a record
     * content column and source metadata is mapped to a record metadata column.
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
     * The name of the content metadata column
     * </p>
     */
    private String contentColumnName;

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
     * Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data, Firehose first
     * waits for an acknowledgment from the HTTP endpoint. If an error occurs or the acknowledgment doesn’t arrive
     * within the acknowledgment timeout period, Firehose starts the retry duration counter. It keeps retrying until the
     * retry duration expires. After that, Firehose considers it a data delivery failure and backs up the data to your
     * Amazon S3 bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
     * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the HTTP endpoint.
     * Even if the retry duration expires, Firehose still waits for the acknowledgment until it receives it or the
     * acknowledgement timeout period is reached. If the acknowledgment times out, Firehose determines whether there's
     * time left in the retry counter. If there is time left, it retries again and repeats the logic until it receives
     * an acknowledgment or determines that the retry time has expired. If you don't want Firehose to retry sending
     * data, set this value to 0.
     * </p>
     */
    private SnowflakeRetryOptions retryOptions;
    /**
     * <p>
     * Choose an S3 backup mode
     * </p>
     */
    private String s3BackupMode;

    private S3DestinationUpdate s3Update;

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

    public SnowflakeDestinationUpdate withAccountUrl(String accountUrl) {
        setAccountUrl(accountUrl);
        return this;
    }

    /**
     * <p>
     * The private key used to encrypt your Snowflake client. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @param privateKey
     *        The private key used to encrypt your Snowflake client. For information, see <a href=
     *        "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *        >Using Key Pair Authentication &amp; Key Rotation</a>.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key used to encrypt your Snowflake client. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @return The private key used to encrypt your Snowflake client. For information, see <a href=
     *         "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *         >Using Key Pair Authentication &amp; Key Rotation</a>.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The private key used to encrypt your Snowflake client. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @param privateKey
     *        The private key used to encrypt your Snowflake client. For information, see <a href=
     *        "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *        >Using Key Pair Authentication &amp; Key Rotation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationUpdate withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @param keyPassphrase
     *        Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     *        "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *        >Using Key Pair Authentication &amp; Key Rotation</a>.
     */

    public void setKeyPassphrase(String keyPassphrase) {
        this.keyPassphrase = keyPassphrase;
    }

    /**
     * <p>
     * Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @return Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     *         "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *         >Using Key Pair Authentication &amp; Key Rotation</a>.
     */

    public String getKeyPassphrase() {
        return this.keyPassphrase;
    }

    /**
     * <p>
     * Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     * "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     * >Using Key Pair Authentication &amp; Key Rotation</a>.
     * </p>
     * 
     * @param keyPassphrase
     *        Passphrase to decrypt the private key when the key is encrypted. For information, see <a href=
     *        "https://docs.snowflake.com/en/user-guide/data-load-snowpipe-streaming-configuration#using-key-pair-authentication-key-rotation"
     *        >Using Key Pair Authentication &amp; Key Rotation</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationUpdate withKeyPassphrase(String keyPassphrase) {
        setKeyPassphrase(keyPassphrase);
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

    public SnowflakeDestinationUpdate withUser(String user) {
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

    public SnowflakeDestinationUpdate withDatabase(String database) {
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

    public SnowflakeDestinationUpdate withSchema(String schema) {
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

    public SnowflakeDestinationUpdate withTable(String table) {
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

    public SnowflakeDestinationUpdate withSnowflakeRoleConfiguration(SnowflakeRoleConfiguration snowflakeRoleConfiguration) {
        setSnowflakeRoleConfiguration(snowflakeRoleConfiguration);
        return this;
    }

    /**
     * <p>
     * JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a record
     * content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a
     *        record content column and source metadata is mapped to a record metadata column.
     * @see SnowflakeDataLoadingOption
     */

    public void setDataLoadingOption(String dataLoadingOption) {
        this.dataLoadingOption = dataLoadingOption;
    }

    /**
     * <p>
     * JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a record
     * content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @return JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a
     *         record content column and source metadata is mapped to a record metadata column.
     * @see SnowflakeDataLoadingOption
     */

    public String getDataLoadingOption() {
        return this.dataLoadingOption;
    }

    /**
     * <p>
     * JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a record
     * content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a
     *        record content column and source metadata is mapped to a record metadata column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeDataLoadingOption
     */

    public SnowflakeDestinationUpdate withDataLoadingOption(String dataLoadingOption) {
        setDataLoadingOption(dataLoadingOption);
        return this;
    }

    /**
     * <p>
     * JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a record
     * content column and source metadata is mapped to a record metadata column.
     * </p>
     * 
     * @param dataLoadingOption
     *        JSON keys mapped to table column names or choose to split the JSON payload where content is mapped to a
     *        record content column and source metadata is mapped to a record metadata column.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SnowflakeDataLoadingOption
     */

    public SnowflakeDestinationUpdate withDataLoadingOption(SnowflakeDataLoadingOption dataLoadingOption) {
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

    public SnowflakeDestinationUpdate withMetaDataColumnName(String metaDataColumnName) {
        setMetaDataColumnName(metaDataColumnName);
        return this;
    }

    /**
     * <p>
     * The name of the content metadata column
     * </p>
     * 
     * @param contentColumnName
     *        The name of the content metadata column
     */

    public void setContentColumnName(String contentColumnName) {
        this.contentColumnName = contentColumnName;
    }

    /**
     * <p>
     * The name of the content metadata column
     * </p>
     * 
     * @return The name of the content metadata column
     */

    public String getContentColumnName() {
        return this.contentColumnName;
    }

    /**
     * <p>
     * The name of the content metadata column
     * </p>
     * 
     * @param contentColumnName
     *        The name of the content metadata column
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationUpdate withContentColumnName(String contentColumnName) {
        setContentColumnName(contentColumnName);
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

    public SnowflakeDestinationUpdate withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
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

    public SnowflakeDestinationUpdate withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
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

    public SnowflakeDestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data, Firehose first
     * waits for an acknowledgment from the HTTP endpoint. If an error occurs or the acknowledgment doesn’t arrive
     * within the acknowledgment timeout period, Firehose starts the retry duration counter. It keeps retrying until the
     * retry duration expires. After that, Firehose considers it a data delivery failure and backs up the data to your
     * Amazon S3 bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
     * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the HTTP endpoint.
     * Even if the retry duration expires, Firehose still waits for the acknowledgment until it receives it or the
     * acknowledgement timeout period is reached. If the acknowledgment times out, Firehose determines whether there's
     * time left in the retry counter. If there is time left, it retries again and repeats the logic until it receives
     * an acknowledgment or determines that the retry time has expired. If you don't want Firehose to retry sending
     * data, set this value to 0.
     * </p>
     * 
     * @param retryOptions
     *        Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data,
     *        Firehose first waits for an acknowledgment from the HTTP endpoint. If an error occurs or the
     *        acknowledgment doesn’t arrive within the acknowledgment timeout period, Firehose starts the retry duration
     *        counter. It keeps retrying until the retry duration expires. After that, Firehose considers it a data
     *        delivery failure and backs up the data to your Amazon S3 bucket. Every time that Firehose sends data to
     *        the HTTP endpoint (either the initial attempt or a retry), it restarts the acknowledgement timeout counter
     *        and waits for an acknowledgement from the HTTP endpoint. Even if the retry duration expires, Firehose
     *        still waits for the acknowledgment until it receives it or the acknowledgement timeout period is reached.
     *        If the acknowledgment times out, Firehose determines whether there's time left in the retry counter. If
     *        there is time left, it retries again and repeats the logic until it receives an acknowledgment or
     *        determines that the retry time has expired. If you don't want Firehose to retry sending data, set this
     *        value to 0.
     */

    public void setRetryOptions(SnowflakeRetryOptions retryOptions) {
        this.retryOptions = retryOptions;
    }

    /**
     * <p>
     * Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data, Firehose first
     * waits for an acknowledgment from the HTTP endpoint. If an error occurs or the acknowledgment doesn’t arrive
     * within the acknowledgment timeout period, Firehose starts the retry duration counter. It keeps retrying until the
     * retry duration expires. After that, Firehose considers it a data delivery failure and backs up the data to your
     * Amazon S3 bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
     * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the HTTP endpoint.
     * Even if the retry duration expires, Firehose still waits for the acknowledgment until it receives it or the
     * acknowledgement timeout period is reached. If the acknowledgment times out, Firehose determines whether there's
     * time left in the retry counter. If there is time left, it retries again and repeats the logic until it receives
     * an acknowledgment or determines that the retry time has expired. If you don't want Firehose to retry sending
     * data, set this value to 0.
     * </p>
     * 
     * @return Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data,
     *         Firehose first waits for an acknowledgment from the HTTP endpoint. If an error occurs or the
     *         acknowledgment doesn’t arrive within the acknowledgment timeout period, Firehose starts the retry
     *         duration counter. It keeps retrying until the retry duration expires. After that, Firehose considers it a
     *         data delivery failure and backs up the data to your Amazon S3 bucket. Every time that Firehose sends data
     *         to the HTTP endpoint (either the initial attempt or a retry), it restarts the acknowledgement timeout
     *         counter and waits for an acknowledgement from the HTTP endpoint. Even if the retry duration expires,
     *         Firehose still waits for the acknowledgment until it receives it or the acknowledgement timeout period is
     *         reached. If the acknowledgment times out, Firehose determines whether there's time left in the retry
     *         counter. If there is time left, it retries again and repeats the logic until it receives an
     *         acknowledgment or determines that the retry time has expired. If you don't want Firehose to retry sending
     *         data, set this value to 0.
     */

    public SnowflakeRetryOptions getRetryOptions() {
        return this.retryOptions;
    }

    /**
     * <p>
     * Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data, Firehose first
     * waits for an acknowledgment from the HTTP endpoint. If an error occurs or the acknowledgment doesn’t arrive
     * within the acknowledgment timeout period, Firehose starts the retry duration counter. It keeps retrying until the
     * retry duration expires. After that, Firehose considers it a data delivery failure and backs up the data to your
     * Amazon S3 bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
     * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the HTTP endpoint.
     * Even if the retry duration expires, Firehose still waits for the acknowledgment until it receives it or the
     * acknowledgement timeout period is reached. If the acknowledgment times out, Firehose determines whether there's
     * time left in the retry counter. If there is time left, it retries again and repeats the logic until it receives
     * an acknowledgment or determines that the retry time has expired. If you don't want Firehose to retry sending
     * data, set this value to 0.
     * </p>
     * 
     * @param retryOptions
     *        Specify how long Firehose retries sending data to the New Relic HTTP endpoint. After sending data,
     *        Firehose first waits for an acknowledgment from the HTTP endpoint. If an error occurs or the
     *        acknowledgment doesn’t arrive within the acknowledgment timeout period, Firehose starts the retry duration
     *        counter. It keeps retrying until the retry duration expires. After that, Firehose considers it a data
     *        delivery failure and backs up the data to your Amazon S3 bucket. Every time that Firehose sends data to
     *        the HTTP endpoint (either the initial attempt or a retry), it restarts the acknowledgement timeout counter
     *        and waits for an acknowledgement from the HTTP endpoint. Even if the retry duration expires, Firehose
     *        still waits for the acknowledgment until it receives it or the acknowledgement timeout period is reached.
     *        If the acknowledgment times out, Firehose determines whether there's time left in the retry counter. If
     *        there is time left, it retries again and repeats the logic until it receives an acknowledgment or
     *        determines that the retry time has expired. If you don't want Firehose to retry sending data, set this
     *        value to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationUpdate withRetryOptions(SnowflakeRetryOptions retryOptions) {
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

    public SnowflakeDestinationUpdate withS3BackupMode(String s3BackupMode) {
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

    public SnowflakeDestinationUpdate withS3BackupMode(SnowflakeS3BackupMode s3BackupMode) {
        this.s3BackupMode = s3BackupMode.toString();
        return this;
    }

    /**
     * @param s3Update
     */

    public void setS3Update(S3DestinationUpdate s3Update) {
        this.s3Update = s3Update;
    }

    /**
     * @return
     */

    public S3DestinationUpdate getS3Update() {
        return this.s3Update;
    }

    /**
     * @param s3Update
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
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
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append("***Sensitive Data Redacted***").append(",");
        if (getKeyPassphrase() != null)
            sb.append("KeyPassphrase: ").append("***Sensitive Data Redacted***").append(",");
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
        if (getS3Update() != null)
            sb.append("S3Update: ").append(getS3Update());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeDestinationUpdate == false)
            return false;
        SnowflakeDestinationUpdate other = (SnowflakeDestinationUpdate) obj;
        if (other.getAccountUrl() == null ^ this.getAccountUrl() == null)
            return false;
        if (other.getAccountUrl() != null && other.getAccountUrl().equals(this.getAccountUrl()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getKeyPassphrase() == null ^ this.getKeyPassphrase() == null)
            return false;
        if (other.getKeyPassphrase() != null && other.getKeyPassphrase().equals(this.getKeyPassphrase()) == false)
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
        if (other.getS3Update() == null ^ this.getS3Update() == null)
            return false;
        if (other.getS3Update() != null && other.getS3Update().equals(this.getS3Update()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountUrl() == null) ? 0 : getAccountUrl().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getKeyPassphrase() == null) ? 0 : getKeyPassphrase().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getSnowflakeRoleConfiguration() == null) ? 0 : getSnowflakeRoleConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDataLoadingOption() == null) ? 0 : getDataLoadingOption().hashCode());
        hashCode = prime * hashCode + ((getMetaDataColumnName() == null) ? 0 : getMetaDataColumnName().hashCode());
        hashCode = prime * hashCode + ((getContentColumnName() == null) ? 0 : getContentColumnName().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLoggingOptions() == null) ? 0 : getCloudWatchLoggingOptions().hashCode());
        hashCode = prime * hashCode + ((getProcessingConfiguration() == null) ? 0 : getProcessingConfiguration().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getRetryOptions() == null) ? 0 : getRetryOptions().hashCode());
        hashCode = prime * hashCode + ((getS3BackupMode() == null) ? 0 : getS3BackupMode().hashCode());
        hashCode = prime * hashCode + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeDestinationUpdate clone() {
        try {
            return (SnowflakeDestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.SnowflakeDestinationUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
