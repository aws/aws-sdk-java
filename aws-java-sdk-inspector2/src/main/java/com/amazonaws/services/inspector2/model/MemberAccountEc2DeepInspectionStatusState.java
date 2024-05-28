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
 * An object that contains details about the state of Amazon Inspector deep inspection for a member account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/MemberAccountEc2DeepInspectionStatusState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MemberAccountEc2DeepInspectionStatusState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The state of Amazon Inspector deep inspection in the member account.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account of the organization member
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountEc2DeepInspectionStatusState withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @param errorMessage
     *        The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @return The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @param errorMessage
     *        The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MemberAccountEc2DeepInspectionStatusState withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The state of Amazon Inspector deep inspection in the member account.
     * </p>
     * 
     * @param status
     *        The state of Amazon Inspector deep inspection in the member account.
     * @see Ec2DeepInspectionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of Amazon Inspector deep inspection in the member account.
     * </p>
     * 
     * @return The state of Amazon Inspector deep inspection in the member account.
     * @see Ec2DeepInspectionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of Amazon Inspector deep inspection in the member account.
     * </p>
     * 
     * @param status
     *        The state of Amazon Inspector deep inspection in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2DeepInspectionStatus
     */

    public MemberAccountEc2DeepInspectionStatusState withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of Amazon Inspector deep inspection in the member account.
     * </p>
     * 
     * @param status
     *        The state of Amazon Inspector deep inspection in the member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Ec2DeepInspectionStatus
     */

    public MemberAccountEc2DeepInspectionStatusState withStatus(Ec2DeepInspectionStatus status) {
        this.status = status.toString();
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MemberAccountEc2DeepInspectionStatusState == false)
            return false;
        MemberAccountEc2DeepInspectionStatusState other = (MemberAccountEc2DeepInspectionStatusState) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MemberAccountEc2DeepInspectionStatusState clone() {
        try {
            return (MemberAccountEc2DeepInspectionStatusState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.MemberAccountEc2DeepInspectionStatusStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
