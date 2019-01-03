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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API ID for the GraphQL API for the <code>DataSource</code>.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * A user-supplied name for the <code>DataSource</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the <code>DataSource</code>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the <code>DataSource</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Amazon DynamoDB settings.
     * </p>
     */
    private DynamodbDataSourceConfig dynamodbConfig;
    /**
     * <p>
     * AWS Lambda settings.
     * </p>
     */
    private LambdaDataSourceConfig lambdaConfig;
    /**
     * <p>
     * Amazon Elasticsearch Service settings.
     * </p>
     */
    private ElasticsearchDataSourceConfig elasticsearchConfig;
    /**
     * <p>
     * HTTP endpoint settings.
     * </p>
     */
    private HttpDataSourceConfig httpConfig;
    /**
     * <p>
     * Relational database settings.
     * </p>
     */
    private RelationalDatabaseDataSourceConfig relationalDatabaseConfig;

    /**
     * <p>
     * The API ID for the GraphQL API for the <code>DataSource</code>.
     * </p>
     * 
     * @param apiId
     *        The API ID for the GraphQL API for the <code>DataSource</code>.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID for the GraphQL API for the <code>DataSource</code>.
     * </p>
     * 
     * @return The API ID for the GraphQL API for the <code>DataSource</code>.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID for the GraphQL API for the <code>DataSource</code>.
     * </p>
     * 
     * @param apiId
     *        The API ID for the GraphQL API for the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name for the <code>DataSource</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>DataSource</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied name for the <code>DataSource</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A user-supplied name for the <code>DataSource</code>.
     * </p>
     * 
     * @param name
     *        A user-supplied name for the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the <code>DataSource</code>.
     * </p>
     * 
     * @param description
     *        A description of the <code>DataSource</code>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the <code>DataSource</code>.
     * </p>
     * 
     * @return A description of the <code>DataSource</code>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the <code>DataSource</code>.
     * </p>
     * 
     * @param description
     *        A description of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the <code>DataSource</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>DataSource</code>.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the <code>DataSource</code>.
     * </p>
     * 
     * @return The type of the <code>DataSource</code>.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the <code>DataSource</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the <code>DataSource</code>.
     * </p>
     * 
     * @param type
     *        The type of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public CreateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data
     *        source.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @return The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data
     *         source.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The AWS IAM service role ARN for the data source. The system assumes this role when accessing the data
     *        source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Amazon DynamoDB settings.
     * </p>
     * 
     * @param dynamodbConfig
     *        Amazon DynamoDB settings.
     */

    public void setDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        this.dynamodbConfig = dynamodbConfig;
    }

    /**
     * <p>
     * Amazon DynamoDB settings.
     * </p>
     * 
     * @return Amazon DynamoDB settings.
     */

    public DynamodbDataSourceConfig getDynamodbConfig() {
        return this.dynamodbConfig;
    }

    /**
     * <p>
     * Amazon DynamoDB settings.
     * </p>
     * 
     * @param dynamodbConfig
     *        Amazon DynamoDB settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        setDynamodbConfig(dynamodbConfig);
        return this;
    }

    /**
     * <p>
     * AWS Lambda settings.
     * </p>
     * 
     * @param lambdaConfig
     *        AWS Lambda settings.
     */

    public void setLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * AWS Lambda settings.
     * </p>
     * 
     * @return AWS Lambda settings.
     */

    public LambdaDataSourceConfig getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * AWS Lambda settings.
     * </p>
     * 
     * @param lambdaConfig
     *        AWS Lambda settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service settings.
     * </p>
     * 
     * @param elasticsearchConfig
     *        Amazon Elasticsearch Service settings.
     */

    public void setElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service settings.
     * </p>
     * 
     * @return Amazon Elasticsearch Service settings.
     */

    public ElasticsearchDataSourceConfig getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }

    /**
     * <p>
     * Amazon Elasticsearch Service settings.
     * </p>
     * 
     * @param elasticsearchConfig
     *        Amazon Elasticsearch Service settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        setElasticsearchConfig(elasticsearchConfig);
        return this;
    }

    /**
     * <p>
     * HTTP endpoint settings.
     * </p>
     * 
     * @param httpConfig
     *        HTTP endpoint settings.
     */

    public void setHttpConfig(HttpDataSourceConfig httpConfig) {
        this.httpConfig = httpConfig;
    }

    /**
     * <p>
     * HTTP endpoint settings.
     * </p>
     * 
     * @return HTTP endpoint settings.
     */

    public HttpDataSourceConfig getHttpConfig() {
        return this.httpConfig;
    }

    /**
     * <p>
     * HTTP endpoint settings.
     * </p>
     * 
     * @param httpConfig
     *        HTTP endpoint settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withHttpConfig(HttpDataSourceConfig httpConfig) {
        setHttpConfig(httpConfig);
        return this;
    }

    /**
     * <p>
     * Relational database settings.
     * </p>
     * 
     * @param relationalDatabaseConfig
     *        Relational database settings.
     */

    public void setRelationalDatabaseConfig(RelationalDatabaseDataSourceConfig relationalDatabaseConfig) {
        this.relationalDatabaseConfig = relationalDatabaseConfig;
    }

    /**
     * <p>
     * Relational database settings.
     * </p>
     * 
     * @return Relational database settings.
     */

    public RelationalDatabaseDataSourceConfig getRelationalDatabaseConfig() {
        return this.relationalDatabaseConfig;
    }

    /**
     * <p>
     * Relational database settings.
     * </p>
     * 
     * @param relationalDatabaseConfig
     *        Relational database settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSourceRequest withRelationalDatabaseConfig(RelationalDatabaseDataSourceConfig relationalDatabaseConfig) {
        setRelationalDatabaseConfig(relationalDatabaseConfig);
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getDynamodbConfig() != null)
            sb.append("DynamodbConfig: ").append(getDynamodbConfig()).append(",");
        if (getLambdaConfig() != null)
            sb.append("LambdaConfig: ").append(getLambdaConfig()).append(",");
        if (getElasticsearchConfig() != null)
            sb.append("ElasticsearchConfig: ").append(getElasticsearchConfig()).append(",");
        if (getHttpConfig() != null)
            sb.append("HttpConfig: ").append(getHttpConfig()).append(",");
        if (getRelationalDatabaseConfig() != null)
            sb.append("RelationalDatabaseConfig: ").append(getRelationalDatabaseConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceRequest == false)
            return false;
        CreateDataSourceRequest other = (CreateDataSourceRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getDynamodbConfig() == null ^ this.getDynamodbConfig() == null)
            return false;
        if (other.getDynamodbConfig() != null && other.getDynamodbConfig().equals(this.getDynamodbConfig()) == false)
            return false;
        if (other.getLambdaConfig() == null ^ this.getLambdaConfig() == null)
            return false;
        if (other.getLambdaConfig() != null && other.getLambdaConfig().equals(this.getLambdaConfig()) == false)
            return false;
        if (other.getElasticsearchConfig() == null ^ this.getElasticsearchConfig() == null)
            return false;
        if (other.getElasticsearchConfig() != null && other.getElasticsearchConfig().equals(this.getElasticsearchConfig()) == false)
            return false;
        if (other.getHttpConfig() == null ^ this.getHttpConfig() == null)
            return false;
        if (other.getHttpConfig() != null && other.getHttpConfig().equals(this.getHttpConfig()) == false)
            return false;
        if (other.getRelationalDatabaseConfig() == null ^ this.getRelationalDatabaseConfig() == null)
            return false;
        if (other.getRelationalDatabaseConfig() != null && other.getRelationalDatabaseConfig().equals(this.getRelationalDatabaseConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDynamodbConfig() == null) ? 0 : getDynamodbConfig().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchConfig() == null) ? 0 : getElasticsearchConfig().hashCode());
        hashCode = prime * hashCode + ((getHttpConfig() == null) ? 0 : getHttpConfig().hashCode());
        hashCode = prime * hashCode + ((getRelationalDatabaseConfig() == null) ? 0 : getRelationalDatabaseConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceRequest clone() {
        return (CreateDataSourceRequest) super.clone();
    }

}
