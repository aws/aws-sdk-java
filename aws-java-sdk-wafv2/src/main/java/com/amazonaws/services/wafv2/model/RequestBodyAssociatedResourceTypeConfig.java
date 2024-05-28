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
 * Customizes the maximum size of the request body that your protected CloudFront, API Gateway, Amazon Cognito, App
 * Runner, and Verified Access resources forward to WAF for inspection. The default size is 16 KB (16,384 bytes). You
 * can change the setting for any of the available resource types.
 * </p>
 * <note>
 * <p>
 * You are charged additional fees when your protected resources forward body sizes that are larger than the default.
 * For more information, see <a href="http://aws.amazon.com/waf/pricing/">WAF Pricing</a>.
 * </p>
 * </note>
 * <p>
 * Example JSON: <code> { "API_GATEWAY": "KB_48", "APP_RUNNER_SERVICE": "KB_32" }</code>
 * </p>
 * <p>
 * For Application Load Balancer and AppSync, the limit is fixed at 8 KB (8,192 bytes).
 * </p>
 * <p>
 * This is used in the <code>AssociationConfig</code> of the web ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/RequestBodyAssociatedResourceTypeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RequestBodyAssociatedResourceTypeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway, Amazon
     * Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to statements in
     * the web ACL that inspect the body or JSON body.
     * </p>
     * <p>
     * Default: <code>16 KB (16,384 bytes)</code>
     * </p>
     */
    private String defaultSizeInspectionLimit;

    /**
     * <p>
     * Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway, Amazon
     * Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to statements in
     * the web ACL that inspect the body or JSON body.
     * </p>
     * <p>
     * Default: <code>16 KB (16,384 bytes)</code>
     * </p>
     * 
     * @param defaultSizeInspectionLimit
     *        Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway,
     *        Amazon Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to
     *        statements in the web ACL that inspect the body or JSON body. </p>
     *        <p>
     *        Default: <code>16 KB (16,384 bytes)</code>
     * @see SizeInspectionLimit
     */

    public void setDefaultSizeInspectionLimit(String defaultSizeInspectionLimit) {
        this.defaultSizeInspectionLimit = defaultSizeInspectionLimit;
    }

    /**
     * <p>
     * Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway, Amazon
     * Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to statements in
     * the web ACL that inspect the body or JSON body.
     * </p>
     * <p>
     * Default: <code>16 KB (16,384 bytes)</code>
     * </p>
     * 
     * @return Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway,
     *         Amazon Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies
     *         to statements in the web ACL that inspect the body or JSON body. </p>
     *         <p>
     *         Default: <code>16 KB (16,384 bytes)</code>
     * @see SizeInspectionLimit
     */

    public String getDefaultSizeInspectionLimit() {
        return this.defaultSizeInspectionLimit;
    }

    /**
     * <p>
     * Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway, Amazon
     * Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to statements in
     * the web ACL that inspect the body or JSON body.
     * </p>
     * <p>
     * Default: <code>16 KB (16,384 bytes)</code>
     * </p>
     * 
     * @param defaultSizeInspectionLimit
     *        Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway,
     *        Amazon Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to
     *        statements in the web ACL that inspect the body or JSON body. </p>
     *        <p>
     *        Default: <code>16 KB (16,384 bytes)</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SizeInspectionLimit
     */

    public RequestBodyAssociatedResourceTypeConfig withDefaultSizeInspectionLimit(String defaultSizeInspectionLimit) {
        setDefaultSizeInspectionLimit(defaultSizeInspectionLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway, Amazon
     * Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to statements in
     * the web ACL that inspect the body or JSON body.
     * </p>
     * <p>
     * Default: <code>16 KB (16,384 bytes)</code>
     * </p>
     * 
     * @param defaultSizeInspectionLimit
     *        Specifies the maximum size of the web request body component that an associated CloudFront, API Gateway,
     *        Amazon Cognito, App Runner, or Verified Access resource should send to WAF for inspection. This applies to
     *        statements in the web ACL that inspect the body or JSON body. </p>
     *        <p>
     *        Default: <code>16 KB (16,384 bytes)</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SizeInspectionLimit
     */

    public RequestBodyAssociatedResourceTypeConfig withDefaultSizeInspectionLimit(SizeInspectionLimit defaultSizeInspectionLimit) {
        this.defaultSizeInspectionLimit = defaultSizeInspectionLimit.toString();
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
        if (getDefaultSizeInspectionLimit() != null)
            sb.append("DefaultSizeInspectionLimit: ").append(getDefaultSizeInspectionLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RequestBodyAssociatedResourceTypeConfig == false)
            return false;
        RequestBodyAssociatedResourceTypeConfig other = (RequestBodyAssociatedResourceTypeConfig) obj;
        if (other.getDefaultSizeInspectionLimit() == null ^ this.getDefaultSizeInspectionLimit() == null)
            return false;
        if (other.getDefaultSizeInspectionLimit() != null && other.getDefaultSizeInspectionLimit().equals(this.getDefaultSizeInspectionLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultSizeInspectionLimit() == null) ? 0 : getDefaultSizeInspectionLimit().hashCode());
        return hashCode;
    }

    @Override
    public RequestBodyAssociatedResourceTypeConfig clone() {
        try {
            return (RequestBodyAssociatedResourceTypeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.wafv2.model.transform.RequestBodyAssociatedResourceTypeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
