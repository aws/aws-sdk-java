/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
 * </p>
 */
public class GetExportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be exported.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the <a>Stage</a> that will be exported.
     * </p>
     */
    private String stageName;
    /**
     * <p>
     * The type of export. Currently only 'swagger' is supported.
     * </p>
     */
    private String exportType;
    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the export, depending on the requested
     * <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of the following
     * parameters are supported: <code>integrations</code> will export the API with x-amazon-apigateway-integration
     * extensions. <code>authorizers</code> will export the API with x-amazon-apigateway-authorizer extensions.
     * <code>postman</code> will export the API with Postman extensions, allowing for import to the Postman tool
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>. Currently
     * <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code> of
     * <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API requests.
     * </p>
     */
    private String accepts;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be exported.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> to be exported.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be exported.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> to be exported.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> to be exported.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> to be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that will be exported.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> that will be exported.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that will be exported.
     * </p>
     * 
     * @return The name of the <a>Stage</a> that will be exported.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> that will be exported.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> that will be exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withStageName(String stageName) {
        setStageName(stageName);
        return this;
    }

    /**
     * <p>
     * The type of export. Currently only 'swagger' is supported.
     * </p>
     * 
     * @param exportType
     *        The type of export. Currently only 'swagger' is supported.
     */

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    /**
     * <p>
     * The type of export. Currently only 'swagger' is supported.
     * </p>
     * 
     * @return The type of export. Currently only 'swagger' is supported.
     */

    public String getExportType() {
        return this.exportType;
    }

    /**
     * <p>
     * The type of export. Currently only 'swagger' is supported.
     * </p>
     * 
     * @param exportType
     *        The type of export. Currently only 'swagger' is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withExportType(String exportType) {
        setExportType(exportType);
        return this;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the export, depending on the requested
     * <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of the following
     * parameters are supported: <code>integrations</code> will export the API with x-amazon-apigateway-integration
     * extensions. <code>authorizers</code> will export the API with x-amazon-apigateway-authorizer extensions.
     * <code>postman</code> will export the API with Postman extensions, allowing for import to the Postman tool
     * </p>
     * 
     * @return A key-value map of query string parameters that specify properties of the export, depending on the
     *         requested <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of
     *         the following parameters are supported: <code>integrations</code> will export the API with
     *         x-amazon-apigateway-integration extensions. <code>authorizers</code> will export the API with
     *         x-amazon-apigateway-authorizer extensions. <code>postman</code> will export the API with Postman
     *         extensions, allowing for import to the Postman tool
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the export, depending on the requested
     * <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of the following
     * parameters are supported: <code>integrations</code> will export the API with x-amazon-apigateway-integration
     * extensions. <code>authorizers</code> will export the API with x-amazon-apigateway-authorizer extensions.
     * <code>postman</code> will export the API with Postman extensions, allowing for import to the Postman tool
     * </p>
     * 
     * @param parameters
     *        A key-value map of query string parameters that specify properties of the export, depending on the
     *        requested <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of
     *        the following parameters are supported: <code>integrations</code> will export the API with
     *        x-amazon-apigateway-integration extensions. <code>authorizers</code> will export the API with
     *        x-amazon-apigateway-authorizer extensions. <code>postman</code> will export the API with Postman
     *        extensions, allowing for import to the Postman tool
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * A key-value map of query string parameters that specify properties of the export, depending on the requested
     * <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of the following
     * parameters are supported: <code>integrations</code> will export the API with x-amazon-apigateway-integration
     * extensions. <code>authorizers</code> will export the API with x-amazon-apigateway-authorizer extensions.
     * <code>postman</code> will export the API with Postman extensions, allowing for import to the Postman tool
     * </p>
     * 
     * @param parameters
     *        A key-value map of query string parameters that specify properties of the export, depending on the
     *        requested <code>exportType</code>. For <code>exportType</code> <code>swagger</code>, any combination of
     *        the following parameters are supported: <code>integrations</code> will export the API with
     *        x-amazon-apigateway-integration extensions. <code>authorizers</code> will export the API with
     *        x-amazon-apigateway-authorizer extensions. <code>postman</code> will export the API with Postman
     *        extensions, allowing for import to the Postman tool
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public GetExportRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>. Currently
     * <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code> of
     * <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API requests.
     * </p>
     * 
     * @param accepts
     *        The content-type of the export, for example <code>application/json</code>. Currently
     *        <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code>
     *        of <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API
     *        requests.
     */

    public void setAccepts(String accepts) {
        this.accepts = accepts;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>. Currently
     * <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code> of
     * <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API requests.
     * </p>
     * 
     * @return The content-type of the export, for example <code>application/json</code>. Currently
     *         <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code>
     *         of <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API
     *         requests.
     */

    public String getAccepts() {
        return this.accepts;
    }

    /**
     * <p>
     * The content-type of the export, for example <code>application/json</code>. Currently
     * <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code> of
     * <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API requests.
     * </p>
     * 
     * @param accepts
     *        The content-type of the export, for example <code>application/json</code>. Currently
     *        <code>application/json</code> and <code>application/yaml</code> are supported for <code>exportType</code>
     *        of <code>swagger</code>. This should be specified in the <code>Accept</code> header for direct API
     *        requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetExportRequest withAccepts(String accepts) {
        setAccepts(accepts);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName() + ",");
        if (getExportType() != null)
            sb.append("ExportType: " + getExportType() + ",");
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getAccepts() != null)
            sb.append("Accepts: " + getAccepts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetExportRequest == false)
            return false;
        GetExportRequest other = (GetExportRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null && other.getStageName().equals(this.getStageName()) == false)
            return false;
        if (other.getExportType() == null ^ this.getExportType() == null)
            return false;
        if (other.getExportType() != null && other.getExportType().equals(this.getExportType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getAccepts() == null ^ this.getAccepts() == null)
            return false;
        if (other.getAccepts() != null && other.getAccepts().equals(this.getAccepts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode + ((getStageName() == null) ? 0 : getStageName().hashCode());
        hashCode = prime * hashCode + ((getExportType() == null) ? 0 : getExportType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getAccepts() == null) ? 0 : getAccepts().hashCode());
        return hashCode;
    }

    @Override
    public GetExportRequest clone() {
        return (GetExportRequest) super.clone();
    }
}
