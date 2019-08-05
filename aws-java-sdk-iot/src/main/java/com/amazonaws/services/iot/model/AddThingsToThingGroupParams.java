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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Parameters used when defining a mitigation action that move a set of things to a thing group.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddThingsToThingGroupParams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing
     * to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * </p>
     */
    private java.util.List<String> thingGroupNames;
    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are
     * part of one or more dynamic things groups.
     * </p>
     */
    private Boolean overrideDynamicGroups;

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing
     * to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * </p>
     * 
     * @return The list of groups to which you want to add the things that triggered the mitigation action. You can add
     *         a thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same
     *         hierarchy.
     */

    public java.util.List<String> getThingGroupNames() {
        return thingGroupNames;
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing
     * to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * </p>
     * 
     * @param thingGroupNames
     *        The list of groups to which you want to add the things that triggered the mitigation action. You can add a
     *        thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     */

    public void setThingGroupNames(java.util.Collection<String> thingGroupNames) {
        if (thingGroupNames == null) {
            this.thingGroupNames = null;
            return;
        }

        this.thingGroupNames = new java.util.ArrayList<String>(thingGroupNames);
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing
     * to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThingGroupNames(java.util.Collection)} or {@link #withThingGroupNames(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param thingGroupNames
     *        The list of groups to which you want to add the things that triggered the mitigation action. You can add a
     *        thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddThingsToThingGroupParams withThingGroupNames(String... thingGroupNames) {
        if (this.thingGroupNames == null) {
            setThingGroupNames(new java.util.ArrayList<String>(thingGroupNames.length));
        }
        for (String ele : thingGroupNames) {
            this.thingGroupNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of groups to which you want to add the things that triggered the mitigation action. You can add a thing
     * to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * </p>
     * 
     * @param thingGroupNames
     *        The list of groups to which you want to add the things that triggered the mitigation action. You can add a
     *        thing to a maximum of 10 groups, but you cannot add a thing to more than one group in the same hierarchy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddThingsToThingGroupParams withThingGroupNames(java.util.Collection<String> thingGroupNames) {
        setThingGroupNames(thingGroupNames);
        return this;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are
     * part of one or more dynamic things groups.
     * </p>
     * 
     * @param overrideDynamicGroups
     *        Specifies if this mitigation action can move the things that triggered the mitigation action even if they
     *        are part of one or more dynamic things groups.
     */

    public void setOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        this.overrideDynamicGroups = overrideDynamicGroups;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are
     * part of one or more dynamic things groups.
     * </p>
     * 
     * @return Specifies if this mitigation action can move the things that triggered the mitigation action even if they
     *         are part of one or more dynamic things groups.
     */

    public Boolean getOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are
     * part of one or more dynamic things groups.
     * </p>
     * 
     * @param overrideDynamicGroups
     *        Specifies if this mitigation action can move the things that triggered the mitigation action even if they
     *        are part of one or more dynamic things groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddThingsToThingGroupParams withOverrideDynamicGroups(Boolean overrideDynamicGroups) {
        setOverrideDynamicGroups(overrideDynamicGroups);
        return this;
    }

    /**
     * <p>
     * Specifies if this mitigation action can move the things that triggered the mitigation action even if they are
     * part of one or more dynamic things groups.
     * </p>
     * 
     * @return Specifies if this mitigation action can move the things that triggered the mitigation action even if they
     *         are part of one or more dynamic things groups.
     */

    public Boolean isOverrideDynamicGroups() {
        return this.overrideDynamicGroups;
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
        if (getThingGroupNames() != null)
            sb.append("ThingGroupNames: ").append(getThingGroupNames()).append(",");
        if (getOverrideDynamicGroups() != null)
            sb.append("OverrideDynamicGroups: ").append(getOverrideDynamicGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddThingsToThingGroupParams == false)
            return false;
        AddThingsToThingGroupParams other = (AddThingsToThingGroupParams) obj;
        if (other.getThingGroupNames() == null ^ this.getThingGroupNames() == null)
            return false;
        if (other.getThingGroupNames() != null && other.getThingGroupNames().equals(this.getThingGroupNames()) == false)
            return false;
        if (other.getOverrideDynamicGroups() == null ^ this.getOverrideDynamicGroups() == null)
            return false;
        if (other.getOverrideDynamicGroups() != null && other.getOverrideDynamicGroups().equals(this.getOverrideDynamicGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getThingGroupNames() == null) ? 0 : getThingGroupNames().hashCode());
        hashCode = prime * hashCode + ((getOverrideDynamicGroups() == null) ? 0 : getOverrideDynamicGroups().hashCode());
        return hashCode;
    }

    @Override
    public AddThingsToThingGroupParams clone() {
        try {
            return (AddThingsToThingGroupParams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AddThingsToThingGroupParamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
