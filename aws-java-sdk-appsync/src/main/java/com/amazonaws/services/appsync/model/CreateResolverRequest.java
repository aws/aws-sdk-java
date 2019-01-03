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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateResolver" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResolverRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the GraphQL API for which the resolver is being created.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The name of the <code>Type</code>.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The name of the field to attach the resolver to.
     * </p>
     */
    private String fieldName;
    /**
     * <p>
     * The name of the data source for which the resolver is being created.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The mapping template to be used for requests.
     * </p>
     * <p>
     * A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can
     * understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     * </p>
     */
    private String requestMappingTemplate;
    /**
     * <p>
     * The mapping template to be used for responses from the data source.
     * </p>
     */
    private String responseMappingTemplate;
    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     */
    private String kind;
    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     */
    private PipelineConfig pipelineConfig;

    /**
     * <p>
     * The ID for the GraphQL API for which the resolver is being created.
     * </p>
     * 
     * @param apiId
     *        The ID for the GraphQL API for which the resolver is being created.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The ID for the GraphQL API for which the resolver is being created.
     * </p>
     * 
     * @return The ID for the GraphQL API for which the resolver is being created.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The ID for the GraphQL API for which the resolver is being created.
     * </p>
     * 
     * @param apiId
     *        The ID for the GraphQL API for which the resolver is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the <code>Type</code>.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the <code>Type</code>.
     * </p>
     * 
     * @return The name of the <code>Type</code>.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the <code>Type</code>.
     * </p>
     * 
     * @param typeName
     *        The name of the <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The name of the field to attach the resolver to.
     * </p>
     * 
     * @param fieldName
     *        The name of the field to attach the resolver to.
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * The name of the field to attach the resolver to.
     * </p>
     * 
     * @return The name of the field to attach the resolver to.
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * The name of the field to attach the resolver to.
     * </p>
     * 
     * @param fieldName
     *        The name of the field to attach the resolver to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * The name of the data source for which the resolver is being created.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the data source for which the resolver is being created.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * The name of the data source for which the resolver is being created.
     * </p>
     * 
     * @return The name of the data source for which the resolver is being created.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * The name of the data source for which the resolver is being created.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the data source for which the resolver is being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The mapping template to be used for requests.
     * </p>
     * <p>
     * A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can
     * understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     * </p>
     * 
     * @param requestMappingTemplate
     *        The mapping template to be used for requests.</p>
     *        <p>
     *        A resolver uses a request mapping template to convert a GraphQL expression into a format that a data
     *        source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     */

    public void setRequestMappingTemplate(String requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
    }

    /**
     * <p>
     * The mapping template to be used for requests.
     * </p>
     * <p>
     * A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can
     * understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     * </p>
     * 
     * @return The mapping template to be used for requests.</p>
     *         <p>
     *         A resolver uses a request mapping template to convert a GraphQL expression into a format that a data
     *         source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     */

    public String getRequestMappingTemplate() {
        return this.requestMappingTemplate;
    }

    /**
     * <p>
     * The mapping template to be used for requests.
     * </p>
     * <p>
     * A resolver uses a request mapping template to convert a GraphQL expression into a format that a data source can
     * understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     * </p>
     * 
     * @param requestMappingTemplate
     *        The mapping template to be used for requests.</p>
     *        <p>
     *        A resolver uses a request mapping template to convert a GraphQL expression into a format that a data
     *        source can understand. Mapping templates are written in Apache Velocity Template Language (VTL).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withRequestMappingTemplate(String requestMappingTemplate) {
        setRequestMappingTemplate(requestMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The mapping template to be used for responses from the data source.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The mapping template to be used for responses from the data source.
     */

    public void setResponseMappingTemplate(String responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    /**
     * <p>
     * The mapping template to be used for responses from the data source.
     * </p>
     * 
     * @return The mapping template to be used for responses from the data source.
     */

    public String getResponseMappingTemplate() {
        return this.responseMappingTemplate;
    }

    /**
     * <p>
     * The mapping template to be used for responses from the data source.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The mapping template to be used for responses from the data source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withResponseMappingTemplate(String responseMappingTemplate) {
        setResponseMappingTemplate(responseMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @see ResolverKind
     */

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resolver type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *         you to execute a GraphQL query against a single data source.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *         <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *         against multiple data sources.
     *         </p>
     *         </li>
     * @see ResolverKind
     */

    public String getKind() {
        return this.kind;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverKind
     */

    public CreateResolverRequest withKind(String kind) {
        setKind(kind);
        return this;
    }

    /**
     * <p>
     * The resolver type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables you to
     * execute a GraphQL query against a single data source.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     * <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query against
     * multiple data sources.
     * </p>
     * </li>
     * </ul>
     * 
     * @param kind
     *        The resolver type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>UNIT</b>: A UNIT resolver type. A UNIT resolver is the default resolver type. A UNIT resolver enables
     *        you to execute a GraphQL query against a single data source.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PIPELINE</b>: A PIPELINE resolver type. A PIPELINE resolver enables you to execute a series of
     *        <code>Function</code> in a serial manner. You can use a pipeline resolver to execute a GraphQL query
     *        against multiple data sources.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResolverKind
     */

    public CreateResolverRequest withKind(ResolverKind kind) {
        this.kind = kind.toString();
        return this;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @param pipelineConfig
     *        The <code>PipelineConfig</code>.
     */

    public void setPipelineConfig(PipelineConfig pipelineConfig) {
        this.pipelineConfig = pipelineConfig;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @return The <code>PipelineConfig</code>.
     */

    public PipelineConfig getPipelineConfig() {
        return this.pipelineConfig;
    }

    /**
     * <p>
     * The <code>PipelineConfig</code>.
     * </p>
     * 
     * @param pipelineConfig
     *        The <code>PipelineConfig</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResolverRequest withPipelineConfig(PipelineConfig pipelineConfig) {
        setPipelineConfig(pipelineConfig);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getRequestMappingTemplate() != null)
            sb.append("RequestMappingTemplate: ").append(getRequestMappingTemplate()).append(",");
        if (getResponseMappingTemplate() != null)
            sb.append("ResponseMappingTemplate: ").append(getResponseMappingTemplate()).append(",");
        if (getKind() != null)
            sb.append("Kind: ").append(getKind()).append(",");
        if (getPipelineConfig() != null)
            sb.append("PipelineConfig: ").append(getPipelineConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResolverRequest == false)
            return false;
        CreateResolverRequest other = (CreateResolverRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getDataSourceName() == null ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getRequestMappingTemplate() == null ^ this.getRequestMappingTemplate() == null)
            return false;
        if (other.getRequestMappingTemplate() != null && other.getRequestMappingTemplate().equals(this.getRequestMappingTemplate()) == false)
            return false;
        if (other.getResponseMappingTemplate() == null ^ this.getResponseMappingTemplate() == null)
            return false;
        if (other.getResponseMappingTemplate() != null && other.getResponseMappingTemplate().equals(this.getResponseMappingTemplate()) == false)
            return false;
        if (other.getKind() == null ^ this.getKind() == null)
            return false;
        if (other.getKind() != null && other.getKind().equals(this.getKind()) == false)
            return false;
        if (other.getPipelineConfig() == null ^ this.getPipelineConfig() == null)
            return false;
        if (other.getPipelineConfig() != null && other.getPipelineConfig().equals(this.getPipelineConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getRequestMappingTemplate() == null) ? 0 : getRequestMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getResponseMappingTemplate() == null) ? 0 : getResponseMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getKind() == null) ? 0 : getKind().hashCode());
        hashCode = prime * hashCode + ((getPipelineConfig() == null) ? 0 : getPipelineConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateResolverRequest clone() {
        return (CreateResolverRequest) super.clone();
    }

}
