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
 * Represents the output of a <i>DeleteTable</i> operation.
 * </p>
 */
public class DeleteTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private TableDescription tableDescription;

    /**
     * @param tableDescription
     */

    public void setTableDescription(TableDescription tableDescription) {
        this.tableDescription = tableDescription;
    }

    /**
     * @return
     */

    public TableDescription getTableDescription() {
        return this.tableDescription;
    }

    /**
     * @param tableDescription
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteTableResult withTableDescription(TableDescription tableDescription) {
        setTableDescription(tableDescription);
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
        if (getTableDescription() != null)
            sb.append("TableDescription: " + getTableDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteTableResult == false)
            return false;
        DeleteTableResult other = (DeleteTableResult) obj;
        if (other.getTableDescription() == null ^ this.getTableDescription() == null)
            return false;
        if (other.getTableDescription() != null && other.getTableDescription().equals(this.getTableDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableDescription() == null) ? 0 : getTableDescription().hashCode());
        return hashCode;
    }

    @Override
    public DeleteTableResult clone() {
        try {
            return (DeleteTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
