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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxDatabase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxDatabaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the kdb database for which the information is retrieved.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The ARN identifier of the database.
     * </p>
     */
    private String databaseArn;
    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A description of the database.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The last time that the database was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String lastCompletedChangesetId;
    /**
     * <p>
     * The total number of bytes in the database.
     * </p>
     */
    private Long numBytes;
    /**
     * <p>
     * The total number of changesets in the database.
     * </p>
     */
    private Integer numChangesets;
    /**
     * <p>
     * The total number of files in the database.
     * </p>
     */
    private Integer numFiles;

    /**
     * <p>
     * The name of the kdb database for which the information is retrieved.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database for which the information is retrieved.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the kdb database for which the information is retrieved.
     * </p>
     * 
     * @return The name of the kdb database for which the information is retrieved.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the kdb database for which the information is retrieved.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database for which the information is retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the database.
     * </p>
     * 
     * @param databaseArn
     *        The ARN identifier of the database.
     */

    public void setDatabaseArn(String databaseArn) {
        this.databaseArn = databaseArn;
    }

    /**
     * <p>
     * The ARN identifier of the database.
     * </p>
     * 
     * @return The ARN identifier of the database.
     */

    public String getDatabaseArn() {
        return this.databaseArn;
    }

    /**
     * <p>
     * The ARN identifier of the database.
     * </p>
     * 
     * @param databaseArn
     *        The ARN identifier of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withDatabaseArn(String databaseArn) {
        setDatabaseArn(databaseArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @param description
     *        A description of the database.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @return A description of the database.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the database.
     * </p>
     * 
     * @param description
     *        A description of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the database is created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time that the database was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the database was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the database was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The last time that the database was modified. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The last time that the database was modified. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The last time that the database was modified. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param lastCompletedChangesetId
     *        A unique identifier for the changeset.
     */

    public void setLastCompletedChangesetId(String lastCompletedChangesetId) {
        this.lastCompletedChangesetId = lastCompletedChangesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @return A unique identifier for the changeset.
     */

    public String getLastCompletedChangesetId() {
        return this.lastCompletedChangesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param lastCompletedChangesetId
     *        A unique identifier for the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withLastCompletedChangesetId(String lastCompletedChangesetId) {
        setLastCompletedChangesetId(lastCompletedChangesetId);
        return this;
    }

    /**
     * <p>
     * The total number of bytes in the database.
     * </p>
     * 
     * @param numBytes
     *        The total number of bytes in the database.
     */

    public void setNumBytes(Long numBytes) {
        this.numBytes = numBytes;
    }

    /**
     * <p>
     * The total number of bytes in the database.
     * </p>
     * 
     * @return The total number of bytes in the database.
     */

    public Long getNumBytes() {
        return this.numBytes;
    }

    /**
     * <p>
     * The total number of bytes in the database.
     * </p>
     * 
     * @param numBytes
     *        The total number of bytes in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withNumBytes(Long numBytes) {
        setNumBytes(numBytes);
        return this;
    }

    /**
     * <p>
     * The total number of changesets in the database.
     * </p>
     * 
     * @param numChangesets
     *        The total number of changesets in the database.
     */

    public void setNumChangesets(Integer numChangesets) {
        this.numChangesets = numChangesets;
    }

    /**
     * <p>
     * The total number of changesets in the database.
     * </p>
     * 
     * @return The total number of changesets in the database.
     */

    public Integer getNumChangesets() {
        return this.numChangesets;
    }

    /**
     * <p>
     * The total number of changesets in the database.
     * </p>
     * 
     * @param numChangesets
     *        The total number of changesets in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withNumChangesets(Integer numChangesets) {
        setNumChangesets(numChangesets);
        return this;
    }

    /**
     * <p>
     * The total number of files in the database.
     * </p>
     * 
     * @param numFiles
     *        The total number of files in the database.
     */

    public void setNumFiles(Integer numFiles) {
        this.numFiles = numFiles;
    }

    /**
     * <p>
     * The total number of files in the database.
     * </p>
     * 
     * @return The total number of files in the database.
     */

    public Integer getNumFiles() {
        return this.numFiles;
    }

    /**
     * <p>
     * The total number of files in the database.
     * </p>
     * 
     * @param numFiles
     *        The total number of files in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxDatabaseResult withNumFiles(Integer numFiles) {
        setNumFiles(numFiles);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDatabaseArn() != null)
            sb.append("DatabaseArn: ").append(getDatabaseArn()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getLastCompletedChangesetId() != null)
            sb.append("LastCompletedChangesetId: ").append(getLastCompletedChangesetId()).append(",");
        if (getNumBytes() != null)
            sb.append("NumBytes: ").append(getNumBytes()).append(",");
        if (getNumChangesets() != null)
            sb.append("NumChangesets: ").append(getNumChangesets()).append(",");
        if (getNumFiles() != null)
            sb.append("NumFiles: ").append(getNumFiles());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKxDatabaseResult == false)
            return false;
        GetKxDatabaseResult other = (GetKxDatabaseResult) obj;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDatabaseArn() == null ^ this.getDatabaseArn() == null)
            return false;
        if (other.getDatabaseArn() != null && other.getDatabaseArn().equals(this.getDatabaseArn()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getLastCompletedChangesetId() == null ^ this.getLastCompletedChangesetId() == null)
            return false;
        if (other.getLastCompletedChangesetId() != null && other.getLastCompletedChangesetId().equals(this.getLastCompletedChangesetId()) == false)
            return false;
        if (other.getNumBytes() == null ^ this.getNumBytes() == null)
            return false;
        if (other.getNumBytes() != null && other.getNumBytes().equals(this.getNumBytes()) == false)
            return false;
        if (other.getNumChangesets() == null ^ this.getNumChangesets() == null)
            return false;
        if (other.getNumChangesets() != null && other.getNumChangesets().equals(this.getNumChangesets()) == false)
            return false;
        if (other.getNumFiles() == null ^ this.getNumFiles() == null)
            return false;
        if (other.getNumFiles() != null && other.getNumFiles().equals(this.getNumFiles()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseArn() == null) ? 0 : getDatabaseArn().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastCompletedChangesetId() == null) ? 0 : getLastCompletedChangesetId().hashCode());
        hashCode = prime * hashCode + ((getNumBytes() == null) ? 0 : getNumBytes().hashCode());
        hashCode = prime * hashCode + ((getNumChangesets() == null) ? 0 : getNumChangesets().hashCode());
        hashCode = prime * hashCode + ((getNumFiles() == null) ? 0 : getNumFiles().hashCode());
        return hashCode;
    }

    @Override
    public GetKxDatabaseResult clone() {
        try {
            return (GetKxDatabaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
