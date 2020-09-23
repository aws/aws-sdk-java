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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomalyMonitorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * </p>
     */
    private java.util.List<AnomalyMonitor> anomalyMonitors;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * </p>
     * 
     * @return A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     */

    public java.util.List<AnomalyMonitor> getAnomalyMonitors() {
        return anomalyMonitors;
    }

    /**
     * <p>
     * A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * </p>
     * 
     * @param anomalyMonitors
     *        A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     */

    public void setAnomalyMonitors(java.util.Collection<AnomalyMonitor> anomalyMonitors) {
        if (anomalyMonitors == null) {
            this.anomalyMonitors = null;
            return;
        }

        this.anomalyMonitors = new java.util.ArrayList<AnomalyMonitor>(anomalyMonitors);
    }

    /**
     * <p>
     * A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAnomalyMonitors(java.util.Collection)} or {@link #withAnomalyMonitors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param anomalyMonitors
     *        A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsResult withAnomalyMonitors(AnomalyMonitor... anomalyMonitors) {
        if (this.anomalyMonitors == null) {
            setAnomalyMonitors(new java.util.ArrayList<AnomalyMonitor>(anomalyMonitors.length));
        }
        for (AnomalyMonitor ele : anomalyMonitors) {
            this.anomalyMonitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * </p>
     * 
     * @param anomalyMonitors
     *        A list of cost anomaly monitors that includes the detailed metadata for each monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsResult withAnomalyMonitors(java.util.Collection<AnomalyMonitor> anomalyMonitors) {
        setAnomalyMonitors(anomalyMonitors);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getAnomalyMonitors() != null)
            sb.append("AnomalyMonitors: ").append(getAnomalyMonitors()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAnomalyMonitorsResult == false)
            return false;
        GetAnomalyMonitorsResult other = (GetAnomalyMonitorsResult) obj;
        if (other.getAnomalyMonitors() == null ^ this.getAnomalyMonitors() == null)
            return false;
        if (other.getAnomalyMonitors() != null && other.getAnomalyMonitors().equals(this.getAnomalyMonitors()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyMonitors() == null) ? 0 : getAnomalyMonitors().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomalyMonitorsResult clone() {
        try {
            return (GetAnomalyMonitorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
