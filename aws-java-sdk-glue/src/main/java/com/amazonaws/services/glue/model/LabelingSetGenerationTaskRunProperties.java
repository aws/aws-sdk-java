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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies configuration properties for a labeling set generation task run.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/LabelingSetGenerationTaskRunProperties"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelingSetGenerationTaskRunProperties implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     * </p>
     */
    private String outputS3Path;

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     * </p>
     * 
     * @param outputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     */

    public void setOutputS3Path(String outputS3Path) {
        this.outputS3Path = outputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     * </p>
     * 
     * @return The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     */

    public String getOutputS3Path() {
        return this.outputS3Path;
    }

    /**
     * <p>
     * The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     * </p>
     * 
     * @param outputS3Path
     *        The Amazon Simple Storage Service (Amazon S3) path where you will generate the labeling set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelingSetGenerationTaskRunProperties withOutputS3Path(String outputS3Path) {
        setOutputS3Path(outputS3Path);
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
        if (getOutputS3Path() != null)
            sb.append("OutputS3Path: ").append(getOutputS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelingSetGenerationTaskRunProperties == false)
            return false;
        LabelingSetGenerationTaskRunProperties other = (LabelingSetGenerationTaskRunProperties) obj;
        if (other.getOutputS3Path() == null ^ this.getOutputS3Path() == null)
            return false;
        if (other.getOutputS3Path() != null && other.getOutputS3Path().equals(this.getOutputS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutputS3Path() == null) ? 0 : getOutputS3Path().hashCode());
        return hashCode;
    }

    @Override
    public LabelingSetGenerationTaskRunProperties clone() {
        try {
            return (LabelingSetGenerationTaskRunProperties) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.LabelingSetGenerationTaskRunPropertiesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
