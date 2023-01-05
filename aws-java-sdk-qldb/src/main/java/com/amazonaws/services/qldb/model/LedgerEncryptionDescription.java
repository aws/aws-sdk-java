/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the encryption of data at rest in an Amazon QLDB ledger. This includes the current status, the key
 * in Key Management Service (KMS), and when the key became inaccessible (in the case of an error).
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/qldb/latest/developerguide/encryption-at-rest.html">Encryption at rest</a> in the
 * <i>Amazon QLDB Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/LedgerEncryptionDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LedgerEncryptionDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at rest. If
     * this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     */
    private String kmsKeyArn;
    /**
     * <p>
     * The current state of encryption at rest for the ledger. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The ledger is actively processing the specified key change.
     * </p>
     * <p>
     * Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key
     * change is being processed. The amount of time it takes to update a key varies depending on the ledger size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the ledger is
     * impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is
     * impaired, it is not accessible and does not accept any read or write requests.
     * </p>
     * <p>
     * An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable
     * the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted,
     * you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable
     * permanently.
     * </p>
     * </li>
     * </ul>
     */
    private String encryptionStatus;
    /**
     * <p>
     * The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an error.
     * (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * <p>
     * This parameter is undefined if the KMS key is accessible.
     * </p>
     */
    private java.util.Date inaccessibleKmsKeyDateTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at rest. If
     * this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at
     *        rest. If this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     */

    public void setKmsKeyArn(String kmsKeyArn) {
        this.kmsKeyArn = kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at rest. If
     * this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at
     *         rest. If this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for
     *         encryption.
     */

    public String getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at rest. If
     * this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * </p>
     * 
     * @param kmsKeyArn
     *        The Amazon Resource Name (ARN) of the customer managed KMS key that the ledger uses for encryption at
     *        rest. If this parameter is undefined, the ledger uses an Amazon Web Services owned KMS key for encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LedgerEncryptionDescription withKmsKeyArn(String kmsKeyArn) {
        setKmsKeyArn(kmsKeyArn);
        return this;
    }

    /**
     * <p>
     * The current state of encryption at rest for the ledger. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The ledger is actively processing the specified key change.
     * </p>
     * <p>
     * Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key
     * change is being processed. The amount of time it takes to update a key varies depending on the ledger size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the ledger is
     * impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is
     * impaired, it is not accessible and does not accept any read or write requests.
     * </p>
     * <p>
     * An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable
     * the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted,
     * you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable
     * permanently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionStatus
     *        The current state of encryption at rest for the ledger. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The ledger is actively processing the specified key change.
     *        </p>
     *        <p>
     *        Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while
     *        the key change is being processed. The amount of time it takes to update a key varies depending on the
     *        ledger size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the
     *        ledger is impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a
     *        ledger is impaired, it is not accessible and does not accept any read or write requests.
     *        </p>
     *        <p>
     *        An impaired ledger automatically returns to an active state after you restore the grants on the key, or
     *        re-enable the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a
     *        key is deleted, you can no longer access the ledgers that are protected with that key, and the data
     *        becomes unrecoverable permanently.
     *        </p>
     *        </li>
     * @see EncryptionStatus
     */

    public void setEncryptionStatus(String encryptionStatus) {
        this.encryptionStatus = encryptionStatus;
    }

    /**
     * <p>
     * The current state of encryption at rest for the ledger. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The ledger is actively processing the specified key change.
     * </p>
     * <p>
     * Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key
     * change is being processed. The amount of time it takes to update a key varies depending on the ledger size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the ledger is
     * impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is
     * impaired, it is not accessible and does not accept any read or write requests.
     * </p>
     * <p>
     * An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable
     * the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted,
     * you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable
     * permanently.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of encryption at rest for the ledger. This can be one of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATING</code>: The ledger is actively processing the specified key change.
     *         </p>
     *         <p>
     *         Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while
     *         the key change is being processed. The amount of time it takes to update a key varies depending on the
     *         ledger size.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the
     *         ledger is impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a
     *         ledger is impaired, it is not accessible and does not accept any read or write requests.
     *         </p>
     *         <p>
     *         An impaired ledger automatically returns to an active state after you restore the grants on the key, or
     *         re-enable the key that was disabled. However, deleting a customer managed KMS key is irreversible. After
     *         a key is deleted, you can no longer access the ledgers that are protected with that key, and the data
     *         becomes unrecoverable permanently.
     *         </p>
     *         </li>
     * @see EncryptionStatus
     */

    public String getEncryptionStatus() {
        return this.encryptionStatus;
    }

    /**
     * <p>
     * The current state of encryption at rest for the ledger. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The ledger is actively processing the specified key change.
     * </p>
     * <p>
     * Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key
     * change is being processed. The amount of time it takes to update a key varies depending on the ledger size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the ledger is
     * impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is
     * impaired, it is not accessible and does not accept any read or write requests.
     * </p>
     * <p>
     * An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable
     * the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted,
     * you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable
     * permanently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionStatus
     *        The current state of encryption at rest for the ledger. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The ledger is actively processing the specified key change.
     *        </p>
     *        <p>
     *        Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while
     *        the key change is being processed. The amount of time it takes to update a key varies depending on the
     *        ledger size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the
     *        ledger is impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a
     *        ledger is impaired, it is not accessible and does not accept any read or write requests.
     *        </p>
     *        <p>
     *        An impaired ledger automatically returns to an active state after you restore the grants on the key, or
     *        re-enable the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a
     *        key is deleted, you can no longer access the ledgers that are protected with that key, and the data
     *        becomes unrecoverable permanently.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public LedgerEncryptionDescription withEncryptionStatus(String encryptionStatus) {
        setEncryptionStatus(encryptionStatus);
        return this;
    }

    /**
     * <p>
     * The current state of encryption at rest for the ledger. This can be one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATING</code>: The ledger is actively processing the specified key change.
     * </p>
     * <p>
     * Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while the key
     * change is being processed. The amount of time it takes to update a key varies depending on the ledger size.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the ledger is
     * impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a ledger is
     * impaired, it is not accessible and does not accept any read or write requests.
     * </p>
     * <p>
     * An impaired ledger automatically returns to an active state after you restore the grants on the key, or re-enable
     * the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a key is deleted,
     * you can no longer access the ledgers that are protected with that key, and the data becomes unrecoverable
     * permanently.
     * </p>
     * </li>
     * </ul>
     * 
     * @param encryptionStatus
     *        The current state of encryption at rest for the ledger. This can be one of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLED</code>: Encryption is fully enabled using the specified key.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATING</code>: The ledger is actively processing the specified key change.
     *        </p>
     *        <p>
     *        Key changes in QLDB are asynchronous. The ledger is fully accessible without any performance impact while
     *        the key change is being processed. The amount of time it takes to update a key varies depending on the
     *        ledger size.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>KMS_KEY_INACCESSIBLE</code>: The specified customer managed KMS key is not accessible, and the
     *        ledger is impaired. Either the key was disabled or deleted, or the grants on the key were revoked. When a
     *        ledger is impaired, it is not accessible and does not accept any read or write requests.
     *        </p>
     *        <p>
     *        An impaired ledger automatically returns to an active state after you restore the grants on the key, or
     *        re-enable the key that was disabled. However, deleting a customer managed KMS key is irreversible. After a
     *        key is deleted, you can no longer access the ledgers that are protected with that key, and the data
     *        becomes unrecoverable permanently.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncryptionStatus
     */

    public LedgerEncryptionDescription withEncryptionStatus(EncryptionStatus encryptionStatus) {
        this.encryptionStatus = encryptionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an error.
     * (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * <p>
     * This parameter is undefined if the KMS key is accessible.
     * </p>
     * 
     * @param inaccessibleKmsKeyDateTime
     *        The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an
     *        error. (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970
     *        UTC.)</p>
     *        <p>
     *        This parameter is undefined if the KMS key is accessible.
     */

    public void setInaccessibleKmsKeyDateTime(java.util.Date inaccessibleKmsKeyDateTime) {
        this.inaccessibleKmsKeyDateTime = inaccessibleKmsKeyDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an error.
     * (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * <p>
     * This parameter is undefined if the KMS key is accessible.
     * </p>
     * 
     * @return The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an
     *         error. (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970
     *         UTC.)</p>
     *         <p>
     *         This parameter is undefined if the KMS key is accessible.
     */

    public java.util.Date getInaccessibleKmsKeyDateTime() {
        return this.inaccessibleKmsKeyDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an error.
     * (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * <p>
     * This parameter is undefined if the KMS key is accessible.
     * </p>
     * 
     * @param inaccessibleKmsKeyDateTime
     *        The date and time, in epoch time format, when the KMS key first became inaccessible, in the case of an
     *        error. (Epoch time format is the number of seconds that have elapsed since 12:00:00 AM January 1, 1970
     *        UTC.)</p>
     *        <p>
     *        This parameter is undefined if the KMS key is accessible.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LedgerEncryptionDescription withInaccessibleKmsKeyDateTime(java.util.Date inaccessibleKmsKeyDateTime) {
        setInaccessibleKmsKeyDateTime(inaccessibleKmsKeyDateTime);
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
        if (getKmsKeyArn() != null)
            sb.append("KmsKeyArn: ").append(getKmsKeyArn()).append(",");
        if (getEncryptionStatus() != null)
            sb.append("EncryptionStatus: ").append(getEncryptionStatus()).append(",");
        if (getInaccessibleKmsKeyDateTime() != null)
            sb.append("InaccessibleKmsKeyDateTime: ").append(getInaccessibleKmsKeyDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LedgerEncryptionDescription == false)
            return false;
        LedgerEncryptionDescription other = (LedgerEncryptionDescription) obj;
        if (other.getKmsKeyArn() == null ^ this.getKmsKeyArn() == null)
            return false;
        if (other.getKmsKeyArn() != null && other.getKmsKeyArn().equals(this.getKmsKeyArn()) == false)
            return false;
        if (other.getEncryptionStatus() == null ^ this.getEncryptionStatus() == null)
            return false;
        if (other.getEncryptionStatus() != null && other.getEncryptionStatus().equals(this.getEncryptionStatus()) == false)
            return false;
        if (other.getInaccessibleKmsKeyDateTime() == null ^ this.getInaccessibleKmsKeyDateTime() == null)
            return false;
        if (other.getInaccessibleKmsKeyDateTime() != null && other.getInaccessibleKmsKeyDateTime().equals(this.getInaccessibleKmsKeyDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsKeyArn() == null) ? 0 : getKmsKeyArn().hashCode());
        hashCode = prime * hashCode + ((getEncryptionStatus() == null) ? 0 : getEncryptionStatus().hashCode());
        hashCode = prime * hashCode + ((getInaccessibleKmsKeyDateTime() == null) ? 0 : getInaccessibleKmsKeyDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LedgerEncryptionDescription clone() {
        try {
            return (LedgerEncryptionDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.LedgerEncryptionDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
