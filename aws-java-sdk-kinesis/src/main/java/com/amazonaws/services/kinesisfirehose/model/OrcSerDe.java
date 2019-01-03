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
 * A serializer to use for converting data to the ORC format before storing it in Amazon S3. For more information, see
 * <a href="https://orc.apache.org/docs/">Apache ORC</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/firehose-2015-08-04/OrcSerDe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrcSerDe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * </p>
     */
    private Integer stripeSizeBytes;
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
     * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     * </p>
     */
    private Integer rowIndexStride;
    /**
     * <p>
     * Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries. This
     * is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     * <code>false</code>.
     * </p>
     */
    private Boolean enablePadding;
    /**
     * <p>
     * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The
     * default value is 0.05, which means 5 percent of stripe size.
     * </p>
     * <p>
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5
     * percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size
     * within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures
     * that no stripe crosses block boundaries and causes remote reads within a node-local task.
     * </p>
     * <p>
     * Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     * </p>
     */
    private Double paddingTolerance;
    /**
     * <p>
     * The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * </p>
     */
    private String compression;
    /**
     * <p>
     * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     * <code>null</code>.
     * </p>
     */
    private java.util.List<String> bloomFilterColumns;
    /**
     * <p>
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default
     * value is 0.05, the minimum is 0, and the maximum is 1.
     * </p>
     */
    private Double bloomFilterFalsePositiveProbability;
    /**
     * <p>
     * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction
     * to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set
     * this threshold to 1.
     * </p>
     */
    private Double dictionaryKeyThreshold;
    /**
     * <p>
     * The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The default
     * is <code>V0_12</code>.
     * </p>
     */
    private String formatVersion;

    /**
     * <p>
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * </p>
     * 
     * @param stripeSizeBytes
     *        The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     */

    public void setStripeSizeBytes(Integer stripeSizeBytes) {
        this.stripeSizeBytes = stripeSizeBytes;
    }

    /**
     * <p>
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * </p>
     * 
     * @return The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     */

    public Integer getStripeSizeBytes() {
        return this.stripeSizeBytes;
    }

    /**
     * <p>
     * The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * </p>
     * 
     * @param stripeSizeBytes
     *        The number of bytes in each stripe. The default is 64 MiB and the minimum is 8 MiB.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withStripeSizeBytes(Integer stripeSizeBytes) {
        setStripeSizeBytes(stripeSizeBytes);
        return this;
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

    public OrcSerDe withBlockSizeBytes(Integer blockSizeBytes) {
        setBlockSizeBytes(blockSizeBytes);
        return this;
    }

    /**
     * <p>
     * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     * </p>
     * 
     * @param rowIndexStride
     *        The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     */

    public void setRowIndexStride(Integer rowIndexStride) {
        this.rowIndexStride = rowIndexStride;
    }

    /**
     * <p>
     * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     * </p>
     * 
     * @return The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     */

    public Integer getRowIndexStride() {
        return this.rowIndexStride;
    }

    /**
     * <p>
     * The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     * </p>
     * 
     * @param rowIndexStride
     *        The number of rows between index entries. The default is 10,000 and the minimum is 1,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withRowIndexStride(Integer rowIndexStride) {
        setRowIndexStride(rowIndexStride);
        return this;
    }

    /**
     * <p>
     * Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries. This
     * is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param enablePadding
     *        Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries.
     *        This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     *        <code>false</code>.
     */

    public void setEnablePadding(Boolean enablePadding) {
        this.enablePadding = enablePadding;
    }

    /**
     * <p>
     * Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries. This
     * is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block
     *         boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     *         default is <code>false</code>.
     */

    public Boolean getEnablePadding() {
        return this.enablePadding;
    }

    /**
     * <p>
     * Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries. This
     * is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     * <code>false</code>.
     * </p>
     * 
     * @param enablePadding
     *        Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries.
     *        This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withEnablePadding(Boolean enablePadding) {
        setEnablePadding(enablePadding);
        return this;
    }

    /**
     * <p>
     * Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block boundaries. This
     * is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The default is
     * <code>false</code>.
     * </p>
     * 
     * @return Set this to <code>true</code> to indicate that you want stripes to be padded to the HDFS block
     *         boundaries. This is useful if you intend to copy the data from Amazon S3 to HDFS before querying. The
     *         default is <code>false</code>.
     */

    public Boolean isEnablePadding() {
        return this.enablePadding;
    }

    /**
     * <p>
     * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The
     * default value is 0.05, which means 5 percent of stripe size.
     * </p>
     * <p>
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5
     * percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size
     * within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures
     * that no stripe crosses block boundaries and causes remote reads within a node-local task.
     * </p>
     * <p>
     * Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     * </p>
     * 
     * @param paddingTolerance
     *        A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe
     *        size. The default value is 0.05, which means 5 percent of stripe size.</p>
     *        <p>
     *        For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance
     *        of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the
     *        available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that
     *        space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local
     *        task.
     *        </p>
     *        <p>
     *        Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     */

    public void setPaddingTolerance(Double paddingTolerance) {
        this.paddingTolerance = paddingTolerance;
    }

    /**
     * <p>
     * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The
     * default value is 0.05, which means 5 percent of stripe size.
     * </p>
     * <p>
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5
     * percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size
     * within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures
     * that no stripe crosses block boundaries and causes remote reads within a node-local task.
     * </p>
     * <p>
     * Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     * </p>
     * 
     * @return A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe
     *         size. The default value is 0.05, which means 5 percent of stripe size.</p>
     *         <p>
     *         For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance
     *         of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the
     *         available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within
     *         that space. This ensures that no stripe crosses block boundaries and causes remote reads within a
     *         node-local task.
     *         </p>
     *         <p>
     *         Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     */

    public Double getPaddingTolerance() {
        return this.paddingTolerance;
    }

    /**
     * <p>
     * A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe size. The
     * default value is 0.05, which means 5 percent of stripe size.
     * </p>
     * <p>
     * For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance of 5
     * percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the available size
     * within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that space. This ensures
     * that no stripe crosses block boundaries and causes remote reads within a node-local task.
     * </p>
     * <p>
     * Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     * </p>
     * 
     * @param paddingTolerance
     *        A number between 0 and 1 that defines the tolerance for block padding as a decimal fraction of stripe
     *        size. The default value is 0.05, which means 5 percent of stripe size.</p>
     *        <p>
     *        For the default values of 64 MiB ORC stripes and 256 MiB HDFS blocks, the default block padding tolerance
     *        of 5 percent reserves a maximum of 3.2 MiB for padding within the 256 MiB block. In such a case, if the
     *        available size within the block is more than 3.2 MiB, a new, smaller stripe is inserted to fit within that
     *        space. This ensures that no stripe crosses block boundaries and causes remote reads within a node-local
     *        task.
     *        </p>
     *        <p>
     *        Kinesis Data Firehose ignores this parameter when <a>OrcSerDe$EnablePadding</a> is <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withPaddingTolerance(Double paddingTolerance) {
        setPaddingTolerance(paddingTolerance);
        return this;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * @see OrcCompression
     */

    public void setCompression(String compression) {
        this.compression = compression;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * </p>
     * 
     * @return The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * @see OrcCompression
     */

    public String getCompression() {
        return this.compression;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrcCompression
     */

    public OrcSerDe withCompression(String compression) {
        setCompression(compression);
        return this;
    }

    /**
     * <p>
     * The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * </p>
     * 
     * @param compression
     *        The compression code to use over data blocks. The default is <code>SNAPPY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrcCompression
     */

    public OrcSerDe withCompression(OrcCompression compression) {
        this.compression = compression.toString();
        return this;
    }

    /**
     * <p>
     * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     * <code>null</code>.
     * </p>
     * 
     * @return The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     *         <code>null</code>.
     */

    public java.util.List<String> getBloomFilterColumns() {
        return bloomFilterColumns;
    }

    /**
     * <p>
     * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     * <code>null</code>.
     * </p>
     * 
     * @param bloomFilterColumns
     *        The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     *        <code>null</code>.
     */

    public void setBloomFilterColumns(java.util.Collection<String> bloomFilterColumns) {
        if (bloomFilterColumns == null) {
            this.bloomFilterColumns = null;
            return;
        }

        this.bloomFilterColumns = new java.util.ArrayList<String>(bloomFilterColumns);
    }

    /**
     * <p>
     * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     * <code>null</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBloomFilterColumns(java.util.Collection)} or {@link #withBloomFilterColumns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param bloomFilterColumns
     *        The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withBloomFilterColumns(String... bloomFilterColumns) {
        if (this.bloomFilterColumns == null) {
            setBloomFilterColumns(new java.util.ArrayList<String>(bloomFilterColumns.length));
        }
        for (String ele : bloomFilterColumns) {
            this.bloomFilterColumns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     * <code>null</code>.
     * </p>
     * 
     * @param bloomFilterColumns
     *        The column names for which you want Kinesis Data Firehose to create bloom filters. The default is
     *        <code>null</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withBloomFilterColumns(java.util.Collection<String> bloomFilterColumns) {
        setBloomFilterColumns(bloomFilterColumns);
        return this;
    }

    /**
     * <p>
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default
     * value is 0.05, the minimum is 0, and the maximum is 1.
     * </p>
     * 
     * @param bloomFilterFalsePositiveProbability
     *        The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The
     *        default value is 0.05, the minimum is 0, and the maximum is 1.
     */

    public void setBloomFilterFalsePositiveProbability(Double bloomFilterFalsePositiveProbability) {
        this.bloomFilterFalsePositiveProbability = bloomFilterFalsePositiveProbability;
    }

    /**
     * <p>
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default
     * value is 0.05, the minimum is 0, and the maximum is 1.
     * </p>
     * 
     * @return The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The
     *         default value is 0.05, the minimum is 0, and the maximum is 1.
     */

    public Double getBloomFilterFalsePositiveProbability() {
        return this.bloomFilterFalsePositiveProbability;
    }

    /**
     * <p>
     * The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The default
     * value is 0.05, the minimum is 0, and the maximum is 1.
     * </p>
     * 
     * @param bloomFilterFalsePositiveProbability
     *        The Bloom filter false positive probability (FPP). The lower the FPP, the bigger the Bloom filter. The
     *        default value is 0.05, the minimum is 0, and the maximum is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withBloomFilterFalsePositiveProbability(Double bloomFilterFalsePositiveProbability) {
        setBloomFilterFalsePositiveProbability(bloomFilterFalsePositiveProbability);
        return this;
    }

    /**
     * <p>
     * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction
     * to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set
     * this threshold to 1.
     * </p>
     * 
     * @param dictionaryKeyThreshold
     *        Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this
     *        fraction to a number that is less than the number of distinct keys in a dictionary. To always use
     *        dictionary encoding, set this threshold to 1.
     */

    public void setDictionaryKeyThreshold(Double dictionaryKeyThreshold) {
        this.dictionaryKeyThreshold = dictionaryKeyThreshold;
    }

    /**
     * <p>
     * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction
     * to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set
     * this threshold to 1.
     * </p>
     * 
     * @return Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this
     *         fraction to a number that is less than the number of distinct keys in a dictionary. To always use
     *         dictionary encoding, set this threshold to 1.
     */

    public Double getDictionaryKeyThreshold() {
        return this.dictionaryKeyThreshold;
    }

    /**
     * <p>
     * Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this fraction
     * to a number that is less than the number of distinct keys in a dictionary. To always use dictionary encoding, set
     * this threshold to 1.
     * </p>
     * 
     * @param dictionaryKeyThreshold
     *        Represents the fraction of the total number of non-null rows. To turn off dictionary encoding, set this
     *        fraction to a number that is less than the number of distinct keys in a dictionary. To always use
     *        dictionary encoding, set this threshold to 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrcSerDe withDictionaryKeyThreshold(Double dictionaryKeyThreshold) {
        setDictionaryKeyThreshold(dictionaryKeyThreshold);
        return this;
    }

    /**
     * <p>
     * The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The default
     * is <code>V0_12</code>.
     * </p>
     * 
     * @param formatVersion
     *        The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The
     *        default is <code>V0_12</code>.
     * @see OrcFormatVersion
     */

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    /**
     * <p>
     * The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The default
     * is <code>V0_12</code>.
     * </p>
     * 
     * @return The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The
     *         default is <code>V0_12</code>.
     * @see OrcFormatVersion
     */

    public String getFormatVersion() {
        return this.formatVersion;
    }

    /**
     * <p>
     * The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The default
     * is <code>V0_12</code>.
     * </p>
     * 
     * @param formatVersion
     *        The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The
     *        default is <code>V0_12</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrcFormatVersion
     */

    public OrcSerDe withFormatVersion(String formatVersion) {
        setFormatVersion(formatVersion);
        return this;
    }

    /**
     * <p>
     * The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The default
     * is <code>V0_12</code>.
     * </p>
     * 
     * @param formatVersion
     *        The version of the file to write. The possible values are <code>V0_11</code> and <code>V0_12</code>. The
     *        default is <code>V0_12</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrcFormatVersion
     */

    public OrcSerDe withFormatVersion(OrcFormatVersion formatVersion) {
        this.formatVersion = formatVersion.toString();
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
        if (getStripeSizeBytes() != null)
            sb.append("StripeSizeBytes: ").append(getStripeSizeBytes()).append(",");
        if (getBlockSizeBytes() != null)
            sb.append("BlockSizeBytes: ").append(getBlockSizeBytes()).append(",");
        if (getRowIndexStride() != null)
            sb.append("RowIndexStride: ").append(getRowIndexStride()).append(",");
        if (getEnablePadding() != null)
            sb.append("EnablePadding: ").append(getEnablePadding()).append(",");
        if (getPaddingTolerance() != null)
            sb.append("PaddingTolerance: ").append(getPaddingTolerance()).append(",");
        if (getCompression() != null)
            sb.append("Compression: ").append(getCompression()).append(",");
        if (getBloomFilterColumns() != null)
            sb.append("BloomFilterColumns: ").append(getBloomFilterColumns()).append(",");
        if (getBloomFilterFalsePositiveProbability() != null)
            sb.append("BloomFilterFalsePositiveProbability: ").append(getBloomFilterFalsePositiveProbability()).append(",");
        if (getDictionaryKeyThreshold() != null)
            sb.append("DictionaryKeyThreshold: ").append(getDictionaryKeyThreshold()).append(",");
        if (getFormatVersion() != null)
            sb.append("FormatVersion: ").append(getFormatVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrcSerDe == false)
            return false;
        OrcSerDe other = (OrcSerDe) obj;
        if (other.getStripeSizeBytes() == null ^ this.getStripeSizeBytes() == null)
            return false;
        if (other.getStripeSizeBytes() != null && other.getStripeSizeBytes().equals(this.getStripeSizeBytes()) == false)
            return false;
        if (other.getBlockSizeBytes() == null ^ this.getBlockSizeBytes() == null)
            return false;
        if (other.getBlockSizeBytes() != null && other.getBlockSizeBytes().equals(this.getBlockSizeBytes()) == false)
            return false;
        if (other.getRowIndexStride() == null ^ this.getRowIndexStride() == null)
            return false;
        if (other.getRowIndexStride() != null && other.getRowIndexStride().equals(this.getRowIndexStride()) == false)
            return false;
        if (other.getEnablePadding() == null ^ this.getEnablePadding() == null)
            return false;
        if (other.getEnablePadding() != null && other.getEnablePadding().equals(this.getEnablePadding()) == false)
            return false;
        if (other.getPaddingTolerance() == null ^ this.getPaddingTolerance() == null)
            return false;
        if (other.getPaddingTolerance() != null && other.getPaddingTolerance().equals(this.getPaddingTolerance()) == false)
            return false;
        if (other.getCompression() == null ^ this.getCompression() == null)
            return false;
        if (other.getCompression() != null && other.getCompression().equals(this.getCompression()) == false)
            return false;
        if (other.getBloomFilterColumns() == null ^ this.getBloomFilterColumns() == null)
            return false;
        if (other.getBloomFilterColumns() != null && other.getBloomFilterColumns().equals(this.getBloomFilterColumns()) == false)
            return false;
        if (other.getBloomFilterFalsePositiveProbability() == null ^ this.getBloomFilterFalsePositiveProbability() == null)
            return false;
        if (other.getBloomFilterFalsePositiveProbability() != null
                && other.getBloomFilterFalsePositiveProbability().equals(this.getBloomFilterFalsePositiveProbability()) == false)
            return false;
        if (other.getDictionaryKeyThreshold() == null ^ this.getDictionaryKeyThreshold() == null)
            return false;
        if (other.getDictionaryKeyThreshold() != null && other.getDictionaryKeyThreshold().equals(this.getDictionaryKeyThreshold()) == false)
            return false;
        if (other.getFormatVersion() == null ^ this.getFormatVersion() == null)
            return false;
        if (other.getFormatVersion() != null && other.getFormatVersion().equals(this.getFormatVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStripeSizeBytes() == null) ? 0 : getStripeSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getBlockSizeBytes() == null) ? 0 : getBlockSizeBytes().hashCode());
        hashCode = prime * hashCode + ((getRowIndexStride() == null) ? 0 : getRowIndexStride().hashCode());
        hashCode = prime * hashCode + ((getEnablePadding() == null) ? 0 : getEnablePadding().hashCode());
        hashCode = prime * hashCode + ((getPaddingTolerance() == null) ? 0 : getPaddingTolerance().hashCode());
        hashCode = prime * hashCode + ((getCompression() == null) ? 0 : getCompression().hashCode());
        hashCode = prime * hashCode + ((getBloomFilterColumns() == null) ? 0 : getBloomFilterColumns().hashCode());
        hashCode = prime * hashCode + ((getBloomFilterFalsePositiveProbability() == null) ? 0 : getBloomFilterFalsePositiveProbability().hashCode());
        hashCode = prime * hashCode + ((getDictionaryKeyThreshold() == null) ? 0 : getDictionaryKeyThreshold().hashCode());
        hashCode = prime * hashCode + ((getFormatVersion() == null) ? 0 : getFormatVersion().hashCode());
        return hashCode;
    }

    @Override
    public OrcSerDe clone() {
        try {
            return (OrcSerDe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisfirehose.model.transform.OrcSerDeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
