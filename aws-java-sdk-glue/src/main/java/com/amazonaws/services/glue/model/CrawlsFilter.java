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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of fields, comparators and value that you can use to filter the crawler runs for a specified crawler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CrawlsFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CrawlsFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATE</code>: A string representing the state of the crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     * </p>
     * </li>
     * </ul>
     */
    private String fieldName;
    /**
     * <p>
     * A defined comparator that operates on the value. The available operators are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GT</code>: Greater than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code>: Less than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LE</code>: Less than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code>: Equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NE</code>: Not equal to.
     * </p>
     * </li>
     * </ul>
     */
    private String filterOperator;
    /**
     * <p>
     * The value provided for comparison on the crawl field.
     * </p>
     */
    private String fieldValue;

    /**
     * <p>
     * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATE</code>: A string representing the state of the crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fieldName
     *        A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATE</code>: A string representing the state of the crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     *        </p>
     *        </li>
     * @see FieldName
     */

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * <p>
     * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATE</code>: A string representing the state of the crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names
     *         are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STATE</code>: A string representing the state of the crawl.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     *         </p>
     *         </li>
     * @see FieldName
     */

    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * <p>
     * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATE</code>: A string representing the state of the crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fieldName
     *        A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATE</code>: A string representing the state of the crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldName
     */

    public CrawlsFilter withFieldName(String fieldName) {
        setFieldName(fieldName);
        return this;
    }

    /**
     * <p>
     * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STATE</code>: A string representing the state of the crawl.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fieldName
     *        A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names
     *        are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CRAWL_ID</code>: A string representing the UUID identifier for a crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STATE</code>: A string representing the state of the crawl.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>START_TIME</code> and <code>END_TIME</code>: The epoch timestamp in milliseconds.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DPU_HOUR</code>: The number of data processing unit (DPU) hours used for the crawl.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FieldName
     */

    public CrawlsFilter withFieldName(FieldName fieldName) {
        this.fieldName = fieldName.toString();
        return this;
    }

    /**
     * <p>
     * A defined comparator that operates on the value. The available operators are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GT</code>: Greater than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code>: Less than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LE</code>: Less than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code>: Equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NE</code>: Not equal to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterOperator
     *        A defined comparator that operates on the value. The available operators are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GT</code>: Greater than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code>: Less than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code>: Equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NE</code>: Not equal to.
     *        </p>
     *        </li>
     * @see FilterOperator
     */

    public void setFilterOperator(String filterOperator) {
        this.filterOperator = filterOperator;
    }

    /**
     * <p>
     * A defined comparator that operates on the value. The available operators are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GT</code>: Greater than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code>: Less than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LE</code>: Less than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code>: Equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NE</code>: Not equal to.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A defined comparator that operates on the value. The available operators are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>GT</code>: Greater than.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GE</code>: Greater than or equal to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LT</code>: Less than.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LE</code>: Less than or equal to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EQ</code>: Equal to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NE</code>: Not equal to.
     *         </p>
     *         </li>
     * @see FilterOperator
     */

    public String getFilterOperator() {
        return this.filterOperator;
    }

    /**
     * <p>
     * A defined comparator that operates on the value. The available operators are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GT</code>: Greater than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code>: Less than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LE</code>: Less than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code>: Equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NE</code>: Not equal to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterOperator
     *        A defined comparator that operates on the value. The available operators are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GT</code>: Greater than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code>: Less than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code>: Equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NE</code>: Not equal to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public CrawlsFilter withFilterOperator(String filterOperator) {
        setFilterOperator(filterOperator);
        return this;
    }

    /**
     * <p>
     * A defined comparator that operates on the value. The available operators are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>GT</code>: Greater than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GE</code>: Greater than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LT</code>: Less than.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LE</code>: Less than or equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EQ</code>: Equal to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NE</code>: Not equal to.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filterOperator
     *        A defined comparator that operates on the value. The available operators are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>GT</code>: Greater than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GE</code>: Greater than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LT</code>: Less than.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LE</code>: Less than or equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EQ</code>: Equal to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NE</code>: Not equal to.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FilterOperator
     */

    public CrawlsFilter withFilterOperator(FilterOperator filterOperator) {
        this.filterOperator = filterOperator.toString();
        return this;
    }

    /**
     * <p>
     * The value provided for comparison on the crawl field.
     * </p>
     * 
     * @param fieldValue
     *        The value provided for comparison on the crawl field.
     */

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * <p>
     * The value provided for comparison on the crawl field.
     * </p>
     * 
     * @return The value provided for comparison on the crawl field.
     */

    public String getFieldValue() {
        return this.fieldValue;
    }

    /**
     * <p>
     * The value provided for comparison on the crawl field.
     * </p>
     * 
     * @param fieldValue
     *        The value provided for comparison on the crawl field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CrawlsFilter withFieldValue(String fieldValue) {
        setFieldValue(fieldValue);
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
        if (getFieldName() != null)
            sb.append("FieldName: ").append(getFieldName()).append(",");
        if (getFilterOperator() != null)
            sb.append("FilterOperator: ").append(getFilterOperator()).append(",");
        if (getFieldValue() != null)
            sb.append("FieldValue: ").append(getFieldValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CrawlsFilter == false)
            return false;
        CrawlsFilter other = (CrawlsFilter) obj;
        if (other.getFieldName() == null ^ this.getFieldName() == null)
            return false;
        if (other.getFieldName() != null && other.getFieldName().equals(this.getFieldName()) == false)
            return false;
        if (other.getFilterOperator() == null ^ this.getFilterOperator() == null)
            return false;
        if (other.getFilterOperator() != null && other.getFilterOperator().equals(this.getFilterOperator()) == false)
            return false;
        if (other.getFieldValue() == null ^ this.getFieldValue() == null)
            return false;
        if (other.getFieldValue() != null && other.getFieldValue().equals(this.getFieldValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFieldName() == null) ? 0 : getFieldName().hashCode());
        hashCode = prime * hashCode + ((getFilterOperator() == null) ? 0 : getFilterOperator().hashCode());
        hashCode = prime * hashCode + ((getFieldValue() == null) ? 0 : getFieldValue().hashCode());
        return hashCode;
    }

    @Override
    public CrawlsFilter clone() {
        try {
            return (CrawlsFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.CrawlsFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
