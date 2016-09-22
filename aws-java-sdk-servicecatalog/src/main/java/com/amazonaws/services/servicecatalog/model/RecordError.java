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
 * The error code and description resulting from an operation.
 * </p>
 */
public class RecordError implements Serializable, Cloneable {

    /**
     * <p>
     * The numeric value of the error.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The text description of the error.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The numeric value of the error.
     * </p>
     * 
     * @param code
     *        The numeric value of the error.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The numeric value of the error.
     * </p>
     * 
     * @return The numeric value of the error.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The numeric value of the error.
     * </p>
     * 
     * @param code
     *        The numeric value of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The text description of the error.
     * </p>
     * 
     * @param description
     *        The text description of the error.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The text description of the error.
     * </p>
     * 
     * @return The text description of the error.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The text description of the error.
     * </p>
     * 
     * @param description
     *        The text description of the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordError withDescription(String description) {
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
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

        if (obj instanceof RecordError == false)
            return false;
        RecordError other = (RecordError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
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

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public RecordError clone() {
        try {
            return (RecordError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
