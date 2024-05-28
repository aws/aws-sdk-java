/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/CreateAdapterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAdapterVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new version.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapterVersion
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     * </p>
     */
    private AdapterVersionDatasetConfig datasetConfig;
    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     * </p>
     */
    private String kMSKeyId;

    private OutputConfig outputConfig;
    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter version.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new version.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that will receive a new version.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new version.
     * </p>
     * 
     * @return A string containing a unique ID for the adapter that will receive a new version.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter that will receive a new version.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter that will receive a new version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapterVersion
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the request. If the same token is used with multiple
     *        CreateAdapterVersion requests, the same session is returned. This token is employed to avoid
     *        unintentionally creating the same session multiple times.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapterVersion
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @return Idempotent token is used to recognize the request. If the same token is used with multiple
     *         CreateAdapterVersion requests, the same session is returned. This token is employed to avoid
     *         unintentionally creating the same session multiple times.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Idempotent token is used to recognize the request. If the same token is used with multiple CreateAdapterVersion
     * requests, the same session is returned. This token is employed to avoid unintentionally creating the same session
     * multiple times.
     * </p>
     * 
     * @param clientRequestToken
     *        Idempotent token is used to recognize the request. If the same token is used with multiple
     *        CreateAdapterVersion requests, the same session is returned. This token is employed to avoid
     *        unintentionally creating the same session multiple times.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     * </p>
     * 
     * @param datasetConfig
     *        Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     */

    public void setDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     * </p>
     * 
     * @return Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     */

    public AdapterVersionDatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     * </p>
     * 
     * @param datasetConfig
     *        Specifies a dataset used to train a new adapter version. Takes a ManifestS3Object as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
        setDatasetConfig(datasetConfig);
        return this;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     * </p>
     * 
     * @param kMSKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     */

    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     * </p>
     * 
     * @return The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     */

    public String getKMSKeyId() {
        return this.kMSKeyId;
    }

    /**
     * <p>
     * The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     * </p>
     * 
     * @param kMSKeyId
     *        The identifier for your AWS Key Management Service key (AWS KMS key). Used to encrypt your documents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withKMSKeyId(String kMSKeyId) {
        setKMSKeyId(kMSKeyId);
        return this;
    }

    /**
     * @param outputConfig
     */

    public void setOutputConfig(OutputConfig outputConfig) {
        this.outputConfig = outputConfig;
    }

    /**
     * @return
     */

    public OutputConfig getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @param outputConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter version.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that you want to attach to the adapter version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the adapter version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that you want to attach to the adapter version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that you want to attach to the adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAdapterVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAdapterVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getAdapterId() != null)
            sb.append("AdapterId: ").append(getAdapterId()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getDatasetConfig() != null)
            sb.append("DatasetConfig: ").append(getDatasetConfig()).append(",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAdapterVersionRequest == false)
            return false;
        CreateAdapterVersionRequest other = (CreateAdapterVersionRequest) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getDatasetConfig() == null ^ this.getDatasetConfig() == null)
            return false;
        if (other.getDatasetConfig() != null && other.getDatasetConfig().equals(this.getDatasetConfig()) == false)
            return false;
        if (other.getKMSKeyId() == null ^ this.getKMSKeyId() == null)
            return false;
        if (other.getKMSKeyId() != null && other.getKMSKeyId().equals(this.getKMSKeyId()) == false)
            return false;
        if (other.getOutputConfig() == null ^ this.getOutputConfig() == null)
            return false;
        if (other.getOutputConfig() != null && other.getOutputConfig().equals(this.getOutputConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapterId() == null) ? 0 : getAdapterId().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getDatasetConfig() == null) ? 0 : getDatasetConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAdapterVersionRequest clone() {
        return (CreateAdapterVersionRequest) super.clone();
    }

}
