/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;

/**
 * 
 */
public class InvalidationBatch implements Serializable, Cloneable {

    private Paths paths;

    private String callerReference;

    /**
     * Default constructor for InvalidationBatch object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public InvalidationBatch() {
    }

    /**
     * Constructs a new InvalidationBatch object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param paths
     * @param callerReference
     */
    public InvalidationBatch(Paths paths, String callerReference) {
        setPaths(paths);
        setCallerReference(callerReference);
    }

    /**
     * Constructs a new InvalidationBatch object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param callerReference
     */
    public InvalidationBatch(String callerReference) {
        setCallerReference(callerReference);
    }

    /**
     * @param paths
     */
    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    /**
     * @return
     */
    public Paths getPaths() {
        return this.paths;
    }

    /**
     * @param paths
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public InvalidationBatch withPaths(Paths paths) {
        setPaths(paths);
        return this;
    }

    /**
     * @param callerReference
     */
    public void setCallerReference(String callerReference) {
        this.callerReference = callerReference;
    }

    /**
     * @return
     */
    public String getCallerReference() {
        return this.callerReference;
    }

    /**
     * @param callerReference
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public InvalidationBatch withCallerReference(String callerReference) {
        setCallerReference(callerReference);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPaths() != null)
            sb.append("Paths: " + getPaths() + ",");
        if (getCallerReference() != null)
            sb.append("CallerReference: " + getCallerReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InvalidationBatch == false)
            return false;
        InvalidationBatch other = (InvalidationBatch) obj;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null
                && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getCallerReference() == null
                ^ this.getCallerReference() == null)
            return false;
        if (other.getCallerReference() != null
                && other.getCallerReference().equals(this.getCallerReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime
                * hashCode
                + ((getCallerReference() == null) ? 0 : getCallerReference()
                        .hashCode());
        return hashCode;
    }

    @Override
    public InvalidationBatch clone() {
        try {
            return (InvalidationBatch) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}