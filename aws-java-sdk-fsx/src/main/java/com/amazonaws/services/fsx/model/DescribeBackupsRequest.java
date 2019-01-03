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
 * The request object for <code>DescribeBackups</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not
     * found, BackupNotFound will be thrown.
     * </p>
     */
    private java.util.List<String> backupIds;
    /**
     * <p>
     * (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     */
    private java.util.List<Filter> filters;
    /**
     * <p>
     * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater
     * than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of items per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation (String). If a
     * token present, the action continues the list from where the returning call left off.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not
     * found, BackupNotFound will be thrown.
     * </p>
     * 
     * @return (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are
     *         not found, BackupNotFound will be thrown.
     */

    public java.util.List<String> getBackupIds() {
        return backupIds;
    }

    /**
     * <p>
     * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not
     * found, BackupNotFound will be thrown.
     * </p>
     * 
     * @param backupIds
     *        (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are
     *        not found, BackupNotFound will be thrown.
     */

    public void setBackupIds(java.util.Collection<String> backupIds) {
        if (backupIds == null) {
            this.backupIds = null;
            return;
        }

        this.backupIds = new java.util.ArrayList<String>(backupIds);
    }

    /**
     * <p>
     * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not
     * found, BackupNotFound will be thrown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackupIds(java.util.Collection)} or {@link #withBackupIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param backupIds
     *        (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are
     *        not found, BackupNotFound will be thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withBackupIds(String... backupIds) {
        if (this.backupIds == null) {
            setBackupIds(new java.util.ArrayList<String>(backupIds.length));
        }
        for (String ele : backupIds) {
            this.backupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are not
     * found, BackupNotFound will be thrown.
     * </p>
     * 
     * @param backupIds
     *        (Optional) IDs of the backups you want to retrieve (String). This overrides any filters. If any IDs are
     *        not found, BackupNotFound will be thrown.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withBackupIds(java.util.Collection<String> backupIds) {
        setBackupIds(backupIds);
        return this;
    }

    /**
     * <p>
     * (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * 
     * @return (Optional) Filters structure. Supported names are file-system-id and backup-type.
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * 
     * @param filters
     *        (Optional) Filters structure. Supported names are file-system-id and backup-type.
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * </p>
     * 
     * @param filters
     *        (Optional) Filters structure. Supported names are file-system-id and backup-type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater
     * than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of backups to return in the response (integer). This parameter value must be
     *        greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater
     * than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @return (Optional) Maximum number of backups to return in the response (integer). This parameter value must be
     *         greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *         parameter specified in the request and the service's internal maximum number of items per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of backups to return in the response (integer). This parameter value must be greater
     * than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter
     * specified in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of backups to return in the response (integer). This parameter value must be
     *        greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation (String). If a
     * token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation (String). If a
     * token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @return (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation
     *         (String). If a token present, the action continues the list from where the returning call left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation (String). If a
     * token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>DescribeBackups</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withNextToken(String nextToken) {
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
        if (getBackupIds() != null)
            sb.append("BackupIds: ").append(getBackupIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeBackupsRequest == false)
            return false;
        DescribeBackupsRequest other = (DescribeBackupsRequest) obj;
        if (other.getBackupIds() == null ^ this.getBackupIds() == null)
            return false;
        if (other.getBackupIds() != null && other.getBackupIds().equals(this.getBackupIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getBackupIds() == null) ? 0 : getBackupIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupsRequest clone() {
        return (DescribeBackupsRequest) super.clone();
    }

}
