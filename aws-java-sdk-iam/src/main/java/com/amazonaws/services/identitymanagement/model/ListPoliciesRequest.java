/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listPolicies(ListPoliciesRequest) ListPolicies operation}.
 * <p>
 * Lists all the managed policies that are available to your account,
 * including your own customer managed policies and all AWS managed
 * policies.
 * </p>
 * <p>
 * You can filter the list of policies that is returned using the
 * optional <code>OnlyAttached</code> ,
 * <code>Scope</code> , and <code>PathPrefix</code>
 * parameters. For example, to list only the customer managed policies in
 * your AWS account, set <code>Scope</code> to <code>Local</code> . To
 * list only AWS managed policies, set <code>Scope</code> to
 * <code>AWS</code> .
 * </p>
 * <p>
 * You can paginate the results using the <code>MaxItems</code> and
 * <code>Marker</code> parameters.
 * </p>
 * <p>
 * For more information about managed policies, refer to
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"> Managed Policies and Inline Policies </a>
 * in the <i>IAM User Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#listPolicies(ListPoliciesRequest)
 */
public class ListPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     */
    private String scope;

    /**
     * A flag to filter the results to only the attached policies. <p>When
     * <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or
     * role. When <code>OnlyAttached</code> is <code>false</code>, or when
     * the parameter is not included, all policies are returned.
     */
    private Boolean onlyAttached;

    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     */
    private String pathPrefix;

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxItems;

    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     *
     * @return The scope to use for filtering the results. <p>To list only AWS
     *         managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     *         only the customer managed policies in your AWS account, set
     *         <code>Scope</code> to <code>Local</code>. <p>This parameter is
     *         optional. If it is not included, or if it is set to <code>All</code>,
     *         all policies are returned.
     *
     * @see PolicyScopeType
     */
    public String getScope() {
        return scope;
    }
    
    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     *
     * @param scope The scope to use for filtering the results. <p>To list only AWS
     *         managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     *         only the customer managed policies in your AWS account, set
     *         <code>Scope</code> to <code>Local</code>. <p>This parameter is
     *         optional. If it is not included, or if it is set to <code>All</code>,
     *         all policies are returned.
     *
     * @see PolicyScopeType
     */
    public void setScope(String scope) {
        this.scope = scope;
    }
    
    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     *
     * @param scope The scope to use for filtering the results. <p>To list only AWS
     *         managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     *         only the customer managed policies in your AWS account, set
     *         <code>Scope</code> to <code>Local</code>. <p>This parameter is
     *         optional. If it is not included, or if it is set to <code>All</code>,
     *         all policies are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyScopeType
     */
    public ListPoliciesRequest withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     *
     * @param scope The scope to use for filtering the results. <p>To list only AWS
     *         managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     *         only the customer managed policies in your AWS account, set
     *         <code>Scope</code> to <code>Local</code>. <p>This parameter is
     *         optional. If it is not included, or if it is set to <code>All</code>,
     *         all policies are returned.
     *
     * @see PolicyScopeType
     */
    public void setScope(PolicyScopeType scope) {
        this.scope = scope.toString();
    }
    
    /**
     * The scope to use for filtering the results. <p>To list only AWS
     * managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     * only the customer managed policies in your AWS account, set
     * <code>Scope</code> to <code>Local</code>. <p>This parameter is
     * optional. If it is not included, or if it is set to <code>All</code>,
     * all policies are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>All, AWS, Local
     *
     * @param scope The scope to use for filtering the results. <p>To list only AWS
     *         managed policies, set <code>Scope</code> to <code>AWS</code>. To list
     *         only the customer managed policies in your AWS account, set
     *         <code>Scope</code> to <code>Local</code>. <p>This parameter is
     *         optional. If it is not included, or if it is set to <code>All</code>,
     *         all policies are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see PolicyScopeType
     */
    public ListPoliciesRequest withScope(PolicyScopeType scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * A flag to filter the results to only the attached policies. <p>When
     * <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or
     * role. When <code>OnlyAttached</code> is <code>false</code>, or when
     * the parameter is not included, all policies are returned.
     *
     * @return A flag to filter the results to only the attached policies. <p>When
     *         <code>OnlyAttached</code> is <code>true</code>, the returned list
     *         contains only the policies that are attached to a user, group, or
     *         role. When <code>OnlyAttached</code> is <code>false</code>, or when
     *         the parameter is not included, all policies are returned.
     */
    public Boolean isOnlyAttached() {
        return onlyAttached;
    }
    
    /**
     * A flag to filter the results to only the attached policies. <p>When
     * <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or
     * role. When <code>OnlyAttached</code> is <code>false</code>, or when
     * the parameter is not included, all policies are returned.
     *
     * @param onlyAttached A flag to filter the results to only the attached policies. <p>When
     *         <code>OnlyAttached</code> is <code>true</code>, the returned list
     *         contains only the policies that are attached to a user, group, or
     *         role. When <code>OnlyAttached</code> is <code>false</code>, or when
     *         the parameter is not included, all policies are returned.
     */
    public void setOnlyAttached(Boolean onlyAttached) {
        this.onlyAttached = onlyAttached;
    }
    
    /**
     * A flag to filter the results to only the attached policies. <p>When
     * <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or
     * role. When <code>OnlyAttached</code> is <code>false</code>, or when
     * the parameter is not included, all policies are returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param onlyAttached A flag to filter the results to only the attached policies. <p>When
     *         <code>OnlyAttached</code> is <code>true</code>, the returned list
     *         contains only the policies that are attached to a user, group, or
     *         role. When <code>OnlyAttached</code> is <code>false</code>, or when
     *         the parameter is not included, all policies are returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesRequest withOnlyAttached(Boolean onlyAttached) {
        this.onlyAttached = onlyAttached;
        return this;
    }

    /**
     * A flag to filter the results to only the attached policies. <p>When
     * <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or
     * role. When <code>OnlyAttached</code> is <code>false</code>, or when
     * the parameter is not included, all policies are returned.
     *
     * @return A flag to filter the results to only the attached policies. <p>When
     *         <code>OnlyAttached</code> is <code>true</code>, the returned list
     *         contains only the policies that are attached to a user, group, or
     *         role. When <code>OnlyAttached</code> is <code>false</code>, or when
     *         the parameter is not included, all policies are returned.
     */
    public Boolean getOnlyAttached() {
        return onlyAttached;
    }

    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @return The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         policies.
     */
    public String getPathPrefix() {
        return pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * policies.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         policies.
     */
    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }
    
    /**
     * The path prefix for filtering the results. This parameter is optional.
     * If it is not included, it defaults to a slash (/), listing all
     * policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>((/[A-Za-z0-9\.,\+@=_-]+)*)/<br/>
     *
     * @param pathPrefix The path prefix for filtering the results. This parameter is optional.
     *         If it is not included, it defaults to a slash (/), listing all
     *         policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesRequest withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it
     * to the value of the <code>Marker</code> element in the response you
     * received to inform the next call about where to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker Use this parameter only when paginating results and only after you
     *         receive a response indicating that the results are truncated. Set it
     *         to the value of the <code>Marker</code> element in the response you
     *         received to inform the next call about where to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Use this only when paginating results to indicate the maximum number
     * of items you want in the response. If there are additional items
     * beyond the maximum you specify, the <code>IsTruncated</code> response
     * element is <code>true</code>. <p>This parameter is optional. If you do
     * not include it, it defaults to 100. Note that IAM might return fewer
     * results, even when there are more results available. If this is the
     * case, the <code>IsTruncated</code> response element returns
     * <code>true</code> and <code>Marker</code> contains a value to include
     * in the subsequent call that tells the service where to continue from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxItems Use this only when paginating results to indicate the maximum number
     *         of items you want in the response. If there are additional items
     *         beyond the maximum you specify, the <code>IsTruncated</code> response
     *         element is <code>true</code>. <p>This parameter is optional. If you do
     *         not include it, it defaults to 100. Note that IAM might return fewer
     *         results, even when there are more results available. If this is the
     *         case, the <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to include
     *         in the subsequent call that tells the service where to continue from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListPoliciesRequest withMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getScope() != null) sb.append("Scope: " + getScope() + ",");
        if (isOnlyAttached() != null) sb.append("OnlyAttached: " + isOnlyAttached() + ",");
        if (getPathPrefix() != null) sb.append("PathPrefix: " + getPathPrefix() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode()); 
        hashCode = prime * hashCode + ((isOnlyAttached() == null) ? 0 : isOnlyAttached().hashCode()); 
        hashCode = prime * hashCode + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListPoliciesRequest == false) return false;
        ListPoliciesRequest other = (ListPoliciesRequest)obj;
        
        if (other.getScope() == null ^ this.getScope() == null) return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false) return false; 
        if (other.isOnlyAttached() == null ^ this.isOnlyAttached() == null) return false;
        if (other.isOnlyAttached() != null && other.isOnlyAttached().equals(this.isOnlyAttached()) == false) return false; 
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null) return false;
        if (other.getPathPrefix() != null && other.getPathPrefix().equals(this.getPathPrefix()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListPoliciesRequest clone() {
        
            return (ListPoliciesRequest) super.clone();
    }

}
    