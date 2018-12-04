/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/AssociateWebACL" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssociateWebACLRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     */
    private String webACLId;
    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * 
     * @param webACLId
     *        A unique identifier (ID) for the web ACL.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * 
     * @return A unique identifier (ID) for the web ACL.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * A unique identifier (ID) for the web ACL.
     * </p>
     * 
     * @param webACLId
     *        A unique identifier (ID) for the web ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebACLRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) of the resource to be protected.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) of the resource to be protected.
     * </p>
     * 
     * @param resourceArn
     *        The ARN (Amazon Resource Name) of the resource to be protected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssociateWebACLRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null && other.getWebACLId().equals(this.getWebACLId()) == false)
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

        hashCode = prime * hashCode + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public AssociateWebACLRequest clone() {
        return (AssociateWebACLRequest) super.clone();
    }

}
