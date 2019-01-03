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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * To insert ID3 tags in your output, specify two values. Use ID3 tag (Id3) to specify the base 64 encoded string and
 * use Timecode (TimeCode) to specify the time when the tag should be inserted. To insert multiple ID3 tags in your
 * output, create multiple instances of ID3 insertion (Id3Insertion).
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Id3Insertion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Id3Insertion implements Serializable, Cloneable, StructuredPojo {

    /** Use ID3 tag (Id3) to provide a tag value in base64-encode format. */
    private String id3;
    /** Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format. */
    private String timecode;

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * 
     * @param id3
     *        Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     */

    public void setId3(String id3) {
        this.id3 = id3;
    }

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * 
     * @return Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     */

    public String getId3() {
        return this.id3;
    }

    /**
     * Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * 
     * @param id3
     *        Use ID3 tag (Id3) to provide a tag value in base64-encode format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Id3Insertion withId3(String id3) {
        setId3(id3);
        return this;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * 
     * @param timecode
     *        Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     */

    public void setTimecode(String timecode) {
        this.timecode = timecode;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * 
     * @return Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     */

    public String getTimecode() {
        return this.timecode;
    }

    /**
     * Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * 
     * @param timecode
     *        Provide a Timecode (TimeCode) in HH:MM:SS:FF or HH:MM:SS;FF format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Id3Insertion withTimecode(String timecode) {
        setTimecode(timecode);
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
        if (getId3() != null)
            sb.append("Id3: ").append(getId3()).append(",");
        if (getTimecode() != null)
            sb.append("Timecode: ").append(getTimecode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Id3Insertion == false)
            return false;
        Id3Insertion other = (Id3Insertion) obj;
        if (other.getId3() == null ^ this.getId3() == null)
            return false;
        if (other.getId3() != null && other.getId3().equals(this.getId3()) == false)
            return false;
        if (other.getTimecode() == null ^ this.getTimecode() == null)
            return false;
        if (other.getTimecode() != null && other.getTimecode().equals(this.getTimecode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId3() == null) ? 0 : getId3().hashCode());
        hashCode = prime * hashCode + ((getTimecode() == null) ? 0 : getTimecode().hashCode());
        return hashCode;
    }

    @Override
    public Id3Insertion clone() {
        try {
            return (Id3Insertion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.Id3InsertionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
