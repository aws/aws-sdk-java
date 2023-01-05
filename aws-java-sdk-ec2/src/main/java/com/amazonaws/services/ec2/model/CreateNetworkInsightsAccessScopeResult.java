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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateNetworkInsightsAccessScopeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Network Access Scope.
     * </p>
     */
    private NetworkInsightsAccessScope networkInsightsAccessScope;
    /**
     * <p>
     * The Network Access Scope content.
     * </p>
     */
    private NetworkInsightsAccessScopeContent networkInsightsAccessScopeContent;

    /**
     * <p>
     * The Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScope
     *        The Network Access Scope.
     */

    public void setNetworkInsightsAccessScope(NetworkInsightsAccessScope networkInsightsAccessScope) {
        this.networkInsightsAccessScope = networkInsightsAccessScope;
    }

    /**
     * <p>
     * The Network Access Scope.
     * </p>
     * 
     * @return The Network Access Scope.
     */

    public NetworkInsightsAccessScope getNetworkInsightsAccessScope() {
        return this.networkInsightsAccessScope;
    }

    /**
     * <p>
     * The Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScope
     *        The Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeResult withNetworkInsightsAccessScope(NetworkInsightsAccessScope networkInsightsAccessScope) {
        setNetworkInsightsAccessScope(networkInsightsAccessScope);
        return this;
    }

    /**
     * <p>
     * The Network Access Scope content.
     * </p>
     * 
     * @param networkInsightsAccessScopeContent
     *        The Network Access Scope content.
     */

    public void setNetworkInsightsAccessScopeContent(NetworkInsightsAccessScopeContent networkInsightsAccessScopeContent) {
        this.networkInsightsAccessScopeContent = networkInsightsAccessScopeContent;
    }

    /**
     * <p>
     * The Network Access Scope content.
     * </p>
     * 
     * @return The Network Access Scope content.
     */

    public NetworkInsightsAccessScopeContent getNetworkInsightsAccessScopeContent() {
        return this.networkInsightsAccessScopeContent;
    }

    /**
     * <p>
     * The Network Access Scope content.
     * </p>
     * 
     * @param networkInsightsAccessScopeContent
     *        The Network Access Scope content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateNetworkInsightsAccessScopeResult withNetworkInsightsAccessScopeContent(NetworkInsightsAccessScopeContent networkInsightsAccessScopeContent) {
        setNetworkInsightsAccessScopeContent(networkInsightsAccessScopeContent);
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
        if (getNetworkInsightsAccessScope() != null)
            sb.append("NetworkInsightsAccessScope: ").append(getNetworkInsightsAccessScope()).append(",");
        if (getNetworkInsightsAccessScopeContent() != null)
            sb.append("NetworkInsightsAccessScopeContent: ").append(getNetworkInsightsAccessScopeContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateNetworkInsightsAccessScopeResult == false)
            return false;
        CreateNetworkInsightsAccessScopeResult other = (CreateNetworkInsightsAccessScopeResult) obj;
        if (other.getNetworkInsightsAccessScope() == null ^ this.getNetworkInsightsAccessScope() == null)
            return false;
        if (other.getNetworkInsightsAccessScope() != null && other.getNetworkInsightsAccessScope().equals(this.getNetworkInsightsAccessScope()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeContent() == null ^ this.getNetworkInsightsAccessScopeContent() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeContent() != null
                && other.getNetworkInsightsAccessScopeContent().equals(this.getNetworkInsightsAccessScopeContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScope() == null) ? 0 : getNetworkInsightsAccessScope().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeContent() == null) ? 0 : getNetworkInsightsAccessScopeContent().hashCode());
        return hashCode;
    }

    @Override
    public CreateNetworkInsightsAccessScopeResult clone() {
        try {
            return (CreateNetworkInsightsAccessScopeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
