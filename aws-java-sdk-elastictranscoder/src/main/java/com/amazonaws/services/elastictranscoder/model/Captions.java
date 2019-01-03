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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The captions to be created, if any.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Captions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A policy that determines how Elastic Transcoder handles the existence of multiple captions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * sidecar captions and ignores the embedded captions for that language.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * embedded captions and ignores the sidecar captions for that language. If <code>CaptionSources</code> is empty,
     * Elastic Transcoder omits all sidecar captions from the output files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     * <code>CaptionSources</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MergePolicy</code> cannot be null.
     * </p>
     */
    @Deprecated
    private String mergePolicy;
    /**
     * <p>
     * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions,
     * leave <code>CaptionSources</code> blank.
     * </p>
     */
    @Deprecated
    private com.amazonaws.internal.SdkInternalList<CaptionSource> captionSources;
    /**
     * <p>
     * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an
     * error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CaptionFormat> captionFormats;

    /**
     * <p>
     * A policy that determines how Elastic Transcoder handles the existence of multiple captions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * sidecar captions and ignores the embedded captions for that language.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * embedded captions and ignores the sidecar captions for that language. If <code>CaptionSources</code> is empty,
     * Elastic Transcoder omits all sidecar captions from the output files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     * <code>CaptionSources</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MergePolicy</code> cannot be null.
     * </p>
     * 
     * @param mergePolicy
     *        A policy that determines how Elastic Transcoder handles the existence of multiple captions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *        captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *        Transcoder uses the sidecar captions and ignores the embedded captions for that language.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *        captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *        Transcoder uses the embedded captions and ignores the sidecar captions for that language. If
     *        <code>CaptionSources</code> is empty, Elastic Transcoder omits all sidecar captions from the output files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     *        <code>CaptionSources</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>MergePolicy</code> cannot be null.
     */
    @Deprecated
    public void setMergePolicy(String mergePolicy) {
        this.mergePolicy = mergePolicy;
    }

    /**
     * <p>
     * A policy that determines how Elastic Transcoder handles the existence of multiple captions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * sidecar captions and ignores the embedded captions for that language.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * embedded captions and ignores the sidecar captions for that language. If <code>CaptionSources</code> is empty,
     * Elastic Transcoder omits all sidecar captions from the output files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     * <code>CaptionSources</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MergePolicy</code> cannot be null.
     * </p>
     * 
     * @return A policy that determines how Elastic Transcoder handles the existence of multiple captions.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *         captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *         Transcoder uses the sidecar captions and ignores the embedded captions for that language.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *         captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *         Transcoder uses the embedded captions and ignores the sidecar captions for that language. If
     *         <code>CaptionSources</code> is empty, Elastic Transcoder omits all sidecar captions from the output
     *         files.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     *         <code>CaptionSources</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>MergePolicy</code> cannot be null.
     */
    @Deprecated
    public String getMergePolicy() {
        return this.mergePolicy;
    }

    /**
     * <p>
     * A policy that determines how Elastic Transcoder handles the existence of multiple captions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * sidecar captions and ignores the embedded captions for that language.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If captions
     * for a language are embedded in the input file and also appear in a sidecar file, Elastic Transcoder uses the
     * embedded captions and ignores the sidecar captions for that language. If <code>CaptionSources</code> is empty,
     * Elastic Transcoder omits all sidecar captions from the output files.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     * <code>CaptionSources</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>MergePolicy</code> cannot be null.
     * </p>
     * 
     * @param mergePolicy
     *        A policy that determines how Elastic Transcoder handles the existence of multiple captions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MergeOverride:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *        captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *        Transcoder uses the sidecar captions and ignores the embedded captions for that language.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MergeRetain:</b> Elastic Transcoder transcodes both embedded and sidecar captions into outputs. If
     *        captions for a language are embedded in the input file and also appear in a sidecar file, Elastic
     *        Transcoder uses the embedded captions and ignores the sidecar captions for that language. If
     *        <code>CaptionSources</code> is empty, Elastic Transcoder omits all sidecar captions from the output files.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Override:</b> Elastic Transcoder transcodes only the sidecar captions that you specify in
     *        <code>CaptionSources</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>MergePolicy</code> cannot be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Captions withMergePolicy(String mergePolicy) {
        setMergePolicy(mergePolicy);
        return this;
    }

    /**
     * <p>
     * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions,
     * leave <code>CaptionSources</code> blank.
     * </p>
     * 
     * @return Source files for the input sidecar captions used during the transcoding process. To omit all sidecar
     *         captions, leave <code>CaptionSources</code> blank.
     */
    @Deprecated
    public java.util.List<CaptionSource> getCaptionSources() {
        if (captionSources == null) {
            captionSources = new com.amazonaws.internal.SdkInternalList<CaptionSource>();
        }
        return captionSources;
    }

    /**
     * <p>
     * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions,
     * leave <code>CaptionSources</code> blank.
     * </p>
     * 
     * @param captionSources
     *        Source files for the input sidecar captions used during the transcoding process. To omit all sidecar
     *        captions, leave <code>CaptionSources</code> blank.
     */
    @Deprecated
    public void setCaptionSources(java.util.Collection<CaptionSource> captionSources) {
        if (captionSources == null) {
            this.captionSources = null;
            return;
        }

        this.captionSources = new com.amazonaws.internal.SdkInternalList<CaptionSource>(captionSources);
    }

    /**
     * <p>
     * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions,
     * leave <code>CaptionSources</code> blank.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionSources(java.util.Collection)} or {@link #withCaptionSources(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param captionSources
     *        Source files for the input sidecar captions used during the transcoding process. To omit all sidecar
     *        captions, leave <code>CaptionSources</code> blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Captions withCaptionSources(CaptionSource... captionSources) {
        if (this.captionSources == null) {
            setCaptionSources(new com.amazonaws.internal.SdkInternalList<CaptionSource>(captionSources.length));
        }
        for (CaptionSource ele : captionSources) {
            this.captionSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Source files for the input sidecar captions used during the transcoding process. To omit all sidecar captions,
     * leave <code>CaptionSources</code> blank.
     * </p>
     * 
     * @param captionSources
     *        Source files for the input sidecar captions used during the transcoding process. To omit all sidecar
     *        captions, leave <code>CaptionSources</code> blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Captions withCaptionSources(java.util.Collection<CaptionSource> captionSources) {
        setCaptionSources(captionSources);
        return this;
    }

    /**
     * <p>
     * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an
     * error.
     * </p>
     * 
     * @return The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder
     *         returns an error.
     */

    public java.util.List<CaptionFormat> getCaptionFormats() {
        if (captionFormats == null) {
            captionFormats = new com.amazonaws.internal.SdkInternalList<CaptionFormat>();
        }
        return captionFormats;
    }

    /**
     * <p>
     * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an
     * error.
     * </p>
     * 
     * @param captionFormats
     *        The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder
     *        returns an error.
     */

    public void setCaptionFormats(java.util.Collection<CaptionFormat> captionFormats) {
        if (captionFormats == null) {
            this.captionFormats = null;
            return;
        }

        this.captionFormats = new com.amazonaws.internal.SdkInternalList<CaptionFormat>(captionFormats);
    }

    /**
     * <p>
     * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an
     * error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionFormats(java.util.Collection)} or {@link #withCaptionFormats(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param captionFormats
     *        The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder
     *        returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Captions withCaptionFormats(CaptionFormat... captionFormats) {
        if (this.captionFormats == null) {
            setCaptionFormats(new com.amazonaws.internal.SdkInternalList<CaptionFormat>(captionFormats.length));
        }
        for (CaptionFormat ele : captionFormats) {
            this.captionFormats.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder returns an
     * error.
     * </p>
     * 
     * @param captionFormats
     *        The array of file formats for the output captions. If you leave this value blank, Elastic Transcoder
     *        returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Captions withCaptionFormats(java.util.Collection<CaptionFormat> captionFormats) {
        setCaptionFormats(captionFormats);
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
        if (getMergePolicy() != null)
            sb.append("MergePolicy: ").append(getMergePolicy()).append(",");
        if (getCaptionSources() != null)
            sb.append("CaptionSources: ").append(getCaptionSources()).append(",");
        if (getCaptionFormats() != null)
            sb.append("CaptionFormats: ").append(getCaptionFormats());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Captions == false)
            return false;
        Captions other = (Captions) obj;
        if (other.getMergePolicy() == null ^ this.getMergePolicy() == null)
            return false;
        if (other.getMergePolicy() != null && other.getMergePolicy().equals(this.getMergePolicy()) == false)
            return false;
        if (other.getCaptionSources() == null ^ this.getCaptionSources() == null)
            return false;
        if (other.getCaptionSources() != null && other.getCaptionSources().equals(this.getCaptionSources()) == false)
            return false;
        if (other.getCaptionFormats() == null ^ this.getCaptionFormats() == null)
            return false;
        if (other.getCaptionFormats() != null && other.getCaptionFormats().equals(this.getCaptionFormats()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMergePolicy() == null) ? 0 : getMergePolicy().hashCode());
        hashCode = prime * hashCode + ((getCaptionSources() == null) ? 0 : getCaptionSources().hashCode());
        hashCode = prime * hashCode + ((getCaptionFormats() == null) ? 0 : getCaptionFormats().hashCode());
        return hashCode;
    }

    @Override
    public Captions clone() {
        try {
            return (Captions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.CaptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
