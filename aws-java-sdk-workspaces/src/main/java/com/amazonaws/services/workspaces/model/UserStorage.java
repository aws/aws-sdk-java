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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about the user storage for a WorkSpace bundle.
 * </p>
 */
public class UserStorage implements Serializable, Cloneable {

    /**
     * <p>
     * The amount of user storage for the bundle.
     * </p>
     */
    private String capacity;

    /**
     * <p>
     * The amount of user storage for the bundle.
     * </p>
     * 
     * @param capacity
     *        The amount of user storage for the bundle.
     */

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * <p>
     * The amount of user storage for the bundle.
     * </p>
     * 
     * @return The amount of user storage for the bundle.
     */

    public String getCapacity() {
        return this.capacity;
    }

    /**
     * <p>
     * The amount of user storage for the bundle.
     * </p>
     * 
     * @param capacity
     *        The amount of user storage for the bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserStorage withCapacity(String capacity) {
        setCapacity(capacity);
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
        if (getCapacity() != null)
            sb.append("Capacity: " + getCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserStorage == false)
            return false;
        UserStorage other = (UserStorage) obj;
        if (other.getCapacity() == null ^ this.getCapacity() == null)
            return false;
        if (other.getCapacity() != null && other.getCapacity().equals(this.getCapacity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacity() == null) ? 0 : getCapacity().hashCode());
        return hashCode;
    }

    @Override
    public UserStorage clone() {
        try {
            return (UserStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
