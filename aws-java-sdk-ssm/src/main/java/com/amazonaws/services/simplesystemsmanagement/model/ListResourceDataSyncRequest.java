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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/ListResourceDataSync" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceDataSyncRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to view
     * resource data syncs that synchronize data to an Amazon S3 buckets. Specify <code>SyncFromSource</code> to view
     * resource data syncs from AWS Organizations or from multiple AWS Regions.
     * </p>
     */
    private String syncType;
    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to view
     * resource data syncs that synchronize data to an Amazon S3 buckets. Specify <code>SyncFromSource</code> to view
     * resource data syncs from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @param syncType
     *        View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to
     *        view resource data syncs that synchronize data to an Amazon S3 buckets. Specify
     *        <code>SyncFromSource</code> to view resource data syncs from AWS Organizations or from multiple AWS
     *        Regions.
     */

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to view
     * resource data syncs that synchronize data to an Amazon S3 buckets. Specify <code>SyncFromSource</code> to view
     * resource data syncs from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @return View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to
     *         view resource data syncs that synchronize data to an Amazon S3 buckets. Specify
     *         <code>SyncFromSource</code> to view resource data syncs from AWS Organizations or from multiple AWS
     *         Regions.
     */

    public String getSyncType() {
        return this.syncType;
    }

    /**
     * <p>
     * View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to view
     * resource data syncs that synchronize data to an Amazon S3 buckets. Specify <code>SyncFromSource</code> to view
     * resource data syncs from AWS Organizations or from multiple AWS Regions.
     * </p>
     * 
     * @param syncType
     *        View a list of resource data syncs according to the sync type. Specify <code>SyncToDestination</code> to
     *        view resource data syncs that synchronize data to an Amazon S3 buckets. Specify
     *        <code>SyncFromSource</code> to view resource data syncs from AWS Organizations or from multiple AWS
     *        Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncRequest withSyncType(String syncType) {
        setSyncType(syncType);
        return this;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @return A token to start the list. Use this token to get the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token to start the list. Use this token to get the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token to start the list. Use this token to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceDataSyncRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getSyncType() != null)
            sb.append("SyncType: ").append(getSyncType()).append(",");
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

        if (obj instanceof ListResourceDataSyncRequest == false)
            return false;
        ListResourceDataSyncRequest other = (ListResourceDataSyncRequest) obj;
        if (other.getSyncType() == null ^ this.getSyncType() == null)
            return false;
        if (other.getSyncType() != null && other.getSyncType().equals(this.getSyncType()) == false)
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

        hashCode = prime * hashCode + ((getSyncType() == null) ? 0 : getSyncType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceDataSyncRequest clone() {
        return (ListResourceDataSyncRequest) super.clone();
    }

}
