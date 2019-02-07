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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration object for Lustre file systems used in the <code>CreateFileSystem</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/CreateFileSystemLustreConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFileSystemLustreConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     */
    private String weeklyMaintenanceStartTime;
    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     */
    private String importPath;
    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     */
    private String exportPath;
    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     */
    private Integer importedFileChunkSize;

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred time to perform weekly maintenance, in the UTC time zone.
     */

    public void setWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        this.weeklyMaintenanceStartTime = weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @return The preferred time to perform weekly maintenance, in the UTC time zone.
     */

    public String getWeeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     * <p>
     * The preferred time to perform weekly maintenance, in the UTC time zone.
     * </p>
     * 
     * @param weeklyMaintenanceStartTime
     *        The preferred time to perform weekly maintenance, in the UTC time zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withWeeklyMaintenanceStartTime(String weeklyMaintenanceStartTime) {
        setWeeklyMaintenanceStartTime(weeklyMaintenanceStartTime);
        return this;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @param importPath
     *        (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *        repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be
     *        mapped to the root of the Amazon S3 bucket you select. An example is
     *        <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *        only object keys with that prefix are loaded into the file system.
     */

    public void setImportPath(String importPath) {
        this.importPath = importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @return (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *         repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will
     *         be mapped to the root of the Amazon S3 bucket you select. An example is
     *         <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *         only object keys with that prefix are loaded into the file system.
     */

    public String getImportPath() {
        return this.importPath;
    }

    /**
     * <p>
     * (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     * repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be mapped
     * to the root of the Amazon S3 bucket you select. An example is <code>s3://import-bucket/optional-prefix</code>. If
     * you specify a prefix after the Amazon S3 bucket name, only object keys with that prefix are loaded into the file
     * system.
     * </p>
     * 
     * @param importPath
     *        (Optional) The path to the Amazon S3 bucket (including the optional prefix) that you're using as the data
     *        repository for your Amazon FSx for Lustre file system. The root of your FSx for Lustre file system will be
     *        mapped to the root of the Amazon S3 bucket you select. An example is
     *        <code>s3://import-bucket/optional-prefix</code>. If you specify a prefix after the Amazon S3 bucket name,
     *        only object keys with that prefix are loaded into the file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withImportPath(String importPath) {
        setImportPath(importPath);
        return this;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @param exportPath
     *        (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *        use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *        and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *        <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *        <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for example
     *        <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *        <p>
     *        The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If
     *        you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *        system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *        export. If you provide a custom prefix in the export path, such as
     *        <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *        system to that export prefix in the Amazon S3 bucket.
     */

    public void setExportPath(String exportPath) {
        this.exportPath = exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @return (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *         use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *         and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *         <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *         <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for
     *         example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *         <p>
     *         The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>.
     *         If you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *         system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *         export. If you provide a custom prefix in the export path, such as
     *         <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *         system to that export prefix in the Amazon S3 bucket.
     */

    public String getExportPath() {
        return this.exportPath;
    }

    /**
     * <p>
     * (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must use the
     * same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new and changed
     * data is to be exported from your Amazon FSx for Lustre file system. If an <code>ExportPath</code> value is not
     * provided, Amazon FSx sets a default export path, <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>.
     * The timestamp is in UTC format, for example <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.
     * </p>
     * <p>
     * The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If you
     * only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file system objects
     * to S3 bucket objects. This mapping means that the input data in S3 is overwritten on export. If you provide a
     * custom prefix in the export path, such as <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx
     * exports the contents of your file system to that export prefix in the Amazon S3 bucket.
     * </p>
     * 
     * @param exportPath
     *        (Optional) The path in Amazon S3 where the root of your Amazon FSx file system is exported. The path must
     *        use the same Amazon S3 bucket as specified in ImportPath. You can provide an optional prefix to which new
     *        and changed data is to be exported from your Amazon FSx for Lustre file system. If an
     *        <code>ExportPath</code> value is not provided, Amazon FSx sets a default export path,
     *        <code>s3://import-bucket/FSxLustre[creation-timestamp]</code>. The timestamp is in UTC format, for example
     *        <code>s3://import-bucket/FSxLustre20181105T222312Z</code>.</p>
     *        <p>
     *        The Amazon S3 export bucket must be the same as the import bucket specified by <code>ImportPath</code>. If
     *        you only specify a bucket name, such as <code>s3://import-bucket</code>, you get a 1:1 mapping of file
     *        system objects to S3 bucket objects. This mapping means that the input data in S3 is overwritten on
     *        export. If you provide a custom prefix in the export path, such as
     *        <code>s3://import-bucket/[custom-optional-prefix]</code>, Amazon FSx exports the contents of your file
     *        system to that export prefix in the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withExportPath(String exportPath) {
        setExportPath(exportPath);
        return this;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *        amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *        single file can be striped across is limited by the total number of disks that make up the file
     *        system.</p>
     *        <p>
     *        The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     */

    public void setImportedFileChunkSize(Integer importedFileChunkSize) {
        this.importedFileChunkSize = importedFileChunkSize;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @return (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *         amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *         single file can be striped across is limited by the total number of disks that make up the file
     *         system.</p>
     *         <p>
     *         The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3
     *         objects have a maximum size of 5 TB.
     */

    public Integer getImportedFileChunkSize() {
        return this.importedFileChunkSize;
    }

    /**
     * <p>
     * (Optional) For files imported from a data repository, this value determines the stripe count and maximum amount
     * of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a single file can be
     * striped across is limited by the total number of disks that make up the file system.
     * </p>
     * <p>
     * The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects have a
     * maximum size of 5 TB.
     * </p>
     * 
     * @param importedFileChunkSize
     *        (Optional) For files imported from a data repository, this value determines the stripe count and maximum
     *        amount of data per file (in MiB) stored on a single physical disk. The maximum number of disks that a
     *        single file can be striped across is limited by the total number of disks that make up the file
     *        system.</p>
     *        <p>
     *        The chunk size default is 1,024 MiB (1 GiB) and can go as high as 512,000 MiB (500 GiB). Amazon S3 objects
     *        have a maximum size of 5 TB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFileSystemLustreConfiguration withImportedFileChunkSize(Integer importedFileChunkSize) {
        setImportedFileChunkSize(importedFileChunkSize);
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
        if (getWeeklyMaintenanceStartTime() != null)
            sb.append("WeeklyMaintenanceStartTime: ").append(getWeeklyMaintenanceStartTime()).append(",");
        if (getImportPath() != null)
            sb.append("ImportPath: ").append(getImportPath()).append(",");
        if (getExportPath() != null)
            sb.append("ExportPath: ").append(getExportPath()).append(",");
        if (getImportedFileChunkSize() != null)
            sb.append("ImportedFileChunkSize: ").append(getImportedFileChunkSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFileSystemLustreConfiguration == false)
            return false;
        CreateFileSystemLustreConfiguration other = (CreateFileSystemLustreConfiguration) obj;
        if (other.getWeeklyMaintenanceStartTime() == null ^ this.getWeeklyMaintenanceStartTime() == null)
            return false;
        if (other.getWeeklyMaintenanceStartTime() != null && other.getWeeklyMaintenanceStartTime().equals(this.getWeeklyMaintenanceStartTime()) == false)
            return false;
        if (other.getImportPath() == null ^ this.getImportPath() == null)
            return false;
        if (other.getImportPath() != null && other.getImportPath().equals(this.getImportPath()) == false)
            return false;
        if (other.getExportPath() == null ^ this.getExportPath() == null)
            return false;
        if (other.getExportPath() != null && other.getExportPath().equals(this.getExportPath()) == false)
            return false;
        if (other.getImportedFileChunkSize() == null ^ this.getImportedFileChunkSize() == null)
            return false;
        if (other.getImportedFileChunkSize() != null && other.getImportedFileChunkSize().equals(this.getImportedFileChunkSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWeeklyMaintenanceStartTime() == null) ? 0 : getWeeklyMaintenanceStartTime().hashCode());
        hashCode = prime * hashCode + ((getImportPath() == null) ? 0 : getImportPath().hashCode());
        hashCode = prime * hashCode + ((getExportPath() == null) ? 0 : getExportPath().hashCode());
        hashCode = prime * hashCode + ((getImportedFileChunkSize() == null) ? 0 : getImportedFileChunkSize().hashCode());
        return hashCode;
    }

    @Override
    public CreateFileSystemLustreConfiguration clone() {
        try {
            return (CreateFileSystemLustreConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.CreateFileSystemLustreConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
