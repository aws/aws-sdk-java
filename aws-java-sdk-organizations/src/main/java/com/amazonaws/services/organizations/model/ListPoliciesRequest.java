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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ListPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     */
    private String filter;
    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Organizations might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        Specifies the type of policy that you want to include in the response. You must specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @see PolicyType
     */

    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the type of policy that you want to include in the response. You must specify one of the
     *         following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <a
     *         href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *         AISERVICES_OPT_OUT_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *         BACKUP_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *         SERVICE_CONTROL_POLICY</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <a href=
     *         "https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *         >TAG_POLICY</a>
     *         </p>
     *         </li>
     * @see PolicyType
     */

    public String getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        Specifies the type of policy that you want to include in the response. You must specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ListPoliciesRequest withFilter(String filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        Specifies the type of policy that you want to include in the response. You must specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @see PolicyType
     */

    public void setFilter(PolicyType filter) {
        withFilter(filter);
    }

    /**
     * <p>
     * Specifies the type of policy that you want to include in the response. You must specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     * AISERVICES_OPT_OUT_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     * BACKUP_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     * SERVICE_CONTROL_POLICY</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html">
     * TAG_POLICY</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        Specifies the type of policy that you want to include in the response. You must specify one of the
     *        following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_ai-opt-out.html">
     *        AISERVICES_OPT_OUT_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_backup.html">
     *        BACKUP_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_scp.html">
     *        SERVICE_CONTROL_POLICY</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <a
     *        href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_policies_tag-policies.html"
     *        >TAG_POLICY</a>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyType
     */

    public ListPoliciesRequest withFilter(PolicyType filter) {
        this.filter = filter.toString();
        return this;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @return The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *         previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *         parameter to the value of the previous call's <code>NextToken</code> response to indicate where the
     *         output should continue from.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The parameter for receiving additional results if you receive a <code>NextToken</code> response in a previous
     * request. A <code>NextToken</code> response indicates that more output is available. Set this parameter to the
     * value of the previous call's <code>NextToken</code> response to indicate where the output should continue from.
     * </p>
     * 
     * @param nextToken
     *        The parameter for receiving additional results if you receive a <code>NextToken</code> response in a
     *        previous request. A <code>NextToken</code> response indicates that more output is available. Set this
     *        parameter to the value of the previous call's <code>NextToken</code> response to indicate where the output
     *        should continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Organizations might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that Organizations might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Organizations might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @return The total number of results that you want included on each page of the response. If you do not include
     *         this parameter, it defaults to a value that is specific to the operation. If additional items exist
     *         beyond the maximum you specify, the <code>NextToken</code> response element is present and has a value
     *         (is not null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *         operation to get the next part of the results. Note that Organizations might return fewer results than
     *         the maximum even when there are more results available. You should check <code>NextToken</code> after
     *         every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The total number of results that you want included on each page of the response. If you do not include this
     * parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum
     * you specify, the <code>NextToken</code> response element is present and has a value (is not null). Include that
     * value as the <code>NextToken</code> request parameter in the next call to the operation to get the next part of
     * the results. Note that Organizations might return fewer results than the maximum even when there are more results
     * available. You should check <code>NextToken</code> after every operation to ensure that you receive all of the
     * results.
     * </p>
     * 
     * @param maxResults
     *        The total number of results that you want included on each page of the response. If you do not include
     *        this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond
     *        the maximum you specify, the <code>NextToken</code> response element is present and has a value (is not
     *        null). Include that value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next part of the results. Note that Organizations might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPoliciesRequest == false)
            return false;
        ListPoliciesRequest other = (ListPoliciesRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesRequest clone() {
        return (ListPoliciesRequest) super.clone();
    }

}
