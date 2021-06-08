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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/UpdatePipelineExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionArn;
    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDescription;
    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDisplayName;

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

    public UpdatePipelineExecutionRequest withPipelineExecutionArn(String pipelineExecutionArn) {
        setPipelineExecutionArn(pipelineExecutionArn);
        return this;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDescription
     *        The description of the pipeline execution.
     */

    public void setPipelineExecutionDescription(String pipelineExecutionDescription) {
        this.pipelineExecutionDescription = pipelineExecutionDescription;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @return The description of the pipeline execution.
     */

    public String getPipelineExecutionDescription() {
        return this.pipelineExecutionDescription;
    }

    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDescription
     *        The description of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineExecutionRequest withPipelineExecutionDescription(String pipelineExecutionDescription) {
        setPipelineExecutionDescription(pipelineExecutionDescription);
        return this;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDisplayName
     *        The display name of the pipeline execution.
     */

    public void setPipelineExecutionDisplayName(String pipelineExecutionDisplayName) {
        this.pipelineExecutionDisplayName = pipelineExecutionDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @return The display name of the pipeline execution.
     */

    public String getPipelineExecutionDisplayName() {
        return this.pipelineExecutionDisplayName;
    }

    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     * 
     * @param pipelineExecutionDisplayName
     *        The display name of the pipeline execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineExecutionRequest withPipelineExecutionDisplayName(String pipelineExecutionDisplayName) {
        setPipelineExecutionDisplayName(pipelineExecutionDisplayName);
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
        if (getPipelineExecutionDescription() != null)
            sb.append("PipelineExecutionDescription: ").append(getPipelineExecutionDescription()).append(",");
        if (getPipelineExecutionDisplayName() != null)
            sb.append("PipelineExecutionDisplayName: ").append(getPipelineExecutionDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineExecutionRequest == false)
            return false;
        UpdatePipelineExecutionRequest other = (UpdatePipelineExecutionRequest) obj;
        if (other.getPipelineExecutionArn() == null ^ this.getPipelineExecutionArn() == null)
            return false;
        if (other.getPipelineExecutionArn() != null && other.getPipelineExecutionArn().equals(this.getPipelineExecutionArn()) == false)
            return false;
        if (other.getPipelineExecutionDescription() == null ^ this.getPipelineExecutionDescription() == null)
            return false;
        if (other.getPipelineExecutionDescription() != null && other.getPipelineExecutionDescription().equals(this.getPipelineExecutionDescription()) == false)
            return false;
        if (other.getPipelineExecutionDisplayName() == null ^ this.getPipelineExecutionDisplayName() == null)
            return false;
        if (other.getPipelineExecutionDisplayName() != null && other.getPipelineExecutionDisplayName().equals(this.getPipelineExecutionDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineExecutionArn() == null) ? 0 : getPipelineExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDescription() == null) ? 0 : getPipelineExecutionDescription().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDisplayName() == null) ? 0 : getPipelineExecutionDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineExecutionRequest clone() {
        return (UpdatePipelineExecutionRequest) super.clone();
    }

}
