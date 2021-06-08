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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyTransitGatewayResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private TransitGateway transitGateway;

    /**
     * @param transitGateway
     */

    public void setTransitGateway(TransitGateway transitGateway) {
        this.transitGateway = transitGateway;
    }

    /**
     * @return
     */

    public TransitGateway getTransitGateway() {
        return this.transitGateway;
    }

    /**
     * @param transitGateway
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyTransitGatewayResult withTransitGateway(TransitGateway transitGateway) {
        setTransitGateway(transitGateway);
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
        if (getTransitGateway() != null)
            sb.append("TransitGateway: ").append(getTransitGateway());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyTransitGatewayResult == false)
            return false;
        ModifyTransitGatewayResult other = (ModifyTransitGatewayResult) obj;
        if (other.getTransitGateway() == null ^ this.getTransitGateway() == null)
            return false;
        if (other.getTransitGateway() != null && other.getTransitGateway().equals(this.getTransitGateway()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransitGateway() == null) ? 0 : getTransitGateway().hashCode());
        return hashCode;
    }

    @Override
    public ModifyTransitGatewayResult clone() {
        try {
            return (ModifyTransitGatewayResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
