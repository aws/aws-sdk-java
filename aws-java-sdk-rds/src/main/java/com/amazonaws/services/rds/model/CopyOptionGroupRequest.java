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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CopyOptionGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyOptionGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for
     * example <code>my-option-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for
     * example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceOptionGroupIdentifier;
    /**
     * <p>
     * The identifier for the copied option group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
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
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-option-group</code>
     * </p>
     */
    private String targetOptionGroupIdentifier;
    /**
     * <p>
     * The description for the copied option group.
     * </p>
     */
    private String targetOptionGroupDescription;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for
     * example <code>my-option-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for
     * example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceOptionGroupIdentifier
     *        The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid option group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source option group is in the same AWS Region as the copy, specify a valid option group identifier,
     *        for example <code>my-option-group</code>, or a valid ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source option group is in a different AWS Region than the copy, specify a valid option group ARN,
     *        for example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     *        </p>
     *        </li>
     */

    public void setSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        this.sourceOptionGroupIdentifier = sourceOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for
     * example <code>my-option-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for
     * example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must specify a valid option group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source option group is in the same AWS Region as the copy, specify a valid option group
     *         identifier, for example <code>my-option-group</code>, or a valid ARN.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the source option group is in a different AWS Region than the copy, specify a valid option group ARN,
     *         for example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     *         </p>
     *         </li>
     */

    public String getSourceOptionGroupIdentifier() {
        return this.sourceOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing">
     * Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must specify a valid option group.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in the same AWS Region as the copy, specify a valid option group identifier, for
     * example <code>my-option-group</code>, or a valid ARN.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the source option group is in a different AWS Region than the copy, specify a valid option group ARN, for
     * example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param sourceOptionGroupIdentifier
     *        The identifier or ARN for the source option group. For information about creating an ARN, see <a href=
     *        "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *        > Constructing an ARN for Amazon RDS</a> in the <i>Amazon RDS User Guide</i>. </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must specify a valid option group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source option group is in the same AWS Region as the copy, specify a valid option group identifier,
     *        for example <code>my-option-group</code>, or a valid ARN.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If the source option group is in a different AWS Region than the copy, specify a valid option group ARN,
     *        for example <code>arn:aws:rds:us-west-2:123456789012:og:special-options</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyOptionGroupRequest withSourceOptionGroupIdentifier(String sourceOptionGroupIdentifier) {
        setSourceOptionGroupIdentifier(sourceOptionGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The identifier for the copied option group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
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
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-option-group</code>
     * </p>
     * 
     * @param targetOptionGroupIdentifier
     *        The identifier for the copied option group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be null, empty, or blank
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
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-option-group</code>
     */

    public void setTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        this.targetOptionGroupIdentifier = targetOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied option group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
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
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-option-group</code>
     * </p>
     * 
     * @return The identifier for the copied option group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be null, empty, or blank
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
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-option-group</code>
     */

    public String getTargetOptionGroupIdentifier() {
        return this.targetOptionGroupIdentifier;
    }

    /**
     * <p>
     * The identifier for the copied option group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be null, empty, or blank
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
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-option-group</code>
     * </p>
     * 
     * @param targetOptionGroupIdentifier
     *        The identifier for the copied option group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Can't be null, empty, or blank
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
     *        Can't end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>my-option-group</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyOptionGroupRequest withTargetOptionGroupIdentifier(String targetOptionGroupIdentifier) {
        setTargetOptionGroupIdentifier(targetOptionGroupIdentifier);
        return this;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     * 
     * @param targetOptionGroupDescription
     *        The description for the copied option group.
     */

    public void setTargetOptionGroupDescription(String targetOptionGroupDescription) {
        this.targetOptionGroupDescription = targetOptionGroupDescription;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     * 
     * @return The description for the copied option group.
     */

    public String getTargetOptionGroupDescription() {
        return this.targetOptionGroupDescription;
    }

    /**
     * <p>
     * The description for the copied option group.
     * </p>
     * 
     * @param targetOptionGroupDescription
     *        The description for the copied option group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyOptionGroupRequest withTargetOptionGroupDescription(String targetOptionGroupDescription) {
        setTargetOptionGroupDescription(targetOptionGroupDescription);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
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

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
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

    public CopyOptionGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
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

    public CopyOptionGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getSourceOptionGroupIdentifier() != null)
            sb.append("SourceOptionGroupIdentifier: ").append(getSourceOptionGroupIdentifier()).append(",");
        if (getTargetOptionGroupIdentifier() != null)
            sb.append("TargetOptionGroupIdentifier: ").append(getTargetOptionGroupIdentifier()).append(",");
        if (getTargetOptionGroupDescription() != null)
            sb.append("TargetOptionGroupDescription: ").append(getTargetOptionGroupDescription()).append(",");
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

        if (obj instanceof CopyOptionGroupRequest == false)
            return false;
        CopyOptionGroupRequest other = (CopyOptionGroupRequest) obj;
        if (other.getSourceOptionGroupIdentifier() == null ^ this.getSourceOptionGroupIdentifier() == null)
            return false;
        if (other.getSourceOptionGroupIdentifier() != null && other.getSourceOptionGroupIdentifier().equals(this.getSourceOptionGroupIdentifier()) == false)
            return false;
        if (other.getTargetOptionGroupIdentifier() == null ^ this.getTargetOptionGroupIdentifier() == null)
            return false;
        if (other.getTargetOptionGroupIdentifier() != null && other.getTargetOptionGroupIdentifier().equals(this.getTargetOptionGroupIdentifier()) == false)
            return false;
        if (other.getTargetOptionGroupDescription() == null ^ this.getTargetOptionGroupDescription() == null)
            return false;
        if (other.getTargetOptionGroupDescription() != null && other.getTargetOptionGroupDescription().equals(this.getTargetOptionGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getSourceOptionGroupIdentifier() == null) ? 0 : getSourceOptionGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetOptionGroupIdentifier() == null) ? 0 : getTargetOptionGroupIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTargetOptionGroupDescription() == null) ? 0 : getTargetOptionGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CopyOptionGroupRequest clone() {
        return (CopyOptionGroupRequest) super.clone();
    }

}
