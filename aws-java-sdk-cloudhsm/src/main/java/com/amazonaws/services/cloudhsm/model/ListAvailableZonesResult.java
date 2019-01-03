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
package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsm-2014-05-30/ListAvailableZones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailableZonesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> aZList;

    /**
     * <p>
     * The list of Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @return The list of Availability Zones that have available AWS CloudHSM capacity.
     */

    public java.util.List<String> getAZList() {
        if (aZList == null) {
            aZList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return aZList;
    }

    /**
     * <p>
     * The list of Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param aZList
     *        The list of Availability Zones that have available AWS CloudHSM capacity.
     */

    public void setAZList(java.util.Collection<String> aZList) {
        if (aZList == null) {
            this.aZList = null;
            return;
        }

        this.aZList = new com.amazonaws.internal.SdkInternalList<String>(aZList);
    }

    /**
     * <p>
     * The list of Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAZList(java.util.Collection)} or {@link #withAZList(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param aZList
     *        The list of Availability Zones that have available AWS CloudHSM capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableZonesResult withAZList(String... aZList) {
        if (this.aZList == null) {
            setAZList(new com.amazonaws.internal.SdkInternalList<String>(aZList.length));
        }
        for (String ele : aZList) {
            this.aZList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of Availability Zones that have available AWS CloudHSM capacity.
     * </p>
     * 
     * @param aZList
     *        The list of Availability Zones that have available AWS CloudHSM capacity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailableZonesResult withAZList(java.util.Collection<String> aZList) {
        setAZList(aZList);
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
        if (getAZList() != null)
            sb.append("AZList: ").append(getAZList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableZonesResult == false)
            return false;
        ListAvailableZonesResult other = (ListAvailableZonesResult) obj;
        if (other.getAZList() == null ^ this.getAZList() == null)
            return false;
        if (other.getAZList() != null && other.getAZList().equals(this.getAZList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAZList() == null) ? 0 : getAZList().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailableZonesResult clone() {
        try {
            return (ListAvailableZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
