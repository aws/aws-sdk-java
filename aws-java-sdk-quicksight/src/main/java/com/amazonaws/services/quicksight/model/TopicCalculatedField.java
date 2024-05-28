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
 * A structure that represents a calculated field.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicCalculatedField" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicCalculatedField implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The calculated field name.
     * </p>
     */
    private String calculatedFieldName;
    /**
     * <p>
     * The calculated field description.
     * </p>
     */
    private String calculatedFieldDescription;
    /**
     * <p>
     * The calculated field expression.
     * </p>
     */
    private String expression;
    /**
     * <p>
     * The other names or aliases for the calculated field.
     * </p>
     */
    private java.util.List<String> calculatedFieldSynonyms;
    /**
     * <p>
     * A boolean value that indicates if a calculated field is included in the topic.
     * </p>
     */
    private Boolean isIncludedInTopic;
    /**
     * <p>
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * </p>
     */
    private Boolean disableIndexing;
    /**
     * <p>
     * The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code> and
     * <code>MEASURE</code>.
     * </p>
     */
    private String columnDataRole;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;
    /**
     * <p>
     * The default formatting definition.
     * </p>
     */
    private DefaultFormatting defaultFormatting;
    /**
     * <p>
     * The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>, <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * </p>
     */
    private String aggregation;
    /**
     * <p>
     * The order in which data is displayed for the calculated field when it's used in a comparative context.
     * </p>
     */
    private ComparativeOrder comparativeOrder;
    /**
     * <p>
     * The semantic type.
     * </p>
     */
    private SemanticType semanticType;
    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     */
    private java.util.List<String> allowedAggregations;
    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     */
    private java.util.List<String> notAllowedAggregations;
    /**
     * <p>
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     * </p>
     */
    private Boolean neverAggregateInFilter;
    /**
     * <p>
     * The other names or aliases for the calculated field cell value.
     * </p>
     */
    private java.util.List<CellValueSynonym> cellValueSynonyms;
    /**
     * <p>
     * The non additive for the table style target.
     * </p>
     */
    private Boolean nonAdditive;

    /**
     * <p>
     * The calculated field name.
     * </p>
     * 
     * @param calculatedFieldName
     *        The calculated field name.
     */

    public void setCalculatedFieldName(String calculatedFieldName) {
        this.calculatedFieldName = calculatedFieldName;
    }

    /**
     * <p>
     * The calculated field name.
     * </p>
     * 
     * @return The calculated field name.
     */

    public String getCalculatedFieldName() {
        return this.calculatedFieldName;
    }

    /**
     * <p>
     * The calculated field name.
     * </p>
     * 
     * @param calculatedFieldName
     *        The calculated field name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCalculatedFieldName(String calculatedFieldName) {
        setCalculatedFieldName(calculatedFieldName);
        return this;
    }

    /**
     * <p>
     * The calculated field description.
     * </p>
     * 
     * @param calculatedFieldDescription
     *        The calculated field description.
     */

    public void setCalculatedFieldDescription(String calculatedFieldDescription) {
        this.calculatedFieldDescription = calculatedFieldDescription;
    }

    /**
     * <p>
     * The calculated field description.
     * </p>
     * 
     * @return The calculated field description.
     */

    public String getCalculatedFieldDescription() {
        return this.calculatedFieldDescription;
    }

    /**
     * <p>
     * The calculated field description.
     * </p>
     * 
     * @param calculatedFieldDescription
     *        The calculated field description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCalculatedFieldDescription(String calculatedFieldDescription) {
        setCalculatedFieldDescription(calculatedFieldDescription);
        return this;
    }

    /**
     * <p>
     * The calculated field expression.
     * </p>
     * 
     * @param expression
     *        The calculated field expression.
     */

    public void setExpression(String expression) {
        this.expression = expression;
    }

    /**
     * <p>
     * The calculated field expression.
     * </p>
     * 
     * @return The calculated field expression.
     */

    public String getExpression() {
        return this.expression;
    }

    /**
     * <p>
     * The calculated field expression.
     * </p>
     * 
     * @param expression
     *        The calculated field expression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withExpression(String expression) {
        setExpression(expression);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field.
     * </p>
     * 
     * @return The other names or aliases for the calculated field.
     */

    public java.util.List<String> getCalculatedFieldSynonyms() {
        return calculatedFieldSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field.
     * </p>
     * 
     * @param calculatedFieldSynonyms
     *        The other names or aliases for the calculated field.
     */

    public void setCalculatedFieldSynonyms(java.util.Collection<String> calculatedFieldSynonyms) {
        if (calculatedFieldSynonyms == null) {
            this.calculatedFieldSynonyms = null;
            return;
        }

        this.calculatedFieldSynonyms = new java.util.ArrayList<String>(calculatedFieldSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the calculated field.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCalculatedFieldSynonyms(java.util.Collection)} or
     * {@link #withCalculatedFieldSynonyms(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param calculatedFieldSynonyms
     *        The other names or aliases for the calculated field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCalculatedFieldSynonyms(String... calculatedFieldSynonyms) {
        if (this.calculatedFieldSynonyms == null) {
            setCalculatedFieldSynonyms(new java.util.ArrayList<String>(calculatedFieldSynonyms.length));
        }
        for (String ele : calculatedFieldSynonyms) {
            this.calculatedFieldSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field.
     * </p>
     * 
     * @param calculatedFieldSynonyms
     *        The other names or aliases for the calculated field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCalculatedFieldSynonyms(java.util.Collection<String> calculatedFieldSynonyms) {
        setCalculatedFieldSynonyms(calculatedFieldSynonyms);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if a calculated field is included in the topic.
     * </p>
     * 
     * @param isIncludedInTopic
     *        A boolean value that indicates if a calculated field is included in the topic.
     */

    public void setIsIncludedInTopic(Boolean isIncludedInTopic) {
        this.isIncludedInTopic = isIncludedInTopic;
    }

    /**
     * <p>
     * A boolean value that indicates if a calculated field is included in the topic.
     * </p>
     * 
     * @return A boolean value that indicates if a calculated field is included in the topic.
     */

    public Boolean getIsIncludedInTopic() {
        return this.isIncludedInTopic;
    }

    /**
     * <p>
     * A boolean value that indicates if a calculated field is included in the topic.
     * </p>
     * 
     * @param isIncludedInTopic
     *        A boolean value that indicates if a calculated field is included in the topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withIsIncludedInTopic(Boolean isIncludedInTopic) {
        setIsIncludedInTopic(isIncludedInTopic);
        return this;
    }

    /**
     * <p>
     * A boolean value that indicates if a calculated field is included in the topic.
     * </p>
     * 
     * @return A boolean value that indicates if a calculated field is included in the topic.
     */

    public Boolean isIncludedInTopic() {
        return this.isIncludedInTopic;
    }

    /**
     * <p>
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * </p>
     * 
     * @param disableIndexing
     *        A Boolean value that indicates if a calculated field is visible in the autocomplete.
     */

    public void setDisableIndexing(Boolean disableIndexing) {
        this.disableIndexing = disableIndexing;
    }

    /**
     * <p>
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * </p>
     * 
     * @return A Boolean value that indicates if a calculated field is visible in the autocomplete.
     */

    public Boolean getDisableIndexing() {
        return this.disableIndexing;
    }

    /**
     * <p>
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * </p>
     * 
     * @param disableIndexing
     *        A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withDisableIndexing(Boolean disableIndexing) {
        setDisableIndexing(disableIndexing);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     * </p>
     * 
     * @return A Boolean value that indicates if a calculated field is visible in the autocomplete.
     */

    public Boolean isDisableIndexing() {
        return this.disableIndexing;
    }

    /**
     * <p>
     * The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code> and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code>
     *        and <code>MEASURE</code>.
     * @see ColumnDataRole
     */

    public void setColumnDataRole(String columnDataRole) {
        this.columnDataRole = columnDataRole;
    }

    /**
     * <p>
     * The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code> and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @return The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code>
     *         and <code>MEASURE</code>.
     * @see ColumnDataRole
     */

    public String getColumnDataRole() {
        return this.columnDataRole;
    }

    /**
     * <p>
     * The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code> and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code>
     *        and <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataRole
     */

    public TopicCalculatedField withColumnDataRole(String columnDataRole) {
        setColumnDataRole(columnDataRole);
        return this;
    }

    /**
     * <p>
     * The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code> and
     * <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The column data role for a calculated field. Valid values for this structure are <code>DIMENSION</code>
     *        and <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataRole
     */

    public TopicCalculatedField withColumnDataRole(ColumnDataRole columnDataRole) {
        this.columnDataRole = columnDataRole.toString();
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public void setTimeGranularity(String timeGranularity) {
        this.timeGranularity = timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @return The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @see TopicTimeGranularity
     */

    public String getTimeGranularity() {
        return this.timeGranularity;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public TopicCalculatedField withTimeGranularity(String timeGranularity) {
        setTimeGranularity(timeGranularity);
        return this;
    }

    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     * 
     * @param timeGranularity
     *        The level of time precision that is used to aggregate <code>DateTime</code> values.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TopicTimeGranularity
     */

    public TopicCalculatedField withTimeGranularity(TopicTimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The default formatting definition.
     * </p>
     * 
     * @param defaultFormatting
     *        The default formatting definition.
     */

    public void setDefaultFormatting(DefaultFormatting defaultFormatting) {
        this.defaultFormatting = defaultFormatting;
    }

    /**
     * <p>
     * The default formatting definition.
     * </p>
     * 
     * @return The default formatting definition.
     */

    public DefaultFormatting getDefaultFormatting() {
        return this.defaultFormatting;
    }

    /**
     * <p>
     * The default formatting definition.
     * </p>
     * 
     * @param defaultFormatting
     *        The default formatting definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withDefaultFormatting(DefaultFormatting defaultFormatting) {
        setDefaultFormatting(defaultFormatting);
        return this;
    }

    /**
     * <p>
     * The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>, <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * </p>
     * 
     * @param aggregation
     *        The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>,
     *        <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * @see DefaultAggregation
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>, <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * </p>
     * 
     * @return The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>,
     *         <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * @see DefaultAggregation
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>, <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * </p>
     * 
     * @param aggregation
     *        The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>,
     *        <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAggregation
     */

    public TopicCalculatedField withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>, <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * </p>
     * 
     * @param aggregation
     *        The default aggregation. Valid values for this structure are <code>SUM</code>, <code>MAX</code>,
     *        <code>MIN</code>, <code>COUNT</code>, <code>DISTINCT_COUNT</code>, and <code>AVERAGE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAggregation
     */

    public TopicCalculatedField withAggregation(DefaultAggregation aggregation) {
        this.aggregation = aggregation.toString();
        return this;
    }

    /**
     * <p>
     * The order in which data is displayed for the calculated field when it's used in a comparative context.
     * </p>
     * 
     * @param comparativeOrder
     *        The order in which data is displayed for the calculated field when it's used in a comparative context.
     */

    public void setComparativeOrder(ComparativeOrder comparativeOrder) {
        this.comparativeOrder = comparativeOrder;
    }

    /**
     * <p>
     * The order in which data is displayed for the calculated field when it's used in a comparative context.
     * </p>
     * 
     * @return The order in which data is displayed for the calculated field when it's used in a comparative context.
     */

    public ComparativeOrder getComparativeOrder() {
        return this.comparativeOrder;
    }

    /**
     * <p>
     * The order in which data is displayed for the calculated field when it's used in a comparative context.
     * </p>
     * 
     * @param comparativeOrder
     *        The order in which data is displayed for the calculated field when it's used in a comparative context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withComparativeOrder(ComparativeOrder comparativeOrder) {
        setComparativeOrder(comparativeOrder);
        return this;
    }

    /**
     * <p>
     * The semantic type.
     * </p>
     * 
     * @param semanticType
     *        The semantic type.
     */

    public void setSemanticType(SemanticType semanticType) {
        this.semanticType = semanticType;
    }

    /**
     * <p>
     * The semantic type.
     * </p>
     * 
     * @return The semantic type.
     */

    public SemanticType getSemanticType() {
        return this.semanticType;
    }

    /**
     * <p>
     * The semantic type.
     * </p>
     * 
     * @param semanticType
     *        The semantic type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withSemanticType(SemanticType semanticType) {
        setSemanticType(semanticType);
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @return The list of aggregation types that are allowed for the calculated field. Valid values for this structure
     *         are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *         <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *         <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public java.util.List<String> getAllowedAggregations() {
        return allowedAggregations;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the calculated field. Valid values for this structure
     *        are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public void setAllowedAggregations(java.util.Collection<String> allowedAggregations) {
        if (allowedAggregations == null) {
            this.allowedAggregations = null;
            return;
        }

        this.allowedAggregations = new java.util.ArrayList<String>(allowedAggregations);
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedAggregations(java.util.Collection)} or {@link #withAllowedAggregations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the calculated field. Valid values for this structure
     *        are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withAllowedAggregations(String... allowedAggregations) {
        if (this.allowedAggregations == null) {
            setAllowedAggregations(new java.util.ArrayList<String>(allowedAggregations.length));
        }
        for (String ele : allowedAggregations) {
            this.allowedAggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the calculated field. Valid values for this structure
     *        are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withAllowedAggregations(java.util.Collection<String> allowedAggregations) {
        setAllowedAggregations(allowedAggregations);
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the calculated field. Valid values for this structure
     *        are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withAllowedAggregations(AuthorSpecifiedAggregation... allowedAggregations) {
        java.util.ArrayList<String> allowedAggregationsCopy = new java.util.ArrayList<String>(allowedAggregations.length);
        for (AuthorSpecifiedAggregation value : allowedAggregations) {
            allowedAggregationsCopy.add(value.toString());
        }
        if (getAllowedAggregations() == null) {
            setAllowedAggregations(allowedAggregationsCopy);
        } else {
            getAllowedAggregations().addAll(allowedAggregationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @return The list of aggregation types that are not allowed for the calculated field. Valid values for this
     *         structure are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *         <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *         <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public java.util.List<String> getNotAllowedAggregations() {
        return notAllowedAggregations;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the calculated field. Valid values for this
     *        structure are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public void setNotAllowedAggregations(java.util.Collection<String> notAllowedAggregations) {
        if (notAllowedAggregations == null) {
            this.notAllowedAggregations = null;
            return;
        }

        this.notAllowedAggregations = new java.util.ArrayList<String>(notAllowedAggregations);
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotAllowedAggregations(java.util.Collection)} or
     * {@link #withNotAllowedAggregations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the calculated field. Valid values for this
     *        structure are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withNotAllowedAggregations(String... notAllowedAggregations) {
        if (this.notAllowedAggregations == null) {
            setNotAllowedAggregations(new java.util.ArrayList<String>(notAllowedAggregations.length));
        }
        for (String ele : notAllowedAggregations) {
            this.notAllowedAggregations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the calculated field. Valid values for this
     *        structure are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withNotAllowedAggregations(java.util.Collection<String> notAllowedAggregations) {
        setNotAllowedAggregations(notAllowedAggregations);
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the calculated field. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the calculated field. Valid values for this
     *        structure are <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>,
     *        <code>MEDIAN</code>, <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>,
     *        <code>VAR</code>, <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicCalculatedField withNotAllowedAggregations(AuthorSpecifiedAggregation... notAllowedAggregations) {
        java.util.ArrayList<String> notAllowedAggregationsCopy = new java.util.ArrayList<String>(notAllowedAggregations.length);
        for (AuthorSpecifiedAggregation value : notAllowedAggregations) {
            notAllowedAggregationsCopy.add(value.toString());
        }
        if (getNotAllowedAggregations() == null) {
            setNotAllowedAggregations(notAllowedAggregationsCopy);
        } else {
            getNotAllowedAggregations().addAll(notAllowedAggregationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     * </p>
     * 
     * @param neverAggregateInFilter
     *        A Boolean value that indicates whether to never aggregate calculated field in filters.
     */

    public void setNeverAggregateInFilter(Boolean neverAggregateInFilter) {
        this.neverAggregateInFilter = neverAggregateInFilter;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     * </p>
     * 
     * @return A Boolean value that indicates whether to never aggregate calculated field in filters.
     */

    public Boolean getNeverAggregateInFilter() {
        return this.neverAggregateInFilter;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     * </p>
     * 
     * @param neverAggregateInFilter
     *        A Boolean value that indicates whether to never aggregate calculated field in filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withNeverAggregateInFilter(Boolean neverAggregateInFilter) {
        setNeverAggregateInFilter(neverAggregateInFilter);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     * </p>
     * 
     * @return A Boolean value that indicates whether to never aggregate calculated field in filters.
     */

    public Boolean isNeverAggregateInFilter() {
        return this.neverAggregateInFilter;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field cell value.
     * </p>
     * 
     * @return The other names or aliases for the calculated field cell value.
     */

    public java.util.List<CellValueSynonym> getCellValueSynonyms() {
        return cellValueSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field cell value.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the calculated field cell value.
     */

    public void setCellValueSynonyms(java.util.Collection<CellValueSynonym> cellValueSynonyms) {
        if (cellValueSynonyms == null) {
            this.cellValueSynonyms = null;
            return;
        }

        this.cellValueSynonyms = new java.util.ArrayList<CellValueSynonym>(cellValueSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the calculated field cell value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCellValueSynonyms(java.util.Collection)} or {@link #withCellValueSynonyms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the calculated field cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCellValueSynonyms(CellValueSynonym... cellValueSynonyms) {
        if (this.cellValueSynonyms == null) {
            setCellValueSynonyms(new java.util.ArrayList<CellValueSynonym>(cellValueSynonyms.length));
        }
        for (CellValueSynonym ele : cellValueSynonyms) {
            this.cellValueSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the calculated field cell value.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the calculated field cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withCellValueSynonyms(java.util.Collection<CellValueSynonym> cellValueSynonyms) {
        setCellValueSynonyms(cellValueSynonyms);
        return this;
    }

    /**
     * <p>
     * The non additive for the table style target.
     * </p>
     * 
     * @param nonAdditive
     *        The non additive for the table style target.
     */

    public void setNonAdditive(Boolean nonAdditive) {
        this.nonAdditive = nonAdditive;
    }

    /**
     * <p>
     * The non additive for the table style target.
     * </p>
     * 
     * @return The non additive for the table style target.
     */

    public Boolean getNonAdditive() {
        return this.nonAdditive;
    }

    /**
     * <p>
     * The non additive for the table style target.
     * </p>
     * 
     * @param nonAdditive
     *        The non additive for the table style target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicCalculatedField withNonAdditive(Boolean nonAdditive) {
        setNonAdditive(nonAdditive);
        return this;
    }

    /**
     * <p>
     * The non additive for the table style target.
     * </p>
     * 
     * @return The non additive for the table style target.
     */

    public Boolean isNonAdditive() {
        return this.nonAdditive;
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
        if (getCalculatedFieldName() != null)
            sb.append("CalculatedFieldName: ").append(getCalculatedFieldName()).append(",");
        if (getCalculatedFieldDescription() != null)
            sb.append("CalculatedFieldDescription: ").append(getCalculatedFieldDescription()).append(",");
        if (getExpression() != null)
            sb.append("Expression: ").append("***Sensitive Data Redacted***").append(",");
        if (getCalculatedFieldSynonyms() != null)
            sb.append("CalculatedFieldSynonyms: ").append(getCalculatedFieldSynonyms()).append(",");
        if (getIsIncludedInTopic() != null)
            sb.append("IsIncludedInTopic: ").append(getIsIncludedInTopic()).append(",");
        if (getDisableIndexing() != null)
            sb.append("DisableIndexing: ").append(getDisableIndexing()).append(",");
        if (getColumnDataRole() != null)
            sb.append("ColumnDataRole: ").append(getColumnDataRole()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity()).append(",");
        if (getDefaultFormatting() != null)
            sb.append("DefaultFormatting: ").append(getDefaultFormatting()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation()).append(",");
        if (getComparativeOrder() != null)
            sb.append("ComparativeOrder: ").append(getComparativeOrder()).append(",");
        if (getSemanticType() != null)
            sb.append("SemanticType: ").append(getSemanticType()).append(",");
        if (getAllowedAggregations() != null)
            sb.append("AllowedAggregations: ").append(getAllowedAggregations()).append(",");
        if (getNotAllowedAggregations() != null)
            sb.append("NotAllowedAggregations: ").append(getNotAllowedAggregations()).append(",");
        if (getNeverAggregateInFilter() != null)
            sb.append("NeverAggregateInFilter: ").append(getNeverAggregateInFilter()).append(",");
        if (getCellValueSynonyms() != null)
            sb.append("CellValueSynonyms: ").append(getCellValueSynonyms()).append(",");
        if (getNonAdditive() != null)
            sb.append("NonAdditive: ").append(getNonAdditive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicCalculatedField == false)
            return false;
        TopicCalculatedField other = (TopicCalculatedField) obj;
        if (other.getCalculatedFieldName() == null ^ this.getCalculatedFieldName() == null)
            return false;
        if (other.getCalculatedFieldName() != null && other.getCalculatedFieldName().equals(this.getCalculatedFieldName()) == false)
            return false;
        if (other.getCalculatedFieldDescription() == null ^ this.getCalculatedFieldDescription() == null)
            return false;
        if (other.getCalculatedFieldDescription() != null && other.getCalculatedFieldDescription().equals(this.getCalculatedFieldDescription()) == false)
            return false;
        if (other.getExpression() == null ^ this.getExpression() == null)
            return false;
        if (other.getExpression() != null && other.getExpression().equals(this.getExpression()) == false)
            return false;
        if (other.getCalculatedFieldSynonyms() == null ^ this.getCalculatedFieldSynonyms() == null)
            return false;
        if (other.getCalculatedFieldSynonyms() != null && other.getCalculatedFieldSynonyms().equals(this.getCalculatedFieldSynonyms()) == false)
            return false;
        if (other.getIsIncludedInTopic() == null ^ this.getIsIncludedInTopic() == null)
            return false;
        if (other.getIsIncludedInTopic() != null && other.getIsIncludedInTopic().equals(this.getIsIncludedInTopic()) == false)
            return false;
        if (other.getDisableIndexing() == null ^ this.getDisableIndexing() == null)
            return false;
        if (other.getDisableIndexing() != null && other.getDisableIndexing().equals(this.getDisableIndexing()) == false)
            return false;
        if (other.getColumnDataRole() == null ^ this.getColumnDataRole() == null)
            return false;
        if (other.getColumnDataRole() != null && other.getColumnDataRole().equals(this.getColumnDataRole()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        if (other.getDefaultFormatting() == null ^ this.getDefaultFormatting() == null)
            return false;
        if (other.getDefaultFormatting() != null && other.getDefaultFormatting().equals(this.getDefaultFormatting()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        if (other.getComparativeOrder() == null ^ this.getComparativeOrder() == null)
            return false;
        if (other.getComparativeOrder() != null && other.getComparativeOrder().equals(this.getComparativeOrder()) == false)
            return false;
        if (other.getSemanticType() == null ^ this.getSemanticType() == null)
            return false;
        if (other.getSemanticType() != null && other.getSemanticType().equals(this.getSemanticType()) == false)
            return false;
        if (other.getAllowedAggregations() == null ^ this.getAllowedAggregations() == null)
            return false;
        if (other.getAllowedAggregations() != null && other.getAllowedAggregations().equals(this.getAllowedAggregations()) == false)
            return false;
        if (other.getNotAllowedAggregations() == null ^ this.getNotAllowedAggregations() == null)
            return false;
        if (other.getNotAllowedAggregations() != null && other.getNotAllowedAggregations().equals(this.getNotAllowedAggregations()) == false)
            return false;
        if (other.getNeverAggregateInFilter() == null ^ this.getNeverAggregateInFilter() == null)
            return false;
        if (other.getNeverAggregateInFilter() != null && other.getNeverAggregateInFilter().equals(this.getNeverAggregateInFilter()) == false)
            return false;
        if (other.getCellValueSynonyms() == null ^ this.getCellValueSynonyms() == null)
            return false;
        if (other.getCellValueSynonyms() != null && other.getCellValueSynonyms().equals(this.getCellValueSynonyms()) == false)
            return false;
        if (other.getNonAdditive() == null ^ this.getNonAdditive() == null)
            return false;
        if (other.getNonAdditive() != null && other.getNonAdditive().equals(this.getNonAdditive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCalculatedFieldName() == null) ? 0 : getCalculatedFieldName().hashCode());
        hashCode = prime * hashCode + ((getCalculatedFieldDescription() == null) ? 0 : getCalculatedFieldDescription().hashCode());
        hashCode = prime * hashCode + ((getExpression() == null) ? 0 : getExpression().hashCode());
        hashCode = prime * hashCode + ((getCalculatedFieldSynonyms() == null) ? 0 : getCalculatedFieldSynonyms().hashCode());
        hashCode = prime * hashCode + ((getIsIncludedInTopic() == null) ? 0 : getIsIncludedInTopic().hashCode());
        hashCode = prime * hashCode + ((getDisableIndexing() == null) ? 0 : getDisableIndexing().hashCode());
        hashCode = prime * hashCode + ((getColumnDataRole() == null) ? 0 : getColumnDataRole().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        hashCode = prime * hashCode + ((getDefaultFormatting() == null) ? 0 : getDefaultFormatting().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        hashCode = prime * hashCode + ((getComparativeOrder() == null) ? 0 : getComparativeOrder().hashCode());
        hashCode = prime * hashCode + ((getSemanticType() == null) ? 0 : getSemanticType().hashCode());
        hashCode = prime * hashCode + ((getAllowedAggregations() == null) ? 0 : getAllowedAggregations().hashCode());
        hashCode = prime * hashCode + ((getNotAllowedAggregations() == null) ? 0 : getNotAllowedAggregations().hashCode());
        hashCode = prime * hashCode + ((getNeverAggregateInFilter() == null) ? 0 : getNeverAggregateInFilter().hashCode());
        hashCode = prime * hashCode + ((getCellValueSynonyms() == null) ? 0 : getCellValueSynonyms().hashCode());
        hashCode = prime * hashCode + ((getNonAdditive() == null) ? 0 : getNonAdditive().hashCode());
        return hashCode;
    }

    @Override
    public TopicCalculatedField clone() {
        try {
            return (TopicCalculatedField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicCalculatedFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
