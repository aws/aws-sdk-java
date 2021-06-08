/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains information about a batch build build group. Build groups are used to combine builds that can run in
 * parallel, while still being able to set dependencies on other build groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Contains the identifier of the build group.
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * An array of strings that contain the identifiers of the build groups that this build group depends on.
     * </p>
     */
    private java.util.List<String> dependsOn;
    /**
     * <p>
     * Specifies if failures in this build group can be ignored.
     * </p>
     */
    private Boolean ignoreFailure;
    /**
     * <p>
     * A <code>BuildSummary</code> object that contains a summary of the current build group.
     * </p>
     */
    private BuildSummary currentBuildSummary;
    /**
     * <p>
     * An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * </p>
     */
    private java.util.List<BuildSummary> priorBuildSummaryList;

    /**
     * <p>
     * Contains the identifier of the build group.
     * </p>
     * 
     * @param identifier
     *        Contains the identifier of the build group.
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * Contains the identifier of the build group.
     * </p>
     * 
     * @return Contains the identifier of the build group.
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * Contains the identifier of the build group.
     * </p>
     * 
     * @param identifier
     *        Contains the identifier of the build group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * An array of strings that contain the identifiers of the build groups that this build group depends on.
     * </p>
     * 
     * @return An array of strings that contain the identifiers of the build groups that this build group depends on.
     */

    public java.util.List<String> getDependsOn() {
        return dependsOn;
    }

    /**
     * <p>
     * An array of strings that contain the identifiers of the build groups that this build group depends on.
     * </p>
     * 
     * @param dependsOn
     *        An array of strings that contain the identifiers of the build groups that this build group depends on.
     */

    public void setDependsOn(java.util.Collection<String> dependsOn) {
        if (dependsOn == null) {
            this.dependsOn = null;
            return;
        }

        this.dependsOn = new java.util.ArrayList<String>(dependsOn);
    }

    /**
     * <p>
     * An array of strings that contain the identifiers of the build groups that this build group depends on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDependsOn(java.util.Collection)} or {@link #withDependsOn(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dependsOn
     *        An array of strings that contain the identifiers of the build groups that this build group depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withDependsOn(String... dependsOn) {
        if (this.dependsOn == null) {
            setDependsOn(new java.util.ArrayList<String>(dependsOn.length));
        }
        for (String ele : dependsOn) {
            this.dependsOn.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of strings that contain the identifiers of the build groups that this build group depends on.
     * </p>
     * 
     * @param dependsOn
     *        An array of strings that contain the identifiers of the build groups that this build group depends on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withDependsOn(java.util.Collection<String> dependsOn) {
        setDependsOn(dependsOn);
        return this;
    }

    /**
     * <p>
     * Specifies if failures in this build group can be ignored.
     * </p>
     * 
     * @param ignoreFailure
     *        Specifies if failures in this build group can be ignored.
     */

    public void setIgnoreFailure(Boolean ignoreFailure) {
        this.ignoreFailure = ignoreFailure;
    }

    /**
     * <p>
     * Specifies if failures in this build group can be ignored.
     * </p>
     * 
     * @return Specifies if failures in this build group can be ignored.
     */

    public Boolean getIgnoreFailure() {
        return this.ignoreFailure;
    }

    /**
     * <p>
     * Specifies if failures in this build group can be ignored.
     * </p>
     * 
     * @param ignoreFailure
     *        Specifies if failures in this build group can be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withIgnoreFailure(Boolean ignoreFailure) {
        setIgnoreFailure(ignoreFailure);
        return this;
    }

    /**
     * <p>
     * Specifies if failures in this build group can be ignored.
     * </p>
     * 
     * @return Specifies if failures in this build group can be ignored.
     */

    public Boolean isIgnoreFailure() {
        return this.ignoreFailure;
    }

    /**
     * <p>
     * A <code>BuildSummary</code> object that contains a summary of the current build group.
     * </p>
     * 
     * @param currentBuildSummary
     *        A <code>BuildSummary</code> object that contains a summary of the current build group.
     */

    public void setCurrentBuildSummary(BuildSummary currentBuildSummary) {
        this.currentBuildSummary = currentBuildSummary;
    }

    /**
     * <p>
     * A <code>BuildSummary</code> object that contains a summary of the current build group.
     * </p>
     * 
     * @return A <code>BuildSummary</code> object that contains a summary of the current build group.
     */

    public BuildSummary getCurrentBuildSummary() {
        return this.currentBuildSummary;
    }

    /**
     * <p>
     * A <code>BuildSummary</code> object that contains a summary of the current build group.
     * </p>
     * 
     * @param currentBuildSummary
     *        A <code>BuildSummary</code> object that contains a summary of the current build group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withCurrentBuildSummary(BuildSummary currentBuildSummary) {
        setCurrentBuildSummary(currentBuildSummary);
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * </p>
     * 
     * @return An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     */

    public java.util.List<BuildSummary> getPriorBuildSummaryList() {
        return priorBuildSummaryList;
    }

    /**
     * <p>
     * An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * </p>
     * 
     * @param priorBuildSummaryList
     *        An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     */

    public void setPriorBuildSummaryList(java.util.Collection<BuildSummary> priorBuildSummaryList) {
        if (priorBuildSummaryList == null) {
            this.priorBuildSummaryList = null;
            return;
        }

        this.priorBuildSummaryList = new java.util.ArrayList<BuildSummary>(priorBuildSummaryList);
    }

    /**
     * <p>
     * An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriorBuildSummaryList(java.util.Collection)} or
     * {@link #withPriorBuildSummaryList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param priorBuildSummaryList
     *        An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withPriorBuildSummaryList(BuildSummary... priorBuildSummaryList) {
        if (this.priorBuildSummaryList == null) {
            setPriorBuildSummaryList(new java.util.ArrayList<BuildSummary>(priorBuildSummaryList.length));
        }
        for (BuildSummary ele : priorBuildSummaryList) {
            this.priorBuildSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * </p>
     * 
     * @param priorBuildSummaryList
     *        An array of <code>BuildSummary</code> objects that contain summaries of previous build groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildGroup withPriorBuildSummaryList(java.util.Collection<BuildSummary> priorBuildSummaryList) {
        setPriorBuildSummaryList(priorBuildSummaryList);
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
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getDependsOn() != null)
            sb.append("DependsOn: ").append(getDependsOn()).append(",");
        if (getIgnoreFailure() != null)
            sb.append("IgnoreFailure: ").append(getIgnoreFailure()).append(",");
        if (getCurrentBuildSummary() != null)
            sb.append("CurrentBuildSummary: ").append(getCurrentBuildSummary()).append(",");
        if (getPriorBuildSummaryList() != null)
            sb.append("PriorBuildSummaryList: ").append(getPriorBuildSummaryList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildGroup == false)
            return false;
        BuildGroup other = (BuildGroup) obj;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getDependsOn() == null ^ this.getDependsOn() == null)
            return false;
        if (other.getDependsOn() != null && other.getDependsOn().equals(this.getDependsOn()) == false)
            return false;
        if (other.getIgnoreFailure() == null ^ this.getIgnoreFailure() == null)
            return false;
        if (other.getIgnoreFailure() != null && other.getIgnoreFailure().equals(this.getIgnoreFailure()) == false)
            return false;
        if (other.getCurrentBuildSummary() == null ^ this.getCurrentBuildSummary() == null)
            return false;
        if (other.getCurrentBuildSummary() != null && other.getCurrentBuildSummary().equals(this.getCurrentBuildSummary()) == false)
            return false;
        if (other.getPriorBuildSummaryList() == null ^ this.getPriorBuildSummaryList() == null)
            return false;
        if (other.getPriorBuildSummaryList() != null && other.getPriorBuildSummaryList().equals(this.getPriorBuildSummaryList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDependsOn() == null) ? 0 : getDependsOn().hashCode());
        hashCode = prime * hashCode + ((getIgnoreFailure() == null) ? 0 : getIgnoreFailure().hashCode());
        hashCode = prime * hashCode + ((getCurrentBuildSummary() == null) ? 0 : getCurrentBuildSummary().hashCode());
        hashCode = prime * hashCode + ((getPriorBuildSummaryList() == null) ? 0 : getPriorBuildSummaryList().hashCode());
        return hashCode;
    }

    @Override
    public BuildGroup clone() {
        try {
            return (BuildGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
