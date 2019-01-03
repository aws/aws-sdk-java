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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopTransformJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopTransformJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     */
    private String transformJobName;

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job to stop.
     */

    public void setTransformJobName(String transformJobName) {
        this.transformJobName = transformJobName;
    }

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * 
     * @return The name of the transform job to stop.
     */

    public String getTransformJobName() {
        return this.transformJobName;
    }

    /**
     * <p>
     * The name of the transform job to stop.
     * </p>
     * 
     * @param transformJobName
     *        The name of the transform job to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopTransformJobRequest withTransformJobName(String transformJobName) {
        setTransformJobName(transformJobName);
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
        if (getTransformJobName() != null)
            sb.append("TransformJobName: ").append(getTransformJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopTransformJobRequest == false)
            return false;
        StopTransformJobRequest other = (StopTransformJobRequest) obj;
        if (other.getTransformJobName() == null ^ this.getTransformJobName() == null)
            return false;
        if (other.getTransformJobName() != null && other.getTransformJobName().equals(this.getTransformJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTransformJobName() == null) ? 0 : getTransformJobName().hashCode());
        return hashCode;
    }

    @Override
    public StopTransformJobRequest clone() {
        return (StopTransformJobRequest) super.clone();
    }

}
