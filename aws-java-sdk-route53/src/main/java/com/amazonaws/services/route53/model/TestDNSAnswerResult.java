/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the response to a <code>TestDNSAnswer</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/TestDNSAnswer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TestDNSAnswerResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     */
    private String nameserver;
    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     */
    private String recordName;
    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     */
    private String recordType;
    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this resource record set.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> recordData;
    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most common response code is <code>NOERROR</code>,
     * meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that
     * describes the error. For a list of possible response codes, see <a
     * href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a> on the
     * IANA website.
     * </p>
     */
    private String responseCode;
    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or <code>TCP</code>.
     * </p>
     */
    private String protocol;

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * 
     * @param nameserver
     *        The Amazon Route 53 name server used to respond to the request.
     */

    public void setNameserver(String nameserver) {
        this.nameserver = nameserver;
    }

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * 
     * @return The Amazon Route 53 name server used to respond to the request.
     */

    public String getNameserver() {
        return this.nameserver;
    }

    /**
     * <p>
     * The Amazon Route 53 name server used to respond to the request.
     * </p>
     * 
     * @param nameserver
     *        The Amazon Route 53 name server used to respond to the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withNameserver(String nameserver) {
        setNameserver(nameserver);
        return this;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordName
     *        The name of the resource record set that you submitted a request for.
     */

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * 
     * @return The name of the resource record set that you submitted a request for.
     */

    public String getRecordName() {
        return this.recordName;
    }

    /**
     * <p>
     * The name of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordName
     *        The name of the resource record set that you submitted a request for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withRecordName(String recordName) {
        setRecordName(recordName);
        return this;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set that you submitted a request for.
     * @see RRType
     */

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * 
     * @return The type of the resource record set that you submitted a request for.
     * @see RRType
     */

    public String getRecordType() {
        return this.recordType;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set that you submitted a request for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TestDNSAnswerResult withRecordType(String recordType) {
        setRecordType(recordType);
        return this;
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set that you submitted a request for.
     * @see RRType
     */

    public void setRecordType(RRType recordType) {
        withRecordType(recordType);
    }

    /**
     * <p>
     * The type of the resource record set that you submitted a request for.
     * </p>
     * 
     * @param recordType
     *        The type of the resource record set that you submitted a request for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public TestDNSAnswerResult withRecordType(RRType recordType) {
        this.recordType = recordType.toString();
        return this;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this resource record set.
     * </p>
     * 
     * @return A list that contains values that Amazon Route 53 returned for this resource record set.
     */

    public java.util.List<String> getRecordData() {
        if (recordData == null) {
            recordData = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return recordData;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this resource record set.
     * </p>
     * 
     * @param recordData
     *        A list that contains values that Amazon Route 53 returned for this resource record set.
     */

    public void setRecordData(java.util.Collection<String> recordData) {
        if (recordData == null) {
            this.recordData = null;
            return;
        }

        this.recordData = new com.amazonaws.internal.SdkInternalList<String>(recordData);
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this resource record set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecordData(java.util.Collection)} or {@link #withRecordData(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recordData
     *        A list that contains values that Amazon Route 53 returned for this resource record set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withRecordData(String... recordData) {
        if (this.recordData == null) {
            setRecordData(new com.amazonaws.internal.SdkInternalList<String>(recordData.length));
        }
        for (String ele : recordData) {
            this.recordData.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains values that Amazon Route 53 returned for this resource record set.
     * </p>
     * 
     * @param recordData
     *        A list that contains values that Amazon Route 53 returned for this resource record set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withRecordData(java.util.Collection<String> recordData) {
        setRecordData(recordData);
        return this;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most common response code is <code>NOERROR</code>,
     * meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that
     * describes the error. For a list of possible response codes, see <a
     * href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a> on the
     * IANA website.
     * </p>
     * 
     * @param responseCode
     *        A code that indicates whether the request is valid or not. The most common response code is
     *        <code>NOERROR</code>, meaning that the request is valid. If the response is not valid, Amazon Route 53
     *        returns a response code that describes the error. For a list of possible response codes, see <a
     *        href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a>
     *        on the IANA website.
     */

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most common response code is <code>NOERROR</code>,
     * meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that
     * describes the error. For a list of possible response codes, see <a
     * href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a> on the
     * IANA website.
     * </p>
     * 
     * @return A code that indicates whether the request is valid or not. The most common response code is
     *         <code>NOERROR</code>, meaning that the request is valid. If the response is not valid, Amazon Route 53
     *         returns a response code that describes the error. For a list of possible response codes, see <a
     *         href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS
     *         RCODES</a> on the IANA website.
     */

    public String getResponseCode() {
        return this.responseCode;
    }

    /**
     * <p>
     * A code that indicates whether the request is valid or not. The most common response code is <code>NOERROR</code>,
     * meaning that the request is valid. If the response is not valid, Amazon Route 53 returns a response code that
     * describes the error. For a list of possible response codes, see <a
     * href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a> on the
     * IANA website.
     * </p>
     * 
     * @param responseCode
     *        A code that indicates whether the request is valid or not. The most common response code is
     *        <code>NOERROR</code>, meaning that the request is valid. If the response is not valid, Amazon Route 53
     *        returns a response code that describes the error. For a list of possible response codes, see <a
     *        href="http://www.iana.org/assignments/dns-parameters/dns-parameters.xhtml#dns-parameters-6">DNS RCODES</a>
     *        on the IANA website.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withResponseCode(String responseCode) {
        setResponseCode(responseCode);
        return this;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or <code>TCP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or
     *        <code>TCP</code>.
     */

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or <code>TCP</code>.
     * </p>
     * 
     * @return The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or
     *         <code>TCP</code>.
     */

    public String getProtocol() {
        return this.protocol;
    }

    /**
     * <p>
     * The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or <code>TCP</code>.
     * </p>
     * 
     * @param protocol
     *        The protocol that Amazon Route 53 used to respond to the request, either <code>UDP</code> or
     *        <code>TCP</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TestDNSAnswerResult withProtocol(String protocol) {
        setProtocol(protocol);
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
        if (getNameserver() != null)
            sb.append("Nameserver: ").append(getNameserver()).append(",");
        if (getRecordName() != null)
            sb.append("RecordName: ").append(getRecordName()).append(",");
        if (getRecordType() != null)
            sb.append("RecordType: ").append(getRecordType()).append(",");
        if (getRecordData() != null)
            sb.append("RecordData: ").append(getRecordData()).append(",");
        if (getResponseCode() != null)
            sb.append("ResponseCode: ").append(getResponseCode()).append(",");
        if (getProtocol() != null)
            sb.append("Protocol: ").append(getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TestDNSAnswerResult == false)
            return false;
        TestDNSAnswerResult other = (TestDNSAnswerResult) obj;
        if (other.getNameserver() == null ^ this.getNameserver() == null)
            return false;
        if (other.getNameserver() != null && other.getNameserver().equals(this.getNameserver()) == false)
            return false;
        if (other.getRecordName() == null ^ this.getRecordName() == null)
            return false;
        if (other.getRecordName() != null && other.getRecordName().equals(this.getRecordName()) == false)
            return false;
        if (other.getRecordType() == null ^ this.getRecordType() == null)
            return false;
        if (other.getRecordType() != null && other.getRecordType().equals(this.getRecordType()) == false)
            return false;
        if (other.getRecordData() == null ^ this.getRecordData() == null)
            return false;
        if (other.getRecordData() != null && other.getRecordData().equals(this.getRecordData()) == false)
            return false;
        if (other.getResponseCode() == null ^ this.getResponseCode() == null)
            return false;
        if (other.getResponseCode() != null && other.getResponseCode().equals(this.getResponseCode()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNameserver() == null) ? 0 : getNameserver().hashCode());
        hashCode = prime * hashCode + ((getRecordName() == null) ? 0 : getRecordName().hashCode());
        hashCode = prime * hashCode + ((getRecordType() == null) ? 0 : getRecordType().hashCode());
        hashCode = prime * hashCode + ((getRecordData() == null) ? 0 : getRecordData().hashCode());
        hashCode = prime * hashCode + ((getResponseCode() == null) ? 0 : getResponseCode().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public TestDNSAnswerResult clone() {
        try {
            return (TestDNSAnswerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
