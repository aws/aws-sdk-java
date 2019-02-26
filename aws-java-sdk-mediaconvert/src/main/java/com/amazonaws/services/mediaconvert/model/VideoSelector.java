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
 * Selector for video.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/VideoSelector" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoSelector implements Serializable, Cloneable, StructuredPojo {

    private String colorSpace;

    private String colorSpaceUsage;

    private Hdr10Metadata hdr10Metadata;
    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */
    private Integer pid;
    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     */
    private Integer programNumber;

    private String rotate;

    /**
     * @param colorSpace
     * @see ColorSpace
     */

    public void setColorSpace(String colorSpace) {
        this.colorSpace = colorSpace;
    }

    /**
     * @return
     * @see ColorSpace
     */

    public String getColorSpace() {
        return this.colorSpace;
    }

    /**
     * @param colorSpace
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public VideoSelector withColorSpace(String colorSpace) {
        setColorSpace(colorSpace);
        return this;
    }

    /**
     * @param colorSpace
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpace
     */

    public VideoSelector withColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace.toString();
        return this;
    }

    /**
     * @param colorSpaceUsage
     * @see ColorSpaceUsage
     */

    public void setColorSpaceUsage(String colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage;
    }

    /**
     * @return
     * @see ColorSpaceUsage
     */

    public String getColorSpaceUsage() {
        return this.colorSpaceUsage;
    }

    /**
     * @param colorSpaceUsage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(String colorSpaceUsage) {
        setColorSpaceUsage(colorSpaceUsage);
        return this;
    }

    /**
     * @param colorSpaceUsage
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ColorSpaceUsage
     */

    public VideoSelector withColorSpaceUsage(ColorSpaceUsage colorSpaceUsage) {
        this.colorSpaceUsage = colorSpaceUsage.toString();
        return this;
    }

    /**
     * @param hdr10Metadata
     */

    public void setHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        this.hdr10Metadata = hdr10Metadata;
    }

    /**
     * @return
     */

    public Hdr10Metadata getHdr10Metadata() {
        return this.hdr10Metadata;
    }

    /**
     * @param hdr10Metadata
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withHdr10Metadata(Hdr10Metadata hdr10Metadata) {
        setHdr10Metadata(hdr10Metadata);
        return this;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @param pid
     *        Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *        system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *        packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @return Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *         system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *         packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the system
     * automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or packet
     * identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * 
     * @param pid
     *        Use PID (Pid) to select specific video data from an input file. Specify this value as an integer; the
     *        system automatically converts it to the hexidecimal value. For example, 257 selects PID 0x101. A PID, or
     *        packet identifier, is an identifier for a set of data in an MPEG-2 transport stream container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @param programNumber
     *        Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *        currently supported.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @return Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *         currently supported.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not currently
     * supported.
     * 
     * @param programNumber
     *        Selects a specific program from within a multi-program transport stream. Note that Quad 4K is not
     *        currently supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoSelector withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * @param rotate
     * @see InputRotate
     */

    public void setRotate(String rotate) {
        this.rotate = rotate;
    }

    /**
     * @return
     * @see InputRotate
     */

    public String getRotate() {
        return this.rotate;
    }

    /**
     * @param rotate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputRotate
     */

    public VideoSelector withRotate(String rotate) {
        setRotate(rotate);
        return this;
    }

    /**
     * @param rotate
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputRotate
     */

    public VideoSelector withRotate(InputRotate rotate) {
        this.rotate = rotate.toString();
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
        if (getColorSpace() != null)
            sb.append("ColorSpace: ").append(getColorSpace()).append(",");
        if (getColorSpaceUsage() != null)
            sb.append("ColorSpaceUsage: ").append(getColorSpaceUsage()).append(",");
        if (getHdr10Metadata() != null)
            sb.append("Hdr10Metadata: ").append(getHdr10Metadata()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getRotate() != null)
            sb.append("Rotate: ").append(getRotate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoSelector == false)
            return false;
        VideoSelector other = (VideoSelector) obj;
        if (other.getColorSpace() == null ^ this.getColorSpace() == null)
            return false;
        if (other.getColorSpace() != null && other.getColorSpace().equals(this.getColorSpace()) == false)
            return false;
        if (other.getColorSpaceUsage() == null ^ this.getColorSpaceUsage() == null)
            return false;
        if (other.getColorSpaceUsage() != null && other.getColorSpaceUsage().equals(this.getColorSpaceUsage()) == false)
            return false;
        if (other.getHdr10Metadata() == null ^ this.getHdr10Metadata() == null)
            return false;
        if (other.getHdr10Metadata() != null && other.getHdr10Metadata().equals(this.getHdr10Metadata()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getRotate() == null ^ this.getRotate() == null)
            return false;
        if (other.getRotate() != null && other.getRotate().equals(this.getRotate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getColorSpace() == null) ? 0 : getColorSpace().hashCode());
        hashCode = prime * hashCode + ((getColorSpaceUsage() == null) ? 0 : getColorSpaceUsage().hashCode());
        hashCode = prime * hashCode + ((getHdr10Metadata() == null) ? 0 : getHdr10Metadata().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getRotate() == null) ? 0 : getRotate().hashCode());
        return hashCode;
    }

    @Override
    public VideoSelector clone() {
        try {
            return (VideoSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.VideoSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
