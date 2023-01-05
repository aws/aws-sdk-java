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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The object representing the filter that Amazon Lex will use to select the appropriate transcript.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/TranscriptFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TranscriptFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     * transcript format is the Amazon Lex format.
     * </p>
     */
    private LexTranscriptFilter lexTranscriptFilter;

    /**
     * <p>
     * The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     * transcript format is the Amazon Lex format.
     * </p>
     * 
     * @param lexTranscriptFilter
     *        The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     *        transcript format is the Amazon Lex format.
     */

    public void setLexTranscriptFilter(LexTranscriptFilter lexTranscriptFilter) {
        this.lexTranscriptFilter = lexTranscriptFilter;
    }

    /**
     * <p>
     * The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     * transcript format is the Amazon Lex format.
     * </p>
     * 
     * @return The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     *         transcript format is the Amazon Lex format.
     */

    public LexTranscriptFilter getLexTranscriptFilter() {
        return this.lexTranscriptFilter;
    }

    /**
     * <p>
     * The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     * transcript format is the Amazon Lex format.
     * </p>
     * 
     * @param lexTranscriptFilter
     *        The object representing the filter that Amazon Lex will use to select the appropriate transcript when the
     *        transcript format is the Amazon Lex format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TranscriptFilter withLexTranscriptFilter(LexTranscriptFilter lexTranscriptFilter) {
        setLexTranscriptFilter(lexTranscriptFilter);
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
        if (getLexTranscriptFilter() != null)
            sb.append("LexTranscriptFilter: ").append(getLexTranscriptFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TranscriptFilter == false)
            return false;
        TranscriptFilter other = (TranscriptFilter) obj;
        if (other.getLexTranscriptFilter() == null ^ this.getLexTranscriptFilter() == null)
            return false;
        if (other.getLexTranscriptFilter() != null && other.getLexTranscriptFilter().equals(this.getLexTranscriptFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLexTranscriptFilter() == null) ? 0 : getLexTranscriptFilter().hashCode());
        return hashCode;
    }

    @Override
    public TranscriptFilter clone() {
        try {
            return (TranscriptFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.TranscriptFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
