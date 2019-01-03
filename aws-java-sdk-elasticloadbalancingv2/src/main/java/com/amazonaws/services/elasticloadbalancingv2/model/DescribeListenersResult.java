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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancingv2-2015-12-01/DescribeListeners"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeListenersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the listeners.
     * </p>
     */
    private java.util.List<Listener> listeners;
    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     */
    private String nextMarker;

    /**
     * <p>
     * Information about the listeners.
     * </p>
     * 
     * @return Information about the listeners.
     */

    public java.util.List<Listener> getListeners() {
        return listeners;
    }

    /**
     * <p>
     * Information about the listeners.
     * </p>
     * 
     * @param listeners
     *        Information about the listeners.
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
     * Information about the listeners.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setListeners(java.util.Collection)} or {@link #withListeners(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param listeners
     *        Information about the listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenersResult withListeners(Listener... listeners) {
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
     * Information about the listeners.
     * </p>
     * 
     * @param listeners
     *        Information about the listeners.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenersResult withListeners(java.util.Collection<Listener> listeners) {
        setListeners(listeners);
        return this;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param nextMarker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @return The marker to use when requesting the next set of results. If there are no additional results, the string
     *         is empty.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * The marker to use when requesting the next set of results. If there are no additional results, the string is
     * empty.
     * </p>
     * 
     * @param nextMarker
     *        The marker to use when requesting the next set of results. If there are no additional results, the string
     *        is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeListenersResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
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
        if (getListeners() != null)
            sb.append("Listeners: ").append(getListeners()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeListenersResult == false)
            return false;
        DescribeListenersResult other = (DescribeListenersResult) obj;
        if (other.getListeners() == null ^ this.getListeners() == null)
            return false;
        if (other.getListeners() != null && other.getListeners().equals(this.getListeners()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getListeners() == null) ? 0 : getListeners().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeListenersResult clone() {
        try {
            return (DescribeListenersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
