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
package com.amazonaws.services.translate.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A supported language.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/translate-2017-07-01/Language" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Language implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Language name of the supported language.
     * </p>
     */
    private String languageName;
    /**
     * <p>
     * Language code for the supported language.
     * </p>
     */
    private String languageCode;

    /**
     * <p>
     * Language name of the supported language.
     * </p>
     * 
     * @param languageName
     *        Language name of the supported language.
     */

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * <p>
     * Language name of the supported language.
     * </p>
     * 
     * @return Language name of the supported language.
     */

    public String getLanguageName() {
        return this.languageName;
    }

    /**
     * <p>
     * Language name of the supported language.
     * </p>
     * 
     * @param languageName
     *        Language name of the supported language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Language withLanguageName(String languageName) {
        setLanguageName(languageName);
        return this;
    }

    /**
     * <p>
     * Language code for the supported language.
     * </p>
     * 
     * @param languageCode
     *        Language code for the supported language.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code for the supported language.
     * </p>
     * 
     * @return Language code for the supported language.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Language code for the supported language.
     * </p>
     * 
     * @param languageCode
     *        Language code for the supported language.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Language withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
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
        if (getLanguageName() != null)
            sb.append("LanguageName: ").append(getLanguageName()).append(",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: ").append(getLanguageCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Language == false)
            return false;
        Language other = (Language) obj;
        if (other.getLanguageName() == null ^ this.getLanguageName() == null)
            return false;
        if (other.getLanguageName() != null && other.getLanguageName().equals(this.getLanguageName()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageName() == null) ? 0 : getLanguageName().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        return hashCode;
    }

    @Override
    public Language clone() {
        try {
            return (Language) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.translate.model.transform.LanguageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
