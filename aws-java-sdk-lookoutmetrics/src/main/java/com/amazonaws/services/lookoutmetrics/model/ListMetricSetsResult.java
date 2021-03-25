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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListMetricSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMetricSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the datasets in the AWS Region, with configuration details for each.
     * </p>
     */
    private java.util.List<MetricSetSummary> metricSetSummaryList;
    /**
     * <p>
     * If the response is truncated, the list call returns this token. To retrieve the next set of results, use the
     * token in the next list request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the datasets in the AWS Region, with configuration details for each.
     * </p>
     * 
     * @return A list of the datasets in the AWS Region, with configuration details for each.
     */

    public java.util.List<MetricSetSummary> getMetricSetSummaryList() {
        return metricSetSummaryList;
    }

    /**
     * <p>
     * A list of the datasets in the AWS Region, with configuration details for each.
     * </p>
     * 
     * @param metricSetSummaryList
     *        A list of the datasets in the AWS Region, with configuration details for each.
     */

    public void setMetricSetSummaryList(java.util.Collection<MetricSetSummary> metricSetSummaryList) {
        if (metricSetSummaryList == null) {
            this.metricSetSummaryList = null;
            return;
        }

        this.metricSetSummaryList = new java.util.ArrayList<MetricSetSummary>(metricSetSummaryList);
    }

    /**
     * <p>
     * A list of the datasets in the AWS Region, with configuration details for each.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricSetSummaryList(java.util.Collection)} or {@link #withMetricSetSummaryList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param metricSetSummaryList
     *        A list of the datasets in the AWS Region, with configuration details for each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricSetsResult withMetricSetSummaryList(MetricSetSummary... metricSetSummaryList) {
        if (this.metricSetSummaryList == null) {
            setMetricSetSummaryList(new java.util.ArrayList<MetricSetSummary>(metricSetSummaryList.length));
        }
        for (MetricSetSummary ele : metricSetSummaryList) {
            this.metricSetSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the datasets in the AWS Region, with configuration details for each.
     * </p>
     * 
     * @param metricSetSummaryList
     *        A list of the datasets in the AWS Region, with configuration details for each.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricSetsResult withMetricSetSummaryList(java.util.Collection<MetricSetSummary> metricSetSummaryList) {
        setMetricSetSummaryList(metricSetSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the list call returns this token. To retrieve the next set of results, use the
     * token in the next list request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the list call returns this token. To retrieve the next set of results, use
     *        the token in the next list request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the list call returns this token. To retrieve the next set of results, use the
     * token in the next list request.
     * </p>
     * 
     * @return If the response is truncated, the list call returns this token. To retrieve the next set of results, use
     *         the token in the next list request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the list call returns this token. To retrieve the next set of results, use the
     * token in the next list request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the list call returns this token. To retrieve the next set of results, use
     *        the token in the next list request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMetricSetsResult withNextToken(String nextToken) {
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
        if (getMetricSetSummaryList() != null)
            sb.append("MetricSetSummaryList: ").append(getMetricSetSummaryList()).append(",");
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

        if (obj instanceof ListMetricSetsResult == false)
            return false;
        ListMetricSetsResult other = (ListMetricSetsResult) obj;
        if (other.getMetricSetSummaryList() == null ^ this.getMetricSetSummaryList() == null)
            return false;
        if (other.getMetricSetSummaryList() != null && other.getMetricSetSummaryList().equals(this.getMetricSetSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getMetricSetSummaryList() == null) ? 0 : getMetricSetSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMetricSetsResult clone() {
        try {
            return (ListMetricSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
