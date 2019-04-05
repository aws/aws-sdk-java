/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.services.s3.model;

import java.io.Serializable;

/**
 * Container for information regarding the access control for replicas.
 *
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3-2006-03-01/AccessControlTranslation" target="_top">AWS API
 * Documentation</a>
 */
public class AccessControlTranslation implements Serializable, Cloneable {

    /**
     * The override value for the owner of the replica object.
     */
    private String owner;

    /**
     * Returns the override value for the owner of the replica object
     * in {@link String} format.
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the override value for the owner of the replica object.
     *
     * @param owner New owner override
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * Sets the override value for the owner of the replica object.
     *
     * @param owner New owner override
     * @return This object for method chaining.
     */
    public AccessControlTranslation withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * Sets the override value for the owner of the replica object.
     *
     * @param owner New owner override
     * @return This object for method chaining.
     */
    public AccessControlTranslation withOwner(OwnerOverride owner) {
        setOwner(owner == null ? null : owner.toString());
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOwner() != null) {
            sb.append("Owner: ").append(getOwner()).append(",");
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }

        if (obj instanceof AccessControlTranslation == false) {
            return false;
        }
        AccessControlTranslation other = (AccessControlTranslation) obj;
        if (other.getOwner() == null ^ this.getOwner() == null) {
            return false;
        }
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public AccessControlTranslation clone() {
        try {
            return (AccessControlTranslation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
