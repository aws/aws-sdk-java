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
 * Status details of a conformance pack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/ConformancePackStatusDetail" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConformancePackStatusDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     */
    private String conformancePackName;
    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     */
    private String conformancePackId;
    /**
     * <p>
     * Amazon Resource Name (ARN) of comformance pack.
     * </p>
     */
    private String conformancePackArn;
    /**
     * <p>
     * Indicates deployment status of conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED when a conformance pack creation failed in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED when a conformance pack deletion failed in your account.
     * </p>
     * </li>
     * </ul>
     */
    private String conformancePackState;
    /**
     * <p>
     * Amazon Resource Name (ARN) of AWS CloudFormation stack.
     * </p>
     */
    private String stackArn;
    /**
     * <p>
     * The reason of conformance pack creation failure.
     * </p>
     */
    private String conformancePackStatusReason;
    /**
     * <p>
     * Last time when conformation pack creation and update was requested.
     * </p>
     */
    private java.util.Date lastUpdateRequestedTime;
    /**
     * <p>
     * Last time when conformation pack creation and update was successful.
     * </p>
     */
    private java.util.Date lastUpdateCompletedTime;

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     */

    public void setConformancePackName(String conformancePackName) {
        this.conformancePackName = conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @return Name of the conformance pack.
     */

    public String getConformancePackName() {
        return this.conformancePackName;
    }

    /**
     * <p>
     * Name of the conformance pack.
     * </p>
     * 
     * @param conformancePackName
     *        Name of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withConformancePackName(String conformancePackName) {
        setConformancePackName(conformancePackName);
        return this;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @param conformancePackId
     *        ID of the conformance pack.
     */

    public void setConformancePackId(String conformancePackId) {
        this.conformancePackId = conformancePackId;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @return ID of the conformance pack.
     */

    public String getConformancePackId() {
        return this.conformancePackId;
    }

    /**
     * <p>
     * ID of the conformance pack.
     * </p>
     * 
     * @param conformancePackId
     *        ID of the conformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withConformancePackId(String conformancePackId) {
        setConformancePackId(conformancePackId);
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of comformance pack.
     * </p>
     * 
     * @param conformancePackArn
     *        Amazon Resource Name (ARN) of comformance pack.
     */

    public void setConformancePackArn(String conformancePackArn) {
        this.conformancePackArn = conformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of comformance pack.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of comformance pack.
     */

    public String getConformancePackArn() {
        return this.conformancePackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of comformance pack.
     * </p>
     * 
     * @param conformancePackArn
     *        Amazon Resource Name (ARN) of comformance pack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withConformancePackArn(String conformancePackArn) {
        setConformancePackArn(conformancePackArn);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED when a conformance pack creation failed in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED when a conformance pack deletion failed in your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conformancePackState
     *        Indicates deployment status of conformance pack.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED when a conformance pack creation failed in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED when a conformance pack deletion failed in your account.
     *        </p>
     *        </li>
     * @see ConformancePackState
     */

    public void setConformancePackState(String conformancePackState) {
        this.conformancePackState = conformancePackState;
    }

    /**
     * <p>
     * Indicates deployment status of conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED when a conformance pack creation failed in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED when a conformance pack deletion failed in your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates deployment status of conformance pack.</p>
     *         <p>
     *         AWS Config sets the state of the conformance pack to:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE_FAILED when a conformance pack creation failed in your account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE_FAILED when a conformance pack deletion failed in your account.
     *         </p>
     *         </li>
     * @see ConformancePackState
     */

    public String getConformancePackState() {
        return this.conformancePackState;
    }

    /**
     * <p>
     * Indicates deployment status of conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED when a conformance pack creation failed in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED when a conformance pack deletion failed in your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conformancePackState
     *        Indicates deployment status of conformance pack.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED when a conformance pack creation failed in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED when a conformance pack deletion failed in your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackState
     */

    public ConformancePackStatusDetail withConformancePackState(String conformancePackState) {
        setConformancePackState(conformancePackState);
        return this;
    }

    /**
     * <p>
     * Indicates deployment status of conformance pack.
     * </p>
     * <p>
     * AWS Config sets the state of the conformance pack to:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE_FAILED when a conformance pack creation failed in your account.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE_FAILED when a conformance pack deletion failed in your account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param conformancePackState
     *        Indicates deployment status of conformance pack.</p>
     *        <p>
     *        AWS Config sets the state of the conformance pack to:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE_IN_PROGRESS when a conformance pack creation is in progress for an account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_COMPLETE when a conformance pack has been successfully created in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE_FAILED when a conformance pack creation failed in your account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_IN_PROGRESS when a conformance pack deletion is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE_FAILED when a conformance pack deletion failed in your account.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConformancePackState
     */

    public ConformancePackStatusDetail withConformancePackState(ConformancePackState conformancePackState) {
        this.conformancePackState = conformancePackState.toString();
        return this;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of AWS CloudFormation stack.
     * </p>
     * 
     * @param stackArn
     *        Amazon Resource Name (ARN) of AWS CloudFormation stack.
     */

    public void setStackArn(String stackArn) {
        this.stackArn = stackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of AWS CloudFormation stack.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) of AWS CloudFormation stack.
     */

    public String getStackArn() {
        return this.stackArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) of AWS CloudFormation stack.
     * </p>
     * 
     * @param stackArn
     *        Amazon Resource Name (ARN) of AWS CloudFormation stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withStackArn(String stackArn) {
        setStackArn(stackArn);
        return this;
    }

    /**
     * <p>
     * The reason of conformance pack creation failure.
     * </p>
     * 
     * @param conformancePackStatusReason
     *        The reason of conformance pack creation failure.
     */

    public void setConformancePackStatusReason(String conformancePackStatusReason) {
        this.conformancePackStatusReason = conformancePackStatusReason;
    }

    /**
     * <p>
     * The reason of conformance pack creation failure.
     * </p>
     * 
     * @return The reason of conformance pack creation failure.
     */

    public String getConformancePackStatusReason() {
        return this.conformancePackStatusReason;
    }

    /**
     * <p>
     * The reason of conformance pack creation failure.
     * </p>
     * 
     * @param conformancePackStatusReason
     *        The reason of conformance pack creation failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withConformancePackStatusReason(String conformancePackStatusReason) {
        setConformancePackStatusReason(conformancePackStatusReason);
        return this;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was requested.
     * </p>
     * 
     * @param lastUpdateRequestedTime
     *        Last time when conformation pack creation and update was requested.
     */

    public void setLastUpdateRequestedTime(java.util.Date lastUpdateRequestedTime) {
        this.lastUpdateRequestedTime = lastUpdateRequestedTime;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was requested.
     * </p>
     * 
     * @return Last time when conformation pack creation and update was requested.
     */

    public java.util.Date getLastUpdateRequestedTime() {
        return this.lastUpdateRequestedTime;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was requested.
     * </p>
     * 
     * @param lastUpdateRequestedTime
     *        Last time when conformation pack creation and update was requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withLastUpdateRequestedTime(java.util.Date lastUpdateRequestedTime) {
        setLastUpdateRequestedTime(lastUpdateRequestedTime);
        return this;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was successful.
     * </p>
     * 
     * @param lastUpdateCompletedTime
     *        Last time when conformation pack creation and update was successful.
     */

    public void setLastUpdateCompletedTime(java.util.Date lastUpdateCompletedTime) {
        this.lastUpdateCompletedTime = lastUpdateCompletedTime;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was successful.
     * </p>
     * 
     * @return Last time when conformation pack creation and update was successful.
     */

    public java.util.Date getLastUpdateCompletedTime() {
        return this.lastUpdateCompletedTime;
    }

    /**
     * <p>
     * Last time when conformation pack creation and update was successful.
     * </p>
     * 
     * @param lastUpdateCompletedTime
     *        Last time when conformation pack creation and update was successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConformancePackStatusDetail withLastUpdateCompletedTime(java.util.Date lastUpdateCompletedTime) {
        setLastUpdateCompletedTime(lastUpdateCompletedTime);
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
        if (getConformancePackName() != null)
            sb.append("ConformancePackName: ").append(getConformancePackName()).append(",");
        if (getConformancePackId() != null)
            sb.append("ConformancePackId: ").append(getConformancePackId()).append(",");
        if (getConformancePackArn() != null)
            sb.append("ConformancePackArn: ").append(getConformancePackArn()).append(",");
        if (getConformancePackState() != null)
            sb.append("ConformancePackState: ").append(getConformancePackState()).append(",");
        if (getStackArn() != null)
            sb.append("StackArn: ").append(getStackArn()).append(",");
        if (getConformancePackStatusReason() != null)
            sb.append("ConformancePackStatusReason: ").append(getConformancePackStatusReason()).append(",");
        if (getLastUpdateRequestedTime() != null)
            sb.append("LastUpdateRequestedTime: ").append(getLastUpdateRequestedTime()).append(",");
        if (getLastUpdateCompletedTime() != null)
            sb.append("LastUpdateCompletedTime: ").append(getLastUpdateCompletedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConformancePackStatusDetail == false)
            return false;
        ConformancePackStatusDetail other = (ConformancePackStatusDetail) obj;
        if (other.getConformancePackName() == null ^ this.getConformancePackName() == null)
            return false;
        if (other.getConformancePackName() != null && other.getConformancePackName().equals(this.getConformancePackName()) == false)
            return false;
        if (other.getConformancePackId() == null ^ this.getConformancePackId() == null)
            return false;
        if (other.getConformancePackId() != null && other.getConformancePackId().equals(this.getConformancePackId()) == false)
            return false;
        if (other.getConformancePackArn() == null ^ this.getConformancePackArn() == null)
            return false;
        if (other.getConformancePackArn() != null && other.getConformancePackArn().equals(this.getConformancePackArn()) == false)
            return false;
        if (other.getConformancePackState() == null ^ this.getConformancePackState() == null)
            return false;
        if (other.getConformancePackState() != null && other.getConformancePackState().equals(this.getConformancePackState()) == false)
            return false;
        if (other.getStackArn() == null ^ this.getStackArn() == null)
            return false;
        if (other.getStackArn() != null && other.getStackArn().equals(this.getStackArn()) == false)
            return false;
        if (other.getConformancePackStatusReason() == null ^ this.getConformancePackStatusReason() == null)
            return false;
        if (other.getConformancePackStatusReason() != null && other.getConformancePackStatusReason().equals(this.getConformancePackStatusReason()) == false)
            return false;
        if (other.getLastUpdateRequestedTime() == null ^ this.getLastUpdateRequestedTime() == null)
            return false;
        if (other.getLastUpdateRequestedTime() != null && other.getLastUpdateRequestedTime().equals(this.getLastUpdateRequestedTime()) == false)
            return false;
        if (other.getLastUpdateCompletedTime() == null ^ this.getLastUpdateCompletedTime() == null)
            return false;
        if (other.getLastUpdateCompletedTime() != null && other.getLastUpdateCompletedTime().equals(this.getLastUpdateCompletedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConformancePackName() == null) ? 0 : getConformancePackName().hashCode());
        hashCode = prime * hashCode + ((getConformancePackId() == null) ? 0 : getConformancePackId().hashCode());
        hashCode = prime * hashCode + ((getConformancePackArn() == null) ? 0 : getConformancePackArn().hashCode());
        hashCode = prime * hashCode + ((getConformancePackState() == null) ? 0 : getConformancePackState().hashCode());
        hashCode = prime * hashCode + ((getStackArn() == null) ? 0 : getStackArn().hashCode());
        hashCode = prime * hashCode + ((getConformancePackStatusReason() == null) ? 0 : getConformancePackStatusReason().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateRequestedTime() == null) ? 0 : getLastUpdateRequestedTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateCompletedTime() == null) ? 0 : getLastUpdateCompletedTime().hashCode());
        return hashCode;
    }

    @Override
    public ConformancePackStatusDetail clone() {
        try {
            return (ConformancePackStatusDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.ConformancePackStatusDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
