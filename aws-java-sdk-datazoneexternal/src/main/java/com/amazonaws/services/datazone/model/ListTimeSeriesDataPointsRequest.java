/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/ListTimeSeriesDataPoints" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTimeSeriesDataPointsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data points.
     * </p>
     */
    private String domainIdentifier;
    /**
     * <p>
     * The timestamp at which the data points that you wanted to list ended.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The ID of the asset for which you want to list data points.
     * </p>
     */
    private String entityIdentifier;
    /**
     * <p>
     * The type of the asset for which you want to list data points.
     * </p>
     */
    private String entityType;
    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     */
    private String formName;
    /**
     * <p>
     * The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number of data
     * points to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can
     * use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When the number of data points is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of data points, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The timestamp at which the data points that you want to list started.
     * </p>
     */
    private java.util.Date startedAt;

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data points.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data
     *        points.
     */

    public void setDomainIdentifier(String domainIdentifier) {
        this.domainIdentifier = domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data points.
     * </p>
     * 
     * @return The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data
     *         points.
     */

    public String getDomainIdentifier() {
        return this.domainIdentifier;
    }

    /**
     * <p>
     * The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data points.
     * </p>
     * 
     * @param domainIdentifier
     *        The ID of the Amazon DataZone domain that houses the assets for which you want to list time series data
     *        points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withDomainIdentifier(String domainIdentifier) {
        setDomainIdentifier(domainIdentifier);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the data points that you wanted to list ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp at which the data points that you wanted to list ended.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The timestamp at which the data points that you wanted to list ended.
     * </p>
     * 
     * @return The timestamp at which the data points that you wanted to list ended.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The timestamp at which the data points that you wanted to list ended.
     * </p>
     * 
     * @param endedAt
     *        The timestamp at which the data points that you wanted to list ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The ID of the asset for which you want to list data points.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the asset for which you want to list data points.
     */

    public void setEntityIdentifier(String entityIdentifier) {
        this.entityIdentifier = entityIdentifier;
    }

    /**
     * <p>
     * The ID of the asset for which you want to list data points.
     * </p>
     * 
     * @return The ID of the asset for which you want to list data points.
     */

    public String getEntityIdentifier() {
        return this.entityIdentifier;
    }

    /**
     * <p>
     * The ID of the asset for which you want to list data points.
     * </p>
     * 
     * @param entityIdentifier
     *        The ID of the asset for which you want to list data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withEntityIdentifier(String entityIdentifier) {
        setEntityIdentifier(entityIdentifier);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to list data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to list data points.
     * @see TimeSeriesEntityType
     */

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to list data points.
     * </p>
     * 
     * @return The type of the asset for which you want to list data points.
     * @see TimeSeriesEntityType
     */

    public String getEntityType() {
        return this.entityType;
    }

    /**
     * <p>
     * The type of the asset for which you want to list data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to list data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public ListTimeSeriesDataPointsRequest withEntityType(String entityType) {
        setEntityType(entityType);
        return this;
    }

    /**
     * <p>
     * The type of the asset for which you want to list data points.
     * </p>
     * 
     * @param entityType
     *        The type of the asset for which you want to list data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesEntityType
     */

    public ListTimeSeriesDataPointsRequest withEntityType(TimeSeriesEntityType entityType) {
        this.entityType = entityType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @param formName
     *        The name of the time series data points form.
     */

    public void setFormName(String formName) {
        this.formName = formName;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @return The name of the time series data points form.
     */

    public String getFormName() {
        return this.formName;
    }

    /**
     * <p>
     * The name of the time series data points form.
     * </p>
     * 
     * @param formName
     *        The name of the time series data points form.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withFormName(String formName) {
        setFormName(formName);
        return this;
    }

    /**
     * <p>
     * The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number of data
     * points to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can
     * use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number
     *        of data points to be listed is greater than the value of MaxResults, the response contains a NextToken
     *        value that you can use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data
     *        points.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number of data
     * points to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can
     * use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @return The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number
     *         of data points to be listed is greater than the value of MaxResults, the response contains a NextToken
     *         value that you can use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data
     *         points.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number of data
     * points to be listed is greater than the value of MaxResults, the response contains a NextToken value that you can
     * use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of data points to return in a single call to ListTimeSeriesDataPoints. When the number
     *        of data points to be listed is greater than the value of MaxResults, the response contains a NextToken
     *        value that you can use in a subsequent call to ListTimeSeriesDataPoints to list the next set of data
     *        points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When the number of data points is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of data points, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @param nextToken
     *        When the number of data points is greater than the default value for the MaxResults parameter, or if you
     *        explicitly specify a value for MaxResults that is less than the number of data points, the response
     *        includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *        ListTimeSeriesDataPoints to list the next set of data points.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When the number of data points is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of data points, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @return When the number of data points is greater than the default value for the MaxResults parameter, or if you
     *         explicitly specify a value for MaxResults that is less than the number of data points, the response
     *         includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *         ListTimeSeriesDataPoints to list the next set of data points.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When the number of data points is greater than the default value for the MaxResults parameter, or if you
     * explicitly specify a value for MaxResults that is less than the number of data points, the response includes a
     * pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     * ListTimeSeriesDataPoints to list the next set of data points.
     * </p>
     * 
     * @param nextToken
     *        When the number of data points is greater than the default value for the MaxResults parameter, or if you
     *        explicitly specify a value for MaxResults that is less than the number of data points, the response
     *        includes a pagination token named NextToken. You can specify this NextToken value in a subsequent call to
     *        ListTimeSeriesDataPoints to list the next set of data points.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the data points that you want to list started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp at which the data points that you want to list started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The timestamp at which the data points that you want to list started.
     * </p>
     * 
     * @return The timestamp at which the data points that you want to list started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The timestamp at which the data points that you want to list started.
     * </p>
     * 
     * @param startedAt
     *        The timestamp at which the data points that you want to list started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTimeSeriesDataPointsRequest withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
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
        if (getDomainIdentifier() != null)
            sb.append("DomainIdentifier: ").append(getDomainIdentifier()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getEntityIdentifier() != null)
            sb.append("EntityIdentifier: ").append(getEntityIdentifier()).append(",");
        if (getEntityType() != null)
            sb.append("EntityType: ").append(getEntityType()).append(",");
        if (getFormName() != null)
            sb.append("FormName: ").append(getFormName()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTimeSeriesDataPointsRequest == false)
            return false;
        ListTimeSeriesDataPointsRequest other = (ListTimeSeriesDataPointsRequest) obj;
        if (other.getDomainIdentifier() == null ^ this.getDomainIdentifier() == null)
            return false;
        if (other.getDomainIdentifier() != null && other.getDomainIdentifier().equals(this.getDomainIdentifier()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getEntityIdentifier() == null ^ this.getEntityIdentifier() == null)
            return false;
        if (other.getEntityIdentifier() != null && other.getEntityIdentifier().equals(this.getEntityIdentifier()) == false)
            return false;
        if (other.getEntityType() == null ^ this.getEntityType() == null)
            return false;
        if (other.getEntityType() != null && other.getEntityType().equals(this.getEntityType()) == false)
            return false;
        if (other.getFormName() == null ^ this.getFormName() == null)
            return false;
        if (other.getFormName() != null && other.getFormName().equals(this.getFormName()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainIdentifier() == null) ? 0 : getDomainIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getEntityIdentifier() == null) ? 0 : getEntityIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEntityType() == null) ? 0 : getEntityType().hashCode());
        hashCode = prime * hashCode + ((getFormName() == null) ? 0 : getFormName().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        return hashCode;
    }

    @Override
    public ListTimeSeriesDataPointsRequest clone() {
        return (ListTimeSeriesDataPointsRequest) super.clone();
    }

}
