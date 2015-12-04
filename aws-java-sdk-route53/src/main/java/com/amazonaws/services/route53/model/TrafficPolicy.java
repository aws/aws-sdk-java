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

/**
 * Traffic Policy
 */
public class TrafficPolicy implements Serializable, Cloneable {

    private String id;

    private Integer version;

    private String name;

    private String type;

    private String document;

    private String comment;

    /**
     * Returns the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return The value of the Id property for this object.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The new value for the Id property for this object.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Sets the value of the Id property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id The new value for the Id property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Returns the value of the Version property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return The value of the Version property for this object.
     */
    public Integer getVersion() {
        return version;
    }
    
    /**
     * Sets the value of the Version property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The new value for the Version property for this object.
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    /**
     * Sets the value of the Version property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param version The new value for the Version property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicy withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * Returns the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @return The value of the Name property for this object.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name The new value for the Name property for this object.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value of the Name property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 512<br/>
     *
     * @param name The new value for the Name property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Returns the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The value of the Type property for this object.
     *
     * @see RRType
     */
    public String getType() {
        return type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicy withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Sets the value of the Type property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }
    
    /**
     * Sets the value of the Type property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The new value for the Type property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public TrafficPolicy withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * Returns the value of the Document property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @return The value of the Document property for this object.
     */
    public String getDocument() {
        return document;
    }
    
    /**
     * Sets the value of the Document property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @param document The new value for the Document property for this object.
     */
    public void setDocument(String document) {
        this.document = document;
    }
    
    /**
     * Sets the value of the Document property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 102400<br/>
     *
     * @param document The new value for the Document property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicy withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * Returns the value of the Comment property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The value of the Comment property for this object.
     */
    public String getComment() {
        return comment;
    }
    
    /**
     * Sets the value of the Comment property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment The new value for the Comment property for this object.
     */
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    /**
     * Sets the value of the Comment property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param comment The new value for the Comment property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public TrafficPolicy withComment(String comment) {
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
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
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
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode()); 
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrafficPolicy == false) return false;
        TrafficPolicy other = (TrafficPolicy)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getDocument() == null ^ this.getDocument() == null) return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false) return false; 
        if (other.getComment() == null ^ this.getComment() == null) return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false) return false; 
        return true;
    }
    
    @Override
    public TrafficPolicy clone() {
        try {
            return (TrafficPolicy) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    