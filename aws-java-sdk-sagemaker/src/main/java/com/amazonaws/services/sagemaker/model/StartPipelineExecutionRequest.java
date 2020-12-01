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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/StartPipelineExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartPipelineExecutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * The display name of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDisplayName;
    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     */
    private java.util.List<Parameter> pipelineParameters;
    /**
     * <p>
     * The description of the pipeline execution.
     * </p>
     */
    private String pipelineExecutionDescription;
    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
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

    public StartPipelineExecutionRequest withPipelineExecutionDisplayName(String pipelineExecutionDisplayName) {
        setPipelineExecutionDisplayName(pipelineExecutionDisplayName);
        return this;
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @return Contains a list of pipeline parameters. This list can be empty.
     */

    public java.util.List<Parameter> getPipelineParameters() {
        return pipelineParameters;
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     */

    public void setPipelineParameters(java.util.Collection<Parameter> pipelineParameters) {
        if (pipelineParameters == null) {
            this.pipelineParameters = null;
            return;
        }

        this.pipelineParameters = new java.util.ArrayList<Parameter>(pipelineParameters);
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineParameters(java.util.Collection)} or {@link #withPipelineParameters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withPipelineParameters(Parameter... pipelineParameters) {
        if (this.pipelineParameters == null) {
            setPipelineParameters(new java.util.ArrayList<Parameter>(pipelineParameters.length));
        }
        for (Parameter ele : pipelineParameters) {
            this.pipelineParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of pipeline parameters. This list can be empty.
     * </p>
     * 
     * @param pipelineParameters
     *        Contains a list of pipeline parameters. This list can be empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withPipelineParameters(java.util.Collection<Parameter> pipelineParameters) {
        setPipelineParameters(pipelineParameters);
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

    public StartPipelineExecutionRequest withPipelineExecutionDescription(String pipelineExecutionDescription) {
        setPipelineExecutionDescription(pipelineExecutionDescription);
        return this;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @return A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *         idempotent operation completes no more than one time.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent
     * operation completes no more than one time.
     * </p>
     * 
     * @param clientRequestToken
     *        A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An
     *        idempotent operation completes no more than one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartPipelineExecutionRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineExecutionDisplayName() != null)
            sb.append("PipelineExecutionDisplayName: ").append(getPipelineExecutionDisplayName()).append(",");
        if (getPipelineParameters() != null)
            sb.append("PipelineParameters: ").append(getPipelineParameters()).append(",");
        if (getPipelineExecutionDescription() != null)
            sb.append("PipelineExecutionDescription: ").append(getPipelineExecutionDescription()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartPipelineExecutionRequest == false)
            return false;
        StartPipelineExecutionRequest other = (StartPipelineExecutionRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineExecutionDisplayName() == null ^ this.getPipelineExecutionDisplayName() == null)
            return false;
        if (other.getPipelineExecutionDisplayName() != null && other.getPipelineExecutionDisplayName().equals(this.getPipelineExecutionDisplayName()) == false)
            return false;
        if (other.getPipelineParameters() == null ^ this.getPipelineParameters() == null)
            return false;
        if (other.getPipelineParameters() != null && other.getPipelineParameters().equals(this.getPipelineParameters()) == false)
            return false;
        if (other.getPipelineExecutionDescription() == null ^ this.getPipelineExecutionDescription() == null)
            return false;
        if (other.getPipelineExecutionDescription() != null && other.getPipelineExecutionDescription().equals(this.getPipelineExecutionDescription()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDisplayName() == null) ? 0 : getPipelineExecutionDisplayName().hashCode());
        hashCode = prime * hashCode + ((getPipelineParameters() == null) ? 0 : getPipelineParameters().hashCode());
        hashCode = prime * hashCode + ((getPipelineExecutionDescription() == null) ? 0 : getPipelineExecutionDescription().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public StartPipelineExecutionRequest clone() {
        return (StartPipelineExecutionRequest) super.clone();
    }

}
