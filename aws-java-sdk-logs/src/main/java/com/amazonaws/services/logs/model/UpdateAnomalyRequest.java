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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/logs-2014-03-28/UpdateAnomaly" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAnomalyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     */
    private String anomalyId;
    /**
     * <p>
     * If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     */
    private String patternId;
    /**
     * <p>
     * The ARN of the anomaly detector that this operation is to act on.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * Use this to specify whether the suppression to be temporary or infinite. If you specify <code>LIMITED</code>, you
     * must also specify a <code>suppressionPeriod</code>. If you specify <code>INFINITE</code>, any value for
     * <code>suppressionPeriod</code> is ignored.
     * </p>
     */
    private String suppressionType;
    /**
     * <p>
     * If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the suppression
     * is to last.
     * </p>
     */
    private SuppressionPeriod suppressionPeriod;

    /**
     * <p>
     * If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @param anomalyId
     *        If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs
     *        by using the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *        >ListAnomalies</a> operation.
     */

    public void setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
    }

    /**
     * <p>
     * If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @return If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs
     *         by using the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *         >ListAnomalies</a> operation.
     */

    public String getAnomalyId() {
        return this.anomalyId;
    }

    /**
     * <p>
     * If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @param anomalyId
     *        If you are suppressing or unsuppressing an anomaly, specify its unique ID here. You can find anomaly IDs
     *        by using the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *        >ListAnomalies</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyRequest withAnomalyId(String anomalyId) {
        setAnomalyId(anomalyId);
        return this;
    }

    /**
     * <p>
     * If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @param patternId
     *        If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs
     *        by using the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *        >ListAnomalies</a> operation.
     */

    public void setPatternId(String patternId) {
        this.patternId = patternId;
    }

    /**
     * <p>
     * If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @return If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs
     *         by using the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *         >ListAnomalies</a> operation.
     */

    public String getPatternId() {
        return this.patternId;
    }

    /**
     * <p>
     * If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs by using
     * the <a href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html">
     * ListAnomalies</a> operation.
     * </p>
     * 
     * @param patternId
     *        If you are suppressing or unsuppressing an pattern, specify its unique ID here. You can find pattern IDs
     *        by using the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatchLogs/latest/APIReference/API_ListAnomalies.html"
     *        >ListAnomalies</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyRequest withPatternId(String patternId) {
        setPatternId(patternId);
        return this;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that this operation is to act on.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that this operation is to act on.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that this operation is to act on.
     * </p>
     * 
     * @return The ARN of the anomaly detector that this operation is to act on.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the anomaly detector that this operation is to act on.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the anomaly detector that this operation is to act on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * Use this to specify whether the suppression to be temporary or infinite. If you specify <code>LIMITED</code>, you
     * must also specify a <code>suppressionPeriod</code>. If you specify <code>INFINITE</code>, any value for
     * <code>suppressionPeriod</code> is ignored.
     * </p>
     * 
     * @param suppressionType
     *        Use this to specify whether the suppression to be temporary or infinite. If you specify
     *        <code>LIMITED</code>, you must also specify a <code>suppressionPeriod</code>. If you specify
     *        <code>INFINITE</code>, any value for <code>suppressionPeriod</code> is ignored.
     * @see SuppressionType
     */

    public void setSuppressionType(String suppressionType) {
        this.suppressionType = suppressionType;
    }

    /**
     * <p>
     * Use this to specify whether the suppression to be temporary or infinite. If you specify <code>LIMITED</code>, you
     * must also specify a <code>suppressionPeriod</code>. If you specify <code>INFINITE</code>, any value for
     * <code>suppressionPeriod</code> is ignored.
     * </p>
     * 
     * @return Use this to specify whether the suppression to be temporary or infinite. If you specify
     *         <code>LIMITED</code>, you must also specify a <code>suppressionPeriod</code>. If you specify
     *         <code>INFINITE</code>, any value for <code>suppressionPeriod</code> is ignored.
     * @see SuppressionType
     */

    public String getSuppressionType() {
        return this.suppressionType;
    }

    /**
     * <p>
     * Use this to specify whether the suppression to be temporary or infinite. If you specify <code>LIMITED</code>, you
     * must also specify a <code>suppressionPeriod</code>. If you specify <code>INFINITE</code>, any value for
     * <code>suppressionPeriod</code> is ignored.
     * </p>
     * 
     * @param suppressionType
     *        Use this to specify whether the suppression to be temporary or infinite. If you specify
     *        <code>LIMITED</code>, you must also specify a <code>suppressionPeriod</code>. If you specify
     *        <code>INFINITE</code>, any value for <code>suppressionPeriod</code> is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionType
     */

    public UpdateAnomalyRequest withSuppressionType(String suppressionType) {
        setSuppressionType(suppressionType);
        return this;
    }

    /**
     * <p>
     * Use this to specify whether the suppression to be temporary or infinite. If you specify <code>LIMITED</code>, you
     * must also specify a <code>suppressionPeriod</code>. If you specify <code>INFINITE</code>, any value for
     * <code>suppressionPeriod</code> is ignored.
     * </p>
     * 
     * @param suppressionType
     *        Use this to specify whether the suppression to be temporary or infinite. If you specify
     *        <code>LIMITED</code>, you must also specify a <code>suppressionPeriod</code>. If you specify
     *        <code>INFINITE</code>, any value for <code>suppressionPeriod</code> is ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SuppressionType
     */

    public UpdateAnomalyRequest withSuppressionType(SuppressionType suppressionType) {
        this.suppressionType = suppressionType.toString();
        return this;
    }

    /**
     * <p>
     * If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the suppression
     * is to last.
     * </p>
     * 
     * @param suppressionPeriod
     *        If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the
     *        suppression is to last.
     */

    public void setSuppressionPeriod(SuppressionPeriod suppressionPeriod) {
        this.suppressionPeriod = suppressionPeriod;
    }

    /**
     * <p>
     * If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the suppression
     * is to last.
     * </p>
     * 
     * @return If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the
     *         suppression is to last.
     */

    public SuppressionPeriod getSuppressionPeriod() {
        return this.suppressionPeriod;
    }

    /**
     * <p>
     * If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the suppression
     * is to last.
     * </p>
     * 
     * @param suppressionPeriod
     *        If you are temporarily suppressing an anomaly or pattern, use this structure to specify how long the
     *        suppression is to last.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAnomalyRequest withSuppressionPeriod(SuppressionPeriod suppressionPeriod) {
        setSuppressionPeriod(suppressionPeriod);
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
        if (getAnomalyId() != null)
            sb.append("AnomalyId: ").append(getAnomalyId()).append(",");
        if (getPatternId() != null)
            sb.append("PatternId: ").append(getPatternId()).append(",");
        if (getAnomalyDetectorArn() != null)
            sb.append("AnomalyDetectorArn: ").append(getAnomalyDetectorArn()).append(",");
        if (getSuppressionType() != null)
            sb.append("SuppressionType: ").append(getSuppressionType()).append(",");
        if (getSuppressionPeriod() != null)
            sb.append("SuppressionPeriod: ").append(getSuppressionPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAnomalyRequest == false)
            return false;
        UpdateAnomalyRequest other = (UpdateAnomalyRequest) obj;
        if (other.getAnomalyId() == null ^ this.getAnomalyId() == null)
            return false;
        if (other.getAnomalyId() != null && other.getAnomalyId().equals(this.getAnomalyId()) == false)
            return false;
        if (other.getPatternId() == null ^ this.getPatternId() == null)
            return false;
        if (other.getPatternId() != null && other.getPatternId().equals(this.getPatternId()) == false)
            return false;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getSuppressionType() == null ^ this.getSuppressionType() == null)
            return false;
        if (other.getSuppressionType() != null && other.getSuppressionType().equals(this.getSuppressionType()) == false)
            return false;
        if (other.getSuppressionPeriod() == null ^ this.getSuppressionPeriod() == null)
            return false;
        if (other.getSuppressionPeriod() != null && other.getSuppressionPeriod().equals(this.getSuppressionPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyId() == null) ? 0 : getAnomalyId().hashCode());
        hashCode = prime * hashCode + ((getPatternId() == null) ? 0 : getPatternId().hashCode());
        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getSuppressionType() == null) ? 0 : getSuppressionType().hashCode());
        hashCode = prime * hashCode + ((getSuppressionPeriod() == null) ? 0 : getSuppressionPeriod().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAnomalyRequest clone() {
        return (UpdateAnomalyRequest) super.clone();
    }

}
