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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBParameterGroupIdentifier;
    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     */
    private String targetDBParameterGroupIdentifier;
    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     */
    private String targetDBParameterGroupDescription;

    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBParameterGroupIdentifier
     *        The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     *        href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid DB parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid
     *        ARN.
     *        </p>
     *        </li>
     */

    public void setSourceDBParameterGroupIdentifier(String sourceDBParameterGroupIdentifier) {
        this.sourceDBParameterGroupIdentifier = sourceDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     *         href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *         Constructing an Amazon Resource Name (ARN)</a>. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid DB parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a
     *         valid ARN.
     *         </p>
     *         </li>
     */

    public String getSourceDBParameterGroupIdentifier() {
        return this.sourceDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBParameterGroupIdentifier
     *        The identifier or ARN for the source DB parameter group. For information about creating an ARN, see <a
     *        href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid DB parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must specify a valid DB parameter group identifier, for example <code>my-db-param-group</code>, or a valid
     *        ARN.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBParameterGroupRequest withSourceDBParameterGroupIdentifier(String sourceDBParameterGroupIdentifier) {
        setSourceDBParameterGroupIdentifier(sourceDBParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     * 
     * @param targetDBParameterGroupIdentifier
     *        The identifier for the copied DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-db-parameter-group</code>
     */

    public void setTargetDBParameterGroupIdentifier(String targetDBParameterGroupIdentifier) {
        this.targetDBParameterGroupIdentifier = targetDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     * 
     * @return The identifier for the copied DB parameter group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot be null, empty, or blank
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must contain from 1 to 255 letters, numbers, or hyphens
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-db-parameter-group</code>
     */

    public String getTargetDBParameterGroupIdentifier() {
        return this.targetDBParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be null, empty, or blank
     * </p>
     * </li>
     * <li>
     * <p>
     * Must contain from 1 to 255 letters, numbers, or hyphens
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-db-parameter-group</code>
     * </p>
     * 
     * @param targetDBParameterGroupIdentifier
     *        The identifier for the copied DB parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be null, empty, or blank
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must contain from 1 to 255 letters, numbers, or hyphens
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-db-parameter-group</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBParameterGroupRequest withTargetDBParameterGroupIdentifier(String targetDBParameterGroupIdentifier) {
        setTargetDBParameterGroupIdentifier(targetDBParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     * 
     * @param targetDBParameterGroupDescription
     *        A description for the copied DB parameter group.
     */

    public void setTargetDBParameterGroupDescription(String targetDBParameterGroupDescription) {
        this.targetDBParameterGroupDescription = targetDBParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     * 
     * @return A description for the copied DB parameter group.
     */

    public String getTargetDBParameterGroupDescription() {
        return this.targetDBParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB parameter group.
     * </p>
     * 
     * @param targetDBParameterGroupDescription
     *        A description for the copied DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBParameterGroupRequest withTargetDBParameterGroupDescription(String targetDBParameterGroupDescription) {
        setTargetDBParameterGroupDescription(targetDBParameterGroupDescription);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
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
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBParameterGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceDBParameterGroupIdentifier() != null)
            sb.append("SourceDBParameterGroupIdentifier: ").append(getSourceDBParameterGroupIdentifier()).append(",");
        if (getTargetDBParameterGroupIdentifier() != null)
            sb.append("TargetDBParameterGroupIdentifier: ").append(getTargetDBParameterGroupIdentifier()).append(",");
        if (getTargetDBParameterGroupDescription() != null)
            sb.append("TargetDBParameterGroupDescription: ").append(getTargetDBParameterGroupDescription()).append(",");
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

        if (obj instanceof CopyDBParameterGroupRequest == false)
            return false;
        CopyDBParameterGroupRequest other = (CopyDBParameterGroupRequest) obj;
        if (other.getSourceDBParameterGroupIdentifier() == null ^ this.getSourceDBParameterGroupIdentifier() == null)
            return false;
        if (other.getSourceDBParameterGroupIdentifier() != null
                && other.getSourceDBParameterGroupIdentifier().equals(this.getSourceDBParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBParameterGroupIdentifier() == null ^ this.getTargetDBParameterGroupIdentifier() == null)
            return false;
        if (other.getTargetDBParameterGroupIdentifier() != null
                && other.getTargetDBParameterGroupIdentifier().equals(this.getTargetDBParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBParameterGroupDescription() == null ^ this.getTargetDBParameterGroupDescription() == null)
            return false;
        if (other.getTargetDBParameterGroupDescription() != null
                && other.getTargetDBParameterGroupDescription().equals(this.getTargetDBParameterGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getSourceDBParameterGroupIdentifier() == null) ? 0 : getSourceDBParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBParameterGroupIdentifier() == null) ? 0 : getTargetDBParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBParameterGroupDescription() == null) ? 0 : getTargetDBParameterGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBParameterGroupRequest clone() {
        return (CopyDBParameterGroupRequest) super.clone();
    }

}
