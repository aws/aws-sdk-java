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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/UpdateWirelessGateway" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateWirelessGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The new name of the resource.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A new description of the resource.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @return The ID of the resource to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the resource to update.
     * </p>
     * 
     * @param id
     *        The ID of the resource to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @return The new name of the resource.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The new name of the resource.
     * </p>
     * 
     * @param name
     *        The new name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @return A new description of the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A new description of the resource.
     * </p>
     * 
     * @param description
     *        A new description of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateWirelessGatewayRequest withDescription(String description) {
        setDescription(description);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateWirelessGatewayRequest == false)
            return false;
        UpdateWirelessGatewayRequest other = (UpdateWirelessGatewayRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateWirelessGatewayRequest clone() {
        return (UpdateWirelessGatewayRequest) super.clone();
    }

}
