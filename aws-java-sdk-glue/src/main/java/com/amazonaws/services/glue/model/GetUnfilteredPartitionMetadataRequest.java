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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/GetUnfilteredPartitionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetUnfilteredPartitionMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String catalogId;

    private String databaseName;

    private String tableName;

    private java.util.List<String> partitionValues;

    private AuditContext auditContext;

    private java.util.List<String> supportedPermissionTypes;

    /**
     * @param catalogId
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * @return
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @param catalogId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * @param databaseName
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * @return
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @param databaseName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * @param tableName
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * @param tableName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getPartitionValues() {
        return partitionValues;
    }

    /**
     * @param partitionValues
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartitionValues(java.util.Collection)} or {@link #withPartitionValues(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param partitionValues
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
     * @param partitionValues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withPartitionValues(java.util.Collection<String> partitionValues) {
        setPartitionValues(partitionValues);
        return this;
    }

    /**
     * @param auditContext
     */

    public void setAuditContext(AuditContext auditContext) {
        this.auditContext = auditContext;
    }

    /**
     * @return
     */

    public AuditContext getAuditContext() {
        return this.auditContext;
    }

    /**
     * @param auditContext
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetUnfilteredPartitionMetadataRequest withAuditContext(AuditContext auditContext) {
        setAuditContext(auditContext);
        return this;
    }

    /**
     * @return
     * @see PermissionType
     */

    public java.util.List<String> getSupportedPermissionTypes() {
        return supportedPermissionTypes;
    }

    /**
     * @param supportedPermissionTypes
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPermissionTypes(java.util.Collection)} or
     * {@link #withSupportedPermissionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPermissionTypes
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
     * @param supportedPermissionTypes
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetUnfilteredPartitionMetadataRequest withSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        setSupportedPermissionTypes(supportedPermissionTypes);
        return this;
    }

    /**
     * @param supportedPermissionTypes
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
            sb.append("SupportedPermissionTypes: ").append(getSupportedPermissionTypes());
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getPartitionValues() == null) ? 0 : getPartitionValues().hashCode());
        hashCode = prime * hashCode + ((getAuditContext() == null) ? 0 : getAuditContext().hashCode());
        hashCode = prime * hashCode + ((getSupportedPermissionTypes() == null) ? 0 : getSupportedPermissionTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetUnfilteredPartitionMetadataRequest clone() {
        return (GetUnfilteredPartitionMetadataRequest) super.clone();
    }

}
