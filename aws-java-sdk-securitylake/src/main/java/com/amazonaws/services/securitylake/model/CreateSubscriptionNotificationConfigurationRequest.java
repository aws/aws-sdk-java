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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/CreateSubscriptionNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSubscriptionNotificationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Create an Amazon Simple Queue Service queue.
     * </p>
     */
    private Boolean createSqs;
    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     */
    private String httpsApiKeyName;
    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     */
    private String httpsApiKeyValue;
    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     */
    private String httpsMethod;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     */
    private String subscriptionEndpoint;
    /**
     * <p>
     * The subscription ID for the notification subscription/
     * </p>
     */
    private String subscriptionId;

    /**
     * <p>
     * Create an Amazon Simple Queue Service queue.
     * </p>
     * 
     * @param createSqs
     *        Create an Amazon Simple Queue Service queue.
     */

    public void setCreateSqs(Boolean createSqs) {
        this.createSqs = createSqs;
    }

    /**
     * <p>
     * Create an Amazon Simple Queue Service queue.
     * </p>
     * 
     * @return Create an Amazon Simple Queue Service queue.
     */

    public Boolean getCreateSqs() {
        return this.createSqs;
    }

    /**
     * <p>
     * Create an Amazon Simple Queue Service queue.
     * </p>
     * 
     * @param createSqs
     *        Create an Amazon Simple Queue Service queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withCreateSqs(Boolean createSqs) {
        setCreateSqs(createSqs);
        return this;
    }

    /**
     * <p>
     * Create an Amazon Simple Queue Service queue.
     * </p>
     * 
     * @return Create an Amazon Simple Queue Service queue.
     */

    public Boolean isCreateSqs() {
        return this.createSqs;
    }

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @param httpsApiKeyName
     *        The key name for the notification subscription.
     */

    public void setHttpsApiKeyName(String httpsApiKeyName) {
        this.httpsApiKeyName = httpsApiKeyName;
    }

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @return The key name for the notification subscription.
     */

    public String getHttpsApiKeyName() {
        return this.httpsApiKeyName;
    }

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @param httpsApiKeyName
     *        The key name for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withHttpsApiKeyName(String httpsApiKeyName) {
        setHttpsApiKeyName(httpsApiKeyName);
        return this;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @param httpsApiKeyValue
     *        The key value for the notification subscription.
     */

    public void setHttpsApiKeyValue(String httpsApiKeyValue) {
        this.httpsApiKeyValue = httpsApiKeyValue;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @return The key value for the notification subscription.
     */

    public String getHttpsApiKeyValue() {
        return this.httpsApiKeyValue;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @param httpsApiKeyValue
     *        The key value for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withHttpsApiKeyValue(String httpsApiKeyValue) {
        setHttpsApiKeyValue(httpsApiKeyValue);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the notification subscription.
     * @see HttpsMethod
     */

    public void setHttpsMethod(String httpsMethod) {
        this.httpsMethod = httpsMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @return The HTTPS method used for the notification subscription.
     * @see HttpsMethod
     */

    public String getHttpsMethod() {
        return this.httpsMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpsMethod
     */

    public CreateSubscriptionNotificationConfigurationRequest withHttpsMethod(String httpsMethod) {
        setHttpsMethod(httpsMethod);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpsMethod
     */

    public CreateSubscriptionNotificationConfigurationRequest withHttpsMethod(HttpsMethod httpsMethod) {
        this.httpsMethod = httpsMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate
     *        this field.
     */

    public void setSubscriptionEndpoint(String subscriptionEndpoint) {
        this.subscriptionEndpoint = subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     * 
     * @return The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate
     *         this field.
     */

    public String getSubscriptionEndpoint() {
        return this.subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate
     *        this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withSubscriptionEndpoint(String subscriptionEndpoint) {
        setSubscriptionEndpoint(subscriptionEndpoint);
        return this;
    }

    /**
     * <p>
     * The subscription ID for the notification subscription/
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID for the notification subscription/
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The subscription ID for the notification subscription/
     * </p>
     * 
     * @return The subscription ID for the notification subscription/
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The subscription ID for the notification subscription/
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID for the notification subscription/
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSubscriptionNotificationConfigurationRequest withSubscriptionId(String subscriptionId) {
        setSubscriptionId(subscriptionId);
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
        if (getCreateSqs() != null)
            sb.append("CreateSqs: ").append(getCreateSqs()).append(",");
        if (getHttpsApiKeyName() != null)
            sb.append("HttpsApiKeyName: ").append(getHttpsApiKeyName()).append(",");
        if (getHttpsApiKeyValue() != null)
            sb.append("HttpsApiKeyValue: ").append(getHttpsApiKeyValue()).append(",");
        if (getHttpsMethod() != null)
            sb.append("HttpsMethod: ").append(getHttpsMethod()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSubscriptionEndpoint() != null)
            sb.append("SubscriptionEndpoint: ").append(getSubscriptionEndpoint()).append(",");
        if (getSubscriptionId() != null)
            sb.append("SubscriptionId: ").append(getSubscriptionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSubscriptionNotificationConfigurationRequest == false)
            return false;
        CreateSubscriptionNotificationConfigurationRequest other = (CreateSubscriptionNotificationConfigurationRequest) obj;
        if (other.getCreateSqs() == null ^ this.getCreateSqs() == null)
            return false;
        if (other.getCreateSqs() != null && other.getCreateSqs().equals(this.getCreateSqs()) == false)
            return false;
        if (other.getHttpsApiKeyName() == null ^ this.getHttpsApiKeyName() == null)
            return false;
        if (other.getHttpsApiKeyName() != null && other.getHttpsApiKeyName().equals(this.getHttpsApiKeyName()) == false)
            return false;
        if (other.getHttpsApiKeyValue() == null ^ this.getHttpsApiKeyValue() == null)
            return false;
        if (other.getHttpsApiKeyValue() != null && other.getHttpsApiKeyValue().equals(this.getHttpsApiKeyValue()) == false)
            return false;
        if (other.getHttpsMethod() == null ^ this.getHttpsMethod() == null)
            return false;
        if (other.getHttpsMethod() != null && other.getHttpsMethod().equals(this.getHttpsMethod()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSubscriptionEndpoint() == null ^ this.getSubscriptionEndpoint() == null)
            return false;
        if (other.getSubscriptionEndpoint() != null && other.getSubscriptionEndpoint().equals(this.getSubscriptionEndpoint()) == false)
            return false;
        if (other.getSubscriptionId() == null ^ this.getSubscriptionId() == null)
            return false;
        if (other.getSubscriptionId() != null && other.getSubscriptionId().equals(this.getSubscriptionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateSqs() == null) ? 0 : getCreateSqs().hashCode());
        hashCode = prime * hashCode + ((getHttpsApiKeyName() == null) ? 0 : getHttpsApiKeyName().hashCode());
        hashCode = prime * hashCode + ((getHttpsApiKeyValue() == null) ? 0 : getHttpsApiKeyValue().hashCode());
        hashCode = prime * hashCode + ((getHttpsMethod() == null) ? 0 : getHttpsMethod().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionEndpoint() == null) ? 0 : getSubscriptionEndpoint().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionId() == null) ? 0 : getSubscriptionId().hashCode());
        return hashCode;
    }

    @Override
    public CreateSubscriptionNotificationConfigurationRequest clone() {
        return (CreateSubscriptionNotificationConfigurationRequest) super.clone();
    }

}
