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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTextDetectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Job identifier for the label detection operation for which you want results returned. You get the job identifer
     * from an initial call to <code>StartTextDetection</code>.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Job identifier for the label detection operation for which you want results returned. You get the job identifer
     * from an initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the label detection operation for which you want results returned. You get the job
     *        identifer from an initial call to <code>StartTextDetection</code>.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want results returned. You get the job identifer
     * from an initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @return Job identifier for the label detection operation for which you want results returned. You get the job
     *         identifer from an initial call to <code>StartTextDetection</code>.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * Job identifier for the label detection operation for which you want results returned. You get the job identifer
     * from an initial call to <code>StartTextDetection</code>.
     * </p>
     * 
     * @param jobId
     *        Job identifier for the label detection operation for which you want results returned. You get the job
     *        identifer from an initial call to <code>StartTextDetection</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     * </p>
     * 
     * @return Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to return per paginated call. The largest value you can specify is 1000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of text.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @return If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *         Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *         set of text.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition Video
     * returns a pagination token in the response. You can use this pagination token to retrieve the next set of text.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was incomplete (because there are more labels to retrieve), Amazon Rekognition
     *        Video returns a pagination token in the response. You can use this pagination token to retrieve the next
     *        set of text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTextDetectionRequest withNextToken(String nextToken) {
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
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

        if (obj instanceof GetTextDetectionRequest == false)
            return false;
        GetTextDetectionRequest other = (GetTextDetectionRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTextDetectionRequest clone() {
        return (GetTextDetectionRequest) super.clone();
    }

}
