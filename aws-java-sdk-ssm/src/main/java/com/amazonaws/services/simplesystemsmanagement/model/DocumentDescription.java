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
public class DocumentDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     * </p>
     */
    private String sha1;
    /**
     * <p>
     * The name of the configuration document.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The date when the configuration document was created.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The status of the configuration document.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     * </p>
     * 
     * @param sha1
     *        The SHA1 hash of the document, which you can use for verification
     *        purposes.
     */
    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     * </p>
     * 
     * @return The SHA1 hash of the document, which you can use for verification
     *         purposes.
     */
    public String getSha1() {
        return this.sha1;
    }

    /**
     * <p>
     * The SHA1 hash of the document, which you can use for verification
     * purposes.
     * </p>
     * 
     * @param sha1
     *        The SHA1 hash of the document, which you can use for verification
     *        purposes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withSha1(String sha1) {
        setSha1(sha1);
        return this;
    }

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @param name
     *        The name of the configuration document.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @return The name of the configuration document.
     */
    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the configuration document.
     * </p>
     * 
     * @param name
     *        The name of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The date when the configuration document was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the configuration document was created.
     */
    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the configuration document was created.
     * </p>
     * 
     * @return The date when the configuration document was created.
     */
    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the configuration document was created.
     * </p>
     * 
     * @param createdDate
     *        The date when the configuration document was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DocumentDescription withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The status of the configuration document.
     * </p>
     * 
     * @param status
     *        The status of the configuration document.
     * @see DocumentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the configuration document.
     * </p>
     * 
     * @return The status of the configuration document.
     * @see DocumentStatus
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the configuration document.
     * </p>
     * 
     * @param status
     *        The status of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the configuration document.
     * </p>
     * 
     * @param status
     *        The status of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public void setStatus(DocumentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the configuration document.
     * </p>
     * 
     * @param status
     *        The status of the configuration document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see DocumentStatus
     */
    public DocumentDescription withStatus(DocumentStatus status) {
        setStatus(status);
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
        if (getSha1() != null)
            sb.append("Sha1: " + getSha1() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentDescription == false)
            return false;
        DocumentDescription other = (DocumentDescription) obj;
        if (other.getSha1() == null ^ this.getSha1() == null)
            return false;
        if (other.getSha1() != null
                && other.getSha1().equals(this.getSha1()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSha1() == null) ? 0 : getSha1().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DocumentDescription clone() {
        try {
            return (DocumentDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}