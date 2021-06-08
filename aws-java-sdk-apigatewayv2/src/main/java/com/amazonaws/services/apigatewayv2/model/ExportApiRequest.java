/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportApiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API identifier.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the
     * only supported version is 1.0.
     * </p>
     */
    private String exportVersion;
    /**
     * <p>
     * Specifies whether to include <a
     * href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html">API
     * Gateway extensions</a> in the exported API definition. API Gateway extensions are included by default.
     * </p>
     */
    private Boolean includeExtensions;
    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON and YAML.
     * </p>
     */
    private String outputType;
    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     * </p>
     */
    private String specification;
    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property, a representation of the latest API
     * configuration is exported.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @return The API identifier.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The API identifier.
     * </p>
     * 
     * @param apiId
     *        The API identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the
     * only supported version is 1.0.
     * </p>
     * 
     * @param exportVersion
     *        The version of the API Gateway export algorithm. API Gateway uses the latest version by default.
     *        Currently, the only supported version is 1.0.
     */

    public void setExportVersion(String exportVersion) {
        this.exportVersion = exportVersion;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the
     * only supported version is 1.0.
     * </p>
     * 
     * @return The version of the API Gateway export algorithm. API Gateway uses the latest version by default.
     *         Currently, the only supported version is 1.0.
     */

    public String getExportVersion() {
        return this.exportVersion;
    }

    /**
     * <p>
     * The version of the API Gateway export algorithm. API Gateway uses the latest version by default. Currently, the
     * only supported version is 1.0.
     * </p>
     * 
     * @param exportVersion
     *        The version of the API Gateway export algorithm. API Gateway uses the latest version by default.
     *        Currently, the only supported version is 1.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withExportVersion(String exportVersion) {
        setExportVersion(exportVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include <a
     * href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html">API
     * Gateway extensions</a> in the exported API definition. API Gateway extensions are included by default.
     * </p>
     * 
     * @param includeExtensions
     *        Specifies whether to include <a
     *        href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *        >API Gateway extensions</a> in the exported API definition. API Gateway extensions are included by
     *        default.
     */

    public void setIncludeExtensions(Boolean includeExtensions) {
        this.includeExtensions = includeExtensions;
    }

    /**
     * <p>
     * Specifies whether to include <a
     * href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html">API
     * Gateway extensions</a> in the exported API definition. API Gateway extensions are included by default.
     * </p>
     * 
     * @return Specifies whether to include <a
     *         href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *         >API Gateway extensions</a> in the exported API definition. API Gateway extensions are included by
     *         default.
     */

    public Boolean getIncludeExtensions() {
        return this.includeExtensions;
    }

    /**
     * <p>
     * Specifies whether to include <a
     * href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html">API
     * Gateway extensions</a> in the exported API definition. API Gateway extensions are included by default.
     * </p>
     * 
     * @param includeExtensions
     *        Specifies whether to include <a
     *        href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *        >API Gateway extensions</a> in the exported API definition. API Gateway extensions are included by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withIncludeExtensions(Boolean includeExtensions) {
        setIncludeExtensions(includeExtensions);
        return this;
    }

    /**
     * <p>
     * Specifies whether to include <a
     * href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html">API
     * Gateway extensions</a> in the exported API definition. API Gateway extensions are included by default.
     * </p>
     * 
     * @return Specifies whether to include <a
     *         href="https://docs.aws.amazon.com//apigateway/latest/developerguide/api-gateway-swagger-extensions.html"
     *         >API Gateway extensions</a> in the exported API definition. API Gateway extensions are included by
     *         default.
     */

    public Boolean isIncludeExtensions() {
        return this.includeExtensions;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON and YAML.
     * </p>
     * 
     * @param outputType
     *        The output type of the exported definition file. Valid values are JSON and YAML.
     */

    public void setOutputType(String outputType) {
        this.outputType = outputType;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON and YAML.
     * </p>
     * 
     * @return The output type of the exported definition file. Valid values are JSON and YAML.
     */

    public String getOutputType() {
        return this.outputType;
    }

    /**
     * <p>
     * The output type of the exported definition file. Valid values are JSON and YAML.
     * </p>
     * 
     * @param outputType
     *        The output type of the exported definition file. Valid values are JSON and YAML.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withOutputType(String outputType) {
        setOutputType(outputType);
        return this;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     * </p>
     * 
     * @param specification
     *        The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     */

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     * </p>
     * 
     * @return The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     */

    public String getSpecification() {
        return this.specification;
    }

    /**
     * <p>
     * The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     * </p>
     * 
     * @param specification
     *        The version of the API specification to use. OAS30, for OpenAPI 3.0, is the only supported value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withSpecification(String specification) {
        setSpecification(specification);
        return this;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property, a representation of the latest API
     * configuration is exported.
     * </p>
     * 
     * @param stageName
     *        The name of the API stage to export. If you don't specify this property, a representation of the latest
     *        API configuration is exported.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property, a representation of the latest API
     * configuration is exported.
     * </p>
     * 
     * @return The name of the API stage to export. If you don't specify this property, a representation of the latest
     *         API configuration is exported.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the API stage to export. If you don't specify this property, a representation of the latest API
     * configuration is exported.
     * </p>
     * 
     * @param stageName
     *        The name of the API stage to export. If you don't specify this property, a representation of the latest
     *        API configuration is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportApiRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getExportVersion() != null)
            sb.append("ExportVersion: ").append(getExportVersion()).append(",");
        if (getIncludeExtensions() != null)
            sb.append("IncludeExtensions: ").append(getIncludeExtensions()).append(",");
        if (getOutputType() != null)
            sb.append("OutputType: ").append(getOutputType()).append(",");
        if (getSpecification() != null)
            sb.append("Specification: ").append(getSpecification()).append(",");
        if (getStageName() != null)
            sb.append("StageName: ").append(getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportApiRequest == false)
            return false;
        ExportApiRequest other = (ExportApiRequest) obj;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getExportVersion() == null ^ this.getExportVersion() == null)
            return false;
        if (other.getExportVersion() != null && other.getExportVersion().equals(this.getExportVersion()) == false)
            return false;
        if (other.getIncludeExtensions() == null ^ this.getIncludeExtensions() == null)
            return false;
        if (other.getIncludeExtensions() != null && other.getIncludeExtensions().equals(this.getIncludeExtensions()) == false)
            return false;
        if (other.getOutputType() == null ^ this.getOutputType() == null)
            return false;
        if (other.getOutputType() != null && other.getOutputType().equals(this.getOutputType()) == false)
            return false;
        if (other.getSpecification() == null ^ this.getSpecification() == null)
            return false;
        if (other.getSpecification() != null && other.getSpecification().equals(this.getSpecification()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getExportVersion() == null) ? 0 : getExportVersion().hashCode());
        hashCode = prime * hashCode + ((getIncludeExtensions() == null) ? 0 : getIncludeExtensions().hashCode());
        hashCode = prime * hashCode + ((getOutputType() == null) ? 0 : getOutputType().hashCode());
        hashCode = prime * hashCode + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public ExportApiRequest clone() {
        return (ExportApiRequest) super.clone();
    }

}
