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
 * The Service Connect resource. Each configuration maps a discovery name to a Cloud Map service name. The data is
 * stored in Cloud Map as part of the Service Connect configuration for each discovery name of this Amazon ECS service.
 * </p>
 * <p>
 * A task can resolve the <code>dnsName</code> for each of the <code>clientAliases</code> of a service. However a task
 * can't resolve the discovery names. If you want to connect to a service, refer to the
 * <code>ServiceConnectConfiguration</code> of that service for the list of <code>clientAliases</code> that you can use.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/ServiceConnectServiceResource" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceConnectServiceResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The discovery name of this Service Connect resource.
     * </p>
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     */
    private String discoveryName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this Service
     * Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service Connect can't
     * ensure connectivity outside of Amazon ECS.
     * </p>
     */
    private String discoveryArn;

    /**
     * <p>
     * The discovery name of this Service Connect resource.
     * </p>
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @param discoveryName
     *        The discovery name of this Service Connect resource.</p>
     *        <p>
     *        The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *        Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *        characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *        can't start with a hyphen.
     *        </p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     */

    public void setDiscoveryName(String discoveryName) {
        this.discoveryName = discoveryName;
    }

    /**
     * <p>
     * The discovery name of this Service Connect resource.
     * </p>
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @return The discovery name of this Service Connect resource.</p>
     *         <p>
     *         The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *         Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *         characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *         can't start with a hyphen.
     *         </p>
     *         <p>
     *         If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *         the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *         <code>portName.namespace</code>.
     */

    public String getDiscoveryName() {
        return this.discoveryName;
    }

    /**
     * <p>
     * The discovery name of this Service Connect resource.
     * </p>
     * <p>
     * The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this Amazon
     * ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64 characters. The
     * name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name can't start with a
     * hyphen.
     * </p>
     * <p>
     * If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If the
     * <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     * <code>portName.namespace</code>.
     * </p>
     * 
     * @param discoveryName
     *        The discovery name of this Service Connect resource.</p>
     *        <p>
     *        The <code>discoveryName</code> is the name of the new Cloud Map service that Amazon ECS creates for this
     *        Amazon ECS service. This must be unique within the Cloud Map namespace. The name can contain up to 64
     *        characters. The name can include lowercase letters, numbers, underscores (_), and hyphens (-). The name
     *        can't start with a hyphen.
     *        </p>
     *        <p>
     *        If this parameter isn't specified, the default value of <code>discoveryName.namespace</code> is used. If
     *        the <code>discoveryName</code> isn't specified, the port mapping name from the task definition is used in
     *        <code>portName.namespace</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectServiceResource withDiscoveryName(String discoveryName) {
        setDiscoveryName(discoveryName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this Service
     * Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service Connect can't
     * ensure connectivity outside of Amazon ECS.
     * </p>
     * 
     * @param discoveryArn
     *        The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this
     *        Service Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service
     *        Connect can't ensure connectivity outside of Amazon ECS.
     */

    public void setDiscoveryArn(String discoveryArn) {
        this.discoveryArn = discoveryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this Service
     * Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service Connect can't
     * ensure connectivity outside of Amazon ECS.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this
     *         Service Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service
     *         Connect can't ensure connectivity outside of Amazon ECS.
     */

    public String getDiscoveryArn() {
        return this.discoveryArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this Service
     * Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service Connect can't
     * ensure connectivity outside of Amazon ECS.
     * </p>
     * 
     * @param discoveryArn
     *        The Amazon Resource Name (ARN) for the namespace in Cloud Map that matches the discovery name for this
     *        Service Connect resource. You can use this ARN in other integrations with Cloud Map. However, Service
     *        Connect can't ensure connectivity outside of Amazon ECS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceConnectServiceResource withDiscoveryArn(String discoveryArn) {
        setDiscoveryArn(discoveryArn);
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
        if (getDiscoveryName() != null)
            sb.append("DiscoveryName: ").append(getDiscoveryName()).append(",");
        if (getDiscoveryArn() != null)
            sb.append("DiscoveryArn: ").append(getDiscoveryArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceConnectServiceResource == false)
            return false;
        ServiceConnectServiceResource other = (ServiceConnectServiceResource) obj;
        if (other.getDiscoveryName() == null ^ this.getDiscoveryName() == null)
            return false;
        if (other.getDiscoveryName() != null && other.getDiscoveryName().equals(this.getDiscoveryName()) == false)
            return false;
        if (other.getDiscoveryArn() == null ^ this.getDiscoveryArn() == null)
            return false;
        if (other.getDiscoveryArn() != null && other.getDiscoveryArn().equals(this.getDiscoveryArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiscoveryName() == null) ? 0 : getDiscoveryName().hashCode());
        hashCode = prime * hashCode + ((getDiscoveryArn() == null) ? 0 : getDiscoveryArn().hashCode());
        return hashCode;
    }

    @Override
    public ServiceConnectServiceResource clone() {
        try {
            return (ServiceConnectServiceResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ServiceConnectServiceResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
