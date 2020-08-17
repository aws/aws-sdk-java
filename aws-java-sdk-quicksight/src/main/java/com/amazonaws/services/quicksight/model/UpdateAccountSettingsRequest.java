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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/UpdateAccountSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight settings that you want to list.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     * register for the first time with QuickSight provide an email that becomes associated with the default namespace.
     * </p>
     */
    private String defaultNamespace;
    /**
     * <p>
     * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight
     * subscription.
     * </p>
     */
    private String notificationEmail;

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight settings that you want to list.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the QuickSight settings that you want to list.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight settings that you want to list.
     * </p>
     * 
     * @return The ID for the AWS account that contains the QuickSight settings that you want to list.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID for the AWS account that contains the QuickSight settings that you want to list.
     * </p>
     * 
     * @param awsAccountId
     *        The ID for the AWS account that contains the QuickSight settings that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     * register for the first time with QuickSight provide an email that becomes associated with the default namespace.
     * </p>
     * 
     * @param defaultNamespace
     *        The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     *        register for the first time with QuickSight provide an email that becomes associated with the default
     *        namespace.
     */

    public void setDefaultNamespace(String defaultNamespace) {
        this.defaultNamespace = defaultNamespace;
    }

    /**
     * <p>
     * The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     * register for the first time with QuickSight provide an email that becomes associated with the default namespace.
     * </p>
     * 
     * @return The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     *         register for the first time with QuickSight provide an email that becomes associated with the default
     *         namespace.
     */

    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    /**
     * <p>
     * The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     * register for the first time with QuickSight provide an email that becomes associated with the default namespace.
     * </p>
     * 
     * @param defaultNamespace
     *        The default namespace for this AWS Account. Currently, the default is <code>default</code>. IAM users who
     *        register for the first time with QuickSight provide an email that becomes associated with the default
     *        namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withDefaultNamespace(String defaultNamespace) {
        setDefaultNamespace(defaultNamespace);
        return this;
    }

    /**
     * <p>
     * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight
     * subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that you want QuickSight to send notifications to regarding your AWS account or
     *        QuickSight subscription.
     */

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    /**
     * <p>
     * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight
     * subscription.
     * </p>
     * 
     * @return The email address that you want QuickSight to send notifications to regarding your AWS account or
     *         QuickSight subscription.
     */

    public String getNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * <p>
     * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight
     * subscription.
     * </p>
     * 
     * @param notificationEmail
     *        The email address that you want QuickSight to send notifications to regarding your AWS account or
     *        QuickSight subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsRequest withNotificationEmail(String notificationEmail) {
        setNotificationEmail(notificationEmail);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDefaultNamespace() != null)
            sb.append("DefaultNamespace: ").append(getDefaultNamespace()).append(",");
        if (getNotificationEmail() != null)
            sb.append("NotificationEmail: ").append(getNotificationEmail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountSettingsRequest == false)
            return false;
        UpdateAccountSettingsRequest other = (UpdateAccountSettingsRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDefaultNamespace() == null ^ this.getDefaultNamespace() == null)
            return false;
        if (other.getDefaultNamespace() != null && other.getDefaultNamespace().equals(this.getDefaultNamespace()) == false)
            return false;
        if (other.getNotificationEmail() == null ^ this.getNotificationEmail() == null)
            return false;
        if (other.getNotificationEmail() != null && other.getNotificationEmail().equals(this.getNotificationEmail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDefaultNamespace() == null) ? 0 : getDefaultNamespace().hashCode());
        hashCode = prime * hashCode + ((getNotificationEmail() == null) ? 0 : getNotificationEmail().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountSettingsRequest clone() {
        return (UpdateAccountSettingsRequest) super.clone();
    }

}
