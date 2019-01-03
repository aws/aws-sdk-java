/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPersonTrackingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     * <code>StartPersonTracking</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify
     * a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * persons.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array elements by
     * the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you sort by
     * <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     */
    private String sortBy;

    /**
     * <p>
     * The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     * <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     *        <code>StartPersonTracking</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     * <code>StartPersonTracking</code>.
     * </p>
     * 
     * @return The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     *         <code>StartPersonTracking</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     * <code>StartPersonTracking</code>.
     * </p>
     * 
     * @param jobId
     *        The identifier for a job that tracks persons in a video. You get the <code>JobId</code> from a call to
     *        <code>StartPersonTracking</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify
     * a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you
     *        specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify
     * a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * 
     * @return Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you
     *         specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify
     * a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you
     *        specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * persons.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of persons.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * persons.
     * </p>
     * 
     * @return If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition
     *         Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *         set of persons.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of
     * persons.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of persons.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPersonTrackingRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array elements by
     * the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you sort by
     * <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array
     *        elements by the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you
     *        sort by <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The
     *        default sort is by <code>TIMESTAMP</code>.
     * @see PersonTrackingSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array elements by
     * the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you sort by
     * <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * 
     * @return Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array
     *         elements by the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you
     *         sort by <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The
     *         default sort is by <code>TIMESTAMP</code>.
     * @see PersonTrackingSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array elements by
     * the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you sort by
     * <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array
     *        elements by the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you
     *        sort by <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The
     *        default sort is by <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PersonTrackingSortBy
     */

    public GetPersonTrackingRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array elements by
     * the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you sort by
     * <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The default sort is by
     * <code>TIMESTAMP</code>.
     * </p>
     * 
     * @param sortBy
     *        Sort to use for elements in the <code>Persons</code> array. Use <code>TIMESTAMP</code> to sort array
     *        elements by the time persons are detected. Use <code>INDEX</code> to sort by the tracked persons. If you
     *        sort by <code>INDEX</code>, the array elements for each person are sorted by detection confidence. The
     *        default sort is by <code>TIMESTAMP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PersonTrackingSortBy
     */

    public GetPersonTrackingRequest withSortBy(PersonTrackingSortBy sortBy) {
        this.sortBy = sortBy.toString();
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPersonTrackingRequest == false)
            return false;
        GetPersonTrackingRequest other = (GetPersonTrackingRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public GetPersonTrackingRequest clone() {
        return (GetPersonTrackingRequest) super.clone();
    }

}
