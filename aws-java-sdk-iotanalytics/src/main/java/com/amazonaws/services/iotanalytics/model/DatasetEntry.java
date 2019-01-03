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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The reference to a data set entry.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetEntry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set item.
     * </p>
     */
    private String entryName;
    /**
     * <p>
     * The pre-signed URI of the data set item.
     * </p>
     */
    private String dataURI;

    /**
     * <p>
     * The name of the data set item.
     * </p>
     * 
     * @param entryName
     *        The name of the data set item.
     */

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    /**
     * <p>
     * The name of the data set item.
     * </p>
     * 
     * @return The name of the data set item.
     */

    public String getEntryName() {
        return this.entryName;
    }

    /**
     * <p>
     * The name of the data set item.
     * </p>
     * 
     * @param entryName
     *        The name of the data set item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetEntry withEntryName(String entryName) {
        setEntryName(entryName);
        return this;
    }

    /**
     * <p>
     * The pre-signed URI of the data set item.
     * </p>
     * 
     * @param dataURI
     *        The pre-signed URI of the data set item.
     */

    public void setDataURI(String dataURI) {
        this.dataURI = dataURI;
    }

    /**
     * <p>
     * The pre-signed URI of the data set item.
     * </p>
     * 
     * @return The pre-signed URI of the data set item.
     */

    public String getDataURI() {
        return this.dataURI;
    }

    /**
     * <p>
     * The pre-signed URI of the data set item.
     * </p>
     * 
     * @param dataURI
     *        The pre-signed URI of the data set item.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetEntry withDataURI(String dataURI) {
        setDataURI(dataURI);
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
        if (getEntryName() != null)
            sb.append("EntryName: ").append(getEntryName()).append(",");
        if (getDataURI() != null)
            sb.append("DataURI: ").append(getDataURI());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetEntry == false)
            return false;
        DatasetEntry other = (DatasetEntry) obj;
        if (other.getEntryName() == null ^ this.getEntryName() == null)
            return false;
        if (other.getEntryName() != null && other.getEntryName().equals(this.getEntryName()) == false)
            return false;
        if (other.getDataURI() == null ^ this.getDataURI() == null)
            return false;
        if (other.getDataURI() != null && other.getDataURI().equals(this.getDataURI()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryName() == null) ? 0 : getEntryName().hashCode());
        hashCode = prime * hashCode + ((getDataURI() == null) ? 0 : getDataURI().hashCode());
        return hashCode;
    }

    @Override
    public DatasetEntry clone() {
        try {
            return (DatasetEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
