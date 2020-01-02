/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SSML message. For more information, see <a
 * href="https://developer.amazon.com/docs/custom-skills/speech-synthesis-markup-language-ssml-reference.html">SSML
 * Reference</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/Ssml" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Ssml implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The locale of the SSML message. Currently, en-US is supported.
     * </p>
     */
    private String locale;
    /**
     * <p>
     * The value of the SSML message in the correct SSML format. The audio tag is not supported.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The locale of the SSML message. Currently, en-US is supported.
     * </p>
     * 
     * @param locale
     *        The locale of the SSML message. Currently, en-US is supported.
     * @see Locale
     */

    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * <p>
     * The locale of the SSML message. Currently, en-US is supported.
     * </p>
     * 
     * @return The locale of the SSML message. Currently, en-US is supported.
     * @see Locale
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     * <p>
     * The locale of the SSML message. Currently, en-US is supported.
     * </p>
     * 
     * @param locale
     *        The locale of the SSML message. Currently, en-US is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public Ssml withLocale(String locale) {
        setLocale(locale);
        return this;
    }

    /**
     * <p>
     * The locale of the SSML message. Currently, en-US is supported.
     * </p>
     * 
     * @param locale
     *        The locale of the SSML message. Currently, en-US is supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Locale
     */

    public Ssml withLocale(Locale locale) {
        this.locale = locale.toString();
        return this;
    }

    /**
     * <p>
     * The value of the SSML message in the correct SSML format. The audio tag is not supported.
     * </p>
     * 
     * @param value
     *        The value of the SSML message in the correct SSML format. The audio tag is not supported.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the SSML message in the correct SSML format. The audio tag is not supported.
     * </p>
     * 
     * @return The value of the SSML message in the correct SSML format. The audio tag is not supported.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the SSML message in the correct SSML format. The audio tag is not supported.
     * </p>
     * 
     * @param value
     *        The value of the SSML message in the correct SSML format. The audio tag is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Ssml withValue(String value) {
        setValue(value);
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
        if (getLocale() != null)
            sb.append("Locale: ").append(getLocale()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ssml == false)
            return false;
        Ssml other = (Ssml) obj;
        if (other.getLocale() == null ^ this.getLocale() == null)
            return false;
        if (other.getLocale() != null && other.getLocale().equals(this.getLocale()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocale() == null) ? 0 : getLocale().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Ssml clone() {
        try {
            return (Ssml) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.SsmlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
