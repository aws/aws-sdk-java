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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter for variant import jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/ListVariantImportJobsFilter" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListVariantImportJobsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A status to filter on.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A store name to filter on.
     * </p>
     */
    private String storeName;

    /**
     * <p>
     * A status to filter on.
     * </p>
     * 
     * @param status
     *        A status to filter on.
     * @see JobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A status to filter on.
     * </p>
     * 
     * @return A status to filter on.
     * @see JobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A status to filter on.
     * </p>
     * 
     * @param status
     *        A status to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListVariantImportJobsFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A status to filter on.
     * </p>
     * 
     * @param status
     *        A status to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JobStatus
     */

    public ListVariantImportJobsFilter withStatus(JobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A store name to filter on.
     * </p>
     * 
     * @param storeName
     *        A store name to filter on.
     */

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * <p>
     * A store name to filter on.
     * </p>
     * 
     * @return A store name to filter on.
     */

    public String getStoreName() {
        return this.storeName;
    }

    /**
     * <p>
     * A store name to filter on.
     * </p>
     * 
     * @param storeName
     *        A store name to filter on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListVariantImportJobsFilter withStoreName(String storeName) {
        setStoreName(storeName);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStoreName() != null)
            sb.append("StoreName: ").append(getStoreName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListVariantImportJobsFilter == false)
            return false;
        ListVariantImportJobsFilter other = (ListVariantImportJobsFilter) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStoreName() == null ^ this.getStoreName() == null)
            return false;
        if (other.getStoreName() != null && other.getStoreName().equals(this.getStoreName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        return hashCode;
    }

    @Override
    public ListVariantImportJobsFilter clone() {
        try {
            return (ListVariantImportJobsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.omics.model.transform.ListVariantImportJobsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
