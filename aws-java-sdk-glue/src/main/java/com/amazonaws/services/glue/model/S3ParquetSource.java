/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies an Apache Parquet data store stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3ParquetSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3ParquetSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     */
    private java.util.List<String> paths;
    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     */
    private String compressionType;
    /**
     * <p>
     * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all
     * PDF files.
     * </p>
     */
    private java.util.List<String> exclusions;
    /**
     * <p>
     * The target group size in bytes. The default is computed based on the input data size and the size of your
     * cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     * <code>"inPartition"</code> for this to take effect.
     * </p>
     */
    private String groupSize;
    /**
     * <p>
     * Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping with
     * fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more than 50,000
     * files, set this parameter to <code>"none"</code>.
     * </p>
     */
    private String groupFiles;
    /**
     * <p>
     * If set to true, recursively reads files in all subdirectories under the specified paths.
     * </p>
     */
    private Boolean recurse;
    /**
     * <p>
     * This option controls the duration in milliseconds after which the s3 listing is likely to be consistent. Files
     * with modification timestamps falling within the last maxBand milliseconds are tracked specially when using
     * JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this option. The default
     * is 900000 milliseconds, or 15 minutes.
     * </p>
     */
    private Integer maxBand;
    /**
     * <p>
     * This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     * exceeded, extra files are skipped and only processed in the next job run.
     * </p>
     */
    private Integer maxFilesInBand;
    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     */
    private S3DirectSourceAdditionalOptions additionalOptions;
    /**
     * <p>
     * Specifies the data schema for the S3 Parquet source.
     * </p>
     */
    private java.util.List<GlueSchema> outputSchemas;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @return A list of the Amazon S3 paths to read from.
     */

    public java.util.List<String> getPaths() {
        return paths;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     */

    public void setPaths(java.util.Collection<String> paths) {
        if (paths == null) {
            this.paths = null;
            return;
        }

        this.paths = new java.util.ArrayList<String>(paths);
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPaths(java.util.Collection)} or {@link #withPaths(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withPaths(String... paths) {
        if (this.paths == null) {
            setPaths(new java.util.ArrayList<String>(paths.length));
        }
        for (String ele : paths) {
            this.paths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the Amazon S3 paths to read from.
     * </p>
     * 
     * @param paths
     *        A list of the Amazon S3 paths to read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withPaths(java.util.Collection<String> paths) {
        setPaths(paths);
        return this;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compressionType
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @see ParquetCompressionType
     */

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @return Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *         extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @see ParquetCompressionType
     */

    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compressionType
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetCompressionType
     */

    public S3ParquetSource withCompressionType(String compressionType) {
        setCompressionType(compressionType);
        return this;
    }

    /**
     * <p>
     * Specifies how the data is compressed. This is generally not necessary if the data has a standard file extension.
     * Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * </p>
     * 
     * @param compressionType
     *        Specifies how the data is compressed. This is generally not necessary if the data has a standard file
     *        extension. Possible values are <code>"gzip"</code> and <code>"bzip"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ParquetCompressionType
     */

    public S3ParquetSource withCompressionType(ParquetCompressionType compressionType) {
        this.compressionType = compressionType.toString();
        return this;
    }

    /**
     * <p>
     * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all
     * PDF files.
     * </p>
     * 
     * @return A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]"
     *         excludes all PDF files.
     */

    public java.util.List<String> getExclusions() {
        return exclusions;
    }

    /**
     * <p>
     * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all
     * PDF files.
     * </p>
     * 
     * @param exclusions
     *        A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]"
     *        excludes all PDF files.
     */

    public void setExclusions(java.util.Collection<String> exclusions) {
        if (exclusions == null) {
            this.exclusions = null;
            return;
        }

        this.exclusions = new java.util.ArrayList<String>(exclusions);
    }

    /**
     * <p>
     * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all
     * PDF files.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExclusions(java.util.Collection)} or {@link #withExclusions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param exclusions
     *        A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]"
     *        excludes all PDF files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withExclusions(String... exclusions) {
        if (this.exclusions == null) {
            setExclusions(new java.util.ArrayList<String>(exclusions.length));
        }
        for (String ele : exclusions) {
            this.exclusions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]" excludes all
     * PDF files.
     * </p>
     * 
     * @param exclusions
     *        A string containing a JSON list of Unix-style glob patterns to exclude. For example, "[\"**.pdf\"]"
     *        excludes all PDF files.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withExclusions(java.util.Collection<String> exclusions) {
        setExclusions(exclusions);
        return this;
    }

    /**
     * <p>
     * The target group size in bytes. The default is computed based on the input data size and the size of your
     * cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     * <code>"inPartition"</code> for this to take effect.
     * </p>
     * 
     * @param groupSize
     *        The target group size in bytes. The default is computed based on the input data size and the size of your
     *        cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     *        <code>"inPartition"</code> for this to take effect.
     */

    public void setGroupSize(String groupSize) {
        this.groupSize = groupSize;
    }

    /**
     * <p>
     * The target group size in bytes. The default is computed based on the input data size and the size of your
     * cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     * <code>"inPartition"</code> for this to take effect.
     * </p>
     * 
     * @return The target group size in bytes. The default is computed based on the input data size and the size of your
     *         cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     *         <code>"inPartition"</code> for this to take effect.
     */

    public String getGroupSize() {
        return this.groupSize;
    }

    /**
     * <p>
     * The target group size in bytes. The default is computed based on the input data size and the size of your
     * cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     * <code>"inPartition"</code> for this to take effect.
     * </p>
     * 
     * @param groupSize
     *        The target group size in bytes. The default is computed based on the input data size and the size of your
     *        cluster. When there are fewer than 50,000 input files, <code>"groupFiles"</code> must be set to
     *        <code>"inPartition"</code> for this to take effect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withGroupSize(String groupSize) {
        setGroupSize(groupSize);
        return this;
    }

    /**
     * <p>
     * Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping with
     * fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more than 50,000
     * files, set this parameter to <code>"none"</code>.
     * </p>
     * 
     * @param groupFiles
     *        Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping
     *        with fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more
     *        than 50,000 files, set this parameter to <code>"none"</code>.
     */

    public void setGroupFiles(String groupFiles) {
        this.groupFiles = groupFiles;
    }

    /**
     * <p>
     * Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping with
     * fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more than 50,000
     * files, set this parameter to <code>"none"</code>.
     * </p>
     * 
     * @return Grouping files is turned on by default when the input contains more than 50,000 files. To turn on
     *         grouping with fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when
     *         there are more than 50,000 files, set this parameter to <code>"none"</code>.
     */

    public String getGroupFiles() {
        return this.groupFiles;
    }

    /**
     * <p>
     * Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping with
     * fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more than 50,000
     * files, set this parameter to <code>"none"</code>.
     * </p>
     * 
     * @param groupFiles
     *        Grouping files is turned on by default when the input contains more than 50,000 files. To turn on grouping
     *        with fewer than 50,000 files, set this parameter to "inPartition". To disable grouping when there are more
     *        than 50,000 files, set this parameter to <code>"none"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withGroupFiles(String groupFiles) {
        setGroupFiles(groupFiles);
        return this;
    }

    /**
     * <p>
     * If set to true, recursively reads files in all subdirectories under the specified paths.
     * </p>
     * 
     * @param recurse
     *        If set to true, recursively reads files in all subdirectories under the specified paths.
     */

    public void setRecurse(Boolean recurse) {
        this.recurse = recurse;
    }

    /**
     * <p>
     * If set to true, recursively reads files in all subdirectories under the specified paths.
     * </p>
     * 
     * @return If set to true, recursively reads files in all subdirectories under the specified paths.
     */

    public Boolean getRecurse() {
        return this.recurse;
    }

    /**
     * <p>
     * If set to true, recursively reads files in all subdirectories under the specified paths.
     * </p>
     * 
     * @param recurse
     *        If set to true, recursively reads files in all subdirectories under the specified paths.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withRecurse(Boolean recurse) {
        setRecurse(recurse);
        return this;
    }

    /**
     * <p>
     * If set to true, recursively reads files in all subdirectories under the specified paths.
     * </p>
     * 
     * @return If set to true, recursively reads files in all subdirectories under the specified paths.
     */

    public Boolean isRecurse() {
        return this.recurse;
    }

    /**
     * <p>
     * This option controls the duration in milliseconds after which the s3 listing is likely to be consistent. Files
     * with modification timestamps falling within the last maxBand milliseconds are tracked specially when using
     * JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this option. The default
     * is 900000 milliseconds, or 15 minutes.
     * </p>
     * 
     * @param maxBand
     *        This option controls the duration in milliseconds after which the s3 listing is likely to be consistent.
     *        Files with modification timestamps falling within the last maxBand milliseconds are tracked specially when
     *        using JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this
     *        option. The default is 900000 milliseconds, or 15 minutes.
     */

    public void setMaxBand(Integer maxBand) {
        this.maxBand = maxBand;
    }

    /**
     * <p>
     * This option controls the duration in milliseconds after which the s3 listing is likely to be consistent. Files
     * with modification timestamps falling within the last maxBand milliseconds are tracked specially when using
     * JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this option. The default
     * is 900000 milliseconds, or 15 minutes.
     * </p>
     * 
     * @return This option controls the duration in milliseconds after which the s3 listing is likely to be consistent.
     *         Files with modification timestamps falling within the last maxBand milliseconds are tracked specially
     *         when using JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this
     *         option. The default is 900000 milliseconds, or 15 minutes.
     */

    public Integer getMaxBand() {
        return this.maxBand;
    }

    /**
     * <p>
     * This option controls the duration in milliseconds after which the s3 listing is likely to be consistent. Files
     * with modification timestamps falling within the last maxBand milliseconds are tracked specially when using
     * JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this option. The default
     * is 900000 milliseconds, or 15 minutes.
     * </p>
     * 
     * @param maxBand
     *        This option controls the duration in milliseconds after which the s3 listing is likely to be consistent.
     *        Files with modification timestamps falling within the last maxBand milliseconds are tracked specially when
     *        using JobBookmarks to account for Amazon S3 eventual consistency. Most users don't need to set this
     *        option. The default is 900000 milliseconds, or 15 minutes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withMaxBand(Integer maxBand) {
        setMaxBand(maxBand);
        return this;
    }

    /**
     * <p>
     * This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     * exceeded, extra files are skipped and only processed in the next job run.
     * </p>
     * 
     * @param maxFilesInBand
     *        This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     *        exceeded, extra files are skipped and only processed in the next job run.
     */

    public void setMaxFilesInBand(Integer maxFilesInBand) {
        this.maxFilesInBand = maxFilesInBand;
    }

    /**
     * <p>
     * This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     * exceeded, extra files are skipped and only processed in the next job run.
     * </p>
     * 
     * @return This option specifies the maximum number of files to save from the last maxBand seconds. If this number
     *         is exceeded, extra files are skipped and only processed in the next job run.
     */

    public Integer getMaxFilesInBand() {
        return this.maxFilesInBand;
    }

    /**
     * <p>
     * This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     * exceeded, extra files are skipped and only processed in the next job run.
     * </p>
     * 
     * @param maxFilesInBand
     *        This option specifies the maximum number of files to save from the last maxBand seconds. If this number is
     *        exceeded, extra files are skipped and only processed in the next job run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withMaxFilesInBand(Integer maxFilesInBand) {
        setMaxFilesInBand(maxFilesInBand);
        return this;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options.
     */

    public void setAdditionalOptions(S3DirectSourceAdditionalOptions additionalOptions) {
        this.additionalOptions = additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @return Specifies additional connection options.
     */

    public S3DirectSourceAdditionalOptions getAdditionalOptions() {
        return this.additionalOptions;
    }

    /**
     * <p>
     * Specifies additional connection options.
     * </p>
     * 
     * @param additionalOptions
     *        Specifies additional connection options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withAdditionalOptions(S3DirectSourceAdditionalOptions additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the S3 Parquet source.
     * </p>
     * 
     * @return Specifies the data schema for the S3 Parquet source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the S3 Parquet source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 Parquet source.
     */

    public void setOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        if (outputSchemas == null) {
            this.outputSchemas = null;
            return;
        }

        this.outputSchemas = new java.util.ArrayList<GlueSchema>(outputSchemas);
    }

    /**
     * <p>
     * Specifies the data schema for the S3 Parquet source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 Parquet source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withOutputSchemas(GlueSchema... outputSchemas) {
        if (this.outputSchemas == null) {
            setOutputSchemas(new java.util.ArrayList<GlueSchema>(outputSchemas.length));
        }
        for (GlueSchema ele : outputSchemas) {
            this.outputSchemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the data schema for the S3 Parquet source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 Parquet source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3ParquetSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
        setOutputSchemas(outputSchemas);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPaths() != null)
            sb.append("Paths: ").append(getPaths()).append(",");
        if (getCompressionType() != null)
            sb.append("CompressionType: ").append(getCompressionType()).append(",");
        if (getExclusions() != null)
            sb.append("Exclusions: ").append(getExclusions()).append(",");
        if (getGroupSize() != null)
            sb.append("GroupSize: ").append(getGroupSize()).append(",");
        if (getGroupFiles() != null)
            sb.append("GroupFiles: ").append(getGroupFiles()).append(",");
        if (getRecurse() != null)
            sb.append("Recurse: ").append(getRecurse()).append(",");
        if (getMaxBand() != null)
            sb.append("MaxBand: ").append(getMaxBand()).append(",");
        if (getMaxFilesInBand() != null)
            sb.append("MaxFilesInBand: ").append(getMaxFilesInBand()).append(",");
        if (getAdditionalOptions() != null)
            sb.append("AdditionalOptions: ").append(getAdditionalOptions()).append(",");
        if (getOutputSchemas() != null)
            sb.append("OutputSchemas: ").append(getOutputSchemas());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3ParquetSource == false)
            return false;
        S3ParquetSource other = (S3ParquetSource) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPaths() == null ^ this.getPaths() == null)
            return false;
        if (other.getPaths() != null && other.getPaths().equals(this.getPaths()) == false)
            return false;
        if (other.getCompressionType() == null ^ this.getCompressionType() == null)
            return false;
        if (other.getCompressionType() != null && other.getCompressionType().equals(this.getCompressionType()) == false)
            return false;
        if (other.getExclusions() == null ^ this.getExclusions() == null)
            return false;
        if (other.getExclusions() != null && other.getExclusions().equals(this.getExclusions()) == false)
            return false;
        if (other.getGroupSize() == null ^ this.getGroupSize() == null)
            return false;
        if (other.getGroupSize() != null && other.getGroupSize().equals(this.getGroupSize()) == false)
            return false;
        if (other.getGroupFiles() == null ^ this.getGroupFiles() == null)
            return false;
        if (other.getGroupFiles() != null && other.getGroupFiles().equals(this.getGroupFiles()) == false)
            return false;
        if (other.getRecurse() == null ^ this.getRecurse() == null)
            return false;
        if (other.getRecurse() != null && other.getRecurse().equals(this.getRecurse()) == false)
            return false;
        if (other.getMaxBand() == null ^ this.getMaxBand() == null)
            return false;
        if (other.getMaxBand() != null && other.getMaxBand().equals(this.getMaxBand()) == false)
            return false;
        if (other.getMaxFilesInBand() == null ^ this.getMaxFilesInBand() == null)
            return false;
        if (other.getMaxFilesInBand() != null && other.getMaxFilesInBand().equals(this.getMaxFilesInBand()) == false)
            return false;
        if (other.getAdditionalOptions() == null ^ this.getAdditionalOptions() == null)
            return false;
        if (other.getAdditionalOptions() != null && other.getAdditionalOptions().equals(this.getAdditionalOptions()) == false)
            return false;
        if (other.getOutputSchemas() == null ^ this.getOutputSchemas() == null)
            return false;
        if (other.getOutputSchemas() != null && other.getOutputSchemas().equals(this.getOutputSchemas()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPaths() == null) ? 0 : getPaths().hashCode());
        hashCode = prime * hashCode + ((getCompressionType() == null) ? 0 : getCompressionType().hashCode());
        hashCode = prime * hashCode + ((getExclusions() == null) ? 0 : getExclusions().hashCode());
        hashCode = prime * hashCode + ((getGroupSize() == null) ? 0 : getGroupSize().hashCode());
        hashCode = prime * hashCode + ((getGroupFiles() == null) ? 0 : getGroupFiles().hashCode());
        hashCode = prime * hashCode + ((getRecurse() == null) ? 0 : getRecurse().hashCode());
        hashCode = prime * hashCode + ((getMaxBand() == null) ? 0 : getMaxBand().hashCode());
        hashCode = prime * hashCode + ((getMaxFilesInBand() == null) ? 0 : getMaxFilesInBand().hashCode());
        hashCode = prime * hashCode + ((getAdditionalOptions() == null) ? 0 : getAdditionalOptions().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public S3ParquetSource clone() {
        try {
            return (S3ParquetSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3ParquetSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
