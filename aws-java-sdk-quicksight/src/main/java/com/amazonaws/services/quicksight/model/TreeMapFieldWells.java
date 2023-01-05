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
 * The field wells of a tree map.
 * </p>
 * <p>
 * This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TreeMapFieldWells" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreeMapFieldWells implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The aggregated field wells of a tree map.
     * </p>
     */
    private TreeMapAggregatedFieldWells treeMapAggregatedFieldWells;

    /**
     * <p>
     * The aggregated field wells of a tree map.
     * </p>
     * 
     * @param treeMapAggregatedFieldWells
     *        The aggregated field wells of a tree map.
     */

    public void setTreeMapAggregatedFieldWells(TreeMapAggregatedFieldWells treeMapAggregatedFieldWells) {
        this.treeMapAggregatedFieldWells = treeMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a tree map.
     * </p>
     * 
     * @return The aggregated field wells of a tree map.
     */

    public TreeMapAggregatedFieldWells getTreeMapAggregatedFieldWells() {
        return this.treeMapAggregatedFieldWells;
    }

    /**
     * <p>
     * The aggregated field wells of a tree map.
     * </p>
     * 
     * @param treeMapAggregatedFieldWells
     *        The aggregated field wells of a tree map.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapFieldWells withTreeMapAggregatedFieldWells(TreeMapAggregatedFieldWells treeMapAggregatedFieldWells) {
        setTreeMapAggregatedFieldWells(treeMapAggregatedFieldWells);
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
        if (getTreeMapAggregatedFieldWells() != null)
            sb.append("TreeMapAggregatedFieldWells: ").append(getTreeMapAggregatedFieldWells());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TreeMapFieldWells == false)
            return false;
        TreeMapFieldWells other = (TreeMapFieldWells) obj;
        if (other.getTreeMapAggregatedFieldWells() == null ^ this.getTreeMapAggregatedFieldWells() == null)
            return false;
        if (other.getTreeMapAggregatedFieldWells() != null && other.getTreeMapAggregatedFieldWells().equals(this.getTreeMapAggregatedFieldWells()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreeMapAggregatedFieldWells() == null) ? 0 : getTreeMapAggregatedFieldWells().hashCode());
        return hashCode;
    }

    @Override
    public TreeMapFieldWells clone() {
        try {
            return (TreeMapFieldWells) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TreeMapFieldWellsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
