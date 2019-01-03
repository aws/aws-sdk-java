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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/CreateFunction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFunctionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The <code>Function</code> name. The function name does not have to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The <code>Function</code> description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The <code>Function</code> <code>DataSource</code> name.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the request
     * mapping template.
     * </p>
     */
    private String requestMappingTemplate;
    /**
     * <p>
     * The <code>Function</code> response mapping template.
     * </p>
     */
    private String responseMappingTemplate;
    /**
     * <p>
     * The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     * </p>
     */
    private String functionVersion;

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @param apiId
     *        The GraphQL API ID.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @return The GraphQL API ID.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The GraphQL API ID.
     * </p>
     * 
     * @param apiId
     *        The GraphQL API ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> name. The function name does not have to be unique.
     * </p>
     * 
     * @param name
     *        The <code>Function</code> name. The function name does not have to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The <code>Function</code> name. The function name does not have to be unique.
     * </p>
     * 
     * @return The <code>Function</code> name. The function name does not have to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The <code>Function</code> name. The function name does not have to be unique.
     * </p>
     * 
     * @param name
     *        The <code>Function</code> name. The function name does not have to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> description.
     * </p>
     * 
     * @param description
     *        The <code>Function</code> description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The <code>Function</code> description.
     * </p>
     * 
     * @return The <code>Function</code> description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The <code>Function</code> description.
     * </p>
     * 
     * @param description
     *        The <code>Function</code> description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> <code>DataSource</code> name.
     * </p>
     * 
     * @param dataSourceName
     *        The <code>Function</code> <code>DataSource</code> name.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * The <code>Function</code> <code>DataSource</code> name.
     * </p>
     * 
     * @return The <code>Function</code> <code>DataSource</code> name.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * The <code>Function</code> <code>DataSource</code> name.
     * </p>
     * 
     * @param dataSourceName
     *        The <code>Function</code> <code>DataSource</code> name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withDataSourceName(String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the request
     * mapping template.
     * </p>
     * 
     * @param requestMappingTemplate
     *        The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the
     *        request mapping template.
     */

    public void setRequestMappingTemplate(String requestMappingTemplate) {
        this.requestMappingTemplate = requestMappingTemplate;
    }

    /**
     * <p>
     * The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the request
     * mapping template.
     * </p>
     * 
     * @return The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the
     *         request mapping template.
     */

    public String getRequestMappingTemplate() {
        return this.requestMappingTemplate;
    }

    /**
     * <p>
     * The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the request
     * mapping template.
     * </p>
     * 
     * @param requestMappingTemplate
     *        The <code>Function</code> request mapping template. Functions support only the 2018-05-29 version of the
     *        request mapping template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withRequestMappingTemplate(String requestMappingTemplate) {
        setRequestMappingTemplate(requestMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The <code>Function</code> response mapping template.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The <code>Function</code> response mapping template.
     */

    public void setResponseMappingTemplate(String responseMappingTemplate) {
        this.responseMappingTemplate = responseMappingTemplate;
    }

    /**
     * <p>
     * The <code>Function</code> response mapping template.
     * </p>
     * 
     * @return The <code>Function</code> response mapping template.
     */

    public String getResponseMappingTemplate() {
        return this.responseMappingTemplate;
    }

    /**
     * <p>
     * The <code>Function</code> response mapping template.
     * </p>
     * 
     * @param responseMappingTemplate
     *        The <code>Function</code> response mapping template.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withResponseMappingTemplate(String responseMappingTemplate) {
        setResponseMappingTemplate(responseMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     * </p>
     * 
     * @param functionVersion
     *        The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     * </p>
     * 
     * @return The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     * </p>
     * 
     * @param functionVersion
     *        The <code>version</code> of the request mapping template. Currently the supported value is 2018-05-29.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFunctionRequest withFunctionVersion(String functionVersion) {
        setFunctionVersion(functionVersion);
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
        if (getDataSourceName() != null)
            sb.append("DataSourceName: ").append(getDataSourceName()).append(",");
        if (getRequestMappingTemplate() != null)
            sb.append("RequestMappingTemplate: ").append(getRequestMappingTemplate()).append(",");
        if (getResponseMappingTemplate() != null)
            sb.append("ResponseMappingTemplate: ").append(getResponseMappingTemplate()).append(",");
        if (getFunctionVersion() != null)
            sb.append("FunctionVersion: ").append(getFunctionVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFunctionRequest == false)
            return false;
        CreateFunctionRequest other = (CreateFunctionRequest) obj;
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
        if (other.getFunctionVersion() == null ^ this.getFunctionVersion() == null)
            return false;
        if (other.getFunctionVersion() != null && other.getFunctionVersion().equals(this.getFunctionVersion()) == false)
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
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getRequestMappingTemplate() == null) ? 0 : getRequestMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getResponseMappingTemplate() == null) ? 0 : getResponseMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        return hashCode;
    }

    @Override
    public CreateFunctionRequest clone() {
        return (CreateFunctionRequest) super.clone();
    }

}
