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
package com.amazonaws.services.backupstorage.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backupstorage-2018-04-10/ListObjects" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListObjectsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** Storage job id */
    private String storageJobId;
    /** Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL */
    private String startingObjectName;
    /** Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL */
    private String startingObjectPrefix;
    /** Maximum objects count */
    private Integer maxResults;
    /** Pagination token */
    private String nextToken;
    /** (Optional) Created before filter */
    private java.util.Date createdBefore;
    /** (Optional) Created after filter */
    private java.util.Date createdAfter;

    /**
     * Storage job id
     * 
     * @param storageJobId
     *        Storage job id
     */

    public void setStorageJobId(String storageJobId) {
        this.storageJobId = storageJobId;
    }

    /**
     * Storage job id
     * 
     * @return Storage job id
     */

    public String getStorageJobId() {
        return this.storageJobId;
    }

    /**
     * Storage job id
     * 
     * @param storageJobId
     *        Storage job id
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withStorageJobId(String storageJobId) {
        setStorageJobId(storageJobId);
        return this;
    }

    /**
     * Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     * 
     * @param startingObjectName
     *        Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     */

    public void setStartingObjectName(String startingObjectName) {
        this.startingObjectName = startingObjectName;
    }

    /**
     * Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     * 
     * @return Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     */

    public String getStartingObjectName() {
        return this.startingObjectName;
    }

    /**
     * Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     * 
     * @param startingObjectName
     *        Optional, specifies the starting Object name to list from. Ignored if NextToken is not NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withStartingObjectName(String startingObjectName) {
        setStartingObjectName(startingObjectName);
        return this;
    }

    /**
     * Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     * 
     * @param startingObjectPrefix
     *        Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     */

    public void setStartingObjectPrefix(String startingObjectPrefix) {
        this.startingObjectPrefix = startingObjectPrefix;
    }

    /**
     * Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     * 
     * @return Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     */

    public String getStartingObjectPrefix() {
        return this.startingObjectPrefix;
    }

    /**
     * Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     * 
     * @param startingObjectPrefix
     *        Optional, specifies the starting Object prefix to list from. Ignored if NextToken is not NULL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withStartingObjectPrefix(String startingObjectPrefix) {
        setStartingObjectPrefix(startingObjectPrefix);
        return this;
    }

    /**
     * Maximum objects count
     * 
     * @param maxResults
     *        Maximum objects count
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * Maximum objects count
     * 
     * @return Maximum objects count
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Maximum objects count
     * 
     * @param maxResults
     *        Maximum objects count
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * Pagination token
     * 
     * @return Pagination token
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * Pagination token
     * 
     * @param nextToken
     *        Pagination token
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * (Optional) Created before filter
     * 
     * @param createdBefore
     *        (Optional) Created before filter
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * (Optional) Created before filter
     * 
     * @return (Optional) Created before filter
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * (Optional) Created before filter
     * 
     * @param createdBefore
     *        (Optional) Created before filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * (Optional) Created after filter
     * 
     * @param createdAfter
     *        (Optional) Created after filter
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * (Optional) Created after filter
     * 
     * @return (Optional) Created after filter
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * (Optional) Created after filter
     * 
     * @param createdAfter
     *        (Optional) Created after filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListObjectsRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
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
        if (getStorageJobId() != null)
            sb.append("StorageJobId: ").append(getStorageJobId()).append(",");
        if (getStartingObjectName() != null)
            sb.append("StartingObjectName: ").append(getStartingObjectName()).append(",");
        if (getStartingObjectPrefix() != null)
            sb.append("StartingObjectPrefix: ").append(getStartingObjectPrefix()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListObjectsRequest == false)
            return false;
        ListObjectsRequest other = (ListObjectsRequest) obj;
        if (other.getStorageJobId() == null ^ this.getStorageJobId() == null)
            return false;
        if (other.getStorageJobId() != null && other.getStorageJobId().equals(this.getStorageJobId()) == false)
            return false;
        if (other.getStartingObjectName() == null ^ this.getStartingObjectName() == null)
            return false;
        if (other.getStartingObjectName() != null && other.getStartingObjectName().equals(this.getStartingObjectName()) == false)
            return false;
        if (other.getStartingObjectPrefix() == null ^ this.getStartingObjectPrefix() == null)
            return false;
        if (other.getStartingObjectPrefix() != null && other.getStartingObjectPrefix().equals(this.getStartingObjectPrefix()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageJobId() == null) ? 0 : getStorageJobId().hashCode());
        hashCode = prime * hashCode + ((getStartingObjectName() == null) ? 0 : getStartingObjectName().hashCode());
        hashCode = prime * hashCode + ((getStartingObjectPrefix() == null) ? 0 : getStartingObjectPrefix().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        return hashCode;
    }

    @Override
    public ListObjectsRequest clone() {
        return (ListObjectsRequest) super.clone();
    }

}
