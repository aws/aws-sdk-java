/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/CreatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     */
    private String pipelineName;
    /**
     * <p>
     * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing,
     * renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda
     * functions on messages for advanced processing; or performing mathematical transformations to normalize device
     * data.
     * </p>
     * <p>
     * The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     * <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     * </p>
     * <p>
     * <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * </p>
     */
    private java.util.List<PipelineActivity> pipelineActivities;
    /**
     * <p>
     * Metadata which can be used to manage the pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @return The name of the pipeline.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineName(String pipelineName) {
        setPipelineName(pipelineName);
        return this;
    }

    /**
     * <p>
     * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing,
     * renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda
     * functions on messages for advanced processing; or performing mathematical transformations to normalize device
     * data.
     * </p>
     * <p>
     * The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     * <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     * </p>
     * <p>
     * <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * </p>
     * 
     * @return A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as
     *         removing, renaming or adding message attributes; filtering messages based on attribute values; invoking
     *         your Lambda functions on messages for advanced processing; or performing mathematical transformations to
     *         normalize device data.</p>
     *         <p>
     *         The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     *         <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     *         </p>
     *         <p>
     *         <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     */

    public java.util.List<PipelineActivity> getPipelineActivities() {
        return pipelineActivities;
    }

    /**
     * <p>
     * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing,
     * renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda
     * functions on messages for advanced processing; or performing mathematical transformations to normalize device
     * data.
     * </p>
     * <p>
     * The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     * <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     * </p>
     * <p>
     * <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * </p>
     * 
     * @param pipelineActivities
     *        A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as
     *        removing, renaming or adding message attributes; filtering messages based on attribute values; invoking
     *        your Lambda functions on messages for advanced processing; or performing mathematical transformations to
     *        normalize device data.</p>
     *        <p>
     *        The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     *        <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     *        </p>
     *        <p>
     *        <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     */

    public void setPipelineActivities(java.util.Collection<PipelineActivity> pipelineActivities) {
        if (pipelineActivities == null) {
            this.pipelineActivities = null;
            return;
        }

        this.pipelineActivities = new java.util.ArrayList<PipelineActivity>(pipelineActivities);
    }

    /**
     * <p>
     * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing,
     * renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda
     * functions on messages for advanced processing; or performing mathematical transformations to normalize device
     * data.
     * </p>
     * <p>
     * The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     * <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     * </p>
     * <p>
     * <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPipelineActivities(java.util.Collection)} or {@link #withPipelineActivities(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param pipelineActivities
     *        A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as
     *        removing, renaming or adding message attributes; filtering messages based on attribute values; invoking
     *        your Lambda functions on messages for advanced processing; or performing mathematical transformations to
     *        normalize device data.</p>
     *        <p>
     *        The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     *        <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     *        </p>
     *        <p>
     *        <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineActivities(PipelineActivity... pipelineActivities) {
        if (this.pipelineActivities == null) {
            setPipelineActivities(new java.util.ArrayList<PipelineActivity>(pipelineActivities.length));
        }
        for (PipelineActivity ele : pipelineActivities) {
            this.pipelineActivities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as removing,
     * renaming or adding message attributes; filtering messages based on attribute values; invoking your Lambda
     * functions on messages for advanced processing; or performing mathematical transformations to normalize device
     * data.
     * </p>
     * <p>
     * The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     * <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     * </p>
     * <p>
     * <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * </p>
     * 
     * @param pipelineActivities
     *        A list of "PipelineActivity" objects. Activities perform transformations on your messages, such as
     *        removing, renaming or adding message attributes; filtering messages based on attribute values; invoking
     *        your Lambda functions on messages for advanced processing; or performing mathematical transformations to
     *        normalize device data.</p>
     *        <p>
     *        The list can be 2-25 <b>PipelineActivity</b> objects and must contain both a <code>channel</code> and a
     *        <code>datastore</code> activity. Each entry in the list must contain only one activity, for example:
     *        </p>
     *        <p>
     *        <code>pipelineActivities = [ { "channel": { ... } }, { "lambda": { ... } }, ... ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withPipelineActivities(java.util.Collection<PipelineActivity> pipelineActivities) {
        setPipelineActivities(pipelineActivities);
        return this;
    }

    /**
     * <p>
     * Metadata which can be used to manage the pipeline.
     * </p>
     * 
     * @return Metadata which can be used to manage the pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata which can be used to manage the pipeline.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the pipeline.
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
     * Metadata which can be used to manage the pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(Tag... tags) {
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
     * Metadata which can be used to manage the pipeline.
     * </p>
     * 
     * @param tags
     *        Metadata which can be used to manage the pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreatePipelineRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPipelineName() != null)
            sb.append("PipelineName: ").append(getPipelineName()).append(",");
        if (getPipelineActivities() != null)
            sb.append("PipelineActivities: ").append(getPipelineActivities()).append(",");
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

        if (obj instanceof CreatePipelineRequest == false)
            return false;
        CreatePipelineRequest other = (CreatePipelineRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineActivities() == null ^ this.getPipelineActivities() == null)
            return false;
        if (other.getPipelineActivities() != null && other.getPipelineActivities().equals(this.getPipelineActivities()) == false)
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

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineActivities() == null) ? 0 : getPipelineActivities().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreatePipelineRequest clone() {
        return (CreatePipelineRequest) super.clone();
    }

}
