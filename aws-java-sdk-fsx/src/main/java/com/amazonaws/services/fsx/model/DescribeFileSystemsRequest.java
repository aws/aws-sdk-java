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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for <code>DescribeFileSystems</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystems" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * </p>
     */
    private java.util.List<String> fileSystemIds;
    /**
     * <p>
     * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be
     * greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @return (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     */

    public java.util.List<String> getFileSystemIds() {
        return fileSystemIds;
    }

    /**
     * <p>
     * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param fileSystemIds
     *        (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     */

    public void setFileSystemIds(java.util.Collection<String> fileSystemIds) {
        if (fileSystemIds == null) {
            this.fileSystemIds = null;
            return;
        }

        this.fileSystemIds = new java.util.ArrayList<String>(fileSystemIds);
    }

    /**
     * <p>
     * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFileSystemIds(java.util.Collection)} or {@link #withFileSystemIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param fileSystemIds
     *        (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withFileSystemIds(String... fileSystemIds) {
        if (this.fileSystemIds == null) {
            setFileSystemIds(new java.util.ArrayList<String>(fileSystemIds.length));
        }
        for (String ele : fileSystemIds) {
            this.fileSystemIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * </p>
     * 
     * @param fileSystemIds
     *        (Optional) IDs of the file systems whose descriptions you want to retrieve (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withFileSystemIds(java.util.Collection<String> fileSystemIds) {
        setFileSystemIds(fileSystemIds);
        return this;
    }

    /**
     * <p>
     * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be
     * greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of file systems to return in the response (integer). This parameter value must
     *        be greater than 0. The number of items that Amazon FSx returns is the minimum of the
     *        <code>MaxResults</code> parameter specified in the request and the service's internal maximum number of
     *        items per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be
     * greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @return (Optional) Maximum number of file systems to return in the response (integer). This parameter value must
     *         be greater than 0. The number of items that Amazon FSx returns is the minimum of the
     *         <code>MaxResults</code> parameter specified in the request and the service's internal maximum number of
     *         items per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of file systems to return in the response (integer). This parameter value must be
     * greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     * parameter specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of file systems to return in the response (integer). This parameter value must
     *        be greater than 0. The number of items that Amazon FSx returns is the minimum of the
     *        <code>MaxResults</code> parameter specified in the request and the service's internal maximum number of
     *        items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @return (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *         (String). If a token present, the action continues the list from where the returning call left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeFileSystems</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemsRequest withNextToken(String nextToken) {
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
        if (getFileSystemIds() != null)
            sb.append("FileSystemIds: ").append(getFileSystemIds()).append(",");
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

        if (obj instanceof DescribeFileSystemsRequest == false)
            return false;
        DescribeFileSystemsRequest other = (DescribeFileSystemsRequest) obj;
        if (other.getFileSystemIds() == null ^ this.getFileSystemIds() == null)
            return false;
        if (other.getFileSystemIds() != null && other.getFileSystemIds().equals(this.getFileSystemIds()) == false)
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

        hashCode = prime * hashCode + ((getFileSystemIds() == null) ? 0 : getFileSystemIds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemsRequest clone() {
        return (DescribeFileSystemsRequest) super.clone();
    }

}
