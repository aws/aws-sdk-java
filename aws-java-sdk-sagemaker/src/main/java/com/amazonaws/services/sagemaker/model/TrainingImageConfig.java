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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration to use an image from a private Docker registry for a training job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/TrainingImageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrainingImageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The method that your training job will use to gain access to the images in your private Docker registry. For
     * access to an image in a private Docker registry, set to <code>Vpc</code>.
     * </p>
     */
    private String trainingRepositoryAccessMode;
    /**
     * <p>
     * An object containing authentication information for a private Docker registry containing your training images.
     * </p>
     */
    private TrainingRepositoryAuthConfig trainingRepositoryAuthConfig;

    /**
     * <p>
     * The method that your training job will use to gain access to the images in your private Docker registry. For
     * access to an image in a private Docker registry, set to <code>Vpc</code>.
     * </p>
     * 
     * @param trainingRepositoryAccessMode
     *        The method that your training job will use to gain access to the images in your private Docker registry.
     *        For access to an image in a private Docker registry, set to <code>Vpc</code>.
     * @see TrainingRepositoryAccessMode
     */

    public void setTrainingRepositoryAccessMode(String trainingRepositoryAccessMode) {
        this.trainingRepositoryAccessMode = trainingRepositoryAccessMode;
    }

    /**
     * <p>
     * The method that your training job will use to gain access to the images in your private Docker registry. For
     * access to an image in a private Docker registry, set to <code>Vpc</code>.
     * </p>
     * 
     * @return The method that your training job will use to gain access to the images in your private Docker registry.
     *         For access to an image in a private Docker registry, set to <code>Vpc</code>.
     * @see TrainingRepositoryAccessMode
     */

    public String getTrainingRepositoryAccessMode() {
        return this.trainingRepositoryAccessMode;
    }

    /**
     * <p>
     * The method that your training job will use to gain access to the images in your private Docker registry. For
     * access to an image in a private Docker registry, set to <code>Vpc</code>.
     * </p>
     * 
     * @param trainingRepositoryAccessMode
     *        The method that your training job will use to gain access to the images in your private Docker registry.
     *        For access to an image in a private Docker registry, set to <code>Vpc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingRepositoryAccessMode
     */

    public TrainingImageConfig withTrainingRepositoryAccessMode(String trainingRepositoryAccessMode) {
        setTrainingRepositoryAccessMode(trainingRepositoryAccessMode);
        return this;
    }

    /**
     * <p>
     * The method that your training job will use to gain access to the images in your private Docker registry. For
     * access to an image in a private Docker registry, set to <code>Vpc</code>.
     * </p>
     * 
     * @param trainingRepositoryAccessMode
     *        The method that your training job will use to gain access to the images in your private Docker registry.
     *        For access to an image in a private Docker registry, set to <code>Vpc</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingRepositoryAccessMode
     */

    public TrainingImageConfig withTrainingRepositoryAccessMode(TrainingRepositoryAccessMode trainingRepositoryAccessMode) {
        this.trainingRepositoryAccessMode = trainingRepositoryAccessMode.toString();
        return this;
    }

    /**
     * <p>
     * An object containing authentication information for a private Docker registry containing your training images.
     * </p>
     * 
     * @param trainingRepositoryAuthConfig
     *        An object containing authentication information for a private Docker registry containing your training
     *        images.
     */

    public void setTrainingRepositoryAuthConfig(TrainingRepositoryAuthConfig trainingRepositoryAuthConfig) {
        this.trainingRepositoryAuthConfig = trainingRepositoryAuthConfig;
    }

    /**
     * <p>
     * An object containing authentication information for a private Docker registry containing your training images.
     * </p>
     * 
     * @return An object containing authentication information for a private Docker registry containing your training
     *         images.
     */

    public TrainingRepositoryAuthConfig getTrainingRepositoryAuthConfig() {
        return this.trainingRepositoryAuthConfig;
    }

    /**
     * <p>
     * An object containing authentication information for a private Docker registry containing your training images.
     * </p>
     * 
     * @param trainingRepositoryAuthConfig
     *        An object containing authentication information for a private Docker registry containing your training
     *        images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrainingImageConfig withTrainingRepositoryAuthConfig(TrainingRepositoryAuthConfig trainingRepositoryAuthConfig) {
        setTrainingRepositoryAuthConfig(trainingRepositoryAuthConfig);
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
        if (getTrainingRepositoryAccessMode() != null)
            sb.append("TrainingRepositoryAccessMode: ").append(getTrainingRepositoryAccessMode()).append(",");
        if (getTrainingRepositoryAuthConfig() != null)
            sb.append("TrainingRepositoryAuthConfig: ").append(getTrainingRepositoryAuthConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrainingImageConfig == false)
            return false;
        TrainingImageConfig other = (TrainingImageConfig) obj;
        if (other.getTrainingRepositoryAccessMode() == null ^ this.getTrainingRepositoryAccessMode() == null)
            return false;
        if (other.getTrainingRepositoryAccessMode() != null && other.getTrainingRepositoryAccessMode().equals(this.getTrainingRepositoryAccessMode()) == false)
            return false;
        if (other.getTrainingRepositoryAuthConfig() == null ^ this.getTrainingRepositoryAuthConfig() == null)
            return false;
        if (other.getTrainingRepositoryAuthConfig() != null && other.getTrainingRepositoryAuthConfig().equals(this.getTrainingRepositoryAuthConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrainingRepositoryAccessMode() == null) ? 0 : getTrainingRepositoryAccessMode().hashCode());
        hashCode = prime * hashCode + ((getTrainingRepositoryAuthConfig() == null) ? 0 : getTrainingRepositoryAuthConfig().hashCode());
        return hashCode;
    }

    @Override
    public TrainingImageConfig clone() {
        try {
            return (TrainingImageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrainingImageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
