/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEntityAggregates" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEntityAggregatesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     */
    private java.util.List<EntityAggregate> entityAggregates;

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * 
     * @return The number of entities that are affected by each of the specified events.
     */

    public java.util.List<EntityAggregate> getEntityAggregates() {
        return entityAggregates;
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * 
     * @param entityAggregates
     *        The number of entities that are affected by each of the specified events.
     */

    public void setEntityAggregates(java.util.Collection<EntityAggregate> entityAggregates) {
        if (entityAggregates == null) {
            this.entityAggregates = null;
            return;
        }

        this.entityAggregates = new java.util.ArrayList<EntityAggregate>(entityAggregates);
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntityAggregates(java.util.Collection)} or {@link #withEntityAggregates(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param entityAggregates
     *        The number of entities that are affected by each of the specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityAggregatesResult withEntityAggregates(EntityAggregate... entityAggregates) {
        if (this.entityAggregates == null) {
            setEntityAggregates(new java.util.ArrayList<EntityAggregate>(entityAggregates.length));
        }
        for (EntityAggregate ele : entityAggregates) {
            this.entityAggregates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The number of entities that are affected by each of the specified events.
     * </p>
     * 
     * @param entityAggregates
     *        The number of entities that are affected by each of the specified events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEntityAggregatesResult withEntityAggregates(java.util.Collection<EntityAggregate> entityAggregates) {
        setEntityAggregates(entityAggregates);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEntityAggregates() != null)
            sb.append("EntityAggregates: ").append(getEntityAggregates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEntityAggregatesResult == false)
            return false;
        DescribeEntityAggregatesResult other = (DescribeEntityAggregatesResult) obj;
        if (other.getEntityAggregates() == null ^ this.getEntityAggregates() == null)
            return false;
        if (other.getEntityAggregates() != null && other.getEntityAggregates().equals(this.getEntityAggregates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntityAggregates() == null) ? 0 : getEntityAggregates().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEntityAggregatesResult clone() {
        try {
            return (DescribeEntityAggregatesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
