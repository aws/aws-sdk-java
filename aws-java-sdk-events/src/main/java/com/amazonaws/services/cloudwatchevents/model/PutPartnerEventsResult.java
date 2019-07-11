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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutPartnerEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPartnerEventsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The number of events from this operation that couldn't be written to the partner event bus.
     * </p>
     */
    private Integer failedEntryCount;
    /**
     * <p>
     * The list of events from this operation that were successfully written to the partner event bus.
     * </p>
     */
    private java.util.List<PutPartnerEventsResultEntry> entries;

    /**
     * <p>
     * The number of events from this operation that couldn't be written to the partner event bus.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of events from this operation that couldn't be written to the partner event bus.
     */

    public void setFailedEntryCount(Integer failedEntryCount) {
        this.failedEntryCount = failedEntryCount;
    }

    /**
     * <p>
     * The number of events from this operation that couldn't be written to the partner event bus.
     * </p>
     * 
     * @return The number of events from this operation that couldn't be written to the partner event bus.
     */

    public Integer getFailedEntryCount() {
        return this.failedEntryCount;
    }

    /**
     * <p>
     * The number of events from this operation that couldn't be written to the partner event bus.
     * </p>
     * 
     * @param failedEntryCount
     *        The number of events from this operation that couldn't be written to the partner event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsResult withFailedEntryCount(Integer failedEntryCount) {
        setFailedEntryCount(failedEntryCount);
        return this;
    }

    /**
     * <p>
     * The list of events from this operation that were successfully written to the partner event bus.
     * </p>
     * 
     * @return The list of events from this operation that were successfully written to the partner event bus.
     */

    public java.util.List<PutPartnerEventsResultEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of events from this operation that were successfully written to the partner event bus.
     * </p>
     * 
     * @param entries
     *        The list of events from this operation that were successfully written to the partner event bus.
     */

    public void setEntries(java.util.Collection<PutPartnerEventsResultEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<PutPartnerEventsResultEntry>(entries);
    }

    /**
     * <p>
     * The list of events from this operation that were successfully written to the partner event bus.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The list of events from this operation that were successfully written to the partner event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsResult withEntries(PutPartnerEventsResultEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<PutPartnerEventsResultEntry>(entries.length));
        }
        for (PutPartnerEventsResultEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events from this operation that were successfully written to the partner event bus.
     * </p>
     * 
     * @param entries
     *        The list of events from this operation that were successfully written to the partner event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsResult withEntries(java.util.Collection<PutPartnerEventsResultEntry> entries) {
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

        if (obj instanceof PutPartnerEventsResult == false)
            return false;
        PutPartnerEventsResult other = (PutPartnerEventsResult) obj;
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
    public PutPartnerEventsResult clone() {
        try {
            return (PutPartnerEventsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
