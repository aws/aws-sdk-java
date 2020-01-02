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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for your Nielsen configuration. If you don't do Nielsen measurement and analytics, ignore these settings.
 * When you enable Nielsen configuration (nielsenConfiguration), MediaConvert enables PCM to ID3 tagging for all outputs
 * in the job. To enable Nielsen configuration programmatically, include an instance of nielsenConfiguration in your
 * JSON job specification. Even if you don't include any children of nielsenConfiguration, you still enable the setting.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NielsenConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NielsenConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value
     * to zero.
     */
    private Integer breakoutCode;
    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     * Neilsen.
     */
    private String distributorId;

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value
     * to zero.
     * 
     * @param breakoutCode
     *        Nielsen has discontinued the use of breakout code functionality. If you must include this property, set
     *        the value to zero.
     */

    public void setBreakoutCode(Integer breakoutCode) {
        this.breakoutCode = breakoutCode;
    }

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value
     * to zero.
     * 
     * @return Nielsen has discontinued the use of breakout code functionality. If you must include this property, set
     *         the value to zero.
     */

    public Integer getBreakoutCode() {
        return this.breakoutCode;
    }

    /**
     * Nielsen has discontinued the use of breakout code functionality. If you must include this property, set the value
     * to zero.
     * 
     * @param breakoutCode
     *        Nielsen has discontinued the use of breakout code functionality. If you must include this property, set
     *        the value to zero.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenConfiguration withBreakoutCode(Integer breakoutCode) {
        setBreakoutCode(breakoutCode);
        return this;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     * Neilsen.
     * 
     * @param distributorId
     *        Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     *        Neilsen.
     */

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     * Neilsen.
     * 
     * @return Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     *         Neilsen.
     */

    public String getDistributorId() {
        return this.distributorId;
    }

    /**
     * Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     * Neilsen.
     * 
     * @param distributorId
     *        Use Distributor ID (DistributorID) to specify the distributor ID that is assigned to your organization by
     *        Neilsen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NielsenConfiguration withDistributorId(String distributorId) {
        setDistributorId(distributorId);
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
        if (getBreakoutCode() != null)
            sb.append("BreakoutCode: ").append(getBreakoutCode()).append(",");
        if (getDistributorId() != null)
            sb.append("DistributorId: ").append(getDistributorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NielsenConfiguration == false)
            return false;
        NielsenConfiguration other = (NielsenConfiguration) obj;
        if (other.getBreakoutCode() == null ^ this.getBreakoutCode() == null)
            return false;
        if (other.getBreakoutCode() != null && other.getBreakoutCode().equals(this.getBreakoutCode()) == false)
            return false;
        if (other.getDistributorId() == null ^ this.getDistributorId() == null)
            return false;
        if (other.getDistributorId() != null && other.getDistributorId().equals(this.getDistributorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBreakoutCode() == null) ? 0 : getBreakoutCode().hashCode());
        hashCode = prime * hashCode + ((getDistributorId() == null) ? 0 : getDistributorId().hashCode());
        return hashCode;
    }

    @Override
    public NielsenConfiguration clone() {
        try {
            return (NielsenConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NielsenConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
