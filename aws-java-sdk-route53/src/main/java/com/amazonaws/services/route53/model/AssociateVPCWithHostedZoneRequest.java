/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest) AssociateVPCWithHostedZone operation}.
 * <p>
 * This action associates a VPC with an hosted zone.
 * </p>
 * <p>
 * To associate a VPC with an hosted zone, send a <code>POST</code>
 * request to the <code>2013-04-01/hostedzone/hosted zone
 * ID/associatevpc</code> resource. The request body must include an XML
 * document with a <code>AssociateVPCWithHostedZoneRequest</code>
 * element. The response returns the
 * <code>AssociateVPCWithHostedZoneResponse</code> element that contains
 * <code>ChangeInfo</code> for you to track the progress of the
 * <code>AssociateVPCWithHostedZoneRequest</code> you made. See
 * <code>GetChange</code> operation for how to track the progress of your
 * change.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#associateVPCWithHostedZone(AssociateVPCWithHostedZoneRequest)
 */
public class AssociateVPCWithHostedZoneRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the hosted zone you want to associate your VPC with. <p>Note
     * that you cannot associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * The VPC that you want your hosted zone to be associated with.
     */
    private VPC vPC;

    /**
     * <i>Optional:</i> Any comments you want to include about a
     * <code>AssociateVPCWithHostedZoneRequest</code>.
     */
    private String comment;

    /**
     * The ID of the hosted zone you want to associate your VPC with. <p>Note
     * that you cannot associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone you want to associate your VPC with. <p>Note
     *         that you cannot associate a VPC with a hosted zone that doesn't have
     *         an existing VPC association.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone you want to associate your VPC with. <p>Note
     * that you cannot associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone you want to associate your VPC with. <p>Note
     *         that you cannot associate a VPC with a hosted zone that doesn't have
     *         an existing VPC association.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone you want to associate your VPC with. <p>Note
     * that you cannot associate a VPC with a hosted zone that doesn't have
     * an existing VPC association.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone you want to associate your VPC with. <p>Note
     *         that you cannot associate a VPC with a hosted zone that doesn't have
     *         an existing VPC association.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateVPCWithHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * The VPC that you want your hosted zone to be associated with.
     *
     * @return The VPC that you want your hosted zone to be associated with.
     */
    public VPC getVPC() {
        return vPC;
    }
    
    /**
     * The VPC that you want your hosted zone to be associated with.
     *
     * @param vPC The VPC that you want your hosted zone to be associated with.
     */
    public void setVPC(VPC vPC) {
        this.vPC = vPC;
    }
    
    /**
     * The VPC that you want your hosted zone to be associated with.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vPC The VPC that you want your hosted zone to be associated with.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateVPCWithHostedZoneRequest withVPC(VPC vPC) {
        this.vPC = vPC;
        return this;
    }

    /**
     * <i>Optional:</i> Any comments you want to include about a
     * <code>AssociateVPCWithHostedZoneRequest</code>.
     *
     * @return <i>Optional:</i> Any comments you want to include about a
     *         <code>AssociateVPCWithHostedZoneRequest</code>.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * <i>Optional:</i> Any comments you want to include about a
     * <code>AssociateVPCWithHostedZoneRequest</code>.
     *
     * @param comment <i>Optional:</i> Any comments you want to include about a
     *         <code>AssociateVPCWithHostedZoneRequest</code>.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * <i>Optional:</i> Any comments you want to include about a
     * <code>AssociateVPCWithHostedZoneRequest</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param comment <i>Optional:</i> Any comments you want to include about a
     *         <code>AssociateVPCWithHostedZoneRequest</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AssociateVPCWithHostedZoneRequest withComment(String comment) {
        this.comment = comment;
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
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getVPC() != null) sb.append("VPC: " + getVPC() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AssociateVPCWithHostedZoneRequest == false) return false;
        AssociateVPCWithHostedZoneRequest other = (AssociateVPCWithHostedZoneRequest)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getVPC() == null ^ this.getVPC() == null) return false;
        if (other.getVPC() != null && other.getVPC().equals(this.getVPC()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
}
    