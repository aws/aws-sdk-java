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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/UpdatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the pipeline to update.
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
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     */

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @return The name of the pipeline to update.
     */

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * <p>
     * The name of the pipeline to update.
     * </p>
     * 
     * @param pipelineName
     *        The name of the pipeline to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePipelineRequest withPipelineName(String pipelineName) {
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

    public UpdatePipelineRequest withPipelineActivities(PipelineActivity... pipelineActivities) {
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

    public UpdatePipelineRequest withPipelineActivities(java.util.Collection<PipelineActivity> pipelineActivities) {
        setPipelineActivities(pipelineActivities);
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
            sb.append("PipelineActivities: ").append(getPipelineActivities());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineRequest == false)
            return false;
        UpdatePipelineRequest other = (UpdatePipelineRequest) obj;
        if (other.getPipelineName() == null ^ this.getPipelineName() == null)
            return false;
        if (other.getPipelineName() != null && other.getPipelineName().equals(this.getPipelineName()) == false)
            return false;
        if (other.getPipelineActivities() == null ^ this.getPipelineActivities() == null)
            return false;
        if (other.getPipelineActivities() != null && other.getPipelineActivities().equals(this.getPipelineActivities()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPipelineName() == null) ? 0 : getPipelineName().hashCode());
        hashCode = prime * hashCode + ((getPipelineActivities() == null) ? 0 : getPipelineActivities().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineRequest clone() {
        return (UpdatePipelineRequest) super.clone();
    }

}
