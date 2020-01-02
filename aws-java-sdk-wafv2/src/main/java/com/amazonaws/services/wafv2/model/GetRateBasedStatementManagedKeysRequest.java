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
package com.amazonaws.services.wafv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/GetRateBasedStatementManagedKeys"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRateBasedStatementManagedKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
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
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     */
    private String webACLName;
    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * The name of the rate-based rule to get the keys for.
     * </p>
     */
    private String ruleName;

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
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
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
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
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * API and SDKs - For all calls, use the Region endpoint us-east-1.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *         application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *         <p>
     *         To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CLI - Specify the region when you use the CloudFront scope:
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
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
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
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
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

    public GetRateBasedStatementManagedKeysRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     * application can be an Application Load Balancer (ALB) or an API Gateway stage.
     * </p>
     * <p>
     * To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CLI - Specify the region when you use the CloudFront scope: <code>--scope=CLOUDFRONT --region=us-east-1</code>.
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
     *        Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional
     *        application can be an Application Load Balancer (ALB) or an API Gateway stage. </p>
     *        <p>
     *        To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CLI - Specify the region when you use the CloudFront scope:
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

    public GetRateBasedStatementManagedKeysRequest withScope(Scope scope) {
        this.scope = scope.toString();
        return this;
    }

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param webACLName
     *        A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public void setWebACLName(String webACLName) {
        this.webACLName = webACLName;
    }

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @return A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     */

    public String getWebACLName() {
        return this.webACLName;
    }

    /**
     * <p>
     * A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * </p>
     * 
     * @param webACLName
     *        A friendly name of the Web ACL. You cannot change the name of a Web ACL after you create it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedStatementManagedKeysRequest withWebACLName(String webACLName) {
        setWebACLName(webACLName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param webACLId
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @return The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *         You provide it to operations like update and delete.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands. You
     * provide it to operations like update and delete.
     * </p>
     * 
     * @param webACLId
     *        The unique identifier for the Web ACL. This ID is returned in the responses to create and list commands.
     *        You provide it to operations like update and delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedStatementManagedKeysRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * The name of the rate-based rule to get the keys for.
     * </p>
     * 
     * @param ruleName
     *        The name of the rate-based rule to get the keys for.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the rate-based rule to get the keys for.
     * </p>
     * 
     * @return The name of the rate-based rule to get the keys for.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the rate-based rule to get the keys for.
     * </p>
     * 
     * @param ruleName
     *        The name of the rate-based rule to get the keys for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRateBasedStatementManagedKeysRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
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
        if (getWebACLName() != null)
            sb.append("WebACLName: ").append(getWebACLName()).append(",");
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId()).append(",");
        if (getRuleName() != null)
            sb.append("RuleName: ").append(getRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRateBasedStatementManagedKeysRequest == false)
            return false;
        GetRateBasedStatementManagedKeysRequest other = (GetRateBasedStatementManagedKeysRequest) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getWebACLName() == null ^ this.getWebACLName() == null)
            return false;
        if (other.getWebACLName() != null && other.getWebACLName().equals(this.getWebACLName()) == false)
            return false;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null && other.getRuleName().equals(this.getRuleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getWebACLName() == null) ? 0 : getWebACLName().hashCode());
        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public GetRateBasedStatementManagedKeysRequest clone() {
        return (GetRateBasedStatementManagedKeysRequest) super.clone();
    }

}
