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
 * Returns details of a resource evaluation based on the selected filter.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ResourceEvaluationFilters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourceEvaluationFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     * <code>Proactive</code>.
     * </p>
     */
    private String evaluationMode;
    /**
     * <p>
     * Returns a <code>TimeWindow</code> object.
     * </p>
     */
    private TimeWindow timeWindow;
    /**
     * <p>
     * Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     * </p>
     */
    private String evaluationContextIdentifier;

    /**
     * <p>
     * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     * <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     *        <code>Proactive</code>.
     * @see EvaluationMode
     */

    public void setEvaluationMode(String evaluationMode) {
        this.evaluationMode = evaluationMode;
    }

    /**
     * <p>
     * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     * <code>Proactive</code>.
     * </p>
     * 
     * @return Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     *         <code>Proactive</code>.
     * @see EvaluationMode
     */

    public String getEvaluationMode() {
        return this.evaluationMode;
    }

    /**
     * <p>
     * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     * <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     *        <code>Proactive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public ResourceEvaluationFilters withEvaluationMode(String evaluationMode) {
        setEvaluationMode(evaluationMode);
        return this;
    }

    /**
     * <p>
     * Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     * <code>Proactive</code>.
     * </p>
     * 
     * @param evaluationMode
     *        Filters all resource evaluations results based on an evaluation mode. the valid value for this API is
     *        <code>Proactive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationMode
     */

    public ResourceEvaluationFilters withEvaluationMode(EvaluationMode evaluationMode) {
        this.evaluationMode = evaluationMode.toString();
        return this;
    }

    /**
     * <p>
     * Returns a <code>TimeWindow</code> object.
     * </p>
     * 
     * @param timeWindow
     *        Returns a <code>TimeWindow</code> object.
     */

    public void setTimeWindow(TimeWindow timeWindow) {
        this.timeWindow = timeWindow;
    }

    /**
     * <p>
     * Returns a <code>TimeWindow</code> object.
     * </p>
     * 
     * @return Returns a <code>TimeWindow</code> object.
     */

    public TimeWindow getTimeWindow() {
        return this.timeWindow;
    }

    /**
     * <p>
     * Returns a <code>TimeWindow</code> object.
     * </p>
     * 
     * @param timeWindow
     *        Returns a <code>TimeWindow</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceEvaluationFilters withTimeWindow(TimeWindow timeWindow) {
        setTimeWindow(timeWindow);
        return this;
    }

    /**
     * <p>
     * Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     * </p>
     * 
     * @param evaluationContextIdentifier
     *        Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     */

    public void setEvaluationContextIdentifier(String evaluationContextIdentifier) {
        this.evaluationContextIdentifier = evaluationContextIdentifier;
    }

    /**
     * <p>
     * Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     * </p>
     * 
     * @return Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     */

    public String getEvaluationContextIdentifier() {
        return this.evaluationContextIdentifier;
    }

    /**
     * <p>
     * Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     * </p>
     * 
     * @param evaluationContextIdentifier
     *        Filters evaluations for a given infrastructure deployment. For example: CFN Stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourceEvaluationFilters withEvaluationContextIdentifier(String evaluationContextIdentifier) {
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
        if (getEvaluationMode() != null)
            sb.append("EvaluationMode: ").append(getEvaluationMode()).append(",");
        if (getTimeWindow() != null)
            sb.append("TimeWindow: ").append(getTimeWindow()).append(",");
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

        if (obj instanceof ResourceEvaluationFilters == false)
            return false;
        ResourceEvaluationFilters other = (ResourceEvaluationFilters) obj;
        if (other.getEvaluationMode() == null ^ this.getEvaluationMode() == null)
            return false;
        if (other.getEvaluationMode() != null && other.getEvaluationMode().equals(this.getEvaluationMode()) == false)
            return false;
        if (other.getTimeWindow() == null ^ this.getTimeWindow() == null)
            return false;
        if (other.getTimeWindow() != null && other.getTimeWindow().equals(this.getTimeWindow()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getEvaluationMode() == null) ? 0 : getEvaluationMode().hashCode());
        hashCode = prime * hashCode + ((getTimeWindow() == null) ? 0 : getTimeWindow().hashCode());
        hashCode = prime * hashCode + ((getEvaluationContextIdentifier() == null) ? 0 : getEvaluationContextIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public ResourceEvaluationFilters clone() {
        try {
            return (ResourceEvaluationFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ResourceEvaluationFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
