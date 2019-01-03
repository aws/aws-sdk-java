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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/ListPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     * attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     */
    private Boolean onlyAttached;
    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a
     * slash (/), listing all policies. This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a forward
     * slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any
     * ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     */
    private String pathPrefix;
    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     */
    private String policyUsageFilter;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     */
    private Integer maxItems;

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results.</p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer
     *        managed policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     *        returned.
     * @see PolicyScopeType
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     * 
     * @return The scope to use for filtering the results.</p>
     *         <p>
     *         To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer
     *         managed policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     *         returned.
     * @see PolicyScopeType
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results.</p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer
     *        managed policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyScopeType
     */

    public ListPoliciesRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results.</p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer
     *        managed policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     *        returned.
     * @see PolicyScopeType
     */

    public void setScope(PolicyScopeType scope) {
        withScope(scope);
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed
     * policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     * returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results.</p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer
     *        managed policies in your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are
     *        returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyScopeType
     */

    public ListPoliciesRequest withScope(PolicyScopeType scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     * attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @param onlyAttached
     *        A flag to filter the results to only the attached policies.</p>
     *        <p>
     *        When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     *        attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     *        parameter is not included, all policies are returned.
     */

    public void setOnlyAttached(Boolean onlyAttached) {
        this.onlyAttached = onlyAttached;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     * attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @return A flag to filter the results to only the attached policies.</p>
     *         <p>
     *         When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that
     *         are attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or
     *         when the parameter is not included, all policies are returned.
     */

    public Boolean getOnlyAttached() {
        return this.onlyAttached;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     * attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @param onlyAttached
     *        A flag to filter the results to only the attached policies.</p>
     *        <p>
     *        When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     *        attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     *        parameter is not included, all policies are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withOnlyAttached(Boolean onlyAttached) {
        setOnlyAttached(onlyAttached);
        return this;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are
     * attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @return A flag to filter the results to only the attached policies.</p>
     *         <p>
     *         When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that
     *         are attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or
     *         when the parameter is not included, all policies are returned.
     */

    public Boolean isOnlyAttached() {
        return this.onlyAttached;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a
     * slash (/), listing all policies. This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a forward
     * slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any
     * ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults
     *        to a slash (/), listing all policies. This parameter allows (through its <a
     *        href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     *        forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can
     *        contain any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most
     *        punctuation characters, digits, and upper and lowercased letters.
     */

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a
     * slash (/), listing all policies. This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a forward
     * slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any
     * ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @return The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults
     *         to a slash (/), listing all policies. This parameter allows (through its <a
     *         href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     *         forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can
     *         contain any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most
     *         punctuation characters, digits, and upper and lowercased letters.
     */

    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a
     * slash (/), listing all policies. This parameter allows (through its <a
     * href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a forward
     * slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any
     * ASCII character from the ! (\u0021) through the DEL character (\u007F), including most punctuation characters,
     * digits, and upper and lowercased letters.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults
     *        to a slash (/), listing all policies. This parameter allows (through its <a
     *        href="http://wikipedia.org/wiki/regex">regex pattern</a>) a string of characters consisting of either a
     *        forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can
     *        contain any ASCII character from the ! (\u0021) through the DEL character (\u007F), including most
     *        punctuation characters, digits, and upper and lowercased letters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withPathPrefix(String pathPrefix) {
        setPathPrefix(pathPrefix);
        return this;
    }

    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     * 
     * @param policyUsageFilter
     *        The policy usage method to use for filtering the results.</p>
     *        <p>
     *        To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>.
     *        To list only the policies used to set permissions boundaries, set the value to 
     *        <code>PermissionsBoundary</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, all policies are returned.
     * @see PolicyUsageType
     */

    public void setPolicyUsageFilter(String policyUsageFilter) {
        this.policyUsageFilter = policyUsageFilter;
    }

    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     * 
     * @return The policy usage method to use for filtering the results.</p>
     *         <p>
     *         To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>.
     *         To list only the policies used to set permissions boundaries, set the value to 
     *         <code>PermissionsBoundary</code>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, all policies are returned.
     * @see PolicyUsageType
     */

    public String getPolicyUsageFilter() {
        return this.policyUsageFilter;
    }

    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     * 
     * @param policyUsageFilter
     *        The policy usage method to use for filtering the results.</p>
     *        <p>
     *        To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>.
     *        To list only the policies used to set permissions boundaries, set the value to 
     *        <code>PermissionsBoundary</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, all policies are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyUsageType
     */

    public ListPoliciesRequest withPolicyUsageFilter(String policyUsageFilter) {
        setPolicyUsageFilter(policyUsageFilter);
        return this;
    }

    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     * 
     * @param policyUsageFilter
     *        The policy usage method to use for filtering the results.</p>
     *        <p>
     *        To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>.
     *        To list only the policies used to set permissions boundaries, set the value to 
     *        <code>PermissionsBoundary</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, all policies are returned.
     * @see PolicyUsageType
     */

    public void setPolicyUsageFilter(PolicyUsageType policyUsageFilter) {
        withPolicyUsageFilter(policyUsageFilter);
    }

    /**
     * <p>
     * The policy usage method to use for filtering the results.
     * </p>
     * <p>
     * To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list
     * only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, all policies are returned.
     * </p>
     * 
     * @param policyUsageFilter
     *        The policy usage method to use for filtering the results.</p>
     *        <p>
     *        To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>.
     *        To list only the policies used to set permissions boundaries, set the value to 
     *        <code>PermissionsBoundary</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, all policies are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PolicyUsageType
     */

    public ListPoliciesRequest withPolicyUsageFilter(PolicyUsageType policyUsageFilter) {
        this.policyUsageFilter = policyUsageFilter.toString();
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after you receive a response indicating that the
     *         results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *         received to indicate where the next call should start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you receive a response indicating that the results
     * are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to
     * indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you receive a response indicating that the
     *        results are truncated. Set it to the value of the <code>Marker</code> element in the response that you
     *        received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum number of items you want in the response.
     *         If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element
     *         is <code>true</code>.</p>
     *         <p>
     *         If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *         fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *         response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *         subsequent call that tells the service where to continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of items you want in the response. If
     * additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. In that case, the <code>IsTruncated</code> response element
     * returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells
     * the service where to continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum number of items you want in the response. If
     *        additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is
     *        <code>true</code>.</p>
     *        <p>
     *        If you do not include this parameter, the number of items defaults to 100. Note that IAM might return
     *        fewer results, even when there are more results available. In that case, the <code>IsTruncated</code>
     *        response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the
     *        subsequent call that tells the service where to continue from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPoliciesRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getOnlyAttached() != null)
            sb.append("OnlyAttached: ").append(getOnlyAttached()).append(",");
        if (getPathPrefix() != null)
            sb.append("PathPrefix: ").append(getPathPrefix()).append(",");
        if (getPolicyUsageFilter() != null)
            sb.append("PolicyUsageFilter: ").append(getPolicyUsageFilter()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
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
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getOnlyAttached() == null ^ this.getOnlyAttached() == null)
            return false;
        if (other.getOnlyAttached() != null && other.getOnlyAttached().equals(this.getOnlyAttached()) == false)
            return false;
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null)
            return false;
        if (other.getPathPrefix() != null && other.getPathPrefix().equals(this.getPathPrefix()) == false)
            return false;
        if (other.getPolicyUsageFilter() == null ^ this.getPolicyUsageFilter() == null)
            return false;
        if (other.getPolicyUsageFilter() != null && other.getPolicyUsageFilter().equals(this.getPolicyUsageFilter()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getOnlyAttached() == null) ? 0 : getOnlyAttached().hashCode());
        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode());
        hashCode = prime * hashCode + ((getPolicyUsageFilter() == null) ? 0 : getPolicyUsageFilter().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListPoliciesRequest clone() {
        return (ListPoliciesRequest) super.clone();
    }

}
