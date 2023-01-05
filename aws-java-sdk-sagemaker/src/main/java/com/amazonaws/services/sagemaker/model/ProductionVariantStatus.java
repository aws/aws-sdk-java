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
 * Describes the status of the production variant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ProductionVariantStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProductionVariantStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code>: Creating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: Terminating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Updating capacity for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * A message that describes the status of the production variant.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The start time of the current status change.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code>: Creating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: Terminating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Updating capacity for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The endpoint variant status which describes the current deployment stage status or operational status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code>: Creating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: Terminating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: Updating capacity for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback
     *        configuration.
     *        </p>
     *        </li>
     * @see VariantStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code>: Creating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: Terminating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Updating capacity for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The endpoint variant status which describes the current deployment stage status or operational
     *         status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Creating</code>: Creating inference resources for the production variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Deleting</code>: Terminating inference resources for the production variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Updating</code>: Updating capacity for the production variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback
     *         configuration.
     *         </p>
     *         </li>
     * @see VariantStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code>: Creating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: Terminating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Updating capacity for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The endpoint variant status which describes the current deployment stage status or operational status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code>: Creating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: Terminating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: Updating capacity for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback
     *        configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariantStatus
     */

    public ProductionVariantStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The endpoint variant status which describes the current deployment stage status or operational status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Creating</code>: Creating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Deleting</code>: Terminating inference resources for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Updating</code>: Updating capacity for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback configuration.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The endpoint variant status which describes the current deployment stage status or operational status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Creating</code>: Creating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Deleting</code>: Terminating inference resources for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Updating</code>: Updating capacity for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ActivatingTraffic</code>: Turning on traffic for the production variant.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Baking</code>: Waiting period to monitor the CloudWatch alarms in the automatic rollback
     *        configuration.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VariantStatus
     */

    public ProductionVariantStatus withStatus(VariantStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message that describes the status of the production variant.
     * </p>
     * 
     * @param statusMessage
     *        A message that describes the status of the production variant.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message that describes the status of the production variant.
     * </p>
     * 
     * @return A message that describes the status of the production variant.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message that describes the status of the production variant.
     * </p>
     * 
     * @param statusMessage
     *        A message that describes the status of the production variant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantStatus withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The start time of the current status change.
     * </p>
     * 
     * @param startTime
     *        The start time of the current status change.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the current status change.
     * </p>
     * 
     * @return The start time of the current status change.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the current status change.
     * </p>
     * 
     * @param startTime
     *        The start time of the current status change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProductionVariantStatus withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProductionVariantStatus == false)
            return false;
        ProductionVariantStatus other = (ProductionVariantStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public ProductionVariantStatus clone() {
        try {
            return (ProductionVariantStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ProductionVariantStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
