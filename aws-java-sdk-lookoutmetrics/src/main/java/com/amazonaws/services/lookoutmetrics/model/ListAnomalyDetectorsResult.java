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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyDetectors"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of anomaly detectors in the account in the current region.
     * </p>
     */
    private java.util.List<AnomalyDetectorSummary> anomalyDetectorSummaryList;
    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use the token
     * in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of anomaly detectors in the account in the current region.
     * </p>
     * 
     * @return A list of anomaly detectors in the account in the current region.
     */

    public java.util.List<AnomalyDetectorSummary> getAnomalyDetectorSummaryList() {
        return anomalyDetectorSummaryList;
    }

    /**
     * <p>
     * A list of anomaly detectors in the account in the current region.
     * </p>
     * 
     * @param anomalyDetectorSummaryList
     *        A list of anomaly detectors in the account in the current region.
     */

    public void setAnomalyDetectorSummaryList(java.util.Collection<AnomalyDetectorSummary> anomalyDetectorSummaryList) {
        if (anomalyDetectorSummaryList == null) {
            this.anomalyDetectorSummaryList = null;
            return;
        }

        this.anomalyDetectorSummaryList = new java.util.ArrayList<AnomalyDetectorSummary>(anomalyDetectorSummaryList);
    }

    /**
     * <p>
     * A list of anomaly detectors in the account in the current region.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyDetectorSummaryList(java.util.Collection)} or
     * {@link #withAnomalyDetectorSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param anomalyDetectorSummaryList
     *        A list of anomaly detectors in the account in the current region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyDetectorsResult withAnomalyDetectorSummaryList(AnomalyDetectorSummary... anomalyDetectorSummaryList) {
        if (this.anomalyDetectorSummaryList == null) {
            setAnomalyDetectorSummaryList(new java.util.ArrayList<AnomalyDetectorSummary>(anomalyDetectorSummaryList.length));
        }
        for (AnomalyDetectorSummary ele : anomalyDetectorSummaryList) {
            this.anomalyDetectorSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of anomaly detectors in the account in the current region.
     * </p>
     * 
     * @param anomalyDetectorSummaryList
     *        A list of anomaly detectors in the account in the current region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyDetectorsResult withAnomalyDetectorSummaryList(java.util.Collection<AnomalyDetectorSummary> anomalyDetectorSummaryList) {
        setAnomalyDetectorSummaryList(anomalyDetectorSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use the token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the service returns this token. To retrieve the next set of results, use the
     *        token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use the token
     * in the next request.
     * </p>
     * 
     * @return If the response is truncated, the service returns this token. To retrieve the next set of results, use
     *         the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use the token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the service returns this token. To retrieve the next set of results, use the
     *        token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyDetectorsResult withNextToken(String nextToken) {
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
        if (getAnomalyDetectorSummaryList() != null)
            sb.append("AnomalyDetectorSummaryList: ").append(getAnomalyDetectorSummaryList()).append(",");
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

        if (obj instanceof ListAnomalyDetectorsResult == false)
            return false;
        ListAnomalyDetectorsResult other = (ListAnomalyDetectorsResult) obj;
        if (other.getAnomalyDetectorSummaryList() == null ^ this.getAnomalyDetectorSummaryList() == null)
            return false;
        if (other.getAnomalyDetectorSummaryList() != null && other.getAnomalyDetectorSummaryList().equals(this.getAnomalyDetectorSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getAnomalyDetectorSummaryList() == null) ? 0 : getAnomalyDetectorSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyDetectorsResult clone() {
        try {
            return (ListAnomalyDetectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
