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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Use EvaluationContext to group independently initiated proactive resource evaluations. For example, CFN Stack. If you
 * want to check just a resource definition, you do not need to provide evaluation context.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/EvaluationContext" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationContext implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique EvaluationContextIdentifier ID for an EvaluationContext.
     * </p>
     */
    private String evaluationContextIdentifier;

    /**
     * <p>
     * A unique EvaluationContextIdentifier ID for an EvaluationContext.
     * </p>
     * 
     * @param evaluationContextIdentifier
     *        A unique EvaluationContextIdentifier ID for an EvaluationContext.
     */

    public void setEvaluationContextIdentifier(String evaluationContextIdentifier) {
        this.evaluationContextIdentifier = evaluationContextIdentifier;
    }

    /**
     * <p>
     * A unique EvaluationContextIdentifier ID for an EvaluationContext.
     * </p>
     * 
     * @return A unique EvaluationContextIdentifier ID for an EvaluationContext.
     */

    public String getEvaluationContextIdentifier() {
        return this.evaluationContextIdentifier;
    }

    /**
     * <p>
     * A unique EvaluationContextIdentifier ID for an EvaluationContext.
     * </p>
     * 
     * @param evaluationContextIdentifier
     *        A unique EvaluationContextIdentifier ID for an EvaluationContext.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationContext withEvaluationContextIdentifier(String evaluationContextIdentifier) {
        setEvaluationContextIdentifier(evaluationContextIdentifier);
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
        if (getEvaluationContextIdentifier() != null)
            sb.append("EvaluationContextIdentifier: ").append(getEvaluationContextIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationContext == false)
            return false;
        EvaluationContext other = (EvaluationContext) obj;
        if (other.getEvaluationContextIdentifier() == null ^ this.getEvaluationContextIdentifier() == null)
            return false;
        if (other.getEvaluationContextIdentifier() != null && other.getEvaluationContextIdentifier().equals(this.getEvaluationContextIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationContextIdentifier() == null) ? 0 : getEvaluationContextIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationContext clone() {
        try {
            return (EvaluationContext) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationContextMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
