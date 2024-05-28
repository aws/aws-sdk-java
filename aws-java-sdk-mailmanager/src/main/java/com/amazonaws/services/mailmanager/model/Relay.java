/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The relay resource that can be used as a rule to relay receiving emails to the destination relay server.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/Relay" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Relay implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the relay was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTimestamp;
    /**
     * <p>
     * The unique relay identifier.
     * </p>
     */
    private String relayId;
    /**
     * <p>
     * The unique relay name.
     * </p>
     */
    private String relayName;

    /**
     * <p>
     * The timestamp of when the relay was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp of when the relay was last modified.
     */

    public void setLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        this.lastModifiedTimestamp = lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the relay was last modified.
     * </p>
     * 
     * @return The timestamp of when the relay was last modified.
     */

    public java.util.Date getLastModifiedTimestamp() {
        return this.lastModifiedTimestamp;
    }

    /**
     * <p>
     * The timestamp of when the relay was last modified.
     * </p>
     * 
     * @param lastModifiedTimestamp
     *        The timestamp of when the relay was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relay withLastModifiedTimestamp(java.util.Date lastModifiedTimestamp) {
        setLastModifiedTimestamp(lastModifiedTimestamp);
        return this;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @param relayId
     *        The unique relay identifier.
     */

    public void setRelayId(String relayId) {
        this.relayId = relayId;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @return The unique relay identifier.
     */

    public String getRelayId() {
        return this.relayId;
    }

    /**
     * <p>
     * The unique relay identifier.
     * </p>
     * 
     * @param relayId
     *        The unique relay identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relay withRelayId(String relayId) {
        setRelayId(relayId);
        return this;
    }

    /**
     * <p>
     * The unique relay name.
     * </p>
     * 
     * @param relayName
     *        The unique relay name.
     */

    public void setRelayName(String relayName) {
        this.relayName = relayName;
    }

    /**
     * <p>
     * The unique relay name.
     * </p>
     * 
     * @return The unique relay name.
     */

    public String getRelayName() {
        return this.relayName;
    }

    /**
     * <p>
     * The unique relay name.
     * </p>
     * 
     * @param relayName
     *        The unique relay name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Relay withRelayName(String relayName) {
        setRelayName(relayName);
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
        if (getLastModifiedTimestamp() != null)
            sb.append("LastModifiedTimestamp: ").append(getLastModifiedTimestamp()).append(",");
        if (getRelayId() != null)
            sb.append("RelayId: ").append(getRelayId()).append(",");
        if (getRelayName() != null)
            sb.append("RelayName: ").append(getRelayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Relay == false)
            return false;
        Relay other = (Relay) obj;
        if (other.getLastModifiedTimestamp() == null ^ this.getLastModifiedTimestamp() == null)
            return false;
        if (other.getLastModifiedTimestamp() != null && other.getLastModifiedTimestamp().equals(this.getLastModifiedTimestamp()) == false)
            return false;
        if (other.getRelayId() == null ^ this.getRelayId() == null)
            return false;
        if (other.getRelayId() != null && other.getRelayId().equals(this.getRelayId()) == false)
            return false;
        if (other.getRelayName() == null ^ this.getRelayName() == null)
            return false;
        if (other.getRelayName() != null && other.getRelayName().equals(this.getRelayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastModifiedTimestamp() == null) ? 0 : getLastModifiedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getRelayId() == null) ? 0 : getRelayId().hashCode());
        hashCode = prime * hashCode + ((getRelayName() == null) ? 0 : getRelayName().hashCode());
        return hashCode;
    }

    @Override
    public Relay clone() {
        try {
            return (Relay) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mailmanager.model.transform.RelayMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
