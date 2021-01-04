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
 * Potential issues that are detected based on an artificial intelligence analysis of each turn in the conversation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/IssueDetected" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IssueDetected implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The offset for when the issue was detected in the segment.
     * </p>
     */
    private CharacterOffsets characterOffsets;

    /**
     * <p>
     * The offset for when the issue was detected in the segment.
     * </p>
     * 
     * @param characterOffsets
     *        The offset for when the issue was detected in the segment.
     */

    public void setCharacterOffsets(CharacterOffsets characterOffsets) {
        this.characterOffsets = characterOffsets;
    }

    /**
     * <p>
     * The offset for when the issue was detected in the segment.
     * </p>
     * 
     * @return The offset for when the issue was detected in the segment.
     */

    public CharacterOffsets getCharacterOffsets() {
        return this.characterOffsets;
    }

    /**
     * <p>
     * The offset for when the issue was detected in the segment.
     * </p>
     * 
     * @param characterOffsets
     *        The offset for when the issue was detected in the segment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IssueDetected withCharacterOffsets(CharacterOffsets characterOffsets) {
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

        if (obj instanceof IssueDetected == false)
            return false;
        IssueDetected other = (IssueDetected) obj;
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
    public IssueDetected clone() {
        try {
            return (IssueDetected) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.IssueDetectedMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
