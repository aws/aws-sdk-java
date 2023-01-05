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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The definition of a custom action that can be used for stateless packet handling.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StatelessCustomActionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StatelessCustomActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about metrics to publish to CloudWatch.
     * </p>
     */
    private StatelessCustomPublishMetricAction publishMetricAction;

    /**
     * <p>
     * Information about metrics to publish to CloudWatch.
     * </p>
     * 
     * @param publishMetricAction
     *        Information about metrics to publish to CloudWatch.
     */

    public void setPublishMetricAction(StatelessCustomPublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    /**
     * <p>
     * Information about metrics to publish to CloudWatch.
     * </p>
     * 
     * @return Information about metrics to publish to CloudWatch.
     */

    public StatelessCustomPublishMetricAction getPublishMetricAction() {
        return this.publishMetricAction;
    }

    /**
     * <p>
     * Information about metrics to publish to CloudWatch.
     * </p>
     * 
     * @param publishMetricAction
     *        Information about metrics to publish to CloudWatch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StatelessCustomActionDefinition withPublishMetricAction(StatelessCustomPublishMetricAction publishMetricAction) {
        setPublishMetricAction(publishMetricAction);
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
        if (getPublishMetricAction() != null)
            sb.append("PublishMetricAction: ").append(getPublishMetricAction());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StatelessCustomActionDefinition == false)
            return false;
        StatelessCustomActionDefinition other = (StatelessCustomActionDefinition) obj;
        if (other.getPublishMetricAction() == null ^ this.getPublishMetricAction() == null)
            return false;
        if (other.getPublishMetricAction() != null && other.getPublishMetricAction().equals(this.getPublishMetricAction()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPublishMetricAction() == null) ? 0 : getPublishMetricAction().hashCode());
        return hashCode;
    }

    @Override
    public StatelessCustomActionDefinition clone() {
        try {
            return (StatelessCustomActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.StatelessCustomActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
