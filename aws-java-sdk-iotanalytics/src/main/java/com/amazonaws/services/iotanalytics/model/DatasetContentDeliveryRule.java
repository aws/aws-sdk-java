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
 * When data set contents are created they are delivered to destination specified here.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/DatasetContentDeliveryRule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DatasetContentDeliveryRule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data set content delivery rules entry.
     * </p>
     */
    private String entryName;
    /**
     * <p>
     * The destination to which data set contents are delivered.
     * </p>
     */
    private DatasetContentDeliveryDestination destination;

    /**
     * <p>
     * The name of the data set content delivery rules entry.
     * </p>
     * 
     * @param entryName
     *        The name of the data set content delivery rules entry.
     */

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    /**
     * <p>
     * The name of the data set content delivery rules entry.
     * </p>
     * 
     * @return The name of the data set content delivery rules entry.
     */

    public String getEntryName() {
        return this.entryName;
    }

    /**
     * <p>
     * The name of the data set content delivery rules entry.
     * </p>
     * 
     * @param entryName
     *        The name of the data set content delivery rules entry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentDeliveryRule withEntryName(String entryName) {
        setEntryName(entryName);
        return this;
    }

    /**
     * <p>
     * The destination to which data set contents are delivered.
     * </p>
     * 
     * @param destination
     *        The destination to which data set contents are delivered.
     */

    public void setDestination(DatasetContentDeliveryDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination to which data set contents are delivered.
     * </p>
     * 
     * @return The destination to which data set contents are delivered.
     */

    public DatasetContentDeliveryDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination to which data set contents are delivered.
     * </p>
     * 
     * @param destination
     *        The destination to which data set contents are delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DatasetContentDeliveryRule withDestination(DatasetContentDeliveryDestination destination) {
        setDestination(destination);
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetContentDeliveryRule == false)
            return false;
        DatasetContentDeliveryRule other = (DatasetContentDeliveryRule) obj;
        if (other.getEntryName() == null ^ this.getEntryName() == null)
            return false;
        if (other.getEntryName() != null && other.getEntryName().equals(this.getEntryName()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEntryName() == null) ? 0 : getEntryName().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public DatasetContentDeliveryRule clone() {
        try {
            return (DatasetContentDeliveryRule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatasetContentDeliveryRuleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
