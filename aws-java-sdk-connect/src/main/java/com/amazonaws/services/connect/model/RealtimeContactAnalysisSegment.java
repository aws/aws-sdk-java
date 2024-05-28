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
 * An analyzed segment for a real-time analysis session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealtimeContactAnalysisSegment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealtimeContactAnalysisSegment implements Serializable, Cloneable, StructuredPojo {

    private RealTimeContactAnalysisSegmentTranscript transcript;

    private RealTimeContactAnalysisSegmentCategories categories;

    private RealTimeContactAnalysisSegmentIssues issues;

    private RealTimeContactAnalysisSegmentEvent event;
    /**
     * <p>
     * The analyzed attachments.
     * </p>
     */
    private RealTimeContactAnalysisSegmentAttachments attachments;

    /**
     * @param transcript
     */

    public void setTranscript(RealTimeContactAnalysisSegmentTranscript transcript) {
        this.transcript = transcript;
    }

    /**
     * @return
     */

    public RealTimeContactAnalysisSegmentTranscript getTranscript() {
        return this.transcript;
    }

    /**
     * @param transcript
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withTranscript(RealTimeContactAnalysisSegmentTranscript transcript) {
        setTranscript(transcript);
        return this;
    }

    /**
     * @param categories
     */

    public void setCategories(RealTimeContactAnalysisSegmentCategories categories) {
        this.categories = categories;
    }

    /**
     * @return
     */

    public RealTimeContactAnalysisSegmentCategories getCategories() {
        return this.categories;
    }

    /**
     * @param categories
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withCategories(RealTimeContactAnalysisSegmentCategories categories) {
        setCategories(categories);
        return this;
    }

    /**
     * @param issues
     */

    public void setIssues(RealTimeContactAnalysisSegmentIssues issues) {
        this.issues = issues;
    }

    /**
     * @return
     */

    public RealTimeContactAnalysisSegmentIssues getIssues() {
        return this.issues;
    }

    /**
     * @param issues
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withIssues(RealTimeContactAnalysisSegmentIssues issues) {
        setIssues(issues);
        return this;
    }

    /**
     * @param event
     */

    public void setEvent(RealTimeContactAnalysisSegmentEvent event) {
        this.event = event;
    }

    /**
     * @return
     */

    public RealTimeContactAnalysisSegmentEvent getEvent() {
        return this.event;
    }

    /**
     * @param event
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withEvent(RealTimeContactAnalysisSegmentEvent event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     * 
     * @param attachments
     *        The analyzed attachments.
     */

    public void setAttachments(RealTimeContactAnalysisSegmentAttachments attachments) {
        this.attachments = attachments;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     * 
     * @return The analyzed attachments.
     */

    public RealTimeContactAnalysisSegmentAttachments getAttachments() {
        return this.attachments;
    }

    /**
     * <p>
     * The analyzed attachments.
     * </p>
     * 
     * @param attachments
     *        The analyzed attachments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealtimeContactAnalysisSegment withAttachments(RealTimeContactAnalysisSegmentAttachments attachments) {
        setAttachments(attachments);
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
            sb.append("Categories: ").append(getCategories()).append(",");
        if (getIssues() != null)
            sb.append("Issues: ").append(getIssues()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
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
        if (other.getIssues() == null ^ this.getIssues() == null)
            return false;
        if (other.getIssues() != null && other.getIssues().equals(this.getIssues()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscript() == null) ? 0 : getTranscript().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        hashCode = prime * hashCode + ((getIssues() == null) ? 0 : getIssues().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
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
        com.amazonaws.services.connect.model.transform.RealtimeContactAnalysisSegmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
