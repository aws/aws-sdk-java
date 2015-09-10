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

/**
 * <p>
 * Contains the response to a successful GetContextKeysForPrincipalPolicy
 * or GetContextKeysForCustomPolicy request.
 * </p>
 */
public class GetContextKeysForCustomPolicyResult implements Serializable, Cloneable {

    /**
     * The list of context keys that are used in the <code>Condition</code>
     * elements of the input policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyNames;

    /**
     * The list of context keys that are used in the <code>Condition</code>
     * elements of the input policies.
     *
     * @return The list of context keys that are used in the <code>Condition</code>
     *         elements of the input policies.
     */
    public java.util.List<String> getContextKeyNames() {
        if (contextKeyNames == null) {
              contextKeyNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              contextKeyNames.setAutoConstruct(true);
        }
        return contextKeyNames;
    }
    
    /**
     * The list of context keys that are used in the <code>Condition</code>
     * elements of the input policies.
     *
     * @param contextKeyNames The list of context keys that are used in the <code>Condition</code>
     *         elements of the input policies.
     */
    public void setContextKeyNames(java.util.Collection<String> contextKeyNames) {
        if (contextKeyNames == null) {
            this.contextKeyNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(contextKeyNames.size());
        contextKeyNamesCopy.addAll(contextKeyNames);
        this.contextKeyNames = contextKeyNamesCopy;
    }
    
    /**
     * The list of context keys that are used in the <code>Condition</code>
     * elements of the input policies.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setContextKeyNames(java.util.Collection)} or {@link
     * #withContextKeyNames(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextKeyNames The list of context keys that are used in the <code>Condition</code>
     *         elements of the input policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForCustomPolicyResult withContextKeyNames(String... contextKeyNames) {
        if (getContextKeyNames() == null) setContextKeyNames(new java.util.ArrayList<String>(contextKeyNames.length));
        for (String value : contextKeyNames) {
            getContextKeyNames().add(value);
        }
        return this;
    }
    
    /**
     * The list of context keys that are used in the <code>Condition</code>
     * elements of the input policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param contextKeyNames The list of context keys that are used in the <code>Condition</code>
     *         elements of the input policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetContextKeysForCustomPolicyResult withContextKeyNames(java.util.Collection<String> contextKeyNames) {
        if (contextKeyNames == null) {
            this.contextKeyNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> contextKeyNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(contextKeyNames.size());
            contextKeyNamesCopy.addAll(contextKeyNames);
            this.contextKeyNames = contextKeyNamesCopy;
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
        if (getContextKeyNames() != null) sb.append("ContextKeyNames: " + getContextKeyNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getContextKeyNames() == null) ? 0 : getContextKeyNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetContextKeysForCustomPolicyResult == false) return false;
        GetContextKeysForCustomPolicyResult other = (GetContextKeysForCustomPolicyResult)obj;
        
        if (other.getContextKeyNames() == null ^ this.getContextKeyNames() == null) return false;
        if (other.getContextKeyNames() != null && other.getContextKeyNames().equals(this.getContextKeyNames()) == false) return false; 
        return true;
    }
    
    @Override
    public GetContextKeysForCustomPolicyResult clone() {
        try {
            return (GetContextKeysForCustomPolicyResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    