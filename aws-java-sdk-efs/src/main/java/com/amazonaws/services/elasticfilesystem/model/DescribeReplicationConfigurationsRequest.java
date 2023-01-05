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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/DescribeReplicationConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationConfigurationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * You can retrieve the replication configuration for a specific file system by providing its file system ID.
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of output.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * (Optional) To limit the number of objects returned in a response, you can specify the <code>MaxItems</code>
     * parameter. The default value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * You can retrieve the replication configuration for a specific file system by providing its file system ID.
     * </p>
     * 
     * @param fileSystemId
     *        You can retrieve the replication configuration for a specific file system by providing its file system ID.
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * You can retrieve the replication configuration for a specific file system by providing its file system ID.
     * </p>
     * 
     * @return You can retrieve the replication configuration for a specific file system by providing its file system
     *         ID.
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * You can retrieve the replication configuration for a specific file system by providing its file system ID.
     * </p>
     * 
     * @param fileSystemId
     *        You can retrieve the replication configuration for a specific file system by providing its file system ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of output.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     *        subsequent request to fetch the next page of output.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of output.
     * </p>
     * 
     * @return <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     *         subsequent request to fetch the next page of output.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     * subsequent request to fetch the next page of output.
     * </p>
     * 
     * @param nextToken
     *        <code>NextToken</code> is present if the response is paginated. You can use <code>NextToken</code> in a
     *        subsequent request to fetch the next page of output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * (Optional) To limit the number of objects returned in a response, you can specify the <code>MaxItems</code>
     * parameter. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) To limit the number of objects returned in a response, you can specify the
     *        <code>MaxItems</code> parameter. The default value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) To limit the number of objects returned in a response, you can specify the <code>MaxItems</code>
     * parameter. The default value is 100.
     * </p>
     * 
     * @return (Optional) To limit the number of objects returned in a response, you can specify the
     *         <code>MaxItems</code> parameter. The default value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) To limit the number of objects returned in a response, you can specify the <code>MaxItems</code>
     * parameter. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) To limit the number of objects returned in a response, you can specify the
     *        <code>MaxItems</code> parameter. The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationConfigurationsRequest withMaxResults(Integer maxResults) {
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
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
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

        if (obj instanceof DescribeReplicationConfigurationsRequest == false)
            return false;
        DescribeReplicationConfigurationsRequest other = (DescribeReplicationConfigurationsRequest) obj;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
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

        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationConfigurationsRequest clone() {
        return (DescribeReplicationConfigurationsRequest) super.clone();
    }

}
