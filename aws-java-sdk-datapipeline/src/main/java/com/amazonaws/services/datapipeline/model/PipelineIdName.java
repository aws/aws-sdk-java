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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the name and identifier of a pipeline.
 * </p>
 */
public class PipelineIdName implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @param id
     *        The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     *        <code>df-297EG78HU43EEXAMPLE</code>.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @return The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     *         <code>df-297EG78HU43EEXAMPLE</code>.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     * <code>df-297EG78HU43EEXAMPLE</code>.
     * </p>
     * 
     * @param id
     *        The ID of the pipeline that was assigned by AWS Data Pipeline. This is a string of the form
     *        <code>df-297EG78HU43EEXAMPLE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineIdName withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param name
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineIdName withName(String name) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
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

        if (obj instanceof PipelineIdName == false)
            return false;
        PipelineIdName other = (PipelineIdName) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public PipelineIdName clone() {
        try {
            return (PipelineIdName) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
