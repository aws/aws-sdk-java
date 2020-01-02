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
package com.amazonaws.services.migrationhubconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A home region control is an object that specifies the home region for an account, with some additional information.
 * It contains a target (always of type <code>ACCOUNT</code>), an ID, and a time at which the home region was set.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/migrationhub-config-2019-06-30/HomeRegionControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HomeRegionControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
     * </p>
     */
    private String homeRegion;
    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always an
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     */
    private Target target;
    /**
     * <p>
     * A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set the home
     * region for the account.
     * </p>
     */
    private java.util.Date requestedTime;

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @param controlId
     *        A unique identifier that's generated for each home region control. It's always a string that begins with
     *        "hrc-" followed by 12 lowercase letters and numbers.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @return A unique identifier that's generated for each home region control. It's always a string that begins with
     *         "hrc-" followed by 12 lowercase letters and numbers.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * A unique identifier that's generated for each home region control. It's always a string that begins with "hrc-"
     * followed by 12 lowercase letters and numbers.
     * </p>
     * 
     * @param controlId
     *        A unique identifier that's generated for each home region control. It's always a string that begins with
     *        "hrc-" followed by 12 lowercase letters and numbers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeRegionControl withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
     * </p>
     * 
     * @param homeRegion
     *        The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home
     *        regions.
     */

    public void setHomeRegion(String homeRegion) {
        this.homeRegion = homeRegion;
    }

    /**
     * <p>
     * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
     * </p>
     * 
     * @return The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home
     *         regions.
     */

    public String getHomeRegion() {
        return this.homeRegion;
    }

    /**
     * <p>
     * The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home regions.
     * </p>
     * 
     * @param homeRegion
     *        The AWS Region that's been set as home region. For example, "us-west-2" or "eu-central-1" are valid home
     *        regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeRegionControl withHomeRegion(String homeRegion) {
        setHomeRegion(homeRegion);
        return this;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always an
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The target parameter specifies the identifier to which the home region is applied, which is always an
     *        <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     */

    public void setTarget(Target target) {
        this.target = target;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always an
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @return The target parameter specifies the identifier to which the home region is applied, which is always an
     *         <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     */

    public Target getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target parameter specifies the identifier to which the home region is applied, which is always an
     * <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * </p>
     * 
     * @param target
     *        The target parameter specifies the identifier to which the home region is applied, which is always an
     *        <code>ACCOUNT</code>. It applies the home region to the current <code>ACCOUNT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeRegionControl withTarget(Target target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set the home
     * region for the account.
     * </p>
     * 
     * @param requestedTime
     *        A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set
     *        the home region for the account.
     */

    public void setRequestedTime(java.util.Date requestedTime) {
        this.requestedTime = requestedTime;
    }

    /**
     * <p>
     * A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set the home
     * region for the account.
     * </p>
     * 
     * @return A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set
     *         the home region for the account.
     */

    public java.util.Date getRequestedTime() {
        return this.requestedTime;
    }

    /**
     * <p>
     * A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set the home
     * region for the account.
     * </p>
     * 
     * @param requestedTime
     *        A timestamp representing the time when the customer called <code>CreateHomeregionControl</code> and set
     *        the home region for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HomeRegionControl withRequestedTime(java.util.Date requestedTime) {
        setRequestedTime(requestedTime);
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
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getHomeRegion() != null)
            sb.append("HomeRegion: ").append(getHomeRegion()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getRequestedTime() != null)
            sb.append("RequestedTime: ").append(getRequestedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HomeRegionControl == false)
            return false;
        HomeRegionControl other = (HomeRegionControl) obj;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getHomeRegion() == null ^ this.getHomeRegion() == null)
            return false;
        if (other.getHomeRegion() != null && other.getHomeRegion().equals(this.getHomeRegion()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getRequestedTime() == null ^ this.getRequestedTime() == null)
            return false;
        if (other.getRequestedTime() != null && other.getRequestedTime().equals(this.getRequestedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getHomeRegion() == null) ? 0 : getHomeRegion().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getRequestedTime() == null) ? 0 : getRequestedTime().hashCode());
        return hashCode;
    }

    @Override
    public HomeRegionControl clone() {
        try {
            return (HomeRegionControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.migrationhubconfig.model.transform.HomeRegionControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
