/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StartExportTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is to be exported to.
     * </p>
     */
    private String exportTaskIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     */
    private String sourceArn;
    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     * </p>
     */
    private String iamRoleArn;
    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon
     * Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used
     * for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     */
    private String s3Prefix;
    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported.
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<String> exportOnly;

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is to be exported to.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *        where the snapshot is to be exported to.
     */

    public void setExportTaskIdentifier(String exportTaskIdentifier) {
        this.exportTaskIdentifier = exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is to be exported to.
     * </p>
     * 
     * @return A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *         where the snapshot is to be exported to.
     */

    public String getExportTaskIdentifier() {
        return this.exportTaskIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket where the
     * snapshot is to be exported to.
     * </p>
     * 
     * @param exportTaskIdentifier
     *        A unique identifier for the snapshot export task. This ID isn't an identifier for the Amazon S3 bucket
     *        where the snapshot is to be exported to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withExportTaskIdentifier(String exportTaskIdentifier) {
        setExportTaskIdentifier(exportTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) of the snapshot to export to Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to export the snapshot to.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket to export the snapshot to.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket to export the snapshot to.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket to export the snapshot to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     * </p>
     * 
     * @param iamRoleArn
     *        The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     */

    public void setIamRoleArn(String iamRoleArn) {
        this.iamRoleArn = iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     * </p>
     * 
     * @return The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     */

    public String getIamRoleArn() {
        return this.iamRoleArn;
    }

    /**
     * <p>
     * The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     * </p>
     * 
     * @param iamRoleArn
     *        The name of the IAM role to use for writing to the Amazon S3 bucket when exporting a snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withIamRoleArn(String iamRoleArn) {
        setIamRoleArn(iamRoleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon
     * Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used
     * for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the
     *        Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The
     *        IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon
     * Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used
     * for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @return The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the
     *         Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The
     *         IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS
     *         key.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the Amazon
     * Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The IAM role used
     * for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * </p>
     * 
     * @param kmsKeyId
     *        The ID of the AWS KMS key to use to encrypt the snapshot exported to Amazon S3. The KMS key ID is the
     *        Amazon Resource Name (ARN), the KMS key identifier, or the KMS key alias for the KMS encryption key. The
     *        IAM role used for the snapshot export must have encryption and decryption permissions to use this KMS key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     */

    public void setS3Prefix(String s3Prefix) {
        this.s3Prefix = s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @return The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     */

    public String getS3Prefix() {
        return this.s3Prefix;
    }

    /**
     * <p>
     * The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * </p>
     * 
     * @param s3Prefix
     *        The Amazon S3 bucket prefix to use as the file name and path of the exported snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withS3Prefix(String s3Prefix) {
        setS3Prefix(s3Prefix);
        return this;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported.
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is
     *         exported. Valid values are the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>database</code> - Export all the data of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.table [table-name]</code> - Export a table of the snapshot.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *         valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *         valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *         </p>
     *         </li>
     */

    public java.util.List<String> getExportOnly() {
        if (exportOnly == null) {
            exportOnly = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return exportOnly;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported.
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportOnly
     *        The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is
     *        exported. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     */

    public void setExportOnly(java.util.Collection<String> exportOnly) {
        if (exportOnly == null) {
            this.exportOnly = null;
            return;
        }

        this.exportOnly = new com.amazonaws.internal.SdkInternalList<String>(exportOnly);
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported.
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportOnly(java.util.Collection)} or {@link #withExportOnly(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exportOnly
     *        The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is
     *        exported. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withExportOnly(String... exportOnly) {
        if (this.exportOnly == null) {
            setExportOnly(new com.amazonaws.internal.SdkInternalList<String>(exportOnly.length));
        }
        for (String ele : exportOnly) {
            this.exportOnly.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is exported.
     * Valid values are the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>database</code> - Export all the data of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.table [table-name]</code> - Export a table of the snapshot.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't valid for
     * RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't valid
     * for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     * </p>
     * </li>
     * </ul>
     * 
     * @param exportOnly
     *        The data to be exported from the snapshot. If this parameter is not provided, all the snapshot data is
     *        exported. Valid values are the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>database</code> - Export all the data of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.table [table-name]</code> - Export a table of the snapshot.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema [schema-name]</code> - Export a database schema of the snapshot. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>database.schema.table [table-name]</code> - Export a table of the database schema. This value isn't
     *        valid for RDS for MySQL, RDS for MariaDB, or Aurora MySQL.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withExportOnly(java.util.Collection<String> exportOnly) {
        setExportOnly(exportOnly);
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
        if (getExportTaskIdentifier() != null)
            sb.append("ExportTaskIdentifier: ").append(getExportTaskIdentifier()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn()).append(",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: ").append(getS3BucketName()).append(",");
        if (getIamRoleArn() != null)
            sb.append("IamRoleArn: ").append(getIamRoleArn()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getS3Prefix() != null)
            sb.append("S3Prefix: ").append(getS3Prefix()).append(",");
        if (getExportOnly() != null)
            sb.append("ExportOnly: ").append(getExportOnly());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportTaskRequest == false)
            return false;
        StartExportTaskRequest other = (StartExportTaskRequest) obj;
        if (other.getExportTaskIdentifier() == null ^ this.getExportTaskIdentifier() == null)
            return false;
        if (other.getExportTaskIdentifier() != null && other.getExportTaskIdentifier().equals(this.getExportTaskIdentifier()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getIamRoleArn() == null ^ this.getIamRoleArn() == null)
            return false;
        if (other.getIamRoleArn() != null && other.getIamRoleArn().equals(this.getIamRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getS3Prefix() == null ^ this.getS3Prefix() == null)
            return false;
        if (other.getS3Prefix() != null && other.getS3Prefix().equals(this.getS3Prefix()) == false)
            return false;
        if (other.getExportOnly() == null ^ this.getExportOnly() == null)
            return false;
        if (other.getExportOnly() != null && other.getExportOnly().equals(this.getExportOnly()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportTaskIdentifier() == null) ? 0 : getExportTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        hashCode = prime * hashCode + ((getS3BucketName() == null) ? 0 : getS3BucketName().hashCode());
        hashCode = prime * hashCode + ((getIamRoleArn() == null) ? 0 : getIamRoleArn().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getS3Prefix() == null) ? 0 : getS3Prefix().hashCode());
        hashCode = prime * hashCode + ((getExportOnly() == null) ? 0 : getExportOnly().hashCode());
        return hashCode;
    }

    @Override
    public StartExportTaskRequest clone() {
        return (StartExportTaskRequest) super.clone();
    }

}
