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
package com.amazonaws.services.emrserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The specifications for a worker type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-serverless-2021-07-13/WorkerTypeSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkerTypeSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The image configuration for a worker type.
     * </p>
     */
    private ImageConfiguration imageConfiguration;

    /**
     * <p>
     * The image configuration for a worker type.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration for a worker type.
     */

    public void setImageConfiguration(ImageConfiguration imageConfiguration) {
        this.imageConfiguration = imageConfiguration;
    }

    /**
     * <p>
     * The image configuration for a worker type.
     * </p>
     * 
     * @return The image configuration for a worker type.
     */

    public ImageConfiguration getImageConfiguration() {
        return this.imageConfiguration;
    }

    /**
     * <p>
     * The image configuration for a worker type.
     * </p>
     * 
     * @param imageConfiguration
     *        The image configuration for a worker type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkerTypeSpecification withImageConfiguration(ImageConfiguration imageConfiguration) {
        setImageConfiguration(imageConfiguration);
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
        if (getImageConfiguration() != null)
            sb.append("ImageConfiguration: ").append(getImageConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkerTypeSpecification == false)
            return false;
        WorkerTypeSpecification other = (WorkerTypeSpecification) obj;
        if (other.getImageConfiguration() == null ^ this.getImageConfiguration() == null)
            return false;
        if (other.getImageConfiguration() != null && other.getImageConfiguration().equals(this.getImageConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImageConfiguration() == null) ? 0 : getImageConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public WorkerTypeSpecification clone() {
        try {
            return (WorkerTypeSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrserverless.model.transform.WorkerTypeSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
