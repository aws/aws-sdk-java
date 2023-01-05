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
 * Specifies a command-separated value (CSV) data store stored in Amazon S3.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/S3CsvSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3CsvSource implements Serializable, Cloneable, StructuredPojo {

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
     * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * </p>
     */
    private String separator;
    /**
     * <p>
     * Specifies a character to use for escaping. This option is used only when reading CSV files. The default value is
     * <code>none</code>. If enabled, the character which immediately follows is used as-is, except for a small set of
     * well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>).
     * </p>
     */
    private String escaper;
    /**
     * <p>
     * Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     * <code>-1</code> to turn off quoting entirely.
     * </p>
     */
    private String quoteChar;
    /**
     * <p>
     * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field
     * contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The
     * default value is <code>False</code>, which allows for more aggressive file-splitting during parsing.
     * </p>
     */
    private Boolean multiline;
    /**
     * <p>
     * A Boolean value that specifies whether to treat the first line as a header. The default value is
     * <code>False</code>.
     * </p>
     */
    private Boolean withHeader;
    /**
     * <p>
     * A Boolean value that specifies whether to write the header to output. The default value is <code>True</code>.
     * </p>
     */
    private Boolean writeHeader;
    /**
     * <p>
     * A Boolean value that specifies whether to skip the first data line. The default value is <code>False</code>.
     * </p>
     */
    private Boolean skipFirst;
    /**
     * <p>
     * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar
     * memory formats. Only available in Glue version 3.0.
     * </p>
     */
    private Boolean optimizePerformance;
    /**
     * <p>
     * Specifies the data schema for the S3 CSV source.
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

    public S3CsvSource withName(String name) {
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

    public S3CsvSource withPaths(String... paths) {
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

    public S3CsvSource withPaths(java.util.Collection<String> paths) {
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
     * @see CompressionType
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
     * @see CompressionType
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
     * @see CompressionType
     */

    public S3CsvSource withCompressionType(String compressionType) {
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
     * @see CompressionType
     */

    public S3CsvSource withCompressionType(CompressionType compressionType) {
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

    public S3CsvSource withExclusions(String... exclusions) {
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

    public S3CsvSource withExclusions(java.util.Collection<String> exclusions) {
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

    public S3CsvSource withGroupSize(String groupSize) {
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

    public S3CsvSource withGroupFiles(String groupFiles) {
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

    public S3CsvSource withRecurse(Boolean recurse) {
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

    public S3CsvSource withMaxBand(Integer maxBand) {
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

    public S3CsvSource withMaxFilesInBand(Integer maxFilesInBand) {
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

    public S3CsvSource withAdditionalOptions(S3DirectSourceAdditionalOptions additionalOptions) {
        setAdditionalOptions(additionalOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * </p>
     * 
     * @param separator
     *        Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * @see Separator
     */

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    /**
     * <p>
     * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * </p>
     * 
     * @return Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * @see Separator
     */

    public String getSeparator() {
        return this.separator;
    }

    /**
     * <p>
     * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * </p>
     * 
     * @param separator
     *        Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Separator
     */

    public S3CsvSource withSeparator(String separator) {
        setSeparator(separator);
        return this;
    }

    /**
     * <p>
     * Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * </p>
     * 
     * @param separator
     *        Specifies the delimiter character. The default is a comma: ",", but any other character can be specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Separator
     */

    public S3CsvSource withSeparator(Separator separator) {
        this.separator = separator.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a character to use for escaping. This option is used only when reading CSV files. The default value is
     * <code>none</code>. If enabled, the character which immediately follows is used as-is, except for a small set of
     * well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>).
     * </p>
     * 
     * @param escaper
     *        Specifies a character to use for escaping. This option is used only when reading CSV files. The default
     *        value is <code>none</code>. If enabled, the character which immediately follows is used as-is, except for
     *        a small set of well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>
     *        ).
     */

    public void setEscaper(String escaper) {
        this.escaper = escaper;
    }

    /**
     * <p>
     * Specifies a character to use for escaping. This option is used only when reading CSV files. The default value is
     * <code>none</code>. If enabled, the character which immediately follows is used as-is, except for a small set of
     * well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>).
     * </p>
     * 
     * @return Specifies a character to use for escaping. This option is used only when reading CSV files. The default
     *         value is <code>none</code>. If enabled, the character which immediately follows is used as-is, except for
     *         a small set of well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>
     *         ).
     */

    public String getEscaper() {
        return this.escaper;
    }

    /**
     * <p>
     * Specifies a character to use for escaping. This option is used only when reading CSV files. The default value is
     * <code>none</code>. If enabled, the character which immediately follows is used as-is, except for a small set of
     * well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>).
     * </p>
     * 
     * @param escaper
     *        Specifies a character to use for escaping. This option is used only when reading CSV files. The default
     *        value is <code>none</code>. If enabled, the character which immediately follows is used as-is, except for
     *        a small set of well-known escapes (<code>\n</code>, <code>\r</code>, <code>\t</code>, and <code>\0</code>
     *        ).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withEscaper(String escaper) {
        setEscaper(escaper);
        return this;
    }

    /**
     * <p>
     * Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     * <code>-1</code> to turn off quoting entirely.
     * </p>
     * 
     * @param quoteChar
     *        Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     *        <code>-1</code> to turn off quoting entirely.
     * @see QuoteChar
     */

    public void setQuoteChar(String quoteChar) {
        this.quoteChar = quoteChar;
    }

    /**
     * <p>
     * Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     * <code>-1</code> to turn off quoting entirely.
     * </p>
     * 
     * @return Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     *         <code>-1</code> to turn off quoting entirely.
     * @see QuoteChar
     */

    public String getQuoteChar() {
        return this.quoteChar;
    }

    /**
     * <p>
     * Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     * <code>-1</code> to turn off quoting entirely.
     * </p>
     * 
     * @param quoteChar
     *        Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     *        <code>-1</code> to turn off quoting entirely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuoteChar
     */

    public S3CsvSource withQuoteChar(String quoteChar) {
        setQuoteChar(quoteChar);
        return this;
    }

    /**
     * <p>
     * Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     * <code>-1</code> to turn off quoting entirely.
     * </p>
     * 
     * @param quoteChar
     *        Specifies the character to use for quoting. The default is a double quote: <code>'"'</code>. Set this to
     *        <code>-1</code> to turn off quoting entirely.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QuoteChar
     */

    public S3CsvSource withQuoteChar(QuoteChar quoteChar) {
        this.quoteChar = quoteChar.toString();
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field
     * contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The
     * default value is <code>False</code>, which allows for more aggressive file-splitting during parsing.
     * </p>
     * 
     * @param multiline
     *        A Boolean value that specifies whether a single record can span multiple lines. This can occur when a
     *        field contains a quoted new-line character. You must set this option to True if any record spans multiple
     *        lines. The default value is <code>False</code>, which allows for more aggressive file-splitting during
     *        parsing.
     */

    public void setMultiline(Boolean multiline) {
        this.multiline = multiline;
    }

    /**
     * <p>
     * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field
     * contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The
     * default value is <code>False</code>, which allows for more aggressive file-splitting during parsing.
     * </p>
     * 
     * @return A Boolean value that specifies whether a single record can span multiple lines. This can occur when a
     *         field contains a quoted new-line character. You must set this option to True if any record spans multiple
     *         lines. The default value is <code>False</code>, which allows for more aggressive file-splitting during
     *         parsing.
     */

    public Boolean getMultiline() {
        return this.multiline;
    }

    /**
     * <p>
     * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field
     * contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The
     * default value is <code>False</code>, which allows for more aggressive file-splitting during parsing.
     * </p>
     * 
     * @param multiline
     *        A Boolean value that specifies whether a single record can span multiple lines. This can occur when a
     *        field contains a quoted new-line character. You must set this option to True if any record spans multiple
     *        lines. The default value is <code>False</code>, which allows for more aggressive file-splitting during
     *        parsing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withMultiline(Boolean multiline) {
        setMultiline(multiline);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether a single record can span multiple lines. This can occur when a field
     * contains a quoted new-line character. You must set this option to True if any record spans multiple lines. The
     * default value is <code>False</code>, which allows for more aggressive file-splitting during parsing.
     * </p>
     * 
     * @return A Boolean value that specifies whether a single record can span multiple lines. This can occur when a
     *         field contains a quoted new-line character. You must set this option to True if any record spans multiple
     *         lines. The default value is <code>False</code>, which allows for more aggressive file-splitting during
     *         parsing.
     */

    public Boolean isMultiline() {
        return this.multiline;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to treat the first line as a header. The default value is
     * <code>False</code>.
     * </p>
     * 
     * @param withHeader
     *        A Boolean value that specifies whether to treat the first line as a header. The default value is
     *        <code>False</code>.
     */

    public void setWithHeader(Boolean withHeader) {
        this.withHeader = withHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to treat the first line as a header. The default value is
     * <code>False</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to treat the first line as a header. The default value is
     *         <code>False</code>.
     */

    public Boolean getWithHeader() {
        return this.withHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to treat the first line as a header. The default value is
     * <code>False</code>.
     * </p>
     * 
     * @param withHeader
     *        A Boolean value that specifies whether to treat the first line as a header. The default value is
     *        <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withWithHeader(Boolean withHeader) {
        setWithHeader(withHeader);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to treat the first line as a header. The default value is
     * <code>False</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to treat the first line as a header. The default value is
     *         <code>False</code>.
     */

    public Boolean isWithHeader() {
        return this.withHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to write the header to output. The default value is <code>True</code>.
     * </p>
     * 
     * @param writeHeader
     *        A Boolean value that specifies whether to write the header to output. The default value is
     *        <code>True</code>.
     */

    public void setWriteHeader(Boolean writeHeader) {
        this.writeHeader = writeHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to write the header to output. The default value is <code>True</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to write the header to output. The default value is
     *         <code>True</code>.
     */

    public Boolean getWriteHeader() {
        return this.writeHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to write the header to output. The default value is <code>True</code>.
     * </p>
     * 
     * @param writeHeader
     *        A Boolean value that specifies whether to write the header to output. The default value is
     *        <code>True</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withWriteHeader(Boolean writeHeader) {
        setWriteHeader(writeHeader);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to write the header to output. The default value is <code>True</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to write the header to output. The default value is
     *         <code>True</code>.
     */

    public Boolean isWriteHeader() {
        return this.writeHeader;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to skip the first data line. The default value is <code>False</code>.
     * </p>
     * 
     * @param skipFirst
     *        A Boolean value that specifies whether to skip the first data line. The default value is
     *        <code>False</code>.
     */

    public void setSkipFirst(Boolean skipFirst) {
        this.skipFirst = skipFirst;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to skip the first data line. The default value is <code>False</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to skip the first data line. The default value is
     *         <code>False</code>.
     */

    public Boolean getSkipFirst() {
        return this.skipFirst;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to skip the first data line. The default value is <code>False</code>.
     * </p>
     * 
     * @param skipFirst
     *        A Boolean value that specifies whether to skip the first data line. The default value is
     *        <code>False</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withSkipFirst(Boolean skipFirst) {
        setSkipFirst(skipFirst);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to skip the first data line. The default value is <code>False</code>.
     * </p>
     * 
     * @return A Boolean value that specifies whether to skip the first data line. The default value is
     *         <code>False</code>.
     */

    public Boolean isSkipFirst() {
        return this.skipFirst;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar
     * memory formats. Only available in Glue version 3.0.
     * </p>
     * 
     * @param optimizePerformance
     *        A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based
     *        columnar memory formats. Only available in Glue version 3.0.
     */

    public void setOptimizePerformance(Boolean optimizePerformance) {
        this.optimizePerformance = optimizePerformance;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar
     * memory formats. Only available in Glue version 3.0.
     * </p>
     * 
     * @return A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based
     *         columnar memory formats. Only available in Glue version 3.0.
     */

    public Boolean getOptimizePerformance() {
        return this.optimizePerformance;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar
     * memory formats. Only available in Glue version 3.0.
     * </p>
     * 
     * @param optimizePerformance
     *        A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based
     *        columnar memory formats. Only available in Glue version 3.0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withOptimizePerformance(Boolean optimizePerformance) {
        setOptimizePerformance(optimizePerformance);
        return this;
    }

    /**
     * <p>
     * A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based columnar
     * memory formats. Only available in Glue version 3.0.
     * </p>
     * 
     * @return A Boolean value that specifies whether to use the advanced SIMD CSV reader along with Apache Arrow based
     *         columnar memory formats. Only available in Glue version 3.0.
     */

    public Boolean isOptimizePerformance() {
        return this.optimizePerformance;
    }

    /**
     * <p>
     * Specifies the data schema for the S3 CSV source.
     * </p>
     * 
     * @return Specifies the data schema for the S3 CSV source.
     */

    public java.util.List<GlueSchema> getOutputSchemas() {
        return outputSchemas;
    }

    /**
     * <p>
     * Specifies the data schema for the S3 CSV source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 CSV source.
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
     * Specifies the data schema for the S3 CSV source.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputSchemas(java.util.Collection)} or {@link #withOutputSchemas(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 CSV source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withOutputSchemas(GlueSchema... outputSchemas) {
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
     * Specifies the data schema for the S3 CSV source.
     * </p>
     * 
     * @param outputSchemas
     *        Specifies the data schema for the S3 CSV source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3CsvSource withOutputSchemas(java.util.Collection<GlueSchema> outputSchemas) {
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
        if (getSeparator() != null)
            sb.append("Separator: ").append(getSeparator()).append(",");
        if (getEscaper() != null)
            sb.append("Escaper: ").append(getEscaper()).append(",");
        if (getQuoteChar() != null)
            sb.append("QuoteChar: ").append(getQuoteChar()).append(",");
        if (getMultiline() != null)
            sb.append("Multiline: ").append(getMultiline()).append(",");
        if (getWithHeader() != null)
            sb.append("WithHeader: ").append(getWithHeader()).append(",");
        if (getWriteHeader() != null)
            sb.append("WriteHeader: ").append(getWriteHeader()).append(",");
        if (getSkipFirst() != null)
            sb.append("SkipFirst: ").append(getSkipFirst()).append(",");
        if (getOptimizePerformance() != null)
            sb.append("OptimizePerformance: ").append(getOptimizePerformance()).append(",");
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

        if (obj instanceof S3CsvSource == false)
            return false;
        S3CsvSource other = (S3CsvSource) obj;
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
        if (other.getSeparator() == null ^ this.getSeparator() == null)
            return false;
        if (other.getSeparator() != null && other.getSeparator().equals(this.getSeparator()) == false)
            return false;
        if (other.getEscaper() == null ^ this.getEscaper() == null)
            return false;
        if (other.getEscaper() != null && other.getEscaper().equals(this.getEscaper()) == false)
            return false;
        if (other.getQuoteChar() == null ^ this.getQuoteChar() == null)
            return false;
        if (other.getQuoteChar() != null && other.getQuoteChar().equals(this.getQuoteChar()) == false)
            return false;
        if (other.getMultiline() == null ^ this.getMultiline() == null)
            return false;
        if (other.getMultiline() != null && other.getMultiline().equals(this.getMultiline()) == false)
            return false;
        if (other.getWithHeader() == null ^ this.getWithHeader() == null)
            return false;
        if (other.getWithHeader() != null && other.getWithHeader().equals(this.getWithHeader()) == false)
            return false;
        if (other.getWriteHeader() == null ^ this.getWriteHeader() == null)
            return false;
        if (other.getWriteHeader() != null && other.getWriteHeader().equals(this.getWriteHeader()) == false)
            return false;
        if (other.getSkipFirst() == null ^ this.getSkipFirst() == null)
            return false;
        if (other.getSkipFirst() != null && other.getSkipFirst().equals(this.getSkipFirst()) == false)
            return false;
        if (other.getOptimizePerformance() == null ^ this.getOptimizePerformance() == null)
            return false;
        if (other.getOptimizePerformance() != null && other.getOptimizePerformance().equals(this.getOptimizePerformance()) == false)
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
        hashCode = prime * hashCode + ((getSeparator() == null) ? 0 : getSeparator().hashCode());
        hashCode = prime * hashCode + ((getEscaper() == null) ? 0 : getEscaper().hashCode());
        hashCode = prime * hashCode + ((getQuoteChar() == null) ? 0 : getQuoteChar().hashCode());
        hashCode = prime * hashCode + ((getMultiline() == null) ? 0 : getMultiline().hashCode());
        hashCode = prime * hashCode + ((getWithHeader() == null) ? 0 : getWithHeader().hashCode());
        hashCode = prime * hashCode + ((getWriteHeader() == null) ? 0 : getWriteHeader().hashCode());
        hashCode = prime * hashCode + ((getSkipFirst() == null) ? 0 : getSkipFirst().hashCode());
        hashCode = prime * hashCode + ((getOptimizePerformance() == null) ? 0 : getOptimizePerformance().hashCode());
        hashCode = prime * hashCode + ((getOutputSchemas() == null) ? 0 : getOutputSchemas().hashCode());
        return hashCode;
    }

    @Override
    public S3CsvSource clone() {
        try {
            return (S3CsvSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.S3CsvSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
