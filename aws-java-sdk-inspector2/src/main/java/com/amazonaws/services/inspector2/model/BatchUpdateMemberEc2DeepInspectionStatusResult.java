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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchUpdateMemberEc2DeepInspectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateMemberEc2DeepInspectionStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * was successfully changed for.
     * </p>
     */
    private java.util.List<MemberAccountEc2DeepInspectionStatusState> accountIds;
    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * could not be successfully changed for.
     * </p>
     */
    private java.util.List<FailedMemberAccountEc2DeepInspectionStatusState> failedAccountIds;

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * was successfully changed for.
     * </p>
     * 
     * @return An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *         status was successfully changed for.
     */

    public java.util.List<MemberAccountEc2DeepInspectionStatusState> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * was successfully changed for.
     * </p>
     * 
     * @param accountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status was successfully changed for.
     */

    public void setAccountIds(java.util.Collection<MemberAccountEc2DeepInspectionStatusState> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<MemberAccountEc2DeepInspectionStatusState>(accountIds);
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * was successfully changed for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status was successfully changed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusResult withAccountIds(MemberAccountEc2DeepInspectionStatusState... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<MemberAccountEc2DeepInspectionStatusState>(accountIds.length));
        }
        for (MemberAccountEc2DeepInspectionStatusState ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * was successfully changed for.
     * </p>
     * 
     * @param accountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status was successfully changed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusResult withAccountIds(java.util.Collection<MemberAccountEc2DeepInspectionStatusState> accountIds) {
        setAccountIds(accountIds);
        return this;
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * could not be successfully changed for.
     * </p>
     * 
     * @return An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *         status could not be successfully changed for.
     */

    public java.util.List<FailedMemberAccountEc2DeepInspectionStatusState> getFailedAccountIds() {
        return failedAccountIds;
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * could not be successfully changed for.
     * </p>
     * 
     * @param failedAccountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status could not be successfully changed for.
     */

    public void setFailedAccountIds(java.util.Collection<FailedMemberAccountEc2DeepInspectionStatusState> failedAccountIds) {
        if (failedAccountIds == null) {
            this.failedAccountIds = null;
            return;
        }

        this.failedAccountIds = new java.util.ArrayList<FailedMemberAccountEc2DeepInspectionStatusState>(failedAccountIds);
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * could not be successfully changed for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedAccountIds(java.util.Collection)} or {@link #withFailedAccountIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param failedAccountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status could not be successfully changed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusResult withFailedAccountIds(FailedMemberAccountEc2DeepInspectionStatusState... failedAccountIds) {
        if (this.failedAccountIds == null) {
            setFailedAccountIds(new java.util.ArrayList<FailedMemberAccountEc2DeepInspectionStatusState>(failedAccountIds.length));
        }
        for (FailedMemberAccountEc2DeepInspectionStatusState ele : failedAccountIds) {
            this.failedAccountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection status
     * could not be successfully changed for.
     * </p>
     * 
     * @param failedAccountIds
     *        An array of objects that provide details for each of the accounts that Amazon Inspector deep inspection
     *        status could not be successfully changed for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusResult withFailedAccountIds(
            java.util.Collection<FailedMemberAccountEc2DeepInspectionStatusState> failedAccountIds) {
        setFailedAccountIds(failedAccountIds);
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
        if (getAccountIds() != null)
            sb.append("AccountIds: ").append(getAccountIds()).append(",");
        if (getFailedAccountIds() != null)
            sb.append("FailedAccountIds: ").append(getFailedAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateMemberEc2DeepInspectionStatusResult == false)
            return false;
        BatchUpdateMemberEc2DeepInspectionStatusResult other = (BatchUpdateMemberEc2DeepInspectionStatusResult) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        if (other.getFailedAccountIds() == null ^ this.getFailedAccountIds() == null)
            return false;
        if (other.getFailedAccountIds() != null && other.getFailedAccountIds().equals(this.getFailedAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        hashCode = prime * hashCode + ((getFailedAccountIds() == null) ? 0 : getFailedAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateMemberEc2DeepInspectionStatusResult clone() {
        try {
            return (BatchUpdateMemberEc2DeepInspectionStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
