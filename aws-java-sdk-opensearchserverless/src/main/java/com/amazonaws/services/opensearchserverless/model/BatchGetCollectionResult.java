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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about each collection.
     * </p>
     */
    private java.util.List<CollectionDetail> collectionDetails;
    /**
     * <p>
     * Error information for the request.
     * </p>
     */
    private java.util.List<CollectionErrorDetail> collectionErrorDetails;

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @return Details about each collection.
     */

    public java.util.List<CollectionDetail> getCollectionDetails() {
        return collectionDetails;
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @param collectionDetails
     *        Details about each collection.
     */

    public void setCollectionDetails(java.util.Collection<CollectionDetail> collectionDetails) {
        if (collectionDetails == null) {
            this.collectionDetails = null;
            return;
        }

        this.collectionDetails = new java.util.ArrayList<CollectionDetail>(collectionDetails);
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectionDetails(java.util.Collection)} or {@link #withCollectionDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param collectionDetails
     *        Details about each collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionResult withCollectionDetails(CollectionDetail... collectionDetails) {
        if (this.collectionDetails == null) {
            setCollectionDetails(new java.util.ArrayList<CollectionDetail>(collectionDetails.length));
        }
        for (CollectionDetail ele : collectionDetails) {
            this.collectionDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about each collection.
     * </p>
     * 
     * @param collectionDetails
     *        Details about each collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionResult withCollectionDetails(java.util.Collection<CollectionDetail> collectionDetails) {
        setCollectionDetails(collectionDetails);
        return this;
    }

    /**
     * <p>
     * Error information for the request.
     * </p>
     * 
     * @return Error information for the request.
     */

    public java.util.List<CollectionErrorDetail> getCollectionErrorDetails() {
        return collectionErrorDetails;
    }

    /**
     * <p>
     * Error information for the request.
     * </p>
     * 
     * @param collectionErrorDetails
     *        Error information for the request.
     */

    public void setCollectionErrorDetails(java.util.Collection<CollectionErrorDetail> collectionErrorDetails) {
        if (collectionErrorDetails == null) {
            this.collectionErrorDetails = null;
            return;
        }

        this.collectionErrorDetails = new java.util.ArrayList<CollectionErrorDetail>(collectionErrorDetails);
    }

    /**
     * <p>
     * Error information for the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCollectionErrorDetails(java.util.Collection)} or
     * {@link #withCollectionErrorDetails(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param collectionErrorDetails
     *        Error information for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionResult withCollectionErrorDetails(CollectionErrorDetail... collectionErrorDetails) {
        if (this.collectionErrorDetails == null) {
            setCollectionErrorDetails(new java.util.ArrayList<CollectionErrorDetail>(collectionErrorDetails.length));
        }
        for (CollectionErrorDetail ele : collectionErrorDetails) {
            this.collectionErrorDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error information for the request.
     * </p>
     * 
     * @param collectionErrorDetails
     *        Error information for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionResult withCollectionErrorDetails(java.util.Collection<CollectionErrorDetail> collectionErrorDetails) {
        setCollectionErrorDetails(collectionErrorDetails);
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
        if (getCollectionDetails() != null)
            sb.append("CollectionDetails: ").append(getCollectionDetails()).append(",");
        if (getCollectionErrorDetails() != null)
            sb.append("CollectionErrorDetails: ").append(getCollectionErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCollectionResult == false)
            return false;
        BatchGetCollectionResult other = (BatchGetCollectionResult) obj;
        if (other.getCollectionDetails() == null ^ this.getCollectionDetails() == null)
            return false;
        if (other.getCollectionDetails() != null && other.getCollectionDetails().equals(this.getCollectionDetails()) == false)
            return false;
        if (other.getCollectionErrorDetails() == null ^ this.getCollectionErrorDetails() == null)
            return false;
        if (other.getCollectionErrorDetails() != null && other.getCollectionErrorDetails().equals(this.getCollectionErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCollectionDetails() == null) ? 0 : getCollectionDetails().hashCode());
        hashCode = prime * hashCode + ((getCollectionErrorDetails() == null) ? 0 : getCollectionErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCollectionResult clone() {
        try {
            return (BatchGetCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
