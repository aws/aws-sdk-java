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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration for Snowflake nodes in Glue Studio.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SnowflakeNodeData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SnowflakeNodeData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     * </p>
     */
    private Option connection;
    /**
     * <p>
     * Specifies a Snowflake database schema for your node to use.
     * </p>
     */
    private String schema;
    /**
     * <p>
     * Specifies a Snowflake table for your node to use.
     * </p>
     */
    private String table;
    /**
     * <p>
     * Specifies a Snowflake database for your node to use.
     * </p>
     */
    private String database;
    /**
     * <p>
     * Not currently used.
     * </p>
     */
    private String tempDir;
    /**
     * <p>
     * Not currently used.
     * </p>
     */
    private Option iamRole;
    /**
     * <p>
     * Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this node,
     * this will take precedence.
     * </p>
     */
    private java.util.Map<String, String> additionalOptions;
    /**
     * <p>
     * A SQL string used to retrieve data with the <code>query</code> sourcetype.
     * </p>
     */
    private String sampleQuery;
    /**
     * <p>
     * A SQL string run before the Snowflake connector performs its standard actions.
     * </p>
     */
    private String preAction;
    /**
     * <p>
     * A SQL string run after the Snowflake connector performs its standard actions.
     * </p>
     */
    private String postAction;
    /**
     * <p>
     * Specifies what action to take when writing to a table with preexisting data. Valid values: <code> append</code>,
     * <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If true,
     * preexisting rows will be updated. If false, those rows will be inserted.
     * </p>
     */
    private Boolean upsert;
    /**
     * <p>
     * Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge behavior is
     * defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom, defined by
     * <code>MergeClause</code>.
     * </p>
     */
    private String mergeAction;
    /**
     * <p>
     * Specifies how to resolve records that match preexisting data when merging. Valid values: <code> update</code>,
     * <code>delete</code>.
     * </p>
     */
    private String mergeWhenMatched;
    /**
     * <p>
     * Specifies how to process records that do not match preexisting data when merging. Valid values:
     * <code>insert</code>, <code>none</code>.
     * </p>
     */
    private String mergeWhenNotMatched;
    /**
     * <p>
     * A SQL statement that specifies a custom merge behavior.
     * </p>
     */
    private String mergeClause;
    /**
     * <p>
     * The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions. Data
     * is written to this table, then moved to <code>table</code> by a generated postaction.
     * </p>
     */
    private String stagingTable;
    /**
     * <p>
     * Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list of
     * structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each structure
     * describes a column.
     * </p>
     */
    private java.util.List<Option> selectedColumns;
    /**
     * <p>
     * Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on Spark,
     * if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves performance
     * of some queries.
     * </p>
     */
    private Boolean autoPushdown;
    /**
     * <p>
     * Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     * <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * </p>
     */
    private java.util.List<Option> tableSchema;

    /**
     * <p>
     * Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     * </p>
     * 
     * @param sourceType
     *        Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     * </p>
     * 
     * @return Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     * </p>
     * 
     * @param sourceType
     *        Specifies how retrieved data is specified. Valid values: <code>"table"</code>, <code> "query"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     * </p>
     * 
     * @param connection
     *        Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     */

    public void setConnection(Option connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     * </p>
     * 
     * @return Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     */

    public Option getConnection() {
        return this.connection;
    }

    /**
     * <p>
     * Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     * </p>
     * 
     * @param connection
     *        Specifies a Glue Data Catalog Connection to a Snowflake endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withConnection(Option connection) {
        setConnection(connection);
        return this;
    }

    /**
     * <p>
     * Specifies a Snowflake database schema for your node to use.
     * </p>
     * 
     * @param schema
     *        Specifies a Snowflake database schema for your node to use.
     */

    public void setSchema(String schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * Specifies a Snowflake database schema for your node to use.
     * </p>
     * 
     * @return Specifies a Snowflake database schema for your node to use.
     */

    public String getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * Specifies a Snowflake database schema for your node to use.
     * </p>
     * 
     * @param schema
     *        Specifies a Snowflake database schema for your node to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withSchema(String schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * Specifies a Snowflake table for your node to use.
     * </p>
     * 
     * @param table
     *        Specifies a Snowflake table for your node to use.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * Specifies a Snowflake table for your node to use.
     * </p>
     * 
     * @return Specifies a Snowflake table for your node to use.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * Specifies a Snowflake table for your node to use.
     * </p>
     * 
     * @param table
     *        Specifies a Snowflake table for your node to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * Specifies a Snowflake database for your node to use.
     * </p>
     * 
     * @param database
     *        Specifies a Snowflake database for your node to use.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * Specifies a Snowflake database for your node to use.
     * </p>
     * 
     * @return Specifies a Snowflake database for your node to use.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * Specifies a Snowflake database for your node to use.
     * </p>
     * 
     * @param database
     *        Specifies a Snowflake database for your node to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param tempDir
     *        Not currently used.
     */

    public void setTempDir(String tempDir) {
        this.tempDir = tempDir;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @return Not currently used.
     */

    public String getTempDir() {
        return this.tempDir;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param tempDir
     *        Not currently used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withTempDir(String tempDir) {
        setTempDir(tempDir);
        return this;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param iamRole
     *        Not currently used.
     */

    public void setIamRole(Option iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @return Not currently used.
     */

    public Option getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * Not currently used.
     * </p>
     * 
     * @param iamRole
     *        Not currently used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withIamRole(Option iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this node,
     * this will take precedence.
     * </p>
     * 
     * @return Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in
     *         this node, this will take precedence.
     */

    public java.util.Map<String, String> getAdditionalOptions() {
        return additionalOptions;
    }

    /**
     * <p>
     * Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this node,
     * this will take precedence.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this
     *        node, this will take precedence.
     */

    public void setAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this node,
     * this will take precedence.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional options passed to the Snowflake connector. If options are specified elsewhere in this
     *        node, this will take precedence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withAdditionalOptions(java.util.Map<String, String> additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * Add a single AdditionalOptions entry
     *
     * @see SnowflakeNodeData#withAdditionalOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData addAdditionalOptionsEntry(String key, String value) {
        if (null == this.additionalOptions) {
            this.additionalOptions = new java.util.HashMap<String, String>();
        }
        if (this.additionalOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.additionalOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdditionalOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData clearAdditionalOptionsEntries() {
        this.additionalOptions = null;
        return this;
    }

    /**
     * <p>
     * A SQL string used to retrieve data with the <code>query</code> sourcetype.
     * </p>
     * 
     * @param sampleQuery
     *        A SQL string used to retrieve data with the <code>query</code> sourcetype.
     */

    public void setSampleQuery(String sampleQuery) {
        this.sampleQuery = sampleQuery;
    }

    /**
     * <p>
     * A SQL string used to retrieve data with the <code>query</code> sourcetype.
     * </p>
     * 
     * @return A SQL string used to retrieve data with the <code>query</code> sourcetype.
     */

    public String getSampleQuery() {
        return this.sampleQuery;
    }

    /**
     * <p>
     * A SQL string used to retrieve data with the <code>query</code> sourcetype.
     * </p>
     * 
     * @param sampleQuery
     *        A SQL string used to retrieve data with the <code>query</code> sourcetype.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withSampleQuery(String sampleQuery) {
        setSampleQuery(sampleQuery);
        return this;
    }

    /**
     * <p>
     * A SQL string run before the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @param preAction
     *        A SQL string run before the Snowflake connector performs its standard actions.
     */

    public void setPreAction(String preAction) {
        this.preAction = preAction;
    }

    /**
     * <p>
     * A SQL string run before the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @return A SQL string run before the Snowflake connector performs its standard actions.
     */

    public String getPreAction() {
        return this.preAction;
    }

    /**
     * <p>
     * A SQL string run before the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @param preAction
     *        A SQL string run before the Snowflake connector performs its standard actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withPreAction(String preAction) {
        setPreAction(preAction);
        return this;
    }

    /**
     * <p>
     * A SQL string run after the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @param postAction
     *        A SQL string run after the Snowflake connector performs its standard actions.
     */

    public void setPostAction(String postAction) {
        this.postAction = postAction;
    }

    /**
     * <p>
     * A SQL string run after the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @return A SQL string run after the Snowflake connector performs its standard actions.
     */

    public String getPostAction() {
        return this.postAction;
    }

    /**
     * <p>
     * A SQL string run after the Snowflake connector performs its standard actions.
     * </p>
     * 
     * @param postAction
     *        A SQL string run after the Snowflake connector performs its standard actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withPostAction(String postAction) {
        setPostAction(postAction);
        return this;
    }

    /**
     * <p>
     * Specifies what action to take when writing to a table with preexisting data. Valid values: <code> append</code>,
     * <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     * </p>
     * 
     * @param action
     *        Specifies what action to take when writing to a table with preexisting data. Valid values:
     *        <code> append</code>, <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies what action to take when writing to a table with preexisting data. Valid values: <code> append</code>,
     * <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     * </p>
     * 
     * @return Specifies what action to take when writing to a table with preexisting data. Valid values:
     *         <code> append</code>, <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies what action to take when writing to a table with preexisting data. Valid values: <code> append</code>,
     * <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     * </p>
     * 
     * @param action
     *        Specifies what action to take when writing to a table with preexisting data. Valid values:
     *        <code> append</code>, <code>merge</code>, <code>truncate</code>, <code>drop</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If true,
     * preexisting rows will be updated. If false, those rows will be inserted.
     * </p>
     * 
     * @param upsert
     *        Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If
     *        true, preexisting rows will be updated. If false, those rows will be inserted.
     */

    public void setUpsert(Boolean upsert) {
        this.upsert = upsert;
    }

    /**
     * <p>
     * Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If true,
     * preexisting rows will be updated. If false, those rows will be inserted.
     * </p>
     * 
     * @return Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If
     *         true, preexisting rows will be updated. If false, those rows will be inserted.
     */

    public Boolean getUpsert() {
        return this.upsert;
    }

    /**
     * <p>
     * Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If true,
     * preexisting rows will be updated. If false, those rows will be inserted.
     * </p>
     * 
     * @param upsert
     *        Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If
     *        true, preexisting rows will be updated. If false, those rows will be inserted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withUpsert(Boolean upsert) {
        setUpsert(upsert);
        return this;
    }

    /**
     * <p>
     * Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If true,
     * preexisting rows will be updated. If false, those rows will be inserted.
     * </p>
     * 
     * @return Used when Action is <code>append</code>. Specifies the resolution behavior when a row already exists. If
     *         true, preexisting rows will be updated. If false, those rows will be inserted.
     */

    public Boolean isUpsert() {
        return this.upsert;
    }

    /**
     * <p>
     * Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge behavior is
     * defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom, defined by
     * <code>MergeClause</code>.
     * </p>
     * 
     * @param mergeAction
     *        Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge
     *        behavior is defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom,
     *        defined by <code>MergeClause</code>.
     */

    public void setMergeAction(String mergeAction) {
        this.mergeAction = mergeAction;
    }

    /**
     * <p>
     * Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge behavior is
     * defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom, defined by
     * <code>MergeClause</code>.
     * </p>
     * 
     * @return Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge
     *         behavior is defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom,
     *         defined by <code>MergeClause</code>.
     */

    public String getMergeAction() {
        return this.mergeAction;
    }

    /**
     * <p>
     * Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge behavior is
     * defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom, defined by
     * <code>MergeClause</code>.
     * </p>
     * 
     * @param mergeAction
     *        Specifies a merge action. Valid values: <code>simple</code>, <code>custom</code>. If simple, merge
     *        behavior is defined by <code>MergeWhenMatched</code> and <code> MergeWhenNotMatched</code>. If custom,
     *        defined by <code>MergeClause</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withMergeAction(String mergeAction) {
        setMergeAction(mergeAction);
        return this;
    }

    /**
     * <p>
     * Specifies how to resolve records that match preexisting data when merging. Valid values: <code> update</code>,
     * <code>delete</code>.
     * </p>
     * 
     * @param mergeWhenMatched
     *        Specifies how to resolve records that match preexisting data when merging. Valid values:
     *        <code> update</code>, <code>delete</code>.
     */

    public void setMergeWhenMatched(String mergeWhenMatched) {
        this.mergeWhenMatched = mergeWhenMatched;
    }

    /**
     * <p>
     * Specifies how to resolve records that match preexisting data when merging. Valid values: <code> update</code>,
     * <code>delete</code>.
     * </p>
     * 
     * @return Specifies how to resolve records that match preexisting data when merging. Valid values:
     *         <code> update</code>, <code>delete</code>.
     */

    public String getMergeWhenMatched() {
        return this.mergeWhenMatched;
    }

    /**
     * <p>
     * Specifies how to resolve records that match preexisting data when merging. Valid values: <code> update</code>,
     * <code>delete</code>.
     * </p>
     * 
     * @param mergeWhenMatched
     *        Specifies how to resolve records that match preexisting data when merging. Valid values:
     *        <code> update</code>, <code>delete</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withMergeWhenMatched(String mergeWhenMatched) {
        setMergeWhenMatched(mergeWhenMatched);
        return this;
    }

    /**
     * <p>
     * Specifies how to process records that do not match preexisting data when merging. Valid values:
     * <code>insert</code>, <code>none</code>.
     * </p>
     * 
     * @param mergeWhenNotMatched
     *        Specifies how to process records that do not match preexisting data when merging. Valid values:
     *        <code>insert</code>, <code>none</code>.
     */

    public void setMergeWhenNotMatched(String mergeWhenNotMatched) {
        this.mergeWhenNotMatched = mergeWhenNotMatched;
    }

    /**
     * <p>
     * Specifies how to process records that do not match preexisting data when merging. Valid values:
     * <code>insert</code>, <code>none</code>.
     * </p>
     * 
     * @return Specifies how to process records that do not match preexisting data when merging. Valid values:
     *         <code>insert</code>, <code>none</code>.
     */

    public String getMergeWhenNotMatched() {
        return this.mergeWhenNotMatched;
    }

    /**
     * <p>
     * Specifies how to process records that do not match preexisting data when merging. Valid values:
     * <code>insert</code>, <code>none</code>.
     * </p>
     * 
     * @param mergeWhenNotMatched
     *        Specifies how to process records that do not match preexisting data when merging. Valid values:
     *        <code>insert</code>, <code>none</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withMergeWhenNotMatched(String mergeWhenNotMatched) {
        setMergeWhenNotMatched(mergeWhenNotMatched);
        return this;
    }

    /**
     * <p>
     * A SQL statement that specifies a custom merge behavior.
     * </p>
     * 
     * @param mergeClause
     *        A SQL statement that specifies a custom merge behavior.
     */

    public void setMergeClause(String mergeClause) {
        this.mergeClause = mergeClause;
    }

    /**
     * <p>
     * A SQL statement that specifies a custom merge behavior.
     * </p>
     * 
     * @return A SQL statement that specifies a custom merge behavior.
     */

    public String getMergeClause() {
        return this.mergeClause;
    }

    /**
     * <p>
     * A SQL statement that specifies a custom merge behavior.
     * </p>
     * 
     * @param mergeClause
     *        A SQL statement that specifies a custom merge behavior.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withMergeClause(String mergeClause) {
        setMergeClause(mergeClause);
        return this;
    }

    /**
     * <p>
     * The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions. Data
     * is written to this table, then moved to <code>table</code> by a generated postaction.
     * </p>
     * 
     * @param stagingTable
     *        The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions.
     *        Data is written to this table, then moved to <code>table</code> by a generated postaction.
     */

    public void setStagingTable(String stagingTable) {
        this.stagingTable = stagingTable;
    }

    /**
     * <p>
     * The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions. Data
     * is written to this table, then moved to <code>table</code> by a generated postaction.
     * </p>
     * 
     * @return The name of a staging table used when performing <code>merge</code> or upsert <code>append</code>
     *         actions. Data is written to this table, then moved to <code>table</code> by a generated postaction.
     */

    public String getStagingTable() {
        return this.stagingTable;
    }

    /**
     * <p>
     * The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions. Data
     * is written to this table, then moved to <code>table</code> by a generated postaction.
     * </p>
     * 
     * @param stagingTable
     *        The name of a staging table used when performing <code>merge</code> or upsert <code>append</code> actions.
     *        Data is written to this table, then moved to <code>table</code> by a generated postaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withStagingTable(String stagingTable) {
        setStagingTable(stagingTable);
        return this;
    }

    /**
     * <p>
     * Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list of
     * structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each structure
     * describes a column.
     * </p>
     * 
     * @return Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list
     *         of structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each
     *         structure describes a column.
     */

    public java.util.List<Option> getSelectedColumns() {
        return selectedColumns;
    }

    /**
     * <p>
     * Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list of
     * structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each structure
     * describes a column.
     * </p>
     * 
     * @param selectedColumns
     *        Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list
     *        of structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each
     *        structure describes a column.
     */

    public void setSelectedColumns(java.util.Collection<Option> selectedColumns) {
        if (selectedColumns == null) {
            this.selectedColumns = null;
            return;
        }

        this.selectedColumns = new java.util.ArrayList<Option>(selectedColumns);
    }

    /**
     * <p>
     * Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list of
     * structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each structure
     * describes a column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedColumns(java.util.Collection)} or {@link #withSelectedColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedColumns
     *        Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list
     *        of structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each
     *        structure describes a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withSelectedColumns(Option... selectedColumns) {
        if (this.selectedColumns == null) {
            setSelectedColumns(new java.util.ArrayList<Option>(selectedColumns.length));
        }
        for (Option ele : selectedColumns) {
            this.selectedColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list of
     * structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each structure
     * describes a column.
     * </p>
     * 
     * @param selectedColumns
     *        Specifies the columns combined to identify a record when detecting matches for merges and upserts. A list
     *        of structures with <code>value</code>, <code>label</code> and <code> description</code> keys. Each
     *        structure describes a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withSelectedColumns(java.util.Collection<Option> selectedColumns) {
        setSelectedColumns(selectedColumns);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on Spark,
     * if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves performance
     * of some queries.
     * </p>
     * 
     * @param autoPushdown
     *        Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on
     *        Spark, if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves
     *        performance of some queries.
     */

    public void setAutoPushdown(Boolean autoPushdown) {
        this.autoPushdown = autoPushdown;
    }

    /**
     * <p>
     * Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on Spark,
     * if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves performance
     * of some queries.
     * </p>
     * 
     * @return Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run
     *         on Spark, if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This
     *         improves performance of some queries.
     */

    public Boolean getAutoPushdown() {
        return this.autoPushdown;
    }

    /**
     * <p>
     * Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on Spark,
     * if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves performance
     * of some queries.
     * </p>
     * 
     * @param autoPushdown
     *        Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on
     *        Spark, if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves
     *        performance of some queries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withAutoPushdown(Boolean autoPushdown) {
        setAutoPushdown(autoPushdown);
        return this;
    }

    /**
     * <p>
     * Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run on Spark,
     * if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This improves performance
     * of some queries.
     * </p>
     * 
     * @return Specifies whether automatic query pushdown is enabled. If pushdown is enabled, then when a query is run
     *         on Spark, if part of the query can be "pushed down" to the Snowflake server, it is pushed down. This
     *         improves performance of some queries.
     */

    public Boolean isAutoPushdown() {
        return this.autoPushdown;
    }

    /**
     * <p>
     * Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     * <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * </p>
     * 
     * @return Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     *         <code>label</code> and <code>description</code> keys. Each structure defines a column.
     */

    public java.util.List<Option> getTableSchema() {
        return tableSchema;
    }

    /**
     * <p>
     * Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     * <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * </p>
     * 
     * @param tableSchema
     *        Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     *        <code>label</code> and <code>description</code> keys. Each structure defines a column.
     */

    public void setTableSchema(java.util.Collection<Option> tableSchema) {
        if (tableSchema == null) {
            this.tableSchema = null;
            return;
        }

        this.tableSchema = new java.util.ArrayList<Option>(tableSchema);
    }

    /**
     * <p>
     * Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     * <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableSchema(java.util.Collection)} or {@link #withTableSchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tableSchema
     *        Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     *        <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withTableSchema(Option... tableSchema) {
        if (this.tableSchema == null) {
            setTableSchema(new java.util.ArrayList<Option>(tableSchema.length));
        }
        for (Option ele : tableSchema) {
            this.tableSchema.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     * <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * </p>
     * 
     * @param tableSchema
     *        Manually defines the target schema for the node. A list of structures with <code>value</code> ,
     *        <code>label</code> and <code>description</code> keys. Each structure defines a column.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SnowflakeNodeData withTableSchema(java.util.Collection<Option> tableSchema) {
        setTableSchema(tableSchema);
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
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getConnection() != null)
            sb.append("Connection: ").append(getConnection()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getTempDir() != null)
            sb.append("TempDir: ").append(getTempDir()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
        if (getSampleQuery() != null)
            sb.append("SampleQuery: ").append(getSampleQuery()).append(",");
        if (getPreAction() != null)
            sb.append("PreAction: ").append(getPreAction()).append(",");
        if (getPostAction() != null)
            sb.append("PostAction: ").append(getPostAction()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getUpsert() != null)
            sb.append("Upsert: ").append(getUpsert()).append(",");
        if (getMergeAction() != null)
            sb.append("MergeAction: ").append(getMergeAction()).append(",");
        if (getMergeWhenMatched() != null)
            sb.append("MergeWhenMatched: ").append(getMergeWhenMatched()).append(",");
        if (getMergeWhenNotMatched() != null)
            sb.append("MergeWhenNotMatched: ").append(getMergeWhenNotMatched()).append(",");
        if (getMergeClause() != null)
            sb.append("MergeClause: ").append(getMergeClause()).append(",");
        if (getStagingTable() != null)
            sb.append("StagingTable: ").append(getStagingTable()).append(",");
        if (getSelectedColumns() != null)
            sb.append("SelectedColumns: ").append(getSelectedColumns()).append(",");
        if (getAutoPushdown() != null)
            sb.append("AutoPushdown: ").append(getAutoPushdown()).append(",");
        if (getTableSchema() != null)
            sb.append("TableSchema: ").append(getTableSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SnowflakeNodeData == false)
            return false;
        SnowflakeNodeData other = (SnowflakeNodeData) obj;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getConnection() == null ^ this.getConnection() == null)
            return false;
        if (other.getConnection() != null && other.getConnection().equals(this.getConnection()) == false)
            return false;
        if (other.getSchema() == null ^ this.getSchema() == null)
            return false;
        if (other.getSchema() != null && other.getSchema().equals(this.getSchema()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getTempDir() == null ^ this.getTempDir() == null)
            return false;
        if (other.getTempDir() != null && other.getTempDir().equals(this.getTempDir()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        if (other.getSampleQuery() == null ^ this.getSampleQuery() == null)
            return false;
        if (other.getSampleQuery() != null && other.getSampleQuery().equals(this.getSampleQuery()) == false)
            return false;
        if (other.getPreAction() == null ^ this.getPreAction() == null)
            return false;
        if (other.getPreAction() != null && other.getPreAction().equals(this.getPreAction()) == false)
            return false;
        if (other.getPostAction() == null ^ this.getPostAction() == null)
            return false;
        if (other.getPostAction() != null && other.getPostAction().equals(this.getPostAction()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getUpsert() == null ^ this.getUpsert() == null)
            return false;
        if (other.getUpsert() != null && other.getUpsert().equals(this.getUpsert()) == false)
            return false;
        if (other.getMergeAction() == null ^ this.getMergeAction() == null)
            return false;
        if (other.getMergeAction() != null && other.getMergeAction().equals(this.getMergeAction()) == false)
            return false;
        if (other.getMergeWhenMatched() == null ^ this.getMergeWhenMatched() == null)
            return false;
        if (other.getMergeWhenMatched() != null && other.getMergeWhenMatched().equals(this.getMergeWhenMatched()) == false)
            return false;
        if (other.getMergeWhenNotMatched() == null ^ this.getMergeWhenNotMatched() == null)
            return false;
        if (other.getMergeWhenNotMatched() != null && other.getMergeWhenNotMatched().equals(this.getMergeWhenNotMatched()) == false)
            return false;
        if (other.getMergeClause() == null ^ this.getMergeClause() == null)
            return false;
        if (other.getMergeClause() != null && other.getMergeClause().equals(this.getMergeClause()) == false)
            return false;
        if (other.getStagingTable() == null ^ this.getStagingTable() == null)
            return false;
        if (other.getStagingTable() != null && other.getStagingTable().equals(this.getStagingTable()) == false)
            return false;
        if (other.getSelectedColumns() == null ^ this.getSelectedColumns() == null)
            return false;
        if (other.getSelectedColumns() != null && other.getSelectedColumns().equals(this.getSelectedColumns()) == false)
            return false;
        if (other.getAutoPushdown() == null ^ this.getAutoPushdown() == null)
            return false;
        if (other.getAutoPushdown() != null && other.getAutoPushdown().equals(this.getAutoPushdown()) == false)
            return false;
        if (other.getTableSchema() == null ^ this.getTableSchema() == null)
            return false;
        if (other.getTableSchema() != null && other.getTableSchema().equals(this.getTableSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getConnection() == null) ? 0 : getConnection().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getTempDir() == null) ? 0 : getTempDir().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getSampleQuery() == null) ? 0 : getSampleQuery().hashCode());
        hashCode = prime * hashCode + ((getPreAction() == null) ? 0 : getPreAction().hashCode());
        hashCode = prime * hashCode + ((getPostAction() == null) ? 0 : getPostAction().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getUpsert() == null) ? 0 : getUpsert().hashCode());
        hashCode = prime * hashCode + ((getMergeAction() == null) ? 0 : getMergeAction().hashCode());
        hashCode = prime * hashCode + ((getMergeWhenMatched() == null) ? 0 : getMergeWhenMatched().hashCode());
        hashCode = prime * hashCode + ((getMergeWhenNotMatched() == null) ? 0 : getMergeWhenNotMatched().hashCode());
        hashCode = prime * hashCode + ((getMergeClause() == null) ? 0 : getMergeClause().hashCode());
        hashCode = prime * hashCode + ((getStagingTable() == null) ? 0 : getStagingTable().hashCode());
        hashCode = prime * hashCode + ((getSelectedColumns() == null) ? 0 : getSelectedColumns().hashCode());
        hashCode = prime * hashCode + ((getAutoPushdown() == null) ? 0 : getAutoPushdown().hashCode());
        hashCode = prime * hashCode + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        return hashCode;
    }

    @Override
    public SnowflakeNodeData clone() {
        try {
            return (SnowflakeNodeData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SnowflakeNodeDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
