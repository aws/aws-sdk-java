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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies that you want to list only the resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     */
    private String resourceOwner;
    /**
     * <p>
     * Specifies that you want to list only the resource shares that are associated with the specified principal.
     * </p>
     */
    private String principal;
    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources of the specified resource type.
     * </p>
     * <p>
     * For valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     */
    private java.util.List<String> resourceArns;
    /**
     * <p>
     * Specifies that you want to list only resources in the resource shares identified by the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
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
     * Specifies that you want to list only the resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list only the resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     *        </p>
     *        </li>
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies that you want to list only the resource shares that match the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     *         </p>
     *         </li>
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list only the resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListResourcesRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that match the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceOwner
     *        Specifies that you want to list only the resource shares that match the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>SELF</code> </b> – resources that your account shares with other accounts
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>OTHER-ACCOUNTS</code> </b> – resources that other accounts share with your account
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public ListResourcesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that are associated with the specified principal.
     * </p>
     * 
     * @param principal
     *        Specifies that you want to list only the resource shares that are associated with the specified principal.
     */

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that are associated with the specified principal.
     * </p>
     * 
     * @return Specifies that you want to list only the resource shares that are associated with the specified
     *         principal.
     */

    public String getPrincipal() {
        return this.principal;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that are associated with the specified principal.
     * </p>
     * 
     * @param principal
     *        Specifies that you want to list only the resource shares that are associated with the specified principal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withPrincipal(String principal) {
        setPrincipal(principal);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources of the specified resource type.
     * </p>
     * <p>
     * For valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list only the resource shares that include resources of the specified resource
     *        type.</p>
     *        <p>
     *        For valid values, query the <a>ListResourceTypes</a> operation.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources of the specified resource type.
     * </p>
     * <p>
     * For valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @return Specifies that you want to list only the resource shares that include resources of the specified resource
     *         type.</p>
     *         <p>
     *         For valid values, query the <a>ListResourceTypes</a> operation.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources of the specified resource type.
     * </p>
     * <p>
     * For valid values, query the <a>ListResourceTypes</a> operation.
     * </p>
     * 
     * @param resourceType
     *        Specifies that you want to list only the resource shares that include resources of the specified resource
     *        type.</p>
     *        <p>
     *        For valid values, query the <a>ListResourceTypes</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @return Specifies that you want to list only the resource shares that include resources with the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a>.
     */

    public java.util.List<String> getResourceArns() {
        return resourceArns;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param resourceArns
     *        Specifies that you want to list only the resource shares that include resources with the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     */

    public void setResourceArns(java.util.Collection<String> resourceArns) {
        if (resourceArns == null) {
            this.resourceArns = null;
            return;
        }

        this.resourceArns = new java.util.ArrayList<String>(resourceArns);
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceArns(java.util.Collection)} or {@link #withResourceArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceArns
     *        Specifies that you want to list only the resource shares that include resources with the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceArns(String... resourceArns) {
        if (this.resourceArns == null) {
            setResourceArns(new java.util.ArrayList<String>(resourceArns.length));
        }
        for (String ele : resourceArns) {
            this.resourceArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only the resource shares that include resources with the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param resourceArns
     *        Specifies that you want to list only the resource shares that include resources with the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceArns(java.util.Collection<String> resourceArns) {
        setResourceArns(resourceArns);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only resources in the resource shares identified by the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @return Specifies that you want to list only resources in the resource shares identified by the specified <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a>.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * Specifies that you want to list only resources in the resource shares identified by the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list only resources in the resource shares identified by the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     */

    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * Specifies that you want to list only resources in the resource shares identified by the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list only resources in the resource shares identified by the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceShareArns(String... resourceShareArns) {
        if (this.resourceShareArns == null) {
            setResourceShareArns(new java.util.ArrayList<String>(resourceShareArns.length));
        }
        for (String ele : resourceShareArns) {
            this.resourceShareArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies that you want to list only resources in the resource shares identified by the specified <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a>.
     * </p>
     * 
     * @param resourceShareArns
     *        Specifies that you want to list only resources in the resource shares identified by the specified <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
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

    public ListResourcesRequest withNextToken(String nextToken) {
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

    public ListResourcesRequest withMaxResults(Integer maxResults) {
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

    public ListResourcesRequest withResourceRegionScope(String resourceRegionScope) {
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

    public ListResourcesRequest withResourceRegionScope(ResourceRegionScopeFilter resourceRegionScope) {
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
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getPrincipal() != null)
            sb.append("Principal: ").append(getPrincipal()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceArns() != null)
            sb.append("ResourceArns: ").append(getResourceArns()).append(",");
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
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

        if (obj instanceof ListResourcesRequest == false)
            return false;
        ListResourcesRequest other = (ListResourcesRequest) obj;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getPrincipal() == null ^ this.getPrincipal() == null)
            return false;
        if (other.getPrincipal() != null && other.getPrincipal().equals(this.getPrincipal()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceArns() == null ^ this.getResourceArns() == null)
            return false;
        if (other.getResourceArns() != null && other.getResourceArns().equals(this.getResourceArns()) == false)
            return false;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
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

        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getPrincipal() == null) ? 0 : getPrincipal().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceArns() == null) ? 0 : getResourceArns().hashCode());
        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getResourceRegionScope() == null) ? 0 : getResourceRegionScope().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesRequest clone() {
        return (ListResourcesRequest) super.clone();
    }

}
