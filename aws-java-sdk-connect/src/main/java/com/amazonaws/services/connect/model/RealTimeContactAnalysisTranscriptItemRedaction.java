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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object describing redaction applied to the segment.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisTranscriptItemRedaction"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisTranscriptItemRedaction implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of character intervals each describing a part of the text that was redacted. For <code>OutputType.Raw</code>
     * , part of the original text that contains data that can be redacted. For <code> OutputType.Redacted</code>, part
     * of the string with redaction tag.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisCharacterInterval> characterOffsets;

    /**
     * <p>
     * List of character intervals each describing a part of the text that was redacted. For <code>OutputType.Raw</code>
     * , part of the original text that contains data that can be redacted. For <code> OutputType.Redacted</code>, part
     * of the string with redaction tag.
     * </p>
     * 
     * @return List of character intervals each describing a part of the text that was redacted. For
     *         <code>OutputType.Raw</code>, part of the original text that contains data that can be redacted. For
     *         <code> OutputType.Redacted</code>, part of the string with redaction tag.
     */

    public java.util.List<RealTimeContactAnalysisCharacterInterval> getCharacterOffsets() {
        return characterOffsets;
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was redacted. For <code>OutputType.Raw</code>
     * , part of the original text that contains data that can be redacted. For <code> OutputType.Redacted</code>, part
     * of the string with redaction tag.
     * </p>
     * 
     * @param characterOffsets
     *        List of character intervals each describing a part of the text that was redacted. For
     *        <code>OutputType.Raw</code>, part of the original text that contains data that can be redacted. For
     *        <code> OutputType.Redacted</code>, part of the string with redaction tag.
     */

    public void setCharacterOffsets(java.util.Collection<RealTimeContactAnalysisCharacterInterval> characterOffsets) {
        if (characterOffsets == null) {
            this.characterOffsets = null;
            return;
        }

        this.characterOffsets = new java.util.ArrayList<RealTimeContactAnalysisCharacterInterval>(characterOffsets);
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was redacted. For <code>OutputType.Raw</code>
     * , part of the original text that contains data that can be redacted. For <code> OutputType.Redacted</code>, part
     * of the string with redaction tag.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCharacterOffsets(java.util.Collection)} or {@link #withCharacterOffsets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param characterOffsets
     *        List of character intervals each describing a part of the text that was redacted. For
     *        <code>OutputType.Raw</code>, part of the original text that contains data that can be redacted. For
     *        <code> OutputType.Redacted</code>, part of the string with redaction tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemRedaction withCharacterOffsets(RealTimeContactAnalysisCharacterInterval... characterOffsets) {
        if (this.characterOffsets == null) {
            setCharacterOffsets(new java.util.ArrayList<RealTimeContactAnalysisCharacterInterval>(characterOffsets.length));
        }
        for (RealTimeContactAnalysisCharacterInterval ele : characterOffsets) {
            this.characterOffsets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of character intervals each describing a part of the text that was redacted. For <code>OutputType.Raw</code>
     * , part of the original text that contains data that can be redacted. For <code> OutputType.Redacted</code>, part
     * of the string with redaction tag.
     * </p>
     * 
     * @param characterOffsets
     *        List of character intervals each describing a part of the text that was redacted. For
     *        <code>OutputType.Raw</code>, part of the original text that contains data that can be redacted. For
     *        <code> OutputType.Redacted</code>, part of the string with redaction tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemRedaction withCharacterOffsets(java.util.Collection<RealTimeContactAnalysisCharacterInterval> characterOffsets) {
        setCharacterOffsets(characterOffsets);
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
        if (getCharacterOffsets() != null)
            sb.append("CharacterOffsets: ").append(getCharacterOffsets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisTranscriptItemRedaction == false)
            return false;
        RealTimeContactAnalysisTranscriptItemRedaction other = (RealTimeContactAnalysisTranscriptItemRedaction) obj;
        if (other.getCharacterOffsets() == null ^ this.getCharacterOffsets() == null)
            return false;
        if (other.getCharacterOffsets() != null && other.getCharacterOffsets().equals(this.getCharacterOffsets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCharacterOffsets() == null) ? 0 : getCharacterOffsets().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisTranscriptItemRedaction clone() {
        try {
            return (RealTimeContactAnalysisTranscriptItemRedaction) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisTranscriptItemRedactionMarshaller.getInstance()
                .marshall(this, protocolMarshaller);
    }
}
