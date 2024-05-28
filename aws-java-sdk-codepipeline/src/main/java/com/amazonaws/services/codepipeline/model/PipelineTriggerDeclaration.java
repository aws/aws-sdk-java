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
package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents information about the specified trigger configuration, such as the filter criteria and the source stage
 * for the action that contains the trigger.
 * </p>
 * <note>
 * <p>
 * This is only supported for the <code>CodeStarSourceConnection</code> action type.
 * </p>
 * </note> <note>
 * <p>
 * When a trigger configuration is specified, default change detection for repository and branch commits is disabled.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codepipeline-2015-07-09/PipelineTriggerDeclaration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineTriggerDeclaration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The source provider for the event, such as connections configured for a repository with Git tags, for the
     * specified trigger configuration.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * Provides the filter criteria and the source stage for the repository event that starts the pipeline, such as Git
     * tags.
     * </p>
     */
    private GitConfiguration gitConfiguration;

    /**
     * <p>
     * The source provider for the event, such as connections configured for a repository with Git tags, for the
     * specified trigger configuration.
     * </p>
     * 
     * @param providerType
     *        The source provider for the event, such as connections configured for a repository with Git tags, for the
     *        specified trigger configuration.
     * @see PipelineTriggerProviderType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The source provider for the event, such as connections configured for a repository with Git tags, for the
     * specified trigger configuration.
     * </p>
     * 
     * @return The source provider for the event, such as connections configured for a repository with Git tags, for the
     *         specified trigger configuration.
     * @see PipelineTriggerProviderType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The source provider for the event, such as connections configured for a repository with Git tags, for the
     * specified trigger configuration.
     * </p>
     * 
     * @param providerType
     *        The source provider for the event, such as connections configured for a repository with Git tags, for the
     *        specified trigger configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineTriggerProviderType
     */

    public PipelineTriggerDeclaration withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The source provider for the event, such as connections configured for a repository with Git tags, for the
     * specified trigger configuration.
     * </p>
     * 
     * @param providerType
     *        The source provider for the event, such as connections configured for a repository with Git tags, for the
     *        specified trigger configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipelineTriggerProviderType
     */

    public PipelineTriggerDeclaration withProviderType(PipelineTriggerProviderType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the filter criteria and the source stage for the repository event that starts the pipeline, such as Git
     * tags.
     * </p>
     * 
     * @param gitConfiguration
     *        Provides the filter criteria and the source stage for the repository event that starts the pipeline, such
     *        as Git tags.
     */

    public void setGitConfiguration(GitConfiguration gitConfiguration) {
        this.gitConfiguration = gitConfiguration;
    }

    /**
     * <p>
     * Provides the filter criteria and the source stage for the repository event that starts the pipeline, such as Git
     * tags.
     * </p>
     * 
     * @return Provides the filter criteria and the source stage for the repository event that starts the pipeline, such
     *         as Git tags.
     */

    public GitConfiguration getGitConfiguration() {
        return this.gitConfiguration;
    }

    /**
     * <p>
     * Provides the filter criteria and the source stage for the repository event that starts the pipeline, such as Git
     * tags.
     * </p>
     * 
     * @param gitConfiguration
     *        Provides the filter criteria and the source stage for the repository event that starts the pipeline, such
     *        as Git tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipelineTriggerDeclaration withGitConfiguration(GitConfiguration gitConfiguration) {
        setGitConfiguration(gitConfiguration);
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
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getGitConfiguration() != null)
            sb.append("GitConfiguration: ").append(getGitConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipelineTriggerDeclaration == false)
            return false;
        PipelineTriggerDeclaration other = (PipelineTriggerDeclaration) obj;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getGitConfiguration() == null ^ this.getGitConfiguration() == null)
            return false;
        if (other.getGitConfiguration() != null && other.getGitConfiguration().equals(this.getGitConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getGitConfiguration() == null) ? 0 : getGitConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public PipelineTriggerDeclaration clone() {
        try {
            return (PipelineTriggerDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codepipeline.model.transform.PipelineTriggerDeclarationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
