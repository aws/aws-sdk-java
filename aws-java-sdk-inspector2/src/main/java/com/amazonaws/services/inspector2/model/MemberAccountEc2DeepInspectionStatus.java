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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains details about the status of Amazon Inspector deep inspection for a member account in your
 * organization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/MemberAccountEc2DeepInspectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberAccountEc2DeepInspectionStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector deep
     * inspection is active, if <code>FALSE</code> it is not active.
     * </p>
     */
    private Boolean activateDeepInspection;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account of the organization member.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountEc2DeepInspectionStatus withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector deep
     * inspection is active, if <code>FALSE</code> it is not active.
     * </p>
     * 
     * @param activateDeepInspection
     *        Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector
     *        deep inspection is active, if <code>FALSE</code> it is not active.
     */

    public void setActivateDeepInspection(Boolean activateDeepInspection) {
        this.activateDeepInspection = activateDeepInspection;
    }

    /**
     * <p>
     * Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector deep
     * inspection is active, if <code>FALSE</code> it is not active.
     * </p>
     * 
     * @return Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector
     *         deep inspection is active, if <code>FALSE</code> it is not active.
     */

    public Boolean getActivateDeepInspection() {
        return this.activateDeepInspection;
    }

    /**
     * <p>
     * Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector deep
     * inspection is active, if <code>FALSE</code> it is not active.
     * </p>
     * 
     * @param activateDeepInspection
     *        Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector
     *        deep inspection is active, if <code>FALSE</code> it is not active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountEc2DeepInspectionStatus withActivateDeepInspection(Boolean activateDeepInspection) {
        setActivateDeepInspection(activateDeepInspection);
        return this;
    }

    /**
     * <p>
     * Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector deep
     * inspection is active, if <code>FALSE</code> it is not active.
     * </p>
     * 
     * @return Whether Amazon Inspector deep inspection is active in the account. If <code>TRUE</code> Amazon Inspector
     *         deep inspection is active, if <code>FALSE</code> it is not active.
     */

    public Boolean isActivateDeepInspection() {
        return this.activateDeepInspection;
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getActivateDeepInspection() != null)
            sb.append("ActivateDeepInspection: ").append(getActivateDeepInspection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberAccountEc2DeepInspectionStatus == false)
            return false;
        MemberAccountEc2DeepInspectionStatus other = (MemberAccountEc2DeepInspectionStatus) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getActivateDeepInspection() == null ^ this.getActivateDeepInspection() == null)
            return false;
        if (other.getActivateDeepInspection() != null && other.getActivateDeepInspection().equals(this.getActivateDeepInspection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getActivateDeepInspection() == null) ? 0 : getActivateDeepInspection().hashCode());
        return hashCode;
    }

    @Override
    public MemberAccountEc2DeepInspectionStatus clone() {
        try {
            return (MemberAccountEc2DeepInspectionStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.MemberAccountEc2DeepInspectionStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
