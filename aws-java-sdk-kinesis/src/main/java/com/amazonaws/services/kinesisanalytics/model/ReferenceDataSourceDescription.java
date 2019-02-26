/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the reference data source configured for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ReferenceDataSourceDescription"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceDataSourceDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference
     * data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The in-application table name created by the specific reference data source configuration.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon
     * Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and
     * populate the in-application reference table.
     * </p>
     */
    private S3ReferenceDataSourceDescription s3ReferenceDataSourceDescription;
    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     */
    private SourceSchema referenceSchema;

    /**
     * <p>
     * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference
     * data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @param referenceId
     *        ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the
     *        reference data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference
     * data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @return ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the
     *         reference data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the reference
     * data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     * </p>
     * 
     * @param referenceId
     *        ID of the reference data source. This is the ID that Amazon Kinesis Analytics assigns when you add the
     *        reference data source to your application using the <a>AddApplicationReferenceDataSource</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceDescription withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The in-application table name created by the specific reference data source configuration.
     * </p>
     * 
     * @param tableName
     *        The in-application table name created by the specific reference data source configuration.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The in-application table name created by the specific reference data source configuration.
     * </p>
     * 
     * @return The in-application table name created by the specific reference data source configuration.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The in-application table name created by the specific reference data source configuration.
     * </p>
     * 
     * @param tableName
     *        The in-application table name created by the specific reference data source configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceDescription withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon
     * Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and
     * populate the in-application reference table.
     * </p>
     * 
     * @param s3ReferenceDataSourceDescription
     *        Provides the S3 bucket name, the object key name that contains the reference data. It also provides the
     *        Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3
     *        object and populate the in-application reference table.
     */

    public void setS3ReferenceDataSourceDescription(S3ReferenceDataSourceDescription s3ReferenceDataSourceDescription) {
        this.s3ReferenceDataSourceDescription = s3ReferenceDataSourceDescription;
    }

    /**
     * <p>
     * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon
     * Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and
     * populate the in-application reference table.
     * </p>
     * 
     * @return Provides the S3 bucket name, the object key name that contains the reference data. It also provides the
     *         Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3
     *         object and populate the in-application reference table.
     */

    public S3ReferenceDataSourceDescription getS3ReferenceDataSourceDescription() {
        return this.s3ReferenceDataSourceDescription;
    }

    /**
     * <p>
     * Provides the S3 bucket name, the object key name that contains the reference data. It also provides the Amazon
     * Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3 object and
     * populate the in-application reference table.
     * </p>
     * 
     * @param s3ReferenceDataSourceDescription
     *        Provides the S3 bucket name, the object key name that contains the reference data. It also provides the
     *        Amazon Resource Name (ARN) of the IAM role that Amazon Kinesis Analytics can assume to read the Amazon S3
     *        object and populate the in-application reference table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceDescription withS3ReferenceDataSourceDescription(S3ReferenceDataSourceDescription s3ReferenceDataSourceDescription) {
        setS3ReferenceDataSourceDescription(s3ReferenceDataSourceDescription);
        return this;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     * 
     * @param referenceSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns created in the in-application stream.
     */

    public void setReferenceSchema(SourceSchema referenceSchema) {
        this.referenceSchema = referenceSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     * 
     * @return Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *         columns created in the in-application stream.
     */

    public SourceSchema getReferenceSchema() {
        return this.referenceSchema;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     * 
     * @param referenceSchema
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns created in the in-application stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceDescription withReferenceSchema(SourceSchema referenceSchema) {
        setReferenceSchema(referenceSchema);
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
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getS3ReferenceDataSourceDescription() != null)
            sb.append("S3ReferenceDataSourceDescription: ").append(getS3ReferenceDataSourceDescription()).append(",");
        if (getReferenceSchema() != null)
            sb.append("ReferenceSchema: ").append(getReferenceSchema());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceDataSourceDescription == false)
            return false;
        ReferenceDataSourceDescription other = (ReferenceDataSourceDescription) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getS3ReferenceDataSourceDescription() == null ^ this.getS3ReferenceDataSourceDescription() == null)
            return false;
        if (other.getS3ReferenceDataSourceDescription() != null
                && other.getS3ReferenceDataSourceDescription().equals(this.getS3ReferenceDataSourceDescription()) == false)
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

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getS3ReferenceDataSourceDescription() == null) ? 0 : getS3ReferenceDataSourceDescription().hashCode());
        hashCode = prime * hashCode + ((getReferenceSchema() == null) ? 0 : getReferenceSchema().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceDataSourceDescription clone() {
        try {
            return (ReferenceDataSourceDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.ReferenceDataSourceDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
