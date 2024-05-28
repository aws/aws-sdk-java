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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to specify either a <code>AutomatedEvaluationConfig</code> or <code>HumanEvaluationConfig</code> object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/EvaluationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     */
    private AutomatedEvaluationConfig automated;
    /**
     * <p>
     * Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     */
    private HumanEvaluationConfig human;

    /**
     * <p>
     * Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @param automated
     *        Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     *        required parameters.
     */

    public void setAutomated(AutomatedEvaluationConfig automated) {
        this.automated = automated;
    }

    /**
     * <p>
     * Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @return Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     *         required parameters.
     */

    public AutomatedEvaluationConfig getAutomated() {
        return this.automated;
    }

    /**
     * <p>
     * Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @param automated
     *        Used to specify an automated model evaluation job. See <code>AutomatedEvaluationConfig</code> to view the
     *        required parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationConfig withAutomated(AutomatedEvaluationConfig automated) {
        setAutomated(automated);
        return this;
    }

    /**
     * <p>
     * Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @param human
     *        Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to
     *        view the required parameters.
     */

    public void setHuman(HumanEvaluationConfig human) {
        this.human = human;
    }

    /**
     * <p>
     * Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @return Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to
     *         view the required parameters.
     */

    public HumanEvaluationConfig getHuman() {
        return this.human;
    }

    /**
     * <p>
     * Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to view the
     * required parameters.
     * </p>
     * 
     * @param human
     *        Used to specify a model evaluation job that uses human workers.See <code>HumanEvaluationConfig</code> to
     *        view the required parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationConfig withHuman(HumanEvaluationConfig human) {
        setHuman(human);
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
        if (getAutomated() != null)
            sb.append("Automated: ").append(getAutomated()).append(",");
        if (getHuman() != null)
            sb.append("Human: ").append(getHuman());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationConfig == false)
            return false;
        EvaluationConfig other = (EvaluationConfig) obj;
        if (other.getAutomated() == null ^ this.getAutomated() == null)
            return false;
        if (other.getAutomated() != null && other.getAutomated().equals(this.getAutomated()) == false)
            return false;
        if (other.getHuman() == null ^ this.getHuman() == null)
            return false;
        if (other.getHuman() != null && other.getHuman().equals(this.getHuman()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutomated() == null) ? 0 : getAutomated().hashCode());
        hashCode = prime * hashCode + ((getHuman() == null) ? 0 : getHuman().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationConfig clone() {
        try {
            return (EvaluationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.EvaluationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
