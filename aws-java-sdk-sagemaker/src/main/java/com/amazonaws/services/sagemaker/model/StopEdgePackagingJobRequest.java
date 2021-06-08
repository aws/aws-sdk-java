/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StopEdgePackagingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopEdgePackagingJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     */
    private String edgePackagingJobName;

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     */

    public void setEdgePackagingJobName(String edgePackagingJobName) {
        this.edgePackagingJobName = edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @return The name of the edge packaging job.
     */

    public String getEdgePackagingJobName() {
        return this.edgePackagingJobName;
    }

    /**
     * <p>
     * The name of the edge packaging job.
     * </p>
     * 
     * @param edgePackagingJobName
     *        The name of the edge packaging job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopEdgePackagingJobRequest withEdgePackagingJobName(String edgePackagingJobName) {
        setEdgePackagingJobName(edgePackagingJobName);
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
        if (getEdgePackagingJobName() != null)
            sb.append("EdgePackagingJobName: ").append(getEdgePackagingJobName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopEdgePackagingJobRequest == false)
            return false;
        StopEdgePackagingJobRequest other = (StopEdgePackagingJobRequest) obj;
        if (other.getEdgePackagingJobName() == null ^ this.getEdgePackagingJobName() == null)
            return false;
        if (other.getEdgePackagingJobName() != null && other.getEdgePackagingJobName().equals(this.getEdgePackagingJobName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEdgePackagingJobName() == null) ? 0 : getEdgePackagingJobName().hashCode());
        return hashCode;
    }

    @Override
    public StopEdgePackagingJobRequest clone() {
        return (StopEdgePackagingJobRequest) super.clone();
    }

}
