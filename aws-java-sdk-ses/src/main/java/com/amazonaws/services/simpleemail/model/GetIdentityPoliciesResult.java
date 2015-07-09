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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a map of policy names to policies returned from a
 * successful <code>GetIdentityPolicies</code> request.
 * </p>
 */
public class GetIdentityPoliciesResult implements Serializable, Cloneable {

    /**
     * A map of policy names to policies.
     */
    private java.util.Map<String,String> policies;

    /**
     * A map of policy names to policies.
     *
     * @return A map of policy names to policies.
     */
    public java.util.Map<String,String> getPolicies() {
        
        if (policies == null) {
            policies = new java.util.HashMap<String,String>();
        }
        return policies;
    }
    
    /**
     * A map of policy names to policies.
     *
     * @param policies A map of policy names to policies.
     */
    public void setPolicies(java.util.Map<String,String> policies) {
        this.policies = policies;
    }
    
    /**
     * A map of policy names to policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policies A map of policy names to policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetIdentityPoliciesResult withPolicies(java.util.Map<String,String> policies) {
        setPolicies(policies);
        return this;
    }

    /**
     * A map of policy names to policies.
     * <p>
     * The method adds a new key-value pair into Policies parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Policies.
     * @param value The corresponding value of the entry to be added into Policies.
     */
  public GetIdentityPoliciesResult addPoliciesEntry(String key, String value) {
    if (null == this.policies) {
      this.policies = new java.util.HashMap<String,String>();
    }
    if (this.policies.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.policies.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Policies.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public GetIdentityPoliciesResult clearPoliciesEntries() {
    this.policies = null;
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
        if (getPolicies() != null) sb.append("Policies: " + getPolicies() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPolicies() == null) ? 0 : getPolicies().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetIdentityPoliciesResult == false) return false;
        GetIdentityPoliciesResult other = (GetIdentityPoliciesResult)obj;
        
        if (other.getPolicies() == null ^ this.getPolicies() == null) return false;
        if (other.getPolicies() != null && other.getPolicies().equals(this.getPolicies()) == false) return false; 
        return true;
    }
    
    @Override
    public GetIdentityPoliciesResult clone() {
        try {
            return (GetIdentityPoliciesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    