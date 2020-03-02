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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetContactMethods" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetContactMethodsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     */
    private java.util.List<String> protocols;

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     * 
     * @return The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text
     *         messaging).</p>
     *         <p>
     *         Specify a protocol in your request to return information about a specific contact method protocol.
     * @see ContactProtocol
     */

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     * 
     * @param protocols
     *        The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text
     *        messaging).</p>
     *        <p>
     *        Specify a protocol in your request to return information about a specific contact method protocol.
     * @see ContactProtocol
     */

    public void setProtocols(java.util.Collection<String> protocols) {
        if (protocols == null) {
            this.protocols = null;
            return;
        }

        this.protocols = new java.util.ArrayList<String>(protocols);
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProtocols(java.util.Collection)} or {@link #withProtocols(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param protocols
     *        The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text
     *        messaging).</p>
     *        <p>
     *        Specify a protocol in your request to return information about a specific contact method protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public GetContactMethodsRequest withProtocols(String... protocols) {
        if (this.protocols == null) {
            setProtocols(new java.util.ArrayList<String>(protocols.length));
        }
        for (String ele : protocols) {
            this.protocols.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     * 
     * @param protocols
     *        The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text
     *        messaging).</p>
     *        <p>
     *        Specify a protocol in your request to return information about a specific contact method protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public GetContactMethodsRequest withProtocols(java.util.Collection<String> protocols) {
        setProtocols(protocols);
        return this;
    }

    /**
     * <p>
     * The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text messaging).
     * </p>
     * <p>
     * Specify a protocol in your request to return information about a specific contact method protocol.
     * </p>
     * 
     * @param protocols
     *        The protocols used to send notifications, such as <code>Email</code>, or <code>SMS</code> (text
     *        messaging).</p>
     *        <p>
     *        Specify a protocol in your request to return information about a specific contact method protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContactProtocol
     */

    public GetContactMethodsRequest withProtocols(ContactProtocol... protocols) {
        java.util.ArrayList<String> protocolsCopy = new java.util.ArrayList<String>(protocols.length);
        for (ContactProtocol value : protocols) {
            protocolsCopy.add(value.toString());
        }
        if (getProtocols() == null) {
            setProtocols(protocolsCopy);
        } else {
            getProtocols().addAll(protocolsCopy);
        }
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
        if (getProtocols() != null)
            sb.append("Protocols: ").append(getProtocols());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContactMethodsRequest == false)
            return false;
        GetContactMethodsRequest other = (GetContactMethodsRequest) obj;
        if (other.getProtocols() == null ^ this.getProtocols() == null)
            return false;
        if (other.getProtocols() != null && other.getProtocols().equals(this.getProtocols()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProtocols() == null) ? 0 : getProtocols().hashCode());
        return hashCode;
    }

    @Override
    public GetContactMethodsRequest clone() {
        return (GetContactMethodsRequest) super.clone();
    }

}
