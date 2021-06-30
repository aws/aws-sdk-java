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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a limit imposed on number of Amazon S3 files that should be selected for a dataset from a connected Amazon
 * S3 path.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/FilesLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FilesLimit implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of Amazon S3 files to select.
     * </p>
     */
    private Integer maxFiles;
    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a
     * sorting criteria. Currently it's the only allowed value.
     * </p>
     */
    private String orderedBy;
    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most
     * recent files are selected first. Anotherpossible value is ASCENDING.
     * </p>
     */
    private String order;

    /**
     * <p>
     * The number of Amazon S3 files to select.
     * </p>
     * 
     * @param maxFiles
     *        The number of Amazon S3 files to select.
     */

    public void setMaxFiles(Integer maxFiles) {
        this.maxFiles = maxFiles;
    }

    /**
     * <p>
     * The number of Amazon S3 files to select.
     * </p>
     * 
     * @return The number of Amazon S3 files to select.
     */

    public Integer getMaxFiles() {
        return this.maxFiles;
    }

    /**
     * <p>
     * The number of Amazon S3 files to select.
     * </p>
     * 
     * @param maxFiles
     *        The number of Amazon S3 files to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FilesLimit withMaxFiles(Integer maxFiles) {
        setMaxFiles(maxFiles);
        return this;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a
     * sorting criteria. Currently it's the only allowed value.
     * </p>
     * 
     * @param orderedBy
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE
     *        as a sorting criteria. Currently it's the only allowed value.
     * @see OrderedBy
     */

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a
     * sorting criteria. Currently it's the only allowed value.
     * </p>
     * 
     * @return A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE
     *         as a sorting criteria. Currently it's the only allowed value.
     * @see OrderedBy
     */

    public String getOrderedBy() {
        return this.orderedBy;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a
     * sorting criteria. Currently it's the only allowed value.
     * </p>
     * 
     * @param orderedBy
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE
     *        as a sorting criteria. Currently it's the only allowed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderedBy
     */

    public FilesLimit withOrderedBy(String orderedBy) {
        setOrderedBy(orderedBy);
        return this;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE as a
     * sorting criteria. Currently it's the only allowed value.
     * </p>
     * 
     * @param orderedBy
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses LAST_MODIFIED_DATE
     *        as a sorting criteria. Currently it's the only allowed value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OrderedBy
     */

    public FilesLimit withOrderedBy(OrderedBy orderedBy) {
        this.orderedBy = orderedBy.toString();
        return this;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most
     * recent files are selected first. Anotherpossible value is ASCENDING.
     * </p>
     * 
     * @param order
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order,
     *        i.e. most recent files are selected first. Anotherpossible value is ASCENDING.
     * @see Order
     */

    public void setOrder(String order) {
        this.order = order;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most
     * recent files are selected first. Anotherpossible value is ASCENDING.
     * </p>
     * 
     * @return A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order,
     *         i.e. most recent files are selected first. Anotherpossible value is ASCENDING.
     * @see Order
     */

    public String getOrder() {
        return this.order;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most
     * recent files are selected first. Anotherpossible value is ASCENDING.
     * </p>
     * 
     * @param order
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order,
     *        i.e. most recent files are selected first. Anotherpossible value is ASCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public FilesLimit withOrder(String order) {
        setOrder(order);
        return this;
    }

    /**
     * <p>
     * A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order, i.e. most
     * recent files are selected first. Anotherpossible value is ASCENDING.
     * </p>
     * 
     * @param order
     *        A criteria to use for Amazon S3 files sorting before their selection. By default uses DESCENDING order,
     *        i.e. most recent files are selected first. Anotherpossible value is ASCENDING.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Order
     */

    public FilesLimit withOrder(Order order) {
        this.order = order.toString();
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
        if (getMaxFiles() != null)
            sb.append("MaxFiles: ").append(getMaxFiles()).append(",");
        if (getOrderedBy() != null)
            sb.append("OrderedBy: ").append(getOrderedBy()).append(",");
        if (getOrder() != null)
            sb.append("Order: ").append(getOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FilesLimit == false)
            return false;
        FilesLimit other = (FilesLimit) obj;
        if (other.getMaxFiles() == null ^ this.getMaxFiles() == null)
            return false;
        if (other.getMaxFiles() != null && other.getMaxFiles().equals(this.getMaxFiles()) == false)
            return false;
        if (other.getOrderedBy() == null ^ this.getOrderedBy() == null)
            return false;
        if (other.getOrderedBy() != null && other.getOrderedBy().equals(this.getOrderedBy()) == false)
            return false;
        if (other.getOrder() == null ^ this.getOrder() == null)
            return false;
        if (other.getOrder() != null && other.getOrder().equals(this.getOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxFiles() == null) ? 0 : getMaxFiles().hashCode());
        hashCode = prime * hashCode + ((getOrderedBy() == null) ? 0 : getOrderedBy().hashCode());
        hashCode = prime * hashCode + ((getOrder() == null) ? 0 : getOrder().hashCode());
        return hashCode;
    }

    @Override
    public FilesLimit clone() {
        try {
            return (FilesLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gluedatabrew.model.transform.FilesLimitMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
