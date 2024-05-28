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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/CreateAPIKey" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAPIKeyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an
     * Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     */
    private String scope;
    /**
     * <p>
     * The client application domains that you want to use this API key for.
     * </p>
     * <p>
     * Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     * </p>
     * <p>
     * Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as token
     * domains.
     * </p>
     */
    private java.util.List<String> tokenDomains;

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an
     * Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access
     *        instance. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @see Scope
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an
     * Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *         API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access
     *         instance. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the Region when you use the CloudFront scope:
     *         <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         API and SDKs - For all calls, use the Region endpoint us-east-1.
     *         </p>
     *         </li>
     * @see Scope
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an
     * Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access
     *        instance. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public CreateAPIKeyRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL API, an
     * Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access instance.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the Region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @param scope
     *        Specifies whether this is for an Amazon CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB), an Amazon API Gateway REST API, an AppSync GraphQL
     *        API, an Amazon Cognito user pool, an App Runner service, or an Amazon Web Services Verified Access
     *        instance. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the Region when you use the CloudFront scope:
     *        <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        API and SDKs - For all calls, use the Region endpoint us-east-1.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Scope
     */

    public CreateAPIKeyRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * The client application domains that you want to use this API key for.
     * </p>
     * <p>
     * Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     * </p>
     * <p>
     * Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as token
     * domains.
     * </p>
     * 
     * @return The client application domains that you want to use this API key for. </p>
     *         <p>
     *         Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     *         </p>
     *         <p>
     *         Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as
     *         token domains.
     */

    public java.util.List<String> getTokenDomains() {
        return tokenDomains;
    }

    /**
     * <p>
     * The client application domains that you want to use this API key for.
     * </p>
     * <p>
     * Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     * </p>
     * <p>
     * Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as token
     * domains.
     * </p>
     * 
     * @param tokenDomains
     *        The client application domains that you want to use this API key for. </p>
     *        <p>
     *        Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     *        </p>
     *        <p>
     *        Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as
     *        token domains.
     */

    public void setTokenDomains(java.util.Collection<String> tokenDomains) {
        if (tokenDomains == null) {
            this.tokenDomains = null;
            return;
        }

        this.tokenDomains = new java.util.ArrayList<String>(tokenDomains);
    }

    /**
     * <p>
     * The client application domains that you want to use this API key for.
     * </p>
     * <p>
     * Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     * </p>
     * <p>
     * Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as token
     * domains.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTokenDomains(java.util.Collection)} or {@link #withTokenDomains(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tokenDomains
     *        The client application domains that you want to use this API key for. </p>
     *        <p>
     *        Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     *        </p>
     *        <p>
     *        Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as
     *        token domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAPIKeyRequest withTokenDomains(String... tokenDomains) {
        if (this.tokenDomains == null) {
            setTokenDomains(new java.util.ArrayList<String>(tokenDomains.length));
        }
        for (String ele : tokenDomains) {
            this.tokenDomains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The client application domains that you want to use this API key for.
     * </p>
     * <p>
     * Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     * </p>
     * <p>
     * Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as token
     * domains.
     * </p>
     * 
     * @param tokenDomains
     *        The client application domains that you want to use this API key for. </p>
     *        <p>
     *        Example JSON: <code>"TokenDomains": ["abc.com", "store.abc.com"]</code>
     *        </p>
     *        <p>
     *        Public suffixes aren't allowed. For example, you can't use <code>gov.au</code> or <code>co.uk</code> as
     *        token domains.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAPIKeyRequest withTokenDomains(java.util.Collection<String> tokenDomains) {
        setTokenDomains(tokenDomains);
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getTokenDomains() != null)
            sb.append("TokenDomains: ").append(getTokenDomains());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAPIKeyRequest == false)
            return false;
        CreateAPIKeyRequest other = (CreateAPIKeyRequest) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getTokenDomains() == null ^ this.getTokenDomains() == null)
            return false;
        if (other.getTokenDomains() != null && other.getTokenDomains().equals(this.getTokenDomains()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getTokenDomains() == null) ? 0 : getTokenDomains().hashCode());
        return hashCode;
    }

    @Override
    public CreateAPIKeyRequest clone() {
        return (CreateAPIKeyRequest) super.clone();
    }

}
