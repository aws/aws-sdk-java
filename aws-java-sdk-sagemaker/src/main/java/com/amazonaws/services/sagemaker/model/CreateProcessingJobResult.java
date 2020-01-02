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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateProcessingJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateProcessingJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     */
    private String processingJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job.
     */

    public void setProcessingJobArn(String processingJobArn) {
        this.processingJobArn = processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the processing job.
     */

    public String getProcessingJobArn() {
        return this.processingJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the processing job.
     * </p>
     * 
     * @param processingJobArn
     *        The Amazon Resource Name (ARN) of the processing job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateProcessingJobResult withProcessingJobArn(String processingJobArn) {
        setProcessingJobArn(processingJobArn);
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
        if (getProcessingJobArn() != null)
            sb.append("ProcessingJobArn: ").append(getProcessingJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateProcessingJobResult == false)
            return false;
        CreateProcessingJobResult other = (CreateProcessingJobResult) obj;
        if (other.getProcessingJobArn() == null ^ this.getProcessingJobArn() == null)
            return false;
        if (other.getProcessingJobArn() != null && other.getProcessingJobArn().equals(this.getProcessingJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProcessingJobArn() == null) ? 0 : getProcessingJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateProcessingJobResult clone() {
        try {
            return (CreateProcessingJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
