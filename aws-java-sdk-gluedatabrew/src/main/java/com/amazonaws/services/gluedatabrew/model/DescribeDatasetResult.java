/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DescribeDataset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDatasetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier (user name) of the user who created the dataset.
     * </p>
     */
    private String createdBy;
    /**
     * <p>
     * The date and time that the dataset was created.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The name of the dataset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     */
    private String format;

    private FormatOptions formatOptions;

    private Input input;
    /**
     * <p>
     * The date and time that the dataset was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The identifier (user name) of the user who last modified the dataset.
     * </p>
     */
    private String lastModifiedBy;
    /**
     * <p>
     * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * </p>
     */
    private String source;
    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     */
    private PathOptions pathOptions;
    /**
     * <p>
     * Metadata tags associated with this dataset.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The identifier (user name) of the user who created the dataset.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the dataset.
     */

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the dataset.
     * </p>
     * 
     * @return The identifier (user name) of the user who created the dataset.
     */

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who created the dataset.
     * </p>
     * 
     * @param createdBy
     *        The identifier (user name) of the user who created the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withCreatedBy(String createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * The date and time that the dataset was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the dataset was created.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the dataset was created.
     * </p>
     * 
     * @return The date and time that the dataset was created.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the dataset was created.
     * </p>
     * 
     * @param createDate
     *        The date and time that the dataset was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param name
     *        The name of the dataset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @return The name of the dataset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the dataset.
     * </p>
     * 
     * @param name
     *        The name of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @see InputFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @return The file format of a dataset that is created from an Amazon S3 file or folder.
     * @see InputFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public DescribeDatasetResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     * </p>
     * 
     * @param format
     *        The file format of a dataset that is created from an Amazon S3 file or folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFormat
     */

    public DescribeDatasetResult withFormat(InputFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * @param formatOptions
     */

    public void setFormatOptions(FormatOptions formatOptions) {
        this.formatOptions = formatOptions;
    }

    /**
     * @return
     */

    public FormatOptions getFormatOptions() {
        return this.formatOptions;
    }

    /**
     * @param formatOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withFormatOptions(FormatOptions formatOptions) {
        setFormatOptions(formatOptions);
        return this;
    }

    /**
     * @param input
     */

    public void setInput(Input input) {
        this.input = input;
    }

    /**
     * @return
     */

    public Input getInput() {
        return this.input;
    }

    /**
     * @param input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withInput(Input input) {
        setInput(input);
        return this;
    }

    /**
     * <p>
     * The date and time that the dataset was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the dataset was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the dataset was last modified.
     * </p>
     * 
     * @return The date and time that the dataset was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time that the dataset was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time that the dataset was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the dataset.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the dataset.
     */

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the dataset.
     * </p>
     * 
     * @return The identifier (user name) of the user who last modified the dataset.
     */

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * <p>
     * The identifier (user name) of the user who last modified the dataset.
     * </p>
     * 
     * @param lastModifiedBy
     *        The identifier (user name) of the user who last modified the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withLastModifiedBy(String lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * </p>
     * 
     * @param source
     *        The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * @see Source
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * </p>
     * 
     * @return The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * @see Source
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * </p>
     * 
     * @param source
     *        The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Source
     */

    public DescribeDatasetResult withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * </p>
     * 
     * @param source
     *        The location of the data for this dataset, Amazon S3 or the Glue Data Catalog.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Source
     */

    public DescribeDatasetResult withSource(Source source) {
        this.source = source.toString();
        return this;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @param pathOptions
     *        A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     */

    public void setPathOptions(PathOptions pathOptions) {
        this.pathOptions = pathOptions;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @return A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     */

    public PathOptions getPathOptions() {
        return this.pathOptions;
    }

    /**
     * <p>
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * </p>
     * 
     * @param pathOptions
     *        A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withPathOptions(PathOptions pathOptions) {
        setPathOptions(pathOptions);
        return this;
    }

    /**
     * <p>
     * Metadata tags associated with this dataset.
     * </p>
     * 
     * @return Metadata tags associated with this dataset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags associated with this dataset.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this dataset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags associated with this dataset.
     * </p>
     * 
     * @param tags
     *        Metadata tags associated with this dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see DescribeDatasetResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the dataset.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the dataset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDatasetResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getFormatOptions() != null)
            sb.append("FormatOptions: ").append(getFormatOptions()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append(getInput()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getPathOptions() != null)
            sb.append("PathOptions: ").append(getPathOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDatasetResult == false)
            return false;
        DescribeDatasetResult other = (DescribeDatasetResult) obj;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getFormatOptions() == null ^ this.getFormatOptions() == null)
            return false;
        if (other.getFormatOptions() != null && other.getFormatOptions().equals(this.getFormatOptions()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getPathOptions() == null ^ this.getPathOptions() == null)
            return false;
        if (other.getPathOptions() != null && other.getPathOptions().equals(this.getPathOptions()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getFormatOptions() == null) ? 0 : getFormatOptions().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getPathOptions() == null) ? 0 : getPathOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDatasetResult clone() {
        try {
            return (DescribeDatasetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
