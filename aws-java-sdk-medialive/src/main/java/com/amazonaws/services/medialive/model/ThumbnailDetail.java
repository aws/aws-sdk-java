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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Thumbnail details for one pipeline of a running channel.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ThumbnailDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThumbnailDetail implements Serializable, Cloneable, StructuredPojo {

    /** Pipeline ID */
    private String pipelineId;
    /** thumbnails of a single pipeline */
    private java.util.List<Thumbnail> thumbnails;

    /**
     * Pipeline ID
     * 
     * @param pipelineId
     *        Pipeline ID
     */

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    /**
     * Pipeline ID
     * 
     * @return Pipeline ID
     */

    public String getPipelineId() {
        return this.pipelineId;
    }

    /**
     * Pipeline ID
     * 
     * @param pipelineId
     *        Pipeline ID
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThumbnailDetail withPipelineId(String pipelineId) {
        setPipelineId(pipelineId);
        return this;
    }

    /**
     * thumbnails of a single pipeline
     * 
     * @return thumbnails of a single pipeline
     */

    public java.util.List<Thumbnail> getThumbnails() {
        return thumbnails;
    }

    /**
     * thumbnails of a single pipeline
     * 
     * @param thumbnails
     *        thumbnails of a single pipeline
     */

    public void setThumbnails(java.util.Collection<Thumbnail> thumbnails) {
        if (thumbnails == null) {
            this.thumbnails = null;
            return;
        }

        this.thumbnails = new java.util.ArrayList<Thumbnail>(thumbnails);
    }

    /**
     * thumbnails of a single pipeline
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setThumbnails(java.util.Collection)} or {@link #withThumbnails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param thumbnails
     *        thumbnails of a single pipeline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThumbnailDetail withThumbnails(Thumbnail... thumbnails) {
        if (this.thumbnails == null) {
            setThumbnails(new java.util.ArrayList<Thumbnail>(thumbnails.length));
        }
        for (Thumbnail ele : thumbnails) {
            this.thumbnails.add(ele);
        }
        return this;
    }

    /**
     * thumbnails of a single pipeline
     * 
     * @param thumbnails
     *        thumbnails of a single pipeline
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThumbnailDetail withThumbnails(java.util.Collection<Thumbnail> thumbnails) {
        setThumbnails(thumbnails);
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
        if (getPipelineId() != null)
            sb.append("PipelineId: ").append(getPipelineId()).append(",");
        if (getThumbnails() != null)
            sb.append("Thumbnails: ").append(getThumbnails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThumbnailDetail == false)
            return false;
        ThumbnailDetail other = (ThumbnailDetail) obj;
        if (other.getPipelineId() == null ^ this.getPipelineId() == null)
            return false;
        if (other.getPipelineId() != null && other.getPipelineId().equals(this.getPipelineId()) == false)
            return false;
        if (other.getThumbnails() == null ^ this.getThumbnails() == null)
            return false;
        if (other.getThumbnails() != null && other.getThumbnails().equals(this.getThumbnails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineId() == null) ? 0 : getPipelineId().hashCode());
        hashCode = prime * hashCode + ((getThumbnails() == null) ? 0 : getThumbnails().hashCode());
        return hashCode;
    }

    @Override
    public ThumbnailDetail clone() {
        try {
            return (ThumbnailDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.ThumbnailDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
