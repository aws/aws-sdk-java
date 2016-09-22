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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a global secondary index to be deleted from an existing table.
 * </p>
 */
public class DeleteGlobalSecondaryIndexAction implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global secondary index to be deleted.
     * </p>
     */
    private String indexName;

    /**
     * <p>
     * The name of the global secondary index to be deleted.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index to be deleted.
     */

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be deleted.
     * </p>
     * 
     * @return The name of the global secondary index to be deleted.
     */

    public String getIndexName() {
        return this.indexName;
    }

    /**
     * <p>
     * The name of the global secondary index to be deleted.
     * </p>
     * 
     * @param indexName
     *        The name of the global secondary index to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGlobalSecondaryIndexAction withIndexName(String indexName) {
        setIndexName(indexName);
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
        if (getIndexName() != null)
            sb.append("IndexName: " + getIndexName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGlobalSecondaryIndexAction == false)
            return false;
        DeleteGlobalSecondaryIndexAction other = (DeleteGlobalSecondaryIndexAction) obj;
        if (other.getIndexName() == null ^ this.getIndexName() == null)
            return false;
        if (other.getIndexName() != null && other.getIndexName().equals(this.getIndexName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIndexName() == null) ? 0 : getIndexName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGlobalSecondaryIndexAction clone() {
        try {
            return (DeleteGlobalSecondaryIndexAction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
