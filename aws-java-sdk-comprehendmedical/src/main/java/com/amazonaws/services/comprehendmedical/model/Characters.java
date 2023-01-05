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
package com.amazonaws.services.comprehendmedical.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The number of characters in the input text to be analyzed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehendmedical-2018-10-30/Characters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Characters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of characters present in the input text document as processed by Comprehend Medical.
     * </p>
     */
    private Integer originalTextCharacters;

    /**
     * <p>
     * The number of characters present in the input text document as processed by Comprehend Medical.
     * </p>
     * 
     * @param originalTextCharacters
     *        The number of characters present in the input text document as processed by Comprehend Medical.
     */

    public void setOriginalTextCharacters(Integer originalTextCharacters) {
        this.originalTextCharacters = originalTextCharacters;
    }

    /**
     * <p>
     * The number of characters present in the input text document as processed by Comprehend Medical.
     * </p>
     * 
     * @return The number of characters present in the input text document as processed by Comprehend Medical.
     */

    public Integer getOriginalTextCharacters() {
        return this.originalTextCharacters;
    }

    /**
     * <p>
     * The number of characters present in the input text document as processed by Comprehend Medical.
     * </p>
     * 
     * @param originalTextCharacters
     *        The number of characters present in the input text document as processed by Comprehend Medical.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Characters withOriginalTextCharacters(Integer originalTextCharacters) {
        setOriginalTextCharacters(originalTextCharacters);
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
        if (getOriginalTextCharacters() != null)
            sb.append("OriginalTextCharacters: ").append(getOriginalTextCharacters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Characters == false)
            return false;
        Characters other = (Characters) obj;
        if (other.getOriginalTextCharacters() == null ^ this.getOriginalTextCharacters() == null)
            return false;
        if (other.getOriginalTextCharacters() != null && other.getOriginalTextCharacters().equals(this.getOriginalTextCharacters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOriginalTextCharacters() == null) ? 0 : getOriginalTextCharacters().hashCode());
        return hashCode;
    }

    @Override
    public Characters clone() {
        try {
            return (Characters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehendmedical.model.transform.CharactersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
