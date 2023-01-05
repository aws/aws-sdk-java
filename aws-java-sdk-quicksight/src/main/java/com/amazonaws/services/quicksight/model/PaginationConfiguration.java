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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The pagination configuration for a table visual or boxplot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/PaginationConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PaginationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how many items render in one page.
     * </p>
     */
    private Long pageSize;
    /**
     * <p>
     * Indicates the page number.
     * </p>
     */
    private Long pageNumber;

    /**
     * <p>
     * Indicates how many items render in one page.
     * </p>
     * 
     * @param pageSize
     *        Indicates how many items render in one page.
     */

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Indicates how many items render in one page.
     * </p>
     * 
     * @return Indicates how many items render in one page.
     */

    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Indicates how many items render in one page.
     * </p>
     * 
     * @param pageSize
     *        Indicates how many items render in one page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaginationConfiguration withPageSize(Long pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * Indicates the page number.
     * </p>
     * 
     * @param pageNumber
     *        Indicates the page number.
     */

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * <p>
     * Indicates the page number.
     * </p>
     * 
     * @return Indicates the page number.
     */

    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * <p>
     * Indicates the page number.
     * </p>
     * 
     * @param pageNumber
     *        Indicates the page number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PaginationConfiguration withPageNumber(Long pageNumber) {
        setPageNumber(pageNumber);
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
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPageNumber() != null)
            sb.append("PageNumber: ").append(getPageNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PaginationConfiguration == false)
            return false;
        PaginationConfiguration other = (PaginationConfiguration) obj;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        return hashCode;
    }

    @Override
    public PaginationConfiguration clone() {
        try {
            return (PaginationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.PaginationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
