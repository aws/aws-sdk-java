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
package com.amazonaws.services.timestreamquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-query-2018-11-01/CancelQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CancelQueryResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query specified by
     * <code>QueryId</code> has already been issued.
     * </p>
     */
    private String cancellationMessage;

    /**
     * <p>
     * A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query specified by
     * <code>QueryId</code> has already been issued.
     * </p>
     * 
     * @param cancellationMessage
     *        A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query
     *        specified by <code>QueryId</code> has already been issued.
     */

    public void setCancellationMessage(String cancellationMessage) {
        this.cancellationMessage = cancellationMessage;
    }

    /**
     * <p>
     * A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query specified by
     * <code>QueryId</code> has already been issued.
     * </p>
     * 
     * @return A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query
     *         specified by <code>QueryId</code> has already been issued.
     */

    public String getCancellationMessage() {
        return this.cancellationMessage;
    }

    /**
     * <p>
     * A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query specified by
     * <code>QueryId</code> has already been issued.
     * </p>
     * 
     * @param cancellationMessage
     *        A <code>CancellationMessage</code> is returned when a <code>CancelQuery</code> request for the query
     *        specified by <code>QueryId</code> has already been issued.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CancelQueryResult withCancellationMessage(String cancellationMessage) {
        setCancellationMessage(cancellationMessage);
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
        if (getCancellationMessage() != null)
            sb.append("CancellationMessage: ").append(getCancellationMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelQueryResult == false)
            return false;
        CancelQueryResult other = (CancelQueryResult) obj;
        if (other.getCancellationMessage() == null ^ this.getCancellationMessage() == null)
            return false;
        if (other.getCancellationMessage() != null && other.getCancellationMessage().equals(this.getCancellationMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCancellationMessage() == null) ? 0 : getCancellationMessage().hashCode());
        return hashCode;
    }

    @Override
    public CancelQueryResult clone() {
        try {
            return (CancelQueryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
