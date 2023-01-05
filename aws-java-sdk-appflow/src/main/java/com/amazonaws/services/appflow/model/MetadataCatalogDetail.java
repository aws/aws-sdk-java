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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the metadata catalog, metadata table, and data partitions that Amazon AppFlow used for the associated flow
 * run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/MetadataCatalogDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MetadataCatalogDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the
     * following value:
     * </p>
     * <dl>
     * <dt>GLUE</dt>
     * <dd>
     * <p>
     * The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.
     * </p>
     * </dd>
     * </dl>
     */
    private String catalogType;
    /**
     * <p>
     * The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     * represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata catalog.
     * Amazon AppFlow creates or updates this table for the associated flow run.
     * </p>
     */
    private RegistrationOutput tableRegistrationOutput;
    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     * catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in an S3
     * bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow configuration.
     * </p>
     */
    private RegistrationOutput partitionRegistrationOutput;

    /**
     * <p>
     * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the
     * following value:
     * </p>
     * <dl>
     * <dt>GLUE</dt>
     * <dd>
     * <p>
     * The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param catalogType
     *        The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns
     *        the following value:</p>
     *        <dl>
     *        <dt>GLUE</dt>
     *        <dd>
     *        <p>
     *        The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a
     *        component.
     *        </p>
     *        </dd>
     * @see CatalogType
     */

    public void setCatalogType(String catalogType) {
        this.catalogType = catalogType;
    }

    /**
     * <p>
     * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the
     * following value:
     * </p>
     * <dl>
     * <dt>GLUE</dt>
     * <dd>
     * <p>
     * The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns
     *         the following value:</p>
     *         <dl>
     *         <dt>GLUE</dt>
     *         <dd>
     *         <p>
     *         The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a
     *         component.
     *         </p>
     *         </dd>
     * @see CatalogType
     */

    public String getCatalogType() {
        return this.catalogType;
    }

    /**
     * <p>
     * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the
     * following value:
     * </p>
     * <dl>
     * <dt>GLUE</dt>
     * <dd>
     * <p>
     * The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param catalogType
     *        The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns
     *        the following value:</p>
     *        <dl>
     *        <dt>GLUE</dt>
     *        <dd>
     *        <p>
     *        The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a
     *        component.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogType
     */

    public MetadataCatalogDetail withCatalogType(String catalogType) {
        setCatalogType(catalogType);
        return this;
    }

    /**
     * <p>
     * The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns the
     * following value:
     * </p>
     * <dl>
     * <dt>GLUE</dt>
     * <dd>
     * <p>
     * The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a component.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param catalogType
     *        The type of metadata catalog that Amazon AppFlow used for the associated flow run. This parameter returns
     *        the following value:</p>
     *        <dl>
     *        <dt>GLUE</dt>
     *        <dd>
     *        <p>
     *        The metadata catalog is provided by the Glue Data Catalog. Glue includes the Glue Data Catalog as a
     *        component.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CatalogType
     */

    public MetadataCatalogDetail withCatalogType(CatalogType catalogType) {
        this.catalogType = catalogType.toString();
        return this;
    }

    /**
     * <p>
     * The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     * represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     * </p>
     * 
     * @param tableName
     *        The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     *        represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     * represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     * </p>
     * 
     * @return The name of the table that stores the metadata for the associated flow run. The table stores metadata
     *         that represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata
     *         catalog.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     * represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     * </p>
     * 
     * @param tableName
     *        The name of the table that stores the metadata for the associated flow run. The table stores metadata that
     *        represents the data that the flow transferred. Amazon AppFlow stores the table in the metadata catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataCatalogDetail withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata catalog.
     * Amazon AppFlow creates or updates this table for the associated flow run.
     * </p>
     * 
     * @param tableRegistrationOutput
     *        Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata
     *        catalog. Amazon AppFlow creates or updates this table for the associated flow run.
     */

    public void setTableRegistrationOutput(RegistrationOutput tableRegistrationOutput) {
        this.tableRegistrationOutput = tableRegistrationOutput;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata catalog.
     * Amazon AppFlow creates or updates this table for the associated flow run.
     * </p>
     * 
     * @return Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata
     *         catalog. Amazon AppFlow creates or updates this table for the associated flow run.
     */

    public RegistrationOutput getTableRegistrationOutput() {
        return this.tableRegistrationOutput;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata catalog.
     * Amazon AppFlow creates or updates this table for the associated flow run.
     * </p>
     * 
     * @param tableRegistrationOutput
     *        Describes the status of the attempt from Amazon AppFlow to register the metadata table with the metadata
     *        catalog. Amazon AppFlow creates or updates this table for the associated flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataCatalogDetail withTableRegistrationOutput(RegistrationOutput tableRegistrationOutput) {
        setTableRegistrationOutput(tableRegistrationOutput);
        return this;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     * catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in an S3
     * bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow configuration.
     * </p>
     * 
     * @param partitionRegistrationOutput
     *        Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     *        catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in
     *        an S3 bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow
     *        configuration.
     */

    public void setPartitionRegistrationOutput(RegistrationOutput partitionRegistrationOutput) {
        this.partitionRegistrationOutput = partitionRegistrationOutput;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     * catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in an S3
     * bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow configuration.
     * </p>
     * 
     * @return Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     *         catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in
     *         an S3 bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow
     *         configuration.
     */

    public RegistrationOutput getPartitionRegistrationOutput() {
        return this.partitionRegistrationOutput;
    }

    /**
     * <p>
     * Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     * catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in an S3
     * bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow configuration.
     * </p>
     * 
     * @param partitionRegistrationOutput
     *        Describes the status of the attempt from Amazon AppFlow to register the data partitions with the metadata
     *        catalog. The data partitions organize the flow output into a hierarchical path, such as a folder path in
     *        an S3 bucket. Amazon AppFlow creates the partitions (if they don't already exist) based on your flow
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MetadataCatalogDetail withPartitionRegistrationOutput(RegistrationOutput partitionRegistrationOutput) {
        setPartitionRegistrationOutput(partitionRegistrationOutput);
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
        if (getCatalogType() != null)
            sb.append("CatalogType: ").append(getCatalogType()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getTableRegistrationOutput() != null)
            sb.append("TableRegistrationOutput: ").append(getTableRegistrationOutput()).append(",");
        if (getPartitionRegistrationOutput() != null)
            sb.append("PartitionRegistrationOutput: ").append(getPartitionRegistrationOutput());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetadataCatalogDetail == false)
            return false;
        MetadataCatalogDetail other = (MetadataCatalogDetail) obj;
        if (other.getCatalogType() == null ^ this.getCatalogType() == null)
            return false;
        if (other.getCatalogType() != null && other.getCatalogType().equals(this.getCatalogType()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getTableRegistrationOutput() == null ^ this.getTableRegistrationOutput() == null)
            return false;
        if (other.getTableRegistrationOutput() != null && other.getTableRegistrationOutput().equals(this.getTableRegistrationOutput()) == false)
            return false;
        if (other.getPartitionRegistrationOutput() == null ^ this.getPartitionRegistrationOutput() == null)
            return false;
        if (other.getPartitionRegistrationOutput() != null && other.getPartitionRegistrationOutput().equals(this.getPartitionRegistrationOutput()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogType() == null) ? 0 : getCatalogType().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getTableRegistrationOutput() == null) ? 0 : getTableRegistrationOutput().hashCode());
        hashCode = prime * hashCode + ((getPartitionRegistrationOutput() == null) ? 0 : getPartitionRegistrationOutput().hashCode());
        return hashCode;
    }

    @Override
    public MetadataCatalogDetail clone() {
        try {
            return (MetadataCatalogDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.MetadataCatalogDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
