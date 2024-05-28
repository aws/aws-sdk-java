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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon S3 bucket where the Amazon Web Services IoT FleetWise campaign sends data. Amazon S3 is an object storage
 * service that stores data as objects within buckets. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/creating-buckets-s3.html">Creating, configuring, and
 * working with Amazon S3 buckets</a> in the <i>Amazon Simple Storage Service User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/S3Config" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3Config implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     */
    private String bucketArn;
    /**
     * <p>
     * Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet or JSON
     * format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can reduce
     * costs. This option is selected by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON - Store data in a standard text-based JSON file format.
     * </p>
     * </li>
     * </ul>
     */
    private String dataFormat;
    /**
     * <p>
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which can
     * optimize the cost of data storage.
     * </p>
     */
    private String storageCompressionFormat;
    /**
     * <p>
     * (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and before the
     * object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * <p>
     * By default, Amazon Web Services IoT FleetWise sets the prefix
     * <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3. You can
     * enter a prefix to append it to this default prefix. For example, if you enter the prefix <code>vehicles</code>,
     * the prefix will be <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     */

    public void setBucketArn(String bucketArn) {
        this.bucketArn = bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     */

    public String getBucketArn() {
        return this.bucketArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * </p>
     * 
     * @param bucketArn
     *        The Amazon Resource Name (ARN) of the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withBucketArn(String bucketArn) {
        setBucketArn(bucketArn);
        return this;
    }

    /**
     * <p>
     * Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet or JSON
     * format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can reduce
     * costs. This option is selected by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON - Store data in a standard text-based JSON file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet
     *        or JSON format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can
     *        reduce costs. This option is selected by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JSON - Store data in a standard text-based JSON file format.
     *        </p>
     *        </li>
     * @see DataFormat
     */

    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    /**
     * <p>
     * Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet or JSON
     * format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can reduce
     * costs. This option is selected by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON - Store data in a standard text-based JSON file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet
     *         or JSON format.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and
     *         can reduce costs. This option is selected by default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         JSON - Store data in a standard text-based JSON file format.
     *         </p>
     *         </li>
     * @see DataFormat
     */

    public String getDataFormat() {
        return this.dataFormat;
    }

    /**
     * <p>
     * Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet or JSON
     * format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can reduce
     * costs. This option is selected by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON - Store data in a standard text-based JSON file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet
     *        or JSON format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can
     *        reduce costs. This option is selected by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JSON - Store data in a standard text-based JSON file format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public S3Config withDataFormat(String dataFormat) {
        setDataFormat(dataFormat);
        return this;
    }

    /**
     * <p>
     * Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet or JSON
     * format.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can reduce
     * costs. This option is selected by default.
     * </p>
     * </li>
     * <li>
     * <p>
     * JSON - Store data in a standard text-based JSON file format.
     * </p>
     * </li>
     * </ul>
     * 
     * @param dataFormat
     *        Specify the format that files are saved in the Amazon S3 bucket. You can save files in an Apache Parquet
     *        or JSON format.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Parquet - Store data in a columnar storage file format. Parquet is optimal for fast data retrieval and can
     *        reduce costs. This option is selected by default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        JSON - Store data in a standard text-based JSON file format.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataFormat
     */

    public S3Config withDataFormat(DataFormat dataFormat) {
        this.dataFormat = dataFormat.toString();
        return this;
    }

    /**
     * <p>
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which can
     * optimize the cost of data storage.
     * </p>
     * 
     * @param storageCompressionFormat
     *        By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which
     *        can optimize the cost of data storage.
     * @see StorageCompressionFormat
     */

    public void setStorageCompressionFormat(String storageCompressionFormat) {
        this.storageCompressionFormat = storageCompressionFormat;
    }

    /**
     * <p>
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which can
     * optimize the cost of data storage.
     * </p>
     * 
     * @return By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which
     *         can optimize the cost of data storage.
     * @see StorageCompressionFormat
     */

    public String getStorageCompressionFormat() {
        return this.storageCompressionFormat;
    }

    /**
     * <p>
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which can
     * optimize the cost of data storage.
     * </p>
     * 
     * @param storageCompressionFormat
     *        By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which
     *        can optimize the cost of data storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageCompressionFormat
     */

    public S3Config withStorageCompressionFormat(String storageCompressionFormat) {
        setStorageCompressionFormat(storageCompressionFormat);
        return this;
    }

    /**
     * <p>
     * By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which can
     * optimize the cost of data storage.
     * </p>
     * 
     * @param storageCompressionFormat
     *        By default, stored data is compressed as a .gzip file. Compressed files have a reduced file size, which
     *        can optimize the cost of data storage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageCompressionFormat
     */

    public S3Config withStorageCompressionFormat(StorageCompressionFormat storageCompressionFormat) {
        this.storageCompressionFormat = storageCompressionFormat.toString();
        return this;
    }

    /**
     * <p>
     * (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and before the
     * object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * <p>
     * By default, Amazon Web Services IoT FleetWise sets the prefix
     * <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3. You can
     * enter a prefix to append it to this default prefix. For example, if you enter the prefix <code>vehicles</code>,
     * the prefix will be <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     * </p>
     * 
     * @param prefix
     *        (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and
     *        before the object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.</p>
     *        <p>
     *        By default, Amazon Web Services IoT FleetWise sets the prefix
     *        <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3.
     *        You can enter a prefix to append it to this default prefix. For example, if you enter the prefix
     *        <code>vehicles</code>, the prefix will be
     *        <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     */

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and before the
     * object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * <p>
     * By default, Amazon Web Services IoT FleetWise sets the prefix
     * <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3. You can
     * enter a prefix to append it to this default prefix. For example, if you enter the prefix <code>vehicles</code>,
     * the prefix will be <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     * </p>
     * 
     * @return (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and
     *         before the object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *         prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.</p>
     *         <p>
     *         By default, Amazon Web Services IoT FleetWise sets the prefix
     *         <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3.
     *         You can enter a prefix to append it to this default prefix. For example, if you enter the prefix
     *         <code>vehicles</code>, the prefix will be
     *         <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     */

    public String getPrefix() {
        return this.prefix;
    }

    /**
     * <p>
     * (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and before the
     * object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     * prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.
     * </p>
     * <p>
     * By default, Amazon Web Services IoT FleetWise sets the prefix
     * <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3. You can
     * enter a prefix to append it to this default prefix. For example, if you enter the prefix <code>vehicles</code>,
     * the prefix will be <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     * </p>
     * 
     * @param prefix
     *        (Optional) Enter an S3 bucket prefix. The prefix is the string of characters after the bucket name and
     *        before the object name. You can use the prefix to organize data stored in Amazon S3 buckets. For more
     *        information, see <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html">Organizing objects using
     *        prefixes</a> in the <i>Amazon Simple Storage Service User Guide</i>.</p>
     *        <p>
     *        By default, Amazon Web Services IoT FleetWise sets the prefix
     *        <code>processed-data/year=YY/month=MM/date=DD/hour=HH/</code> (in UTC) to data it delivers to Amazon S3.
     *        You can enter a prefix to append it to this default prefix. For example, if you enter the prefix
     *        <code>vehicles</code>, the prefix will be
     *        <code>vehicles/processed-data/year=YY/month=MM/date=DD/hour=HH/</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3Config withPrefix(String prefix) {
        setPrefix(prefix);
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
        if (getBucketArn() != null)
            sb.append("BucketArn: ").append(getBucketArn()).append(",");
        if (getDataFormat() != null)
            sb.append("DataFormat: ").append(getDataFormat()).append(",");
        if (getStorageCompressionFormat() != null)
            sb.append("StorageCompressionFormat: ").append(getStorageCompressionFormat()).append(",");
        if (getPrefix() != null)
            sb.append("Prefix: ").append(getPrefix());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3Config == false)
            return false;
        S3Config other = (S3Config) obj;
        if (other.getBucketArn() == null ^ this.getBucketArn() == null)
            return false;
        if (other.getBucketArn() != null && other.getBucketArn().equals(this.getBucketArn()) == false)
            return false;
        if (other.getDataFormat() == null ^ this.getDataFormat() == null)
            return false;
        if (other.getDataFormat() != null && other.getDataFormat().equals(this.getDataFormat()) == false)
            return false;
        if (other.getStorageCompressionFormat() == null ^ this.getStorageCompressionFormat() == null)
            return false;
        if (other.getStorageCompressionFormat() != null && other.getStorageCompressionFormat().equals(this.getStorageCompressionFormat()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucketArn() == null) ? 0 : getBucketArn().hashCode());
        hashCode = prime * hashCode + ((getDataFormat() == null) ? 0 : getDataFormat().hashCode());
        hashCode = prime * hashCode + ((getStorageCompressionFormat() == null) ? 0 : getStorageCompressionFormat().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        return hashCode;
    }

    @Override
    public S3Config clone() {
        try {
            return (S3Config) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.S3ConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
