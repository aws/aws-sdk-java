/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A parameter to activate explainers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ExplainerConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExplainerConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     * explainer.
     * </p>
     */
    private ClarifyExplainerConfig clarifyExplainerConfig;

    /**
     * <p>
     * A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     * explainer.
     * </p>
     * 
     * @param clarifyExplainerConfig
     *        A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     *        explainer.
     */

    public void setClarifyExplainerConfig(ClarifyExplainerConfig clarifyExplainerConfig) {
        this.clarifyExplainerConfig = clarifyExplainerConfig;
    }

    /**
     * <p>
     * A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     * explainer.
     * </p>
     * 
     * @return A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     *         explainer.
     */

    public ClarifyExplainerConfig getClarifyExplainerConfig() {
        return this.clarifyExplainerConfig;
    }

    /**
     * <p>
     * A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     * explainer.
     * </p>
     * 
     * @param clarifyExplainerConfig
     *        A member of <code>ExplainerConfig</code> that contains configuration parameters for the SageMaker Clarify
     *        explainer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExplainerConfig withClarifyExplainerConfig(ClarifyExplainerConfig clarifyExplainerConfig) {
        setClarifyExplainerConfig(clarifyExplainerConfig);
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
        if (getClarifyExplainerConfig() != null)
            sb.append("ClarifyExplainerConfig: ").append(getClarifyExplainerConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExplainerConfig == false)
            return false;
        ExplainerConfig other = (ExplainerConfig) obj;
        if (other.getClarifyExplainerConfig() == null ^ this.getClarifyExplainerConfig() == null)
            return false;
        if (other.getClarifyExplainerConfig() != null && other.getClarifyExplainerConfig().equals(this.getClarifyExplainerConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClarifyExplainerConfig() == null) ? 0 : getClarifyExplainerConfig().hashCode());
        return hashCode;
    }

    @Override
    public ExplainerConfig clone() {
        try {
            return (ExplainerConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ExplainerConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
