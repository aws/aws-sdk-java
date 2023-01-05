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
package com.amazonaws.services.cloudwatchevidently.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/evidently-2021-02-01/ListSegmentReferences" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListSegmentReferencesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListSegmentReferences</code> operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The ARN of the segment that you want to view information for.
     * </p>
     */
    private String segment;
    /**
     * <p>
     * Specifies whether to return information about launches or experiments that use this segment.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     * </p>
     * 
     * @return The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to include in the response. If you omit this, the default of 50 is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListSegmentReferences</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListSegmentReferences</code> operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListSegmentReferences</code> operation.
     * </p>
     * 
     * @return The token to use when requesting the next set of results. You received this token from a previous
     *         <code>ListSegmentReferences</code> operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of results. You received this token from a previous
     * <code>ListSegmentReferences</code> operation.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of results. You received this token from a previous
     *        <code>ListSegmentReferences</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The ARN of the segment that you want to view information for.
     * </p>
     * 
     * @param segment
     *        The ARN of the segment that you want to view information for.
     */

    public void setSegment(String segment) {
        this.segment = segment;
    }

    /**
     * <p>
     * The ARN of the segment that you want to view information for.
     * </p>
     * 
     * @return The ARN of the segment that you want to view information for.
     */

    public String getSegment() {
        return this.segment;
    }

    /**
     * <p>
     * The ARN of the segment that you want to view information for.
     * </p>
     * 
     * @param segment
     *        The ARN of the segment that you want to view information for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListSegmentReferencesRequest withSegment(String segment) {
        setSegment(segment);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return information about launches or experiments that use this segment.
     * </p>
     * 
     * @param type
     *        Specifies whether to return information about launches or experiments that use this segment.
     * @see SegmentReferenceResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Specifies whether to return information about launches or experiments that use this segment.
     * </p>
     * 
     * @return Specifies whether to return information about launches or experiments that use this segment.
     * @see SegmentReferenceResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Specifies whether to return information about launches or experiments that use this segment.
     * </p>
     * 
     * @param type
     *        Specifies whether to return information about launches or experiments that use this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentReferenceResourceType
     */

    public ListSegmentReferencesRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Specifies whether to return information about launches or experiments that use this segment.
     * </p>
     * 
     * @param type
     *        Specifies whether to return information about launches or experiments that use this segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SegmentReferenceResourceType
     */

    public ListSegmentReferencesRequest withType(SegmentReferenceResourceType type) {
        this.type = type.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSegment() != null)
            sb.append("Segment: ").append(getSegment()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSegmentReferencesRequest == false)
            return false;
        ListSegmentReferencesRequest other = (ListSegmentReferencesRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSegment() == null ^ this.getSegment() == null)
            return false;
        if (other.getSegment() != null && other.getSegment().equals(this.getSegment()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSegment() == null) ? 0 : getSegment().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public ListSegmentReferencesRequest clone() {
        return (ListSegmentReferencesRequest) super.clone();
    }

}
