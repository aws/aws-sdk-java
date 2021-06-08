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
package com.amazonaws.services.codebuild.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codebuild-2016-10-06/BatchGetBuildBatches" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetBuildBatchesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array that contains the batch build identifiers to retrieve.
     * </p>
     */
    private java.util.List<String> ids;

    /**
     * <p>
     * An array that contains the batch build identifiers to retrieve.
     * </p>
     * 
     * @return An array that contains the batch build identifiers to retrieve.
     */

    public java.util.List<String> getIds() {
        return ids;
    }

    /**
     * <p>
     * An array that contains the batch build identifiers to retrieve.
     * </p>
     * 
     * @param ids
     *        An array that contains the batch build identifiers to retrieve.
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
     * An array that contains the batch build identifiers to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIds(java.util.Collection)} or {@link #withIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ids
     *        An array that contains the batch build identifiers to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesRequest withIds(String... ids) {
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
     * An array that contains the batch build identifiers to retrieve.
     * </p>
     * 
     * @param ids
     *        An array that contains the batch build identifiers to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetBuildBatchesRequest withIds(java.util.Collection<String> ids) {
        setIds(ids);
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
            sb.append("Ids: ").append(getIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetBuildBatchesRequest == false)
            return false;
        BatchGetBuildBatchesRequest other = (BatchGetBuildBatchesRequest) obj;
        if (other.getIds() == null ^ this.getIds() == null)
            return false;
        if (other.getIds() != null && other.getIds().equals(this.getIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIds() == null) ? 0 : getIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetBuildBatchesRequest clone() {
        return (BatchGetBuildBatchesRequest) super.clone();
    }

}
