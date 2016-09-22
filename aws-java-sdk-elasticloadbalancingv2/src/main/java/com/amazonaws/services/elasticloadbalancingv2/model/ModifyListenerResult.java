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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of ModifyListener.
 * </p>
 */
public class ModifyListenerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the modified listeners.
     * </p>
     */
    private java.util.List<Listener> listeners;

    /**
     * <p>
     * Information about the modified listeners.
     * </p>
     * 
     * @return Information about the modified listeners.
     */

    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * Information about the modified listeners.
     * </p>
     * 
     * @param listeners
     *        Information about the modified listeners.
     */

    public void setListeners(java.util.Collection<Listener> listeners) {
        if (listeners == null) {
            this.listeners = null;
            return;
        }

        this.listeners = new java.util.ArrayList<Listener>(listeners);
    }

    /**
     * <p>
     * Information about the modified listeners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        Information about the modified listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerResult withListeners(Listener... listeners) {
        if (this.listeners == null) {
            setListeners(new java.util.ArrayList<Listener>(listeners.length));
        }
        for (Listener ele : listeners) {
            this.listeners.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the modified listeners.
     * </p>
     * 
     * @param listeners
     *        Information about the modified listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyListenerResult withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
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
        if (getListeners() != null)
            sb.append("Listeners: " + getListeners());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyListenerResult == false)
            return false;
        ModifyListenerResult other = (ModifyListenerResult) obj;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        return hashCode;
    }

    @Override
    public ModifyListenerResult clone() {
        try {
            return (ModifyListenerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
