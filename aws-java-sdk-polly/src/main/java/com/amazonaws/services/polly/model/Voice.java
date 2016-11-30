/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.polly.model;

import java.io.Serializable;

/**
 * <p>
 * Description of the voice.
 * </p>
 */
public class Voice implements Serializable, Cloneable {

    /**
     * <p>
     * Gender of the voice.
     * </p>
     */
    private String gender;
    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Language code of the voice.
     * </p>
     */
    private String languageCode;
    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     */
    private String languageName;
    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might
     * display in your application.
     * </p>
     */
    private String name;

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * 
     * @param gender
     *        Gender of the voice.
     * @see Gender
     */

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * 
     * @return Gender of the voice.
     * @see Gender
     */

    public String getGender() {
        return this.gender;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * 
     * @param gender
     *        Gender of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gender
     */

    public Voice withGender(String gender) {
        setGender(gender);
        return this;
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * 
     * @param gender
     *        Gender of the voice.
     * @see Gender
     */

    public void setGender(Gender gender) {
        this.gender = gender.toString();
    }

    /**
     * <p>
     * Gender of the voice.
     * </p>
     * 
     * @param gender
     *        Gender of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Gender
     */

    public Voice withGender(Gender gender) {
        setGender(gender);
        return this;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     * 
     * @param id
     *        Amazon Polly assigned voice ID. This is the ID that you specify when calling the
     *        <code>SynthesizeSpeech</code> operation.
     * @see VoiceId
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     * 
     * @return Amazon Polly assigned voice ID. This is the ID that you specify when calling the
     *         <code>SynthesizeSpeech</code> operation.
     * @see VoiceId
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     * 
     * @param id
     *        Amazon Polly assigned voice ID. This is the ID that you specify when calling the
     *        <code>SynthesizeSpeech</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public Voice withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     * 
     * @param id
     *        Amazon Polly assigned voice ID. This is the ID that you specify when calling the
     *        <code>SynthesizeSpeech</code> operation.
     * @see VoiceId
     */

    public void setId(VoiceId id) {
        this.id = id.toString();
    }

    /**
     * <p>
     * Amazon Polly assigned voice ID. This is the ID that you specify when calling the <code>SynthesizeSpeech</code>
     * operation.
     * </p>
     * 
     * @param id
     *        Amazon Polly assigned voice ID. This is the ID that you specify when calling the
     *        <code>SynthesizeSpeech</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VoiceId
     */

    public Voice withId(VoiceId id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * 
     * @param languageCode
     *        Language code of the voice.
     * @see LanguageCode
     */

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * 
     * @return Language code of the voice.
     * @see LanguageCode
     */

    public String getLanguageCode() {
        return this.languageCode;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * 
     * @param languageCode
     *        Language code of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public Voice withLanguageCode(String languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * 
     * @param languageCode
     *        Language code of the voice.
     * @see LanguageCode
     */

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode.toString();
    }

    /**
     * <p>
     * Language code of the voice.
     * </p>
     * 
     * @param languageCode
     *        Language code of the voice.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LanguageCode
     */

    public Voice withLanguageCode(LanguageCode languageCode) {
        setLanguageCode(languageCode);
        return this;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     * 
     * @param languageName
     *        Human readable name of the language in English.
     */

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     * 
     * @return Human readable name of the language in English.
     */

    public String getLanguageName() {
        return this.languageName;
    }

    /**
     * <p>
     * Human readable name of the language in English.
     * </p>
     * 
     * @param languageName
     *        Human readable name of the language in English.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Voice withLanguageName(String languageName) {
        setLanguageName(languageName);
        return this;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might
     * display in your application.
     * </p>
     * 
     * @param name
     *        Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you
     *        might display in your application.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might
     * display in your application.
     * </p>
     * 
     * @return Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you
     *         might display in your application.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you might
     * display in your application.
     * </p>
     * 
     * @param name
     *        Name of the voice (for example, Salli, Kendra, etc.). This provides a human readable voice name that you
     *        might display in your application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Voice withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getGender() != null)
            sb.append("Gender: " + getGender() + ",");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getLanguageCode() != null)
            sb.append("LanguageCode: " + getLanguageCode() + ",");
        if (getLanguageName() != null)
            sb.append("LanguageName: " + getLanguageName() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Voice == false)
            return false;
        Voice other = (Voice) obj;
        if (other.getGender() == null ^ this.getGender() == null)
            return false;
        if (other.getGender() != null && other.getGender().equals(this.getGender()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLanguageCode() == null ^ this.getLanguageCode() == null)
            return false;
        if (other.getLanguageCode() != null && other.getLanguageCode().equals(this.getLanguageCode()) == false)
            return false;
        if (other.getLanguageName() == null ^ this.getLanguageName() == null)
            return false;
        if (other.getLanguageName() != null && other.getLanguageName().equals(this.getLanguageName()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGender() == null) ? 0 : getGender().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLanguageCode() == null) ? 0 : getLanguageCode().hashCode());
        hashCode = prime * hashCode + ((getLanguageName() == null) ? 0 : getLanguageName().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public Voice clone() {
        try {
            return (Voice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
