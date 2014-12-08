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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a description of an Amazon EC2 instance from the Amazon EC2
 * metadata service. For more information, see
 * <a href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html"> Instance Metadata and User Data </a>
 * .
 * </p>
 */
public class InstanceIdentity implements Serializable {

    /**
     * A JSON document that contains the metadata.
     */
    private String document;

    /**
     * A signature that can be used to verify the document's accuracy and
     * authenticity.
     */
    private String signature;

    /**
     * A JSON document that contains the metadata.
     *
     * @return A JSON document that contains the metadata.
     */
    public String getDocument() {
        return document;
    }
    
    /**
     * A JSON document that contains the metadata.
     *
     * @param document A JSON document that contains the metadata.
     */
    public void setDocument(String document) {
        this.document = document;
    }
    
    /**
     * A JSON document that contains the metadata.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param document A JSON document that contains the metadata.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceIdentity withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * A signature that can be used to verify the document's accuracy and
     * authenticity.
     *
     * @return A signature that can be used to verify the document's accuracy and
     *         authenticity.
     */
    public String getSignature() {
        return signature;
    }
    
    /**
     * A signature that can be used to verify the document's accuracy and
     * authenticity.
     *
     * @param signature A signature that can be used to verify the document's accuracy and
     *         authenticity.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    /**
     * A signature that can be used to verify the document's accuracy and
     * authenticity.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param signature A signature that can be used to verify the document's accuracy and
     *         authenticity.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceIdentity withSignature(String signature) {
        this.signature = signature;
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
        if (getDocument() != null) sb.append("Document: " + getDocument() + ",");
        if (getSignature() != null) sb.append("Signature: " + getSignature() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDocument() == null) ? 0 : getDocument().hashCode()); 
        hashCode = prime * hashCode + ((getSignature() == null) ? 0 : getSignature().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceIdentity == false) return false;
        InstanceIdentity other = (InstanceIdentity)obj;
        
        if (other.getDocument() == null ^ this.getDocument() == null) return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false) return false; 
        if (other.getSignature() == null ^ this.getSignature() == null) return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false) return false; 
        return true;
    }
    
}
    