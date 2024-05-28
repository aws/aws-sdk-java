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
 * Represents a collection of related data organized in columns and rows.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Table" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Table implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The table name. For Hive compatibility, this must be entirely lowercase.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A description of the table.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The owner of the table.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * The time when the table definition was created in the Data Catalog.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The last time that the table was updated.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     * </p>
     */
    private java.util.Date lastAccessTime;
    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     */
    private java.util.Date lastAnalyzedTime;
    /**
     * <p>
     * The retention time for this table.
     * </p>
     */
    private Integer retention;
    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     */
    private StorageDescriptor storageDescriptor;
    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you must at
     * least set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     */
    private java.util.List<Column> partitionKeys;
    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is a
     * <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     * </p>
     */
    private String viewOriginalText;
    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     * </p>
     */
    private String viewExpandedText;
    /**
     * <p>
     * The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services, such
     * as Athena, may create tables with additional table types.
     * </p>
     * <p>
     * Glue related table types:
     * </p>
     * <dl>
     * <dt>EXTERNAL_TABLE</dt>
     * <dd>
     * <p>
     * Hive compatible attribute - indicates a non-Hive managed table.
     * </p>
     * </dd>
     * <dt>GOVERNED</dt>
     * <dd>
     * <p>
     * Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     * </p>
     * </dd>
     * </dl>
     */
    private String tableType;
    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     */
    private java.util.Map<String, String> parameters;
    /**
     * <p>
     * The person or entity who created the table.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * Indicates whether the table has been registered with Lake Formation.
     * </p>
     */
    private Boolean isRegisteredWithLakeFormation;
    /**
     * <p>
     * A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     * </p>
     */
    private TableIdentifier targetTable;
    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The ID of the table version.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     * </p>
     */
    private FederatedTable federatedTable;
    /**
     * <p>
     * A structure that contains all the information that defines the view, including the dialect or dialects for the
     * view, and the query.
     * </p>
     */
    private ViewDefinition viewDefinition;
    /**
     * <p>
     * Specifies whether the view supports the SQL dialects of one or more different query engines and can therefore be
     * read by those engines.
     * </p>
     */
    private Boolean isMultiDialectView;

    /**
     * <p>
     * The table name. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @param name
     *        The table name. For Hive compatibility, this must be entirely lowercase.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The table name. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @return The table name. For Hive compatibility, this must be entirely lowercase.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The table name. For Hive compatibility, this must be entirely lowercase.
     * </p>
     * 
     * @param name
     *        The table name. For Hive compatibility, this must be entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where the table metadata resides. For Hive compatibility, this must be all
     *        lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @return The name of the database where the table metadata resides. For Hive compatibility, this must be all
     *         lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the database where the table metadata resides. For Hive compatibility, this must be all lowercase.
     * </p>
     * 
     * @param databaseName
     *        The name of the database where the table metadata resides. For Hive compatibility, this must be all
     *        lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * 
     * @param description
     *        A description of the table.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * 
     * @return A description of the table.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the table.
     * </p>
     * 
     * @param description
     *        A description of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The owner of the table.
     * </p>
     * 
     * @param owner
     *        The owner of the table.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of the table.
     * </p>
     * 
     * @return The owner of the table.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The owner of the table.
     * </p>
     * 
     * @param owner
     *        The owner of the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * The time when the table definition was created in the Data Catalog.
     * </p>
     * 
     * @param createTime
     *        The time when the table definition was created in the Data Catalog.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The time when the table definition was created in the Data Catalog.
     * </p>
     * 
     * @return The time when the table definition was created in the Data Catalog.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The time when the table definition was created in the Data Catalog.
     * </p>
     * 
     * @param createTime
     *        The time when the table definition was created in the Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The last time that the table was updated.
     * </p>
     * 
     * @param updateTime
     *        The last time that the table was updated.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The last time that the table was updated.
     * </p>
     * 
     * @return The last time that the table was updated.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The last time that the table was updated.
     * </p>
     * 
     * @param updateTime
     *        The last time that the table was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     */

    public void setLastAccessTime(java.util.Date lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    /**
     * <p>
     * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     * </p>
     * 
     * @return The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     */

    public java.util.Date getLastAccessTime() {
        return this.lastAccessTime;
    }

    /**
     * <p>
     * The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     * </p>
     * 
     * @param lastAccessTime
     *        The last time that the table was accessed. This is usually taken from HDFS, and might not be reliable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withLastAccessTime(java.util.Date lastAccessTime) {
        setLastAccessTime(lastAccessTime);
        return this;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        The last time that column statistics were computed for this table.
     */

    public void setLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     * 
     * @return The last time that column statistics were computed for this table.
     */

    public java.util.Date getLastAnalyzedTime() {
        return this.lastAnalyzedTime;
    }

    /**
     * <p>
     * The last time that column statistics were computed for this table.
     * </p>
     * 
     * @param lastAnalyzedTime
     *        The last time that column statistics were computed for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withLastAnalyzedTime(java.util.Date lastAnalyzedTime) {
        setLastAnalyzedTime(lastAnalyzedTime);
        return this;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * 
     * @param retention
     *        The retention time for this table.
     */

    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * 
     * @return The retention time for this table.
     */

    public Integer getRetention() {
        return this.retention;
    }

    /**
     * <p>
     * The retention time for this table.
     * </p>
     * 
     * @param retention
     *        The retention time for this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withRetention(Integer retention) {
        setRetention(retention);
        return this;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @param storageDescriptor
     *        A storage descriptor containing information about the physical storage of this table.
     */

    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @return A storage descriptor containing information about the physical storage of this table.
     */

    public StorageDescriptor getStorageDescriptor() {
        return this.storageDescriptor;
    }

    /**
     * <p>
     * A storage descriptor containing information about the physical storage of this table.
     * </p>
     * 
     * @param storageDescriptor
     *        A storage descriptor containing information about the physical storage of this table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withStorageDescriptor(StorageDescriptor storageDescriptor) {
        setStorageDescriptor(storageDescriptor);
        return this;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you must at
     * least set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @return A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *         keys.</p>
     *         <p>
     *         When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you
     *         must at least set the value of <code>partitionKeys</code> to an empty list. For example:
     *         </p>
     *         <p>
     *         <code>"PartitionKeys": []</code>
     */

    public java.util.List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you must at
     * least set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you
     *        must at least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
     */

    public void setPartitionKeys(java.util.Collection<Column> partitionKeys) {
        if (partitionKeys == null) {
            this.partitionKeys = null;
            return;
        }

        this.partitionKeys = new java.util.ArrayList<Column>(partitionKeys);
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you must at
     * least set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionKeys(java.util.Collection)} or {@link #withPartitionKeys(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you
     *        must at least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withPartitionKeys(Column... partitionKeys) {
        if (this.partitionKeys == null) {
            setPartitionKeys(new java.util.ArrayList<Column>(partitionKeys.length));
        }
        for (Column ele : partitionKeys) {
            this.partitionKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of columns by which the table is partitioned. Only primitive types are supported as partition keys.
     * </p>
     * <p>
     * When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you must at
     * least set the value of <code>partitionKeys</code> to an empty list. For example:
     * </p>
     * <p>
     * <code>"PartitionKeys": []</code>
     * </p>
     * 
     * @param partitionKeys
     *        A list of columns by which the table is partitioned. Only primitive types are supported as partition
     *        keys.</p>
     *        <p>
     *        When you create a table used by Amazon Athena, and you do not specify any <code>partitionKeys</code>, you
     *        must at least set the value of <code>partitionKeys</code> to an empty list. For example:
     *        </p>
     *        <p>
     *        <code>"PartitionKeys": []</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withPartitionKeys(java.util.Collection<Column> partitionKeys) {
        setPartitionKeys(partitionKeys);
        return this;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is a
     * <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     * </p>
     * 
     * @param viewOriginalText
     *        Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is
     *        a <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     */

    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is a
     * <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     * </p>
     * 
     * @return Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is
     *         a <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     */

    public String getViewOriginalText() {
        return this.viewOriginalText;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is a
     * <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     * </p>
     * 
     * @param viewOriginalText
     *        Included for Apache Hive compatibility. Not used in the normal course of Glue operations. If the table is
     *        a <code>VIRTUAL_VIEW</code>, certain Athena configuration encoded in base64.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withViewOriginalText(String viewOriginalText) {
        setViewOriginalText(viewOriginalText);
        return this;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     * </p>
     * 
     * @param viewExpandedText
     *        Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     */

    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     * </p>
     * 
     * @return Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     */

    public String getViewExpandedText() {
        return this.viewExpandedText;
    }

    /**
     * <p>
     * Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     * </p>
     * 
     * @param viewExpandedText
     *        Included for Apache Hive compatibility. Not used in the normal course of Glue operations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withViewExpandedText(String viewExpandedText) {
        setViewExpandedText(viewExpandedText);
        return this;
    }

    /**
     * <p>
     * The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services, such
     * as Athena, may create tables with additional table types.
     * </p>
     * <p>
     * Glue related table types:
     * </p>
     * <dl>
     * <dt>EXTERNAL_TABLE</dt>
     * <dd>
     * <p>
     * Hive compatible attribute - indicates a non-Hive managed table.
     * </p>
     * </dd>
     * <dt>GOVERNED</dt>
     * <dd>
     * <p>
     * Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param tableType
     *        The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services,
     *        such as Athena, may create tables with additional table types. </p>
     *        <p>
     *        Glue related table types:
     *        </p>
     *        <dl>
     *        <dt>EXTERNAL_TABLE</dt>
     *        <dd>
     *        <p>
     *        Hive compatible attribute - indicates a non-Hive managed table.
     *        </p>
     *        </dd>
     *        <dt>GOVERNED</dt>
     *        <dd>
     *        <p>
     *        Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     *        </p>
     *        </dd>
     */

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * <p>
     * The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services, such
     * as Athena, may create tables with additional table types.
     * </p>
     * <p>
     * Glue related table types:
     * </p>
     * <dl>
     * <dt>EXTERNAL_TABLE</dt>
     * <dd>
     * <p>
     * Hive compatible attribute - indicates a non-Hive managed table.
     * </p>
     * </dd>
     * <dt>GOVERNED</dt>
     * <dd>
     * <p>
     * Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other
     *         services, such as Athena, may create tables with additional table types. </p>
     *         <p>
     *         Glue related table types:
     *         </p>
     *         <dl>
     *         <dt>EXTERNAL_TABLE</dt>
     *         <dd>
     *         <p>
     *         Hive compatible attribute - indicates a non-Hive managed table.
     *         </p>
     *         </dd>
     *         <dt>GOVERNED</dt>
     *         <dd>
     *         <p>
     *         Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     *         </p>
     *         </dd>
     */

    public String getTableType() {
        return this.tableType;
    }

    /**
     * <p>
     * The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services, such
     * as Athena, may create tables with additional table types.
     * </p>
     * <p>
     * Glue related table types:
     * </p>
     * <dl>
     * <dt>EXTERNAL_TABLE</dt>
     * <dd>
     * <p>
     * Hive compatible attribute - indicates a non-Hive managed table.
     * </p>
     * </dd>
     * <dt>GOVERNED</dt>
     * <dd>
     * <p>
     * Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param tableType
     *        The type of this table. Glue will create tables with the <code>EXTERNAL_TABLE</code> type. Other services,
     *        such as Athena, may create tables with additional table types. </p>
     *        <p>
     *        Glue related table types:
     *        </p>
     *        <dl>
     *        <dt>EXTERNAL_TABLE</dt>
     *        <dd>
     *        <p>
     *        Hive compatible attribute - indicates a non-Hive managed table.
     *        </p>
     *        </dd>
     *        <dt>GOVERNED</dt>
     *        <dd>
     *        <p>
     *        Used by Lake Formation. The Glue Data Catalog understands <code>GOVERNED</code>.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTableType(String tableType) {
        setTableType(tableType);
        return this;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @return These key-value pairs define properties associated with the table.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the table.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * These key-value pairs define properties associated with the table.
     * </p>
     * 
     * @param parameters
     *        These key-value pairs define properties associated with the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * Add a single Parameters entry
     *
     * @see Table#withParameters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Table addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table clearParametersEntries() {
        this.parameters = null;
        return this;
    }

    /**
     * <p>
     * The person or entity who created the table.
     * </p>
     * 
     * @param createdBy
     *        The person or entity who created the table.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The person or entity who created the table.
     * </p>
     * 
     * @return The person or entity who created the table.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The person or entity who created the table.
     * </p>
     * 
     * @param createdBy
     *        The person or entity who created the table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Indicates whether the table has been registered with Lake Formation.
     * </p>
     * 
     * @param isRegisteredWithLakeFormation
     *        Indicates whether the table has been registered with Lake Formation.
     */

    public void setIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        this.isRegisteredWithLakeFormation = isRegisteredWithLakeFormation;
    }

    /**
     * <p>
     * Indicates whether the table has been registered with Lake Formation.
     * </p>
     * 
     * @return Indicates whether the table has been registered with Lake Formation.
     */

    public Boolean getIsRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
    }

    /**
     * <p>
     * Indicates whether the table has been registered with Lake Formation.
     * </p>
     * 
     * @param isRegisteredWithLakeFormation
     *        Indicates whether the table has been registered with Lake Formation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withIsRegisteredWithLakeFormation(Boolean isRegisteredWithLakeFormation) {
        setIsRegisteredWithLakeFormation(isRegisteredWithLakeFormation);
        return this;
    }

    /**
     * <p>
     * Indicates whether the table has been registered with Lake Formation.
     * </p>
     * 
     * @return Indicates whether the table has been registered with Lake Formation.
     */

    public Boolean isRegisteredWithLakeFormation() {
        return this.isRegisteredWithLakeFormation;
    }

    /**
     * <p>
     * A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     * </p>
     * 
     * @param targetTable
     *        A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     */

    public void setTargetTable(TableIdentifier targetTable) {
        this.targetTable = targetTable;
    }

    /**
     * <p>
     * A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     * </p>
     * 
     * @return A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     */

    public TableIdentifier getTargetTable() {
        return this.targetTable;
    }

    /**
     * <p>
     * A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     * </p>
     * 
     * @param targetTable
     *        A <code>TableIdentifier</code> structure that describes a target table for resource linking.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withTargetTable(TableIdentifier targetTable) {
        setTargetTable(targetTable);
        return this;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the table resides.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @return The ID of the Data Catalog in which the table resides.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog in which the table resides.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog in which the table resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The ID of the table version.
     * </p>
     * 
     * @param versionId
     *        The ID of the table version.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * The ID of the table version.
     * </p>
     * 
     * @return The ID of the table version.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * The ID of the table version.
     * </p>
     * 
     * @param versionId
     *        The ID of the table version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     * </p>
     * 
     * @param federatedTable
     *        A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     */

    public void setFederatedTable(FederatedTable federatedTable) {
        this.federatedTable = federatedTable;
    }

    /**
     * <p>
     * A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     * </p>
     * 
     * @return A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     */

    public FederatedTable getFederatedTable() {
        return this.federatedTable;
    }

    /**
     * <p>
     * A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     * </p>
     * 
     * @param federatedTable
     *        A <code>FederatedTable</code> structure that references an entity outside the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withFederatedTable(FederatedTable federatedTable) {
        setFederatedTable(federatedTable);
        return this;
    }

    /**
     * <p>
     * A structure that contains all the information that defines the view, including the dialect or dialects for the
     * view, and the query.
     * </p>
     * 
     * @param viewDefinition
     *        A structure that contains all the information that defines the view, including the dialect or dialects for
     *        the view, and the query.
     */

    public void setViewDefinition(ViewDefinition viewDefinition) {
        this.viewDefinition = viewDefinition;
    }

    /**
     * <p>
     * A structure that contains all the information that defines the view, including the dialect or dialects for the
     * view, and the query.
     * </p>
     * 
     * @return A structure that contains all the information that defines the view, including the dialect or dialects
     *         for the view, and the query.
     */

    public ViewDefinition getViewDefinition() {
        return this.viewDefinition;
    }

    /**
     * <p>
     * A structure that contains all the information that defines the view, including the dialect or dialects for the
     * view, and the query.
     * </p>
     * 
     * @param viewDefinition
     *        A structure that contains all the information that defines the view, including the dialect or dialects for
     *        the view, and the query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withViewDefinition(ViewDefinition viewDefinition) {
        setViewDefinition(viewDefinition);
        return this;
    }

    /**
     * <p>
     * Specifies whether the view supports the SQL dialects of one or more different query engines and can therefore be
     * read by those engines.
     * </p>
     * 
     * @param isMultiDialectView
     *        Specifies whether the view supports the SQL dialects of one or more different query engines and can
     *        therefore be read by those engines.
     */

    public void setIsMultiDialectView(Boolean isMultiDialectView) {
        this.isMultiDialectView = isMultiDialectView;
    }

    /**
     * <p>
     * Specifies whether the view supports the SQL dialects of one or more different query engines and can therefore be
     * read by those engines.
     * </p>
     * 
     * @return Specifies whether the view supports the SQL dialects of one or more different query engines and can
     *         therefore be read by those engines.
     */

    public Boolean getIsMultiDialectView() {
        return this.isMultiDialectView;
    }

    /**
     * <p>
     * Specifies whether the view supports the SQL dialects of one or more different query engines and can therefore be
     * read by those engines.
     * </p>
     * 
     * @param isMultiDialectView
     *        Specifies whether the view supports the SQL dialects of one or more different query engines and can
     *        therefore be read by those engines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Table withIsMultiDialectView(Boolean isMultiDialectView) {
        setIsMultiDialectView(isMultiDialectView);
        return this;
    }

    /**
     * <p>
     * Specifies whether the view supports the SQL dialects of one or more different query engines and can therefore be
     * read by those engines.
     * </p>
     * 
     * @return Specifies whether the view supports the SQL dialects of one or more different query engines and can
     *         therefore be read by those engines.
     */

    public Boolean isMultiDialectView() {
        return this.isMultiDialectView;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getLastAccessTime() != null)
            sb.append("LastAccessTime: ").append(getLastAccessTime()).append(",");
        if (getLastAnalyzedTime() != null)
            sb.append("LastAnalyzedTime: ").append(getLastAnalyzedTime()).append(",");
        if (getRetention() != null)
            sb.append("Retention: ").append(getRetention()).append(",");
        if (getStorageDescriptor() != null)
            sb.append("StorageDescriptor: ").append(getStorageDescriptor()).append(",");
        if (getPartitionKeys() != null)
            sb.append("PartitionKeys: ").append(getPartitionKeys()).append(",");
        if (getViewOriginalText() != null)
            sb.append("ViewOriginalText: ").append(getViewOriginalText()).append(",");
        if (getViewExpandedText() != null)
            sb.append("ViewExpandedText: ").append(getViewExpandedText()).append(",");
        if (getTableType() != null)
            sb.append("TableType: ").append(getTableType()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getIsRegisteredWithLakeFormation() != null)
            sb.append("IsRegisteredWithLakeFormation: ").append(getIsRegisteredWithLakeFormation()).append(",");
        if (getTargetTable() != null)
            sb.append("TargetTable: ").append(getTargetTable()).append(",");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getVersionId() != null)
            sb.append("VersionId: ").append(getVersionId()).append(",");
        if (getFederatedTable() != null)
            sb.append("FederatedTable: ").append(getFederatedTable()).append(",");
        if (getViewDefinition() != null)
            sb.append("ViewDefinition: ").append(getViewDefinition()).append(",");
        if (getIsMultiDialectView() != null)
            sb.append("IsMultiDialectView: ").append(getIsMultiDialectView());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Table == false)
            return false;
        Table other = (Table) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getLastAccessTime() == null ^ this.getLastAccessTime() == null)
            return false;
        if (other.getLastAccessTime() != null && other.getLastAccessTime().equals(this.getLastAccessTime()) == false)
            return false;
        if (other.getLastAnalyzedTime() == null ^ this.getLastAnalyzedTime() == null)
            return false;
        if (other.getLastAnalyzedTime() != null && other.getLastAnalyzedTime().equals(this.getLastAnalyzedTime()) == false)
            return false;
        if (other.getRetention() == null ^ this.getRetention() == null)
            return false;
        if (other.getRetention() != null && other.getRetention().equals(this.getRetention()) == false)
            return false;
        if (other.getStorageDescriptor() == null ^ this.getStorageDescriptor() == null)
            return false;
        if (other.getStorageDescriptor() != null && other.getStorageDescriptor().equals(this.getStorageDescriptor()) == false)
            return false;
        if (other.getPartitionKeys() == null ^ this.getPartitionKeys() == null)
            return false;
        if (other.getPartitionKeys() != null && other.getPartitionKeys().equals(this.getPartitionKeys()) == false)
            return false;
        if (other.getViewOriginalText() == null ^ this.getViewOriginalText() == null)
            return false;
        if (other.getViewOriginalText() != null && other.getViewOriginalText().equals(this.getViewOriginalText()) == false)
            return false;
        if (other.getViewExpandedText() == null ^ this.getViewExpandedText() == null)
            return false;
        if (other.getViewExpandedText() != null && other.getViewExpandedText().equals(this.getViewExpandedText()) == false)
            return false;
        if (other.getTableType() == null ^ this.getTableType() == null)
            return false;
        if (other.getTableType() != null && other.getTableType().equals(this.getTableType()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getIsRegisteredWithLakeFormation() == null ^ this.getIsRegisteredWithLakeFormation() == null)
            return false;
        if (other.getIsRegisteredWithLakeFormation() != null
                && other.getIsRegisteredWithLakeFormation().equals(this.getIsRegisteredWithLakeFormation()) == false)
            return false;
        if (other.getTargetTable() == null ^ this.getTargetTable() == null)
            return false;
        if (other.getTargetTable() != null && other.getTargetTable().equals(this.getTargetTable()) == false)
            return false;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getFederatedTable() == null ^ this.getFederatedTable() == null)
            return false;
        if (other.getFederatedTable() != null && other.getFederatedTable().equals(this.getFederatedTable()) == false)
            return false;
        if (other.getViewDefinition() == null ^ this.getViewDefinition() == null)
            return false;
        if (other.getViewDefinition() != null && other.getViewDefinition().equals(this.getViewDefinition()) == false)
            return false;
        if (other.getIsMultiDialectView() == null ^ this.getIsMultiDialectView() == null)
            return false;
        if (other.getIsMultiDialectView() != null && other.getIsMultiDialectView().equals(this.getIsMultiDialectView()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getLastAccessTime() == null) ? 0 : getLastAccessTime().hashCode());
        hashCode = prime * hashCode + ((getLastAnalyzedTime() == null) ? 0 : getLastAnalyzedTime().hashCode());
        hashCode = prime * hashCode + ((getRetention() == null) ? 0 : getRetention().hashCode());
        hashCode = prime * hashCode + ((getStorageDescriptor() == null) ? 0 : getStorageDescriptor().hashCode());
        hashCode = prime * hashCode + ((getPartitionKeys() == null) ? 0 : getPartitionKeys().hashCode());
        hashCode = prime * hashCode + ((getViewOriginalText() == null) ? 0 : getViewOriginalText().hashCode());
        hashCode = prime * hashCode + ((getViewExpandedText() == null) ? 0 : getViewExpandedText().hashCode());
        hashCode = prime * hashCode + ((getTableType() == null) ? 0 : getTableType().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getIsRegisteredWithLakeFormation() == null) ? 0 : getIsRegisteredWithLakeFormation().hashCode());
        hashCode = prime * hashCode + ((getTargetTable() == null) ? 0 : getTargetTable().hashCode());
        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getFederatedTable() == null) ? 0 : getFederatedTable().hashCode());
        hashCode = prime * hashCode + ((getViewDefinition() == null) ? 0 : getViewDefinition().hashCode());
        hashCode = prime * hashCode + ((getIsMultiDialectView() == null) ? 0 : getIsMultiDialectView().hashCode());
        return hashCode;
    }

    @Override
    public Table clone() {
        try {
            return (Table) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TableMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
