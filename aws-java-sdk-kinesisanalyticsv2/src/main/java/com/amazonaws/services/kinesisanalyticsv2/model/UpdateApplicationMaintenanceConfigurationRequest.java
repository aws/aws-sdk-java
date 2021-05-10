/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplicationMaintenanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationMaintenanceConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the application for which you want to update the maintenance configuration.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Describes the application maintenance configuration update.
     * </p>
     */
    private ApplicationMaintenanceConfigurationUpdate applicationMaintenanceConfigurationUpdate;

    /**
     * <p>
     * The name of the application for which you want to update the maintenance configuration.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to update the maintenance configuration.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to update the maintenance configuration.
     * </p>
     * 
     * @return The name of the application for which you want to update the maintenance configuration.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the application for which you want to update the maintenance configuration.
     * </p>
     * 
     * @param applicationName
     *        The name of the application for which you want to update the maintenance configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationMaintenanceConfigurationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Describes the application maintenance configuration update.
     * </p>
     * 
     * @param applicationMaintenanceConfigurationUpdate
     *        Describes the application maintenance configuration update.
     */

    public void setApplicationMaintenanceConfigurationUpdate(ApplicationMaintenanceConfigurationUpdate applicationMaintenanceConfigurationUpdate) {
        this.applicationMaintenanceConfigurationUpdate = applicationMaintenanceConfigurationUpdate;
    }

    /**
     * <p>
     * Describes the application maintenance configuration update.
     * </p>
     * 
     * @return Describes the application maintenance configuration update.
     */

    public ApplicationMaintenanceConfigurationUpdate getApplicationMaintenanceConfigurationUpdate() {
        return this.applicationMaintenanceConfigurationUpdate;
    }

    /**
     * <p>
     * Describes the application maintenance configuration update.
     * </p>
     * 
     * @param applicationMaintenanceConfigurationUpdate
     *        Describes the application maintenance configuration update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationMaintenanceConfigurationRequest withApplicationMaintenanceConfigurationUpdate(
            ApplicationMaintenanceConfigurationUpdate applicationMaintenanceConfigurationUpdate) {
        setApplicationMaintenanceConfigurationUpdate(applicationMaintenanceConfigurationUpdate);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getApplicationMaintenanceConfigurationUpdate() != null)
            sb.append("ApplicationMaintenanceConfigurationUpdate: ").append(getApplicationMaintenanceConfigurationUpdate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationMaintenanceConfigurationRequest == false)
            return false;
        UpdateApplicationMaintenanceConfigurationRequest other = (UpdateApplicationMaintenanceConfigurationRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getApplicationMaintenanceConfigurationUpdate() == null ^ this.getApplicationMaintenanceConfigurationUpdate() == null)
            return false;
        if (other.getApplicationMaintenanceConfigurationUpdate() != null
                && other.getApplicationMaintenanceConfigurationUpdate().equals(this.getApplicationMaintenanceConfigurationUpdate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationMaintenanceConfigurationUpdate() == null) ? 0 : getApplicationMaintenanceConfigurationUpdate().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationMaintenanceConfigurationRequest clone() {
        return (UpdateApplicationMaintenanceConfigurationRequest) super.clone();
    }

}
