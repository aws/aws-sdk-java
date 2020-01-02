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
     * Amazon Elasticsearch Service parameters.
     * </p>
     */
    private AmazonElasticsearchParameters amazonElasticsearchParameters;
    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     */
    private AthenaParameters athenaParameters;
    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     */
    private AuroraParameters auroraParameters;
    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     */
    private AuroraPostgreSqlParameters auroraPostgreSqlParameters;
    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     */
    private AwsIotAnalyticsParameters awsIotAnalyticsParameters;
    /**
     * <p>
     * Jira parameters.
     * </p>
     */
    private JiraParameters jiraParameters;
    /**
     * <p>
     * MariaDB parameters.
     * </p>
     */
    private MariaDbParameters mariaDbParameters;
    /**
     * <p>
     * MySQL parameters.
     * </p>
     */
    private MySqlParameters mySqlParameters;
    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     */
    private PostgreSqlParameters postgreSqlParameters;
    /**
     * <p>
     * Presto parameters.
     * </p>
     */
    private PrestoParameters prestoParameters;
    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     */
    private RdsParameters rdsParameters;
    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     */
    private RedshiftParameters redshiftParameters;
    /**
     * <p>
     * S3 parameters.
     * </p>
     */
    private S3Parameters s3Parameters;
    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     */
    private ServiceNowParameters serviceNowParameters;
    /**
     * <p>
     * Snowflake parameters.
     * </p>
     */
    private SnowflakeParameters snowflakeParameters;
    /**
     * <p>
     * Spark parameters.
     * </p>
     */
    private SparkParameters sparkParameters;
    /**
     * <p>
     * SQL Server parameters.
     * </p>
     */
    private SqlServerParameters sqlServerParameters;
    /**
     * <p>
     * Teradata parameters.
     * </p>
     */
    private TeradataParameters teradataParameters;
    /**
     * <p>
     * Twitter parameters.
     * </p>
     */
    private TwitterParameters twitterParameters;

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     * 
     * @param amazonElasticsearchParameters
     *        Amazon Elasticsearch Service parameters.
     */

    public void setAmazonElasticsearchParameters(AmazonElasticsearchParameters amazonElasticsearchParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     * 
     * @return Amazon Elasticsearch Service parameters.
     */

    public AmazonElasticsearchParameters getAmazonElasticsearchParameters() {
        return this.amazonElasticsearchParameters;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service parameters.
     * </p>
     * 
     * @param amazonElasticsearchParameters
     *        Amazon Elasticsearch Service parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAmazonElasticsearchParameters(AmazonElasticsearchParameters amazonElasticsearchParameters) {
        setAmazonElasticsearchParameters(amazonElasticsearchParameters);
        return this;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     * 
     * @param athenaParameters
     *        Amazon Athena parameters.
     */

    public void setAthenaParameters(AthenaParameters athenaParameters) {
        this.athenaParameters = athenaParameters;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     * 
     * @return Amazon Athena parameters.
     */

    public AthenaParameters getAthenaParameters() {
        return this.athenaParameters;
    }

    /**
     * <p>
     * Amazon Athena parameters.
     * </p>
     * 
     * @param athenaParameters
     *        Amazon Athena parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAthenaParameters(AthenaParameters athenaParameters) {
        setAthenaParameters(athenaParameters);
        return this;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     * 
     * @param auroraParameters
     *        Amazon Aurora MySQL parameters.
     */

    public void setAuroraParameters(AuroraParameters auroraParameters) {
        this.auroraParameters = auroraParameters;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     * 
     * @return Amazon Aurora MySQL parameters.
     */

    public AuroraParameters getAuroraParameters() {
        return this.auroraParameters;
    }

    /**
     * <p>
     * Amazon Aurora MySQL parameters.
     * </p>
     * 
     * @param auroraParameters
     *        Amazon Aurora MySQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAuroraParameters(AuroraParameters auroraParameters) {
        setAuroraParameters(auroraParameters);
        return this;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     * 
     * @param auroraPostgreSqlParameters
     *        Aurora PostgreSQL parameters.
     */

    public void setAuroraPostgreSqlParameters(AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     * 
     * @return Aurora PostgreSQL parameters.
     */

    public AuroraPostgreSqlParameters getAuroraPostgreSqlParameters() {
        return this.auroraPostgreSqlParameters;
    }

    /**
     * <p>
     * Aurora PostgreSQL parameters.
     * </p>
     * 
     * @param auroraPostgreSqlParameters
     *        Aurora PostgreSQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAuroraPostgreSqlParameters(AuroraPostgreSqlParameters auroraPostgreSqlParameters) {
        setAuroraPostgreSqlParameters(auroraPostgreSqlParameters);
        return this;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     * 
     * @param awsIotAnalyticsParameters
     *        AWS IoT Analytics parameters.
     */

    public void setAwsIotAnalyticsParameters(AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        this.awsIotAnalyticsParameters = awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     * 
     * @return AWS IoT Analytics parameters.
     */

    public AwsIotAnalyticsParameters getAwsIotAnalyticsParameters() {
        return this.awsIotAnalyticsParameters;
    }

    /**
     * <p>
     * AWS IoT Analytics parameters.
     * </p>
     * 
     * @param awsIotAnalyticsParameters
     *        AWS IoT Analytics parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withAwsIotAnalyticsParameters(AwsIotAnalyticsParameters awsIotAnalyticsParameters) {
        setAwsIotAnalyticsParameters(awsIotAnalyticsParameters);
        return this;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     * 
     * @param jiraParameters
     *        Jira parameters.
     */

    public void setJiraParameters(JiraParameters jiraParameters) {
        this.jiraParameters = jiraParameters;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     * 
     * @return Jira parameters.
     */

    public JiraParameters getJiraParameters() {
        return this.jiraParameters;
    }

    /**
     * <p>
     * Jira parameters.
     * </p>
     * 
     * @param jiraParameters
     *        Jira parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withJiraParameters(JiraParameters jiraParameters) {
        setJiraParameters(jiraParameters);
        return this;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     * 
     * @param mariaDbParameters
     *        MariaDB parameters.
     */

    public void setMariaDbParameters(MariaDbParameters mariaDbParameters) {
        this.mariaDbParameters = mariaDbParameters;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     * 
     * @return MariaDB parameters.
     */

    public MariaDbParameters getMariaDbParameters() {
        return this.mariaDbParameters;
    }

    /**
     * <p>
     * MariaDB parameters.
     * </p>
     * 
     * @param mariaDbParameters
     *        MariaDB parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withMariaDbParameters(MariaDbParameters mariaDbParameters) {
        setMariaDbParameters(mariaDbParameters);
        return this;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     * 
     * @param mySqlParameters
     *        MySQL parameters.
     */

    public void setMySqlParameters(MySqlParameters mySqlParameters) {
        this.mySqlParameters = mySqlParameters;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     * 
     * @return MySQL parameters.
     */

    public MySqlParameters getMySqlParameters() {
        return this.mySqlParameters;
    }

    /**
     * <p>
     * MySQL parameters.
     * </p>
     * 
     * @param mySqlParameters
     *        MySQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withMySqlParameters(MySqlParameters mySqlParameters) {
        setMySqlParameters(mySqlParameters);
        return this;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     * 
     * @param postgreSqlParameters
     *        PostgreSQL parameters.
     */

    public void setPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        this.postgreSqlParameters = postgreSqlParameters;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     * 
     * @return PostgreSQL parameters.
     */

    public PostgreSqlParameters getPostgreSqlParameters() {
        return this.postgreSqlParameters;
    }

    /**
     * <p>
     * PostgreSQL parameters.
     * </p>
     * 
     * @param postgreSqlParameters
     *        PostgreSQL parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withPostgreSqlParameters(PostgreSqlParameters postgreSqlParameters) {
        setPostgreSqlParameters(postgreSqlParameters);
        return this;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     * 
     * @param prestoParameters
     *        Presto parameters.
     */

    public void setPrestoParameters(PrestoParameters prestoParameters) {
        this.prestoParameters = prestoParameters;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     * 
     * @return Presto parameters.
     */

    public PrestoParameters getPrestoParameters() {
        return this.prestoParameters;
    }

    /**
     * <p>
     * Presto parameters.
     * </p>
     * 
     * @param prestoParameters
     *        Presto parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withPrestoParameters(PrestoParameters prestoParameters) {
        setPrestoParameters(prestoParameters);
        return this;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     * 
     * @param rdsParameters
     *        Amazon RDS parameters.
     */

    public void setRdsParameters(RdsParameters rdsParameters) {
        this.rdsParameters = rdsParameters;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     * 
     * @return Amazon RDS parameters.
     */

    public RdsParameters getRdsParameters() {
        return this.rdsParameters;
    }

    /**
     * <p>
     * Amazon RDS parameters.
     * </p>
     * 
     * @param rdsParameters
     *        Amazon RDS parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withRdsParameters(RdsParameters rdsParameters) {
        setRdsParameters(rdsParameters);
        return this;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     * 
     * @param redshiftParameters
     *        Amazon Redshift parameters.
     */

    public void setRedshiftParameters(RedshiftParameters redshiftParameters) {
        this.redshiftParameters = redshiftParameters;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     * 
     * @return Amazon Redshift parameters.
     */

    public RedshiftParameters getRedshiftParameters() {
        return this.redshiftParameters;
    }

    /**
     * <p>
     * Amazon Redshift parameters.
     * </p>
     * 
     * @param redshiftParameters
     *        Amazon Redshift parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withRedshiftParameters(RedshiftParameters redshiftParameters) {
        setRedshiftParameters(redshiftParameters);
        return this;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     * 
     * @param s3Parameters
     *        S3 parameters.
     */

    public void setS3Parameters(S3Parameters s3Parameters) {
        this.s3Parameters = s3Parameters;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     * 
     * @return S3 parameters.
     */

    public S3Parameters getS3Parameters() {
        return this.s3Parameters;
    }

    /**
     * <p>
     * S3 parameters.
     * </p>
     * 
     * @param s3Parameters
     *        S3 parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withS3Parameters(S3Parameters s3Parameters) {
        setS3Parameters(s3Parameters);
        return this;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     * 
     * @param serviceNowParameters
     *        ServiceNow parameters.
     */

    public void setServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        this.serviceNowParameters = serviceNowParameters;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     * 
     * @return ServiceNow parameters.
     */

    public ServiceNowParameters getServiceNowParameters() {
        return this.serviceNowParameters;
    }

    /**
     * <p>
     * ServiceNow parameters.
     * </p>
     * 
     * @param serviceNowParameters
     *        ServiceNow parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withServiceNowParameters(ServiceNowParameters serviceNowParameters) {
        setServiceNowParameters(serviceNowParameters);
        return this;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     * 
     * @param snowflakeParameters
     *        Snowflake parameters.
     */

    public void setSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        this.snowflakeParameters = snowflakeParameters;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     * 
     * @return Snowflake parameters.
     */

    public SnowflakeParameters getSnowflakeParameters() {
        return this.snowflakeParameters;
    }

    /**
     * <p>
     * Snowflake parameters.
     * </p>
     * 
     * @param snowflakeParameters
     *        Snowflake parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSnowflakeParameters(SnowflakeParameters snowflakeParameters) {
        setSnowflakeParameters(snowflakeParameters);
        return this;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     * 
     * @param sparkParameters
     *        Spark parameters.
     */

    public void setSparkParameters(SparkParameters sparkParameters) {
        this.sparkParameters = sparkParameters;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     * 
     * @return Spark parameters.
     */

    public SparkParameters getSparkParameters() {
        return this.sparkParameters;
    }

    /**
     * <p>
     * Spark parameters.
     * </p>
     * 
     * @param sparkParameters
     *        Spark parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSparkParameters(SparkParameters sparkParameters) {
        setSparkParameters(sparkParameters);
        return this;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     * 
     * @param sqlServerParameters
     *        SQL Server parameters.
     */

    public void setSqlServerParameters(SqlServerParameters sqlServerParameters) {
        this.sqlServerParameters = sqlServerParameters;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     * 
     * @return SQL Server parameters.
     */

    public SqlServerParameters getSqlServerParameters() {
        return this.sqlServerParameters;
    }

    /**
     * <p>
     * SQL Server parameters.
     * </p>
     * 
     * @param sqlServerParameters
     *        SQL Server parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withSqlServerParameters(SqlServerParameters sqlServerParameters) {
        setSqlServerParameters(sqlServerParameters);
        return this;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     * 
     * @param teradataParameters
     *        Teradata parameters.
     */

    public void setTeradataParameters(TeradataParameters teradataParameters) {
        this.teradataParameters = teradataParameters;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     * 
     * @return Teradata parameters.
     */

    public TeradataParameters getTeradataParameters() {
        return this.teradataParameters;
    }

    /**
     * <p>
     * Teradata parameters.
     * </p>
     * 
     * @param teradataParameters
     *        Teradata parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withTeradataParameters(TeradataParameters teradataParameters) {
        setTeradataParameters(teradataParameters);
        return this;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     * 
     * @param twitterParameters
     *        Twitter parameters.
     */

    public void setTwitterParameters(TwitterParameters twitterParameters) {
        this.twitterParameters = twitterParameters;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     * 
     * @return Twitter parameters.
     */

    public TwitterParameters getTwitterParameters() {
        return this.twitterParameters;
    }

    /**
     * <p>
     * Twitter parameters.
     * </p>
     * 
     * @param twitterParameters
     *        Twitter parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSourceParameters withTwitterParameters(TwitterParameters twitterParameters) {
        setTwitterParameters(twitterParameters);
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
            sb.append("TwitterParameters: ").append(getTwitterParameters());
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
