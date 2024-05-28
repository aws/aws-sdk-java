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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of CIS scan configurations filter criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/ListCisScanConfigurationsFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCisScanConfigurationsFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scanConfigurationArnFilters;
    /**
     * <p>
     * The list of scan name filters.
     * </p>
     */
    private java.util.List<CisStringFilter> scanNameFilters;
    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     */
    private java.util.List<TagFilter> targetResourceTagFilters;

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @return The list of scan configuration ARN filters.
     */

    public java.util.List<CisStringFilter> getScanConfigurationArnFilters() {
        return scanConfigurationArnFilters;
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     */

    public void setScanConfigurationArnFilters(java.util.Collection<CisStringFilter> scanConfigurationArnFilters) {
        if (scanConfigurationArnFilters == null) {
            this.scanConfigurationArnFilters = null;
            return;
        }

        this.scanConfigurationArnFilters = new java.util.ArrayList<CisStringFilter>(scanConfigurationArnFilters);
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanConfigurationArnFilters(java.util.Collection)} or
     * {@link #withScanConfigurationArnFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withScanConfigurationArnFilters(CisStringFilter... scanConfigurationArnFilters) {
        if (this.scanConfigurationArnFilters == null) {
            setScanConfigurationArnFilters(new java.util.ArrayList<CisStringFilter>(scanConfigurationArnFilters.length));
        }
        for (CisStringFilter ele : scanConfigurationArnFilters) {
            this.scanConfigurationArnFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan configuration ARN filters.
     * </p>
     * 
     * @param scanConfigurationArnFilters
     *        The list of scan configuration ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withScanConfigurationArnFilters(java.util.Collection<CisStringFilter> scanConfigurationArnFilters) {
        setScanConfigurationArnFilters(scanConfigurationArnFilters);
        return this;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @return The list of scan name filters.
     */

    public java.util.List<CisStringFilter> getScanNameFilters() {
        return scanNameFilters;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     */

    public void setScanNameFilters(java.util.Collection<CisStringFilter> scanNameFilters) {
        if (scanNameFilters == null) {
            this.scanNameFilters = null;
            return;
        }

        this.scanNameFilters = new java.util.ArrayList<CisStringFilter>(scanNameFilters);
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScanNameFilters(java.util.Collection)} or {@link #withScanNameFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withScanNameFilters(CisStringFilter... scanNameFilters) {
        if (this.scanNameFilters == null) {
            setScanNameFilters(new java.util.ArrayList<CisStringFilter>(scanNameFilters.length));
        }
        for (CisStringFilter ele : scanNameFilters) {
            this.scanNameFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of scan name filters.
     * </p>
     * 
     * @param scanNameFilters
     *        The list of scan name filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withScanNameFilters(java.util.Collection<CisStringFilter> scanNameFilters) {
        setScanNameFilters(scanNameFilters);
        return this;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @return The list of target resource tag filters.
     */

    public java.util.List<TagFilter> getTargetResourceTagFilters() {
        return targetResourceTagFilters;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     */

    public void setTargetResourceTagFilters(java.util.Collection<TagFilter> targetResourceTagFilters) {
        if (targetResourceTagFilters == null) {
            this.targetResourceTagFilters = null;
            return;
        }

        this.targetResourceTagFilters = new java.util.ArrayList<TagFilter>(targetResourceTagFilters);
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTargetResourceTagFilters(java.util.Collection)} or
     * {@link #withTargetResourceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withTargetResourceTagFilters(TagFilter... targetResourceTagFilters) {
        if (this.targetResourceTagFilters == null) {
            setTargetResourceTagFilters(new java.util.ArrayList<TagFilter>(targetResourceTagFilters.length));
        }
        for (TagFilter ele : targetResourceTagFilters) {
            this.targetResourceTagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of target resource tag filters.
     * </p>
     * 
     * @param targetResourceTagFilters
     *        The list of target resource tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCisScanConfigurationsFilterCriteria withTargetResourceTagFilters(java.util.Collection<TagFilter> targetResourceTagFilters) {
        setTargetResourceTagFilters(targetResourceTagFilters);
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
        if (getScanConfigurationArnFilters() != null)
            sb.append("ScanConfigurationArnFilters: ").append(getScanConfigurationArnFilters()).append(",");
        if (getScanNameFilters() != null)
            sb.append("ScanNameFilters: ").append(getScanNameFilters()).append(",");
        if (getTargetResourceTagFilters() != null)
            sb.append("TargetResourceTagFilters: ").append(getTargetResourceTagFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListCisScanConfigurationsFilterCriteria == false)
            return false;
        ListCisScanConfigurationsFilterCriteria other = (ListCisScanConfigurationsFilterCriteria) obj;
        if (other.getScanConfigurationArnFilters() == null ^ this.getScanConfigurationArnFilters() == null)
            return false;
        if (other.getScanConfigurationArnFilters() != null && other.getScanConfigurationArnFilters().equals(this.getScanConfigurationArnFilters()) == false)
            return false;
        if (other.getScanNameFilters() == null ^ this.getScanNameFilters() == null)
            return false;
        if (other.getScanNameFilters() != null && other.getScanNameFilters().equals(this.getScanNameFilters()) == false)
            return false;
        if (other.getTargetResourceTagFilters() == null ^ this.getTargetResourceTagFilters() == null)
            return false;
        if (other.getTargetResourceTagFilters() != null && other.getTargetResourceTagFilters().equals(this.getTargetResourceTagFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScanConfigurationArnFilters() == null) ? 0 : getScanConfigurationArnFilters().hashCode());
        hashCode = prime * hashCode + ((getScanNameFilters() == null) ? 0 : getScanNameFilters().hashCode());
        hashCode = prime * hashCode + ((getTargetResourceTagFilters() == null) ? 0 : getTargetResourceTagFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListCisScanConfigurationsFilterCriteria clone() {
        try {
            return (ListCisScanConfigurationsFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.ListCisScanConfigurationsFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
