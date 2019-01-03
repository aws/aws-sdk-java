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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/PutDashboard" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDashboardResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or modified,
     * this result is empty.
     * </p>
     * <p>
     * If this result includes only warning messages, then the input was valid enough for the dashboard to be created or
     * modified, but some elements of the dashboard may not render.
     * </p>
     * <p>
     * If this result includes error messages, the input was not valid and the operation failed.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DashboardValidationMessage> dashboardValidationMessages;

    /**
     * <p>
     * If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or modified,
     * this result is empty.
     * </p>
     * <p>
     * If this result includes only warning messages, then the input was valid enough for the dashboard to be created or
     * modified, but some elements of the dashboard may not render.
     * </p>
     * <p>
     * If this result includes error messages, the input was not valid and the operation failed.
     * </p>
     * 
     * @return If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or
     *         modified, this result is empty.</p>
     *         <p>
     *         If this result includes only warning messages, then the input was valid enough for the dashboard to be
     *         created or modified, but some elements of the dashboard may not render.
     *         </p>
     *         <p>
     *         If this result includes error messages, the input was not valid and the operation failed.
     */

    public java.util.List<DashboardValidationMessage> getDashboardValidationMessages() {
        if (dashboardValidationMessages == null) {
            dashboardValidationMessages = new com.amazonaws.internal.SdkInternalList<DashboardValidationMessage>();
        }
        return dashboardValidationMessages;
    }

    /**
     * <p>
     * If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or modified,
     * this result is empty.
     * </p>
     * <p>
     * If this result includes only warning messages, then the input was valid enough for the dashboard to be created or
     * modified, but some elements of the dashboard may not render.
     * </p>
     * <p>
     * If this result includes error messages, the input was not valid and the operation failed.
     * </p>
     * 
     * @param dashboardValidationMessages
     *        If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or
     *        modified, this result is empty.</p>
     *        <p>
     *        If this result includes only warning messages, then the input was valid enough for the dashboard to be
     *        created or modified, but some elements of the dashboard may not render.
     *        </p>
     *        <p>
     *        If this result includes error messages, the input was not valid and the operation failed.
     */

    public void setDashboardValidationMessages(java.util.Collection<DashboardValidationMessage> dashboardValidationMessages) {
        if (dashboardValidationMessages == null) {
            this.dashboardValidationMessages = null;
            return;
        }

        this.dashboardValidationMessages = new com.amazonaws.internal.SdkInternalList<DashboardValidationMessage>(dashboardValidationMessages);
    }

    /**
     * <p>
     * If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or modified,
     * this result is empty.
     * </p>
     * <p>
     * If this result includes only warning messages, then the input was valid enough for the dashboard to be created or
     * modified, but some elements of the dashboard may not render.
     * </p>
     * <p>
     * If this result includes error messages, the input was not valid and the operation failed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardValidationMessages(java.util.Collection)} or
     * {@link #withDashboardValidationMessages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dashboardValidationMessages
     *        If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or
     *        modified, this result is empty.</p>
     *        <p>
     *        If this result includes only warning messages, then the input was valid enough for the dashboard to be
     *        created or modified, but some elements of the dashboard may not render.
     *        </p>
     *        <p>
     *        If this result includes error messages, the input was not valid and the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDashboardResult withDashboardValidationMessages(DashboardValidationMessage... dashboardValidationMessages) {
        if (this.dashboardValidationMessages == null) {
            setDashboardValidationMessages(new com.amazonaws.internal.SdkInternalList<DashboardValidationMessage>(dashboardValidationMessages.length));
        }
        for (DashboardValidationMessage ele : dashboardValidationMessages) {
            this.dashboardValidationMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or modified,
     * this result is empty.
     * </p>
     * <p>
     * If this result includes only warning messages, then the input was valid enough for the dashboard to be created or
     * modified, but some elements of the dashboard may not render.
     * </p>
     * <p>
     * If this result includes error messages, the input was not valid and the operation failed.
     * </p>
     * 
     * @param dashboardValidationMessages
     *        If the input for <code>PutDashboard</code> was correct and the dashboard was successfully created or
     *        modified, this result is empty.</p>
     *        <p>
     *        If this result includes only warning messages, then the input was valid enough for the dashboard to be
     *        created or modified, but some elements of the dashboard may not render.
     *        </p>
     *        <p>
     *        If this result includes error messages, the input was not valid and the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDashboardResult withDashboardValidationMessages(java.util.Collection<DashboardValidationMessage> dashboardValidationMessages) {
        setDashboardValidationMessages(dashboardValidationMessages);
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
        if (getDashboardValidationMessages() != null)
            sb.append("DashboardValidationMessages: ").append(getDashboardValidationMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDashboardResult == false)
            return false;
        PutDashboardResult other = (PutDashboardResult) obj;
        if (other.getDashboardValidationMessages() == null ^ this.getDashboardValidationMessages() == null)
            return false;
        if (other.getDashboardValidationMessages() != null && other.getDashboardValidationMessages().equals(this.getDashboardValidationMessages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDashboardValidationMessages() == null) ? 0 : getDashboardValidationMessages().hashCode());
        return hashCode;
    }

    @Override
    public PutDashboardResult clone() {
        try {
            return (PutDashboardResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
