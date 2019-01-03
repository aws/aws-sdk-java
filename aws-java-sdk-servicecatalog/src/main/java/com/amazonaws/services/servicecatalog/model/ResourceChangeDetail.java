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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a change to a resource attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ResourceChangeDetail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceChangeDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     */
    private ResourceTargetDefinition target;
    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic
     * evaluations, the value might change, and any new value will be determined when the plan is updated.
     * </p>
     */
    private String evaluation;
    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     */
    private String causingEntity;

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     * 
     * @param target
     *        Information about the resource attribute to be modified.
     */

    public void setTarget(ResourceTargetDefinition target) {
        this.target = target;
    }

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     * 
     * @return Information about the resource attribute to be modified.
     */

    public ResourceTargetDefinition getTarget() {
        return this.target;
    }

    /**
     * <p>
     * Information about the resource attribute to be modified.
     * </p>
     * 
     * @param target
     *        Information about the resource attribute to be modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChangeDetail withTarget(ResourceTargetDefinition target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic
     * evaluations, the value might change, and any new value will be determined when the plan is updated.
     * </p>
     * 
     * @param evaluation
     *        For static evaluations, the value of the resource attribute will change and the new value is known. For
     *        dynamic evaluations, the value might change, and any new value will be determined when the plan is
     *        updated.
     * @see EvaluationType
     */

    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic
     * evaluations, the value might change, and any new value will be determined when the plan is updated.
     * </p>
     * 
     * @return For static evaluations, the value of the resource attribute will change and the new value is known. For
     *         dynamic evaluations, the value might change, and any new value will be determined when the plan is
     *         updated.
     * @see EvaluationType
     */

    public String getEvaluation() {
        return this.evaluation;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic
     * evaluations, the value might change, and any new value will be determined when the plan is updated.
     * </p>
     * 
     * @param evaluation
     *        For static evaluations, the value of the resource attribute will change and the new value is known. For
     *        dynamic evaluations, the value might change, and any new value will be determined when the plan is
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public ResourceChangeDetail withEvaluation(String evaluation) {
        setEvaluation(evaluation);
        return this;
    }

    /**
     * <p>
     * For static evaluations, the value of the resource attribute will change and the new value is known. For dynamic
     * evaluations, the value might change, and any new value will be determined when the plan is updated.
     * </p>
     * 
     * @param evaluation
     *        For static evaluations, the value of the resource attribute will change and the new value is known. For
     *        dynamic evaluations, the value might change, and any new value will be determined when the plan is
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationType
     */

    public ResourceChangeDetail withEvaluation(EvaluationType evaluation) {
        this.evaluation = evaluation.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     * 
     * @param causingEntity
     *        The ID of the entity that caused the change.
     */

    public void setCausingEntity(String causingEntity) {
        this.causingEntity = causingEntity;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     * 
     * @return The ID of the entity that caused the change.
     */

    public String getCausingEntity() {
        return this.causingEntity;
    }

    /**
     * <p>
     * The ID of the entity that caused the change.
     * </p>
     * 
     * @param causingEntity
     *        The ID of the entity that caused the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceChangeDetail withCausingEntity(String causingEntity) {
        setCausingEntity(causingEntity);
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
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getEvaluation() != null)
            sb.append("Evaluation: ").append(getEvaluation()).append(",");
        if (getCausingEntity() != null)
            sb.append("CausingEntity: ").append(getCausingEntity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourceChangeDetail == false)
            return false;
        ResourceChangeDetail other = (ResourceChangeDetail) obj;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getEvaluation() == null ^ this.getEvaluation() == null)
            return false;
        if (other.getEvaluation() != null && other.getEvaluation().equals(this.getEvaluation()) == false)
            return false;
        if (other.getCausingEntity() == null ^ this.getCausingEntity() == null)
            return false;
        if (other.getCausingEntity() != null && other.getCausingEntity().equals(this.getCausingEntity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getEvaluation() == null) ? 0 : getEvaluation().hashCode());
        hashCode = prime * hashCode + ((getCausingEntity() == null) ? 0 : getCausingEntity().hashCode());
        return hashCode;
    }

    @Override
    public ResourceChangeDetail clone() {
        try {
            return (ResourceChangeDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicecatalog.model.transform.ResourceChangeDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
