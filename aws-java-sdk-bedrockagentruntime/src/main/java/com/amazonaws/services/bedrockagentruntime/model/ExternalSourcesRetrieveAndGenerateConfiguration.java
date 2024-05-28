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
package com.amazonaws.services.bedrockagentruntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurations of the external source wrapper object in the retrieveAndGenerate function.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-runtime-2023-07-26/ExternalSourcesRetrieveAndGenerateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExternalSourcesRetrieveAndGenerateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     * </p>
     */
    private ExternalSourcesGenerationConfiguration generationConfiguration;
    /**
     * <p>
     * The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The document used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     */
    private java.util.List<ExternalSource> sources;

    /**
     * <p>
     * The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     * </p>
     * 
     * @param generationConfiguration
     *        The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     */

    public void setGenerationConfiguration(ExternalSourcesGenerationConfiguration generationConfiguration) {
        this.generationConfiguration = generationConfiguration;
    }

    /**
     * <p>
     * The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     * </p>
     * 
     * @return The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     */

    public ExternalSourcesGenerationConfiguration getGenerationConfiguration() {
        return this.generationConfiguration;
    }

    /**
     * <p>
     * The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     * </p>
     * 
     * @param generationConfiguration
     *        The prompt used with the external source wrapper object with the retrieveAndGenerate function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSourcesRetrieveAndGenerateConfiguration withGenerationConfiguration(ExternalSourcesGenerationConfiguration generationConfiguration) {
        setGenerationConfiguration(generationConfiguration);
        return this;
    }

    /**
     * <p>
     * The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param modelArn
     *        The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @return The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param modelArn
     *        The modelArn used with the external source wrapper object in the retrieveAndGenerate function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSourcesRetrieveAndGenerateConfiguration withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The document used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @return The document used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public java.util.List<ExternalSource> getSources() {
        return sources;
    }

    /**
     * <p>
     * The document used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param sources
     *        The document used with the external source wrapper object in the retrieveAndGenerate function.
     */

    public void setSources(java.util.Collection<ExternalSource> sources) {
        if (sources == null) {
            this.sources = null;
            return;
        }

        this.sources = new java.util.ArrayList<ExternalSource>(sources);
    }

    /**
     * <p>
     * The document used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSources(java.util.Collection)} or {@link #withSources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sources
     *        The document used with the external source wrapper object in the retrieveAndGenerate function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSourcesRetrieveAndGenerateConfiguration withSources(ExternalSource... sources) {
        if (this.sources == null) {
            setSources(new java.util.ArrayList<ExternalSource>(sources.length));
        }
        for (ExternalSource ele : sources) {
            this.sources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The document used with the external source wrapper object in the retrieveAndGenerate function.
     * </p>
     * 
     * @param sources
     *        The document used with the external source wrapper object in the retrieveAndGenerate function.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExternalSourcesRetrieveAndGenerateConfiguration withSources(java.util.Collection<ExternalSource> sources) {
        setSources(sources);
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
        if (getGenerationConfiguration() != null)
            sb.append("GenerationConfiguration: ").append(getGenerationConfiguration()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getSources() != null)
            sb.append("Sources: ").append(getSources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExternalSourcesRetrieveAndGenerateConfiguration == false)
            return false;
        ExternalSourcesRetrieveAndGenerateConfiguration other = (ExternalSourcesRetrieveAndGenerateConfiguration) obj;
        if (other.getGenerationConfiguration() == null ^ this.getGenerationConfiguration() == null)
            return false;
        if (other.getGenerationConfiguration() != null && other.getGenerationConfiguration().equals(this.getGenerationConfiguration()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getSources() == null ^ this.getSources() == null)
            return false;
        if (other.getSources() != null && other.getSources().equals(this.getSources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGenerationConfiguration() == null) ? 0 : getGenerationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getSources() == null) ? 0 : getSources().hashCode());
        return hashCode;
    }

    @Override
    public ExternalSourcesRetrieveAndGenerateConfiguration clone() {
        try {
            return (ExternalSourcesRetrieveAndGenerateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrockagentruntime.model.transform.ExternalSourcesRetrieveAndGenerateConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
