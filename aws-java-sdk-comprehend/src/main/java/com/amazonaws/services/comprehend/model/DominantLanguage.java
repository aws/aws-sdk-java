/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Returns the code for the dominant language in the input text and the level of confidence that Amazon Comprehend has
 * in the accuracy of the detection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/DominantLanguage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DominantLanguage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     */
    private Float score;

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languageCode
     *        The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     *        href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web
     *        site.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @return The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     *         href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i>
     *         web site.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     * href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web site.
     * </p>
     * 
     * @param languageCode
     *        The RFC 5646 language code for the dominant language. For more information about RFC 5646, see <a
     *        href="https://tools.ietf.org/html/rfc5646">Tags for Identifying Languages</a> on the <i>IETF Tools</i> web
     *        site.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantLanguage withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @return The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     */

    public Float getScore() {
        return this.score;
    }

    /**
     * <p>
     * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * </p>
     * 
     * @param score
     *        The level of confidence that Amazon Comprehend has in the accuracy of the detection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DominantLanguage withScore(Float score) {
        setScore(score);
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
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode()).append(",");
        if (getScore() != null)
            sb.append("Score: ").append(getScore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DominantLanguage == false)
            return false;
        DominantLanguage other = (DominantLanguage) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getScore() == null ^ this.getScore() == null)
            return false;
        if (other.getScore() != null && other.getScore().equals(this.getScore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getScore() == null) ? 0 : getScore().hashCode());
        return hashCode;
    }

    @Override
    public DominantLanguage clone() {
        try {
            return (DominantLanguage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.DominantLanguageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
