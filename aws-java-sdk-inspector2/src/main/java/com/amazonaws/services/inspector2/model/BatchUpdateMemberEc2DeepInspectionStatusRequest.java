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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/BatchUpdateMemberEc2DeepInspectionStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchUpdateMemberEc2DeepInspectionStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status
     * for.
     * </p>
     */
    private java.util.List<MemberAccountEc2DeepInspectionStatus> accountIds;

    /**
     * <p>
     * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status
     * for.
     * </p>
     * 
     * @return The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection
     *         status for.
     */

    public java.util.List<MemberAccountEc2DeepInspectionStatus> getAccountIds() {
        return accountIds;
    }

    /**
     * <p>
     * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status
     * for.
     * </p>
     * 
     * @param accountIds
     *        The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection
     *        status for.
     */

    public void setAccountIds(java.util.Collection<MemberAccountEc2DeepInspectionStatus> accountIds) {
        if (accountIds == null) {
            this.accountIds = null;
            return;
        }

        this.accountIds = new java.util.ArrayList<MemberAccountEc2DeepInspectionStatus>(accountIds);
    }

    /**
     * <p>
     * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status
     * for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIds(java.util.Collection)} or {@link #withAccountIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountIds
     *        The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection
     *        status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusRequest withAccountIds(MemberAccountEc2DeepInspectionStatus... accountIds) {
        if (this.accountIds == null) {
            setAccountIds(new java.util.ArrayList<MemberAccountEc2DeepInspectionStatus>(accountIds.length));
        }
        for (MemberAccountEc2DeepInspectionStatus ele : accountIds) {
            this.accountIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection status
     * for.
     * </p>
     * 
     * @param accountIds
     *        The unique identifiers for the Amazon Web Services accounts to change Amazon Inspector deep inspection
     *        status for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchUpdateMemberEc2DeepInspectionStatusRequest withAccountIds(java.util.Collection<MemberAccountEc2DeepInspectionStatus> accountIds) {
        setAccountIds(accountIds);
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
            sb.append("AccountIds: ").append(getAccountIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchUpdateMemberEc2DeepInspectionStatusRequest == false)
            return false;
        BatchUpdateMemberEc2DeepInspectionStatusRequest other = (BatchUpdateMemberEc2DeepInspectionStatusRequest) obj;
        if (other.getAccountIds() == null ^ this.getAccountIds() == null)
            return false;
        if (other.getAccountIds() != null && other.getAccountIds().equals(this.getAccountIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIds() == null) ? 0 : getAccountIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchUpdateMemberEc2DeepInspectionStatusRequest clone() {
        return (BatchUpdateMemberEc2DeepInspectionStatusRequest) super.clone();
    }

}
