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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object that describes which renditions should be recorded for a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/RenditionConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RenditionConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     * <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     * specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * </p>
     */
    private String renditionSelection;
    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     */
    private java.util.List<String> renditions;

    /**
     * <p>
     * Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     * <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     * specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * </p>
     * 
     * @param renditionSelection
     *        Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     *        <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     *        specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * @see RenditionConfigurationRenditionSelection
     */

    public void setRenditionSelection(String renditionSelection) {
        this.renditionSelection = renditionSelection;
    }

    /**
     * <p>
     * Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     * <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     * specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * </p>
     * 
     * @return Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     *         <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     *         specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * @see RenditionConfigurationRenditionSelection
     */

    public String getRenditionSelection() {
        return this.renditionSelection;
    }

    /**
     * <p>
     * Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     * <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     * specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * </p>
     * 
     * @param renditionSelection
     *        Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     *        <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     *        specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenditionConfigurationRenditionSelection
     */

    public RenditionConfiguration withRenditionSelection(String renditionSelection) {
        setRenditionSelection(renditionSelection);
        return this;
    }

    /**
     * <p>
     * Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     * <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     * specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * </p>
     * 
     * @param renditionSelection
     *        Indicates which set of renditions are recorded for a stream. For <code>BASIC</code> channels, the
     *        <code>CUSTOM</code> value has no effect. If <code>CUSTOM</code> is specified, a set of renditions must be
     *        specified in the <code>renditions</code> field. Default: <code>ALL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenditionConfigurationRenditionSelection
     */

    public RenditionConfiguration withRenditionSelection(RenditionConfigurationRenditionSelection renditionSelection) {
        this.renditionSelection = renditionSelection.toString();
        return this;
    }

    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     * 
     * @return Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is
     *         <code>CUSTOM</code>; otherwise, this field is irrelevant. The selected renditions are recorded if they
     *         are available during the stream. If a selected rendition is unavailable, the best available rendition is
     *         recorded. For details on the resolution dimensions of each rendition, see <a
     *         href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * @see RenditionConfigurationRendition
     */

    public java.util.List<String> getRenditions() {
        return renditions;
    }

    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     * 
     * @param renditions
     *        Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is
     *        <code>CUSTOM</code>; otherwise, this field is irrelevant. The selected renditions are recorded if they are
     *        available during the stream. If a selected rendition is unavailable, the best available rendition is
     *        recorded. For details on the resolution dimensions of each rendition, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * @see RenditionConfigurationRendition
     */

    public void setRenditions(java.util.Collection<String> renditions) {
        if (renditions == null) {
            this.renditions = null;
            return;
        }

        this.renditions = new java.util.ArrayList<String>(renditions);
    }

    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRenditions(java.util.Collection)} or {@link #withRenditions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param renditions
     *        Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is
     *        <code>CUSTOM</code>; otherwise, this field is irrelevant. The selected renditions are recorded if they are
     *        available during the stream. If a selected rendition is unavailable, the best available rendition is
     *        recorded. For details on the resolution dimensions of each rendition, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenditionConfigurationRendition
     */

    public RenditionConfiguration withRenditions(String... renditions) {
        if (this.renditions == null) {
            setRenditions(new java.util.ArrayList<String>(renditions.length));
        }
        for (String ele : renditions) {
            this.renditions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     * 
     * @param renditions
     *        Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is
     *        <code>CUSTOM</code>; otherwise, this field is irrelevant. The selected renditions are recorded if they are
     *        available during the stream. If a selected rendition is unavailable, the best available rendition is
     *        recorded. For details on the resolution dimensions of each rendition, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenditionConfigurationRendition
     */

    public RenditionConfiguration withRenditions(java.util.Collection<String> renditions) {
        setRenditions(renditions);
        return this;
    }

    /**
     * <p>
     * Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is <code>CUSTOM</code>;
     * otherwise, this field is irrelevant. The selected renditions are recorded if they are available during the
     * stream. If a selected rendition is unavailable, the best available rendition is recorded. For details on the
     * resolution dimensions of each rendition, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * </p>
     * 
     * @param renditions
     *        Indicates which renditions are recorded for a stream, if <code>renditionSelection</code> is
     *        <code>CUSTOM</code>; otherwise, this field is irrelevant. The selected renditions are recorded if they are
     *        available during the stream. If a selected rendition is unavailable, the best available rendition is
     *        recorded. For details on the resolution dimensions of each rendition, see <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RenditionConfigurationRendition
     */

    public RenditionConfiguration withRenditions(RenditionConfigurationRendition... renditions) {
        java.util.ArrayList<String> renditionsCopy = new java.util.ArrayList<String>(renditions.length);
        for (RenditionConfigurationRendition value : renditions) {
            renditionsCopy.add(value.toString());
        }
        if (getRenditions() == null) {
            setRenditions(renditionsCopy);
        } else {
            getRenditions().addAll(renditionsCopy);
        }
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
        if (getRenditionSelection() != null)
            sb.append("RenditionSelection: ").append(getRenditionSelection()).append(",");
        if (getRenditions() != null)
            sb.append("Renditions: ").append(getRenditions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RenditionConfiguration == false)
            return false;
        RenditionConfiguration other = (RenditionConfiguration) obj;
        if (other.getRenditionSelection() == null ^ this.getRenditionSelection() == null)
            return false;
        if (other.getRenditionSelection() != null && other.getRenditionSelection().equals(this.getRenditionSelection()) == false)
            return false;
        if (other.getRenditions() == null ^ this.getRenditions() == null)
            return false;
        if (other.getRenditions() != null && other.getRenditions().equals(this.getRenditions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRenditionSelection() == null) ? 0 : getRenditionSelection().hashCode());
        hashCode = prime * hashCode + ((getRenditions() == null) ? 0 : getRenditions().hashCode());
        return hashCode;
    }

    @Override
    public RenditionConfiguration clone() {
        try {
            return (RenditionConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.RenditionConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
