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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * CreateMembers request body.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CreateMembers" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMembersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty
     * account.
     */
    private java.util.List<AccountDetail> accountDetails;
    /** The unique ID of the detector of the GuardDuty account with which you want to associate member accounts. */
    private String detectorId;

    /**
     * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty
     * account.
     * 
     * @return A list of account ID and email address pairs of the accounts that you want to associate with the master
     *         GuardDuty account.
     */

    public java.util.List<AccountDetail> getAccountDetails() {
        return accountDetails;
    }

    /**
     * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty
     * account.
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the master
     *        GuardDuty account.
     */

    public void setAccountDetails(java.util.Collection<AccountDetail> accountDetails) {
        if (accountDetails == null) {
            this.accountDetails = null;
            return;
        }

        this.accountDetails = new java.util.ArrayList<AccountDetail>(accountDetails);
    }

    /**
     * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty
     * account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountDetails(java.util.Collection)} or {@link #withAccountDetails(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the master
     *        GuardDuty account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccountDetails(AccountDetail... accountDetails) {
        if (this.accountDetails == null) {
            setAccountDetails(new java.util.ArrayList<AccountDetail>(accountDetails.length));
        }
        for (AccountDetail ele : accountDetails) {
            this.accountDetails.add(ele);
        }
        return this;
    }

    /**
     * A list of account ID and email address pairs of the accounts that you want to associate with the master GuardDuty
     * account.
     * 
     * @param accountDetails
     *        A list of account ID and email address pairs of the accounts that you want to associate with the master
     *        GuardDuty account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withAccountDetails(java.util.Collection<AccountDetail> accountDetails) {
        setAccountDetails(accountDetails);
        return this;
    }

    /**
     * The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     */

    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     * 
     * @return The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     */

    public String getDetectorId() {
        return this.detectorId;
    }

    /**
     * The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     * 
     * @param detectorId
     *        The unique ID of the detector of the GuardDuty account with which you want to associate member accounts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMembersRequest withDetectorId(String detectorId) {
        setDetectorId(detectorId);
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
        if (getAccountDetails() != null)
            sb.append("AccountDetails: ").append(getAccountDetails()).append(",");
        if (getDetectorId() != null)
            sb.append("DetectorId: ").append(getDetectorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMembersRequest == false)
            return false;
        CreateMembersRequest other = (CreateMembersRequest) obj;
        if (other.getAccountDetails() == null ^ this.getAccountDetails() == null)
            return false;
        if (other.getAccountDetails() != null && other.getAccountDetails().equals(this.getAccountDetails()) == false)
            return false;
        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountDetails() == null) ? 0 : getAccountDetails().hashCode());
        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        return hashCode;
    }

    @Override
    public CreateMembersRequest clone() {
        return (CreateMembersRequest) super.clone();
    }

}
