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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateExperiment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExperimentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     */
    private String experimentName;
    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     * <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description of the experiment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     */

    public void setExperimentName(String experimentName) {
        this.experimentName = experimentName;
    }

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @return The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     */

    public String getExperimentName() {
        return this.experimentName;
    }

    /**
     * <p>
     * The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     * </p>
     * 
     * @param experimentName
     *        The name of the experiment. The name must be unique in your AWS account and is not case-sensitive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withExperimentName(String experimentName) {
        setExperimentName(experimentName);
        return this;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     * <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     *        <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     * <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @return The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     *         <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     * <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     * </p>
     * 
     * @param displayName
     *        The name of the experiment as displayed. The name doesn't need to be unique. If you don't specify
     *        <code>DisplayName</code>, the value in <code>ExperimentName</code> is displayed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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

    public CreateExperimentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @return A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
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
     * A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withTags(Tag... tags) {
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
     * A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with the experiment. You can use <a>Search</a> API to search on the tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExperimentRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateExperimentRequest == false)
            return false;
        CreateExperimentRequest other = (CreateExperimentRequest) obj;
        if (other.getExperimentName() == null ^ this.getExperimentName() == null)
            return false;
        if (other.getExperimentName() != null && other.getExperimentName().equals(this.getExperimentName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateExperimentRequest clone() {
        return (CreateExperimentRequest) super.clone();
    }

}
