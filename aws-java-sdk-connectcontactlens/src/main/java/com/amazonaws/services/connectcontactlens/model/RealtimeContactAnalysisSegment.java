/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcontactlens.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An analyzed segment for a real-time analysis session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/RealtimeContactAnalysisSegment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeContactAnalysisSegment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The analyzed transcript.
     * </p>
     */
    private Transcript transcript;
    /**
     * <p>
     * The matched category rules.
     * </p>
     */
    private Categories categories;

    /**
     * <p>
     * The analyzed transcript.
     * </p>
     * 
     * @param transcript
     *        The analyzed transcript.
     */

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    /**
     * <p>
     * The analyzed transcript.
     * </p>
     * 
     * @return The analyzed transcript.
     */

    public Transcript getTranscript() {
        return this.transcript;
    }

    /**
     * <p>
     * The analyzed transcript.
     * </p>
     * 
     * @param transcript
     *        The analyzed transcript.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withTranscript(Transcript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     * 
     * @param categories
     *        The matched category rules.
     */

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     * 
     * @return The matched category rules.
     */

    public Categories getCategories() {
        return this.categories;
    }

    /**
     * <p>
     * The matched category rules.
     * </p>
     * 
     * @param categories
     *        The matched category rules.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withCategories(Categories categories) {
        setCategories(categories);
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
        if (getTranscript() != null)
            sb.append("Transcript: ").append(getTranscript()).append(",");
        if (getCategories() != null)
            sb.append("Categories: ").append(getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealtimeContactAnalysisSegment == false)
            return false;
        RealtimeContactAnalysisSegment other = (RealtimeContactAnalysisSegment) obj;
        if (other.getTranscript() == null ^ this.getTranscript() == null)
            return false;
        if (other.getTranscript() != null && other.getTranscript().equals(this.getTranscript()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public RealtimeContactAnalysisSegment clone() {
        try {
            return (RealtimeContactAnalysisSegment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.RealtimeContactAnalysisSegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
