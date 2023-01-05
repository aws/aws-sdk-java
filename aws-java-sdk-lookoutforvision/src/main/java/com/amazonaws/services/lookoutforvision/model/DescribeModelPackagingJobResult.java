/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lookoutforvision.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutvision-2020-11-20/DescribeModelPackagingJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeModelPackagingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the model packaging job.
     * </p>
     */
    private ModelPackagingDescription modelPackagingDescription;

    /**
     * <p>
     * The description of the model packaging job.
     * </p>
     * 
     * @param modelPackagingDescription
     *        The description of the model packaging job.
     */

    public void setModelPackagingDescription(ModelPackagingDescription modelPackagingDescription) {
        this.modelPackagingDescription = modelPackagingDescription;
    }

    /**
     * <p>
     * The description of the model packaging job.
     * </p>
     * 
     * @return The description of the model packaging job.
     */

    public ModelPackagingDescription getModelPackagingDescription() {
        return this.modelPackagingDescription;
    }

    /**
     * <p>
     * The description of the model packaging job.
     * </p>
     * 
     * @param modelPackagingDescription
     *        The description of the model packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeModelPackagingJobResult withModelPackagingDescription(ModelPackagingDescription modelPackagingDescription) {
        setModelPackagingDescription(modelPackagingDescription);
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
        if (getModelPackagingDescription() != null)
            sb.append("ModelPackagingDescription: ").append(getModelPackagingDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeModelPackagingJobResult == false)
            return false;
        DescribeModelPackagingJobResult other = (DescribeModelPackagingJobResult) obj;
        if (other.getModelPackagingDescription() == null ^ this.getModelPackagingDescription() == null)
            return false;
        if (other.getModelPackagingDescription() != null && other.getModelPackagingDescription().equals(this.getModelPackagingDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelPackagingDescription() == null) ? 0 : getModelPackagingDescription().hashCode());
        return hashCode;
    }

    @Override
    public DescribeModelPackagingJobResult clone() {
        try {
            return (DescribeModelPackagingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
