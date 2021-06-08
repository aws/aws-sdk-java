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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appmesh-2019-01-25/CreateGatewayRoute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateGatewayRouteRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name to use for the gateway route.
     * </p>
     */
    private String gatewayRouteName;
    /**
     * <p>
     * The name of the service mesh to create the gateway route in.
     * </p>
     */
    private String meshName;
    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you
     * specify must share the mesh with your account before you can create the resource in the service mesh. For more
     * information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     */
    private String meshOwner;
    /**
     * <p>
     * The gateway route specification to apply.
     * </p>
     */
    private GatewayRouteSpec spec;
    /**
     * <p>
     * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each
     * tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     * length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private java.util.List<TagRef> tags;
    /**
     * <p>
     * The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared mesh,
     * then you must be the owner of the virtual gateway resource.
     * </p>
     */
    private String virtualGatewayName;

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *         letters, numbers, hyphens, and underscores are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36 letters,
     * numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 36
     *        letters, numbers, hyphens, and underscores are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name to use for the gateway route.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name to use for the gateway route.
     */

    public void setGatewayRouteName(String gatewayRouteName) {
        this.gatewayRouteName = gatewayRouteName;
    }

    /**
     * <p>
     * The name to use for the gateway route.
     * </p>
     * 
     * @return The name to use for the gateway route.
     */

    public String getGatewayRouteName() {
        return this.gatewayRouteName;
    }

    /**
     * <p>
     * The name to use for the gateway route.
     * </p>
     * 
     * @param gatewayRouteName
     *        The name to use for the gateway route.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withGatewayRouteName(String gatewayRouteName) {
        setGatewayRouteName(gatewayRouteName);
        return this;
    }

    /**
     * <p>
     * The name of the service mesh to create the gateway route in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to create the gateway route in.
     */

    public void setMeshName(String meshName) {
        this.meshName = meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the gateway route in.
     * </p>
     * 
     * @return The name of the service mesh to create the gateway route in.
     */

    public String getMeshName() {
        return this.meshName;
    }

    /**
     * <p>
     * The name of the service mesh to create the gateway route in.
     * </p>
     * 
     * @param meshName
     *        The name of the service mesh to create the gateway route in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withMeshName(String meshName) {
        setMeshName(meshName);
        return this;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you
     * specify must share the mesh with your account before you can create the resource in the service mesh. For more
     * information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that
     *        you specify must share the mesh with your account before you can create the resource in the service mesh.
     *        For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public void setMeshOwner(String meshOwner) {
        this.meshOwner = meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you
     * specify must share the mesh with your account before you can create the resource in the service mesh. For more
     * information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @return The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account
     *         that you specify must share the mesh with your account before you can create the resource in the service
     *         mesh. For more information about mesh sharing, see <a
     *         href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     */

    public String getMeshOwner() {
        return this.meshOwner;
    }

    /**
     * <p>
     * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that you
     * specify must share the mesh with your account before you can create the resource in the service mesh. For more
     * information about mesh sharing, see <a
     * href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * </p>
     * 
     * @param meshOwner
     *        The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then the account that
     *        you specify must share the mesh with your account before you can create the resource in the service mesh.
     *        For more information about mesh sharing, see <a
     *        href="https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html">Working with shared meshes</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withMeshOwner(String meshOwner) {
        setMeshOwner(meshOwner);
        return this;
    }

    /**
     * <p>
     * The gateway route specification to apply.
     * </p>
     * 
     * @param spec
     *        The gateway route specification to apply.
     */

    public void setSpec(GatewayRouteSpec spec) {
        this.spec = spec;
    }

    /**
     * <p>
     * The gateway route specification to apply.
     * </p>
     * 
     * @return The gateway route specification to apply.
     */

    public GatewayRouteSpec getSpec() {
        return this.spec;
    }

    /**
     * <p>
     * The gateway route specification to apply.
     * </p>
     * 
     * @param spec
     *        The gateway route specification to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withSpec(GatewayRouteSpec spec) {
        setSpec(spec);
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each
     * tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     * length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return Optional metadata that you can apply to the gateway route to assist with categorization and organization.
     *         Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *         character length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<TagRef> getTags() {
        return tags;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each
     * tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     * length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the gateway route to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     */

    public void setTags(java.util.Collection<TagRef> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagRef>(tags);
    }

    /**
     * <p>
     * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each
     * tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     * length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the gateway route to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withTags(TagRef... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagRef>(tags.length));
        }
        for (TagRef ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Optional metadata that you can apply to the gateway route to assist with categorization and organization. Each
     * tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character
     * length of 128 characters, and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        Optional metadata that you can apply to the gateway route to assist with categorization and organization.
     *        Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum
     *        character length of 128 characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withTags(java.util.Collection<TagRef> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared mesh,
     * then you must be the owner of the virtual gateway resource.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared
     *        mesh, then you must be the owner of the virtual gateway resource.
     */

    public void setVirtualGatewayName(String virtualGatewayName) {
        this.virtualGatewayName = virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared mesh,
     * then you must be the owner of the virtual gateway resource.
     * </p>
     * 
     * @return The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a
     *         shared mesh, then you must be the owner of the virtual gateway resource.
     */

    public String getVirtualGatewayName() {
        return this.virtualGatewayName;
    }

    /**
     * <p>
     * The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared mesh,
     * then you must be the owner of the virtual gateway resource.
     * </p>
     * 
     * @param virtualGatewayName
     *        The name of the virtual gateway to associate the gateway route with. If the virtual gateway is in a shared
     *        mesh, then you must be the owner of the virtual gateway resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateGatewayRouteRequest withVirtualGatewayName(String virtualGatewayName) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getGatewayRouteName() != null)
            sb.append("GatewayRouteName: ").append(getGatewayRouteName()).append(",");
        if (getMeshName() != null)
            sb.append("MeshName: ").append(getMeshName()).append(",");
        if (getMeshOwner() != null)
            sb.append("MeshOwner: ").append(getMeshOwner()).append(",");
        if (getSpec() != null)
            sb.append("Spec: ").append(getSpec()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof CreateGatewayRouteRequest == false)
            return false;
        CreateGatewayRouteRequest other = (CreateGatewayRouteRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
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
        if (other.getSpec() == null ^ this.getSpec() == null)
            return false;
        if (other.getSpec() != null && other.getSpec().equals(this.getSpec()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getGatewayRouteName() == null) ? 0 : getGatewayRouteName().hashCode());
        hashCode = prime * hashCode + ((getMeshName() == null) ? 0 : getMeshName().hashCode());
        hashCode = prime * hashCode + ((getMeshOwner() == null) ? 0 : getMeshOwner().hashCode());
        hashCode = prime * hashCode + ((getSpec() == null) ? 0 : getSpec().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVirtualGatewayName() == null) ? 0 : getVirtualGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public CreateGatewayRouteRequest clone() {
        return (CreateGatewayRouteRequest) super.clone();
    }

}
