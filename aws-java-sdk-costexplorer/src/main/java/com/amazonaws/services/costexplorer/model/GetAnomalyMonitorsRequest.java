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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalyMonitors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomalyMonitorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     */
    private java.util.List<String> monitorArnList;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @return A list of cost anomaly monitor ARNs.
     */

    public java.util.List<String> getMonitorArnList() {
        return monitorArnList;
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     */

    public void setMonitorArnList(java.util.Collection<String> monitorArnList) {
        if (monitorArnList == null) {
            this.monitorArnList = null;
            return;
        }

        this.monitorArnList = new java.util.ArrayList<String>(monitorArnList);
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitorArnList(java.util.Collection)} or {@link #withMonitorArnList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsRequest withMonitorArnList(String... monitorArnList) {
        if (this.monitorArnList == null) {
            setMonitorArnList(new java.util.ArrayList<String>(monitorArnList.length));
        }
        for (String ele : monitorArnList) {
            this.monitorArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArnList
     *        A list of cost anomaly monitor ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsRequest withMonitorArnList(java.util.Collection<String> monitorArnList) {
        setMonitorArnList(monitorArnList);
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

    public GetAnomalyMonitorsRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @param maxResults
     *        The number of entries a paginated response contains.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @return The number of entries a paginated response contains.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of entries a paginated response contains.
     * </p>
     * 
     * @param maxResults
     *        The number of entries a paginated response contains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalyMonitorsRequest withMaxResults(Integer maxResults) {
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
        if (getMonitorArnList() != null)
            sb.append("MonitorArnList: ").append(getMonitorArnList()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
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

        if (obj instanceof GetAnomalyMonitorsRequest == false)
            return false;
        GetAnomalyMonitorsRequest other = (GetAnomalyMonitorsRequest) obj;
        if (other.getMonitorArnList() == null ^ this.getMonitorArnList() == null)
            return false;
        if (other.getMonitorArnList() != null && other.getMonitorArnList().equals(this.getMonitorArnList()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
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

        hashCode = prime * hashCode + ((getMonitorArnList() == null) ? 0 : getMonitorArnList().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomalyMonitorsRequest clone() {
        return (GetAnomalyMonitorsRequest) super.clone();
    }

}
