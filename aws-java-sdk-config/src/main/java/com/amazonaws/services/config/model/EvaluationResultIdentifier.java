/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Uniquely identifies an evaluation result.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/EvaluationResultIdentifier" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EvaluationResultIdentifier implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated
     * resource.
     * </p>
     */
    private EvaluationResultQualifier evaluationResultQualifier;
    /**
     * <p>
     * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config
     * delivered a configuration item change notification, or it can indicate when AWS Config delivered the
     * configuration snapshot, depending on which event triggered the evaluation.
     * </p>
     */
    private java.util.Date orderingTimestamp;

    /**
     * <p>
     * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated
     * resource.
     * </p>
     * 
     * @param evaluationResultQualifier
     *        Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the
     *        evaluated resource.
     */

    public void setEvaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
        this.evaluationResultQualifier = evaluationResultQualifier;
    }

    /**
     * <p>
     * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated
     * resource.
     * </p>
     * 
     * @return Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the
     *         evaluated resource.
     */

    public EvaluationResultQualifier getEvaluationResultQualifier() {
        return this.evaluationResultQualifier;
    }

    /**
     * <p>
     * Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the evaluated
     * resource.
     * </p>
     * 
     * @param evaluationResultQualifier
     *        Identifies an AWS Config rule used to evaluate an AWS resource, and provides the type and ID of the
     *        evaluated resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResultIdentifier withEvaluationResultQualifier(EvaluationResultQualifier evaluationResultQualifier) {
        setEvaluationResultQualifier(evaluationResultQualifier);
        return this;
    }

    /**
     * <p>
     * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config
     * delivered a configuration item change notification, or it can indicate when AWS Config delivered the
     * configuration snapshot, depending on which event triggered the evaluation.
     * </p>
     * 
     * @param orderingTimestamp
     *        The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS
     *        Config delivered a configuration item change notification, or it can indicate when AWS Config delivered
     *        the configuration snapshot, depending on which event triggered the evaluation.
     */

    public void setOrderingTimestamp(java.util.Date orderingTimestamp) {
        this.orderingTimestamp = orderingTimestamp;
    }

    /**
     * <p>
     * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config
     * delivered a configuration item change notification, or it can indicate when AWS Config delivered the
     * configuration snapshot, depending on which event triggered the evaluation.
     * </p>
     * 
     * @return The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS
     *         Config delivered a configuration item change notification, or it can indicate when AWS Config delivered
     *         the configuration snapshot, depending on which event triggered the evaluation.
     */

    public java.util.Date getOrderingTimestamp() {
        return this.orderingTimestamp;
    }

    /**
     * <p>
     * The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS Config
     * delivered a configuration item change notification, or it can indicate when AWS Config delivered the
     * configuration snapshot, depending on which event triggered the evaluation.
     * </p>
     * 
     * @param orderingTimestamp
     *        The time of the event that triggered the evaluation of your AWS resources. The time can indicate when AWS
     *        Config delivered a configuration item change notification, or it can indicate when AWS Config delivered
     *        the configuration snapshot, depending on which event triggered the evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EvaluationResultIdentifier withOrderingTimestamp(java.util.Date orderingTimestamp) {
        setOrderingTimestamp(orderingTimestamp);
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
        if (getEvaluationResultQualifier() != null)
            sb.append("EvaluationResultQualifier: ").append(getEvaluationResultQualifier()).append(",");
        if (getOrderingTimestamp() != null)
            sb.append("OrderingTimestamp: ").append(getOrderingTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EvaluationResultIdentifier == false)
            return false;
        EvaluationResultIdentifier other = (EvaluationResultIdentifier) obj;
        if (other.getEvaluationResultQualifier() == null ^ this.getEvaluationResultQualifier() == null)
            return false;
        if (other.getEvaluationResultQualifier() != null && other.getEvaluationResultQualifier().equals(this.getEvaluationResultQualifier()) == false)
            return false;
        if (other.getOrderingTimestamp() == null ^ this.getOrderingTimestamp() == null)
            return false;
        if (other.getOrderingTimestamp() != null && other.getOrderingTimestamp().equals(this.getOrderingTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvaluationResultQualifier() == null) ? 0 : getEvaluationResultQualifier().hashCode());
        hashCode = prime * hashCode + ((getOrderingTimestamp() == null) ? 0 : getOrderingTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public EvaluationResultIdentifier clone() {
        try {
            return (EvaluationResultIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.EvaluationResultIdentifierMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
