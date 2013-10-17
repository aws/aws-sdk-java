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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;


/**
 * <p>
 * <p>
 * Identity information for the Amazon EC2 instance that is hosting the task runner. You can get this value by calling a metadata URI from the EC2
 * instance. For more information, go to <a href="http://docs.amazonwebservices.com/AWSEC2/latest/UserGuide/AESDG-chapter-instancedata.html"> Instance
 * Metadata </a> in the <i>Amazon Elastic Compute Cloud User Guide.</i> Passing in this value proves that your task runner is running on an EC2
 * instance, and ensures the proper AWS Data Pipeline service charges are applied to your pipeline.
 * </p>
 * 
 * </p>
 */
public class InstanceIdentity implements Serializable {

    /**
     * A description of an Amazon EC2 instance that is generated when the
     * instance is launched and exposed to the instance via the instance
     * metadata service in the form of a JSON representation of an object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String document;

    /**
     * A signature which can be used to verify the accuracy and authenticity
     * of the information provided in the instance identity document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String signature;

    /**
     * A description of an Amazon EC2 instance that is generated when the
     * instance is launched and exposed to the instance via the instance
     * metadata service in the form of a JSON representation of an object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A description of an Amazon EC2 instance that is generated when the
     *         instance is launched and exposed to the instance via the instance
     *         metadata service in the form of a JSON representation of an object.
     */
    public String getDocument() {
        return document;
    }
    
    /**
     * A description of an Amazon EC2 instance that is generated when the
     * instance is launched and exposed to the instance via the instance
     * metadata service in the form of a JSON representation of an object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param document A description of an Amazon EC2 instance that is generated when the
     *         instance is launched and exposed to the instance via the instance
     *         metadata service in the form of a JSON representation of an object.
     */
    public void setDocument(String document) {
        this.document = document;
    }
    
    /**
     * A description of an Amazon EC2 instance that is generated when the
     * instance is launched and exposed to the instance via the instance
     * metadata service in the form of a JSON representation of an object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param document A description of an Amazon EC2 instance that is generated when the
     *         instance is launched and exposed to the instance via the instance
     *         metadata service in the form of a JSON representation of an object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceIdentity withDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * A signature which can be used to verify the accuracy and authenticity
     * of the information provided in the instance identity document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A signature which can be used to verify the accuracy and authenticity
     *         of the information provided in the instance identity document.
     */
    public String getSignature() {
        return signature;
    }
    
    /**
     * A signature which can be used to verify the accuracy and authenticity
     * of the information provided in the instance identity document.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param signature A signature which can be used to verify the accuracy and authenticity
     *         of the information provided in the instance identity document.
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    /**
     * A signature which can be used to verify the accuracy and authenticity
     * of the information provided in the instance identity document.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param signature A signature which can be used to verify the accuracy and authenticity
     *         of the information provided in the instance identity document.
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
    