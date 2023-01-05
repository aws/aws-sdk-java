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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Apache Kafka data store in the Data Catalog.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CatalogKafkaSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CatalogKafkaSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The amount of time to spend processing each micro batch.
     * </p>
     */
    private Integer windowSize;
    /**
     * <p>
     * Whether to automatically determine the schema from the incoming data.
     * </p>
     */
    private Boolean detectSchema;
    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     */
    private String table;
    /**
     * <p>
     * The name of the database to read from.
     * </p>
     */
    private String database;
    /**
     * <p>
     * Specifies the streaming options.
     * </p>
     */
    private KafkaStreamingSourceOptions streamingOptions;
    /**
     * <p>
     * Specifies options related to data preview for viewing a sample of your data.
     * </p>
     */
    private StreamingDataPreviewOptions dataPreviewOptions;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The amount of time to spend processing each micro batch.
     * </p>
     * 
     * @param windowSize
     *        The amount of time to spend processing each micro batch.
     */

    public void setWindowSize(Integer windowSize) {
        this.windowSize = windowSize;
    }

    /**
     * <p>
     * The amount of time to spend processing each micro batch.
     * </p>
     * 
     * @return The amount of time to spend processing each micro batch.
     */

    public Integer getWindowSize() {
        return this.windowSize;
    }

    /**
     * <p>
     * The amount of time to spend processing each micro batch.
     * </p>
     * 
     * @param windowSize
     *        The amount of time to spend processing each micro batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withWindowSize(Integer windowSize) {
        setWindowSize(windowSize);
        return this;
    }

    /**
     * <p>
     * Whether to automatically determine the schema from the incoming data.
     * </p>
     * 
     * @param detectSchema
     *        Whether to automatically determine the schema from the incoming data.
     */

    public void setDetectSchema(Boolean detectSchema) {
        this.detectSchema = detectSchema;
    }

    /**
     * <p>
     * Whether to automatically determine the schema from the incoming data.
     * </p>
     * 
     * @return Whether to automatically determine the schema from the incoming data.
     */

    public Boolean getDetectSchema() {
        return this.detectSchema;
    }

    /**
     * <p>
     * Whether to automatically determine the schema from the incoming data.
     * </p>
     * 
     * @param detectSchema
     *        Whether to automatically determine the schema from the incoming data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withDetectSchema(Boolean detectSchema) {
        setDetectSchema(detectSchema);
        return this;
    }

    /**
     * <p>
     * Whether to automatically determine the schema from the incoming data.
     * </p>
     * 
     * @return Whether to automatically determine the schema from the incoming data.
     */

    public Boolean isDetectSchema() {
        return this.detectSchema;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     */

    public void setTable(String table) {
        this.table = table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @return The name of the table in the database to read from.
     */

    public String getTable() {
        return this.table;
    }

    /**
     * <p>
     * The name of the table in the database to read from.
     * </p>
     * 
     * @param table
     *        The name of the table in the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withTable(String table) {
        setTable(table);
        return this;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     */

    public void setDatabase(String database) {
        this.database = database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @return The name of the database to read from.
     */

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>
     * The name of the database to read from.
     * </p>
     * 
     * @param database
     *        The name of the database to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withDatabase(String database) {
        setDatabase(database);
        return this;
    }

    /**
     * <p>
     * Specifies the streaming options.
     * </p>
     * 
     * @param streamingOptions
     *        Specifies the streaming options.
     */

    public void setStreamingOptions(KafkaStreamingSourceOptions streamingOptions) {
        this.streamingOptions = streamingOptions;
    }

    /**
     * <p>
     * Specifies the streaming options.
     * </p>
     * 
     * @return Specifies the streaming options.
     */

    public KafkaStreamingSourceOptions getStreamingOptions() {
        return this.streamingOptions;
    }

    /**
     * <p>
     * Specifies the streaming options.
     * </p>
     * 
     * @param streamingOptions
     *        Specifies the streaming options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withStreamingOptions(KafkaStreamingSourceOptions streamingOptions) {
        setStreamingOptions(streamingOptions);
        return this;
    }

    /**
     * <p>
     * Specifies options related to data preview for viewing a sample of your data.
     * </p>
     * 
     * @param dataPreviewOptions
     *        Specifies options related to data preview for viewing a sample of your data.
     */

    public void setDataPreviewOptions(StreamingDataPreviewOptions dataPreviewOptions) {
        this.dataPreviewOptions = dataPreviewOptions;
    }

    /**
     * <p>
     * Specifies options related to data preview for viewing a sample of your data.
     * </p>
     * 
     * @return Specifies options related to data preview for viewing a sample of your data.
     */

    public StreamingDataPreviewOptions getDataPreviewOptions() {
        return this.dataPreviewOptions;
    }

    /**
     * <p>
     * Specifies options related to data preview for viewing a sample of your data.
     * </p>
     * 
     * @param dataPreviewOptions
     *        Specifies options related to data preview for viewing a sample of your data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CatalogKafkaSource withDataPreviewOptions(StreamingDataPreviewOptions dataPreviewOptions) {
        setDataPreviewOptions(dataPreviewOptions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWindowSize() != null)
            sb.append("WindowSize: ").append(getWindowSize()).append(",");
        if (getDetectSchema() != null)
            sb.append("DetectSchema: ").append(getDetectSchema()).append(",");
        if (getTable() != null)
            sb.append("Table: ").append(getTable()).append(",");
        if (getDatabase() != null)
            sb.append("Database: ").append(getDatabase()).append(",");
        if (getStreamingOptions() != null)
            sb.append("StreamingOptions: ").append(getStreamingOptions()).append(",");
        if (getDataPreviewOptions() != null)
            sb.append("DataPreviewOptions: ").append(getDataPreviewOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CatalogKafkaSource == false)
            return false;
        CatalogKafkaSource other = (CatalogKafkaSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWindowSize() == null ^ this.getWindowSize() == null)
            return false;
        if (other.getWindowSize() != null && other.getWindowSize().equals(this.getWindowSize()) == false)
            return false;
        if (other.getDetectSchema() == null ^ this.getDetectSchema() == null)
            return false;
        if (other.getDetectSchema() != null && other.getDetectSchema().equals(this.getDetectSchema()) == false)
            return false;
        if (other.getTable() == null ^ this.getTable() == null)
            return false;
        if (other.getTable() != null && other.getTable().equals(this.getTable()) == false)
            return false;
        if (other.getDatabase() == null ^ this.getDatabase() == null)
            return false;
        if (other.getDatabase() != null && other.getDatabase().equals(this.getDatabase()) == false)
            return false;
        if (other.getStreamingOptions() == null ^ this.getStreamingOptions() == null)
            return false;
        if (other.getStreamingOptions() != null && other.getStreamingOptions().equals(this.getStreamingOptions()) == false)
            return false;
        if (other.getDataPreviewOptions() == null ^ this.getDataPreviewOptions() == null)
            return false;
        if (other.getDataPreviewOptions() != null && other.getDataPreviewOptions().equals(this.getDataPreviewOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWindowSize() == null) ? 0 : getWindowSize().hashCode());
        hashCode = prime * hashCode + ((getDetectSchema() == null) ? 0 : getDetectSchema().hashCode());
        hashCode = prime * hashCode + ((getTable() == null) ? 0 : getTable().hashCode());
        hashCode = prime * hashCode + ((getDatabase() == null) ? 0 : getDatabase().hashCode());
        hashCode = prime * hashCode + ((getStreamingOptions() == null) ? 0 : getStreamingOptions().hashCode());
        hashCode = prime * hashCode + ((getDataPreviewOptions() == null) ? 0 : getDataPreviewOptions().hashCode());
        return hashCode;
    }

    @Override
    public CatalogKafkaSource clone() {
        try {
            return (CatalogKafkaSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CatalogKafkaSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
