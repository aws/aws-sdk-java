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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/GetRasterDataCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetRasterDataCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A description of the raster data collection.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL of the description page.
     * </p>
     */
    private String descriptionPageUrl;
    /** <p/> */
    private java.util.List<String> imageSourceBands;
    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The filters supported by the raster data collection.
     * </p>
     */
    private java.util.List<Filter> supportedFilters;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The raster data collection type.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the raster data collection.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the raster data collection.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A description of the raster data collection.
     * </p>
     * 
     * @param description
     *        A description of the raster data collection.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the raster data collection.
     * </p>
     * 
     * @return A description of the raster data collection.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the raster data collection.
     * </p>
     * 
     * @param description
     *        A description of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL of the description page.
     * </p>
     * 
     * @param descriptionPageUrl
     *        The URL of the description page.
     */

    public void setDescriptionPageUrl(String descriptionPageUrl) {
        this.descriptionPageUrl = descriptionPageUrl;
    }

    /**
     * <p>
     * The URL of the description page.
     * </p>
     * 
     * @return The URL of the description page.
     */

    public String getDescriptionPageUrl() {
        return this.descriptionPageUrl;
    }

    /**
     * <p>
     * The URL of the description page.
     * </p>
     * 
     * @param descriptionPageUrl
     *        The URL of the description page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withDescriptionPageUrl(String descriptionPageUrl) {
        setDescriptionPageUrl(descriptionPageUrl);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<String> getImageSourceBands() {
        return imageSourceBands;
    }

    /**
     * <p/>
     * 
     * @param imageSourceBands
     */

    public void setImageSourceBands(java.util.Collection<String> imageSourceBands) {
        if (imageSourceBands == null) {
            this.imageSourceBands = null;
            return;
        }

        this.imageSourceBands = new java.util.ArrayList<String>(imageSourceBands);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImageSourceBands(java.util.Collection)} or {@link #withImageSourceBands(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param imageSourceBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withImageSourceBands(String... imageSourceBands) {
        if (this.imageSourceBands == null) {
            setImageSourceBands(new java.util.ArrayList<String>(imageSourceBands.length));
        }
        for (String ele : imageSourceBands) {
            this.imageSourceBands.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param imageSourceBands
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withImageSourceBands(java.util.Collection<String> imageSourceBands) {
        setImageSourceBands(imageSourceBands);
        return this;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @param name
     *        The name of the raster data collection.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @return The name of the raster data collection.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     * 
     * @param name
     *        The name of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The filters supported by the raster data collection.
     * </p>
     * 
     * @return The filters supported by the raster data collection.
     */

    public java.util.List<Filter> getSupportedFilters() {
        return supportedFilters;
    }

    /**
     * <p>
     * The filters supported by the raster data collection.
     * </p>
     * 
     * @param supportedFilters
     *        The filters supported by the raster data collection.
     */

    public void setSupportedFilters(java.util.Collection<Filter> supportedFilters) {
        if (supportedFilters == null) {
            this.supportedFilters = null;
            return;
        }

        this.supportedFilters = new java.util.ArrayList<Filter>(supportedFilters);
    }

    /**
     * <p>
     * The filters supported by the raster data collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedFilters(java.util.Collection)} or {@link #withSupportedFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedFilters
     *        The filters supported by the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withSupportedFilters(Filter... supportedFilters) {
        if (this.supportedFilters == null) {
            setSupportedFilters(new java.util.ArrayList<Filter>(supportedFilters.length));
        }
        for (Filter ele : supportedFilters) {
            this.supportedFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The filters supported by the raster data collection.
     * </p>
     * 
     * @param supportedFilters
     *        The filters supported by the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withSupportedFilters(java.util.Collection<Filter> supportedFilters) {
        setSupportedFilters(supportedFilters);
        return this;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @return Each tag consists of a key and a value.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     * 
     * @param tags
     *        Each tag consists of a key and a value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetRasterDataCollectionResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetRasterDataCollectionResult addTagsEntry(String key, String value) {
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

    public GetRasterDataCollectionResult clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The raster data collection type.
     * </p>
     * 
     * @param type
     *        The raster data collection type.
     * @see DataCollectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The raster data collection type.
     * </p>
     * 
     * @return The raster data collection type.
     * @see DataCollectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The raster data collection type.
     * </p>
     * 
     * @param type
     *        The raster data collection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCollectionType
     */

    public GetRasterDataCollectionResult withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The raster data collection type.
     * </p>
     * 
     * @param type
     *        The raster data collection type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCollectionType
     */

    public GetRasterDataCollectionResult withType(DataCollectionType type) {
        this.type = type.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDescriptionPageUrl() != null)
            sb.append("DescriptionPageUrl: ").append(getDescriptionPageUrl()).append(",");
        if (getImageSourceBands() != null)
            sb.append("ImageSourceBands: ").append(getImageSourceBands()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSupportedFilters() != null)
            sb.append("SupportedFilters: ").append(getSupportedFilters()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRasterDataCollectionResult == false)
            return false;
        GetRasterDataCollectionResult other = (GetRasterDataCollectionResult) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDescriptionPageUrl() == null ^ this.getDescriptionPageUrl() == null)
            return false;
        if (other.getDescriptionPageUrl() != null && other.getDescriptionPageUrl().equals(this.getDescriptionPageUrl()) == false)
            return false;
        if (other.getImageSourceBands() == null ^ this.getImageSourceBands() == null)
            return false;
        if (other.getImageSourceBands() != null && other.getImageSourceBands().equals(this.getImageSourceBands()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSupportedFilters() == null ^ this.getSupportedFilters() == null)
            return false;
        if (other.getSupportedFilters() != null && other.getSupportedFilters().equals(this.getSupportedFilters()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDescriptionPageUrl() == null) ? 0 : getDescriptionPageUrl().hashCode());
        hashCode = prime * hashCode + ((getImageSourceBands() == null) ? 0 : getImageSourceBands().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSupportedFilters() == null) ? 0 : getSupportedFilters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetRasterDataCollectionResult clone() {
        try {
            return (GetRasterDataCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
