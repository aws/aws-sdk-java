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
 * The sort configuration of a tree map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TreeMapSortConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TreeMapSortConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The sort configuration of group by fields.
     * </p>
     */
    private java.util.List<FieldSortOptions> treeMapSort;
    /**
     * <p>
     * The limit on the number of groups that are displayed.
     * </p>
     */
    private ItemsLimitConfiguration treeMapGroupItemsLimitConfiguration;

    /**
     * <p>
     * The sort configuration of group by fields.
     * </p>
     * 
     * @return The sort configuration of group by fields.
     */

    public java.util.List<FieldSortOptions> getTreeMapSort() {
        return treeMapSort;
    }

    /**
     * <p>
     * The sort configuration of group by fields.
     * </p>
     * 
     * @param treeMapSort
     *        The sort configuration of group by fields.
     */

    public void setTreeMapSort(java.util.Collection<FieldSortOptions> treeMapSort) {
        if (treeMapSort == null) {
            this.treeMapSort = null;
            return;
        }

        this.treeMapSort = new java.util.ArrayList<FieldSortOptions>(treeMapSort);
    }

    /**
     * <p>
     * The sort configuration of group by fields.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTreeMapSort(java.util.Collection)} or {@link #withTreeMapSort(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param treeMapSort
     *        The sort configuration of group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapSortConfiguration withTreeMapSort(FieldSortOptions... treeMapSort) {
        if (this.treeMapSort == null) {
            setTreeMapSort(new java.util.ArrayList<FieldSortOptions>(treeMapSort.length));
        }
        for (FieldSortOptions ele : treeMapSort) {
            this.treeMapSort.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The sort configuration of group by fields.
     * </p>
     * 
     * @param treeMapSort
     *        The sort configuration of group by fields.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapSortConfiguration withTreeMapSort(java.util.Collection<FieldSortOptions> treeMapSort) {
        setTreeMapSort(treeMapSort);
        return this;
    }

    /**
     * <p>
     * The limit on the number of groups that are displayed.
     * </p>
     * 
     * @param treeMapGroupItemsLimitConfiguration
     *        The limit on the number of groups that are displayed.
     */

    public void setTreeMapGroupItemsLimitConfiguration(ItemsLimitConfiguration treeMapGroupItemsLimitConfiguration) {
        this.treeMapGroupItemsLimitConfiguration = treeMapGroupItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of groups that are displayed.
     * </p>
     * 
     * @return The limit on the number of groups that are displayed.
     */

    public ItemsLimitConfiguration getTreeMapGroupItemsLimitConfiguration() {
        return this.treeMapGroupItemsLimitConfiguration;
    }

    /**
     * <p>
     * The limit on the number of groups that are displayed.
     * </p>
     * 
     * @param treeMapGroupItemsLimitConfiguration
     *        The limit on the number of groups that are displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TreeMapSortConfiguration withTreeMapGroupItemsLimitConfiguration(ItemsLimitConfiguration treeMapGroupItemsLimitConfiguration) {
        setTreeMapGroupItemsLimitConfiguration(treeMapGroupItemsLimitConfiguration);
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
        if (getTreeMapSort() != null)
            sb.append("TreeMapSort: ").append(getTreeMapSort()).append(",");
        if (getTreeMapGroupItemsLimitConfiguration() != null)
            sb.append("TreeMapGroupItemsLimitConfiguration: ").append(getTreeMapGroupItemsLimitConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TreeMapSortConfiguration == false)
            return false;
        TreeMapSortConfiguration other = (TreeMapSortConfiguration) obj;
        if (other.getTreeMapSort() == null ^ this.getTreeMapSort() == null)
            return false;
        if (other.getTreeMapSort() != null && other.getTreeMapSort().equals(this.getTreeMapSort()) == false)
            return false;
        if (other.getTreeMapGroupItemsLimitConfiguration() == null ^ this.getTreeMapGroupItemsLimitConfiguration() == null)
            return false;
        if (other.getTreeMapGroupItemsLimitConfiguration() != null
                && other.getTreeMapGroupItemsLimitConfiguration().equals(this.getTreeMapGroupItemsLimitConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTreeMapSort() == null) ? 0 : getTreeMapSort().hashCode());
        hashCode = prime * hashCode + ((getTreeMapGroupItemsLimitConfiguration() == null) ? 0 : getTreeMapGroupItemsLimitConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public TreeMapSortConfiguration clone() {
        try {
            return (TreeMapSortConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TreeMapSortConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
