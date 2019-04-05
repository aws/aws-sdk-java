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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/CreateResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier associated with the organization for which the resource is created.
     * </p>
     */
    private String organizationId;
    /**
     * <p>
     * The name of the new resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The identifier associated with the organization for which the resource is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization for which the resource is created.
     */

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is created.
     * </p>
     * 
     * @return The identifier associated with the organization for which the resource is created.
     */

    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * <p>
     * The identifier associated with the organization for which the resource is created.
     * </p>
     * 
     * @param organizationId
     *        The identifier associated with the organization for which the resource is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withOrganizationId(String organizationId) {
        setOrganizationId(organizationId);
        return this;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @return The name of the new resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new resource.
     * </p>
     * 
     * @param name
     *        The name of the new resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * </p>
     * 
     * @param type
     *        The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * @see ResourceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * </p>
     * 
     * @return The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * @see ResourceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * </p>
     * 
     * @param type
     *        The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateResourceRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * </p>
     * 
     * @param type
     *        The type of the new resource. The available types are <code>equipment</code> and <code>room</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public CreateResourceRequest withType(ResourceType type) {
        this.type = type.toString();
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
        if (getOrganizationId() != null)
            sb.append("OrganizationId: ").append(getOrganizationId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceRequest == false)
            return false;
        CreateResourceRequest other = (CreateResourceRequest) obj;
        if (other.getOrganizationId() == null ^ this.getOrganizationId() == null)
            return false;
        if (other.getOrganizationId() != null && other.getOrganizationId().equals(this.getOrganizationId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceRequest clone() {
        return (CreateResourceRequest) super.clone();
    }

}
