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
package com.amazonaws.services.directconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/directconnect-2012-10-25/UpdateDirectConnectGateway"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDirectConnectGatewayRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Direct Connect gateway to update.
     * </p>
     */
    private String directConnectGatewayId;
    /**
     * <p>
     * The new name for the Direct Connect gateway.
     * </p>
     */
    private String newDirectConnectGatewayName;

    /**
     * <p>
     * The ID of the Direct Connect gateway to update.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway to update.
     */

    public void setDirectConnectGatewayId(String directConnectGatewayId) {
        this.directConnectGatewayId = directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway to update.
     * </p>
     * 
     * @return The ID of the Direct Connect gateway to update.
     */

    public String getDirectConnectGatewayId() {
        return this.directConnectGatewayId;
    }

    /**
     * <p>
     * The ID of the Direct Connect gateway to update.
     * </p>
     * 
     * @param directConnectGatewayId
     *        The ID of the Direct Connect gateway to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayRequest withDirectConnectGatewayId(String directConnectGatewayId) {
        setDirectConnectGatewayId(directConnectGatewayId);
        return this;
    }

    /**
     * <p>
     * The new name for the Direct Connect gateway.
     * </p>
     * 
     * @param newDirectConnectGatewayName
     *        The new name for the Direct Connect gateway.
     */

    public void setNewDirectConnectGatewayName(String newDirectConnectGatewayName) {
        this.newDirectConnectGatewayName = newDirectConnectGatewayName;
    }

    /**
     * <p>
     * The new name for the Direct Connect gateway.
     * </p>
     * 
     * @return The new name for the Direct Connect gateway.
     */

    public String getNewDirectConnectGatewayName() {
        return this.newDirectConnectGatewayName;
    }

    /**
     * <p>
     * The new name for the Direct Connect gateway.
     * </p>
     * 
     * @param newDirectConnectGatewayName
     *        The new name for the Direct Connect gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDirectConnectGatewayRequest withNewDirectConnectGatewayName(String newDirectConnectGatewayName) {
        setNewDirectConnectGatewayName(newDirectConnectGatewayName);
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
        if (getDirectConnectGatewayId() != null)
            sb.append("DirectConnectGatewayId: ").append(getDirectConnectGatewayId()).append(",");
        if (getNewDirectConnectGatewayName() != null)
            sb.append("NewDirectConnectGatewayName: ").append(getNewDirectConnectGatewayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDirectConnectGatewayRequest == false)
            return false;
        UpdateDirectConnectGatewayRequest other = (UpdateDirectConnectGatewayRequest) obj;
        if (other.getDirectConnectGatewayId() == null ^ this.getDirectConnectGatewayId() == null)
            return false;
        if (other.getDirectConnectGatewayId() != null && other.getDirectConnectGatewayId().equals(this.getDirectConnectGatewayId()) == false)
            return false;
        if (other.getNewDirectConnectGatewayName() == null ^ this.getNewDirectConnectGatewayName() == null)
            return false;
        if (other.getNewDirectConnectGatewayName() != null && other.getNewDirectConnectGatewayName().equals(this.getNewDirectConnectGatewayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectConnectGatewayId() == null) ? 0 : getDirectConnectGatewayId().hashCode());
        hashCode = prime * hashCode + ((getNewDirectConnectGatewayName() == null) ? 0 : getNewDirectConnectGatewayName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDirectConnectGatewayRequest clone() {
        return (UpdateDirectConnectGatewayRequest) super.clone();
    }

}
