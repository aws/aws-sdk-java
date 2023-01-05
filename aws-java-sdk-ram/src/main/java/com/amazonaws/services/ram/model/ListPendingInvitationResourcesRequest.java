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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListPendingInvitationResources" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPendingInvitationResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN of the
     * invitation.
     * </p>
     */
    private String resourceShareInvitationArn;
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
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies that you want the results to include only resources that have the specified scope.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – the results include both global and regional resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GLOBAL</code> – the results include only global resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL</code> – the results include only regional resources or resource types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default value is <code>ALL</code>.
     * </p>
     */
    private String resourceRegionScope;

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN of the
     * invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN
     *        of the invitation.
     */

    public void setResourceShareInvitationArn(String resourceShareInvitationArn) {
        this.resourceShareInvitationArn = resourceShareInvitationArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN of the
     * invitation.
     * </p>
     * 
     * @return Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resoure Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN
     *         of the invitation.
     */

    public String getResourceShareInvitationArn() {
        return this.resourceShareInvitationArn;
    }

    /**
     * <p>
     * Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resoure
     * Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN of the
     * invitation.
     * </p>
     * 
     * @param resourceShareInvitationArn
     *        Specifies the <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *        Resoure Name (ARN)</a> of the invitation. You can use <a>GetResourceShareInvitations</a> to find the ARN
     *        of the invitation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPendingInvitationResourcesRequest withResourceShareInvitationArn(String resourceShareInvitationArn) {
        setResourceShareInvitationArn(resourceShareInvitationArn);
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

    public ListPendingInvitationResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included on each page of the response. If you do not
     *         include this parameter, it defaults to a value that is specific to the operation. If additional items
     *         exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *         (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *         to the operation to get the next part of the results. Note that the service might return fewer results
     *         than the maximum even when there are more results available. You should check <code>NextToken</code>
     *         after every operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included on each page of the response. If you do not include
     * this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the
     * number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include the
     * specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the next
     * part of the results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included on each page of the response. If you do not
     *        include this parameter, it defaults to a value that is specific to the operation. If additional items
     *        exist beyond the number you specify, the <code>NextToken</code> response element is returned with a value
     *        (not null). Include the specified value as the <code>NextToken</code> request parameter in the next call
     *        to the operation to get the next part of the results. Note that the service might return fewer results
     *        than the maximum even when there are more results available. You should check <code>NextToken</code> after
     *        every operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPendingInvitationResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies that you want the results to include only resources that have the specified scope.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – the results include both global and regional resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GLOBAL</code> – the results include only global resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL</code> – the results include only regional resources or resource types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default value is <code>ALL</code>.
     * </p>
     * 
     * @param resourceRegionScope
     *        Specifies that you want the results to include only resources that have the specified scope.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – the results include both global and regional resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GLOBAL</code> – the results include only global resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL</code> – the results include only regional resources or resource types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default value is <code>ALL</code>.
     * @see ResourceRegionScopeFilter
     */

    public void setResourceRegionScope(String resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope;
    }

    /**
     * <p>
     * Specifies that you want the results to include only resources that have the specified scope.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – the results include both global and regional resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GLOBAL</code> – the results include only global resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL</code> – the results include only regional resources or resource types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default value is <code>ALL</code>.
     * </p>
     * 
     * @return Specifies that you want the results to include only resources that have the specified scope.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALL</code> – the results include both global and regional resources or resource types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GLOBAL</code> – the results include only global resources or resource types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>REGIONAL</code> – the results include only regional resources or resource types.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The default value is <code>ALL</code>.
     * @see ResourceRegionScopeFilter
     */

    public String getResourceRegionScope() {
        return this.resourceRegionScope;
    }

    /**
     * <p>
     * Specifies that you want the results to include only resources that have the specified scope.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – the results include both global and regional resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GLOBAL</code> – the results include only global resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL</code> – the results include only regional resources or resource types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default value is <code>ALL</code>.
     * </p>
     * 
     * @param resourceRegionScope
     *        Specifies that you want the results to include only resources that have the specified scope.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – the results include both global and regional resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GLOBAL</code> – the results include only global resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL</code> – the results include only regional resources or resource types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default value is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScopeFilter
     */

    public ListPendingInvitationResourcesRequest withResourceRegionScope(String resourceRegionScope) {
        setResourceRegionScope(resourceRegionScope);
        return this;
    }

    /**
     * <p>
     * Specifies that you want the results to include only resources that have the specified scope.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALL</code> – the results include both global and regional resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GLOBAL</code> – the results include only global resources or resource types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>REGIONAL</code> – the results include only regional resources or resource types.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The default value is <code>ALL</code>.
     * </p>
     * 
     * @param resourceRegionScope
     *        Specifies that you want the results to include only resources that have the specified scope.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALL</code> – the results include both global and regional resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GLOBAL</code> – the results include only global resources or resource types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>REGIONAL</code> – the results include only regional resources or resource types.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The default value is <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScopeFilter
     */

    public ListPendingInvitationResourcesRequest withResourceRegionScope(ResourceRegionScopeFilter resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope.toString();
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
        if (getResourceShareInvitationArn() != null)
            sb.append("ResourceShareInvitationArn: ").append(getResourceShareInvitationArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getResourceRegionScope() != null)
            sb.append("ResourceRegionScope: ").append(getResourceRegionScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPendingInvitationResourcesRequest == false)
            return false;
        ListPendingInvitationResourcesRequest other = (ListPendingInvitationResourcesRequest) obj;
        if (other.getResourceShareInvitationArn() == null ^ this.getResourceShareInvitationArn() == null)
            return false;
        if (other.getResourceShareInvitationArn() != null && other.getResourceShareInvitationArn().equals(this.getResourceShareInvitationArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getResourceRegionScope() == null ^ this.getResourceRegionScope() == null)
            return false;
        if (other.getResourceRegionScope() != null && other.getResourceRegionScope().equals(this.getResourceRegionScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceShareInvitationArn() == null) ? 0 : getResourceShareInvitationArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResourceRegionScope() == null) ? 0 : getResourceRegionScope().hashCode());
        return hashCode;
    }

    @Override
    public ListPendingInvitationResourcesRequest clone() {
        return (ListPendingInvitationResourcesRequest) super.clone();
    }

}
