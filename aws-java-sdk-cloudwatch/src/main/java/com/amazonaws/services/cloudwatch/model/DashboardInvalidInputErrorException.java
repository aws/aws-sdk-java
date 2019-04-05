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

import javax.annotation.Generated;

/**
 * <p>
 * Some part of the dashboard data is invalid.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DashboardInvalidInputErrorException extends com.amazonaws.services.cloudwatch.model.AmazonCloudWatchException {
    private static final long serialVersionUID = 1L;

    private com.amazonaws.internal.SdkInternalList<DashboardValidationMessage> dashboardValidationMessages;

    /**
     * Constructs a new DashboardInvalidInputErrorException with the specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public DashboardInvalidInputErrorException(String message) {
        super(message);
    }

    /**
     * @return
     */

    public java.util.List<DashboardValidationMessage> getDashboardValidationMessages() {
        if (dashboardValidationMessages == null) {
            dashboardValidationMessages = new com.amazonaws.internal.SdkInternalList<DashboardValidationMessage>();
        }
        return dashboardValidationMessages;
    }

    /**
     * @param dashboardValidationMessages
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDashboardValidationMessages(java.util.Collection)} or
     * {@link #withDashboardValidationMessages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param dashboardValidationMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardInvalidInputErrorException withDashboardValidationMessages(DashboardValidationMessage... dashboardValidationMessages) {
        if (this.dashboardValidationMessages == null) {
            setDashboardValidationMessages(new com.amazonaws.internal.SdkInternalList<DashboardValidationMessage>(dashboardValidationMessages.length));
        }
        for (DashboardValidationMessage ele : dashboardValidationMessages) {
            this.dashboardValidationMessages.add(ele);
        }
        return this;
    }

    /**
     * @param dashboardValidationMessages
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DashboardInvalidInputErrorException withDashboardValidationMessages(java.util.Collection<DashboardValidationMessage> dashboardValidationMessages) {
        setDashboardValidationMessages(dashboardValidationMessages);
        return this;
    }

}
