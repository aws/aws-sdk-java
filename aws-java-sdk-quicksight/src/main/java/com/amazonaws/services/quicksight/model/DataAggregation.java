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
 * A structure that represents a data aggregation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DataAggregation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String datasetRowDateGranularity;
    /**
     * <p>
     * The column name for the default date.
     * </p>
     */
    private String defaultDateColumnName;

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param datasetRowDateGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public void setDatasetRowDateGranularity(String datasetRowDateGranularity) {
        this.datasetRowDateGranularity = datasetRowDateGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public String getDatasetRowDateGranularity() {
        return this.datasetRowDateGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param datasetRowDateGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public DataAggregation withDatasetRowDateGranularity(String datasetRowDateGranularity) {
        setDatasetRowDateGranularity(datasetRowDateGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param datasetRowDateGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public DataAggregation withDatasetRowDateGranularity(TopicTimeGranularity datasetRowDateGranularity) {
        this.datasetRowDateGranularity = datasetRowDateGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The column name for the default date.
     * </p>
     * 
     * @param defaultDateColumnName
     *        The column name for the default date.
     */

    public void setDefaultDateColumnName(String defaultDateColumnName) {
        this.defaultDateColumnName = defaultDateColumnName;
    }

    /**
     * <p>
     * The column name for the default date.
     * </p>
     * 
     * @return The column name for the default date.
     */

    public String getDefaultDateColumnName() {
        return this.defaultDateColumnName;
    }

    /**
     * <p>
     * The column name for the default date.
     * </p>
     * 
     * @param defaultDateColumnName
     *        The column name for the default date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataAggregation withDefaultDateColumnName(String defaultDateColumnName) {
        setDefaultDateColumnName(defaultDateColumnName);
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
        if (getDatasetRowDateGranularity() != null)
            sb.append("DatasetRowDateGranularity: ").append(getDatasetRowDateGranularity()).append(",");
        if (getDefaultDateColumnName() != null)
            sb.append("DefaultDateColumnName: ").append(getDefaultDateColumnName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataAggregation == false)
            return false;
        DataAggregation other = (DataAggregation) obj;
        if (other.getDatasetRowDateGranularity() == null ^ this.getDatasetRowDateGranularity() == null)
            return false;
        if (other.getDatasetRowDateGranularity() != null && other.getDatasetRowDateGranularity().equals(this.getDatasetRowDateGranularity()) == false)
            return false;
        if (other.getDefaultDateColumnName() == null ^ this.getDefaultDateColumnName() == null)
            return false;
        if (other.getDefaultDateColumnName() != null && other.getDefaultDateColumnName().equals(this.getDefaultDateColumnName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetRowDateGranularity() == null) ? 0 : getDatasetRowDateGranularity().hashCode());
        hashCode = prime * hashCode + ((getDefaultDateColumnName() == null) ? 0 : getDefaultDateColumnName().hashCode());
        return hashCode;
    }

    @Override
    public DataAggregation clone() {
        try {
            return (DataAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.DataAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
