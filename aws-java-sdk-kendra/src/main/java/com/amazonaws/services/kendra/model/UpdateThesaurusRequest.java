/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kendra.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kendra-2019-02-03/UpdateThesaurus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThesaurusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the thesaurus to update.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The updated name of the thesaurus.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The identifier of the index associated with the thesaurus to update.
     * </p>
     */
    private String indexId;
    /**
     * <p>
     * The updated description of the thesaurus.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The updated role ARN of the thesaurus.
     * </p>
     */
    private String roleArn;

    private S3Path sourceS3Path;

    /**
     * <p>
     * The identifier of the thesaurus to update.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus to update.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the thesaurus to update.
     * </p>
     * 
     * @return The identifier of the thesaurus to update.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the thesaurus to update.
     * </p>
     * 
     * @param id
     *        The identifier of the thesaurus to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The updated name of the thesaurus.
     * </p>
     * 
     * @param name
     *        The updated name of the thesaurus.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The updated name of the thesaurus.
     * </p>
     * 
     * @return The updated name of the thesaurus.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The updated name of the thesaurus.
     * </p>
     * 
     * @param name
     *        The updated name of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to update.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index associated with the thesaurus to update.
     */

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to update.
     * </p>
     * 
     * @return The identifier of the index associated with the thesaurus to update.
     */

    public String getIndexId() {
        return this.indexId;
    }

    /**
     * <p>
     * The identifier of the index associated with the thesaurus to update.
     * </p>
     * 
     * @param indexId
     *        The identifier of the index associated with the thesaurus to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withIndexId(String indexId) {
        setIndexId(indexId);
        return this;
    }

    /**
     * <p>
     * The updated description of the thesaurus.
     * </p>
     * 
     * @param description
     *        The updated description of the thesaurus.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The updated description of the thesaurus.
     * </p>
     * 
     * @return The updated description of the thesaurus.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The updated description of the thesaurus.
     * </p>
     * 
     * @param description
     *        The updated description of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The updated role ARN of the thesaurus.
     * </p>
     * 
     * @param roleArn
     *        The updated role ARN of the thesaurus.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The updated role ARN of the thesaurus.
     * </p>
     * 
     * @return The updated role ARN of the thesaurus.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The updated role ARN of the thesaurus.
     * </p>
     * 
     * @param roleArn
     *        The updated role ARN of the thesaurus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * @param sourceS3Path
     */

    public void setSourceS3Path(S3Path sourceS3Path) {
        this.sourceS3Path = sourceS3Path;
    }

    /**
     * @return
     */

    public S3Path getSourceS3Path() {
        return this.sourceS3Path;
    }

    /**
     * @param sourceS3Path
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThesaurusRequest withSourceS3Path(S3Path sourceS3Path) {
        setSourceS3Path(sourceS3Path);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getIndexId() != null)
            sb.append("IndexId: ").append(getIndexId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getSourceS3Path() != null)
            sb.append("SourceS3Path: ").append(getSourceS3Path());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThesaurusRequest == false)
            return false;
        UpdateThesaurusRequest other = (UpdateThesaurusRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getIndexId() == null ^ this.getIndexId() == null)
            return false;
        if (other.getIndexId() != null && other.getIndexId().equals(this.getIndexId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getSourceS3Path() == null ^ this.getSourceS3Path() == null)
            return false;
        if (other.getSourceS3Path() != null && other.getSourceS3Path().equals(this.getSourceS3Path()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Path() == null) ? 0 : getSourceS3Path().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThesaurusRequest clone() {
        return (UpdateThesaurusRequest) super.clone();
    }

}
