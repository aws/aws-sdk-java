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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the results for the intent stage metrics you requested and the bin and/or group they refer to,
 * if applicable.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/AnalyticsIntentStageResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsIntentStageResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of objects containing the criteria you requested for binning results and the values of the bins.
     * </p>
     */
    private java.util.List<AnalyticsBinKey> binKeys;
    /**
     * <p>
     * A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * </p>
     */
    private java.util.List<AnalyticsIntentStageGroupByKey> groupByKeys;
    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     */
    private java.util.List<AnalyticsIntentStageMetricResult> metricsResults;

    /**
     * <p>
     * A list of objects containing the criteria you requested for binning results and the values of the bins.
     * </p>
     * 
     * @return A list of objects containing the criteria you requested for binning results and the values of the bins.
     */

    public java.util.List<AnalyticsBinKey> getBinKeys() {
        return binKeys;
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for binning results and the values of the bins.
     * </p>
     * 
     * @param binKeys
     *        A list of objects containing the criteria you requested for binning results and the values of the bins.
     */

    public void setBinKeys(java.util.Collection<AnalyticsBinKey> binKeys) {
        if (binKeys == null) {
            this.binKeys = null;
            return;
        }

        this.binKeys = new java.util.ArrayList<AnalyticsBinKey>(binKeys);
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for binning results and the values of the bins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBinKeys(java.util.Collection)} or {@link #withBinKeys(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param binKeys
     *        A list of objects containing the criteria you requested for binning results and the values of the bins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withBinKeys(AnalyticsBinKey... binKeys) {
        if (this.binKeys == null) {
            setBinKeys(new java.util.ArrayList<AnalyticsBinKey>(binKeys.length));
        }
        for (AnalyticsBinKey ele : binKeys) {
            this.binKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for binning results and the values of the bins.
     * </p>
     * 
     * @param binKeys
     *        A list of objects containing the criteria you requested for binning results and the values of the bins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withBinKeys(java.util.Collection<AnalyticsBinKey> binKeys) {
        setBinKeys(binKeys);
        return this;
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * </p>
     * 
     * @return A list of objects containing the criteria you requested for grouping results and the values of the bins.
     */

    public java.util.List<AnalyticsIntentStageGroupByKey> getGroupByKeys() {
        return groupByKeys;
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * </p>
     * 
     * @param groupByKeys
     *        A list of objects containing the criteria you requested for grouping results and the values of the bins.
     */

    public void setGroupByKeys(java.util.Collection<AnalyticsIntentStageGroupByKey> groupByKeys) {
        if (groupByKeys == null) {
            this.groupByKeys = null;
            return;
        }

        this.groupByKeys = new java.util.ArrayList<AnalyticsIntentStageGroupByKey>(groupByKeys);
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupByKeys(java.util.Collection)} or {@link #withGroupByKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param groupByKeys
     *        A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withGroupByKeys(AnalyticsIntentStageGroupByKey... groupByKeys) {
        if (this.groupByKeys == null) {
            setGroupByKeys(new java.util.ArrayList<AnalyticsIntentStageGroupByKey>(groupByKeys.length));
        }
        for (AnalyticsIntentStageGroupByKey ele : groupByKeys) {
            this.groupByKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * </p>
     * 
     * @param groupByKeys
     *        A list of objects containing the criteria you requested for grouping results and the values of the bins.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withGroupByKeys(java.util.Collection<AnalyticsIntentStageGroupByKey> groupByKeys) {
        setGroupByKeys(groupByKeys);
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @return A list of objects, each of which contains a metric you want to list, the statistic for the metric you
     *         want to return, and the method by which to organize the results.
     */

    public java.util.List<AnalyticsIntentStageMetricResult> getMetricsResults() {
        return metricsResults;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @param metricsResults
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     */

    public void setMetricsResults(java.util.Collection<AnalyticsIntentStageMetricResult> metricsResults) {
        if (metricsResults == null) {
            this.metricsResults = null;
            return;
        }

        this.metricsResults = new java.util.ArrayList<AnalyticsIntentStageMetricResult>(metricsResults);
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricsResults(java.util.Collection)} or {@link #withMetricsResults(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricsResults
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withMetricsResults(AnalyticsIntentStageMetricResult... metricsResults) {
        if (this.metricsResults == null) {
            setMetricsResults(new java.util.ArrayList<AnalyticsIntentStageMetricResult>(metricsResults.length));
        }
        for (AnalyticsIntentStageMetricResult ele : metricsResults) {
            this.metricsResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects, each of which contains a metric you want to list, the statistic for the metric you want to
     * return, and the method by which to organize the results.
     * </p>
     * 
     * @param metricsResults
     *        A list of objects, each of which contains a metric you want to list, the statistic for the metric you want
     *        to return, and the method by which to organize the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsIntentStageResult withMetricsResults(java.util.Collection<AnalyticsIntentStageMetricResult> metricsResults) {
        setMetricsResults(metricsResults);
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
        if (getBinKeys() != null)
            sb.append("BinKeys: ").append(getBinKeys()).append(",");
        if (getGroupByKeys() != null)
            sb.append("GroupByKeys: ").append(getGroupByKeys()).append(",");
        if (getMetricsResults() != null)
            sb.append("MetricsResults: ").append(getMetricsResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsIntentStageResult == false)
            return false;
        AnalyticsIntentStageResult other = (AnalyticsIntentStageResult) obj;
        if (other.getBinKeys() == null ^ this.getBinKeys() == null)
            return false;
        if (other.getBinKeys() != null && other.getBinKeys().equals(this.getBinKeys()) == false)
            return false;
        if (other.getGroupByKeys() == null ^ this.getGroupByKeys() == null)
            return false;
        if (other.getGroupByKeys() != null && other.getGroupByKeys().equals(this.getGroupByKeys()) == false)
            return false;
        if (other.getMetricsResults() == null ^ this.getMetricsResults() == null)
            return false;
        if (other.getMetricsResults() != null && other.getMetricsResults().equals(this.getMetricsResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBinKeys() == null) ? 0 : getBinKeys().hashCode());
        hashCode = prime * hashCode + ((getGroupByKeys() == null) ? 0 : getGroupByKeys().hashCode());
        hashCode = prime * hashCode + ((getMetricsResults() == null) ? 0 : getMetricsResults().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsIntentStageResult clone() {
        try {
            return (AnalyticsIntentStageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.AnalyticsIntentStageResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
