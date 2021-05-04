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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/CreateChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateChangesetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset will be created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Option to indicate how a changeset will be applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * </ul>
     */
    private String changeType;
    /**
     * <p>
     * Type of the data source from which the files to create the changeset will be sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceType;
    /**
     * <p>
     * Source path from which the files to create the changeset will be sourced.
     * </p>
     */
    private java.util.Map<String, String> sourceParams;
    /**
     * <p>
     * Format type of the input files being loaded into the changeset.
     * </p>
     */
    private String formatType;
    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     */
    private java.util.Map<String, String> formatParams;
    /**
     * <p>
     * Metadata tags to apply to this changeset.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset will be created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace dataset in which the changeset will be created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset will be created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace dataset in which the changeset will be created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset will be created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace dataset in which the changeset will be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Option to indicate how a changeset will be applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a changeset will be applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        changesets.
     *        </p>
     *        </li>
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Option to indicate how a changeset will be applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Option to indicate how a changeset will be applied to a dataset.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *         changesets.
     *         </p>
     *         </li>
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Option to indicate how a changeset will be applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a changeset will be applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        changesets.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CreateChangesetRequest withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Option to indicate how a changeset will be applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Option to indicate how a changeset will be applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset will be considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset will be considered as an addition to the end of all prior loaded
     *        changesets.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public CreateChangesetRequest withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
        return this;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset will be sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        Type of the data source from which the files to create the changeset will be sourced.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code> - Amazon S3.
     *        </p>
     *        </li>
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset will be sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of the data source from which the files to create the changeset will be sourced.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>S3</code> - Amazon S3.
     *         </p>
     *         </li>
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset will be sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        Type of the data source from which the files to create the changeset will be sourced.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code> - Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public CreateChangesetRequest withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset will be sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceType
     *        Type of the data source from which the files to create the changeset will be sourced.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code> - Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public CreateChangesetRequest withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset will be sourced.
     * </p>
     * 
     * @return Source path from which the files to create the changeset will be sourced.
     */

    public java.util.Map<String, String> getSourceParams() {
        return sourceParams;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset will be sourced.
     * </p>
     * 
     * @param sourceParams
     *        Source path from which the files to create the changeset will be sourced.
     */

    public void setSourceParams(java.util.Map<String, String> sourceParams) {
        this.sourceParams = sourceParams;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset will be sourced.
     * </p>
     * 
     * @param sourceParams
     *        Source path from which the files to create the changeset will be sourced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withSourceParams(java.util.Map<String, String> sourceParams) {
        setSourceParams(sourceParams);
        return this;
    }

    /**
     * Add a single SourceParams entry
     *
     * @see CreateChangesetRequest#withSourceParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest addSourceParamsEntry(String key, String value) {
        if (null == this.sourceParams) {
            this.sourceParams = new java.util.HashMap<String, String>();
        }
        if (this.sourceParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.sourceParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SourceParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest clearSourceParamsEntries() {
        this.sourceParams = null;
        return this;
    }

    /**
     * <p>
     * Format type of the input files being loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files being loaded into the changeset.
     * @see FormatType
     */

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    /**
     * <p>
     * Format type of the input files being loaded into the changeset.
     * </p>
     * 
     * @return Format type of the input files being loaded into the changeset.
     * @see FormatType
     */

    public String getFormatType() {
        return this.formatType;
    }

    /**
     * <p>
     * Format type of the input files being loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files being loaded into the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatType
     */

    public CreateChangesetRequest withFormatType(String formatType) {
        setFormatType(formatType);
        return this;
    }

    /**
     * <p>
     * Format type of the input files being loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files being loaded into the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatType
     */

    public CreateChangesetRequest withFormatType(FormatType formatType) {
        this.formatType = formatType.toString();
        return this;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @return Options that define the structure of the source file(s).
     */

    public java.util.Map<String, String> getFormatParams() {
        return formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s).
     */

    public void setFormatParams(java.util.Map<String, String> formatParams) {
        this.formatParams = formatParams;
    }

    /**
     * <p>
     * Options that define the structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Options that define the structure of the source file(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withFormatParams(java.util.Map<String, String> formatParams) {
        setFormatParams(formatParams);
        return this;
    }

    /**
     * Add a single FormatParams entry
     *
     * @see CreateChangesetRequest#withFormatParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest addFormatParamsEntry(String key, String value) {
        if (null == this.formatParams) {
            this.formatParams = new java.util.HashMap<String, String>();
        }
        if (this.formatParams.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.formatParams.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FormatParams.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest clearFormatParamsEntries() {
        this.formatParams = null;
        return this;
    }

    /**
     * <p>
     * Metadata tags to apply to this changeset.
     * </p>
     * 
     * @return Metadata tags to apply to this changeset.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this changeset.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this changeset.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this changeset.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateChangesetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateChangesetRequest addTagsEntry(String key, String value) {
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

    public CreateChangesetRequest clearTagsEntries() {
        this.tags = null;
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
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getSourceParams() != null)
            sb.append("SourceParams: ").append(getSourceParams()).append(",");
        if (getFormatType() != null)
            sb.append("FormatType: ").append(getFormatType()).append(",");
        if (getFormatParams() != null)
            sb.append("FormatParams: ").append(getFormatParams()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateChangesetRequest == false)
            return false;
        CreateChangesetRequest other = (CreateChangesetRequest) obj;
        if (other.getDatasetId() == null ^ this.getDatasetId() == null)
            return false;
        if (other.getDatasetId() != null && other.getDatasetId().equals(this.getDatasetId()) == false)
            return false;
        if (other.getChangeType() == null ^ this.getChangeType() == null)
            return false;
        if (other.getChangeType() != null && other.getChangeType().equals(this.getChangeType()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getSourceParams() == null ^ this.getSourceParams() == null)
            return false;
        if (other.getSourceParams() != null && other.getSourceParams().equals(this.getSourceParams()) == false)
            return false;
        if (other.getFormatType() == null ^ this.getFormatType() == null)
            return false;
        if (other.getFormatType() != null && other.getFormatType().equals(this.getFormatType()) == false)
            return false;
        if (other.getFormatParams() == null ^ this.getFormatParams() == null)
            return false;
        if (other.getFormatParams() != null && other.getFormatParams().equals(this.getFormatParams()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceParams() == null) ? 0 : getSourceParams().hashCode());
        hashCode = prime * hashCode + ((getFormatType() == null) ? 0 : getFormatType().hashCode());
        hashCode = prime * hashCode + ((getFormatParams() == null) ? 0 : getFormatParams().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateChangesetRequest clone() {
        return (CreateChangesetRequest) super.clone();
    }

}
