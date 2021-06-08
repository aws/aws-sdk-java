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
 * Contains summary information about a batch build group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BuildSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BuildSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The batch build ARN.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * When the build was started, expressed in Unix time format.
     * </p>
     */
    private java.util.Date requestedOn;
    /**
     * <p>
     * The status of the build group.
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build group failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build group faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build group is still in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build group stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build group succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build group timed out.
     * </p>
     * </dd>
     * </dl>
     */
    private String buildStatus;
    /**
     * <p>
     * A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     * </p>
     */
    private ResolvedArtifact primaryArtifact;
    /**
     * <p>
     * An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the build
     * group.
     * </p>
     */
    private java.util.List<ResolvedArtifact> secondaryArtifacts;

    /**
     * <p>
     * The batch build ARN.
     * </p>
     * 
     * @param arn
     *        The batch build ARN.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The batch build ARN.
     * </p>
     * 
     * @return The batch build ARN.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The batch build ARN.
     * </p>
     * 
     * @param arn
     *        The batch build ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * When the build was started, expressed in Unix time format.
     * </p>
     * 
     * @param requestedOn
     *        When the build was started, expressed in Unix time format.
     */

    public void setRequestedOn(java.util.Date requestedOn) {
        this.requestedOn = requestedOn;
    }

    /**
     * <p>
     * When the build was started, expressed in Unix time format.
     * </p>
     * 
     * @return When the build was started, expressed in Unix time format.
     */

    public java.util.Date getRequestedOn() {
        return this.requestedOn;
    }

    /**
     * <p>
     * When the build was started, expressed in Unix time format.
     * </p>
     * 
     * @param requestedOn
     *        When the build was started, expressed in Unix time format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSummary withRequestedOn(java.util.Date requestedOn) {
        setRequestedOn(requestedOn);
        return this;
    }

    /**
     * <p>
     * The status of the build group.
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build group failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build group faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build group is still in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build group stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build group succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build group timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param buildStatus
     *        The status of the build group.</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build group failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build group faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build group is still in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build group stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build group succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build group timed out.
     *        </p>
     *        </dd>
     * @see StatusType
     */

    public void setBuildStatus(String buildStatus) {
        this.buildStatus = buildStatus;
    }

    /**
     * <p>
     * The status of the build group.
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build group failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build group faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build group is still in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build group stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build group succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build group timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the build group.</p>
     *         <dl>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The build group failed.
     *         </p>
     *         </dd>
     *         <dt>FAULT</dt>
     *         <dd>
     *         <p>
     *         The build group faulted.
     *         </p>
     *         </dd>
     *         <dt>IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The build group is still in progress.
     *         </p>
     *         </dd>
     *         <dt>STOPPED</dt>
     *         <dd>
     *         <p>
     *         The build group stopped.
     *         </p>
     *         </dd>
     *         <dt>SUCCEEDED</dt>
     *         <dd>
     *         <p>
     *         The build group succeeded.
     *         </p>
     *         </dd>
     *         <dt>TIMED_OUT</dt>
     *         <dd>
     *         <p>
     *         The build group timed out.
     *         </p>
     *         </dd>
     * @see StatusType
     */

    public String getBuildStatus() {
        return this.buildStatus;
    }

    /**
     * <p>
     * The status of the build group.
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build group failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build group faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build group is still in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build group stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build group succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build group timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param buildStatus
     *        The status of the build group.</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build group failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build group faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build group is still in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build group stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build group succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build group timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildSummary withBuildStatus(String buildStatus) {
        setBuildStatus(buildStatus);
        return this;
    }

    /**
     * <p>
     * The status of the build group.
     * </p>
     * <dl>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The build group failed.
     * </p>
     * </dd>
     * <dt>FAULT</dt>
     * <dd>
     * <p>
     * The build group faulted.
     * </p>
     * </dd>
     * <dt>IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The build group is still in progress.
     * </p>
     * </dd>
     * <dt>STOPPED</dt>
     * <dd>
     * <p>
     * The build group stopped.
     * </p>
     * </dd>
     * <dt>SUCCEEDED</dt>
     * <dd>
     * <p>
     * The build group succeeded.
     * </p>
     * </dd>
     * <dt>TIMED_OUT</dt>
     * <dd>
     * <p>
     * The build group timed out.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param buildStatus
     *        The status of the build group.</p>
     *        <dl>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The build group failed.
     *        </p>
     *        </dd>
     *        <dt>FAULT</dt>
     *        <dd>
     *        <p>
     *        The build group faulted.
     *        </p>
     *        </dd>
     *        <dt>IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The build group is still in progress.
     *        </p>
     *        </dd>
     *        <dt>STOPPED</dt>
     *        <dd>
     *        <p>
     *        The build group stopped.
     *        </p>
     *        </dd>
     *        <dt>SUCCEEDED</dt>
     *        <dd>
     *        <p>
     *        The build group succeeded.
     *        </p>
     *        </dd>
     *        <dt>TIMED_OUT</dt>
     *        <dd>
     *        <p>
     *        The build group timed out.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StatusType
     */

    public BuildSummary withBuildStatus(StatusType buildStatus) {
        this.buildStatus = buildStatus.toString();
        return this;
    }

    /**
     * <p>
     * A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     * </p>
     * 
     * @param primaryArtifact
     *        A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     */

    public void setPrimaryArtifact(ResolvedArtifact primaryArtifact) {
        this.primaryArtifact = primaryArtifact;
    }

    /**
     * <p>
     * A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     * </p>
     * 
     * @return A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     */

    public ResolvedArtifact getPrimaryArtifact() {
        return this.primaryArtifact;
    }

    /**
     * <p>
     * A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     * </p>
     * 
     * @param primaryArtifact
     *        A <code>ResolvedArtifact</code> object that represents the primary build artifacts for the build group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSummary withPrimaryArtifact(ResolvedArtifact primaryArtifact) {
        setPrimaryArtifact(primaryArtifact);
        return this;
    }

    /**
     * <p>
     * An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the build
     * group.
     * </p>
     * 
     * @return An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the
     *         build group.
     */

    public java.util.List<ResolvedArtifact> getSecondaryArtifacts() {
        return secondaryArtifacts;
    }

    /**
     * <p>
     * An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the build
     * group.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the
     *        build group.
     */

    public void setSecondaryArtifacts(java.util.Collection<ResolvedArtifact> secondaryArtifacts) {
        if (secondaryArtifacts == null) {
            this.secondaryArtifacts = null;
            return;
        }

        this.secondaryArtifacts = new java.util.ArrayList<ResolvedArtifact>(secondaryArtifacts);
    }

    /**
     * <p>
     * An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the build
     * group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecondaryArtifacts(java.util.Collection)} or {@link #withSecondaryArtifacts(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the
     *        build group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSummary withSecondaryArtifacts(ResolvedArtifact... secondaryArtifacts) {
        if (this.secondaryArtifacts == null) {
            setSecondaryArtifacts(new java.util.ArrayList<ResolvedArtifact>(secondaryArtifacts.length));
        }
        for (ResolvedArtifact ele : secondaryArtifacts) {
            this.secondaryArtifacts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the build
     * group.
     * </p>
     * 
     * @param secondaryArtifacts
     *        An array of <code>ResolvedArtifact</code> objects that represents the secondary build artifacts for the
     *        build group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BuildSummary withSecondaryArtifacts(java.util.Collection<ResolvedArtifact> secondaryArtifacts) {
        setSecondaryArtifacts(secondaryArtifacts);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRequestedOn() != null)
            sb.append("RequestedOn: ").append(getRequestedOn()).append(",");
        if (getBuildStatus() != null)
            sb.append("BuildStatus: ").append(getBuildStatus()).append(",");
        if (getPrimaryArtifact() != null)
            sb.append("PrimaryArtifact: ").append(getPrimaryArtifact()).append(",");
        if (getSecondaryArtifacts() != null)
            sb.append("SecondaryArtifacts: ").append(getSecondaryArtifacts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BuildSummary == false)
            return false;
        BuildSummary other = (BuildSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRequestedOn() == null ^ this.getRequestedOn() == null)
            return false;
        if (other.getRequestedOn() != null && other.getRequestedOn().equals(this.getRequestedOn()) == false)
            return false;
        if (other.getBuildStatus() == null ^ this.getBuildStatus() == null)
            return false;
        if (other.getBuildStatus() != null && other.getBuildStatus().equals(this.getBuildStatus()) == false)
            return false;
        if (other.getPrimaryArtifact() == null ^ this.getPrimaryArtifact() == null)
            return false;
        if (other.getPrimaryArtifact() != null && other.getPrimaryArtifact().equals(this.getPrimaryArtifact()) == false)
            return false;
        if (other.getSecondaryArtifacts() == null ^ this.getSecondaryArtifacts() == null)
            return false;
        if (other.getSecondaryArtifacts() != null && other.getSecondaryArtifacts().equals(this.getSecondaryArtifacts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRequestedOn() == null) ? 0 : getRequestedOn().hashCode());
        hashCode = prime * hashCode + ((getBuildStatus() == null) ? 0 : getBuildStatus().hashCode());
        hashCode = prime * hashCode + ((getPrimaryArtifact() == null) ? 0 : getPrimaryArtifact().hashCode());
        hashCode = prime * hashCode + ((getSecondaryArtifacts() == null) ? 0 : getSecondaryArtifacts().hashCode());
        return hashCode;
    }

    @Override
    public BuildSummary clone() {
        try {
            return (BuildSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codebuild.model.transform.BuildSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
