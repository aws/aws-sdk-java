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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a problem detail.
 * </p>
 */
public class ProblemDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The problem detail's ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The problem detail's name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The problem detail's ARN.
     * </p>
     * 
     * @param arn
     *        The problem detail's ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The problem detail's ARN.
     * </p>
     * 
     * @return The problem detail's ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The problem detail's ARN.
     * </p>
     * 
     * @param arn
     *        The problem detail's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProblemDetail withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The problem detail's name.
     * </p>
     * 
     * @param name
     *        The problem detail's name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The problem detail's name.
     * </p>
     * 
     * @return The problem detail's name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The problem detail's name.
     * </p>
     * 
     * @param name
     *        The problem detail's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProblemDetail withName(String name) {
        setName(name);
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
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProblemDetail == false)
            return false;
        ProblemDetail other = (ProblemDetail) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public ProblemDetail clone() {
        try {
            return (ProblemDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
