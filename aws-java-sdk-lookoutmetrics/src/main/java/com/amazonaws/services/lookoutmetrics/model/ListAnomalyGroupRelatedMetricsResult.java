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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupRelatedMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyGroupRelatedMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by
     * the anomaly group.
     * </p>
     */
    private java.util.List<InterMetricImpactDetails> interMetricImpactList;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by
     * the anomaly group.
     * </p>
     * 
     * @return Aggregated details about the measures contributing to the anomaly group, and the measures potentially
     *         impacted by the anomaly group.
     */

    public java.util.List<InterMetricImpactDetails> getInterMetricImpactList() {
        return interMetricImpactList;
    }

    /**
     * <p>
     * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by
     * the anomaly group.
     * </p>
     * 
     * @param interMetricImpactList
     *        Aggregated details about the measures contributing to the anomaly group, and the measures potentially
     *        impacted by the anomaly group.
     */

    public void setInterMetricImpactList(java.util.Collection<InterMetricImpactDetails> interMetricImpactList) {
        if (interMetricImpactList == null) {
            this.interMetricImpactList = null;
            return;
        }

        this.interMetricImpactList = new java.util.ArrayList<InterMetricImpactDetails>(interMetricImpactList);
    }

    /**
     * <p>
     * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by
     * the anomaly group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInterMetricImpactList(java.util.Collection)} or
     * {@link #withInterMetricImpactList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param interMetricImpactList
     *        Aggregated details about the measures contributing to the anomaly group, and the measures potentially
     *        impacted by the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupRelatedMetricsResult withInterMetricImpactList(InterMetricImpactDetails... interMetricImpactList) {
        if (this.interMetricImpactList == null) {
            setInterMetricImpactList(new java.util.ArrayList<InterMetricImpactDetails>(interMetricImpactList.length));
        }
        for (InterMetricImpactDetails ele : interMetricImpactList) {
            this.interMetricImpactList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Aggregated details about the measures contributing to the anomaly group, and the measures potentially impacted by
     * the anomaly group.
     * </p>
     * 
     * @param interMetricImpactList
     *        Aggregated details about the measures contributing to the anomaly group, and the measures potentially
     *        impacted by the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupRelatedMetricsResult withInterMetricImpactList(java.util.Collection<InterMetricImpactDetails> interMetricImpactList) {
        setInterMetricImpactList(interMetricImpactList);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupRelatedMetricsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInterMetricImpactList() != null)
            sb.append("InterMetricImpactList: ").append(getInterMetricImpactList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnomalyGroupRelatedMetricsResult == false)
            return false;
        ListAnomalyGroupRelatedMetricsResult other = (ListAnomalyGroupRelatedMetricsResult) obj;
        if (other.getInterMetricImpactList() == null ^ this.getInterMetricImpactList() == null)
            return false;
        if (other.getInterMetricImpactList() != null && other.getInterMetricImpactList().equals(this.getInterMetricImpactList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterMetricImpactList() == null) ? 0 : getInterMetricImpactList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyGroupRelatedMetricsResult clone() {
        try {
            return (ListAnomalyGroupRelatedMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
