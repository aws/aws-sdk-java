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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/DeleteInterconnect" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteInterconnectResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String interconnectState;

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @see InterconnectState
     */

    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the interconnect. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the customer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: The interconnect is approved, and is being initialized.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: The network link is up, and the interconnect is ready for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: The network link is down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: The interconnect is being deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: The interconnect is deleted.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the interconnect is not available.
     *         </p>
     *         </li>
     * @see InterconnectState
     */

    public String getInterconnectState() {
        return this.interconnectState;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public DeleteInterconnectResult withInterconnectState(String interconnectState) {
        setInterconnectState(interconnectState);
        return this;
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @see InterconnectState
     */

    public void setInterconnectState(InterconnectState interconnectState) {
        withInterconnectState(interconnectState);
    }

    /**
     * <p>
     * The state of the interconnect. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested state until
     * the Letter of Authorization (LOA) is sent to the customer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: The interconnect is approved, and is being initialized.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: The network link is up, and the interconnect is ready for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: The network link is down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: The interconnect is being deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: The interconnect is deleted.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the interconnect is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interconnectState
     *        The state of the interconnect. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>requested</code>: The initial state of an interconnect. The interconnect stays in the requested
     *        state until the Letter of Authorization (LOA) is sent to the customer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: The interconnect is approved, and is being initialized.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: The network link is up, and the interconnect is ready for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: The network link is down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: The interconnect is being deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: The interconnect is deleted.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the interconnect is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterconnectState
     */

    public DeleteInterconnectResult withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
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
        if (getInterconnectState() != null)
            sb.append("InterconnectState: ").append(getInterconnectState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInterconnectResult == false)
            return false;
        DeleteInterconnectResult other = (DeleteInterconnectResult) obj;
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null)
            return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInterconnectResult clone() {
        try {
            return (DeleteInterconnectResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
