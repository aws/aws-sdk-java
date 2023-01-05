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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.GetAwsNetworkPerformanceDataRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAwsNetworkPerformanceDataRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<GetAwsNetworkPerformanceDataRequest> {

    /**
     * <p>
     * A list of network performance data queries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DataQuery> dataQueries;
    /**
     * <p>
     * The starting time for the performance data request. The starting time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The ending time for the performance data request. The end time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of network performance data queries.
     * </p>
     * 
     * @return A list of network performance data queries.
     */

    public java.util.List<DataQuery> getDataQueries() {
        if (dataQueries == null) {
            dataQueries = new com.amazonaws.internal.SdkInternalList<DataQuery>();
        }
        return dataQueries;
    }

    /**
     * <p>
     * A list of network performance data queries.
     * </p>
     * 
     * @param dataQueries
     *        A list of network performance data queries.
     */

    public void setDataQueries(java.util.Collection<DataQuery> dataQueries) {
        if (dataQueries == null) {
            this.dataQueries = null;
            return;
        }

        this.dataQueries = new com.amazonaws.internal.SdkInternalList<DataQuery>(dataQueries);
    }

    /**
     * <p>
     * A list of network performance data queries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataQueries(java.util.Collection)} or {@link #withDataQueries(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dataQueries
     *        A list of network performance data queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withDataQueries(DataQuery... dataQueries) {
        if (this.dataQueries == null) {
            setDataQueries(new com.amazonaws.internal.SdkInternalList<DataQuery>(dataQueries.length));
        }
        for (DataQuery ele : dataQueries) {
            this.dataQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of network performance data queries.
     * </p>
     * 
     * @param dataQueries
     *        A list of network performance data queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withDataQueries(java.util.Collection<DataQuery> dataQueries) {
        setDataQueries(dataQueries);
        return this;
    }

    /**
     * <p>
     * The starting time for the performance data request. The starting time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @param startTime
     *        The starting time for the performance data request. The starting time must be formatted as
     *        <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The starting time for the performance data request. The starting time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @return The starting time for the performance data request. The starting time must be formatted as
     *         <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The starting time for the performance data request. The starting time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * </p>
     * 
     * @param startTime
     *        The starting time for the performance data request. The starting time must be formatted as
     *        <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-10T12:00:00.000Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The ending time for the performance data request. The end time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @param endTime
     *        The ending time for the performance data request. The end time must be formatted as
     *        <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The ending time for the performance data request. The end time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @return The ending time for the performance data request. The end time must be formatted as
     *         <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The ending time for the performance data request. The end time must be formatted as
     * <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     * </p>
     * 
     * @param endTime
     *        The ending time for the performance data request. The end time must be formatted as
     *        <code>yyyy-mm-ddThh:mm:ss</code>. For example, <code>2022-06-12T12:00:00.000Z</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAwsNetworkPerformanceDataRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<GetAwsNetworkPerformanceDataRequest> getDryRunRequest() {
        Request<GetAwsNetworkPerformanceDataRequest> request = new GetAwsNetworkPerformanceDataRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getDataQueries() != null)
            sb.append("DataQueries: ").append(getDataQueries()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof GetAwsNetworkPerformanceDataRequest == false)
            return false;
        GetAwsNetworkPerformanceDataRequest other = (GetAwsNetworkPerformanceDataRequest) obj;
        if (other.getDataQueries() == null ^ this.getDataQueries() == null)
            return false;
        if (other.getDataQueries() != null && other.getDataQueries().equals(this.getDataQueries()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getDataQueries() == null) ? 0 : getDataQueries().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetAwsNetworkPerformanceDataRequest clone() {
        return (GetAwsNetworkPerformanceDataRequest) super.clone();
    }
}
