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
 * Transcript representation containing Id, Content and list of character intervals that are associated with analysis
 * data. For example, this object within an issue detected would describe both content that contains identified issue
 * and intervals where that content is taken from.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RealTimeContactAnalysisTranscriptItemWithContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RealTimeContactAnalysisTranscriptItemWithContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be redacted
     * </p>
     */
    private String content;
    /**
     * <p>
     * Transcript identifier. Matches the identifier from one of the TranscriptSegments.
     * </p>
     */
    private String id;

    private RealTimeContactAnalysisCharacterInterval characterOffsets;

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be redacted
     * </p>
     * 
     * @param content
     *        Part of the transcript content that contains identified issue. Can be redacted
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be redacted
     * </p>
     * 
     * @return Part of the transcript content that contains identified issue. Can be redacted
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * Part of the transcript content that contains identified issue. Can be redacted
     * </p>
     * 
     * @param content
     *        Part of the transcript content that contains identified issue. Can be redacted
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemWithContent withContent(String content) {
        setContent(content);
        return this;
    }

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

    public RealTimeContactAnalysisTranscriptItemWithContent withId(String id) {
        setId(id);
        return this;
    }

    /**
     * @param characterOffsets
     */

    public void setCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
        this.characterOffsets = characterOffsets;
    }

    /**
     * @return
     */

    public RealTimeContactAnalysisCharacterInterval getCharacterOffsets() {
        return this.characterOffsets;
    }

    /**
     * @param characterOffsets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RealTimeContactAnalysisTranscriptItemWithContent withCharacterOffsets(RealTimeContactAnalysisCharacterInterval characterOffsets) {
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
        if (getContent() != null)
            sb.append("Content: ").append(getContent()).append(",");
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

        if (obj instanceof RealTimeContactAnalysisTranscriptItemWithContent == false)
            return false;
        RealTimeContactAnalysisTranscriptItemWithContent other = (RealTimeContactAnalysisTranscriptItemWithContent) obj;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getCharacterOffsets() == null) ? 0 : getCharacterOffsets().hashCode());
        return hashCode;
    }

    @Override
    public RealTimeContactAnalysisTranscriptItemWithContent clone() {
        try {
            return (RealTimeContactAnalysisTranscriptItemWithContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RealTimeContactAnalysisTranscriptItemWithContentMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
