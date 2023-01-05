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
package com.amazonaws.services.finspacedata.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * The response from a describe changeset operation
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2020-07-13/GetChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChangesetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for a Changeset.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The ARN identifier of the Changeset.
     * </p>
     */
    private String changesetArn;
    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     */
    private String datasetId;
    /**
     * <p>
     * Type that indicates how a Changeset is applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     */
    private String changeType;
    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     */
    private java.util.Map<String, String> sourceParams;
    /**
     * <p>
     * Structure of the source file(s).
     * </p>
     */
    private java.util.Map<String, String> formatParams;
    /**
     * <p>
     * The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long createTime;
    /**
     * <p>
     * The status of Changeset creation operation.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The structure with error messages.
     * </p>
     */
    private ChangesetErrorInfo errorInfo;
    /**
     * <p>
     * Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long activeUntilTimestamp;
    /**
     * <p>
     * Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private Long activeFromTimestamp;
    /**
     * <p>
     * The unique identifier of the Changeset that is being updated.
     * </p>
     */
    private String updatesChangesetId;
    /**
     * <p>
     * The unique identifier of the updated Changeset.
     * </p>
     */
    private String updatedByChangesetId;

    /**
     * <p>
     * The unique identifier for a Changeset.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier for a Changeset.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * The unique identifier for a Changeset.
     * </p>
     * 
     * @return The unique identifier for a Changeset.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * The unique identifier for a Changeset.
     * </p>
     * 
     * @param changesetId
     *        The unique identifier for a Changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The ARN identifier of the Changeset.
     * </p>
     * 
     * @param changesetArn
     *        The ARN identifier of the Changeset.
     */

    public void setChangesetArn(String changesetArn) {
        this.changesetArn = changesetArn;
    }

    /**
     * <p>
     * The ARN identifier of the Changeset.
     * </p>
     * 
     * @return The ARN identifier of the Changeset.
     */

    public String getChangesetArn() {
        return this.changesetArn;
    }

    /**
     * <p>
     * The ARN identifier of the Changeset.
     * </p>
     * 
     * @param changesetArn
     *        The ARN identifier of the Changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withChangesetArn(String changesetArn) {
        setChangesetArn(changesetArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset is created.
     */

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @return The unique identifier for the FinSpace Dataset where the Changeset is created.
     */

    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * <p>
     * The unique identifier for the FinSpace Dataset where the Changeset is created.
     * </p>
     * 
     * @param datasetId
     *        The unique identifier for the FinSpace Dataset where the Changeset is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withDatasetId(String datasetId) {
        setDatasetId(datasetId);
        return this;
    }

    /**
     * <p>
     * Type that indicates how a Changeset is applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Type that indicates how a Changeset is applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @see ChangeType
     */

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    /**
     * <p>
     * Type that indicates how a Changeset is applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type that indicates how a Changeset is applied to a Dataset.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     *         </p>
     *         </li>
     * @see ChangeType
     */

    public String getChangeType() {
        return this.changeType;
    }

    /**
     * <p>
     * Type that indicates how a Changeset is applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Type that indicates how a Changeset is applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public GetChangesetResult withChangeType(String changeType) {
        setChangeType(changeType);
        return this;
    }

    /**
     * <p>
     * Type that indicates how a Changeset is applied to a Dataset.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     * </p>
     * </li>
     * </ul>
     * 
     * @param changeType
     *        Type that indicates how a Changeset is applied to a Dataset.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLACE</code> – Changeset is considered as a replacement to all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>APPEND</code> – Changeset is considered as an addition to the end of all prior loaded Changesets.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MODIFY</code> – Changeset is considered as a replacement to a specific prior ingested Changeset.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangeType
     */

    public GetChangesetResult withChangeType(ChangeType changeType) {
        this.changeType = changeType.toString();
        return this;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @return Options that define the location of the data being ingested.
     */

    public java.util.Map<String, String> getSourceParams() {
        return sourceParams;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @param sourceParams
     *        Options that define the location of the data being ingested.
     */

    public void setSourceParams(java.util.Map<String, String> sourceParams) {
        this.sourceParams = sourceParams;
    }

    /**
     * <p>
     * Options that define the location of the data being ingested.
     * </p>
     * 
     * @param sourceParams
     *        Options that define the location of the data being ingested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withSourceParams(java.util.Map<String, String> sourceParams) {
        setSourceParams(sourceParams);
        return this;
    }

    /**
     * Add a single SourceParams entry
     *
     * @see GetChangesetResult#withSourceParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult addSourceParamsEntry(String key, String value) {
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

    public GetChangesetResult clearSourceParamsEntries() {
        this.sourceParams = null;
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

    public GetChangesetResult withFormatParams(java.util.Map<String, String> formatParams) {
        setFormatParams(formatParams);
        return this;
    }

    /**
     * Add a single FormatParams entry
     *
     * @see GetChangesetResult#withFormatParams
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult addFormatParamsEntry(String key, String value) {
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

    public GetChangesetResult clearFormatParamsEntries() {
        this.formatParams = null;
        return this;
    }

    /**
     * <p>
     * The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createTime
     *        The timestamp at which the Changeset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withCreateTime(Long createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The status of Changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of Changeset creation operation.
     * @see IngestionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of Changeset creation operation.
     * </p>
     * 
     * @return The status of Changeset creation operation.
     * @see IngestionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of Changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of Changeset creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public GetChangesetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of Changeset creation operation.
     * </p>
     * 
     * @param status
     *        The status of Changeset creation operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IngestionStatus
     */

    public GetChangesetResult withStatus(IngestionStatus status) {
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

    public void setErrorInfo(ChangesetErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * The structure with error messages.
     * </p>
     * 
     * @return The structure with error messages.
     */

    public ChangesetErrorInfo getErrorInfo() {
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

    public GetChangesetResult withErrorInfo(ChangesetErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
        return this;
    }

    /**
     * <p>
     * Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeUntilTimestamp
     *        Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setActiveUntilTimestamp(Long activeUntilTimestamp) {
        this.activeUntilTimestamp = activeUntilTimestamp;
    }

    /**
     * <p>
     * Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getActiveUntilTimestamp() {
        return this.activeUntilTimestamp;
    }

    /**
     * <p>
     * Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For example, the
     * value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeUntilTimestamp
     *        Time until which the Changeset is active. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withActiveUntilTimestamp(Long activeUntilTimestamp) {
        setActiveUntilTimestamp(activeUntilTimestamp);
        return this;
    }

    /**
     * <p>
     * Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeFromTimestamp
     *        Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setActiveFromTimestamp(Long activeFromTimestamp) {
        this.activeFromTimestamp = activeFromTimestamp;
    }

    /**
     * <p>
     * Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds.
     *         For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public Long getActiveFromTimestamp() {
        return this.activeFromTimestamp;
    }

    /**
     * <p>
     * Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeFromTimestamp
     *        Beginning time from which the Changeset is active. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withActiveFromTimestamp(Long activeFromTimestamp) {
        setActiveFromTimestamp(activeFromTimestamp);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the Changeset that is being updated.
     * </p>
     * 
     * @param updatesChangesetId
     *        The unique identifier of the Changeset that is being updated.
     */

    public void setUpdatesChangesetId(String updatesChangesetId) {
        this.updatesChangesetId = updatesChangesetId;
    }

    /**
     * <p>
     * The unique identifier of the Changeset that is being updated.
     * </p>
     * 
     * @return The unique identifier of the Changeset that is being updated.
     */

    public String getUpdatesChangesetId() {
        return this.updatesChangesetId;
    }

    /**
     * <p>
     * The unique identifier of the Changeset that is being updated.
     * </p>
     * 
     * @param updatesChangesetId
     *        The unique identifier of the Changeset that is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withUpdatesChangesetId(String updatesChangesetId) {
        setUpdatesChangesetId(updatesChangesetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the updated Changeset.
     * </p>
     * 
     * @param updatedByChangesetId
     *        The unique identifier of the updated Changeset.
     */

    public void setUpdatedByChangesetId(String updatedByChangesetId) {
        this.updatedByChangesetId = updatedByChangesetId;
    }

    /**
     * <p>
     * The unique identifier of the updated Changeset.
     * </p>
     * 
     * @return The unique identifier of the updated Changeset.
     */

    public String getUpdatedByChangesetId() {
        return this.updatedByChangesetId;
    }

    /**
     * <p>
     * The unique identifier of the updated Changeset.
     * </p>
     * 
     * @param updatedByChangesetId
     *        The unique identifier of the updated Changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChangesetResult withUpdatedByChangesetId(String updatedByChangesetId) {
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
        if (getChangesetId() != null)
            sb.append("ChangesetId: ").append(getChangesetId()).append(",");
        if (getChangesetArn() != null)
            sb.append("ChangesetArn: ").append(getChangesetArn()).append(",");
        if (getDatasetId() != null)
            sb.append("DatasetId: ").append(getDatasetId()).append(",");
        if (getChangeType() != null)
            sb.append("ChangeType: ").append(getChangeType()).append(",");
        if (getSourceParams() != null)
            sb.append("SourceParams: ").append(getSourceParams()).append(",");
        if (getFormatParams() != null)
            sb.append("FormatParams: ").append(getFormatParams()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo()).append(",");
        if (getActiveUntilTimestamp() != null)
            sb.append("ActiveUntilTimestamp: ").append(getActiveUntilTimestamp()).append(",");
        if (getActiveFromTimestamp() != null)
            sb.append("ActiveFromTimestamp: ").append(getActiveFromTimestamp()).append(",");
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

        if (obj instanceof GetChangesetResult == false)
            return false;
        GetChangesetResult other = (GetChangesetResult) obj;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
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
        if (other.getSourceParams() == null ^ this.getSourceParams() == null)
            return false;
        if (other.getSourceParams() != null && other.getSourceParams().equals(this.getSourceParams()) == false)
            return false;
        if (other.getFormatParams() == null ^ this.getFormatParams() == null)
            return false;
        if (other.getFormatParams() != null && other.getFormatParams().equals(this.getFormatParams()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        if (other.getActiveUntilTimestamp() == null ^ this.getActiveUntilTimestamp() == null)
            return false;
        if (other.getActiveUntilTimestamp() != null && other.getActiveUntilTimestamp().equals(this.getActiveUntilTimestamp()) == false)
            return false;
        if (other.getActiveFromTimestamp() == null ^ this.getActiveFromTimestamp() == null)
            return false;
        if (other.getActiveFromTimestamp() != null && other.getActiveFromTimestamp().equals(this.getActiveFromTimestamp()) == false)
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

        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getChangesetArn() == null) ? 0 : getChangesetArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetId() == null) ? 0 : getDatasetId().hashCode());
        hashCode = prime * hashCode + ((getChangeType() == null) ? 0 : getChangeType().hashCode());
        hashCode = prime * hashCode + ((getSourceParams() == null) ? 0 : getSourceParams().hashCode());
        hashCode = prime * hashCode + ((getFormatParams() == null) ? 0 : getFormatParams().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        hashCode = prime * hashCode + ((getActiveUntilTimestamp() == null) ? 0 : getActiveUntilTimestamp().hashCode());
        hashCode = prime * hashCode + ((getActiveFromTimestamp() == null) ? 0 : getActiveFromTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatesChangesetId() == null) ? 0 : getUpdatesChangesetId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedByChangesetId() == null) ? 0 : getUpdatedByChangesetId().hashCode());
        return hashCode;
    }

    @Override
    public GetChangesetResult clone() {
        try {
            return (GetChangesetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
