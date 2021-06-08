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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/AssociateMacSecKey" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateMacSecKeyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     */
    private String connectionId;
    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the dedicated connection.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MacSecKey> macSecKeys;

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     */

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * 
     * @return The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     */

    public String getConnectionId() {
        return this.connectionId;
    }

    /**
     * <p>
     * The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * </p>
     * 
     * @param connectionId
     *        The ID of the dedicated connection (dxcon-xxxx), or the ID of the LAG (dxlag-xxxx).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMacSecKeyResult withConnectionId(String connectionId) {
        setConnectionId(connectionId);
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the dedicated connection.
     * </p>
     * 
     * @return The MAC Security (MACsec) security keys associated with the dedicated connection.
     */

    public java.util.List<MacSecKey> getMacSecKeys() {
        if (macSecKeys == null) {
            macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>();
        }
        return macSecKeys;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the dedicated connection.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the dedicated connection.
     */

    public void setMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        if (macSecKeys == null) {
            this.macSecKeys = null;
            return;
        }

        this.macSecKeys = new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys);
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the dedicated connection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMacSecKeys(java.util.Collection)} or {@link #withMacSecKeys(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the dedicated connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMacSecKeyResult withMacSecKeys(MacSecKey... macSecKeys) {
        if (this.macSecKeys == null) {
            setMacSecKeys(new com.amazonaws.internal.SdkInternalList<MacSecKey>(macSecKeys.length));
        }
        for (MacSecKey ele : macSecKeys) {
            this.macSecKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The MAC Security (MACsec) security keys associated with the dedicated connection.
     * </p>
     * 
     * @param macSecKeys
     *        The MAC Security (MACsec) security keys associated with the dedicated connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateMacSecKeyResult withMacSecKeys(java.util.Collection<MacSecKey> macSecKeys) {
        setMacSecKeys(macSecKeys);
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
        if (getConnectionId() != null)
            sb.append("ConnectionId: ").append(getConnectionId()).append(",");
        if (getMacSecKeys() != null)
            sb.append("MacSecKeys: ").append(getMacSecKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateMacSecKeyResult == false)
            return false;
        AssociateMacSecKeyResult other = (AssociateMacSecKeyResult) obj;
        if (other.getConnectionId() == null ^ this.getConnectionId() == null)
            return false;
        if (other.getConnectionId() != null && other.getConnectionId().equals(this.getConnectionId()) == false)
            return false;
        if (other.getMacSecKeys() == null ^ this.getMacSecKeys() == null)
            return false;
        if (other.getMacSecKeys() != null && other.getMacSecKeys().equals(this.getMacSecKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConnectionId() == null) ? 0 : getConnectionId().hashCode());
        hashCode = prime * hashCode + ((getMacSecKeys() == null) ? 0 : getMacSecKeys().hashCode());
        return hashCode;
    }

    @Override
    public AssociateMacSecKeyResult clone() {
        try {
            return (AssociateMacSecKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
