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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUnfilteredPartitionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredPartitionMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specified only if the base tables belong to a different Amazon Web Services Region.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The catalog ID where the partition resides.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * (Required) Specifies the name of a database that contains the partition.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * (Required) Specifies the name of a table that contains the partition.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * (Required) A list of partition key values.
     * </p>
     */
    private java.util.List<String> partitionValues;
    /**
     * <p>
     * A structure containing Lake Formation audit context information.
     * </p>
     */
    private AuditContext auditContext;
    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     */
    private java.util.List<String> supportedPermissionTypes;
    /**
     * <p>
     * A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake Formation
     * generated authorization identifier and information from the request's authorization context.
     * </p>
     */
    private QuerySessionContext querySessionContext;

    /**
     * <p>
     * Specified only if the base tables belong to a different Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        Specified only if the base tables belong to a different Amazon Web Services Region.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * Specified only if the base tables belong to a different Amazon Web Services Region.
     * </p>
     * 
     * @return Specified only if the base tables belong to a different Amazon Web Services Region.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * Specified only if the base tables belong to a different Amazon Web Services Region.
     * </p>
     * 
     * @param region
     *        Specified only if the base tables belong to a different Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The catalog ID where the partition resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the partition resides.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The catalog ID where the partition resides.
     * </p>
     * 
     * @return The catalog ID where the partition resides.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The catalog ID where the partition resides.
     * </p>
     * 
     * @param catalogId
     *        The catalog ID where the partition resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * (Required) Specifies the name of a database that contains the partition.
     * </p>
     * 
     * @param databaseName
     *        (Required) Specifies the name of a database that contains the partition.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * (Required) Specifies the name of a database that contains the partition.
     * </p>
     * 
     * @return (Required) Specifies the name of a database that contains the partition.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * (Required) Specifies the name of a database that contains the partition.
     * </p>
     * 
     * @param databaseName
     *        (Required) Specifies the name of a database that contains the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * (Required) Specifies the name of a table that contains the partition.
     * </p>
     * 
     * @param tableName
     *        (Required) Specifies the name of a table that contains the partition.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * (Required) Specifies the name of a table that contains the partition.
     * </p>
     * 
     * @return (Required) Specifies the name of a table that contains the partition.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * (Required) Specifies the name of a table that contains the partition.
     * </p>
     * 
     * @param tableName
     *        (Required) Specifies the name of a table that contains the partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * (Required) A list of partition key values.
     * </p>
     * 
     * @return (Required) A list of partition key values.
     */

    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * <p>
     * (Required) A list of partition key values.
     * </p>
     * 
     * @param partitionValues
     *        (Required) A list of partition key values.
     */

    public void setPartitionValues(java.util.Collection<String> partitionValues) {
        if (partitionValues == null) {
            this.partitionValues = null;
            return;
        }

        this.partitionValues = new java.util.ArrayList<String>(partitionValues);
    }

    /**
     * <p>
     * (Required) A list of partition key values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValues(java.util.Collection)} or {@link #withPartitionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionValues
     *        (Required) A list of partition key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withPartitionValues(String... partitionValues) {
        if (this.partitionValues == null) {
            setPartitionValues(new java.util.ArrayList<String>(partitionValues.length));
        }
        for (String ele : partitionValues) {
            this.partitionValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Required) A list of partition key values.
     * </p>
     * 
     * @param partitionValues
     *        (Required) A list of partition key values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withPartitionValues(java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * <p>
     * A structure containing Lake Formation audit context information.
     * </p>
     * 
     * @param auditContext
     *        A structure containing Lake Formation audit context information.
     */

    public void setAuditContext(AuditContext auditContext) {
        this.auditContext = auditContext;
    }

    /**
     * <p>
     * A structure containing Lake Formation audit context information.
     * </p>
     * 
     * @return A structure containing Lake Formation audit context information.
     */

    public AuditContext getAuditContext() {
        return this.auditContext;
    }

    /**
     * <p>
     * A structure containing Lake Formation audit context information.
     * </p>
     * 
     * @param auditContext
     *        A structure containing Lake Formation audit context information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withAuditContext(AuditContext auditContext) {
        setAuditContext(auditContext);
        return this;
    }

    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     * 
     * @return (Required) A list of supported permission types.
     * @see PermissionType
     */

    public java.util.List<String> getSupportedPermissionTypes() {
        return supportedPermissionTypes;
    }

    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        (Required) A list of supported permission types.
     * @see PermissionType
     */

    public void setSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        if (supportedPermissionTypes == null) {
            this.supportedPermissionTypes = null;
            return;
        }

        this.supportedPermissionTypes = new java.util.ArrayList<String>(supportedPermissionTypes);
    }

    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPermissionTypes(java.util.Collection)} or
     * {@link #withSupportedPermissionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        (Required) A list of supported permission types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionMetadataRequest withSupportedPermissionTypes(String... supportedPermissionTypes) {
        if (this.supportedPermissionTypes == null) {
            setSupportedPermissionTypes(new java.util.ArrayList<String>(supportedPermissionTypes.length));
        }
        for (String ele : supportedPermissionTypes) {
            this.supportedPermissionTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        (Required) A list of supported permission types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionMetadataRequest withSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        setSupportedPermissionTypes(supportedPermissionTypes);
        return this;
    }

    /**
     * <p>
     * (Required) A list of supported permission types.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        (Required) A list of supported permission types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionMetadataRequest withSupportedPermissionTypes(PermissionType... supportedPermissionTypes) {
        java.util.ArrayList<String> supportedPermissionTypesCopy = new java.util.ArrayList<String>(supportedPermissionTypes.length);
        for (PermissionType value : supportedPermissionTypes) {
            supportedPermissionTypesCopy.add(value.toString());
        }
        if (getSupportedPermissionTypes() == null) {
            setSupportedPermissionTypes(supportedPermissionTypesCopy);
        } else {
            getSupportedPermissionTypes().addAll(supportedPermissionTypesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake Formation
     * generated authorization identifier and information from the request's authorization context.
     * </p>
     * 
     * @param querySessionContext
     *        A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake
     *        Formation generated authorization identifier and information from the request's authorization context.
     */

    public void setQuerySessionContext(QuerySessionContext querySessionContext) {
        this.querySessionContext = querySessionContext;
    }

    /**
     * <p>
     * A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake Formation
     * generated authorization identifier and information from the request's authorization context.
     * </p>
     * 
     * @return A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake
     *         Formation generated authorization identifier and information from the request's authorization context.
     */

    public QuerySessionContext getQuerySessionContext() {
        return this.querySessionContext;
    }

    /**
     * <p>
     * A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake Formation
     * generated authorization identifier and information from the request's authorization context.
     * </p>
     * 
     * @param querySessionContext
     *        A structure used as a protocol between query engines and Lake Formation or Glue. Contains both a Lake
     *        Formation generated authorization identifier and information from the request's authorization context.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withQuerySessionContext(QuerySessionContext querySessionContext) {
        setQuerySessionContext(querySessionContext);
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
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getPartitionValues() != null)
            sb.append("PartitionValues: ").append(getPartitionValues()).append(",");
        if (getAuditContext() != null)
            sb.append("AuditContext: ").append(getAuditContext()).append(",");
        if (getSupportedPermissionTypes() != null)
            sb.append("SupportedPermissionTypes: ").append(getSupportedPermissionTypes()).append(",");
        if (getQuerySessionContext() != null)
            sb.append("QuerySessionContext: ").append(getQuerySessionContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetUnfilteredPartitionMetadataRequest == false)
            return false;
        GetUnfilteredPartitionMetadataRequest other = (GetUnfilteredPartitionMetadataRequest) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getPartitionValues() == null ^ this.getPartitionValues() == null)
            return false;
        if (other.getPartitionValues() != null && other.getPartitionValues().equals(this.getPartitionValues()) == false)
            return false;
        if (other.getAuditContext() == null ^ this.getAuditContext() == null)
            return false;
        if (other.getAuditContext() != null && other.getAuditContext().equals(this.getAuditContext()) == false)
            return false;
        if (other.getSupportedPermissionTypes() == null ^ this.getSupportedPermissionTypes() == null)
            return false;
        if (other.getSupportedPermissionTypes() != null && other.getSupportedPermissionTypes().equals(this.getSupportedPermissionTypes()) == false)
            return false;
        if (other.getQuerySessionContext() == null ^ this.getQuerySessionContext() == null)
            return false;
        if (other.getQuerySessionContext() != null && other.getQuerySessionContext().equals(this.getQuerySessionContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode + ((getAuditContext() == null) ? 0 : getAuditContext().hashCode());
        hashCode = prime * hashCode + ((getSupportedPermissionTypes() == null) ? 0 : getSupportedPermissionTypes().hashCode());
        hashCode = prime * hashCode + ((getQuerySessionContext() == null) ? 0 : getQuerySessionContext().hashCode());
        return hashCode;
    }

    @Override
    public GetUnfilteredPartitionMetadataRequest clone() {
        return (GetUnfilteredPartitionMetadataRequest) super.clone();
    }

}
