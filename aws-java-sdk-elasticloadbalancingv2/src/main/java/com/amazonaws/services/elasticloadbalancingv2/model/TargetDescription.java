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
package com.amazonaws.services.elasticloadbalancingv2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a target.
 * </p>
 */
public class TargetDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the target.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param id
     *        The ID of the target.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @return The ID of the target.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target.
     * </p>
     * 
     * @param id
     *        The ID of the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDescription withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @return The port on which the target is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetDescription withPort(Integer port) {
        setPort(port);
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetDescription == false)
            return false;
        TargetDescription other = (TargetDescription) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        return hashCode;
    }

    @Override
    public TargetDescription clone() {
        try {
            return (TargetDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
