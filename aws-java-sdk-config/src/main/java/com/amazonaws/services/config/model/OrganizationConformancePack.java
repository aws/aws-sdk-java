/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An organization conformance pack that has information about conformance packs that AWS Config creates in member
 * accounts.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/OrganizationConformancePack" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OrganizationConformancePack implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name you assign to an organization conformance pack.
     * </p>
     */
    private String organizationConformancePackName;
    /**
     * <p>
     * Amazon Resource Name (ARN) of organization conformance pack.
     * </p>
     */
    private String organizationConformancePackArn;
    /**
     * <p>
     * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template
     * that is used to create a pack.
     * </p>
     */
    private String deliveryS3Bucket;
    /**
     * <p>
     * Any folder structure you want to add to an Amazon S3 bucket.
     * </p>
     */
    private String deliveryS3KeyPrefix;
    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter> conformancePackInputParameters;
    /**
     * <p>
     * A comma-separated list of accounts excluded from organization conformance pack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> excludedAccounts;
    /**
     * <p>
     * Last time when organization conformation pack was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name you assign to an organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name you assign to an organization conformance pack.
     */

    public void setOrganizationConformancePackName(String organizationConformancePackName) {
        this.organizationConformancePackName = organizationConformancePackName;
    }

    /**
     * <p>
     * The name you assign to an organization conformance pack.
     * </p>
     * 
     * @return The name you assign to an organization conformance pack.
     */

    public String getOrganizationConformancePackName() {
        return this.organizationConformancePackName;
    }

    /**
     * <p>
     * The name you assign to an organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackName
     *        The name you assign to an organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withOrganizationConformancePackName(String organizationConformancePackName) {
        setOrganizationConformancePackName(organizationConformancePackName);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackArn
     *        Amazon Resource Name (ARN) of organization conformance pack.
     */

    public void setOrganizationConformancePackArn(String organizationConformancePackArn) {
        this.organizationConformancePackArn = organizationConformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of organization conformance pack.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of organization conformance pack.
     */

    public String getOrganizationConformancePackArn() {
        return this.organizationConformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of organization conformance pack.
     * </p>
     * 
     * @param organizationConformancePackArn
     *        Amazon Resource Name (ARN) of organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withOrganizationConformancePackArn(String organizationConformancePackArn) {
        setOrganizationConformancePackArn(organizationConformancePackArn);
        return this;
    }

    /**
     * <p>
     * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template
     * that is used to create a pack.
     * </p>
     * 
     * @param deliveryS3Bucket
     *        Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack
     *        template that is used to create a pack.
     */

    public void setDeliveryS3Bucket(String deliveryS3Bucket) {
        this.deliveryS3Bucket = deliveryS3Bucket;
    }

    /**
     * <p>
     * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template
     * that is used to create a pack.
     * </p>
     * 
     * @return Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack
     *         template that is used to create a pack.
     */

    public String getDeliveryS3Bucket() {
        return this.deliveryS3Bucket;
    }

    /**
     * <p>
     * Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack template
     * that is used to create a pack.
     * </p>
     * 
     * @param deliveryS3Bucket
     *        Location of an Amazon S3 bucket where AWS Config can deliver evaluation results and conformance pack
     *        template that is used to create a pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withDeliveryS3Bucket(String deliveryS3Bucket) {
        setDeliveryS3Bucket(deliveryS3Bucket);
        return this;
    }

    /**
     * <p>
     * Any folder structure you want to add to an Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        Any folder structure you want to add to an Amazon S3 bucket.
     */

    public void setDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * Any folder structure you want to add to an Amazon S3 bucket.
     * </p>
     * 
     * @return Any folder structure you want to add to an Amazon S3 bucket.
     */

    public String getDeliveryS3KeyPrefix() {
        return this.deliveryS3KeyPrefix;
    }

    /**
     * <p>
     * Any folder structure you want to add to an Amazon S3 bucket.
     * </p>
     * 
     * @param deliveryS3KeyPrefix
     *        Any folder structure you want to add to an Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withDeliveryS3KeyPrefix(String deliveryS3KeyPrefix) {
        setDeliveryS3KeyPrefix(deliveryS3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @return A list of <code>ConformancePackInputParameter</code> objects.
     */

    public java.util.List<ConformancePackInputParameter> getConformancePackInputParameters() {
        if (conformancePackInputParameters == null) {
            conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>();
        }
        return conformancePackInputParameters;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     */

    public void setConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        if (conformancePackInputParameters == null) {
            this.conformancePackInputParameters = null;
            return;
        }

        this.conformancePackInputParameters = new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters);
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConformancePackInputParameters(java.util.Collection)} or
     * {@link #withConformancePackInputParameters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withConformancePackInputParameters(ConformancePackInputParameter... conformancePackInputParameters) {
        if (this.conformancePackInputParameters == null) {
            setConformancePackInputParameters(new com.amazonaws.internal.SdkInternalList<ConformancePackInputParameter>(conformancePackInputParameters.length));
        }
        for (ConformancePackInputParameter ele : conformancePackInputParameters) {
            this.conformancePackInputParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ConformancePackInputParameter</code> objects.
     * </p>
     * 
     * @param conformancePackInputParameters
     *        A list of <code>ConformancePackInputParameter</code> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withConformancePackInputParameters(java.util.Collection<ConformancePackInputParameter> conformancePackInputParameters) {
        setConformancePackInputParameters(conformancePackInputParameters);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of accounts excluded from organization conformance pack.
     * </p>
     * 
     * @return A comma-separated list of accounts excluded from organization conformance pack.
     */

    public java.util.List<String> getExcludedAccounts() {
        if (excludedAccounts == null) {
            excludedAccounts = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return excludedAccounts;
    }

    /**
     * <p>
     * A comma-separated list of accounts excluded from organization conformance pack.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts excluded from organization conformance pack.
     */

    public void setExcludedAccounts(java.util.Collection<String> excludedAccounts) {
        if (excludedAccounts == null) {
            this.excludedAccounts = null;
            return;
        }

        this.excludedAccounts = new com.amazonaws.internal.SdkInternalList<String>(excludedAccounts);
    }

    /**
     * <p>
     * A comma-separated list of accounts excluded from organization conformance pack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedAccounts(java.util.Collection)} or {@link #withExcludedAccounts(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts excluded from organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withExcludedAccounts(String... excludedAccounts) {
        if (this.excludedAccounts == null) {
            setExcludedAccounts(new com.amazonaws.internal.SdkInternalList<String>(excludedAccounts.length));
        }
        for (String ele : excludedAccounts) {
            this.excludedAccounts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of accounts excluded from organization conformance pack.
     * </p>
     * 
     * @param excludedAccounts
     *        A comma-separated list of accounts excluded from organization conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withExcludedAccounts(java.util.Collection<String> excludedAccounts) {
        setExcludedAccounts(excludedAccounts);
        return this;
    }

    /**
     * <p>
     * Last time when organization conformation pack was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        Last time when organization conformation pack was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * Last time when organization conformation pack was updated.
     * </p>
     * 
     * @return Last time when organization conformation pack was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * Last time when organization conformation pack was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        Last time when organization conformation pack was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OrganizationConformancePack withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getOrganizationConformancePackName() != null)
            sb.append("OrganizationConformancePackName: ").append(getOrganizationConformancePackName()).append(",");
        if (getOrganizationConformancePackArn() != null)
            sb.append("OrganizationConformancePackArn: ").append(getOrganizationConformancePackArn()).append(",");
        if (getDeliveryS3Bucket() != null)
            sb.append("DeliveryS3Bucket: ").append(getDeliveryS3Bucket()).append(",");
        if (getDeliveryS3KeyPrefix() != null)
            sb.append("DeliveryS3KeyPrefix: ").append(getDeliveryS3KeyPrefix()).append(",");
        if (getConformancePackInputParameters() != null)
            sb.append("ConformancePackInputParameters: ").append(getConformancePackInputParameters()).append(",");
        if (getExcludedAccounts() != null)
            sb.append("ExcludedAccounts: ").append(getExcludedAccounts()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrganizationConformancePack == false)
            return false;
        OrganizationConformancePack other = (OrganizationConformancePack) obj;
        if (other.getOrganizationConformancePackName() == null ^ this.getOrganizationConformancePackName() == null)
            return false;
        if (other.getOrganizationConformancePackName() != null
                && other.getOrganizationConformancePackName().equals(this.getOrganizationConformancePackName()) == false)
            return false;
        if (other.getOrganizationConformancePackArn() == null ^ this.getOrganizationConformancePackArn() == null)
            return false;
        if (other.getOrganizationConformancePackArn() != null
                && other.getOrganizationConformancePackArn().equals(this.getOrganizationConformancePackArn()) == false)
            return false;
        if (other.getDeliveryS3Bucket() == null ^ this.getDeliveryS3Bucket() == null)
            return false;
        if (other.getDeliveryS3Bucket() != null && other.getDeliveryS3Bucket().equals(this.getDeliveryS3Bucket()) == false)
            return false;
        if (other.getDeliveryS3KeyPrefix() == null ^ this.getDeliveryS3KeyPrefix() == null)
            return false;
        if (other.getDeliveryS3KeyPrefix() != null && other.getDeliveryS3KeyPrefix().equals(this.getDeliveryS3KeyPrefix()) == false)
            return false;
        if (other.getConformancePackInputParameters() == null ^ this.getConformancePackInputParameters() == null)
            return false;
        if (other.getConformancePackInputParameters() != null
                && other.getConformancePackInputParameters().equals(this.getConformancePackInputParameters()) == false)
            return false;
        if (other.getExcludedAccounts() == null ^ this.getExcludedAccounts() == null)
            return false;
        if (other.getExcludedAccounts() != null && other.getExcludedAccounts().equals(this.getExcludedAccounts()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOrganizationConformancePackName() == null) ? 0 : getOrganizationConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationConformancePackArn() == null) ? 0 : getOrganizationConformancePackArn().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3Bucket() == null) ? 0 : getDeliveryS3Bucket().hashCode());
        hashCode = prime * hashCode + ((getDeliveryS3KeyPrefix() == null) ? 0 : getDeliveryS3KeyPrefix().hashCode());
        hashCode = prime * hashCode + ((getConformancePackInputParameters() == null) ? 0 : getConformancePackInputParameters().hashCode());
        hashCode = prime * hashCode + ((getExcludedAccounts() == null) ? 0 : getExcludedAccounts().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public OrganizationConformancePack clone() {
        try {
            return (OrganizationConformancePack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.OrganizationConformancePackMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
