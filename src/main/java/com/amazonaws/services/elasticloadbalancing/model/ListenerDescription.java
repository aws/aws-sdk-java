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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;


/**
 * <p>
 * The ListenerDescription data type.
 * </p>
 */
public class ListenerDescription implements Serializable {

    /**
     * The Listener data type.
     */
    private Listener listener;

    /**
     * A list of policies enabled for this listener. An empty list indicates
     * that no policies are enabled.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNames;

    /**
     * Default constructor for a new ListenerDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListenerDescription() {}
    
    /**
     * The Listener data type.
     *
     * @return The Listener data type.
     */
    public Listener getListener() {
        return listener;
    }
    
    /**
     * The Listener data type.
     *
     * @param listener The Listener data type.
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    
    /**
     * The Listener data type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listener The Listener data type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListenerDescription withListener(Listener listener) {
        this.listener = listener;
        return this;
    }

    /**
     * A list of policies enabled for this listener. An empty list indicates
     * that no policies are enabled.
     *
     * @return A list of policies enabled for this listener. An empty list indicates
     *         that no policies are enabled.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
              policyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              policyNames.setAutoConstruct(true);
        }
        return policyNames;
    }
    
    /**
     * A list of policies enabled for this listener. An empty list indicates
     * that no policies are enabled.
     *
     * @param policyNames A list of policies enabled for this listener. An empty list indicates
     *         that no policies are enabled.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
        policyNamesCopy.addAll(policyNames);
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * A list of policies enabled for this listener. An empty list indicates
     * that no policies are enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policies enabled for this listener. An empty list indicates
     *         that no policies are enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListenerDescription withPolicyNames(String... policyNames) {
        if (getPolicyNames() == null) setPolicyNames(new java.util.ArrayList<String>(policyNames.length));
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of policies enabled for this listener. An empty list indicates
     * that no policies are enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames A list of policies enabled for this listener. An empty list indicates
     *         that no policies are enabled.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> policyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(policyNames.size());
            policyNamesCopy.addAll(policyNames);
            this.policyNames = policyNamesCopy;
        }

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
        if (getListener() != null) sb.append("Listener: " + getListener() + ",");
        if (getPolicyNames() != null) sb.append("PolicyNames: " + getPolicyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getListener() == null) ? 0 : getListener().hashCode()); 
        hashCode = prime * hashCode + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListenerDescription == false) return false;
        ListenerDescription other = (ListenerDescription)obj;
        
        if (other.getListener() == null ^ this.getListener() == null) return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false) return false; 
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null) return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false) return false; 
        return true;
    }
    
}
    