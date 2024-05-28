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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information that defines a migration project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/MigrationProject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MigrationProject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the migration project.
     * </p>
     */
    private String migrationProjectName;
    /**
     * <p>
     * The ARN string that uniquely identifies the migration project.
     * </p>
     */
    private String migrationProjectArn;
    /**
     * <p>
     * The time when the migration project was created.
     * </p>
     */
    private java.util.Date migrationProjectCreationTime;
    /**
     * <p>
     * Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     */
    private java.util.List<DataProviderDescriptor> sourceDataProviderDescriptors;
    /**
     * <p>
     * Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     */
    private java.util.List<DataProviderDescriptor> targetDataProviderDescriptors;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     * </p>
     */
    private String instanceProfileArn;
    /**
     * <p>
     * The name of the associated instance profile.
     * </p>
     */
    private String instanceProfileName;
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
     * The name of the migration project.
     * </p>
     * 
     * @param migrationProjectName
     *        The name of the migration project.
     */

    public void setMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
    }

    /**
     * <p>
     * The name of the migration project.
     * </p>
     * 
     * @return The name of the migration project.
     */

    public String getMigrationProjectName() {
        return this.migrationProjectName;
    }

    /**
     * <p>
     * The name of the migration project.
     * </p>
     * 
     * @param migrationProjectName
     *        The name of the migration project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withMigrationProjectName(String migrationProjectName) {
        setMigrationProjectName(migrationProjectName);
        return this;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the migration project.
     * </p>
     * 
     * @param migrationProjectArn
     *        The ARN string that uniquely identifies the migration project.
     */

    public void setMigrationProjectArn(String migrationProjectArn) {
        this.migrationProjectArn = migrationProjectArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the migration project.
     * </p>
     * 
     * @return The ARN string that uniquely identifies the migration project.
     */

    public String getMigrationProjectArn() {
        return this.migrationProjectArn;
    }

    /**
     * <p>
     * The ARN string that uniquely identifies the migration project.
     * </p>
     * 
     * @param migrationProjectArn
     *        The ARN string that uniquely identifies the migration project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withMigrationProjectArn(String migrationProjectArn) {
        setMigrationProjectArn(migrationProjectArn);
        return this;
    }

    /**
     * <p>
     * The time when the migration project was created.
     * </p>
     * 
     * @param migrationProjectCreationTime
     *        The time when the migration project was created.
     */

    public void setMigrationProjectCreationTime(java.util.Date migrationProjectCreationTime) {
        this.migrationProjectCreationTime = migrationProjectCreationTime;
    }

    /**
     * <p>
     * The time when the migration project was created.
     * </p>
     * 
     * @return The time when the migration project was created.
     */

    public java.util.Date getMigrationProjectCreationTime() {
        return this.migrationProjectCreationTime;
    }

    /**
     * <p>
     * The time when the migration project was created.
     * </p>
     * 
     * @param migrationProjectCreationTime
     *        The time when the migration project was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withMigrationProjectCreationTime(java.util.Date migrationProjectCreationTime) {
        setMigrationProjectCreationTime(migrationProjectCreationTime);
        return this;
    }

    /**
     * <p>
     * Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @return Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     */

    public java.util.List<DataProviderDescriptor> getSourceDataProviderDescriptors() {
        return sourceDataProviderDescriptors;
    }

    /**
     * <p>
     * Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     */

    public void setSourceDataProviderDescriptors(java.util.Collection<DataProviderDescriptor> sourceDataProviderDescriptors) {
        if (sourceDataProviderDescriptors == null) {
            this.sourceDataProviderDescriptors = null;
            return;
        }

        this.sourceDataProviderDescriptors = new java.util.ArrayList<DataProviderDescriptor>(sourceDataProviderDescriptors);
    }

    /**
     * <p>
     * Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceDataProviderDescriptors(java.util.Collection)} or
     * {@link #withSourceDataProviderDescriptors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withSourceDataProviderDescriptors(DataProviderDescriptor... sourceDataProviderDescriptors) {
        if (this.sourceDataProviderDescriptors == null) {
            setSourceDataProviderDescriptors(new java.util.ArrayList<DataProviderDescriptor>(sourceDataProviderDescriptors.length));
        }
        for (DataProviderDescriptor ele : sourceDataProviderDescriptors) {
            this.sourceDataProviderDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @param sourceDataProviderDescriptors
     *        Information about the source data provider, including the name or ARN, and Secrets Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withSourceDataProviderDescriptors(java.util.Collection<DataProviderDescriptor> sourceDataProviderDescriptors) {
        setSourceDataProviderDescriptors(sourceDataProviderDescriptors);
        return this;
    }

    /**
     * <p>
     * Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @return Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     */

    public java.util.List<DataProviderDescriptor> getTargetDataProviderDescriptors() {
        return targetDataProviderDescriptors;
    }

    /**
     * <p>
     * Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     */

    public void setTargetDataProviderDescriptors(java.util.Collection<DataProviderDescriptor> targetDataProviderDescriptors) {
        if (targetDataProviderDescriptors == null) {
            this.targetDataProviderDescriptors = null;
            return;
        }

        this.targetDataProviderDescriptors = new java.util.ArrayList<DataProviderDescriptor>(targetDataProviderDescriptors);
    }

    /**
     * <p>
     * Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetDataProviderDescriptors(java.util.Collection)} or
     * {@link #withTargetDataProviderDescriptors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withTargetDataProviderDescriptors(DataProviderDescriptor... targetDataProviderDescriptors) {
        if (this.targetDataProviderDescriptors == null) {
            setTargetDataProviderDescriptors(new java.util.ArrayList<DataProviderDescriptor>(targetDataProviderDescriptors.length));
        }
        for (DataProviderDescriptor ele : targetDataProviderDescriptors) {
            this.targetDataProviderDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * </p>
     * 
     * @param targetDataProviderDescriptors
     *        Information about the target data provider, including the name or ARN, and Secrets Manager parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withTargetDataProviderDescriptors(java.util.Collection<DataProviderDescriptor> targetDataProviderDescriptors) {
        setTargetDataProviderDescriptors(targetDataProviderDescriptors);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     * </p>
     * 
     * @param instanceProfileArn
     *        The Amazon Resource Name (ARN) of the instance profile for your migration project.
     */

    public void setInstanceProfileArn(String instanceProfileArn) {
        this.instanceProfileArn = instanceProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the instance profile for your migration project.
     */

    public String getInstanceProfileArn() {
        return this.instanceProfileArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the instance profile for your migration project.
     * </p>
     * 
     * @param instanceProfileArn
     *        The Amazon Resource Name (ARN) of the instance profile for your migration project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withInstanceProfileArn(String instanceProfileArn) {
        setInstanceProfileArn(instanceProfileArn);
        return this;
    }

    /**
     * <p>
     * The name of the associated instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the associated instance profile.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the associated instance profile.
     * </p>
     * 
     * @return The name of the associated instance profile.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name of the associated instance profile.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the associated instance profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MigrationProject withInstanceProfileName(String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
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

    public MigrationProject withTransformationRules(String transformationRules) {
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

    public MigrationProject withDescription(String description) {
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

    public MigrationProject withSchemaConversionApplicationAttributes(SCApplicationAttributes schemaConversionApplicationAttributes) {
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
        if (getMigrationProjectName() != null)
            sb.append("MigrationProjectName: ").append(getMigrationProjectName()).append(",");
        if (getMigrationProjectArn() != null)
            sb.append("MigrationProjectArn: ").append(getMigrationProjectArn()).append(",");
        if (getMigrationProjectCreationTime() != null)
            sb.append("MigrationProjectCreationTime: ").append(getMigrationProjectCreationTime()).append(",");
        if (getSourceDataProviderDescriptors() != null)
            sb.append("SourceDataProviderDescriptors: ").append(getSourceDataProviderDescriptors()).append(",");
        if (getTargetDataProviderDescriptors() != null)
            sb.append("TargetDataProviderDescriptors: ").append(getTargetDataProviderDescriptors()).append(",");
        if (getInstanceProfileArn() != null)
            sb.append("InstanceProfileArn: ").append(getInstanceProfileArn()).append(",");
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: ").append(getInstanceProfileName()).append(",");
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

        if (obj instanceof MigrationProject == false)
            return false;
        MigrationProject other = (MigrationProject) obj;
        if (other.getMigrationProjectName() == null ^ this.getMigrationProjectName() == null)
            return false;
        if (other.getMigrationProjectName() != null && other.getMigrationProjectName().equals(this.getMigrationProjectName()) == false)
            return false;
        if (other.getMigrationProjectArn() == null ^ this.getMigrationProjectArn() == null)
            return false;
        if (other.getMigrationProjectArn() != null && other.getMigrationProjectArn().equals(this.getMigrationProjectArn()) == false)
            return false;
        if (other.getMigrationProjectCreationTime() == null ^ this.getMigrationProjectCreationTime() == null)
            return false;
        if (other.getMigrationProjectCreationTime() != null && other.getMigrationProjectCreationTime().equals(this.getMigrationProjectCreationTime()) == false)
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
        if (other.getInstanceProfileArn() == null ^ this.getInstanceProfileArn() == null)
            return false;
        if (other.getInstanceProfileArn() != null && other.getInstanceProfileArn().equals(this.getInstanceProfileArn()) == false)
            return false;
        if (other.getInstanceProfileName() == null ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null && other.getInstanceProfileName().equals(this.getInstanceProfileName()) == false)
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

        hashCode = prime * hashCode + ((getMigrationProjectName() == null) ? 0 : getMigrationProjectName().hashCode());
        hashCode = prime * hashCode + ((getMigrationProjectArn() == null) ? 0 : getMigrationProjectArn().hashCode());
        hashCode = prime * hashCode + ((getMigrationProjectCreationTime() == null) ? 0 : getMigrationProjectCreationTime().hashCode());
        hashCode = prime * hashCode + ((getSourceDataProviderDescriptors() == null) ? 0 : getSourceDataProviderDescriptors().hashCode());
        hashCode = prime * hashCode + ((getTargetDataProviderDescriptors() == null) ? 0 : getTargetDataProviderDescriptors().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileArn() == null) ? 0 : getInstanceProfileArn().hashCode());
        hashCode = prime * hashCode + ((getInstanceProfileName() == null) ? 0 : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode + ((getTransformationRules() == null) ? 0 : getTransformationRules().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchemaConversionApplicationAttributes() == null) ? 0 : getSchemaConversionApplicationAttributes().hashCode());
        return hashCode;
    }

    @Override
    public MigrationProject clone() {
        try {
            return (MigrationProject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.MigrationProjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
