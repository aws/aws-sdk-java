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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetAnomalySubscriptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAnomalySubscriptionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of cost anomaly subscription ARNs.
     * </p>
     */
    private java.util.List<String> subscriptionArnList;
    /**
     * <p>
     * Cost anomaly monitor ARNs.
     * </p>
     */
    private String monitorArn;
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
     * A list of cost anomaly subscription ARNs.
     * </p>
     * 
     * @return A list of cost anomaly subscription ARNs.
     */

    public java.util.List<String> getSubscriptionArnList() {
        return subscriptionArnList;
    }

    /**
     * <p>
     * A list of cost anomaly subscription ARNs.
     * </p>
     * 
     * @param subscriptionArnList
     *        A list of cost anomaly subscription ARNs.
     */

    public void setSubscriptionArnList(java.util.Collection<String> subscriptionArnList) {
        if (subscriptionArnList == null) {
            this.subscriptionArnList = null;
            return;
        }

        this.subscriptionArnList = new java.util.ArrayList<String>(subscriptionArnList);
    }

    /**
     * <p>
     * A list of cost anomaly subscription ARNs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscriptionArnList(java.util.Collection)} or {@link #withSubscriptionArnList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param subscriptionArnList
     *        A list of cost anomaly subscription ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalySubscriptionsRequest withSubscriptionArnList(String... subscriptionArnList) {
        if (this.subscriptionArnList == null) {
            setSubscriptionArnList(new java.util.ArrayList<String>(subscriptionArnList.length));
        }
        for (String ele : subscriptionArnList) {
            this.subscriptionArnList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of cost anomaly subscription ARNs.
     * </p>
     * 
     * @param subscriptionArnList
     *        A list of cost anomaly subscription ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalySubscriptionsRequest withSubscriptionArnList(java.util.Collection<String> subscriptionArnList) {
        setSubscriptionArnList(subscriptionArnList);
        return this;
    }

    /**
     * <p>
     * Cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArn
     *        Cost anomaly monitor ARNs.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * Cost anomaly monitor ARNs.
     * </p>
     * 
     * @return Cost anomaly monitor ARNs.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * Cost anomaly monitor ARNs.
     * </p>
     * 
     * @param monitorArn
     *        Cost anomaly monitor ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAnomalySubscriptionsRequest withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
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

    public GetAnomalySubscriptionsRequest withNextPageToken(String nextPageToken) {
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

    public GetAnomalySubscriptionsRequest withMaxResults(Integer maxResults) {
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
        if (getSubscriptionArnList() != null)
            sb.append("SubscriptionArnList: ").append(getSubscriptionArnList()).append(",");
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
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

        if (obj instanceof GetAnomalySubscriptionsRequest == false)
            return false;
        GetAnomalySubscriptionsRequest other = (GetAnomalySubscriptionsRequest) obj;
        if (other.getSubscriptionArnList() == null ^ this.getSubscriptionArnList() == null)
            return false;
        if (other.getSubscriptionArnList() != null && other.getSubscriptionArnList().equals(this.getSubscriptionArnList()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
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

        hashCode = prime * hashCode + ((getSubscriptionArnList() == null) ? 0 : getSubscriptionArnList().hashCode());
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetAnomalySubscriptionsRequest clone() {
        return (GetAnomalySubscriptionsRequest) super.clone();
    }

}
