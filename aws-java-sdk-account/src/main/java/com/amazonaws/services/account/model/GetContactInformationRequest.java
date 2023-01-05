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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/GetContactInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactInformationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the
     * identity used to call the operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must also
     * be a member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>. It must call the operation in standalone
     * context by not including the <code>AccountId</code> parameter.
     * </p>
     * </note>
     * <p>
     * To call this operation on an account that is not a member of an organization, don't specify this parameter.
     * Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or
     * modify.
     * </p>
     */
    private String accountId;

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the
     * identity used to call the operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must also
     * be a member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>. It must call the operation in standalone
     * context by not including the <code>AccountId</code> parameter.
     * </p>
     * </note>
     * <p>
     * To call this operation on an account that is not a member of an organization, don't specify this parameter.
     * Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or
     * modify.
     * </p>
     * 
     * @param accountId
     *        Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *        modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services
     *        account of the identity used to call the operation. To use this parameter, the caller must be an identity
     *        in the <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *        >organization's management account</a> or a delegated administrator account. The specified account ID must
     *        also be a member account in the same organization. The organization must have <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     *        features enabled</a>, and the organization must have <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *        access</a> enabled for the Account Management service, and optionally a <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *        >delegated admin</a> account assigned.</p> <note>
     *        <p>
     *        The management account can't specify its own <code>AccountId</code>. It must call the operation in
     *        standalone context by not including the <code>AccountId</code> parameter.
     *        </p>
     *        </note>
     *        <p>
     *        To call this operation on an account that is not a member of an organization, don't specify this
     *        parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish
     *        to retrieve or modify.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the
     * identity used to call the operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must also
     * be a member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>. It must call the operation in standalone
     * context by not including the <code>AccountId</code> parameter.
     * </p>
     * </note>
     * <p>
     * To call this operation on an account that is not a member of an organization, don't specify this parameter.
     * Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or
     * modify.
     * </p>
     * 
     * @return Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *         modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services
     *         account of the identity used to call the operation. To use this parameter, the caller must be an identity
     *         in the <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *         >organization's management account</a> or a delegated administrator account. The specified account ID
     *         must also be a member account in the same organization. The organization must have <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html"
     *         >all features enabled</a>, and the organization must have <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *         access</a> enabled for the Account Management service, and optionally a <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *         >delegated admin</a> account assigned.</p> <note>
     *         <p>
     *         The management account can't specify its own <code>AccountId</code>. It must call the operation in
     *         standalone context by not including the <code>AccountId</code> parameter.
     *         </p>
     *         </note>
     *         <p>
     *         To call this operation on an account that is not a member of an organization, don't specify this
     *         parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish
     *         to retrieve or modify.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify
     * with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the
     * identity used to call the operation. To use this parameter, the caller must be an identity in the <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     * >organization's management account</a> or a delegated administrator account. The specified account ID must also
     * be a member account in the same organization. The organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     * features enabled</a>, and the organization must have <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     * access</a> enabled for the Account Management service, and optionally a <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html">delegated
     * admin</a> account assigned.
     * </p>
     * <note>
     * <p>
     * The management account can't specify its own <code>AccountId</code>. It must call the operation in standalone
     * context by not including the <code>AccountId</code> parameter.
     * </p>
     * </note>
     * <p>
     * To call this operation on an account that is not a member of an organization, don't specify this parameter.
     * Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or
     * modify.
     * </p>
     * 
     * @param accountId
     *        Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or
     *        modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services
     *        account of the identity used to call the operation. To use this parameter, the caller must be an identity
     *        in the <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html#account"
     *        >organization's management account</a> or a delegated administrator account. The specified account ID must
     *        also be a member account in the same organization. The organization must have <a href=
     *        "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_org_support-all-features.html">all
     *        features enabled</a>, and the organization must have <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-trusted-access.html">trusted
     *        access</a> enabled for the Account Management service, and optionally a <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/using-orgs-delegated-admin.html"
     *        >delegated admin</a> account assigned.</p> <note>
     *        <p>
     *        The management account can't specify its own <code>AccountId</code>. It must call the operation in
     *        standalone context by not including the <code>AccountId</code> parameter.
     *        </p>
     *        </note>
     *        <p>
     *        To call this operation on an account that is not a member of an organization, don't specify this
     *        parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish
     *        to retrieve or modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetContactInformationRequest withAccountId(String accountId) {
        setAccountId(accountId);
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
            sb.append("AccountId: ").append(getAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactInformationRequest == false)
            return false;
        GetContactInformationRequest other = (GetContactInformationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        return hashCode;
    }

    @Override
    public GetContactInformationRequest clone() {
        return (GetContactInformationRequest) super.clone();
    }

}
