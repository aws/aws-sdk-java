/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Object specifying a Composition resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/Composition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Composition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * ARN of the Composition resource.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     * <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * </p>
     */
    private java.util.List<Destination> destinations;
    /**
     * <p>
     * UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * Layout object to configure composition parameters.
     * </p>
     */
    private LayoutConfiguration layout;
    /**
     * <p>
     * ARN of the stage used as input
     * </p>
     */
    private String stageArn;
    /**
     * <p>
     * UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * State of the Composition.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * ARN of the Composition resource.
     * </p>
     * 
     * @param arn
     *        ARN of the Composition resource.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * ARN of the Composition resource.
     * </p>
     * 
     * @return ARN of the Composition resource.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * ARN of the Composition resource.
     * </p>
     * 
     * @param arn
     *        ARN of the Composition resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     * <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * </p>
     * 
     * @return Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     *         <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     */

    public java.util.List<Destination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     * <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * </p>
     * 
     * @param destinations
     *        Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     *        <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     */

    public void setDestinations(java.util.Collection<Destination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<Destination>(destinations);
    }

    /**
     * <p>
     * Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     * <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     *        <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withDestinations(Destination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<Destination>(destinations.length));
        }
        for (Destination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     * <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * </p>
     * 
     * @param destinations
     *        Array of Destination objects. A Composition can contain either one destination (<code>channel</code> or
     *        <code>s3</code>) or two (one <code>channel</code> and one <code>s3</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withDestinations(java.util.Collection<Destination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param endTime
     *        UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param endTime
     *        UTC time of the Composition end. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * Layout object to configure composition parameters.
     * </p>
     * 
     * @param layout
     *        Layout object to configure composition parameters.
     */

    public void setLayout(LayoutConfiguration layout) {
        this.layout = layout;
    }

    /**
     * <p>
     * Layout object to configure composition parameters.
     * </p>
     * 
     * @return Layout object to configure composition parameters.
     */

    public LayoutConfiguration getLayout() {
        return this.layout;
    }

    /**
     * <p>
     * Layout object to configure composition parameters.
     * </p>
     * 
     * @param layout
     *        Layout object to configure composition parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withLayout(LayoutConfiguration layout) {
        setLayout(layout);
        return this;
    }

    /**
     * <p>
     * ARN of the stage used as input
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage used as input
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * ARN of the stage used as input
     * </p>
     * 
     * @return ARN of the stage used as input
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * ARN of the stage used as input
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage used as input
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withStageArn(String stageArn) {
        setStageArn(stageArn);
        return this;
    }

    /**
     * <p>
     * UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        UTC time of the Composition start. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * State of the Composition.
     * </p>
     * 
     * @param state
     *        State of the Composition.
     * @see CompositionState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * State of the Composition.
     * </p>
     * 
     * @return State of the Composition.
     * @see CompositionState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * State of the Composition.
     * </p>
     * 
     * @param state
     *        State of the Composition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompositionState
     */

    public Composition withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * State of the Composition.
     * </p>
     * 
     * @param state
     *        State of the Composition.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CompositionState
     */

    public Composition withState(CompositionState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @return Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>.
     *         See <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a>
     *         for details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon
     *         IVS has no constraints on tags beyond what is documented there.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for details,
     * including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no constraints
     * on tags beyond what is documented there.
     * </p>
     * 
     * @param tags
     *        Tags attached to the resource. Array of maps, each of the form <code>string:string (key:value)</code>. See
     *        <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> for
     *        details, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS
     *        has no constraints on tags beyond what is documented there.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Composition#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Composition addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Composition clearTagsEntries() {
        this.tags = null;
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getLayout() != null)
            sb.append("Layout: ").append(getLayout()).append(",");
        if (getStageArn() != null)
            sb.append("StageArn: ").append(getStageArn()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof Composition == false)
            return false;
        Composition other = (Composition) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getLayout() == null ^ this.getLayout() == null)
            return false;
        if (other.getLayout() != null && other.getLayout().equals(this.getLayout()) == false)
            return false;
        if (other.getStageArn() == null ^ this.getStageArn() == null)
            return false;
        if (other.getStageArn() != null && other.getStageArn().equals(this.getStageArn()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Composition clone() {
        try {
            return (Composition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.CompositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
