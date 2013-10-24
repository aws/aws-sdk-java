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
 * The response received when DeleteInterconnect is called.
 * </p>
 */
public class DeleteInterconnectResult implements Serializable {

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     */
    private String interconnectState;

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @return State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public String getInterconnectState() {
        return interconnectState;
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public void setInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InterconnectState
     */
    public DeleteInterconnectResult withInterconnectState(String interconnectState) {
        this.interconnectState = interconnectState;
        return this;
    }

    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @see InterconnectState
     */
    public void setInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
    }
    
    /**
     * State of the interconnect. <ul> <li><b>Requested</b>: The initial
     * state of an interconnect. The interconnect stays in the requested
     * state until the Letter of Authorization (LOA) is sent to the
     * customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     * and is being initialized.</li> <li><b>Available</b>: The network link
     * is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     * The network link is down.</li> <li><b>Deleted</b>: The interconnect
     * has been deleted.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>requested, pending, available, down, deleting, deleted
     *
     * @param interconnectState State of the interconnect. <ul> <li><b>Requested</b>: The initial
     *         state of an interconnect. The interconnect stays in the requested
     *         state until the Letter of Authorization (LOA) is sent to the
     *         customer.</li> <li><b>Pending</b>: The interconnect has been approved,
     *         and is being initialized.</li> <li><b>Available</b>: The network link
     *         is up, and the interconnect is ready for use.</li> <li><b>Down</b>:
     *         The network link is down.</li> <li><b>Deleted</b>: The interconnect
     *         has been deleted.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see InterconnectState
     */
    public DeleteInterconnectResult withInterconnectState(InterconnectState interconnectState) {
        this.interconnectState = interconnectState.toString();
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
        if (getInterconnectState() != null) sb.append("InterconnectState: " + getInterconnectState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInterconnectState() == null) ? 0 : getInterconnectState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteInterconnectResult == false) return false;
        DeleteInterconnectResult other = (DeleteInterconnectResult)obj;
        
        if (other.getInterconnectState() == null ^ this.getInterconnectState() == null) return false;
        if (other.getInterconnectState() != null && other.getInterconnectState().equals(this.getInterconnectState()) == false) return false; 
        return true;
    }
    
}
    