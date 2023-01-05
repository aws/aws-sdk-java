/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Metadata associated with a Job log.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/JobLogEventData" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobLogEventData implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Properties of a conversion job
     * </p>
     */
    private ConversionProperties conversionProperties;
    /**
     * <p>
     * The ID of a conversion server.
     * </p>
     */
    private String conversionServerID;
    /**
     * <p>
     * A string representing a job error.
     * </p>
     */
    private String rawError;
    /**
     * <p>
     * The ID of a Source Server.
     * </p>
     */
    private String sourceServerID;
    /**
     * <p>
     * The ID of a Recovery Instance.
     * </p>
     */
    private String targetInstanceID;

    /**
     * <p>
     * Properties of a conversion job
     * </p>
     * 
     * @param conversionProperties
     *        Properties of a conversion job
     */

    public void setConversionProperties(ConversionProperties conversionProperties) {
        this.conversionProperties = conversionProperties;
    }

    /**
     * <p>
     * Properties of a conversion job
     * </p>
     * 
     * @return Properties of a conversion job
     */

    public ConversionProperties getConversionProperties() {
        return this.conversionProperties;
    }

    /**
     * <p>
     * Properties of a conversion job
     * </p>
     * 
     * @param conversionProperties
     *        Properties of a conversion job
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withConversionProperties(ConversionProperties conversionProperties) {
        setConversionProperties(conversionProperties);
        return this;
    }

    /**
     * <p>
     * The ID of a conversion server.
     * </p>
     * 
     * @param conversionServerID
     *        The ID of a conversion server.
     */

    public void setConversionServerID(String conversionServerID) {
        this.conversionServerID = conversionServerID;
    }

    /**
     * <p>
     * The ID of a conversion server.
     * </p>
     * 
     * @return The ID of a conversion server.
     */

    public String getConversionServerID() {
        return this.conversionServerID;
    }

    /**
     * <p>
     * The ID of a conversion server.
     * </p>
     * 
     * @param conversionServerID
     *        The ID of a conversion server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withConversionServerID(String conversionServerID) {
        setConversionServerID(conversionServerID);
        return this;
    }

    /**
     * <p>
     * A string representing a job error.
     * </p>
     * 
     * @param rawError
     *        A string representing a job error.
     */

    public void setRawError(String rawError) {
        this.rawError = rawError;
    }

    /**
     * <p>
     * A string representing a job error.
     * </p>
     * 
     * @return A string representing a job error.
     */

    public String getRawError() {
        return this.rawError;
    }

    /**
     * <p>
     * A string representing a job error.
     * </p>
     * 
     * @param rawError
     *        A string representing a job error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withRawError(String rawError) {
        setRawError(rawError);
        return this;
    }

    /**
     * <p>
     * The ID of a Source Server.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of a Source Server.
     */

    public void setSourceServerID(String sourceServerID) {
        this.sourceServerID = sourceServerID;
    }

    /**
     * <p>
     * The ID of a Source Server.
     * </p>
     * 
     * @return The ID of a Source Server.
     */

    public String getSourceServerID() {
        return this.sourceServerID;
    }

    /**
     * <p>
     * The ID of a Source Server.
     * </p>
     * 
     * @param sourceServerID
     *        The ID of a Source Server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobLogEventData withSourceServerID(String sourceServerID) {
        setSourceServerID(sourceServerID);
        return this;
    }

    /**
     * <p>
     * The ID of a Recovery Instance.
     * </p>
     * 
     * @param targetInstanceID
     *        The ID of a Recovery Instance.
     */

    public void setTargetInstanceID(String targetInstanceID) {
        this.targetInstanceID = targetInstanceID;
    }

    /**
     * <p>
     * The ID of a Recovery Instance.
     * </p>
     * 
     * @return The ID of a Recovery Instance.
     */

    public String getTargetInstanceID() {
        return this.targetInstanceID;
    }

    /**
     * <p>
     * The ID of a Recovery Instance.
     * </p>
     * 
     * @param targetInstanceID
     *        The ID of a Recovery Instance.
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
        if (getConversionProperties() != null)
            sb.append("ConversionProperties: ").append(getConversionProperties()).append(",");
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
        if (other.getConversionProperties() == null ^ this.getConversionProperties() == null)
            return false;
        if (other.getConversionProperties() != null && other.getConversionProperties().equals(this.getConversionProperties()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getConversionProperties() == null) ? 0 : getConversionProperties().hashCode());
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
        com.amazonaws.services.drs.model.transform.JobLogEventDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
