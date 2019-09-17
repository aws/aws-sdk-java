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
 * Video Selector Program Id
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoSelectorProgramId" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoSelectorProgramId implements Serializable, Cloneable, StructuredPojo {

    /**
     * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first
     * program within the transport stream will be selected by default.
     */
    private Integer programId;

    /**
     * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first
     * program within the transport stream will be selected by default.
     * 
     * @param programId
     *        Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the
     *        first program within the transport stream will be selected by default.
     */

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first
     * program within the transport stream will be selected by default.
     * 
     * @return Selects a specific program from within a multi-program transport stream. If the program doesn't exist,
     *         the first program within the transport stream will be selected by default.
     */

    public Integer getProgramId() {
        return this.programId;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the first
     * program within the transport stream will be selected by default.
     * 
     * @param programId
     *        Selects a specific program from within a multi-program transport stream. If the program doesn't exist, the
     *        first program within the transport stream will be selected by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelectorProgramId withProgramId(Integer programId) {
        setProgramId(programId);
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
        if (getProgramId() != null)
            sb.append("ProgramId: ").append(getProgramId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelectorProgramId == false)
            return false;
        VideoSelectorProgramId other = (VideoSelectorProgramId) obj;
        if (other.getProgramId() == null ^ this.getProgramId() == null)
            return false;
        if (other.getProgramId() != null && other.getProgramId().equals(this.getProgramId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProgramId() == null) ? 0 : getProgramId().hashCode());
        return hashCode;
    }

    @Override
    public VideoSelectorProgramId clone() {
        try {
            return (VideoSelectorProgramId) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VideoSelectorProgramIdMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
