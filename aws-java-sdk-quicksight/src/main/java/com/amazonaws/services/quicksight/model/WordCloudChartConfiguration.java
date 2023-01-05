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
 * The configuration of a word cloud visual.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/WordCloudChartConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WordCloudChartConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     */
    private WordCloudFieldWells fieldWells;
    /**
     * <p>
     * The sort configuration of a word cloud visual.
     * </p>
     */
    private WordCloudSortConfiguration sortConfiguration;
    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     * </p>
     */
    private ChartAxisLabelOptions categoryLabelOptions;
    /**
     * <p>
     * The options for a word cloud visual.
     * </p>
     */
    private WordCloudOptions wordCloudOptions;

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     */

    public void setFieldWells(WordCloudFieldWells fieldWells) {
        this.fieldWells = fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @return The field wells of the visual.
     */

    public WordCloudFieldWells getFieldWells() {
        return this.fieldWells;
    }

    /**
     * <p>
     * The field wells of the visual.
     * </p>
     * 
     * @param fieldWells
     *        The field wells of the visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudChartConfiguration withFieldWells(WordCloudFieldWells fieldWells) {
        setFieldWells(fieldWells);
        return this;
    }

    /**
     * <p>
     * The sort configuration of a word cloud visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a word cloud visual.
     */

    public void setSortConfiguration(WordCloudSortConfiguration sortConfiguration) {
        this.sortConfiguration = sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a word cloud visual.
     * </p>
     * 
     * @return The sort configuration of a word cloud visual.
     */

    public WordCloudSortConfiguration getSortConfiguration() {
        return this.sortConfiguration;
    }

    /**
     * <p>
     * The sort configuration of a word cloud visual.
     * </p>
     * 
     * @param sortConfiguration
     *        The sort configuration of a word cloud visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudChartConfiguration withSortConfiguration(WordCloudSortConfiguration sortConfiguration) {
        setSortConfiguration(sortConfiguration);
        return this;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     */

    public void setCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        this.categoryLabelOptions = categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     * </p>
     * 
     * @return The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     */

    public ChartAxisLabelOptions getCategoryLabelOptions() {
        return this.categoryLabelOptions;
    }

    /**
     * <p>
     * The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     * </p>
     * 
     * @param categoryLabelOptions
     *        The label options (label text, label visibility, and sort icon visibility) for the word cloud category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudChartConfiguration withCategoryLabelOptions(ChartAxisLabelOptions categoryLabelOptions) {
        setCategoryLabelOptions(categoryLabelOptions);
        return this;
    }

    /**
     * <p>
     * The options for a word cloud visual.
     * </p>
     * 
     * @param wordCloudOptions
     *        The options for a word cloud visual.
     */

    public void setWordCloudOptions(WordCloudOptions wordCloudOptions) {
        this.wordCloudOptions = wordCloudOptions;
    }

    /**
     * <p>
     * The options for a word cloud visual.
     * </p>
     * 
     * @return The options for a word cloud visual.
     */

    public WordCloudOptions getWordCloudOptions() {
        return this.wordCloudOptions;
    }

    /**
     * <p>
     * The options for a word cloud visual.
     * </p>
     * 
     * @param wordCloudOptions
     *        The options for a word cloud visual.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WordCloudChartConfiguration withWordCloudOptions(WordCloudOptions wordCloudOptions) {
        setWordCloudOptions(wordCloudOptions);
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
        if (getFieldWells() != null)
            sb.append("FieldWells: ").append(getFieldWells()).append(",");
        if (getSortConfiguration() != null)
            sb.append("SortConfiguration: ").append(getSortConfiguration()).append(",");
        if (getCategoryLabelOptions() != null)
            sb.append("CategoryLabelOptions: ").append(getCategoryLabelOptions()).append(",");
        if (getWordCloudOptions() != null)
            sb.append("WordCloudOptions: ").append(getWordCloudOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WordCloudChartConfiguration == false)
            return false;
        WordCloudChartConfiguration other = (WordCloudChartConfiguration) obj;
        if (other.getFieldWells() == null ^ this.getFieldWells() == null)
            return false;
        if (other.getFieldWells() != null && other.getFieldWells().equals(this.getFieldWells()) == false)
            return false;
        if (other.getSortConfiguration() == null ^ this.getSortConfiguration() == null)
            return false;
        if (other.getSortConfiguration() != null && other.getSortConfiguration().equals(this.getSortConfiguration()) == false)
            return false;
        if (other.getCategoryLabelOptions() == null ^ this.getCategoryLabelOptions() == null)
            return false;
        if (other.getCategoryLabelOptions() != null && other.getCategoryLabelOptions().equals(this.getCategoryLabelOptions()) == false)
            return false;
        if (other.getWordCloudOptions() == null ^ this.getWordCloudOptions() == null)
            return false;
        if (other.getWordCloudOptions() != null && other.getWordCloudOptions().equals(this.getWordCloudOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldWells() == null) ? 0 : getFieldWells().hashCode());
        hashCode = prime * hashCode + ((getSortConfiguration() == null) ? 0 : getSortConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCategoryLabelOptions() == null) ? 0 : getCategoryLabelOptions().hashCode());
        hashCode = prime * hashCode + ((getWordCloudOptions() == null) ? 0 : getWordCloudOptions().hashCode());
        return hashCode;
    }

    @Override
    public WordCloudChartConfiguration clone() {
        try {
            return (WordCloudChartConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.WordCloudChartConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
