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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/DescribeBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more backups.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of backups to return in the response. When there are more backups than the number you specify,
     * the response contains a <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their backup
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     * <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify clusters by
     * their cluster identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only backups that match the specified state.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;

    private Boolean sortAscending;

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more backups.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        backups.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more backups.
     * </p>
     * 
     * @return The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *         backups.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more backups.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        backups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of backups to return in the response. When there are more backups than the number you specify,
     * the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of backups to return in the response. When there are more backups than the number you
     *        specify, the response contains a <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of backups to return in the response. When there are more backups than the number you specify,
     * the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of backups to return in the response. When there are more backups than the number you
     *         specify, the response contains a <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of backups to return in the response. When there are more backups than the number you specify,
     * the response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of backups to return in the response. When there are more backups than the number you
     *        specify, the response contains a <code>NextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their backup
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     * <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify clusters by
     * their cluster identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only backups that match the specified state.
     * </p>
     * 
     * @return One or more filters to limit the items returned in the response.</p>
     *         <p>
     *         Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their
     *         backup identifier (ID).
     *         </p>
     *         <p>
     *         Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     *         <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     *         </p>
     *         <p>
     *         Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify
     *         clusters by their cluster identifier (ID).
     *         </p>
     *         <p>
     *         Use the <code>states</code> filter to return only backups that match the specified state.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their backup
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     * <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify clusters by
     * their cluster identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only backups that match the specified state.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the items returned in the response.</p>
     *        <p>
     *        Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their
     *        backup identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     *        <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     *        </p>
     *        <p>
     *        Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify
     *        clusters by their cluster identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>states</code> filter to return only backups that match the specified state.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * One or more filters to limit the items returned in the response.
     * </p>
     * <p>
     * Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their backup
     * identifier (ID).
     * </p>
     * <p>
     * Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     * <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     * </p>
     * <p>
     * Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify clusters by
     * their cluster identifier (ID).
     * </p>
     * <p>
     * Use the <code>states</code> filter to return only backups that match the specified state.
     * </p>
     * 
     * @param filters
     *        One or more filters to limit the items returned in the response.</p>
     *        <p>
     *        Use the <code>backupIds</code> filter to return only the specified backups. Specify backups by their
     *        backup identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>sourceBackupIds</code> filter to return only the backups created from a source backup. The
     *        <code>sourceBackupID</code> of a source backup is returned by the <a>CopyBackupToRegion</a> operation.
     *        </p>
     *        <p>
     *        Use the <code>clusterIds</code> filter to return only the backups for the specified clusters. Specify
     *        clusters by their cluster identifier (ID).
     *        </p>
     *        <p>
     *        Use the <code>states</code> filter to return only backups that match the specified state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    public DescribeBackupsRequest addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest clearFiltersEntries() {
        this.filters = null;
        return this;
    }

    /**
     * @param sortAscending
     */

    public void setSortAscending(Boolean sortAscending) {
        this.sortAscending = sortAscending;
    }

    /**
     * @return
     */

    public Boolean getSortAscending() {
        return this.sortAscending;
    }

    /**
     * @param sortAscending
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withSortAscending(Boolean sortAscending) {
        setSortAscending(sortAscending);
        return this;
    }

    /**
     * @return
     */

    public Boolean isSortAscending() {
        return this.sortAscending;
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getSortAscending() != null)
            sb.append("SortAscending: ").append(getSortAscending());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeBackupsRequest == false)
            return false;
        DescribeBackupsRequest other = (DescribeBackupsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getSortAscending() == null ^ this.getSortAscending() == null)
            return false;
        if (other.getSortAscending() != null && other.getSortAscending().equals(this.getSortAscending()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getSortAscending() == null) ? 0 : getSortAscending().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupsRequest clone() {
        return (DescribeBackupsRequest) super.clone();
    }

}
