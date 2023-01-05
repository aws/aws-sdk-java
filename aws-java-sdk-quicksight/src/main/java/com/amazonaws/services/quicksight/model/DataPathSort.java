/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows data paths to be sorted by a specific data value.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataPathSort" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataPathSort implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Determines the sort direction.
     * </p>
     */
    private String direction;
    /**
     * <p>
     * The list of data paths that need to be sorted.
     * </p>
     */
    private java.util.List<DataPathValue> sortPaths;

    /**
     * <p>
     * Determines the sort direction.
     * </p>
     * 
     * @param direction
     *        Determines the sort direction.
     * @see SortDirection
     */

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * Determines the sort direction.
     * </p>
     * 
     * @return Determines the sort direction.
     * @see SortDirection
     */

    public String getDirection() {
        return this.direction;
    }

    /**
     * <p>
     * Determines the sort direction.
     * </p>
     * 
     * @param direction
     *        Determines the sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public DataPathSort withDirection(String direction) {
        setDirection(direction);
        return this;
    }

    /**
     * <p>
     * Determines the sort direction.
     * </p>
     * 
     * @param direction
     *        Determines the sort direction.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortDirection
     */

    public DataPathSort withDirection(SortDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The list of data paths that need to be sorted.
     * </p>
     * 
     * @return The list of data paths that need to be sorted.
     */

    public java.util.List<DataPathValue> getSortPaths() {
        return sortPaths;
    }

    /**
     * <p>
     * The list of data paths that need to be sorted.
     * </p>
     * 
     * @param sortPaths
     *        The list of data paths that need to be sorted.
     */

    public void setSortPaths(java.util.Collection<DataPathValue> sortPaths) {
        if (sortPaths == null) {
            this.sortPaths = null;
            return;
        }

        this.sortPaths = new java.util.ArrayList<DataPathValue>(sortPaths);
    }

    /**
     * <p>
     * The list of data paths that need to be sorted.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortPaths(java.util.Collection)} or {@link #withSortPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param sortPaths
     *        The list of data paths that need to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathSort withSortPaths(DataPathValue... sortPaths) {
        if (this.sortPaths == null) {
            setSortPaths(new java.util.ArrayList<DataPathValue>(sortPaths.length));
        }
        for (DataPathValue ele : sortPaths) {
            this.sortPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data paths that need to be sorted.
     * </p>
     * 
     * @param sortPaths
     *        The list of data paths that need to be sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataPathSort withSortPaths(java.util.Collection<DataPathValue> sortPaths) {
        setSortPaths(sortPaths);
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
        if (getDirection() != null)
            sb.append("Direction: ").append(getDirection()).append(",");
        if (getSortPaths() != null)
            sb.append("SortPaths: ").append(getSortPaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataPathSort == false)
            return false;
        DataPathSort other = (DataPathSort) obj;
        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getSortPaths() == null ^ this.getSortPaths() == null)
            return false;
        if (other.getSortPaths() != null && other.getSortPaths().equals(this.getSortPaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getSortPaths() == null) ? 0 : getSortPaths().hashCode());
        return hashCode;
    }

    @Override
    public DataPathSort clone() {
        try {
            return (DataPathSort) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataPathSortMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
