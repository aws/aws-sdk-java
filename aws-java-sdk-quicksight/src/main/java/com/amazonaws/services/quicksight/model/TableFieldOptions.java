/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The field options of a table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TableFieldOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TableFieldOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field options to be configured to a table.
     * </p>
     */
    private java.util.List<TableFieldOption> selectedFieldOptions;
    /**
     * <p>
     * The order of the field IDs that are configured as field options for a table visual.
     * </p>
     */
    private java.util.List<String> order;
    /**
     * <p>
     * The settings for the pinned columns of a table visual.
     * </p>
     */
    private TablePinnedFieldOptions pinnedFieldOptions;

    /**
     * <p>
     * The field options to be configured to a table.
     * </p>
     * 
     * @return The field options to be configured to a table.
     */

    public java.util.List<TableFieldOption> getSelectedFieldOptions() {
        return selectedFieldOptions;
    }

    /**
     * <p>
     * The field options to be configured to a table.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The field options to be configured to a table.
     */

    public void setSelectedFieldOptions(java.util.Collection<TableFieldOption> selectedFieldOptions) {
        if (selectedFieldOptions == null) {
            this.selectedFieldOptions = null;
            return;
        }

        this.selectedFieldOptions = new java.util.ArrayList<TableFieldOption>(selectedFieldOptions);
    }

    /**
     * <p>
     * The field options to be configured to a table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedFieldOptions(java.util.Collection)} or {@link #withSelectedFieldOptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The field options to be configured to a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOptions withSelectedFieldOptions(TableFieldOption... selectedFieldOptions) {
        if (this.selectedFieldOptions == null) {
            setSelectedFieldOptions(new java.util.ArrayList<TableFieldOption>(selectedFieldOptions.length));
        }
        for (TableFieldOption ele : selectedFieldOptions) {
            this.selectedFieldOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field options to be configured to a table.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The field options to be configured to a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOptions withSelectedFieldOptions(java.util.Collection<TableFieldOption> selectedFieldOptions) {
        setSelectedFieldOptions(selectedFieldOptions);
        return this;
    }

    /**
     * <p>
     * The order of the field IDs that are configured as field options for a table visual.
     * </p>
     * 
     * @return The order of the field IDs that are configured as field options for a table visual.
     */

    public java.util.List<String> getOrder() {
        return order;
    }

    /**
     * <p>
     * The order of the field IDs that are configured as field options for a table visual.
     * </p>
     * 
     * @param order
     *        The order of the field IDs that are configured as field options for a table visual.
     */

    public void setOrder(java.util.Collection<String> order) {
        if (order == null) {
            this.order = null;
            return;
        }

        this.order = new java.util.ArrayList<String>(order);
    }

    /**
     * <p>
     * The order of the field IDs that are configured as field options for a table visual.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOrder(java.util.Collection)} or {@link #withOrder(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param order
     *        The order of the field IDs that are configured as field options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOptions withOrder(String... order) {
        if (this.order == null) {
            setOrder(new java.util.ArrayList<String>(order.length));
        }
        for (String ele : order) {
            this.order.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The order of the field IDs that are configured as field options for a table visual.
     * </p>
     * 
     * @param order
     *        The order of the field IDs that are configured as field options for a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOptions withOrder(java.util.Collection<String> order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * The settings for the pinned columns of a table visual.
     * </p>
     * 
     * @param pinnedFieldOptions
     *        The settings for the pinned columns of a table visual.
     */

    public void setPinnedFieldOptions(TablePinnedFieldOptions pinnedFieldOptions) {
        this.pinnedFieldOptions = pinnedFieldOptions;
    }

    /**
     * <p>
     * The settings for the pinned columns of a table visual.
     * </p>
     * 
     * @return The settings for the pinned columns of a table visual.
     */

    public TablePinnedFieldOptions getPinnedFieldOptions() {
        return this.pinnedFieldOptions;
    }

    /**
     * <p>
     * The settings for the pinned columns of a table visual.
     * </p>
     * 
     * @param pinnedFieldOptions
     *        The settings for the pinned columns of a table visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TableFieldOptions withPinnedFieldOptions(TablePinnedFieldOptions pinnedFieldOptions) {
        setPinnedFieldOptions(pinnedFieldOptions);
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
        if (getSelectedFieldOptions() != null)
            sb.append("SelectedFieldOptions: ").append(getSelectedFieldOptions()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder()).append(",");
        if (getPinnedFieldOptions() != null)
            sb.append("PinnedFieldOptions: ").append(getPinnedFieldOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TableFieldOptions == false)
            return false;
        TableFieldOptions other = (TableFieldOptions) obj;
        if (other.getSelectedFieldOptions() == null ^ this.getSelectedFieldOptions() == null)
            return false;
        if (other.getSelectedFieldOptions() != null && other.getSelectedFieldOptions().equals(this.getSelectedFieldOptions()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        if (other.getPinnedFieldOptions() == null ^ this.getPinnedFieldOptions() == null)
            return false;
        if (other.getPinnedFieldOptions() != null && other.getPinnedFieldOptions().equals(this.getPinnedFieldOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedFieldOptions() == null) ? 0 : getSelectedFieldOptions().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        hashCode = prime * hashCode + ((getPinnedFieldOptions() == null) ? 0 : getPinnedFieldOptions().hashCode());
        return hashCode;
    }

    @Override
    public TableFieldOptions clone() {
        try {
            return (TableFieldOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TableFieldOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
