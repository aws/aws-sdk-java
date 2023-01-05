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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/GetTemporaryGluePartitionCredentials"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTemporaryGluePartitionCredentialsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the partitions' table.
     * </p>
     */
    private String tableArn;
    /**
     * <p>
     * A list of partition values identifying a single partition.
     * </p>
     */
    private PartitionValueList partition;
    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     */
    private java.util.List<String> permissions;
    /**
     * <p>
     * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * A structure representing context to access a resource (column names, query ID, etc).
     * </p>
     */
    private AuditContext auditContext;
    /**
     * <p>
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     */
    private java.util.List<String> supportedPermissionTypes;

    /**
     * <p>
     * The ARN of the partitions' table.
     * </p>
     * 
     * @param tableArn
     *        The ARN of the partitions' table.
     */

    public void setTableArn(String tableArn) {
        this.tableArn = tableArn;
    }

    /**
     * <p>
     * The ARN of the partitions' table.
     * </p>
     * 
     * @return The ARN of the partitions' table.
     */

    public String getTableArn() {
        return this.tableArn;
    }

    /**
     * <p>
     * The ARN of the partitions' table.
     * </p>
     * 
     * @param tableArn
     *        The ARN of the partitions' table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGluePartitionCredentialsRequest withTableArn(String tableArn) {
        setTableArn(tableArn);
        return this;
    }

    /**
     * <p>
     * A list of partition values identifying a single partition.
     * </p>
     * 
     * @param partition
     *        A list of partition values identifying a single partition.
     */

    public void setPartition(PartitionValueList partition) {
        this.partition = partition;
    }

    /**
     * <p>
     * A list of partition values identifying a single partition.
     * </p>
     * 
     * @return A list of partition values identifying a single partition.
     */

    public PartitionValueList getPartition() {
        return this.partition;
    }

    /**
     * <p>
     * A list of partition values identifying a single partition.
     * </p>
     * 
     * @param partition
     *        A list of partition values identifying a single partition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGluePartitionCredentialsRequest withPartition(PartitionValueList partition) {
        setPartition(partition);
        return this;
    }

    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     * 
     * @return Filters the request based on the user having been granted a list of specified permissions on the
     *         requested resource(s).
     * @see Permission
     */

    public java.util.List<String> getPermissions() {
        return permissions;
    }

    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     * 
     * @param permissions
     *        Filters the request based on the user having been granted a list of specified permissions on the requested
     *        resource(s).
     * @see Permission
     */

    public void setPermissions(java.util.Collection<String> permissions) {
        if (permissions == null) {
            this.permissions = null;
            return;
        }

        this.permissions = new java.util.ArrayList<String>(permissions);
    }

    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPermissions(java.util.Collection)} or {@link #withPermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param permissions
     *        Filters the request based on the user having been granted a list of specified permissions on the requested
     *        resource(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GetTemporaryGluePartitionCredentialsRequest withPermissions(String... permissions) {
        if (this.permissions == null) {
            setPermissions(new java.util.ArrayList<String>(permissions.length));
        }
        for (String ele : permissions) {
            this.permissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     * 
     * @param permissions
     *        Filters the request based on the user having been granted a list of specified permissions on the requested
     *        resource(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GetTemporaryGluePartitionCredentialsRequest withPermissions(java.util.Collection<String> permissions) {
        setPermissions(permissions);
        return this;
    }

    /**
     * <p>
     * Filters the request based on the user having been granted a list of specified permissions on the requested
     * resource(s).
     * </p>
     * 
     * @param permissions
     *        Filters the request based on the user having been granted a list of specified permissions on the requested
     *        resource(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Permission
     */

    public GetTemporaryGluePartitionCredentialsRequest withPermissions(Permission... permissions) {
        java.util.ArrayList<String> permissionsCopy = new java.util.ArrayList<String>(permissions.length);
        for (Permission value : permissions) {
            permissionsCopy.add(value.toString());
        }
        if (getPermissions() == null) {
            setPermissions(permissionsCopy);
        } else {
            getPermissions().addAll(permissionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @param durationSeconds
     *        The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @return The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     * </p>
     * 
     * @param durationSeconds
     *        The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGluePartitionCredentialsRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * A structure representing context to access a resource (column names, query ID, etc).
     * </p>
     * 
     * @param auditContext
     *        A structure representing context to access a resource (column names, query ID, etc).
     */

    public void setAuditContext(AuditContext auditContext) {
        this.auditContext = auditContext;
    }

    /**
     * <p>
     * A structure representing context to access a resource (column names, query ID, etc).
     * </p>
     * 
     * @return A structure representing context to access a resource (column names, query ID, etc).
     */

    public AuditContext getAuditContext() {
        return this.auditContext;
    }

    /**
     * <p>
     * A structure representing context to access a resource (column names, query ID, etc).
     * </p>
     * 
     * @param auditContext
     *        A structure representing context to access a resource (column names, query ID, etc).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTemporaryGluePartitionCredentialsRequest withAuditContext(AuditContext auditContext) {
        setAuditContext(auditContext);
        return this;
    }

    /**
     * <p>
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     * 
     * @return A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code>
     *         and <code>CELL_FILTER_PERMISSION</code>.
     * @see PermissionType
     */

    public java.util.List<String> getSupportedPermissionTypes() {
        return supportedPermissionTypes;
    }

    /**
     * <p>
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code>
     *        and <code>CELL_FILTER_PERMISSION</code>.
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
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPermissionTypes(java.util.Collection)} or
     * {@link #withSupportedPermissionTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code>
     *        and <code>CELL_FILTER_PERMISSION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetTemporaryGluePartitionCredentialsRequest withSupportedPermissionTypes(String... supportedPermissionTypes) {
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
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code>
     *        and <code>CELL_FILTER_PERMISSION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetTemporaryGluePartitionCredentialsRequest withSupportedPermissionTypes(java.util.Collection<String> supportedPermissionTypes) {
        setSupportedPermissionTypes(supportedPermissionTypes);
        return this;
    }

    /**
     * <p>
     * A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code> and
     * <code>CELL_FILTER_PERMISSION</code>.
     * </p>
     * 
     * @param supportedPermissionTypes
     *        A list of supported permission types for the partition. Valid values are <code>COLUMN_PERMISSION</code>
     *        and <code>CELL_FILTER_PERMISSION</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PermissionType
     */

    public GetTemporaryGluePartitionCredentialsRequest withSupportedPermissionTypes(PermissionType... supportedPermissionTypes) {
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
        if (getTableArn() != null)
            sb.append("TableArn: ").append(getTableArn()).append(",");
        if (getPartition() != null)
            sb.append("Partition: ").append(getPartition()).append(",");
        if (getPermissions() != null)
            sb.append("Permissions: ").append(getPermissions()).append(",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: ").append(getDurationSeconds()).append(",");
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

        if (obj instanceof GetTemporaryGluePartitionCredentialsRequest == false)
            return false;
        GetTemporaryGluePartitionCredentialsRequest other = (GetTemporaryGluePartitionCredentialsRequest) obj;
        if (other.getTableArn() == null ^ this.getTableArn() == null)
            return false;
        if (other.getTableArn() != null && other.getTableArn().equals(this.getTableArn()) == false)
            return false;
        if (other.getPartition() == null ^ this.getPartition() == null)
            return false;
        if (other.getPartition() != null && other.getPartition().equals(this.getPartition()) == false)
            return false;
        if (other.getPermissions() == null ^ this.getPermissions() == null)
            return false;
        if (other.getPermissions() != null && other.getPermissions().equals(this.getPermissions()) == false)
            return false;
        if (other.getDurationSeconds() == null ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
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

        hashCode = prime * hashCode + ((getTableArn() == null) ? 0 : getTableArn().hashCode());
        hashCode = prime * hashCode + ((getPartition() == null) ? 0 : getPartition().hashCode());
        hashCode = prime * hashCode + ((getPermissions() == null) ? 0 : getPermissions().hashCode());
        hashCode = prime * hashCode + ((getDurationSeconds() == null) ? 0 : getDurationSeconds().hashCode());
        hashCode = prime * hashCode + ((getAuditContext() == null) ? 0 : getAuditContext().hashCode());
        hashCode = prime * hashCode + ((getSupportedPermissionTypes() == null) ? 0 : getSupportedPermissionTypes().hashCode());
        return hashCode;
    }

    @Override
    public GetTemporaryGluePartitionCredentialsRequest clone() {
        return (GetTemporaryGluePartitionCredentialsRequest) super.clone();
    }

}
