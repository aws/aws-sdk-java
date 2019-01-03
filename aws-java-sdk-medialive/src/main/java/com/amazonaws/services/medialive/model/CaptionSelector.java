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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Output groups for this Live Event. Output groups contain information about where streams should be distributed.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/CaptionSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * When specified this field indicates the three letter language code of the caption track to extract from the
     * source.
     */
    private String languageCode;
    /**
     * Name identifier for a caption selector. This name is used to associate this caption selector with one or more
     * caption descriptions. Names must be unique within an event.
     */
    private String name;
    /** Caption selector settings. */
    private CaptionSelectorSettings selectorSettings;

    /**
     * When specified this field indicates the three letter language code of the caption track to extract from the
     * source.
     * 
     * @param languageCode
     *        When specified this field indicates the three letter language code of the caption track to extract from
     *        the source.
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * When specified this field indicates the three letter language code of the caption track to extract from the
     * source.
     * 
     * @return When specified this field indicates the three letter language code of the caption track to extract from
     *         the source.
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * When specified this field indicates the three letter language code of the caption track to extract from the
     * source.
     * 
     * @param languageCode
     *        When specified this field indicates the three letter language code of the caption track to extract from
     *        the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelector withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate this caption selector with one or more
     * caption descriptions. Names must be unique within an event.
     * 
     * @param name
     *        Name identifier for a caption selector. This name is used to associate this caption selector with one or
     *        more caption descriptions. Names must be unique within an event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate this caption selector with one or more
     * caption descriptions. Names must be unique within an event.
     * 
     * @return Name identifier for a caption selector. This name is used to associate this caption selector with one or
     *         more caption descriptions. Names must be unique within an event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Name identifier for a caption selector. This name is used to associate this caption selector with one or more
     * caption descriptions. Names must be unique within an event.
     * 
     * @param name
     *        Name identifier for a caption selector. This name is used to associate this caption selector with one or
     *        more caption descriptions. Names must be unique within an event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelector withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Caption selector settings.
     * 
     * @param selectorSettings
     *        Caption selector settings.
     */

    public void setSelectorSettings(CaptionSelectorSettings selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    /**
     * Caption selector settings.
     * 
     * @return Caption selector settings.
     */

    public CaptionSelectorSettings getSelectorSettings() {
        return this.selectorSettings;
    }

    /**
     * Caption selector settings.
     * 
     * @param selectorSettings
     *        Caption selector settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionSelector withSelectorSettings(CaptionSelectorSettings selectorSettings) {
        setSelectorSettings(selectorSettings);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSelectorSettings() != null)
            sb.append("SelectorSettings: ").append(getSelectorSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionSelector == false)
            return false;
        CaptionSelector other = (CaptionSelector) obj;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSelectorSettings() == null ^ this.getSelectorSettings() == null)
            return false;
        if (other.getSelectorSettings() != null && other.getSelectorSettings().equals(this.getSelectorSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSelectorSettings() == null) ? 0 : getSelectorSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionSelector clone() {
        try {
            return (CaptionSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.CaptionSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
