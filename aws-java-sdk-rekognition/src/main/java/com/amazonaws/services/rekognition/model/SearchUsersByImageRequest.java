/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchUsersByImageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     */
    private String collectionId;

    private Image image;
    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default value is 80.
     * </p>
     */
    private Float userMatchThreshold;
    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     */
    private Integer maxUsers;
    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. The default value is NONE.
     * </p>
     */
    private String qualityFilter;

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID.
     */

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @return The ID of an existing collection containing the UserID.
     */

    public String getCollectionId() {
        return this.collectionId;
    }

    /**
     * <p>
     * The ID of an existing collection containing the UserID.
     * </p>
     * 
     * @param collectionId
     *        The ID of an existing collection containing the UserID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageRequest withCollectionId(String collectionId) {
        setCollectionId(collectionId);
        return this;
    }

    /**
     * @param image
     */

    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return
     */

    public Image getImage() {
        return this.image;
    }

    /**
     * @param image
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageRequest withImage(Image image) {
        setImage(image);
        return this;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default value is 80.
     * </p>
     * 
     * @param userMatchThreshold
     *        Specifies the minimum confidence in the UserID match to return. Default value is 80.
     */

    public void setUserMatchThreshold(Float userMatchThreshold) {
        this.userMatchThreshold = userMatchThreshold;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default value is 80.
     * </p>
     * 
     * @return Specifies the minimum confidence in the UserID match to return. Default value is 80.
     */

    public Float getUserMatchThreshold() {
        return this.userMatchThreshold;
    }

    /**
     * <p>
     * Specifies the minimum confidence in the UserID match to return. Default value is 80.
     * </p>
     * 
     * @param userMatchThreshold
     *        Specifies the minimum confidence in the UserID match to return. Default value is 80.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageRequest withUserMatchThreshold(Float userMatchThreshold) {
        setUserMatchThreshold(userMatchThreshold);
        return this;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * 
     * @param maxUsers
     *        Maximum number of UserIDs to return.
     */

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * 
     * @return Maximum number of UserIDs to return.
     */

    public Integer getMaxUsers() {
        return this.maxUsers;
    }

    /**
     * <p>
     * Maximum number of UserIDs to return.
     * </p>
     * 
     * @param maxUsers
     *        Maximum number of UserIDs to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchUsersByImageRequest withMaxUsers(Integer maxUsers) {
        setMaxUsers(maxUsers);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. The default value is NONE.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. The default value is NONE.
     * @see QualityFilter
     */

    public void setQualityFilter(String qualityFilter) {
        this.qualityFilter = qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. The default value is NONE.
     * </p>
     * 
     * @return A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *         aren't searched for in the collection. The default value is NONE.
     * @see QualityFilter
     */

    public String getQualityFilter() {
        return this.qualityFilter;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. The default value is NONE.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. The default value is NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public SearchUsersByImageRequest withQualityFilter(String qualityFilter) {
        setQualityFilter(qualityFilter);
        return this;
    }

    /**
     * <p>
     * A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces aren't
     * searched for in the collection. The default value is NONE.
     * </p>
     * 
     * @param qualityFilter
     *        A filter that specifies a quality bar for how much filtering is done to identify faces. Filtered faces
     *        aren't searched for in the collection. The default value is NONE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QualityFilter
     */

    public SearchUsersByImageRequest withQualityFilter(QualityFilter qualityFilter) {
        this.qualityFilter = qualityFilter.toString();
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
        if (getCollectionId() != null)
            sb.append("CollectionId: ").append(getCollectionId()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getUserMatchThreshold() != null)
            sb.append("UserMatchThreshold: ").append(getUserMatchThreshold()).append(",");
        if (getMaxUsers() != null)
            sb.append("MaxUsers: ").append(getMaxUsers()).append(",");
        if (getQualityFilter() != null)
            sb.append("QualityFilter: ").append(getQualityFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchUsersByImageRequest == false)
            return false;
        SearchUsersByImageRequest other = (SearchUsersByImageRequest) obj;
        if (other.getCollectionId() == null ^ this.getCollectionId() == null)
            return false;
        if (other.getCollectionId() != null && other.getCollectionId().equals(this.getCollectionId()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getUserMatchThreshold() == null ^ this.getUserMatchThreshold() == null)
            return false;
        if (other.getUserMatchThreshold() != null && other.getUserMatchThreshold().equals(this.getUserMatchThreshold()) == false)
            return false;
        if (other.getMaxUsers() == null ^ this.getMaxUsers() == null)
            return false;
        if (other.getMaxUsers() != null && other.getMaxUsers().equals(this.getMaxUsers()) == false)
            return false;
        if (other.getQualityFilter() == null ^ this.getQualityFilter() == null)
            return false;
        if (other.getQualityFilter() != null && other.getQualityFilter().equals(this.getQualityFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionId() == null) ? 0 : getCollectionId().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getUserMatchThreshold() == null) ? 0 : getUserMatchThreshold().hashCode());
        hashCode = prime * hashCode + ((getMaxUsers() == null) ? 0 : getMaxUsers().hashCode());
        hashCode = prime * hashCode + ((getQualityFilter() == null) ? 0 : getQualityFilter().hashCode());
        return hashCode;
    }

    @Override
    public SearchUsersByImageRequest clone() {
        return (SearchUsersByImageRequest) super.clone();
    }

}
