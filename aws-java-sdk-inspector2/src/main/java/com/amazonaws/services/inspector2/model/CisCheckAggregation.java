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
 * A CIS check.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/CisCheckAggregation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CisCheckAggregation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The account ID for the CIS check.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The description for the CIS check.
     * </p>
     */
    private String checkDescription;
    /**
     * <p>
     * The check ID for the CIS check.
     * </p>
     */
    private String checkId;
    /**
     * <p>
     * The CIS check level.
     * </p>
     */
    private String level;
    /**
     * <p>
     * The CIS check platform.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The scan ARN for the CIS check scan ARN.
     * </p>
     */
    private String scanArn;
    /**
     * <p>
     * The CIS check status counts.
     * </p>
     */
    private StatusCounts statusCounts;
    /**
     * <p>
     * The CIS check title.
     * </p>
     */
    private String title;

    /**
     * <p>
     * The account ID for the CIS check.
     * </p>
     * 
     * @param accountId
     *        The account ID for the CIS check.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID for the CIS check.
     * </p>
     * 
     * @return The account ID for the CIS check.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID for the CIS check.
     * </p>
     * 
     * @param accountId
     *        The account ID for the CIS check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The description for the CIS check.
     * </p>
     * 
     * @param checkDescription
     *        The description for the CIS check.
     */

    public void setCheckDescription(String checkDescription) {
        this.checkDescription = checkDescription;
    }

    /**
     * <p>
     * The description for the CIS check.
     * </p>
     * 
     * @return The description for the CIS check.
     */

    public String getCheckDescription() {
        return this.checkDescription;
    }

    /**
     * <p>
     * The description for the CIS check.
     * </p>
     * 
     * @param checkDescription
     *        The description for the CIS check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withCheckDescription(String checkDescription) {
        setCheckDescription(checkDescription);
        return this;
    }

    /**
     * <p>
     * The check ID for the CIS check.
     * </p>
     * 
     * @param checkId
     *        The check ID for the CIS check.
     */

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    /**
     * <p>
     * The check ID for the CIS check.
     * </p>
     * 
     * @return The check ID for the CIS check.
     */

    public String getCheckId() {
        return this.checkId;
    }

    /**
     * <p>
     * The check ID for the CIS check.
     * </p>
     * 
     * @param checkId
     *        The check ID for the CIS check.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withCheckId(String checkId) {
        setCheckId(checkId);
        return this;
    }

    /**
     * <p>
     * The CIS check level.
     * </p>
     * 
     * @param level
     *        The CIS check level.
     * @see CisSecurityLevel
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The CIS check level.
     * </p>
     * 
     * @return The CIS check level.
     * @see CisSecurityLevel
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The CIS check level.
     * </p>
     * 
     * @param level
     *        The CIS check level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisCheckAggregation withLevel(String level) {
        setLevel(level);
        return this;
    }

    /**
     * <p>
     * The CIS check level.
     * </p>
     * 
     * @param level
     *        The CIS check level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CisSecurityLevel
     */

    public CisCheckAggregation withLevel(CisSecurityLevel level) {
        this.level = level.toString();
        return this;
    }

    /**
     * <p>
     * The CIS check platform.
     * </p>
     * 
     * @param platform
     *        The CIS check platform.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The CIS check platform.
     * </p>
     * 
     * @return The CIS check platform.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The CIS check platform.
     * </p>
     * 
     * @param platform
     *        The CIS check platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The scan ARN for the CIS check scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN for the CIS check scan ARN.
     */

    public void setScanArn(String scanArn) {
        this.scanArn = scanArn;
    }

    /**
     * <p>
     * The scan ARN for the CIS check scan ARN.
     * </p>
     * 
     * @return The scan ARN for the CIS check scan ARN.
     */

    public String getScanArn() {
        return this.scanArn;
    }

    /**
     * <p>
     * The scan ARN for the CIS check scan ARN.
     * </p>
     * 
     * @param scanArn
     *        The scan ARN for the CIS check scan ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withScanArn(String scanArn) {
        setScanArn(scanArn);
        return this;
    }

    /**
     * <p>
     * The CIS check status counts.
     * </p>
     * 
     * @param statusCounts
     *        The CIS check status counts.
     */

    public void setStatusCounts(StatusCounts statusCounts) {
        this.statusCounts = statusCounts;
    }

    /**
     * <p>
     * The CIS check status counts.
     * </p>
     * 
     * @return The CIS check status counts.
     */

    public StatusCounts getStatusCounts() {
        return this.statusCounts;
    }

    /**
     * <p>
     * The CIS check status counts.
     * </p>
     * 
     * @param statusCounts
     *        The CIS check status counts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withStatusCounts(StatusCounts statusCounts) {
        setStatusCounts(statusCounts);
        return this;
    }

    /**
     * <p>
     * The CIS check title.
     * </p>
     * 
     * @param title
     *        The CIS check title.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * <p>
     * The CIS check title.
     * </p>
     * 
     * @return The CIS check title.
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * <p>
     * The CIS check title.
     * </p>
     * 
     * @param title
     *        The CIS check title.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CisCheckAggregation withTitle(String title) {
        setTitle(title);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getCheckDescription() != null)
            sb.append("CheckDescription: ").append(getCheckDescription()).append(",");
        if (getCheckId() != null)
            sb.append("CheckId: ").append(getCheckId()).append(",");
        if (getLevel() != null)
            sb.append("Level: ").append(getLevel()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getScanArn() != null)
            sb.append("ScanArn: ").append(getScanArn()).append(",");
        if (getStatusCounts() != null)
            sb.append("StatusCounts: ").append(getStatusCounts()).append(",");
        if (getTitle() != null)
            sb.append("Title: ").append(getTitle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CisCheckAggregation == false)
            return false;
        CisCheckAggregation other = (CisCheckAggregation) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getCheckDescription() == null ^ this.getCheckDescription() == null)
            return false;
        if (other.getCheckDescription() != null && other.getCheckDescription().equals(this.getCheckDescription()) == false)
            return false;
        if (other.getCheckId() == null ^ this.getCheckId() == null)
            return false;
        if (other.getCheckId() != null && other.getCheckId().equals(this.getCheckId()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null && other.getLevel().equals(this.getLevel()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getScanArn() == null ^ this.getScanArn() == null)
            return false;
        if (other.getScanArn() != null && other.getScanArn().equals(this.getScanArn()) == false)
            return false;
        if (other.getStatusCounts() == null ^ this.getStatusCounts() == null)
            return false;
        if (other.getStatusCounts() != null && other.getStatusCounts().equals(this.getStatusCounts()) == false)
            return false;
        if (other.getTitle() == null ^ this.getTitle() == null)
            return false;
        if (other.getTitle() != null && other.getTitle().equals(this.getTitle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getCheckDescription() == null) ? 0 : getCheckDescription().hashCode());
        hashCode = prime * hashCode + ((getCheckId() == null) ? 0 : getCheckId().hashCode());
        hashCode = prime * hashCode + ((getLevel() == null) ? 0 : getLevel().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getScanArn() == null) ? 0 : getScanArn().hashCode());
        hashCode = prime * hashCode + ((getStatusCounts() == null) ? 0 : getStatusCounts().hashCode());
        hashCode = prime * hashCode + ((getTitle() == null) ? 0 : getTitle().hashCode());
        return hashCode;
    }

    @Override
    public CisCheckAggregation clone() {
        try {
            return (CisCheckAggregation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector2.model.transform.CisCheckAggregationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
