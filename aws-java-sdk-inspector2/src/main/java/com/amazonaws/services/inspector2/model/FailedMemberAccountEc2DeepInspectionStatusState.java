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
 * An object that contains details about a member account in your organization that failed to activate Amazon Inspector
 * deep inspection.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/FailedMemberAccountEc2DeepInspectionStatusState"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FailedMemberAccountEc2DeepInspectionStatusState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member that failed to activate
     * Amazon Inspector deep inspection.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * </p>
     */
    private String ec2ScanStatus;
    /**
     * <p>
     * The error message explaining why the account failed to activate Amazon Inspector deep inspection.
     * </p>
     */
    private String errorMessage;

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member that failed to activate
     * Amazon Inspector deep inspection.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member that failed to
     *        activate Amazon Inspector deep inspection.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member that failed to activate
     * Amazon Inspector deep inspection.
     * </p>
     * 
     * @return The unique identifier for the Amazon Web Services account of the organization member that failed to
     *         activate Amazon Inspector deep inspection.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The unique identifier for the Amazon Web Services account of the organization member that failed to activate
     * Amazon Inspector deep inspection.
     * </p>
     * 
     * @param accountId
     *        The unique identifier for the Amazon Web Services account of the organization member that failed to
     *        activate Amazon Inspector deep inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FailedMemberAccountEc2DeepInspectionStatusState withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @param ec2ScanStatus
     *        The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * @see Status
     */

    public void setEc2ScanStatus(String ec2ScanStatus) {
        this.ec2ScanStatus = ec2ScanStatus;
    }

    /**
     * <p>
     * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @return The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * @see Status
     */

    public String getEc2ScanStatus() {
        return this.ec2ScanStatus;
    }

    /**
     * <p>
     * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @param ec2ScanStatus
     *        The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public FailedMemberAccountEc2DeepInspectionStatusState withEc2ScanStatus(String ec2ScanStatus) {
        setEc2ScanStatus(ec2ScanStatus);
        return this;
    }

    /**
     * <p>
     * The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * </p>
     * 
     * @param ec2ScanStatus
     *        The status of EC2 scanning in the account that failed to activate Amazon Inspector deep inspection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public FailedMemberAccountEc2DeepInspectionStatusState withEc2ScanStatus(Status ec2ScanStatus) {
        this.ec2ScanStatus = ec2ScanStatus.toString();
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

    public FailedMemberAccountEc2DeepInspectionStatusState withErrorMessage(String errorMessage) {
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getEc2ScanStatus() != null)
            sb.append("Ec2ScanStatus: ").append(getEc2ScanStatus()).append(",");
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

        if (obj instanceof FailedMemberAccountEc2DeepInspectionStatusState == false)
            return false;
        FailedMemberAccountEc2DeepInspectionStatusState other = (FailedMemberAccountEc2DeepInspectionStatusState) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getEc2ScanStatus() == null ^ this.getEc2ScanStatus() == null)
            return false;
        if (other.getEc2ScanStatus() != null && other.getEc2ScanStatus().equals(this.getEc2ScanStatus()) == false)
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

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getEc2ScanStatus() == null) ? 0 : getEc2ScanStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        return hashCode;
    }

    @Override
    public FailedMemberAccountEc2DeepInspectionStatusState clone() {
        try {
            return (FailedMemberAccountEc2DeepInspectionStatusState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.FailedMemberAccountEc2DeepInspectionStatusStateMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
