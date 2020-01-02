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
package com.amazonaws.services.qldbsession.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a request to start a a new session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-session-2019-07-11/StartSessionRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the ledger to start a new session against.
     * </p>
     */
    private String ledgerName;

    /**
     * <p>
     * The name of the ledger to start a new session against.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger to start a new session against.
     */

    public void setLedgerName(String ledgerName) {
        this.ledgerName = ledgerName;
    }

    /**
     * <p>
     * The name of the ledger to start a new session against.
     * </p>
     * 
     * @return The name of the ledger to start a new session against.
     */

    public String getLedgerName() {
        return this.ledgerName;
    }

    /**
     * <p>
     * The name of the ledger to start a new session against.
     * </p>
     * 
     * @param ledgerName
     *        The name of the ledger to start a new session against.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionRequest withLedgerName(String ledgerName) {
        setLedgerName(ledgerName);
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
        if (getLedgerName() != null)
            sb.append("LedgerName: ").append(getLedgerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionRequest == false)
            return false;
        StartSessionRequest other = (StartSessionRequest) obj;
        if (other.getLedgerName() == null ^ this.getLedgerName() == null)
            return false;
        if (other.getLedgerName() != null && other.getLedgerName().equals(this.getLedgerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLedgerName() == null) ? 0 : getLedgerName().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionRequest clone() {
        try {
            return (StartSessionRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldbsession.model.transform.StartSessionRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
