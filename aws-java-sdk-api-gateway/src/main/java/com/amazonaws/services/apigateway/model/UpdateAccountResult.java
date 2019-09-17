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
package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents an AWS account that is associated with API Gateway.
 * </p>
 * <div class="remarks">
 * <p>
 * To view the account info, call <code>GET</code> on this resource.
 * </p>
 * <h4>Error Codes</h4>
 * <p>
 * The following exception may be thrown when the request fails.
 * </p>
 * <ul>
 * <li>UnauthorizedException</li>
 * <li>NotFoundException</li>
 * <li>TooManyRequestsException</li>
 * </ul>
 * <p>
 * For detailed error code information, including the corresponding HTTP Status Codes, see <a
 * href="https://docs.aws.amazon.com/apigateway/api-reference/handling-errors/#api-error-codes">API Gateway Error
 * Codes</a>
 * </p>
 * <h4>Example: Get the information about an account.</h4> <h5>Request</h5>
 * 
 * <pre>
 * <code>GET /account HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160531T184618Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} </code>
 * </pre>
 * 
 * <h5>Response</h5>
 * <p>
 * The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
 * </p>
 * 
 * <pre>
 * <code>{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/account-apigateway-{rel}.html", "name": "account", "templated": true }, "self": { "href": "/account" }, "account:update": { "href": "/account" } }, "cloudwatchRoleArn": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "throttleSettings": { "rateLimit": 500, "burstLimit": 1000 } } </code>
 * </pre>
 * <p>
 * In addition to making the REST API call directly, you can use the AWS CLI and an AWS SDK to access this resource.
 * </p>
 * </div> <div class="seeAlso"> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-limits.html">API Gateway Limits</a> <a
 * href="https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html">Developer Guide</a>, <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-account.html">AWS CLI</a> </div>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     */
    private String cloudwatchRoleArn;
    /**
     * <p>
     * Specifies the API request limits configured for the current <a>Account</a>.
     * </p>
     */
    private ThrottleSettings throttleSettings;
    /**
     * <p>
     * A list of features supported for the account. When usage plans are enabled, the features list will include an
     * entry of <code>"UsagePlans"</code>.
     * </p>
     */
    private java.util.List<String> features;
    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     */
    private String apiKeyVersion;

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     * 
     * @param cloudwatchRoleArn
     *        The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     */

    public void setCloudwatchRoleArn(String cloudwatchRoleArn) {
        this.cloudwatchRoleArn = cloudwatchRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     * 
     * @return The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     */

    public String getCloudwatchRoleArn() {
        return this.cloudwatchRoleArn;
    }

    /**
     * <p>
     * The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * </p>
     * 
     * @param cloudwatchRoleArn
     *        The ARN of an Amazon CloudWatch role for the current <a>Account</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountResult withCloudwatchRoleArn(String cloudwatchRoleArn) {
        setCloudwatchRoleArn(cloudwatchRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current <a>Account</a>.
     * </p>
     * 
     * @param throttleSettings
     *        Specifies the API request limits configured for the current <a>Account</a>.
     */

    public void setThrottleSettings(ThrottleSettings throttleSettings) {
        this.throttleSettings = throttleSettings;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current <a>Account</a>.
     * </p>
     * 
     * @return Specifies the API request limits configured for the current <a>Account</a>.
     */

    public ThrottleSettings getThrottleSettings() {
        return this.throttleSettings;
    }

    /**
     * <p>
     * Specifies the API request limits configured for the current <a>Account</a>.
     * </p>
     * 
     * @param throttleSettings
     *        Specifies the API request limits configured for the current <a>Account</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountResult withThrottleSettings(ThrottleSettings throttleSettings) {
        setThrottleSettings(throttleSettings);
        return this;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are enabled, the features list will include an
     * entry of <code>"UsagePlans"</code>.
     * </p>
     * 
     * @return A list of features supported for the account. When usage plans are enabled, the features list will
     *         include an entry of <code>"UsagePlans"</code>.
     */

    public java.util.List<String> getFeatures() {
        return features;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are enabled, the features list will include an
     * entry of <code>"UsagePlans"</code>.
     * </p>
     * 
     * @param features
     *        A list of features supported for the account. When usage plans are enabled, the features list will include
     *        an entry of <code>"UsagePlans"</code>.
     */

    public void setFeatures(java.util.Collection<String> features) {
        if (features == null) {
            this.features = null;
            return;
        }

        this.features = new java.util.ArrayList<String>(features);
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are enabled, the features list will include an
     * entry of <code>"UsagePlans"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFeatures(java.util.Collection)} or {@link #withFeatures(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param features
     *        A list of features supported for the account. When usage plans are enabled, the features list will include
     *        an entry of <code>"UsagePlans"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountResult withFeatures(String... features) {
        if (this.features == null) {
            setFeatures(new java.util.ArrayList<String>(features.length));
        }
        for (String ele : features) {
            this.features.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of features supported for the account. When usage plans are enabled, the features list will include an
     * entry of <code>"UsagePlans"</code>.
     * </p>
     * 
     * @param features
     *        A list of features supported for the account. When usage plans are enabled, the features list will include
     *        an entry of <code>"UsagePlans"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountResult withFeatures(java.util.Collection<String> features) {
        setFeatures(features);
        return this;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     * 
     * @param apiKeyVersion
     *        The version of the API keys used for the account.
     */

    public void setApiKeyVersion(String apiKeyVersion) {
        this.apiKeyVersion = apiKeyVersion;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     * 
     * @return The version of the API keys used for the account.
     */

    public String getApiKeyVersion() {
        return this.apiKeyVersion;
    }

    /**
     * <p>
     * The version of the API keys used for the account.
     * </p>
     * 
     * @param apiKeyVersion
     *        The version of the API keys used for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountResult withApiKeyVersion(String apiKeyVersion) {
        setApiKeyVersion(apiKeyVersion);
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
        if (getCloudwatchRoleArn() != null)
            sb.append("CloudwatchRoleArn: ").append(getCloudwatchRoleArn()).append(",");
        if (getThrottleSettings() != null)
            sb.append("ThrottleSettings: ").append(getThrottleSettings()).append(",");
        if (getFeatures() != null)
            sb.append("Features: ").append(getFeatures()).append(",");
        if (getApiKeyVersion() != null)
            sb.append("ApiKeyVersion: ").append(getApiKeyVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAccountResult == false)
            return false;
        UpdateAccountResult other = (UpdateAccountResult) obj;
        if (other.getCloudwatchRoleArn() == null ^ this.getCloudwatchRoleArn() == null)
            return false;
        if (other.getCloudwatchRoleArn() != null && other.getCloudwatchRoleArn().equals(this.getCloudwatchRoleArn()) == false)
            return false;
        if (other.getThrottleSettings() == null ^ this.getThrottleSettings() == null)
            return false;
        if (other.getThrottleSettings() != null && other.getThrottleSettings().equals(this.getThrottleSettings()) == false)
            return false;
        if (other.getFeatures() == null ^ this.getFeatures() == null)
            return false;
        if (other.getFeatures() != null && other.getFeatures().equals(this.getFeatures()) == false)
            return false;
        if (other.getApiKeyVersion() == null ^ this.getApiKeyVersion() == null)
            return false;
        if (other.getApiKeyVersion() != null && other.getApiKeyVersion().equals(this.getApiKeyVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudwatchRoleArn() == null) ? 0 : getCloudwatchRoleArn().hashCode());
        hashCode = prime * hashCode + ((getThrottleSettings() == null) ? 0 : getThrottleSettings().hashCode());
        hashCode = prime * hashCode + ((getFeatures() == null) ? 0 : getFeatures().hashCode());
        hashCode = prime * hashCode + ((getApiKeyVersion() == null) ? 0 : getApiKeyVersion().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAccountResult clone() {
        try {
            return (UpdateAccountResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
