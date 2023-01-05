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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/CreateCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateCollectionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the collection.
     * </p>
     */
    private CreateCollectionDetail createCollectionDetail;

    /**
     * <p>
     * Details about the collection.
     * </p>
     * 
     * @param createCollectionDetail
     *        Details about the collection.
     */

    public void setCreateCollectionDetail(CreateCollectionDetail createCollectionDetail) {
        this.createCollectionDetail = createCollectionDetail;
    }

    /**
     * <p>
     * Details about the collection.
     * </p>
     * 
     * @return Details about the collection.
     */

    public CreateCollectionDetail getCreateCollectionDetail() {
        return this.createCollectionDetail;
    }

    /**
     * <p>
     * Details about the collection.
     * </p>
     * 
     * @param createCollectionDetail
     *        Details about the collection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateCollectionResult withCreateCollectionDetail(CreateCollectionDetail createCollectionDetail) {
        setCreateCollectionDetail(createCollectionDetail);
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
        if (getCreateCollectionDetail() != null)
            sb.append("CreateCollectionDetail: ").append(getCreateCollectionDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCollectionResult == false)
            return false;
        CreateCollectionResult other = (CreateCollectionResult) obj;
        if (other.getCreateCollectionDetail() == null ^ this.getCreateCollectionDetail() == null)
            return false;
        if (other.getCreateCollectionDetail() != null && other.getCreateCollectionDetail().equals(this.getCreateCollectionDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateCollectionDetail() == null) ? 0 : getCreateCollectionDetail().hashCode());
        return hashCode;
    }

    @Override
    public CreateCollectionResult clone() {
        try {
            return (CreateCollectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
