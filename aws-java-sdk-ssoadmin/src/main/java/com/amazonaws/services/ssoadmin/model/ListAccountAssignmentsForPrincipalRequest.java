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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListAccountAssignmentsForPrincipal"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountAssignmentsForPrincipalRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID number.
     * </p>
     */
    private ListAccountAssignmentsFilter filter;
    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Specifies the principal for which you want to retrieve the list of account assignments.
     * </p>
     */
    private String principalId;
    /**
     * <p>
     * Specifies the type of the principal.
     * </p>
     */
    private String principalType;

    /**
     * <p>
     * Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID number.
     * </p>
     * 
     * @param filter
     *        Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID
     *        number.
     */

    public void setFilter(ListAccountAssignmentsFilter filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID number.
     * </p>
     * 
     * @return Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID
     *         number.
     */

    public ListAccountAssignmentsFilter getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID number.
     * </p>
     * 
     * @param filter
     *        Specifies an Amazon Web Services account ID number. Results are filtered to only those that match this ID
     *        number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalRequest withFilter(ListAccountAssignmentsFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     * </p>
     * 
     * @return Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center that contains the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included in each response. If additional items exist
     *        beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *        null). Include the specified value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next set of results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included in each response. If additional items exist
     *         beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *         null). Include the specified value as the <code>NextToken</code> request parameter in the next call to
     *         the operation to get the next set of results. Note that the service might return fewer results than the
     *         maximum even when there are more results available. You should check <code>NextToken</code> after every
     *         operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included in each response. If additional items exist
     *        beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *        null). Include the specified value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next set of results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the principal for which you want to retrieve the list of account assignments.
     * </p>
     * 
     * @param principalId
     *        Specifies the principal for which you want to retrieve the list of account assignments.
     */

    public void setPrincipalId(String principalId) {
        this.principalId = principalId;
    }

    /**
     * <p>
     * Specifies the principal for which you want to retrieve the list of account assignments.
     * </p>
     * 
     * @return Specifies the principal for which you want to retrieve the list of account assignments.
     */

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * <p>
     * Specifies the principal for which you want to retrieve the list of account assignments.
     * </p>
     * 
     * @param principalId
     *        Specifies the principal for which you want to retrieve the list of account assignments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountAssignmentsForPrincipalRequest withPrincipalId(String principalId) {
        setPrincipalId(principalId);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the principal.
     * </p>
     * 
     * @param principalType
     *        Specifies the type of the principal.
     * @see PrincipalType
     */

    public void setPrincipalType(String principalType) {
        this.principalType = principalType;
    }

    /**
     * <p>
     * Specifies the type of the principal.
     * </p>
     * 
     * @return Specifies the type of the principal.
     * @see PrincipalType
     */

    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * <p>
     * Specifies the type of the principal.
     * </p>
     * 
     * @param principalType
     *        Specifies the type of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public ListAccountAssignmentsForPrincipalRequest withPrincipalType(String principalType) {
        setPrincipalType(principalType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of the principal.
     * </p>
     * 
     * @param principalType
     *        Specifies the type of the principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PrincipalType
     */

    public ListAccountAssignmentsForPrincipalRequest withPrincipalType(PrincipalType principalType) {
        this.principalType = principalType.toString();
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPrincipalId() != null)
            sb.append("PrincipalId: ").append(getPrincipalId()).append(",");
        if (getPrincipalType() != null)
            sb.append("PrincipalType: ").append(getPrincipalType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountAssignmentsForPrincipalRequest == false)
            return false;
        ListAccountAssignmentsForPrincipalRequest other = (ListAccountAssignmentsForPrincipalRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPrincipalId() == null ^ this.getPrincipalId() == null)
            return false;
        if (other.getPrincipalId() != null && other.getPrincipalId().equals(this.getPrincipalId()) == false)
            return false;
        if (other.getPrincipalType() == null ^ this.getPrincipalType() == null)
            return false;
        if (other.getPrincipalType() != null && other.getPrincipalType().equals(this.getPrincipalType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPrincipalId() == null) ? 0 : getPrincipalId().hashCode());
        hashCode = prime * hashCode + ((getPrincipalType() == null) ? 0 : getPrincipalType().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountAssignmentsForPrincipalRequest clone() {
        return (ListAccountAssignmentsForPrincipalRequest) super.clone();
    }

}
