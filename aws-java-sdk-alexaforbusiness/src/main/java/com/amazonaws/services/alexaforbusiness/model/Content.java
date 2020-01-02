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
 * The content definition. This can contain only one text, SSML, or audio list object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/Content" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Content implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of text messages.
     * </p>
     */
    private java.util.List<Text> textList;
    /**
     * <p>
     * The list of SSML messages.
     * </p>
     */
    private java.util.List<Ssml> ssmlList;
    /**
     * <p>
     * The list of audio messages.
     * </p>
     */
    private java.util.List<Audio> audioList;

    /**
     * <p>
     * The list of text messages.
     * </p>
     * 
     * @return The list of text messages.
     */

    public java.util.List<Text> getTextList() {
        return textList;
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     * 
     * @param textList
     *        The list of text messages.
     */

    public void setTextList(java.util.Collection<Text> textList) {
        if (textList == null) {
            this.textList = null;
            return;
        }

        this.textList = new java.util.ArrayList<Text>(textList);
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextList(java.util.Collection)} or {@link #withTextList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param textList
     *        The list of text messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withTextList(Text... textList) {
        if (this.textList == null) {
            setTextList(new java.util.ArrayList<Text>(textList.length));
        }
        for (Text ele : textList) {
            this.textList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of text messages.
     * </p>
     * 
     * @param textList
     *        The list of text messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withTextList(java.util.Collection<Text> textList) {
        setTextList(textList);
        return this;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * 
     * @return The list of SSML messages.
     */

    public java.util.List<Ssml> getSsmlList() {
        return ssmlList;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * 
     * @param ssmlList
     *        The list of SSML messages.
     */

    public void setSsmlList(java.util.Collection<Ssml> ssmlList) {
        if (ssmlList == null) {
            this.ssmlList = null;
            return;
        }

        this.ssmlList = new java.util.ArrayList<Ssml>(ssmlList);
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSsmlList(java.util.Collection)} or {@link #withSsmlList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param ssmlList
     *        The list of SSML messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withSsmlList(Ssml... ssmlList) {
        if (this.ssmlList == null) {
            setSsmlList(new java.util.ArrayList<Ssml>(ssmlList.length));
        }
        for (Ssml ele : ssmlList) {
            this.ssmlList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of SSML messages.
     * </p>
     * 
     * @param ssmlList
     *        The list of SSML messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withSsmlList(java.util.Collection<Ssml> ssmlList) {
        setSsmlList(ssmlList);
        return this;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * 
     * @return The list of audio messages.
     */

    public java.util.List<Audio> getAudioList() {
        return audioList;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * 
     * @param audioList
     *        The list of audio messages.
     */

    public void setAudioList(java.util.Collection<Audio> audioList) {
        if (audioList == null) {
            this.audioList = null;
            return;
        }

        this.audioList = new java.util.ArrayList<Audio>(audioList);
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioList(java.util.Collection)} or {@link #withAudioList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param audioList
     *        The list of audio messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withAudioList(Audio... audioList) {
        if (this.audioList == null) {
            setAudioList(new java.util.ArrayList<Audio>(audioList.length));
        }
        for (Audio ele : audioList) {
            this.audioList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of audio messages.
     * </p>
     * 
     * @param audioList
     *        The list of audio messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Content withAudioList(java.util.Collection<Audio> audioList) {
        setAudioList(audioList);
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
        if (getTextList() != null)
            sb.append("TextList: ").append(getTextList()).append(",");
        if (getSsmlList() != null)
            sb.append("SsmlList: ").append(getSsmlList()).append(",");
        if (getAudioList() != null)
            sb.append("AudioList: ").append(getAudioList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Content == false)
            return false;
        Content other = (Content) obj;
        if (other.getTextList() == null ^ this.getTextList() == null)
            return false;
        if (other.getTextList() != null && other.getTextList().equals(this.getTextList()) == false)
            return false;
        if (other.getSsmlList() == null ^ this.getSsmlList() == null)
            return false;
        if (other.getSsmlList() != null && other.getSsmlList().equals(this.getSsmlList()) == false)
            return false;
        if (other.getAudioList() == null ^ this.getAudioList() == null)
            return false;
        if (other.getAudioList() != null && other.getAudioList().equals(this.getAudioList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextList() == null) ? 0 : getTextList().hashCode());
        hashCode = prime * hashCode + ((getSsmlList() == null) ? 0 : getSsmlList().hashCode());
        hashCode = prime * hashCode + ((getAudioList() == null) ? 0 : getAudioList().hashCode());
        return hashCode;
    }

    @Override
    public Content clone() {
        try {
            return (Content) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.ContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
