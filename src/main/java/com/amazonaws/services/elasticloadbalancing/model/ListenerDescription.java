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
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * Listener Description
 */
public class ListenerDescription {

    private Listener listener;

    private java.util.List<String> policyNames;

    /**
     * Returns the value of the Listener property for this object.
     *
     * @return The value of the Listener property for this object.
     */
    public Listener getListener() {
        return listener;
    }
    
    /**
     * Sets the value of the Listener property for this object.
     *
     * @param listener The new value for the Listener property for this object.
     */
    public void setListener(Listener listener) {
        this.listener = listener;
    }
    
    /**
     * Sets the value of the Listener property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param listener The new value for the Listener property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListenerDescription withListener(Listener listener) {
        this.listener = listener;
        return this;
    }
    
    
    /**
     * Returns the value of the PolicyNames property for this object.
     *
     * @return The value of the PolicyNames property for this object.
     */
    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new java.util.ArrayList<String>();
        }
        return policyNames;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     */
    public void setPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListenerDescription withPolicyNames(String... policyNames) {
        for (String value : policyNames) {
            getPolicyNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyNames The new value for the PolicyNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        java.util.List<String> policyNamesCopy = new java.util.ArrayList<String>();
        if (policyNames != null) {
            policyNamesCopy.addAll(policyNames);
        }
        this.policyNames = policyNamesCopy;

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
        sb.append("Listener: " + listener + ", ");
        sb.append("PolicyNames: " + policyNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    