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

/**
 * <p>
 * Describes the Network Access Scope content.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkInsightsAccessScopeContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkInsightsAccessScopeContent implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeId;
    /**
     * <p>
     * The paths to match.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessScopePath> matchPaths;
    /**
     * <p>
     * The paths to exclude.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccessScopePath> excludePaths;

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     */

    public void setNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        this.networkInsightsAccessScopeId = networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @return The ID of the Network Access Scope.
     */

    public String getNetworkInsightsAccessScopeId() {
        return this.networkInsightsAccessScopeId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     * 
     * @param networkInsightsAccessScopeId
     *        The ID of the Network Access Scope.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeContent withNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        setNetworkInsightsAccessScopeId(networkInsightsAccessScopeId);
        return this;
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @return The paths to match.
     */

    public java.util.List<AccessScopePath> getMatchPaths() {
        if (matchPaths == null) {
            matchPaths = new com.amazonaws.internal.SdkInternalList<AccessScopePath>();
        }
        return matchPaths;
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     */

    public void setMatchPaths(java.util.Collection<AccessScopePath> matchPaths) {
        if (matchPaths == null) {
            this.matchPaths = null;
            return;
        }

        this.matchPaths = new com.amazonaws.internal.SdkInternalList<AccessScopePath>(matchPaths);
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMatchPaths(java.util.Collection)} or {@link #withMatchPaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeContent withMatchPaths(AccessScopePath... matchPaths) {
        if (this.matchPaths == null) {
            setMatchPaths(new com.amazonaws.internal.SdkInternalList<AccessScopePath>(matchPaths.length));
        }
        for (AccessScopePath ele : matchPaths) {
            this.matchPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths to match.
     * </p>
     * 
     * @param matchPaths
     *        The paths to match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeContent withMatchPaths(java.util.Collection<AccessScopePath> matchPaths) {
        setMatchPaths(matchPaths);
        return this;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @return The paths to exclude.
     */

    public java.util.List<AccessScopePath> getExcludePaths() {
        if (excludePaths == null) {
            excludePaths = new com.amazonaws.internal.SdkInternalList<AccessScopePath>();
        }
        return excludePaths;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     */

    public void setExcludePaths(java.util.Collection<AccessScopePath> excludePaths) {
        if (excludePaths == null) {
            this.excludePaths = null;
            return;
        }

        this.excludePaths = new com.amazonaws.internal.SdkInternalList<AccessScopePath>(excludePaths);
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludePaths(java.util.Collection)} or {@link #withExcludePaths(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeContent withExcludePaths(AccessScopePath... excludePaths) {
        if (this.excludePaths == null) {
            setExcludePaths(new com.amazonaws.internal.SdkInternalList<AccessScopePath>(excludePaths.length));
        }
        for (AccessScopePath ele : excludePaths) {
            this.excludePaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The paths to exclude.
     * </p>
     * 
     * @param excludePaths
     *        The paths to exclude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkInsightsAccessScopeContent withExcludePaths(java.util.Collection<AccessScopePath> excludePaths) {
        setExcludePaths(excludePaths);
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
        if (getNetworkInsightsAccessScopeId() != null)
            sb.append("NetworkInsightsAccessScopeId: ").append(getNetworkInsightsAccessScopeId()).append(",");
        if (getMatchPaths() != null)
            sb.append("MatchPaths: ").append(getMatchPaths()).append(",");
        if (getExcludePaths() != null)
            sb.append("ExcludePaths: ").append(getExcludePaths());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkInsightsAccessScopeContent == false)
            return false;
        NetworkInsightsAccessScopeContent other = (NetworkInsightsAccessScopeContent) obj;
        if (other.getNetworkInsightsAccessScopeId() == null ^ this.getNetworkInsightsAccessScopeId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeId() != null && other.getNetworkInsightsAccessScopeId().equals(this.getNetworkInsightsAccessScopeId()) == false)
            return false;
        if (other.getMatchPaths() == null ^ this.getMatchPaths() == null)
            return false;
        if (other.getMatchPaths() != null && other.getMatchPaths().equals(this.getMatchPaths()) == false)
            return false;
        if (other.getExcludePaths() == null ^ this.getExcludePaths() == null)
            return false;
        if (other.getExcludePaths() != null && other.getExcludePaths().equals(this.getExcludePaths()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeId() == null) ? 0 : getNetworkInsightsAccessScopeId().hashCode());
        hashCode = prime * hashCode + ((getMatchPaths() == null) ? 0 : getMatchPaths().hashCode());
        hashCode = prime * hashCode + ((getExcludePaths() == null) ? 0 : getExcludePaths().hashCode());
        return hashCode;
    }

    @Override
    public NetworkInsightsAccessScopeContent clone() {
        try {
            return (NetworkInsightsAccessScopeContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
