/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private Long faceCount;

    private String faceModelVersion;

    private String collectionARN;

    private java.util.Date creationTimestamp;

    /**
     * @param faceCount
     */

    public void setFaceCount(Long faceCount) {
        this.faceCount = faceCount;
    }

    /**
     * @return
     */

    public Long getFaceCount() {
        return this.faceCount;
    }

    /**
     * @param faceCount
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCollectionResult withFaceCount(Long faceCount) {
        setFaceCount(faceCount);
        return this;
    }

    /**
     * @param faceModelVersion
     */

    public void setFaceModelVersion(String faceModelVersion) {
        this.faceModelVersion = faceModelVersion;
    }

    /**
     * @return
     */

    public String getFaceModelVersion() {
        return this.faceModelVersion;
    }

    /**
     * @param faceModelVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCollectionResult withFaceModelVersion(String faceModelVersion) {
        setFaceModelVersion(faceModelVersion);
        return this;
    }

    /**
     * @param collectionARN
     */

    public void setCollectionARN(String collectionARN) {
        this.collectionARN = collectionARN;
    }

    /**
     * @return
     */

    public String getCollectionARN() {
        return this.collectionARN;
    }

    /**
     * @param collectionARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCollectionResult withCollectionARN(String collectionARN) {
        setCollectionARN(collectionARN);
        return this;
    }

    /**
     * @param creationTimestamp
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * @param creationTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeCollectionResult withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFaceCount() != null)
            sb.append("FaceCount: ").append(getFaceCount()).append(",");
        if (getFaceModelVersion() != null)
            sb.append("FaceModelVersion: ").append(getFaceModelVersion()).append(",");
        if (getCollectionARN() != null)
            sb.append("CollectionARN: ").append(getCollectionARN()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCollectionResult == false)
            return false;
        DescribeCollectionResult other = (DescribeCollectionResult) obj;
        if (other.getFaceCount() == null ^ this.getFaceCount() == null)
            return false;
        if (other.getFaceCount() != null && other.getFaceCount().equals(this.getFaceCount()) == false)
            return false;
        if (other.getFaceModelVersion() == null ^ this.getFaceModelVersion() == null)
            return false;
        if (other.getFaceModelVersion() != null && other.getFaceModelVersion().equals(this.getFaceModelVersion()) == false)
            return false;
        if (other.getCollectionARN() == null ^ this.getCollectionARN() == null)
            return false;
        if (other.getCollectionARN() != null && other.getCollectionARN().equals(this.getCollectionARN()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFaceCount() == null) ? 0 : getFaceCount().hashCode());
        hashCode = prime * hashCode + ((getFaceModelVersion() == null) ? 0 : getFaceModelVersion().hashCode());
        hashCode = prime * hashCode + ((getCollectionARN() == null) ? 0 : getCollectionARN().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCollectionResult clone() {
        try {
            return (DescribeCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
