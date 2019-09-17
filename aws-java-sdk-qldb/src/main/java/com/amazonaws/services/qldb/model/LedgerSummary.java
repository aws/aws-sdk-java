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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a ledger, including its name, state, and when it was created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/LedgerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LedgerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ledger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the ledger.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @return The name of the ledger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the ledger.
     * </p>
     * 
     * @param name
     *        The name of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LedgerSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @see LedgerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @return The current status of the ledger.
     * @see LedgerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LedgerState
     */

    public LedgerSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current status of the ledger.
     * </p>
     * 
     * @param state
     *        The current status of the ledger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LedgerState
     */

    public LedgerSummary withState(LedgerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationDateTime
     *        The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *        seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @return The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *         seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of seconds
     * elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * </p>
     * 
     * @param creationDateTime
     *        The date and time, in epoch time format, when the ledger was created. (Epoch time format is the number of
     *        seconds elapsed since 12:00:00 AM January 1, 1970 UTC.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LedgerSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LedgerSummary == false)
            return false;
        LedgerSummary other = (LedgerSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public LedgerSummary clone() {
        try {
            return (LedgerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.LedgerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
