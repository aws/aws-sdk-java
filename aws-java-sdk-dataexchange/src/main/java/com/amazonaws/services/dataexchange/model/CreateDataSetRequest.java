/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for CreateDataSet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/CreateDataSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDataSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     */
    private String assetType;
    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters long.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the data set.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @see AssetType
     */

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @return The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @see AssetType
     */

    public String getAssetType() {
        return this.assetType;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public CreateDataSetRequest withAssetType(String assetType) {
        setAssetType(assetType);
        return this;
    }

    /**
     * <p>
     * The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * </p>
     * 
     * @param assetType
     *        The type of file your data is stored in. Currently, the supported asset type is S3_SNAPSHOT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetType
     */

    public CreateDataSetRequest withAssetType(AssetType assetType) {
        this.assetType = assetType.toString();
        return this;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters long.
     * </p>
     * 
     * @param description
     *        A description for the data set. This value can be up to 16,348 characters long.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters long.
     * </p>
     * 
     * @return A description for the data set. This value can be up to 16,348 characters long.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the data set. This value can be up to 16,348 characters long.
     * </p>
     * 
     * @param description
     *        A description for the data set. This value can be up to 16,348 characters long.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @return The name of the data set.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data set.
     * </p>
     * 
     * @param name
     *        The name of the data set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @return A data set tag is an optional label that you can assign to a data set when you create it. Each tag
     *         consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *         tag-based access control in IAM policies to control access to these data sets and revisions.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @param tags
     *        A data set tag is an optional label that you can assign to a data set when you create it. Each tag
     *        consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *        tag-based access control in IAM policies to control access to these data sets and revisions.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A data set tag is an optional label that you can assign to a data set when you create it. Each tag consists of a
     * key and an optional value, both of which you define. When you use tagging, you can also use tag-based access
     * control in IAM policies to control access to these data sets and revisions.
     * </p>
     * 
     * @param tags
     *        A data set tag is an optional label that you can assign to a data set when you create it. Each tag
     *        consists of a key and an optional value, both of which you define. When you use tagging, you can also use
     *        tag-based access control in IAM policies to control access to these data sets and revisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateDataSetRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDataSetRequest addTagsEntry(String key, String value) {
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

    public CreateDataSetRequest clearTagsEntries() {
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
        if (getAssetType() != null)
            sb.append("AssetType: ").append(getAssetType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateDataSetRequest == false)
            return false;
        CreateDataSetRequest other = (CreateDataSetRequest) obj;
        if (other.getAssetType() == null ^ this.getAssetType() == null)
            return false;
        if (other.getAssetType() != null && other.getAssetType().equals(this.getAssetType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getAssetType() == null) ? 0 : getAssetType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSetRequest clone() {
        return (CreateDataSetRequest) super.clone();
    }

}
