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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/UpdateDataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataSourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The new name for the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The new description for the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The new data source type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The new service role ARN for the data source.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * The new Amazon DynamoDB configuration.
     * </p>
     */
    private DynamodbDataSourceConfig dynamodbConfig;
    /**
     * <p>
     * The new AWS Lambda configuration.
     * </p>
     */
    private LambdaDataSourceConfig lambdaConfig;
    /**
     * <p>
     * The new Elasticsearch Service configuration.
     * </p>
     */
    private ElasticsearchDataSourceConfig elasticsearchConfig;
    /**
     * <p>
     * The new HTTP endpoint configuration.
     * </p>
     */
    private HttpDataSourceConfig httpConfig;
    /**
     * <p>
     * The new relational database configuration.
     * </p>
     */
    private RelationalDatabaseDataSourceConfig relationalDatabaseConfig;

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @return The API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API ID.
     * </p>
     * 
     * @param apiId
     *        The API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The new name for the data source.
     * </p>
     * 
     * @param name
     *        The new name for the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name for the data source.
     * </p>
     * 
     * @return The new name for the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name for the data source.
     * </p>
     * 
     * @param name
     *        The new name for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @param description
     *        The new description for the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @return The new description for the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The new description for the data source.
     * </p>
     * 
     * @param description
     *        The new description for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The new data source type.
     * </p>
     * 
     * @param type
     *        The new data source type.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The new data source type.
     * </p>
     * 
     * @return The new data source type.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The new data source type.
     * </p>
     * 
     * @param type
     *        The new data source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public UpdateDataSourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The new data source type.
     * </p>
     * 
     * @param type
     *        The new data source type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public UpdateDataSourceRequest withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The new service role ARN for the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The new service role ARN for the data source.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The new service role ARN for the data source.
     * </p>
     * 
     * @return The new service role ARN for the data source.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The new service role ARN for the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The new service role ARN for the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * The new Amazon DynamoDB configuration.
     * </p>
     * 
     * @param dynamodbConfig
     *        The new Amazon DynamoDB configuration.
     */

    public void setDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        this.dynamodbConfig = dynamodbConfig;
    }

    /**
     * <p>
     * The new Amazon DynamoDB configuration.
     * </p>
     * 
     * @return The new Amazon DynamoDB configuration.
     */

    public DynamodbDataSourceConfig getDynamodbConfig() {
        return this.dynamodbConfig;
    }

    /**
     * <p>
     * The new Amazon DynamoDB configuration.
     * </p>
     * 
     * @param dynamodbConfig
     *        The new Amazon DynamoDB configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        setDynamodbConfig(dynamodbConfig);
        return this;
    }

    /**
     * <p>
     * The new AWS Lambda configuration.
     * </p>
     * 
     * @param lambdaConfig
     *        The new AWS Lambda configuration.
     */

    public void setLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * The new AWS Lambda configuration.
     * </p>
     * 
     * @return The new AWS Lambda configuration.
     */

    public LambdaDataSourceConfig getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * The new AWS Lambda configuration.
     * </p>
     * 
     * @param lambdaConfig
     *        The new AWS Lambda configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * The new Elasticsearch Service configuration.
     * </p>
     * 
     * @param elasticsearchConfig
     *        The new Elasticsearch Service configuration.
     */

    public void setElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
    }

    /**
     * <p>
     * The new Elasticsearch Service configuration.
     * </p>
     * 
     * @return The new Elasticsearch Service configuration.
     */

    public ElasticsearchDataSourceConfig getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }

    /**
     * <p>
     * The new Elasticsearch Service configuration.
     * </p>
     * 
     * @param elasticsearchConfig
     *        The new Elasticsearch Service configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        setElasticsearchConfig(elasticsearchConfig);
        return this;
    }

    /**
     * <p>
     * The new HTTP endpoint configuration.
     * </p>
     * 
     * @param httpConfig
     *        The new HTTP endpoint configuration.
     */

    public void setHttpConfig(HttpDataSourceConfig httpConfig) {
        this.httpConfig = httpConfig;
    }

    /**
     * <p>
     * The new HTTP endpoint configuration.
     * </p>
     * 
     * @return The new HTTP endpoint configuration.
     */

    public HttpDataSourceConfig getHttpConfig() {
        return this.httpConfig;
    }

    /**
     * <p>
     * The new HTTP endpoint configuration.
     * </p>
     * 
     * @param httpConfig
     *        The new HTTP endpoint configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withHttpConfig(HttpDataSourceConfig httpConfig) {
        setHttpConfig(httpConfig);
        return this;
    }

    /**
     * <p>
     * The new relational database configuration.
     * </p>
     * 
     * @param relationalDatabaseConfig
     *        The new relational database configuration.
     */

    public void setRelationalDatabaseConfig(RelationalDatabaseDataSourceConfig relationalDatabaseConfig) {
        this.relationalDatabaseConfig = relationalDatabaseConfig;
    }

    /**
     * <p>
     * The new relational database configuration.
     * </p>
     * 
     * @return The new relational database configuration.
     */

    public RelationalDatabaseDataSourceConfig getRelationalDatabaseConfig() {
        return this.relationalDatabaseConfig;
    }

    /**
     * <p>
     * The new relational database configuration.
     * </p>
     * 
     * @param relationalDatabaseConfig
     *        The new relational database configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataSourceRequest withRelationalDatabaseConfig(RelationalDatabaseDataSourceConfig relationalDatabaseConfig) {
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

        if (obj instanceof UpdateDataSourceRequest == false)
            return false;
        UpdateDataSourceRequest other = (UpdateDataSourceRequest) obj;
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
    public UpdateDataSourceRequest clone() {
        return (UpdateDataSourceRequest) super.clone();
    }

}
