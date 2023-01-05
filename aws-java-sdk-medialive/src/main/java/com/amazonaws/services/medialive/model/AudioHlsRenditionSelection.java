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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Audio Hls Rendition Selection
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/AudioHlsRenditionSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioHlsRenditionSelection implements Serializable, Cloneable, StructuredPojo {

    /** Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition. */
    private String groupId;
    /** Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition. */
    private String name;

    /**
     * Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @param groupId
     *        Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     */

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @return Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     */

    public String getGroupId() {
        return this.groupId;
    }

    /**
     * Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @param groupId
     *        Specifies the GROUP-ID in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioHlsRenditionSelection withGroupId(String groupId) {
        setGroupId(groupId);
        return this;
    }

    /**
     * Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @param name
     *        Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @return Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * 
     * @param name
     *        Specifies the NAME in the #EXT-X-MEDIA tag of the target HLS audio rendition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AudioHlsRenditionSelection withName(String name) {
        setName(name);
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
        if (getGroupId() != null)
            sb.append("GroupId: ").append(getGroupId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioHlsRenditionSelection == false)
            return false;
        AudioHlsRenditionSelection other = (AudioHlsRenditionSelection) obj;
        if (other.getGroupId() == null ^ this.getGroupId() == null)
            return false;
        if (other.getGroupId() != null && other.getGroupId().equals(this.getGroupId()) == false)
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

        hashCode = prime * hashCode + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AudioHlsRenditionSelection clone() {
        try {
            return (AudioHlsRenditionSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.AudioHlsRenditionSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
