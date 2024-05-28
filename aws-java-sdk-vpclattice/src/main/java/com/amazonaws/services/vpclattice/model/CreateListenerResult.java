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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/CreateListener" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateListenerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the listener.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The action for the default rule.
     * </p>
     */
    private RuleAction defaultAction;
    /**
     * <p>
     * The ID of the listener.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the listener.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The port number of the listener.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The protocol of the listener.
     * </p>
     */
    private String protocol;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The ID of the service.
     * </p>
     */
    private String serviceId;

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

    public CreateListenerResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @param defaultAction
     *        The action for the default rule.
     */

    public void setDefaultAction(RuleAction defaultAction) {
        this.defaultAction = defaultAction;
    }

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @return The action for the default rule.
     */

    public RuleAction getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * <p>
     * The action for the default rule.
     * </p>
     * 
     * @param defaultAction
     *        The action for the default rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerResult withDefaultAction(RuleAction defaultAction) {
        setDefaultAction(defaultAction);
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

    public CreateListenerResult withId(String id) {
        setId(id);
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

    public CreateListenerResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The port number of the listener.
     * </p>
     * 
     * @param port
     *        The port number of the listener.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number of the listener.
     * </p>
     * 
     * @return The port number of the listener.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number of the listener.
     * </p>
     * 
     * @param port
     *        The port number of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerResult withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The protocol of the listener.
     * </p>
     * 
     * @param protocol
     *        The protocol of the listener.
     * @see ListenerProtocol
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of the listener.
     * </p>
     * 
     * @return The protocol of the listener.
     * @see ListenerProtocol
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol of the listener.
     * </p>
     * 
     * @param protocol
     *        The protocol of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public CreateListenerResult withProtocol(String protocol) {
        setProtocol(protocol);
        return this;
    }

    /**
     * <p>
     * The protocol of the listener.
     * </p>
     * 
     * @param protocol
     *        The protocol of the listener.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListenerProtocol
     */

    public CreateListenerResult withProtocol(ListenerProtocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the service.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the service.
     * </p>
     * 
     * @param serviceArn
     *        The Amazon Resource Name (ARN) of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerResult withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     */

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @return The ID of the service.
     */

    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * <p>
     * The ID of the service.
     * </p>
     * 
     * @param serviceId
     *        The ID of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateListenerResult withServiceId(String serviceId) {
        setServiceId(serviceId);
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
        if (getDefaultAction() != null)
            sb.append("DefaultAction: ").append(getDefaultAction()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getServiceId() != null)
            sb.append("ServiceId: ").append(getServiceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateListenerResult == false)
            return false;
        CreateListenerResult other = (CreateListenerResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDefaultAction() == null ^ this.getDefaultAction() == null)
            return false;
        if (other.getDefaultAction() != null && other.getDefaultAction().equals(this.getDefaultAction()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceId() == null ^ this.getServiceId() == null)
            return false;
        if (other.getServiceId() != null && other.getServiceId().equals(this.getServiceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDefaultAction() == null) ? 0 : getDefaultAction().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getServiceId() == null) ? 0 : getServiceId().hashCode());
        return hashCode;
    }

    @Override
    public CreateListenerResult clone() {
        try {
            return (CreateListenerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
