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
 * Transcript representation containing Id and list of character intervals that are associated with analysis data. For
 * example, this object within a <code>RealTimeContactAnalysisPointOfInterest</code> in
 * <code>Category.MatchedDetails</code> would have character interval describing part of the text that matched category.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisTranscriptItemWithCharacterOffsets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisTranscriptItemWithCharacterOffsets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * </p>
     */
    private String id;
    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     */
    private RealTimeContactAnalysisCharacterInterval characterOffsets;

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * </p>
     * 
     * @param id
     *        Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * </p>
     * 
     * @return Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * </p>
     * 
     * @param id
     *        Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemWithCharacterOffsets withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     * 
     * @param characterOffsets
     *        List of character intervals within transcript content/text.
     */

    public void setCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
        this.characterOffsets = characterOffsets;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     * 
     * @return List of character intervals within transcript content/text.
     */

    public RealTimeContactAnalysisCharacterInterval getCharacterOffsets() {
        return this.characterOffsets;
    }

    /**
     * <p>
     * List of character intervals within transcript content/text.
     * </p>
     * 
     * @param characterOffsets
     *        List of character intervals within transcript content/text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemWithCharacterOffsets withCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
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

        if (obj instanceof RealTimeContactAnalysisTranscriptItemWithCharacterOffsets == false)
            return false;
        RealTimeContactAnalysisTranscriptItemWithCharacterOffsets other = (RealTimeContactAnalysisTranscriptItemWithCharacterOffsets) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCharacterOffsets() == null) ? 0 : getCharacterOffsets().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisTranscriptItemWithCharacterOffsets clone() {
        try {
            return (RealTimeContactAnalysisTranscriptItemWithCharacterOffsets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisTranscriptItemWithCharacterOffsetsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
