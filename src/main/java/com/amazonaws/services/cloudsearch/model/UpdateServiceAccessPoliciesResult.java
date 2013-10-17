/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;


/**
 * <p>
 * A response message that contains the status of updated access policies.
 * </p>
 */
public class UpdateServiceAccessPoliciesResult implements Serializable {

    /**
     * A <code>PolicyDocument</code> that specifies access policies for the
     * search domain's services, and the current status of those policies.
     */
    private AccessPoliciesStatus accessPolicies;

    /**
     * A <code>PolicyDocument</code> that specifies access policies for the
     * search domain's services, and the current status of those policies.
     *
     * @return A <code>PolicyDocument</code> that specifies access policies for the
     *         search domain's services, and the current status of those policies.
     */
    public AccessPoliciesStatus getAccessPolicies() {
        return accessPolicies;
    }
    
    /**
     * A <code>PolicyDocument</code> that specifies access policies for the
     * search domain's services, and the current status of those policies.
     *
     * @param accessPolicies A <code>PolicyDocument</code> that specifies access policies for the
     *         search domain's services, and the current status of those policies.
     */
    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }
    
    /**
     * A <code>PolicyDocument</code> that specifies access policies for the
     * search domain's services, and the current status of those policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param accessPolicies A <code>PolicyDocument</code> that specifies access policies for the
     *         search domain's services, and the current status of those policies.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateServiceAccessPoliciesResult withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
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
        if (getAccessPolicies() != null) sb.append("AccessPolicies: " + getAccessPolicies() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateServiceAccessPoliciesResult == false) return false;
        UpdateServiceAccessPoliciesResult other = (UpdateServiceAccessPoliciesResult)obj;
        
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null) return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false) return false; 
        return true;
    }
    
}
    