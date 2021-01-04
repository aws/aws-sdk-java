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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Indicates the slot configuration and global identifier for a slice group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/GlobalNodeGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GlobalNodeGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global node group
     * </p>
     */
    private String globalNodeGroupId;
    /**
     * <p>
     * The keyspace for this node group
     * </p>
     */
    private String slots;

    /**
     * <p>
     * The name of the global node group
     * </p>
     * 
     * @param globalNodeGroupId
     *        The name of the global node group
     */

    public void setGlobalNodeGroupId(String globalNodeGroupId) {
        this.globalNodeGroupId = globalNodeGroupId;
    }

    /**
     * <p>
     * The name of the global node group
     * </p>
     * 
     * @return The name of the global node group
     */

    public String getGlobalNodeGroupId() {
        return this.globalNodeGroupId;
    }

    /**
     * <p>
     * The name of the global node group
     * </p>
     * 
     * @param globalNodeGroupId
     *        The name of the global node group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNodeGroup withGlobalNodeGroupId(String globalNodeGroupId) {
        setGlobalNodeGroupId(globalNodeGroupId);
        return this;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     * 
     * @param slots
     *        The keyspace for this node group
     */

    public void setSlots(String slots) {
        this.slots = slots;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     * 
     * @return The keyspace for this node group
     */

    public String getSlots() {
        return this.slots;
    }

    /**
     * <p>
     * The keyspace for this node group
     * </p>
     * 
     * @param slots
     *        The keyspace for this node group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GlobalNodeGroup withSlots(String slots) {
        setSlots(slots);
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
        if (getGlobalNodeGroupId() != null)
            sb.append("GlobalNodeGroupId: ").append(getGlobalNodeGroupId()).append(",");
        if (getSlots() != null)
            sb.append("Slots: ").append(getSlots());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GlobalNodeGroup == false)
            return false;
        GlobalNodeGroup other = (GlobalNodeGroup) obj;
        if (other.getGlobalNodeGroupId() == null ^ this.getGlobalNodeGroupId() == null)
            return false;
        if (other.getGlobalNodeGroupId() != null && other.getGlobalNodeGroupId().equals(this.getGlobalNodeGroupId()) == false)
            return false;
        if (other.getSlots() == null ^ this.getSlots() == null)
            return false;
        if (other.getSlots() != null && other.getSlots().equals(this.getSlots()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalNodeGroupId() == null) ? 0 : getGlobalNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getSlots() == null) ? 0 : getSlots().hashCode());
        return hashCode;
    }

    @Override
    public GlobalNodeGroup clone() {
        try {
            return (GlobalNodeGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
