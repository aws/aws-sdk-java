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
 * The response details.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/ImportAssetFromApiGatewayApiResponseDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportAssetFromApiGatewayApiResponseDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API description.
     * </p>
     */
    private String apiDescription;
    /**
     * <p>
     * The API ID.
     * </p>
     */
    private String apiId;
    /**
     * <p>
     * The API key.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * The API name.
     * </p>
     */
    private String apiName;
    /**
     * <p>
     * The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     * </p>
     */
    private String apiSpecificationMd5Hash;
    /**
     * <p>
     * The upload URL of the API specification.
     * </p>
     */
    private String apiSpecificationUploadUrl;
    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     */
    private java.util.Date apiSpecificationUploadUrlExpiresAt;
    /**
     * <p>
     * The data set ID.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * The protocol type.
     * </p>
     */
    private String protocolType;
    /**
     * <p>
     * The revision ID.
     * </p>
     */
    private String revisionId;
    /**
     * <p>
     * The API stage.
     * </p>
     */
    private String stage;

    /**
     * <p>
     * The API description.
     * </p>
     * 
     * @param apiDescription
     *        The API description.
     */

    public void setApiDescription(String apiDescription) {
        this.apiDescription = apiDescription;
    }

    /**
     * <p>
     * The API description.
     * </p>
     * 
     * @return The API description.
     */

    public String getApiDescription() {
        return this.apiDescription;
    }

    /**
     * <p>
     * The API description.
     * </p>
     * 
     * @param apiDescription
     *        The API description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiDescription(String apiDescription) {
        setApiDescription(apiDescription);
        return this;
    }

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

    public ImportAssetFromApiGatewayApiResponseDetails withApiId(String apiId) {
        setApiId(apiId);
        return this;
    }

    /**
     * <p>
     * The API key.
     * </p>
     * 
     * @param apiKey
     *        The API key.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The API key.
     * </p>
     * 
     * @return The API key.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The API key.
     * </p>
     * 
     * @param apiKey
     *        The API key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param apiName
     *        The API name.
     */

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @return The API name.
     */

    public String getApiName() {
        return this.apiName;
    }

    /**
     * <p>
     * The API name.
     * </p>
     * 
     * @param apiName
     *        The API name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiName(String apiName) {
        setApiName(apiName);
        return this;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     * </p>
     * 
     * @param apiSpecificationMd5Hash
     *        The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     */

    public void setApiSpecificationMd5Hash(String apiSpecificationMd5Hash) {
        this.apiSpecificationMd5Hash = apiSpecificationMd5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     * </p>
     * 
     * @return The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     */

    public String getApiSpecificationMd5Hash() {
        return this.apiSpecificationMd5Hash;
    }

    /**
     * <p>
     * The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     * </p>
     * 
     * @param apiSpecificationMd5Hash
     *        The Base64-encoded Md5 hash for the API asset, used to ensure the integrity of the API at that location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiSpecificationMd5Hash(String apiSpecificationMd5Hash) {
        setApiSpecificationMd5Hash(apiSpecificationMd5Hash);
        return this;
    }

    /**
     * <p>
     * The upload URL of the API specification.
     * </p>
     * 
     * @param apiSpecificationUploadUrl
     *        The upload URL of the API specification.
     */

    public void setApiSpecificationUploadUrl(String apiSpecificationUploadUrl) {
        this.apiSpecificationUploadUrl = apiSpecificationUploadUrl;
    }

    /**
     * <p>
     * The upload URL of the API specification.
     * </p>
     * 
     * @return The upload URL of the API specification.
     */

    public String getApiSpecificationUploadUrl() {
        return this.apiSpecificationUploadUrl;
    }

    /**
     * <p>
     * The upload URL of the API specification.
     * </p>
     * 
     * @param apiSpecificationUploadUrl
     *        The upload URL of the API specification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiSpecificationUploadUrl(String apiSpecificationUploadUrl) {
        setApiSpecificationUploadUrl(apiSpecificationUploadUrl);
        return this;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param apiSpecificationUploadUrlExpiresAt
     *        The date and time that the upload URL expires, in ISO 8601 format.
     */

    public void setApiSpecificationUploadUrlExpiresAt(java.util.Date apiSpecificationUploadUrlExpiresAt) {
        this.apiSpecificationUploadUrlExpiresAt = apiSpecificationUploadUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @return The date and time that the upload URL expires, in ISO 8601 format.
     */

    public java.util.Date getApiSpecificationUploadUrlExpiresAt() {
        return this.apiSpecificationUploadUrlExpiresAt;
    }

    /**
     * <p>
     * The date and time that the upload URL expires, in ISO 8601 format.
     * </p>
     * 
     * @param apiSpecificationUploadUrlExpiresAt
     *        The date and time that the upload URL expires, in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withApiSpecificationUploadUrlExpiresAt(java.util.Date apiSpecificationUploadUrlExpiresAt) {
        setApiSpecificationUploadUrlExpiresAt(apiSpecificationUploadUrlExpiresAt);
        return this;
    }

    /**
     * <p>
     * The data set ID.
     * </p>
     * 
     * @param dataSetId
     *        The data set ID.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * The data set ID.
     * </p>
     * 
     * @return The data set ID.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * The data set ID.
     * </p>
     * 
     * @param dataSetId
     *        The data set ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * The protocol type.
     * </p>
     * 
     * @param protocolType
     *        The protocol type.
     * @see ProtocolType
     */

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * <p>
     * The protocol type.
     * </p>
     * 
     * @return The protocol type.
     * @see ProtocolType
     */

    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * <p>
     * The protocol type.
     * </p>
     * 
     * @param protocolType
     *        The protocol type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public ImportAssetFromApiGatewayApiResponseDetails withProtocolType(String protocolType) {
        setProtocolType(protocolType);
        return this;
    }

    /**
     * <p>
     * The protocol type.
     * </p>
     * 
     * @param protocolType
     *        The protocol type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtocolType
     */

    public ImportAssetFromApiGatewayApiResponseDetails withProtocolType(ProtocolType protocolType) {
        this.protocolType = protocolType.toString();
        return this;
    }

    /**
     * <p>
     * The revision ID.
     * </p>
     * 
     * @param revisionId
     *        The revision ID.
     */

    public void setRevisionId(String revisionId) {
        this.revisionId = revisionId;
    }

    /**
     * <p>
     * The revision ID.
     * </p>
     * 
     * @return The revision ID.
     */

    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * <p>
     * The revision ID.
     * </p>
     * 
     * @param revisionId
     *        The revision ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withRevisionId(String revisionId) {
        setRevisionId(revisionId);
        return this;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @param stage
     *        The API stage.
     */

    public void setStage(String stage) {
        this.stage = stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @return The API stage.
     */

    public String getStage() {
        return this.stage;
    }

    /**
     * <p>
     * The API stage.
     * </p>
     * 
     * @param stage
     *        The API stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportAssetFromApiGatewayApiResponseDetails withStage(String stage) {
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
        if (getApiId() != null)
            sb.append("ApiId: ").append(getApiId()).append(",");
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getApiName() != null)
            sb.append("ApiName: ").append(getApiName()).append(",");
        if (getApiSpecificationMd5Hash() != null)
            sb.append("ApiSpecificationMd5Hash: ").append(getApiSpecificationMd5Hash()).append(",");
        if (getApiSpecificationUploadUrl() != null)
            sb.append("ApiSpecificationUploadUrl: ").append(getApiSpecificationUploadUrl()).append(",");
        if (getApiSpecificationUploadUrlExpiresAt() != null)
            sb.append("ApiSpecificationUploadUrlExpiresAt: ").append(getApiSpecificationUploadUrlExpiresAt()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getProtocolType() != null)
            sb.append("ProtocolType: ").append(getProtocolType()).append(",");
        if (getRevisionId() != null)
            sb.append("RevisionId: ").append(getRevisionId()).append(",");
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

        if (obj instanceof ImportAssetFromApiGatewayApiResponseDetails == false)
            return false;
        ImportAssetFromApiGatewayApiResponseDetails other = (ImportAssetFromApiGatewayApiResponseDetails) obj;
        if (other.getApiDescription() == null ^ this.getApiDescription() == null)
            return false;
        if (other.getApiDescription() != null && other.getApiDescription().equals(this.getApiDescription()) == false)
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
        if (other.getApiSpecificationMd5Hash() == null ^ this.getApiSpecificationMd5Hash() == null)
            return false;
        if (other.getApiSpecificationMd5Hash() != null && other.getApiSpecificationMd5Hash().equals(this.getApiSpecificationMd5Hash()) == false)
            return false;
        if (other.getApiSpecificationUploadUrl() == null ^ this.getApiSpecificationUploadUrl() == null)
            return false;
        if (other.getApiSpecificationUploadUrl() != null && other.getApiSpecificationUploadUrl().equals(this.getApiSpecificationUploadUrl()) == false)
            return false;
        if (other.getApiSpecificationUploadUrlExpiresAt() == null ^ this.getApiSpecificationUploadUrlExpiresAt() == null)
            return false;
        if (other.getApiSpecificationUploadUrlExpiresAt() != null
                && other.getApiSpecificationUploadUrlExpiresAt().equals(this.getApiSpecificationUploadUrlExpiresAt()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getProtocolType() == null ^ this.getProtocolType() == null)
            return false;
        if (other.getProtocolType() != null && other.getProtocolType().equals(this.getProtocolType()) == false)
            return false;
        if (other.getRevisionId() == null ^ this.getRevisionId() == null)
            return false;
        if (other.getRevisionId() != null && other.getRevisionId().equals(this.getRevisionId()) == false)
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
        hashCode = prime * hashCode + ((getApiId() == null) ? 0 : getApiId().hashCode());
        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getApiName() == null) ? 0 : getApiName().hashCode());
        hashCode = prime * hashCode + ((getApiSpecificationMd5Hash() == null) ? 0 : getApiSpecificationMd5Hash().hashCode());
        hashCode = prime * hashCode + ((getApiSpecificationUploadUrl() == null) ? 0 : getApiSpecificationUploadUrl().hashCode());
        hashCode = prime * hashCode + ((getApiSpecificationUploadUrlExpiresAt() == null) ? 0 : getApiSpecificationUploadUrlExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getProtocolType() == null) ? 0 : getProtocolType().hashCode());
        hashCode = prime * hashCode + ((getRevisionId() == null) ? 0 : getRevisionId().hashCode());
        hashCode = prime * hashCode + ((getStage() == null) ? 0 : getStage().hashCode());
        return hashCode;
    }

    @Override
    public ImportAssetFromApiGatewayApiResponseDetails clone() {
        try {
            return (ImportAssetFromApiGatewayApiResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dataexchange.model.transform.ImportAssetFromApiGatewayApiResponseDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
