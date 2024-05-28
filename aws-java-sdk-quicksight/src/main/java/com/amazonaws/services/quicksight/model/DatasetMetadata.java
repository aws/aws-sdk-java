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
 * A structure that represents a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DatasetMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String datasetArn;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String datasetName;
    /**
     * <p>
     * The description of the dataset.
     * </p>
     */
    private String datasetDescription;
    /**
     * <p>
     * The definition of a data aggregation.
     * </p>
     */
    private DataAggregation dataAggregation;
    /**
     * <p>
     * The list of filter definitions.
     * </p>
     */
    private java.util.List<TopicFilter> filters;
    /**
     * <p>
     * The list of column definitions.
     * </p>
     */
    private java.util.List<TopicColumn> columns;
    /**
     * <p>
     * The list of calculated field definitions.
     * </p>
     */
    private java.util.List<TopicCalculatedField> calculatedFields;
    /**
     * <p>
     * The list of named entities definitions.
     * </p>
     */
    private java.util.List<TopicNamedEntity> namedEntities;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setDatasetArn(String datasetArn) {
        this.datasetArn = datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getDatasetArn() {
        return this.datasetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param datasetArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDatasetArn(String datasetArn) {
        setDatasetArn(datasetArn);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     */

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param datasetName
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDatasetName(String datasetName) {
        setDatasetName(datasetName);
        return this;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @param datasetDescription
     *        The description of the dataset.
     */

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @return The description of the dataset.
     */

    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    /**
     * <p>
     * The description of the dataset.
     * </p>
     * 
     * @param datasetDescription
     *        The description of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDatasetDescription(String datasetDescription) {
        setDatasetDescription(datasetDescription);
        return this;
    }

    /**
     * <p>
     * The definition of a data aggregation.
     * </p>
     * 
     * @param dataAggregation
     *        The definition of a data aggregation.
     */

    public void setDataAggregation(DataAggregation dataAggregation) {
        this.dataAggregation = dataAggregation;
    }

    /**
     * <p>
     * The definition of a data aggregation.
     * </p>
     * 
     * @return The definition of a data aggregation.
     */

    public DataAggregation getDataAggregation() {
        return this.dataAggregation;
    }

    /**
     * <p>
     * The definition of a data aggregation.
     * </p>
     * 
     * @param dataAggregation
     *        The definition of a data aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withDataAggregation(DataAggregation dataAggregation) {
        setDataAggregation(dataAggregation);
        return this;
    }

    /**
     * <p>
     * The list of filter definitions.
     * </p>
     * 
     * @return The list of filter definitions.
     */

    public java.util.List<TopicFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The list of filter definitions.
     * </p>
     * 
     * @param filters
     *        The list of filter definitions.
     */

    public void setFilters(java.util.Collection<TopicFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<TopicFilter>(filters);
    }

    /**
     * <p>
     * The list of filter definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        The list of filter definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withFilters(TopicFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<TopicFilter>(filters.length));
        }
        for (TopicFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of filter definitions.
     * </p>
     * 
     * @param filters
     *        The list of filter definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withFilters(java.util.Collection<TopicFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The list of column definitions.
     * </p>
     * 
     * @return The list of column definitions.
     */

    public java.util.List<TopicColumn> getColumns() {
        return columns;
    }

    /**
     * <p>
     * The list of column definitions.
     * </p>
     * 
     * @param columns
     *        The list of column definitions.
     */

    public void setColumns(java.util.Collection<TopicColumn> columns) {
        if (columns == null) {
            this.columns = null;
            return;
        }

        this.columns = new java.util.ArrayList<TopicColumn>(columns);
    }

    /**
     * <p>
     * The list of column definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumns(java.util.Collection)} or {@link #withColumns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param columns
     *        The list of column definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withColumns(TopicColumn... columns) {
        if (this.columns == null) {
            setColumns(new java.util.ArrayList<TopicColumn>(columns.length));
        }
        for (TopicColumn ele : columns) {
            this.columns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of column definitions.
     * </p>
     * 
     * @param columns
     *        The list of column definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withColumns(java.util.Collection<TopicColumn> columns) {
        setColumns(columns);
        return this;
    }

    /**
     * <p>
     * The list of calculated field definitions.
     * </p>
     * 
     * @return The list of calculated field definitions.
     */

    public java.util.List<TopicCalculatedField> getCalculatedFields() {
        return calculatedFields;
    }

    /**
     * <p>
     * The list of calculated field definitions.
     * </p>
     * 
     * @param calculatedFields
     *        The list of calculated field definitions.
     */

    public void setCalculatedFields(java.util.Collection<TopicCalculatedField> calculatedFields) {
        if (calculatedFields == null) {
            this.calculatedFields = null;
            return;
        }

        this.calculatedFields = new java.util.ArrayList<TopicCalculatedField>(calculatedFields);
    }

    /**
     * <p>
     * The list of calculated field definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCalculatedFields(java.util.Collection)} or {@link #withCalculatedFields(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param calculatedFields
     *        The list of calculated field definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withCalculatedFields(TopicCalculatedField... calculatedFields) {
        if (this.calculatedFields == null) {
            setCalculatedFields(new java.util.ArrayList<TopicCalculatedField>(calculatedFields.length));
        }
        for (TopicCalculatedField ele : calculatedFields) {
            this.calculatedFields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of calculated field definitions.
     * </p>
     * 
     * @param calculatedFields
     *        The list of calculated field definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withCalculatedFields(java.util.Collection<TopicCalculatedField> calculatedFields) {
        setCalculatedFields(calculatedFields);
        return this;
    }

    /**
     * <p>
     * The list of named entities definitions.
     * </p>
     * 
     * @return The list of named entities definitions.
     */

    public java.util.List<TopicNamedEntity> getNamedEntities() {
        return namedEntities;
    }

    /**
     * <p>
     * The list of named entities definitions.
     * </p>
     * 
     * @param namedEntities
     *        The list of named entities definitions.
     */

    public void setNamedEntities(java.util.Collection<TopicNamedEntity> namedEntities) {
        if (namedEntities == null) {
            this.namedEntities = null;
            return;
        }

        this.namedEntities = new java.util.ArrayList<TopicNamedEntity>(namedEntities);
    }

    /**
     * <p>
     * The list of named entities definitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNamedEntities(java.util.Collection)} or {@link #withNamedEntities(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param namedEntities
     *        The list of named entities definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withNamedEntities(TopicNamedEntity... namedEntities) {
        if (this.namedEntities == null) {
            setNamedEntities(new java.util.ArrayList<TopicNamedEntity>(namedEntities.length));
        }
        for (TopicNamedEntity ele : namedEntities) {
            this.namedEntities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of named entities definitions.
     * </p>
     * 
     * @param namedEntities
     *        The list of named entities definitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetMetadata withNamedEntities(java.util.Collection<TopicNamedEntity> namedEntities) {
        setNamedEntities(namedEntities);
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
        if (getDatasetArn() != null)
            sb.append("DatasetArn: ").append(getDatasetArn()).append(",");
        if (getDatasetName() != null)
            sb.append("DatasetName: ").append(getDatasetName()).append(",");
        if (getDatasetDescription() != null)
            sb.append("DatasetDescription: ").append(getDatasetDescription()).append(",");
        if (getDataAggregation() != null)
            sb.append("DataAggregation: ").append(getDataAggregation()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getColumns() != null)
            sb.append("Columns: ").append(getColumns()).append(",");
        if (getCalculatedFields() != null)
            sb.append("CalculatedFields: ").append(getCalculatedFields()).append(",");
        if (getNamedEntities() != null)
            sb.append("NamedEntities: ").append(getNamedEntities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetMetadata == false)
            return false;
        DatasetMetadata other = (DatasetMetadata) obj;
        if (other.getDatasetArn() == null ^ this.getDatasetArn() == null)
            return false;
        if (other.getDatasetArn() != null && other.getDatasetArn().equals(this.getDatasetArn()) == false)
            return false;
        if (other.getDatasetName() == null ^ this.getDatasetName() == null)
            return false;
        if (other.getDatasetName() != null && other.getDatasetName().equals(this.getDatasetName()) == false)
            return false;
        if (other.getDatasetDescription() == null ^ this.getDatasetDescription() == null)
            return false;
        if (other.getDatasetDescription() != null && other.getDatasetDescription().equals(this.getDatasetDescription()) == false)
            return false;
        if (other.getDataAggregation() == null ^ this.getDataAggregation() == null)
            return false;
        if (other.getDataAggregation() != null && other.getDataAggregation().equals(this.getDataAggregation()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getColumns() == null ^ this.getColumns() == null)
            return false;
        if (other.getColumns() != null && other.getColumns().equals(this.getColumns()) == false)
            return false;
        if (other.getCalculatedFields() == null ^ this.getCalculatedFields() == null)
            return false;
        if (other.getCalculatedFields() != null && other.getCalculatedFields().equals(this.getCalculatedFields()) == false)
            return false;
        if (other.getNamedEntities() == null ^ this.getNamedEntities() == null)
            return false;
        if (other.getNamedEntities() != null && other.getNamedEntities().equals(this.getNamedEntities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetArn() == null) ? 0 : getDatasetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetName() == null) ? 0 : getDatasetName().hashCode());
        hashCode = prime * hashCode + ((getDatasetDescription() == null) ? 0 : getDatasetDescription().hashCode());
        hashCode = prime * hashCode + ((getDataAggregation() == null) ? 0 : getDataAggregation().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getColumns() == null) ? 0 : getColumns().hashCode());
        hashCode = prime * hashCode + ((getCalculatedFields() == null) ? 0 : getCalculatedFields().hashCode());
        hashCode = prime * hashCode + ((getNamedEntities() == null) ? 0 : getNamedEntities().hashCode());
        return hashCode;
    }

    @Override
    public DatasetMetadata clone() {
        try {
            return (DatasetMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DatasetMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
