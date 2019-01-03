/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateTransformJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTransformJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     */
    private String transformJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     */

    public void setTransformJobArn(String transformJobArn) {
        this.transformJobArn = transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the transform job.
     */

    public String getTransformJobArn() {
        return this.transformJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the transform job.
     * </p>
     * 
     * @param transformJobArn
     *        The Amazon Resource Name (ARN) of the transform job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTransformJobResult withTransformJobArn(String transformJobArn) {
        setTransformJobArn(transformJobArn);
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
        if (getTransformJobArn() != null)
            sb.append("TransformJobArn: ").append(getTransformJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTransformJobResult == false)
            return false;
        CreateTransformJobResult other = (CreateTransformJobResult) obj;
        if (other.getTransformJobArn() == null ^ this.getTransformJobArn() == null)
            return false;
        if (other.getTransformJobArn() != null && other.getTransformJobArn().equals(this.getTransformJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformJobArn() == null) ? 0 : getTransformJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateTransformJobResult clone() {
        try {
            return (CreateTransformJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
