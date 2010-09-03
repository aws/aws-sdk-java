/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * ListGroupPolicies action.
 * </p>
 */
public class ListGroupPoliciesResult {

    /**
     * A list of policy names.
     */
    private java.util.List<String> policyNames;

    /**
     * A flag that indicates whether there are more policy names to list. If
     * your results were truncated, you can make a follow-up pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy names in the list.
     */
    private Boolean isTruncated;

    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     */
    private String marker;

    /**
     * A list of policy names.
     *
     * @return A list of policy names.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new java.util.ArrayList<String>();
        }
        return policyNames;
    }
    
    /**
     * A list of policy names.
     *
     * @param policyNames A list of policy names.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * A list of policy names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policy names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListGroupPoliciesResult withPolicyNames(String... policyNames) {
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of policy names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policy names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListGroupPoliciesResult withPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more policy names to list. If
     * your results were truncated, you can make a follow-up pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy names in the list.
     *
     * @return A flag that indicates whether there are more policy names to list. If
     *         your results were truncated, you can make a follow-up pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy names in the list.
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policy names to list. If
     * your results were truncated, you can make a follow-up pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy names in the list.
     *
     * @param isTruncated A flag that indicates whether there are more policy names to list. If
     *         your results were truncated, you can make a follow-up pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy names in the list.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more policy names to list. If
     * your results were truncated, you can make a follow-up pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy names in the list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more policy names to list. If
     *         your results were truncated, you can make a follow-up pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy names in the list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListGroupPoliciesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more policy names to list. If
     * your results were truncated, you can make a follow-up pagination
     * request using the <code>Marker</code> request parameter to retrieve
     * more policy names in the list.
     *
     * @return A flag that indicates whether there are more policy names to list. If
     *         your results were truncated, you can make a follow-up pagination
     *         request using the <code>Marker</code> request parameter to retrieve
     *         more policy names in the list.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @return If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a follow-up pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a follow-up pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a follow-up pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a follow-up pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[\u0020-\u00FF]*<br/>
     *
     * @param marker If <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a follow-up pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListGroupPoliciesResult withMarker(String marker) {
        this.marker = marker;
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
        sb.append("PolicyNames: " + policyNames + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    