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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/StartComposition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCompositionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Array of destination configuration.
     * </p>
     */
    private java.util.List<DestinationConfiguration> destinations;
    /**
     * <p>
     * Idempotency token.
     * </p>
     */
    private String idempotencyToken;
    /**
     * <p>
     * Layout object to configure composition parameters.
     * </p>
     */
    private LayoutConfiguration layout;
    /**
     * <p>
     * ARN of the stage to be used for compositing.
     * </p>
     */
    private String stageArn;
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
     * Array of destination configuration.
     * </p>
     * 
     * @return Array of destination configuration.
     */

    public java.util.List<DestinationConfiguration> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * Array of destination configuration.
     * </p>
     * 
     * @param destinations
     *        Array of destination configuration.
     */

    public void setDestinations(java.util.Collection<DestinationConfiguration> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<DestinationConfiguration>(destinations);
    }

    /**
     * <p>
     * Array of destination configuration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        Array of destination configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCompositionRequest withDestinations(DestinationConfiguration... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<DestinationConfiguration>(destinations.length));
        }
        for (DestinationConfiguration ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Array of destination configuration.
     * </p>
     * 
     * @param destinations
     *        Array of destination configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCompositionRequest withDestinations(java.util.Collection<DestinationConfiguration> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param idempotencyToken
     *        Idempotency token.
     */

    public void setIdempotencyToken(String idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @return Idempotency token.
     */

    public String getIdempotencyToken() {
        return this.idempotencyToken;
    }

    /**
     * <p>
     * Idempotency token.
     * </p>
     * 
     * @param idempotencyToken
     *        Idempotency token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCompositionRequest withIdempotencyToken(String idempotencyToken) {
        setIdempotencyToken(idempotencyToken);
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

    public StartCompositionRequest withLayout(LayoutConfiguration layout) {
        setLayout(layout);
        return this;
    }

    /**
     * <p>
     * ARN of the stage to be used for compositing.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to be used for compositing.
     */

    public void setStageArn(String stageArn) {
        this.stageArn = stageArn;
    }

    /**
     * <p>
     * ARN of the stage to be used for compositing.
     * </p>
     * 
     * @return ARN of the stage to be used for compositing.
     */

    public String getStageArn() {
        return this.stageArn;
    }

    /**
     * <p>
     * ARN of the stage to be used for compositing.
     * </p>
     * 
     * @param stageArn
     *        ARN of the stage to be used for compositing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCompositionRequest withStageArn(String stageArn) {
        setStageArn(stageArn);
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

    public StartCompositionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see StartCompositionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public StartCompositionRequest addTagsEntry(String key, String value) {
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

    public StartCompositionRequest clearTagsEntries() {
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
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getIdempotencyToken() != null)
            sb.append("IdempotencyToken: ").append(getIdempotencyToken()).append(",");
        if (getLayout() != null)
            sb.append("Layout: ").append(getLayout()).append(",");
        if (getStageArn() != null)
            sb.append("StageArn: ").append(getStageArn()).append(",");
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

        if (obj instanceof StartCompositionRequest == false)
            return false;
        StartCompositionRequest other = (StartCompositionRequest) obj;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getIdempotencyToken() == null ^ this.getIdempotencyToken() == null)
            return false;
        if (other.getIdempotencyToken() != null && other.getIdempotencyToken().equals(this.getIdempotencyToken()) == false)
            return false;
        if (other.getLayout() == null ^ this.getLayout() == null)
            return false;
        if (other.getLayout() != null && other.getLayout().equals(this.getLayout()) == false)
            return false;
        if (other.getStageArn() == null ^ this.getStageArn() == null)
            return false;
        if (other.getStageArn() != null && other.getStageArn().equals(this.getStageArn()) == false)
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

        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getIdempotencyToken() == null) ? 0 : getIdempotencyToken().hashCode());
        hashCode = prime * hashCode + ((getLayout() == null) ? 0 : getLayout().hashCode());
        hashCode = prime * hashCode + ((getStageArn() == null) ? 0 : getStageArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public StartCompositionRequest clone() {
        return (StartCompositionRequest) super.clone();
    }

}
