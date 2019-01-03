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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to remove authorization to associate a VPC that was
 * created by one AWS account with a hosted zone that was created with a different AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/DeleteVPCAssociationAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteVPCAssociationAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, the ID of the hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, a complex type that includes the ID and region of the VPC.
     * </p>
     */
    private VPC vPC;

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, the ID of the hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that
     *        was created with a different AWS account, the ID of the hosted zone.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, the ID of the hosted zone.
     * </p>
     * 
     * @return When removing authorization to associate a VPC that was created by one AWS account with a hosted zone
     *         that was created with a different AWS account, the ID of the hosted zone.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, the ID of the hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that
     *        was created with a different AWS account, the ID of the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVPCAssociationAuthorizationRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, a complex type that includes the ID and region of the VPC.
     * </p>
     * 
     * @param vPC
     *        When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that
     *        was created with a different AWS account, a complex type that includes the ID and region of the VPC.
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, a complex type that includes the ID and region of the VPC.
     * </p>
     * 
     * @return When removing authorization to associate a VPC that was created by one AWS account with a hosted zone
     *         that was created with a different AWS account, a complex type that includes the ID and region of the VPC.
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that was
     * created with a different AWS account, a complex type that includes the ID and region of the VPC.
     * </p>
     * 
     * @param vPC
     *        When removing authorization to associate a VPC that was created by one AWS account with a hosted zone that
     *        was created with a different AWS account, a complex type that includes the ID and region of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteVPCAssociationAuthorizationRequest withVPC(VPC vPC) {
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

        if (obj instanceof DeleteVPCAssociationAuthorizationRequest == false)
            return false;
        DeleteVPCAssociationAuthorizationRequest other = (DeleteVPCAssociationAuthorizationRequest) obj;
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
    public DeleteVPCAssociationAuthorizationRequest clone() {
        return (DeleteVPCAssociationAuthorizationRequest) super.clone();
    }

}
