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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The description of the server-side encryption status on the specified DAX cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/SSEDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SSEDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of server-side encryption:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Server-side encryption is being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Server-side encryption is being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - Server-side encryption is disabled.
     *        </p>
     *        </li>
     * @see SSEStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current state of server-side encryption:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ENABLING</code> - Server-side encryption is being enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ENABLED</code> - Server-side encryption is enabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLING</code> - Server-side encryption is being disabled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISABLED</code> - Server-side encryption is disabled.
     *         </p>
     *         </li>
     * @see SSEStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of server-side encryption:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Server-side encryption is being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Server-side encryption is being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - Server-side encryption is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEStatus
     */

    public SSEDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of server-side encryption:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ENABLING</code> - Server-side encryption is being enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ENABLED</code> - Server-side encryption is enabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLING</code> - Server-side encryption is being disabled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISABLED</code> - Server-side encryption is disabled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The current state of server-side encryption:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ENABLING</code> - Server-side encryption is being enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ENABLED</code> - Server-side encryption is enabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLING</code> - Server-side encryption is being disabled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISABLED</code> - Server-side encryption is disabled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SSEStatus
     */

    public SSEDescription withStatus(SSEStatus status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SSEDescription == false)
            return false;
        SSEDescription other = (SSEDescription) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public SSEDescription clone() {
        try {
            return (SSEDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.SSEDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
