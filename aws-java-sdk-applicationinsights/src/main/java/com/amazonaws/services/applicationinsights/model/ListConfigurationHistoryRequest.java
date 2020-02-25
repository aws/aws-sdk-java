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
package com.amazonaws.services.applicationinsights.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/application-insights-2018-11-25/ListConfigurationHistory"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListConfigurationHistoryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Resource group to which the application belongs.
     * </p>
     */
    private String resourceGroupName;
    /**
     * <p>
     * The start time of the event.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the event.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     */
    private String eventStatus;
    /**
     * <p>
     * The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When this
     * parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListConfigurationHistory</code> request with the returned <code>NextToken</code> value. If
     * this parameter is not used, then <code>ListConfigurationHistory</code> returns all results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code> request
     * where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>NextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Resource group to which the application belongs.
     * </p>
     * 
     * @param resourceGroupName
     *        Resource group to which the application belongs.
     */

    public void setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
    }

    /**
     * <p>
     * Resource group to which the application belongs.
     * </p>
     * 
     * @return Resource group to which the application belongs.
     */

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <p>
     * Resource group to which the application belongs.
     * </p>
     * 
     * @param resourceGroupName
     *        Resource group to which the application belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationHistoryRequest withResourceGroupName(String resourceGroupName) {
        setResourceGroupName(resourceGroupName);
        return this;
    }

    /**
     * <p>
     * The start time of the event.
     * </p>
     * 
     * @param startTime
     *        The start time of the event.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the event.
     * </p>
     * 
     * @return The start time of the event.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the event.
     * </p>
     * 
     * @param startTime
     *        The start time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationHistoryRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the event.
     * </p>
     * 
     * @param endTime
     *        The end time of the event.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the event.
     * </p>
     * 
     * @return The end time of the event.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the event.
     * </p>
     * 
     * @param endTime
     *        The end time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationHistoryRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @see ConfigurationEventStatus
     */

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @return The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @see ConfigurationEventStatus
     */

    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventStatus
     */

    public ListConfigurationHistoryRequest withEventStatus(String eventStatus) {
        setEventStatus(eventStatus);
        return this;
    }

    /**
     * <p>
     * The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * </p>
     * 
     * @param eventStatus
     *        The status of the configuration update event. Possible values include INFO, WARN, and ERROR.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationEventStatus
     */

    public ListConfigurationHistoryRequest withEventStatus(ConfigurationEventStatus eventStatus) {
        this.eventStatus = eventStatus.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When this
     * parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListConfigurationHistory</code> request with the returned <code>NextToken</code> value. If
     * this parameter is not used, then <code>ListConfigurationHistory</code> returns all results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When
     *        this parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a
     *        single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>ListConfigurationHistory</code> request with the returned
     *        <code>NextToken</code> value. If this parameter is not used, then <code>ListConfigurationHistory</code>
     *        returns all results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When this
     * parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListConfigurationHistory</code> request with the returned <code>NextToken</code> value. If
     * this parameter is not used, then <code>ListConfigurationHistory</code> returns all results.
     * </p>
     * 
     * @return The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When
     *         this parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a
     *         single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *         request can be seen by sending another <code>ListConfigurationHistory</code> request with the returned
     *         <code>NextToken</code> value. If this parameter is not used, then <code>ListConfigurationHistory</code>
     *         returns all results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When this
     * parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a single page
     * along with a <code>NextToken</code> response element. The remaining results of the initial request can be seen by
     * sending another <code>ListConfigurationHistory</code> request with the returned <code>NextToken</code> value. If
     * this parameter is not used, then <code>ListConfigurationHistory</code> returns all results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results returned by <code>ListConfigurationHistory</code> in paginated output. When
     *        this parameter is used, <code>ListConfigurationHistory</code> returns only <code>MaxResults</code> in a
     *        single page along with a <code>NextToken</code> response element. The remaining results of the initial
     *        request can be seen by sending another <code>ListConfigurationHistory</code> request with the returned
     *        <code>NextToken</code> value. If this parameter is not used, then <code>ListConfigurationHistory</code>
     *        returns all results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationHistoryRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code> request
     * where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>NextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code>
     *        request where <code>MaxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code> request
     * where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>NextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code>
     *         request where <code>MaxResults</code> was used and the results exceeded the value of that parameter.
     *         Pagination continues from the end of the previous results that returned the <code>NextToken</code> value.
     *         This value is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code> request
     * where <code>MaxResults</code> was used and the results exceeded the value of that parameter. Pagination continues
     * from the end of the previous results that returned the <code>NextToken</code> value. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous paginated <code>ListConfigurationHistory</code>
     *        request where <code>MaxResults</code> was used and the results exceeded the value of that parameter.
     *        Pagination continues from the end of the previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListConfigurationHistoryRequest withNextToken(String nextToken) {
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
        if (getResourceGroupName() != null)
            sb.append("ResourceGroupName: ").append(getResourceGroupName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEventStatus() != null)
            sb.append("EventStatus: ").append(getEventStatus()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListConfigurationHistoryRequest == false)
            return false;
        ListConfigurationHistoryRequest other = (ListConfigurationHistoryRequest) obj;
        if (other.getResourceGroupName() == null ^ this.getResourceGroupName() == null)
            return false;
        if (other.getResourceGroupName() != null && other.getResourceGroupName().equals(this.getResourceGroupName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEventStatus() == null ^ this.getEventStatus() == null)
            return false;
        if (other.getEventStatus() != null && other.getEventStatus().equals(this.getEventStatus()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getResourceGroupName() == null) ? 0 : getResourceGroupName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListConfigurationHistoryRequest clone() {
        return (ListConfigurationHistoryRequest) super.clone();
    }

}
