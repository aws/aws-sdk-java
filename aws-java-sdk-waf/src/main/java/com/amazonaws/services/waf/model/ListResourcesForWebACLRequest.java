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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListResourcesForWebACL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesForWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the associated resources.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * The type of resource to list, either an application load balancer or Amazon API Gateway.
     * </p>
     */
    private String resourceType;

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the associated resources.
     * </p>
     * 
     * @param webACLId
     *        The unique identifier (ID) of the web ACL for which to list the associated resources.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the associated resources.
     * </p>
     * 
     * @return The unique identifier (ID) of the web ACL for which to list the associated resources.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The unique identifier (ID) of the web ACL for which to list the associated resources.
     * </p>
     * 
     * @param webACLId
     *        The unique identifier (ID) of the web ACL for which to list the associated resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForWebACLRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or Amazon API Gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to list, either an application load balancer or Amazon API Gateway.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or Amazon API Gateway.
     * </p>
     * 
     * @return The type of resource to list, either an application load balancer or Amazon API Gateway.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or Amazon API Gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to list, either an application load balancer or Amazon API Gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceType
     */

    public ListResourcesForWebACLRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The type of resource to list, either an application load balancer or Amazon API Gateway.
     * </p>
     * 
     * @param resourceType
     *        The type of resource to list, either an application load balancer or Amazon API Gateway.
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
        if (getWebACLId() != null)
            sb.append("WebACLId: ").append(getWebACLId()).append(",");
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
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
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

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesForWebACLRequest clone() {
        return (ListResourcesForWebACLRequest) super.clone();
    }

}
