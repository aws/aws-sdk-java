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
 * The response received when ConfirmPublicVirtualInterface is called.
 * </p>
 */
public class ConfirmPublicVirtualInterfaceResult implements Serializable {

    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     */
    private String virtualInterfaceState;

    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     *
     * @return State of the virtual interface. <ul> <li><b>Confirming</b>: The
     *         creation of the virtual interface is pending confirmation from the
     *         virtual interface owner. If the owner of the virtual interface is
     *         different from the owner of the connection on which it is provisioned,
     *         then the virtual interface will remain in this state until it is
     *         confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     *         This state only applies to public virtual interfaces. Each public
     *         virtual interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     *         has declined creation of the virtual interface. If a virtual interface
     *         in the 'Confirming' state is deleted by the virtual interface owner,
     *         the virtual interface will enter the 'Rejected' state.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public String getVirtualInterfaceState() {
        return virtualInterfaceState;
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Confirming</b>: The
     *         creation of the virtual interface is pending confirmation from the
     *         virtual interface owner. If the owner of the virtual interface is
     *         different from the owner of the connection on which it is provisioned,
     *         then the virtual interface will remain in this state until it is
     *         confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     *         This state only applies to public virtual interfaces. Each public
     *         virtual interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     *         has declined creation of the virtual interface. If a virtual interface
     *         in the 'Confirming' state is deleted by the virtual interface owner,
     *         the virtual interface will enter the 'Rejected' state.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Confirming</b>: The
     *         creation of the virtual interface is pending confirmation from the
     *         virtual interface owner. If the owner of the virtual interface is
     *         different from the owner of the connection on which it is provisioned,
     *         then the virtual interface will remain in this state until it is
     *         confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     *         This state only applies to public virtual interfaces. Each public
     *         virtual interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     *         has declined creation of the virtual interface. If a virtual interface
     *         in the 'Confirming' state is deleted by the virtual interface owner,
     *         the virtual interface will enter the 'Rejected' state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualInterfaceState
     */
    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
        return this;
    }

    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Confirming</b>: The
     *         creation of the virtual interface is pending confirmation from the
     *         virtual interface owner. If the owner of the virtual interface is
     *         different from the owner of the connection on which it is provisioned,
     *         then the virtual interface will remain in this state until it is
     *         confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     *         This state only applies to public virtual interfaces. Each public
     *         virtual interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     *         has declined creation of the virtual interface. If a virtual interface
     *         in the 'Confirming' state is deleted by the virtual interface owner,
     *         the virtual interface will enter the 'Rejected' state.</li> </ul>
     *
     * @see VirtualInterfaceState
     */
    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
    }
    
    /**
     * State of the virtual interface. <ul> <li><b>Confirming</b>: The
     * creation of the virtual interface is pending confirmation from the
     * virtual interface owner. If the owner of the virtual interface is
     * different from the owner of the connection on which it is provisioned,
     * then the virtual interface will remain in this state until it is
     * confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     * This state only applies to public virtual interfaces. Each public
     * virtual interface needs validation before the virtual interface can be
     * created.</li> <li><b>Pending</b>: A virtual interface is in this state
     * from the time that it is created until the virtual interface is ready
     * to forward traffic.</li> <li><b>Available</b>: A virtual interface
     * that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     * interface is in this state immediately after calling
     * <i>DeleteVirtualInterface</i> until it can no longer forward
     * traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     * forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     * has declined creation of the virtual interface. If a virtual interface
     * in the 'Confirming' state is deleted by the virtual interface owner,
     * the virtual interface will enter the 'Rejected' state.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>confirming, verifying, pending, available, deleting, deleted, rejected
     *
     * @param virtualInterfaceState State of the virtual interface. <ul> <li><b>Confirming</b>: The
     *         creation of the virtual interface is pending confirmation from the
     *         virtual interface owner. If the owner of the virtual interface is
     *         different from the owner of the connection on which it is provisioned,
     *         then the virtual interface will remain in this state until it is
     *         confirmed by the virtual interface owner.</li> <li><b>Verifying</b>:
     *         This state only applies to public virtual interfaces. Each public
     *         virtual interface needs validation before the virtual interface can be
     *         created.</li> <li><b>Pending</b>: A virtual interface is in this state
     *         from the time that it is created until the virtual interface is ready
     *         to forward traffic.</li> <li><b>Available</b>: A virtual interface
     *         that is able to forward traffic.</li> <li><b>Deleting</b>: A virtual
     *         interface is in this state immediately after calling
     *         <i>DeleteVirtualInterface</i> until it can no longer forward
     *         traffic.</li> <li><b>Deleted</b>: A virtual interface that cannot
     *         forward traffic.</li> <li><b>Rejected</b>: The virtual interface owner
     *         has declined creation of the virtual interface. If a virtual interface
     *         in the 'Confirming' state is deleted by the virtual interface owner,
     *         the virtual interface will enter the 'Rejected' state.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualInterfaceState
     */
    public ConfirmPublicVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
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
        if (getVirtualInterfaceState() != null) sb.append("VirtualInterfaceState: " + getVirtualInterfaceState() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfirmPublicVirtualInterfaceResult == false) return false;
        ConfirmPublicVirtualInterfaceResult other = (ConfirmPublicVirtualInterfaceResult)obj;
        
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null) return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false) return false; 
        return true;
    }
    
}
    