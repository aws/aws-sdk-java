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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * The response received when DeleteInterconnect is called.
 * </p>
 */
public class DeleteInterconnectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String interconnectState;

    /**
     * @param interconnectState
     * @see InterconnectState
     */

    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }

    /**
     * @return
     * @see InterconnectState
     */

    public String getInterconnectState() {
        return this.interconnectState;
    }

    /**
     * @param interconnectState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public DeleteInterconnectResult withInterconnectState(String interconnectState) {
        setInterconnectState(interconnectState);
        return this;
    }

    /**
     * @param interconnectState
     * @see InterconnectState
     */

    public void setInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
    }

    /**
     * @param interconnectState
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public DeleteInterconnectResult withInterconnectState(InterconnectState interconnectState) {
        setInterconnectState(interconnectState);
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
        if (getInterconnectState() != null)
            sb.append("InterconnectState: " + getInterconnectState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInterconnectResult == false)
            return false;
        DeleteInterconnectResult other = (DeleteInterconnectResult) obj;
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null)
            return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInterconnectResult clone() {
        try {
            return (DeleteInterconnectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
