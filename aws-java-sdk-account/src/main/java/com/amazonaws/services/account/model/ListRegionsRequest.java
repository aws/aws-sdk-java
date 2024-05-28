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
package com.amazonaws.services.account.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/account-2021-02-01/ListRegions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRegionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The total number of items to return in the command’s output. If the total number of items available is more than
     * the value specified, a <code>NextToken</code> is provided in the command’s output. To resume pagination, provide
     * the <code>NextToken</code> value in the <code>starting-token</code> argument of a subsequent command. Do not use
     * the <code>NextToken</code> response element directly outside of the Amazon Web Services CLI. For usage examples,
     * see <a href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously truncated
     * response. For usage examples, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     */
    private java.util.List<String> regionOptStatusContains;

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

    public ListRegionsRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The total number of items to return in the command’s output. If the total number of items available is more than
     * the value specified, a <code>NextToken</code> is provided in the command’s output. To resume pagination, provide
     * the <code>NextToken</code> value in the <code>starting-token</code> argument of a subsequent command. Do not use
     * the <code>NextToken</code> response element directly outside of the Amazon Web Services CLI. For usage examples,
     * see <a href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the command’s output. If the total number of items available is
     *        more than the value specified, a <code>NextToken</code> is provided in the command’s output. To resume
     *        pagination, provide the <code>NextToken</code> value in the <code>starting-token</code> argument of a
     *        subsequent command. Do not use the <code>NextToken</code> response element directly outside of the Amazon
     *        Web Services CLI. For usage examples, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     *        Services Command Line Interface User Guide</i>.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command’s output. If the total number of items available is more than
     * the value specified, a <code>NextToken</code> is provided in the command’s output. To resume pagination, provide
     * the <code>NextToken</code> value in the <code>starting-token</code> argument of a subsequent command. Do not use
     * the <code>NextToken</code> response element directly outside of the Amazon Web Services CLI. For usage examples,
     * see <a href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @return The total number of items to return in the command’s output. If the total number of items available is
     *         more than the value specified, a <code>NextToken</code> is provided in the command’s output. To resume
     *         pagination, provide the <code>NextToken</code> value in the <code>starting-token</code> argument of a
     *         subsequent command. Do not use the <code>NextToken</code> response element directly outside of the Amazon
     *         Web Services CLI. For usage examples, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon
     *         Web Services Command Line Interface User Guide</i>.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of items to return in the command’s output. If the total number of items available is more than
     * the value specified, a <code>NextToken</code> is provided in the command’s output. To resume pagination, provide
     * the <code>NextToken</code> value in the <code>starting-token</code> argument of a subsequent command. Do not use
     * the <code>NextToken</code> response element directly outside of the Amazon Web Services CLI. For usage examples,
     * see <a href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @param maxResults
     *        The total number of items to return in the command’s output. If the total number of items available is
     *        more than the value specified, a <code>NextToken</code> is provided in the command’s output. To resume
     *        pagination, provide the <code>NextToken</code> value in the <code>starting-token</code> argument of a
     *        subsequent command. Do not use the <code>NextToken</code> response element directly outside of the Amazon
     *        Web Services CLI. For usage examples, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     *        Services Command Line Interface User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously truncated
     * response. For usage examples, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @param nextToken
     *        A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously
     *        truncated response. For usage examples, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     *        Services Command Line Interface User Guide</i>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously truncated
     * response. For usage examples, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @return A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously
     *         truncated response. For usage examples, see <a
     *         href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon
     *         Web Services Command Line Interface User Guide</i>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously truncated
     * response. For usage examples, see <a
     * href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     * Services Command Line Interface User Guide</i>.
     * </p>
     * 
     * @param nextToken
     *        A token used to specify where to start paginating. This is the <code>NextToken</code> from a previously
     *        truncated response. For usage examples, see <a
     *        href="http://docs.aws.amazon.com/cli/latest/userguide/pagination.html">Pagination</a> in the <i>Amazon Web
     *        Services Command Line Interface User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRegionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     * 
     * @return A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter
     *         the list of Regions for a given account. For example, passing in a value of ENABLING will only return a
     *         list of Regions with a Region status of ENABLING.
     * @see RegionOptStatus
     */

    public java.util.List<String> getRegionOptStatusContains() {
        return regionOptStatusContains;
    }

    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     * 
     * @param regionOptStatusContains
     *        A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter
     *        the list of Regions for a given account. For example, passing in a value of ENABLING will only return a
     *        list of Regions with a Region status of ENABLING.
     * @see RegionOptStatus
     */

    public void setRegionOptStatusContains(java.util.Collection<String> regionOptStatusContains) {
        if (regionOptStatusContains == null) {
            this.regionOptStatusContains = null;
            return;
        }

        this.regionOptStatusContains = new java.util.ArrayList<String>(regionOptStatusContains);
    }

    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegionOptStatusContains(java.util.Collection)} or
     * {@link #withRegionOptStatusContains(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param regionOptStatusContains
     *        A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter
     *        the list of Regions for a given account. For example, passing in a value of ENABLING will only return a
     *        list of Regions with a Region status of ENABLING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionOptStatus
     */

    public ListRegionsRequest withRegionOptStatusContains(String... regionOptStatusContains) {
        if (this.regionOptStatusContains == null) {
            setRegionOptStatusContains(new java.util.ArrayList<String>(regionOptStatusContains.length));
        }
        for (String ele : regionOptStatusContains) {
            this.regionOptStatusContains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     * 
     * @param regionOptStatusContains
     *        A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter
     *        the list of Regions for a given account. For example, passing in a value of ENABLING will only return a
     *        list of Regions with a Region status of ENABLING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionOptStatus
     */

    public ListRegionsRequest withRegionOptStatusContains(java.util.Collection<String> regionOptStatusContains) {
        setRegionOptStatusContains(regionOptStatusContains);
        return this;
    }

    /**
     * <p>
     * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list
     * of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions
     * with a Region status of ENABLING.
     * </p>
     * 
     * @param regionOptStatusContains
     *        A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter
     *        the list of Regions for a given account. For example, passing in a value of ENABLING will only return a
     *        list of Regions with a Region status of ENABLING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegionOptStatus
     */

    public ListRegionsRequest withRegionOptStatusContains(RegionOptStatus... regionOptStatusContains) {
        java.util.ArrayList<String> regionOptStatusContainsCopy = new java.util.ArrayList<String>(regionOptStatusContains.length);
        for (RegionOptStatus value : regionOptStatusContains) {
            regionOptStatusContainsCopy.add(value.toString());
        }
        if (getRegionOptStatusContains() == null) {
            setRegionOptStatusContains(regionOptStatusContainsCopy);
        } else {
            getRegionOptStatusContains().addAll(regionOptStatusContainsCopy);
        }
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRegionOptStatusContains() != null)
            sb.append("RegionOptStatusContains: ").append(getRegionOptStatusContains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRegionsRequest == false)
            return false;
        ListRegionsRequest other = (ListRegionsRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRegionOptStatusContains() == null ^ this.getRegionOptStatusContains() == null)
            return false;
        if (other.getRegionOptStatusContains() != null && other.getRegionOptStatusContains().equals(this.getRegionOptStatusContains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRegionOptStatusContains() == null) ? 0 : getRegionOptStatusContains().hashCode());
        return hashCode;
    }

    @Override
    public ListRegionsRequest clone() {
        return (ListRegionsRequest) super.clone();
    }

}
