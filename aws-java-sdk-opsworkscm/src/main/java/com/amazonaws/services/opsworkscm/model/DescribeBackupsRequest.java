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
package com.amazonaws.services.opsworkscm.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworkscm-2016-11-01/DescribeBackups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeBackupsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Describes a single backup.
     * </p>
     */
    private String backupId;
    /**
     * <p>
     * Returns backups for the server with the specified ServerName.
     * </p>
     */
    private String serverName;
    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Describes a single backup.
     * </p>
     * 
     * @param backupId
     *        Describes a single backup.
     */

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    /**
     * <p>
     * Describes a single backup.
     * </p>
     * 
     * @return Describes a single backup.
     */

    public String getBackupId() {
        return this.backupId;
    }

    /**
     * <p>
     * Describes a single backup.
     * </p>
     * 
     * @param backupId
     *        Describes a single backup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withBackupId(String backupId) {
        setBackupId(backupId);
        return this;
    }

    /**
     * <p>
     * Returns backups for the server with the specified ServerName.
     * </p>
     * 
     * @param serverName
     *        Returns backups for the server with the specified ServerName.
     */

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>
     * Returns backups for the server with the specified ServerName.
     * </p>
     * 
     * @return Returns backups for the server with the specified ServerName.
     */

    public String getServerName() {
        return this.serverName;
    }

    /**
     * <p>
     * Returns backups for the server with the specified ServerName.
     * </p>
     * 
     * @param serverName
     *        Returns backups for the server with the specified ServerName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withServerName(String serverName) {
        setServerName(serverName);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @return This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param nextToken
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param maxResults
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @return This is not currently implemented for <code>DescribeBackups</code> requests.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This is not currently implemented for <code>DescribeBackups</code> requests.
     * </p>
     * 
     * @param maxResults
     *        This is not currently implemented for <code>DescribeBackups</code> requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeBackupsRequest withMaxResults(Integer maxResults) {
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
        if (getBackupId() != null)
            sb.append("BackupId: ").append(getBackupId()).append(",");
        if (getServerName() != null)
            sb.append("ServerName: ").append(getServerName()).append(",");
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

        if (obj instanceof DescribeBackupsRequest == false)
            return false;
        DescribeBackupsRequest other = (DescribeBackupsRequest) obj;
        if (other.getBackupId() == null ^ this.getBackupId() == null)
            return false;
        if (other.getBackupId() != null && other.getBackupId().equals(this.getBackupId()) == false)
            return false;
        if (other.getServerName() == null ^ this.getServerName() == null)
            return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false)
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

        hashCode = prime * hashCode + ((getBackupId() == null) ? 0 : getBackupId().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeBackupsRequest clone() {
        return (DescribeBackupsRequest) super.clone();
    }

}
