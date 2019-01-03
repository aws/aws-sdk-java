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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A request for a list of records.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-sync-2014-06-30/ListRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityPoolId;
    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     */
    private String identityId;
    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     */
    private String datasetName;
    /** The last server sync count for this record. */
    private Long lastSyncCount;
    /** A pagination token for obtaining the next page of results. */
    private String nextToken;
    /** The maximum number of results to be returned. */
    private Integer maxResults;
    /** A token containing a session ID, identity ID, and expiration. */
    private String syncSessionToken;

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityPoolId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @return A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *         Cognito. GUID generation is unique within a region.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID
     * generation is unique within a region.
     * 
     * @param identityId
     *        A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon
     *        Cognito. GUID generation is unique within a region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @param datasetName
     *        A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *        '.' (dot).
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @return A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *         '.' (dot).
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.'
     * (dot).
     * 
     * @param datasetName
     *        A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and
     *        '.' (dot).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * The last server sync count for this record.
     * 
     * @param lastSyncCount
     *        The last server sync count for this record.
     */

    public void setLastSyncCount(Long lastSyncCount) {
        this.lastSyncCount = lastSyncCount;
    }

    /**
     * The last server sync count for this record.
     * 
     * @return The last server sync count for this record.
     */

    public Long getLastSyncCount() {
        return this.lastSyncCount;
    }

    /**
     * The last server sync count for this record.
     * 
     * @param lastSyncCount
     *        The last server sync count for this record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withLastSyncCount(Long lastSyncCount) {
        setLastSyncCount(lastSyncCount);
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @return A pagination token for obtaining the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * A pagination token for obtaining the next page of results.
     * 
     * @param nextToken
     *        A pagination token for obtaining the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @return The maximum number of results to be returned.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of results to be returned.
     * 
     * @param maxResults
     *        The maximum number of results to be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @param syncSessionToken
     *        A token containing a session ID, identity ID, and expiration.
     */

    public void setSyncSessionToken(String syncSessionToken) {
        this.syncSessionToken = syncSessionToken;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @return A token containing a session ID, identity ID, and expiration.
     */

    public String getSyncSessionToken() {
        return this.syncSessionToken;
    }

    /**
     * A token containing a session ID, identity ID, and expiration.
     * 
     * @param syncSessionToken
     *        A token containing a session ID, identity ID, and expiration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecordsRequest withSyncSessionToken(String syncSessionToken) {
        setSyncSessionToken(syncSessionToken);
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
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getLastSyncCount() != null)
            sb.append("LastSyncCount: ").append(getLastSyncCount()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSyncSessionToken() != null)
            sb.append("SyncSessionToken: ").append(getSyncSessionToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecordsRequest == false)
            return false;
        ListRecordsRequest other = (ListRecordsRequest) obj;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getLastSyncCount() == null ^ this.getLastSyncCount() == null)
            return false;
        if (other.getLastSyncCount() != null && other.getLastSyncCount().equals(this.getLastSyncCount()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSyncSessionToken() == null ^ this.getSyncSessionToken() == null)
            return false;
        if (other.getSyncSessionToken() != null && other.getSyncSessionToken().equals(this.getSyncSessionToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getLastSyncCount() == null) ? 0 : getLastSyncCount().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSyncSessionToken() == null) ? 0 : getSyncSessionToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecordsRequest clone() {
        return (ListRecordsRequest) super.clone();
    }

}
