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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information that identifies an on-premises storage system that you're using with DataSync Discovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/StorageSystemListEntry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageSystemListEntry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     */
    private String storageSystemArn;
    /**
     * <p>
     * The name of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @param storageSystemArn
     *        The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     */

    public void setStorageSystemArn(String storageSystemArn) {
        this.storageSystemArn = storageSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     */

    public String getStorageSystemArn() {
        return this.storageSystemArn;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @param storageSystemArn
     *        The Amazon Resource Names (ARN) of an on-premises storage system that you added to DataSync Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageSystemListEntry withStorageSystemArn(String storageSystemArn) {
        setStorageSystemArn(storageSystemArn);
        return this;
    }

    /**
     * <p>
     * The name of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @param name
     *        The name of an on-premises storage system that you added to DataSync Discovery.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @return The name of an on-premises storage system that you added to DataSync Discovery.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an on-premises storage system that you added to DataSync Discovery.
     * </p>
     * 
     * @param name
     *        The name of an on-premises storage system that you added to DataSync Discovery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageSystemListEntry withName(String name) {
        setName(name);
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
        if (getStorageSystemArn() != null)
            sb.append("StorageSystemArn: ").append(getStorageSystemArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageSystemListEntry == false)
            return false;
        StorageSystemListEntry other = (StorageSystemListEntry) obj;
        if (other.getStorageSystemArn() == null ^ this.getStorageSystemArn() == null)
            return false;
        if (other.getStorageSystemArn() != null && other.getStorageSystemArn().equals(this.getStorageSystemArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStorageSystemArn() == null) ? 0 : getStorageSystemArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public StorageSystemListEntry clone() {
        try {
            return (StorageSystemListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.StorageSystemListEntryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
