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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the settings of a container that will be launched, or that is launched, to an Amazon Lightsail container
 * service.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Container" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Container implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the image used for the container.
     * </p>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     */
    private String image;
    /**
     * <p>
     * The launch command for the container.
     * </p>
     */
    private java.util.List<String> command;
    /**
     * <p>
     * The environment variables of the container.
     * </p>
     */
    private java.util.Map<String, String> environment;
    /**
     * <p>
     * The open firewall ports of the container.
     * </p>
     */
    private java.util.Map<String, String> ports;

    /**
     * <p>
     * The name of the image used for the container.
     * </p>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * 
     * @param image
     *        The name of the image used for the container.</p>
     *        <p>
     *        Container images sourced from your Lightsail container service, that are registered and stored on your
     *        service, start with a colon (<code>:</code>). For example,
     *        <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *        Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     */

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * <p>
     * The name of the image used for the container.
     * </p>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * 
     * @return The name of the image used for the container.</p>
     *         <p>
     *         Container images sourced from your Lightsail container service, that are registered and stored on your
     *         service, start with a colon (<code>:</code>). For example,
     *         <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *         Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     */

    public String getImage() {
        return this.image;
    }

    /**
     * <p>
     * The name of the image used for the container.
     * </p>
     * <p>
     * Container images sourced from your Lightsail container service, that are registered and stored on your service,
     * start with a colon (<code>:</code>). For example, <code>:container-service-1.mystaticwebsite.1</code>. Container
     * images sourced from a public registry like Docker Hub don't start with a colon. For example,
     * <code>nginx:latest</code> or <code>nginx</code>.
     * </p>
     * 
     * @param image
     *        The name of the image used for the container.</p>
     *        <p>
     *        Container images sourced from your Lightsail container service, that are registered and stored on your
     *        service, start with a colon (<code>:</code>). For example,
     *        <code>:container-service-1.mystaticwebsite.1</code>. Container images sourced from a public registry like
     *        Docker Hub don't start with a colon. For example, <code>nginx:latest</code> or <code>nginx</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withImage(String image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * The launch command for the container.
     * </p>
     * 
     * @return The launch command for the container.
     */

    public java.util.List<String> getCommand() {
        return command;
    }

    /**
     * <p>
     * The launch command for the container.
     * </p>
     * 
     * @param command
     *        The launch command for the container.
     */

    public void setCommand(java.util.Collection<String> command) {
        if (command == null) {
            this.command = null;
            return;
        }

        this.command = new java.util.ArrayList<String>(command);
    }

    /**
     * <p>
     * The launch command for the container.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCommand(java.util.Collection)} or {@link #withCommand(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param command
     *        The launch command for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withCommand(String... command) {
        if (this.command == null) {
            setCommand(new java.util.ArrayList<String>(command.length));
        }
        for (String ele : command) {
            this.command.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The launch command for the container.
     * </p>
     * 
     * @param command
     *        The launch command for the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withCommand(java.util.Collection<String> command) {
        setCommand(command);
        return this;
    }

    /**
     * <p>
     * The environment variables of the container.
     * </p>
     * 
     * @return The environment variables of the container.
     */

    public java.util.Map<String, String> getEnvironment() {
        return environment;
    }

    /**
     * <p>
     * The environment variables of the container.
     * </p>
     * 
     * @param environment
     *        The environment variables of the container.
     */

    public void setEnvironment(java.util.Map<String, String> environment) {
        this.environment = environment;
    }

    /**
     * <p>
     * The environment variables of the container.
     * </p>
     * 
     * @param environment
     *        The environment variables of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withEnvironment(java.util.Map<String, String> environment) {
        setEnvironment(environment);
        return this;
    }

    /**
     * Add a single Environment entry
     *
     * @see Container#withEnvironment
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Container addEnvironmentEntry(String key, String value) {
        if (null == this.environment) {
            this.environment = new java.util.HashMap<String, String>();
        }
        if (this.environment.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.environment.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Environment.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container clearEnvironmentEntries() {
        this.environment = null;
        return this;
    }

    /**
     * <p>
     * The open firewall ports of the container.
     * </p>
     * 
     * @return The open firewall ports of the container.
     */

    public java.util.Map<String, String> getPorts() {
        return ports;
    }

    /**
     * <p>
     * The open firewall ports of the container.
     * </p>
     * 
     * @param ports
     *        The open firewall ports of the container.
     */

    public void setPorts(java.util.Map<String, String> ports) {
        this.ports = ports;
    }

    /**
     * <p>
     * The open firewall ports of the container.
     * </p>
     * 
     * @param ports
     *        The open firewall ports of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withPorts(java.util.Map<String, String> ports) {
        setPorts(ports);
        return this;
    }

    /**
     * Add a single Ports entry
     *
     * @see Container#withPorts
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Container addPortsEntry(String key, String value) {
        if (null == this.ports) {
            this.ports = new java.util.HashMap<String, String>();
        }
        if (this.ports.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.ports.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Ports.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container clearPortsEntries() {
        this.ports = null;
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
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getCommand() != null)
            sb.append("Command: ").append(getCommand()).append(",");
        if (getEnvironment() != null)
            sb.append("Environment: ").append(getEnvironment()).append(",");
        if (getPorts() != null)
            sb.append("Ports: ").append(getPorts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getCommand() == null ^ this.getCommand() == null)
            return false;
        if (other.getCommand() != null && other.getCommand().equals(this.getCommand()) == false)
            return false;
        if (other.getEnvironment() == null ^ this.getEnvironment() == null)
            return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false)
            return false;
        if (other.getPorts() == null ^ this.getPorts() == null)
            return false;
        if (other.getPorts() != null && other.getPorts().equals(this.getPorts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getCommand() == null) ? 0 : getCommand().hashCode());
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode());
        hashCode = prime * hashCode + ((getPorts() == null) ? 0 : getPorts().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.ContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
