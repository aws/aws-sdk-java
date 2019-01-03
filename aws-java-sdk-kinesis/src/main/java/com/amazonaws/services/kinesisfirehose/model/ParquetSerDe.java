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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A serializer to use for converting data to the Parquet format before storing it in Amazon S3. For more information,
 * see <a href="https://parquet.apache.org/documentation/latest/">Apache Parquet</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/ParquetSerDe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ParquetSerDe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon
     * S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this
     * value for padding calculations.
     * </p>
     */
    private Integer blockSizeBytes;
    /**
     * <p>
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
     * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * </p>
     */
    private Integer pageSizeBytes;
    /**
     * <p>
     * The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     * <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use <code>SNAPPY</code>
     * for higher decompression speed. Use <code>GZIP</code> if the compression ration is more important than speed.
     * </p>
     */
    private String compression;
    /**
     * <p>
     * Indicates whether to enable dictionary compression.
     * </p>
     */
    private Boolean enableDictionaryCompression;
    /**
     * <p>
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS
     * before querying. The default is 0.
     * </p>
     */
    private Integer maxPaddingBytes;
    /**
     * <p>
     * Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>. The
     * default is <code>V1</code>.
     * </p>
     */
    private String writerVersion;

    /**
     * <p>
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon
     * S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this
     * value for padding calculations.
     * </p>
     * 
     * @param blockSizeBytes
     *        The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from
     *        Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose
     *        uses this value for padding calculations.
     */

    public void setBlockSizeBytes(Integer blockSizeBytes) {
        this.blockSizeBytes = blockSizeBytes;
    }

    /**
     * <p>
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon
     * S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this
     * value for padding calculations.
     * </p>
     * 
     * @return The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from
     *         Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data
     *         Firehose uses this value for padding calculations.
     */

    public Integer getBlockSizeBytes() {
        return this.blockSizeBytes;
    }

    /**
     * <p>
     * The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from Amazon
     * S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose uses this
     * value for padding calculations.
     * </p>
     * 
     * @param blockSizeBytes
     *        The Hadoop Distributed File System (HDFS) block size. This is useful if you intend to copy the data from
     *        Amazon S3 to HDFS before querying. The default is 256 MiB and the minimum is 64 MiB. Kinesis Data Firehose
     *        uses this value for padding calculations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParquetSerDe withBlockSizeBytes(Integer blockSizeBytes) {
        setBlockSizeBytes(blockSizeBytes);
        return this;
    }

    /**
     * <p>
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
     * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * </p>
     * 
     * @param pageSizeBytes
     *        The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit
     *        (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     */

    public void setPageSizeBytes(Integer pageSizeBytes) {
        this.pageSizeBytes = pageSizeBytes;
    }

    /**
     * <p>
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
     * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * </p>
     * 
     * @return The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit
     *         (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     */

    public Integer getPageSizeBytes() {
        return this.pageSizeBytes;
    }

    /**
     * <p>
     * The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit (in terms
     * of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * </p>
     * 
     * @param pageSizeBytes
     *        The Parquet page size. Column chunks are divided into pages. A page is conceptually an indivisible unit
     *        (in terms of compression and encoding). The minimum value is 64 KiB and the default is 1 MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParquetSerDe withPageSizeBytes(Integer pageSizeBytes) {
        setPageSizeBytes(pageSizeBytes);
        return this;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     * <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use <code>SNAPPY</code>
     * for higher decompression speed. Use <code>GZIP</code> if the compression ration is more important than speed.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     *        <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use
     *        <code>SNAPPY</code> for higher decompression speed. Use <code>GZIP</code> if the compression ration is
     *        more important than speed.
     * @see ParquetCompression
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     * <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use <code>SNAPPY</code>
     * for higher decompression speed. Use <code>GZIP</code> if the compression ration is more important than speed.
     * </p>
     * 
     * @return The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     *         <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use
     *         <code>SNAPPY</code> for higher decompression speed. Use <code>GZIP</code> if the compression ration is
     *         more important than speed.
     * @see ParquetCompression
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     * <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use <code>SNAPPY</code>
     * for higher decompression speed. Use <code>GZIP</code> if the compression ration is more important than speed.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     *        <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use
     *        <code>SNAPPY</code> for higher decompression speed. Use <code>GZIP</code> if the compression ration is
     *        more important than speed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetCompression
     */

    public ParquetSerDe withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     * <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use <code>SNAPPY</code>
     * for higher decompression speed. Use <code>GZIP</code> if the compression ration is more important than speed.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The possible values are <code>UNCOMPRESSED</code>,
     *        <code>SNAPPY</code>, and <code>GZIP</code>, with the default being <code>SNAPPY</code>. Use
     *        <code>SNAPPY</code> for higher decompression speed. Use <code>GZIP</code> if the compression ration is
     *        more important than speed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetCompression
     */

    public ParquetSerDe withCompression(ParquetCompression compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable dictionary compression.
     * </p>
     * 
     * @param enableDictionaryCompression
     *        Indicates whether to enable dictionary compression.
     */

    public void setEnableDictionaryCompression(Boolean enableDictionaryCompression) {
        this.enableDictionaryCompression = enableDictionaryCompression;
    }

    /**
     * <p>
     * Indicates whether to enable dictionary compression.
     * </p>
     * 
     * @return Indicates whether to enable dictionary compression.
     */

    public Boolean getEnableDictionaryCompression() {
        return this.enableDictionaryCompression;
    }

    /**
     * <p>
     * Indicates whether to enable dictionary compression.
     * </p>
     * 
     * @param enableDictionaryCompression
     *        Indicates whether to enable dictionary compression.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParquetSerDe withEnableDictionaryCompression(Boolean enableDictionaryCompression) {
        setEnableDictionaryCompression(enableDictionaryCompression);
        return this;
    }

    /**
     * <p>
     * Indicates whether to enable dictionary compression.
     * </p>
     * 
     * @return Indicates whether to enable dictionary compression.
     */

    public Boolean isEnableDictionaryCompression() {
        return this.enableDictionaryCompression;
    }

    /**
     * <p>
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS
     * before querying. The default is 0.
     * </p>
     * 
     * @param maxPaddingBytes
     *        The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to
     *        HDFS before querying. The default is 0.
     */

    public void setMaxPaddingBytes(Integer maxPaddingBytes) {
        this.maxPaddingBytes = maxPaddingBytes;
    }

    /**
     * <p>
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS
     * before querying. The default is 0.
     * </p>
     * 
     * @return The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to
     *         HDFS before querying. The default is 0.
     */

    public Integer getMaxPaddingBytes() {
        return this.maxPaddingBytes;
    }

    /**
     * <p>
     * The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to HDFS
     * before querying. The default is 0.
     * </p>
     * 
     * @param maxPaddingBytes
     *        The maximum amount of padding to apply. This is useful if you intend to copy the data from Amazon S3 to
     *        HDFS before querying. The default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ParquetSerDe withMaxPaddingBytes(Integer maxPaddingBytes) {
        setMaxPaddingBytes(maxPaddingBytes);
        return this;
    }

    /**
     * <p>
     * Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>. The
     * default is <code>V1</code>.
     * </p>
     * 
     * @param writerVersion
     *        Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>
     *        . The default is <code>V1</code>.
     * @see ParquetWriterVersion
     */

    public void setWriterVersion(String writerVersion) {
        this.writerVersion = writerVersion;
    }

    /**
     * <p>
     * Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>. The
     * default is <code>V1</code>.
     * </p>
     * 
     * @return Indicates the version of row format to output. The possible values are <code>V1</code> and
     *         <code>V2</code>. The default is <code>V1</code>.
     * @see ParquetWriterVersion
     */

    public String getWriterVersion() {
        return this.writerVersion;
    }

    /**
     * <p>
     * Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>. The
     * default is <code>V1</code>.
     * </p>
     * 
     * @param writerVersion
     *        Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>
     *        . The default is <code>V1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetWriterVersion
     */

    public ParquetSerDe withWriterVersion(String writerVersion) {
        setWriterVersion(writerVersion);
        return this;
    }

    /**
     * <p>
     * Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>. The
     * default is <code>V1</code>.
     * </p>
     * 
     * @param writerVersion
     *        Indicates the version of row format to output. The possible values are <code>V1</code> and <code>V2</code>
     *        . The default is <code>V1</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetWriterVersion
     */

    public ParquetSerDe withWriterVersion(ParquetWriterVersion writerVersion) {
        this.writerVersion = writerVersion.toString();
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
        if (getBlockSizeBytes() != null)
            sb.append("BlockSizeBytes: ").append(getBlockSizeBytes()).append(",");
        if (getPageSizeBytes() != null)
            sb.append("PageSizeBytes: ").append(getPageSizeBytes()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getEnableDictionaryCompression() != null)
            sb.append("EnableDictionaryCompression: ").append(getEnableDictionaryCompression()).append(",");
        if (getMaxPaddingBytes() != null)
            sb.append("MaxPaddingBytes: ").append(getMaxPaddingBytes()).append(",");
        if (getWriterVersion() != null)
            sb.append("WriterVersion: ").append(getWriterVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ParquetSerDe == false)
            return false;
        ParquetSerDe other = (ParquetSerDe) obj;
        if (other.getBlockSizeBytes() == null ^ this.getBlockSizeBytes() == null)
            return false;
        if (other.getBlockSizeBytes() != null && other.getBlockSizeBytes().equals(this.getBlockSizeBytes()) == false)
            return false;
        if (other.getPageSizeBytes() == null ^ this.getPageSizeBytes() == null)
            return false;
        if (other.getPageSizeBytes() != null && other.getPageSizeBytes().equals(this.getPageSizeBytes()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getEnableDictionaryCompression() == null ^ this.getEnableDictionaryCompression() == null)
            return false;
        if (other.getEnableDictionaryCompression() != null && other.getEnableDictionaryCompression().equals(this.getEnableDictionaryCompression()) == false)
            return false;
        if (other.getMaxPaddingBytes() == null ^ this.getMaxPaddingBytes() == null)
            return false;
        if (other.getMaxPaddingBytes() != null && other.getMaxPaddingBytes().equals(this.getMaxPaddingBytes()) == false)
            return false;
        if (other.getWriterVersion() == null ^ this.getWriterVersion() == null)
            return false;
        if (other.getWriterVersion() != null && other.getWriterVersion().equals(this.getWriterVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockSizeBytes() == null) ? 0 : getBlockSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getPageSizeBytes() == null) ? 0 : getPageSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getEnableDictionaryCompression() == null) ? 0 : getEnableDictionaryCompression().hashCode());
        hashCode = prime * hashCode + ((getMaxPaddingBytes() == null) ? 0 : getMaxPaddingBytes().hashCode());
        hashCode = prime * hashCode + ((getWriterVersion() == null) ? 0 : getWriterVersion().hashCode());
        return hashCode;
    }

    @Override
    public ParquetSerDe clone() {
        try {
            return (ParquetSerDe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.ParquetSerDeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
