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
 * The section of the contact transcript segment that category rule was detected.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisPointOfInterest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisPointOfInterest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given point of interest.
     * </p>
     */
    private java.util.List<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems;

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given point of interest.
     * </p>
     * 
     * @return List of the transcript items (segments) that are associated with a given point of interest.
     */

    public java.util.List<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> getTranscriptItems() {
        return transcriptItems;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given point of interest.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given point of interest.
     */

    public void setTranscriptItems(java.util.Collection<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems) {
        if (transcriptItems == null) {
            this.transcriptItems = null;
            return;
        }

        this.transcriptItems = new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets>(transcriptItems);
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given point of interest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTranscriptItems(java.util.Collection)} or {@link #withTranscriptItems(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given point of interest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisPointOfInterest withTranscriptItems(RealTimeContactAnalysisTranscriptItemWithCharacterOffsets... transcriptItems) {
        if (this.transcriptItems == null) {
            setTranscriptItems(new java.util.ArrayList<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets>(transcriptItems.length));
        }
        for (RealTimeContactAnalysisTranscriptItemWithCharacterOffsets ele : transcriptItems) {
            this.transcriptItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the transcript items (segments) that are associated with a given point of interest.
     * </p>
     * 
     * @param transcriptItems
     *        List of the transcript items (segments) that are associated with a given point of interest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisPointOfInterest withTranscriptItems(
            java.util.Collection<RealTimeContactAnalysisTranscriptItemWithCharacterOffsets> transcriptItems) {
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

        if (obj instanceof RealTimeContactAnalysisPointOfInterest == false)
            return false;
        RealTimeContactAnalysisPointOfInterest other = (RealTimeContactAnalysisPointOfInterest) obj;
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
    public RealTimeContactAnalysisPointOfInterest clone() {
        try {
            return (RealTimeContactAnalysisPointOfInterest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisPointOfInterestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
