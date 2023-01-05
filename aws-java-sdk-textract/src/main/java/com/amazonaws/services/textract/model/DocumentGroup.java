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
 * Summary information about documents grouped by the same document type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/DocumentGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DocumentGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See LINK for a list of all types returned by Textract.
     * </p>
     */
    private String type;
    /**
     * <p>
     * An array that contains information about the pages of a document, defined by logical boundary.
     * </p>
     */
    private java.util.List<SplitDocument> splitDocuments;
    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     */
    private java.util.List<DetectedSignature> detectedSignatures;
    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     */
    private java.util.List<UndetectedSignature> undetectedSignatures;

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See LINK for a list of all types returned by Textract.
     * </p>
     * 
     * @param type
     *        The type of document that Amazon Textract has detected. See LINK for a list of all types returned by
     *        Textract.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See LINK for a list of all types returned by Textract.
     * </p>
     * 
     * @return The type of document that Amazon Textract has detected. See LINK for a list of all types returned by
     *         Textract.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of document that Amazon Textract has detected. See LINK for a list of all types returned by Textract.
     * </p>
     * 
     * @param type
     *        The type of document that Amazon Textract has detected. See LINK for a list of all types returned by
     *        Textract.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined by logical boundary.
     * </p>
     * 
     * @return An array that contains information about the pages of a document, defined by logical boundary.
     */

    public java.util.List<SplitDocument> getSplitDocuments() {
        return splitDocuments;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined by logical boundary.
     * </p>
     * 
     * @param splitDocuments
     *        An array that contains information about the pages of a document, defined by logical boundary.
     */

    public void setSplitDocuments(java.util.Collection<SplitDocument> splitDocuments) {
        if (splitDocuments == null) {
            this.splitDocuments = null;
            return;
        }

        this.splitDocuments = new java.util.ArrayList<SplitDocument>(splitDocuments);
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined by logical boundary.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSplitDocuments(java.util.Collection)} or {@link #withSplitDocuments(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param splitDocuments
     *        An array that contains information about the pages of a document, defined by logical boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withSplitDocuments(SplitDocument... splitDocuments) {
        if (this.splitDocuments == null) {
            setSplitDocuments(new java.util.ArrayList<SplitDocument>(splitDocuments.length));
        }
        for (SplitDocument ele : splitDocuments) {
            this.splitDocuments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains information about the pages of a document, defined by logical boundary.
     * </p>
     * 
     * @param splitDocuments
     *        An array that contains information about the pages of a document, defined by logical boundary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withSplitDocuments(java.util.Collection<SplitDocument> splitDocuments) {
        setSplitDocuments(splitDocuments);
        return this;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * 
     * @return A list of the detected signatures found in a document group.
     */

    public java.util.List<DetectedSignature> getDetectedSignatures() {
        return detectedSignatures;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * 
     * @param detectedSignatures
     *        A list of the detected signatures found in a document group.
     */

    public void setDetectedSignatures(java.util.Collection<DetectedSignature> detectedSignatures) {
        if (detectedSignatures == null) {
            this.detectedSignatures = null;
            return;
        }

        this.detectedSignatures = new java.util.ArrayList<DetectedSignature>(detectedSignatures);
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDetectedSignatures(java.util.Collection)} or {@link #withDetectedSignatures(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param detectedSignatures
     *        A list of the detected signatures found in a document group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withDetectedSignatures(DetectedSignature... detectedSignatures) {
        if (this.detectedSignatures == null) {
            setDetectedSignatures(new java.util.ArrayList<DetectedSignature>(detectedSignatures.length));
        }
        for (DetectedSignature ele : detectedSignatures) {
            this.detectedSignatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the detected signatures found in a document group.
     * </p>
     * 
     * @param detectedSignatures
     *        A list of the detected signatures found in a document group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withDetectedSignatures(java.util.Collection<DetectedSignature> detectedSignatures) {
        setDetectedSignatures(detectedSignatures);
        return this;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * 
     * @return A list of any expected signatures not found in a document group.
     */

    public java.util.List<UndetectedSignature> getUndetectedSignatures() {
        return undetectedSignatures;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * 
     * @param undetectedSignatures
     *        A list of any expected signatures not found in a document group.
     */

    public void setUndetectedSignatures(java.util.Collection<UndetectedSignature> undetectedSignatures) {
        if (undetectedSignatures == null) {
            this.undetectedSignatures = null;
            return;
        }

        this.undetectedSignatures = new java.util.ArrayList<UndetectedSignature>(undetectedSignatures);
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUndetectedSignatures(java.util.Collection)} or {@link #withUndetectedSignatures(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param undetectedSignatures
     *        A list of any expected signatures not found in a document group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withUndetectedSignatures(UndetectedSignature... undetectedSignatures) {
        if (this.undetectedSignatures == null) {
            setUndetectedSignatures(new java.util.ArrayList<UndetectedSignature>(undetectedSignatures.length));
        }
        for (UndetectedSignature ele : undetectedSignatures) {
            this.undetectedSignatures.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of any expected signatures not found in a document group.
     * </p>
     * 
     * @param undetectedSignatures
     *        A list of any expected signatures not found in a document group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DocumentGroup withUndetectedSignatures(java.util.Collection<UndetectedSignature> undetectedSignatures) {
        setUndetectedSignatures(undetectedSignatures);
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
        if (getSplitDocuments() != null)
            sb.append("SplitDocuments: ").append(getSplitDocuments()).append(",");
        if (getDetectedSignatures() != null)
            sb.append("DetectedSignatures: ").append(getDetectedSignatures()).append(",");
        if (getUndetectedSignatures() != null)
            sb.append("UndetectedSignatures: ").append(getUndetectedSignatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DocumentGroup == false)
            return false;
        DocumentGroup other = (DocumentGroup) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSplitDocuments() == null ^ this.getSplitDocuments() == null)
            return false;
        if (other.getSplitDocuments() != null && other.getSplitDocuments().equals(this.getSplitDocuments()) == false)
            return false;
        if (other.getDetectedSignatures() == null ^ this.getDetectedSignatures() == null)
            return false;
        if (other.getDetectedSignatures() != null && other.getDetectedSignatures().equals(this.getDetectedSignatures()) == false)
            return false;
        if (other.getUndetectedSignatures() == null ^ this.getUndetectedSignatures() == null)
            return false;
        if (other.getUndetectedSignatures() != null && other.getUndetectedSignatures().equals(this.getUndetectedSignatures()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSplitDocuments() == null) ? 0 : getSplitDocuments().hashCode());
        hashCode = prime * hashCode + ((getDetectedSignatures() == null) ? 0 : getDetectedSignatures().hashCode());
        hashCode = prime * hashCode + ((getUndetectedSignatures() == null) ? 0 : getUndetectedSignatures().hashCode());
        return hashCode;
    }

    @Override
    public DocumentGroup clone() {
        try {
            return (DocumentGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.DocumentGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
