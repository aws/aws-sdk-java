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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a Docker image that is managed by AWS CodeBuild.
 * </p>
 */
public class EnvironmentImage implements Serializable, Cloneable {

    /**
     * <p>
     * The Docker image's name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Docker image's description.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The Docker image's name.
     * </p>
     * 
     * @param name
     *        The Docker image's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Docker image's name.
     * </p>
     * 
     * @return The Docker image's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The Docker image's name.
     * </p>
     * 
     * @param name
     *        The Docker image's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentImage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Docker image's description.
     * </p>
     * 
     * @param description
     *        The Docker image's description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The Docker image's description.
     * </p>
     * 
     * @return The Docker image's description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The Docker image's description.
     * </p>
     * 
     * @param description
     *        The Docker image's description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentImage withDescription(String description) {
        setDescription(description);
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
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentImage == false)
            return false;
        EnvironmentImage other = (EnvironmentImage) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentImage clone() {
        try {
            return (EnvironmentImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
