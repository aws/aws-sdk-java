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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/GetKxChangeset" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetKxChangesetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String changesetId;
    /**
     * <p>
     * The name of the kdb database.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * A list of change request objects that are run in order.
     * </p>
     */
    private java.util.List<ChangeRequest> changeRequests;
    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date activeFromTimestamp;
    /**
     * <p>
     * The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * Status of the changeset creation process.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending – Changeset creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Processing – Changeset creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – Changeset creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Complete – Changeset creation has succeeded.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Provides details in the event of a failed flow, including the error type and the related error message.
     * </p>
     */
    private ErrorInfo errorInfo;

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     */

    public void setChangesetId(String changesetId) {
        this.changesetId = changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @return A unique identifier for the changeset.
     */

    public String getChangesetId() {
        return this.changesetId;
    }

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     * 
     * @param changesetId
     *        A unique identifier for the changeset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withChangesetId(String changesetId) {
        setChangesetId(changesetId);
        return this;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @return The name of the kdb database.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The name of the kdb database.
     * </p>
     * 
     * @param databaseName
     *        The name of the kdb database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @return A unique identifier for the kdb environment.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * A unique identifier for the kdb environment.
     * </p>
     * 
     * @param environmentId
     *        A unique identifier for the kdb environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * A list of change request objects that are run in order.
     * </p>
     * 
     * @return A list of change request objects that are run in order.
     */

    public java.util.List<ChangeRequest> getChangeRequests() {
        return changeRequests;
    }

    /**
     * <p>
     * A list of change request objects that are run in order.
     * </p>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order.
     */

    public void setChangeRequests(java.util.Collection<ChangeRequest> changeRequests) {
        if (changeRequests == null) {
            this.changeRequests = null;
            return;
        }

        this.changeRequests = new java.util.ArrayList<ChangeRequest>(changeRequests);
    }

    /**
     * <p>
     * A list of change request objects that are run in order.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setChangeRequests(java.util.Collection)} or {@link #withChangeRequests(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withChangeRequests(ChangeRequest... changeRequests) {
        if (this.changeRequests == null) {
            setChangeRequests(new java.util.ArrayList<ChangeRequest>(changeRequests.length));
        }
        for (ChangeRequest ele : changeRequests) {
            this.changeRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of change request objects that are run in order.
     * </p>
     * 
     * @param changeRequests
     *        A list of change request objects that are run in order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withChangeRequests(java.util.Collection<ChangeRequest> changeRequests) {
        setChangeRequests(changeRequests);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param createdTimestamp
     *        The timestamp at which the changeset was created in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeFromTimestamp
     *        Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setActiveFromTimestamp(java.util.Date activeFromTimestamp) {
        this.activeFromTimestamp = activeFromTimestamp;
    }

    /**
     * <p>
     * Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds.
     *         For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public java.util.Date getActiveFromTimestamp() {
        return this.activeFromTimestamp;
    }

    /**
     * <p>
     * Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param activeFromTimestamp
     *        Beginning time from which the changeset is active. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withActiveFromTimestamp(java.util.Date activeFromTimestamp) {
        setActiveFromTimestamp(activeFromTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     *         milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *         1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     * milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp at which the changeset was updated in FinSpace. The value is determined as epoch time in
     *        milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as
     *        1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * Status of the changeset creation process.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending – Changeset creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Processing – Changeset creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – Changeset creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Complete – Changeset creation has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Status of the changeset creation process.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending – Changeset creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Processing – Changeset creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – Changeset creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Complete – Changeset creation has succeeded.
     *        </p>
     *        </li>
     * @see ChangesetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Status of the changeset creation process.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending – Changeset creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Processing – Changeset creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – Changeset creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Complete – Changeset creation has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Status of the changeset creation process.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Pending – Changeset creation is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Processing – Changeset creation is running.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Failed – Changeset creation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Complete – Changeset creation has succeeded.
     *         </p>
     *         </li>
     * @see ChangesetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Status of the changeset creation process.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending – Changeset creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Processing – Changeset creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – Changeset creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Complete – Changeset creation has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Status of the changeset creation process.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending – Changeset creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Processing – Changeset creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – Changeset creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Complete – Changeset creation has succeeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangesetStatus
     */

    public GetKxChangesetResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the changeset creation process.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Pending – Changeset creation is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * Processing – Changeset creation is running.
     * </p>
     * </li>
     * <li>
     * <p>
     * Failed – Changeset creation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * Complete – Changeset creation has succeeded.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Status of the changeset creation process.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Pending – Changeset creation is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Processing – Changeset creation is running.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Failed – Changeset creation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Complete – Changeset creation has succeeded.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ChangesetStatus
     */

    public GetKxChangesetResult withStatus(ChangesetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Provides details in the event of a failed flow, including the error type and the related error message.
     * </p>
     * 
     * @param errorInfo
     *        Provides details in the event of a failed flow, including the error type and the related error message.
     */

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    /**
     * <p>
     * Provides details in the event of a failed flow, including the error type and the related error message.
     * </p>
     * 
     * @return Provides details in the event of a failed flow, including the error type and the related error message.
     */

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    /**
     * <p>
     * Provides details in the event of a failed flow, including the error type and the related error message.
     * </p>
     * 
     * @param errorInfo
     *        Provides details in the event of a failed flow, including the error type and the related error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetKxChangesetResult withErrorInfo(ErrorInfo errorInfo) {
        setErrorInfo(errorInfo);
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
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getChangeRequests() != null)
            sb.append("ChangeRequests: ").append(getChangeRequests()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getActiveFromTimestamp() != null)
            sb.append("ActiveFromTimestamp: ").append(getActiveFromTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorInfo() != null)
            sb.append("ErrorInfo: ").append(getErrorInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetKxChangesetResult == false)
            return false;
        GetKxChangesetResult other = (GetKxChangesetResult) obj;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getChangeRequests() == null ^ this.getChangeRequests() == null)
            return false;
        if (other.getChangeRequests() != null && other.getChangeRequests().equals(this.getChangeRequests()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getActiveFromTimestamp() == null ^ this.getActiveFromTimestamp() == null)
            return false;
        if (other.getActiveFromTimestamp() != null && other.getActiveFromTimestamp().equals(this.getActiveFromTimestamp()) == false)
            return false;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorInfo() == null ^ this.getErrorInfo() == null)
            return false;
        if (other.getErrorInfo() != null && other.getErrorInfo().equals(this.getErrorInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getChangeRequests() == null) ? 0 : getChangeRequests().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getActiveFromTimestamp() == null) ? 0 : getActiveFromTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInfo() == null) ? 0 : getErrorInfo().hashCode());
        return hashCode;
    }

    @Override
    public GetKxChangesetResult clone() {
        try {
            return (GetKxChangesetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
