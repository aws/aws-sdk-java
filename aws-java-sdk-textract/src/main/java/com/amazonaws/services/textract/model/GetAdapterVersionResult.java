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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/GetAdapterVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAdapterVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A string containing a unique ID for the adapter version being retrieved.
     * </p>
     */
    private String adapterId;
    /**
     * <p>
     * A string containing the adapter version that has been retrieved.
     * </p>
     */
    private String adapterVersion;
    /**
     * <p>
     * The time that the adapter version was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     */
    private java.util.List<String> featureTypes;
    /**
     * <p>
     * The status of the adapter version that has been requested.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message that describes the status of the requested adapter version.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
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
     * The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline metrics
     * and adapter version.
     * </p>
     */
    private java.util.List<AdapterVersionEvaluationMetric> evaluationMetrics;
    /**
     * <p>
     * A set of tags (key-value pairs) that are associated with the adapter version.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A string containing a unique ID for the adapter version being retrieved.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter version being retrieved.
     */

    public void setAdapterId(String adapterId) {
        this.adapterId = adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter version being retrieved.
     * </p>
     * 
     * @return A string containing a unique ID for the adapter version being retrieved.
     */

    public String getAdapterId() {
        return this.adapterId;
    }

    /**
     * <p>
     * A string containing a unique ID for the adapter version being retrieved.
     * </p>
     * 
     * @param adapterId
     *        A string containing a unique ID for the adapter version being retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withAdapterId(String adapterId) {
        setAdapterId(adapterId);
        return this;
    }

    /**
     * <p>
     * A string containing the adapter version that has been retrieved.
     * </p>
     * 
     * @param adapterVersion
     *        A string containing the adapter version that has been retrieved.
     */

    public void setAdapterVersion(String adapterVersion) {
        this.adapterVersion = adapterVersion;
    }

    /**
     * <p>
     * A string containing the adapter version that has been retrieved.
     * </p>
     * 
     * @return A string containing the adapter version that has been retrieved.
     */

    public String getAdapterVersion() {
        return this.adapterVersion;
    }

    /**
     * <p>
     * A string containing the adapter version that has been retrieved.
     * </p>
     * 
     * @param adapterVersion
     *        A string containing the adapter version that has been retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withAdapterVersion(String adapterVersion) {
        setAdapterVersion(adapterVersion);
        return this;
    }

    /**
     * <p>
     * The time that the adapter version was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the adapter version was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the adapter version was created.
     * </p>
     * 
     * @return The time that the adapter version was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the adapter version was created.
     * </p>
     * 
     * @param creationTime
     *        The time that the adapter version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     * 
     * @return List of the targeted feature types for the requested adapter version.
     * @see FeatureType
     */

    public java.util.List<String> getFeatureTypes() {
        return featureTypes;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter version.
     * @see FeatureType
     */

    public void setFeatureTypes(java.util.Collection<String> featureTypes) {
        if (featureTypes == null) {
            this.featureTypes = null;
            return;
        }

        this.featureTypes = new java.util.ArrayList<String>(featureTypes);
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatureTypes(java.util.Collection)} or {@link #withFeatureTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterVersionResult withFeatureTypes(String... featureTypes) {
        if (this.featureTypes == null) {
            setFeatureTypes(new java.util.ArrayList<String>(featureTypes.length));
        }
        for (String ele : featureTypes) {
            this.featureTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterVersionResult withFeatureTypes(java.util.Collection<String> featureTypes) {
        setFeatureTypes(featureTypes);
        return this;
    }

    /**
     * <p>
     * List of the targeted feature types for the requested adapter version.
     * </p>
     * 
     * @param featureTypes
     *        List of the targeted feature types for the requested adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeatureType
     */

    public GetAdapterVersionResult withFeatureTypes(FeatureType... featureTypes) {
        java.util.ArrayList<String> featureTypesCopy = new java.util.ArrayList<String>(featureTypes.length);
        for (FeatureType value : featureTypes) {
            featureTypesCopy.add(value.toString());
        }
        if (getFeatureTypes() == null) {
            setFeatureTypes(featureTypesCopy);
        } else {
            getFeatureTypes().addAll(featureTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The status of the adapter version that has been requested.
     * </p>
     * 
     * @param status
     *        The status of the adapter version that has been requested.
     * @see AdapterVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the adapter version that has been requested.
     * </p>
     * 
     * @return The status of the adapter version that has been requested.
     * @see AdapterVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the adapter version that has been requested.
     * </p>
     * 
     * @param status
     *        The status of the adapter version that has been requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdapterVersionStatus
     */

    public GetAdapterVersionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the adapter version that has been requested.
     * </p>
     * 
     * @param status
     *        The status of the adapter version that has been requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AdapterVersionStatus
     */

    public GetAdapterVersionResult withStatus(AdapterVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message that describes the status of the requested adapter version.
     * </p>
     * 
     * @param statusMessage
     *        A message that describes the status of the requested adapter version.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message that describes the status of the requested adapter version.
     * </p>
     * 
     * @return A message that describes the status of the requested adapter version.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message that describes the status of the requested adapter version.
     * </p>
     * 
     * @param statusMessage
     *        A message that describes the status of the requested adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     * </p>
     * 
     * @param datasetConfig
     *        Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     */

    public void setDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
        this.datasetConfig = datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     * </p>
     * 
     * @return Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     */

    public AdapterVersionDatasetConfig getDatasetConfig() {
        return this.datasetConfig;
    }

    /**
     * <p>
     * Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     * </p>
     * 
     * @param datasetConfig
     *        Specifies a dataset used to train a new adapter version. Takes a ManifestS3Objec as the value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withDatasetConfig(AdapterVersionDatasetConfig datasetConfig) {
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

    public GetAdapterVersionResult withKMSKeyId(String kMSKeyId) {
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

    public GetAdapterVersionResult withOutputConfig(OutputConfig outputConfig) {
        setOutputConfig(outputConfig);
        return this;
    }

    /**
     * <p>
     * The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline metrics
     * and adapter version.
     * </p>
     * 
     * @return The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline
     *         metrics and adapter version.
     */

    public java.util.List<AdapterVersionEvaluationMetric> getEvaluationMetrics() {
        return evaluationMetrics;
    }

    /**
     * <p>
     * The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline metrics
     * and adapter version.
     * </p>
     * 
     * @param evaluationMetrics
     *        The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline
     *        metrics and adapter version.
     */

    public void setEvaluationMetrics(java.util.Collection<AdapterVersionEvaluationMetric> evaluationMetrics) {
        if (evaluationMetrics == null) {
            this.evaluationMetrics = null;
            return;
        }

        this.evaluationMetrics = new java.util.ArrayList<AdapterVersionEvaluationMetric>(evaluationMetrics);
    }

    /**
     * <p>
     * The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline metrics
     * and adapter version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvaluationMetrics(java.util.Collection)} or {@link #withEvaluationMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param evaluationMetrics
     *        The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline
     *        metrics and adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withEvaluationMetrics(AdapterVersionEvaluationMetric... evaluationMetrics) {
        if (this.evaluationMetrics == null) {
            setEvaluationMetrics(new java.util.ArrayList<AdapterVersionEvaluationMetric>(evaluationMetrics.length));
        }
        for (AdapterVersionEvaluationMetric ele : evaluationMetrics) {
            this.evaluationMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline metrics
     * and adapter version.
     * </p>
     * 
     * @param evaluationMetrics
     *        The evaluation metrics (F1 score, Precision, and Recall) for the requested version, grouped by baseline
     *        metrics and adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withEvaluationMetrics(java.util.Collection<AdapterVersionEvaluationMetric> evaluationMetrics) {
        setEvaluationMetrics(evaluationMetrics);
        return this;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that are associated with the adapter version.
     * </p>
     * 
     * @return A set of tags (key-value pairs) that are associated with the adapter version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that are associated with the adapter version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that are associated with the adapter version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A set of tags (key-value pairs) that are associated with the adapter version.
     * </p>
     * 
     * @param tags
     *        A set of tags (key-value pairs) that are associated with the adapter version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetAdapterVersionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetAdapterVersionResult addTagsEntry(String key, String value) {
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

    public GetAdapterVersionResult clearTagsEntries() {
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
        if (getAdapterVersion() != null)
            sb.append("AdapterVersion: ").append(getAdapterVersion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFeatureTypes() != null)
            sb.append("FeatureTypes: ").append(getFeatureTypes()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getDatasetConfig() != null)
            sb.append("DatasetConfig: ").append(getDatasetConfig()).append(",");
        if (getKMSKeyId() != null)
            sb.append("KMSKeyId: ").append(getKMSKeyId()).append(",");
        if (getOutputConfig() != null)
            sb.append("OutputConfig: ").append(getOutputConfig()).append(",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: ").append(getEvaluationMetrics()).append(",");
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

        if (obj instanceof GetAdapterVersionResult == false)
            return false;
        GetAdapterVersionResult other = (GetAdapterVersionResult) obj;
        if (other.getAdapterId() == null ^ this.getAdapterId() == null)
            return false;
        if (other.getAdapterId() != null && other.getAdapterId().equals(this.getAdapterId()) == false)
            return false;
        if (other.getAdapterVersion() == null ^ this.getAdapterVersion() == null)
            return false;
        if (other.getAdapterVersion() != null && other.getAdapterVersion().equals(this.getAdapterVersion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getFeatureTypes() == null ^ this.getFeatureTypes() == null)
            return false;
        if (other.getFeatureTypes() != null && other.getFeatureTypes().equals(this.getFeatureTypes()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
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
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
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
        hashCode = prime * hashCode + ((getAdapterVersion() == null) ? 0 : getAdapterVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFeatureTypes() == null) ? 0 : getFeatureTypes().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getDatasetConfig() == null) ? 0 : getDatasetConfig().hashCode());
        hashCode = prime * hashCode + ((getKMSKeyId() == null) ? 0 : getKMSKeyId().hashCode());
        hashCode = prime * hashCode + ((getOutputConfig() == null) ? 0 : getOutputConfig().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetAdapterVersionResult clone() {
        try {
            return (GetAdapterVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
