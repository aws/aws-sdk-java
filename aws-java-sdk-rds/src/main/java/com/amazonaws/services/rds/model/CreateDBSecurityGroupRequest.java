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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBSecurityGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBSecurityGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     */
    private String dBSecurityGroupName;
    /**
     * <p>
     * The description for the DB security group.
     * </p>
     */
    private String dBSecurityGroupDescription;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateDBSecurityGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateDBSecurityGroupRequest() {
    }

    /**
     * Constructs a new CreateDBSecurityGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dBSecurityGroupName
     *        The name for the DB security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
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
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     * @param dBSecurityGroupDescription
     *        The description for the DB security group.
     */
    public CreateDBSecurityGroupRequest(String dBSecurityGroupName, String dBSecurityGroupDescription) {
        setDBSecurityGroupName(dBSecurityGroupName);
        setDBSecurityGroupDescription(dBSecurityGroupDescription);
    }

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name for the DB security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
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
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     */

    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @return The name for the DB security group. This value is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
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
     *         <li>
     *         <p>
     *         Must not be "Default"
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mysecuritygroup</code>
     */

    public String getDBSecurityGroupName() {
        return this.dBSecurityGroupName;
    }

    /**
     * <p>
     * The name for the DB security group. This value is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * <li>
     * <p>
     * Must not be "Default"
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mysecuritygroup</code>
     * </p>
     * 
     * @param dBSecurityGroupName
     *        The name for the DB security group. This value is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 letters, numbers, or hyphens.
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
     *        <li>
     *        <p>
     *        Must not be "Default"
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mysecuritygroup</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBSecurityGroupRequest withDBSecurityGroupName(String dBSecurityGroupName) {
        setDBSecurityGroupName(dBSecurityGroupName);
        return this;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupDescription
     *        The description for the DB security group.
     */

    public void setDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        this.dBSecurityGroupDescription = dBSecurityGroupDescription;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     * 
     * @return The description for the DB security group.
     */

    public String getDBSecurityGroupDescription() {
        return this.dBSecurityGroupDescription;
    }

    /**
     * <p>
     * The description for the DB security group.
     * </p>
     * 
     * @param dBSecurityGroupDescription
     *        The description for the DB security group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBSecurityGroupRequest withDBSecurityGroupDescription(String dBSecurityGroupDescription) {
        setDBSecurityGroupDescription(dBSecurityGroupDescription);
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

    public CreateDBSecurityGroupRequest withTags(Tag... tags) {
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

    public CreateDBSecurityGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBSecurityGroupName() != null)
            sb.append("DBSecurityGroupName: ").append(getDBSecurityGroupName()).append(",");
        if (getDBSecurityGroupDescription() != null)
            sb.append("DBSecurityGroupDescription: ").append(getDBSecurityGroupDescription()).append(",");
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

        if (obj instanceof CreateDBSecurityGroupRequest == false)
            return false;
        CreateDBSecurityGroupRequest other = (CreateDBSecurityGroupRequest) obj;
        if (other.getDBSecurityGroupName() == null ^ this.getDBSecurityGroupName() == null)
            return false;
        if (other.getDBSecurityGroupName() != null && other.getDBSecurityGroupName().equals(this.getDBSecurityGroupName()) == false)
            return false;
        if (other.getDBSecurityGroupDescription() == null ^ this.getDBSecurityGroupDescription() == null)
            return false;
        if (other.getDBSecurityGroupDescription() != null && other.getDBSecurityGroupDescription().equals(this.getDBSecurityGroupDescription()) == false)
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

        hashCode = prime * hashCode + ((getDBSecurityGroupName() == null) ? 0 : getDBSecurityGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroupDescription() == null) ? 0 : getDBSecurityGroupDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBSecurityGroupRequest clone() {
        return (CreateDBSecurityGroupRequest) super.clone();
    }

}
