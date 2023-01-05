/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.organizations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains details about a resource policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/organizations-2016-11-28/ResourcePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResourcePolicy implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains resource policy ID and Amazon Resource Name (ARN).
     * </p>
     */
    private ResourcePolicySummary resourcePolicySummary;
    /**
     * <p>
     * The policy text of the resource policy.
     * </p>
     */
    private String content;

    /**
     * <p>
     * A structure that contains resource policy ID and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourcePolicySummary
     *        A structure that contains resource policy ID and Amazon Resource Name (ARN).
     */

    public void setResourcePolicySummary(ResourcePolicySummary resourcePolicySummary) {
        this.resourcePolicySummary = resourcePolicySummary;
    }

    /**
     * <p>
     * A structure that contains resource policy ID and Amazon Resource Name (ARN).
     * </p>
     * 
     * @return A structure that contains resource policy ID and Amazon Resource Name (ARN).
     */

    public ResourcePolicySummary getResourcePolicySummary() {
        return this.resourcePolicySummary;
    }

    /**
     * <p>
     * A structure that contains resource policy ID and Amazon Resource Name (ARN).
     * </p>
     * 
     * @param resourcePolicySummary
     *        A structure that contains resource policy ID and Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withResourcePolicySummary(ResourcePolicySummary resourcePolicySummary) {
        setResourcePolicySummary(resourcePolicySummary);
        return this;
    }

    /**
     * <p>
     * The policy text of the resource policy.
     * </p>
     * 
     * @param content
     *        The policy text of the resource policy.
     */

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * <p>
     * The policy text of the resource policy.
     * </p>
     * 
     * @return The policy text of the resource policy.
     */

    public String getContent() {
        return this.content;
    }

    /**
     * <p>
     * The policy text of the resource policy.
     * </p>
     * 
     * @param content
     *        The policy text of the resource policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResourcePolicy withContent(String content) {
        setContent(content);
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
        if (getResourcePolicySummary() != null)
            sb.append("ResourcePolicySummary: ").append(getResourcePolicySummary()).append(",");
        if (getContent() != null)
            sb.append("Content: ").append(getContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResourcePolicy == false)
            return false;
        ResourcePolicy other = (ResourcePolicy) obj;
        if (other.getResourcePolicySummary() == null ^ this.getResourcePolicySummary() == null)
            return false;
        if (other.getResourcePolicySummary() != null && other.getResourcePolicySummary().equals(this.getResourcePolicySummary()) == false)
            return false;
        if (other.getContent() == null ^ this.getContent() == null)
            return false;
        if (other.getContent() != null && other.getContent().equals(this.getContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourcePolicySummary() == null) ? 0 : getResourcePolicySummary().hashCode());
        hashCode = prime * hashCode + ((getContent() == null) ? 0 : getContent().hashCode());
        return hashCode;
    }

    @Override
    public ResourcePolicy clone() {
        try {
            return (ResourcePolicy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.organizations.model.transform.ResourcePolicyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
