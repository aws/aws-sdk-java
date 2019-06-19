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
 * Scte27 Source Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Scte27SourceSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Scte27SourceSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify PID and
     * Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit Language:
     * Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language, whichever PID that
     * happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all
     * languages will be passed through.
     */
    private Integer pid;

    /**
     * The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify PID and
     * Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit Language:
     * Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language, whichever PID that
     * happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all
     * languages will be passed through.
     * 
     * @param pid
     *        The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify
     *        PID and Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit
     *        Language: Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language,
     *        whichever PID that happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is
     *        being passed through; all languages will be passed through.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify PID and
     * Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit Language:
     * Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language, whichever PID that
     * happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all
     * languages will be passed through.
     * 
     * @return The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify
     *         PID and Language: Extracts captions from that PID; the language is "informational". - Specify PID and
     *         omit Language: Extracts the specified PID. - Omit PID and specify Language: Extracts the specified
     *         language, whichever PID that happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub
     *         that is being passed through; all languages will be passed through.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify PID and
     * Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit Language:
     * Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language, whichever PID that
     * happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is being passed through; all
     * languages will be passed through.
     * 
     * @param pid
     *        The pid field is used in conjunction with the caption selector languageCode field as follows: - Specify
     *        PID and Language: Extracts captions from that PID; the language is "informational". - Specify PID and omit
     *        Language: Extracts the specified PID. - Omit PID and specify Language: Extracts the specified language,
     *        whichever PID that happens to be. - Omit PID and omit Language: Valid only if source is DVB-Sub that is
     *        being passed through; all languages will be passed through.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Scte27SourceSettings withPid(Integer pid) {
        setPid(pid);
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
        if (getPid() != null)
            sb.append("Pid: ").append(getPid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Scte27SourceSettings == false)
            return false;
        Scte27SourceSettings other = (Scte27SourceSettings) obj;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        return hashCode;
    }

    @Override
    public Scte27SourceSettings clone() {
        try {
            return (Scte27SourceSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.Scte27SourceSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
