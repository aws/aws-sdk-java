/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;


/**
 * <p>
 * The response received when ConfirmConnection is called.
 * </p>
 */
public class ConfirmConnectionResult implements Serializable {

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     */
    private String connectionState;

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @return State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public String getConnectionState() {
        return connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(String connectionState) {
        this.connectionState = connectionState;
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConnectionState
     */
    public ConfirmConnectionResult withConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @see ConnectionState
     */
    public void setConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
    }
    
    /**
     * State of the connection. <ul> <li><b>Ordering</b>: The initial state
     * of a hosted connection provisioned on an interconnect. The connection
     * stays in the ordering state until the owner of the hosted connection
     * confirms or declines the connection order.</li> <li><b>Requested</b>:
     * The initial state of a standard connection. The connection stays in
     * the requested state until the Letter of Authorization (LOA) is sent to
     * the customer.</li> <li><b>Pending</b>: The connection has been
     * approved, and is being initialized.</li> <li><b>Available</b>: The
     * network link is up, and the connection is ready for use.</li>
     * <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     * The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     * connection in the 'Ordering' state will enter the 'Rejected' state if
     * it is deleted by the end customer.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ordering, requested, pending, available, down, deleting, deleted, rejected
     *
     * @param connectionState State of the connection. <ul> <li><b>Ordering</b>: The initial state
     *         of a hosted connection provisioned on an interconnect. The connection
     *         stays in the ordering state until the owner of the hosted connection
     *         confirms or declines the connection order.</li> <li><b>Requested</b>:
     *         The initial state of a standard connection. The connection stays in
     *         the requested state until the Letter of Authorization (LOA) is sent to
     *         the customer.</li> <li><b>Pending</b>: The connection has been
     *         approved, and is being initialized.</li> <li><b>Available</b>: The
     *         network link is up, and the connection is ready for use.</li>
     *         <li><b>Down</b>: The network link is down.</li> <li><b>Deleted</b>:
     *         The connection has been deleted.</li> <li><b>Rejected</b>: A hosted
     *         connection in the 'Ordering' state will enter the 'Rejected' state if
     *         it is deleted by the end customer.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ConnectionState
     */
    public ConfirmConnectionResult withConnectionState(ConnectionState connectionState) {
        this.connectionState = connectionState.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getConnectionState() != null) sb.append("ConnectionState: " + getConnectionState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getConnectionState() == null) ? 0 : getConnectionState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmConnectionResult == false) return false;
        ConfirmConnectionResult other = (ConfirmConnectionResult)obj;
        
        if (other.getConnectionState() == null ^ this.getConnectionState() == null) return false;
        if (other.getConnectionState() != null && other.getConnectionState().equals(this.getConnectionState()) == false) return false; 
        return true;
    }
    
}
    