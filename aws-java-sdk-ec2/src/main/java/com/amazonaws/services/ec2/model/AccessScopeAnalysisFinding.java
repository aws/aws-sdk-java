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
 * Describes a finding for a Network Access Scope.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/AccessScopeAnalysisFinding" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessScopeAnalysisFinding implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     */
    private String networkInsightsAccessScopeAnalysisId;
    /**
     * <p>
     * The ID of the Network Access Scope.
     * </p>
     */
    private String networkInsightsAccessScopeId;
    /**
     * <p>
     * The ID of the finding.
     * </p>
     */
    private String findingId;
    /**
     * <p>
     * The finding components.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PathComponent> findingComponents;

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     */

    public void setNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        this.networkInsightsAccessScopeAnalysisId = networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @return The ID of the Network Access Scope analysis.
     */

    public String getNetworkInsightsAccessScopeAnalysisId() {
        return this.networkInsightsAccessScopeAnalysisId;
    }

    /**
     * <p>
     * The ID of the Network Access Scope analysis.
     * </p>
     * 
     * @param networkInsightsAccessScopeAnalysisId
     *        The ID of the Network Access Scope analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopeAnalysisFinding withNetworkInsightsAccessScopeAnalysisId(String networkInsightsAccessScopeAnalysisId) {
        setNetworkInsightsAccessScopeAnalysisId(networkInsightsAccessScopeAnalysisId);
        return this;
    }

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

    public AccessScopeAnalysisFinding withNetworkInsightsAccessScopeId(String networkInsightsAccessScopeId) {
        setNetworkInsightsAccessScopeId(networkInsightsAccessScopeId);
        return this;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param findingId
     *        The ID of the finding.
     */

    public void setFindingId(String findingId) {
        this.findingId = findingId;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @return The ID of the finding.
     */

    public String getFindingId() {
        return this.findingId;
    }

    /**
     * <p>
     * The ID of the finding.
     * </p>
     * 
     * @param findingId
     *        The ID of the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopeAnalysisFinding withFindingId(String findingId) {
        setFindingId(findingId);
        return this;
    }

    /**
     * <p>
     * The finding components.
     * </p>
     * 
     * @return The finding components.
     */

    public java.util.List<PathComponent> getFindingComponents() {
        if (findingComponents == null) {
            findingComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>();
        }
        return findingComponents;
    }

    /**
     * <p>
     * The finding components.
     * </p>
     * 
     * @param findingComponents
     *        The finding components.
     */

    public void setFindingComponents(java.util.Collection<PathComponent> findingComponents) {
        if (findingComponents == null) {
            this.findingComponents = null;
            return;
        }

        this.findingComponents = new com.amazonaws.internal.SdkInternalList<PathComponent>(findingComponents);
    }

    /**
     * <p>
     * The finding components.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingComponents(java.util.Collection)} or {@link #withFindingComponents(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingComponents
     *        The finding components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopeAnalysisFinding withFindingComponents(PathComponent... findingComponents) {
        if (this.findingComponents == null) {
            setFindingComponents(new com.amazonaws.internal.SdkInternalList<PathComponent>(findingComponents.length));
        }
        for (PathComponent ele : findingComponents) {
            this.findingComponents.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The finding components.
     * </p>
     * 
     * @param findingComponents
     *        The finding components.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessScopeAnalysisFinding withFindingComponents(java.util.Collection<PathComponent> findingComponents) {
        setFindingComponents(findingComponents);
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
        if (getNetworkInsightsAccessScopeAnalysisId() != null)
            sb.append("NetworkInsightsAccessScopeAnalysisId: ").append(getNetworkInsightsAccessScopeAnalysisId()).append(",");
        if (getNetworkInsightsAccessScopeId() != null)
            sb.append("NetworkInsightsAccessScopeId: ").append(getNetworkInsightsAccessScopeId()).append(",");
        if (getFindingId() != null)
            sb.append("FindingId: ").append(getFindingId()).append(",");
        if (getFindingComponents() != null)
            sb.append("FindingComponents: ").append(getFindingComponents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessScopeAnalysisFinding == false)
            return false;
        AccessScopeAnalysisFinding other = (AccessScopeAnalysisFinding) obj;
        if (other.getNetworkInsightsAccessScopeAnalysisId() == null ^ this.getNetworkInsightsAccessScopeAnalysisId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeAnalysisId() != null
                && other.getNetworkInsightsAccessScopeAnalysisId().equals(this.getNetworkInsightsAccessScopeAnalysisId()) == false)
            return false;
        if (other.getNetworkInsightsAccessScopeId() == null ^ this.getNetworkInsightsAccessScopeId() == null)
            return false;
        if (other.getNetworkInsightsAccessScopeId() != null && other.getNetworkInsightsAccessScopeId().equals(this.getNetworkInsightsAccessScopeId()) == false)
            return false;
        if (other.getFindingId() == null ^ this.getFindingId() == null)
            return false;
        if (other.getFindingId() != null && other.getFindingId().equals(this.getFindingId()) == false)
            return false;
        if (other.getFindingComponents() == null ^ this.getFindingComponents() == null)
            return false;
        if (other.getFindingComponents() != null && other.getFindingComponents().equals(this.getFindingComponents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeAnalysisId() == null) ? 0 : getNetworkInsightsAccessScopeAnalysisId().hashCode());
        hashCode = prime * hashCode + ((getNetworkInsightsAccessScopeId() == null) ? 0 : getNetworkInsightsAccessScopeId().hashCode());
        hashCode = prime * hashCode + ((getFindingId() == null) ? 0 : getFindingId().hashCode());
        hashCode = prime * hashCode + ((getFindingComponents() == null) ? 0 : getFindingComponents().hashCode());
        return hashCode;
    }

    @Override
    public AccessScopeAnalysisFinding clone() {
        try {
            return (AccessScopeAnalysisFinding) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
