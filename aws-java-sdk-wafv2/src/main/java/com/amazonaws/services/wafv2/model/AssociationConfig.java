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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies custom configurations for the associations between the web ACL and protected resources.
 * </p>
 * <p>
 * Use this to customize the maximum size of the request body that your protected resources forward to WAF for
 * inspection. You can customize this setting for CloudFront, API Gateway, Amazon Cognito, App Runner, or Verified
 * Access resources. The default setting is 16 KB (16,384 bytes).
 * </p>
 * <note>
 * <p>
 * You are charged additional fees when your protected resources forward body sizes that are larger than the default.
 * For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
 * </p>
 * </note>
 * <p>
 * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociationConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon Cognito, App
     * Runner, and Verified Access resources forward to WAF for inspection. The default size is 16 KB (16,384 bytes).
     * You can change the setting for any of the available resource types.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when your protected resources forward body sizes that are larger than the
     * default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     * </p>
     * <p>
     * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     * </p>
     */
    private java.util.Map<String, RequestBodyAssociatedResourceTypeConfig> requestBody;

    /**
     * <p>
     * Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon Cognito, App
     * Runner, and Verified Access resources forward to WAF for inspection. The default size is 16 KB (16,384 bytes).
     * You can change the setting for any of the available resource types.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when your protected resources forward body sizes that are larger than the
     * default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     * </p>
     * <p>
     * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     * </p>
     * 
     * @return Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon
     *         Cognito, App Runner, and Verified Access resources forward to WAF for inspection. The default size is 16
     *         KB (16,384 bytes). You can change the setting for any of the available resource types. </p> <note>
     *         <p>
     *         You are charged additional fees when your protected resources forward body sizes that are larger than the
     *         default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *         </p>
     *         </note>
     *         <p>
     *         Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     *         </p>
     *         <p>
     *         For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     */

    public java.util.Map<String, RequestBodyAssociatedResourceTypeConfig> getRequestBody() {
        return requestBody;
    }

    /**
     * <p>
     * Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon Cognito, App
     * Runner, and Verified Access resources forward to WAF for inspection. The default size is 16 KB (16,384 bytes).
     * You can change the setting for any of the available resource types.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when your protected resources forward body sizes that are larger than the
     * default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     * </p>
     * <p>
     * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     * </p>
     * 
     * @param requestBody
     *        Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon
     *        Cognito, App Runner, and Verified Access resources forward to WAF for inspection. The default size is 16
     *        KB (16,384 bytes). You can change the setting for any of the available resource types. </p> <note>
     *        <p>
     *        You are charged additional fees when your protected resources forward body sizes that are larger than the
     *        default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     *        </p>
     *        <p>
     *        For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     */

    public void setRequestBody(java.util.Map<String, RequestBodyAssociatedResourceTypeConfig> requestBody) {
        this.requestBody = requestBody;
    }

    /**
     * <p>
     * Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon Cognito, App
     * Runner, and Verified Access resources forward to WAF for inspection. The default size is 16 KB (16,384 bytes).
     * You can change the setting for any of the available resource types.
     * </p>
     * <note>
     * <p>
     * You are charged additional fees when your protected resources forward body sizes that are larger than the
     * default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     * </p>
     * </note>
     * <p>
     * Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     * </p>
     * <p>
     * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     * </p>
     * 
     * @param requestBody
     *        Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon
     *        Cognito, App Runner, and Verified Access resources forward to WAF for inspection. The default size is 16
     *        KB (16,384 bytes). You can change the setting for any of the available resource types. </p> <note>
     *        <p>
     *        You are charged additional fees when your protected resources forward body sizes that are larger than the
     *        default. For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
     *        </p>
     *        </note>
     *        <p>
     *        Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
     *        </p>
     *        <p>
     *        For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationConfig withRequestBody(java.util.Map<String, RequestBodyAssociatedResourceTypeConfig> requestBody) {
        setRequestBody(requestBody);
        return this;
    }

    /**
     * Add a single RequestBody entry
     *
     * @see AssociationConfig#withRequestBody
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssociationConfig addRequestBodyEntry(String key, RequestBodyAssociatedResourceTypeConfig value) {
        if (null == this.requestBody) {
            this.requestBody = new java.util.HashMap<String, RequestBodyAssociatedResourceTypeConfig>();
        }
        if (this.requestBody.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.requestBody.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RequestBody.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociationConfig clearRequestBodyEntries() {
        this.requestBody = null;
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
        if (getRequestBody() != null)
            sb.append("RequestBody: ").append(getRequestBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociationConfig == false)
            return false;
        AssociationConfig other = (AssociationConfig) obj;
        if (other.getRequestBody() == null ^ this.getRequestBody() == null)
            return false;
        if (other.getRequestBody() != null && other.getRequestBody().equals(this.getRequestBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestBody() == null) ? 0 : getRequestBody().hashCode());
        return hashCode;
    }

    @Override
    public AssociationConfig clone() {
        try {
            return (AssociationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.AssociationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
