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
 * Specifies an Amazon Redshift node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/AmazonRedshiftNodeData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonRedshiftNodeData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access type for the Redshift connection. Can be a direct connection or catalog connections.
     * </p>
     */
    private String accessType;
    /**
     * <p>
     * The source type to specify whether a specific table is the source or a custom query.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * The Glue connection to the Redshift cluster.
     * </p>
     */
    private Option connection;
    /**
     * <p>
     * The Redshift schema name when working with a direct connection.
     * </p>
     */
    private Option schema;
    /**
     * <p>
     * The Redshift table name when working with a direct connection.
     * </p>
     */
    private Option table;
    /**
     * <p>
     * The name of the Glue Data Catalog database when working with a data catalog.
     * </p>
     */
    private Option catalogDatabase;
    /**
     * <p>
     * The Glue Data Catalog table name when working with a data catalog.
     * </p>
     */
    private Option catalogTable;
    /**
     * <p>
     * The Redshift schema name when working with a data catalog.
     * </p>
     */
    private String catalogRedshiftSchema;
    /**
     * <p>
     * The database table to read from.
     * </p>
     */
    private String catalogRedshiftTable;
    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     */
    private String tempDir;
    /**
     * <p>
     * Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when left
     * blank.
     * </p>
     */
    private Option iamRole;
    /**
     * <p>
     * Optional values when connecting to the Redshift cluster.
     * </p>
     */
    private java.util.List<AmazonRedshiftAdvancedOption> advancedOptions;
    /**
     * <p>
     * The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     * </p>
     */
    private String sampleQuery;
    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     */
    private String preAction;
    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     */
    private String postAction;
    /**
     * <p>
     * Specifies how writing to a Redshift cluser will occur.
     * </p>
     */
    private String action;
    /**
     * <p>
     * Specifies the prefix to a table.
     * </p>
     */
    private String tablePrefix;
    /**
     * <p>
     * The action used on Redshift sinks when doing an APPEND.
     * </p>
     */
    private Boolean upsert;
    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled.
     * </p>
     */
    private String mergeAction;
    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record matches a
     * new record.
     * </p>
     */
    private String mergeWhenMatched;
    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record doesn't
     * match a new record.
     * </p>
     */
    private String mergeWhenNotMatched;
    /**
     * <p>
     * The SQL used in a custom merge to deal with matching records.
     * </p>
     */
    private String mergeClause;
    /**
     * <p>
     * Specifies the name of the connection that is associated with the catalog table used.
     * </p>
     */
    private String crawlerConnection;
    /**
     * <p>
     * The array of schema output for a given node.
     * </p>
     */
    private java.util.List<Option> tableSchema;
    /**
     * <p>
     * The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     * </p>
     */
    private String stagingTable;
    /**
     * <p>
     * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * </p>
     */
    private java.util.List<Option> selectedColumns;

    /**
     * <p>
     * The access type for the Redshift connection. Can be a direct connection or catalog connections.
     * </p>
     * 
     * @param accessType
     *        The access type for the Redshift connection. Can be a direct connection or catalog connections.
     */

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    /**
     * <p>
     * The access type for the Redshift connection. Can be a direct connection or catalog connections.
     * </p>
     * 
     * @return The access type for the Redshift connection. Can be a direct connection or catalog connections.
     */

    public String getAccessType() {
        return this.accessType;
    }

    /**
     * <p>
     * The access type for the Redshift connection. Can be a direct connection or catalog connections.
     * </p>
     * 
     * @param accessType
     *        The access type for the Redshift connection. Can be a direct connection or catalog connections.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withAccessType(String accessType) {
        setAccessType(accessType);
        return this;
    }

    /**
     * <p>
     * The source type to specify whether a specific table is the source or a custom query.
     * </p>
     * 
     * @param sourceType
     *        The source type to specify whether a specific table is the source or a custom query.
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * The source type to specify whether a specific table is the source or a custom query.
     * </p>
     * 
     * @return The source type to specify whether a specific table is the source or a custom query.
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * The source type to specify whether a specific table is the source or a custom query.
     * </p>
     * 
     * @param sourceType
     *        The source type to specify whether a specific table is the source or a custom query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * The Glue connection to the Redshift cluster.
     * </p>
     * 
     * @param connection
     *        The Glue connection to the Redshift cluster.
     */

    public void setConnection(Option connection) {
        this.connection = connection;
    }

    /**
     * <p>
     * The Glue connection to the Redshift cluster.
     * </p>
     * 
     * @return The Glue connection to the Redshift cluster.
     */

    public Option getConnection() {
        return this.connection;
    }

    /**
     * <p>
     * The Glue connection to the Redshift cluster.
     * </p>
     * 
     * @param connection
     *        The Glue connection to the Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withConnection(Option connection) {
        setConnection(connection);
        return this;
    }

    /**
     * <p>
     * The Redshift schema name when working with a direct connection.
     * </p>
     * 
     * @param schema
     *        The Redshift schema name when working with a direct connection.
     */

    public void setSchema(Option schema) {
        this.schema = schema;
    }

    /**
     * <p>
     * The Redshift schema name when working with a direct connection.
     * </p>
     * 
     * @return The Redshift schema name when working with a direct connection.
     */

    public Option getSchema() {
        return this.schema;
    }

    /**
     * <p>
     * The Redshift schema name when working with a direct connection.
     * </p>
     * 
     * @param schema
     *        The Redshift schema name when working with a direct connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withSchema(Option schema) {
        setSchema(schema);
        return this;
    }

    /**
     * <p>
     * The Redshift table name when working with a direct connection.
     * </p>
     * 
     * @param table
     *        The Redshift table name when working with a direct connection.
     */

    public void setTable(Option table) {
        this.table = table;
    }

    /**
     * <p>
     * The Redshift table name when working with a direct connection.
     * </p>
     * 
     * @return The Redshift table name when working with a direct connection.
     */

    public Option getTable() {
        return this.table;
    }

    /**
     * <p>
     * The Redshift table name when working with a direct connection.
     * </p>
     * 
     * @param table
     *        The Redshift table name when working with a direct connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withTable(Option table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The name of the Glue Data Catalog database when working with a data catalog.
     * </p>
     * 
     * @param catalogDatabase
     *        The name of the Glue Data Catalog database when working with a data catalog.
     */

    public void setCatalogDatabase(Option catalogDatabase) {
        this.catalogDatabase = catalogDatabase;
    }

    /**
     * <p>
     * The name of the Glue Data Catalog database when working with a data catalog.
     * </p>
     * 
     * @return The name of the Glue Data Catalog database when working with a data catalog.
     */

    public Option getCatalogDatabase() {
        return this.catalogDatabase;
    }

    /**
     * <p>
     * The name of the Glue Data Catalog database when working with a data catalog.
     * </p>
     * 
     * @param catalogDatabase
     *        The name of the Glue Data Catalog database when working with a data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withCatalogDatabase(Option catalogDatabase) {
        setCatalogDatabase(catalogDatabase);
        return this;
    }

    /**
     * <p>
     * The Glue Data Catalog table name when working with a data catalog.
     * </p>
     * 
     * @param catalogTable
     *        The Glue Data Catalog table name when working with a data catalog.
     */

    public void setCatalogTable(Option catalogTable) {
        this.catalogTable = catalogTable;
    }

    /**
     * <p>
     * The Glue Data Catalog table name when working with a data catalog.
     * </p>
     * 
     * @return The Glue Data Catalog table name when working with a data catalog.
     */

    public Option getCatalogTable() {
        return this.catalogTable;
    }

    /**
     * <p>
     * The Glue Data Catalog table name when working with a data catalog.
     * </p>
     * 
     * @param catalogTable
     *        The Glue Data Catalog table name when working with a data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withCatalogTable(Option catalogTable) {
        setCatalogTable(catalogTable);
        return this;
    }

    /**
     * <p>
     * The Redshift schema name when working with a data catalog.
     * </p>
     * 
     * @param catalogRedshiftSchema
     *        The Redshift schema name when working with a data catalog.
     */

    public void setCatalogRedshiftSchema(String catalogRedshiftSchema) {
        this.catalogRedshiftSchema = catalogRedshiftSchema;
    }

    /**
     * <p>
     * The Redshift schema name when working with a data catalog.
     * </p>
     * 
     * @return The Redshift schema name when working with a data catalog.
     */

    public String getCatalogRedshiftSchema() {
        return this.catalogRedshiftSchema;
    }

    /**
     * <p>
     * The Redshift schema name when working with a data catalog.
     * </p>
     * 
     * @param catalogRedshiftSchema
     *        The Redshift schema name when working with a data catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withCatalogRedshiftSchema(String catalogRedshiftSchema) {
        setCatalogRedshiftSchema(catalogRedshiftSchema);
        return this;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param catalogRedshiftTable
     *        The database table to read from.
     */

    public void setCatalogRedshiftTable(String catalogRedshiftTable) {
        this.catalogRedshiftTable = catalogRedshiftTable;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @return The database table to read from.
     */

    public String getCatalogRedshiftTable() {
        return this.catalogRedshiftTable;
    }

    /**
     * <p>
     * The database table to read from.
     * </p>
     * 
     * @param catalogRedshiftTable
     *        The database table to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withCatalogRedshiftTable(String catalogRedshiftTable) {
        setCatalogRedshiftTable(catalogRedshiftTable);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @param tempDir
     *        The Amazon S3 path where temporary data can be staged when copying out of the database.
     */

    public void setTempDir(String tempDir) {
        this.tempDir = tempDir;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @return The Amazon S3 path where temporary data can be staged when copying out of the database.
     */

    public String getTempDir() {
        return this.tempDir;
    }

    /**
     * <p>
     * The Amazon S3 path where temporary data can be staged when copying out of the database.
     * </p>
     * 
     * @param tempDir
     *        The Amazon S3 path where temporary data can be staged when copying out of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withTempDir(String tempDir) {
        setTempDir(tempDir);
        return this;
    }

    /**
     * <p>
     * Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when left
     * blank.
     * </p>
     * 
     * @param iamRole
     *        Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when
     *        left blank.
     */

    public void setIamRole(Option iamRole) {
        this.iamRole = iamRole;
    }

    /**
     * <p>
     * Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when left
     * blank.
     * </p>
     * 
     * @return Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when
     *         left blank.
     */

    public Option getIamRole() {
        return this.iamRole;
    }

    /**
     * <p>
     * Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when left
     * blank.
     * </p>
     * 
     * @param iamRole
     *        Optional. The role name use when connection to S3. The IAM role ill default to the role on the job when
     *        left blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withIamRole(Option iamRole) {
        setIamRole(iamRole);
        return this;
    }

    /**
     * <p>
     * Optional values when connecting to the Redshift cluster.
     * </p>
     * 
     * @return Optional values when connecting to the Redshift cluster.
     */

    public java.util.List<AmazonRedshiftAdvancedOption> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Optional values when connecting to the Redshift cluster.
     * </p>
     * 
     * @param advancedOptions
     *        Optional values when connecting to the Redshift cluster.
     */

    public void setAdvancedOptions(java.util.Collection<AmazonRedshiftAdvancedOption> advancedOptions) {
        if (advancedOptions == null) {
            this.advancedOptions = null;
            return;
        }

        this.advancedOptions = new java.util.ArrayList<AmazonRedshiftAdvancedOption>(advancedOptions);
    }

    /**
     * <p>
     * Optional values when connecting to the Redshift cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdvancedOptions(java.util.Collection)} or {@link #withAdvancedOptions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param advancedOptions
     *        Optional values when connecting to the Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withAdvancedOptions(AmazonRedshiftAdvancedOption... advancedOptions) {
        if (this.advancedOptions == null) {
            setAdvancedOptions(new java.util.ArrayList<AmazonRedshiftAdvancedOption>(advancedOptions.length));
        }
        for (AmazonRedshiftAdvancedOption ele : advancedOptions) {
            this.advancedOptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional values when connecting to the Redshift cluster.
     * </p>
     * 
     * @param advancedOptions
     *        Optional values when connecting to the Redshift cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withAdvancedOptions(java.util.Collection<AmazonRedshiftAdvancedOption> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * <p>
     * The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     * </p>
     * 
     * @param sampleQuery
     *        The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     */

    public void setSampleQuery(String sampleQuery) {
        this.sampleQuery = sampleQuery;
    }

    /**
     * <p>
     * The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     * </p>
     * 
     * @return The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     */

    public String getSampleQuery() {
        return this.sampleQuery;
    }

    /**
     * <p>
     * The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     * </p>
     * 
     * @param sampleQuery
     *        The SQL used to fetch the data from a Redshift sources when the SourceType is 'query'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withSampleQuery(String sampleQuery) {
        setSampleQuery(sampleQuery);
        return this;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @param preAction
     *        The SQL used before a MERGE or APPEND with upsert is run.
     */

    public void setPreAction(String preAction) {
        this.preAction = preAction;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @return The SQL used before a MERGE or APPEND with upsert is run.
     */

    public String getPreAction() {
        return this.preAction;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @param preAction
     *        The SQL used before a MERGE or APPEND with upsert is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withPreAction(String preAction) {
        setPreAction(preAction);
        return this;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @param postAction
     *        The SQL used before a MERGE or APPEND with upsert is run.
     */

    public void setPostAction(String postAction) {
        this.postAction = postAction;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @return The SQL used before a MERGE or APPEND with upsert is run.
     */

    public String getPostAction() {
        return this.postAction;
    }

    /**
     * <p>
     * The SQL used before a MERGE or APPEND with upsert is run.
     * </p>
     * 
     * @param postAction
     *        The SQL used before a MERGE or APPEND with upsert is run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withPostAction(String postAction) {
        setPostAction(postAction);
        return this;
    }

    /**
     * <p>
     * Specifies how writing to a Redshift cluser will occur.
     * </p>
     * 
     * @param action
     *        Specifies how writing to a Redshift cluser will occur.
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies how writing to a Redshift cluser will occur.
     * </p>
     * 
     * @return Specifies how writing to a Redshift cluser will occur.
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies how writing to a Redshift cluser will occur.
     * </p>
     * 
     * @param action
     *        Specifies how writing to a Redshift cluser will occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies the prefix to a table.
     * </p>
     * 
     * @param tablePrefix
     *        Specifies the prefix to a table.
     */

    public void setTablePrefix(String tablePrefix) {
        this.tablePrefix = tablePrefix;
    }

    /**
     * <p>
     * Specifies the prefix to a table.
     * </p>
     * 
     * @return Specifies the prefix to a table.
     */

    public String getTablePrefix() {
        return this.tablePrefix;
    }

    /**
     * <p>
     * Specifies the prefix to a table.
     * </p>
     * 
     * @param tablePrefix
     *        Specifies the prefix to a table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withTablePrefix(String tablePrefix) {
        setTablePrefix(tablePrefix);
        return this;
    }

    /**
     * <p>
     * The action used on Redshift sinks when doing an APPEND.
     * </p>
     * 
     * @param upsert
     *        The action used on Redshift sinks when doing an APPEND.
     */

    public void setUpsert(Boolean upsert) {
        this.upsert = upsert;
    }

    /**
     * <p>
     * The action used on Redshift sinks when doing an APPEND.
     * </p>
     * 
     * @return The action used on Redshift sinks when doing an APPEND.
     */

    public Boolean getUpsert() {
        return this.upsert;
    }

    /**
     * <p>
     * The action used on Redshift sinks when doing an APPEND.
     * </p>
     * 
     * @param upsert
     *        The action used on Redshift sinks when doing an APPEND.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withUpsert(Boolean upsert) {
        setUpsert(upsert);
        return this;
    }

    /**
     * <p>
     * The action used on Redshift sinks when doing an APPEND.
     * </p>
     * 
     * @return The action used on Redshift sinks when doing an APPEND.
     */

    public Boolean isUpsert() {
        return this.upsert;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled.
     * </p>
     * 
     * @param mergeAction
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled.
     */

    public void setMergeAction(String mergeAction) {
        this.mergeAction = mergeAction;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled.
     * </p>
     * 
     * @return The action used when to detemine how a MERGE in a Redshift sink will be handled.
     */

    public String getMergeAction() {
        return this.mergeAction;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled.
     * </p>
     * 
     * @param mergeAction
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withMergeAction(String mergeAction) {
        setMergeAction(mergeAction);
        return this;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record matches a
     * new record.
     * </p>
     * 
     * @param mergeWhenMatched
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *        matches a new record.
     */

    public void setMergeWhenMatched(String mergeWhenMatched) {
        this.mergeWhenMatched = mergeWhenMatched;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record matches a
     * new record.
     * </p>
     * 
     * @return The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *         matches a new record.
     */

    public String getMergeWhenMatched() {
        return this.mergeWhenMatched;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record matches a
     * new record.
     * </p>
     * 
     * @param mergeWhenMatched
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *        matches a new record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withMergeWhenMatched(String mergeWhenMatched) {
        setMergeWhenMatched(mergeWhenMatched);
        return this;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record doesn't
     * match a new record.
     * </p>
     * 
     * @param mergeWhenNotMatched
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *        doesn't match a new record.
     */

    public void setMergeWhenNotMatched(String mergeWhenNotMatched) {
        this.mergeWhenNotMatched = mergeWhenNotMatched;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record doesn't
     * match a new record.
     * </p>
     * 
     * @return The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *         doesn't match a new record.
     */

    public String getMergeWhenNotMatched() {
        return this.mergeWhenNotMatched;
    }

    /**
     * <p>
     * The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record doesn't
     * match a new record.
     * </p>
     * 
     * @param mergeWhenNotMatched
     *        The action used when to detemine how a MERGE in a Redshift sink will be handled when an existing record
     *        doesn't match a new record.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withMergeWhenNotMatched(String mergeWhenNotMatched) {
        setMergeWhenNotMatched(mergeWhenNotMatched);
        return this;
    }

    /**
     * <p>
     * The SQL used in a custom merge to deal with matching records.
     * </p>
     * 
     * @param mergeClause
     *        The SQL used in a custom merge to deal with matching records.
     */

    public void setMergeClause(String mergeClause) {
        this.mergeClause = mergeClause;
    }

    /**
     * <p>
     * The SQL used in a custom merge to deal with matching records.
     * </p>
     * 
     * @return The SQL used in a custom merge to deal with matching records.
     */

    public String getMergeClause() {
        return this.mergeClause;
    }

    /**
     * <p>
     * The SQL used in a custom merge to deal with matching records.
     * </p>
     * 
     * @param mergeClause
     *        The SQL used in a custom merge to deal with matching records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withMergeClause(String mergeClause) {
        setMergeClause(mergeClause);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the connection that is associated with the catalog table used.
     * </p>
     * 
     * @param crawlerConnection
     *        Specifies the name of the connection that is associated with the catalog table used.
     */

    public void setCrawlerConnection(String crawlerConnection) {
        this.crawlerConnection = crawlerConnection;
    }

    /**
     * <p>
     * Specifies the name of the connection that is associated with the catalog table used.
     * </p>
     * 
     * @return Specifies the name of the connection that is associated with the catalog table used.
     */

    public String getCrawlerConnection() {
        return this.crawlerConnection;
    }

    /**
     * <p>
     * Specifies the name of the connection that is associated with the catalog table used.
     * </p>
     * 
     * @param crawlerConnection
     *        Specifies the name of the connection that is associated with the catalog table used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withCrawlerConnection(String crawlerConnection) {
        setCrawlerConnection(crawlerConnection);
        return this;
    }

    /**
     * <p>
     * The array of schema output for a given node.
     * </p>
     * 
     * @return The array of schema output for a given node.
     */

    public java.util.List<Option> getTableSchema() {
        return tableSchema;
    }

    /**
     * <p>
     * The array of schema output for a given node.
     * </p>
     * 
     * @param tableSchema
     *        The array of schema output for a given node.
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
     * The array of schema output for a given node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTableSchema(java.util.Collection)} or {@link #withTableSchema(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tableSchema
     *        The array of schema output for a given node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withTableSchema(Option... tableSchema) {
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
     * The array of schema output for a given node.
     * </p>
     * 
     * @param tableSchema
     *        The array of schema output for a given node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withTableSchema(java.util.Collection<Option> tableSchema) {
        setTableSchema(tableSchema);
        return this;
    }

    /**
     * <p>
     * The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @param stagingTable
     *        The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     */

    public void setStagingTable(String stagingTable) {
        this.stagingTable = stagingTable;
    }

    /**
     * <p>
     * The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @return The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     */

    public String getStagingTable() {
        return this.stagingTable;
    }

    /**
     * <p>
     * The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @param stagingTable
     *        The name of the temporary staging table that is used when doing a MERGE or APPEND with upsert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withStagingTable(String stagingTable) {
        setStagingTable(stagingTable);
        return this;
    }

    /**
     * <p>
     * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @return The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     */

    public java.util.List<Option> getSelectedColumns() {
        return selectedColumns;
    }

    /**
     * <p>
     * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @param selectedColumns
     *        The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
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
     * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSelectedColumns(java.util.Collection)} or {@link #withSelectedColumns(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param selectedColumns
     *        The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withSelectedColumns(Option... selectedColumns) {
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
     * The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * </p>
     * 
     * @param selectedColumns
     *        The list of column names used to determine a matching record when doing a MERGE or APPEND with upsert.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AmazonRedshiftNodeData withSelectedColumns(java.util.Collection<Option> selectedColumns) {
        setSelectedColumns(selectedColumns);
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
        if (getAccessType() != null)
            sb.append("AccessType: ").append(getAccessType()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getConnection() != null)
            sb.append("Connection: ").append(getConnection()).append(",");
        if (getSchema() != null)
            sb.append("Schema: ").append(getSchema()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getCatalogDatabase() != null)
            sb.append("CatalogDatabase: ").append(getCatalogDatabase()).append(",");
        if (getCatalogTable() != null)
            sb.append("CatalogTable: ").append(getCatalogTable()).append(",");
        if (getCatalogRedshiftSchema() != null)
            sb.append("CatalogRedshiftSchema: ").append(getCatalogRedshiftSchema()).append(",");
        if (getCatalogRedshiftTable() != null)
            sb.append("CatalogRedshiftTable: ").append(getCatalogRedshiftTable()).append(",");
        if (getTempDir() != null)
            sb.append("TempDir: ").append(getTempDir()).append(",");
        if (getIamRole() != null)
            sb.append("IamRole: ").append(getIamRole()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getSampleQuery() != null)
            sb.append("SampleQuery: ").append(getSampleQuery()).append(",");
        if (getPreAction() != null)
            sb.append("PreAction: ").append(getPreAction()).append(",");
        if (getPostAction() != null)
            sb.append("PostAction: ").append(getPostAction()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getTablePrefix() != null)
            sb.append("TablePrefix: ").append(getTablePrefix()).append(",");
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
        if (getCrawlerConnection() != null)
            sb.append("CrawlerConnection: ").append(getCrawlerConnection()).append(",");
        if (getTableSchema() != null)
            sb.append("TableSchema: ").append(getTableSchema()).append(",");
        if (getStagingTable() != null)
            sb.append("StagingTable: ").append(getStagingTable()).append(",");
        if (getSelectedColumns() != null)
            sb.append("SelectedColumns: ").append(getSelectedColumns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AmazonRedshiftNodeData == false)
            return false;
        AmazonRedshiftNodeData other = (AmazonRedshiftNodeData) obj;
        if (other.getAccessType() == null ^ this.getAccessType() == null)
            return false;
        if (other.getAccessType() != null && other.getAccessType().equals(this.getAccessType()) == false)
            return false;
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
        if (other.getCatalogDatabase() == null ^ this.getCatalogDatabase() == null)
            return false;
        if (other.getCatalogDatabase() != null && other.getCatalogDatabase().equals(this.getCatalogDatabase()) == false)
            return false;
        if (other.getCatalogTable() == null ^ this.getCatalogTable() == null)
            return false;
        if (other.getCatalogTable() != null && other.getCatalogTable().equals(this.getCatalogTable()) == false)
            return false;
        if (other.getCatalogRedshiftSchema() == null ^ this.getCatalogRedshiftSchema() == null)
            return false;
        if (other.getCatalogRedshiftSchema() != null && other.getCatalogRedshiftSchema().equals(this.getCatalogRedshiftSchema()) == false)
            return false;
        if (other.getCatalogRedshiftTable() == null ^ this.getCatalogRedshiftTable() == null)
            return false;
        if (other.getCatalogRedshiftTable() != null && other.getCatalogRedshiftTable().equals(this.getCatalogRedshiftTable()) == false)
            return false;
        if (other.getTempDir() == null ^ this.getTempDir() == null)
            return false;
        if (other.getTempDir() != null && other.getTempDir().equals(this.getTempDir()) == false)
            return false;
        if (other.getIamRole() == null ^ this.getIamRole() == null)
            return false;
        if (other.getIamRole() != null && other.getIamRole().equals(this.getIamRole()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
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
        if (other.getTablePrefix() == null ^ this.getTablePrefix() == null)
            return false;
        if (other.getTablePrefix() != null && other.getTablePrefix().equals(this.getTablePrefix()) == false)
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
        if (other.getCrawlerConnection() == null ^ this.getCrawlerConnection() == null)
            return false;
        if (other.getCrawlerConnection() != null && other.getCrawlerConnection().equals(this.getCrawlerConnection()) == false)
            return false;
        if (other.getTableSchema() == null ^ this.getTableSchema() == null)
            return false;
        if (other.getTableSchema() != null && other.getTableSchema().equals(this.getTableSchema()) == false)
            return false;
        if (other.getStagingTable() == null ^ this.getStagingTable() == null)
            return false;
        if (other.getStagingTable() != null && other.getStagingTable().equals(this.getStagingTable()) == false)
            return false;
        if (other.getSelectedColumns() == null ^ this.getSelectedColumns() == null)
            return false;
        if (other.getSelectedColumns() != null && other.getSelectedColumns().equals(this.getSelectedColumns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessType() == null) ? 0 : getAccessType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getConnection() == null) ? 0 : getConnection().hashCode());
        hashCode = prime * hashCode + ((getSchema() == null) ? 0 : getSchema().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getCatalogDatabase() == null) ? 0 : getCatalogDatabase().hashCode());
        hashCode = prime * hashCode + ((getCatalogTable() == null) ? 0 : getCatalogTable().hashCode());
        hashCode = prime * hashCode + ((getCatalogRedshiftSchema() == null) ? 0 : getCatalogRedshiftSchema().hashCode());
        hashCode = prime * hashCode + ((getCatalogRedshiftTable() == null) ? 0 : getCatalogRedshiftTable().hashCode());
        hashCode = prime * hashCode + ((getTempDir() == null) ? 0 : getTempDir().hashCode());
        hashCode = prime * hashCode + ((getIamRole() == null) ? 0 : getIamRole().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getSampleQuery() == null) ? 0 : getSampleQuery().hashCode());
        hashCode = prime * hashCode + ((getPreAction() == null) ? 0 : getPreAction().hashCode());
        hashCode = prime * hashCode + ((getPostAction() == null) ? 0 : getPostAction().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getTablePrefix() == null) ? 0 : getTablePrefix().hashCode());
        hashCode = prime * hashCode + ((getUpsert() == null) ? 0 : getUpsert().hashCode());
        hashCode = prime * hashCode + ((getMergeAction() == null) ? 0 : getMergeAction().hashCode());
        hashCode = prime * hashCode + ((getMergeWhenMatched() == null) ? 0 : getMergeWhenMatched().hashCode());
        hashCode = prime * hashCode + ((getMergeWhenNotMatched() == null) ? 0 : getMergeWhenNotMatched().hashCode());
        hashCode = prime * hashCode + ((getMergeClause() == null) ? 0 : getMergeClause().hashCode());
        hashCode = prime * hashCode + ((getCrawlerConnection() == null) ? 0 : getCrawlerConnection().hashCode());
        hashCode = prime * hashCode + ((getTableSchema() == null) ? 0 : getTableSchema().hashCode());
        hashCode = prime * hashCode + ((getStagingTable() == null) ? 0 : getStagingTable().hashCode());
        hashCode = prime * hashCode + ((getSelectedColumns() == null) ? 0 : getSelectedColumns().hashCode());
        return hashCode;
    }

    @Override
    public AmazonRedshiftNodeData clone() {
        try {
            return (AmazonRedshiftNodeData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.AmazonRedshiftNodeDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
