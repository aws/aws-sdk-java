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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/CreateWirelessGatewayTaskDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateWirelessGatewayTaskDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the new wireless gateway task definition.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The ID of the new wireless gateway task definition.
     * </p>
     * 
     * @param id
     *        The ID of the new wireless gateway task definition.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the new wireless gateway task definition.
     * </p>
     * 
     * @return The ID of the new wireless gateway task definition.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the new wireless gateway task definition.
     * </p>
     * 
     * @param id
     *        The ID of the new wireless gateway task definition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessGatewayTaskDefinitionResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @return The Amazon Resource Name of the resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name of the resource.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateWirelessGatewayTaskDefinitionResult withArn(String arn) {
        setArn(arn);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateWirelessGatewayTaskDefinitionResult == false)
            return false;
        CreateWirelessGatewayTaskDefinitionResult other = (CreateWirelessGatewayTaskDefinitionResult) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateWirelessGatewayTaskDefinitionResult clone() {
        try {
            return (CreateWirelessGatewayTaskDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
