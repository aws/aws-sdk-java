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
public class GetInstanceStateResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the instance.
     * </p>
     */
    private InstanceState state;

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @param state
     *        The state of the instance.
     */

    public void setState(InstanceState state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @return The state of the instance.
     */

    public InstanceState getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the instance.
     * </p>
     * 
     * @param state
     *        The state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceStateResult withState(InstanceState state) {
        setState(state);
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
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceStateResult == false)
            return false;
        GetInstanceStateResult other = (GetInstanceStateResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceStateResult clone() {
        try {
            return (GetInstanceStateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
