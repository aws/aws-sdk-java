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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateCompilationJob" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCompilationJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following
     * data in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     * </p>
     * </li>
     * </ul>
     */
    private String compilationJobArn;

    /**
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following
     * data in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compilationJobArn
     *        If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the
     *        following data in JSON format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     *        </p>
     *        </li>
     */

    public void setCompilationJobArn(String compilationJobArn) {
        this.compilationJobArn = compilationJobArn;
    }

    /**
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following
     * data in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     * </p>
     * </li>
     * </ul>
     * 
     * @return If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the
     *         following data in JSON format:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     *         </p>
     *         </li>
     */

    public String getCompilationJobArn() {
        return this.compilationJobArn;
    }

    /**
     * <p>
     * If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the following
     * data in JSON format:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     * </p>
     * </li>
     * </ul>
     * 
     * @param compilationJobArn
     *        If the action is successful, the service sends back an HTTP 200 response. Amazon SageMaker returns the
     *        following data in JSON format:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CompilationJobArn</code>: The Amazon Resource Name (ARN) of the compiled job.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCompilationJobResult withCompilationJobArn(String compilationJobArn) {
        setCompilationJobArn(compilationJobArn);
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
        if (getCompilationJobArn() != null)
            sb.append("CompilationJobArn: ").append(getCompilationJobArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCompilationJobResult == false)
            return false;
        CreateCompilationJobResult other = (CreateCompilationJobResult) obj;
        if (other.getCompilationJobArn() == null ^ this.getCompilationJobArn() == null)
            return false;
        if (other.getCompilationJobArn() != null && other.getCompilationJobArn().equals(this.getCompilationJobArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompilationJobArn() == null) ? 0 : getCompilationJobArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateCompilationJobResult clone() {
        try {
            return (CreateCompilationJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
