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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/ListAccessGrantsLocations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccessGrantsLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     */
    private String locationScope;

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that is making this request.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that is making this request.
     * </p>
     * 
     * @param accountId
     *        The ID of the Amazon Web Services account that is making this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @return A pagination token to request the next page of results. Pass this value into a subsequent
     *         <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token to request the next page of results. Pass this value into a subsequent
     * <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        A pagination token to request the next page of results. Pass this value into a subsequent
     *        <code>List Access Grants Locations</code> request in order to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *        response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *        <code>NextToken</code> to determine if there are more results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @return The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *         response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *         <code>NextToken</code> to determine if there are more results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of access grants that you would like returned in the <code>List Access Grants</code> response.
     * If the results include the pagination token <code>NextToken</code>, make another call using the
     * <code>NextToken</code> to determine if there are more results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of access grants that you would like returned in the <code>List Access Grants</code>
     *        response. If the results include the pagination token <code>NextToken</code>, make another call using the
     *        <code>NextToken</code> to determine if there are more results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @param locationScope
     *        The S3 path to the location that you are registering. The location scope can be the default S3 location
     *        <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *        and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *        the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *        example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *        start with the <code>marketing/campaigns/</code> prefix.
     */

    public void setLocationScope(String locationScope) {
        this.locationScope = locationScope;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @return The S3 path to the location that you are registering. The location scope can be the default S3 location
     *         <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *         and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *         the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *         example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *         start with the <code>marketing/campaigns/</code> prefix.
     */

    public String getLocationScope() {
        return this.locationScope;
    }

    /**
     * <p>
     * The S3 path to the location that you are registering. The location scope can be the default S3 location
     * <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket and
     * prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at the beginning
     * of an object key name used to organize the objects that you store in your S3 buckets. For example, object key
     * names that start with the <code>engineering/</code> prefix or object key names that start with the
     * <code>marketing/campaigns/</code> prefix.
     * </p>
     * 
     * @param locationScope
     *        The S3 path to the location that you are registering. The location scope can be the default S3 location
     *        <code>s3://</code>, the S3 path to a bucket <code>s3://&lt;bucket&gt;</code>, or the S3 path to a bucket
     *        and prefix <code>s3://&lt;bucket&gt;/&lt;prefix&gt;</code>. A prefix in S3 is a string of characters at
     *        the beginning of an object key name used to organize the objects that you store in your S3 buckets. For
     *        example, object key names that start with the <code>engineering/</code> prefix or object key names that
     *        start with the <code>marketing/campaigns/</code> prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccessGrantsLocationsRequest withLocationScope(String locationScope) {
        setLocationScope(locationScope);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getLocationScope() != null)
            sb.append("LocationScope: ").append(getLocationScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccessGrantsLocationsRequest == false)
            return false;
        ListAccessGrantsLocationsRequest other = (ListAccessGrantsLocationsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getLocationScope() == null ^ this.getLocationScope() == null)
            return false;
        if (other.getLocationScope() != null && other.getLocationScope().equals(this.getLocationScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getLocationScope() == null) ? 0 : getLocationScope().hashCode());
        return hashCode;
    }

    @Override
    public ListAccessGrantsLocationsRequest clone() {
        return (ListAccessGrantsLocationsRequest) super.clone();
    }

}
