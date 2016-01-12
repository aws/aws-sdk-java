/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to disassociate a
 * VPC from an hosted zone.
 * </p>
 */
public class DisassociateVPCFromHostedZoneRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone you want to disassociate your VPC from.
     * </p>
     * <p>
     * Note that you cannot disassociate the last VPC from a hosted zone.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The VPC that you want your hosted zone to be disassociated from.
     * </p>
     */
    private VPC vPC;
    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a
     * <code>DisassociateVPCFromHostedZoneRequest</code>.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The ID of the hosted zone you want to disassociate your VPC from.
     * </p>
     * <p>
     * Note that you cannot disassociate the last VPC from a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone you want to disassociate your VPC
     *        from.</p>
     *        <p>
     *        Note that you cannot disassociate the last VPC from a hosted zone.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to disassociate your VPC from.
     * </p>
     * <p>
     * Note that you cannot disassociate the last VPC from a hosted zone.
     * </p>
     * 
     * @return The ID of the hosted zone you want to disassociate your VPC
     *         from.</p>
     *         <p>
     *         Note that you cannot disassociate the last VPC from a hosted
     *         zone.
     */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to disassociate your VPC from.
     * </p>
     * <p>
     * Note that you cannot disassociate the last VPC from a hosted zone.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone you want to disassociate your VPC
     *        from.</p>
     *        <p>
     *        Note that you cannot disassociate the last VPC from a hosted zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withHostedZoneId(
            String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be disassociated from.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be disassociated from.
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be disassociated from.
     * </p>
     * 
     * @return The VPC that you want your hosted zone to be disassociated from.
     */
    public VPC getVPC() {
        return this.vPC;
    }

    /**
     * <p>
     * The VPC that you want your hosted zone to be disassociated from.
     * </p>
     * 
     * @param vPC
     *        The VPC that you want your hosted zone to be disassociated from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withVPC(VPC vPC) {
        setVPC(vPC);
        return this;
    }

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a
     * <code>DisassociateVPCFromHostedZoneRequest</code>.
     * </p>
     * 
     * @param comment
     *        Optional:</i> Any comments you want to include about a
     *        <code>DisassociateVPCFromHostedZoneRequest
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a
     * <code>DisassociateVPCFromHostedZoneRequest</code>.
     * </p>
     * 
     * @return Optional:</i> Any comments you want to include about a
     *         <code>DisassociateVPCFromHostedZoneRequest
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * <i>Optional:</i> Any comments you want to include about a
     * <code>DisassociateVPCFromHostedZoneRequest</code>.
     * </p>
     * 
     * @param comment
     *        Optional:</i> Any comments you want to include about a
     *        <code>DisassociateVPCFromHostedZoneRequest
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DisassociateVPCFromHostedZoneRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getVPC() != null)
            sb.append("VPC: " + getVPC() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateVPCFromHostedZoneRequest == false)
            return false;
        DisassociateVPCFromHostedZoneRequest other = (DisassociateVPCFromHostedZoneRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getVPC() == null ^ this.getVPC() == null)
            return false;
        if (other.getVPC() != null
                && other.getVPC().equals(this.getVPC()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVPC() == null) ? 0 : getVPC().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateVPCFromHostedZoneRequest clone() {
        return (DisassociateVPCFromHostedZoneRequest) super.clone();
    }
}