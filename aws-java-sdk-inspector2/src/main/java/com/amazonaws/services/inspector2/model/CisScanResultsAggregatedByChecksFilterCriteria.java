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
 * The scan results aggregated by checks filter criteria.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScanResultsAggregatedByChecksFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultsAggregatedByChecksFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> accountIdFilters;
    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> checkIdFilters;
    /**
     * <p>
     * The criteria's failed resources filters.
     * </p>
     */
    private java.util.List<CisNumberFilter> failedResourcesFilters;
    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     */
    private java.util.List<CisStringFilter> platformFilters;
    /**
     * <p>
     * The criteria's security level filters.
     * </p>
     */
    private java.util.List<CisSecurityLevelFilter> securityLevelFilters;
    /**
     * <p>
     * The criteria's title filters.
     * </p>
     */
    private java.util.List<CisStringFilter> titleFilters;

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @return The criteria's account ID filters.
     */

    public java.util.List<CisStringFilter> getAccountIdFilters() {
        return accountIdFilters;
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     */

    public void setAccountIdFilters(java.util.Collection<CisStringFilter> accountIdFilters) {
        if (accountIdFilters == null) {
            this.accountIdFilters = null;
            return;
        }

        this.accountIdFilters = new java.util.ArrayList<CisStringFilter>(accountIdFilters);
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAccountIdFilters(java.util.Collection)} or {@link #withAccountIdFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withAccountIdFilters(CisStringFilter... accountIdFilters) {
        if (this.accountIdFilters == null) {
            setAccountIdFilters(new java.util.ArrayList<CisStringFilter>(accountIdFilters.length));
        }
        for (CisStringFilter ele : accountIdFilters) {
            this.accountIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's account ID filters.
     * </p>
     * 
     * @param accountIdFilters
     *        The criteria's account ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withAccountIdFilters(java.util.Collection<CisStringFilter> accountIdFilters) {
        setAccountIdFilters(accountIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @return The criteria's check ID filters.
     */

    public java.util.List<CisStringFilter> getCheckIdFilters() {
        return checkIdFilters;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     */

    public void setCheckIdFilters(java.util.Collection<CisStringFilter> checkIdFilters) {
        if (checkIdFilters == null) {
            this.checkIdFilters = null;
            return;
        }

        this.checkIdFilters = new java.util.ArrayList<CisStringFilter>(checkIdFilters);
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCheckIdFilters(java.util.Collection)} or {@link #withCheckIdFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withCheckIdFilters(CisStringFilter... checkIdFilters) {
        if (this.checkIdFilters == null) {
            setCheckIdFilters(new java.util.ArrayList<CisStringFilter>(checkIdFilters.length));
        }
        for (CisStringFilter ele : checkIdFilters) {
            this.checkIdFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     * 
     * @param checkIdFilters
     *        The criteria's check ID filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withCheckIdFilters(java.util.Collection<CisStringFilter> checkIdFilters) {
        setCheckIdFilters(checkIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's failed resources filters.
     * </p>
     * 
     * @return The criteria's failed resources filters.
     */

    public java.util.List<CisNumberFilter> getFailedResourcesFilters() {
        return failedResourcesFilters;
    }

    /**
     * <p>
     * The criteria's failed resources filters.
     * </p>
     * 
     * @param failedResourcesFilters
     *        The criteria's failed resources filters.
     */

    public void setFailedResourcesFilters(java.util.Collection<CisNumberFilter> failedResourcesFilters) {
        if (failedResourcesFilters == null) {
            this.failedResourcesFilters = null;
            return;
        }

        this.failedResourcesFilters = new java.util.ArrayList<CisNumberFilter>(failedResourcesFilters);
    }

    /**
     * <p>
     * The criteria's failed resources filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedResourcesFilters(java.util.Collection)} or
     * {@link #withFailedResourcesFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param failedResourcesFilters
     *        The criteria's failed resources filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withFailedResourcesFilters(CisNumberFilter... failedResourcesFilters) {
        if (this.failedResourcesFilters == null) {
            setFailedResourcesFilters(new java.util.ArrayList<CisNumberFilter>(failedResourcesFilters.length));
        }
        for (CisNumberFilter ele : failedResourcesFilters) {
            this.failedResourcesFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's failed resources filters.
     * </p>
     * 
     * @param failedResourcesFilters
     *        The criteria's failed resources filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withFailedResourcesFilters(java.util.Collection<CisNumberFilter> failedResourcesFilters) {
        setFailedResourcesFilters(failedResourcesFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @return The criteria's platform filters.
     */

    public java.util.List<CisStringFilter> getPlatformFilters() {
        return platformFilters;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     */

    public void setPlatformFilters(java.util.Collection<CisStringFilter> platformFilters) {
        if (platformFilters == null) {
            this.platformFilters = null;
            return;
        }

        this.platformFilters = new java.util.ArrayList<CisStringFilter>(platformFilters);
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlatformFilters(java.util.Collection)} or {@link #withPlatformFilters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withPlatformFilters(CisStringFilter... platformFilters) {
        if (this.platformFilters == null) {
            setPlatformFilters(new java.util.ArrayList<CisStringFilter>(platformFilters.length));
        }
        for (CisStringFilter ele : platformFilters) {
            this.platformFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's platform filters.
     * </p>
     * 
     * @param platformFilters
     *        The criteria's platform filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withPlatformFilters(java.util.Collection<CisStringFilter> platformFilters) {
        setPlatformFilters(platformFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's security level filters.
     * </p>
     * 
     * @return The criteria's security level filters.
     */

    public java.util.List<CisSecurityLevelFilter> getSecurityLevelFilters() {
        return securityLevelFilters;
    }

    /**
     * <p>
     * The criteria's security level filters.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters.
     */

    public void setSecurityLevelFilters(java.util.Collection<CisSecurityLevelFilter> securityLevelFilters) {
        if (securityLevelFilters == null) {
            this.securityLevelFilters = null;
            return;
        }

        this.securityLevelFilters = new java.util.ArrayList<CisSecurityLevelFilter>(securityLevelFilters);
    }

    /**
     * <p>
     * The criteria's security level filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityLevelFilters(java.util.Collection)} or {@link #withSecurityLevelFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withSecurityLevelFilters(CisSecurityLevelFilter... securityLevelFilters) {
        if (this.securityLevelFilters == null) {
            setSecurityLevelFilters(new java.util.ArrayList<CisSecurityLevelFilter>(securityLevelFilters.length));
        }
        for (CisSecurityLevelFilter ele : securityLevelFilters) {
            this.securityLevelFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's security level filters.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withSecurityLevelFilters(java.util.Collection<CisSecurityLevelFilter> securityLevelFilters) {
        setSecurityLevelFilters(securityLevelFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's title filters.
     * </p>
     * 
     * @return The criteria's title filters.
     */

    public java.util.List<CisStringFilter> getTitleFilters() {
        return titleFilters;
    }

    /**
     * <p>
     * The criteria's title filters.
     * </p>
     * 
     * @param titleFilters
     *        The criteria's title filters.
     */

    public void setTitleFilters(java.util.Collection<CisStringFilter> titleFilters) {
        if (titleFilters == null) {
            this.titleFilters = null;
            return;
        }

        this.titleFilters = new java.util.ArrayList<CisStringFilter>(titleFilters);
    }

    /**
     * <p>
     * The criteria's title filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTitleFilters(java.util.Collection)} or {@link #withTitleFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param titleFilters
     *        The criteria's title filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withTitleFilters(CisStringFilter... titleFilters) {
        if (this.titleFilters == null) {
            setTitleFilters(new java.util.ArrayList<CisStringFilter>(titleFilters.length));
        }
        for (CisStringFilter ele : titleFilters) {
            this.titleFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's title filters.
     * </p>
     * 
     * @param titleFilters
     *        The criteria's title filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultsAggregatedByChecksFilterCriteria withTitleFilters(java.util.Collection<CisStringFilter> titleFilters) {
        setTitleFilters(titleFilters);
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
        if (getAccountIdFilters() != null)
            sb.append("AccountIdFilters: ").append(getAccountIdFilters()).append(",");
        if (getCheckIdFilters() != null)
            sb.append("CheckIdFilters: ").append(getCheckIdFilters()).append(",");
        if (getFailedResourcesFilters() != null)
            sb.append("FailedResourcesFilters: ").append(getFailedResourcesFilters()).append(",");
        if (getPlatformFilters() != null)
            sb.append("PlatformFilters: ").append(getPlatformFilters()).append(",");
        if (getSecurityLevelFilters() != null)
            sb.append("SecurityLevelFilters: ").append(getSecurityLevelFilters()).append(",");
        if (getTitleFilters() != null)
            sb.append("TitleFilters: ").append(getTitleFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisScanResultsAggregatedByChecksFilterCriteria == false)
            return false;
        CisScanResultsAggregatedByChecksFilterCriteria other = (CisScanResultsAggregatedByChecksFilterCriteria) obj;
        if (other.getAccountIdFilters() == null ^ this.getAccountIdFilters() == null)
            return false;
        if (other.getAccountIdFilters() != null && other.getAccountIdFilters().equals(this.getAccountIdFilters()) == false)
            return false;
        if (other.getCheckIdFilters() == null ^ this.getCheckIdFilters() == null)
            return false;
        if (other.getCheckIdFilters() != null && other.getCheckIdFilters().equals(this.getCheckIdFilters()) == false)
            return false;
        if (other.getFailedResourcesFilters() == null ^ this.getFailedResourcesFilters() == null)
            return false;
        if (other.getFailedResourcesFilters() != null && other.getFailedResourcesFilters().equals(this.getFailedResourcesFilters()) == false)
            return false;
        if (other.getPlatformFilters() == null ^ this.getPlatformFilters() == null)
            return false;
        if (other.getPlatformFilters() != null && other.getPlatformFilters().equals(this.getPlatformFilters()) == false)
            return false;
        if (other.getSecurityLevelFilters() == null ^ this.getSecurityLevelFilters() == null)
            return false;
        if (other.getSecurityLevelFilters() != null && other.getSecurityLevelFilters().equals(this.getSecurityLevelFilters()) == false)
            return false;
        if (other.getTitleFilters() == null ^ this.getTitleFilters() == null)
            return false;
        if (other.getTitleFilters() != null && other.getTitleFilters().equals(this.getTitleFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountIdFilters() == null) ? 0 : getAccountIdFilters().hashCode());
        hashCode = prime * hashCode + ((getCheckIdFilters() == null) ? 0 : getCheckIdFilters().hashCode());
        hashCode = prime * hashCode + ((getFailedResourcesFilters() == null) ? 0 : getFailedResourcesFilters().hashCode());
        hashCode = prime * hashCode + ((getPlatformFilters() == null) ? 0 : getPlatformFilters().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevelFilters() == null) ? 0 : getSecurityLevelFilters().hashCode());
        hashCode = prime * hashCode + ((getTitleFilters() == null) ? 0 : getTitleFilters().hashCode());
        return hashCode;
    }

    @Override
    public CisScanResultsAggregatedByChecksFilterCriteria clone() {
        try {
            return (CisScanResultsAggregatedByChecksFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanResultsAggregatedByChecksFilterCriteriaMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
