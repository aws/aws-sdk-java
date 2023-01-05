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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/BatchGetCollection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetCollectionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     */
    private java.util.List<String> ids;
    /**
     * <p>
     * A list of collection names. You can't provide names and IDs in the same request.
     * </p>
     */
    private java.util.List<String> names;

    /**
     * <p>
     * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @return A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the
     *         collection endpoint. You can also retrieve it using the <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *         >ListCollections</a> API.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @param ids
     *        A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the
     *        collection endpoint. You can also retrieve it using the <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *        >ListCollections</a> API.
     */

    public void setIds(java.util.Collection<String> ids) {
        if (ids == null) {
            this.ids = null;
            return;
        }

        this.ids = new java.util.ArrayList<String>(ids);
    }

    /**
     * <p>
     * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the
     *        collection endpoint. You can also retrieve it using the <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *        >ListCollections</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionRequest withIds(String... ids) {
        if (this.ids == null) {
            setIds(new java.util.ArrayList<String>(ids.length));
        }
        for (String ele : ids) {
            this.ids.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the collection
     * endpoint. You can also retrieve it using the <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     * >ListCollections</a> API.
     * </p>
     * 
     * @param ids
     *        A list of collection IDs. You can't provide names and IDs in the same request. The ID is part of the
     *        collection endpoint. You can also retrieve it using the <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/ServerlessAPIReference/API_ListCollections.html"
     *        >ListCollections</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
        return this;
    }

    /**
     * <p>
     * A list of collection names. You can't provide names and IDs in the same request.
     * </p>
     * 
     * @return A list of collection names. You can't provide names and IDs in the same request.
     */

    public java.util.List<String> getNames() {
        return names;
    }

    /**
     * <p>
     * A list of collection names. You can't provide names and IDs in the same request.
     * </p>
     * 
     * @param names
     *        A list of collection names. You can't provide names and IDs in the same request.
     */

    public void setNames(java.util.Collection<String> names) {
        if (names == null) {
            this.names = null;
            return;
        }

        this.names = new java.util.ArrayList<String>(names);
    }

    /**
     * <p>
     * A list of collection names. You can't provide names and IDs in the same request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNames(java.util.Collection)} or {@link #withNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param names
     *        A list of collection names. You can't provide names and IDs in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionRequest withNames(String... names) {
        if (this.names == null) {
            setNames(new java.util.ArrayList<String>(names.length));
        }
        for (String ele : names) {
            this.names.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of collection names. You can't provide names and IDs in the same request.
     * </p>
     * 
     * @param names
     *        A list of collection names. You can't provide names and IDs in the same request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetCollectionRequest withNames(java.util.Collection<String> names) {
        setNames(names);
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
        if (getIds() != null)
            sb.append("Ids: ").append(getIds()).append(",");
        if (getNames() != null)
            sb.append("Names: ").append(getNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetCollectionRequest == false)
            return false;
        BatchGetCollectionRequest other = (BatchGetCollectionRequest) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        if (other.getNames() == null ^ this.getNames() == null)
            return false;
        if (other.getNames() != null && other.getNames().equals(this.getNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        hashCode = prime * hashCode + ((getNames() == null) ? 0 : getNames().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetCollectionRequest clone() {
        return (BatchGetCollectionRequest) super.clone();
    }

}
