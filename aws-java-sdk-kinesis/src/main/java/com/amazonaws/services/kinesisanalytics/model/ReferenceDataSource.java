/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalytics.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the reference data source by providing the source information (S3 bucket name and object key name), the
 * resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon
 * S3 object to the in-application table.
 * </p>
 */
public class ReferenceDataSource implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the in-application table to create.
     * </p>
     */
    private String tableName;

    private S3ReferenceDataSource s3ReferenceDataSource;

    private SourceSchema referenceSchema;

    /**
     * <p>
     * Name of the in-application table to create.
     * </p>
     * 
     * @param tableName
     *        Name of the in-application table to create.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * Name of the in-application table to create.
     * </p>
     * 
     * @return Name of the in-application table to create.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * Name of the in-application table to create.
     * </p>
     * 
     * @param tableName
     *        Name of the in-application table to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSource withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * @param s3ReferenceDataSource
     */

    public void setS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
    }

    /**
     * @return
     */

    public S3ReferenceDataSource getS3ReferenceDataSource() {
        return this.s3ReferenceDataSource;
    }

    /**
     * @param s3ReferenceDataSource
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSource withS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
        setS3ReferenceDataSource(s3ReferenceDataSource);
        return this;
    }

    /**
     * @param referenceSchema
     */

    public void setReferenceSchema(SourceSchema referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    /**
     * @return
     */

    public SourceSchema getReferenceSchema() {
        return this.referenceSchema;
    }

    /**
     * @param referenceSchema
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSource withReferenceSchema(SourceSchema referenceSchema) {
        setReferenceSchema(referenceSchema);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTableName() != null)
            sb.append("TableName: " + getTableName() + ",");
        if (getS3ReferenceDataSource() != null)
            sb.append("S3ReferenceDataSource: " + getS3ReferenceDataSource() + ",");
        if (getReferenceSchema() != null)
            sb.append("ReferenceSchema: " + getReferenceSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceDataSource == false)
            return false;
        ReferenceDataSource other = (ReferenceDataSource) obj;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getS3ReferenceDataSource() == null ^ this.getS3ReferenceDataSource() == null)
            return false;
        if (other.getS3ReferenceDataSource() != null && other.getS3ReferenceDataSource().equals(this.getS3ReferenceDataSource()) == false)
            return false;
        if (other.getReferenceSchema() == null ^ this.getReferenceSchema() == null)
            return false;
        if (other.getReferenceSchema() != null && other.getReferenceSchema().equals(this.getReferenceSchema()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getS3ReferenceDataSource() == null) ? 0 : getS3ReferenceDataSource().hashCode());
        hashCode = prime * hashCode + ((getReferenceSchema() == null) ? 0 : getReferenceSchema().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceDataSource clone() {
        try {
            return (ReferenceDataSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
