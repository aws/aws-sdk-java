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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A changeset is unit of data in a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/ChangesetInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChangesetInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a changeset.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ARN identifier of the changeset.
     * </p>
     */
    private String changesetArn;
    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset is created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Change type indicates how a changeset is applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     * </p>
     * </li>
     * </ul>
     */
    private String changeType;
    /**
     * <p>
     * Type of the data source from which the files to create the changeset are sourced.
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
     * Source path from which the files to create the changeset are sourced.
     * </p>
     */
    private java.util.Map<String, String> sourceParams;
    /**
     * <p>
     * Format type of the input files loaded into the changeset.
     * </p>
     */
    private String formatType;
    /**
     * <p>
     * Structure of the source file(s).
     * </p>
     */
    private java.util.Map<String, String> formatParams;
    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The status of changeset creation operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The structure with error messages.
     * </p>
     */
    private ErrorInfo errorInfo;
    /**
     * <p>
     * Tags associated with the changeset.
     * </p>
     */
    private java.util.Map<String, String> changesetLabels;
    /**
     * <p>
     * Unique identifier of the changeset that is updated.
     * </p>
     */
    private String updatesChangesetId;
    /**
     * <p>
     * Unique identifier of the changeset that is updated a changeset.
     * </p>
     */
    private String updatedByChangesetId;

    /**
     * <p>
     * Unique identifier for a changeset.
     * </p>
     * 
     * @param id
     *        Unique identifier for a changeset.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Unique identifier for a changeset.
     * </p>
     * 
     * @return Unique identifier for a changeset.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Unique identifier for a changeset.
     * </p>
     * 
     * @param id
     *        Unique identifier for a changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the changeset.
     * </p>
     * 
     * @param changesetArn
     *        The ARN identifier of the changeset.
     */

    public void setChangesetArn(String changesetArn) {
        this.changesetArn = changesetArn;
    }

    /**
     * <p>
     * The ARN identifier of the changeset.
     * </p>
     * 
     * @return The ARN identifier of the changeset.
     */

    public String getChangesetArn() {
        return this.changesetArn;
    }

    /**
     * <p>
     * The ARN identifier of the changeset.
     * </p>
     * 
     * @param changesetArn
     *        The ARN identifier of the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withChangesetArn(String changesetArn) {
        setChangesetArn(changesetArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace dataset in which the changeset is created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset is created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace dataset in which the changeset is created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace dataset in which the changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace dataset in which the changeset is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Change type indicates how a changeset is applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Change type indicates how a changeset is applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     *        </p>
     *        </li>
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Change type indicates how a changeset is applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Change type indicates how a changeset is applied to a dataset.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     *         </p>
     *         </li>
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Change type indicates how a changeset is applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Change type indicates how a changeset is applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public ChangesetInfo withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Change type indicates how a changeset is applied to a dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Change type indicates how a changeset is applied to a dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> - Changeset is considered as a replacement to all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> - Changeset is considered as an addition to the end of all prior loaded changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> - Changeset is considered as a replacement to a specific prior ingested changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public ChangesetInfo withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
        return this;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset are sourced.
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
     *        Type of the data source from which the files to create the changeset are sourced.</p>
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
     * Type of the data source from which the files to create the changeset are sourced.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>S3</code> - Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of the data source from which the files to create the changeset are sourced.</p>
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
     * Type of the data source from which the files to create the changeset are sourced.
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
     *        Type of the data source from which the files to create the changeset are sourced.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code> - Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ChangesetInfo withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Type of the data source from which the files to create the changeset are sourced.
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
     *        Type of the data source from which the files to create the changeset are sourced.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>S3</code> - Amazon S3.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public ChangesetInfo withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset are sourced.
     * </p>
     * 
     * @return Source path from which the files to create the changeset are sourced.
     */

    public java.util.Map<String, String> getSourceParams() {
        return sourceParams;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset are sourced.
     * </p>
     * 
     * @param sourceParams
     *        Source path from which the files to create the changeset are sourced.
     */

    public void setSourceParams(java.util.Map<String, String> sourceParams) {
        this.sourceParams = sourceParams;
    }

    /**
     * <p>
     * Source path from which the files to create the changeset are sourced.
     * </p>
     * 
     * @param sourceParams
     *        Source path from which the files to create the changeset are sourced.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withSourceParams(java.util.Map<String, String> sourceParams) {
        setSourceParams(sourceParams);
        return this;
    }

    /**
     * Add a single SourceParams entry
     *
     * @see ChangesetInfo#withSourceParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo addSourceParamsEntry(String key, String value) {
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

    public ChangesetInfo clearSourceParamsEntries() {
        this.sourceParams = null;
        return this;
    }

    /**
     * <p>
     * Format type of the input files loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files loaded into the changeset.
     * @see FormatType
     */

    public void setFormatType(String formatType) {
        this.formatType = formatType;
    }

    /**
     * <p>
     * Format type of the input files loaded into the changeset.
     * </p>
     * 
     * @return Format type of the input files loaded into the changeset.
     * @see FormatType
     */

    public String getFormatType() {
        return this.formatType;
    }

    /**
     * <p>
     * Format type of the input files loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files loaded into the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatType
     */

    public ChangesetInfo withFormatType(String formatType) {
        setFormatType(formatType);
        return this;
    }

    /**
     * <p>
     * Format type of the input files loaded into the changeset.
     * </p>
     * 
     * @param formatType
     *        Format type of the input files loaded into the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FormatType
     */

    public ChangesetInfo withFormatType(FormatType formatType) {
        this.formatType = formatType.toString();
        return this;
    }

    /**
     * <p>
     * Structure of the source file(s).
     * </p>
     * 
     * @return Structure of the source file(s).
     */

    public java.util.Map<String, String> getFormatParams() {
        return formatParams;
    }

    /**
     * <p>
     * Structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Structure of the source file(s).
     */

    public void setFormatParams(java.util.Map<String, String> formatParams) {
        this.formatParams = formatParams;
    }

    /**
     * <p>
     * Structure of the source file(s).
     * </p>
     * 
     * @param formatParams
     *        Structure of the source file(s).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withFormatParams(java.util.Map<String, String> formatParams) {
        setFormatParams(formatParams);
        return this;
    }

    /**
     * Add a single FormatParams entry
     *
     * @see ChangesetInfo#withFormatParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo addFormatParamsEntry(String key, String value) {
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

    public ChangesetInfo clearFormatParamsEntries() {
        this.formatParams = null;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace.
     * </p>
     * 
     * @param createTimestamp
     *        The timestamp at which the changeset was created in FinSpace.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace.
     * </p>
     * 
     * @return The timestamp at which the changeset was created in FinSpace.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace.
     * </p>
     * 
     * @param createTimestamp
     *        The timestamp at which the changeset was created in FinSpace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The status of changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of changeset creation operation.
     * @see ChangesetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of changeset creation operation.
     * </p>
     * 
     * @return The status of changeset creation operation.
     * @see ChangesetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of changeset creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangesetStatus
     */

    public ChangesetInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of changeset creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangesetStatus
     */

    public ChangesetInfo withStatus(ChangesetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The structure with error messages.
     * </p>
     * 
     * @param errorInfo
     *        The structure with error messages.
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * The structure with error messages.
     * </p>
     * 
     * @return The structure with error messages.
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * The structure with error messages.
     * </p>
     * 
     * @param errorInfo
     *        The structure with error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * Tags associated with the changeset.
     * </p>
     * 
     * @return Tags associated with the changeset.
     */

    public java.util.Map<String, String> getChangesetLabels() {
        return changesetLabels;
    }

    /**
     * <p>
     * Tags associated with the changeset.
     * </p>
     * 
     * @param changesetLabels
     *        Tags associated with the changeset.
     */

    public void setChangesetLabels(java.util.Map<String, String> changesetLabels) {
        this.changesetLabels = changesetLabels;
    }

    /**
     * <p>
     * Tags associated with the changeset.
     * </p>
     * 
     * @param changesetLabels
     *        Tags associated with the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withChangesetLabels(java.util.Map<String, String> changesetLabels) {
        setChangesetLabels(changesetLabels);
        return this;
    }

    /**
     * Add a single ChangesetLabels entry
     *
     * @see ChangesetInfo#withChangesetLabels
     * @returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo addChangesetLabelsEntry(String key, String value) {
        if (null == this.changesetLabels) {
            this.changesetLabels = new java.util.HashMap<String, String>();
        }
        if (this.changesetLabels.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.changesetLabels.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ChangesetLabels.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo clearChangesetLabelsEntries() {
        this.changesetLabels = null;
        return this;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated.
     * </p>
     * 
     * @param updatesChangesetId
     *        Unique identifier of the changeset that is updated.
     */

    public void setUpdatesChangesetId(String updatesChangesetId) {
        this.updatesChangesetId = updatesChangesetId;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated.
     * </p>
     * 
     * @return Unique identifier of the changeset that is updated.
     */

    public String getUpdatesChangesetId() {
        return this.updatesChangesetId;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated.
     * </p>
     * 
     * @param updatesChangesetId
     *        Unique identifier of the changeset that is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withUpdatesChangesetId(String updatesChangesetId) {
        setUpdatesChangesetId(updatesChangesetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated a changeset.
     * </p>
     * 
     * @param updatedByChangesetId
     *        Unique identifier of the changeset that is updated a changeset.
     */

    public void setUpdatedByChangesetId(String updatedByChangesetId) {
        this.updatedByChangesetId = updatedByChangesetId;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated a changeset.
     * </p>
     * 
     * @return Unique identifier of the changeset that is updated a changeset.
     */

    public String getUpdatedByChangesetId() {
        return this.updatedByChangesetId;
    }

    /**
     * <p>
     * Unique identifier of the changeset that is updated a changeset.
     * </p>
     * 
     * @param updatedByChangesetId
     *        Unique identifier of the changeset that is updated a changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChangesetInfo withUpdatedByChangesetId(String updatedByChangesetId) {
        setUpdatedByChangesetId(updatedByChangesetId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getChangesetArn() != null)
            sb.append("ChangesetArn: ").append(getChangesetArn()).append(",");
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
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: ").append(getCreateTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getChangesetLabels() != null)
            sb.append("ChangesetLabels: ").append(getChangesetLabels()).append(",");
        if (getUpdatesChangesetId() != null)
            sb.append("UpdatesChangesetId: ").append(getUpdatesChangesetId()).append(",");
        if (getUpdatedByChangesetId() != null)
            sb.append("UpdatedByChangesetId: ").append(getUpdatedByChangesetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChangesetInfo == false)
            return false;
        ChangesetInfo other = (ChangesetInfo) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getChangesetArn() == null ^ this.getChangesetArn() == null)
            return false;
        if (other.getChangesetArn() != null && other.getChangesetArn().equals(this.getChangesetArn()) == false)
            return false;
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
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getChangesetLabels() == null ^ this.getChangesetLabels() == null)
            return false;
        if (other.getChangesetLabels() != null && other.getChangesetLabels().equals(this.getChangesetLabels()) == false)
            return false;
        if (other.getUpdatesChangesetId() == null ^ this.getUpdatesChangesetId() == null)
            return false;
        if (other.getUpdatesChangesetId() != null && other.getUpdatesChangesetId().equals(this.getUpdatesChangesetId()) == false)
            return false;
        if (other.getUpdatedByChangesetId() == null ^ this.getUpdatedByChangesetId() == null)
            return false;
        if (other.getUpdatedByChangesetId() != null && other.getUpdatedByChangesetId().equals(this.getUpdatedByChangesetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getChangesetArn() == null) ? 0 : getChangesetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getSourceParams() == null) ? 0 : getSourceParams().hashCode());
        hashCode = prime * hashCode + ((getFormatType() == null) ? 0 : getFormatType().hashCode());
        hashCode = prime * hashCode + ((getFormatParams() == null) ? 0 : getFormatParams().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getChangesetLabels() == null) ? 0 : getChangesetLabels().hashCode());
        hashCode = prime * hashCode + ((getUpdatesChangesetId() == null) ? 0 : getUpdatesChangesetId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedByChangesetId() == null) ? 0 : getUpdatedByChangesetId().hashCode());
        return hashCode;
    }

    @Override
    public ChangesetInfo clone() {
        try {
            return (ChangesetInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspacedata.model.transform.ChangesetInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
