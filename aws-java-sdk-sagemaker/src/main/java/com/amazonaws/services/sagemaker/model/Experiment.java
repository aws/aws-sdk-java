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
 * A summary of the properties of an experiment as returned by the <a>Search</a> API.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/Experiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Experiment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the experiment.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     */
    private String experimentArn;
    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     */
    private String displayName;

    private ExperimentSource source;
    /**
     * <p>
     * The description of the experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * When the experiment was created.
     * </p>
     */
    private java.util.Date creationTime;

    private UserContext createdBy;
    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    private UserContext lastModifiedBy;
    /**
     * <p>
     * The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @return The name of the experiment.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment.
     */

    public void setExperimentArn(String experimentArn) {
        this.experimentArn = experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the experiment.
     */

    public String getExperimentArn() {
        return this.experimentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the experiment.
     * </p>
     * 
     * @param experimentArn
     *        The Amazon Resource Name (ARN) of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withExperimentArn(String experimentArn) {
        setExperimentArn(experimentArn);
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>ExperimentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @return The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *         <code>ExperimentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. If <code>DisplayName</code> isn't specified, <code>ExperimentName</code>
     * is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. If <code>DisplayName</code> isn't specified,
     *        <code>ExperimentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * @param source
     */

    public void setSource(ExperimentSource source) {
        this.source = source;
    }

    /**
     * @return
     */

    public ExperimentSource getSource() {
        return this.source;
    }

    /**
     * @param source
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withSource(ExperimentSource source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @param description
     *        The description of the experiment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @return The description of the experiment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the experiment.
     * </p>
     * 
     * @param description
     *        The description of the experiment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        When the experiment was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @return When the experiment was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the experiment was created.
     * </p>
     * 
     * @param creationTime
     *        When the experiment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withCreationTime(java.util.Date creationTime) {
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

    public Experiment withCreatedBy(UserContext createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the experiment was last modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @return When the experiment was last modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * When the experiment was last modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        When the experiment was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withLastModifiedTime(java.util.Date lastModifiedTime) {
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

    public Experiment withLastModifiedBy(UserContext lastModifiedBy) {
        setLastModifiedBy(lastModifiedBy);
        return this;
    }

    /**
     * <p>
     * The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the
     *         tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the
     *        tags.
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
     * The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withTags(Tag... tags) {
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
     * The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        The list of tags that are associated with the experiment. You can use <a>Search</a> API to search on the
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Experiment withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getExperimentName() != null)
            sb.append("ExperimentName: ").append(getExperimentName()).append(",");
        if (getExperimentArn() != null)
            sb.append("ExperimentArn: ").append(getExperimentArn()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getCreatedBy() != null)
            sb.append("CreatedBy: ").append(getCreatedBy()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getLastModifiedBy() != null)
            sb.append("LastModifiedBy: ").append(getLastModifiedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Experiment == false)
            return false;
        Experiment other = (Experiment) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getExperimentArn() == null ^ this.getExperimentArn() == null)
            return false;
        if (other.getExperimentArn() != null && other.getExperimentArn().equals(this.getExperimentArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExperimentName() == null) ? 0 : getExperimentName().hashCode());
        hashCode = prime * hashCode + ((getExperimentArn() == null) ? 0 : getExperimentArn().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedBy() == null) ? 0 : getLastModifiedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Experiment clone() {
        try {
            return (Experiment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ExperimentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
