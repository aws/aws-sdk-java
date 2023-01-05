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
package com.amazonaws.services.opensearchserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Statistics for an OpenSearch Serverless access policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opensearchserverless-2021-11-01/AccessPolicyStats"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccessPolicyStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of data access policies in the current account.
     * </p>
     */
    private Long dataPolicyCount;

    /**
     * <p>
     * The number of data access policies in the current account.
     * </p>
     * 
     * @param dataPolicyCount
     *        The number of data access policies in the current account.
     */

    public void setDataPolicyCount(Long dataPolicyCount) {
        this.dataPolicyCount = dataPolicyCount;
    }

    /**
     * <p>
     * The number of data access policies in the current account.
     * </p>
     * 
     * @return The number of data access policies in the current account.
     */

    public Long getDataPolicyCount() {
        return this.dataPolicyCount;
    }

    /**
     * <p>
     * The number of data access policies in the current account.
     * </p>
     * 
     * @param dataPolicyCount
     *        The number of data access policies in the current account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccessPolicyStats withDataPolicyCount(Long dataPolicyCount) {
        setDataPolicyCount(dataPolicyCount);
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
        if (getDataPolicyCount() != null)
            sb.append("DataPolicyCount: ").append(getDataPolicyCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AccessPolicyStats == false)
            return false;
        AccessPolicyStats other = (AccessPolicyStats) obj;
        if (other.getDataPolicyCount() == null ^ this.getDataPolicyCount() == null)
            return false;
        if (other.getDataPolicyCount() != null && other.getDataPolicyCount().equals(this.getDataPolicyCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataPolicyCount() == null) ? 0 : getDataPolicyCount().hashCode());
        return hashCode;
    }

    @Override
    public AccessPolicyStats clone() {
        try {
            return (AccessPolicyStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearchserverless.model.transform.AccessPolicyStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
