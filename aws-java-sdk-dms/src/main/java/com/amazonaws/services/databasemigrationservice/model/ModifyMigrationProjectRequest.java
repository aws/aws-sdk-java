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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ModifyMigrationProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyMigrationProjectRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     * letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     */
    private String migrationProjectIdentifier;
    /**
     * <p>
     * A user-friendly name for the migration project.
     * </p>
     */
    private String migrationProjectName;
    /**
     * <p>
     * Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     */
    private java.util.List<DataProviderDescriptorDefinition> sourceDataProviderDescriptors;
    /**
     * <p>
     * Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     */
    private java.util.List<DataProviderDescriptorDefinition> targetDataProviderDescriptors;
    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the instance profile.
     * </p>
     */
    private String instanceProfileIdentifier;
    /**
     * <p>
     * The settings in JSON format for migration rules. Migration rules make it possible for you to change the object
     * names according to the rules that you specify. For example, you can change an object name to lowercase or
     * uppercase, add or remove a prefix or suffix, or rename objects.
     * </p>
     */
    private String transformationRules;
    /**
     * <p>
     * A user-friendly description of the migration project.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     * </p>
     */
    private SCApplicationAttributes schemaConversionApplicationAttributes;

    /**
     * <p>
     * The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     * letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public void setMigrationProjectIdentifier(String migrationProjectIdentifier) {
        this.migrationProjectIdentifier = migrationProjectIdentifier;
    }

    /**
     * <p>
     * The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     * letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @return The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     *         letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     */

    public String getMigrationProjectIdentifier() {
        return this.migrationProjectIdentifier;
    }

    /**
     * <p>
     * The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     * letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * </p>
     * 
     * @param migrationProjectIdentifier
     *        The identifier of the migration project. Identifiers must begin with a letter and must contain only ASCII
     *        letters, digits, and hyphens. They can't end with a hyphen, or contain two consecutive hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withMigrationProjectIdentifier(String migrationProjectIdentifier) {
        setMigrationProjectIdentifier(migrationProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * A user-friendly name for the migration project.
     * </p>
     * 
     * @param migrationProjectName
     *        A user-friendly name for the migration project.
     */

    public void setMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
    }

    /**
     * <p>
     * A user-friendly name for the migration project.
     * </p>
     * 
     * @return A user-friendly name for the migration project.
     */

    public String getMigrationProjectName() {
        return this.migrationProjectName;
    }

    /**
     * <p>
     * A user-friendly name for the migration project.
     * </p>
     * 
     * @param migrationProjectName
     *        A user-friendly name for the migration project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withMigrationProjectName(String migrationProjectName) {
        setMigrationProjectName(migrationProjectName);
        return this;
    }

    /**
     * <p>
     * Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @return Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets
     *         Manager parameters.
     */

    public java.util.List<DataProviderDescriptorDefinition> getSourceDataProviderDescriptors() {
        return sourceDataProviderDescriptors;
    }

    /**
     * <p>
     * Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     */

    public void setSourceDataProviderDescriptors(java.util.Collection<DataProviderDescriptorDefinition> sourceDataProviderDescriptors) {
        if (sourceDataProviderDescriptors == null) {
            this.sourceDataProviderDescriptors = null;
            return;
        }

        this.sourceDataProviderDescriptors = new java.util.ArrayList<DataProviderDescriptorDefinition>(sourceDataProviderDescriptors);
    }

    /**
     * <p>
     * Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDataProviderDescriptors(java.util.Collection)} or
     * {@link #withSourceDataProviderDescriptors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withSourceDataProviderDescriptors(DataProviderDescriptorDefinition... sourceDataProviderDescriptors) {
        if (this.sourceDataProviderDescriptors == null) {
            setSourceDataProviderDescriptors(new java.util.ArrayList<DataProviderDescriptorDefinition>(sourceDataProviderDescriptors.length));
        }
        for (DataProviderDescriptorDefinition ele : sourceDataProviderDescriptors) {
            this.sourceDataProviderDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withSourceDataProviderDescriptors(java.util.Collection<DataProviderDescriptorDefinition> sourceDataProviderDescriptors) {
        setSourceDataProviderDescriptors(sourceDataProviderDescriptors);
        return this;
    }

    /**
     * <p>
     * Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @return Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets
     *         Manager parameters.
     */

    public java.util.List<DataProviderDescriptorDefinition> getTargetDataProviderDescriptors() {
        return targetDataProviderDescriptors;
    }

    /**
     * <p>
     * Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     */

    public void setTargetDataProviderDescriptors(java.util.Collection<DataProviderDescriptorDefinition> targetDataProviderDescriptors) {
        if (targetDataProviderDescriptors == null) {
            this.targetDataProviderDescriptors = null;
            return;
        }

        this.targetDataProviderDescriptors = new java.util.ArrayList<DataProviderDescriptorDefinition>(targetDataProviderDescriptors);
    }

    /**
     * <p>
     * Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetDataProviderDescriptors(java.util.Collection)} or
     * {@link #withTargetDataProviderDescriptors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withTargetDataProviderDescriptors(DataProviderDescriptorDefinition... targetDataProviderDescriptors) {
        if (this.targetDataProviderDescriptors == null) {
            setTargetDataProviderDescriptors(new java.util.ArrayList<DataProviderDescriptorDefinition>(targetDataProviderDescriptors.length));
        }
        for (DataProviderDescriptorDefinition ele : targetDataProviderDescriptors) {
            this.targetDataProviderDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets Manager
     * parameters.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name, ARN, and Amazon Web Services Secrets
     *        Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withTargetDataProviderDescriptors(java.util.Collection<DataProviderDescriptorDefinition> targetDataProviderDescriptors) {
        setTargetDataProviderDescriptors(targetDataProviderDescriptors);
        return this;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the instance profile.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The name or Amazon Resource Name (ARN) for the instance profile.
     */

    public void setInstanceProfileIdentifier(String instanceProfileIdentifier) {
        this.instanceProfileIdentifier = instanceProfileIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the instance profile.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) for the instance profile.
     */

    public String getInstanceProfileIdentifier() {
        return this.instanceProfileIdentifier;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) for the instance profile.
     * </p>
     * 
     * @param instanceProfileIdentifier
     *        The name or Amazon Resource Name (ARN) for the instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withInstanceProfileIdentifier(String instanceProfileIdentifier) {
        setInstanceProfileIdentifier(instanceProfileIdentifier);
        return this;
    }

    /**
     * <p>
     * The settings in JSON format for migration rules. Migration rules make it possible for you to change the object
     * names according to the rules that you specify. For example, you can change an object name to lowercase or
     * uppercase, add or remove a prefix or suffix, or rename objects.
     * </p>
     * 
     * @param transformationRules
     *        The settings in JSON format for migration rules. Migration rules make it possible for you to change the
     *        object names according to the rules that you specify. For example, you can change an object name to
     *        lowercase or uppercase, add or remove a prefix or suffix, or rename objects.
     */

    public void setTransformationRules(String transformationRules) {
        this.transformationRules = transformationRules;
    }

    /**
     * <p>
     * The settings in JSON format for migration rules. Migration rules make it possible for you to change the object
     * names according to the rules that you specify. For example, you can change an object name to lowercase or
     * uppercase, add or remove a prefix or suffix, or rename objects.
     * </p>
     * 
     * @return The settings in JSON format for migration rules. Migration rules make it possible for you to change the
     *         object names according to the rules that you specify. For example, you can change an object name to
     *         lowercase or uppercase, add or remove a prefix or suffix, or rename objects.
     */

    public String getTransformationRules() {
        return this.transformationRules;
    }

    /**
     * <p>
     * The settings in JSON format for migration rules. Migration rules make it possible for you to change the object
     * names according to the rules that you specify. For example, you can change an object name to lowercase or
     * uppercase, add or remove a prefix or suffix, or rename objects.
     * </p>
     * 
     * @param transformationRules
     *        The settings in JSON format for migration rules. Migration rules make it possible for you to change the
     *        object names according to the rules that you specify. For example, you can change an object name to
     *        lowercase or uppercase, add or remove a prefix or suffix, or rename objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withTransformationRules(String transformationRules) {
        setTransformationRules(transformationRules);
        return this;
    }

    /**
     * <p>
     * A user-friendly description of the migration project.
     * </p>
     * 
     * @param description
     *        A user-friendly description of the migration project.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-friendly description of the migration project.
     * </p>
     * 
     * @return A user-friendly description of the migration project.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-friendly description of the migration project.
     * </p>
     * 
     * @param description
     *        A user-friendly description of the migration project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     * </p>
     * 
     * @param schemaConversionApplicationAttributes
     *        The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     */

    public void setSchemaConversionApplicationAttributes(SCApplicationAttributes schemaConversionApplicationAttributes) {
        this.schemaConversionApplicationAttributes = schemaConversionApplicationAttributes;
    }

    /**
     * <p>
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     * </p>
     * 
     * @return The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     */

    public SCApplicationAttributes getSchemaConversionApplicationAttributes() {
        return this.schemaConversionApplicationAttributes;
    }

    /**
     * <p>
     * The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     * </p>
     * 
     * @param schemaConversionApplicationAttributes
     *        The schema conversion application attributes, including the Amazon S3 bucket name and Amazon S3 role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyMigrationProjectRequest withSchemaConversionApplicationAttributes(SCApplicationAttributes schemaConversionApplicationAttributes) {
        setSchemaConversionApplicationAttributes(schemaConversionApplicationAttributes);
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
        if (getMigrationProjectIdentifier() != null)
            sb.append("MigrationProjectIdentifier: ").append(getMigrationProjectIdentifier()).append(",");
        if (getMigrationProjectName() != null)
            sb.append("MigrationProjectName: ").append(getMigrationProjectName()).append(",");
        if (getSourceDataProviderDescriptors() != null)
            sb.append("SourceDataProviderDescriptors: ").append(getSourceDataProviderDescriptors()).append(",");
        if (getTargetDataProviderDescriptors() != null)
            sb.append("TargetDataProviderDescriptors: ").append(getTargetDataProviderDescriptors()).append(",");
        if (getInstanceProfileIdentifier() != null)
            sb.append("InstanceProfileIdentifier: ").append(getInstanceProfileIdentifier()).append(",");
        if (getTransformationRules() != null)
            sb.append("TransformationRules: ").append(getTransformationRules()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchemaConversionApplicationAttributes() != null)
            sb.append("SchemaConversionApplicationAttributes: ").append(getSchemaConversionApplicationAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyMigrationProjectRequest == false)
            return false;
        ModifyMigrationProjectRequest other = (ModifyMigrationProjectRequest) obj;
        if (other.getMigrationProjectIdentifier() == null ^ this.getMigrationProjectIdentifier() == null)
            return false;
        if (other.getMigrationProjectIdentifier() != null && other.getMigrationProjectIdentifier().equals(this.getMigrationProjectIdentifier()) == false)
            return false;
        if (other.getMigrationProjectName() == null ^ this.getMigrationProjectName() == null)
            return false;
        if (other.getMigrationProjectName() != null && other.getMigrationProjectName().equals(this.getMigrationProjectName()) == false)
            return false;
        if (other.getSourceDataProviderDescriptors() == null ^ this.getSourceDataProviderDescriptors() == null)
            return false;
        if (other.getSourceDataProviderDescriptors() != null
                && other.getSourceDataProviderDescriptors().equals(this.getSourceDataProviderDescriptors()) == false)
            return false;
        if (other.getTargetDataProviderDescriptors() == null ^ this.getTargetDataProviderDescriptors() == null)
            return false;
        if (other.getTargetDataProviderDescriptors() != null
                && other.getTargetDataProviderDescriptors().equals(this.getTargetDataProviderDescriptors()) == false)
            return false;
        if (other.getInstanceProfileIdentifier() == null ^ this.getInstanceProfileIdentifier() == null)
            return false;
        if (other.getInstanceProfileIdentifier() != null && other.getInstanceProfileIdentifier().equals(this.getInstanceProfileIdentifier()) == false)
            return false;
        if (other.getTransformationRules() == null ^ this.getTransformationRules() == null)
            return false;
        if (other.getTransformationRules() != null && other.getTransformationRules().equals(this.getTransformationRules()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchemaConversionApplicationAttributes() == null ^ this.getSchemaConversionApplicationAttributes() == null)
            return false;
        if (other.getSchemaConversionApplicationAttributes() != null
                && other.getSchemaConversionApplicationAttributes().equals(this.getSchemaConversionApplicationAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProjectIdentifier() == null) ? 0 : getMigrationProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMigrationProjectName() == null) ? 0 : getMigrationProjectName().hashCode());
        hashCode = prime * hashCode + ((getSourceDataProviderDescriptors() == null) ? 0 : getSourceDataProviderDescriptors().hashCode());
        hashCode = prime * hashCode + ((getTargetDataProviderDescriptors() == null) ? 0 : getTargetDataProviderDescriptors().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileIdentifier() == null) ? 0 : getInstanceProfileIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTransformationRules() == null) ? 0 : getTransformationRules().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchemaConversionApplicationAttributes() == null) ? 0 : getSchemaConversionApplicationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ModifyMigrationProjectRequest clone() {
        return (ModifyMigrationProjectRequest) super.clone();
    }

}
