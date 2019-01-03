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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of failed entries.
     * </p>
     */
    private Integer failedEntryCount;
    /**
     * <p>
     * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the
     * event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
     * </p>
     */
    private java.util.List<PutEventsResultEntry> entries;

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of failed entries.
     */

    public void setFailedEntryCount(Integer failedEntryCount) {
        this.failedEntryCount = failedEntryCount;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @return The number of failed entries.
     */

    public Integer getFailedEntryCount() {
        return this.failedEntryCount;
    }

    /**
     * <p>
     * The number of failed entries.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of failed entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsResult withFailedEntryCount(Integer failedEntryCount) {
        setFailedEntryCount(failedEntryCount);
        return this;
    }

    /**
     * <p>
     * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the
     * event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
     * </p>
     * 
     * @return The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry
     *         has the event ID in it. Otherwise, you can use the error code and error message to identify the problem
     *         with the entry.
     */

    public java.util.List<PutEventsResultEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the
     * event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
     * </p>
     * 
     * @param entries
     *        The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry
     *        has the event ID in it. Otherwise, you can use the error code and error message to identify the problem
     *        with the entry.
     */

    public void setEntries(java.util.Collection<PutEventsResultEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<PutEventsResultEntry>(entries);
    }

    /**
     * <p>
     * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the
     * event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry
     *        has the event ID in it. Otherwise, you can use the error code and error message to identify the problem
     *        with the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsResult withEntries(PutEventsResultEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<PutEventsResultEntry>(entries.length));
        }
        for (PutEventsResultEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry has the
     * event ID in it. Otherwise, you can use the error code and error message to identify the problem with the entry.
     * </p>
     * 
     * @param entries
     *        The successfully and unsuccessfully ingested events results. If the ingestion was successful, the entry
     *        has the event ID in it. Otherwise, you can use the error code and error message to identify the problem
     *        with the entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutEventsResult withEntries(java.util.Collection<PutEventsResultEntry> entries) {
        setEntries(entries);
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
        if (getFailedEntryCount() != null)
            sb.append("FailedEntryCount: ").append(getFailedEntryCount()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutEventsResult == false)
            return false;
        PutEventsResult other = (PutEventsResult) obj;
        if (other.getFailedEntryCount() == null ^ this.getFailedEntryCount() == null)
            return false;
        if (other.getFailedEntryCount() != null && other.getFailedEntryCount().equals(this.getFailedEntryCount()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFailedEntryCount() == null) ? 0 : getFailedEntryCount().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public PutEventsResult clone() {
        try {
            return (PutEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
