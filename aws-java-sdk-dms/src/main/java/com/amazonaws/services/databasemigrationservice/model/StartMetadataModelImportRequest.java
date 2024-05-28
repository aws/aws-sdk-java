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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelImport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetadataModelImportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     */
    private String migrationProjectIdentifier;
    /**
     * <p>
     * A value that specifies the database objects to import.
     * </p>
     */
    private String selectionRules;
    /**
     * <p>
     * Whether to load metadata to the source or target database.
     * </p>
     */
    private String origin;
    /**
     * <p>
     * If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * </p>
     */
    private Boolean refresh;

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The migration project name or Amazon Resource Name (ARN).
     */

    public void setMigrationProjectIdentifier(String migrationProjectIdentifier) {
        this.migrationProjectIdentifier = migrationProjectIdentifier;
    }

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The migration project name or Amazon Resource Name (ARN).
     */

    public String getMigrationProjectIdentifier() {
        return this.migrationProjectIdentifier;
    }

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The migration project name or Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelImportRequest withMigrationProjectIdentifier(String migrationProjectIdentifier) {
        setMigrationProjectIdentifier(migrationProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies the database objects to import.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to import.
     */

    public void setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to import.
     * </p>
     * 
     * @return A value that specifies the database objects to import.
     */

    public String getSelectionRules() {
        return this.selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to import.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to import.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelImportRequest withSelectionRules(String selectionRules) {
        setSelectionRules(selectionRules);
        return this;
    }

    /**
     * <p>
     * Whether to load metadata to the source or target database.
     * </p>
     * 
     * @param origin
     *        Whether to load metadata to the source or target database.
     * @see OriginTypeValue
     */

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * <p>
     * Whether to load metadata to the source or target database.
     * </p>
     * 
     * @return Whether to load metadata to the source or target database.
     * @see OriginTypeValue
     */

    public String getOrigin() {
        return this.origin;
    }

    /**
     * <p>
     * Whether to load metadata to the source or target database.
     * </p>
     * 
     * @param origin
     *        Whether to load metadata to the source or target database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginTypeValue
     */

    public StartMetadataModelImportRequest withOrigin(String origin) {
        setOrigin(origin);
        return this;
    }

    /**
     * <p>
     * Whether to load metadata to the source or target database.
     * </p>
     * 
     * @param origin
     *        Whether to load metadata to the source or target database.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OriginTypeValue
     */

    public StartMetadataModelImportRequest withOrigin(OriginTypeValue origin) {
        this.origin = origin.toString();
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * </p>
     * 
     * @param refresh
     *        If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     */

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    /**
     * <p>
     * If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * </p>
     * 
     * @return If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     */

    public Boolean getRefresh() {
        return this.refresh;
    }

    /**
     * <p>
     * If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * </p>
     * 
     * @param refresh
     *        If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelImportRequest withRefresh(Boolean refresh) {
        setRefresh(refresh);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     * </p>
     * 
     * @return If <code>true</code>, DMS loads metadata for the specified objects from the source database.
     */

    public Boolean isRefresh() {
        return this.refresh;
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
        if (getMigrationProjectIdentifier() != null)
            sb.append("MigrationProjectIdentifier: ").append(getMigrationProjectIdentifier()).append(",");
        if (getSelectionRules() != null)
            sb.append("SelectionRules: ").append(getSelectionRules()).append(",");
        if (getOrigin() != null)
            sb.append("Origin: ").append(getOrigin()).append(",");
        if (getRefresh() != null)
            sb.append("Refresh: ").append(getRefresh());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMetadataModelImportRequest == false)
            return false;
        StartMetadataModelImportRequest other = (StartMetadataModelImportRequest) obj;
        if (other.getMigrationProjectIdentifier() == null ^ this.getMigrationProjectIdentifier() == null)
            return false;
        if (other.getMigrationProjectIdentifier() != null && other.getMigrationProjectIdentifier().equals(this.getMigrationProjectIdentifier()) == false)
            return false;
        if (other.getSelectionRules() == null ^ this.getSelectionRules() == null)
            return false;
        if (other.getSelectionRules() != null && other.getSelectionRules().equals(this.getSelectionRules()) == false)
            return false;
        if (other.getOrigin() == null ^ this.getOrigin() == null)
            return false;
        if (other.getOrigin() != null && other.getOrigin().equals(this.getOrigin()) == false)
            return false;
        if (other.getRefresh() == null ^ this.getRefresh() == null)
            return false;
        if (other.getRefresh() != null && other.getRefresh().equals(this.getRefresh()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProjectIdentifier() == null) ? 0 : getMigrationProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSelectionRules() == null) ? 0 : getSelectionRules().hashCode());
        hashCode = prime * hashCode + ((getOrigin() == null) ? 0 : getOrigin().hashCode());
        hashCode = prime * hashCode + ((getRefresh() == null) ? 0 : getRefresh().hashCode());
        return hashCode;
    }

    @Override
    public StartMetadataModelImportRequest clone() {
        return (StartMetadataModelImportRequest) super.clone();
    }

}
