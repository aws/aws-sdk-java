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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents a request to list all of the import jobs for a data destination within the specified maximum number of
 * import jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/ListImportJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The destination of the import job, which can be used to list import jobs that have a certain
     * <code>ImportDestinationType</code>.
     * </p>
     */
    private String importDestinationType;
    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     * </p>
     */
    private Integer pageSize;

    /**
     * <p>
     * The destination of the import job, which can be used to list import jobs that have a certain
     * <code>ImportDestinationType</code>.
     * </p>
     * 
     * @param importDestinationType
     *        The destination of the import job, which can be used to list import jobs that have a certain
     *        <code>ImportDestinationType</code>.
     * @see ImportDestinationType
     */

    public void setImportDestinationType(String importDestinationType) {
        this.importDestinationType = importDestinationType;
    }

    /**
     * <p>
     * The destination of the import job, which can be used to list import jobs that have a certain
     * <code>ImportDestinationType</code>.
     * </p>
     * 
     * @return The destination of the import job, which can be used to list import jobs that have a certain
     *         <code>ImportDestinationType</code>.
     * @see ImportDestinationType
     */

    public String getImportDestinationType() {
        return this.importDestinationType;
    }

    /**
     * <p>
     * The destination of the import job, which can be used to list import jobs that have a certain
     * <code>ImportDestinationType</code>.
     * </p>
     * 
     * @param importDestinationType
     *        The destination of the import job, which can be used to list import jobs that have a certain
     *        <code>ImportDestinationType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportDestinationType
     */

    public ListImportJobsRequest withImportDestinationType(String importDestinationType) {
        setImportDestinationType(importDestinationType);
        return this;
    }

    /**
     * <p>
     * The destination of the import job, which can be used to list import jobs that have a certain
     * <code>ImportDestinationType</code>.
     * </p>
     * 
     * @param importDestinationType
     *        The destination of the import job, which can be used to list import jobs that have a certain
     *        <code>ImportDestinationType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportDestinationType
     */

    public ListImportJobsRequest withImportDestinationType(ImportDestinationType importDestinationType) {
        this.importDestinationType = importDestinationType.toString();
        return this;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional import jobs available to be listed. Copy this
     *        token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *        page of import jobs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @return A string token indicating that there might be additional import jobs available to be listed. Copy this
     *         token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *         page of import jobs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string token indicating that there might be additional import jobs available to be listed. Copy this token to a
     * subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next page of import jobs.
     * </p>
     * 
     * @param nextToken
     *        A string token indicating that there might be additional import jobs available to be listed. Copy this
     *        token to a subsequent call to <code>ListImportJobs</code> with the same parameters to retrieve the next
     *        page of import jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional
     *        import jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *        Use the <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     * </p>
     * 
     * @return Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional
     *         import jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *         Use the <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional import
     * jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response. Use the
     * <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     * </p>
     * 
     * @param pageSize
     *        Maximum number of import jobs to return at once. Use this parameter to paginate results. If additional
     *        import jobs exist beyond the specified limit, the <code>NextToken</code> element is sent in the response.
     *        Use the <code>NextToken</code> value in subsequent requests to retrieve additional addresses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImportJobsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
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
        if (getImportDestinationType() != null)
            sb.append("ImportDestinationType: ").append(getImportDestinationType()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImportJobsRequest == false)
            return false;
        ListImportJobsRequest other = (ListImportJobsRequest) obj;
        if (other.getImportDestinationType() == null ^ this.getImportDestinationType() == null)
            return false;
        if (other.getImportDestinationType() != null && other.getImportDestinationType().equals(this.getImportDestinationType()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportDestinationType() == null) ? 0 : getImportDestinationType().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        return hashCode;
    }

    @Override
    public ListImportJobsRequest clone() {
        return (ListImportJobsRequest) super.clone();
    }

}
