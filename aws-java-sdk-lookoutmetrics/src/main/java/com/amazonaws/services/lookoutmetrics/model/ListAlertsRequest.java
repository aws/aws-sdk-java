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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlertsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the alert's detector.
     * </p>
     */
    private String anomalyDetectorArn;
    /**
     * <p>
     * If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results that will be displayed by the request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The ARN of the alert's detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the alert's detector.
     */

    public void setAnomalyDetectorArn(String anomalyDetectorArn) {
        this.anomalyDetectorArn = anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the alert's detector.
     * </p>
     * 
     * @return The ARN of the alert's detector.
     */

    public String getAnomalyDetectorArn() {
        return this.anomalyDetectorArn;
    }

    /**
     * <p>
     * The ARN of the alert's detector.
     * </p>
     * 
     * @param anomalyDetectorArn
     *        The ARN of the alert's detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsRequest withAnomalyDetectorArn(String anomalyDetectorArn) {
        setAnomalyDetectorArn(anomalyDetectorArn);
        return this;
    }

    /**
     * <p>
     * If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @return If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request is truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results that will be displayed by the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that will be displayed by the request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results that will be displayed by the request.
     * </p>
     * 
     * @return The maximum number of results that will be displayed by the request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results that will be displayed by the request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results that will be displayed by the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAlertsRequest == false)
            return false;
        ListAlertsRequest other = (ListAlertsRequest) obj;
        if (other.getAnomalyDetectorArn() == null ^ this.getAnomalyDetectorArn() == null)
            return false;
        if (other.getAnomalyDetectorArn() != null && other.getAnomalyDetectorArn().equals(this.getAnomalyDetectorArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyDetectorArn() == null) ? 0 : getAnomalyDetectorArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListAlertsRequest clone() {
        return (ListAlertsRequest) super.clone();
    }

}
