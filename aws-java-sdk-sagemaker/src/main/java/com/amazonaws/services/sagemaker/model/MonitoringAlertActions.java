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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of alert actions taken in response to an alert going into <code>InAlert</code> status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/MonitoringAlertActions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringAlertActions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An alert action taken to light up an icon on the Model Dashboard when an alert goes into <code>InAlert</code>
     * status.
     * </p>
     */
    private ModelDashboardIndicatorAction modelDashboardIndicator;

    /**
     * <p>
     * An alert action taken to light up an icon on the Model Dashboard when an alert goes into <code>InAlert</code>
     * status.
     * </p>
     * 
     * @param modelDashboardIndicator
     *        An alert action taken to light up an icon on the Model Dashboard when an alert goes into
     *        <code>InAlert</code> status.
     */

    public void setModelDashboardIndicator(ModelDashboardIndicatorAction modelDashboardIndicator) {
        this.modelDashboardIndicator = modelDashboardIndicator;
    }

    /**
     * <p>
     * An alert action taken to light up an icon on the Model Dashboard when an alert goes into <code>InAlert</code>
     * status.
     * </p>
     * 
     * @return An alert action taken to light up an icon on the Model Dashboard when an alert goes into
     *         <code>InAlert</code> status.
     */

    public ModelDashboardIndicatorAction getModelDashboardIndicator() {
        return this.modelDashboardIndicator;
    }

    /**
     * <p>
     * An alert action taken to light up an icon on the Model Dashboard when an alert goes into <code>InAlert</code>
     * status.
     * </p>
     * 
     * @param modelDashboardIndicator
     *        An alert action taken to light up an icon on the Model Dashboard when an alert goes into
     *        <code>InAlert</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringAlertActions withModelDashboardIndicator(ModelDashboardIndicatorAction modelDashboardIndicator) {
        setModelDashboardIndicator(modelDashboardIndicator);
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
        if (getModelDashboardIndicator() != null)
            sb.append("ModelDashboardIndicator: ").append(getModelDashboardIndicator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringAlertActions == false)
            return false;
        MonitoringAlertActions other = (MonitoringAlertActions) obj;
        if (other.getModelDashboardIndicator() == null ^ this.getModelDashboardIndicator() == null)
            return false;
        if (other.getModelDashboardIndicator() != null && other.getModelDashboardIndicator().equals(this.getModelDashboardIndicator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelDashboardIndicator() == null) ? 0 : getModelDashboardIndicator().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringAlertActions clone() {
        try {
            return (MonitoringAlertActions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.MonitoringAlertActionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
