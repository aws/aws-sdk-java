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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Sets the page size for each <i>concurrent process</i> that transfers OData records from your SAP instance. A
 * concurrent process is query that retrieves a batch of records as part of a flow run. Amazon AppFlow can run multiple
 * concurrent processes in parallel to transfer data faster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/SAPODataPaginationConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SAPODataPaginationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that comes
     * from an ODP provider, the maximum page size is 10,000.
     * </p>
     */
    private Integer maxPageSize;

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that comes
     * from an ODP provider, the maximum page size is 10,000.
     * </p>
     * 
     * @param maxPageSize
     *        The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *        application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that
     *        comes from an ODP provider, the maximum page size is 10,000.
     */

    public void setMaxPageSize(Integer maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that comes
     * from an ODP provider, the maximum page size is 10,000.
     * </p>
     * 
     * @return The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *         application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that
     *         comes from an ODP provider, the maximum page size is 10,000.
     */

    public Integer getMaxPageSize() {
        return this.maxPageSize;
    }

    /**
     * <p>
     * The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     * application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that comes
     * from an ODP provider, the maximum page size is 10,000.
     * </p>
     * 
     * @param maxPageSize
     *        The maximum number of records that Amazon AppFlow receives in each page of the response from your SAP
     *        application. For transfers of OData records, the maximum page size is 3,000. For transfers of data that
     *        comes from an ODP provider, the maximum page size is 10,000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SAPODataPaginationConfig withMaxPageSize(Integer maxPageSize) {
        setMaxPageSize(maxPageSize);
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
        if (getMaxPageSize() != null)
            sb.append("MaxPageSize: ").append(getMaxPageSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SAPODataPaginationConfig == false)
            return false;
        SAPODataPaginationConfig other = (SAPODataPaginationConfig) obj;
        if (other.getMaxPageSize() == null ^ this.getMaxPageSize() == null)
            return false;
        if (other.getMaxPageSize() != null && other.getMaxPageSize().equals(this.getMaxPageSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxPageSize() == null) ? 0 : getMaxPageSize().hashCode());
        return hashCode;
    }

    @Override
    public SAPODataPaginationConfig clone() {
        try {
            return (SAPODataPaginationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.SAPODataPaginationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
