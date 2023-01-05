/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateAppBlock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppBlockRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app block.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the app block.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the app block. This is not displayed to the user.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     */
    private S3Location sourceS3Location;
    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     */
    private ScriptDetails setupScriptDetails;
    /**
     * <p>
     * The tags assigned to the app block.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @param name
     *        The name of the app block.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @return The name of the app block.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app block.
     * </p>
     * 
     * @param name
     *        The name of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @param description
     *        The description of the app block.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @return The description of the app block.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the app block.
     * </p>
     * 
     * @param description
     *        The description of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the app block. This is not displayed to the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block. This is not displayed to the user.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the app block. This is not displayed to the user.
     * </p>
     * 
     * @return The display name of the app block. This is not displayed to the user.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the app block. This is not displayed to the user.
     * </p>
     * 
     * @param displayName
     *        The display name of the app block. This is not displayed to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @param sourceS3Location
     *        The source S3 location of the app block.
     */

    public void setSourceS3Location(S3Location sourceS3Location) {
        this.sourceS3Location = sourceS3Location;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @return The source S3 location of the app block.
     */

    public S3Location getSourceS3Location() {
        return this.sourceS3Location;
    }

    /**
     * <p>
     * The source S3 location of the app block.
     * </p>
     * 
     * @param sourceS3Location
     *        The source S3 location of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withSourceS3Location(S3Location sourceS3Location) {
        setSourceS3Location(sourceS3Location);
        return this;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * 
     * @param setupScriptDetails
     *        The setup script details of the app block.
     */

    public void setSetupScriptDetails(ScriptDetails setupScriptDetails) {
        this.setupScriptDetails = setupScriptDetails;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * 
     * @return The setup script details of the app block.
     */

    public ScriptDetails getSetupScriptDetails() {
        return this.setupScriptDetails;
    }

    /**
     * <p>
     * The setup script details of the app block.
     * </p>
     * 
     * @param setupScriptDetails
     *        The setup script details of the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withSetupScriptDetails(ScriptDetails setupScriptDetails) {
        setSetupScriptDetails(setupScriptDetails);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the app block.
     * </p>
     * 
     * @return The tags assigned to the app block.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the app block.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the app block.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags assigned to the app block.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the app block.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAppBlockRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppBlockRequest addTagsEntry(String key, String value) {
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

    public CreateAppBlockRequest clearTagsEntries() {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getSourceS3Location() != null)
            sb.append("SourceS3Location: ").append(getSourceS3Location()).append(",");
        if (getSetupScriptDetails() != null)
            sb.append("SetupScriptDetails: ").append(getSetupScriptDetails()).append(",");
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

        if (obj instanceof CreateAppBlockRequest == false)
            return false;
        CreateAppBlockRequest other = (CreateAppBlockRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getSourceS3Location() == null ^ this.getSourceS3Location() == null)
            return false;
        if (other.getSourceS3Location() != null && other.getSourceS3Location().equals(this.getSourceS3Location()) == false)
            return false;
        if (other.getSetupScriptDetails() == null ^ this.getSetupScriptDetails() == null)
            return false;
        if (other.getSetupScriptDetails() != null && other.getSetupScriptDetails().equals(this.getSetupScriptDetails()) == false)
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
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getSourceS3Location() == null) ? 0 : getSourceS3Location().hashCode());
        hashCode = prime * hashCode + ((getSetupScriptDetails() == null) ? 0 : getSetupScriptDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppBlockRequest clone() {
        return (CreateAppBlockRequest) super.clone();
    }

}
