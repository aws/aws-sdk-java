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
 * Settings for MOV Container.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MovSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MovSettings implements Serializable, Cloneable, StructuredPojo {

    /** When enabled, include 'clap' atom if appropriate for the video output settings. */
    private String clapAtom;
    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     */
    private String cslgAtom;
    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases
     * compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable
     * when the video codec is MPEG2.
     */
    private String mpeg2FourCCControl;
    /** If set to OMNEON, inserts Omneon-compatible padding */
    private String paddingControl;
    /** Always keep the default value (SELF_CONTAINED) for this setting. */
    private String reference;

    /**
     * When enabled, include 'clap' atom if appropriate for the video output settings.
     * 
     * @param clapAtom
     *        When enabled, include 'clap' atom if appropriate for the video output settings.
     * @see MovClapAtom
     */

    public void setClapAtom(String clapAtom) {
        this.clapAtom = clapAtom;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output settings.
     * 
     * @return When enabled, include 'clap' atom if appropriate for the video output settings.
     * @see MovClapAtom
     */

    public String getClapAtom() {
        return this.clapAtom;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output settings.
     * 
     * @param clapAtom
     *        When enabled, include 'clap' atom if appropriate for the video output settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovClapAtom
     */

    public MovSettings withClapAtom(String clapAtom) {
        setClapAtom(clapAtom);
        return this;
    }

    /**
     * When enabled, include 'clap' atom if appropriate for the video output settings.
     * 
     * @param clapAtom
     *        When enabled, include 'clap' atom if appropriate for the video output settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovClapAtom
     */

    public MovSettings withClapAtom(MovClapAtom clapAtom) {
        this.clapAtom = clapAtom.toString();
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @see MovCslgAtom
     */

    public void setCslgAtom(String cslgAtom) {
        this.cslgAtom = cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @return When enabled, file composition times will start at zero, composition times in the 'ctts' (composition
     *         time to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box
     *         will be included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @see MovCslgAtom
     */

    public String getCslgAtom() {
        return this.cslgAtom;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovCslgAtom
     */

    public MovSettings withCslgAtom(String cslgAtom) {
        setCslgAtom(cslgAtom);
        return this;
    }

    /**
     * When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time to
     * sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be included
     * per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * 
     * @param cslgAtom
     *        When enabled, file composition times will start at zero, composition times in the 'ctts' (composition time
     *        to sample) box for B-frames will be negative, and a 'cslg' (composition shift least greatest) box will be
     *        included per 14496-1 amendment 1. This improves compatibility with Apple players and tools.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovCslgAtom
     */

    public MovSettings withCslgAtom(MovCslgAtom cslgAtom) {
        this.cslgAtom = cslgAtom.toString();
        return this;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases
     * compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable
     * when the video codec is MPEG2.
     * 
     * @param mpeg2FourCCControl
     *        When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This
     *        increases compatibility with Apple editors and players, but may decrease compatibility with other players.
     *        Only applicable when the video codec is MPEG2.
     * @see MovMpeg2FourCCControl
     */

    public void setMpeg2FourCCControl(String mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases
     * compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable
     * when the video codec is MPEG2.
     * 
     * @return When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This
     *         increases compatibility with Apple editors and players, but may decrease compatibility with other
     *         players. Only applicable when the video codec is MPEG2.
     * @see MovMpeg2FourCCControl
     */

    public String getMpeg2FourCCControl() {
        return this.mpeg2FourCCControl;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases
     * compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable
     * when the video codec is MPEG2.
     * 
     * @param mpeg2FourCCControl
     *        When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This
     *        increases compatibility with Apple editors and players, but may decrease compatibility with other players.
     *        Only applicable when the video codec is MPEG2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovMpeg2FourCCControl
     */

    public MovSettings withMpeg2FourCCControl(String mpeg2FourCCControl) {
        setMpeg2FourCCControl(mpeg2FourCCControl);
        return this;
    }

    /**
     * When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This increases
     * compatibility with Apple editors and players, but may decrease compatibility with other players. Only applicable
     * when the video codec is MPEG2.
     * 
     * @param mpeg2FourCCControl
     *        When set to XDCAM, writes MPEG2 video streams into the QuickTime file using XDCAM fourcc codes. This
     *        increases compatibility with Apple editors and players, but may decrease compatibility with other players.
     *        Only applicable when the video codec is MPEG2.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovMpeg2FourCCControl
     */

    public MovSettings withMpeg2FourCCControl(MovMpeg2FourCCControl mpeg2FourCCControl) {
        this.mpeg2FourCCControl = mpeg2FourCCControl.toString();
        return this;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * 
     * @param paddingControl
     *        If set to OMNEON, inserts Omneon-compatible padding
     * @see MovPaddingControl
     */

    public void setPaddingControl(String paddingControl) {
        this.paddingControl = paddingControl;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * 
     * @return If set to OMNEON, inserts Omneon-compatible padding
     * @see MovPaddingControl
     */

    public String getPaddingControl() {
        return this.paddingControl;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * 
     * @param paddingControl
     *        If set to OMNEON, inserts Omneon-compatible padding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovPaddingControl
     */

    public MovSettings withPaddingControl(String paddingControl) {
        setPaddingControl(paddingControl);
        return this;
    }

    /**
     * If set to OMNEON, inserts Omneon-compatible padding
     * 
     * @param paddingControl
     *        If set to OMNEON, inserts Omneon-compatible padding
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovPaddingControl
     */

    public MovSettings withPaddingControl(MovPaddingControl paddingControl) {
        this.paddingControl = paddingControl.toString();
        return this;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * 
     * @param reference
     *        Always keep the default value (SELF_CONTAINED) for this setting.
     * @see MovReference
     */

    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * 
     * @return Always keep the default value (SELF_CONTAINED) for this setting.
     * @see MovReference
     */

    public String getReference() {
        return this.reference;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * 
     * @param reference
     *        Always keep the default value (SELF_CONTAINED) for this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovReference
     */

    public MovSettings withReference(String reference) {
        setReference(reference);
        return this;
    }

    /**
     * Always keep the default value (SELF_CONTAINED) for this setting.
     * 
     * @param reference
     *        Always keep the default value (SELF_CONTAINED) for this setting.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MovReference
     */

    public MovSettings withReference(MovReference reference) {
        this.reference = reference.toString();
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
        if (getClapAtom() != null)
            sb.append("ClapAtom: ").append(getClapAtom()).append(",");
        if (getCslgAtom() != null)
            sb.append("CslgAtom: ").append(getCslgAtom()).append(",");
        if (getMpeg2FourCCControl() != null)
            sb.append("Mpeg2FourCCControl: ").append(getMpeg2FourCCControl()).append(",");
        if (getPaddingControl() != null)
            sb.append("PaddingControl: ").append(getPaddingControl()).append(",");
        if (getReference() != null)
            sb.append("Reference: ").append(getReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MovSettings == false)
            return false;
        MovSettings other = (MovSettings) obj;
        if (other.getClapAtom() == null ^ this.getClapAtom() == null)
            return false;
        if (other.getClapAtom() != null && other.getClapAtom().equals(this.getClapAtom()) == false)
            return false;
        if (other.getCslgAtom() == null ^ this.getCslgAtom() == null)
            return false;
        if (other.getCslgAtom() != null && other.getCslgAtom().equals(this.getCslgAtom()) == false)
            return false;
        if (other.getMpeg2FourCCControl() == null ^ this.getMpeg2FourCCControl() == null)
            return false;
        if (other.getMpeg2FourCCControl() != null && other.getMpeg2FourCCControl().equals(this.getMpeg2FourCCControl()) == false)
            return false;
        if (other.getPaddingControl() == null ^ this.getPaddingControl() == null)
            return false;
        if (other.getPaddingControl() != null && other.getPaddingControl().equals(this.getPaddingControl()) == false)
            return false;
        if (other.getReference() == null ^ this.getReference() == null)
            return false;
        if (other.getReference() != null && other.getReference().equals(this.getReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClapAtom() == null) ? 0 : getClapAtom().hashCode());
        hashCode = prime * hashCode + ((getCslgAtom() == null) ? 0 : getCslgAtom().hashCode());
        hashCode = prime * hashCode + ((getMpeg2FourCCControl() == null) ? 0 : getMpeg2FourCCControl().hashCode());
        hashCode = prime * hashCode + ((getPaddingControl() == null) ? 0 : getPaddingControl().hashCode());
        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        return hashCode;
    }

    @Override
    public MovSettings clone() {
        try {
            return (MovSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MovSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
