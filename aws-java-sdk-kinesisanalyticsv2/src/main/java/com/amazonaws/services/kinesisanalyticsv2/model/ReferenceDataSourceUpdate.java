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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When you update a reference data source configuration for a SQL-based Amazon Kinesis Data Analytics application, this
 * object provides all the updated values (such as the source bucket name and object key name), the in-application table
 * name that is created, and updated mapping information that maps the data in the Amazon S3 object to the
 * in-application reference table that is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/ReferenceDataSourceUpdate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReferenceDataSourceUpdate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a> operation
     * to get this value.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The in-application table name that is created by this update.
     * </p>
     */
    private String tableNameUpdate;
    /**
     * <p>
     * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the
     * Amazon S3 object on your behalf and populate the in-application reference table.
     * </p>
     */
    private S3ReferenceDataSourceUpdate s3ReferenceDataSourceUpdate;
    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     */
    private SourceSchema referenceSchemaUpdate;

    /**
     * <p>
     * The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a> operation
     * to get this value.
     * </p>
     * 
     * @param referenceId
     *        The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a>
     *        operation to get this value.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a> operation
     * to get this value.
     * </p>
     * 
     * @return The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a>
     *         operation to get this value.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a> operation
     * to get this value.
     * </p>
     * 
     * @param referenceId
     *        The ID of the reference data source that is being updated. You can use the <a>DescribeApplication</a>
     *        operation to get this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceUpdate withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The in-application table name that is created by this update.
     * </p>
     * 
     * @param tableNameUpdate
     *        The in-application table name that is created by this update.
     */

    public void setTableNameUpdate(String tableNameUpdate) {
        this.tableNameUpdate = tableNameUpdate;
    }

    /**
     * <p>
     * The in-application table name that is created by this update.
     * </p>
     * 
     * @return The in-application table name that is created by this update.
     */

    public String getTableNameUpdate() {
        return this.tableNameUpdate;
    }

    /**
     * <p>
     * The in-application table name that is created by this update.
     * </p>
     * 
     * @param tableNameUpdate
     *        The in-application table name that is created by this update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceUpdate withTableNameUpdate(String tableNameUpdate) {
        setTableNameUpdate(tableNameUpdate);
        return this;
    }

    /**
     * <p>
     * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the
     * Amazon S3 object on your behalf and populate the in-application reference table.
     * </p>
     * 
     * @param s3ReferenceDataSourceUpdate
     *        Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read
     *        the Amazon S3 object on your behalf and populate the in-application reference table.
     */

    public void setS3ReferenceDataSourceUpdate(S3ReferenceDataSourceUpdate s3ReferenceDataSourceUpdate) {
        this.s3ReferenceDataSourceUpdate = s3ReferenceDataSourceUpdate;
    }

    /**
     * <p>
     * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the
     * Amazon S3 object on your behalf and populate the in-application reference table.
     * </p>
     * 
     * @return Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to
     *         read the Amazon S3 object on your behalf and populate the in-application reference table.
     */

    public S3ReferenceDataSourceUpdate getS3ReferenceDataSourceUpdate() {
        return this.s3ReferenceDataSourceUpdate;
    }

    /**
     * <p>
     * Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read the
     * Amazon S3 object on your behalf and populate the in-application reference table.
     * </p>
     * 
     * @param s3ReferenceDataSourceUpdate
     *        Describes the S3 bucket name, object key name, and IAM role that Kinesis Data Analytics can assume to read
     *        the Amazon S3 object on your behalf and populate the in-application reference table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceUpdate withS3ReferenceDataSourceUpdate(S3ReferenceDataSourceUpdate s3ReferenceDataSourceUpdate) {
        setS3ReferenceDataSourceUpdate(s3ReferenceDataSourceUpdate);
        return this;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     * 
     * @param referenceSchemaUpdate
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns created in the in-application stream.
     */

    public void setReferenceSchemaUpdate(SourceSchema referenceSchemaUpdate) {
        this.referenceSchemaUpdate = referenceSchemaUpdate;
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

    public SourceSchema getReferenceSchemaUpdate() {
        return this.referenceSchemaUpdate;
    }

    /**
     * <p>
     * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns
     * created in the in-application stream.
     * </p>
     * 
     * @param referenceSchemaUpdate
     *        Describes the format of the data in the streaming source, and how each data element maps to corresponding
     *        columns created in the in-application stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReferenceDataSourceUpdate withReferenceSchemaUpdate(SourceSchema referenceSchemaUpdate) {
        setReferenceSchemaUpdate(referenceSchemaUpdate);
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
        if (getTableNameUpdate() != null)
            sb.append("TableNameUpdate: ").append(getTableNameUpdate()).append(",");
        if (getS3ReferenceDataSourceUpdate() != null)
            sb.append("S3ReferenceDataSourceUpdate: ").append(getS3ReferenceDataSourceUpdate()).append(",");
        if (getReferenceSchemaUpdate() != null)
            sb.append("ReferenceSchemaUpdate: ").append(getReferenceSchemaUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReferenceDataSourceUpdate == false)
            return false;
        ReferenceDataSourceUpdate other = (ReferenceDataSourceUpdate) obj;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getTableNameUpdate() == null ^ this.getTableNameUpdate() == null)
            return false;
        if (other.getTableNameUpdate() != null && other.getTableNameUpdate().equals(this.getTableNameUpdate()) == false)
            return false;
        if (other.getS3ReferenceDataSourceUpdate() == null ^ this.getS3ReferenceDataSourceUpdate() == null)
            return false;
        if (other.getS3ReferenceDataSourceUpdate() != null && other.getS3ReferenceDataSourceUpdate().equals(this.getS3ReferenceDataSourceUpdate()) == false)
            return false;
        if (other.getReferenceSchemaUpdate() == null ^ this.getReferenceSchemaUpdate() == null)
            return false;
        if (other.getReferenceSchemaUpdate() != null && other.getReferenceSchemaUpdate().equals(this.getReferenceSchemaUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getTableNameUpdate() == null) ? 0 : getTableNameUpdate().hashCode());
        hashCode = prime * hashCode + ((getS3ReferenceDataSourceUpdate() == null) ? 0 : getS3ReferenceDataSourceUpdate().hashCode());
        hashCode = prime * hashCode + ((getReferenceSchemaUpdate() == null) ? 0 : getReferenceSchemaUpdate().hashCode());
        return hashCode;
    }

    @Override
    public ReferenceDataSourceUpdate clone() {
        try {
            return (ReferenceDataSourceUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisanalyticsv2.model.transform.ReferenceDataSourceUpdateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
