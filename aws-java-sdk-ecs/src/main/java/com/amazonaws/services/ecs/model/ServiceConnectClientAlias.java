/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Each alias ("endpoint") is a fully-qualified name and port number that other tasks ("clients") can use to connect to
 * this service.
 * </p>
 * <p>
 * Each name and port mapping must be unique within the namespace.
 * </p>
 * <p>
 * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks can connect to
 * services across all of the clusters in the namespace. Tasks connect through a managed proxy container that collects
 * logs and metrics for increased visibility. Only the tasks that Amazon ECS services create are supported with Service
 * Connect. For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in the
 * <i>Amazon Elastic Container Service Developer Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceConnectClientAlias" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConnectClientAlias implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The listening port number for the Service Connect proxy. This port is available inside of all of the tasks within
     * the same namespace.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same port that the client
     * application uses by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this service.
     * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up to 127
     * characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and periods (.). The
     * name can't start with a hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same name that the client
     * application uses by default. For example, a few common names are <code>database</code>, <code>db</code>, or the
     * lowercase name of a database, such as <code>mysql</code> or <code>redis</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String dnsName;

    /**
     * <p>
     * The listening port number for the Service Connect proxy. This port is available inside of all of the tasks within
     * the same namespace.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same port that the client
     * application uses by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param port
     *        The listening port number for the Service Connect proxy. This port is available inside of all of the tasks
     *        within the same namespace.</p>
     *        <p>
     *        To avoid changing your applications in client Amazon ECS services, set this to the same port that the
     *        client application uses by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The listening port number for the Service Connect proxy. This port is available inside of all of the tasks within
     * the same namespace.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same port that the client
     * application uses by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The listening port number for the Service Connect proxy. This port is available inside of all of the
     *         tasks within the same namespace.</p>
     *         <p>
     *         To avoid changing your applications in client Amazon ECS services, set this to the same port that the
     *         client application uses by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The listening port number for the Service Connect proxy. This port is available inside of all of the tasks within
     * the same namespace.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same port that the client
     * application uses by default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param port
     *        The listening port number for the Service Connect proxy. This port is available inside of all of the tasks
     *        within the same namespace.</p>
     *        <p>
     *        To avoid changing your applications in client Amazon ECS services, set this to the same port that the
     *        client application uses by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectClientAlias withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this service.
     * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up to 127
     * characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and periods (.). The
     * name can't start with a hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same name that the client
     * application uses by default. For example, a few common names are <code>database</code>, <code>db</code>, or the
     * lowercase name of a database, such as <code>mysql</code> or <code>redis</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param dnsName
     *        The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this
     *        service. The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up
     *        to 127 characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and
     *        periods (.). The name can't start with a hyphen.</p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     *        </p>
     *        <p>
     *        To avoid changing your applications in client Amazon ECS services, set this to the same name that the
     *        client application uses by default. For example, a few common names are <code>database</code>,
     *        <code>db</code>, or the lowercase name of a database, such as <code>mysql</code> or <code>redis</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this service.
     * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up to 127
     * characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and periods (.). The
     * name can't start with a hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same name that the client
     * application uses by default. For example, a few common names are <code>database</code>, <code>db</code>, or the
     * lowercase name of a database, such as <code>mysql</code> or <code>redis</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this
     *         service. The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include
     *         up to 127 characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and
     *         periods (.). The name can't start with a hyphen.</p>
     *         <p>
     *         If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *         the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *         <code>portName.namespace</code>.
     *         </p>
     *         <p>
     *         To avoid changing your applications in client Amazon ECS services, set this to the same name that the
     *         client application uses by default. For example, a few common names are <code>database</code>,
     *         <code>db</code>, or the lowercase name of a database, such as <code>mysql</code> or <code>redis</code>.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *         Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this service.
     * The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up to 127
     * characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and periods (.). The
     * name can't start with a hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * <p>
     * To avoid changing your applications in client Amazon ECS services, set this to the same name that the client
     * application uses by default. For example, a few common names are <code>database</code>, <code>db</code>, or the
     * lowercase name of a database, such as <code>mysql</code> or <code>redis</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service Connect</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param dnsName
     *        The <code>dnsName</code> is the name that you use in the applications of client tasks to connect to this
     *        service. The name must be a valid DNS name but doesn't need to be fully-qualified. The name can include up
     *        to 127 characters. The name can include lowercase letters, numbers, underscores (_), hyphens (-), and
     *        periods (.). The name can't start with a hyphen.</p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     *        </p>
     *        <p>
     *        To avoid changing your applications in client Amazon ECS services, set this to the same name that the
     *        client application uses by default. For example, a few common names are <code>database</code>,
     *        <code>db</code>, or the lowercase name of a database, such as <code>mysql</code> or <code>redis</code>.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html">Service
     *        Connect</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectClientAlias withDnsName(String dnsName) {
        setDnsName(dnsName);
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
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConnectClientAlias == false)
            return false;
        ServiceConnectClientAlias other = (ServiceConnectClientAlias) obj;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConnectClientAlias clone() {
        try {
            return (ServiceConnectClientAlias) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceConnectClientAliasMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
