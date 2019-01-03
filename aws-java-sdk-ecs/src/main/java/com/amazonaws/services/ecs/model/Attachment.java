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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a container instance or task attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Attachment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Attachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     * <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     * <code>DELETED</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     * address, the subnet ID, and the private IPv4 address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> details;

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the attachment.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     * 
     * @return The unique identifier for the attachment.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the attachment.
     * </p>
     * 
     * @param id
     *        The unique identifier for the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     * 
     * @param type
     *        The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     * 
     * @return The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * </p>
     * 
     * @param type
     *        The type of the attachment, such as <code>ElasticNetworkInterface</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     * <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     * <code>DELETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     *        <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     *        <code>DELETED</code>.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     * <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     * <code>DELETED</code>.
     * </p>
     * 
     * @return The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     *         <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     *         <code>DELETED</code>.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     * <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     * <code>DELETED</code>.
     * </p>
     * 
     * @param status
     *        The status of the attachment. Valid values are <code>PRECREATED</code>, <code>CREATED</code>,
     *        <code>ATTACHING</code>, <code>ATTACHED</code>, <code>DETACHING</code>, <code>DETACHED</code>, and
     *        <code>DELETED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     * address, the subnet ID, and the private IPv4 address.
     * </p>
     * 
     * @return Details of the attachment. For elastic network interfaces, this includes the network interface ID, the
     *         MAC address, the subnet ID, and the private IPv4 address.
     */

    public java.util.List<KeyValuePair> getDetails() {
        if (details == null) {
            details = new com.amazonaws.internal.SdkInternalList<KeyValuePair>();
        }
        return details;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     * address, the subnet ID, and the private IPv4 address.
     * </p>
     * 
     * @param details
     *        Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     *        address, the subnet ID, and the private IPv4 address.
     */

    public void setDetails(java.util.Collection<KeyValuePair> details) {
        if (details == null) {
            this.details = null;
            return;
        }

        this.details = new com.amazonaws.internal.SdkInternalList<KeyValuePair>(details);
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     * address, the subnet ID, and the private IPv4 address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetails(java.util.Collection)} or {@link #withDetails(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param details
     *        Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     *        address, the subnet ID, and the private IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withDetails(KeyValuePair... details) {
        if (this.details == null) {
            setDetails(new com.amazonaws.internal.SdkInternalList<KeyValuePair>(details.length));
        }
        for (KeyValuePair ele : details) {
            this.details.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     * address, the subnet ID, and the private IPv4 address.
     * </p>
     * 
     * @param details
     *        Details of the attachment. For elastic network interfaces, this includes the network interface ID, the MAC
     *        address, the subnet ID, and the private IPv4 address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Attachment withDetails(java.util.Collection<KeyValuePair> details) {
        setDetails(details);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Attachment == false)
            return false;
        Attachment other = (Attachment) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public Attachment clone() {
        try {
            return (Attachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
