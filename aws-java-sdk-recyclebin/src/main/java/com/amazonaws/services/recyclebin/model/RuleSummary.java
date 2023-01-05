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
package com.amazonaws.services.recyclebin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a Recycle Bin retention rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rbin-2021-06-15/RuleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * The retention rule description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String lockState;

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @return The unique ID of the retention rule.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The unique ID of the retention rule.
     * </p>
     * 
     * @param identifier
     *        The unique ID of the retention rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @return The retention rule description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The retention rule description.
     * </p>
     * 
     * @param description
     *        The retention rule description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @return Information about the retention period for which the retention rule is to retain resources.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * Information about the retention period for which the retention rule is to retain resources.
     * </p>
     * 
     * @param retentionPeriod
     *        Information about the retention period for which the retention rule is to retain resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleSummary withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @see LockState
     */

    public void setLockState(String lockState) {
        this.lockState = lockState;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lock state for the retention rule.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock
     *         delay period. The retention rule can be modified or deleted only after the unlock delay period has
     *         expired.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *         the required permissions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *         can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *         transition back to <code>null</code>.
     *         </p>
     *         </li>
     * @see LockState
     */

    public String getLockState() {
        return this.lockState;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public RuleSummary withLockState(String lockState) {
        setLockState(lockState);
        return this;
    }

    /**
     * <p>
     * The lock state for the retention rule.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     * period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with the
     * required permissions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it can
     * transition between the <code>locked</code> and <code>unlocked</code> states only; it can never transition back to
     * <code>null</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lockState
     *        The lock state for the retention rule.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>locked</code> - The retention rule is locked and can't be modified or deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending_unlock</code> - The retention rule has been unlocked but it is still within the unlock delay
     *        period. The retention rule can be modified or deleted only after the unlock delay period has expired.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unlocked</code> - The retention rule is unlocked and it can be modified or deleted by any user with
     *        the required permissions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>null</code> - The retention rule has never been locked. Once a retention rule has been locked, it
     *        can transition between the <code>locked</code> and <code>unlocked</code> states only; it can never
     *        transition back to <code>null</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LockState
     */

    public RuleSummary withLockState(LockState lockState) {
        this.lockState = lockState.toString();
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getLockState() != null)
            sb.append("LockState: ").append(getLockState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleSummary == false)
            return false;
        RuleSummary other = (RuleSummary) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getLockState() == null ^ this.getLockState() == null)
            return false;
        if (other.getLockState() != null && other.getLockState().equals(this.getLockState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getLockState() == null) ? 0 : getLockState().hashCode());
        return hashCode;
    }

    @Override
    public RuleSummary clone() {
        try {
            return (RuleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.recyclebin.model.transform.RuleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
