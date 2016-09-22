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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

/**
 * <p>
 * A data volume used in a task definition.
 * </p>
 */
public class Volume implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
     * </p>
     */
    private HostVolumeProperties host;

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @return The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *         <code>mountPoints</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     * <code>mountPoints</code>.
     * </p>
     * 
     * @param name
     *        The name of the volume. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed. This name is referenced in the <code>sourceVolume</code> parameter of container definition
     *        <code>mountPoints</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
     * </p>
     * 
     * @param host
     *        The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *        container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *        a host path for your data volume, but the data is not guaranteed to persist after the containers
     *        associated with it stop running.
     */

    public void setHost(HostVolumeProperties host) {
        this.host = host;
    }

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
     * </p>
     * 
     * @return The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *         container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *         a host path for your data volume, but the data is not guaranteed to persist after the containers
     *         associated with it stop running.
     */

    public HostVolumeProperties getHost() {
        return this.host;
    }

    /**
     * <p>
     * The contents of the <code>host</code> parameter determine whether your data volume persists on the host container
     * instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns a host path for
     * your data volume, but the data is not guaranteed to persist after the containers associated with it stop running.
     * </p>
     * 
     * @param host
     *        The contents of the <code>host</code> parameter determine whether your data volume persists on the host
     *        container instance and where it is stored. If the host parameter is empty, then the Docker daemon assigns
     *        a host path for your data volume, but the data is not guaranteed to persist after the containers
     *        associated with it stop running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withHost(HostVolumeProperties host) {
        setHost(host);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getHost() != null)
            sb.append("Host: " + getHost());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHost() == null ^ this.getHost() == null)
            return false;
        if (other.getHost() != null && other.getHost().equals(this.getHost()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHost() == null) ? 0 : getHost().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
