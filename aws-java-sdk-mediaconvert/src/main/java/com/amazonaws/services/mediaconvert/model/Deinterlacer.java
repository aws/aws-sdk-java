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
 * Settings for deinterlacer
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Deinterlacer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Deinterlacer implements Serializable, Cloneable, StructuredPojo {

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE).
     * Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother
     * motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling
     * headline at the bottom of the frame.
     */
    private String algorithm;
    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     * progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force
     * mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not
     * progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will
     * probably result in lower quality video.
     */
    private String control;
    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. -
     * Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
     * 23.976p. - Adaptive auto-detects and converts to progressive.
     */
    private String mode;

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE).
     * Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother
     * motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling
     * headline at the bottom of the frame.
     * 
     * @param algorithm
     *        Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive
     *        (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND)
     *        produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a
     *        ticker, such as a scrolling headline at the bottom of the frame.
     * @see DeinterlaceAlgorithm
     */

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE).
     * Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother
     * motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling
     * headline at the bottom of the frame.
     * 
     * @return Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive
     *         (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND)
     *         produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a
     *         ticker, such as a scrolling headline at the bottom of the frame.
     * @see DeinterlaceAlgorithm
     */

    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE).
     * Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother
     * motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling
     * headline at the bottom of the frame.
     * 
     * @param algorithm
     *        Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive
     *        (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND)
     *        produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a
     *        ticker, such as a scrolling headline at the bottom of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlaceAlgorithm
     */

    public Deinterlacer withAlgorithm(String algorithm) {
        setAlgorithm(algorithm);
        return this;
    }

    /**
     * Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive (ADAPTIVE).
     * Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND) produces smoother
     * motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a ticker, such as a scrolling
     * headline at the bottom of the frame.
     * 
     * @param algorithm
     *        Only applies when you set Deinterlacer (DeinterlaceMode) to Deinterlace (DEINTERLACE) or Adaptive
     *        (ADAPTIVE). Motion adaptive interpolate (INTERPOLATE) produces sharper pictures, while blend (BLEND)
     *        produces smoother motion. Use (INTERPOLATE_TICKER) OR (BLEND_TICKER) if your source file includes a
     *        ticker, such as a scrolling headline at the bottom of the frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlaceAlgorithm
     */

    public Deinterlacer withAlgorithm(DeinterlaceAlgorithm algorithm) {
        this.algorithm = algorithm.toString();
        return this;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     * progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force
     * mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not
     * progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will
     * probably result in lower quality video.
     * 
     * @param control
     *        - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     *        progressive. It will only convert those that are tagged as some other type. - When set to
     *        FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already
     *        tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged
     *        frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are
     *        already progressive into progressive will probably result in lower quality video.
     * @see DeinterlacerControl
     */

    public void setControl(String control) {
        this.control = control;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     * progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force
     * mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not
     * progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will
     * probably result in lower quality video.
     * 
     * @return - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     *         progressive. It will only convert those that are tagged as some other type. - When set to
     *         FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already
     *         tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged
     *         frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are
     *         already progressive into progressive will probably result in lower quality video.
     * @see DeinterlacerControl
     */

    public String getControl() {
        return this.control;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     * progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force
     * mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not
     * progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will
     * probably result in lower quality video.
     * 
     * @param control
     *        - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     *        progressive. It will only convert those that are tagged as some other type. - When set to
     *        FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already
     *        tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged
     *        frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are
     *        already progressive into progressive will probably result in lower quality video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerControl
     */

    public Deinterlacer withControl(String control) {
        setControl(control);
        return this;
    }

    /**
     * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     * progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the
     * deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force
     * mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not
     * progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will
     * probably result in lower quality video.
     * 
     * @param control
     *        - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as
     *        progressive. It will only convert those that are tagged as some other type. - When set to
     *        FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already
     *        tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged
     *        frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are
     *        already progressive into progressive will probably result in lower quality video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerControl
     */

    public Deinterlacer withControl(DeinterlacerControl control) {
        this.control = control.toString();
        return this;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. -
     * Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
     * 23.976p. - Adaptive auto-detects and converts to progressive.
     * 
     * @param mode
     *        Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is
     *        Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine
     *        29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * @see DeinterlacerMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. -
     * Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
     * 23.976p. - Adaptive auto-detects and converts to progressive.
     * 
     * @return Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is
     *         Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine
     *         29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * @see DeinterlacerMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. -
     * Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
     * 23.976p. - Adaptive auto-detects and converts to progressive.
     * 
     * @param mode
     *        Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is
     *        Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine
     *        29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerMode
     */

    public Deinterlacer withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. -
     * Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive
     * 23.976p. - Adaptive auto-detects and converts to progressive.
     * 
     * @param mode
     *        Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is
     *        Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine
     *        29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeinterlacerMode
     */

    public Deinterlacer withMode(DeinterlacerMode mode) {
        this.mode = mode.toString();
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
        if (getAlgorithm() != null)
            sb.append("Algorithm: ").append(getAlgorithm()).append(",");
        if (getControl() != null)
            sb.append("Control: ").append(getControl()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Deinterlacer == false)
            return false;
        Deinterlacer other = (Deinterlacer) obj;
        if (other.getAlgorithm() == null ^ this.getAlgorithm() == null)
            return false;
        if (other.getAlgorithm() != null && other.getAlgorithm().equals(this.getAlgorithm()) == false)
            return false;
        if (other.getControl() == null ^ this.getControl() == null)
            return false;
        if (other.getControl() != null && other.getControl().equals(this.getControl()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAlgorithm() == null) ? 0 : getAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getControl() == null) ? 0 : getControl().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public Deinterlacer clone() {
        try {
            return (Deinterlacer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DeinterlacerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
