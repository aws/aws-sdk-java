/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The metrics for a time range within the evaluation portion of a dataset. This object is part of the
 * <a>EvaluationResult</a> object.
 * </p>
 * <p>
 * The <code>TestWindowStart</code> and <code>TestWindowEnd</code> parameters are determined by the
 * <code>BackTestWindowOffset</code> parameter of the <a>EvaluationParameters</a> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/WindowSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WindowSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp that defines the start of the window.
     * </p>
     */
    private java.util.Date testWindowStart;
    /**
     * <p>
     * The timestamp that defines the end of the window.
     * </p>
     */
    private java.util.Date testWindowEnd;
    /**
     * <p>
     * The number of data points within the window.
     * </p>
     */
    private Integer itemCount;
    /**
     * <p>
     * The type of evaluation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY</code> - The average metrics across all windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPUTED</code> - The metrics for the specified window.
     * </p>
     * </li>
     * </ul>
     */
    private String evaluationType;
    /**
     * <p>
     * Provides metrics used to evaluate the performance of a predictor.
     * </p>
     */
    private Metrics metrics;

    /**
     * <p>
     * The timestamp that defines the start of the window.
     * </p>
     * 
     * @param testWindowStart
     *        The timestamp that defines the start of the window.
     */

    public void setTestWindowStart(java.util.Date testWindowStart) {
        this.testWindowStart = testWindowStart;
    }

    /**
     * <p>
     * The timestamp that defines the start of the window.
     * </p>
     * 
     * @return The timestamp that defines the start of the window.
     */

    public java.util.Date getTestWindowStart() {
        return this.testWindowStart;
    }

    /**
     * <p>
     * The timestamp that defines the start of the window.
     * </p>
     * 
     * @param testWindowStart
     *        The timestamp that defines the start of the window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowSummary withTestWindowStart(java.util.Date testWindowStart) {
        setTestWindowStart(testWindowStart);
        return this;
    }

    /**
     * <p>
     * The timestamp that defines the end of the window.
     * </p>
     * 
     * @param testWindowEnd
     *        The timestamp that defines the end of the window.
     */

    public void setTestWindowEnd(java.util.Date testWindowEnd) {
        this.testWindowEnd = testWindowEnd;
    }

    /**
     * <p>
     * The timestamp that defines the end of the window.
     * </p>
     * 
     * @return The timestamp that defines the end of the window.
     */

    public java.util.Date getTestWindowEnd() {
        return this.testWindowEnd;
    }

    /**
     * <p>
     * The timestamp that defines the end of the window.
     * </p>
     * 
     * @param testWindowEnd
     *        The timestamp that defines the end of the window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowSummary withTestWindowEnd(java.util.Date testWindowEnd) {
        setTestWindowEnd(testWindowEnd);
        return this;
    }

    /**
     * <p>
     * The number of data points within the window.
     * </p>
     * 
     * @param itemCount
     *        The number of data points within the window.
     */

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * <p>
     * The number of data points within the window.
     * </p>
     * 
     * @return The number of data points within the window.
     */

    public Integer getItemCount() {
        return this.itemCount;
    }

    /**
     * <p>
     * The number of data points within the window.
     * </p>
     * 
     * @param itemCount
     *        The number of data points within the window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowSummary withItemCount(Integer itemCount) {
        setItemCount(itemCount);
        return this;
    }

    /**
     * <p>
     * The type of evaluation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY</code> - The average metrics across all windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPUTED</code> - The metrics for the specified window.
     * </p>
     * </li>
     * </ul>
     * 
     * @param evaluationType
     *        The type of evaluation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY</code> - The average metrics across all windows.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPUTED</code> - The metrics for the specified window.
     *        </p>
     *        </li>
     * @see EvaluationType
     */

    public void setEvaluationType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    /**
     * <p>
     * The type of evaluation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY</code> - The average metrics across all windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPUTED</code> - The metrics for the specified window.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of evaluation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUMMARY</code> - The average metrics across all windows.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPUTED</code> - The metrics for the specified window.
     *         </p>
     *         </li>
     * @see EvaluationType
     */

    public String getEvaluationType() {
        return this.evaluationType;
    }

    /**
     * <p>
     * The type of evaluation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY</code> - The average metrics across all windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPUTED</code> - The metrics for the specified window.
     * </p>
     * </li>
     * </ul>
     * 
     * @param evaluationType
     *        The type of evaluation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY</code> - The average metrics across all windows.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPUTED</code> - The metrics for the specified window.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public WindowSummary withEvaluationType(String evaluationType) {
        setEvaluationType(evaluationType);
        return this;
    }

    /**
     * <p>
     * The type of evaluation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUMMARY</code> - The average metrics across all windows.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPUTED</code> - The metrics for the specified window.
     * </p>
     * </li>
     * </ul>
     * 
     * @param evaluationType
     *        The type of evaluation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUMMARY</code> - The average metrics across all windows.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPUTED</code> - The metrics for the specified window.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public WindowSummary withEvaluationType(EvaluationType evaluationType) {
        this.evaluationType = evaluationType.toString();
        return this;
    }

    /**
     * <p>
     * Provides metrics used to evaluate the performance of a predictor.
     * </p>
     * 
     * @param metrics
     *        Provides metrics used to evaluate the performance of a predictor.
     */

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    /**
     * <p>
     * Provides metrics used to evaluate the performance of a predictor.
     * </p>
     * 
     * @return Provides metrics used to evaluate the performance of a predictor.
     */

    public Metrics getMetrics() {
        return this.metrics;
    }

    /**
     * <p>
     * Provides metrics used to evaluate the performance of a predictor.
     * </p>
     * 
     * @param metrics
     *        Provides metrics used to evaluate the performance of a predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WindowSummary withMetrics(Metrics metrics) {
        setMetrics(metrics);
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
        if (getTestWindowStart() != null)
            sb.append("TestWindowStart: ").append(getTestWindowStart()).append(",");
        if (getTestWindowEnd() != null)
            sb.append("TestWindowEnd: ").append(getTestWindowEnd()).append(",");
        if (getItemCount() != null)
            sb.append("ItemCount: ").append(getItemCount()).append(",");
        if (getEvaluationType() != null)
            sb.append("EvaluationType: ").append(getEvaluationType()).append(",");
        if (getMetrics() != null)
            sb.append("Metrics: ").append(getMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WindowSummary == false)
            return false;
        WindowSummary other = (WindowSummary) obj;
        if (other.getTestWindowStart() == null ^ this.getTestWindowStart() == null)
            return false;
        if (other.getTestWindowStart() != null && other.getTestWindowStart().equals(this.getTestWindowStart()) == false)
            return false;
        if (other.getTestWindowEnd() == null ^ this.getTestWindowEnd() == null)
            return false;
        if (other.getTestWindowEnd() != null && other.getTestWindowEnd().equals(this.getTestWindowEnd()) == false)
            return false;
        if (other.getItemCount() == null ^ this.getItemCount() == null)
            return false;
        if (other.getItemCount() != null && other.getItemCount().equals(this.getItemCount()) == false)
            return false;
        if (other.getEvaluationType() == null ^ this.getEvaluationType() == null)
            return false;
        if (other.getEvaluationType() != null && other.getEvaluationType().equals(this.getEvaluationType()) == false)
            return false;
        if (other.getMetrics() == null ^ this.getMetrics() == null)
            return false;
        if (other.getMetrics() != null && other.getMetrics().equals(this.getMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTestWindowStart() == null) ? 0 : getTestWindowStart().hashCode());
        hashCode = prime * hashCode + ((getTestWindowEnd() == null) ? 0 : getTestWindowEnd().hashCode());
        hashCode = prime * hashCode + ((getItemCount() == null) ? 0 : getItemCount().hashCode());
        hashCode = prime * hashCode + ((getEvaluationType() == null) ? 0 : getEvaluationType().hashCode());
        hashCode = prime * hashCode + ((getMetrics() == null) ? 0 : getMetrics().hashCode());
        return hashCode;
    }

    @Override
    public WindowSummary clone() {
        try {
            return (WindowSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.WindowSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
