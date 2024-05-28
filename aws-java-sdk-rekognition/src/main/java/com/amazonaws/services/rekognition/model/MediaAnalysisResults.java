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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the results for a media analysis job created with StartMediaAnalysisJob.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaAnalysisResults implements Serializable, Cloneable, StructuredPojo {

    private S3Object s3Object;
    /**
     * <p>
     * Information about the model versions for the features selected in a given job.
     * </p>
     */
    private MediaAnalysisModelVersions modelVersions;

    /**
     * @param s3Object
     */

    public void setS3Object(S3Object s3Object) {
        this.s3Object = s3Object;
    }

    /**
     * @return
     */

    public S3Object getS3Object() {
        return this.s3Object;
    }

    /**
     * @param s3Object
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisResults withS3Object(S3Object s3Object) {
        setS3Object(s3Object);
        return this;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given job.
     * </p>
     * 
     * @param modelVersions
     *        Information about the model versions for the features selected in a given job.
     */

    public void setModelVersions(MediaAnalysisModelVersions modelVersions) {
        this.modelVersions = modelVersions;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given job.
     * </p>
     * 
     * @return Information about the model versions for the features selected in a given job.
     */

    public MediaAnalysisModelVersions getModelVersions() {
        return this.modelVersions;
    }

    /**
     * <p>
     * Information about the model versions for the features selected in a given job.
     * </p>
     * 
     * @param modelVersions
     *        Information about the model versions for the features selected in a given job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaAnalysisResults withModelVersions(MediaAnalysisModelVersions modelVersions) {
        setModelVersions(modelVersions);
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
        if (getS3Object() != null)
            sb.append("S3Object: ").append(getS3Object()).append(",");
        if (getModelVersions() != null)
            sb.append("ModelVersions: ").append(getModelVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaAnalysisResults == false)
            return false;
        MediaAnalysisResults other = (MediaAnalysisResults) obj;
        if (other.getS3Object() == null ^ this.getS3Object() == null)
            return false;
        if (other.getS3Object() != null && other.getS3Object().equals(this.getS3Object()) == false)
            return false;
        if (other.getModelVersions() == null ^ this.getModelVersions() == null)
            return false;
        if (other.getModelVersions() != null && other.getModelVersions().equals(this.getModelVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Object() == null) ? 0 : getS3Object().hashCode());
        hashCode = prime * hashCode + ((getModelVersions() == null) ? 0 : getModelVersions().hashCode());
        return hashCode;
    }

    @Override
    public MediaAnalysisResults clone() {
        try {
            return (MediaAnalysisResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MediaAnalysisResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
