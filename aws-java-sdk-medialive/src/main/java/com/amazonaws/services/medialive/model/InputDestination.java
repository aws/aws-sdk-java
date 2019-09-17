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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The settings for a PUSH type input.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDestination" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     */
    private String ip;
    /** The port number for the input. */
    private String port;
    /**
     * This represents the endpoint that the customer stream will be pushed to.
     */
    private String url;

    private InputDestinationVpc vpc;

    /**
     * The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     * 
     * @param ip
     *        The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     */

    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     * 
     * @return The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     */

    public String getIp() {
        return this.ip;
    }

    /**
     * The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     * 
     * @param ip
     *        The system-generated static IP address of endpoint. It remains fixed for the lifetime of the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withIp(String ip) {
        setIp(ip);
        return this;
    }

    /**
     * The port number for the input.
     * 
     * @param port
     *        The port number for the input.
     */

    public void setPort(String port) {
        this.port = port;
    }

    /**
     * The port number for the input.
     * 
     * @return The port number for the input.
     */

    public String getPort() {
        return this.port;
    }

    /**
     * The port number for the input.
     * 
     * @param port
     *        The port number for the input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withPort(String port) {
        setPort(port);
        return this;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @param url
     *        This represents the endpoint that the customer stream will be pushed to.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @return This represents the endpoint that the customer stream will be pushed to.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * This represents the endpoint that the customer stream will be pushed to.
     * 
     * @param url
     *        This represents the endpoint that the customer stream will be pushed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * @param vpc
     */

    public void setVpc(InputDestinationVpc vpc) {
        this.vpc = vpc;
    }

    /**
     * @return
     */

    public InputDestinationVpc getVpc() {
        return this.vpc;
    }

    /**
     * @param vpc
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestination withVpc(InputDestinationVpc vpc) {
        setVpc(vpc);
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
        if (getIp() != null)
            sb.append("Ip: ").append(getIp()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getUrl() != null)
            sb.append("Url: ").append(getUrl()).append(",");
        if (getVpc() != null)
            sb.append("Vpc: ").append(getVpc());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestination == false)
            return false;
        InputDestination other = (InputDestination) obj;
        if (other.getIp() == null ^ this.getIp() == null)
            return false;
        if (other.getIp() != null && other.getIp().equals(this.getIp()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIp() == null) ? 0 : getIp().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        return hashCode;
    }

    @Override
    public InputDestination clone() {
        try {
            return (InputDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
