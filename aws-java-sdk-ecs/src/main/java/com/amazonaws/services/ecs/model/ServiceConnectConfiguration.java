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
 * The Service Connect configuration of your Amazon ECS service. The configuration for this service to discover and
 * connect to services, and be discovered by, and connected from, other services within a namespace.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceConnectConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConnectConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether to use Service Connect with this service.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service Connect.
     * The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and cluster. The type of
     * namespace doesn't affect Service Connect. For more information about Cloud Map, see <a
     * href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     * </p>
     */
    private String namespace;
    /**
     * <p>
     * The list of Service Connect service objects. These are names and aliases (also known as endpoints) that are used
     * by other Amazon ECS services to connect to this service.
     * </p>
     * <p>
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace only to connect to
     * other services within the namespace. An example of this would be a frontend application that accepts incoming
     * requests from either a load balancer that's attached to the service or by other means.
     * </p>
     * <p>
     * An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     * aliases (endpoints) and ports for client applications to refer to this service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceConnectService> services;

    private LogConfiguration logConfiguration;

    /**
     * <p>
     * Specifies whether to use Service Connect with this service.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to use Service Connect with this service.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to use Service Connect with this service.
     * </p>
     * 
     * @return Specifies whether to use Service Connect with this service.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to use Service Connect with this service.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to use Service Connect with this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectConfiguration withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to use Service Connect with this service.
     * </p>
     * 
     * @return Specifies whether to use Service Connect with this service.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service Connect.
     * The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and cluster. The type of
     * namespace doesn't affect Service Connect. For more information about Cloud Map, see <a
     * href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service
     *        Connect. The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and
     *        cluster. The type of namespace doesn't affect Service Connect. For more information about Cloud Map, see
     *        <a href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     */

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service Connect.
     * The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and cluster. The type of
     * namespace doesn't affect Service Connect. For more information about Cloud Map, see <a
     * href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @return The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service
     *         Connect. The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and
     *         cluster. The type of namespace doesn't affect Service Connect. For more information about Cloud Map, see
     *         <a href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     */

    public String getNamespace() {
        return this.namespace;
    }

    /**
     * <p>
     * The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service Connect.
     * The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and cluster. The type of
     * namespace doesn't affect Service Connect. For more information about Cloud Map, see <a
     * href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     * </p>
     * 
     * @param namespace
     *        The namespace name or full Amazon Resource Name (ARN) of the Cloud Map namespace for use with Service
     *        Connect. The namespace must be in the same Amazon Web Services Region as the Amazon ECS service and
     *        cluster. The type of namespace doesn't affect Service Connect. For more information about Cloud Map, see
     *        <a href="https://docs.aws.amazon.com/">Working with Services</a> in the <i>Cloud Map Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectConfiguration withNamespace(String namespace) {
        setNamespace(namespace);
        return this;
    }

    /**
     * <p>
     * The list of Service Connect service objects. These are names and aliases (also known as endpoints) that are used
     * by other Amazon ECS services to connect to this service.
     * </p>
     * <p>
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace only to connect to
     * other services within the namespace. An example of this would be a frontend application that accepts incoming
     * requests from either a load balancer that's attached to the service or by other means.
     * </p>
     * <p>
     * An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     * aliases (endpoints) and ports for client applications to refer to this service.
     * </p>
     * 
     * @return The list of Service Connect service objects. These are names and aliases (also known as endpoints) that
     *         are used by other Amazon ECS services to connect to this service. </p>
     *         <p>
     *         This field is not required for a "client" Amazon ECS service that's a member of a namespace only to
     *         connect to other services within the namespace. An example of this would be a frontend application that
     *         accepts incoming requests from either a load balancer that's attached to the service or by other means.
     *         </p>
     *         <p>
     *         An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list
     *         of aliases (endpoints) and ports for client applications to refer to this service.
     */

    public java.util.List<ServiceConnectService> getServices() {
        if (services == null) {
            services = new com.amazonaws.internal.SdkInternalList<ServiceConnectService>();
        }
        return services;
    }

    /**
     * <p>
     * The list of Service Connect service objects. These are names and aliases (also known as endpoints) that are used
     * by other Amazon ECS services to connect to this service.
     * </p>
     * <p>
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace only to connect to
     * other services within the namespace. An example of this would be a frontend application that accepts incoming
     * requests from either a load balancer that's attached to the service or by other means.
     * </p>
     * <p>
     * An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     * aliases (endpoints) and ports for client applications to refer to this service.
     * </p>
     * 
     * @param services
     *        The list of Service Connect service objects. These are names and aliases (also known as endpoints) that
     *        are used by other Amazon ECS services to connect to this service. </p>
     *        <p>
     *        This field is not required for a "client" Amazon ECS service that's a member of a namespace only to
     *        connect to other services within the namespace. An example of this would be a frontend application that
     *        accepts incoming requests from either a load balancer that's attached to the service or by other means.
     *        </p>
     *        <p>
     *        An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     *        aliases (endpoints) and ports for client applications to refer to this service.
     */

    public void setServices(java.util.Collection<ServiceConnectService> services) {
        if (services == null) {
            this.services = null;
            return;
        }

        this.services = new com.amazonaws.internal.SdkInternalList<ServiceConnectService>(services);
    }

    /**
     * <p>
     * The list of Service Connect service objects. These are names and aliases (also known as endpoints) that are used
     * by other Amazon ECS services to connect to this service.
     * </p>
     * <p>
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace only to connect to
     * other services within the namespace. An example of this would be a frontend application that accepts incoming
     * requests from either a load balancer that's attached to the service or by other means.
     * </p>
     * <p>
     * An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     * aliases (endpoints) and ports for client applications to refer to this service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServices(java.util.Collection)} or {@link #withServices(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param services
     *        The list of Service Connect service objects. These are names and aliases (also known as endpoints) that
     *        are used by other Amazon ECS services to connect to this service. </p>
     *        <p>
     *        This field is not required for a "client" Amazon ECS service that's a member of a namespace only to
     *        connect to other services within the namespace. An example of this would be a frontend application that
     *        accepts incoming requests from either a load balancer that's attached to the service or by other means.
     *        </p>
     *        <p>
     *        An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     *        aliases (endpoints) and ports for client applications to refer to this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectConfiguration withServices(ServiceConnectService... services) {
        if (this.services == null) {
            setServices(new com.amazonaws.internal.SdkInternalList<ServiceConnectService>(services.length));
        }
        for (ServiceConnectService ele : services) {
            this.services.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Service Connect service objects. These are names and aliases (also known as endpoints) that are used
     * by other Amazon ECS services to connect to this service.
     * </p>
     * <p>
     * This field is not required for a "client" Amazon ECS service that's a member of a namespace only to connect to
     * other services within the namespace. An example of this would be a frontend application that accepts incoming
     * requests from either a load balancer that's attached to the service or by other means.
     * </p>
     * <p>
     * An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     * aliases (endpoints) and ports for client applications to refer to this service.
     * </p>
     * 
     * @param services
     *        The list of Service Connect service objects. These are names and aliases (also known as endpoints) that
     *        are used by other Amazon ECS services to connect to this service. </p>
     *        <p>
     *        This field is not required for a "client" Amazon ECS service that's a member of a namespace only to
     *        connect to other services within the namespace. An example of this would be a frontend application that
     *        accepts incoming requests from either a load balancer that's attached to the service or by other means.
     *        </p>
     *        <p>
     *        An object selects a port from the task definition, assigns a name for the Cloud Map service, and a list of
     *        aliases (endpoints) and ports for client applications to refer to this service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectConfiguration withServices(java.util.Collection<ServiceConnectService> services) {
        setServices(services);
        return this;
    }

    /**
     * @param logConfiguration
     */

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * @return
     */

    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * @param logConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectConfiguration withLogConfiguration(LogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getNamespace() != null)
            sb.append("Namespace: ").append(getNamespace()).append(",");
        if (getServices() != null)
            sb.append("Services: ").append(getServices()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConnectConfiguration == false)
            return false;
        ServiceConnectConfiguration other = (ServiceConnectConfiguration) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getServices() == null ^ this.getServices() == null)
            return false;
        if (other.getServices() != null && other.getServices().equals(this.getServices()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getServices() == null) ? 0 : getServices().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConnectConfiguration clone() {
        try {
            return (ServiceConnectConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceConnectConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
