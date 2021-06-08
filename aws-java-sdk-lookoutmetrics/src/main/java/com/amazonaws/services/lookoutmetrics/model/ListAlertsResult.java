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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAlerts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAlertsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains information about an alert.
     * </p>
     */
    private java.util.List<AlertSummary> alertSummaryList;
    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use this token
     * in the next request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains information about an alert.
     * </p>
     * 
     * @return Contains information about an alert.
     */

    public java.util.List<AlertSummary> getAlertSummaryList() {
        return alertSummaryList;
    }

    /**
     * <p>
     * Contains information about an alert.
     * </p>
     * 
     * @param alertSummaryList
     *        Contains information about an alert.
     */

    public void setAlertSummaryList(java.util.Collection<AlertSummary> alertSummaryList) {
        if (alertSummaryList == null) {
            this.alertSummaryList = null;
            return;
        }

        this.alertSummaryList = new java.util.ArrayList<AlertSummary>(alertSummaryList);
    }

    /**
     * <p>
     * Contains information about an alert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAlertSummaryList(java.util.Collection)} or {@link #withAlertSummaryList(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param alertSummaryList
     *        Contains information about an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsResult withAlertSummaryList(AlertSummary... alertSummaryList) {
        if (this.alertSummaryList == null) {
            setAlertSummaryList(new java.util.ArrayList<AlertSummary>(alertSummaryList.length));
        }
        for (AlertSummary ele : alertSummaryList) {
            this.alertSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains information about an alert.
     * </p>
     * 
     * @param alertSummaryList
     *        Contains information about an alert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsResult withAlertSummaryList(java.util.Collection<AlertSummary> alertSummaryList) {
        setAlertSummaryList(alertSummaryList);
        return this;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use this token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the service returns this token. To retrieve the next set of results, use
     *        this token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use this token
     * in the next request.
     * </p>
     * 
     * @return If the response is truncated, the service returns this token. To retrieve the next set of results, use
     *         this token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response is truncated, the service returns this token. To retrieve the next set of results, use this token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response is truncated, the service returns this token. To retrieve the next set of results, use
     *        this token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAlertsResult withNextToken(String nextToken) {
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
        if (getAlertSummaryList() != null)
            sb.append("AlertSummaryList: ").append(getAlertSummaryList()).append(",");
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

        if (obj instanceof ListAlertsResult == false)
            return false;
        ListAlertsResult other = (ListAlertsResult) obj;
        if (other.getAlertSummaryList() == null ^ this.getAlertSummaryList() == null)
            return false;
        if (other.getAlertSummaryList() != null && other.getAlertSummaryList().equals(this.getAlertSummaryList()) == false)
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

        hashCode = prime * hashCode + ((getAlertSummaryList() == null) ? 0 : getAlertSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAlertsResult clone() {
        try {
            return (ListAlertsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
