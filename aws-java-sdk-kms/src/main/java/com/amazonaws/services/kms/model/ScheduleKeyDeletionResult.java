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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ScheduleKeyDeletion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleKeyDeletionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the CMK
     * whose deletion is scheduled.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date for the
     * primary key isn't known until its last replica key is deleted.
     * </p>
     */
    private java.util.Date deletionDate;
    /**
     * <p>
     * The current status of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your CMK</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     */
    private String keyState;
    /**
     * <p>
     * The waiting period before the CMK is deleted.
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its replica
     * keys is deleted. Otherwise, the waiting period begins immediately.
     * </p>
     */
    private Integer pendingWindowInDays;

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the CMK
     * whose deletion is scheduled.
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of
     *        the CMK whose deletion is scheduled.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the CMK
     * whose deletion is scheduled.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of
     *         the CMK whose deletion is scheduled.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of the CMK
     * whose deletion is scheduled.
     * </p>
     * 
     * @param keyId
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#key-id-key-ARN">key ARN</a>) of
     *        the CMK whose deletion is scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleKeyDeletionResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date for the
     * primary key isn't known until its last replica key is deleted.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master key (CMK).</p>
     *        <p>
     *        If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date
     *        for the primary key isn't known until its last replica key is deleted.
     */

    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date for the
     * primary key isn't known until its last replica key is deleted.
     * </p>
     * 
     * @return The date and time after which AWS KMS deletes the customer master key (CMK).</p>
     *         <p>
     *         If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date
     *         for the primary key isn't known until its last replica key is deleted.
     */

    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key (CMK).
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date for the
     * primary key isn't known until its last replica key is deleted.
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master key (CMK).</p>
     *        <p>
     *        If the CMK is a multi-Region primary key with replica keys, this field does not appear. The deletion date
     *        for the primary key isn't known until its last replica key is deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleKeyDeletionResult withDeletionDate(java.util.Date deletionDate) {
        setDeletionDate(deletionDate);
        return this;
    }

    /**
     * <p>
     * The current status of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your CMK</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The current status of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your
     *        CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */

    public void setKeyState(String keyState) {
        this.keyState = keyState;
    }

    /**
     * <p>
     * The current status of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your CMK</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @return The current status of the CMK.</p>
     *         <p>
     *         For more information about how key state affects the use of a CMK, see <a
     *         href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your
     *         CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @see KeyState
     */

    public String getKeyState() {
        return this.keyState;
    }

    /**
     * <p>
     * The current status of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your CMK</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The current status of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your
     *        CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public ScheduleKeyDeletionResult withKeyState(String keyState) {
        setKeyState(keyState);
        return this;
    }

    /**
     * <p>
     * The current status of the CMK.
     * </p>
     * <p>
     * For more information about how key state affects the use of a CMK, see <a
     * href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your CMK</a> in
     * the <i>AWS Key Management Service Developer Guide</i>.
     * </p>
     * 
     * @param keyState
     *        The current status of the CMK.</p>
     *        <p>
     *        For more information about how key state affects the use of a CMK, see <a
     *        href="https://docs.aws.amazon.com/kms/latest/developerguide/key-state.html">Key state: Effect on your
     *        CMK</a> in the <i>AWS Key Management Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KeyState
     */

    public ScheduleKeyDeletionResult withKeyState(KeyState keyState) {
        this.keyState = keyState.toString();
        return this;
    }

    /**
     * <p>
     * The waiting period before the CMK is deleted.
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its replica
     * keys is deleted. Otherwise, the waiting period begins immediately.
     * </p>
     * 
     * @param pendingWindowInDays
     *        The waiting period before the CMK is deleted. </p>
     *        <p>
     *        If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its
     *        replica keys is deleted. Otherwise, the waiting period begins immediately.
     */

    public void setPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the CMK is deleted.
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its replica
     * keys is deleted. Otherwise, the waiting period begins immediately.
     * </p>
     * 
     * @return The waiting period before the CMK is deleted. </p>
     *         <p>
     *         If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its
     *         replica keys is deleted. Otherwise, the waiting period begins immediately.
     */

    public Integer getPendingWindowInDays() {
        return this.pendingWindowInDays;
    }

    /**
     * <p>
     * The waiting period before the CMK is deleted.
     * </p>
     * <p>
     * If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its replica
     * keys is deleted. Otherwise, the waiting period begins immediately.
     * </p>
     * 
     * @param pendingWindowInDays
     *        The waiting period before the CMK is deleted. </p>
     *        <p>
     *        If the CMK is a multi-Region primary key with replicas, the waiting period begins when the last of its
     *        replica keys is deleted. Otherwise, the waiting period begins immediately.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleKeyDeletionResult withPendingWindowInDays(Integer pendingWindowInDays) {
        setPendingWindowInDays(pendingWindowInDays);
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
        if (getKeyId() != null)
            sb.append("KeyId: ").append(getKeyId()).append(",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: ").append(getDeletionDate()).append(",");
        if (getKeyState() != null)
            sb.append("KeyState: ").append(getKeyState()).append(",");
        if (getPendingWindowInDays() != null)
            sb.append("PendingWindowInDays: ").append(getPendingWindowInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleKeyDeletionResult == false)
            return false;
        ScheduleKeyDeletionResult other = (ScheduleKeyDeletionResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        if (other.getKeyState() == null ^ this.getKeyState() == null)
            return false;
        if (other.getKeyState() != null && other.getKeyState().equals(this.getKeyState()) == false)
            return false;
        if (other.getPendingWindowInDays() == null ^ this.getPendingWindowInDays() == null)
            return false;
        if (other.getPendingWindowInDays() != null && other.getPendingWindowInDays().equals(this.getPendingWindowInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode + ((getDeletionDate() == null) ? 0 : getDeletionDate().hashCode());
        hashCode = prime * hashCode + ((getKeyState() == null) ? 0 : getKeyState().hashCode());
        hashCode = prime * hashCode + ((getPendingWindowInDays() == null) ? 0 : getPendingWindowInDays().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleKeyDeletionResult clone() {
        try {
            return (ScheduleKeyDeletionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
