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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBParameterGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBParameterGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DB parameter group.
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
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter
     * group family, and can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     */
    private String dBParameterGroupFamily;
    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     */
    private String description;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for CreateDBParameterGroupRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public CreateDBParameterGroupRequest() {
    }

    /**
     * Constructs a new CreateDBParameterGroupRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        This value is stored as a lowercase string.
     *        </p>
     * @param dBParameterGroupFamily
     *        The DB parameter group family name. A DB parameter group can be associated with one and only one DB
     *        parameter group family, and can be applied only to a DB instance running a database engine and engine
     *        version compatible with that DB parameter group family.</p>
     *        <p>
     *        To list all of the available parameter group families, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *        </p>
     *        <note>
     *        <p>
     *        The output contains duplicates.
     *        </p>
     * @param description
     *        The description for the DB parameter group.
     */
    public CreateDBParameterGroupRequest(String dBParameterGroupName, String dBParameterGroupFamily, String description) {
        setDBParameterGroupName(dBParameterGroupName);
        setDBParameterGroupFamily(dBParameterGroupFamily);
        setDescription(description);
    }

    /**
     * <p>
     * The name of the DB parameter group.
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
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        This value is stored as a lowercase string.
     *        </p>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
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
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @return The name of the DB parameter group.</p>
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
     *         </ul>
     *         <note>
     *         <p>
     *         This value is stored as a lowercase string.
     *         </p>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group.
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
     * </ul>
     * <note>
     * <p>
     * This value is stored as a lowercase string.
     * </p>
     * </note>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group.</p>
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
     *        </ul>
     *        <note>
     *        <p>
     *        This value is stored as a lowercase string.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBParameterGroupRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter
     * group family, and can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     * 
     * @param dBParameterGroupFamily
     *        The DB parameter group family name. A DB parameter group can be associated with one and only one DB
     *        parameter group family, and can be applied only to a DB instance running a database engine and engine
     *        version compatible with that DB parameter group family.</p>
     *        <p>
     *        To list all of the available parameter group families, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *        </p>
     *        <note>
     *        <p>
     *        The output contains duplicates.
     *        </p>
     */

    public void setDBParameterGroupFamily(String dBParameterGroupFamily) {
        this.dBParameterGroupFamily = dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter
     * group family, and can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     * 
     * @return The DB parameter group family name. A DB parameter group can be associated with one and only one DB
     *         parameter group family, and can be applied only to a DB instance running a database engine and engine
     *         version compatible with that DB parameter group family.</p>
     *         <p>
     *         To list all of the available parameter group families, use the following command:
     *         </p>
     *         <p>
     *         <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *         </p>
     *         <note>
     *         <p>
     *         The output contains duplicates.
     *         </p>
     */

    public String getDBParameterGroupFamily() {
        return this.dBParameterGroupFamily;
    }

    /**
     * <p>
     * The DB parameter group family name. A DB parameter group can be associated with one and only one DB parameter
     * group family, and can be applied only to a DB instance running a database engine and engine version compatible
     * with that DB parameter group family.
     * </p>
     * <p>
     * To list all of the available parameter group families, use the following command:
     * </p>
     * <p>
     * <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     * </p>
     * <note>
     * <p>
     * The output contains duplicates.
     * </p>
     * </note>
     * 
     * @param dBParameterGroupFamily
     *        The DB parameter group family name. A DB parameter group can be associated with one and only one DB
     *        parameter group family, and can be applied only to a DB instance running a database engine and engine
     *        version compatible with that DB parameter group family.</p>
     *        <p>
     *        To list all of the available parameter group families, use the following command:
     *        </p>
     *        <p>
     *        <code>aws rds describe-db-engine-versions --query "DBEngineVersions[].DBParameterGroupFamily"</code>
     *        </p>
     *        <note>
     *        <p>
     *        The output contains duplicates.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBParameterGroupRequest withDBParameterGroupFamily(String dBParameterGroupFamily) {
        setDBParameterGroupFamily(dBParameterGroupFamily);
        return this;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     * 
     * @param description
     *        The description for the DB parameter group.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     * 
     * @return The description for the DB parameter group.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description for the DB parameter group.
     * </p>
     * 
     * @param description
     *        The description for the DB parameter group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBParameterGroupRequest withDescription(String description) {
        setDescription(description);
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

    public CreateDBParameterGroupRequest withTags(Tag... tags) {
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

    public CreateDBParameterGroupRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
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

        if (obj instanceof CreateDBParameterGroupRequest == false)
            return false;
        CreateDBParameterGroupRequest other = (CreateDBParameterGroupRequest) obj;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
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

        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupFamily() == null) ? 0 : getDBParameterGroupFamily().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBParameterGroupRequest clone() {
        return (CreateDBParameterGroupRequest) super.clone();
    }

}
