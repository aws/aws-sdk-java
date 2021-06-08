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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for <code>DescribeFileSystemAliases</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeFileSystemAliases" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeFileSystemAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String clientRequestToken;
    /**
     * <p>
     * The ID of the file system to return the associated DNS aliases for (String).
     * </p>
     */
    private String fileSystemId;
    /**
     * <p>
     * Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater than 0.
     * The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified in
     * the request and the service's internal maximum number of items per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation (String). If a
     * token is included in the request, the action continues the list from where the previous returning call left off.
     * </p>
     */
    private String nextToken;

    /**
     * @param clientRequestToken
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * @return
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * @param clientRequestToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * The ID of the file system to return the associated DNS aliases for (String).
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to return the associated DNS aliases for (String).
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to return the associated DNS aliases for (String).
     * </p>
     * 
     * @return The ID of the file system to return the associated DNS aliases for (String).
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * <p>
     * The ID of the file system to return the associated DNS aliases for (String).
     * </p>
     * 
     * @param fileSystemId
     *        The ID of the file system to return the associated DNS aliases for (String).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesRequest withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater than 0.
     * The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified in
     * the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater
     *        than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater than 0.
     * The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified in
     * the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @return Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater
     *         than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *         parameter specified in the request and the service's internal maximum number of items per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater than 0.
     * The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified in
     * the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of DNS aliases to return in the response (integer). This parameter value must be greater
     *        than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation (String). If a
     * token is included in the request, the action continues the list from where the previous returning call left off.
     * </p>
     * 
     * @param nextToken
     *        Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation
     *        (String). If a token is included in the request, the action continues the list from where the previous
     *        returning call left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation (String). If a
     * token is included in the request, the action continues the list from where the previous returning call left off.
     * </p>
     * 
     * @return Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation
     *         (String). If a token is included in the request, the action continues the list from where the previous
     *         returning call left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation (String). If a
     * token is included in the request, the action continues the list from where the previous returning call left off.
     * </p>
     * 
     * @param nextToken
     *        Opaque pagination token returned from a previous <code>DescribeFileSystemAliases</code> operation
     *        (String). If a token is included in the request, the action continues the list from where the previous
     *        returning call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeFileSystemAliasesRequest withNextToken(String nextToken) {
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
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
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

        if (obj instanceof DescribeFileSystemAliasesRequest == false)
            return false;
        DescribeFileSystemAliasesRequest other = (DescribeFileSystemAliasesRequest) obj;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
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

        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFileSystemAliasesRequest clone() {
        return (DescribeFileSystemAliasesRequest) super.clone();
    }

}
