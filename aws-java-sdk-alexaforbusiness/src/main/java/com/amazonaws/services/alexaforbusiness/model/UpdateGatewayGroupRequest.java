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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/UpdateGatewayGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGatewayGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the gateway group to update.
     * </p>
     */
    private String gatewayGroupArn;
    /**
     * <p>
     * The updated name of the gateway group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The updated description of the gateway group.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The ARN of the gateway group to update.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group to update.
     */

    public void setGatewayGroupArn(String gatewayGroupArn) {
        this.gatewayGroupArn = gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group to update.
     * </p>
     * 
     * @return The ARN of the gateway group to update.
     */

    public String getGatewayGroupArn() {
        return this.gatewayGroupArn;
    }

    /**
     * <p>
     * The ARN of the gateway group to update.
     * </p>
     * 
     * @param gatewayGroupArn
     *        The ARN of the gateway group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayGroupRequest withGatewayGroupArn(String gatewayGroupArn) {
        setGatewayGroupArn(gatewayGroupArn);
        return this;
    }

    /**
     * <p>
     * The updated name of the gateway group.
     * </p>
     * 
     * @param name
     *        The updated name of the gateway group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name of the gateway group.
     * </p>
     * 
     * @return The updated name of the gateway group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name of the gateway group.
     * </p>
     * 
     * @param name
     *        The updated name of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The updated description of the gateway group.
     * </p>
     * 
     * @param description
     *        The updated description of the gateway group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the gateway group.
     * </p>
     * 
     * @return The updated description of the gateway group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the gateway group.
     * </p>
     * 
     * @param description
     *        The updated description of the gateway group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGatewayGroupRequest withDescription(String description) {
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
        if (getGatewayGroupArn() != null)
            sb.append("GatewayGroupArn: ").append(getGatewayGroupArn()).append(",");
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

        if (obj instanceof UpdateGatewayGroupRequest == false)
            return false;
        UpdateGatewayGroupRequest other = (UpdateGatewayGroupRequest) obj;
        if (other.getGatewayGroupArn() == null ^ this.getGatewayGroupArn() == null)
            return false;
        if (other.getGatewayGroupArn() != null && other.getGatewayGroupArn().equals(this.getGatewayGroupArn()) == false)
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

        hashCode = prime * hashCode + ((getGatewayGroupArn() == null) ? 0 : getGatewayGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayGroupRequest clone() {
        return (UpdateGatewayGroupRequest) super.clone();
    }

}
