/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteImportDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs for the import tasks that you want to delete.
     * </p>
     */
    private java.util.List<String> importTaskIds;

    /**
     * <p>
     * The IDs for the import tasks that you want to delete.
     * </p>
     * 
     * @return The IDs for the import tasks that you want to delete.
     */

    public java.util.List<String> getImportTaskIds() {
        return importTaskIds;
    }

    /**
     * <p>
     * The IDs for the import tasks that you want to delete.
     * </p>
     * 
     * @param importTaskIds
     *        The IDs for the import tasks that you want to delete.
     */

    public void setImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
            return;
        }

        this.importTaskIds = new java.util.ArrayList<String>(importTaskIds);
    }

    /**
     * <p>
     * The IDs for the import tasks that you want to delete.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setImportTaskIds(java.util.Collection)} or {@link #withImportTaskIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param importTaskIds
     *        The IDs for the import tasks that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataRequest withImportTaskIds(String... importTaskIds) {
        if (this.importTaskIds == null) {
            setImportTaskIds(new java.util.ArrayList<String>(importTaskIds.length));
        }
        for (String ele : importTaskIds) {
            this.importTaskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs for the import tasks that you want to delete.
     * </p>
     * 
     * @param importTaskIds
     *        The IDs for the import tasks that you want to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteImportDataRequest withImportTaskIds(java.util.Collection<String> importTaskIds) {
        setImportTaskIds(importTaskIds);
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
        if (getImportTaskIds() != null)
            sb.append("ImportTaskIds: ").append(getImportTaskIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteImportDataRequest == false)
            return false;
        BatchDeleteImportDataRequest other = (BatchDeleteImportDataRequest) obj;
        if (other.getImportTaskIds() == null ^ this.getImportTaskIds() == null)
            return false;
        if (other.getImportTaskIds() != null && other.getImportTaskIds().equals(this.getImportTaskIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getImportTaskIds() == null) ? 0 : getImportTaskIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteImportDataRequest clone() {
        return (BatchDeleteImportDataRequest) super.clone();
    }

}
