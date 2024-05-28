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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of changeset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxChangesetListEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxChangesetListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the changeset.
     * </p>
     */
    private String changesetId;
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
     * The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * Status of the changeset.
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

    public KxChangesetListEntry withChangesetId(String changesetId) {
        setChangesetId(changesetId);
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

    public KxChangesetListEntry withCreatedTimestamp(java.util.Date createdTimestamp) {
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

    public KxChangesetListEntry withActiveFromTimestamp(java.util.Date activeFromTimestamp) {
        setActiveFromTimestamp(activeFromTimestamp);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds.
     *         For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds. For
     * example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp at which the changeset was modified. The value is determined as epoch time in milliseconds.
     *        For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxChangesetListEntry withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * Status of the changeset.
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
     *        Status of the changeset.</p>
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
     * Status of the changeset.
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
     * @return Status of the changeset.</p>
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
     * Status of the changeset.
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
     *        Status of the changeset.</p>
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

    public KxChangesetListEntry withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Status of the changeset.
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
     *        Status of the changeset.</p>
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

    public KxChangesetListEntry withStatus(ChangesetStatus status) {
        this.status = status.toString();
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
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getActiveFromTimestamp() != null)
            sb.append("ActiveFromTimestamp: ").append(getActiveFromTimestamp()).append(",");
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KxChangesetListEntry == false)
            return false;
        KxChangesetListEntry other = (KxChangesetListEntry) obj;
        if (other.getChangesetId() == null ^ this.getChangesetId() == null)
            return false;
        if (other.getChangesetId() != null && other.getChangesetId().equals(this.getChangesetId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangesetId() == null) ? 0 : getChangesetId().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getActiveFromTimestamp() == null) ? 0 : getActiveFromTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public KxChangesetListEntry clone() {
        try {
            return (KxChangesetListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxChangesetListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
