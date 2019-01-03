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
 * Enable Timed metadata insertion (TimedMetadataInsertion) to include ID3 tags in your job. To include timed metadata,
 * you must enable it here, enable it in each output container, and specify tags and timecodes in ID3 insertion
 * (Id3Insertion) objects.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/TimedMetadataInsertion"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimedMetadataInsertion implements Serializable, Cloneable, StructuredPojo {

    /** Id3Insertions contains the array of Id3Insertion instances. */
    private java.util.List<Id3Insertion> id3Insertions;

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * 
     * @return Id3Insertions contains the array of Id3Insertion instances.
     */

    public java.util.List<Id3Insertion> getId3Insertions() {
        return id3Insertions;
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * 
     * @param id3Insertions
     *        Id3Insertions contains the array of Id3Insertion instances.
     */

    public void setId3Insertions(java.util.Collection<Id3Insertion> id3Insertions) {
        if (id3Insertions == null) {
            this.id3Insertions = null;
            return;
        }

        this.id3Insertions = new java.util.ArrayList<Id3Insertion>(id3Insertions);
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setId3Insertions(java.util.Collection)} or {@link #withId3Insertions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param id3Insertions
     *        Id3Insertions contains the array of Id3Insertion instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimedMetadataInsertion withId3Insertions(Id3Insertion... id3Insertions) {
        if (this.id3Insertions == null) {
            setId3Insertions(new java.util.ArrayList<Id3Insertion>(id3Insertions.length));
        }
        for (Id3Insertion ele : id3Insertions) {
            this.id3Insertions.add(ele);
        }
        return this;
    }

    /**
     * Id3Insertions contains the array of Id3Insertion instances.
     * 
     * @param id3Insertions
     *        Id3Insertions contains the array of Id3Insertion instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimedMetadataInsertion withId3Insertions(java.util.Collection<Id3Insertion> id3Insertions) {
        setId3Insertions(id3Insertions);
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
        if (getId3Insertions() != null)
            sb.append("Id3Insertions: ").append(getId3Insertions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimedMetadataInsertion == false)
            return false;
        TimedMetadataInsertion other = (TimedMetadataInsertion) obj;
        if (other.getId3Insertions() == null ^ this.getId3Insertions() == null)
            return false;
        if (other.getId3Insertions() != null && other.getId3Insertions().equals(this.getId3Insertions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId3Insertions() == null) ? 0 : getId3Insertions().hashCode());
        return hashCode;
    }

    @Override
    public TimedMetadataInsertion clone() {
        try {
            return (TimedMetadataInsertion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.TimedMetadataInsertionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
