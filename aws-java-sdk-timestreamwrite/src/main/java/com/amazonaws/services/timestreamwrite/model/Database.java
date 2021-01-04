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
package com.amazonaws.services.timestreamwrite.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A top level container for a table. Databases and tables are the fundamental management concepts in Amazon Timestream.
 * All tables in a database are encrypted with the same KMS key.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-write-2018-11-01/Database" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Database implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this database.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The total number of tables found within a Timestream database.
     * </p>
     */
    private Long tableCount;
    /**
     * <p>
     * The identifier of the KMS key used to encrypt the data stored in the database.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The time when the database was created, calculated from the Unix epoch time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time that this database was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name that uniquely identifies this database.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this database.
     * </p>
     * 
     * @return The Amazon Resource Name that uniquely identifies this database.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name that uniquely identifies this database.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name that uniquely identifies this database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @return The name of the Timestream database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the Timestream database.
     * </p>
     * 
     * @param databaseName
     *        The name of the Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The total number of tables found within a Timestream database.
     * </p>
     * 
     * @param tableCount
     *        The total number of tables found within a Timestream database.
     */

    public void setTableCount(Long tableCount) {
        this.tableCount = tableCount;
    }

    /**
     * <p>
     * The total number of tables found within a Timestream database.
     * </p>
     * 
     * @return The total number of tables found within a Timestream database.
     */

    public Long getTableCount() {
        return this.tableCount;
    }

    /**
     * <p>
     * The total number of tables found within a Timestream database.
     * </p>
     * 
     * @param tableCount
     *        The total number of tables found within a Timestream database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withTableCount(Long tableCount) {
        setTableCount(tableCount);
        return this;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the data stored in the database.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key used to encrypt the data stored in the database.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the data stored in the database.
     * </p>
     * 
     * @return The identifier of the KMS key used to encrypt the data stored in the database.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The identifier of the KMS key used to encrypt the data stored in the database.
     * </p>
     * 
     * @param kmsKeyId
     *        The identifier of the KMS key used to encrypt the data stored in the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The time when the database was created, calculated from the Unix epoch time.
     * </p>
     * 
     * @param creationTime
     *        The time when the database was created, calculated from the Unix epoch time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time when the database was created, calculated from the Unix epoch time.
     * </p>
     * 
     * @return The time when the database was created, calculated from the Unix epoch time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time when the database was created, calculated from the Unix epoch time.
     * </p>
     * 
     * @param creationTime
     *        The time when the database was created, calculated from the Unix epoch time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time that this database was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this database was updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this database was updated.
     * </p>
     * 
     * @return The last time that this database was updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The last time that this database was updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The last time that this database was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Database withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableCount() != null)
            sb.append("TableCount: ").append(getTableCount()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Database == false)
            return false;
        Database other = (Database) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableCount() == null ^ this.getTableCount() == null)
            return false;
        if (other.getTableCount() != null && other.getTableCount().equals(this.getTableCount()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableCount() == null) ? 0 : getTableCount().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public Database clone() {
        try {
            return (Database) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreamwrite.model.transform.DatabaseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
