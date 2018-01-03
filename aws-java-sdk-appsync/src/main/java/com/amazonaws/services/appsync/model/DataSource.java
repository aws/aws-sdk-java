/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a data source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/DataSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The data source ARN.
     * </p>
     */
    private String dataSourceArn;
    /**
     * <p>
     * The name of the data source.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the data source.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The type of the data source.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * DynamoDB settings.
     * </p>
     */
    private DynamodbDataSourceConfig dynamodbConfig;
    /**
     * <p>
     * Lambda settings.
     * </p>
     */
    private LambdaDataSourceConfig lambdaConfig;
    /**
     * <p>
     * Amazon Elasticsearch settings.
     * </p>
     */
    private ElasticsearchDataSourceConfig elasticsearchConfig;

    /**
     * <p>
     * The data source ARN.
     * </p>
     * 
     * @param dataSourceArn
     *        The data source ARN.
     */

    public void setDataSourceArn(String dataSourceArn) {
        this.dataSourceArn = dataSourceArn;
    }

    /**
     * <p>
     * The data source ARN.
     * </p>
     * 
     * @return The data source ARN.
     */

    public String getDataSourceArn() {
        return this.dataSourceArn;
    }

    /**
     * <p>
     * The data source ARN.
     * </p>
     * 
     * @param dataSourceArn
     *        The data source ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDataSourceArn(String dataSourceArn) {
        setDataSourceArn(dataSourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @return The name of the data source.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data source.
     * </p>
     * 
     * @param name
     *        The name of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @return The description of the data source.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the data source.
     * </p>
     * 
     * @param description
     *        The description of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @see DataSourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @return The type of the data source.
     * @see DataSourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSource withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the data source.
     * </p>
     * 
     * @param type
     *        The type of the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataSourceType
     */

    public DataSource withType(DataSourceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @return The IAM service role ARN for the data source. The system assumes this role when accessing the data
     *         source.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * </p>
     * 
     * @param serviceRoleArn
     *        The IAM service role ARN for the data source. The system assumes this role when accessing the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * DynamoDB settings.
     * </p>
     * 
     * @param dynamodbConfig
     *        DynamoDB settings.
     */

    public void setDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        this.dynamodbConfig = dynamodbConfig;
    }

    /**
     * <p>
     * DynamoDB settings.
     * </p>
     * 
     * @return DynamoDB settings.
     */

    public DynamodbDataSourceConfig getDynamodbConfig() {
        return this.dynamodbConfig;
    }

    /**
     * <p>
     * DynamoDB settings.
     * </p>
     * 
     * @param dynamodbConfig
     *        DynamoDB settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withDynamodbConfig(DynamodbDataSourceConfig dynamodbConfig) {
        setDynamodbConfig(dynamodbConfig);
        return this;
    }

    /**
     * <p>
     * Lambda settings.
     * </p>
     * 
     * @param lambdaConfig
     *        Lambda settings.
     */

    public void setLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        this.lambdaConfig = lambdaConfig;
    }

    /**
     * <p>
     * Lambda settings.
     * </p>
     * 
     * @return Lambda settings.
     */

    public LambdaDataSourceConfig getLambdaConfig() {
        return this.lambdaConfig;
    }

    /**
     * <p>
     * Lambda settings.
     * </p>
     * 
     * @param lambdaConfig
     *        Lambda settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withLambdaConfig(LambdaDataSourceConfig lambdaConfig) {
        setLambdaConfig(lambdaConfig);
        return this;
    }

    /**
     * <p>
     * Amazon Elasticsearch settings.
     * </p>
     * 
     * @param elasticsearchConfig
     *        Amazon Elasticsearch settings.
     */

    public void setElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        this.elasticsearchConfig = elasticsearchConfig;
    }

    /**
     * <p>
     * Amazon Elasticsearch settings.
     * </p>
     * 
     * @return Amazon Elasticsearch settings.
     */

    public ElasticsearchDataSourceConfig getElasticsearchConfig() {
        return this.elasticsearchConfig;
    }

    /**
     * <p>
     * Amazon Elasticsearch settings.
     * </p>
     * 
     * @param elasticsearchConfig
     *        Amazon Elasticsearch settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataSource withElasticsearchConfig(ElasticsearchDataSourceConfig elasticsearchConfig) {
        setElasticsearchConfig(elasticsearchConfig);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataSourceArn() != null)
            sb.append("DataSourceArn: ").append(getDataSourceArn()).append(",");
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
            sb.append("ElasticsearchConfig: ").append(getElasticsearchConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataSource == false)
            return false;
        DataSource other = (DataSource) obj;
        if (other.getDataSourceArn() == null ^ this.getDataSourceArn() == null)
            return false;
        if (other.getDataSourceArn() != null && other.getDataSourceArn().equals(this.getDataSourceArn()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceArn() == null) ? 0 : getDataSourceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDynamodbConfig() == null) ? 0 : getDynamodbConfig().hashCode());
        hashCode = prime * hashCode + ((getLambdaConfig() == null) ? 0 : getLambdaConfig().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchConfig() == null) ? 0 : getElasticsearchConfig().hashCode());
        return hashCode;
    }

    @Override
    public DataSource clone() {
        try {
            return (DataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.DataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
