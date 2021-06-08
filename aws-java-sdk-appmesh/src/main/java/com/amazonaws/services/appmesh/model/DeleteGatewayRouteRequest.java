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
package com.amazonaws.services.appmesh.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/DeleteGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteGatewayRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the gateway route to delete.
     * </p>
     */
    private String gatewayRouteName;
    /**
     * <p>
     * The name of the service mesh to delete the gateway route from.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The name of the virtual gateway to delete the route from.
     * </p>
     */
    private String virtualGatewayName;

    /**
     * <p>
     * The name of the gateway route to delete.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name of the gateway route to delete.
     */

    public void setGatewayRouteName(String gatewayRouteName) {
        this.gatewayRouteName = gatewayRouteName;
    }

    /**
     * <p>
     * The name of the gateway route to delete.
     * </p>
     * 
     * @return The name of the gateway route to delete.
     */

    public String getGatewayRouteName() {
        return this.gatewayRouteName;
    }

    /**
     * <p>
     * The name of the gateway route to delete.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name of the gateway route to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGatewayRouteRequest withGatewayRouteName(String gatewayRouteName) {
        setGatewayRouteName(gatewayRouteName);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to delete the gateway route from.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to delete the gateway route from.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to delete the gateway route from.
     * </p>
     * 
     * @return The name of the service mesh to delete the gateway route from.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh to delete the gateway route from.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to delete the gateway route from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGatewayRouteRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *         the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of the
     * account that shared the mesh with your account. For more information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's the ID of
     *        the account that shared the mesh with your account. For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGatewayRouteRequest withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The name of the virtual gateway to delete the route from.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to delete the route from.
     */

    public void setVirtualGatewayName(String virtualGatewayName) {
        this.virtualGatewayName = virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to delete the route from.
     * </p>
     * 
     * @return The name of the virtual gateway to delete the route from.
     */

    public String getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to delete the route from.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to delete the route from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteGatewayRouteRequest withVirtualGatewayName(String virtualGatewayName) {
        setVirtualGatewayName(virtualGatewayName);
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
        if (getGatewayRouteName() != null)
            sb.append("GatewayRouteName: ").append(getGatewayRouteName()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getVirtualGatewayName() != null)
            sb.append("VirtualGatewayName: ").append(getVirtualGatewayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteGatewayRouteRequest == false)
            return false;
        DeleteGatewayRouteRequest other = (DeleteGatewayRouteRequest) obj;
        if (other.getGatewayRouteName() == null ^ this.getGatewayRouteName() == null)
            return false;
        if (other.getGatewayRouteName() != null && other.getGatewayRouteName().equals(this.getGatewayRouteName()) == false)
            return false;
        if (other.getMeshName() == null ^ this.getMeshName() == null)
            return false;
        if (other.getMeshName() != null && other.getMeshName().equals(this.getMeshName()) == false)
            return false;
        if (other.getMeshOwner() == null ^ this.getMeshOwner() == null)
            return false;
        if (other.getMeshOwner() != null && other.getMeshOwner().equals(this.getMeshOwner()) == false)
            return false;
        if (other.getVirtualGatewayName() == null ^ this.getVirtualGatewayName() == null)
            return false;
        if (other.getVirtualGatewayName() != null && other.getVirtualGatewayName().equals(this.getVirtualGatewayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayRouteName() == null) ? 0 : getGatewayRouteName().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayName() == null) ? 0 : getVirtualGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteGatewayRouteRequest clone() {
        return (DeleteGatewayRouteRequest) super.clone();
    }

}
