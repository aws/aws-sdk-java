/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest) CreateTrafficPolicyVersion operation}.
 * <p>
 * Creates a new version of an existing traffic policy. When you create a
 * new version of a traffic policy, you specify the ID of the traffic
 * policy that you want to update and a JSON-formatted document that
 * describes the new version.
 * </p>
 * <p>
 * You use traffic policies to create multiple DNS resource record sets
 * for one domain name (such as example.com) or one subdomain name (such
 * as www.example.com).
 * </p>
 * <p>
 * To create a new version, send a <code>POST</code> request to the
 * <code>2013-04-01/trafficpolicy/</code> resource. The request body
 * includes an XML document with a
 * <code>CreateTrafficPolicyVersionRequest</code> element. The response
 * returns the <code>CreateTrafficPolicyVersionResponse</code> element,
 * which contains information about the new version of the traffic
 * policy.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#createTrafficPolicyVersion(CreateTrafficPolicyVersionRequest)
 */
public class CreateTrafficPolicyVersionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the traffic policy for which you want to create a new
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String id;

    /**
     * The definition of a new traffic policy version, in JSON format. You
     * must specify the full definition of the new traffic policy. You cannot
     * specify just the differences between the new version and a previous
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     */
    private String document;

    /**
     * Any comments that you want to include about the new traffic policy
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String comment;

    /**
     * The ID of the traffic policy for which you want to create a new
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The ID of the traffic policy for which you want to create a new
     *         version.
     */
    public String getId() {
        return id;
    }
    
    /**
     * The ID of the traffic policy for which you want to create a new
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy for which you want to create a new
     *         version.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * The ID of the traffic policy for which you want to create a new
     * version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The ID of the traffic policy for which you want to create a new
     *         version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyVersionRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The definition of a new traffic policy version, in JSON format. You
     * must specify the full definition of the new traffic policy. You cannot
     * specify just the differences between the new version and a previous
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @return The definition of a new traffic policy version, in JSON format. You
     *         must specify the full definition of the new traffic policy. You cannot
     *         specify just the differences between the new version and a previous
     *         version.
     */
    public String getDocument() {
        return document;
    }
    
    /**
     * The definition of a new traffic policy version, in JSON format. You
     * must specify the full definition of the new traffic policy. You cannot
     * specify just the differences between the new version and a previous
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @param document The definition of a new traffic policy version, in JSON format. You
     *         must specify the full definition of the new traffic policy. You cannot
     *         specify just the differences between the new version and a previous
     *         version.
     */
    public void setDocument(String document) {
        this.document = document;
    }
    
    /**
     * The definition of a new traffic policy version, in JSON format. You
     * must specify the full definition of the new traffic policy. You cannot
     * specify just the differences between the new version and a previous
     * version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @param document The definition of a new traffic policy version, in JSON format. You
     *         must specify the full definition of the new traffic policy. You cannot
     *         specify just the differences between the new version and a previous
     *         version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyVersionRequest withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * Any comments that you want to include about the new traffic policy
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return Any comments that you want to include about the new traffic policy
     *         version.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * Any comments that you want to include about the new traffic policy
     * version.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment Any comments that you want to include about the new traffic policy
     *         version.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * Any comments that you want to include about the new traffic policy
     * version.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment Any comments that you want to include about the new traffic policy
     *         version.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateTrafficPolicyVersionRequest withComment(String comment) {
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
        if (getDocument() != null) sb.append("Document: " + getDocument() + ",");
        if (getComment() != null) sb.append("Comment: " + getComment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode()); 
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateTrafficPolicyVersionRequest == false) return false;
        CreateTrafficPolicyVersionRequest other = (CreateTrafficPolicyVersionRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getDocument() == null ^ this.getDocument() == null) return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateTrafficPolicyVersionRequest clone() {
        
            return (CreateTrafficPolicyVersionRequest) super.clone();
    }

}
    