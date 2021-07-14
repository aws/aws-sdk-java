/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetBuckets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBucketsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bucket for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     */
    private String pageToken;
    /**
     * <p>
     * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using
     * the <a>SetResourceAccessForBucket</a> action.
     * </p>
     */
    private Boolean includeConnectedResources;

    /**
     * <p>
     * The name of the bucket for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     * </p>
     * 
     * @return The name of the bucket for which to return information.</p>
     *         <p>
     *         When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * The name of the bucket for which to return information.
     * </p>
     * <p>
     * When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     * </p>
     * 
     * @param bucketName
     *        The name of the bucket for which to return information.</p>
     *        <p>
     *        When omitted, the response includes all of your buckets in the AWS Region where the request is made.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsRequest withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated,
     *        the response will return a next page token that you can specify as the page token in a subsequent request.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @return The token to advance to the next page of results from your request.</p>
     *         <p>
     *         To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated,
     *         the response will return a next page token that you can specify as the page token in a subsequent
     *         request.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The token to advance to the next page of results from your request.
     * </p>
     * <p>
     * To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated, the
     * response will return a next page token that you can specify as the page token in a subsequent request.
     * </p>
     * 
     * @param pageToken
     *        The token to advance to the next page of results from your request.</p>
     *        <p>
     *        To get a page token, perform an initial <code>GetBuckets</code> request. If your results are paginated,
     *        the response will return a next page token that you can specify as the page token in a subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using
     * the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * 
     * @param includeConnectedResources
     *        A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket
     *        using the <a>SetResourceAccessForBucket</a> action.
     */

    public void setIncludeConnectedResources(Boolean includeConnectedResources) {
        this.includeConnectedResources = includeConnectedResources;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using
     * the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include Lightsail instances that were given access to the
     *         bucket using the <a>SetResourceAccessForBucket</a> action.
     */

    public Boolean getIncludeConnectedResources() {
        return this.includeConnectedResources;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using
     * the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * 
     * @param includeConnectedResources
     *        A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket
     *        using the <a>SetResourceAccessForBucket</a> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBucketsRequest withIncludeConnectedResources(Boolean includeConnectedResources) {
        setIncludeConnectedResources(includeConnectedResources);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to include Lightsail instances that were given access to the bucket using
     * the <a>SetResourceAccessForBucket</a> action.
     * </p>
     * 
     * @return A Boolean value that indicates whether to include Lightsail instances that were given access to the
     *         bucket using the <a>SetResourceAccessForBucket</a> action.
     */

    public Boolean isIncludeConnectedResources() {
        return this.includeConnectedResources;
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken()).append(",");
        if (getIncludeConnectedResources() != null)
            sb.append("IncludeConnectedResources: ").append(getIncludeConnectedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBucketsRequest == false)
            return false;
        GetBucketsRequest other = (GetBucketsRequest) obj;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        if (other.getIncludeConnectedResources() == null ^ this.getIncludeConnectedResources() == null)
            return false;
        if (other.getIncludeConnectedResources() != null && other.getIncludeConnectedResources().equals(this.getIncludeConnectedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        hashCode = prime * hashCode + ((getIncludeConnectedResources() == null) ? 0 : getIncludeConnectedResources().hashCode());
        return hashCode;
    }

    @Override
    public GetBucketsRequest clone() {
        return (GetBucketsRequest) super.clone();
    }

}
