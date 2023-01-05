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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RetryPipelineExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetryPipelineExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionArn;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than once.
     * </p>
     */
    private String clientRequestToken;
    /**
     * <p>
     * This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     * </p>
     */
    private ParallelismConfiguration parallelismConfiguration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public void setPipelineExecutionArn(String pipelineExecutionArn) {
        this.pipelineExecutionArn = pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the pipeline execution.
     */

    public String getPipelineExecutionArn() {
        return this.pipelineExecutionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionArn
     *        The Amazon Resource Name (ARN) of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPipelineExecutionRequest withPipelineExecutionArn(String pipelineExecutionArn) {
        setPipelineExecutionArn(pipelineExecutionArn);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than once.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than once.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than once.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than once.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPipelineExecutionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
        return this;
    }

    /**
     * <p>
     * This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     * </p>
     * 
     * @param parallelismConfiguration
     *        This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     */

    public void setParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        this.parallelismConfiguration = parallelismConfiguration;
    }

    /**
     * <p>
     * This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     * </p>
     * 
     * @return This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     */

    public ParallelismConfiguration getParallelismConfiguration() {
        return this.parallelismConfiguration;
    }

    /**
     * <p>
     * This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     * </p>
     * 
     * @param parallelismConfiguration
     *        This configuration, if specified, overrides the parallelism configuration of the parent pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetryPipelineExecutionRequest withParallelismConfiguration(ParallelismConfiguration parallelismConfiguration) {
        setParallelismConfiguration(parallelismConfiguration);
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
        if (getPipelineExecutionArn() != null)
            sb.append("PipelineExecutionArn: ").append(getPipelineExecutionArn()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken()).append(",");
        if (getParallelismConfiguration() != null)
            sb.append("ParallelismConfiguration: ").append(getParallelismConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetryPipelineExecutionRequest == false)
            return false;
        RetryPipelineExecutionRequest other = (RetryPipelineExecutionRequest) obj;
        if (other.getPipelineExecutionArn() == null ^ this.getPipelineExecutionArn() == null)
            return false;
        if (other.getPipelineExecutionArn() != null && other.getPipelineExecutionArn().equals(this.getPipelineExecutionArn()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        if (other.getParallelismConfiguration() == null ^ this.getParallelismConfiguration() == null)
            return false;
        if (other.getParallelismConfiguration() != null && other.getParallelismConfiguration().equals(this.getParallelismConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionArn() == null) ? 0 : getPipelineExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        hashCode = prime * hashCode + ((getParallelismConfiguration() == null) ? 0 : getParallelismConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public RetryPipelineExecutionRequest clone() {
        return (RetryPipelineExecutionRequest) super.clone();
    }

}
