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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a shareable resource type and the Amazon Web Services service to which resources of that type
 * belong.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/ServiceNameAndResourceType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ServiceNameAndResourceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of the resource.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The name of the Amazon Web Services service to which resources of this type belong.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Specifies the scope of visibility of resources of this type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     */
    private String resourceRegionScope;

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @return The type of the resource.
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of the resource.
     * </p>
     * 
     * @param resourceType
     *        The type of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNameAndResourceType withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service to which resources of this type belong.
     * </p>
     * 
     * @param serviceName
     *        The name of the Amazon Web Services service to which resources of this type belong.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service to which resources of this type belong.
     * </p>
     * 
     * @return The name of the Amazon Web Services service to which resources of this type belong.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the Amazon Web Services service to which resources of this type belong.
     * </p>
     * 
     * @param serviceName
     *        The name of the Amazon Web Services service to which resources of this type belong.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ServiceNameAndResourceType withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of visibility of resources of this type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of resources of this type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @see ResourceRegionScope
     */

    public void setResourceRegionScope(String resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope;
    }

    /**
     * <p>
     * Specifies the scope of visibility of resources of this type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the scope of visibility of resources of this type:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *         Region in which the resource exists.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *         </p>
     *         </li>
     * @see ResourceRegionScope
     */

    public String getResourceRegionScope() {
        return this.resourceRegionScope;
    }

    /**
     * <p>
     * Specifies the scope of visibility of resources of this type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of resources of this type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScope
     */

    public ServiceNameAndResourceType withResourceRegionScope(String resourceRegionScope) {
        setResourceRegionScope(resourceRegionScope);
        return this;
    }

    /**
     * <p>
     * Specifies the scope of visibility of resources of this type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services Region
     * in which the resource exists.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceRegionScope
     *        Specifies the scope of visibility of resources of this type:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>REGIONAL</b> – The resource can be accessed only by using requests that target the Amazon Web Services
     *        Region in which the resource exists.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>GLOBAL</b> – The resource can be accessed from any Amazon Web Services Region.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceRegionScope
     */

    public ServiceNameAndResourceType withResourceRegionScope(ResourceRegionScope resourceRegionScope) {
        this.resourceRegionScope = resourceRegionScope.toString();
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getResourceRegionScope() != null)
            sb.append("ResourceRegionScope: ").append(getResourceRegionScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ServiceNameAndResourceType == false)
            return false;
        ServiceNameAndResourceType other = (ServiceNameAndResourceType) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getResourceRegionScope() == null ^ this.getResourceRegionScope() == null)
            return false;
        if (other.getResourceRegionScope() != null && other.getResourceRegionScope().equals(this.getResourceRegionScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getResourceRegionScope() == null) ? 0 : getResourceRegionScope().hashCode());
        return hashCode;
    }

    @Override
    public ServiceNameAndResourceType clone() {
        try {
            return (ServiceNameAndResourceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ram.model.transform.ServiceNameAndResourceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
