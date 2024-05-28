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
 * Represents a column in a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/TopicColumn" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicColumn implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the column.
     * </p>
     */
    private String columnName;
    /**
     * <p>
     * A user-friendly name for the column.
     * </p>
     */
    private String columnFriendlyName;
    /**
     * <p>
     * A description of the column and its contents.
     * </p>
     */
    private String columnDescription;
    /**
     * <p>
     * The other names or aliases for the column.
     * </p>
     */
    private java.util.List<String> columnSynonyms;
    /**
     * <p>
     * The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * </p>
     */
    private String columnDataRole;
    /**
     * <p>
     * The type of aggregation that is performed on the column data when it's queried.
     * </p>
     */
    private String aggregation;
    /**
     * <p>
     * A Boolean value that indicates whether the column is included in the query results.
     * </p>
     */
    private Boolean isIncludedInTopic;
    /**
     * <p>
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * </p>
     */
    private Boolean disableIndexing;
    /**
     * <p>
     * The order in which data is displayed for the column when it's used in a comparative context.
     * </p>
     */
    private ComparativeOrder comparativeOrder;
    /**
     * <p>
     * The semantic type of data contained in the column.
     * </p>
     */
    private SemanticType semanticType;
    /**
     * <p>
     * The level of time precision that is used to aggregate <code>DateTime</code> values.
     * </p>
     */
    private String timeGranularity;
    /**
     * <p>
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     */
    private java.util.List<String> allowedAggregations;
    /**
     * <p>
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     */
    private java.util.List<String> notAllowedAggregations;
    /**
     * <p>
     * The default formatting used for values in the column.
     * </p>
     */
    private DefaultFormatting defaultFormatting;
    /**
     * <p>
     * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * </p>
     */
    private Boolean neverAggregateInFilter;
    /**
     * <p>
     * The other names or aliases for the column cell value.
     * </p>
     */
    private java.util.List<CellValueSynonym> cellValueSynonyms;
    /**
     * <p>
     * The non additive value for the column.
     * </p>
     */
    private Boolean nonAdditive;

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param columnName
     *        The name of the column.
     */

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @return The name of the column.
     */

    public String getColumnName() {
        return this.columnName;
    }

    /**
     * <p>
     * The name of the column.
     * </p>
     * 
     * @param columnName
     *        The name of the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withColumnName(String columnName) {
        setColumnName(columnName);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the column.
     * </p>
     * 
     * @param columnFriendlyName
     *        A user-friendly name for the column.
     */

    public void setColumnFriendlyName(String columnFriendlyName) {
        this.columnFriendlyName = columnFriendlyName;
    }

    /**
     * <p>
     * A user-friendly name for the column.
     * </p>
     * 
     * @return A user-friendly name for the column.
     */

    public String getColumnFriendlyName() {
        return this.columnFriendlyName;
    }

    /**
     * <p>
     * A user-friendly name for the column.
     * </p>
     * 
     * @param columnFriendlyName
     *        A user-friendly name for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withColumnFriendlyName(String columnFriendlyName) {
        setColumnFriendlyName(columnFriendlyName);
        return this;
    }

    /**
     * <p>
     * A description of the column and its contents.
     * </p>
     * 
     * @param columnDescription
     *        A description of the column and its contents.
     */

    public void setColumnDescription(String columnDescription) {
        this.columnDescription = columnDescription;
    }

    /**
     * <p>
     * A description of the column and its contents.
     * </p>
     * 
     * @return A description of the column and its contents.
     */

    public String getColumnDescription() {
        return this.columnDescription;
    }

    /**
     * <p>
     * A description of the column and its contents.
     * </p>
     * 
     * @param columnDescription
     *        A description of the column and its contents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withColumnDescription(String columnDescription) {
        setColumnDescription(columnDescription);
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the column.
     * </p>
     * 
     * @return The other names or aliases for the column.
     */

    public java.util.List<String> getColumnSynonyms() {
        return columnSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the column.
     * </p>
     * 
     * @param columnSynonyms
     *        The other names or aliases for the column.
     */

    public void setColumnSynonyms(java.util.Collection<String> columnSynonyms) {
        if (columnSynonyms == null) {
            this.columnSynonyms = null;
            return;
        }

        this.columnSynonyms = new java.util.ArrayList<String>(columnSynonyms);
    }

    /**
     * <p>
     * The other names or aliases for the column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setColumnSynonyms(java.util.Collection)} or {@link #withColumnSynonyms(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param columnSynonyms
     *        The other names or aliases for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withColumnSynonyms(String... columnSynonyms) {
        if (this.columnSynonyms == null) {
            setColumnSynonyms(new java.util.ArrayList<String>(columnSynonyms.length));
        }
        for (String ele : columnSynonyms) {
            this.columnSynonyms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The other names or aliases for the column.
     * </p>
     * 
     * @param columnSynonyms
     *        The other names or aliases for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withColumnSynonyms(java.util.Collection<String> columnSynonyms) {
        setColumnSynonyms(columnSynonyms);
        return this;
    }

    /**
     * <p>
     * The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * @see ColumnDataRole
     */

    public void setColumnDataRole(String columnDataRole) {
        this.columnDataRole = columnDataRole;
    }

    /**
     * <p>
     * The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * </p>
     * 
     * @return The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * @see ColumnDataRole
     */

    public String getColumnDataRole() {
        return this.columnDataRole;
    }

    /**
     * <p>
     * The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataRole
     */

    public TopicColumn withColumnDataRole(String columnDataRole) {
        setColumnDataRole(columnDataRole);
        return this;
    }

    /**
     * <p>
     * The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * </p>
     * 
     * @param columnDataRole
     *        The role of the column in the data. Valid values are <code>DIMENSION</code> and <code>MEASURE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColumnDataRole
     */

    public TopicColumn withColumnDataRole(ColumnDataRole columnDataRole) {
        this.columnDataRole = columnDataRole.toString();
        return this;
    }

    /**
     * <p>
     * The type of aggregation that is performed on the column data when it's queried.
     * </p>
     * 
     * @param aggregation
     *        The type of aggregation that is performed on the column data when it's queried.
     * @see DefaultAggregation
     */

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * <p>
     * The type of aggregation that is performed on the column data when it's queried.
     * </p>
     * 
     * @return The type of aggregation that is performed on the column data when it's queried.
     * @see DefaultAggregation
     */

    public String getAggregation() {
        return this.aggregation;
    }

    /**
     * <p>
     * The type of aggregation that is performed on the column data when it's queried.
     * </p>
     * 
     * @param aggregation
     *        The type of aggregation that is performed on the column data when it's queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAggregation
     */

    public TopicColumn withAggregation(String aggregation) {
        setAggregation(aggregation);
        return this;
    }

    /**
     * <p>
     * The type of aggregation that is performed on the column data when it's queried.
     * </p>
     * 
     * @param aggregation
     *        The type of aggregation that is performed on the column data when it's queried.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DefaultAggregation
     */

    public TopicColumn withAggregation(DefaultAggregation aggregation) {
        this.aggregation = aggregation.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column is included in the query results.
     * </p>
     * 
     * @param isIncludedInTopic
     *        A Boolean value that indicates whether the column is included in the query results.
     */

    public void setIsIncludedInTopic(Boolean isIncludedInTopic) {
        this.isIncludedInTopic = isIncludedInTopic;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column is included in the query results.
     * </p>
     * 
     * @return A Boolean value that indicates whether the column is included in the query results.
     */

    public Boolean getIsIncludedInTopic() {
        return this.isIncludedInTopic;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column is included in the query results.
     * </p>
     * 
     * @param isIncludedInTopic
     *        A Boolean value that indicates whether the column is included in the query results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withIsIncludedInTopic(Boolean isIncludedInTopic) {
        setIsIncludedInTopic(isIncludedInTopic);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column is included in the query results.
     * </p>
     * 
     * @return A Boolean value that indicates whether the column is included in the query results.
     */

    public Boolean isIncludedInTopic() {
        return this.isIncludedInTopic;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * </p>
     * 
     * @param disableIndexing
     *        A Boolean value that indicates whether the column shows in the autocomplete functionality.
     */

    public void setDisableIndexing(Boolean disableIndexing) {
        this.disableIndexing = disableIndexing;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * </p>
     * 
     * @return A Boolean value that indicates whether the column shows in the autocomplete functionality.
     */

    public Boolean getDisableIndexing() {
        return this.disableIndexing;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * </p>
     * 
     * @param disableIndexing
     *        A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withDisableIndexing(Boolean disableIndexing) {
        setDisableIndexing(disableIndexing);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     * </p>
     * 
     * @return A Boolean value that indicates whether the column shows in the autocomplete functionality.
     */

    public Boolean isDisableIndexing() {
        return this.disableIndexing;
    }

    /**
     * <p>
     * The order in which data is displayed for the column when it's used in a comparative context.
     * </p>
     * 
     * @param comparativeOrder
     *        The order in which data is displayed for the column when it's used in a comparative context.
     */

    public void setComparativeOrder(ComparativeOrder comparativeOrder) {
        this.comparativeOrder = comparativeOrder;
    }

    /**
     * <p>
     * The order in which data is displayed for the column when it's used in a comparative context.
     * </p>
     * 
     * @return The order in which data is displayed for the column when it's used in a comparative context.
     */

    public ComparativeOrder getComparativeOrder() {
        return this.comparativeOrder;
    }

    /**
     * <p>
     * The order in which data is displayed for the column when it's used in a comparative context.
     * </p>
     * 
     * @param comparativeOrder
     *        The order in which data is displayed for the column when it's used in a comparative context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withComparativeOrder(ComparativeOrder comparativeOrder) {
        setComparativeOrder(comparativeOrder);
        return this;
    }

    /**
     * <p>
     * The semantic type of data contained in the column.
     * </p>
     * 
     * @param semanticType
     *        The semantic type of data contained in the column.
     */

    public void setSemanticType(SemanticType semanticType) {
        this.semanticType = semanticType;
    }

    /**
     * <p>
     * The semantic type of data contained in the column.
     * </p>
     * 
     * @return The semantic type of data contained in the column.
     */

    public SemanticType getSemanticType() {
        return this.semanticType;
    }

    /**
     * <p>
     * The semantic type of data contained in the column.
     * </p>
     * 
     * @param semanticType
     *        The semantic type of data contained in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withSemanticType(SemanticType semanticType) {
        setSemanticType(semanticType);
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

    public TopicColumn withTimeGranularity(String timeGranularity) {
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

    public TopicColumn withTimeGranularity(TopicTimeGranularity timeGranularity) {
        this.timeGranularity = timeGranularity.toString();
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @return The list of aggregation types that are allowed for the column. Valid values for this structure are
     *         <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *         <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *         <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public java.util.List<String> getAllowedAggregations() {
        return allowedAggregations;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
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
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
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
     *        The list of aggregation types that are allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withAllowedAggregations(String... allowedAggregations) {
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
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withAllowedAggregations(java.util.Collection<String> allowedAggregations) {
        setAllowedAggregations(allowedAggregations);
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param allowedAggregations
     *        The list of aggregation types that are allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withAllowedAggregations(AuthorSpecifiedAggregation... allowedAggregations) {
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
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @return The list of aggregation types that are not allowed for the column. Valid values for this structure are
     *         <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *         <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *         <code>VARP</code>, and <code>PERCENTILE</code>.
     * @see AuthorSpecifiedAggregation
     */

    public java.util.List<String> getNotAllowedAggregations() {
        return notAllowedAggregations;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
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
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
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
     *        The list of aggregation types that are not allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withNotAllowedAggregations(String... notAllowedAggregations) {
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
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withNotAllowedAggregations(java.util.Collection<String> notAllowedAggregations) {
        setNotAllowedAggregations(notAllowedAggregations);
        return this;
    }

    /**
     * <p>
     * The list of aggregation types that are not allowed for the column. Valid values for this structure are
     * <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     * <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     * <code>VARP</code>, and <code>PERCENTILE</code>.
     * </p>
     * 
     * @param notAllowedAggregations
     *        The list of aggregation types that are not allowed for the column. Valid values for this structure are
     *        <code>COUNT</code>, <code>DISTINCT_COUNT</code>, <code>MIN</code>, <code>MAX</code>, <code>MEDIAN</code>,
     *        <code>SUM</code>, <code>AVERAGE</code>, <code>STDEV</code>, <code>STDEVP</code>, <code>VAR</code>,
     *        <code>VARP</code>, and <code>PERCENTILE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthorSpecifiedAggregation
     */

    public TopicColumn withNotAllowedAggregations(AuthorSpecifiedAggregation... notAllowedAggregations) {
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
     * The default formatting used for values in the column.
     * </p>
     * 
     * @param defaultFormatting
     *        The default formatting used for values in the column.
     */

    public void setDefaultFormatting(DefaultFormatting defaultFormatting) {
        this.defaultFormatting = defaultFormatting;
    }

    /**
     * <p>
     * The default formatting used for values in the column.
     * </p>
     * 
     * @return The default formatting used for values in the column.
     */

    public DefaultFormatting getDefaultFormatting() {
        return this.defaultFormatting;
    }

    /**
     * <p>
     * The default formatting used for values in the column.
     * </p>
     * 
     * @param defaultFormatting
     *        The default formatting used for values in the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withDefaultFormatting(DefaultFormatting defaultFormatting) {
        setDefaultFormatting(defaultFormatting);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * </p>
     * 
     * @param neverAggregateInFilter
     *        A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     */

    public void setNeverAggregateInFilter(Boolean neverAggregateInFilter) {
        this.neverAggregateInFilter = neverAggregateInFilter;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * </p>
     * 
     * @return A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     */

    public Boolean getNeverAggregateInFilter() {
        return this.neverAggregateInFilter;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * </p>
     * 
     * @param neverAggregateInFilter
     *        A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withNeverAggregateInFilter(Boolean neverAggregateInFilter) {
        setNeverAggregateInFilter(neverAggregateInFilter);
        return this;
    }

    /**
     * <p>
     * A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     * </p>
     * 
     * @return A Boolean value that indicates whether to aggregate the column data when it's used in a filter context.
     */

    public Boolean isNeverAggregateInFilter() {
        return this.neverAggregateInFilter;
    }

    /**
     * <p>
     * The other names or aliases for the column cell value.
     * </p>
     * 
     * @return The other names or aliases for the column cell value.
     */

    public java.util.List<CellValueSynonym> getCellValueSynonyms() {
        return cellValueSynonyms;
    }

    /**
     * <p>
     * The other names or aliases for the column cell value.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the column cell value.
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
     * The other names or aliases for the column cell value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCellValueSynonyms(java.util.Collection)} or {@link #withCellValueSynonyms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the column cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withCellValueSynonyms(CellValueSynonym... cellValueSynonyms) {
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
     * The other names or aliases for the column cell value.
     * </p>
     * 
     * @param cellValueSynonyms
     *        The other names or aliases for the column cell value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withCellValueSynonyms(java.util.Collection<CellValueSynonym> cellValueSynonyms) {
        setCellValueSynonyms(cellValueSynonyms);
        return this;
    }

    /**
     * <p>
     * The non additive value for the column.
     * </p>
     * 
     * @param nonAdditive
     *        The non additive value for the column.
     */

    public void setNonAdditive(Boolean nonAdditive) {
        this.nonAdditive = nonAdditive;
    }

    /**
     * <p>
     * The non additive value for the column.
     * </p>
     * 
     * @return The non additive value for the column.
     */

    public Boolean getNonAdditive() {
        return this.nonAdditive;
    }

    /**
     * <p>
     * The non additive value for the column.
     * </p>
     * 
     * @param nonAdditive
     *        The non additive value for the column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TopicColumn withNonAdditive(Boolean nonAdditive) {
        setNonAdditive(nonAdditive);
        return this;
    }

    /**
     * <p>
     * The non additive value for the column.
     * </p>
     * 
     * @return The non additive value for the column.
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
        if (getColumnName() != null)
            sb.append("ColumnName: ").append(getColumnName()).append(",");
        if (getColumnFriendlyName() != null)
            sb.append("ColumnFriendlyName: ").append(getColumnFriendlyName()).append(",");
        if (getColumnDescription() != null)
            sb.append("ColumnDescription: ").append(getColumnDescription()).append(",");
        if (getColumnSynonyms() != null)
            sb.append("ColumnSynonyms: ").append(getColumnSynonyms()).append(",");
        if (getColumnDataRole() != null)
            sb.append("ColumnDataRole: ").append(getColumnDataRole()).append(",");
        if (getAggregation() != null)
            sb.append("Aggregation: ").append(getAggregation()).append(",");
        if (getIsIncludedInTopic() != null)
            sb.append("IsIncludedInTopic: ").append(getIsIncludedInTopic()).append(",");
        if (getDisableIndexing() != null)
            sb.append("DisableIndexing: ").append(getDisableIndexing()).append(",");
        if (getComparativeOrder() != null)
            sb.append("ComparativeOrder: ").append(getComparativeOrder()).append(",");
        if (getSemanticType() != null)
            sb.append("SemanticType: ").append(getSemanticType()).append(",");
        if (getTimeGranularity() != null)
            sb.append("TimeGranularity: ").append(getTimeGranularity()).append(",");
        if (getAllowedAggregations() != null)
            sb.append("AllowedAggregations: ").append(getAllowedAggregations()).append(",");
        if (getNotAllowedAggregations() != null)
            sb.append("NotAllowedAggregations: ").append(getNotAllowedAggregations()).append(",");
        if (getDefaultFormatting() != null)
            sb.append("DefaultFormatting: ").append(getDefaultFormatting()).append(",");
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

        if (obj instanceof TopicColumn == false)
            return false;
        TopicColumn other = (TopicColumn) obj;
        if (other.getColumnName() == null ^ this.getColumnName() == null)
            return false;
        if (other.getColumnName() != null && other.getColumnName().equals(this.getColumnName()) == false)
            return false;
        if (other.getColumnFriendlyName() == null ^ this.getColumnFriendlyName() == null)
            return false;
        if (other.getColumnFriendlyName() != null && other.getColumnFriendlyName().equals(this.getColumnFriendlyName()) == false)
            return false;
        if (other.getColumnDescription() == null ^ this.getColumnDescription() == null)
            return false;
        if (other.getColumnDescription() != null && other.getColumnDescription().equals(this.getColumnDescription()) == false)
            return false;
        if (other.getColumnSynonyms() == null ^ this.getColumnSynonyms() == null)
            return false;
        if (other.getColumnSynonyms() != null && other.getColumnSynonyms().equals(this.getColumnSynonyms()) == false)
            return false;
        if (other.getColumnDataRole() == null ^ this.getColumnDataRole() == null)
            return false;
        if (other.getColumnDataRole() != null && other.getColumnDataRole().equals(this.getColumnDataRole()) == false)
            return false;
        if (other.getAggregation() == null ^ this.getAggregation() == null)
            return false;
        if (other.getAggregation() != null && other.getAggregation().equals(this.getAggregation()) == false)
            return false;
        if (other.getIsIncludedInTopic() == null ^ this.getIsIncludedInTopic() == null)
            return false;
        if (other.getIsIncludedInTopic() != null && other.getIsIncludedInTopic().equals(this.getIsIncludedInTopic()) == false)
            return false;
        if (other.getDisableIndexing() == null ^ this.getDisableIndexing() == null)
            return false;
        if (other.getDisableIndexing() != null && other.getDisableIndexing().equals(this.getDisableIndexing()) == false)
            return false;
        if (other.getComparativeOrder() == null ^ this.getComparativeOrder() == null)
            return false;
        if (other.getComparativeOrder() != null && other.getComparativeOrder().equals(this.getComparativeOrder()) == false)
            return false;
        if (other.getSemanticType() == null ^ this.getSemanticType() == null)
            return false;
        if (other.getSemanticType() != null && other.getSemanticType().equals(this.getSemanticType()) == false)
            return false;
        if (other.getTimeGranularity() == null ^ this.getTimeGranularity() == null)
            return false;
        if (other.getTimeGranularity() != null && other.getTimeGranularity().equals(this.getTimeGranularity()) == false)
            return false;
        if (other.getAllowedAggregations() == null ^ this.getAllowedAggregations() == null)
            return false;
        if (other.getAllowedAggregations() != null && other.getAllowedAggregations().equals(this.getAllowedAggregations()) == false)
            return false;
        if (other.getNotAllowedAggregations() == null ^ this.getNotAllowedAggregations() == null)
            return false;
        if (other.getNotAllowedAggregations() != null && other.getNotAllowedAggregations().equals(this.getNotAllowedAggregations()) == false)
            return false;
        if (other.getDefaultFormatting() == null ^ this.getDefaultFormatting() == null)
            return false;
        if (other.getDefaultFormatting() != null && other.getDefaultFormatting().equals(this.getDefaultFormatting()) == false)
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

        hashCode = prime * hashCode + ((getColumnName() == null) ? 0 : getColumnName().hashCode());
        hashCode = prime * hashCode + ((getColumnFriendlyName() == null) ? 0 : getColumnFriendlyName().hashCode());
        hashCode = prime * hashCode + ((getColumnDescription() == null) ? 0 : getColumnDescription().hashCode());
        hashCode = prime * hashCode + ((getColumnSynonyms() == null) ? 0 : getColumnSynonyms().hashCode());
        hashCode = prime * hashCode + ((getColumnDataRole() == null) ? 0 : getColumnDataRole().hashCode());
        hashCode = prime * hashCode + ((getAggregation() == null) ? 0 : getAggregation().hashCode());
        hashCode = prime * hashCode + ((getIsIncludedInTopic() == null) ? 0 : getIsIncludedInTopic().hashCode());
        hashCode = prime * hashCode + ((getDisableIndexing() == null) ? 0 : getDisableIndexing().hashCode());
        hashCode = prime * hashCode + ((getComparativeOrder() == null) ? 0 : getComparativeOrder().hashCode());
        hashCode = prime * hashCode + ((getSemanticType() == null) ? 0 : getSemanticType().hashCode());
        hashCode = prime * hashCode + ((getTimeGranularity() == null) ? 0 : getTimeGranularity().hashCode());
        hashCode = prime * hashCode + ((getAllowedAggregations() == null) ? 0 : getAllowedAggregations().hashCode());
        hashCode = prime * hashCode + ((getNotAllowedAggregations() == null) ? 0 : getNotAllowedAggregations().hashCode());
        hashCode = prime * hashCode + ((getDefaultFormatting() == null) ? 0 : getDefaultFormatting().hashCode());
        hashCode = prime * hashCode + ((getNeverAggregateInFilter() == null) ? 0 : getNeverAggregateInFilter().hashCode());
        hashCode = prime * hashCode + ((getCellValueSynonyms() == null) ? 0 : getCellValueSynonyms().hashCode());
        hashCode = prime * hashCode + ((getNonAdditive() == null) ? 0 : getNonAdditive().hashCode());
        return hashCode;
    }

    @Override
    public TopicColumn clone() {
        try {
            return (TopicColumn) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.TopicColumnMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
