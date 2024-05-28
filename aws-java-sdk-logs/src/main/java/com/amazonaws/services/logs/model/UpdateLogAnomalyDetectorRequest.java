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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UpdateLogAnomalyDetector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLogAnomalyDetectorRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the anomaly detector that you want to update.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the frequency
     * that the log group receives new logs. For example, if the log group receives new log events every 10 minutes,
     * then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be appropriate.
     * </p>
     */
    private String evaluationFrequency;

    private String filterPattern;
    /**
     * <p>
     * The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal. Therefore, if you do not
     * correct the cause of an anomaly during this time, it will be considered normal going forward and will not be
     * detected.
     * </p>
     */
    private Long anomalyVisibilityTime;
    /**
     * <p>
     * Use this parameter to pause or restart the anomaly detector.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The ARN of the anomaly detector that you want to update.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that you want to update.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that you want to update.
     * </p>
     * 
     * @return The ARN of the anomaly detector that you want to update.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that you want to update.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogAnomalyDetectorRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the frequency
     * that the log group receives new logs. For example, if the log group receives new log events every 10 minutes,
     * then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be appropriate.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be
     *        appropriate.
     * @see EvaluationFrequency
     */

    public void setEvaluationFrequency(String evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the frequency
     * that the log group receives new logs. For example, if the log group receives new log events every 10 minutes,
     * then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be appropriate.
     * </p>
     * 
     * @return Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the
     *         frequency that the log group receives new logs. For example, if the log group receives new log events
     *         every 10 minutes, then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be
     *         appropriate.
     * @see EvaluationFrequency
     */

    public String getEvaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the frequency
     * that the log group receives new logs. For example, if the log group receives new log events every 10 minutes,
     * then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be appropriate.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be
     *        appropriate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public UpdateLogAnomalyDetectorRequest withEvaluationFrequency(String evaluationFrequency) {
        setEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the frequency
     * that the log group receives new logs. For example, if the log group receives new log events every 10 minutes,
     * then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be appropriate.
     * </p>
     * 
     * @param evaluationFrequency
     *        Specifies how often the anomaly detector runs and look for anomalies. Set this value according to the
     *        frequency that the log group receives new logs. For example, if the log group receives new log events
     *        every 10 minutes, then setting <code>evaluationFrequency</code> to <code>FIFTEEN_MIN</code> might be
     *        appropriate.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationFrequency
     */

    public UpdateLogAnomalyDetectorRequest withEvaluationFrequency(EvaluationFrequency evaluationFrequency) {
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

    public UpdateLogAnomalyDetectorRequest withFilterPattern(String filterPattern) {
        setFilterPattern(filterPattern);
        return this;
    }

    /**
     * <p>
     * The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal. Therefore, if you do not
     * correct the cause of an anomaly during this time, it will be considered normal going forward and will not be
     * detected.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically
     *        baselined and the anomaly detector model will treat new occurrences of similar event as normal. Therefore,
     *        if you do not correct the cause of an anomaly during this time, it will be considered normal going forward
     *        and will not be detected.
     */

    public void setAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        this.anomalyVisibilityTime = anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal. Therefore, if you do not
     * correct the cause of an anomaly during this time, it will be considered normal going forward and will not be
     * detected.
     * </p>
     * 
     * @return The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically
     *         baselined and the anomaly detector model will treat new occurrences of similar event as normal.
     *         Therefore, if you do not correct the cause of an anomaly during this time, it will be considered normal
     *         going forward and will not be detected.
     */

    public Long getAnomalyVisibilityTime() {
        return this.anomalyVisibilityTime;
    }

    /**
     * <p>
     * The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically baselined
     * and the anomaly detector model will treat new occurrences of similar event as normal. Therefore, if you do not
     * correct the cause of an anomaly during this time, it will be considered normal going forward and will not be
     * detected.
     * </p>
     * 
     * @param anomalyVisibilityTime
     *        The number of days to use as the life cycle of anomalies. After this time, anomalies are automatically
     *        baselined and the anomaly detector model will treat new occurrences of similar event as normal. Therefore,
     *        if you do not correct the cause of an anomaly during this time, it will be considered normal going forward
     *        and will not be detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogAnomalyDetectorRequest withAnomalyVisibilityTime(Long anomalyVisibilityTime) {
        setAnomalyVisibilityTime(anomalyVisibilityTime);
        return this;
    }

    /**
     * <p>
     * Use this parameter to pause or restart the anomaly detector.
     * </p>
     * 
     * @param enabled
     *        Use this parameter to pause or restart the anomaly detector.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Use this parameter to pause or restart the anomaly detector.
     * </p>
     * 
     * @return Use this parameter to pause or restart the anomaly detector.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Use this parameter to pause or restart the anomaly detector.
     * </p>
     * 
     * @param enabled
     *        Use this parameter to pause or restart the anomaly detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLogAnomalyDetectorRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Use this parameter to pause or restart the anomaly detector.
     * </p>
     * 
     * @return Use this parameter to pause or restart the anomaly detector.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getEvaluationFrequency() != null)
            sb.append("EvaluationFrequency: ").append(getEvaluationFrequency()).append(",");
        if (getFilterPattern() != null)
            sb.append("FilterPattern: ").append(getFilterPattern()).append(",");
        if (getAnomalyVisibilityTime() != null)
            sb.append("AnomalyVisibilityTime: ").append(getAnomalyVisibilityTime()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLogAnomalyDetectorRequest == false)
            return false;
        UpdateLogAnomalyDetectorRequest other = (UpdateLogAnomalyDetectorRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getEvaluationFrequency() == null ^ this.getEvaluationFrequency() == null)
            return false;
        if (other.getEvaluationFrequency() != null && other.getEvaluationFrequency().equals(this.getEvaluationFrequency()) == false)
            return false;
        if (other.getFilterPattern() == null ^ this.getFilterPattern() == null)
            return false;
        if (other.getFilterPattern() != null && other.getFilterPattern().equals(this.getFilterPattern()) == false)
            return false;
        if (other.getAnomalyVisibilityTime() == null ^ this.getAnomalyVisibilityTime() == null)
            return false;
        if (other.getAnomalyVisibilityTime() != null && other.getAnomalyVisibilityTime().equals(this.getAnomalyVisibilityTime()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluationFrequency() == null) ? 0 : getEvaluationFrequency().hashCode());
        hashCode = prime * hashCode + ((getFilterPattern() == null) ? 0 : getFilterPattern().hashCode());
        hashCode = prime * hashCode + ((getAnomalyVisibilityTime() == null) ? 0 : getAnomalyVisibilityTime().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLogAnomalyDetectorRequest clone() {
        return (UpdateLogAnomalyDetectorRequest) super.clone();
    }

}
