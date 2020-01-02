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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/wafv2-2019-07-29/ListResourcesForWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesForWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL.
     * </p>
     */
    private String webACLArn;
    /**
     * <p>
     * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the Web ACL.
     */

    public void setWebACLArn(String webACLArn) {
        this.webACLArn = webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Web ACL.
     */

    public String getWebACLArn() {
        return this.webACLArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Web ACL.
     * </p>
     * 
     * @param webACLArn
     *        The Amazon Resource Name (ARN) of the Web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForWebACLRequest withWebACLArn(String webACLArn) {
        setWebACLArn(webACLArn);
        return this;
    }

    /**
     * <p>
     * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * 
     * @param resourceType
     *        Used for web ACLs that are scoped for regional applications. A regional application can be an Application
     *        Load Balancer (ALB) or an API Gateway stage.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * 
     * @return Used for web ACLs that are scoped for regional applications. A regional application can be an Application
     *         Load Balancer (ALB) or an API Gateway stage.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * 
     * @param resourceType
     *        Used for web ACLs that are scoped for regional applications. A regional application can be an Application
     *        Load Balancer (ALB) or an API Gateway stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListResourcesForWebACLRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Used for web ACLs that are scoped for regional applications. A regional application can be an Application Load
     * Balancer (ALB) or an API Gateway stage.
     * </p>
     * 
     * @param resourceType
     *        Used for web ACLs that are scoped for regional applications. A regional application can be an Application
     *        Load Balancer (ALB) or an API Gateway stage.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListResourcesForWebACLRequest withResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
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
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForWebACLRequest == false)
            return false;
        ListResourcesForWebACLRequest other = (ListResourcesForWebACLRequest) obj;
        if (other.getWebACLArn() == null ^ this.getWebACLArn() == null)
            return false;
        if (other.getWebACLArn() != null && other.getWebACLArn().equals(this.getWebACLArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebACLArn() == null) ? 0 : getWebACLArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesForWebACLRequest clone() {
        return (ListResourcesForWebACLRequest) super.clone();
    }

}
