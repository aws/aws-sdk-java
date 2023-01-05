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
 * The contents of a dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DashboardVersionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardVersionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of dataset
     * Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * </p>
     */
    private java.util.List<DataSetIdentifierDeclaration> dataSetIdentifierDeclarations;
    /**
     * <p>
     * An array of sheet definitions for a dashboard.
     * </p>
     */
    private java.util.List<SheetDefinition> sheets;
    /**
     * <p>
     * An array of calculated field definitions for the dashboard.
     * </p>
     */
    private java.util.List<CalculatedField> calculatedFields;
    /**
     * <p>
     * The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for use by
     * an action or an object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<ParameterDeclaration> parameterDeclarations;
    /**
     * <p>
     * The filter definitions for a dashboard.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     */
    private java.util.List<FilterGroup> filterGroups;
    /**
     * <p>
     * An array of dashboard-level column configurations. Column configurations are used to set the default formatting
     * for a column that is used throughout a dashboard.
     * </p>
     */
    private java.util.List<ColumnConfiguration> columnConfigurations;

    private AnalysisDefaults analysisDefaults;

    /**
     * <p>
     * An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of dataset
     * Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * </p>
     * 
     * @return An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of
     *         dataset Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     */

    public java.util.List<DataSetIdentifierDeclaration> getDataSetIdentifierDeclarations() {
        return dataSetIdentifierDeclarations;
    }

    /**
     * <p>
     * An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of dataset
     * Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * </p>
     * 
     * @param dataSetIdentifierDeclarations
     *        An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of
     *        dataset Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     */

    public void setDataSetIdentifierDeclarations(java.util.Collection<DataSetIdentifierDeclaration> dataSetIdentifierDeclarations) {
        if (dataSetIdentifierDeclarations == null) {
            this.dataSetIdentifierDeclarations = null;
            return;
        }

        this.dataSetIdentifierDeclarations = new java.util.ArrayList<DataSetIdentifierDeclaration>(dataSetIdentifierDeclarations);
    }

    /**
     * <p>
     * An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of dataset
     * Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDataSetIdentifierDeclarations(java.util.Collection)} or
     * {@link #withDataSetIdentifierDeclarations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dataSetIdentifierDeclarations
     *        An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of
     *        dataset Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withDataSetIdentifierDeclarations(DataSetIdentifierDeclaration... dataSetIdentifierDeclarations) {
        if (this.dataSetIdentifierDeclarations == null) {
            setDataSetIdentifierDeclarations(new java.util.ArrayList<DataSetIdentifierDeclaration>(dataSetIdentifierDeclarations.length));
        }
        for (DataSetIdentifierDeclaration ele : dataSetIdentifierDeclarations) {
            this.dataSetIdentifierDeclarations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of dataset
     * Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * </p>
     * 
     * @param dataSetIdentifierDeclarations
     *        An array of dataset identifier declarations. With this mapping,you can use dataset identifiers instead of
     *        dataset Amazon Resource Names (ARNs) throughout the dashboard's sub-structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withDataSetIdentifierDeclarations(java.util.Collection<DataSetIdentifierDeclaration> dataSetIdentifierDeclarations) {
        setDataSetIdentifierDeclarations(dataSetIdentifierDeclarations);
        return this;
    }

    /**
     * <p>
     * An array of sheet definitions for a dashboard.
     * </p>
     * 
     * @return An array of sheet definitions for a dashboard.
     */

    public java.util.List<SheetDefinition> getSheets() {
        return sheets;
    }

    /**
     * <p>
     * An array of sheet definitions for a dashboard.
     * </p>
     * 
     * @param sheets
     *        An array of sheet definitions for a dashboard.
     */

    public void setSheets(java.util.Collection<SheetDefinition> sheets) {
        if (sheets == null) {
            this.sheets = null;
            return;
        }

        this.sheets = new java.util.ArrayList<SheetDefinition>(sheets);
    }

    /**
     * <p>
     * An array of sheet definitions for a dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSheets(java.util.Collection)} or {@link #withSheets(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sheets
     *        An array of sheet definitions for a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withSheets(SheetDefinition... sheets) {
        if (this.sheets == null) {
            setSheets(new java.util.ArrayList<SheetDefinition>(sheets.length));
        }
        for (SheetDefinition ele : sheets) {
            this.sheets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of sheet definitions for a dashboard.
     * </p>
     * 
     * @param sheets
     *        An array of sheet definitions for a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withSheets(java.util.Collection<SheetDefinition> sheets) {
        setSheets(sheets);
        return this;
    }

    /**
     * <p>
     * An array of calculated field definitions for the dashboard.
     * </p>
     * 
     * @return An array of calculated field definitions for the dashboard.
     */

    public java.util.List<CalculatedField> getCalculatedFields() {
        return calculatedFields;
    }

    /**
     * <p>
     * An array of calculated field definitions for the dashboard.
     * </p>
     * 
     * @param calculatedFields
     *        An array of calculated field definitions for the dashboard.
     */

    public void setCalculatedFields(java.util.Collection<CalculatedField> calculatedFields) {
        if (calculatedFields == null) {
            this.calculatedFields = null;
            return;
        }

        this.calculatedFields = new java.util.ArrayList<CalculatedField>(calculatedFields);
    }

    /**
     * <p>
     * An array of calculated field definitions for the dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCalculatedFields(java.util.Collection)} or {@link #withCalculatedFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param calculatedFields
     *        An array of calculated field definitions for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withCalculatedFields(CalculatedField... calculatedFields) {
        if (this.calculatedFields == null) {
            setCalculatedFields(new java.util.ArrayList<CalculatedField>(calculatedFields.length));
        }
        for (CalculatedField ele : calculatedFields) {
            this.calculatedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of calculated field definitions for the dashboard.
     * </p>
     * 
     * @param calculatedFields
     *        An array of calculated field definitions for the dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withCalculatedFields(java.util.Collection<CalculatedField> calculatedFields) {
        setCalculatedFields(calculatedFields);
        return this;
    }

    /**
     * <p>
     * The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for use by
     * an action or an object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for
     *         use by an action or an object.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in
     *         Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<ParameterDeclaration> getParameterDeclarations() {
        return parameterDeclarations;
    }

    /**
     * <p>
     * The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for use by
     * an action or an object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param parameterDeclarations
     *        The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for
     *        use by an action or an object.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in
     *        Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setParameterDeclarations(java.util.Collection<ParameterDeclaration> parameterDeclarations) {
        if (parameterDeclarations == null) {
            this.parameterDeclarations = null;
            return;
        }

        this.parameterDeclarations = new java.util.ArrayList<ParameterDeclaration>(parameterDeclarations);
    }

    /**
     * <p>
     * The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for use by
     * an action or an object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterDeclarations(java.util.Collection)} or
     * {@link #withParameterDeclarations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param parameterDeclarations
     *        The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for
     *        use by an action or an object.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in
     *        Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withParameterDeclarations(ParameterDeclaration... parameterDeclarations) {
        if (this.parameterDeclarations == null) {
            setParameterDeclarations(new java.util.ArrayList<ParameterDeclaration>(parameterDeclarations.length));
        }
        for (ParameterDeclaration ele : parameterDeclarations) {
            this.parameterDeclarations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for use by
     * an action or an object.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param parameterDeclarations
     *        The parameter declarations for a dashboard. Parameters are named variables that can transfer a value for
     *        use by an action or an object.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html">Parameters in
     *        Amazon QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withParameterDeclarations(java.util.Collection<ParameterDeclaration> parameterDeclarations) {
        setParameterDeclarations(parameterDeclarations);
        return this;
    }

    /**
     * <p>
     * The filter definitions for a dashboard.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @return The filter definitions for a dashboard.</p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     *         QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public java.util.List<FilterGroup> getFilterGroups() {
        return filterGroups;
    }

    /**
     * <p>
     * The filter definitions for a dashboard.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filterGroups
     *        The filter definitions for a dashboard.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     *        QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     */

    public void setFilterGroups(java.util.Collection<FilterGroup> filterGroups) {
        if (filterGroups == null) {
            this.filterGroups = null;
            return;
        }

        this.filterGroups = new java.util.ArrayList<FilterGroup>(filterGroups);
    }

    /**
     * <p>
     * The filter definitions for a dashboard.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterGroups(java.util.Collection)} or {@link #withFilterGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param filterGroups
     *        The filter definitions for a dashboard.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     *        QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withFilterGroups(FilterGroup... filterGroups) {
        if (this.filterGroups == null) {
            setFilterGroups(new java.util.ArrayList<FilterGroup>(filterGroups.length));
        }
        for (FilterGroup ele : filterGroups) {
            this.filterGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filter definitions for a dashboard.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     * QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * </p>
     * 
     * @param filterGroups
     *        The filter definitions for a dashboard.</p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/quicksight/latest/user/adding-a-filter.html">Filtering Data in Amazon
     *        QuickSight</a> in the <i>Amazon QuickSight User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withFilterGroups(java.util.Collection<FilterGroup> filterGroups) {
        setFilterGroups(filterGroups);
        return this;
    }

    /**
     * <p>
     * An array of dashboard-level column configurations. Column configurations are used to set the default formatting
     * for a column that is used throughout a dashboard.
     * </p>
     * 
     * @return An array of dashboard-level column configurations. Column configurations are used to set the default
     *         formatting for a column that is used throughout a dashboard.
     */

    public java.util.List<ColumnConfiguration> getColumnConfigurations() {
        return columnConfigurations;
    }

    /**
     * <p>
     * An array of dashboard-level column configurations. Column configurations are used to set the default formatting
     * for a column that is used throughout a dashboard.
     * </p>
     * 
     * @param columnConfigurations
     *        An array of dashboard-level column configurations. Column configurations are used to set the default
     *        formatting for a column that is used throughout a dashboard.
     */

    public void setColumnConfigurations(java.util.Collection<ColumnConfiguration> columnConfigurations) {
        if (columnConfigurations == null) {
            this.columnConfigurations = null;
            return;
        }

        this.columnConfigurations = new java.util.ArrayList<ColumnConfiguration>(columnConfigurations);
    }

    /**
     * <p>
     * An array of dashboard-level column configurations. Column configurations are used to set the default formatting
     * for a column that is used throughout a dashboard.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnConfigurations(java.util.Collection)} or {@link #withColumnConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param columnConfigurations
     *        An array of dashboard-level column configurations. Column configurations are used to set the default
     *        formatting for a column that is used throughout a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withColumnConfigurations(ColumnConfiguration... columnConfigurations) {
        if (this.columnConfigurations == null) {
            setColumnConfigurations(new java.util.ArrayList<ColumnConfiguration>(columnConfigurations.length));
        }
        for (ColumnConfiguration ele : columnConfigurations) {
            this.columnConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of dashboard-level column configurations. Column configurations are used to set the default formatting
     * for a column that is used throughout a dashboard.
     * </p>
     * 
     * @param columnConfigurations
     *        An array of dashboard-level column configurations. Column configurations are used to set the default
     *        formatting for a column that is used throughout a dashboard.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withColumnConfigurations(java.util.Collection<ColumnConfiguration> columnConfigurations) {
        setColumnConfigurations(columnConfigurations);
        return this;
    }

    /**
     * @param analysisDefaults
     */

    public void setAnalysisDefaults(AnalysisDefaults analysisDefaults) {
        this.analysisDefaults = analysisDefaults;
    }

    /**
     * @return
     */

    public AnalysisDefaults getAnalysisDefaults() {
        return this.analysisDefaults;
    }

    /**
     * @param analysisDefaults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardVersionDefinition withAnalysisDefaults(AnalysisDefaults analysisDefaults) {
        setAnalysisDefaults(analysisDefaults);
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
        if (getDataSetIdentifierDeclarations() != null)
            sb.append("DataSetIdentifierDeclarations: ").append(getDataSetIdentifierDeclarations()).append(",");
        if (getSheets() != null)
            sb.append("Sheets: ").append(getSheets()).append(",");
        if (getCalculatedFields() != null)
            sb.append("CalculatedFields: ").append(getCalculatedFields()).append(",");
        if (getParameterDeclarations() != null)
            sb.append("ParameterDeclarations: ").append(getParameterDeclarations()).append(",");
        if (getFilterGroups() != null)
            sb.append("FilterGroups: ").append(getFilterGroups()).append(",");
        if (getColumnConfigurations() != null)
            sb.append("ColumnConfigurations: ").append(getColumnConfigurations()).append(",");
        if (getAnalysisDefaults() != null)
            sb.append("AnalysisDefaults: ").append(getAnalysisDefaults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DashboardVersionDefinition == false)
            return false;
        DashboardVersionDefinition other = (DashboardVersionDefinition) obj;
        if (other.getDataSetIdentifierDeclarations() == null ^ this.getDataSetIdentifierDeclarations() == null)
            return false;
        if (other.getDataSetIdentifierDeclarations() != null
                && other.getDataSetIdentifierDeclarations().equals(this.getDataSetIdentifierDeclarations()) == false)
            return false;
        if (other.getSheets() == null ^ this.getSheets() == null)
            return false;
        if (other.getSheets() != null && other.getSheets().equals(this.getSheets()) == false)
            return false;
        if (other.getCalculatedFields() == null ^ this.getCalculatedFields() == null)
            return false;
        if (other.getCalculatedFields() != null && other.getCalculatedFields().equals(this.getCalculatedFields()) == false)
            return false;
        if (other.getParameterDeclarations() == null ^ this.getParameterDeclarations() == null)
            return false;
        if (other.getParameterDeclarations() != null && other.getParameterDeclarations().equals(this.getParameterDeclarations()) == false)
            return false;
        if (other.getFilterGroups() == null ^ this.getFilterGroups() == null)
            return false;
        if (other.getFilterGroups() != null && other.getFilterGroups().equals(this.getFilterGroups()) == false)
            return false;
        if (other.getColumnConfigurations() == null ^ this.getColumnConfigurations() == null)
            return false;
        if (other.getColumnConfigurations() != null && other.getColumnConfigurations().equals(this.getColumnConfigurations()) == false)
            return false;
        if (other.getAnalysisDefaults() == null ^ this.getAnalysisDefaults() == null)
            return false;
        if (other.getAnalysisDefaults() != null && other.getAnalysisDefaults().equals(this.getAnalysisDefaults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSetIdentifierDeclarations() == null) ? 0 : getDataSetIdentifierDeclarations().hashCode());
        hashCode = prime * hashCode + ((getSheets() == null) ? 0 : getSheets().hashCode());
        hashCode = prime * hashCode + ((getCalculatedFields() == null) ? 0 : getCalculatedFields().hashCode());
        hashCode = prime * hashCode + ((getParameterDeclarations() == null) ? 0 : getParameterDeclarations().hashCode());
        hashCode = prime * hashCode + ((getFilterGroups() == null) ? 0 : getFilterGroups().hashCode());
        hashCode = prime * hashCode + ((getColumnConfigurations() == null) ? 0 : getColumnConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAnalysisDefaults() == null) ? 0 : getAnalysisDefaults().hashCode());
        return hashCode;
    }

    @Override
    public DashboardVersionDefinition clone() {
        try {
            return (DashboardVersionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DashboardVersionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
