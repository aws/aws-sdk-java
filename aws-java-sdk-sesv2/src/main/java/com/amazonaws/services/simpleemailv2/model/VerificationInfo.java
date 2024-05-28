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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains additional information about the verification status for the identity.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/VerificationInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VerificationInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The last time a verification attempt was made for this identity.
     * </p>
     */
    private java.util.Date lastCheckedTimestamp;
    /**
     * <p>
     * The last time a successful verification was made for this identity.
     * </p>
     */
    private java.util.Date lastSuccessTimestamp;
    /**
     * <p>
     * Provides the reason for the failure describing why Amazon SES was not able to successfully verify the identity.
     * Below are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the record
     * was invalid. Ensure you have published the correct values for the record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS record.
     * Ensure that you have published the correct type of DNS record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     * request. Ensure that you have published the required DNS record(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification status
     * of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the request.
     * </p>
     * </li>
     * </ul>
     */
    private String errorType;
    /**
     * <p>
     * An object that contains information about the start of authority (SOA) record associated with the identity.
     * </p>
     */
    private SOARecord sOARecord;

    /**
     * <p>
     * The last time a verification attempt was made for this identity.
     * </p>
     * 
     * @param lastCheckedTimestamp
     *        The last time a verification attempt was made for this identity.
     */

    public void setLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        this.lastCheckedTimestamp = lastCheckedTimestamp;
    }

    /**
     * <p>
     * The last time a verification attempt was made for this identity.
     * </p>
     * 
     * @return The last time a verification attempt was made for this identity.
     */

    public java.util.Date getLastCheckedTimestamp() {
        return this.lastCheckedTimestamp;
    }

    /**
     * <p>
     * The last time a verification attempt was made for this identity.
     * </p>
     * 
     * @param lastCheckedTimestamp
     *        The last time a verification attempt was made for this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationInfo withLastCheckedTimestamp(java.util.Date lastCheckedTimestamp) {
        setLastCheckedTimestamp(lastCheckedTimestamp);
        return this;
    }

    /**
     * <p>
     * The last time a successful verification was made for this identity.
     * </p>
     * 
     * @param lastSuccessTimestamp
     *        The last time a successful verification was made for this identity.
     */

    public void setLastSuccessTimestamp(java.util.Date lastSuccessTimestamp) {
        this.lastSuccessTimestamp = lastSuccessTimestamp;
    }

    /**
     * <p>
     * The last time a successful verification was made for this identity.
     * </p>
     * 
     * @return The last time a successful verification was made for this identity.
     */

    public java.util.Date getLastSuccessTimestamp() {
        return this.lastSuccessTimestamp;
    }

    /**
     * <p>
     * The last time a successful verification was made for this identity.
     * </p>
     * 
     * @param lastSuccessTimestamp
     *        The last time a successful verification was made for this identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationInfo withLastSuccessTimestamp(java.util.Date lastSuccessTimestamp) {
        setLastSuccessTimestamp(lastSuccessTimestamp);
        return this;
    }

    /**
     * <p>
     * Provides the reason for the failure describing why Amazon SES was not able to successfully verify the identity.
     * Below are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the record
     * was invalid. Ensure you have published the correct values for the record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS record.
     * Ensure that you have published the correct type of DNS record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     * request. Ensure that you have published the required DNS record(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification status
     * of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorType
     *        Provides the reason for the failure describing why Amazon SES was not able to successfully verify the
     *        identity. Below are the possible values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the
     *        record was invalid. Ensure you have published the correct values for the record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS
     *        record. Ensure that you have published the correct type of DNS record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     *        request. Ensure that you have published the required DNS record(s).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification
     *        status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the
     *        request.
     *        </p>
     *        </li>
     * @see VerificationError
     */

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * <p>
     * Provides the reason for the failure describing why Amazon SES was not able to successfully verify the identity.
     * Below are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the record
     * was invalid. Ensure you have published the correct values for the record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS record.
     * Ensure that you have published the correct type of DNS record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     * request. Ensure that you have published the required DNS record(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification status
     * of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Provides the reason for the failure describing why Amazon SES was not able to successfully verify the
     *         identity. Below are the possible values: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the
     *         record was invalid. Ensure you have published the correct values for the record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS
     *         record. Ensure that you have published the correct type of DNS record.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     *         request. Ensure that you have published the required DNS record(s).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification
     *         status of the domain.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the
     *         request.
     *         </p>
     *         </li>
     * @see VerificationError
     */

    public String getErrorType() {
        return this.errorType;
    }

    /**
     * <p>
     * Provides the reason for the failure describing why Amazon SES was not able to successfully verify the identity.
     * Below are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the record
     * was invalid. Ensure you have published the correct values for the record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS record.
     * Ensure that you have published the correct type of DNS record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     * request. Ensure that you have published the required DNS record(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification status
     * of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorType
     *        Provides the reason for the failure describing why Amazon SES was not able to successfully verify the
     *        identity. Below are the possible values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the
     *        record was invalid. Ensure you have published the correct values for the record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS
     *        record. Ensure that you have published the correct type of DNS record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     *        request. Ensure that you have published the required DNS record(s).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification
     *        status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the
     *        request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationError
     */

    public VerificationInfo withErrorType(String errorType) {
        setErrorType(errorType);
        return this;
    }

    /**
     * <p>
     * Provides the reason for the failure describing why Amazon SES was not able to successfully verify the identity.
     * Below are the possible values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the record
     * was invalid. Ensure you have published the correct values for the record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS record.
     * Ensure that you have published the correct type of DNS record.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     * request. Ensure that you have published the required DNS record(s).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification status
     * of the domain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorType
     *        Provides the reason for the failure describing why Amazon SES was not able to successfully verify the
     *        identity. Below are the possible values: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INVALID_VALUE</code> – Amazon SES was able to find the record, but the value contained within the
     *        record was invalid. Ensure you have published the correct values for the record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TYPE_NOT_FOUND</code> – The queried hostname exists but does not have the requested type of DNS
     *        record. Ensure that you have published the correct type of DNS record.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOST_NOT_FOUND</code> – The queried hostname does not exist or was not reachable at the time of the
     *        request. Ensure that you have published the required DNS record(s).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SERVICE_ERROR</code> – A temporary issue is preventing Amazon SES from determining the verification
     *        status of the domain.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DNS_SERVER_ERROR</code> – The DNS server encountered an issue and was unable to complete the
     *        request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VerificationError
     */

    public VerificationInfo withErrorType(VerificationError errorType) {
        this.errorType = errorType.toString();
        return this;
    }

    /**
     * <p>
     * An object that contains information about the start of authority (SOA) record associated with the identity.
     * </p>
     * 
     * @param sOARecord
     *        An object that contains information about the start of authority (SOA) record associated with the
     *        identity.
     */

    public void setSOARecord(SOARecord sOARecord) {
        this.sOARecord = sOARecord;
    }

    /**
     * <p>
     * An object that contains information about the start of authority (SOA) record associated with the identity.
     * </p>
     * 
     * @return An object that contains information about the start of authority (SOA) record associated with the
     *         identity.
     */

    public SOARecord getSOARecord() {
        return this.sOARecord;
    }

    /**
     * <p>
     * An object that contains information about the start of authority (SOA) record associated with the identity.
     * </p>
     * 
     * @param sOARecord
     *        An object that contains information about the start of authority (SOA) record associated with the
     *        identity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VerificationInfo withSOARecord(SOARecord sOARecord) {
        setSOARecord(sOARecord);
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
        if (getLastCheckedTimestamp() != null)
            sb.append("LastCheckedTimestamp: ").append(getLastCheckedTimestamp()).append(",");
        if (getLastSuccessTimestamp() != null)
            sb.append("LastSuccessTimestamp: ").append(getLastSuccessTimestamp()).append(",");
        if (getErrorType() != null)
            sb.append("ErrorType: ").append(getErrorType()).append(",");
        if (getSOARecord() != null)
            sb.append("SOARecord: ").append(getSOARecord());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerificationInfo == false)
            return false;
        VerificationInfo other = (VerificationInfo) obj;
        if (other.getLastCheckedTimestamp() == null ^ this.getLastCheckedTimestamp() == null)
            return false;
        if (other.getLastCheckedTimestamp() != null && other.getLastCheckedTimestamp().equals(this.getLastCheckedTimestamp()) == false)
            return false;
        if (other.getLastSuccessTimestamp() == null ^ this.getLastSuccessTimestamp() == null)
            return false;
        if (other.getLastSuccessTimestamp() != null && other.getLastSuccessTimestamp().equals(this.getLastSuccessTimestamp()) == false)
            return false;
        if (other.getErrorType() == null ^ this.getErrorType() == null)
            return false;
        if (other.getErrorType() != null && other.getErrorType().equals(this.getErrorType()) == false)
            return false;
        if (other.getSOARecord() == null ^ this.getSOARecord() == null)
            return false;
        if (other.getSOARecord() != null && other.getSOARecord().equals(this.getSOARecord()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLastCheckedTimestamp() == null) ? 0 : getLastCheckedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessTimestamp() == null) ? 0 : getLastSuccessTimestamp().hashCode());
        hashCode = prime * hashCode + ((getErrorType() == null) ? 0 : getErrorType().hashCode());
        hashCode = prime * hashCode + ((getSOARecord() == null) ? 0 : getSOARecord().hashCode());
        return hashCode;
    }

    @Override
    public VerificationInfo clone() {
        try {
            return (VerificationInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.VerificationInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
