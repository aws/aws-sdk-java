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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the results of a monitor evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorMonitorEvaluation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorMonitorEvaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to monitor.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The timestamp that indicates when the monitor evaluation was started.
     * </p>
     */
    private java.util.Date evaluationTime;
    /**
     * <p>
     * The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     * </p>
     */
    private String evaluationState;
    /**
     * <p>
     * The timestamp that indicates the start of the window that is used for monitor evaluation.
     * </p>
     */
    private java.util.Date windowStartDatetime;
    /**
     * <p>
     * The timestamp that indicates the end of the window that is used for monitor evaluation.
     * </p>
     */
    private java.util.Date windowEndDatetime;
    /**
     * <p>
     * Provides details about a predictor event, such as a retraining.
     * </p>
     */
    private PredictorEvent predictorEvent;
    /**
     * <p>
     * The source of the data the monitor resource used during the evaluation.
     * </p>
     */
    private MonitorDataSource monitorDataSource;
    /**
     * <p>
     * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in
     * the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing.
     * </p>
     */
    private java.util.List<MetricResult> metricResults;
    /**
     * <p>
     * The number of items considered during the evaluation.
     * </p>
     */
    private Long numItemsEvaluated;
    /**
     * <p>
     * Information about any errors that may have occurred during the monitor evaluation.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to monitor.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource to monitor.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to monitor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource to monitor.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to monitor.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource to monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitor resource.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates when the monitor evaluation was started.
     * </p>
     * 
     * @param evaluationTime
     *        The timestamp that indicates when the monitor evaluation was started.
     */

    public void setEvaluationTime(java.util.Date evaluationTime) {
        this.evaluationTime = evaluationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the monitor evaluation was started.
     * </p>
     * 
     * @return The timestamp that indicates when the monitor evaluation was started.
     */

    public java.util.Date getEvaluationTime() {
        return this.evaluationTime;
    }

    /**
     * <p>
     * The timestamp that indicates when the monitor evaluation was started.
     * </p>
     * 
     * @param evaluationTime
     *        The timestamp that indicates when the monitor evaluation was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withEvaluationTime(java.util.Date evaluationTime) {
        setEvaluationTime(evaluationTime);
        return this;
    }

    /**
     * <p>
     * The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     * </p>
     * 
     * @param evaluationState
     *        The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     */

    public void setEvaluationState(String evaluationState) {
        this.evaluationState = evaluationState;
    }

    /**
     * <p>
     * The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     * </p>
     * 
     * @return The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     */

    public String getEvaluationState() {
        return this.evaluationState;
    }

    /**
     * <p>
     * The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     * </p>
     * 
     * @param evaluationState
     *        The status of the monitor evaluation. The state can be <code>SUCCESS</code> or <code>FAILURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withEvaluationState(String evaluationState) {
        setEvaluationState(evaluationState);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates the start of the window that is used for monitor evaluation.
     * </p>
     * 
     * @param windowStartDatetime
     *        The timestamp that indicates the start of the window that is used for monitor evaluation.
     */

    public void setWindowStartDatetime(java.util.Date windowStartDatetime) {
        this.windowStartDatetime = windowStartDatetime;
    }

    /**
     * <p>
     * The timestamp that indicates the start of the window that is used for monitor evaluation.
     * </p>
     * 
     * @return The timestamp that indicates the start of the window that is used for monitor evaluation.
     */

    public java.util.Date getWindowStartDatetime() {
        return this.windowStartDatetime;
    }

    /**
     * <p>
     * The timestamp that indicates the start of the window that is used for monitor evaluation.
     * </p>
     * 
     * @param windowStartDatetime
     *        The timestamp that indicates the start of the window that is used for monitor evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withWindowStartDatetime(java.util.Date windowStartDatetime) {
        setWindowStartDatetime(windowStartDatetime);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates the end of the window that is used for monitor evaluation.
     * </p>
     * 
     * @param windowEndDatetime
     *        The timestamp that indicates the end of the window that is used for monitor evaluation.
     */

    public void setWindowEndDatetime(java.util.Date windowEndDatetime) {
        this.windowEndDatetime = windowEndDatetime;
    }

    /**
     * <p>
     * The timestamp that indicates the end of the window that is used for monitor evaluation.
     * </p>
     * 
     * @return The timestamp that indicates the end of the window that is used for monitor evaluation.
     */

    public java.util.Date getWindowEndDatetime() {
        return this.windowEndDatetime;
    }

    /**
     * <p>
     * The timestamp that indicates the end of the window that is used for monitor evaluation.
     * </p>
     * 
     * @param windowEndDatetime
     *        The timestamp that indicates the end of the window that is used for monitor evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withWindowEndDatetime(java.util.Date windowEndDatetime) {
        setWindowEndDatetime(windowEndDatetime);
        return this;
    }

    /**
     * <p>
     * Provides details about a predictor event, such as a retraining.
     * </p>
     * 
     * @param predictorEvent
     *        Provides details about a predictor event, such as a retraining.
     */

    public void setPredictorEvent(PredictorEvent predictorEvent) {
        this.predictorEvent = predictorEvent;
    }

    /**
     * <p>
     * Provides details about a predictor event, such as a retraining.
     * </p>
     * 
     * @return Provides details about a predictor event, such as a retraining.
     */

    public PredictorEvent getPredictorEvent() {
        return this.predictorEvent;
    }

    /**
     * <p>
     * Provides details about a predictor event, such as a retraining.
     * </p>
     * 
     * @param predictorEvent
     *        Provides details about a predictor event, such as a retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withPredictorEvent(PredictorEvent predictorEvent) {
        setPredictorEvent(predictorEvent);
        return this;
    }

    /**
     * <p>
     * The source of the data the monitor resource used during the evaluation.
     * </p>
     * 
     * @param monitorDataSource
     *        The source of the data the monitor resource used during the evaluation.
     */

    public void setMonitorDataSource(MonitorDataSource monitorDataSource) {
        this.monitorDataSource = monitorDataSource;
    }

    /**
     * <p>
     * The source of the data the monitor resource used during the evaluation.
     * </p>
     * 
     * @return The source of the data the monitor resource used during the evaluation.
     */

    public MonitorDataSource getMonitorDataSource() {
        return this.monitorDataSource;
    }

    /**
     * <p>
     * The source of the data the monitor resource used during the evaluation.
     * </p>
     * 
     * @param monitorDataSource
     *        The source of the data the monitor resource used during the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withMonitorDataSource(MonitorDataSource monitorDataSource) {
        setMonitorDataSource(monitorDataSource);
        return this;
    }

    /**
     * <p>
     * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in
     * the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing.
     * </p>
     * 
     * @return A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each
     *         metric in the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance
     *         is changing.
     */

    public java.util.List<MetricResult> getMetricResults() {
        return metricResults;
    }

    /**
     * <p>
     * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in
     * the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing.
     * </p>
     * 
     * @param metricResults
     *        A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each
     *        metric in the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is
     *        changing.
     */

    public void setMetricResults(java.util.Collection<MetricResult> metricResults) {
        if (metricResults == null) {
            this.metricResults = null;
            return;
        }

        this.metricResults = new java.util.ArrayList<MetricResult>(metricResults);
    }

    /**
     * <p>
     * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in
     * the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricResults(java.util.Collection)} or {@link #withMetricResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricResults
     *        A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each
     *        metric in the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is
     *        changing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withMetricResults(MetricResult... metricResults) {
        if (this.metricResults == null) {
            setMetricResults(new java.util.ArrayList<MetricResult>(metricResults.length));
        }
        for (MetricResult ele : metricResults) {
            this.metricResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each metric in
     * the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is changing.
     * </p>
     * 
     * @param metricResults
     *        A list of metrics Forecast calculated when monitoring a predictor. You can compare the value for each
     *        metric in the list to the metric's value in the <a>Baseline</a> to see how your predictor's performance is
     *        changing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withMetricResults(java.util.Collection<MetricResult> metricResults) {
        setMetricResults(metricResults);
        return this;
    }

    /**
     * <p>
     * The number of items considered during the evaluation.
     * </p>
     * 
     * @param numItemsEvaluated
     *        The number of items considered during the evaluation.
     */

    public void setNumItemsEvaluated(Long numItemsEvaluated) {
        this.numItemsEvaluated = numItemsEvaluated;
    }

    /**
     * <p>
     * The number of items considered during the evaluation.
     * </p>
     * 
     * @return The number of items considered during the evaluation.
     */

    public Long getNumItemsEvaluated() {
        return this.numItemsEvaluated;
    }

    /**
     * <p>
     * The number of items considered during the evaluation.
     * </p>
     * 
     * @param numItemsEvaluated
     *        The number of items considered during the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withNumItemsEvaluated(Long numItemsEvaluated) {
        setNumItemsEvaluated(numItemsEvaluated);
        return this;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the monitor evaluation.
     * </p>
     * 
     * @param message
     *        Information about any errors that may have occurred during the monitor evaluation.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the monitor evaluation.
     * </p>
     * 
     * @return Information about any errors that may have occurred during the monitor evaluation.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Information about any errors that may have occurred during the monitor evaluation.
     * </p>
     * 
     * @param message
     *        Information about any errors that may have occurred during the monitor evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorMonitorEvaluation withMessage(String message) {
        setMessage(message);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getEvaluationTime() != null)
            sb.append("EvaluationTime: ").append(getEvaluationTime()).append(",");
        if (getEvaluationState() != null)
            sb.append("EvaluationState: ").append(getEvaluationState()).append(",");
        if (getWindowStartDatetime() != null)
            sb.append("WindowStartDatetime: ").append(getWindowStartDatetime()).append(",");
        if (getWindowEndDatetime() != null)
            sb.append("WindowEndDatetime: ").append(getWindowEndDatetime()).append(",");
        if (getPredictorEvent() != null)
            sb.append("PredictorEvent: ").append(getPredictorEvent()).append(",");
        if (getMonitorDataSource() != null)
            sb.append("MonitorDataSource: ").append(getMonitorDataSource()).append(",");
        if (getMetricResults() != null)
            sb.append("MetricResults: ").append(getMetricResults()).append(",");
        if (getNumItemsEvaluated() != null)
            sb.append("NumItemsEvaluated: ").append(getNumItemsEvaluated()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PredictorMonitorEvaluation == false)
            return false;
        PredictorMonitorEvaluation other = (PredictorMonitorEvaluation) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getEvaluationTime() == null ^ this.getEvaluationTime() == null)
            return false;
        if (other.getEvaluationTime() != null && other.getEvaluationTime().equals(this.getEvaluationTime()) == false)
            return false;
        if (other.getEvaluationState() == null ^ this.getEvaluationState() == null)
            return false;
        if (other.getEvaluationState() != null && other.getEvaluationState().equals(this.getEvaluationState()) == false)
            return false;
        if (other.getWindowStartDatetime() == null ^ this.getWindowStartDatetime() == null)
            return false;
        if (other.getWindowStartDatetime() != null && other.getWindowStartDatetime().equals(this.getWindowStartDatetime()) == false)
            return false;
        if (other.getWindowEndDatetime() == null ^ this.getWindowEndDatetime() == null)
            return false;
        if (other.getWindowEndDatetime() != null && other.getWindowEndDatetime().equals(this.getWindowEndDatetime()) == false)
            return false;
        if (other.getPredictorEvent() == null ^ this.getPredictorEvent() == null)
            return false;
        if (other.getPredictorEvent() != null && other.getPredictorEvent().equals(this.getPredictorEvent()) == false)
            return false;
        if (other.getMonitorDataSource() == null ^ this.getMonitorDataSource() == null)
            return false;
        if (other.getMonitorDataSource() != null && other.getMonitorDataSource().equals(this.getMonitorDataSource()) == false)
            return false;
        if (other.getMetricResults() == null ^ this.getMetricResults() == null)
            return false;
        if (other.getMetricResults() != null && other.getMetricResults().equals(this.getMetricResults()) == false)
            return false;
        if (other.getNumItemsEvaluated() == null ^ this.getNumItemsEvaluated() == null)
            return false;
        if (other.getNumItemsEvaluated() != null && other.getNumItemsEvaluated().equals(this.getNumItemsEvaluated()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getEvaluationTime() == null) ? 0 : getEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getEvaluationState() == null) ? 0 : getEvaluationState().hashCode());
        hashCode = prime * hashCode + ((getWindowStartDatetime() == null) ? 0 : getWindowStartDatetime().hashCode());
        hashCode = prime * hashCode + ((getWindowEndDatetime() == null) ? 0 : getWindowEndDatetime().hashCode());
        hashCode = prime * hashCode + ((getPredictorEvent() == null) ? 0 : getPredictorEvent().hashCode());
        hashCode = prime * hashCode + ((getMonitorDataSource() == null) ? 0 : getMonitorDataSource().hashCode());
        hashCode = prime * hashCode + ((getMetricResults() == null) ? 0 : getMetricResults().hashCode());
        hashCode = prime * hashCode + ((getNumItemsEvaluated() == null) ? 0 : getNumItemsEvaluated().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public PredictorMonitorEvaluation clone() {
        try {
            return (PredictorMonitorEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorMonitorEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
