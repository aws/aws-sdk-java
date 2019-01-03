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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Pinpoint analytics configuration for collecting metrics for a user pool.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AnalyticsConfigurationType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnalyticsConfigurationType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The external ID.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events it
     * publishes to Amazon Pinpoint analytics.
     * </p>
     */
    private Boolean userDataShared;

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * 
     * @param applicationId
     *        The application ID for an Amazon Pinpoint application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * 
     * @return The application ID for an Amazon Pinpoint application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID for an Amazon Pinpoint application.
     * </p>
     * 
     * @param applicationId
     *        The application ID for an Amazon Pinpoint application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsConfigurationType withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     * </p>
     * 
     * @return The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsConfigurationType withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @param externalId
     *        The external ID.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @return The external ID.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID.
     * </p>
     * 
     * @param externalId
     *        The external ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsConfigurationType withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events it
     * publishes to Amazon Pinpoint analytics.
     * </p>
     * 
     * @param userDataShared
     *        If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events
     *        it publishes to Amazon Pinpoint analytics.
     */

    public void setUserDataShared(Boolean userDataShared) {
        this.userDataShared = userDataShared;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events it
     * publishes to Amazon Pinpoint analytics.
     * </p>
     * 
     * @return If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events
     *         it publishes to Amazon Pinpoint analytics.
     */

    public Boolean getUserDataShared() {
        return this.userDataShared;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events it
     * publishes to Amazon Pinpoint analytics.
     * </p>
     * 
     * @param userDataShared
     *        If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events
     *        it publishes to Amazon Pinpoint analytics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnalyticsConfigurationType withUserDataShared(Boolean userDataShared) {
        setUserDataShared(userDataShared);
        return this;
    }

    /**
     * <p>
     * If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events it
     * publishes to Amazon Pinpoint analytics.
     * </p>
     * 
     * @return If <code>UserDataShared</code> is <code>true</code>, Amazon Cognito will include user data in the events
     *         it publishes to Amazon Pinpoint analytics.
     */

    public Boolean isUserDataShared() {
        return this.userDataShared;
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
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
        if (getUserDataShared() != null)
            sb.append("UserDataShared: ").append(getUserDataShared());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnalyticsConfigurationType == false)
            return false;
        AnalyticsConfigurationType other = (AnalyticsConfigurationType) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getUserDataShared() == null ^ this.getUserDataShared() == null)
            return false;
        if (other.getUserDataShared() != null && other.getUserDataShared().equals(this.getUserDataShared()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getUserDataShared() == null) ? 0 : getUserDataShared().hashCode());
        return hashCode;
    }

    @Override
    public AnalyticsConfigurationType clone() {
        try {
            return (AnalyticsConfigurationType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.AnalyticsConfigurationTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
