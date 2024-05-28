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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListMultipartReadSetUploads" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListMultipartReadSetUploadsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Sequence Store ID used for the multipart uploads.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The maximum number of multipart uploads returned in a page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of
     * results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Sequence Store ID used for the multipart uploads.
     * </p>
     * 
     * @param sequenceStoreId
     *        The Sequence Store ID used for the multipart uploads.
     */

    public void setSequenceStoreId(String sequenceStoreId) {
        this.sequenceStoreId = sequenceStoreId;
    }

    /**
     * <p>
     * The Sequence Store ID used for the multipart uploads.
     * </p>
     * 
     * @return The Sequence Store ID used for the multipart uploads.
     */

    public String getSequenceStoreId() {
        return this.sequenceStoreId;
    }

    /**
     * <p>
     * The Sequence Store ID used for the multipart uploads.
     * </p>
     * 
     * @param sequenceStoreId
     *        The Sequence Store ID used for the multipart uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartReadSetUploadsRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The maximum number of multipart uploads returned in a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of multipart uploads returned in a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of multipart uploads returned in a page.
     * </p>
     * 
     * @return The maximum number of multipart uploads returned in a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of multipart uploads returned in a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of multipart uploads returned in a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartReadSetUploadsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of
     * results.
     * </p>
     * 
     * @return Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next
     *         page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next page of
     * results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListMultipartReadSetUploads call. Used to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListMultipartReadSetUploadsRequest withNextToken(String nextToken) {
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
        if (getSequenceStoreId() != null)
            sb.append("SequenceStoreId: ").append(getSequenceStoreId()).append(",");
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

        if (obj instanceof ListMultipartReadSetUploadsRequest == false)
            return false;
        ListMultipartReadSetUploadsRequest other = (ListMultipartReadSetUploadsRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
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

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListMultipartReadSetUploadsRequest clone() {
        return (ListMultipartReadSetUploadsRequest) super.clone();
    }

}
