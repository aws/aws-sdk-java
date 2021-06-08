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
 * For characters that were detected as issues, where they occur in the transcript.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-contact-lens-2020-08-21/CharacterOffsets"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CharacterOffsets implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The beginning of the issue.
     * </p>
     */
    private Integer beginOffsetChar;
    /**
     * <p>
     * The end of the issue.
     * </p>
     */
    private Integer endOffsetChar;

    /**
     * <p>
     * The beginning of the issue.
     * </p>
     * 
     * @param beginOffsetChar
     *        The beginning of the issue.
     */

    public void setBeginOffsetChar(Integer beginOffsetChar) {
        this.beginOffsetChar = beginOffsetChar;
    }

    /**
     * <p>
     * The beginning of the issue.
     * </p>
     * 
     * @return The beginning of the issue.
     */

    public Integer getBeginOffsetChar() {
        return this.beginOffsetChar;
    }

    /**
     * <p>
     * The beginning of the issue.
     * </p>
     * 
     * @param beginOffsetChar
     *        The beginning of the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CharacterOffsets withBeginOffsetChar(Integer beginOffsetChar) {
        setBeginOffsetChar(beginOffsetChar);
        return this;
    }

    /**
     * <p>
     * The end of the issue.
     * </p>
     * 
     * @param endOffsetChar
     *        The end of the issue.
     */

    public void setEndOffsetChar(Integer endOffsetChar) {
        this.endOffsetChar = endOffsetChar;
    }

    /**
     * <p>
     * The end of the issue.
     * </p>
     * 
     * @return The end of the issue.
     */

    public Integer getEndOffsetChar() {
        return this.endOffsetChar;
    }

    /**
     * <p>
     * The end of the issue.
     * </p>
     * 
     * @param endOffsetChar
     *        The end of the issue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CharacterOffsets withEndOffsetChar(Integer endOffsetChar) {
        setEndOffsetChar(endOffsetChar);
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
        if (getBeginOffsetChar() != null)
            sb.append("BeginOffsetChar: ").append(getBeginOffsetChar()).append(",");
        if (getEndOffsetChar() != null)
            sb.append("EndOffsetChar: ").append(getEndOffsetChar());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CharacterOffsets == false)
            return false;
        CharacterOffsets other = (CharacterOffsets) obj;
        if (other.getBeginOffsetChar() == null ^ this.getBeginOffsetChar() == null)
            return false;
        if (other.getBeginOffsetChar() != null && other.getBeginOffsetChar().equals(this.getBeginOffsetChar()) == false)
            return false;
        if (other.getEndOffsetChar() == null ^ this.getEndOffsetChar() == null)
            return false;
        if (other.getEndOffsetChar() != null && other.getEndOffsetChar().equals(this.getEndOffsetChar()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBeginOffsetChar() == null) ? 0 : getBeginOffsetChar().hashCode());
        hashCode = prime * hashCode + ((getEndOffsetChar() == null) ? 0 : getEndOffsetChar().hashCode());
        return hashCode;
    }

    @Override
    public CharacterOffsets clone() {
        try {
            return (CharacterOffsets) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connectcontactlens.model.transform.CharacterOffsetsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
