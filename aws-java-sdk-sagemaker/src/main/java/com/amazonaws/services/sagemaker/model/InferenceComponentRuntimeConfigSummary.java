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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the runtime settings for the model that is deployed with the inference component.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/InferenceComponentRuntimeConfigSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InferenceComponentRuntimeConfigSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of runtime copies of the model container that you requested to deploy with the inference component.
     * </p>
     */
    private Integer desiredCopyCount;
    /**
     * <p>
     * The number of runtime copies of the model container that are currently deployed.
     * </p>
     */
    private Integer currentCopyCount;

    /**
     * <p>
     * The number of runtime copies of the model container that you requested to deploy with the inference component.
     * </p>
     * 
     * @param desiredCopyCount
     *        The number of runtime copies of the model container that you requested to deploy with the inference
     *        component.
     */

    public void setDesiredCopyCount(Integer desiredCopyCount) {
        this.desiredCopyCount = desiredCopyCount;
    }

    /**
     * <p>
     * The number of runtime copies of the model container that you requested to deploy with the inference component.
     * </p>
     * 
     * @return The number of runtime copies of the model container that you requested to deploy with the inference
     *         component.
     */

    public Integer getDesiredCopyCount() {
        return this.desiredCopyCount;
    }

    /**
     * <p>
     * The number of runtime copies of the model container that you requested to deploy with the inference component.
     * </p>
     * 
     * @param desiredCopyCount
     *        The number of runtime copies of the model container that you requested to deploy with the inference
     *        component.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentRuntimeConfigSummary withDesiredCopyCount(Integer desiredCopyCount) {
        setDesiredCopyCount(desiredCopyCount);
        return this;
    }

    /**
     * <p>
     * The number of runtime copies of the model container that are currently deployed.
     * </p>
     * 
     * @param currentCopyCount
     *        The number of runtime copies of the model container that are currently deployed.
     */

    public void setCurrentCopyCount(Integer currentCopyCount) {
        this.currentCopyCount = currentCopyCount;
    }

    /**
     * <p>
     * The number of runtime copies of the model container that are currently deployed.
     * </p>
     * 
     * @return The number of runtime copies of the model container that are currently deployed.
     */

    public Integer getCurrentCopyCount() {
        return this.currentCopyCount;
    }

    /**
     * <p>
     * The number of runtime copies of the model container that are currently deployed.
     * </p>
     * 
     * @param currentCopyCount
     *        The number of runtime copies of the model container that are currently deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InferenceComponentRuntimeConfigSummary withCurrentCopyCount(Integer currentCopyCount) {
        setCurrentCopyCount(currentCopyCount);
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
        if (getDesiredCopyCount() != null)
            sb.append("DesiredCopyCount: ").append(getDesiredCopyCount()).append(",");
        if (getCurrentCopyCount() != null)
            sb.append("CurrentCopyCount: ").append(getCurrentCopyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InferenceComponentRuntimeConfigSummary == false)
            return false;
        InferenceComponentRuntimeConfigSummary other = (InferenceComponentRuntimeConfigSummary) obj;
        if (other.getDesiredCopyCount() == null ^ this.getDesiredCopyCount() == null)
            return false;
        if (other.getDesiredCopyCount() != null && other.getDesiredCopyCount().equals(this.getDesiredCopyCount()) == false)
            return false;
        if (other.getCurrentCopyCount() == null ^ this.getCurrentCopyCount() == null)
            return false;
        if (other.getCurrentCopyCount() != null && other.getCurrentCopyCount().equals(this.getCurrentCopyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredCopyCount() == null) ? 0 : getDesiredCopyCount().hashCode());
        hashCode = prime * hashCode + ((getCurrentCopyCount() == null) ? 0 : getCurrentCopyCount().hashCode());
        return hashCode;
    }

    @Override
    public InferenceComponentRuntimeConfigSummary clone() {
        try {
            return (InferenceComponentRuntimeConfigSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.InferenceComponentRuntimeConfigSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
