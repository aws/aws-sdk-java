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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListReadSetUploadParts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReadSetUploadPartsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Sequence Store ID used for the multipart uploads.
     * </p>
     */
    private String sequenceStoreId;
    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     */
    private String uploadId;
    /**
     * <p>
     * The source file for the upload part.
     * </p>
     */
    private String partSource;
    /**
     * <p>
     * The maximum number of read set upload parts returned in a page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Attributes used to filter for a specific subset of read set part uploads.
     * </p>
     */
    private ReadSetUploadPartListFilter filter;

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

    public ListReadSetUploadPartsRequest withSequenceStoreId(String sequenceStoreId) {
        setSequenceStoreId(sequenceStoreId);
        return this;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @return The ID for the initiated multipart upload.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The ID for the initiated multipart upload.
     * </p>
     * 
     * @param uploadId
     *        The ID for the initiated multipart upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsRequest withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The source file for the upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for the upload part.
     * @see ReadSetPartSource
     */

    public void setPartSource(String partSource) {
        this.partSource = partSource;
    }

    /**
     * <p>
     * The source file for the upload part.
     * </p>
     * 
     * @return The source file for the upload part.
     * @see ReadSetPartSource
     */

    public String getPartSource() {
        return this.partSource;
    }

    /**
     * <p>
     * The source file for the upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for the upload part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public ListReadSetUploadPartsRequest withPartSource(String partSource) {
        setPartSource(partSource);
        return this;
    }

    /**
     * <p>
     * The source file for the upload part.
     * </p>
     * 
     * @param partSource
     *        The source file for the upload part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReadSetPartSource
     */

    public ListReadSetUploadPartsRequest withPartSource(ReadSetPartSource partSource) {
        this.partSource = partSource.toString();
        return this;
    }

    /**
     * <p>
     * The maximum number of read set upload parts returned in a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of read set upload parts returned in a page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of read set upload parts returned in a page.
     * </p>
     * 
     * @return The maximum number of read set upload parts returned in a page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of read set upload parts returned in a page.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of read set upload parts returned in a page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next
     *        page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @return Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the
     *         next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next page
     * of results.
     * </p>
     * 
     * @param nextToken
     *        Next token returned in the response of a previous ListReadSetUploadPartsRequest call. Used to get the next
     *        page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Attributes used to filter for a specific subset of read set part uploads.
     * </p>
     * 
     * @param filter
     *        Attributes used to filter for a specific subset of read set part uploads.
     */

    public void setFilter(ReadSetUploadPartListFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Attributes used to filter for a specific subset of read set part uploads.
     * </p>
     * 
     * @return Attributes used to filter for a specific subset of read set part uploads.
     */

    public ReadSetUploadPartListFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Attributes used to filter for a specific subset of read set part uploads.
     * </p>
     * 
     * @param filter
     *        Attributes used to filter for a specific subset of read set part uploads.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReadSetUploadPartsRequest withFilter(ReadSetUploadPartListFilter filter) {
        setFilter(filter);
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
        if (getUploadId() != null)
            sb.append("UploadId: ").append(getUploadId()).append(",");
        if (getPartSource() != null)
            sb.append("PartSource: ").append(getPartSource()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReadSetUploadPartsRequest == false)
            return false;
        ListReadSetUploadPartsRequest other = (ListReadSetUploadPartsRequest) obj;
        if (other.getSequenceStoreId() == null ^ this.getSequenceStoreId() == null)
            return false;
        if (other.getSequenceStoreId() != null && other.getSequenceStoreId().equals(this.getSequenceStoreId()) == false)
            return false;
        if (other.getUploadId() == null ^ this.getUploadId() == null)
            return false;
        if (other.getUploadId() != null && other.getUploadId().equals(this.getUploadId()) == false)
            return false;
        if (other.getPartSource() == null ^ this.getPartSource() == null)
            return false;
        if (other.getPartSource() != null && other.getPartSource().equals(this.getPartSource()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSequenceStoreId() == null) ? 0 : getSequenceStoreId().hashCode());
        hashCode = prime * hashCode + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        hashCode = prime * hashCode + ((getPartSource() == null) ? 0 : getPartSource().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListReadSetUploadPartsRequest clone() {
        return (ListReadSetUploadPartsRequest) super.clone();
    }

}
