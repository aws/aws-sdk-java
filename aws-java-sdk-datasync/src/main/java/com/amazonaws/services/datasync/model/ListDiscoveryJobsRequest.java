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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ListDiscoveryJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListDiscoveryJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only want to
     * list the discovery jobs that are associated with a specific storage system.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * Specifies how many results you want in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only want to
     * list the discovery jobs that are associated with a specific storage system.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only
     *        want to list the discovery jobs that are associated with a specific storage system.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only want to
     * list the discovery jobs that are associated with a specific storage system.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only
     *         want to list the discovery jobs that are associated with a specific storage system.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only want to
     * list the discovery jobs that are associated with a specific storage system.
     * </p>
     * 
     * @param storageSystemArn
     *        Specifies the Amazon Resource Name (ARN) of an on-premises storage system. Use this parameter if you only
     *        want to list the discovery jobs that are associated with a specific storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsRequest withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * Specifies how many results you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many results you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies how many results you want in the response.
     * </p>
     * 
     * @return Specifies how many results you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies how many results you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Specifies how many results you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListDiscoveryJobsRequest withNextToken(String nextToken) {
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
        if (getStorageSystemArn() != null)
            sb.append("StorageSystemArn: ").append(getStorageSystemArn()).append(",");
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

        if (obj instanceof ListDiscoveryJobsRequest == false)
            return false;
        ListDiscoveryJobsRequest other = (ListDiscoveryJobsRequest) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
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

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDiscoveryJobsRequest clone() {
        return (ListDiscoveryJobsRequest) super.clone();
    }

}
