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
 * The CIS scan result details filter criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisScanResultDetailsFilterCriteria"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisScanResultDetailsFilterCriteria implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The criteria's check ID filters.
     * </p>
     */
    private java.util.List<CisStringFilter> checkIdFilters;
    /**
     * <p>
     * The criteria's finding ARN filters.
     * </p>
     */
    private java.util.List<CisStringFilter> findingArnFilters;
    /**
     * <p>
     * The criteria's finding status filters.
     * </p>
     */
    private java.util.List<CisFindingStatusFilter> findingStatusFilters;
    /**
     * <p>
     * The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to a
     * profile.
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

    public CisScanResultDetailsFilterCriteria withCheckIdFilters(CisStringFilter... checkIdFilters) {
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

    public CisScanResultDetailsFilterCriteria withCheckIdFilters(java.util.Collection<CisStringFilter> checkIdFilters) {
        setCheckIdFilters(checkIdFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's finding ARN filters.
     * </p>
     * 
     * @return The criteria's finding ARN filters.
     */

    public java.util.List<CisStringFilter> getFindingArnFilters() {
        return findingArnFilters;
    }

    /**
     * <p>
     * The criteria's finding ARN filters.
     * </p>
     * 
     * @param findingArnFilters
     *        The criteria's finding ARN filters.
     */

    public void setFindingArnFilters(java.util.Collection<CisStringFilter> findingArnFilters) {
        if (findingArnFilters == null) {
            this.findingArnFilters = null;
            return;
        }

        this.findingArnFilters = new java.util.ArrayList<CisStringFilter>(findingArnFilters);
    }

    /**
     * <p>
     * The criteria's finding ARN filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingArnFilters(java.util.Collection)} or {@link #withFindingArnFilters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param findingArnFilters
     *        The criteria's finding ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withFindingArnFilters(CisStringFilter... findingArnFilters) {
        if (this.findingArnFilters == null) {
            setFindingArnFilters(new java.util.ArrayList<CisStringFilter>(findingArnFilters.length));
        }
        for (CisStringFilter ele : findingArnFilters) {
            this.findingArnFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's finding ARN filters.
     * </p>
     * 
     * @param findingArnFilters
     *        The criteria's finding ARN filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withFindingArnFilters(java.util.Collection<CisStringFilter> findingArnFilters) {
        setFindingArnFilters(findingArnFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's finding status filters.
     * </p>
     * 
     * @return The criteria's finding status filters.
     */

    public java.util.List<CisFindingStatusFilter> getFindingStatusFilters() {
        return findingStatusFilters;
    }

    /**
     * <p>
     * The criteria's finding status filters.
     * </p>
     * 
     * @param findingStatusFilters
     *        The criteria's finding status filters.
     */

    public void setFindingStatusFilters(java.util.Collection<CisFindingStatusFilter> findingStatusFilters) {
        if (findingStatusFilters == null) {
            this.findingStatusFilters = null;
            return;
        }

        this.findingStatusFilters = new java.util.ArrayList<CisFindingStatusFilter>(findingStatusFilters);
    }

    /**
     * <p>
     * The criteria's finding status filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFindingStatusFilters(java.util.Collection)} or {@link #withFindingStatusFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param findingStatusFilters
     *        The criteria's finding status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withFindingStatusFilters(CisFindingStatusFilter... findingStatusFilters) {
        if (this.findingStatusFilters == null) {
            setFindingStatusFilters(new java.util.ArrayList<CisFindingStatusFilter>(findingStatusFilters.length));
        }
        for (CisFindingStatusFilter ele : findingStatusFilters) {
            this.findingStatusFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The criteria's finding status filters.
     * </p>
     * 
     * @param findingStatusFilters
     *        The criteria's finding status filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withFindingStatusFilters(java.util.Collection<CisFindingStatusFilter> findingStatusFilters) {
        setFindingStatusFilters(findingStatusFilters);
        return this;
    }

    /**
     * <p>
     * The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to a
     * profile.
     * </p>
     * 
     * @return The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns
     *         to a profile.
     */

    public java.util.List<CisSecurityLevelFilter> getSecurityLevelFilters() {
        return securityLevelFilters;
    }

    /**
     * <p>
     * The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to a
     * profile.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to
     *        a profile.
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
     * The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to a
     * profile.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityLevelFilters(java.util.Collection)} or {@link #withSecurityLevelFilters(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to
     *        a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withSecurityLevelFilters(CisSecurityLevelFilter... securityLevelFilters) {
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
     * The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to a
     * profile.
     * </p>
     * 
     * @param securityLevelFilters
     *        The criteria's security level filters. . Security level refers to the Benchmark levels that CIS assigns to
     *        a profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisScanResultDetailsFilterCriteria withSecurityLevelFilters(java.util.Collection<CisSecurityLevelFilter> securityLevelFilters) {
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

    public CisScanResultDetailsFilterCriteria withTitleFilters(CisStringFilter... titleFilters) {
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

    public CisScanResultDetailsFilterCriteria withTitleFilters(java.util.Collection<CisStringFilter> titleFilters) {
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
        if (getCheckIdFilters() != null)
            sb.append("CheckIdFilters: ").append(getCheckIdFilters()).append(",");
        if (getFindingArnFilters() != null)
            sb.append("FindingArnFilters: ").append(getFindingArnFilters()).append(",");
        if (getFindingStatusFilters() != null)
            sb.append("FindingStatusFilters: ").append(getFindingStatusFilters()).append(",");
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

        if (obj instanceof CisScanResultDetailsFilterCriteria == false)
            return false;
        CisScanResultDetailsFilterCriteria other = (CisScanResultDetailsFilterCriteria) obj;
        if (other.getCheckIdFilters() == null ^ this.getCheckIdFilters() == null)
            return false;
        if (other.getCheckIdFilters() != null && other.getCheckIdFilters().equals(this.getCheckIdFilters()) == false)
            return false;
        if (other.getFindingArnFilters() == null ^ this.getFindingArnFilters() == null)
            return false;
        if (other.getFindingArnFilters() != null && other.getFindingArnFilters().equals(this.getFindingArnFilters()) == false)
            return false;
        if (other.getFindingStatusFilters() == null ^ this.getFindingStatusFilters() == null)
            return false;
        if (other.getFindingStatusFilters() != null && other.getFindingStatusFilters().equals(this.getFindingStatusFilters()) == false)
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

        hashCode = prime * hashCode + ((getCheckIdFilters() == null) ? 0 : getCheckIdFilters().hashCode());
        hashCode = prime * hashCode + ((getFindingArnFilters() == null) ? 0 : getFindingArnFilters().hashCode());
        hashCode = prime * hashCode + ((getFindingStatusFilters() == null) ? 0 : getFindingStatusFilters().hashCode());
        hashCode = prime * hashCode + ((getSecurityLevelFilters() == null) ? 0 : getSecurityLevelFilters().hashCode());
        hashCode = prime * hashCode + ((getTitleFilters() == null) ? 0 : getTitleFilters().hashCode());
        return hashCode;
    }

    @Override
    public CisScanResultDetailsFilterCriteria clone() {
        try {
            return (CisScanResultDetailsFilterCriteria) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisScanResultDetailsFilterCriteriaMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
