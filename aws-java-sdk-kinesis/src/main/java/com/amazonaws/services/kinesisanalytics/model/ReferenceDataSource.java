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
 * Describes the reference data source by providing the source information (S3 bucket name and object key name), the
 * resulting in-application table name that is created, and the necessary schema to map the data elements in the Amazon
 * S3 object to the in-application table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalytics-2015-08-14/ReferenceDataSource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceDataSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the in-application table to create.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis
     * Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference
     * data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data
     * into your application.
     * </p>
     */
    private S3ReferenceDataSource s3ReferenceDataSource;
    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     */
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
     * <p>
     * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis
     * Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference
     * data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data
     * into your application.
     * </p>
     * 
     * @param s3ReferenceDataSource
     *        Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon
     *        Kinesis Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application
     *        loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to
     *        trigger reloading of data into your application.
     */

    public void setS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
        this.s3ReferenceDataSource = s3ReferenceDataSource;
    }

    /**
     * <p>
     * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis
     * Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference
     * data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data
     * into your application.
     * </p>
     * 
     * @return Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon
     *         Kinesis Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application
     *         loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to
     *         trigger reloading of data into your application.
     */

    public S3ReferenceDataSource getS3ReferenceDataSource() {
        return this.s3ReferenceDataSource;
    }

    /**
     * <p>
     * Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon Kinesis
     * Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application loads reference
     * data only once. If the data changes, you call the <a>UpdateApplication</a> operation to trigger reloading of data
     * into your application.
     * </p>
     * 
     * @param s3ReferenceDataSource
     *        Identifies the S3 bucket and object that contains the reference data. Also identifies the IAM role Amazon
     *        Kinesis Analytics can assume to read this object on your behalf. An Amazon Kinesis Analytics application
     *        loads reference data only once. If the data changes, you call the <a>UpdateApplication</a> operation to
     *        trigger reloading of data into your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSource withS3ReferenceDataSource(S3ReferenceDataSource s3ReferenceDataSource) {
        setS3ReferenceDataSource(s3ReferenceDataSource);
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

    public ReferenceDataSource withReferenceSchema(SourceSchema referenceSchema) {
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
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getS3ReferenceDataSource() != null)
            sb.append("S3ReferenceDataSource: ").append(getS3ReferenceDataSource()).append(",");
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalytics.model.transform.ReferenceDataSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
