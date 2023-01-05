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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Response object containing details for a specific RasterDataCollection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/RasterDataCollectionMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RasterDataCollectionMetadata implements Serializable, Cloneable, StructuredPojo {

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
     * The description URL of the raster data collection.
     * </p>
     */
    private String descriptionPageUrl;
    /**
     * <p>
     * The name of the raster data collection.
     * </p>
     */
    private String name;
    /** <p/> */
    private java.util.List<Filter> supportedFilters;
    /**
     * <p>
     * Each tag consists of a key and a value.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The type of raster data collection.
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

    public RasterDataCollectionMetadata withArn(String arn) {
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

    public RasterDataCollectionMetadata withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The description URL of the raster data collection.
     * </p>
     * 
     * @param descriptionPageUrl
     *        The description URL of the raster data collection.
     */

    public void setDescriptionPageUrl(String descriptionPageUrl) {
        this.descriptionPageUrl = descriptionPageUrl;
    }

    /**
     * <p>
     * The description URL of the raster data collection.
     * </p>
     * 
     * @return The description URL of the raster data collection.
     */

    public String getDescriptionPageUrl() {
        return this.descriptionPageUrl;
    }

    /**
     * <p>
     * The description URL of the raster data collection.
     * </p>
     * 
     * @param descriptionPageUrl
     *        The description URL of the raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionMetadata withDescriptionPageUrl(String descriptionPageUrl) {
        setDescriptionPageUrl(descriptionPageUrl);
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

    public RasterDataCollectionMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<Filter> getSupportedFilters() {
        return supportedFilters;
    }

    /**
     * <p/>
     * 
     * @param supportedFilters
     */

    public void setSupportedFilters(java.util.Collection<Filter> supportedFilters) {
        if (supportedFilters == null) {
            this.supportedFilters = null;
            return;
        }

        this.supportedFilters = new java.util.ArrayList<Filter>(supportedFilters);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedFilters(java.util.Collection)} or {@link #withSupportedFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param supportedFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionMetadata withSupportedFilters(Filter... supportedFilters) {
        if (this.supportedFilters == null) {
            setSupportedFilters(new java.util.ArrayList<Filter>(supportedFilters.length));
        }
        for (Filter ele : supportedFilters) {
            this.supportedFilters.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param supportedFilters
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionMetadata withSupportedFilters(java.util.Collection<Filter> supportedFilters) {
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

    public RasterDataCollectionMetadata withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see RasterDataCollectionMetadata#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RasterDataCollectionMetadata addTagsEntry(String key, String value) {
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

    public RasterDataCollectionMetadata clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The type of raster data collection.
     * </p>
     * 
     * @param type
     *        The type of raster data collection.
     * @see DataCollectionType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of raster data collection.
     * </p>
     * 
     * @return The type of raster data collection.
     * @see DataCollectionType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of raster data collection.
     * </p>
     * 
     * @param type
     *        The type of raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCollectionType
     */

    public RasterDataCollectionMetadata withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of raster data collection.
     * </p>
     * 
     * @param type
     *        The type of raster data collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataCollectionType
     */

    public RasterDataCollectionMetadata withType(DataCollectionType type) {
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

        if (obj instanceof RasterDataCollectionMetadata == false)
            return false;
        RasterDataCollectionMetadata other = (RasterDataCollectionMetadata) obj;
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
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSupportedFilters() == null) ? 0 : getSupportedFilters().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public RasterDataCollectionMetadata clone() {
        try {
            return (RasterDataCollectionMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.RasterDataCollectionMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
