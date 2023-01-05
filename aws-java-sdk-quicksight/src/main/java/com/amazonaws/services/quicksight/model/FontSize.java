/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The option that determines the text display size.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/FontSize" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FontSize implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The lexical name for the text size, proportional to its surrounding context.
     * </p>
     */
    private String relative;

    /**
     * <p>
     * The lexical name for the text size, proportional to its surrounding context.
     * </p>
     * 
     * @param relative
     *        The lexical name for the text size, proportional to its surrounding context.
     * @see RelativeFontSize
     */

    public void setRelative(String relative) {
        this.relative = relative;
    }

    /**
     * <p>
     * The lexical name for the text size, proportional to its surrounding context.
     * </p>
     * 
     * @return The lexical name for the text size, proportional to its surrounding context.
     * @see RelativeFontSize
     */

    public String getRelative() {
        return this.relative;
    }

    /**
     * <p>
     * The lexical name for the text size, proportional to its surrounding context.
     * </p>
     * 
     * @param relative
     *        The lexical name for the text size, proportional to its surrounding context.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeFontSize
     */

    public FontSize withRelative(String relative) {
        setRelative(relative);
        return this;
    }

    /**
     * <p>
     * The lexical name for the text size, proportional to its surrounding context.
     * </p>
     * 
     * @param relative
     *        The lexical name for the text size, proportional to its surrounding context.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RelativeFontSize
     */

    public FontSize withRelative(RelativeFontSize relative) {
        this.relative = relative.toString();
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
        if (getRelative() != null)
            sb.append("Relative: ").append(getRelative());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FontSize == false)
            return false;
        FontSize other = (FontSize) obj;
        if (other.getRelative() == null ^ this.getRelative() == null)
            return false;
        if (other.getRelative() != null && other.getRelative().equals(this.getRelative()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRelative() == null) ? 0 : getRelative().hashCode());
        return hashCode;
    }

    @Override
    public FontSize clone() {
        try {
            return (FontSize) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.FontSizeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
