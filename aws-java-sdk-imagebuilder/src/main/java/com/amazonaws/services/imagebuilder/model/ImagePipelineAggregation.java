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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains vulnerability counts for a specific image pipeline.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ImagePipelineAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImagePipelineAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     * </p>
     */
    private String imagePipelineArn;
    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for
     * the specified image pipeline.
     * </p>
     */
    private SeverityCounts severityCounts;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     */

    public void setImagePipelineArn(String imagePipelineArn) {
        this.imagePipelineArn = imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     */

    public String getImagePipelineArn() {
        return this.imagePipelineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     * </p>
     * 
     * @param imagePipelineArn
     *        The Amazon Resource Name (ARN) that identifies the image pipeline for this aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipelineAggregation withImagePipelineArn(String imagePipelineArn) {
        setImagePipelineArn(imagePipelineArn);
        return this;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for
     * the specified image pipeline.
     * </p>
     * 
     * @param severityCounts
     *        Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *        findings for the specified image pipeline.
     */

    public void setSeverityCounts(SeverityCounts severityCounts) {
        this.severityCounts = severityCounts;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for
     * the specified image pipeline.
     * </p>
     * 
     * @return Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *         findings for the specified image pipeline.
     */

    public SeverityCounts getSeverityCounts() {
        return this.severityCounts;
    }

    /**
     * <p>
     * Counts by severity level for medium severity and higher level findings, plus a total for all of the findings for
     * the specified image pipeline.
     * </p>
     * 
     * @param severityCounts
     *        Counts by severity level for medium severity and higher level findings, plus a total for all of the
     *        findings for the specified image pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImagePipelineAggregation withSeverityCounts(SeverityCounts severityCounts) {
        setSeverityCounts(severityCounts);
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
        if (getImagePipelineArn() != null)
            sb.append("ImagePipelineArn: ").append(getImagePipelineArn()).append(",");
        if (getSeverityCounts() != null)
            sb.append("SeverityCounts: ").append(getSeverityCounts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImagePipelineAggregation == false)
            return false;
        ImagePipelineAggregation other = (ImagePipelineAggregation) obj;
        if (other.getImagePipelineArn() == null ^ this.getImagePipelineArn() == null)
            return false;
        if (other.getImagePipelineArn() != null && other.getImagePipelineArn().equals(this.getImagePipelineArn()) == false)
            return false;
        if (other.getSeverityCounts() == null ^ this.getSeverityCounts() == null)
            return false;
        if (other.getSeverityCounts() != null && other.getSeverityCounts().equals(this.getSeverityCounts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImagePipelineArn() == null) ? 0 : getImagePipelineArn().hashCode());
        hashCode = prime * hashCode + ((getSeverityCounts() == null) ? 0 : getSeverityCounts().hashCode());
        return hashCode;
    }

    @Override
    public ImagePipelineAggregation clone() {
        try {
            return (ImagePipelineAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.ImagePipelineAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
