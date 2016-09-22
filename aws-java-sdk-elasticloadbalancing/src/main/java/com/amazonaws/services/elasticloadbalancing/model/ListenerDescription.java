/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

/**
 * <p>
 * The policies enabled for a listener.
 * </p>
 */
public class ListenerDescription implements Serializable, Cloneable {

    private Listener listener;
    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;

    /**
     * @param listener
     */

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    /**
     * @return
     */

    public Listener getListener() {
        return this.listener;
    }

    /**
     * @param listener
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerDescription withListener(Listener listener) {
        setListener(listener);
        return this;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * 
     * @return The policies. If there are no policies enabled, the list is empty.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * 
     * @param policyNames
     *        The policies. If there are no policies enabled, the list is empty.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(policyNames);
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolicyNames(java.util.Collection)} or {@link #withPolicyNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyNames
     *        The policies. If there are no policies enabled, the list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerDescription withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The policies. If there are no policies enabled, the list is empty.
     * </p>
     * 
     * @param policyNames
     *        The policies. If there are no policies enabled, the list is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerDescription withPolicyNames(java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getListener() != null)
            sb.append("Listener: " + getListener() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerDescription == false)
            return false;
        ListenerDescription other = (ListenerDescription) obj;
        if (other.getListener() == null ^ this.getListener() == null)
            return false;
        if (other.getListener() != null && other.getListener().equals(this.getListener()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        return true;
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
    public ListenerDescription clone() {
        try {
            return (ListenerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
