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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for MP4 segments in DASH
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MpdSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MpdSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     */
    private String captionContainerType;
    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     */
    private String scte35Esam;
    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     */
    private String scte35Source;

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */

    public void setCaptionContainerType(String captionContainerType) {
        this.captionContainerType = captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @return Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *         sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a
     *         single XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *         contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *         audio fragmented MP4 files.
     * @see MpdCaptionContainerType
     */

    public String getCaptionContainerType() {
        return this.captionContainerType;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdCaptionContainerType
     */

    public MpdSettings withCaptionContainerType(String captionContainerType) {
        setCaptionContainerType(captionContainerType);
        return this;
    }

    /**
     * Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify sidecar
     * captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single XML file in a
     * raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format contained within fragmented
     * MP4 files. This set of fragmented MP4 files is separate from your video and audio fragmented MP4 files.
     * 
     * @param captionContainerType
     *        Use this setting only in DASH output groups that include sidecar TTML or IMSC captions. You specify
     *        sidecar captions in a separate output from your audio and video. Choose Raw (RAW) for captions in a single
     *        XML file in a raw container. Choose Fragmented MPEG-4 (FRAGMENTED_MP4) for captions in XML format
     *        contained within fragmented MP4 files. This set of fragmented MP4 files is separate from your video and
     *        audio fragmented MP4 files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdCaptionContainerType
     */

    public MpdSettings withCaptionContainerType(MpdCaptionContainerType captionContainerType) {
        this.captionContainerType = captionContainerType.toString();
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @see MpdScte35Esam
     */

    public void setScte35Esam(String scte35Esam) {
        this.scte35Esam = scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @return Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *         this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *         setting SCC XML (sccXml).
     * @see MpdScte35Esam
     */

    public String getScte35Esam() {
        return this.scte35Esam;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdScte35Esam
     */

    public MpdSettings withScte35Esam(String scte35Esam) {
        setScte35Esam(scte35Esam);
        return this;
    }

    /**
     * Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in this
     * output at the insertion points that you specify in an ESAM XML document. Provide the document in the setting SCC
     * XML (sccXml).
     * 
     * @param scte35Esam
     *        Use this setting only when you specify SCTE-35 markers from ESAM. Choose INSERT to put SCTE-35 markers in
     *        this output at the insertion points that you specify in an ESAM XML document. Provide the document in the
     *        setting SCC XML (sccXml).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdScte35Esam
     */

    public MpdSettings withScte35Esam(MpdScte35Esam scte35Esam) {
        this.scte35Esam = scte35Esam.toString();
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @see MpdScte35Source
     */

    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @return Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *         (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *         None (NONE) if you don't want those SCTE-35 markers in this output.
     * @see MpdScte35Source
     */

    public String getScte35Source() {
        return this.scte35Source;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdScte35Source
     */

    public MpdSettings withScte35Source(String scte35Source) {
        setScte35Source(scte35Source);
        return this;
    }

    /**
     * Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough (PASSTHROUGH) if
     * you want SCTE-35 markers that appear in your input to also appear in this output. Choose None (NONE) if you don't
     * want those SCTE-35 markers in this output.
     * 
     * @param scte35Source
     *        Ignore this setting unless you have SCTE-35 markers in your input video file. Choose Passthrough
     *        (PASSTHROUGH) if you want SCTE-35 markers that appear in your input to also appear in this output. Choose
     *        None (NONE) if you don't want those SCTE-35 markers in this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MpdScte35Source
     */

    public MpdSettings withScte35Source(MpdScte35Source scte35Source) {
        this.scte35Source = scte35Source.toString();
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
        if (getCaptionContainerType() != null)
            sb.append("CaptionContainerType: ").append(getCaptionContainerType()).append(",");
        if (getScte35Esam() != null)
            sb.append("Scte35Esam: ").append(getScte35Esam()).append(",");
        if (getScte35Source() != null)
            sb.append("Scte35Source: ").append(getScte35Source());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MpdSettings == false)
            return false;
        MpdSettings other = (MpdSettings) obj;
        if (other.getCaptionContainerType() == null ^ this.getCaptionContainerType() == null)
            return false;
        if (other.getCaptionContainerType() != null && other.getCaptionContainerType().equals(this.getCaptionContainerType()) == false)
            return false;
        if (other.getScte35Esam() == null ^ this.getScte35Esam() == null)
            return false;
        if (other.getScte35Esam() != null && other.getScte35Esam().equals(this.getScte35Esam()) == false)
            return false;
        if (other.getScte35Source() == null ^ this.getScte35Source() == null)
            return false;
        if (other.getScte35Source() != null && other.getScte35Source().equals(this.getScte35Source()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCaptionContainerType() == null) ? 0 : getCaptionContainerType().hashCode());
        hashCode = prime * hashCode + ((getScte35Esam() == null) ? 0 : getScte35Esam().hashCode());
        hashCode = prime * hashCode + ((getScte35Source() == null) ? 0 : getScte35Source().hashCode());
        return hashCode;
    }

    @Override
    public MpdSettings clone() {
        try {
            return (MpdSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MpdSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
