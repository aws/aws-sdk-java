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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a WorkSpace modification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-2015-04-08/ModificationState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModificationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The resource.
     * </p>
     */
    private String resource;
    /**
     * <p>
     * The modification state.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @param resource
     *        The resource.
     * @see ModificationResourceEnum
     */

    public void setResource(String resource) {
        this.resource = resource;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @return The resource.
     * @see ModificationResourceEnum
     */

    public String getResource() {
        return this.resource;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @param resource
     *        The resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModificationResourceEnum
     */

    public ModificationState withResource(String resource) {
        setResource(resource);
        return this;
    }

    /**
     * <p>
     * The resource.
     * </p>
     * 
     * @param resource
     *        The resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModificationResourceEnum
     */

    public ModificationState withResource(ModificationResourceEnum resource) {
        this.resource = resource.toString();
        return this;
    }

    /**
     * <p>
     * The modification state.
     * </p>
     * 
     * @param state
     *        The modification state.
     * @see ModificationStateEnum
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The modification state.
     * </p>
     * 
     * @return The modification state.
     * @see ModificationStateEnum
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The modification state.
     * </p>
     * 
     * @param state
     *        The modification state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModificationStateEnum
     */

    public ModificationState withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The modification state.
     * </p>
     * 
     * @param state
     *        The modification state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModificationStateEnum
     */

    public ModificationState withState(ModificationStateEnum state) {
        this.state = state.toString();
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
        if (getResource() != null)
            sb.append("Resource: ").append(getResource()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModificationState == false)
            return false;
        ModificationState other = (ModificationState) obj;
        if (other.getResource() == null ^ this.getResource() == null)
            return false;
        if (other.getResource() != null && other.getResource().equals(this.getResource()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getResource() == null) ? 0 : getResource().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public ModificationState clone() {
        try {
            return (ModificationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.workspaces.model.transform.ModificationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
