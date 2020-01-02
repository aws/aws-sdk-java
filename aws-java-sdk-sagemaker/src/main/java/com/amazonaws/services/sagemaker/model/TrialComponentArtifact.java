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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an input or output artifact of a trial component. You specify <code>TrialComponentArtifact</code> as part
 * of the <code>InputArtifacts</code> and <code>OutputArtifacts</code> parameters in the <a>CreateTrialComponent</a>
 * request.
 * </p>
 * <p>
 * Examples of input artifacts are datasets, algorithms, hyperparameters, source code, and instance types. Examples of
 * output artifacts are metrics, snapshots, logs, and images.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrialComponentArtifact" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrialComponentArtifact implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of
     * a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example, text/csv, image/jpeg,
     * and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
     * </p>
     */
    private String mediaType;
    /**
     * <p>
     * The location of the artifact.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of
     * a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example, text/csv, image/jpeg,
     * and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
     * </p>
     * 
     * @param mediaType
     *        The media type of the artifact, which indicates the type of data in the artifact file. The media type
     *        consists of a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example,
     *        text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the
     *        kind of data.
     */

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of
     * a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example, text/csv, image/jpeg,
     * and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
     * </p>
     * 
     * @return The media type of the artifact, which indicates the type of data in the artifact file. The media type
     *         consists of a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example,
     *         text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the
     *         kind of data.
     */

    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * <p>
     * The media type of the artifact, which indicates the type of data in the artifact file. The media type consists of
     * a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example, text/csv, image/jpeg,
     * and s3/uri. The type specifies the category of the media. The subtype specifies the kind of data.
     * </p>
     * 
     * @param mediaType
     *        The media type of the artifact, which indicates the type of data in the artifact file. The media type
     *        consists of a <i>type</i> and a <i>subtype</i> concatenated with a slash (/) character, for example,
     *        text/csv, image/jpeg, and s3/uri. The type specifies the category of the media. The subtype specifies the
     *        kind of data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentArtifact withMediaType(String mediaType) {
        setMediaType(mediaType);
        return this;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @param value
     *        The location of the artifact.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @return The location of the artifact.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The location of the artifact.
     * </p>
     * 
     * @param value
     *        The location of the artifact.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrialComponentArtifact withValue(String value) {
        setValue(value);
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
        if (getMediaType() != null)
            sb.append("MediaType: ").append(getMediaType()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrialComponentArtifact == false)
            return false;
        TrialComponentArtifact other = (TrialComponentArtifact) obj;
        if (other.getMediaType() == null ^ this.getMediaType() == null)
            return false;
        if (other.getMediaType() != null && other.getMediaType().equals(this.getMediaType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaType() == null) ? 0 : getMediaType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public TrialComponentArtifact clone() {
        try {
            return (TrialComponentArtifact) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialComponentArtifactMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
