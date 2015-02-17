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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a configuration document.
 * </p>
 */
public class DocumentDescription implements Serializable {

    /**
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     */
    private String sha1;

    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     */
    private String name;

    /**
     * The date when the configuration document was created.
     */
    private java.util.Date createdDate;

    /**
     * The status of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     */
    private String status;

    /**
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     *
     * @return The SHA1 hash of the document, which you can use for verification
     *         purposes.
     */
    public String getSha1() {
        return sha1;
    }
    
    /**
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     *
     * @param sha1 The SHA1 hash of the document, which you can use for verification
     *         purposes.
     */
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }
    
    /**
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sha1 The SHA1 hash of the document, which you can use for verification
     *         purposes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentDescription withSha1(String sha1) {
        this.sha1 = sha1;
        return this;
    }

    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @return The name of the configuration document.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name The name of the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the configuration document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 64<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,64}$<br/>
     *
     * @param name The name of the configuration document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentDescription withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The date when the configuration document was created.
     *
     * @return The date when the configuration document was created.
     */
    public java.util.Date getCreatedDate() {
        return createdDate;
    }
    
    /**
     * The date when the configuration document was created.
     *
     * @param createdDate The date when the configuration document was created.
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }
    
    /**
     * The date when the configuration document was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createdDate The date when the configuration document was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DocumentDescription withCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * The status of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     *
     * @return The status of the configuration document.
     *
     * @see DocumentStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     *
     * @param status The status of the configuration document.
     *
     * @see DocumentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the configuration document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     *
     * @param status The status of the configuration document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The status of the configuration document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     *
     * @param status The status of the configuration document.
     *
     * @see DocumentStatus
     */
    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The status of the configuration document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Creating, Active, Deleting
     *
     * @param status The status of the configuration document.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(DocumentStatus status) {
        this.status = status.toString();
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
        if (getSha1() != null) sb.append("Sha1: " + getSha1() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getCreatedDate() != null) sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSha1() == null) ? 0 : getSha1().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DocumentDescription == false) return false;
        DocumentDescription other = (DocumentDescription)obj;
        
        if (other.getSha1() == null ^ this.getSha1() == null) return false;
        if (other.getSha1() != null && other.getSha1().equals(this.getSha1()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null) return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
}
    