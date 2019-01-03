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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/CopyDBClusterParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyDBClusterParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about
     * creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter
     * group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter
     * group ARN, for example <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBClusterParameterGroupIdentifier;
    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     */
    private String targetDBClusterParameterGroupIdentifier;
    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     */
    private String targetDBClusterParameterGroupDescription;

    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about
     * creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter
     * group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter
     * group ARN, for example <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterParameterGroupIdentifier
     *        The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information
     *        about creating an ARN, see <a
     *        href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB
     *        parameter group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster
     *        parameter group ARN, for example
     *        <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     *        </p>
     *        </li>
     */

    public void setSourceDBClusterParameterGroupIdentifier(String sourceDBClusterParameterGroupIdentifier) {
        this.sourceDBClusterParameterGroupIdentifier = sourceDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about
     * creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter
     * group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter
     * group ARN, for example <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information
     *         about creating an ARN, see <a
     *         href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *         Constructing an Amazon Resource Name (ARN)</a>. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid DB cluster parameter group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB
     *         parameter group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster
     *         parameter group ARN, for example
     *         <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     *         </p>
     *         </li>
     */

    public String getSourceDBClusterParameterGroupIdentifier() {
        return this.sourceDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information about
     * creating an ARN, see <a
     * href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     * Constructing an Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid DB cluster parameter group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB parameter
     * group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster parameter
     * group ARN, for example <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceDBClusterParameterGroupIdentifier
     *        The identifier or Amazon Resource Name (ARN) for the source DB cluster parameter group. For information
     *        about creating an ARN, see <a
     *        href="http://docs.aws.amazon.com/neptune/latest/UserGuide/tagging.ARN.html#tagging.ARN.Constructing">
     *        Constructing an Amazon Resource Name (ARN)</a>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid DB cluster parameter group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB cluster parameter group is in the same AWS Region as the copy, specify a valid DB
     *        parameter group identifier, for example <code>my-db-cluster-param-group</code>, or a valid ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source DB parameter group is in a different AWS Region than the copy, specify a valid DB cluster
     *        parameter group ARN, for example
     *        <code>arn:aws:rds:us-east-1:123456789012:cluster-pg:custom-cluster-group1</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterParameterGroupRequest withSourceDBClusterParameterGroupIdentifier(String sourceDBClusterParameterGroupIdentifier) {
        setSourceDBClusterParameterGroupIdentifier(sourceDBClusterParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     * 
     * @param targetDBClusterParameterGroupIdentifier
     *        The identifier for the copied DB cluster parameter group.</p>
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
     *        Example: <code>my-cluster-param-group1</code>
     */

    public void setTargetDBClusterParameterGroupIdentifier(String targetDBClusterParameterGroupIdentifier) {
        this.targetDBClusterParameterGroupIdentifier = targetDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     * 
     * @return The identifier for the copied DB cluster parameter group.</p>
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
     *         Example: <code>my-cluster-param-group1</code>
     */

    public String getTargetDBClusterParameterGroupIdentifier() {
        return this.targetDBClusterParameterGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied DB cluster parameter group.
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
     * Example: <code>my-cluster-param-group1</code>
     * </p>
     * 
     * @param targetDBClusterParameterGroupIdentifier
     *        The identifier for the copied DB cluster parameter group.</p>
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
     *        Example: <code>my-cluster-param-group1</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterParameterGroupRequest withTargetDBClusterParameterGroupIdentifier(String targetDBClusterParameterGroupIdentifier) {
        setTargetDBClusterParameterGroupIdentifier(targetDBClusterParameterGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     * 
     * @param targetDBClusterParameterGroupDescription
     *        A description for the copied DB cluster parameter group.
     */

    public void setTargetDBClusterParameterGroupDescription(String targetDBClusterParameterGroupDescription) {
        this.targetDBClusterParameterGroupDescription = targetDBClusterParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     * 
     * @return A description for the copied DB cluster parameter group.
     */

    public String getTargetDBClusterParameterGroupDescription() {
        return this.targetDBClusterParameterGroupDescription;
    }

    /**
     * <p>
     * A description for the copied DB cluster parameter group.
     * </p>
     * 
     * @param targetDBClusterParameterGroupDescription
     *        A description for the copied DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyDBClusterParameterGroupRequest withTargetDBClusterParameterGroupDescription(String targetDBClusterParameterGroupDescription) {
        setTargetDBClusterParameterGroupDescription(targetDBClusterParameterGroupDescription);
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

    public CopyDBClusterParameterGroupRequest withTags(Tag... tags) {
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

    public CopyDBClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceDBClusterParameterGroupIdentifier() != null)
            sb.append("SourceDBClusterParameterGroupIdentifier: ").append(getSourceDBClusterParameterGroupIdentifier()).append(",");
        if (getTargetDBClusterParameterGroupIdentifier() != null)
            sb.append("TargetDBClusterParameterGroupIdentifier: ").append(getTargetDBClusterParameterGroupIdentifier()).append(",");
        if (getTargetDBClusterParameterGroupDescription() != null)
            sb.append("TargetDBClusterParameterGroupDescription: ").append(getTargetDBClusterParameterGroupDescription()).append(",");
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

        if (obj instanceof CopyDBClusterParameterGroupRequest == false)
            return false;
        CopyDBClusterParameterGroupRequest other = (CopyDBClusterParameterGroupRequest) obj;
        if (other.getSourceDBClusterParameterGroupIdentifier() == null ^ this.getSourceDBClusterParameterGroupIdentifier() == null)
            return false;
        if (other.getSourceDBClusterParameterGroupIdentifier() != null
                && other.getSourceDBClusterParameterGroupIdentifier().equals(this.getSourceDBClusterParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterParameterGroupIdentifier() == null ^ this.getTargetDBClusterParameterGroupIdentifier() == null)
            return false;
        if (other.getTargetDBClusterParameterGroupIdentifier() != null
                && other.getTargetDBClusterParameterGroupIdentifier().equals(this.getTargetDBClusterParameterGroupIdentifier()) == false)
            return false;
        if (other.getTargetDBClusterParameterGroupDescription() == null ^ this.getTargetDBClusterParameterGroupDescription() == null)
            return false;
        if (other.getTargetDBClusterParameterGroupDescription() != null
                && other.getTargetDBClusterParameterGroupDescription().equals(this.getTargetDBClusterParameterGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getSourceDBClusterParameterGroupIdentifier() == null) ? 0 : getSourceDBClusterParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBClusterParameterGroupIdentifier() == null) ? 0 : getTargetDBClusterParameterGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetDBClusterParameterGroupDescription() == null) ? 0 : getTargetDBClusterParameterGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyDBClusterParameterGroupRequest clone() {
        return (CopyDBClusterParameterGroupRequest) super.clone();
    }

}
