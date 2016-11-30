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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * 
 */
public class GetInstancePortStatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     */
    private java.util.List<String> portStates;

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     * 
     * @return Information about the port states resulting from your request.
     * @see PortState
     */

    public java.util.List<String> getPortStates() {
        return portStates;
    }

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     * 
     * @param portStates
     *        Information about the port states resulting from your request.
     * @see PortState
     */

    public void setPortStates(java.util.Collection<String> portStates) {
        if (portStates == null) {
            this.portStates = null;
            return;
        }

        this.portStates = new java.util.ArrayList<String>(portStates);
    }

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPortStates(java.util.Collection)} or {@link #withPortStates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param portStates
     *        Information about the port states resulting from your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortState
     */

    public GetInstancePortStatesResult withPortStates(String... portStates) {
        if (this.portStates == null) {
            setPortStates(new java.util.ArrayList<String>(portStates.length));
        }
        for (String ele : portStates) {
            this.portStates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     * 
     * @param portStates
     *        Information about the port states resulting from your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortState
     */

    public GetInstancePortStatesResult withPortStates(java.util.Collection<String> portStates) {
        setPortStates(portStates);
        return this;
    }

    /**
     * <p>
     * Information about the port states resulting from your request.
     * </p>
     * 
     * @param portStates
     *        Information about the port states resulting from your request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PortState
     */

    public GetInstancePortStatesResult withPortStates(PortState... portStates) {
        java.util.ArrayList<String> portStatesCopy = new java.util.ArrayList<String>(portStates.length);
        for (PortState value : portStates) {
            portStatesCopy.add(value.toString());
        }
        if (getPortStates() == null) {
            setPortStates(portStatesCopy);
        } else {
            getPortStates().addAll(portStatesCopy);
        }
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
        if (getPortStates() != null)
            sb.append("PortStates: " + getPortStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstancePortStatesResult == false)
            return false;
        GetInstancePortStatesResult other = (GetInstancePortStatesResult) obj;
        if (other.getPortStates() == null ^ this.getPortStates() == null)
            return false;
        if (other.getPortStates() != null && other.getPortStates().equals(this.getPortStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortStates() == null) ? 0 : getPortStates().hashCode());
        return hashCode;
    }

    @Override
    public GetInstancePortStatesResult clone() {
        try {
            return (GetInstancePortStatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
