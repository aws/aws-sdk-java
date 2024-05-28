/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     */
    private String pipelineConfigurationBody;

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *        within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *        <code>\n</code>.
     */

    public void setPipelineConfigurationBody(String pipelineConfigurationBody) {
        this.pipelineConfigurationBody = pipelineConfigurationBody;
    }

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @return The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *         within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *         <code>\n</code>.
     */

    public String getPipelineConfigurationBody() {
        return this.pipelineConfigurationBody;
    }

    /**
     * <p>
     * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a
     * .yaml file. If you provide the configuration as a string, each new line must be escaped with <code>\n</code>.
     * </p>
     * 
     * @param pipelineConfigurationBody
     *        The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or
     *        within a .yaml file. If you provide the configuration as a string, each new line must be escaped with
     *        <code>\n</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineRequest withPipelineConfigurationBody(String pipelineConfigurationBody) {
        setPipelineConfigurationBody(pipelineConfigurationBody);
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
        if (getPipelineConfigurationBody() != null)
            sb.append("PipelineConfigurationBody: ").append(getPipelineConfigurationBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatePipelineRequest == false)
            return false;
        ValidatePipelineRequest other = (ValidatePipelineRequest) obj;
        if (other.getPipelineConfigurationBody() == null ^ this.getPipelineConfigurationBody() == null)
            return false;
        if (other.getPipelineConfigurationBody() != null && other.getPipelineConfigurationBody().equals(this.getPipelineConfigurationBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineConfigurationBody() == null) ? 0 : getPipelineConfigurationBody().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePipelineRequest clone() {
        return (ValidatePipelineRequest) super.clone();
    }

}
