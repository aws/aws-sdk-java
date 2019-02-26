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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * <code>PutRecords</code> results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/PutRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRecordsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     */
    private Integer failedRecordCount;
    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry> records;
    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionType;

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     */

    public void setFailedRecordCount(Integer failedRecordCount) {
        this.failedRecordCount = failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @return The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     */

    public Integer getFailedRecordCount() {
        return this.failedRecordCount;
    }

    /**
     * <p>
     * The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * </p>
     * 
     * @param failedRecordCount
     *        The number of unsuccessfully processed records in a <code>PutRecords</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withFailedRecordCount(Integer failedRecordCount) {
        setFailedRecordCount(failedRecordCount);
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @return An array of successfully and unsuccessfully processed record results, correlated with the request by
     *         natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code>
     *         and <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *         <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */

    public java.util.List<PutRecordsResultEntry> getRecords() {
        if (records == null) {
            records = new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>();
        }
        return records;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     */

    public void setRecords(java.util.Collection<PutRecordsResultEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>(records);
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecords(java.util.Collection)} or {@link #withRecords(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withRecords(PutRecordsResultEntry... records) {
        if (this.records == null) {
            setRecords(new com.amazonaws.internal.SdkInternalList<PutRecordsResultEntry>(records.length));
        }
        for (PutRecordsResultEntry ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of successfully and unsuccessfully processed record results, correlated with the request by natural
     * ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     * <code>ShardId</code> in the result. A record that fails to be added to a stream includes <code>ErrorCode</code>
     * and <code>ErrorMessage</code> in the result.
     * </p>
     * 
     * @param records
     *        An array of successfully and unsuccessfully processed record results, correlated with the request by
     *        natural ordering. A record that is successfully added to a stream includes <code>SequenceNumber</code> and
     *        <code>ShardId</code> in the result. A record that fails to be added to a stream includes
     *        <code>ErrorCode</code> and <code>ErrorMessage</code> in the result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutRecordsResult withRecords(java.util.Collection<PutRecordsResultEntry> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the records. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     *        </p>
     *        </li>
     * @see EncryptionType
     */

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The encryption type used on the records. This parameter can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: Do not encrypt the records.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     *         </p>
     *         </li>
     * @see EncryptionType
     */

    public String getEncryptionType() {
        return this.encryptionType;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the records. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutRecordsResult withEncryptionType(String encryptionType) {
        setEncryptionType(encryptionType);
        return this;
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the records. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     *        </p>
     *        </li>
     * @see EncryptionType
     */

    public void setEncryptionType(EncryptionType encryptionType) {
        withEncryptionType(encryptionType);
    }

    /**
     * <p>
     * The encryption type used on the records. This parameter can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: Do not encrypt the records.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionType
     *        The encryption type used on the records. This parameter can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: Do not encrypt the records.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS</code>: Use server-side encryption on the records using a customer-managed AWS KMS key.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionType
     */

    public PutRecordsResult withEncryptionType(EncryptionType encryptionType) {
        this.encryptionType = encryptionType.toString();
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
        if (getFailedRecordCount() != null)
            sb.append("FailedRecordCount: ").append(getFailedRecordCount()).append(",");
        if (getRecords() != null)
            sb.append("Records: ").append(getRecords()).append(",");
        if (getEncryptionType() != null)
            sb.append("EncryptionType: ").append(getEncryptionType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsResult == false)
            return false;
        PutRecordsResult other = (PutRecordsResult) obj;
        if (other.getFailedRecordCount() == null ^ this.getFailedRecordCount() == null)
            return false;
        if (other.getFailedRecordCount() != null && other.getFailedRecordCount().equals(this.getFailedRecordCount()) == false)
            return false;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getEncryptionType() == null ^ this.getEncryptionType() == null)
            return false;
        if (other.getEncryptionType() != null && other.getEncryptionType().equals(this.getEncryptionType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedRecordCount() == null) ? 0 : getFailedRecordCount().hashCode());
        hashCode = prime * hashCode + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode + ((getEncryptionType() == null) ? 0 : getEncryptionType().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordsResult clone() {
        try {
            return (PutRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
