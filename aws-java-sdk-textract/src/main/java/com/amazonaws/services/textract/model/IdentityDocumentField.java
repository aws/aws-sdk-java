/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure containing both the normalized type of the extracted information and the text associated with it. These are
 * extracted as Type and Value respectively.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/IdentityDocumentField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityDocumentField implements Serializable, Cloneable, StructuredPojo {

    private AnalyzeIDDetections type;

    private AnalyzeIDDetections valueDetection;

    /**
     * @param type
     */

    public void setType(AnalyzeIDDetections type) {
        this.type = type;
    }

    /**
     * @return
     */

    public AnalyzeIDDetections getType() {
        return this.type;
    }

    /**
     * @param type
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocumentField withType(AnalyzeIDDetections type) {
        setType(type);
        return this;
    }

    /**
     * @param valueDetection
     */

    public void setValueDetection(AnalyzeIDDetections valueDetection) {
        this.valueDetection = valueDetection;
    }

    /**
     * @return
     */

    public AnalyzeIDDetections getValueDetection() {
        return this.valueDetection;
    }

    /**
     * @param valueDetection
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityDocumentField withValueDetection(AnalyzeIDDetections valueDetection) {
        setValueDetection(valueDetection);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getValueDetection() != null)
            sb.append("ValueDetection: ").append(getValueDetection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityDocumentField == false)
            return false;
        IdentityDocumentField other = (IdentityDocumentField) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValueDetection() == null ^ this.getValueDetection() == null)
            return false;
        if (other.getValueDetection() != null && other.getValueDetection().equals(this.getValueDetection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValueDetection() == null) ? 0 : getValueDetection().hashCode());
        return hashCode;
    }

    @Override
    public IdentityDocumentField clone() {
        try {
            return (IdentityDocumentField) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.IdentityDocumentFieldMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
