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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/AssociateWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     */
    private String webACLArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     * </p>
     * <p>
     * The ARN must be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     */

    public void setWebACLArn(String webACLArn) {
        this.webACLArn = webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     */

    public String getWebACLArn() {
        return this.webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the Web ACL that you want to associate with the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebACLRequest withWebACLArn(String webACLArn) {
        setWebACLArn(webACLArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     * </p>
     * <p>
     * The ARN must be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource to associate with the web ACL. </p>
     *        <p>
     *        The ARN must be in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application Load Balancer:
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Amazon API Gateway stage:
     *        <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *        </p>
     *        </li>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     * </p>
     * <p>
     * The ARN must be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the resource to associate with the web ACL. </p>
     *         <p>
     *         The ARN must be in one of the following formats:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For an Application Load Balancer:
     *         <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For an Amazon API Gateway stage:
     *         <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *         </p>
     *         </li>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to associate with the web ACL.
     * </p>
     * <p>
     * The ARN must be in one of the following formats:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For an Application Load Balancer:
     * <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     * </p>
     * </li>
     * <li>
     * <p>
     * For an Amazon API Gateway stage:
     * <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource to associate with the web ACL. </p>
     *        <p>
     *        The ARN must be in one of the following formats:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For an Application Load Balancer:
     *        <code>arn:aws:elasticloadbalancing:<i>region</i>:<i>account-id</i>:loadbalancer/app/<i>load-balancer-name</i>/<i>load-balancer-id</i> </code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For an Amazon API Gateway stage:
     *        <code>arn:aws:apigateway:<i>region</i>::/restapis/<i>api-id</i>/stages/<i>stage-name</i> </code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebACLRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getWebACLArn() != null)
            sb.append("WebACLArn: ").append(getWebACLArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssociateWebACLRequest == false)
            return false;
        AssociateWebACLRequest other = (AssociateWebACLRequest) obj;
        if (other.getWebACLArn() == null ^ this.getWebACLArn() == null)
            return false;
        if (other.getWebACLArn() != null && other.getWebACLArn().equals(this.getWebACLArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLArn() == null) ? 0 : getWebACLArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWebACLRequest clone() {
        return (AssociateWebACLRequest) super.clone();
    }

}
