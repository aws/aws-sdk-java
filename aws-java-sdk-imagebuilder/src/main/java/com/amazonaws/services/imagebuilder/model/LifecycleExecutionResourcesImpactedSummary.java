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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details for an image resource that was identified for a lifecycle action.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecycleExecutionResourcesImpactedSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecycleExecutionResourcesImpactedSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether an image resource that was identified for a lifecycle action has associated resources that are
     * also impacted.
     * </p>
     */
    private Boolean hasImpactedResources;

    /**
     * <p>
     * Indicates whether an image resource that was identified for a lifecycle action has associated resources that are
     * also impacted.
     * </p>
     * 
     * @param hasImpactedResources
     *        Indicates whether an image resource that was identified for a lifecycle action has associated resources
     *        that are also impacted.
     */

    public void setHasImpactedResources(Boolean hasImpactedResources) {
        this.hasImpactedResources = hasImpactedResources;
    }

    /**
     * <p>
     * Indicates whether an image resource that was identified for a lifecycle action has associated resources that are
     * also impacted.
     * </p>
     * 
     * @return Indicates whether an image resource that was identified for a lifecycle action has associated resources
     *         that are also impacted.
     */

    public Boolean getHasImpactedResources() {
        return this.hasImpactedResources;
    }

    /**
     * <p>
     * Indicates whether an image resource that was identified for a lifecycle action has associated resources that are
     * also impacted.
     * </p>
     * 
     * @param hasImpactedResources
     *        Indicates whether an image resource that was identified for a lifecycle action has associated resources
     *        that are also impacted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecycleExecutionResourcesImpactedSummary withHasImpactedResources(Boolean hasImpactedResources) {
        setHasImpactedResources(hasImpactedResources);
        return this;
    }

    /**
     * <p>
     * Indicates whether an image resource that was identified for a lifecycle action has associated resources that are
     * also impacted.
     * </p>
     * 
     * @return Indicates whether an image resource that was identified for a lifecycle action has associated resources
     *         that are also impacted.
     */

    public Boolean isHasImpactedResources() {
        return this.hasImpactedResources;
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
        if (getHasImpactedResources() != null)
            sb.append("HasImpactedResources: ").append(getHasImpactedResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecycleExecutionResourcesImpactedSummary == false)
            return false;
        LifecycleExecutionResourcesImpactedSummary other = (LifecycleExecutionResourcesImpactedSummary) obj;
        if (other.getHasImpactedResources() == null ^ this.getHasImpactedResources() == null)
            return false;
        if (other.getHasImpactedResources() != null && other.getHasImpactedResources().equals(this.getHasImpactedResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHasImpactedResources() == null) ? 0 : getHasImpactedResources().hashCode());
        return hashCode;
    }

    @Override
    public LifecycleExecutionResourcesImpactedSummary clone() {
        try {
            return (LifecycleExecutionResourcesImpactedSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecycleExecutionResourcesImpactedSummaryMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
