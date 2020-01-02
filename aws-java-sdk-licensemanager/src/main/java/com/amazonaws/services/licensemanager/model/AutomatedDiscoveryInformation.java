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
package com.amazonaws.services.licensemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes automated discovery.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-2018-08-01/AutomatedDiscoveryInformation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutomatedDiscoveryInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time that automated discovery last ran.
     * </p>
     */
    private java.util.Date lastRunTime;

    /**
     * <p>
     * Time that automated discovery last ran.
     * </p>
     * 
     * @param lastRunTime
     *        Time that automated discovery last ran.
     */

    public void setLastRunTime(java.util.Date lastRunTime) {
        this.lastRunTime = lastRunTime;
    }

    /**
     * <p>
     * Time that automated discovery last ran.
     * </p>
     * 
     * @return Time that automated discovery last ran.
     */

    public java.util.Date getLastRunTime() {
        return this.lastRunTime;
    }

    /**
     * <p>
     * Time that automated discovery last ran.
     * </p>
     * 
     * @param lastRunTime
     *        Time that automated discovery last ran.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutomatedDiscoveryInformation withLastRunTime(java.util.Date lastRunTime) {
        setLastRunTime(lastRunTime);
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
        if (getLastRunTime() != null)
            sb.append("LastRunTime: ").append(getLastRunTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutomatedDiscoveryInformation == false)
            return false;
        AutomatedDiscoveryInformation other = (AutomatedDiscoveryInformation) obj;
        if (other.getLastRunTime() == null ^ this.getLastRunTime() == null)
            return false;
        if (other.getLastRunTime() != null && other.getLastRunTime().equals(this.getLastRunTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastRunTime() == null) ? 0 : getLastRunTime().hashCode());
        return hashCode;
    }

    @Override
    public AutomatedDiscoveryInformation clone() {
        try {
            return (AutomatedDiscoveryInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.licensemanager.model.transform.AutomatedDiscoveryInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
