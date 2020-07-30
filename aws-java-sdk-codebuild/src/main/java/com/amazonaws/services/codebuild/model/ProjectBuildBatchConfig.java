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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains configuration information about a batch build project.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/ProjectBuildBatchConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProjectBuildBatchConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the service role ARN for the batch build project.
     * </p>
     */
    private String serviceRole;
    /**
     * <p>
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * </p>
     */
    private Boolean combineArtifacts;
    /**
     * <p>
     * A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     * </p>
     */
    private BatchRestrictions restrictions;
    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * </p>
     */
    private Integer timeoutInMins;

    /**
     * <p>
     * Specifies the service role ARN for the batch build project.
     * </p>
     * 
     * @param serviceRole
     *        Specifies the service role ARN for the batch build project.
     */

    public void setServiceRole(String serviceRole) {
        this.serviceRole = serviceRole;
    }

    /**
     * <p>
     * Specifies the service role ARN for the batch build project.
     * </p>
     * 
     * @return Specifies the service role ARN for the batch build project.
     */

    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * <p>
     * Specifies the service role ARN for the batch build project.
     * </p>
     * 
     * @param serviceRole
     *        Specifies the service role ARN for the batch build project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBuildBatchConfig withServiceRole(String serviceRole) {
        setServiceRole(serviceRole);
        return this;
    }

    /**
     * <p>
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * </p>
     * 
     * @param combineArtifacts
     *        Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     */

    public void setCombineArtifacts(Boolean combineArtifacts) {
        this.combineArtifacts = combineArtifacts;
    }

    /**
     * <p>
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * </p>
     * 
     * @return Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     */

    public Boolean getCombineArtifacts() {
        return this.combineArtifacts;
    }

    /**
     * <p>
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * </p>
     * 
     * @param combineArtifacts
     *        Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBuildBatchConfig withCombineArtifacts(Boolean combineArtifacts) {
        setCombineArtifacts(combineArtifacts);
        return this;
    }

    /**
     * <p>
     * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     * </p>
     * 
     * @return Specifies if the build artifacts for the batch build should be combined into a single artifact location.
     */

    public Boolean isCombineArtifacts() {
        return this.combineArtifacts;
    }

    /**
     * <p>
     * A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     * </p>
     * 
     * @param restrictions
     *        A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     */

    public void setRestrictions(BatchRestrictions restrictions) {
        this.restrictions = restrictions;
    }

    /**
     * <p>
     * A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     * </p>
     * 
     * @return A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     */

    public BatchRestrictions getRestrictions() {
        return this.restrictions;
    }

    /**
     * <p>
     * A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     * </p>
     * 
     * @param restrictions
     *        A <code>BatchRestrictions</code> object that specifies the restrictions for the batch build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBuildBatchConfig withRestrictions(BatchRestrictions restrictions) {
        setRestrictions(restrictions);
        return this;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * </p>
     * 
     * @param timeoutInMins
     *        Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     */

    public void setTimeoutInMins(Integer timeoutInMins) {
        this.timeoutInMins = timeoutInMins;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * </p>
     * 
     * @return Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     */

    public Integer getTimeoutInMins() {
        return this.timeoutInMins;
    }

    /**
     * <p>
     * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * </p>
     * 
     * @param timeoutInMins
     *        Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProjectBuildBatchConfig withTimeoutInMins(Integer timeoutInMins) {
        setTimeoutInMins(timeoutInMins);
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
        if (getServiceRole() != null)
            sb.append("ServiceRole: ").append(getServiceRole()).append(",");
        if (getCombineArtifacts() != null)
            sb.append("CombineArtifacts: ").append(getCombineArtifacts()).append(",");
        if (getRestrictions() != null)
            sb.append("Restrictions: ").append(getRestrictions()).append(",");
        if (getTimeoutInMins() != null)
            sb.append("TimeoutInMins: ").append(getTimeoutInMins());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProjectBuildBatchConfig == false)
            return false;
        ProjectBuildBatchConfig other = (ProjectBuildBatchConfig) obj;
        if (other.getServiceRole() == null ^ this.getServiceRole() == null)
            return false;
        if (other.getServiceRole() != null && other.getServiceRole().equals(this.getServiceRole()) == false)
            return false;
        if (other.getCombineArtifacts() == null ^ this.getCombineArtifacts() == null)
            return false;
        if (other.getCombineArtifacts() != null && other.getCombineArtifacts().equals(this.getCombineArtifacts()) == false)
            return false;
        if (other.getRestrictions() == null ^ this.getRestrictions() == null)
            return false;
        if (other.getRestrictions() != null && other.getRestrictions().equals(this.getRestrictions()) == false)
            return false;
        if (other.getTimeoutInMins() == null ^ this.getTimeoutInMins() == null)
            return false;
        if (other.getTimeoutInMins() != null && other.getTimeoutInMins().equals(this.getTimeoutInMins()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServiceRole() == null) ? 0 : getServiceRole().hashCode());
        hashCode = prime * hashCode + ((getCombineArtifacts() == null) ? 0 : getCombineArtifacts().hashCode());
        hashCode = prime * hashCode + ((getRestrictions() == null) ? 0 : getRestrictions().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMins() == null) ? 0 : getTimeoutInMins().hashCode());
        return hashCode;
    }

    @Override
    public ProjectBuildBatchConfig clone() {
        try {
            return (ProjectBuildBatchConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.ProjectBuildBatchConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
