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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/UpdateApplicationMaintenanceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateApplicationMaintenanceConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     */
    private String applicationARN;
    /**
     * <p>
     * The application maintenance configuration description after the update.
     * </p>
     */
    private ApplicationMaintenanceConfigurationDescription applicationMaintenanceConfigurationDescription;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     */

    public void setApplicationARN(String applicationARN) {
        this.applicationARN = applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the application.
     */

    public String getApplicationARN() {
        return this.applicationARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the application.
     * </p>
     * 
     * @param applicationARN
     *        The Amazon Resource Name (ARN) of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationMaintenanceConfigurationResult withApplicationARN(String applicationARN) {
        setApplicationARN(applicationARN);
        return this;
    }

    /**
     * <p>
     * The application maintenance configuration description after the update.
     * </p>
     * 
     * @param applicationMaintenanceConfigurationDescription
     *        The application maintenance configuration description after the update.
     */

    public void setApplicationMaintenanceConfigurationDescription(ApplicationMaintenanceConfigurationDescription applicationMaintenanceConfigurationDescription) {
        this.applicationMaintenanceConfigurationDescription = applicationMaintenanceConfigurationDescription;
    }

    /**
     * <p>
     * The application maintenance configuration description after the update.
     * </p>
     * 
     * @return The application maintenance configuration description after the update.
     */

    public ApplicationMaintenanceConfigurationDescription getApplicationMaintenanceConfigurationDescription() {
        return this.applicationMaintenanceConfigurationDescription;
    }

    /**
     * <p>
     * The application maintenance configuration description after the update.
     * </p>
     * 
     * @param applicationMaintenanceConfigurationDescription
     *        The application maintenance configuration description after the update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateApplicationMaintenanceConfigurationResult withApplicationMaintenanceConfigurationDescription(
            ApplicationMaintenanceConfigurationDescription applicationMaintenanceConfigurationDescription) {
        setApplicationMaintenanceConfigurationDescription(applicationMaintenanceConfigurationDescription);
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
        if (getApplicationARN() != null)
            sb.append("ApplicationARN: ").append(getApplicationARN()).append(",");
        if (getApplicationMaintenanceConfigurationDescription() != null)
            sb.append("ApplicationMaintenanceConfigurationDescription: ").append(getApplicationMaintenanceConfigurationDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateApplicationMaintenanceConfigurationResult == false)
            return false;
        UpdateApplicationMaintenanceConfigurationResult other = (UpdateApplicationMaintenanceConfigurationResult) obj;
        if (other.getApplicationARN() == null ^ this.getApplicationARN() == null)
            return false;
        if (other.getApplicationARN() != null && other.getApplicationARN().equals(this.getApplicationARN()) == false)
            return false;
        if (other.getApplicationMaintenanceConfigurationDescription() == null ^ this.getApplicationMaintenanceConfigurationDescription() == null)
            return false;
        if (other.getApplicationMaintenanceConfigurationDescription() != null
                && other.getApplicationMaintenanceConfigurationDescription().equals(this.getApplicationMaintenanceConfigurationDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationARN() == null) ? 0 : getApplicationARN().hashCode());
        hashCode = prime * hashCode
                + ((getApplicationMaintenanceConfigurationDescription() == null) ? 0 : getApplicationMaintenanceConfigurationDescription().hashCode());
        return hashCode;
    }

    @Override
    public UpdateApplicationMaintenanceConfigurationResult clone() {
        try {
            return (UpdateApplicationMaintenanceConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
