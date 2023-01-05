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
 * Returns details of a resource evaluation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ResourceEvaluation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceEvaluation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ResourceEvaluationId of a evaluation.
     * </p>
     */
    private String resourceEvaluationId;
    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     */
    private String evaluationMode;
    /**
     * <p>
     * The starting time of an execution.
     * </p>
     */
    private java.util.Date evaluationStartTimestamp;

    /**
     * <p>
     * The ResourceEvaluationId of a evaluation.
     * </p>
     * 
     * @param resourceEvaluationId
     *        The ResourceEvaluationId of a evaluation.
     */

    public void setResourceEvaluationId(String resourceEvaluationId) {
        this.resourceEvaluationId = resourceEvaluationId;
    }

    /**
     * <p>
     * The ResourceEvaluationId of a evaluation.
     * </p>
     * 
     * @return The ResourceEvaluationId of a evaluation.
     */

    public String getResourceEvaluationId() {
        return this.resourceEvaluationId;
    }

    /**
     * <p>
     * The ResourceEvaluationId of a evaluation.
     * </p>
     * 
     * @param resourceEvaluationId
     *        The ResourceEvaluationId of a evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceEvaluation withResourceEvaluationId(String resourceEvaluationId) {
        setResourceEvaluationId(resourceEvaluationId);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @return The mode of an evaluation. The valid values are Detective or Proactive.
     * @see EvaluationMode
     */

    public String getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public ResourceEvaluation withEvaluationMode(String evaluationMode) {
        setEvaluationMode(evaluationMode);
        return this;
    }

    /**
     * <p>
     * The mode of an evaluation. The valid values are Detective or Proactive.
     * </p>
     * 
     * @param evaluationMode
     *        The mode of an evaluation. The valid values are Detective or Proactive.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public ResourceEvaluation withEvaluationMode(EvaluationMode evaluationMode) {
        this.evaluationMode = evaluationMode.toString();
        return this;
    }

    /**
     * <p>
     * The starting time of an execution.
     * </p>
     * 
     * @param evaluationStartTimestamp
     *        The starting time of an execution.
     */

    public void setEvaluationStartTimestamp(java.util.Date evaluationStartTimestamp) {
        this.evaluationStartTimestamp = evaluationStartTimestamp;
    }

    /**
     * <p>
     * The starting time of an execution.
     * </p>
     * 
     * @return The starting time of an execution.
     */

    public java.util.Date getEvaluationStartTimestamp() {
        return this.evaluationStartTimestamp;
    }

    /**
     * <p>
     * The starting time of an execution.
     * </p>
     * 
     * @param evaluationStartTimestamp
     *        The starting time of an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceEvaluation withEvaluationStartTimestamp(java.util.Date evaluationStartTimestamp) {
        setEvaluationStartTimestamp(evaluationStartTimestamp);
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
        if (getResourceEvaluationId() != null)
            sb.append("ResourceEvaluationId: ").append(getResourceEvaluationId()).append(",");
        if (getEvaluationMode() != null)
            sb.append("EvaluationMode: ").append(getEvaluationMode()).append(",");
        if (getEvaluationStartTimestamp() != null)
            sb.append("EvaluationStartTimestamp: ").append(getEvaluationStartTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceEvaluation == false)
            return false;
        ResourceEvaluation other = (ResourceEvaluation) obj;
        if (other.getResourceEvaluationId() == null ^ this.getResourceEvaluationId() == null)
            return false;
        if (other.getResourceEvaluationId() != null && other.getResourceEvaluationId().equals(this.getResourceEvaluationId()) == false)
            return false;
        if (other.getEvaluationMode() == null ^ this.getEvaluationMode() == null)
            return false;
        if (other.getEvaluationMode() != null && other.getEvaluationMode().equals(this.getEvaluationMode()) == false)
            return false;
        if (other.getEvaluationStartTimestamp() == null ^ this.getEvaluationStartTimestamp() == null)
            return false;
        if (other.getEvaluationStartTimestamp() != null && other.getEvaluationStartTimestamp().equals(this.getEvaluationStartTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceEvaluationId() == null) ? 0 : getResourceEvaluationId().hashCode());
        hashCode = prime * hashCode + ((getEvaluationMode() == null) ? 0 : getEvaluationMode().hashCode());
        hashCode = prime * hashCode + ((getEvaluationStartTimestamp() == null) ? 0 : getEvaluationStartTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public ResourceEvaluation clone() {
        try {
            return (ResourceEvaluation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ResourceEvaluationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
