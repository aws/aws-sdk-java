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
package com.amazonaws.services.controltower.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/controltower-2018-05-10/EnableControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     */
    private String controlIdentifier;
    /**
     * <p>
     * Tags to be applied to the <code>EnabledControl</code> resource.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     */
    private String targetIdentifier;

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param controlIdentifier
     *        The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *        the exception of the <b>Region deny</b> control. For information on how to find the
     *        <code>controlIdentifier</code>, see <a
     *        href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public void setControlIdentifier(String controlIdentifier) {
        this.controlIdentifier = controlIdentifier;
    }

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @return The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *         the exception of the <b>Region deny</b> control. For information on how to find the
     *         <code>controlIdentifier</code>, see <a
     *         href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public String getControlIdentifier() {
        return this.controlIdentifier;
    }

    /**
     * <p>
     * The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with the
     * exception of the <b>Region deny</b> control. For information on how to find the <code>controlIdentifier</code>,
     * see <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param controlIdentifier
     *        The ARN of the control. Only <b>Strongly recommended</b> and <b>Elective</b> controls are permitted, with
     *        the exception of the <b>Region deny</b> control. For information on how to find the
     *        <code>controlIdentifier</code>, see <a
     *        href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableControlRequest withControlIdentifier(String controlIdentifier) {
        setControlIdentifier(controlIdentifier);
        return this;
    }

    /**
     * <p>
     * Tags to be applied to the <code>EnabledControl</code> resource.
     * </p>
     * 
     * @return Tags to be applied to the <code>EnabledControl</code> resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to be applied to the <code>EnabledControl</code> resource.
     * </p>
     * 
     * @param tags
     *        Tags to be applied to the <code>EnabledControl</code> resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags to be applied to the <code>EnabledControl</code> resource.
     * </p>
     * 
     * @param tags
     *        Tags to be applied to the <code>EnabledControl</code> resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableControlRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EnableControlRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EnableControlRequest addTagsEntry(String key, String value) {
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

    public EnableControlRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *        <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     */

    public void setTargetIdentifier(String targetIdentifier) {
        this.targetIdentifier = targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @return The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *         <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview
     *         page</a>.
     */

    public String getTargetIdentifier() {
        return this.targetIdentifier;
    }

    /**
     * <p>
     * The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see <a
     * href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * </p>
     * 
     * @param targetIdentifier
     *        The ARN of the organizational unit. For information on how to find the <code>targetIdentifier</code>, see
     *        <a href="https://docs.aws.amazon.com/controltower/latest/APIReference/Welcome.html">the overview page</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableControlRequest withTargetIdentifier(String targetIdentifier) {
        setTargetIdentifier(targetIdentifier);
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
        if (getControlIdentifier() != null)
            sb.append("ControlIdentifier: ").append(getControlIdentifier()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTargetIdentifier() != null)
            sb.append("TargetIdentifier: ").append(getTargetIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableControlRequest == false)
            return false;
        EnableControlRequest other = (EnableControlRequest) obj;
        if (other.getControlIdentifier() == null ^ this.getControlIdentifier() == null)
            return false;
        if (other.getControlIdentifier() != null && other.getControlIdentifier().equals(this.getControlIdentifier()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTargetIdentifier() == null ^ this.getTargetIdentifier() == null)
            return false;
        if (other.getTargetIdentifier() != null && other.getTargetIdentifier().equals(this.getTargetIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlIdentifier() == null) ? 0 : getControlIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTargetIdentifier() == null) ? 0 : getTargetIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public EnableControlRequest clone() {
        return (EnableControlRequest) super.clone();
    }

}
