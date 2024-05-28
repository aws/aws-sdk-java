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
package com.amazonaws.services.transcribe.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains <code>GenerateAbstractiveSummary</code>, which is a required parameter if you want to enable Generative call
 * summarization in your Call Analytics request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transcribe-2017-10-26/Summarization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Summarization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript including important components discussed in
     * the conversation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative call
     * summarization</a>.
     * </p>
     */
    private Boolean generateAbstractiveSummary;

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript including important components discussed in
     * the conversation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative call
     * summarization</a>.
     * </p>
     * 
     * @param generateAbstractiveSummary
     *        Enables Generative call summarization in your Call Analytics request</p>
     *        <p>
     *        Generative call summarization provides a summary of the transcript including important components
     *        discussed in the conversation.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative
     *        call summarization</a>.
     */

    public void setGenerateAbstractiveSummary(Boolean generateAbstractiveSummary) {
        this.generateAbstractiveSummary = generateAbstractiveSummary;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript including important components discussed in
     * the conversation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative call
     * summarization</a>.
     * </p>
     * 
     * @return Enables Generative call summarization in your Call Analytics request</p>
     *         <p>
     *         Generative call summarization provides a summary of the transcript including important components
     *         discussed in the conversation.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative
     *         call summarization</a>.
     */

    public Boolean getGenerateAbstractiveSummary() {
        return this.generateAbstractiveSummary;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript including important components discussed in
     * the conversation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative call
     * summarization</a>.
     * </p>
     * 
     * @param generateAbstractiveSummary
     *        Enables Generative call summarization in your Call Analytics request</p>
     *        <p>
     *        Generative call summarization provides a summary of the transcript including important components
     *        discussed in the conversation.
     *        </p>
     *        <p>
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative
     *        call summarization</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Summarization withGenerateAbstractiveSummary(Boolean generateAbstractiveSummary) {
        setGenerateAbstractiveSummary(generateAbstractiveSummary);
        return this;
    }

    /**
     * <p>
     * Enables Generative call summarization in your Call Analytics request
     * </p>
     * <p>
     * Generative call summarization provides a summary of the transcript including important components discussed in
     * the conversation.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative call
     * summarization</a>.
     * </p>
     * 
     * @return Enables Generative call summarization in your Call Analytics request</p>
     *         <p>
     *         Generative call summarization provides a summary of the transcript including important components
     *         discussed in the conversation.
     *         </p>
     *         <p>
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/transcribe/latest/dg/tca-enable-summarization.html">Enabling generative
     *         call summarization</a>.
     */

    public Boolean isGenerateAbstractiveSummary() {
        return this.generateAbstractiveSummary;
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
        if (getGenerateAbstractiveSummary() != null)
            sb.append("GenerateAbstractiveSummary: ").append(getGenerateAbstractiveSummary());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Summarization == false)
            return false;
        Summarization other = (Summarization) obj;
        if (other.getGenerateAbstractiveSummary() == null ^ this.getGenerateAbstractiveSummary() == null)
            return false;
        if (other.getGenerateAbstractiveSummary() != null && other.getGenerateAbstractiveSummary().equals(this.getGenerateAbstractiveSummary()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerateAbstractiveSummary() == null) ? 0 : getGenerateAbstractiveSummary().hashCode());
        return hashCode;
    }

    @Override
    public Summarization clone() {
        try {
            return (Summarization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.transcribe.model.transform.SummarizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
