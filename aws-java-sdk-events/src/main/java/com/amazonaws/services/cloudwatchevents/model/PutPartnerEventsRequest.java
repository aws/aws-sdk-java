/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/PutPartnerEvents" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPartnerEventsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of events to write to the event bus.
     * </p>
     */
    private java.util.List<PutPartnerEventsRequestEntry> entries;

    /**
     * <p>
     * The list of events to write to the event bus.
     * </p>
     * 
     * @return The list of events to write to the event bus.
     */

    public java.util.List<PutPartnerEventsRequestEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The list of events to write to the event bus.
     * </p>
     * 
     * @param entries
     *        The list of events to write to the event bus.
     */

    public void setEntries(java.util.Collection<PutPartnerEventsRequestEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<PutPartnerEventsRequestEntry>(entries);
    }

    /**
     * <p>
     * The list of events to write to the event bus.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The list of events to write to the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequest withEntries(PutPartnerEventsRequestEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<PutPartnerEventsRequestEntry>(entries.length));
        }
        for (PutPartnerEventsRequestEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events to write to the event bus.
     * </p>
     * 
     * @param entries
     *        The list of events to write to the event bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPartnerEventsRequest withEntries(java.util.Collection<PutPartnerEventsRequestEntry> entries) {
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

        if (obj instanceof PutPartnerEventsRequest == false)
            return false;
        PutPartnerEventsRequest other = (PutPartnerEventsRequest) obj;
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

        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public PutPartnerEventsRequest clone() {
        return (PutPartnerEventsRequest) super.clone();
    }

}
