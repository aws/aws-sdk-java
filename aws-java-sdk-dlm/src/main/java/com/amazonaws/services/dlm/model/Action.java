/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dlm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an action for an event-based policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dlm-2018-01-12/Action" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Action implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A descriptive name for the action.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The rule for copying shared snapshots across Regions.
     * </p>
     */
    private java.util.List<CrossRegionCopyAction> crossRegionCopy;

    /**
     * <p>
     * A descriptive name for the action.
     * </p>
     * 
     * @param name
     *        A descriptive name for the action.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive name for the action.
     * </p>
     * 
     * @return A descriptive name for the action.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive name for the action.
     * </p>
     * 
     * @param name
     *        A descriptive name for the action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The rule for copying shared snapshots across Regions.
     * </p>
     * 
     * @return The rule for copying shared snapshots across Regions.
     */

    public java.util.List<CrossRegionCopyAction> getCrossRegionCopy() {
        return crossRegionCopy;
    }

    /**
     * <p>
     * The rule for copying shared snapshots across Regions.
     * </p>
     * 
     * @param crossRegionCopy
     *        The rule for copying shared snapshots across Regions.
     */

    public void setCrossRegionCopy(java.util.Collection<CrossRegionCopyAction> crossRegionCopy) {
        if (crossRegionCopy == null) {
            this.crossRegionCopy = null;
            return;
        }

        this.crossRegionCopy = new java.util.ArrayList<CrossRegionCopyAction>(crossRegionCopy);
    }

    /**
     * <p>
     * The rule for copying shared snapshots across Regions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCrossRegionCopy(java.util.Collection)} or {@link #withCrossRegionCopy(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param crossRegionCopy
     *        The rule for copying shared snapshots across Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withCrossRegionCopy(CrossRegionCopyAction... crossRegionCopy) {
        if (this.crossRegionCopy == null) {
            setCrossRegionCopy(new java.util.ArrayList<CrossRegionCopyAction>(crossRegionCopy.length));
        }
        for (CrossRegionCopyAction ele : crossRegionCopy) {
            this.crossRegionCopy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The rule for copying shared snapshots across Regions.
     * </p>
     * 
     * @param crossRegionCopy
     *        The rule for copying shared snapshots across Regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Action withCrossRegionCopy(java.util.Collection<CrossRegionCopyAction> crossRegionCopy) {
        setCrossRegionCopy(crossRegionCopy);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCrossRegionCopy() != null)
            sb.append("CrossRegionCopy: ").append(getCrossRegionCopy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Action == false)
            return false;
        Action other = (Action) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCrossRegionCopy() == null ^ this.getCrossRegionCopy() == null)
            return false;
        if (other.getCrossRegionCopy() != null && other.getCrossRegionCopy().equals(this.getCrossRegionCopy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCrossRegionCopy() == null) ? 0 : getCrossRegionCopy().hashCode());
        return hashCode;
    }

    @Override
    public Action clone() {
        try {
            return (Action) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dlm.model.transform.ActionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
