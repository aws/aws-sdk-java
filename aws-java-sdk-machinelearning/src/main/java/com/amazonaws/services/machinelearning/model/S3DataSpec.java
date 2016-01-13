/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the data specification of a <code>DataSource</code>.
 * </p>
 */
public class S3DataSpec implements Serializable, Cloneable {

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The
     * URI specifies a data file or an Amazon Simple Storage Service (Amazon S3)
     * directory or bucket containing data files.
     * </p>
     */
    private String dataLocationS3;
    /**
     * <p>
     * Describes the splitting requirement of a <code>Datasource</code>.
     * </p>
     */
    private String dataRearrangement;
    /**
     * <p>
     * A JSON string that represents the schema for an Amazon S3
     * <code>DataSource</code>. The <code>DataSchema</code> defines the
     * structure of the observation data in the data file(s) referenced in the
     * <code>DataSource</code>.
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs.
     * <code>attributes</code> and <code>excludedVariableNames</code> have an
     * array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     * "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL"
     * }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" },
     * { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, {
     * "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     */
    private String dataSchema;
    /**
     * <p>
     * Describes the schema Location in Amazon S3.
     * </p>
     */
    private String dataSchemaLocationS3;

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The
     * URI specifies a data file or an Amazon Simple Storage Service (Amazon S3)
     * directory or bucket containing data files.
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file(s) used by a <code>DataSource</code>
     *        . The URI specifies a data file or an Amazon Simple Storage
     *        Service (Amazon S3) directory or bucket containing data files.
     */
    public void setDataLocationS3(String dataLocationS3) {
        this.dataLocationS3 = dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The
     * URI specifies a data file or an Amazon Simple Storage Service (Amazon S3)
     * directory or bucket containing data files.
     * </p>
     * 
     * @return The location of the data file(s) used by a
     *         <code>DataSource</code>. The URI specifies a data file or an
     *         Amazon Simple Storage Service (Amazon S3) directory or bucket
     *         containing data files.
     */
    public String getDataLocationS3() {
        return this.dataLocationS3;
    }

    /**
     * <p>
     * The location of the data file(s) used by a <code>DataSource</code>. The
     * URI specifies a data file or an Amazon Simple Storage Service (Amazon S3)
     * directory or bucket containing data files.
     * </p>
     * 
     * @param dataLocationS3
     *        The location of the data file(s) used by a <code>DataSource</code>
     *        . The URI specifies a data file or an Amazon Simple Storage
     *        Service (Amazon S3) directory or bucket containing data files.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DataSpec withDataLocationS3(String dataLocationS3) {
        setDataLocationS3(dataLocationS3);
        return this;
    }

    /**
     * <p>
     * Describes the splitting requirement of a <code>Datasource</code>.
     * </p>
     * 
     * @param dataRearrangement
     *        Describes the splitting requirement of a <code>Datasource</code>.
     */
    public void setDataRearrangement(String dataRearrangement) {
        this.dataRearrangement = dataRearrangement;
    }

    /**
     * <p>
     * Describes the splitting requirement of a <code>Datasource</code>.
     * </p>
     * 
     * @return Describes the splitting requirement of a <code>Datasource</code>.
     */
    public String getDataRearrangement() {
        return this.dataRearrangement;
    }

    /**
     * <p>
     * Describes the splitting requirement of a <code>Datasource</code>.
     * </p>
     * 
     * @param dataRearrangement
     *        Describes the splitting requirement of a <code>Datasource</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DataSpec withDataRearrangement(String dataRearrangement) {
        setDataRearrangement(dataRearrangement);
        return this;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon S3
     * <code>DataSource</code>. The <code>DataSchema</code> defines the
     * structure of the observation data in the data file(s) referenced in the
     * <code>DataSource</code>.
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs.
     * <code>attributes</code> and <code>excludedVariableNames</code> have an
     * array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     * "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL"
     * }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" },
     * { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, {
     * "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @param dataSchema
     *        A JSON string that represents the schema for an Amazon S3
     *        <code>DataSource</code>. The <code>DataSchema</code> defines the
     *        structure of the observation data in the data file(s) referenced
     *        in the <code>DataSource</code>.</p>
     *        <p>
     *        Define your <code>DataSchema</code> as a series of key-value
     *        pairs. <code>attributes</code> and
     *        <code>excludedVariableNames</code> have an array of key-value
     *        pairs for their value. Use the following format to define your
     *        <code>DataSchema</code>.
     *        </p>
     *        <p>
     *        { "version": "1.0",
     *        </p>
     *        <p>
     *        "recordAnnotationFieldName": "F1",
     *        </p>
     *        <p>
     *        "recordWeightFieldName": "F2",
     *        </p>
     *        <p>
     *        "targetFieldName": "F3",
     *        </p>
     *        <p>
     *        "dataFormat": "CSV",
     *        </p>
     *        <p>
     *        "dataFileContainsHeader": true,
     *        </p>
     *        <p>
     *        "attributes": [
     *        </p>
     *        <p>
     *        { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     *        "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType":
     *        "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, {
     *        "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName":
     *        "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     *        "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType":
     *        "WEIGHTED_STRING_SEQUENCE" } ],
     *        </p>
     *        <p>
     *        "excludedVariableNames": [ "F6" ] }
     *        </p>
     */
    public void setDataSchema(String dataSchema) {
        this.dataSchema = dataSchema;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon S3
     * <code>DataSource</code>. The <code>DataSchema</code> defines the
     * structure of the observation data in the data file(s) referenced in the
     * <code>DataSource</code>.
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs.
     * <code>attributes</code> and <code>excludedVariableNames</code> have an
     * array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     * "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL"
     * }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" },
     * { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, {
     * "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @return A JSON string that represents the schema for an Amazon S3
     *         <code>DataSource</code>. The <code>DataSchema</code> defines the
     *         structure of the observation data in the data file(s) referenced
     *         in the <code>DataSource</code>.</p>
     *         <p>
     *         Define your <code>DataSchema</code> as a series of key-value
     *         pairs. <code>attributes</code> and
     *         <code>excludedVariableNames</code> have an array of key-value
     *         pairs for their value. Use the following format to define your
     *         <code>DataSchema</code>.
     *         </p>
     *         <p>
     *         { "version": "1.0",
     *         </p>
     *         <p>
     *         "recordAnnotationFieldName": "F1",
     *         </p>
     *         <p>
     *         "recordWeightFieldName": "F2",
     *         </p>
     *         <p>
     *         "targetFieldName": "F3",
     *         </p>
     *         <p>
     *         "dataFormat": "CSV",
     *         </p>
     *         <p>
     *         "dataFileContainsHeader": true,
     *         </p>
     *         <p>
     *         "attributes": [
     *         </p>
     *         <p>
     *         { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     *         "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType":
     *         "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, {
     *         "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName":
     *         "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     *         "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType":
     *         "WEIGHTED_STRING_SEQUENCE" } ],
     *         </p>
     *         <p>
     *         "excludedVariableNames": [ "F6" ] }
     *         </p>
     */
    public String getDataSchema() {
        return this.dataSchema;
    }

    /**
     * <p>
     * A JSON string that represents the schema for an Amazon S3
     * <code>DataSource</code>. The <code>DataSchema</code> defines the
     * structure of the observation data in the data file(s) referenced in the
     * <code>DataSource</code>.
     * </p>
     * <p>
     * Define your <code>DataSchema</code> as a series of key-value pairs.
     * <code>attributes</code> and <code>excludedVariableNames</code> have an
     * array of key-value pairs for their value. Use the following format to
     * define your <code>DataSchema</code>.
     * </p>
     * <p>
     * { "version": "1.0",
     * </p>
     * <p>
     * "recordAnnotationFieldName": "F1",
     * </p>
     * <p>
     * "recordWeightFieldName": "F2",
     * </p>
     * <p>
     * "targetFieldName": "F3",
     * </p>
     * <p>
     * "dataFormat": "CSV",
     * </p>
     * <p>
     * "dataFileContainsHeader": true,
     * </p>
     * <p>
     * "attributes": [
     * </p>
     * <p>
     * { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     * "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType": "CATEGORICAL"
     * }, { "fieldName": "F4", "fieldType": "NUMERIC" }, { "fieldName": "F5",
     * "fieldType": "CATEGORICAL" }, { "fieldName": "F6", "fieldType": "TEXT" },
     * { "fieldName": "F7", "fieldType": "WEIGHTED_INT_SEQUENCE" }, {
     * "fieldName": "F8", "fieldType": "WEIGHTED_STRING_SEQUENCE" } ],
     * </p>
     * <p>
     * "excludedVariableNames": [ "F6" ] }
     * </p>
     * <?oxy_insert_end>
     * 
     * @param dataSchema
     *        A JSON string that represents the schema for an Amazon S3
     *        <code>DataSource</code>. The <code>DataSchema</code> defines the
     *        structure of the observation data in the data file(s) referenced
     *        in the <code>DataSource</code>.</p>
     *        <p>
     *        Define your <code>DataSchema</code> as a series of key-value
     *        pairs. <code>attributes</code> and
     *        <code>excludedVariableNames</code> have an array of key-value
     *        pairs for their value. Use the following format to define your
     *        <code>DataSchema</code>.
     *        </p>
     *        <p>
     *        { "version": "1.0",
     *        </p>
     *        <p>
     *        "recordAnnotationFieldName": "F1",
     *        </p>
     *        <p>
     *        "recordWeightFieldName": "F2",
     *        </p>
     *        <p>
     *        "targetFieldName": "F3",
     *        </p>
     *        <p>
     *        "dataFormat": "CSV",
     *        </p>
     *        <p>
     *        "dataFileContainsHeader": true,
     *        </p>
     *        <p>
     *        "attributes": [
     *        </p>
     *        <p>
     *        { "fieldName": "F1", "fieldType": "TEXT" }, { "fieldName": "F2",
     *        "fieldType": "NUMERIC" }, { "fieldName": "F3", "fieldType":
     *        "CATEGORICAL" }, { "fieldName": "F4", "fieldType": "NUMERIC" }, {
     *        "fieldName": "F5", "fieldType": "CATEGORICAL" }, { "fieldName":
     *        "F6", "fieldType": "TEXT" }, { "fieldName": "F7", "fieldType":
     *        "WEIGHTED_INT_SEQUENCE" }, { "fieldName": "F8", "fieldType":
     *        "WEIGHTED_STRING_SEQUENCE" } ],
     *        </p>
     *        <p>
     *        "excludedVariableNames": [ "F6" ] }
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DataSpec withDataSchema(String dataSchema) {
        setDataSchema(dataSchema);
        return this;
    }

    /**
     * <p>
     * Describes the schema Location in Amazon S3.
     * </p>
     * 
     * @param dataSchemaLocationS3
     *        Describes the schema Location in Amazon S3.
     */
    public void setDataSchemaLocationS3(String dataSchemaLocationS3) {
        this.dataSchemaLocationS3 = dataSchemaLocationS3;
    }

    /**
     * <p>
     * Describes the schema Location in Amazon S3.
     * </p>
     * 
     * @return Describes the schema Location in Amazon S3.
     */
    public String getDataSchemaLocationS3() {
        return this.dataSchemaLocationS3;
    }

    /**
     * <p>
     * Describes the schema Location in Amazon S3.
     * </p>
     * 
     * @param dataSchemaLocationS3
     *        Describes the schema Location in Amazon S3.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public S3DataSpec withDataSchemaLocationS3(String dataSchemaLocationS3) {
        setDataSchemaLocationS3(dataSchemaLocationS3);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDataLocationS3() != null)
            sb.append("DataLocationS3: " + getDataLocationS3() + ",");
        if (getDataRearrangement() != null)
            sb.append("DataRearrangement: " + getDataRearrangement() + ",");
        if (getDataSchema() != null)
            sb.append("DataSchema: " + getDataSchema() + ",");
        if (getDataSchemaLocationS3() != null)
            sb.append("DataSchemaLocationS3: " + getDataSchemaLocationS3());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3DataSpec == false)
            return false;
        S3DataSpec other = (S3DataSpec) obj;
        if (other.getDataLocationS3() == null
                ^ this.getDataLocationS3() == null)
            return false;
        if (other.getDataLocationS3() != null
                && other.getDataLocationS3().equals(this.getDataLocationS3()) == false)
            return false;
        if (other.getDataRearrangement() == null
                ^ this.getDataRearrangement() == null)
            return false;
        if (other.getDataRearrangement() != null
                && other.getDataRearrangement().equals(
                        this.getDataRearrangement()) == false)
            return false;
        if (other.getDataSchema() == null ^ this.getDataSchema() == null)
            return false;
        if (other.getDataSchema() != null
                && other.getDataSchema().equals(this.getDataSchema()) == false)
            return false;
        if (other.getDataSchemaLocationS3() == null
                ^ this.getDataSchemaLocationS3() == null)
            return false;
        if (other.getDataSchemaLocationS3() != null
                && other.getDataSchemaLocationS3().equals(
                        this.getDataSchemaLocationS3()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataLocationS3() == null) ? 0 : getDataLocationS3()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataRearrangement() == null) ? 0
                        : getDataRearrangement().hashCode());
        hashCode = prime * hashCode
                + ((getDataSchema() == null) ? 0 : getDataSchema().hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSchemaLocationS3() == null) ? 0
                        : getDataSchemaLocationS3().hashCode());
        return hashCode;
    }

    @Override
    public S3DataSpec clone() {
        try {
            return (S3DataSpec) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}