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
 * Information about an environment variable for a build project or a build.
 * </p>
 */
public class EnvironmentVariable implements Serializable, Cloneable {

    /**
     * <p>
     * The environment variable's name or key.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The environment variable's value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The environment variable's name or key.
     * </p>
     * 
     * @param name
     *        The environment variable's name or key.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The environment variable's name or key.
     * </p>
     * 
     * @return The environment variable's name or key.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The environment variable's name or key.
     * </p>
     * 
     * @param name
     *        The environment variable's name or key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The environment variable's value.
     * </p>
     * 
     * @param value
     *        The environment variable's value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The environment variable's value.
     * </p>
     * 
     * @return The environment variable's value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The environment variable's value.
     * </p>
     * 
     * @param value
     *        The environment variable's value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnvironmentVariable withValue(String value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnvironmentVariable == false)
            return false;
        EnvironmentVariable other = (EnvironmentVariable) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public EnvironmentVariable clone() {
        try {
            return (EnvironmentVariable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
