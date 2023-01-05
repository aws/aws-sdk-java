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
package com.amazonaws.services.prometheus.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a DescribeRuleGroupsNamespace operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amp-2020-08-01/DescribeRuleGroupsNamespace" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRuleGroupsNamespaceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The rule groups namespace.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the workspace to describe.
     * </p>
     */
    private String workspaceId;

    /**
     * <p>
     * The rule groups namespace.
     * </p>
     * 
     * @param name
     *        The rule groups namespace.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The rule groups namespace.
     * </p>
     * 
     * @return The rule groups namespace.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The rule groups namespace.
     * </p>
     * 
     * @param name
     *        The rule groups namespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupsNamespaceRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the workspace to describe.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to describe.
     */

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to describe.
     * </p>
     * 
     * @return The ID of the workspace to describe.
     */

    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * <p>
     * The ID of the workspace to describe.
     * </p>
     * 
     * @param workspaceId
     *        The ID of the workspace to describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRuleGroupsNamespaceRequest withWorkspaceId(String workspaceId) {
        setWorkspaceId(workspaceId);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getWorkspaceId() != null)
            sb.append("WorkspaceId: ").append(getWorkspaceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRuleGroupsNamespaceRequest == false)
            return false;
        DescribeRuleGroupsNamespaceRequest other = (DescribeRuleGroupsNamespaceRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null)
            return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRuleGroupsNamespaceRequest clone() {
        return (DescribeRuleGroupsNamespaceRequest) super.clone();
    }

}
