/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a description of an Amazon EC2 instance from the Amazon EC2 metadata service. For more information, see <a
 * href="http://docs.aws.amazon.com/sdkfornet/latest/apidocs/Index.html">Instance Metadata and User Data</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/InstanceIdentity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceIdentity implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A JSON document that contains the metadata.
     * </p>
     */
    private String document;
    /**
     * <p>
     * A signature that can be used to verify the document's accuracy and authenticity.
     * </p>
     */
    private String signature;

    /**
     * <p>
     * A JSON document that contains the metadata.
     * </p>
     * 
     * @param document
     *        A JSON document that contains the metadata.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * A JSON document that contains the metadata.
     * </p>
     * 
     * @return A JSON document that contains the metadata.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * A JSON document that contains the metadata.
     * </p>
     * 
     * @param document
     *        A JSON document that contains the metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIdentity withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * A signature that can be used to verify the document's accuracy and authenticity.
     * </p>
     * 
     * @param signature
     *        A signature that can be used to verify the document's accuracy and authenticity.
     */

    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * <p>
     * A signature that can be used to verify the document's accuracy and authenticity.
     * </p>
     * 
     * @return A signature that can be used to verify the document's accuracy and authenticity.
     */

    public String getSignature() {
        return this.signature;
    }

    /**
     * <p>
     * A signature that can be used to verify the document's accuracy and authenticity.
     * </p>
     * 
     * @param signature
     *        A signature that can be used to verify the document's accuracy and authenticity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceIdentity withSignature(String signature) {
        setSignature(signature);
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
        if (getDocument() != null)
            sb.append("Document: ").append(getDocument()).append(",");
        if (getSignature() != null)
            sb.append("Signature: ").append(getSignature());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceIdentity == false)
            return false;
        InstanceIdentity other = (InstanceIdentity) obj;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getSignature() == null ^ this.getSignature() == null)
            return false;
        if (other.getSignature() != null && other.getSignature().equals(this.getSignature()) == false)
            return false;
        return true;
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
    public InstanceIdentity clone() {
        try {
            return (InstanceIdentity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opsworks.model.transform.InstanceIdentityMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
