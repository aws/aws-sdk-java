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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The API Gateway API that is the asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ApiGatewayApiAsset" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApiGatewayApiAsset implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API description of the API asset.
     * </p>
     */
    private String apiDescription;
    /**
     * <p>
     * The API endpoint of the API asset.
     * </p>
     */
    private String apiEndpoint;
    /**
     * <p>
     * The unique identifier of the API asset.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The API key of the API asset.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * The API name of the API asset.
     * </p>
     */
    private String apiName;
    /**
     * <p>
     * The download URL of the API specification of the API asset.
     * </p>
     */
    private String apiSpecificationDownloadUrl;
    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date apiSpecificationDownloadUrlExpiresAt;
    /**
     * <p>
     * The protocol type of the API asset.
     * </p>
     */
    private String protocolType;
    /**
     * <p>
     * The stage of the API asset.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The API description of the API asset.
     * </p>
     * 
     * @param apiDescription
     *        The API description of the API asset.
     */

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    /**
     * <p>
     * The API description of the API asset.
     * </p>
     * 
     * @return The API description of the API asset.
     */

    public String getApiDescription() {
        return this.apiDescription;
    }

    /**
     * <p>
     * The API description of the API asset.
     * </p>
     * 
     * @param apiDescription
     *        The API description of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiDescription(String apiDescription) {
        setApiDescription(apiDescription);
        return this;
    }

    /**
     * <p>
     * The API endpoint of the API asset.
     * </p>
     * 
     * @param apiEndpoint
     *        The API endpoint of the API asset.
     */

    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    /**
     * <p>
     * The API endpoint of the API asset.
     * </p>
     * 
     * @return The API endpoint of the API asset.
     */

    public String getApiEndpoint() {
        return this.apiEndpoint;
    }

    /**
     * <p>
     * The API endpoint of the API asset.
     * </p>
     * 
     * @param apiEndpoint
     *        The API endpoint of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiEndpoint(String apiEndpoint) {
        setApiEndpoint(apiEndpoint);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the API asset.
     * </p>
     * 
     * @param apiId
     *        The unique identifier of the API asset.
     */

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    /**
     * <p>
     * The unique identifier of the API asset.
     * </p>
     * 
     * @return The unique identifier of the API asset.
     */

    public String getApiId() {
        return this.apiId;
    }

    /**
     * <p>
     * The unique identifier of the API asset.
     * </p>
     * 
     * @param apiId
     *        The unique identifier of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The API key of the API asset.
     * </p>
     * 
     * @param apiKey
     *        The API key of the API asset.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The API key of the API asset.
     * </p>
     * 
     * @return The API key of the API asset.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The API key of the API asset.
     * </p>
     * 
     * @param apiKey
     *        The API key of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * The API name of the API asset.
     * </p>
     * 
     * @param apiName
     *        The API name of the API asset.
     */

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * <p>
     * The API name of the API asset.
     * </p>
     * 
     * @return The API name of the API asset.
     */

    public String getApiName() {
        return this.apiName;
    }

    /**
     * <p>
     * The API name of the API asset.
     * </p>
     * 
     * @param apiName
     *        The API name of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiName(String apiName) {
        setApiName(apiName);
        return this;
    }

    /**
     * <p>
     * The download URL of the API specification of the API asset.
     * </p>
     * 
     * @param apiSpecificationDownloadUrl
     *        The download URL of the API specification of the API asset.
     */

    public void setApiSpecificationDownloadUrl(String apiSpecificationDownloadUrl) {
        this.apiSpecificationDownloadUrl = apiSpecificationDownloadUrl;
    }

    /**
     * <p>
     * The download URL of the API specification of the API asset.
     * </p>
     * 
     * @return The download URL of the API specification of the API asset.
     */

    public String getApiSpecificationDownloadUrl() {
        return this.apiSpecificationDownloadUrl;
    }

    /**
     * <p>
     * The download URL of the API specification of the API asset.
     * </p>
     * 
     * @param apiSpecificationDownloadUrl
     *        The download URL of the API specification of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiSpecificationDownloadUrl(String apiSpecificationDownloadUrl) {
        setApiSpecificationDownloadUrl(apiSpecificationDownloadUrl);
        return this;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param apiSpecificationDownloadUrlExpiresAt
     *        The date and time that the upload URL expires, in ISO 8601 format.
     */

    public void setApiSpecificationDownloadUrlExpiresAt(java.util.Date apiSpecificationDownloadUrlExpiresAt) {
        this.apiSpecificationDownloadUrlExpiresAt = apiSpecificationDownloadUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the upload URL expires, in ISO 8601 format.
     */

    public java.util.Date getApiSpecificationDownloadUrlExpiresAt() {
        return this.apiSpecificationDownloadUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param apiSpecificationDownloadUrlExpiresAt
     *        The date and time that the upload URL expires, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withApiSpecificationDownloadUrlExpiresAt(java.util.Date apiSpecificationDownloadUrlExpiresAt) {
        setApiSpecificationDownloadUrlExpiresAt(apiSpecificationDownloadUrlExpiresAt);
        return this;
    }

    /**
     * <p>
     * The protocol type of the API asset.
     * </p>
     * 
     * @param protocolType
     *        The protocol type of the API asset.
     * @see ProtocolType
     */

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The protocol type of the API asset.
     * </p>
     * 
     * @return The protocol type of the API asset.
     * @see ProtocolType
     */

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * <p>
     * The protocol type of the API asset.
     * </p>
     * 
     * @param protocolType
     *        The protocol type of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public ApiGatewayApiAsset withProtocolType(String protocolType) {
        setProtocolType(protocolType);
        return this;
    }

    /**
     * <p>
     * The protocol type of the API asset.
     * </p>
     * 
     * @param protocolType
     *        The protocol type of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public ApiGatewayApiAsset withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
        return this;
    }

    /**
     * <p>
     * The stage of the API asset.
     * </p>
     * 
     * @param stage
     *        The stage of the API asset.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The stage of the API asset.
     * </p>
     * 
     * @return The stage of the API asset.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The stage of the API asset.
     * </p>
     * 
     * @param stage
     *        The stage of the API asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApiGatewayApiAsset withStage(String stage) {
        setStage(stage);
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
        if (getApiDescription() != null)
            sb.append("ApiDescription: ").append(getApiDescription()).append(",");
        if (getApiEndpoint() != null)
            sb.append("ApiEndpoint: ").append(getApiEndpoint()).append(",");
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getApiName() != null)
            sb.append("ApiName: ").append(getApiName()).append(",");
        if (getApiSpecificationDownloadUrl() != null)
            sb.append("ApiSpecificationDownloadUrl: ").append(getApiSpecificationDownloadUrl()).append(",");
        if (getApiSpecificationDownloadUrlExpiresAt() != null)
            sb.append("ApiSpecificationDownloadUrlExpiresAt: ").append(getApiSpecificationDownloadUrlExpiresAt()).append(",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: ").append(getProtocolType()).append(",");
        if (getStage() != null)
            sb.append("Stage: ").append(getStage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApiGatewayApiAsset == false)
            return false;
        ApiGatewayApiAsset other = (ApiGatewayApiAsset) obj;
        if (other.getApiDescription() == null ^ this.getApiDescription() == null)
            return false;
        if (other.getApiDescription() != null && other.getApiDescription().equals(this.getApiDescription()) == false)
            return false;
        if (other.getApiEndpoint() == null ^ this.getApiEndpoint() == null)
            return false;
        if (other.getApiEndpoint() != null && other.getApiEndpoint().equals(this.getApiEndpoint()) == false)
            return false;
        if (other.getApiId() == null ^ this.getApiId() == null)
            return false;
        if (other.getApiId() != null && other.getApiId().equals(this.getApiId()) == false)
            return false;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getApiName() == null ^ this.getApiName() == null)
            return false;
        if (other.getApiName() != null && other.getApiName().equals(this.getApiName()) == false)
            return false;
        if (other.getApiSpecificationDownloadUrl() == null ^ this.getApiSpecificationDownloadUrl() == null)
            return false;
        if (other.getApiSpecificationDownloadUrl() != null && other.getApiSpecificationDownloadUrl().equals(this.getApiSpecificationDownloadUrl()) == false)
            return false;
        if (other.getApiSpecificationDownloadUrlExpiresAt() == null ^ this.getApiSpecificationDownloadUrlExpiresAt() == null)
            return false;
        if (other.getApiSpecificationDownloadUrlExpiresAt() != null
                && other.getApiSpecificationDownloadUrlExpiresAt().equals(this.getApiSpecificationDownloadUrlExpiresAt()) == false)
            return false;
        if (other.getProtocolType() == null ^ this.getProtocolType() == null)
            return false;
        if (other.getProtocolType() != null && other.getProtocolType().equals(this.getProtocolType()) == false)
            return false;
        if (other.getStage() == null ^ this.getStage() == null)
            return false;
        if (other.getStage() != null && other.getStage().equals(this.getStage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiDescription() == null) ? 0 : getApiDescription().hashCode());
        hashCode = prime * hashCode + ((getApiEndpoint() == null) ? 0 : getApiEndpoint().hashCode());
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getApiName() == null) ? 0 : getApiName().hashCode());
        hashCode = prime * hashCode + ((getApiSpecificationDownloadUrl() == null) ? 0 : getApiSpecificationDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getApiSpecificationDownloadUrlExpiresAt() == null) ? 0 : getApiSpecificationDownloadUrlExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public ApiGatewayApiAsset clone() {
        try {
            return (ApiGatewayApiAsset) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ApiGatewayApiAssetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
