/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details of a table archival operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/ArchivalSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ArchivalSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     * </p>
     */
    private java.util.Date archivalDateTime;
    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key being
     * inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     */
    private String archivalReason;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason.
     * If you wish to restore this backup to the same table name, you will need to delete the original table.
     * </p>
     */
    private String archivalBackupArn;

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     * </p>
     * 
     * @param archivalDateTime
     *        The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     */

    public void setArchivalDateTime(java.util.Date archivalDateTime) {
        this.archivalDateTime = archivalDateTime;
    }

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     * </p>
     * 
     * @return The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     */

    public java.util.Date getArchivalDateTime() {
        return this.archivalDateTime;
    }

    /**
     * <p>
     * The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     * </p>
     * 
     * @param archivalDateTime
     *        The date and time when table archival was initiated by DynamoDB, in UNIX epoch time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchivalSummary withArchivalDateTime(java.util.Date archivalDateTime) {
        setArchivalDateTime(archivalDateTime);
        return this;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key being
     * inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param archivalReason
     *        The reason DynamoDB archived the table. Currently, the only possible value is:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key
     *        being inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     *        </p>
     *        </li>
     */

    public void setArchivalReason(String archivalReason) {
        this.archivalReason = archivalReason;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key being
     * inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The reason DynamoDB archived the table. Currently, the only possible value is:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key
     *         being inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     *         </p>
     *         </li>
     */

    public String getArchivalReason() {
        return this.archivalReason;
    }

    /**
     * <p>
     * The reason DynamoDB archived the table. Currently, the only possible value is:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key being
     * inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     * </p>
     * </li>
     * </ul>
     * 
     * @param archivalReason
     *        The reason DynamoDB archived the table. Currently, the only possible value is:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INACCESSIBLE_ENCRYPTION_CREDENTIALS</code> - The table was archived due to the table's AWS KMS key
     *        being inaccessible for more than seven days. An On-Demand backup was created at the archival time.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchivalSummary withArchivalReason(String archivalReason) {
        setArchivalReason(archivalReason);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason.
     * If you wish to restore this backup to the same table name, you will need to delete the original table.
     * </p>
     * 
     * @param archivalBackupArn
     *        The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival
     *        reason. If you wish to restore this backup to the same table name, you will need to delete the original
     *        table.
     */

    public void setArchivalBackupArn(String archivalBackupArn) {
        this.archivalBackupArn = archivalBackupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason.
     * If you wish to restore this backup to the same table name, you will need to delete the original table.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival
     *         reason. If you wish to restore this backup to the same table name, you will need to delete the original
     *         table.
     */

    public String getArchivalBackupArn() {
        return this.archivalBackupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival reason.
     * If you wish to restore this backup to the same table name, you will need to delete the original table.
     * </p>
     * 
     * @param archivalBackupArn
     *        The Amazon Resource Name (ARN) of the backup the table was archived to, when applicable in the archival
     *        reason. If you wish to restore this backup to the same table name, you will need to delete the original
     *        table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ArchivalSummary withArchivalBackupArn(String archivalBackupArn) {
        setArchivalBackupArn(archivalBackupArn);
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
        if (getArchivalDateTime() != null)
            sb.append("ArchivalDateTime: ").append(getArchivalDateTime()).append(",");
        if (getArchivalReason() != null)
            sb.append("ArchivalReason: ").append(getArchivalReason()).append(",");
        if (getArchivalBackupArn() != null)
            sb.append("ArchivalBackupArn: ").append(getArchivalBackupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ArchivalSummary == false)
            return false;
        ArchivalSummary other = (ArchivalSummary) obj;
        if (other.getArchivalDateTime() == null ^ this.getArchivalDateTime() == null)
            return false;
        if (other.getArchivalDateTime() != null && other.getArchivalDateTime().equals(this.getArchivalDateTime()) == false)
            return false;
        if (other.getArchivalReason() == null ^ this.getArchivalReason() == null)
            return false;
        if (other.getArchivalReason() != null && other.getArchivalReason().equals(this.getArchivalReason()) == false)
            return false;
        if (other.getArchivalBackupArn() == null ^ this.getArchivalBackupArn() == null)
            return false;
        if (other.getArchivalBackupArn() != null && other.getArchivalBackupArn().equals(this.getArchivalBackupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchivalDateTime() == null) ? 0 : getArchivalDateTime().hashCode());
        hashCode = prime * hashCode + ((getArchivalReason() == null) ? 0 : getArchivalReason().hashCode());
        hashCode = prime * hashCode + ((getArchivalBackupArn() == null) ? 0 : getArchivalBackupArn().hashCode());
        return hashCode;
    }

    @Override
    public ArchivalSummary clone() {
        try {
            return (ArchivalSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.ArchivalSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
