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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of the properties of a trial as returned by the <a>Search</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Trial" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Trial implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the trial.
     * </p>
     */
    private String trialName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     */
    private String trialArn;
    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     */
    private String experimentName;

    private TrialSource source;
    /**
     * <p>
     * When the trial was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * Who last modified the trial.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * A list of the components associated with the trial. For each component, a summary of the component's properties
     * is included.
     * </p>
     */
    private java.util.List<TrialComponentSimpleSummary> trialComponentSummaries;

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     */

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @return The name of the trial.
     */

    public String getTrialName() {
        return this.trialName;
    }

    /**
     * <p>
     * The name of the trial.
     * </p>
     * 
     * @param trialName
     *        The name of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTrialName(String trialName) {
        setTrialName(trialName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     */

    public void setTrialArn(String trialArn) {
        this.trialArn = trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the trial.
     */

    public String getTrialArn() {
        return this.trialArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the trial.
     * </p>
     * 
     * @param trialArn
     *        The Amazon Resource Name (ARN) of the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTrialArn(String trialArn) {
        setTrialArn(trialArn);
        return this;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     *        displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @return The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code>
     *         is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     * displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the trial as displayed. If <code>DisplayName</code> isn't specified, <code>TrialName</code> is
     *        displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment the trial is part of.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * 
     * @return The name of the experiment the trial is part of.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment the trial is part of.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment the trial is part of.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(TrialSource source) {
        this.source = source;
    }

    /**
     * @return
     */

    public TrialSource getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withSource(TrialSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @param creationTime
     *        When the trial was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @return When the trial was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the trial was created.
     * </p>
     * 
     * @param creationTime
     *        When the trial was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param createdBy
     */

    public void setCreatedBy(UserContext createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return
     */

    public UserContext getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @param createdBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     * 
     * @param lastModifiedTime
     *        Who last modified the trial.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     * 
     * @return Who last modified the trial.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * Who last modified the trial.
     * </p>
     * 
     * @param lastModifiedTime
     *        Who last modified the trial.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * @param lastModifiedBy
     */

    public void setLastModifiedBy(UserContext lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    /**
     * @return
     */

    public UserContext getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * @param lastModifiedBy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the trial. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a summary of the component's properties
     * is included.
     * </p>
     * 
     * @return A list of the components associated with the trial. For each component, a summary of the component's
     *         properties is included.
     */

    public java.util.List<TrialComponentSimpleSummary> getTrialComponentSummaries() {
        return trialComponentSummaries;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a summary of the component's properties
     * is included.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the components associated with the trial. For each component, a summary of the component's
     *        properties is included.
     */

    public void setTrialComponentSummaries(java.util.Collection<TrialComponentSimpleSummary> trialComponentSummaries) {
        if (trialComponentSummaries == null) {
            this.trialComponentSummaries = null;
            return;
        }

        this.trialComponentSummaries = new java.util.ArrayList<TrialComponentSimpleSummary>(trialComponentSummaries);
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a summary of the component's properties
     * is included.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrialComponentSummaries(java.util.Collection)} or
     * {@link #withTrialComponentSummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the components associated with the trial. For each component, a summary of the component's
     *        properties is included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTrialComponentSummaries(TrialComponentSimpleSummary... trialComponentSummaries) {
        if (this.trialComponentSummaries == null) {
            setTrialComponentSummaries(new java.util.ArrayList<TrialComponentSimpleSummary>(trialComponentSummaries.length));
        }
        for (TrialComponentSimpleSummary ele : trialComponentSummaries) {
            this.trialComponentSummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the components associated with the trial. For each component, a summary of the component's properties
     * is included.
     * </p>
     * 
     * @param trialComponentSummaries
     *        A list of the components associated with the trial. For each component, a summary of the component's
     *        properties is included.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trial withTrialComponentSummaries(java.util.Collection<TrialComponentSimpleSummary> trialComponentSummaries) {
        setTrialComponentSummaries(trialComponentSummaries);
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
        if (getTrialName() != null)
            sb.append("TrialName: ").append(getTrialName()).append(",");
        if (getTrialArn() != null)
            sb.append("TrialArn: ").append(getTrialArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTrialComponentSummaries() != null)
            sb.append("TrialComponentSummaries: ").append(getTrialComponentSummaries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trial == false)
            return false;
        Trial other = (Trial) obj;
        if (other.getTrialName() == null ^ this.getTrialName() == null)
            return false;
        if (other.getTrialName() != null && other.getTrialName().equals(this.getTrialName()) == false)
            return false;
        if (other.getTrialArn() == null ^ this.getTrialArn() == null)
            return false;
        if (other.getTrialArn() != null && other.getTrialArn().equals(this.getTrialArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getCreatedBy() == null ^ this.getCreatedBy() == null)
            return false;
        if (other.getCreatedBy() != null && other.getCreatedBy().equals(this.getCreatedBy()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getLastModifiedBy() == null ^ this.getLastModifiedBy() == null)
            return false;
        if (other.getLastModifiedBy() != null && other.getLastModifiedBy().equals(this.getLastModifiedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTrialComponentSummaries() == null ^ this.getTrialComponentSummaries() == null)
            return false;
        if (other.getTrialComponentSummaries() != null && other.getTrialComponentSummaries().equals(this.getTrialComponentSummaries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrialName() == null) ? 0 : getTrialName().hashCode());
        hashCode = prime * hashCode + ((getTrialArn() == null) ? 0 : getTrialArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTrialComponentSummaries() == null) ? 0 : getTrialComponentSummaries().hashCode());
        return hashCode;
    }

    @Override
    public Trial clone() {
        try {
            return (Trial) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.TrialMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
