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
package com.amazonaws.services.logs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about one anomaly detector in the account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/AnomalyDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the anomaly detector.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * The name of the anomaly detector.
     * </p>
     */
    private String detectorName;
    /**
     * <p>
     * A list of the ARNs of the log groups that this anomaly detector watches.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupArnList;
    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies.
     * </p>
     */
    private String evaluationFrequency;

    private String filterPattern;
    /**
     * <p>
     * Specifies the current status of the anomaly detector. To pause an anomaly detector, use the <code>enabled</code>
     * parameter in the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     * >UpdateLogAnomalyDetector</a> operation.
     * </p>
     */
    private String anomalyDetectorStatus;
    /**
     * <p>
     * The ID of the KMS key assigned to this anomaly detector, if any.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The date and time when this anomaly detector was created.
     * </p>
     */
    private Long creationTimeStamp;
    /**
     * <p>
     * The date and time when this anomaly detector was most recently modified.
     * </p>
     */
    private Long lastModifiedTimeStamp;
    /**
     * <p>
     * The number of days used as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal.
     * </p>
     */
    private Long anomalyVisibilityTime;

    /**
     * <p>
     * The ARN of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector.
     * </p>
     * 
     * @return The ARN of the anomaly detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * The name of the anomaly detector.
     * </p>
     * 
     * @param detectorName
     *        The name of the anomaly detector.
     */

    public void setDetectorName(String detectorName) {
        this.detectorName = detectorName;
    }

    /**
     * <p>
     * The name of the anomaly detector.
     * </p>
     * 
     * @return The name of the anomaly detector.
     */

    public String getDetectorName() {
        return this.detectorName;
    }

    /**
     * <p>
     * The name of the anomaly detector.
     * </p>
     * 
     * @param detectorName
     *        The name of the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withDetectorName(String detectorName) {
        setDetectorName(detectorName);
        return this;
    }

    /**
     * <p>
     * A list of the ARNs of the log groups that this anomaly detector watches.
     * </p>
     * 
     * @return A list of the ARNs of the log groups that this anomaly detector watches.
     */

    public java.util.List<String> getLogGroupArnList() {
        if (logGroupArnList == null) {
            logGroupArnList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupArnList;
    }

    /**
     * <p>
     * A list of the ARNs of the log groups that this anomaly detector watches.
     * </p>
     * 
     * @param logGroupArnList
     *        A list of the ARNs of the log groups that this anomaly detector watches.
     */

    public void setLogGroupArnList(java.util.Collection<String> logGroupArnList) {
        if (logGroupArnList == null) {
            this.logGroupArnList = null;
            return;
        }

        this.logGroupArnList = new com.amazonaws.internal.SdkInternalList<String>(logGroupArnList);
    }

    /**
     * <p>
     * A list of the ARNs of the log groups that this anomaly detector watches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupArnList(java.util.Collection)} or {@link #withLogGroupArnList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param logGroupArnList
     *        A list of the ARNs of the log groups that this anomaly detector watches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withLogGroupArnList(String... logGroupArnList) {
        if (this.logGroupArnList == null) {
            setLogGroupArnList(new com.amazonaws.internal.SdkInternalList<String>(logGroupArnList.length));
        }
        for (String ele : logGroupArnList) {
            this.logGroupArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the ARNs of the log groups that this anomaly detector watches.
     * </p>
     * 
     * @param logGroupArnList
     *        A list of the ARNs of the log groups that this anomaly detector watches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withLogGroupArnList(java.util.Collection<String> logGroupArnList) {
        setLogGroupArnList(logGroupArnList);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies.
     * @see EvaluationFrequency
     */

    public void setEvaluationFrequency(String evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies.
     * </p>
     * 
     * @return Specifies how often the anomaly detector runs and look for anomalies.
     * @see EvaluationFrequency
     */

    public String getEvaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public AnomalyDetector withEvaluationFrequency(String evaluationFrequency) {
        setEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public AnomalyDetector withEvaluationFrequency(EvaluationFrequency evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency.toString();
        return this;
    }

    /**
     * @param filterPattern
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * @return
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * @param filterPattern
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the anomaly detector. To pause an anomaly detector, use the <code>enabled</code>
     * parameter in the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     * >UpdateLogAnomalyDetector</a> operation.
     * </p>
     * 
     * @param anomalyDetectorStatus
     *        Specifies the current status of the anomaly detector. To pause an anomaly detector, use the
     *        <code>enabled</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     *        >UpdateLogAnomalyDetector</a> operation.
     * @see AnomalyDetectorStatus
     */

    public void setAnomalyDetectorStatus(String anomalyDetectorStatus) {
        this.anomalyDetectorStatus = anomalyDetectorStatus;
    }

    /**
     * <p>
     * Specifies the current status of the anomaly detector. To pause an anomaly detector, use the <code>enabled</code>
     * parameter in the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     * >UpdateLogAnomalyDetector</a> operation.
     * </p>
     * 
     * @return Specifies the current status of the anomaly detector. To pause an anomaly detector, use the
     *         <code>enabled</code> parameter in the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     *         >UpdateLogAnomalyDetector</a> operation.
     * @see AnomalyDetectorStatus
     */

    public String getAnomalyDetectorStatus() {
        return this.anomalyDetectorStatus;
    }

    /**
     * <p>
     * Specifies the current status of the anomaly detector. To pause an anomaly detector, use the <code>enabled</code>
     * parameter in the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     * >UpdateLogAnomalyDetector</a> operation.
     * </p>
     * 
     * @param anomalyDetectorStatus
     *        Specifies the current status of the anomaly detector. To pause an anomaly detector, use the
     *        <code>enabled</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     *        >UpdateLogAnomalyDetector</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public AnomalyDetector withAnomalyDetectorStatus(String anomalyDetectorStatus) {
        setAnomalyDetectorStatus(anomalyDetectorStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the current status of the anomaly detector. To pause an anomaly detector, use the <code>enabled</code>
     * parameter in the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     * >UpdateLogAnomalyDetector</a> operation.
     * </p>
     * 
     * @param anomalyDetectorStatus
     *        Specifies the current status of the anomaly detector. To pause an anomaly detector, use the
     *        <code>enabled</code> parameter in the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_UpdateLogAnomalyDetector.html"
     *        >UpdateLogAnomalyDetector</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AnomalyDetectorStatus
     */

    public AnomalyDetector withAnomalyDetectorStatus(AnomalyDetectorStatus anomalyDetectorStatus) {
        this.anomalyDetectorStatus = anomalyDetectorStatus.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the KMS key assigned to this anomaly detector, if any.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key assigned to this anomaly detector, if any.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key assigned to this anomaly detector, if any.
     * </p>
     * 
     * @return The ID of the KMS key assigned to this anomaly detector, if any.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the KMS key assigned to this anomaly detector, if any.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the KMS key assigned to this anomaly detector, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was created.
     * </p>
     * 
     * @param creationTimeStamp
     *        The date and time when this anomaly detector was created.
     */

    public void setCreationTimeStamp(Long creationTimeStamp) {
        this.creationTimeStamp = creationTimeStamp;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was created.
     * </p>
     * 
     * @return The date and time when this anomaly detector was created.
     */

    public Long getCreationTimeStamp() {
        return this.creationTimeStamp;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was created.
     * </p>
     * 
     * @param creationTimeStamp
     *        The date and time when this anomaly detector was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withCreationTimeStamp(Long creationTimeStamp) {
        setCreationTimeStamp(creationTimeStamp);
        return this;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was most recently modified.
     * </p>
     * 
     * @param lastModifiedTimeStamp
     *        The date and time when this anomaly detector was most recently modified.
     */

    public void setLastModifiedTimeStamp(Long lastModifiedTimeStamp) {
        this.lastModifiedTimeStamp = lastModifiedTimeStamp;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was most recently modified.
     * </p>
     * 
     * @return The date and time when this anomaly detector was most recently modified.
     */

    public Long getLastModifiedTimeStamp() {
        return this.lastModifiedTimeStamp;
    }

    /**
     * <p>
     * The date and time when this anomaly detector was most recently modified.
     * </p>
     * 
     * @param lastModifiedTimeStamp
     *        The date and time when this anomaly detector was most recently modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withLastModifiedTimeStamp(Long lastModifiedTimeStamp) {
        setLastModifiedTimeStamp(lastModifiedTimeStamp);
        return this;
    }

    /**
     * <p>
     * The number of days used as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days used as the life cycle of anomalies. After this time, anomalies are automatically
     *        baselined and the anomaly detector model will treat new occurrences of similar event as normal.
     */

    public void setAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        this.anomalyVisibilityTime = anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days used as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal.
     * </p>
     * 
     * @return The number of days used as the life cycle of anomalies. After this time, anomalies are automatically
     *         baselined and the anomaly detector model will treat new occurrences of similar event as normal.
     */

    public Long getAnomalyVisibilityTime() {
        return this.anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days used as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days used as the life cycle of anomalies. After this time, anomalies are automatically
     *        baselined and the anomaly detector model will treat new occurrences of similar event as normal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetector withAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        setAnomalyVisibilityTime(anomalyVisibilityTime);
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
        if (getDetectorName() != null)
            sb.append("DetectorName: ").append(getDetectorName()).append(",");
        if (getLogGroupArnList() != null)
            sb.append("LogGroupArnList: ").append(getLogGroupArnList()).append(",");
        if (getEvaluationFrequency() != null)
            sb.append("EvaluationFrequency: ").append(getEvaluationFrequency()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getAnomalyDetectorStatus() != null)
            sb.append("AnomalyDetectorStatus: ").append(getAnomalyDetectorStatus()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCreationTimeStamp() != null)
            sb.append("CreationTimeStamp: ").append(getCreationTimeStamp()).append(",");
        if (getLastModifiedTimeStamp() != null)
            sb.append("LastModifiedTimeStamp: ").append(getLastModifiedTimeStamp()).append(",");
        if (getAnomalyVisibilityTime() != null)
            sb.append("AnomalyVisibilityTime: ").append(getAnomalyVisibilityTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetector == false)
            return false;
        AnomalyDetector other = (AnomalyDetector) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getDetectorName() == null ^ this.getDetectorName() == null)
            return false;
        if (other.getDetectorName() != null && other.getDetectorName().equals(this.getDetectorName()) == false)
            return false;
        if (other.getLogGroupArnList() == null ^ this.getLogGroupArnList() == null)
            return false;
        if (other.getLogGroupArnList() != null && other.getLogGroupArnList().equals(this.getLogGroupArnList()) == false)
            return false;
        if (other.getEvaluationFrequency() == null ^ this.getEvaluationFrequency() == null)
            return false;
        if (other.getEvaluationFrequency() != null && other.getEvaluationFrequency().equals(this.getEvaluationFrequency()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getAnomalyDetectorStatus() == null ^ this.getAnomalyDetectorStatus() == null)
            return false;
        if (other.getAnomalyDetectorStatus() != null && other.getAnomalyDetectorStatus().equals(this.getAnomalyDetectorStatus()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCreationTimeStamp() == null ^ this.getCreationTimeStamp() == null)
            return false;
        if (other.getCreationTimeStamp() != null && other.getCreationTimeStamp().equals(this.getCreationTimeStamp()) == false)
            return false;
        if (other.getLastModifiedTimeStamp() == null ^ this.getLastModifiedTimeStamp() == null)
            return false;
        if (other.getLastModifiedTimeStamp() != null && other.getLastModifiedTimeStamp().equals(this.getLastModifiedTimeStamp()) == false)
            return false;
        if (other.getAnomalyVisibilityTime() == null ^ this.getAnomalyVisibilityTime() == null)
            return false;
        if (other.getAnomalyVisibilityTime() != null && other.getAnomalyVisibilityTime().equals(this.getAnomalyVisibilityTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getDetectorName() == null) ? 0 : getDetectorName().hashCode());
        hashCode = prime * hashCode + ((getLogGroupArnList() == null) ? 0 : getLogGroupArnList().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFrequency() == null) ? 0 : getEvaluationFrequency().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorStatus() == null) ? 0 : getAnomalyDetectorStatus().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeStamp() == null) ? 0 : getCreationTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeStamp() == null) ? 0 : getLastModifiedTimeStamp().hashCode());
        hashCode = prime * hashCode + ((getAnomalyVisibilityTime() == null) ? 0 : getAnomalyVisibilityTime().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetector clone() {
        try {
            return (AnomalyDetector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.logs.model.transform.AnomalyDetectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
