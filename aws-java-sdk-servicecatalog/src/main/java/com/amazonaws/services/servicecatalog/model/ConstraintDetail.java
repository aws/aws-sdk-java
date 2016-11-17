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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * Detailed constraint information.
 * </p>
 */
public class ConstraintDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     */
    private String constraintId;
    /**
     * <p>
     * The type of the constraint.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The text description of the constraint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The owner of the constraint.
     * </p>
     */
    private String owner;

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param constraintId
     *        The identifier of the constraint.
     */

    public void setConstraintId(String constraintId) {
        this.constraintId = constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @return The identifier of the constraint.
     */

    public String getConstraintId() {
        return this.constraintId;
    }

    /**
     * <p>
     * The identifier of the constraint.
     * </p>
     * 
     * @param constraintId
     *        The identifier of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withConstraintId(String constraintId) {
        setConstraintId(constraintId);
        return this;
    }

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @param type
     *        The type of the constraint.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @return The type of the constraint.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the constraint.
     * </p>
     * 
     * @param type
     *        The type of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @return The text description of the constraint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the constraint.
     * </p>
     * 
     * @param description
     *        The text description of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @param owner
     *        The owner of the constraint.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @return The owner of the constraint.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the constraint.
     * </p>
     * 
     * @param owner
     *        The owner of the constraint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConstraintDetail withOwner(String owner) {
        setOwner(owner);
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
        if (getConstraintId() != null)
            sb.append("ConstraintId: " + getConstraintId() + ",");
        if (getType() != null)
            sb.append("Type: " + getType() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConstraintDetail == false)
            return false;
        ConstraintDetail other = (ConstraintDetail) obj;
        if (other.getConstraintId() == null ^ this.getConstraintId() == null)
            return false;
        if (other.getConstraintId() != null && other.getConstraintId().equals(this.getConstraintId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConstraintId() == null) ? 0 : getConstraintId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public ConstraintDetail clone() {
        try {
            return (ConstraintDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
