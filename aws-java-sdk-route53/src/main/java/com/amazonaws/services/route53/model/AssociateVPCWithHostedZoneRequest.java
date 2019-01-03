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
 * A complex type that contains information about the request to associate a VPC with a private hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/AssociateVPCWithHostedZone" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateVPCWithHostedZoneRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
     * </p>
     */
    private VPC vPC;
    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the private hosted zone that you want to associate an Amazon VPC with.</p>
     *        <p>
     *        Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     * </p>
     * 
     * @return The ID of the private hosted zone that you want to associate an Amazon VPC with.</p>
     *         <p>
     *         Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the private hosted zone that you want to associate an Amazon VPC with.
     * </p>
     * <p>
     * Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the private hosted zone that you want to associate an Amazon VPC with.</p>
     *        <p>
     *        Note that you can't associate a VPC with a hosted zone that doesn't have an existing VPC association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVPCWithHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
     * </p>
     * 
     * @param vPC
     *        A complex type that contains information about the VPC that you want to associate with a private hosted
     *        zone.
     */

    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
     * </p>
     * 
     * @return A complex type that contains information about the VPC that you want to associate with a private hosted
     *         zone.
     */

    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * A complex type that contains information about the VPC that you want to associate with a private hosted zone.
     * </p>
     * 
     * @param vPC
     *        A complex type that contains information about the VPC that you want to associate with a private hosted
     *        zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVPCWithHostedZoneRequest withVPC(VPC vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     * 
     * @param comment
     *        <i>Optional:</i> A comment about the association request.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     * 
     * @return <i>Optional:</i> A comment about the association request.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * <i>Optional:</i> A comment about the association request.
     * </p>
     * 
     * @param comment
     *        <i>Optional:</i> A comment about the association request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateVPCWithHostedZoneRequest withComment(String comment) {
        setComment(comment);
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
            sb.append("VPC: ").append(getVPC()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateVPCWithHostedZoneRequest == false)
            return false;
        AssociateVPCWithHostedZoneRequest other = (AssociateVPCWithHostedZoneRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public AssociateVPCWithHostedZoneRequest clone() {
        return (AssociateVPCWithHostedZoneRequest) super.clone();
    }

}
