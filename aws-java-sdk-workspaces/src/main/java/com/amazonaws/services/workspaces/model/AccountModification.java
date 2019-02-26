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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a modification to the configuration of bring your own license (BYOL) for the specified account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/AccountModification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountModification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The state of the modification to the configuration of BYOL.
     * </p>
     */
    private String modificationState;
    /**
     * <p>
     * The status of BYOL (whether BYOL is being enabled or disabled).
     * </p>
     */
    private String dedicatedTenancySupport;
    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
     * </p>
     */
    private String dedicatedTenancyManagementCidrRange;
    /**
     * <p>
     * The timestamp when the modification of the BYOL configuration was started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The error code that is returned if the configuration of BYOL cannot be modified.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The text of the error message that is returned if the configuration of BYOL cannot be modified.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The state of the modification to the configuration of BYOL.
     * </p>
     * 
     * @param modificationState
     *        The state of the modification to the configuration of BYOL.
     * @see DedicatedTenancyModificationStateEnum
     */

    public void setModificationState(String modificationState) {
        this.modificationState = modificationState;
    }

    /**
     * <p>
     * The state of the modification to the configuration of BYOL.
     * </p>
     * 
     * @return The state of the modification to the configuration of BYOL.
     * @see DedicatedTenancyModificationStateEnum
     */

    public String getModificationState() {
        return this.modificationState;
    }

    /**
     * <p>
     * The state of the modification to the configuration of BYOL.
     * </p>
     * 
     * @param modificationState
     *        The state of the modification to the configuration of BYOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancyModificationStateEnum
     */

    public AccountModification withModificationState(String modificationState) {
        setModificationState(modificationState);
        return this;
    }

    /**
     * <p>
     * The state of the modification to the configuration of BYOL.
     * </p>
     * 
     * @param modificationState
     *        The state of the modification to the configuration of BYOL.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancyModificationStateEnum
     */

    public AccountModification withModificationState(DedicatedTenancyModificationStateEnum modificationState) {
        this.modificationState = modificationState.toString();
        return this;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is being enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is being enabled or disabled).
     * @see DedicatedTenancySupportResultEnum
     */

    public void setDedicatedTenancySupport(String dedicatedTenancySupport) {
        this.dedicatedTenancySupport = dedicatedTenancySupport;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is being enabled or disabled).
     * </p>
     * 
     * @return The status of BYOL (whether BYOL is being enabled or disabled).
     * @see DedicatedTenancySupportResultEnum
     */

    public String getDedicatedTenancySupport() {
        return this.dedicatedTenancySupport;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is being enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is being enabled or disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancySupportResultEnum
     */

    public AccountModification withDedicatedTenancySupport(String dedicatedTenancySupport) {
        setDedicatedTenancySupport(dedicatedTenancySupport);
        return this;
    }

    /**
     * <p>
     * The status of BYOL (whether BYOL is being enabled or disabled).
     * </p>
     * 
     * @param dedicatedTenancySupport
     *        The status of BYOL (whether BYOL is being enabled or disabled).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DedicatedTenancySupportResultEnum
     */

    public AccountModification withDedicatedTenancySupport(DedicatedTenancySupportResultEnum dedicatedTenancySupport) {
        this.dedicatedTenancySupport = dedicatedTenancySupport.toString();
        return this;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
     * </p>
     * 
     * @param dedicatedTenancyManagementCidrRange
     *        The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the
     *        account.
     */

    public void setDedicatedTenancyManagementCidrRange(String dedicatedTenancyManagementCidrRange) {
        this.dedicatedTenancyManagementCidrRange = dedicatedTenancyManagementCidrRange;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
     * </p>
     * 
     * @return The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the
     *         account.
     */

    public String getDedicatedTenancyManagementCidrRange() {
        return this.dedicatedTenancyManagementCidrRange;
    }

    /**
     * <p>
     * The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the account.
     * </p>
     * 
     * @param dedicatedTenancyManagementCidrRange
     *        The IP address range, specified as an IPv4 CIDR block, for the management network interface used for the
     *        account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountModification withDedicatedTenancyManagementCidrRange(String dedicatedTenancyManagementCidrRange) {
        setDedicatedTenancyManagementCidrRange(dedicatedTenancyManagementCidrRange);
        return this;
    }

    /**
     * <p>
     * The timestamp when the modification of the BYOL configuration was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the modification of the BYOL configuration was started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when the modification of the BYOL configuration was started.
     * </p>
     * 
     * @return The timestamp when the modification of the BYOL configuration was started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when the modification of the BYOL configuration was started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when the modification of the BYOL configuration was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountModification withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The error code that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned if the configuration of BYOL cannot be modified.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @return The error code that is returned if the configuration of BYOL cannot be modified.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @param errorCode
     *        The error code that is returned if the configuration of BYOL cannot be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountModification withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The text of the error message that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned if the configuration of BYOL cannot be modified.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @return The text of the error message that is returned if the configuration of BYOL cannot be modified.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The text of the error message that is returned if the configuration of BYOL cannot be modified.
     * </p>
     * 
     * @param errorMessage
     *        The text of the error message that is returned if the configuration of BYOL cannot be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountModification withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
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
        if (getModificationState() != null)
            sb.append("ModificationState: ").append(getModificationState()).append(",");
        if (getDedicatedTenancySupport() != null)
            sb.append("DedicatedTenancySupport: ").append(getDedicatedTenancySupport()).append(",");
        if (getDedicatedTenancyManagementCidrRange() != null)
            sb.append("DedicatedTenancyManagementCidrRange: ").append(getDedicatedTenancyManagementCidrRange()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccountModification == false)
            return false;
        AccountModification other = (AccountModification) obj;
        if (other.getModificationState() == null ^ this.getModificationState() == null)
            return false;
        if (other.getModificationState() != null && other.getModificationState().equals(this.getModificationState()) == false)
            return false;
        if (other.getDedicatedTenancySupport() == null ^ this.getDedicatedTenancySupport() == null)
            return false;
        if (other.getDedicatedTenancySupport() != null && other.getDedicatedTenancySupport().equals(this.getDedicatedTenancySupport()) == false)
            return false;
        if (other.getDedicatedTenancyManagementCidrRange() == null ^ this.getDedicatedTenancyManagementCidrRange() == null)
            return false;
        if (other.getDedicatedTenancyManagementCidrRange() != null
                && other.getDedicatedTenancyManagementCidrRange().equals(this.getDedicatedTenancyManagementCidrRange()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModificationState() == null) ? 0 : getModificationState().hashCode());
        hashCode = prime * hashCode + ((getDedicatedTenancySupport() == null) ? 0 : getDedicatedTenancySupport().hashCode());
        hashCode = prime * hashCode + ((getDedicatedTenancyManagementCidrRange() == null) ? 0 : getDedicatedTenancyManagementCidrRange().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public AccountModification clone() {
        try {
            return (AccountModification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.AccountModificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
