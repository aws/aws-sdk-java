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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#updateHostedZoneComment(UpdateHostedZoneCommentRequest) UpdateHostedZoneComment operation}.
 * <p>
 * To update the hosted zone comment, send a <code>POST</code> request
 * to the <code>2013-04-01/hostedzone/hosted zone ID </code> resource.
 * The request body must include an XML document with a
 * <code>UpdateHostedZoneCommentRequest</code> element. The response to
 * this request includes the modified <code>HostedZone</code> element.
 * </p>
 * <p>
 * <b>NOTE:</b> The comment can have a maximum length of 256 characters.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#updateHostedZoneComment(UpdateHostedZoneCommentRequest)
 */
public class UpdateHostedZoneCommentRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the hosted zone you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String id;

    /**
     * A comment about your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String comment;

    /**
     * The ID of the hosted zone you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone you want to update.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the hosted zone you want to update.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the hosted zone you want to update.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the hosted zone you want to update.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param id The ID of the hosted zone you want to update.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHostedZoneCommentRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * A comment about your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return A comment about your hosted zone.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * A comment about your hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment A comment about your hosted zone.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * A comment about your hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment A comment about your hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateHostedZoneCommentRequest withComment(String comment) {
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateHostedZoneCommentRequest == false) return false;
        UpdateHostedZoneCommentRequest other = (UpdateHostedZoneCommentRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
}
    