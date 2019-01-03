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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for an output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable, StructuredPojo {

    /** A description of the output. */
    private String description;
    /** The address where you want to send the output. */
    private String destination;
    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     */
    private Encryption encryption;
    /** The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows. */
    private String entitlementArn;
    /**
     * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added
     * by creating a MediaLive input.
     */
    private String mediaLiveInputArn;
    /** The name of the output. This value must be unique within the current flow. */
    private String name;
    /** The ARN of the output. */
    private String outputArn;
    /** The port to use when content is distributed to this output. */
    private Integer port;
    /** Attributes related to the transport stream that are used in the output. */
    private Transport transport;

    /**
     * A description of the output.
     * 
     * @param description
     *        A description of the output.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * A description of the output.
     * 
     * @return A description of the output.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * A description of the output.
     * 
     * @param description
     *        A description of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The address where you want to send the output.
     * 
     * @param destination
     *        The address where you want to send the output.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * The address where you want to send the output.
     * 
     * @return The address where you want to send the output.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * The address where you want to send the output.
     * 
     * @param destination
     *        The address where you want to send the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @return The type of key used for the encryption. If no keyType is provided, the service will use the default
     *         setting (static-key).
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * The type of key used for the encryption. If no keyType is provided, the service will use the default setting
     * (static-key).
     * 
     * @param encryption
     *        The type of key used for the encryption. If no keyType is provided, the service will use the default
     *        setting (static-key).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withEncryption(Encryption encryption) {
        setEncryption(encryption);
        return this;
    }

    /**
     * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     */

    public void setEntitlementArn(String entitlementArn) {
        this.entitlementArn = entitlementArn;
    }

    /**
     * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     * 
     * @return The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     */

    public String getEntitlementArn() {
        return this.entitlementArn;
    }

    /**
     * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     * 
     * @param entitlementArn
     *        The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withEntitlementArn(String entitlementArn) {
        setEntitlementArn(entitlementArn);
        return this;
    }

    /**
     * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added
     * by creating a MediaLive input.
     * 
     * @param mediaLiveInputArn
     *        The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that
     *        were added by creating a MediaLive input.
     */

    public void setMediaLiveInputArn(String mediaLiveInputArn) {
        this.mediaLiveInputArn = mediaLiveInputArn;
    }

    /**
     * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added
     * by creating a MediaLive input.
     * 
     * @return The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that
     *         were added by creating a MediaLive input.
     */

    public String getMediaLiveInputArn() {
        return this.mediaLiveInputArn;
    }

    /**
     * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added
     * by creating a MediaLive input.
     * 
     * @param mediaLiveInputArn
     *        The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that
     *        were added by creating a MediaLive input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withMediaLiveInputArn(String mediaLiveInputArn) {
        setMediaLiveInputArn(mediaLiveInputArn);
        return this;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the output. This value must be unique within the current flow.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @return The name of the output. This value must be unique within the current flow.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of the output. This value must be unique within the current flow.
     * 
     * @param name
     *        The name of the output. This value must be unique within the current flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withName(String name) {
        setName(name);
        return this;
    }

    /**
     * The ARN of the output.
     * 
     * @param outputArn
     *        The ARN of the output.
     */

    public void setOutputArn(String outputArn) {
        this.outputArn = outputArn;
    }

    /**
     * The ARN of the output.
     * 
     * @return The ARN of the output.
     */

    public String getOutputArn() {
        return this.outputArn;
    }

    /**
     * The ARN of the output.
     * 
     * @param outputArn
     *        The ARN of the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOutputArn(String outputArn) {
        setOutputArn(outputArn);
        return this;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @return The port to use when content is distributed to this output.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * The port to use when content is distributed to this output.
     * 
     * @param port
     *        The port to use when content is distributed to this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * Attributes related to the transport stream that are used in the output.
     * 
     * @param transport
     *        Attributes related to the transport stream that are used in the output.
     */

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    /**
     * Attributes related to the transport stream that are used in the output.
     * 
     * @return Attributes related to the transport stream that are used in the output.
     */

    public Transport getTransport() {
        return this.transport;
    }

    /**
     * Attributes related to the transport stream that are used in the output.
     * 
     * @param transport
     *        Attributes related to the transport stream that are used in the output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withTransport(Transport transport) {
        setTransport(transport);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption()).append(",");
        if (getEntitlementArn() != null)
            sb.append("EntitlementArn: ").append(getEntitlementArn()).append(",");
        if (getMediaLiveInputArn() != null)
            sb.append("MediaLiveInputArn: ").append(getMediaLiveInputArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOutputArn() != null)
            sb.append("OutputArn: ").append(getOutputArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getTransport() != null)
            sb.append("Transport: ").append(getTransport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        if (other.getEntitlementArn() == null ^ this.getEntitlementArn() == null)
            return false;
        if (other.getEntitlementArn() != null && other.getEntitlementArn().equals(this.getEntitlementArn()) == false)
            return false;
        if (other.getMediaLiveInputArn() == null ^ this.getMediaLiveInputArn() == null)
            return false;
        if (other.getMediaLiveInputArn() != null && other.getMediaLiveInputArn().equals(this.getMediaLiveInputArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOutputArn() == null ^ this.getOutputArn() == null)
            return false;
        if (other.getOutputArn() != null && other.getOutputArn().equals(this.getOutputArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getTransport() == null ^ this.getTransport() == null)
            return false;
        if (other.getTransport() != null && other.getTransport().equals(this.getTransport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        hashCode = prime * hashCode + ((getEntitlementArn() == null) ? 0 : getEntitlementArn().hashCode());
        hashCode = prime * hashCode + ((getMediaLiveInputArn() == null) ? 0 : getMediaLiveInputArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOutputArn() == null) ? 0 : getOutputArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getTransport() == null) ? 0 : getTransport().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
