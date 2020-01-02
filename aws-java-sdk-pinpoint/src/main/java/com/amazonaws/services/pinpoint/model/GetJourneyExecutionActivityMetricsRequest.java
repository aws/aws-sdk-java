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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetJourneyExecutionActivityMetrics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetJourneyExecutionActivityMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     */
    private String journeyActivityId;
    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     */
    private String journeyId;
    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     */
    private String pageSize;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyExecutionActivityMetricsRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     * 
     * @param journeyActivityId
     *        The unique identifier for the journey activity.
     */

    public void setJourneyActivityId(String journeyActivityId) {
        this.journeyActivityId = journeyActivityId;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     * 
     * @return The unique identifier for the journey activity.
     */

    public String getJourneyActivityId() {
        return this.journeyActivityId;
    }

    /**
     * <p>
     * The unique identifier for the journey activity.
     * </p>
     * 
     * @param journeyActivityId
     *        The unique identifier for the journey activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyExecutionActivityMetricsRequest withJourneyActivityId(String journeyActivityId) {
        setJourneyActivityId(journeyActivityId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @param journeyId
     *        The unique identifier for the journey.
     */

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @return The unique identifier for the journey.
     */

    public String getJourneyId() {
        return this.journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey.
     * </p>
     * 
     * @param journeyId
     *        The unique identifier for the journey.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyExecutionActivityMetricsRequest withJourneyId(String journeyId) {
        setJourneyId(journeyId);
        return this;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies which page of results to return in a paginated response. This parameter is
     *        currently not supported for application, campaign, and journey metrics.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @return The string that specifies which page of results to return in a paginated response. This parameter is
     *         currently not supported for application, campaign, and journey metrics.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that specifies which page of results to return in a paginated response. This parameter is currently
     * not supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param nextToken
     *        The string that specifies which page of results to return in a paginated response. This parameter is
     *        currently not supported for application, campaign, and journey metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyExecutionActivityMetricsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported for application, campaign, and journey metrics.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response. This parameter is currently
     *         not supported for application, campaign, and journey metrics.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported for application, campaign, and journey metrics.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported for application, campaign, and journey metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetJourneyExecutionActivityMetricsRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getJourneyActivityId() != null)
            sb.append("JourneyActivityId: ").append(getJourneyActivityId()).append(",");
        if (getJourneyId() != null)
            sb.append("JourneyId: ").append(getJourneyId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJourneyExecutionActivityMetricsRequest == false)
            return false;
        GetJourneyExecutionActivityMetricsRequest other = (GetJourneyExecutionActivityMetricsRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getJourneyActivityId() == null ^ this.getJourneyActivityId() == null)
            return false;
        if (other.getJourneyActivityId() != null && other.getJourneyActivityId().equals(this.getJourneyActivityId()) == false)
            return false;
        if (other.getJourneyId() == null ^ this.getJourneyId() == null)
            return false;
        if (other.getJourneyId() != null && other.getJourneyId().equals(this.getJourneyId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getJourneyActivityId() == null) ? 0 : getJourneyActivityId().hashCode());
        hashCode = prime * hashCode + ((getJourneyId() == null) ? 0 : getJourneyId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public GetJourneyExecutionActivityMetricsRequest clone() {
        return (GetJourneyExecutionActivityMetricsRequest) super.clone();
    }

}
