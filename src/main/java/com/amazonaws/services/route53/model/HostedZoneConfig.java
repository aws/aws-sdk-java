/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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


/**
 * <p>
 * A complex type that contains an optional comment about your hosted zone. If you don't want to specify a comment, you can omit the
 * <code>HostedZoneConfig</code> and <code>Comment</code> elements from the XML document.
 * </p>
 */
public class HostedZoneConfig implements Serializable {

    /**
     * An optional comment about your hosted zone. If you don't want to
     * specify a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String comment;

    /**
     * Default constructor for a new HostedZoneConfig object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public HostedZoneConfig() {}
    
    /**
     * An optional comment about your hosted zone. If you don't want to
     * specify a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return An optional comment about your hosted zone. If you don't want to
     *         specify a comment, you can omit the <code>HostedZoneConfig</code> and
     *         <code>Comment</code> elements from the XML document.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * An optional comment about your hosted zone. If you don't want to
     * specify a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment An optional comment about your hosted zone. If you don't want to
     *         specify a comment, you can omit the <code>HostedZoneConfig</code> and
     *         <code>Comment</code> elements from the XML document.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * An optional comment about your hosted zone. If you don't want to
     * specify a comment, you can omit the <code>HostedZoneConfig</code> and
     * <code>Comment</code> elements from the XML document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param comment An optional comment about your hosted zone. If you don't want to
     *         specify a comment, you can omit the <code>HostedZoneConfig</code> and
     *         <code>Comment</code> elements from the XML document.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public HostedZoneConfig withComment(String comment) {
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
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof HostedZoneConfig == false) return false;
        HostedZoneConfig other = (HostedZoneConfig)obj;
        
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
}
    