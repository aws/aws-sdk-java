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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/CreateActivity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateActivityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the activity to create. This name must be unique for your AWS account and region for 90 days. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * whitespace
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The list of tags to add to a resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the activity to create. This name must be unique for your AWS account and region for 90 days. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * whitespace
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the activity to create. This name must be unique for your AWS account and region for 90 days.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *        > Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        whitespace
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the activity to create. This name must be unique for your AWS account and region for 90 days. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * whitespace
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the activity to create. This name must be unique for your AWS account and region for 90 days.
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *         > Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.</p>
     *         <p>
     *         A name must <i>not</i> contain:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         whitespace
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         brackets <code>&lt; &gt; { } [ ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         wildcard characters <code>? *</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *         </p>
     *         </li>
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the activity to create. This name must be unique for your AWS account and region for 90 days. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions">
     * Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * whitespace
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the activity to create. This name must be unique for your AWS account and region for 90 days.
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/step-functions/latest/dg/limits.html#service-limits-state-machine-executions"
     *        > Limits Related to State Machine Executions</a> in the <i>AWS Step Functions Developer Guide</i>.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        whitespace
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivityRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The list of tags to add to a resource.
     * </p>
     * 
     * @return The list of tags to add to a resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of tags to add to a resource.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a resource.
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
     * The list of tags to add to a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivityRequest withTags(Tag... tags) {
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
     * The list of tags to add to a resource.
     * </p>
     * 
     * @param tags
     *        The list of tags to add to a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateActivityRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof CreateActivityRequest == false)
            return false;
        CreateActivityRequest other = (CreateActivityRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateActivityRequest clone() {
        return (CreateActivityRequest) super.clone();
    }

}
