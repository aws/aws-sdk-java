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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/StartMetadataModelExportToTarget"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMetadataModelExportToTargetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     */
    private String migrationProjectIdentifier;
    /**
     * <p>
     * A value that specifies the database objects to export.
     * </p>
     */
    private String selectionRules;
    /**
     * <p>
     * Whether to overwrite the migration project extension pack. An extension pack is an add-on module that emulates
     * functions present in a source database that are required when converting objects to the target database.
     * </p>
     */
    private Boolean overwriteExtensionPack;

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

    public StartMetadataModelExportToTargetRequest withMigrationProjectIdentifier(String migrationProjectIdentifier) {
        setMigrationProjectIdentifier(migrationProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies the database objects to export.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to export.
     */

    public void setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to export.
     * </p>
     * 
     * @return A value that specifies the database objects to export.
     */

    public String getSelectionRules() {
        return this.selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to export.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelExportToTargetRequest withSelectionRules(String selectionRules) {
        setSelectionRules(selectionRules);
        return this;
    }

    /**
     * <p>
     * Whether to overwrite the migration project extension pack. An extension pack is an add-on module that emulates
     * functions present in a source database that are required when converting objects to the target database.
     * </p>
     * 
     * @param overwriteExtensionPack
     *        Whether to overwrite the migration project extension pack. An extension pack is an add-on module that
     *        emulates functions present in a source database that are required when converting objects to the target
     *        database.
     */

    public void setOverwriteExtensionPack(Boolean overwriteExtensionPack) {
        this.overwriteExtensionPack = overwriteExtensionPack;
    }

    /**
     * <p>
     * Whether to overwrite the migration project extension pack. An extension pack is an add-on module that emulates
     * functions present in a source database that are required when converting objects to the target database.
     * </p>
     * 
     * @return Whether to overwrite the migration project extension pack. An extension pack is an add-on module that
     *         emulates functions present in a source database that are required when converting objects to the target
     *         database.
     */

    public Boolean getOverwriteExtensionPack() {
        return this.overwriteExtensionPack;
    }

    /**
     * <p>
     * Whether to overwrite the migration project extension pack. An extension pack is an add-on module that emulates
     * functions present in a source database that are required when converting objects to the target database.
     * </p>
     * 
     * @param overwriteExtensionPack
     *        Whether to overwrite the migration project extension pack. An extension pack is an add-on module that
     *        emulates functions present in a source database that are required when converting objects to the target
     *        database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMetadataModelExportToTargetRequest withOverwriteExtensionPack(Boolean overwriteExtensionPack) {
        setOverwriteExtensionPack(overwriteExtensionPack);
        return this;
    }

    /**
     * <p>
     * Whether to overwrite the migration project extension pack. An extension pack is an add-on module that emulates
     * functions present in a source database that are required when converting objects to the target database.
     * </p>
     * 
     * @return Whether to overwrite the migration project extension pack. An extension pack is an add-on module that
     *         emulates functions present in a source database that are required when converting objects to the target
     *         database.
     */

    public Boolean isOverwriteExtensionPack() {
        return this.overwriteExtensionPack;
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
        if (getOverwriteExtensionPack() != null)
            sb.append("OverwriteExtensionPack: ").append(getOverwriteExtensionPack());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMetadataModelExportToTargetRequest == false)
            return false;
        StartMetadataModelExportToTargetRequest other = (StartMetadataModelExportToTargetRequest) obj;
        if (other.getMigrationProjectIdentifier() == null ^ this.getMigrationProjectIdentifier() == null)
            return false;
        if (other.getMigrationProjectIdentifier() != null && other.getMigrationProjectIdentifier().equals(this.getMigrationProjectIdentifier()) == false)
            return false;
        if (other.getSelectionRules() == null ^ this.getSelectionRules() == null)
            return false;
        if (other.getSelectionRules() != null && other.getSelectionRules().equals(this.getSelectionRules()) == false)
            return false;
        if (other.getOverwriteExtensionPack() == null ^ this.getOverwriteExtensionPack() == null)
            return false;
        if (other.getOverwriteExtensionPack() != null && other.getOverwriteExtensionPack().equals(this.getOverwriteExtensionPack()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProjectIdentifier() == null) ? 0 : getMigrationProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSelectionRules() == null) ? 0 : getSelectionRules().hashCode());
        hashCode = prime * hashCode + ((getOverwriteExtensionPack() == null) ? 0 : getOverwriteExtensionPack().hashCode());
        return hashCode;
    }

    @Override
    public StartMetadataModelExportToTargetRequest clone() {
        return (StartMetadataModelExportToTargetRequest) super.clone();
    }

}
