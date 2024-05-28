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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ExportMetadataModelAssessment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportMetadataModelAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The migration project name or Amazon Resource Name (ARN).
     * </p>
     */
    private String migrationProjectIdentifier;
    /**
     * <p>
     * A value that specifies the database objects to assess.
     * </p>
     */
    private String selectionRules;
    /**
     * <p>
     * The name of the assessment file to create in your Amazon S3 bucket.
     * </p>
     */
    private String fileName;
    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     */
    private java.util.List<String> assessmentReportTypes;

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

    public ExportMetadataModelAssessmentRequest withMigrationProjectIdentifier(String migrationProjectIdentifier) {
        setMigrationProjectIdentifier(migrationProjectIdentifier);
        return this;
    }

    /**
     * <p>
     * A value that specifies the database objects to assess.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to assess.
     */

    public void setSelectionRules(String selectionRules) {
        this.selectionRules = selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to assess.
     * </p>
     * 
     * @return A value that specifies the database objects to assess.
     */

    public String getSelectionRules() {
        return this.selectionRules;
    }

    /**
     * <p>
     * A value that specifies the database objects to assess.
     * </p>
     * 
     * @param selectionRules
     *        A value that specifies the database objects to assess.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentRequest withSelectionRules(String selectionRules) {
        setSelectionRules(selectionRules);
        return this;
    }

    /**
     * <p>
     * The name of the assessment file to create in your Amazon S3 bucket.
     * </p>
     * 
     * @param fileName
     *        The name of the assessment file to create in your Amazon S3 bucket.
     */

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the assessment file to create in your Amazon S3 bucket.
     * </p>
     * 
     * @return The name of the assessment file to create in your Amazon S3 bucket.
     */

    public String getFileName() {
        return this.fileName;
    }

    /**
     * <p>
     * The name of the assessment file to create in your Amazon S3 bucket.
     * </p>
     * 
     * @param fileName
     *        The name of the assessment file to create in your Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportMetadataModelAssessmentRequest withFileName(String fileName) {
        setFileName(fileName);
        return this;
    }

    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     * 
     * @return The file format of the assessment file.
     * @see AssessmentReportType
     */

    public java.util.List<String> getAssessmentReportTypes() {
        return assessmentReportTypes;
    }

    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     * 
     * @param assessmentReportTypes
     *        The file format of the assessment file.
     * @see AssessmentReportType
     */

    public void setAssessmentReportTypes(java.util.Collection<String> assessmentReportTypes) {
        if (assessmentReportTypes == null) {
            this.assessmentReportTypes = null;
            return;
        }

        this.assessmentReportTypes = new java.util.ArrayList<String>(assessmentReportTypes);
    }

    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssessmentReportTypes(java.util.Collection)} or
     * {@link #withAssessmentReportTypes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param assessmentReportTypes
     *        The file format of the assessment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportType
     */

    public ExportMetadataModelAssessmentRequest withAssessmentReportTypes(String... assessmentReportTypes) {
        if (this.assessmentReportTypes == null) {
            setAssessmentReportTypes(new java.util.ArrayList<String>(assessmentReportTypes.length));
        }
        for (String ele : assessmentReportTypes) {
            this.assessmentReportTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     * 
     * @param assessmentReportTypes
     *        The file format of the assessment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportType
     */

    public ExportMetadataModelAssessmentRequest withAssessmentReportTypes(java.util.Collection<String> assessmentReportTypes) {
        setAssessmentReportTypes(assessmentReportTypes);
        return this;
    }

    /**
     * <p>
     * The file format of the assessment file.
     * </p>
     * 
     * @param assessmentReportTypes
     *        The file format of the assessment file.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportType
     */

    public ExportMetadataModelAssessmentRequest withAssessmentReportTypes(AssessmentReportType... assessmentReportTypes) {
        java.util.ArrayList<String> assessmentReportTypesCopy = new java.util.ArrayList<String>(assessmentReportTypes.length);
        for (AssessmentReportType value : assessmentReportTypes) {
            assessmentReportTypesCopy.add(value.toString());
        }
        if (getAssessmentReportTypes() == null) {
            setAssessmentReportTypes(assessmentReportTypesCopy);
        } else {
            getAssessmentReportTypes().addAll(assessmentReportTypesCopy);
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
        if (getMigrationProjectIdentifier() != null)
            sb.append("MigrationProjectIdentifier: ").append(getMigrationProjectIdentifier()).append(",");
        if (getSelectionRules() != null)
            sb.append("SelectionRules: ").append(getSelectionRules()).append(",");
        if (getFileName() != null)
            sb.append("FileName: ").append(getFileName()).append(",");
        if (getAssessmentReportTypes() != null)
            sb.append("AssessmentReportTypes: ").append(getAssessmentReportTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportMetadataModelAssessmentRequest == false)
            return false;
        ExportMetadataModelAssessmentRequest other = (ExportMetadataModelAssessmentRequest) obj;
        if (other.getMigrationProjectIdentifier() == null ^ this.getMigrationProjectIdentifier() == null)
            return false;
        if (other.getMigrationProjectIdentifier() != null && other.getMigrationProjectIdentifier().equals(this.getMigrationProjectIdentifier()) == false)
            return false;
        if (other.getSelectionRules() == null ^ this.getSelectionRules() == null)
            return false;
        if (other.getSelectionRules() != null && other.getSelectionRules().equals(this.getSelectionRules()) == false)
            return false;
        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getAssessmentReportTypes() == null ^ this.getAssessmentReportTypes() == null)
            return false;
        if (other.getAssessmentReportTypes() != null && other.getAssessmentReportTypes().equals(this.getAssessmentReportTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMigrationProjectIdentifier() == null) ? 0 : getMigrationProjectIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSelectionRules() == null) ? 0 : getSelectionRules().hashCode());
        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportTypes() == null) ? 0 : getAssessmentReportTypes().hashCode());
        return hashCode;
    }

    @Override
    public ExportMetadataModelAssessmentRequest clone() {
        return (ExportMetadataModelAssessmentRequest) super.clone();
    }

}
