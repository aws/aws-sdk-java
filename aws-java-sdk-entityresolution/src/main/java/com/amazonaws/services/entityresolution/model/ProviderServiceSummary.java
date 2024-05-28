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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of <code>ProviderService</code> objects, each of which contain the fields <code>providerName</code>,
 * <code>providerServiceArn</code>, <code>providerServiceName</code>, and <code>providerServiceType</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/ProviderServiceSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProviderServiceSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     * </p>
     */
    private String providerServiceArn;
    /**
     * <p>
     * The display name of the provider service.
     * </p>
     */
    private String providerServiceDisplayName;
    /**
     * <p>
     * The name of the product that the provider service provides.
     * </p>
     */
    private String providerServiceName;
    /**
     * <p>
     * The type of provider service.
     * </p>
     */
    private String providerServiceType;

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @param providerName
     *        The name of the provider. This name is typically the company name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @return The name of the provider. This name is typically the company name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The name of the provider. This name is typically the company name.
     * </p>
     * 
     * @param providerName
     *        The name of the provider. This name is typically the company name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderServiceSummary withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     * </p>
     * 
     * @param providerServiceArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     */

    public void setProviderServiceArn(String providerServiceArn) {
        this.providerServiceArn = providerServiceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     */

    public String getProviderServiceArn() {
        return this.providerServiceArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     * </p>
     * 
     * @param providerServiceArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>providerService</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderServiceSummary withProviderServiceArn(String providerServiceArn) {
        setProviderServiceArn(providerServiceArn);
        return this;
    }

    /**
     * <p>
     * The display name of the provider service.
     * </p>
     * 
     * @param providerServiceDisplayName
     *        The display name of the provider service.
     */

    public void setProviderServiceDisplayName(String providerServiceDisplayName) {
        this.providerServiceDisplayName = providerServiceDisplayName;
    }

    /**
     * <p>
     * The display name of the provider service.
     * </p>
     * 
     * @return The display name of the provider service.
     */

    public String getProviderServiceDisplayName() {
        return this.providerServiceDisplayName;
    }

    /**
     * <p>
     * The display name of the provider service.
     * </p>
     * 
     * @param providerServiceDisplayName
     *        The display name of the provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderServiceSummary withProviderServiceDisplayName(String providerServiceDisplayName) {
        setProviderServiceDisplayName(providerServiceDisplayName);
        return this;
    }

    /**
     * <p>
     * The name of the product that the provider service provides.
     * </p>
     * 
     * @param providerServiceName
     *        The name of the product that the provider service provides.
     */

    public void setProviderServiceName(String providerServiceName) {
        this.providerServiceName = providerServiceName;
    }

    /**
     * <p>
     * The name of the product that the provider service provides.
     * </p>
     * 
     * @return The name of the product that the provider service provides.
     */

    public String getProviderServiceName() {
        return this.providerServiceName;
    }

    /**
     * <p>
     * The name of the product that the provider service provides.
     * </p>
     * 
     * @param providerServiceName
     *        The name of the product that the provider service provides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProviderServiceSummary withProviderServiceName(String providerServiceName) {
        setProviderServiceName(providerServiceName);
        return this;
    }

    /**
     * <p>
     * The type of provider service.
     * </p>
     * 
     * @param providerServiceType
     *        The type of provider service.
     * @see ServiceType
     */

    public void setProviderServiceType(String providerServiceType) {
        this.providerServiceType = providerServiceType;
    }

    /**
     * <p>
     * The type of provider service.
     * </p>
     * 
     * @return The type of provider service.
     * @see ServiceType
     */

    public String getProviderServiceType() {
        return this.providerServiceType;
    }

    /**
     * <p>
     * The type of provider service.
     * </p>
     * 
     * @param providerServiceType
     *        The type of provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ProviderServiceSummary withProviderServiceType(String providerServiceType) {
        setProviderServiceType(providerServiceType);
        return this;
    }

    /**
     * <p>
     * The type of provider service.
     * </p>
     * 
     * @param providerServiceType
     *        The type of provider service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public ProviderServiceSummary withProviderServiceType(ServiceType providerServiceType) {
        this.providerServiceType = providerServiceType.toString();
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
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderServiceArn() != null)
            sb.append("ProviderServiceArn: ").append(getProviderServiceArn()).append(",");
        if (getProviderServiceDisplayName() != null)
            sb.append("ProviderServiceDisplayName: ").append(getProviderServiceDisplayName()).append(",");
        if (getProviderServiceName() != null)
            sb.append("ProviderServiceName: ").append(getProviderServiceName()).append(",");
        if (getProviderServiceType() != null)
            sb.append("ProviderServiceType: ").append(getProviderServiceType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProviderServiceSummary == false)
            return false;
        ProviderServiceSummary other = (ProviderServiceSummary) obj;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderServiceArn() == null ^ this.getProviderServiceArn() == null)
            return false;
        if (other.getProviderServiceArn() != null && other.getProviderServiceArn().equals(this.getProviderServiceArn()) == false)
            return false;
        if (other.getProviderServiceDisplayName() == null ^ this.getProviderServiceDisplayName() == null)
            return false;
        if (other.getProviderServiceDisplayName() != null && other.getProviderServiceDisplayName().equals(this.getProviderServiceDisplayName()) == false)
            return false;
        if (other.getProviderServiceName() == null ^ this.getProviderServiceName() == null)
            return false;
        if (other.getProviderServiceName() != null && other.getProviderServiceName().equals(this.getProviderServiceName()) == false)
            return false;
        if (other.getProviderServiceType() == null ^ this.getProviderServiceType() == null)
            return false;
        if (other.getProviderServiceType() != null && other.getProviderServiceType().equals(this.getProviderServiceType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceArn() == null) ? 0 : getProviderServiceArn().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceDisplayName() == null) ? 0 : getProviderServiceDisplayName().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceName() == null) ? 0 : getProviderServiceName().hashCode());
        hashCode = prime * hashCode + ((getProviderServiceType() == null) ? 0 : getProviderServiceType().hashCode());
        return hashCode;
    }

    @Override
    public ProviderServiceSummary clone() {
        try {
            return (ProviderServiceSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.ProviderServiceSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
