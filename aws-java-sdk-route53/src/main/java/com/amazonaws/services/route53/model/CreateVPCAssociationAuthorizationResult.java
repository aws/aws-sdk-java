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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the response information from a <code>CreateVPCAssociationAuthorization</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/CreateVPCAssociationAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateVPCAssociationAuthorizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that you authorized associating a VPC with.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The VPC that you authorized associating with a hosted zone.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * The ID of the hosted zone that you authorized associating a VPC with.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you authorized associating a VPC with.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you authorized associating a VPC with.
     * </p>
     * 
     * @return The ID of the hosted zone that you authorized associating a VPC with.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you authorized associating a VPC with.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you authorized associating a VPC with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVPCAssociationAuthorizationResult withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The VPC that you authorized associating with a hosted zone.
     * </p>
     * 
     * @param vPC
     *        The VPC that you authorized associating with a hosted zone.
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * The VPC that you authorized associating with a hosted zone.
     * </p>
     * 
     * @return The VPC that you authorized associating with a hosted zone.
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * The VPC that you authorized associating with a hosted zone.
     * </p>
     * 
     * @param vPC
     *        The VPC that you authorized associating with a hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateVPCAssociationAuthorizationResult withVPC(VPC vPC) {
        setVPC(vPC);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getVPC() != null)
            sb.append("VPC: ").append(getVPC());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVPCAssociationAuthorizationResult == false)
            return false;
        CreateVPCAssociationAuthorizationResult other = (CreateVPCAssociationAuthorizationResult) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        return hashCode;
    }

    @Override
    public CreateVPCAssociationAuthorizationResult clone() {
        try {
            return (CreateVPCAssociationAuthorizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
