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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The deployment summary of the enabled control.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnablementStatusSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnablementStatusSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The last operation identifier for the enabled control.
     * </p>
     */
    private String lastOperationIdentifier;
    /**
     * <p>
     * The deployment status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The last operation identifier for the enabled control.
     * </p>
     * 
     * @param lastOperationIdentifier
     *        The last operation identifier for the enabled control.
     */

    public void setLastOperationIdentifier(String lastOperationIdentifier) {
        this.lastOperationIdentifier = lastOperationIdentifier;
    }

    /**
     * <p>
     * The last operation identifier for the enabled control.
     * </p>
     * 
     * @return The last operation identifier for the enabled control.
     */

    public String getLastOperationIdentifier() {
        return this.lastOperationIdentifier;
    }

    /**
     * <p>
     * The last operation identifier for the enabled control.
     * </p>
     * 
     * @param lastOperationIdentifier
     *        The last operation identifier for the enabled control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnablementStatusSummary withLastOperationIdentifier(String lastOperationIdentifier) {
        setLastOperationIdentifier(lastOperationIdentifier);
        return this;
    }

    /**
     * <p>
     * The deployment status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     *        </p>
     *        </li>
     * @see EnablementStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The deployment status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The deployment status of the enabled control.</p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     *         </p>
     *         </li>
     * @see EnablementStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The deployment status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementStatus
     */

    public EnablementStatusSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The deployment status of the enabled control.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The deployment status of the enabled control.</p>
     *        <p>
     *        Valid values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The <code>enabledControl</code> configuration was deployed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNDER_CHANGE</code>: The <code>enabledControl</code> configuration is changing.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The <code>enabledControl</code> configuration failed to deploy.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnablementStatus
     */

    public EnablementStatusSummary withStatus(EnablementStatus status) {
        this.status = status.toString();
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
        if (getLastOperationIdentifier() != null)
            sb.append("LastOperationIdentifier: ").append(getLastOperationIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnablementStatusSummary == false)
            return false;
        EnablementStatusSummary other = (EnablementStatusSummary) obj;
        if (other.getLastOperationIdentifier() == null ^ this.getLastOperationIdentifier() == null)
            return false;
        if (other.getLastOperationIdentifier() != null && other.getLastOperationIdentifier().equals(this.getLastOperationIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastOperationIdentifier() == null) ? 0 : getLastOperationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public EnablementStatusSummary clone() {
        try {
            return (EnablementStatusSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.controltower.model.transform.EnablementStatusSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
