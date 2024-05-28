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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/CreateLogAnomalyDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLogAnomalyDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array containing the ARN of the log group that this anomaly detector will watch. You can specify only one log
     * group ARN.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> logGroupArnList;
    /**
     * <p>
     * A name for this anomaly detector.
     * </p>
     */
    private String detectorName;
    /**
     * <p>
     * Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     * frequency that the log group receives new logs. For example, if the log group receives new log events every 10
     * minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * </p>
     */
    private String evaluationFrequency;
    /**
     * <p>
     * You can use this parameter to limit the anomaly detection model to examine only log events that match the pattern
     * you specify here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     */
    private String filterPattern;
    /**
     * <p>
     * Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     * anomalies found and the model used by this detector are encrypted at rest with the key. If a key is assigned to
     * an anomaly detector, a user must have permissions for both this key and for the anomaly detector to retrieve
     * information about the anomalies that it finds.
     * </p>
     * <p>
     * For more information about using a KMS key and to see the required IAM policy, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS key with
     * an anomaly detector</a>.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it will
     * be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly as normal.
     * Therefore, if you do not correct the cause of an anomaly during the time period specified in
     * <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as an
     * anomaly.
     * </p>
     */
    private Long anomalyVisibilityTime;
    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalMap<String, String> tags;

    /**
     * <p>
     * An array containing the ARN of the log group that this anomaly detector will watch. You can specify only one log
     * group ARN.
     * </p>
     * 
     * @return An array containing the ARN of the log group that this anomaly detector will watch. You can specify only
     *         one log group ARN.
     */

    public java.util.List<String> getLogGroupArnList() {
        if (logGroupArnList == null) {
            logGroupArnList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return logGroupArnList;
    }

    /**
     * <p>
     * An array containing the ARN of the log group that this anomaly detector will watch. You can specify only one log
     * group ARN.
     * </p>
     * 
     * @param logGroupArnList
     *        An array containing the ARN of the log group that this anomaly detector will watch. You can specify only
     *        one log group ARN.
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
     * An array containing the ARN of the log group that this anomaly detector will watch. You can specify only one log
     * group ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogGroupArnList(java.util.Collection)} or {@link #withLogGroupArnList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param logGroupArnList
     *        An array containing the ARN of the log group that this anomaly detector will watch. You can specify only
     *        one log group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withLogGroupArnList(String... logGroupArnList) {
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
     * An array containing the ARN of the log group that this anomaly detector will watch. You can specify only one log
     * group ARN.
     * </p>
     * 
     * @param logGroupArnList
     *        An array containing the ARN of the log group that this anomaly detector will watch. You can specify only
     *        one log group ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withLogGroupArnList(java.util.Collection<String> logGroupArnList) {
        setLogGroupArnList(logGroupArnList);
        return this;
    }

    /**
     * <p>
     * A name for this anomaly detector.
     * </p>
     * 
     * @param detectorName
     *        A name for this anomaly detector.
     */

    public void setDetectorName(String detectorName) {
        this.detectorName = detectorName;
    }

    /**
     * <p>
     * A name for this anomaly detector.
     * </p>
     * 
     * @return A name for this anomaly detector.
     */

    public String getDetectorName() {
        return this.detectorName;
    }

    /**
     * <p>
     * A name for this anomaly detector.
     * </p>
     * 
     * @param detectorName
     *        A name for this anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withDetectorName(String detectorName) {
        setDetectorName(detectorName);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     * frequency that the log group receives new logs. For example, if the log group receives new log events every 10
     * minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * @see EvaluationFrequency
     */

    public void setEvaluationFrequency(String evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     * frequency that the log group receives new logs. For example, if the log group receives new log events every 10
     * minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * </p>
     * 
     * @return Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to
     *         the frequency that the log group receives new logs. For example, if the log group receives new log events
     *         every 10 minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * @see EvaluationFrequency
     */

    public String getEvaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     * frequency that the log group receives new logs. For example, if the log group receives new log events every 10
     * minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public CreateLogAnomalyDetectorRequest withEvaluationFrequency(String evaluationFrequency) {
        setEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     * frequency that the log group receives new logs. For example, if the log group receives new log events every 10
     * minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector is to run and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then 15 minutes might be a good setting for <code>evaluationFrequency</code> .
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public CreateLogAnomalyDetectorRequest withEvaluationFrequency(EvaluationFrequency evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency.toString();
        return this;
    }

    /**
     * <p>
     * You can use this parameter to limit the anomaly detection model to examine only log events that match the pattern
     * you specify here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * 
     * @param filterPattern
     *        You can use this parameter to limit the anomaly detection model to examine only log events that match the
     *        pattern you specify here. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *        Pattern Syntax</a>.
     */

    public void setFilterPattern(String filterPattern) {
        this.filterPattern = filterPattern;
    }

    /**
     * <p>
     * You can use this parameter to limit the anomaly detection model to examine only log events that match the pattern
     * you specify here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * 
     * @return You can use this parameter to limit the anomaly detection model to examine only log events that match the
     *         pattern you specify here. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *         Pattern Syntax</a>.
     */

    public String getFilterPattern() {
        return this.filterPattern;
    }

    /**
     * <p>
     * You can use this parameter to limit the anomaly detection model to examine only log events that match the pattern
     * you specify here. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and Pattern
     * Syntax</a>.
     * </p>
     * 
     * @param filterPattern
     *        You can use this parameter to limit the anomaly detection model to examine only log events that match the
     *        pattern you specify here. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html">Filter and
     *        Pattern Syntax</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     * anomalies found and the model used by this detector are encrypted at rest with the key. If a key is assigned to
     * an anomaly detector, a user must have permissions for both this key and for the anomaly detector to retrieve
     * information about the anomalies that it finds.
     * </p>
     * <p>
     * For more information about using a KMS key and to see the required IAM policy, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS key with
     * an anomaly detector</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     *        anomalies found and the model used by this detector are encrypted at rest with the key. If a key is
     *        assigned to an anomaly detector, a user must have permissions for both this key and for the anomaly
     *        detector to retrieve information about the anomalies that it finds.</p>
     *        <p>
     *        For more information about using a KMS key and to see the required IAM policy, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS
     *        key with an anomaly detector</a>.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     * anomalies found and the model used by this detector are encrypted at rest with the key. If a key is assigned to
     * an anomaly detector, a user must have permissions for both this key and for the anomaly detector to retrieve
     * information about the anomalies that it finds.
     * </p>
     * <p>
     * For more information about using a KMS key and to see the required IAM policy, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS key with
     * an anomaly detector</a>.
     * </p>
     * 
     * @return Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     *         anomalies found and the model used by this detector are encrypted at rest with the key. If a key is
     *         assigned to an anomaly detector, a user must have permissions for both this key and for the anomaly
     *         detector to retrieve information about the anomalies that it finds.</p>
     *         <p>
     *         For more information about using a KMS key and to see the required IAM policy, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS
     *         key with an anomaly detector</a>.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     * anomalies found and the model used by this detector are encrypted at rest with the key. If a key is assigned to
     * an anomaly detector, a user must have permissions for both this key and for the anomaly detector to retrieve
     * information about the anomalies that it finds.
     * </p>
     * <p>
     * For more information about using a KMS key and to see the required IAM policy, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS key with
     * an anomaly detector</a>.
     * </p>
     * 
     * @param kmsKeyId
     *        Optionally assigns a KMS key to secure this anomaly detector and its findings. If a key is assigned, the
     *        anomalies found and the model used by this detector are encrypted at rest with the key. If a key is
     *        assigned to an anomaly detector, a user must have permissions for both this key and for the anomaly
     *        detector to retrieve information about the anomalies that it finds.</p>
     *        <p>
     *        For more information about using a KMS key and to see the required IAM policy, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html">Use a KMS
     *        key with an anomaly detector</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it will
     * be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly as normal.
     * Therefore, if you do not correct the cause of an anomaly during the time period specified in
     * <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as an
     * anomaly.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it
     *        will be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly
     *        as normal. Therefore, if you do not correct the cause of an anomaly during the time period specified in
     *        <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as
     *        an anomaly.
     */

    public void setAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        this.anomalyVisibilityTime = anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it will
     * be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly as normal.
     * Therefore, if you do not correct the cause of an anomaly during the time period specified in
     * <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as an
     * anomaly.
     * </p>
     * 
     * @return The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly,
     *         it will be automatically baselined and the anomaly detector will treat new occurrences of a similar
     *         anomaly as normal. Therefore, if you do not correct the cause of an anomaly during the time period
     *         specified in <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not
     *         be detected as an anomaly.
     */

    public Long getAnomalyVisibilityTime() {
        return this.anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it will
     * be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly as normal.
     * Therefore, if you do not correct the cause of an anomaly during the time period specified in
     * <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as an
     * anomaly.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days to have visibility on an anomaly. After this time period has elapsed for an anomaly, it
     *        will be automatically baselined and the anomaly detector will treat new occurrences of a similar anomaly
     *        as normal. Therefore, if you do not correct the cause of an anomaly during the time period specified in
     *        <code>anomalyVisibilityTime</code>, it will be considered normal going forward and will not be detected as
     *        an anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        setAnomalyVisibilityTime(anomalyVisibilityTime);
        return this;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @return An optional list of key-value pairs to associate with the resource.</p>
     *         <p>
     *         For more information about tagging, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *         resources</a>
     */

    public java.util.Map<String, String> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags == null ? null : new com.amazonaws.internal.SdkInternalMap<String, String>(tags);
    }

    /**
     * <p>
     * An optional list of key-value pairs to associate with the resource.
     * </p>
     * <p>
     * For more information about tagging, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * </p>
     * 
     * @param tags
     *        An optional list of key-value pairs to associate with the resource.</p>
     *        <p>
     *        For more information about tagging, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     *        resources</a>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateLogAnomalyDetectorRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateLogAnomalyDetectorRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new com.amazonaws.internal.SdkInternalMap<String, String>();
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

    public CreateLogAnomalyDetectorRequest clearTagsEntries() {
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
        if (getLogGroupArnList() != null)
            sb.append("LogGroupArnList: ").append(getLogGroupArnList()).append(",");
        if (getDetectorName() != null)
            sb.append("DetectorName: ").append(getDetectorName()).append(",");
        if (getEvaluationFrequency() != null)
            sb.append("EvaluationFrequency: ").append(getEvaluationFrequency()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getAnomalyVisibilityTime() != null)
            sb.append("AnomalyVisibilityTime: ").append(getAnomalyVisibilityTime()).append(",");
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

        if (obj instanceof CreateLogAnomalyDetectorRequest == false)
            return false;
        CreateLogAnomalyDetectorRequest other = (CreateLogAnomalyDetectorRequest) obj;
        if (other.getLogGroupArnList() == null ^ this.getLogGroupArnList() == null)
            return false;
        if (other.getLogGroupArnList() != null && other.getLogGroupArnList().equals(this.getLogGroupArnList()) == false)
            return false;
        if (other.getDetectorName() == null ^ this.getDetectorName() == null)
            return false;
        if (other.getDetectorName() != null && other.getDetectorName().equals(this.getDetectorName()) == false)
            return false;
        if (other.getEvaluationFrequency() == null ^ this.getEvaluationFrequency() == null)
            return false;
        if (other.getEvaluationFrequency() != null && other.getEvaluationFrequency().equals(this.getEvaluationFrequency()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getAnomalyVisibilityTime() == null ^ this.getAnomalyVisibilityTime() == null)
            return false;
        if (other.getAnomalyVisibilityTime() != null && other.getAnomalyVisibilityTime().equals(this.getAnomalyVisibilityTime()) == false)
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

        hashCode = prime * hashCode + ((getLogGroupArnList() == null) ? 0 : getLogGroupArnList().hashCode());
        hashCode = prime * hashCode + ((getDetectorName() == null) ? 0 : getDetectorName().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFrequency() == null) ? 0 : getEvaluationFrequency().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyVisibilityTime() == null) ? 0 : getAnomalyVisibilityTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLogAnomalyDetectorRequest clone() {
        return (CreateLogAnomalyDetectorRequest) super.clone();
    }

}
