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
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/UpdateSubscriptionNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionNotificationConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * </p>
     */
    private Boolean createSqs;
    /**
     * <p>
     * The key name for the subscription notification.
     * </p>
     */
    private String httpsApiKeyName;
    /**
     * <p>
     * The key value for the subscription notification.
     * </p>
     */
    private String httpsApiKeyValue;
    /**
     * <p>
     * The HTTPS method used for the subscription notification.
     * </p>
     */
    private String httpsMethod;
    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The subscription endpoint in Security Lake.
     * </p>
     */
    private String subscriptionEndpoint;
    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     */
    private String subscriptionId;

    /**
     * <p>
     * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * </p>
     * 
     * @param createSqs
     *        Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     */

    public void setCreateSqs(Boolean createSqs) {
        this.createSqs = createSqs;
    }

    /**
     * <p>
     * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * </p>
     * 
     * @return Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     */

    public Boolean getCreateSqs() {
        return this.createSqs;
    }

    /**
     * <p>
     * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * </p>
     * 
     * @param createSqs
     *        Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withCreateSqs(Boolean createSqs) {
        setCreateSqs(createSqs);
        return this;
    }

    /**
     * <p>
     * Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     * </p>
     * 
     * @return Create a new subscription notification for the specified subscription ID in Amazon Security Lake.
     */

    public Boolean isCreateSqs() {
        return this.createSqs;
    }

    /**
     * <p>
     * The key name for the subscription notification.
     * </p>
     * 
     * @param httpsApiKeyName
     *        The key name for the subscription notification.
     */

    public void setHttpsApiKeyName(String httpsApiKeyName) {
        this.httpsApiKeyName = httpsApiKeyName;
    }

    /**
     * <p>
     * The key name for the subscription notification.
     * </p>
     * 
     * @return The key name for the subscription notification.
     */

    public String getHttpsApiKeyName() {
        return this.httpsApiKeyName;
    }

    /**
     * <p>
     * The key name for the subscription notification.
     * </p>
     * 
     * @param httpsApiKeyName
     *        The key name for the subscription notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withHttpsApiKeyName(String httpsApiKeyName) {
        setHttpsApiKeyName(httpsApiKeyName);
        return this;
    }

    /**
     * <p>
     * The key value for the subscription notification.
     * </p>
     * 
     * @param httpsApiKeyValue
     *        The key value for the subscription notification.
     */

    public void setHttpsApiKeyValue(String httpsApiKeyValue) {
        this.httpsApiKeyValue = httpsApiKeyValue;
    }

    /**
     * <p>
     * The key value for the subscription notification.
     * </p>
     * 
     * @return The key value for the subscription notification.
     */

    public String getHttpsApiKeyValue() {
        return this.httpsApiKeyValue;
    }

    /**
     * <p>
     * The key value for the subscription notification.
     * </p>
     * 
     * @param httpsApiKeyValue
     *        The key value for the subscription notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withHttpsApiKeyValue(String httpsApiKeyValue) {
        setHttpsApiKeyValue(httpsApiKeyValue);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the subscription notification.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the subscription notification.
     * @see HttpsMethod
     */

    public void setHttpsMethod(String httpsMethod) {
        this.httpsMethod = httpsMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the subscription notification.
     * </p>
     * 
     * @return The HTTPS method used for the subscription notification.
     * @see HttpsMethod
     */

    public String getHttpsMethod() {
        return this.httpsMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the subscription notification.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the subscription notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpsMethod
     */

    public UpdateSubscriptionNotificationConfigurationRequest withHttpsMethod(String httpsMethod) {
        setHttpsMethod(httpsMethod);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the subscription notification.
     * </p>
     * 
     * @param httpsMethod
     *        The HTTPS method used for the subscription notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpsMethod
     */

    public UpdateSubscriptionNotificationConfigurationRequest withHttpsMethod(HttpsMethod httpsMethod) {
        this.httpsMethod = httpsMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) specifying the role of the subscriber.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) specifying the role of the subscriber.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint in Security Lake.
     */

    public void setSubscriptionEndpoint(String subscriptionEndpoint) {
        this.subscriptionEndpoint = subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake.
     * </p>
     * 
     * @return The subscription endpoint in Security Lake.
     */

    public String getSubscriptionEndpoint() {
        return this.subscriptionEndpoint;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake.
     * </p>
     * 
     * @param subscriptionEndpoint
     *        The subscription endpoint in Security Lake.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withSubscriptionEndpoint(String subscriptionEndpoint) {
        setSubscriptionEndpoint(subscriptionEndpoint);
        return this;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID for which the subscription notification is specified.
     */

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @return The subscription ID for which the subscription notification is specified.
     */

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * <p>
     * The subscription ID for which the subscription notification is specified.
     * </p>
     * 
     * @param subscriptionId
     *        The subscription ID for which the subscription notification is specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionNotificationConfigurationRequest withSubscriptionId(String subscriptionId) {
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

        if (obj instanceof UpdateSubscriptionNotificationConfigurationRequest == false)
            return false;
        UpdateSubscriptionNotificationConfigurationRequest other = (UpdateSubscriptionNotificationConfigurationRequest) obj;
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
    public UpdateSubscriptionNotificationConfigurationRequest clone() {
        return (UpdateSubscriptionNotificationConfigurationRequest) super.clone();
    }

}
