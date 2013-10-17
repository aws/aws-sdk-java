/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.support.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the fields that indicate the statuses Trusted Advisor checks for which refreshes have been requested.
 * </p>
 */
public class TrustedAdvisorCheckRefreshStatus implements Serializable {

    /**
     * String that specifies the <i>checkId</i> value of the Trusted Advisor
     * check.
     */
    private String checkId;

    /**
     * Indicates the status of the Trusted Advisor check for which a refresh
     * has been requested.
     */
    private String status;

    /**
     * Indicates the time in milliseconds until a call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     * title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     * trigger a refresh.
     */
    private Long millisUntilNextRefreshable;

    /**
     * String that specifies the <i>checkId</i> value of the Trusted Advisor
     * check.
     *
     * @return String that specifies the <i>checkId</i> value of the Trusted Advisor
     *         check.
     */
    public String getCheckId() {
        return checkId;
    }
    
    /**
     * String that specifies the <i>checkId</i> value of the Trusted Advisor
     * check.
     *
     * @param checkId String that specifies the <i>checkId</i> value of the Trusted Advisor
     *         check.
     */
    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }
    
    /**
     * String that specifies the <i>checkId</i> value of the Trusted Advisor
     * check.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param checkId String that specifies the <i>checkId</i> value of the Trusted Advisor
     *         check.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckRefreshStatus withCheckId(String checkId) {
        this.checkId = checkId;
        return this;
    }

    /**
     * Indicates the status of the Trusted Advisor check for which a refresh
     * has been requested.
     *
     * @return Indicates the status of the Trusted Advisor check for which a refresh
     *         has been requested.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * Indicates the status of the Trusted Advisor check for which a refresh
     * has been requested.
     *
     * @param status Indicates the status of the Trusted Advisor check for which a refresh
     *         has been requested.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Indicates the status of the Trusted Advisor check for which a refresh
     * has been requested.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status Indicates the status of the Trusted Advisor check for which a refresh
     *         has been requested.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckRefreshStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Indicates the time in milliseconds until a call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     * title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     * trigger a refresh.
     *
     * @return Indicates the time in milliseconds until a call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     *         title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     *         trigger a refresh.
     */
    public Long getMillisUntilNextRefreshable() {
        return millisUntilNextRefreshable;
    }
    
    /**
     * Indicates the time in milliseconds until a call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     * title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     * trigger a refresh.
     *
     * @param millisUntilNextRefreshable Indicates the time in milliseconds until a call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     *         title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     *         trigger a refresh.
     */
    public void setMillisUntilNextRefreshable(Long millisUntilNextRefreshable) {
        this.millisUntilNextRefreshable = millisUntilNextRefreshable;
    }
    
    /**
     * Indicates the time in milliseconds until a call to <a
     * href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     * title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     * trigger a refresh.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param millisUntilNextRefreshable Indicates the time in milliseconds until a call to <a
     *         href="http://docs.aws.amazon.com/awssupport/latest/APIReference/API_RefreshTrustedAdvisorCheck.html"
     *         title="RefreshTrustedAdvisorCheck">RefreshTrustedAdvisorCheck</a> can
     *         trigger a refresh.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public TrustedAdvisorCheckRefreshStatus withMillisUntilNextRefreshable(Long millisUntilNextRefreshable) {
        this.millisUntilNextRefreshable = millisUntilNextRefreshable;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCheckId() != null) sb.append("CheckId: " + getCheckId() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getMillisUntilNextRefreshable() != null) sb.append("MillisUntilNextRefreshable: " + getMillisUntilNextRefreshable() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getMillisUntilNextRefreshable() == null) ? 0 : getMillisUntilNextRefreshable().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof TrustedAdvisorCheckRefreshStatus == false) return false;
        TrustedAdvisorCheckRefreshStatus other = (TrustedAdvisorCheckRefreshStatus)obj;
        
        if (other.getCheckId() == null ^ this.getCheckId() == null) return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getMillisUntilNextRefreshable() == null ^ this.getMillisUntilNextRefreshable() == null) return false;
        if (other.getMillisUntilNextRefreshable() != null && other.getMillisUntilNextRefreshable().equals(this.getMillisUntilNextRefreshable()) == false) return false; 
        return true;
    }
    
}
    