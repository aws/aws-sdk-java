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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The combination of AWS service, linked account, Region, and usage type where a cost anomaly is observed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/RootCause" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RootCause implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The AWS service name associated with the cost anomaly.
     * </p>
     */
    private String service;
    /**
     * <p>
     * The AWS Region associated with the cost anomaly.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The linked account value associated with the cost anomaly.
     * </p>
     */
    private String linkedAccount;
    /**
     * <p>
     * The <code>UsageType</code> value associated with the cost anomaly.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * The AWS service name associated with the cost anomaly.
     * </p>
     * 
     * @param service
     *        The AWS service name associated with the cost anomaly.
     */

    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The AWS service name associated with the cost anomaly.
     * </p>
     * 
     * @return The AWS service name associated with the cost anomaly.
     */

    public String getService() {
        return this.service;
    }

    /**
     * <p>
     * The AWS service name associated with the cost anomaly.
     * </p>
     * 
     * @param service
     *        The AWS service name associated with the cost anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCause withService(String service) {
        setService(service);
        return this;
    }

    /**
     * <p>
     * The AWS Region associated with the cost anomaly.
     * </p>
     * 
     * @param region
     *        The AWS Region associated with the cost anomaly.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region associated with the cost anomaly.
     * </p>
     * 
     * @return The AWS Region associated with the cost anomaly.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The AWS Region associated with the cost anomaly.
     * </p>
     * 
     * @param region
     *        The AWS Region associated with the cost anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCause withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The linked account value associated with the cost anomaly.
     * </p>
     * 
     * @param linkedAccount
     *        The linked account value associated with the cost anomaly.
     */

    public void setLinkedAccount(String linkedAccount) {
        this.linkedAccount = linkedAccount;
    }

    /**
     * <p>
     * The linked account value associated with the cost anomaly.
     * </p>
     * 
     * @return The linked account value associated with the cost anomaly.
     */

    public String getLinkedAccount() {
        return this.linkedAccount;
    }

    /**
     * <p>
     * The linked account value associated with the cost anomaly.
     * </p>
     * 
     * @param linkedAccount
     *        The linked account value associated with the cost anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCause withLinkedAccount(String linkedAccount) {
        setLinkedAccount(linkedAccount);
        return this;
    }

    /**
     * <p>
     * The <code>UsageType</code> value associated with the cost anomaly.
     * </p>
     * 
     * @param usageType
     *        The <code>UsageType</code> value associated with the cost anomaly.
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The <code>UsageType</code> value associated with the cost anomaly.
     * </p>
     * 
     * @return The <code>UsageType</code> value associated with the cost anomaly.
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The <code>UsageType</code> value associated with the cost anomaly.
     * </p>
     * 
     * @param usageType
     *        The <code>UsageType</code> value associated with the cost anomaly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RootCause withUsageType(String usageType) {
        setUsageType(usageType);
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
        if (getService() != null)
            sb.append("Service: ").append(getService()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getLinkedAccount() != null)
            sb.append("LinkedAccount: ").append(getLinkedAccount()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RootCause == false)
            return false;
        RootCause other = (RootCause) obj;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getLinkedAccount() == null ^ this.getLinkedAccount() == null)
            return false;
        if (other.getLinkedAccount() != null && other.getLinkedAccount().equals(this.getLinkedAccount()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getLinkedAccount() == null) ? 0 : getLinkedAccount().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        return hashCode;
    }

    @Override
    public RootCause clone() {
        try {
            return (RootCause) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.RootCauseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
