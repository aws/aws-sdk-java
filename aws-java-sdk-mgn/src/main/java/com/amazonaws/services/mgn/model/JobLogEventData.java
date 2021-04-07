/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mgn.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Job log data
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mgn-2020-02-26/JobLogEventData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobLogEventData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Job Event conversion Server ID.
     * </p>
     */
    private String conversionServerID;
    /**
     * <p>
     * Job error.
     * </p>
     */
    private String rawError;
    /**
     * <p>
     * Job Event Source Server ID.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * Job Event Target instance ID.
     * </p>
     */
    private String targetInstanceID;

    /**
     * <p>
     * Job Event conversion Server ID.
     * </p>
     * 
     * @param conversionServerID
     *        Job Event conversion Server ID.
     */

    public void setConversionServerID(String conversionServerID) {
        this.conversionServerID = conversionServerID;
    }

    /**
     * <p>
     * Job Event conversion Server ID.
     * </p>
     * 
     * @return Job Event conversion Server ID.
     */

    public String getConversionServerID() {
        return this.conversionServerID;
    }

    /**
     * <p>
     * Job Event conversion Server ID.
     * </p>
     * 
     * @param conversionServerID
     *        Job Event conversion Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withConversionServerID(String conversionServerID) {
        setConversionServerID(conversionServerID);
        return this;
    }

    /**
     * <p>
     * Job error.
     * </p>
     * 
     * @param rawError
     *        Job error.
     */

    public void setRawError(String rawError) {
        this.rawError = rawError;
    }

    /**
     * <p>
     * Job error.
     * </p>
     * 
     * @return Job error.
     */

    public String getRawError() {
        return this.rawError;
    }

    /**
     * <p>
     * Job error.
     * </p>
     * 
     * @param rawError
     *        Job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withRawError(String rawError) {
        setRawError(rawError);
        return this;
    }

    /**
     * <p>
     * Job Event Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Job Event Source Server ID.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * Job Event Source Server ID.
     * </p>
     * 
     * @return Job Event Source Server ID.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * Job Event Source Server ID.
     * </p>
     * 
     * @param sourceServerID
     *        Job Event Source Server ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * Job Event Target instance ID.
     * </p>
     * 
     * @param targetInstanceID
     *        Job Event Target instance ID.
     */

    public void setTargetInstanceID(String targetInstanceID) {
        this.targetInstanceID = targetInstanceID;
    }

    /**
     * <p>
     * Job Event Target instance ID.
     * </p>
     * 
     * @return Job Event Target instance ID.
     */

    public String getTargetInstanceID() {
        return this.targetInstanceID;
    }

    /**
     * <p>
     * Job Event Target instance ID.
     * </p>
     * 
     * @param targetInstanceID
     *        Job Event Target instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withTargetInstanceID(String targetInstanceID) {
        setTargetInstanceID(targetInstanceID);
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
        if (getConversionServerID() != null)
            sb.append("ConversionServerID: ").append(getConversionServerID()).append(",");
        if (getRawError() != null)
            sb.append("RawError: ").append(getRawError()).append(",");
        if (getSourceServerID() != null)
            sb.append("SourceServerID: ").append(getSourceServerID()).append(",");
        if (getTargetInstanceID() != null)
            sb.append("TargetInstanceID: ").append(getTargetInstanceID());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobLogEventData == false)
            return false;
        JobLogEventData other = (JobLogEventData) obj;
        if (other.getConversionServerID() == null ^ this.getConversionServerID() == null)
            return false;
        if (other.getConversionServerID() != null && other.getConversionServerID().equals(this.getConversionServerID()) == false)
            return false;
        if (other.getRawError() == null ^ this.getRawError() == null)
            return false;
        if (other.getRawError() != null && other.getRawError().equals(this.getRawError()) == false)
            return false;
        if (other.getSourceServerID() == null ^ this.getSourceServerID() == null)
            return false;
        if (other.getSourceServerID() != null && other.getSourceServerID().equals(this.getSourceServerID()) == false)
            return false;
        if (other.getTargetInstanceID() == null ^ this.getTargetInstanceID() == null)
            return false;
        if (other.getTargetInstanceID() != null && other.getTargetInstanceID().equals(this.getTargetInstanceID()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConversionServerID() == null) ? 0 : getConversionServerID().hashCode());
        hashCode = prime * hashCode + ((getRawError() == null) ? 0 : getRawError().hashCode());
        hashCode = prime * hashCode + ((getSourceServerID() == null) ? 0 : getSourceServerID().hashCode());
        hashCode = prime * hashCode + ((getTargetInstanceID() == null) ? 0 : getTargetInstanceID().hashCode());
        return hashCode;
    }

    @Override
    public JobLogEventData clone() {
        try {
            return (JobLogEventData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mgn.model.transform.JobLogEventDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
