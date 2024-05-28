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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The training data configuration to use when creating a domain recommender or custom solution version (trained model).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/TrainingDataConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingDataConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of columns.
     * Exclude columns to control what data Amazon Personalize uses to generate recommendations.
     * </p>
     * <p>
     * For example, you might have a column that you want to use only to filter recommendations. You can exclude this
     * column from training and Amazon Personalize considers it only when filtering.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> excludedDatasetColumns;

    /**
     * <p>
     * Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of columns.
     * Exclude columns to control what data Amazon Personalize uses to generate recommendations.
     * </p>
     * <p>
     * For example, you might have a column that you want to use only to filter recommendations. You can exclude this
     * column from training and Amazon Personalize considers it only when filtering.
     * </p>
     * 
     * @return Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of
     *         columns. Exclude columns to control what data Amazon Personalize uses to generate recommendations.</p>
     *         <p>
     *         For example, you might have a column that you want to use only to filter recommendations. You can exclude
     *         this column from training and Amazon Personalize considers it only when filtering.
     */

    public java.util.Map<String, java.util.List<String>> getExcludedDatasetColumns() {
        return excludedDatasetColumns;
    }

    /**
     * <p>
     * Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of columns.
     * Exclude columns to control what data Amazon Personalize uses to generate recommendations.
     * </p>
     * <p>
     * For example, you might have a column that you want to use only to filter recommendations. You can exclude this
     * column from training and Amazon Personalize considers it only when filtering.
     * </p>
     * 
     * @param excludedDatasetColumns
     *        Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of
     *        columns. Exclude columns to control what data Amazon Personalize uses to generate recommendations.</p>
     *        <p>
     *        For example, you might have a column that you want to use only to filter recommendations. You can exclude
     *        this column from training and Amazon Personalize considers it only when filtering.
     */

    public void setExcludedDatasetColumns(java.util.Map<String, java.util.List<String>> excludedDatasetColumns) {
        this.excludedDatasetColumns = excludedDatasetColumns;
    }

    /**
     * <p>
     * Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of columns.
     * Exclude columns to control what data Amazon Personalize uses to generate recommendations.
     * </p>
     * <p>
     * For example, you might have a column that you want to use only to filter recommendations. You can exclude this
     * column from training and Amazon Personalize considers it only when filtering.
     * </p>
     * 
     * @param excludedDatasetColumns
     *        Specifies the columns to exclude from training. Each key is a dataset type, and each value is a list of
     *        columns. Exclude columns to control what data Amazon Personalize uses to generate recommendations.</p>
     *        <p>
     *        For example, you might have a column that you want to use only to filter recommendations. You can exclude
     *        this column from training and Amazon Personalize considers it only when filtering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataConfig withExcludedDatasetColumns(java.util.Map<String, java.util.List<String>> excludedDatasetColumns) {
        setExcludedDatasetColumns(excludedDatasetColumns);
        return this;
    }

    /**
     * Add a single ExcludedDatasetColumns entry
     *
     * @see TrainingDataConfig#withExcludedDatasetColumns
     * @returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataConfig addExcludedDatasetColumnsEntry(String key, java.util.List<String> value) {
        if (null == this.excludedDatasetColumns) {
            this.excludedDatasetColumns = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.excludedDatasetColumns.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.excludedDatasetColumns.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExcludedDatasetColumns.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingDataConfig clearExcludedDatasetColumnsEntries() {
        this.excludedDatasetColumns = null;
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
        if (getExcludedDatasetColumns() != null)
            sb.append("ExcludedDatasetColumns: ").append(getExcludedDatasetColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingDataConfig == false)
            return false;
        TrainingDataConfig other = (TrainingDataConfig) obj;
        if (other.getExcludedDatasetColumns() == null ^ this.getExcludedDatasetColumns() == null)
            return false;
        if (other.getExcludedDatasetColumns() != null && other.getExcludedDatasetColumns().equals(this.getExcludedDatasetColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludedDatasetColumns() == null) ? 0 : getExcludedDatasetColumns().hashCode());
        return hashCode;
    }

    @Override
    public TrainingDataConfig clone() {
        try {
            return (TrainingDataConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.TrainingDataConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
