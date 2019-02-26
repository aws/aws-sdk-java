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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of <a>CreateDBClusterParameterGroup</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/CreateDBClusterParameterGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBClusterParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBClusterParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     */
    private String dBClusterParameterGroupName;
    /**
     * <p>
     * The DB cluster parameter group family name.
     * </p>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The tags to be assigned to the DB cluster parameter group.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBClusterParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing <code>DBClusterParameterGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This value is stored as a lowercase string.
     *        </p>
     */

    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBClusterParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @return The name of the DB cluster parameter group.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the name of an existing <code>DBClusterParameterGroup</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         This value is stored as a lowercase string.
     *         </p>
     */

    public String getDBClusterParameterGroupName() {
        return this.dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the name of an existing <code>DBClusterParameterGroup</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @param dBClusterParameterGroupName
     *        The name of the DB cluster parameter group.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must match the name of an existing <code>DBClusterParameterGroup</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        This value is stored as a lowercase string.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterParameterGroupRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        setDBClusterParameterGroupName(dBClusterParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The DB cluster parameter group family name.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The DB cluster parameter group family name.
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB cluster parameter group family name.
     * </p>
     * 
     * @return The DB cluster parameter group family name.
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB cluster parameter group family name.
     * </p>
     * 
     * @param dBParameterGroupFamily
     *        The DB cluster parameter group family name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     * 
     * @param description
     *        The description for the DB cluster parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     * 
     * @return The description for the DB cluster parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the DB cluster parameter group.
     * </p>
     * 
     * @param description
     *        The description for the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterParameterGroupRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster parameter group.
     * </p>
     * 
     * @return The tags to be assigned to the DB cluster parameter group.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to be assigned to the DB cluster parameter group.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the DB cluster parameter group.
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
     * The tags to be assigned to the DB cluster parameter group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterParameterGroupRequest withTags(Tag... tags) {
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
     * The tags to be assigned to the DB cluster parameter group.
     * </p>
     * 
     * @param tags
     *        The tags to be assigned to the DB cluster parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBClusterParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: ").append(getDBClusterParameterGroupName()).append(",");
        if (getDBParameterGroupFamily() != null)
            sb.append("DBParameterGroupFamily: ").append(getDBParameterGroupFamily()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateDBClusterParameterGroupRequest == false)
            return false;
        CreateDBClusterParameterGroupRequest other = (CreateDBClusterParameterGroupRequest) obj;
        if (other.getDBClusterParameterGroupName() == null ^ this.getDBClusterParameterGroupName() == null)
            return false;
        if (other.getDBClusterParameterGroupName() != null && other.getDBClusterParameterGroupName().equals(this.getDBClusterParameterGroupName()) == false)
            return false;
        if (other.getDBParameterGroupFamily() == null ^ this.getDBParameterGroupFamily() == null)
            return false;
        if (other.getDBParameterGroupFamily() != null && other.getDBParameterGroupFamily().equals(this.getDBParameterGroupFamily()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getDBClusterParameterGroupName() == null) ? 0 : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBClusterParameterGroupRequest clone() {
        return (CreateDBClusterParameterGroupRequest) super.clone();
    }

}
