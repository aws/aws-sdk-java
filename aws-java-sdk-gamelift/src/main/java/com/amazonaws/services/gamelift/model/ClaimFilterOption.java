/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift FleetIQ and game server groups.</b>
 * </p>
 * <p>
 * Filters which game servers may be claimed when calling <code>ClaimGameServer</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ClaimFilterOption" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClaimFilterOption implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     */
    private java.util.List<String> instanceStatuses;

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     * 
     * @return List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     *         <code>ACTIVE</code> status.
     * @see FilterInstanceStatus
     */

    public java.util.List<String> getInstanceStatuses() {
        return instanceStatuses;
    }

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     * 
     * @param instanceStatuses
     *        List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     *        <code>ACTIVE</code> status.
     * @see FilterInstanceStatus
     */

    public void setInstanceStatuses(java.util.Collection<String> instanceStatuses) {
        if (instanceStatuses == null) {
            this.instanceStatuses = null;
            return;
        }

        this.instanceStatuses = new java.util.ArrayList<String>(instanceStatuses);
    }

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceStatuses(java.util.Collection)} or {@link #withInstanceStatuses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param instanceStatuses
     *        List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     *        <code>ACTIVE</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterInstanceStatus
     */

    public ClaimFilterOption withInstanceStatuses(String... instanceStatuses) {
        if (this.instanceStatuses == null) {
            setInstanceStatuses(new java.util.ArrayList<String>(instanceStatuses.length));
        }
        for (String ele : instanceStatuses) {
            this.instanceStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     * 
     * @param instanceStatuses
     *        List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     *        <code>ACTIVE</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterInstanceStatus
     */

    public ClaimFilterOption withInstanceStatuses(java.util.Collection<String> instanceStatuses) {
        setInstanceStatuses(instanceStatuses);
        return this;
    }

    /**
     * <p>
     * List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     * <code>ACTIVE</code> status.
     * </p>
     * 
     * @param instanceStatuses
     *        List of instance statuses that game servers may be claimed on. If provided, the list must contain the
     *        <code>ACTIVE</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterInstanceStatus
     */

    public ClaimFilterOption withInstanceStatuses(FilterInstanceStatus... instanceStatuses) {
        java.util.ArrayList<String> instanceStatusesCopy = new java.util.ArrayList<String>(instanceStatuses.length);
        for (FilterInstanceStatus value : instanceStatuses) {
            instanceStatusesCopy.add(value.toString());
        }
        if (getInstanceStatuses() == null) {
            setInstanceStatuses(instanceStatusesCopy);
        } else {
            getInstanceStatuses().addAll(instanceStatusesCopy);
        }
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
        if (getInstanceStatuses() != null)
            sb.append("InstanceStatuses: ").append(getInstanceStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClaimFilterOption == false)
            return false;
        ClaimFilterOption other = (ClaimFilterOption) obj;
        if (other.getInstanceStatuses() == null ^ this.getInstanceStatuses() == null)
            return false;
        if (other.getInstanceStatuses() != null && other.getInstanceStatuses().equals(this.getInstanceStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceStatuses() == null) ? 0 : getInstanceStatuses().hashCode());
        return hashCode;
    }

    @Override
    public ClaimFilterOption clone() {
        try {
            return (ClaimFilterOption) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ClaimFilterOptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
