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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes dynamic routing for the transit gateway peering attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayPeeringAttachmentOptions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayPeeringAttachmentOptions implements Serializable, Cloneable {

    /**
     * <p>
     * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * </p>
     */
    private String dynamicRouting;

    /**
     * <p>
     * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * </p>
     * 
     * @param dynamicRouting
     *        Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * @see DynamicRoutingValue
     */

    public void setDynamicRouting(String dynamicRouting) {
        this.dynamicRouting = dynamicRouting;
    }

    /**
     * <p>
     * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * </p>
     * 
     * @return Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * @see DynamicRoutingValue
     */

    public String getDynamicRouting() {
        return this.dynamicRouting;
    }

    /**
     * <p>
     * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * </p>
     * 
     * @param dynamicRouting
     *        Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamicRoutingValue
     */

    public TransitGatewayPeeringAttachmentOptions withDynamicRouting(String dynamicRouting) {
        setDynamicRouting(dynamicRouting);
        return this;
    }

    /**
     * <p>
     * Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * </p>
     * 
     * @param dynamicRouting
     *        Describes whether dynamic routing is enabled or disabled for the transit gateway peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DynamicRoutingValue
     */

    public TransitGatewayPeeringAttachmentOptions withDynamicRouting(DynamicRoutingValue dynamicRouting) {
        this.dynamicRouting = dynamicRouting.toString();
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
        if (getDynamicRouting() != null)
            sb.append("DynamicRouting: ").append(getDynamicRouting());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitGatewayPeeringAttachmentOptions == false)
            return false;
        TransitGatewayPeeringAttachmentOptions other = (TransitGatewayPeeringAttachmentOptions) obj;
        if (other.getDynamicRouting() == null ^ this.getDynamicRouting() == null)
            return false;
        if (other.getDynamicRouting() != null && other.getDynamicRouting().equals(this.getDynamicRouting()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDynamicRouting() == null) ? 0 : getDynamicRouting().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayPeeringAttachmentOptions clone() {
        try {
            return (TransitGatewayPeeringAttachmentOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
