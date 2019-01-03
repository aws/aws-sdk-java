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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/FunctionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FunctionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique ID representing the <code>Function</code> object.
     * </p>
     */
    private String functionId;
    /**
     * <p>
     * The ARN of the <code>Function</code> object.
     * </p>
     */
    private String functionArn;
    /**
     * <p>
     * The name of the <code>Function</code> object.
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
     * The name of the <code>DataSource</code>.
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
     * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
     * </p>
     */
    private String functionVersion;

    /**
     * <p>
     * A unique ID representing the <code>Function</code> object.
     * </p>
     * 
     * @param functionId
     *        A unique ID representing the <code>Function</code> object.
     */

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    /**
     * <p>
     * A unique ID representing the <code>Function</code> object.
     * </p>
     * 
     * @return A unique ID representing the <code>Function</code> object.
     */

    public String getFunctionId() {
        return this.functionId;
    }

    /**
     * <p>
     * A unique ID representing the <code>Function</code> object.
     * </p>
     * 
     * @param functionId
     *        A unique ID representing the <code>Function</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withFunctionId(String functionId) {
        setFunctionId(functionId);
        return this;
    }

    /**
     * <p>
     * The ARN of the <code>Function</code> object.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the <code>Function</code> object.
     */

    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the <code>Function</code> object.
     * </p>
     * 
     * @return The ARN of the <code>Function</code> object.
     */

    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * <p>
     * The ARN of the <code>Function</code> object.
     * </p>
     * 
     * @param functionArn
     *        The ARN of the <code>Function</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withFunctionArn(String functionArn) {
        setFunctionArn(functionArn);
        return this;
    }

    /**
     * <p>
     * The name of the <code>Function</code> object.
     * </p>
     * 
     * @param name
     *        The name of the <code>Function</code> object.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>Function</code> object.
     * </p>
     * 
     * @return The name of the <code>Function</code> object.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the <code>Function</code> object.
     * </p>
     * 
     * @param name
     *        The name of the <code>Function</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withName(String name) {
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

    public FunctionConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the <code>DataSource</code>.
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * The name of the <code>DataSource</code>.
     * </p>
     * 
     * @return The name of the <code>DataSource</code>.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * The name of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        The name of the <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withDataSourceName(String dataSourceName) {
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

    public FunctionConfiguration withRequestMappingTemplate(String requestMappingTemplate) {
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

    public FunctionConfiguration withResponseMappingTemplate(String responseMappingTemplate) {
        setResponseMappingTemplate(responseMappingTemplate);
        return this;
    }

    /**
     * <p>
     * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
     * </p>
     * 
     * @param functionVersion
     *        The version of the request mapping template. Currently only the 2018-05-29 version of the template is
     *        supported.
     */

    public void setFunctionVersion(String functionVersion) {
        this.functionVersion = functionVersion;
    }

    /**
     * <p>
     * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
     * </p>
     * 
     * @return The version of the request mapping template. Currently only the 2018-05-29 version of the template is
     *         supported.
     */

    public String getFunctionVersion() {
        return this.functionVersion;
    }

    /**
     * <p>
     * The version of the request mapping template. Currently only the 2018-05-29 version of the template is supported.
     * </p>
     * 
     * @param functionVersion
     *        The version of the request mapping template. Currently only the 2018-05-29 version of the template is
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FunctionConfiguration withFunctionVersion(String functionVersion) {
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
        if (getFunctionId() != null)
            sb.append("FunctionId: ").append(getFunctionId()).append(",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: ").append(getFunctionArn()).append(",");
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

        if (obj instanceof FunctionConfiguration == false)
            return false;
        FunctionConfiguration other = (FunctionConfiguration) obj;
        if (other.getFunctionId() == null ^ this.getFunctionId() == null)
            return false;
        if (other.getFunctionId() != null && other.getFunctionId().equals(this.getFunctionId()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false)
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

        hashCode = prime * hashCode + ((getFunctionId() == null) ? 0 : getFunctionId().hashCode());
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        hashCode = prime * hashCode + ((getRequestMappingTemplate() == null) ? 0 : getRequestMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getResponseMappingTemplate() == null) ? 0 : getResponseMappingTemplate().hashCode());
        hashCode = prime * hashCode + ((getFunctionVersion() == null) ? 0 : getFunctionVersion().hashCode());
        return hashCode;
    }

    @Override
    public FunctionConfiguration clone() {
        try {
            return (FunctionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.FunctionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
