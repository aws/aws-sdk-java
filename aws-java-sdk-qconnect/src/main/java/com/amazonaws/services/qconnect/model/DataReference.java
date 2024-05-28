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
package com.amazonaws.services.qconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Reference data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qconnect-2020-10-19/DataReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataReference implements Serializable, Cloneable, StructuredPojo {

    private ContentReference contentReference;
    /**
     * <p>
     * Reference information about the generative content.
     * </p>
     */
    private GenerativeReference generativeReference;

    /**
     * @param contentReference
     */

    public void setContentReference(ContentReference contentReference) {
        this.contentReference = contentReference;
    }

    /**
     * @return
     */

    public ContentReference getContentReference() {
        return this.contentReference;
    }

    /**
     * @param contentReference
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReference withContentReference(ContentReference contentReference) {
        setContentReference(contentReference);
        return this;
    }

    /**
     * <p>
     * Reference information about the generative content.
     * </p>
     * 
     * @param generativeReference
     *        Reference information about the generative content.
     */

    public void setGenerativeReference(GenerativeReference generativeReference) {
        this.generativeReference = generativeReference;
    }

    /**
     * <p>
     * Reference information about the generative content.
     * </p>
     * 
     * @return Reference information about the generative content.
     */

    public GenerativeReference getGenerativeReference() {
        return this.generativeReference;
    }

    /**
     * <p>
     * Reference information about the generative content.
     * </p>
     * 
     * @param generativeReference
     *        Reference information about the generative content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataReference withGenerativeReference(GenerativeReference generativeReference) {
        setGenerativeReference(generativeReference);
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
        if (getContentReference() != null)
            sb.append("ContentReference: ").append(getContentReference()).append(",");
        if (getGenerativeReference() != null)
            sb.append("GenerativeReference: ").append(getGenerativeReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataReference == false)
            return false;
        DataReference other = (DataReference) obj;
        if (other.getContentReference() == null ^ this.getContentReference() == null)
            return false;
        if (other.getContentReference() != null && other.getContentReference().equals(this.getContentReference()) == false)
            return false;
        if (other.getGenerativeReference() == null ^ this.getGenerativeReference() == null)
            return false;
        if (other.getGenerativeReference() != null && other.getGenerativeReference().equals(this.getGenerativeReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContentReference() == null) ? 0 : getContentReference().hashCode());
        hashCode = prime * hashCode + ((getGenerativeReference() == null) ? 0 : getGenerativeReference().hashCode());
        return hashCode;
    }

    @Override
    public DataReference clone() {
        try {
            return (DataReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qconnect.model.transform.DataReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
