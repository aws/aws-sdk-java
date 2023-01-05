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
package com.amazonaws.services.braket.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Amazon Braket job to be created. Specifies the container image the job uses and the paths to the Python
 * scripts used for entry and training.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/braket-2019-09-01/AlgorithmSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AlgorithmSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The container image used to create an Amazon Braket job.
     * </p>
     */
    private ContainerImage containerImage;
    /**
     * <p>
     * Configures the paths to the Python scripts used for entry and training.
     * </p>
     */
    private ScriptModeConfig scriptModeConfig;

    /**
     * <p>
     * The container image used to create an Amazon Braket job.
     * </p>
     * 
     * @param containerImage
     *        The container image used to create an Amazon Braket job.
     */

    public void setContainerImage(ContainerImage containerImage) {
        this.containerImage = containerImage;
    }

    /**
     * <p>
     * The container image used to create an Amazon Braket job.
     * </p>
     * 
     * @return The container image used to create an Amazon Braket job.
     */

    public ContainerImage getContainerImage() {
        return this.containerImage;
    }

    /**
     * <p>
     * The container image used to create an Amazon Braket job.
     * </p>
     * 
     * @param containerImage
     *        The container image used to create an Amazon Braket job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withContainerImage(ContainerImage containerImage) {
        setContainerImage(containerImage);
        return this;
    }

    /**
     * <p>
     * Configures the paths to the Python scripts used for entry and training.
     * </p>
     * 
     * @param scriptModeConfig
     *        Configures the paths to the Python scripts used for entry and training.
     */

    public void setScriptModeConfig(ScriptModeConfig scriptModeConfig) {
        this.scriptModeConfig = scriptModeConfig;
    }

    /**
     * <p>
     * Configures the paths to the Python scripts used for entry and training.
     * </p>
     * 
     * @return Configures the paths to the Python scripts used for entry and training.
     */

    public ScriptModeConfig getScriptModeConfig() {
        return this.scriptModeConfig;
    }

    /**
     * <p>
     * Configures the paths to the Python scripts used for entry and training.
     * </p>
     * 
     * @param scriptModeConfig
     *        Configures the paths to the Python scripts used for entry and training.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AlgorithmSpecification withScriptModeConfig(ScriptModeConfig scriptModeConfig) {
        setScriptModeConfig(scriptModeConfig);
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
        if (getContainerImage() != null)
            sb.append("ContainerImage: ").append(getContainerImage()).append(",");
        if (getScriptModeConfig() != null)
            sb.append("ScriptModeConfig: ").append(getScriptModeConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlgorithmSpecification == false)
            return false;
        AlgorithmSpecification other = (AlgorithmSpecification) obj;
        if (other.getContainerImage() == null ^ this.getContainerImage() == null)
            return false;
        if (other.getContainerImage() != null && other.getContainerImage().equals(this.getContainerImage()) == false)
            return false;
        if (other.getScriptModeConfig() == null ^ this.getScriptModeConfig() == null)
            return false;
        if (other.getScriptModeConfig() != null && other.getScriptModeConfig().equals(this.getScriptModeConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerImage() == null) ? 0 : getContainerImage().hashCode());
        hashCode = prime * hashCode + ((getScriptModeConfig() == null) ? 0 : getScriptModeConfig().hashCode());
        return hashCode;
    }

    @Override
    public AlgorithmSpecification clone() {
        try {
            return (AlgorithmSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.braket.model.transform.AlgorithmSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
