/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters that Amazon QuickSight uses to connect to your underlying data source. This is a variant type
 * structure. For this structure to be valid, only one of the attributes can be non-null.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataSourceParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSourceParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     */
    private AmazonElasticsearchParameters amazonElasticsearchParameters;
    /**
     * <p>
     * The parameters for Amazon Athena.
     * </p>
     */
    private AthenaParameters athenaParameters;
    /**
     * <p>
     * The parameters for Amazon Aurora MySQL.
     * </p>
     */
    private AuroraParameters auroraParameters;
    /**
     * <p>
     * The parameters for Amazon Aurora.
     * </p>
     */
    private AuroraPostgreSqlParameters auroraPostgreSqlParameters;
    /**
     * <p>
     * The parameters for IoT Analytics.
     * </p>
     */
    private AwsIotAnalyticsParameters awsIotAnalyticsParameters;
    /**
     * <p>
     * The parameters for Jira.
     * </p>
     */
    private JiraParameters jiraParameters;
    /**
     * <p>
     * The parameters for MariaDB.
     * </p>
     */
    private MariaDbParameters mariaDbParameters;
    /**
     * <p>
     * The parameters for MySQL.
     * </p>
     */
    private MySqlParameters mySqlParameters;
    /**
     * <p>
     * The parameters for Oracle.
     * </p>
     */
    private OracleParameters oracleParameters;
    /**
     * <p>
     * The parameters for PostgreSQL.
     * </p>
     */
    private PostgreSqlParameters postgreSqlParameters;
    /**
     * <p>
     * The parameters for Presto.
     * </p>
     */
    private PrestoParameters prestoParameters;
    /**
     * <p>
     * The parameters for Amazon RDS.
     * </p>
     */
    private RdsParameters rdsParameters;
    /**
     * <p>
     * The parameters for Amazon Redshift.
     * </p>
     */
    private RedshiftParameters redshiftParameters;
    /**
     * <p>
     * The parameters for S3.
     * </p>
     */
    private S3Parameters s3Parameters;
    /**
     * <p>
     * The parameters for ServiceNow.
     * </p>
     */
    private ServiceNowParameters serviceNowParameters;
    /**
     * <p>
     * The parameters for Snowflake.
     * </p>
     */
    private SnowflakeParameters snowflakeParameters;
    /**
     * <p>
     * The parameters for Spark.
     * </p>
     */
    private SparkParameters sparkParameters;
    /**
     * <p>
     * The parameters for SQL Server.
     * </p>
     */
    private SqlServerParameters sqlServerParameters;
    /**
     * <p>
     * The parameters for Teradata.
     * </p>
     */
    private TeradataParameters teradataParameters;
    /**
     * <p>
     * The parameters for Twitter.
     * </p>
     */
    private TwitterParameters twitterParameters;
    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     */
    private AmazonOpenSearchParameters amazonOpenSearchParameters;
    /**
     * <p>
     * The parameters for Exasol.
     * </p>
     */
    private ExasolParameters exasolParameters;
    /**
     * <p>
     * The required parameters that are needed to connect to a Databricks data source.
     * </p>
     */
    private DatabricksParameters databricksParameters;

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @param amazonElasticsearchParameters
     *        The parameters for OpenSearch.
     */

    public void setAmazonElasticsearchParameters(AmazonElasticsearchParameters amazonElasticsearchParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
    }

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @return The parameters for OpenSearch.
     */

    public AmazonElasticsearchParameters getAmazonElasticsearchParameters() {
        return this.amazonElasticsearchParameters;
    }

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @param amazonElasticsearchParameters
     *        The parameters for OpenSearch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAmazonElasticsearchParameters(AmazonElasticsearchParameters amazonElasticsearchParameters) {
        setAmazonElasticsearchParameters(amazonElasticsearchParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Amazon Athena.
     * </p>
     * 
     * @param athenaParameters
     *        The parameters for Amazon Athena.
     */

    public void setAthenaParameters(AthenaParameters athenaParameters) {
        this.athenaParameters = athenaParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Athena.
     * </p>
     * 
     * @return The parameters for Amazon Athena.
     */

    public AthenaParameters getAthenaParameters() {
        return this.athenaParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Athena.
     * </p>
     * 
     * @param athenaParameters
     *        The parameters for Amazon Athena.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAthenaParameters(AthenaParameters athenaParameters) {
        setAthenaParameters(athenaParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora MySQL.
     * </p>
     * 
     * @param auroraParameters
     *        The parameters for Amazon Aurora MySQL.
     */

    public void setAuroraParameters(AuroraParameters auroraParameters) {
        this.auroraParameters = auroraParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora MySQL.
     * </p>
     * 
     * @return The parameters for Amazon Aurora MySQL.
     */

    public AuroraParameters getAuroraParameters() {
        return this.auroraParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora MySQL.
     * </p>
     * 
     * @param auroraParameters
     *        The parameters for Amazon Aurora MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAuroraParameters(AuroraParameters auroraParameters) {
        setAuroraParameters(auroraParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora.
     * </p>
     * 
     * @param auroraPostgreSqlParameters
     *        The parameters for Amazon Aurora.
     */

    public void setAuroraPostgreSqlParameters(AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora.
     * </p>
     * 
     * @return The parameters for Amazon Aurora.
     */

    public AuroraPostgreSqlParameters getAuroraPostgreSqlParameters() {
        return this.auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Aurora.
     * </p>
     * 
     * @param auroraPostgreSqlParameters
     *        The parameters for Amazon Aurora.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAuroraPostgreSqlParameters(AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        setAuroraPostgreSqlParameters(auroraPostgreSqlParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for IoT Analytics.
     * </p>
     * 
     * @param awsIotAnalyticsParameters
     *        The parameters for IoT Analytics.
     */

    public void setAwsIotAnalyticsParameters(AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        this.awsIotAnalyticsParameters = awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * The parameters for IoT Analytics.
     * </p>
     * 
     * @return The parameters for IoT Analytics.
     */

    public AwsIotAnalyticsParameters getAwsIotAnalyticsParameters() {
        return this.awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * The parameters for IoT Analytics.
     * </p>
     * 
     * @param awsIotAnalyticsParameters
     *        The parameters for IoT Analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAwsIotAnalyticsParameters(AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        setAwsIotAnalyticsParameters(awsIotAnalyticsParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Jira.
     * </p>
     * 
     * @param jiraParameters
     *        The parameters for Jira.
     */

    public void setJiraParameters(JiraParameters jiraParameters) {
        this.jiraParameters = jiraParameters;
    }

    /**
     * <p>
     * The parameters for Jira.
     * </p>
     * 
     * @return The parameters for Jira.
     */

    public JiraParameters getJiraParameters() {
        return this.jiraParameters;
    }

    /**
     * <p>
     * The parameters for Jira.
     * </p>
     * 
     * @param jiraParameters
     *        The parameters for Jira.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withJiraParameters(JiraParameters jiraParameters) {
        setJiraParameters(jiraParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for MariaDB.
     * </p>
     * 
     * @param mariaDbParameters
     *        The parameters for MariaDB.
     */

    public void setMariaDbParameters(MariaDbParameters mariaDbParameters) {
        this.mariaDbParameters = mariaDbParameters;
    }

    /**
     * <p>
     * The parameters for MariaDB.
     * </p>
     * 
     * @return The parameters for MariaDB.
     */

    public MariaDbParameters getMariaDbParameters() {
        return this.mariaDbParameters;
    }

    /**
     * <p>
     * The parameters for MariaDB.
     * </p>
     * 
     * @param mariaDbParameters
     *        The parameters for MariaDB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withMariaDbParameters(MariaDbParameters mariaDbParameters) {
        setMariaDbParameters(mariaDbParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for MySQL.
     * </p>
     * 
     * @param mySqlParameters
     *        The parameters for MySQL.
     */

    public void setMySqlParameters(MySqlParameters mySqlParameters) {
        this.mySqlParameters = mySqlParameters;
    }

    /**
     * <p>
     * The parameters for MySQL.
     * </p>
     * 
     * @return The parameters for MySQL.
     */

    public MySqlParameters getMySqlParameters() {
        return this.mySqlParameters;
    }

    /**
     * <p>
     * The parameters for MySQL.
     * </p>
     * 
     * @param mySqlParameters
     *        The parameters for MySQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withMySqlParameters(MySqlParameters mySqlParameters) {
        setMySqlParameters(mySqlParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Oracle.
     * </p>
     * 
     * @param oracleParameters
     *        The parameters for Oracle.
     */

    public void setOracleParameters(OracleParameters oracleParameters) {
        this.oracleParameters = oracleParameters;
    }

    /**
     * <p>
     * The parameters for Oracle.
     * </p>
     * 
     * @return The parameters for Oracle.
     */

    public OracleParameters getOracleParameters() {
        return this.oracleParameters;
    }

    /**
     * <p>
     * The parameters for Oracle.
     * </p>
     * 
     * @param oracleParameters
     *        The parameters for Oracle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withOracleParameters(OracleParameters oracleParameters) {
        setOracleParameters(oracleParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for PostgreSQL.
     * </p>
     * 
     * @param postgreSqlParameters
     *        The parameters for PostgreSQL.
     */

    public void setPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        this.postgreSqlParameters = postgreSqlParameters;
    }

    /**
     * <p>
     * The parameters for PostgreSQL.
     * </p>
     * 
     * @return The parameters for PostgreSQL.
     */

    public PostgreSqlParameters getPostgreSqlParameters() {
        return this.postgreSqlParameters;
    }

    /**
     * <p>
     * The parameters for PostgreSQL.
     * </p>
     * 
     * @param postgreSqlParameters
     *        The parameters for PostgreSQL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        setPostgreSqlParameters(postgreSqlParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Presto.
     * </p>
     * 
     * @param prestoParameters
     *        The parameters for Presto.
     */

    public void setPrestoParameters(PrestoParameters prestoParameters) {
        this.prestoParameters = prestoParameters;
    }

    /**
     * <p>
     * The parameters for Presto.
     * </p>
     * 
     * @return The parameters for Presto.
     */

    public PrestoParameters getPrestoParameters() {
        return this.prestoParameters;
    }

    /**
     * <p>
     * The parameters for Presto.
     * </p>
     * 
     * @param prestoParameters
     *        The parameters for Presto.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withPrestoParameters(PrestoParameters prestoParameters) {
        setPrestoParameters(prestoParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Amazon RDS.
     * </p>
     * 
     * @param rdsParameters
     *        The parameters for Amazon RDS.
     */

    public void setRdsParameters(RdsParameters rdsParameters) {
        this.rdsParameters = rdsParameters;
    }

    /**
     * <p>
     * The parameters for Amazon RDS.
     * </p>
     * 
     * @return The parameters for Amazon RDS.
     */

    public RdsParameters getRdsParameters() {
        return this.rdsParameters;
    }

    /**
     * <p>
     * The parameters for Amazon RDS.
     * </p>
     * 
     * @param rdsParameters
     *        The parameters for Amazon RDS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withRdsParameters(RdsParameters rdsParameters) {
        setRdsParameters(rdsParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Amazon Redshift.
     * </p>
     * 
     * @param redshiftParameters
     *        The parameters for Amazon Redshift.
     */

    public void setRedshiftParameters(RedshiftParameters redshiftParameters) {
        this.redshiftParameters = redshiftParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Redshift.
     * </p>
     * 
     * @return The parameters for Amazon Redshift.
     */

    public RedshiftParameters getRedshiftParameters() {
        return this.redshiftParameters;
    }

    /**
     * <p>
     * The parameters for Amazon Redshift.
     * </p>
     * 
     * @param redshiftParameters
     *        The parameters for Amazon Redshift.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withRedshiftParameters(RedshiftParameters redshiftParameters) {
        setRedshiftParameters(redshiftParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for S3.
     * </p>
     * 
     * @param s3Parameters
     *        The parameters for S3.
     */

    public void setS3Parameters(S3Parameters s3Parameters) {
        this.s3Parameters = s3Parameters;
    }

    /**
     * <p>
     * The parameters for S3.
     * </p>
     * 
     * @return The parameters for S3.
     */

    public S3Parameters getS3Parameters() {
        return this.s3Parameters;
    }

    /**
     * <p>
     * The parameters for S3.
     * </p>
     * 
     * @param s3Parameters
     *        The parameters for S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withS3Parameters(S3Parameters s3Parameters) {
        setS3Parameters(s3Parameters);
        return this;
    }

    /**
     * <p>
     * The parameters for ServiceNow.
     * </p>
     * 
     * @param serviceNowParameters
     *        The parameters for ServiceNow.
     */

    public void setServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        this.serviceNowParameters = serviceNowParameters;
    }

    /**
     * <p>
     * The parameters for ServiceNow.
     * </p>
     * 
     * @return The parameters for ServiceNow.
     */

    public ServiceNowParameters getServiceNowParameters() {
        return this.serviceNowParameters;
    }

    /**
     * <p>
     * The parameters for ServiceNow.
     * </p>
     * 
     * @param serviceNowParameters
     *        The parameters for ServiceNow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        setServiceNowParameters(serviceNowParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Snowflake.
     * </p>
     * 
     * @param snowflakeParameters
     *        The parameters for Snowflake.
     */

    public void setSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        this.snowflakeParameters = snowflakeParameters;
    }

    /**
     * <p>
     * The parameters for Snowflake.
     * </p>
     * 
     * @return The parameters for Snowflake.
     */

    public SnowflakeParameters getSnowflakeParameters() {
        return this.snowflakeParameters;
    }

    /**
     * <p>
     * The parameters for Snowflake.
     * </p>
     * 
     * @param snowflakeParameters
     *        The parameters for Snowflake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        setSnowflakeParameters(snowflakeParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Spark.
     * </p>
     * 
     * @param sparkParameters
     *        The parameters for Spark.
     */

    public void setSparkParameters(SparkParameters sparkParameters) {
        this.sparkParameters = sparkParameters;
    }

    /**
     * <p>
     * The parameters for Spark.
     * </p>
     * 
     * @return The parameters for Spark.
     */

    public SparkParameters getSparkParameters() {
        return this.sparkParameters;
    }

    /**
     * <p>
     * The parameters for Spark.
     * </p>
     * 
     * @param sparkParameters
     *        The parameters for Spark.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSparkParameters(SparkParameters sparkParameters) {
        setSparkParameters(sparkParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for SQL Server.
     * </p>
     * 
     * @param sqlServerParameters
     *        The parameters for SQL Server.
     */

    public void setSqlServerParameters(SqlServerParameters sqlServerParameters) {
        this.sqlServerParameters = sqlServerParameters;
    }

    /**
     * <p>
     * The parameters for SQL Server.
     * </p>
     * 
     * @return The parameters for SQL Server.
     */

    public SqlServerParameters getSqlServerParameters() {
        return this.sqlServerParameters;
    }

    /**
     * <p>
     * The parameters for SQL Server.
     * </p>
     * 
     * @param sqlServerParameters
     *        The parameters for SQL Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSqlServerParameters(SqlServerParameters sqlServerParameters) {
        setSqlServerParameters(sqlServerParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Teradata.
     * </p>
     * 
     * @param teradataParameters
     *        The parameters for Teradata.
     */

    public void setTeradataParameters(TeradataParameters teradataParameters) {
        this.teradataParameters = teradataParameters;
    }

    /**
     * <p>
     * The parameters for Teradata.
     * </p>
     * 
     * @return The parameters for Teradata.
     */

    public TeradataParameters getTeradataParameters() {
        return this.teradataParameters;
    }

    /**
     * <p>
     * The parameters for Teradata.
     * </p>
     * 
     * @param teradataParameters
     *        The parameters for Teradata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withTeradataParameters(TeradataParameters teradataParameters) {
        setTeradataParameters(teradataParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Twitter.
     * </p>
     * 
     * @param twitterParameters
     *        The parameters for Twitter.
     */

    public void setTwitterParameters(TwitterParameters twitterParameters) {
        this.twitterParameters = twitterParameters;
    }

    /**
     * <p>
     * The parameters for Twitter.
     * </p>
     * 
     * @return The parameters for Twitter.
     */

    public TwitterParameters getTwitterParameters() {
        return this.twitterParameters;
    }

    /**
     * <p>
     * The parameters for Twitter.
     * </p>
     * 
     * @param twitterParameters
     *        The parameters for Twitter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withTwitterParameters(TwitterParameters twitterParameters) {
        setTwitterParameters(twitterParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @param amazonOpenSearchParameters
     *        The parameters for OpenSearch.
     */

    public void setAmazonOpenSearchParameters(AmazonOpenSearchParameters amazonOpenSearchParameters) {
        this.amazonOpenSearchParameters = amazonOpenSearchParameters;
    }

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @return The parameters for OpenSearch.
     */

    public AmazonOpenSearchParameters getAmazonOpenSearchParameters() {
        return this.amazonOpenSearchParameters;
    }

    /**
     * <p>
     * The parameters for OpenSearch.
     * </p>
     * 
     * @param amazonOpenSearchParameters
     *        The parameters for OpenSearch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAmazonOpenSearchParameters(AmazonOpenSearchParameters amazonOpenSearchParameters) {
        setAmazonOpenSearchParameters(amazonOpenSearchParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for Exasol.
     * </p>
     * 
     * @param exasolParameters
     *        The parameters for Exasol.
     */

    public void setExasolParameters(ExasolParameters exasolParameters) {
        this.exasolParameters = exasolParameters;
    }

    /**
     * <p>
     * The parameters for Exasol.
     * </p>
     * 
     * @return The parameters for Exasol.
     */

    public ExasolParameters getExasolParameters() {
        return this.exasolParameters;
    }

    /**
     * <p>
     * The parameters for Exasol.
     * </p>
     * 
     * @param exasolParameters
     *        The parameters for Exasol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withExasolParameters(ExasolParameters exasolParameters) {
        setExasolParameters(exasolParameters);
        return this;
    }

    /**
     * <p>
     * The required parameters that are needed to connect to a Databricks data source.
     * </p>
     * 
     * @param databricksParameters
     *        The required parameters that are needed to connect to a Databricks data source.
     */

    public void setDatabricksParameters(DatabricksParameters databricksParameters) {
        this.databricksParameters = databricksParameters;
    }

    /**
     * <p>
     * The required parameters that are needed to connect to a Databricks data source.
     * </p>
     * 
     * @return The required parameters that are needed to connect to a Databricks data source.
     */

    public DatabricksParameters getDatabricksParameters() {
        return this.databricksParameters;
    }

    /**
     * <p>
     * The required parameters that are needed to connect to a Databricks data source.
     * </p>
     * 
     * @param databricksParameters
     *        The required parameters that are needed to connect to a Databricks data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withDatabricksParameters(DatabricksParameters databricksParameters) {
        setDatabricksParameters(databricksParameters);
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
        if (getAmazonElasticsearchParameters() != null)
            sb.append("AmazonElasticsearchParameters: ").append(getAmazonElasticsearchParameters()).append(",");
        if (getAthenaParameters() != null)
            sb.append("AthenaParameters: ").append(getAthenaParameters()).append(",");
        if (getAuroraParameters() != null)
            sb.append("AuroraParameters: ").append(getAuroraParameters()).append(",");
        if (getAuroraPostgreSqlParameters() != null)
            sb.append("AuroraPostgreSqlParameters: ").append(getAuroraPostgreSqlParameters()).append(",");
        if (getAwsIotAnalyticsParameters() != null)
            sb.append("AwsIotAnalyticsParameters: ").append(getAwsIotAnalyticsParameters()).append(",");
        if (getJiraParameters() != null)
            sb.append("JiraParameters: ").append(getJiraParameters()).append(",");
        if (getMariaDbParameters() != null)
            sb.append("MariaDbParameters: ").append(getMariaDbParameters()).append(",");
        if (getMySqlParameters() != null)
            sb.append("MySqlParameters: ").append(getMySqlParameters()).append(",");
        if (getOracleParameters() != null)
            sb.append("OracleParameters: ").append(getOracleParameters()).append(",");
        if (getPostgreSqlParameters() != null)
            sb.append("PostgreSqlParameters: ").append(getPostgreSqlParameters()).append(",");
        if (getPrestoParameters() != null)
            sb.append("PrestoParameters: ").append(getPrestoParameters()).append(",");
        if (getRdsParameters() != null)
            sb.append("RdsParameters: ").append(getRdsParameters()).append(",");
        if (getRedshiftParameters() != null)
            sb.append("RedshiftParameters: ").append(getRedshiftParameters()).append(",");
        if (getS3Parameters() != null)
            sb.append("S3Parameters: ").append(getS3Parameters()).append(",");
        if (getServiceNowParameters() != null)
            sb.append("ServiceNowParameters: ").append(getServiceNowParameters()).append(",");
        if (getSnowflakeParameters() != null)
            sb.append("SnowflakeParameters: ").append(getSnowflakeParameters()).append(",");
        if (getSparkParameters() != null)
            sb.append("SparkParameters: ").append(getSparkParameters()).append(",");
        if (getSqlServerParameters() != null)
            sb.append("SqlServerParameters: ").append(getSqlServerParameters()).append(",");
        if (getTeradataParameters() != null)
            sb.append("TeradataParameters: ").append(getTeradataParameters()).append(",");
        if (getTwitterParameters() != null)
            sb.append("TwitterParameters: ").append(getTwitterParameters()).append(",");
        if (getAmazonOpenSearchParameters() != null)
            sb.append("AmazonOpenSearchParameters: ").append(getAmazonOpenSearchParameters()).append(",");
        if (getExasolParameters() != null)
            sb.append("ExasolParameters: ").append(getExasolParameters()).append(",");
        if (getDatabricksParameters() != null)
            sb.append("DatabricksParameters: ").append(getDatabricksParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSourceParameters == false)
            return false;
        DataSourceParameters other = (DataSourceParameters) obj;
        if (other.getAmazonElasticsearchParameters() == null ^ this.getAmazonElasticsearchParameters() == null)
            return false;
        if (other.getAmazonElasticsearchParameters() != null
                && other.getAmazonElasticsearchParameters().equals(this.getAmazonElasticsearchParameters()) == false)
            return false;
        if (other.getAthenaParameters() == null ^ this.getAthenaParameters() == null)
            return false;
        if (other.getAthenaParameters() != null && other.getAthenaParameters().equals(this.getAthenaParameters()) == false)
            return false;
        if (other.getAuroraParameters() == null ^ this.getAuroraParameters() == null)
            return false;
        if (other.getAuroraParameters() != null && other.getAuroraParameters().equals(this.getAuroraParameters()) == false)
            return false;
        if (other.getAuroraPostgreSqlParameters() == null ^ this.getAuroraPostgreSqlParameters() == null)
            return false;
        if (other.getAuroraPostgreSqlParameters() != null && other.getAuroraPostgreSqlParameters().equals(this.getAuroraPostgreSqlParameters()) == false)
            return false;
        if (other.getAwsIotAnalyticsParameters() == null ^ this.getAwsIotAnalyticsParameters() == null)
            return false;
        if (other.getAwsIotAnalyticsParameters() != null && other.getAwsIotAnalyticsParameters().equals(this.getAwsIotAnalyticsParameters()) == false)
            return false;
        if (other.getJiraParameters() == null ^ this.getJiraParameters() == null)
            return false;
        if (other.getJiraParameters() != null && other.getJiraParameters().equals(this.getJiraParameters()) == false)
            return false;
        if (other.getMariaDbParameters() == null ^ this.getMariaDbParameters() == null)
            return false;
        if (other.getMariaDbParameters() != null && other.getMariaDbParameters().equals(this.getMariaDbParameters()) == false)
            return false;
        if (other.getMySqlParameters() == null ^ this.getMySqlParameters() == null)
            return false;
        if (other.getMySqlParameters() != null && other.getMySqlParameters().equals(this.getMySqlParameters()) == false)
            return false;
        if (other.getOracleParameters() == null ^ this.getOracleParameters() == null)
            return false;
        if (other.getOracleParameters() != null && other.getOracleParameters().equals(this.getOracleParameters()) == false)
            return false;
        if (other.getPostgreSqlParameters() == null ^ this.getPostgreSqlParameters() == null)
            return false;
        if (other.getPostgreSqlParameters() != null && other.getPostgreSqlParameters().equals(this.getPostgreSqlParameters()) == false)
            return false;
        if (other.getPrestoParameters() == null ^ this.getPrestoParameters() == null)
            return false;
        if (other.getPrestoParameters() != null && other.getPrestoParameters().equals(this.getPrestoParameters()) == false)
            return false;
        if (other.getRdsParameters() == null ^ this.getRdsParameters() == null)
            return false;
        if (other.getRdsParameters() != null && other.getRdsParameters().equals(this.getRdsParameters()) == false)
            return false;
        if (other.getRedshiftParameters() == null ^ this.getRedshiftParameters() == null)
            return false;
        if (other.getRedshiftParameters() != null && other.getRedshiftParameters().equals(this.getRedshiftParameters()) == false)
            return false;
        if (other.getS3Parameters() == null ^ this.getS3Parameters() == null)
            return false;
        if (other.getS3Parameters() != null && other.getS3Parameters().equals(this.getS3Parameters()) == false)
            return false;
        if (other.getServiceNowParameters() == null ^ this.getServiceNowParameters() == null)
            return false;
        if (other.getServiceNowParameters() != null && other.getServiceNowParameters().equals(this.getServiceNowParameters()) == false)
            return false;
        if (other.getSnowflakeParameters() == null ^ this.getSnowflakeParameters() == null)
            return false;
        if (other.getSnowflakeParameters() != null && other.getSnowflakeParameters().equals(this.getSnowflakeParameters()) == false)
            return false;
        if (other.getSparkParameters() == null ^ this.getSparkParameters() == null)
            return false;
        if (other.getSparkParameters() != null && other.getSparkParameters().equals(this.getSparkParameters()) == false)
            return false;
        if (other.getSqlServerParameters() == null ^ this.getSqlServerParameters() == null)
            return false;
        if (other.getSqlServerParameters() != null && other.getSqlServerParameters().equals(this.getSqlServerParameters()) == false)
            return false;
        if (other.getTeradataParameters() == null ^ this.getTeradataParameters() == null)
            return false;
        if (other.getTeradataParameters() != null && other.getTeradataParameters().equals(this.getTeradataParameters()) == false)
            return false;
        if (other.getTwitterParameters() == null ^ this.getTwitterParameters() == null)
            return false;
        if (other.getTwitterParameters() != null && other.getTwitterParameters().equals(this.getTwitterParameters()) == false)
            return false;
        if (other.getAmazonOpenSearchParameters() == null ^ this.getAmazonOpenSearchParameters() == null)
            return false;
        if (other.getAmazonOpenSearchParameters() != null && other.getAmazonOpenSearchParameters().equals(this.getAmazonOpenSearchParameters()) == false)
            return false;
        if (other.getExasolParameters() == null ^ this.getExasolParameters() == null)
            return false;
        if (other.getExasolParameters() != null && other.getExasolParameters().equals(this.getExasolParameters()) == false)
            return false;
        if (other.getDatabricksParameters() == null ^ this.getDatabricksParameters() == null)
            return false;
        if (other.getDatabricksParameters() != null && other.getDatabricksParameters().equals(this.getDatabricksParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmazonElasticsearchParameters() == null) ? 0 : getAmazonElasticsearchParameters().hashCode());
        hashCode = prime * hashCode + ((getAthenaParameters() == null) ? 0 : getAthenaParameters().hashCode());
        hashCode = prime * hashCode + ((getAuroraParameters() == null) ? 0 : getAuroraParameters().hashCode());
        hashCode = prime * hashCode + ((getAuroraPostgreSqlParameters() == null) ? 0 : getAuroraPostgreSqlParameters().hashCode());
        hashCode = prime * hashCode + ((getAwsIotAnalyticsParameters() == null) ? 0 : getAwsIotAnalyticsParameters().hashCode());
        hashCode = prime * hashCode + ((getJiraParameters() == null) ? 0 : getJiraParameters().hashCode());
        hashCode = prime * hashCode + ((getMariaDbParameters() == null) ? 0 : getMariaDbParameters().hashCode());
        hashCode = prime * hashCode + ((getMySqlParameters() == null) ? 0 : getMySqlParameters().hashCode());
        hashCode = prime * hashCode + ((getOracleParameters() == null) ? 0 : getOracleParameters().hashCode());
        hashCode = prime * hashCode + ((getPostgreSqlParameters() == null) ? 0 : getPostgreSqlParameters().hashCode());
        hashCode = prime * hashCode + ((getPrestoParameters() == null) ? 0 : getPrestoParameters().hashCode());
        hashCode = prime * hashCode + ((getRdsParameters() == null) ? 0 : getRdsParameters().hashCode());
        hashCode = prime * hashCode + ((getRedshiftParameters() == null) ? 0 : getRedshiftParameters().hashCode());
        hashCode = prime * hashCode + ((getS3Parameters() == null) ? 0 : getS3Parameters().hashCode());
        hashCode = prime * hashCode + ((getServiceNowParameters() == null) ? 0 : getServiceNowParameters().hashCode());
        hashCode = prime * hashCode + ((getSnowflakeParameters() == null) ? 0 : getSnowflakeParameters().hashCode());
        hashCode = prime * hashCode + ((getSparkParameters() == null) ? 0 : getSparkParameters().hashCode());
        hashCode = prime * hashCode + ((getSqlServerParameters() == null) ? 0 : getSqlServerParameters().hashCode());
        hashCode = prime * hashCode + ((getTeradataParameters() == null) ? 0 : getTeradataParameters().hashCode());
        hashCode = prime * hashCode + ((getTwitterParameters() == null) ? 0 : getTwitterParameters().hashCode());
        hashCode = prime * hashCode + ((getAmazonOpenSearchParameters() == null) ? 0 : getAmazonOpenSearchParameters().hashCode());
        hashCode = prime * hashCode + ((getExasolParameters() == null) ? 0 : getExasolParameters().hashCode());
        hashCode = prime * hashCode + ((getDatabricksParameters() == null) ? 0 : getDatabricksParameters().hashCode());
        return hashCode;
    }

    @Override
    public DataSourceParameters clone() {
        try {
            return (DataSourceParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataSourceParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
