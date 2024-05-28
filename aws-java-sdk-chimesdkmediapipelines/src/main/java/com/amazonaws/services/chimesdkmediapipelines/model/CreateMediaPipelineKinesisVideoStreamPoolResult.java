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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaPipelineKinesisVideoStreamPool"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaPipelineKinesisVideoStreamPoolResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The configuration for the Kinesis video stream pool.
     * </p>
     */
    private KinesisVideoStreamPoolConfiguration kinesisVideoStreamPoolConfiguration;

    /**
     * <p>
     * The configuration for the Kinesis video stream pool.
     * </p>
     * 
     * @param kinesisVideoStreamPoolConfiguration
     *        The configuration for the Kinesis video stream pool.
     */

    public void setKinesisVideoStreamPoolConfiguration(KinesisVideoStreamPoolConfiguration kinesisVideoStreamPoolConfiguration) {
        this.kinesisVideoStreamPoolConfiguration = kinesisVideoStreamPoolConfiguration;
    }

    /**
     * <p>
     * The configuration for the Kinesis video stream pool.
     * </p>
     * 
     * @return The configuration for the Kinesis video stream pool.
     */

    public KinesisVideoStreamPoolConfiguration getKinesisVideoStreamPoolConfiguration() {
        return this.kinesisVideoStreamPoolConfiguration;
    }

    /**
     * <p>
     * The configuration for the Kinesis video stream pool.
     * </p>
     * 
     * @param kinesisVideoStreamPoolConfiguration
     *        The configuration for the Kinesis video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaPipelineKinesisVideoStreamPoolResult withKinesisVideoStreamPoolConfiguration(
            KinesisVideoStreamPoolConfiguration kinesisVideoStreamPoolConfiguration) {
        setKinesisVideoStreamPoolConfiguration(kinesisVideoStreamPoolConfiguration);
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
        if (getKinesisVideoStreamPoolConfiguration() != null)
            sb.append("KinesisVideoStreamPoolConfiguration: ").append(getKinesisVideoStreamPoolConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaPipelineKinesisVideoStreamPoolResult == false)
            return false;
        CreateMediaPipelineKinesisVideoStreamPoolResult other = (CreateMediaPipelineKinesisVideoStreamPoolResult) obj;
        if (other.getKinesisVideoStreamPoolConfiguration() == null ^ this.getKinesisVideoStreamPoolConfiguration() == null)
            return false;
        if (other.getKinesisVideoStreamPoolConfiguration() != null
                && other.getKinesisVideoStreamPoolConfiguration().equals(this.getKinesisVideoStreamPoolConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKinesisVideoStreamPoolConfiguration() == null) ? 0 : getKinesisVideoStreamPoolConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaPipelineKinesisVideoStreamPoolResult clone() {
        try {
            return (CreateMediaPipelineKinesisVideoStreamPoolResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
