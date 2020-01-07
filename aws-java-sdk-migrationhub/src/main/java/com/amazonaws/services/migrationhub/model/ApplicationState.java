/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.migrationhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The state of an application discovered through Migration Hub import, the AWS Agentless Discovery Connector, or the
 * AWS Application Discovery Agent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/AWSMigrationHub-2017-05-31/ApplicationState" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configurationId from the Application Discovery Service that uniquely identifies an application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The current status of an application.
     * </p>
     */
    private String applicationStatus;
    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedTime;

    /**
     * <p>
     * The configurationId from the Application Discovery Service that uniquely identifies an application.
     * </p>
     * 
     * @param applicationId
     *        The configurationId from the Application Discovery Service that uniquely identifies an application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The configurationId from the Application Discovery Service that uniquely identifies an application.
     * </p>
     * 
     * @return The configurationId from the Application Discovery Service that uniquely identifies an application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The configurationId from the Application Discovery Service that uniquely identifies an application.
     * </p>
     * 
     * @param applicationId
     *        The configurationId from the Application Discovery Service that uniquely identifies an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationState withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The current status of an application.
     * </p>
     * 
     * @param applicationStatus
     *        The current status of an application.
     * @see ApplicationStatus
     */

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    /**
     * <p>
     * The current status of an application.
     * </p>
     * 
     * @return The current status of an application.
     * @see ApplicationStatus
     */

    public String getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * <p>
     * The current status of an application.
     * </p>
     * 
     * @param applicationStatus
     *        The current status of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationState withApplicationStatus(String applicationStatus) {
        setApplicationStatus(applicationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of an application.
     * </p>
     * 
     * @param applicationStatus
     *        The current status of an application.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ApplicationStatus
     */

    public ApplicationState withApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the application status was last updated.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     * 
     * @return The timestamp when the application status was last updated.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The timestamp when the application status was last updated.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The timestamp when the application status was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationState withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getApplicationStatus() != null)
            sb.append("ApplicationStatus: ").append(getApplicationStatus()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationState == false)
            return false;
        ApplicationState other = (ApplicationState) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getApplicationStatus() == null ^ this.getApplicationStatus() == null)
            return false;
        if (other.getApplicationStatus() != null && other.getApplicationStatus().equals(this.getApplicationStatus()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getApplicationStatus() == null) ? 0 : getApplicationStatus().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationState clone() {
        try {
            return (ApplicationState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhub.model.transform.ApplicationStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
