/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.marketplaceagreement.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the list of text agreements proposed to the acceptors. An example is the end user license agreement (EULA).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/marketplace-agreement-2020-03-01/LegalTerm" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LegalTerm implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of references to legal resources proposed to the buyers. An example is the EULA.
     * </p>
     */
    private java.util.List<DocumentItem> documents;
    /**
     * <p>
     * Category of the term being updated.
     * </p>
     */
    private String type;

    /**
     * <p>
     * List of references to legal resources proposed to the buyers. An example is the EULA.
     * </p>
     * 
     * @return List of references to legal resources proposed to the buyers. An example is the EULA.
     */

    public java.util.List<DocumentItem> getDocuments() {
        return documents;
    }

    /**
     * <p>
     * List of references to legal resources proposed to the buyers. An example is the EULA.
     * </p>
     * 
     * @param documents
     *        List of references to legal resources proposed to the buyers. An example is the EULA.
     */

    public void setDocuments(java.util.Collection<DocumentItem> documents) {
        if (documents == null) {
            this.documents = null;
            return;
        }

        this.documents = new java.util.ArrayList<DocumentItem>(documents);
    }

    /**
     * <p>
     * List of references to legal resources proposed to the buyers. An example is the EULA.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDocuments(java.util.Collection)} or {@link #withDocuments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documents
     *        List of references to legal resources proposed to the buyers. An example is the EULA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalTerm withDocuments(DocumentItem... documents) {
        if (this.documents == null) {
            setDocuments(new java.util.ArrayList<DocumentItem>(documents.length));
        }
        for (DocumentItem ele : documents) {
            this.documents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of references to legal resources proposed to the buyers. An example is the EULA.
     * </p>
     * 
     * @param documents
     *        List of references to legal resources proposed to the buyers. An example is the EULA.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalTerm withDocuments(java.util.Collection<DocumentItem> documents) {
        setDocuments(documents);
        return this;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @return Category of the term being updated.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Category of the term being updated.
     * </p>
     * 
     * @param type
     *        Category of the term being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegalTerm withType(String type) {
        setType(type);
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
        if (getDocuments() != null)
            sb.append("Documents: ").append(getDocuments()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LegalTerm == false)
            return false;
        LegalTerm other = (LegalTerm) obj;
        if (other.getDocuments() == null ^ this.getDocuments() == null)
            return false;
        if (other.getDocuments() != null && other.getDocuments().equals(this.getDocuments()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDocuments() == null) ? 0 : getDocuments().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public LegalTerm clone() {
        try {
            return (LegalTerm) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.marketplaceagreement.model.transform.LegalTermMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
