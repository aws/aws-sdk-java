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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Retrieves the list of performance issues which are identified.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/Insight" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Insight implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     * </p>
     */
    private String insightId;
    /**
     * <p>
     * The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or <code>DominatingSQLs</code>.
     * </p>
     */
    private String insightType;
    /**
     * <p>
     * Indicates if the insight is causal or correlated insight.
     * </p>
     */
    private String context;
    /**
     * <p>
     * The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * </p>
     */
    private String severity;
    /**
     * <p>
     * List of supporting insights that provide additional factors for the insight.
     * </p>
     */
    private java.util.List<Insight> supportingInsights;
    /**
     * <p>
     * Description of the insight. For example:
     * <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     * .
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of recommendations for the insight. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * .
     * </p>
     */
    private java.util.List<Recommendation> recommendations;
    /**
     * <p>
     * List of data objects containing metrics and references from the time range while generating the insight.
     * </p>
     */
    private java.util.List<Data> insightData;
    /**
     * <p>
     * Metric names and values from the timeframe used as baseline to generate the insight.
     * </p>
     */
    private java.util.List<Data> baselineData;

    /**
     * <p>
     * The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     * </p>
     * 
     * @param insightId
     *        The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     */

    public void setInsightId(String insightId) {
        this.insightId = insightId;
    }

    /**
     * <p>
     * The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     * </p>
     * 
     * @return The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     */

    public String getInsightId() {
        return this.insightId;
    }

    /**
     * <p>
     * The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     * </p>
     * 
     * @param insightId
     *        The unique identifier for the insight. For example, <code>insight-12345678901234567</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightId(String insightId) {
        setInsightId(insightId);
        return this;
    }

    /**
     * <p>
     * The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or <code>DominatingSQLs</code>.
     * </p>
     * 
     * @param insightType
     *        The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or
     *        <code>DominatingSQLs</code>.
     */

    public void setInsightType(String insightType) {
        this.insightType = insightType;
    }

    /**
     * <p>
     * The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or <code>DominatingSQLs</code>.
     * </p>
     * 
     * @return The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or
     *         <code>DominatingSQLs</code>.
     */

    public String getInsightType() {
        return this.insightType;
    }

    /**
     * <p>
     * The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or <code>DominatingSQLs</code>.
     * </p>
     * 
     * @param insightType
     *        The type of insight. For example, <code>HighDBLoad</code>, <code>HighCPU</code>, or
     *        <code>DominatingSQLs</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightType(String insightType) {
        setInsightType(insightType);
        return this;
    }

    /**
     * <p>
     * Indicates if the insight is causal or correlated insight.
     * </p>
     * 
     * @param context
     *        Indicates if the insight is causal or correlated insight.
     * @see ContextType
     */

    public void setContext(String context) {
        this.context = context;
    }

    /**
     * <p>
     * Indicates if the insight is causal or correlated insight.
     * </p>
     * 
     * @return Indicates if the insight is causal or correlated insight.
     * @see ContextType
     */

    public String getContext() {
        return this.context;
    }

    /**
     * <p>
     * Indicates if the insight is causal or correlated insight.
     * </p>
     * 
     * @param context
     *        Indicates if the insight is causal or correlated insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContextType
     */

    public Insight withContext(String context) {
        setContext(context);
        return this;
    }

    /**
     * <p>
     * Indicates if the insight is causal or correlated insight.
     * </p>
     * 
     * @param context
     *        Indicates if the insight is causal or correlated insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContextType
     */

    public Insight withContext(ContextType context) {
        this.context = context.toString();
        return this;
    }

    /**
     * <p>
     * The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @return The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @param startTime
     *        The start time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @return The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * </p>
     * 
     * @param endTime
     *        The end time of the insight. For example, <code>2018-10-30T00:00:00Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * @see Severity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * </p>
     * 
     * @return The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * @see Severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Insight withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * </p>
     * 
     * @param severity
     *        The severity of the insight. The values are: <code>Low</code>, <code>Medium</code>, or <code>High</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Severity
     */

    public Insight withSeverity(Severity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * <p>
     * List of supporting insights that provide additional factors for the insight.
     * </p>
     * 
     * @return List of supporting insights that provide additional factors for the insight.
     */

    public java.util.List<Insight> getSupportingInsights() {
        return supportingInsights;
    }

    /**
     * <p>
     * List of supporting insights that provide additional factors for the insight.
     * </p>
     * 
     * @param supportingInsights
     *        List of supporting insights that provide additional factors for the insight.
     */

    public void setSupportingInsights(java.util.Collection<Insight> supportingInsights) {
        if (supportingInsights == null) {
            this.supportingInsights = null;
            return;
        }

        this.supportingInsights = new java.util.ArrayList<Insight>(supportingInsights);
    }

    /**
     * <p>
     * List of supporting insights that provide additional factors for the insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportingInsights(java.util.Collection)} or {@link #withSupportingInsights(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportingInsights
     *        List of supporting insights that provide additional factors for the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withSupportingInsights(Insight... supportingInsights) {
        if (this.supportingInsights == null) {
            setSupportingInsights(new java.util.ArrayList<Insight>(supportingInsights.length));
        }
        for (Insight ele : supportingInsights) {
            this.supportingInsights.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of supporting insights that provide additional factors for the insight.
     * </p>
     * 
     * @param supportingInsights
     *        List of supporting insights that provide additional factors for the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withSupportingInsights(java.util.Collection<Insight> supportingInsights) {
        setSupportingInsights(supportingInsights);
        return this;
    }

    /**
     * <p>
     * Description of the insight. For example:
     * <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     * .
     * </p>
     * 
     * @param description
     *        Description of the insight. For example:
     *        <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     *        .
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Description of the insight. For example:
     * <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     * .
     * </p>
     * 
     * @return Description of the insight. For example:
     *         <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     *         .
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Description of the insight. For example:
     * <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     * .
     * </p>
     * 
     * @param description
     *        Description of the insight. For example:
     *        <code>A high severity Insight found between 02:00 to 02:30, where there was an unusually high DB load 600x above baseline. Likely performance impact</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * List of recommendations for the insight. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * .
     * </p>
     * 
     * @return List of recommendations for the insight. For example,
     *         <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     *         .
     */

    public java.util.List<Recommendation> getRecommendations() {
        return recommendations;
    }

    /**
     * <p>
     * List of recommendations for the insight. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * .
     * </p>
     * 
     * @param recommendations
     *        List of recommendations for the insight. For example,
     *        <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     *        .
     */

    public void setRecommendations(java.util.Collection<Recommendation> recommendations) {
        if (recommendations == null) {
            this.recommendations = null;
            return;
        }

        this.recommendations = new java.util.ArrayList<Recommendation>(recommendations);
    }

    /**
     * <p>
     * List of recommendations for the insight. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * .
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecommendations(java.util.Collection)} or {@link #withRecommendations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param recommendations
     *        List of recommendations for the insight. For example,
     *        <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withRecommendations(Recommendation... recommendations) {
        if (this.recommendations == null) {
            setRecommendations(new java.util.ArrayList<Recommendation>(recommendations.length));
        }
        for (Recommendation ele : recommendations) {
            this.recommendations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of recommendations for the insight. For example,
     * <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     * .
     * </p>
     * 
     * @param recommendations
     *        List of recommendations for the insight. For example,
     *        <code>Investigate the following SQLs that contributed to 100% of the total DBLoad during that time period: sql-id</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withRecommendations(java.util.Collection<Recommendation> recommendations) {
        setRecommendations(recommendations);
        return this;
    }

    /**
     * <p>
     * List of data objects containing metrics and references from the time range while generating the insight.
     * </p>
     * 
     * @return List of data objects containing metrics and references from the time range while generating the insight.
     */

    public java.util.List<Data> getInsightData() {
        return insightData;
    }

    /**
     * <p>
     * List of data objects containing metrics and references from the time range while generating the insight.
     * </p>
     * 
     * @param insightData
     *        List of data objects containing metrics and references from the time range while generating the insight.
     */

    public void setInsightData(java.util.Collection<Data> insightData) {
        if (insightData == null) {
            this.insightData = null;
            return;
        }

        this.insightData = new java.util.ArrayList<Data>(insightData);
    }

    /**
     * <p>
     * List of data objects containing metrics and references from the time range while generating the insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInsightData(java.util.Collection)} or {@link #withInsightData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param insightData
     *        List of data objects containing metrics and references from the time range while generating the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightData(Data... insightData) {
        if (this.insightData == null) {
            setInsightData(new java.util.ArrayList<Data>(insightData.length));
        }
        for (Data ele : insightData) {
            this.insightData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of data objects containing metrics and references from the time range while generating the insight.
     * </p>
     * 
     * @param insightData
     *        List of data objects containing metrics and references from the time range while generating the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withInsightData(java.util.Collection<Data> insightData) {
        setInsightData(insightData);
        return this;
    }

    /**
     * <p>
     * Metric names and values from the timeframe used as baseline to generate the insight.
     * </p>
     * 
     * @return Metric names and values from the timeframe used as baseline to generate the insight.
     */

    public java.util.List<Data> getBaselineData() {
        return baselineData;
    }

    /**
     * <p>
     * Metric names and values from the timeframe used as baseline to generate the insight.
     * </p>
     * 
     * @param baselineData
     *        Metric names and values from the timeframe used as baseline to generate the insight.
     */

    public void setBaselineData(java.util.Collection<Data> baselineData) {
        if (baselineData == null) {
            this.baselineData = null;
            return;
        }

        this.baselineData = new java.util.ArrayList<Data>(baselineData);
    }

    /**
     * <p>
     * Metric names and values from the timeframe used as baseline to generate the insight.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBaselineData(java.util.Collection)} or {@link #withBaselineData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param baselineData
     *        Metric names and values from the timeframe used as baseline to generate the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withBaselineData(Data... baselineData) {
        if (this.baselineData == null) {
            setBaselineData(new java.util.ArrayList<Data>(baselineData.length));
        }
        for (Data ele : baselineData) {
            this.baselineData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Metric names and values from the timeframe used as baseline to generate the insight.
     * </p>
     * 
     * @param baselineData
     *        Metric names and values from the timeframe used as baseline to generate the insight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Insight withBaselineData(java.util.Collection<Data> baselineData) {
        setBaselineData(baselineData);
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
        if (getInsightId() != null)
            sb.append("InsightId: ").append(getInsightId()).append(",");
        if (getInsightType() != null)
            sb.append("InsightType: ").append(getInsightType()).append(",");
        if (getContext() != null)
            sb.append("Context: ").append(getContext()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity()).append(",");
        if (getSupportingInsights() != null)
            sb.append("SupportingInsights: ").append(getSupportingInsights()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append("***Sensitive Data Redacted***").append(",");
        if (getRecommendations() != null)
            sb.append("Recommendations: ").append(getRecommendations()).append(",");
        if (getInsightData() != null)
            sb.append("InsightData: ").append(getInsightData()).append(",");
        if (getBaselineData() != null)
            sb.append("BaselineData: ").append(getBaselineData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Insight == false)
            return false;
        Insight other = (Insight) obj;
        if (other.getInsightId() == null ^ this.getInsightId() == null)
            return false;
        if (other.getInsightId() != null && other.getInsightId().equals(this.getInsightId()) == false)
            return false;
        if (other.getInsightType() == null ^ this.getInsightType() == null)
            return false;
        if (other.getInsightType() != null && other.getInsightType().equals(this.getInsightType()) == false)
            return false;
        if (other.getContext() == null ^ this.getContext() == null)
            return false;
        if (other.getContext() != null && other.getContext().equals(this.getContext()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        if (other.getSupportingInsights() == null ^ this.getSupportingInsights() == null)
            return false;
        if (other.getSupportingInsights() != null && other.getSupportingInsights().equals(this.getSupportingInsights()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRecommendations() == null ^ this.getRecommendations() == null)
            return false;
        if (other.getRecommendations() != null && other.getRecommendations().equals(this.getRecommendations()) == false)
            return false;
        if (other.getInsightData() == null ^ this.getInsightData() == null)
            return false;
        if (other.getInsightData() != null && other.getInsightData().equals(this.getInsightData()) == false)
            return false;
        if (other.getBaselineData() == null ^ this.getBaselineData() == null)
            return false;
        if (other.getBaselineData() != null && other.getBaselineData().equals(this.getBaselineData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInsightId() == null) ? 0 : getInsightId().hashCode());
        hashCode = prime * hashCode + ((getInsightType() == null) ? 0 : getInsightType().hashCode());
        hashCode = prime * hashCode + ((getContext() == null) ? 0 : getContext().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        hashCode = prime * hashCode + ((getSupportingInsights() == null) ? 0 : getSupportingInsights().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRecommendations() == null) ? 0 : getRecommendations().hashCode());
        hashCode = prime * hashCode + ((getInsightData() == null) ? 0 : getInsightData().hashCode());
        hashCode = prime * hashCode + ((getBaselineData() == null) ? 0 : getBaselineData().hashCode());
        return hashCode;
    }

    @Override
    public Insight clone() {
        try {
            return (Insight) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pi.model.transform.InsightMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
