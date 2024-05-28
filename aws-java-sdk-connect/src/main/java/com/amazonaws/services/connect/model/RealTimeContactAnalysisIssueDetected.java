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
 * Potential issues that are detected based on an artificial intelligence analysis of each turn in the conversation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisIssueDetected"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisIssueDetected implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given issue.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisTranscriptItemWithContent> transcriptItems;

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given issue.
     * </p>
     * 
     * @return List of the transcript items (segments) that are associated with a given issue.
     */

    public java.util.List<RealTimeContactAnalysisTranscriptItemWithContent> getTranscriptItems() {
        return transcriptItems;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given issue.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given issue.
     */

    public void setTranscriptItems(java.util.Collection<RealTimeContactAnalysisTranscriptItemWithContent> transcriptItems) {
        if (transcriptItems == null) {
            this.transcriptItems = null;
            return;
        }

        this.transcriptItems = new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithContent>(transcriptItems);
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given issue.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTranscriptItems(java.util.Collection)} or {@link #withTranscriptItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisIssueDetected withTranscriptItems(RealTimeContactAnalysisTranscriptItemWithContent... transcriptItems) {
        if (this.transcriptItems == null) {
            setTranscriptItems(new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithContent>(transcriptItems.length));
        }
        for (RealTimeContactAnalysisTranscriptItemWithContent ele : transcriptItems) {
            this.transcriptItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given issue.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisIssueDetected withTranscriptItems(java.util.Collection<RealTimeContactAnalysisTranscriptItemWithContent> transcriptItems) {
        setTranscriptItems(transcriptItems);
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
        if (getTranscriptItems() != null)
            sb.append("TranscriptItems: ").append(getTranscriptItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealTimeContactAnalysisIssueDetected == false)
            return false;
        RealTimeContactAnalysisIssueDetected other = (RealTimeContactAnalysisIssueDetected) obj;
        if (other.getTranscriptItems() == null ^ this.getTranscriptItems() == null)
            return false;
        if (other.getTranscriptItems() != null && other.getTranscriptItems().equals(this.getTranscriptItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTranscriptItems() == null) ? 0 : getTranscriptItems().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisIssueDetected clone() {
        try {
            return (RealTimeContactAnalysisIssueDetected) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisIssueDetectedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
