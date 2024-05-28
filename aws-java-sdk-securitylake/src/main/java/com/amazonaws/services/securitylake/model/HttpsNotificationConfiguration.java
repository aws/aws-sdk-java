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
package com.amazonaws.services.securitylake.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configurations for HTTPS subscriber notification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securitylake-2018-05-10/HttpsNotificationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HttpsNotificationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     */
    private String authorizationApiKeyName;
    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     */
    private String authorizationApiKeyValue;
    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     */
    private String httpMethod;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     * information about ARNs and how to use them in policies, see <a
     * href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing data
     * access</a> and <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web Services
     * Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     */
    private String targetRoleArn;

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @param authorizationApiKeyName
     *        The key name for the notification subscription.
     */

    public void setAuthorizationApiKeyName(String authorizationApiKeyName) {
        this.authorizationApiKeyName = authorizationApiKeyName;
    }

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @return The key name for the notification subscription.
     */

    public String getAuthorizationApiKeyName() {
        return this.authorizationApiKeyName;
    }

    /**
     * <p>
     * The key name for the notification subscription.
     * </p>
     * 
     * @param authorizationApiKeyName
     *        The key name for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpsNotificationConfiguration withAuthorizationApiKeyName(String authorizationApiKeyName) {
        setAuthorizationApiKeyName(authorizationApiKeyName);
        return this;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @param authorizationApiKeyValue
     *        The key value for the notification subscription.
     */

    public void setAuthorizationApiKeyValue(String authorizationApiKeyValue) {
        this.authorizationApiKeyValue = authorizationApiKeyValue;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @return The key value for the notification subscription.
     */

    public String getAuthorizationApiKeyValue() {
        return this.authorizationApiKeyValue;
    }

    /**
     * <p>
     * The key value for the notification subscription.
     * </p>
     * 
     * @param authorizationApiKeyValue
     *        The key value for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpsNotificationConfiguration withAuthorizationApiKeyValue(String authorizationApiKeyValue) {
        setAuthorizationApiKeyValue(authorizationApiKeyValue);
        return this;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     * 
     * @param endpoint
     *        The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate
     *        this field.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
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

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate this
     * field.
     * </p>
     * 
     * @param endpoint
     *        The subscription endpoint in Security Lake. If you prefer notification with an HTTPs endpoint, populate
     *        this field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpsNotificationConfiguration withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpMethod
     *        The HTTPS method used for the notification subscription.
     * @see HttpMethod
     */

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @return The HTTPS method used for the notification subscription.
     * @see HttpMethod
     */

    public String getHttpMethod() {
        return this.httpMethod;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpMethod
     *        The HTTPS method used for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpsNotificationConfiguration withHttpMethod(String httpMethod) {
        setHttpMethod(httpMethod);
        return this;
    }

    /**
     * <p>
     * The HTTPS method used for the notification subscription.
     * </p>
     * 
     * @param httpMethod
     *        The HTTPS method used for the notification subscription.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HttpMethod
     */

    public HttpsNotificationConfiguration withHttpMethod(HttpMethod httpMethod) {
        this.httpMethod = httpMethod.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     * information about ARNs and how to use them in policies, see <a
     * href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing data
     * access</a> and <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web Services
     * Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @param targetRoleArn
     *        The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     *        information about ARNs and how to use them in policies, see <a
     *        href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing
     *        data access</a> and <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web
     *        Services Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     */

    public void setTargetRoleArn(String targetRoleArn) {
        this.targetRoleArn = targetRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     * information about ARNs and how to use them in policies, see <a
     * href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing data
     * access</a> and <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web Services
     * Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     *         information about ARNs and how to use them in policies, see <a
     *         href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing
     *         data access</a> and <a
     *         href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web
     *         Services Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     */

    public String getTargetRoleArn() {
        return this.targetRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     * information about ARNs and how to use them in policies, see <a
     * href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing data
     * access</a> and <a
     * href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web Services
     * Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     * </p>
     * 
     * @param targetRoleArn
     *        The Amazon Resource Name (ARN) of the EventBridge API destinations IAM role that you created. For more
     *        information about ARNs and how to use them in policies, see <a
     *        href="https://docs.aws.amazon.com//security-lake/latest/userguide/subscriber-data-access.html">Managing
     *        data access</a> and <a
     *        href="https://docs.aws.amazon.com/security-lake/latest/userguide/security-iam-awsmanpol.html">Amazon Web
     *        Services Managed Policies</a> in the <i>Amazon Security Lake User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HttpsNotificationConfiguration withTargetRoleArn(String targetRoleArn) {
        setTargetRoleArn(targetRoleArn);
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
        if (getAuthorizationApiKeyName() != null)
            sb.append("AuthorizationApiKeyName: ").append(getAuthorizationApiKeyName()).append(",");
        if (getAuthorizationApiKeyValue() != null)
            sb.append("AuthorizationApiKeyValue: ").append(getAuthorizationApiKeyValue()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getHttpMethod() != null)
            sb.append("HttpMethod: ").append(getHttpMethod()).append(",");
        if (getTargetRoleArn() != null)
            sb.append("TargetRoleArn: ").append(getTargetRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HttpsNotificationConfiguration == false)
            return false;
        HttpsNotificationConfiguration other = (HttpsNotificationConfiguration) obj;
        if (other.getAuthorizationApiKeyName() == null ^ this.getAuthorizationApiKeyName() == null)
            return false;
        if (other.getAuthorizationApiKeyName() != null && other.getAuthorizationApiKeyName().equals(this.getAuthorizationApiKeyName()) == false)
            return false;
        if (other.getAuthorizationApiKeyValue() == null ^ this.getAuthorizationApiKeyValue() == null)
            return false;
        if (other.getAuthorizationApiKeyValue() != null && other.getAuthorizationApiKeyValue().equals(this.getAuthorizationApiKeyValue()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getHttpMethod() == null ^ this.getHttpMethod() == null)
            return false;
        if (other.getHttpMethod() != null && other.getHttpMethod().equals(this.getHttpMethod()) == false)
            return false;
        if (other.getTargetRoleArn() == null ^ this.getTargetRoleArn() == null)
            return false;
        if (other.getTargetRoleArn() != null && other.getTargetRoleArn().equals(this.getTargetRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizationApiKeyName() == null) ? 0 : getAuthorizationApiKeyName().hashCode());
        hashCode = prime * hashCode + ((getAuthorizationApiKeyValue() == null) ? 0 : getAuthorizationApiKeyValue().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getHttpMethod() == null) ? 0 : getHttpMethod().hashCode());
        hashCode = prime * hashCode + ((getTargetRoleArn() == null) ? 0 : getTargetRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public HttpsNotificationConfiguration clone() {
        try {
            return (HttpsNotificationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securitylake.model.transform.HttpsNotificationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
