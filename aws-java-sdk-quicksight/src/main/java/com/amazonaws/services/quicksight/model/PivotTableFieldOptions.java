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
 * The field options for a pivot table visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PivotTableFieldOptions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PivotTableFieldOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The selected field options for the pivot table field options.
     * </p>
     */
    private java.util.List<PivotTableFieldOption> selectedFieldOptions;
    /**
     * <p>
     * The data path options for the pivot table field options.
     * </p>
     */
    private java.util.List<PivotTableDataPathOption> dataPathOptions;

    /**
     * <p>
     * The selected field options for the pivot table field options.
     * </p>
     * 
     * @return The selected field options for the pivot table field options.
     */

    public java.util.List<PivotTableFieldOption> getSelectedFieldOptions() {
        return selectedFieldOptions;
    }

    /**
     * <p>
     * The selected field options for the pivot table field options.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The selected field options for the pivot table field options.
     */

    public void setSelectedFieldOptions(java.util.Collection<PivotTableFieldOption> selectedFieldOptions) {
        if (selectedFieldOptions == null) {
            this.selectedFieldOptions = null;
            return;
        }

        this.selectedFieldOptions = new java.util.ArrayList<PivotTableFieldOption>(selectedFieldOptions);
    }

    /**
     * <p>
     * The selected field options for the pivot table field options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedFieldOptions(java.util.Collection)} or {@link #withSelectedFieldOptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The selected field options for the pivot table field options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOptions withSelectedFieldOptions(PivotTableFieldOption... selectedFieldOptions) {
        if (this.selectedFieldOptions == null) {
            setSelectedFieldOptions(new java.util.ArrayList<PivotTableFieldOption>(selectedFieldOptions.length));
        }
        for (PivotTableFieldOption ele : selectedFieldOptions) {
            this.selectedFieldOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selected field options for the pivot table field options.
     * </p>
     * 
     * @param selectedFieldOptions
     *        The selected field options for the pivot table field options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOptions withSelectedFieldOptions(java.util.Collection<PivotTableFieldOption> selectedFieldOptions) {
        setSelectedFieldOptions(selectedFieldOptions);
        return this;
    }

    /**
     * <p>
     * The data path options for the pivot table field options.
     * </p>
     * 
     * @return The data path options for the pivot table field options.
     */

    public java.util.List<PivotTableDataPathOption> getDataPathOptions() {
        return dataPathOptions;
    }

    /**
     * <p>
     * The data path options for the pivot table field options.
     * </p>
     * 
     * @param dataPathOptions
     *        The data path options for the pivot table field options.
     */

    public void setDataPathOptions(java.util.Collection<PivotTableDataPathOption> dataPathOptions) {
        if (dataPathOptions == null) {
            this.dataPathOptions = null;
            return;
        }

        this.dataPathOptions = new java.util.ArrayList<PivotTableDataPathOption>(dataPathOptions);
    }

    /**
     * <p>
     * The data path options for the pivot table field options.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataPathOptions(java.util.Collection)} or {@link #withDataPathOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dataPathOptions
     *        The data path options for the pivot table field options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOptions withDataPathOptions(PivotTableDataPathOption... dataPathOptions) {
        if (this.dataPathOptions == null) {
            setDataPathOptions(new java.util.ArrayList<PivotTableDataPathOption>(dataPathOptions.length));
        }
        for (PivotTableDataPathOption ele : dataPathOptions) {
            this.dataPathOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data path options for the pivot table field options.
     * </p>
     * 
     * @param dataPathOptions
     *        The data path options for the pivot table field options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PivotTableFieldOptions withDataPathOptions(java.util.Collection<PivotTableDataPathOption> dataPathOptions) {
        setDataPathOptions(dataPathOptions);
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
        if (getDataPathOptions() != null)
            sb.append("DataPathOptions: ").append(getDataPathOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PivotTableFieldOptions == false)
            return false;
        PivotTableFieldOptions other = (PivotTableFieldOptions) obj;
        if (other.getSelectedFieldOptions() == null ^ this.getSelectedFieldOptions() == null)
            return false;
        if (other.getSelectedFieldOptions() != null && other.getSelectedFieldOptions().equals(this.getSelectedFieldOptions()) == false)
            return false;
        if (other.getDataPathOptions() == null ^ this.getDataPathOptions() == null)
            return false;
        if (other.getDataPathOptions() != null && other.getDataPathOptions().equals(this.getDataPathOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSelectedFieldOptions() == null) ? 0 : getSelectedFieldOptions().hashCode());
        hashCode = prime * hashCode + ((getDataPathOptions() == null) ? 0 : getDataPathOptions().hashCode());
        return hashCode;
    }

    @Override
    public PivotTableFieldOptions clone() {
        try {
            return (PivotTableFieldOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PivotTableFieldOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
