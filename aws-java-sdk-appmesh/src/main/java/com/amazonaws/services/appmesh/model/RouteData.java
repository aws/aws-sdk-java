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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a route returned by a describe operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/RouteData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     */
    private ResourceMetadata metadata;
    /**
     * <p>
     * The name of the route.
     * </p>
     */
    private String routeName;
    /**
     * <p>
     * The specifications of the route.
     * </p>
     */
    private RouteSpec spec;
    /**
     * <p>
     * The status of the route.
     * </p>
     */
    private RouteStatus status;
    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     */
    private String virtualRouterName;

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the route resides in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @return The name of the service mesh that the route resides in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh that the route resides in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh that the route resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     * 
     * @param metadata
     *        The associated metadata for the route.
     */

    public void setMetadata(ResourceMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     * 
     * @return The associated metadata for the route.
     */

    public ResourceMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The associated metadata for the route.
     * </p>
     * 
     * @param metadata
     *        The associated metadata for the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withMetadata(ResourceMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @param routeName
     *        The name of the route.
     */

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @return The name of the route.
     */

    public String getRouteName() {
        return this.routeName;
    }

    /**
     * <p>
     * The name of the route.
     * </p>
     * 
     * @param routeName
     *        The name of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withRouteName(String routeName) {
        setRouteName(routeName);
        return this;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     * 
     * @param spec
     *        The specifications of the route.
     */

    public void setSpec(RouteSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     * 
     * @return The specifications of the route.
     */

    public RouteSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The specifications of the route.
     * </p>
     * 
     * @param spec
     *        The specifications of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withSpec(RouteSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     * 
     * @param status
     *        The status of the route.
     */

    public void setStatus(RouteStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     * 
     * @return The status of the route.
     */

    public RouteStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the route.
     * </p>
     * 
     * @param status
     *        The status of the route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withStatus(RouteStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * 
     * @param virtualRouterName
     *        The virtual router that the route is associated with.
     */

    public void setVirtualRouterName(String virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * 
     * @return The virtual router that the route is associated with.
     */

    public String getVirtualRouterName() {
        return this.virtualRouterName;
    }

    /**
     * <p>
     * The virtual router that the route is associated with.
     * </p>
     * 
     * @param virtualRouterName
     *        The virtual router that the route is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteData withVirtualRouterName(String virtualRouterName) {
        setVirtualRouterName(virtualRouterName);
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
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getRouteName() != null)
            sb.append("RouteName: ").append(getRouteName()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getVirtualRouterName() != null)
            sb.append("VirtualRouterName: ").append(getVirtualRouterName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RouteData == false)
            return false;
        RouteData other = (RouteData) obj;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getRouteName() == null ^ this.getRouteName() == null)
            return false;
        if (other.getRouteName() != null && other.getRouteName().equals(this.getRouteName()) == false)
            return false;
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getVirtualRouterName() == null ^ this.getVirtualRouterName() == null)
            return false;
        if (other.getVirtualRouterName() != null && other.getVirtualRouterName().equals(this.getVirtualRouterName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getRouteName() == null) ? 0 : getRouteName().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getVirtualRouterName() == null) ? 0 : getVirtualRouterName().hashCode());
        return hashCode;
    }

    @Override
    public RouteData clone() {
        try {
            return (RouteData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appmesh.model.transform.RouteDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
