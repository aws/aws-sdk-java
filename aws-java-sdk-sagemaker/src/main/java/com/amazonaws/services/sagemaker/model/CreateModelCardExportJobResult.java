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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateModelCardExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateModelCardExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     */
    private String modelCardExportJobArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobArn
     *        The Amazon Resource Name (ARN) of the model card export job.
     */

    public void setModelCardExportJobArn(String modelCardExportJobArn) {
        this.modelCardExportJobArn = modelCardExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the model card export job.
     */

    public String getModelCardExportJobArn() {
        return this.modelCardExportJobArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the model card export job.
     * </p>
     * 
     * @param modelCardExportJobArn
     *        The Amazon Resource Name (ARN) of the model card export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateModelCardExportJobResult withModelCardExportJobArn(String modelCardExportJobArn) {
        setModelCardExportJobArn(modelCardExportJobArn);
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
        if (getModelCardExportJobArn() != null)
            sb.append("ModelCardExportJobArn: ").append(getModelCardExportJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateModelCardExportJobResult == false)
            return false;
        CreateModelCardExportJobResult other = (CreateModelCardExportJobResult) obj;
        if (other.getModelCardExportJobArn() == null ^ this.getModelCardExportJobArn() == null)
            return false;
        if (other.getModelCardExportJobArn() != null && other.getModelCardExportJobArn().equals(this.getModelCardExportJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelCardExportJobArn() == null) ? 0 : getModelCardExportJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateModelCardExportJobResult clone() {
        try {
            return (CreateModelCardExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
