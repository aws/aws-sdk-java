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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/ListenerSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListenerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The date and time that the listener was created, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The ID of the listener.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time that the listener was last updated, specified in ISO-8601 format.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the listener.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The listener port.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The listener protocol.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the listener.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the listener.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The date and time that the listener was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the listener was created, specified in ISO-8601 format.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time that the listener was created, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the listener was created, specified in ISO-8601 format.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time that the listener was created, specified in ISO-8601 format.
     * </p>
     * 
     * @param createdAt
     *        The date and time that the listener was created, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @param id
     *        The ID of the listener.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @return The ID of the listener.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the listener.
     * </p>
     * 
     * @param id
     *        The ID of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time that the listener was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the listener was last updated, specified in ISO-8601 format.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the listener was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @return The date and time that the listener was last updated, specified in ISO-8601 format.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The date and time that the listener was last updated, specified in ISO-8601 format.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The date and time that the listener was last updated, specified in ISO-8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @param name
     *        The name of the listener.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @return The name of the listener.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the listener.
     * </p>
     * 
     * @param name
     *        The name of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The listener port.
     * </p>
     * 
     * @param port
     *        The listener port.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The listener port.
     * </p>
     * 
     * @return The listener port.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The listener port.
     * </p>
     * 
     * @param port
     *        The listener port.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListenerSummary withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @see ListenerProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @return The listener protocol.
     * @see ListenerProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public ListenerSummary withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The listener protocol.
     * </p>
     * 
     * @param protocol
     *        The listener protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public ListenerSummary withProtocol(ListenerProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListenerSummary == false)
            return false;
        ListenerSummary other = (ListenerSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public ListenerSummary clone() {
        try {
            return (ListenerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.ListenerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
