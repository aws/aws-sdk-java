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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about how and under what conditions SageMaker creates a human loop. If
 * <code>HumanLoopActivationConfig</code> is not given, then all requests go to humans.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/HumanLoopActivationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopActivationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Container for configuring the source of human task requests.
     * </p>
     */
    private HumanLoopRequestSource humanLoopRequestSource;
    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates a human loop.
     * </p>
     */
    private HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig;

    /**
     * <p>
     * Container for configuring the source of human task requests.
     * </p>
     * 
     * @param humanLoopRequestSource
     *        Container for configuring the source of human task requests.
     */

    public void setHumanLoopRequestSource(HumanLoopRequestSource humanLoopRequestSource) {
        this.humanLoopRequestSource = humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests.
     * </p>
     * 
     * @return Container for configuring the source of human task requests.
     */

    public HumanLoopRequestSource getHumanLoopRequestSource() {
        return this.humanLoopRequestSource;
    }

    /**
     * <p>
     * Container for configuring the source of human task requests.
     * </p>
     * 
     * @param humanLoopRequestSource
     *        Container for configuring the source of human task requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationConfig withHumanLoopRequestSource(HumanLoopRequestSource humanLoopRequestSource) {
        setHumanLoopRequestSource(humanLoopRequestSource);
        return this;
    }

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates a human loop.
     * </p>
     * 
     * @param humanLoopActivationConditionsConfig
     *        Container structure for defining under what conditions SageMaker creates a human loop.
     */

    public void setHumanLoopActivationConditionsConfig(HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
        this.humanLoopActivationConditionsConfig = humanLoopActivationConditionsConfig;
    }

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates a human loop.
     * </p>
     * 
     * @return Container structure for defining under what conditions SageMaker creates a human loop.
     */

    public HumanLoopActivationConditionsConfig getHumanLoopActivationConditionsConfig() {
        return this.humanLoopActivationConditionsConfig;
    }

    /**
     * <p>
     * Container structure for defining under what conditions SageMaker creates a human loop.
     * </p>
     * 
     * @param humanLoopActivationConditionsConfig
     *        Container structure for defining under what conditions SageMaker creates a human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopActivationConfig withHumanLoopActivationConditionsConfig(HumanLoopActivationConditionsConfig humanLoopActivationConditionsConfig) {
        setHumanLoopActivationConditionsConfig(humanLoopActivationConditionsConfig);
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
        if (getHumanLoopRequestSource() != null)
            sb.append("HumanLoopRequestSource: ").append(getHumanLoopRequestSource()).append(",");
        if (getHumanLoopActivationConditionsConfig() != null)
            sb.append("HumanLoopActivationConditionsConfig: ").append(getHumanLoopActivationConditionsConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopActivationConfig == false)
            return false;
        HumanLoopActivationConfig other = (HumanLoopActivationConfig) obj;
        if (other.getHumanLoopRequestSource() == null ^ this.getHumanLoopRequestSource() == null)
            return false;
        if (other.getHumanLoopRequestSource() != null && other.getHumanLoopRequestSource().equals(this.getHumanLoopRequestSource()) == false)
            return false;
        if (other.getHumanLoopActivationConditionsConfig() == null ^ this.getHumanLoopActivationConditionsConfig() == null)
            return false;
        if (other.getHumanLoopActivationConditionsConfig() != null
                && other.getHumanLoopActivationConditionsConfig().equals(this.getHumanLoopActivationConditionsConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHumanLoopRequestSource() == null) ? 0 : getHumanLoopRequestSource().hashCode());
        hashCode = prime * hashCode + ((getHumanLoopActivationConditionsConfig() == null) ? 0 : getHumanLoopActivationConditionsConfig().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopActivationConfig clone() {
        try {
            return (HumanLoopActivationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.HumanLoopActivationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
