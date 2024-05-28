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
package com.amazonaws.services.datazone.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datazone-2018-05-10/DataProductItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataProductItem implements Serializable, Cloneable, StructuredPojo {

    /** <p/> */
    private String domainId;
    /** <p/> */
    private String itemId;

    /**
     * <p/>
     * 
     * @param domainId
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p/>
     * 
     * @param domainId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductItem withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param itemId
     */

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getItemId() {
        return this.itemId;
    }

    /**
     * <p/>
     * 
     * @param itemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataProductItem withItemId(String itemId) {
        setItemId(itemId);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getItemId() != null)
            sb.append("ItemId: ").append(getItemId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataProductItem == false)
            return false;
        DataProductItem other = (DataProductItem) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getItemId() == null ^ this.getItemId() == null)
            return false;
        if (other.getItemId() != null && other.getItemId().equals(this.getItemId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getItemId() == null) ? 0 : getItemId().hashCode());
        return hashCode;
    }

    @Override
    public DataProductItem clone() {
        try {
            return (DataProductItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datazone.model.transform.DataProductItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
