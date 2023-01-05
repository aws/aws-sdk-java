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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Makes it possible to redact or flag specified personally identifiable information (PII) in your transcript. If you
 * use <code>ContentRedaction</code>, you must also include the sub-parameters: <code>PiiEntityTypes</code>,
 * <code>RedactionOutput</code>, and <code>RedactionType</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/ContentRedaction" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContentRedaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code> (personally identifiable information) is
     * the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII you want to redact.
     * </p>
     */
    private String redactionType;
    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an unredacted
     * transcript (as two separate files).
     * </p>
     */
    private String redactionOutput;
    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     */
    private java.util.List<String> piiEntityTypes;

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code> (personally identifiable information) is
     * the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII you want to redact.
     * </p>
     * 
     * @param redactionType
     *        Specify the category of information you want to redact; <code>PII</code> (personally identifiable
     *        information) is the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII
     *        you want to redact.
     * @see RedactionType
     */

    public void setRedactionType(String redactionType) {
        this.redactionType = redactionType;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code> (personally identifiable information) is
     * the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII you want to redact.
     * </p>
     * 
     * @return Specify the category of information you want to redact; <code>PII</code> (personally identifiable
     *         information) is the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of
     *         PII you want to redact.
     * @see RedactionType
     */

    public String getRedactionType() {
        return this.redactionType;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code> (personally identifiable information) is
     * the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII you want to redact.
     * </p>
     * 
     * @param redactionType
     *        Specify the category of information you want to redact; <code>PII</code> (personally identifiable
     *        information) is the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII
     *        you want to redact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(String redactionType) {
        setRedactionType(redactionType);
        return this;
    }

    /**
     * <p>
     * Specify the category of information you want to redact; <code>PII</code> (personally identifiable information) is
     * the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII you want to redact.
     * </p>
     * 
     * @param redactionType
     *        Specify the category of information you want to redact; <code>PII</code> (personally identifiable
     *        information) is the only valid value. You can use <code>PiiEntityTypes</code> to choose which types of PII
     *        you want to redact.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionType
     */

    public ContentRedaction withRedactionType(RedactionType redactionType) {
        this.redactionType = redactionType.toString();
        return this;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an unredacted
     * transcript (as two separate files).
     * </p>
     * 
     * @param redactionOutput
     *        Specify if you want only a redacted transcript, or if you want a redacted and an unredacted
     *        transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an
     *        unredacted transcript (as two separate files).
     * @see RedactionOutput
     */

    public void setRedactionOutput(String redactionOutput) {
        this.redactionOutput = redactionOutput;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an unredacted
     * transcript (as two separate files).
     * </p>
     * 
     * @return Specify if you want only a redacted transcript, or if you want a redacted and an unredacted
     *         transcript.</p>
     *         <p>
     *         When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     *         </p>
     *         <p>
     *         When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an
     *         unredacted transcript (as two separate files).
     * @see RedactionOutput
     */

    public String getRedactionOutput() {
        return this.redactionOutput;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an unredacted
     * transcript (as two separate files).
     * </p>
     * 
     * @param redactionOutput
     *        Specify if you want only a redacted transcript, or if you want a redacted and an unredacted
     *        transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an
     *        unredacted transcript (as two separate files).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(String redactionOutput) {
        setRedactionOutput(redactionOutput);
        return this;
    }

    /**
     * <p>
     * Specify if you want only a redacted transcript, or if you want a redacted and an unredacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     * </p>
     * <p>
     * When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an unredacted
     * transcript (as two separate files).
     * </p>
     * 
     * @param redactionOutput
     *        Specify if you want only a redacted transcript, or if you want a redacted and an unredacted
     *        transcript.</p>
     *        <p>
     *        When you choose <code>redacted</code> Amazon Transcribe creates only a redacted transcript.
     *        </p>
     *        <p>
     *        When you choose <code>redacted_and_unredacted</code> Amazon Transcribe creates a redacted and an
     *        unredacted transcript (as two separate files).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RedactionOutput
     */

    public ContentRedaction withRedactionOutput(RedactionOutput redactionOutput) {
        this.redactionOutput = redactionOutput.toString();
        return this;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     * 
     * @return Specify which types of personally identifiable information (PII) you want to redact in your transcript.
     *         You can include as many types as you'd like, or you can select <code>ALL</code>.
     * @see PiiEntityType
     */

    public java.util.List<String> getPiiEntityTypes() {
        return piiEntityTypes;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specify which types of personally identifiable information (PII) you want to redact in your transcript.
     *        You can include as many types as you'd like, or you can select <code>ALL</code>.
     * @see PiiEntityType
     */

    public void setPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        if (piiEntityTypes == null) {
            this.piiEntityTypes = null;
            return;
        }

        this.piiEntityTypes = new java.util.ArrayList<String>(piiEntityTypes);
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPiiEntityTypes(java.util.Collection)} or {@link #withPiiEntityTypes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specify which types of personally identifiable information (PII) you want to redact in your transcript.
     *        You can include as many types as you'd like, or you can select <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(String... piiEntityTypes) {
        if (this.piiEntityTypes == null) {
            setPiiEntityTypes(new java.util.ArrayList<String>(piiEntityTypes.length));
        }
        for (String ele : piiEntityTypes) {
            this.piiEntityTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specify which types of personally identifiable information (PII) you want to redact in your transcript.
     *        You can include as many types as you'd like, or you can select <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(java.util.Collection<String> piiEntityTypes) {
        setPiiEntityTypes(piiEntityTypes);
        return this;
    }

    /**
     * <p>
     * Specify which types of personally identifiable information (PII) you want to redact in your transcript. You can
     * include as many types as you'd like, or you can select <code>ALL</code>.
     * </p>
     * 
     * @param piiEntityTypes
     *        Specify which types of personally identifiable information (PII) you want to redact in your transcript.
     *        You can include as many types as you'd like, or you can select <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PiiEntityType
     */

    public ContentRedaction withPiiEntityTypes(PiiEntityType... piiEntityTypes) {
        java.util.ArrayList<String> piiEntityTypesCopy = new java.util.ArrayList<String>(piiEntityTypes.length);
        for (PiiEntityType value : piiEntityTypes) {
            piiEntityTypesCopy.add(value.toString());
        }
        if (getPiiEntityTypes() == null) {
            setPiiEntityTypes(piiEntityTypesCopy);
        } else {
            getPiiEntityTypes().addAll(piiEntityTypesCopy);
        }
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
        if (getRedactionType() != null)
            sb.append("RedactionType: ").append(getRedactionType()).append(",");
        if (getRedactionOutput() != null)
            sb.append("RedactionOutput: ").append(getRedactionOutput()).append(",");
        if (getPiiEntityTypes() != null)
            sb.append("PiiEntityTypes: ").append(getPiiEntityTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContentRedaction == false)
            return false;
        ContentRedaction other = (ContentRedaction) obj;
        if (other.getRedactionType() == null ^ this.getRedactionType() == null)
            return false;
        if (other.getRedactionType() != null && other.getRedactionType().equals(this.getRedactionType()) == false)
            return false;
        if (other.getRedactionOutput() == null ^ this.getRedactionOutput() == null)
            return false;
        if (other.getRedactionOutput() != null && other.getRedactionOutput().equals(this.getRedactionOutput()) == false)
            return false;
        if (other.getPiiEntityTypes() == null ^ this.getPiiEntityTypes() == null)
            return false;
        if (other.getPiiEntityTypes() != null && other.getPiiEntityTypes().equals(this.getPiiEntityTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRedactionType() == null) ? 0 : getRedactionType().hashCode());
        hashCode = prime * hashCode + ((getRedactionOutput() == null) ? 0 : getRedactionOutput().hashCode());
        hashCode = prime * hashCode + ((getPiiEntityTypes() == null) ? 0 : getPiiEntityTypes().hashCode());
        return hashCode;
    }

    @Override
    public ContentRedaction clone() {
        try {
            return (ContentRedaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.ContentRedactionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
