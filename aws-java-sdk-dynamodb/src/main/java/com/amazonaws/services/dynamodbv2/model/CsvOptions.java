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
package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Processing options for the CSV file being imported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dynamodb-2012-08-10/CsvOptions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CsvOptions implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The delimiter used for separating items in the CSV file being imported.
     * </p>
     */
    private String delimiter;
    /**
     * <p>
     * List of the headers used to specify a common header for all source CSV files being imported. If this field is
     * specified then the first line of each CSV file is treated as data instead of the header. If this field is not
     * specified the the first line of each CSV file is treated as the header.
     * </p>
     */
    private java.util.List<String> headerList;

    /**
     * <p>
     * The delimiter used for separating items in the CSV file being imported.
     * </p>
     * 
     * @param delimiter
     *        The delimiter used for separating items in the CSV file being imported.
     */

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    /**
     * <p>
     * The delimiter used for separating items in the CSV file being imported.
     * </p>
     * 
     * @return The delimiter used for separating items in the CSV file being imported.
     */

    public String getDelimiter() {
        return this.delimiter;
    }

    /**
     * <p>
     * The delimiter used for separating items in the CSV file being imported.
     * </p>
     * 
     * @param delimiter
     *        The delimiter used for separating items in the CSV file being imported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvOptions withDelimiter(String delimiter) {
        setDelimiter(delimiter);
        return this;
    }

    /**
     * <p>
     * List of the headers used to specify a common header for all source CSV files being imported. If this field is
     * specified then the first line of each CSV file is treated as data instead of the header. If this field is not
     * specified the the first line of each CSV file is treated as the header.
     * </p>
     * 
     * @return List of the headers used to specify a common header for all source CSV files being imported. If this
     *         field is specified then the first line of each CSV file is treated as data instead of the header. If this
     *         field is not specified the the first line of each CSV file is treated as the header.
     */

    public java.util.List<String> getHeaderList() {
        return headerList;
    }

    /**
     * <p>
     * List of the headers used to specify a common header for all source CSV files being imported. If this field is
     * specified then the first line of each CSV file is treated as data instead of the header. If this field is not
     * specified the the first line of each CSV file is treated as the header.
     * </p>
     * 
     * @param headerList
     *        List of the headers used to specify a common header for all source CSV files being imported. If this field
     *        is specified then the first line of each CSV file is treated as data instead of the header. If this field
     *        is not specified the the first line of each CSV file is treated as the header.
     */

    public void setHeaderList(java.util.Collection<String> headerList) {
        if (headerList == null) {
            this.headerList = null;
            return;
        }

        this.headerList = new java.util.ArrayList<String>(headerList);
    }

    /**
     * <p>
     * List of the headers used to specify a common header for all source CSV files being imported. If this field is
     * specified then the first line of each CSV file is treated as data instead of the header. If this field is not
     * specified the the first line of each CSV file is treated as the header.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHeaderList(java.util.Collection)} or {@link #withHeaderList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param headerList
     *        List of the headers used to specify a common header for all source CSV files being imported. If this field
     *        is specified then the first line of each CSV file is treated as data instead of the header. If this field
     *        is not specified the the first line of each CSV file is treated as the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvOptions withHeaderList(String... headerList) {
        if (this.headerList == null) {
            setHeaderList(new java.util.ArrayList<String>(headerList.length));
        }
        for (String ele : headerList) {
            this.headerList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of the headers used to specify a common header for all source CSV files being imported. If this field is
     * specified then the first line of each CSV file is treated as data instead of the header. If this field is not
     * specified the the first line of each CSV file is treated as the header.
     * </p>
     * 
     * @param headerList
     *        List of the headers used to specify a common header for all source CSV files being imported. If this field
     *        is specified then the first line of each CSV file is treated as data instead of the header. If this field
     *        is not specified the the first line of each CSV file is treated as the header.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CsvOptions withHeaderList(java.util.Collection<String> headerList) {
        setHeaderList(headerList);
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
        if (getDelimiter() != null)
            sb.append("Delimiter: ").append(getDelimiter()).append(",");
        if (getHeaderList() != null)
            sb.append("HeaderList: ").append(getHeaderList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CsvOptions == false)
            return false;
        CsvOptions other = (CsvOptions) obj;
        if (other.getDelimiter() == null ^ this.getDelimiter() == null)
            return false;
        if (other.getDelimiter() != null && other.getDelimiter().equals(this.getDelimiter()) == false)
            return false;
        if (other.getHeaderList() == null ^ this.getHeaderList() == null)
            return false;
        if (other.getHeaderList() != null && other.getHeaderList().equals(this.getHeaderList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelimiter() == null) ? 0 : getDelimiter().hashCode());
        hashCode = prime * hashCode + ((getHeaderList() == null) ? 0 : getHeaderList().hashCode());
        return hashCode;
    }

    @Override
    public CsvOptions clone() {
        try {
            return (CsvOptions) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dynamodbv2.model.transform.CsvOptionsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
