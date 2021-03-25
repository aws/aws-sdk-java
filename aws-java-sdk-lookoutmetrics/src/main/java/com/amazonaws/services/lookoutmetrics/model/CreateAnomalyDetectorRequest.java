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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/CreateAnomalyDetector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnomalyDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the detector.
     * </p>
     */
    private String anomalyDetectorName;
    /**
     * <p>
     * A description of the detector.
     * </p>
     */
    private String anomalyDetectorDescription;
    /**
     * <p>
     * Contains information about the configuration of the anomaly detector.
     * </p>
     */
    private AnomalyDetectorConfig anomalyDetectorConfig;
    /**
     * <p>
     * The ARN of the KMS key to use to encrypt your data.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the anomaly detector.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param anomalyDetectorName
     *        The name of the detector.
     */

    public void setAnomalyDetectorName(String anomalyDetectorName) {
        this.anomalyDetectorName = anomalyDetectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @return The name of the detector.
     */

    public String getAnomalyDetectorName() {
        return this.anomalyDetectorName;
    }

    /**
     * <p>
     * The name of the detector.
     * </p>
     * 
     * @param anomalyDetectorName
     *        The name of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest withAnomalyDetectorName(String anomalyDetectorName) {
        setAnomalyDetectorName(anomalyDetectorName);
        return this;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        A description of the detector.
     */

    public void setAnomalyDetectorDescription(String anomalyDetectorDescription) {
        this.anomalyDetectorDescription = anomalyDetectorDescription;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @return A description of the detector.
     */

    public String getAnomalyDetectorDescription() {
        return this.anomalyDetectorDescription;
    }

    /**
     * <p>
     * A description of the detector.
     * </p>
     * 
     * @param anomalyDetectorDescription
     *        A description of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest withAnomalyDetectorDescription(String anomalyDetectorDescription) {
        setAnomalyDetectorDescription(anomalyDetectorDescription);
        return this;
    }

    /**
     * <p>
     * Contains information about the configuration of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the configuration of the anomaly detector.
     */

    public void setAnomalyDetectorConfig(AnomalyDetectorConfig anomalyDetectorConfig) {
        this.anomalyDetectorConfig = anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the configuration of the anomaly detector.
     * </p>
     * 
     * @return Contains information about the configuration of the anomaly detector.
     */

    public AnomalyDetectorConfig getAnomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the configuration of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the configuration of the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest withAnomalyDetectorConfig(AnomalyDetectorConfig anomalyDetectorConfig) {
        setAnomalyDetectorConfig(anomalyDetectorConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the KMS key to use to encrypt your data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key to use to encrypt your data.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key to use to encrypt your data.
     * </p>
     * 
     * @return The ARN of the KMS key to use to encrypt your data.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The ARN of the KMS key to use to encrypt your data.
     * </p>
     * 
     * @param kmsKeyArn
     *        The ARN of the KMS key to use to encrypt your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the anomaly detector.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *         apply to the anomaly detector.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the anomaly detector.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the anomaly detector.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to apply
     * to the anomaly detector.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/lookoutmetrics/latest/dev/detectors-tags.html">tags</a> to
     *        apply to the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAnomalyDetectorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnomalyDetectorRequest addTagsEntry(String key, String value) {
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

    public CreateAnomalyDetectorRequest clearTagsEntries() {
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
        if (getAnomalyDetectorName() != null)
            sb.append("AnomalyDetectorName: ").append(getAnomalyDetectorName()).append(",");
        if (getAnomalyDetectorDescription() != null)
            sb.append("AnomalyDetectorDescription: ").append(getAnomalyDetectorDescription()).append(",");
        if (getAnomalyDetectorConfig() != null)
            sb.append("AnomalyDetectorConfig: ").append(getAnomalyDetectorConfig()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
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

        if (obj instanceof CreateAnomalyDetectorRequest == false)
            return false;
        CreateAnomalyDetectorRequest other = (CreateAnomalyDetectorRequest) obj;
        if (other.getAnomalyDetectorName() == null ^ this.getAnomalyDetectorName() == null)
            return false;
        if (other.getAnomalyDetectorName() != null && other.getAnomalyDetectorName().equals(this.getAnomalyDetectorName()) == false)
            return false;
        if (other.getAnomalyDetectorDescription() == null ^ this.getAnomalyDetectorDescription() == null)
            return false;
        if (other.getAnomalyDetectorDescription() != null && other.getAnomalyDetectorDescription().equals(this.getAnomalyDetectorDescription()) == false)
            return false;
        if (other.getAnomalyDetectorConfig() == null ^ this.getAnomalyDetectorConfig() == null)
            return false;
        if (other.getAnomalyDetectorConfig() != null && other.getAnomalyDetectorConfig().equals(this.getAnomalyDetectorConfig()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
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

        hashCode = prime * hashCode + ((getAnomalyDetectorName() == null) ? 0 : getAnomalyDetectorName().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorDescription() == null) ? 0 : getAnomalyDetectorDescription().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorConfig() == null) ? 0 : getAnomalyDetectorConfig().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnomalyDetectorRequest clone() {
        return (CreateAnomalyDetectorRequest) super.clone();
    }

}
