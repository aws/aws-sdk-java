/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The metadata of a single transport stream program.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/TransportStreamProgram"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransportStreamProgram implements Serializable, Cloneable, StructuredPojo {

    /** The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table. */
    private Integer pcrPid;
    /** The program name as it is reported in the Program Association Table. */
    private String programName;
    /** The program number as it is reported in the Program Association Table. */
    private Integer programNumber;
    /** The program Packet ID (PID) as it is reported in the Program Association Table. */
    private Integer programPid;
    /** The list of elementary transport streams in the program. The list includes video, audio, and data streams. */
    private java.util.List<TransportStream> streams;

    /**
     * The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @param pcrPid
     *        The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     */

    public void setPcrPid(Integer pcrPid) {
        this.pcrPid = pcrPid;
    }

    /**
     * The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @return The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     */

    public Integer getPcrPid() {
        return this.pcrPid;
    }

    /**
     * The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @param pcrPid
     *        The Program Clock Reference (PCR) Packet ID (PID) as it is reported in the Program Association Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withPcrPid(Integer pcrPid) {
        setPcrPid(pcrPid);
        return this;
    }

    /**
     * The program name as it is reported in the Program Association Table.
     * 
     * @param programName
     *        The program name as it is reported in the Program Association Table.
     */

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    /**
     * The program name as it is reported in the Program Association Table.
     * 
     * @return The program name as it is reported in the Program Association Table.
     */

    public String getProgramName() {
        return this.programName;
    }

    /**
     * The program name as it is reported in the Program Association Table.
     * 
     * @param programName
     *        The program name as it is reported in the Program Association Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withProgramName(String programName) {
        setProgramName(programName);
        return this;
    }

    /**
     * The program number as it is reported in the Program Association Table.
     * 
     * @param programNumber
     *        The program number as it is reported in the Program Association Table.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * The program number as it is reported in the Program Association Table.
     * 
     * @return The program number as it is reported in the Program Association Table.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * The program number as it is reported in the Program Association Table.
     * 
     * @param programNumber
     *        The program number as it is reported in the Program Association Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * The program Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @param programPid
     *        The program Packet ID (PID) as it is reported in the Program Association Table.
     */

    public void setProgramPid(Integer programPid) {
        this.programPid = programPid;
    }

    /**
     * The program Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @return The program Packet ID (PID) as it is reported in the Program Association Table.
     */

    public Integer getProgramPid() {
        return this.programPid;
    }

    /**
     * The program Packet ID (PID) as it is reported in the Program Association Table.
     * 
     * @param programPid
     *        The program Packet ID (PID) as it is reported in the Program Association Table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withProgramPid(Integer programPid) {
        setProgramPid(programPid);
        return this;
    }

    /**
     * The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * 
     * @return The list of elementary transport streams in the program. The list includes video, audio, and data
     *         streams.
     */

    public java.util.List<TransportStream> getStreams() {
        return streams;
    }

    /**
     * The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * 
     * @param streams
     *        The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     */

    public void setStreams(java.util.Collection<TransportStream> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<TransportStream>(streams);
    }

    /**
     * The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withStreams(TransportStream... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<TransportStream>(streams.length));
        }
        for (TransportStream ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * 
     * @param streams
     *        The list of elementary transport streams in the program. The list includes video, audio, and data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransportStreamProgram withStreams(java.util.Collection<TransportStream> streams) {
        setStreams(streams);
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
        if (getPcrPid() != null)
            sb.append("PcrPid: ").append(getPcrPid()).append(",");
        if (getProgramName() != null)
            sb.append("ProgramName: ").append(getProgramName()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getProgramPid() != null)
            sb.append("ProgramPid: ").append(getProgramPid()).append(",");
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransportStreamProgram == false)
            return false;
        TransportStreamProgram other = (TransportStreamProgram) obj;
        if (other.getPcrPid() == null ^ this.getPcrPid() == null)
            return false;
        if (other.getPcrPid() != null && other.getPcrPid().equals(this.getPcrPid()) == false)
            return false;
        if (other.getProgramName() == null ^ this.getProgramName() == null)
            return false;
        if (other.getProgramName() != null && other.getProgramName().equals(this.getProgramName()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getProgramPid() == null ^ this.getProgramPid() == null)
            return false;
        if (other.getProgramPid() != null && other.getProgramPid().equals(this.getProgramPid()) == false)
            return false;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPcrPid() == null) ? 0 : getPcrPid().hashCode());
        hashCode = prime * hashCode + ((getProgramName() == null) ? 0 : getProgramName().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getProgramPid() == null) ? 0 : getProgramPid().hashCode());
        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        return hashCode;
    }

    @Override
    public TransportStreamProgram clone() {
        try {
            return (TransportStreamProgram) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.TransportStreamProgramMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
