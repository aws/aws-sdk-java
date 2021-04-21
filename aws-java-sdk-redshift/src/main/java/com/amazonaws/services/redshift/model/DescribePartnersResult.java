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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribePartners" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribePartnersResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of partner integrations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PartnerIntegrationInfo> partnerIntegrationInfoList;

    /**
     * <p>
     * A list of partner integrations.
     * </p>
     * 
     * @return A list of partner integrations.
     */

    public java.util.List<PartnerIntegrationInfo> getPartnerIntegrationInfoList() {
        if (partnerIntegrationInfoList == null) {
            partnerIntegrationInfoList = new com.amazonaws.internal.SdkInternalList<PartnerIntegrationInfo>();
        }
        return partnerIntegrationInfoList;
    }

    /**
     * <p>
     * A list of partner integrations.
     * </p>
     * 
     * @param partnerIntegrationInfoList
     *        A list of partner integrations.
     */

    public void setPartnerIntegrationInfoList(java.util.Collection<PartnerIntegrationInfo> partnerIntegrationInfoList) {
        if (partnerIntegrationInfoList == null) {
            this.partnerIntegrationInfoList = null;
            return;
        }

        this.partnerIntegrationInfoList = new com.amazonaws.internal.SdkInternalList<PartnerIntegrationInfo>(partnerIntegrationInfoList);
    }

    /**
     * <p>
     * A list of partner integrations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPartnerIntegrationInfoList(java.util.Collection)} or
     * {@link #withPartnerIntegrationInfoList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param partnerIntegrationInfoList
     *        A list of partner integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersResult withPartnerIntegrationInfoList(PartnerIntegrationInfo... partnerIntegrationInfoList) {
        if (this.partnerIntegrationInfoList == null) {
            setPartnerIntegrationInfoList(new com.amazonaws.internal.SdkInternalList<PartnerIntegrationInfo>(partnerIntegrationInfoList.length));
        }
        for (PartnerIntegrationInfo ele : partnerIntegrationInfoList) {
            this.partnerIntegrationInfoList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of partner integrations.
     * </p>
     * 
     * @param partnerIntegrationInfoList
     *        A list of partner integrations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribePartnersResult withPartnerIntegrationInfoList(java.util.Collection<PartnerIntegrationInfo> partnerIntegrationInfoList) {
        setPartnerIntegrationInfoList(partnerIntegrationInfoList);
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
        if (getPartnerIntegrationInfoList() != null)
            sb.append("PartnerIntegrationInfoList: ").append(getPartnerIntegrationInfoList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePartnersResult == false)
            return false;
        DescribePartnersResult other = (DescribePartnersResult) obj;
        if (other.getPartnerIntegrationInfoList() == null ^ this.getPartnerIntegrationInfoList() == null)
            return false;
        if (other.getPartnerIntegrationInfoList() != null && other.getPartnerIntegrationInfoList().equals(this.getPartnerIntegrationInfoList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPartnerIntegrationInfoList() == null) ? 0 : getPartnerIntegrationInfoList().hashCode());
        return hashCode;
    }

    @Override
    public DescribePartnersResult clone() {
        try {
            return (DescribePartnersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
