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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/DescribeAnomalyDetector"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAnomalyDetectorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     */
    private String anomalyDetectorArn;
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
     * Contains information about the detector's configuration.
     * </p>
     */
    private AnomalyDetectorConfigSummary anomalyDetectorConfig;
    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The status of the detector.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The reason that the detector failed, if any.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The ARN of the KMS key to use to encrypt your data.
     * </p>
     */
    private String kmsKeyArn;

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @return The ARN of the detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorResult withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

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

    public DescribeAnomalyDetectorResult withAnomalyDetectorName(String anomalyDetectorName) {
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

    public DescribeAnomalyDetectorResult withAnomalyDetectorDescription(String anomalyDetectorDescription) {
        setAnomalyDetectorDescription(anomalyDetectorDescription);
        return this;
    }

    /**
     * <p>
     * Contains information about the detector's configuration.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the detector's configuration.
     */

    public void setAnomalyDetectorConfig(AnomalyDetectorConfigSummary anomalyDetectorConfig) {
        this.anomalyDetectorConfig = anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the detector's configuration.
     * </p>
     * 
     * @return Contains information about the detector's configuration.
     */

    public AnomalyDetectorConfigSummary getAnomalyDetectorConfig() {
        return this.anomalyDetectorConfig;
    }

    /**
     * <p>
     * Contains information about the detector's configuration.
     * </p>
     * 
     * @param anomalyDetectorConfig
     *        Contains information about the detector's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorResult withAnomalyDetectorConfig(AnomalyDetectorConfigSummary anomalyDetectorConfig) {
        setAnomalyDetectorConfig(anomalyDetectorConfig);
        return this;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the detector was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @return The time at which the detector was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the detector was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the detector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the detector was last modified.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @return The time at which the detector was last modified.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The time at which the detector was last modified.
     * </p>
     * 
     * @param lastModificationTime
     *        The time at which the detector was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The status of the detector.
     * </p>
     * 
     * @param status
     *        The status of the detector.
     * @see AnomalyDetectorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the detector.
     * </p>
     * 
     * @return The status of the detector.
     * @see AnomalyDetectorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the detector.
     * </p>
     * 
     * @param status
     *        The status of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public DescribeAnomalyDetectorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the detector.
     * </p>
     * 
     * @param status
     *        The status of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public DescribeAnomalyDetectorResult withStatus(AnomalyDetectorStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason that the detector failed, if any.
     * </p>
     * 
     * @param failureReason
     *        The reason that the detector failed, if any.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * The reason that the detector failed, if any.
     * </p>
     * 
     * @return The reason that the detector failed, if any.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * The reason that the detector failed, if any.
     * </p>
     * 
     * @param failureReason
     *        The reason that the detector failed, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAnomalyDetectorResult withFailureReason(String failureReason) {
        setFailureReason(failureReason);
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

    public DescribeAnomalyDetectorResult withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
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
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getAnomalyDetectorName() != null)
            sb.append("AnomalyDetectorName: ").append(getAnomalyDetectorName()).append(",");
        if (getAnomalyDetectorDescription() != null)
            sb.append("AnomalyDetectorDescription: ").append(getAnomalyDetectorDescription()).append(",");
        if (getAnomalyDetectorConfig() != null)
            sb.append("AnomalyDetectorConfig: ").append(getAnomalyDetectorConfig()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAnomalyDetectorResult == false)
            return false;
        DescribeAnomalyDetectorResult other = (DescribeAnomalyDetectorResult) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
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
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorName() == null) ? 0 : getAnomalyDetectorName().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorDescription() == null) ? 0 : getAnomalyDetectorDescription().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorConfig() == null) ? 0 : getAnomalyDetectorConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAnomalyDetectorResult clone() {
        try {
            return (DescribeAnomalyDetectorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
