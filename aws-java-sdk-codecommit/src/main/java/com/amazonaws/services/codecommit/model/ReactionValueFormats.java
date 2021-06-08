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
package com.amazonaws.services.codecommit.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the values for reactions to a comment. AWS CodeCommit supports a limited set of reactions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codecommit-2015-04-13/ReactionValueFormats" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReactionValueFormats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different
     * operating systems.
     * </p>
     */
    private String emoji;
    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating
     * systems.
     * </p>
     */
    private String shortCode;
    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     */
    private String unicode;

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different
     * operating systems.
     * </p>
     * 
     * @param emoji
     *        The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on
     *        different operating systems.
     */

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different
     * operating systems.
     * </p>
     * 
     * @return The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on
     *         different operating systems.
     */

    public String getEmoji() {
        return this.emoji;
    }

    /**
     * <p>
     * The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on different
     * operating systems.
     * </p>
     * 
     * @param emoji
     *        The Emoji Version 1.0 graphic of the reaction. These graphics are interpreted slightly differently on
     *        different operating systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionValueFormats withEmoji(String emoji) {
        setEmoji(emoji);
        return this;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating
     * systems.
     * </p>
     * 
     * @param shortCode
     *        The emoji short code for the reaction. Short codes are interpreted slightly differently on different
     *        operating systems.
     */

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating
     * systems.
     * </p>
     * 
     * @return The emoji short code for the reaction. Short codes are interpreted slightly differently on different
     *         operating systems.
     */

    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * <p>
     * The emoji short code for the reaction. Short codes are interpreted slightly differently on different operating
     * systems.
     * </p>
     * 
     * @param shortCode
     *        The emoji short code for the reaction. Short codes are interpreted slightly differently on different
     *        operating systems.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionValueFormats withShortCode(String shortCode) {
        setShortCode(shortCode);
        return this;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     * 
     * @param unicode
     *        The Unicode codepoint for the reaction.
     */

    public void setUnicode(String unicode) {
        this.unicode = unicode;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     * 
     * @return The Unicode codepoint for the reaction.
     */

    public String getUnicode() {
        return this.unicode;
    }

    /**
     * <p>
     * The Unicode codepoint for the reaction.
     * </p>
     * 
     * @param unicode
     *        The Unicode codepoint for the reaction.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReactionValueFormats withUnicode(String unicode) {
        setUnicode(unicode);
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
        if (getEmoji() != null)
            sb.append("Emoji: ").append(getEmoji()).append(",");
        if (getShortCode() != null)
            sb.append("ShortCode: ").append(getShortCode()).append(",");
        if (getUnicode() != null)
            sb.append("Unicode: ").append(getUnicode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReactionValueFormats == false)
            return false;
        ReactionValueFormats other = (ReactionValueFormats) obj;
        if (other.getEmoji() == null ^ this.getEmoji() == null)
            return false;
        if (other.getEmoji() != null && other.getEmoji().equals(this.getEmoji()) == false)
            return false;
        if (other.getShortCode() == null ^ this.getShortCode() == null)
            return false;
        if (other.getShortCode() != null && other.getShortCode().equals(this.getShortCode()) == false)
            return false;
        if (other.getUnicode() == null ^ this.getUnicode() == null)
            return false;
        if (other.getUnicode() != null && other.getUnicode().equals(this.getUnicode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEmoji() == null) ? 0 : getEmoji().hashCode());
        hashCode = prime * hashCode + ((getShortCode() == null) ? 0 : getShortCode().hashCode());
        hashCode = prime * hashCode + ((getUnicode() == null) ? 0 : getUnicode().hashCode());
        return hashCode;
    }

    @Override
    public ReactionValueFormats clone() {
        try {
            return (ReactionValueFormats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codecommit.model.transform.ReactionValueFormatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
