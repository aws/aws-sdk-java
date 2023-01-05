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
import com.amazonaws.services.ec2.model.transform.ListImagesInRecycleBinRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesInRecycleBinRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ListImagesInRecycleBinRequest> {

    /**
     * <p>
     * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can
     * specify up to 20 IDs in a single request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> imageIds;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"> Pagination</a>.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can
     * specify up to 20 IDs in a single request.
     * </p>
     * 
     * @return The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You
     *         can specify up to 20 IDs in a single request.
     */

    public java.util.List<String> getImageIds() {
        if (imageIds == null) {
            imageIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return imageIds;
    }

    /**
     * <p>
     * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can
     * specify up to 20 IDs in a single request.
     * </p>
     * 
     * @param imageIds
     *        The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You
     *        can specify up to 20 IDs in a single request.
     */

    public void setImageIds(java.util.Collection<String> imageIds) {
        if (imageIds == null) {
            this.imageIds = null;
            return;
        }

        this.imageIds = new com.amazonaws.internal.SdkInternalList<String>(imageIds);
    }

    /**
     * <p>
     * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can
     * specify up to 20 IDs in a single request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageIds(java.util.Collection)} or {@link #withImageIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param imageIds
     *        The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You
     *        can specify up to 20 IDs in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesInRecycleBinRequest withImageIds(String... imageIds) {
        if (this.imageIds == null) {
            setImageIds(new com.amazonaws.internal.SdkInternalList<String>(imageIds.length));
        }
        for (String ele : imageIds) {
            this.imageIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You can
     * specify up to 20 IDs in a single request.
     * </p>
     * 
     * @param imageIds
     *        The IDs of the AMIs to list. Omit this parameter to list all of the AMIs that are in the Recycle Bin. You
     *        can specify up to 20 IDs in a single request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesInRecycleBinRequest withImageIds(java.util.Collection<String> imageIds) {
        setImageIds(imageIds);
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

    public ListImagesInRecycleBinRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"> Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">
     *        Pagination</a>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"> Pagination</a>.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.</p>
     *         <p>
     *         If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">
     *         Pagination</a>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * <p>
     * If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination"> Pagination</a>.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.</p>
     *        <p>
     *        If you do not specify a value for <i>MaxResults</i>, the request returns 1,000 items per page by default.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Query-Requests.html#api-pagination">
     *        Pagination</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesInRecycleBinRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ListImagesInRecycleBinRequest> getDryRunRequest() {
        Request<ListImagesInRecycleBinRequest> request = new ListImagesInRecycleBinRequestMarshaller().marshall(this);
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
        if (getImageIds() != null)
            sb.append("ImageIds: ").append(getImageIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListImagesInRecycleBinRequest == false)
            return false;
        ListImagesInRecycleBinRequest other = (ListImagesInRecycleBinRequest) obj;
        if (other.getImageIds() == null ^ this.getImageIds() == null)
            return false;
        if (other.getImageIds() != null && other.getImageIds().equals(this.getImageIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getImageIds() == null) ? 0 : getImageIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListImagesInRecycleBinRequest clone() {
        return (ListImagesInRecycleBinRequest) super.clone();
    }
}
