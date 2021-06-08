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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/GetMemberDetectors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetMemberDetectorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes which data sources are enabled for a member account.
     * </p>
     */
    private java.util.List<MemberDataSourceConfiguration> memberDataSourceConfigurations;
    /**
     * <p>
     * A list of member account IDs that were unable to be processed along with an explanation for why they were not
     * processed.
     * </p>
     */
    private java.util.List<UnprocessedAccount> unprocessedAccounts;

    /**
     * <p>
     * An object that describes which data sources are enabled for a member account.
     * </p>
     * 
     * @return An object that describes which data sources are enabled for a member account.
     */

    public java.util.List<MemberDataSourceConfiguration> getMemberDataSourceConfigurations() {
        return memberDataSourceConfigurations;
    }

    /**
     * <p>
     * An object that describes which data sources are enabled for a member account.
     * </p>
     * 
     * @param memberDataSourceConfigurations
     *        An object that describes which data sources are enabled for a member account.
     */

    public void setMemberDataSourceConfigurations(java.util.Collection<MemberDataSourceConfiguration> memberDataSourceConfigurations) {
        if (memberDataSourceConfigurations == null) {
            this.memberDataSourceConfigurations = null;
            return;
        }

        this.memberDataSourceConfigurations = new java.util.ArrayList<MemberDataSourceConfiguration>(memberDataSourceConfigurations);
    }

    /**
     * <p>
     * An object that describes which data sources are enabled for a member account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMemberDataSourceConfigurations(java.util.Collection)} or
     * {@link #withMemberDataSourceConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param memberDataSourceConfigurations
     *        An object that describes which data sources are enabled for a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberDetectorsResult withMemberDataSourceConfigurations(MemberDataSourceConfiguration... memberDataSourceConfigurations) {
        if (this.memberDataSourceConfigurations == null) {
            setMemberDataSourceConfigurations(new java.util.ArrayList<MemberDataSourceConfiguration>(memberDataSourceConfigurations.length));
        }
        for (MemberDataSourceConfiguration ele : memberDataSourceConfigurations) {
            this.memberDataSourceConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An object that describes which data sources are enabled for a member account.
     * </p>
     * 
     * @param memberDataSourceConfigurations
     *        An object that describes which data sources are enabled for a member account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberDetectorsResult withMemberDataSourceConfigurations(java.util.Collection<MemberDataSourceConfiguration> memberDataSourceConfigurations) {
        setMemberDataSourceConfigurations(memberDataSourceConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of member account IDs that were unable to be processed along with an explanation for why they were not
     * processed.
     * </p>
     * 
     * @return A list of member account IDs that were unable to be processed along with an explanation for why they were
     *         not processed.
     */

    public java.util.List<UnprocessedAccount> getUnprocessedAccounts() {
        return unprocessedAccounts;
    }

    /**
     * <p>
     * A list of member account IDs that were unable to be processed along with an explanation for why they were not
     * processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of member account IDs that were unable to be processed along with an explanation for why they were
     *        not processed.
     */

    public void setUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        if (unprocessedAccounts == null) {
            this.unprocessedAccounts = null;
            return;
        }

        this.unprocessedAccounts = new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts);
    }

    /**
     * <p>
     * A list of member account IDs that were unable to be processed along with an explanation for why they were not
     * processed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUnprocessedAccounts(java.util.Collection)} or {@link #withUnprocessedAccounts(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of member account IDs that were unable to be processed along with an explanation for why they were
     *        not processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberDetectorsResult withUnprocessedAccounts(UnprocessedAccount... unprocessedAccounts) {
        if (this.unprocessedAccounts == null) {
            setUnprocessedAccounts(new java.util.ArrayList<UnprocessedAccount>(unprocessedAccounts.length));
        }
        for (UnprocessedAccount ele : unprocessedAccounts) {
            this.unprocessedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of member account IDs that were unable to be processed along with an explanation for why they were not
     * processed.
     * </p>
     * 
     * @param unprocessedAccounts
     *        A list of member account IDs that were unable to be processed along with an explanation for why they were
     *        not processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetMemberDetectorsResult withUnprocessedAccounts(java.util.Collection<UnprocessedAccount> unprocessedAccounts) {
        setUnprocessedAccounts(unprocessedAccounts);
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
        if (getMemberDataSourceConfigurations() != null)
            sb.append("MemberDataSourceConfigurations: ").append(getMemberDataSourceConfigurations()).append(",");
        if (getUnprocessedAccounts() != null)
            sb.append("UnprocessedAccounts: ").append(getUnprocessedAccounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetMemberDetectorsResult == false)
            return false;
        GetMemberDetectorsResult other = (GetMemberDetectorsResult) obj;
        if (other.getMemberDataSourceConfigurations() == null ^ this.getMemberDataSourceConfigurations() == null)
            return false;
        if (other.getMemberDataSourceConfigurations() != null
                && other.getMemberDataSourceConfigurations().equals(this.getMemberDataSourceConfigurations()) == false)
            return false;
        if (other.getUnprocessedAccounts() == null ^ this.getUnprocessedAccounts() == null)
            return false;
        if (other.getUnprocessedAccounts() != null && other.getUnprocessedAccounts().equals(this.getUnprocessedAccounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMemberDataSourceConfigurations() == null) ? 0 : getMemberDataSourceConfigurations().hashCode());
        hashCode = prime * hashCode + ((getUnprocessedAccounts() == null) ? 0 : getUnprocessedAccounts().hashCode());
        return hashCode;
    }

    @Override
    public GetMemberDetectorsResult clone() {
        try {
            return (GetMemberDetectorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
