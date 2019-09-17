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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/ConfirmPrivateVirtualInterface"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmPrivateVirtualInterfaceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     */
    private String virtualInterfaceState;

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(String virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the virtual interface. The following are the possible values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *         interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *         which it is provisioned, then the virtual interface will remain in this state until it is confirmed by
     *         the virtual interface owner.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *         interface needs validation before the virtual interface can be created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *         virtual interface is ready to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>available</code>: A virtual interface that is able to forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>down</code>: A virtual interface that is BGP down.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleting</code>: A virtual interface is in this state immediately after calling
     *         <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>deleted</code>: A virtual interface that cannot forward traffic.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *         virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *         virtual interface enters the <code>Rejected</code> state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>unknown</code>: The state of the virtual interface is not available.
     *         </p>
     *         </li>
     * @see VirtualInterfaceState
     */

    public String getVirtualInterfaceState() {
        return this.virtualInterfaceState;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPrivateVirtualInterfaceResult withVirtualInterfaceState(String virtualInterfaceState) {
        setVirtualInterfaceState(virtualInterfaceState);
        return this;
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @see VirtualInterfaceState
     */

    public void setVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        withVirtualInterfaceState(virtualInterfaceState);
    }

    /**
     * <p>
     * The state of the virtual interface. The following are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual interface
     * owner. If the owner of the virtual interface is different from the owner of the connection on which it is
     * provisioned, then the virtual interface will remain in this state until it is confirmed by the virtual interface
     * owner.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual interface needs
     * validation before the virtual interface can be created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>pending</code>: A virtual interface is in this state from the time that it is created until the virtual
     * interface is ready to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>available</code>: A virtual interface that is able to forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>down</code>: A virtual interface that is BGP down.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleting</code>: A virtual interface is in this state immediately after calling
     * <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>deleted</code>: A virtual interface that cannot forward traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a virtual
     * interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the virtual interface
     * enters the <code>Rejected</code> state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>unknown</code>: The state of the virtual interface is not available.
     * </p>
     * </li>
     * </ul>
     * 
     * @param virtualInterfaceState
     *        The state of the virtual interface. The following are the possible values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>confirming</code>: The creation of the virtual interface is pending confirmation from the virtual
     *        interface owner. If the owner of the virtual interface is different from the owner of the connection on
     *        which it is provisioned, then the virtual interface will remain in this state until it is confirmed by the
     *        virtual interface owner.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>verifying</code>: This state only applies to public virtual interfaces. Each public virtual
     *        interface needs validation before the virtual interface can be created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>pending</code>: A virtual interface is in this state from the time that it is created until the
     *        virtual interface is ready to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>available</code>: A virtual interface that is able to forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>down</code>: A virtual interface that is BGP down.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleting</code>: A virtual interface is in this state immediately after calling
     *        <a>DeleteVirtualInterface</a> until it can no longer forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>deleted</code>: A virtual interface that cannot forward traffic.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>rejected</code>: The virtual interface owner has declined creation of the virtual interface. If a
     *        virtual interface in the <code>Confirming</code> state is deleted by the virtual interface owner, the
     *        virtual interface enters the <code>Rejected</code> state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>unknown</code>: The state of the virtual interface is not available.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualInterfaceState
     */

    public ConfirmPrivateVirtualInterfaceResult withVirtualInterfaceState(VirtualInterfaceState virtualInterfaceState) {
        this.virtualInterfaceState = virtualInterfaceState.toString();
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
        if (getVirtualInterfaceState() != null)
            sb.append("VirtualInterfaceState: ").append(getVirtualInterfaceState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmPrivateVirtualInterfaceResult == false)
            return false;
        ConfirmPrivateVirtualInterfaceResult other = (ConfirmPrivateVirtualInterfaceResult) obj;
        if (other.getVirtualInterfaceState() == null ^ this.getVirtualInterfaceState() == null)
            return false;
        if (other.getVirtualInterfaceState() != null && other.getVirtualInterfaceState().equals(this.getVirtualInterfaceState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVirtualInterfaceState() == null) ? 0 : getVirtualInterfaceState().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmPrivateVirtualInterfaceResult clone() {
        try {
            return (ConfirmPrivateVirtualInterfaceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
