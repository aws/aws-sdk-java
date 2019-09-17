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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/AcceptQualificationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AcceptQualificationRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     * </p>
     */
    private String qualificationRequestId;
    /**
     * <p>
     * The value of the Qualification. You can omit this value if you are using the presence or absence of the
     * Qualification as the basis for a HIT requirement.
     * </p>
     */
    private Integer integerValue;

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     */

    public void setQualificationRequestId(String qualificationRequestId) {
        this.qualificationRequestId = qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     * </p>
     * 
     * @return The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     */

    public String getQualificationRequestId() {
        return this.qualificationRequestId;
    }

    /**
     * <p>
     * The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     * </p>
     * 
     * @param qualificationRequestId
     *        The ID of the Qualification request, as returned by the <code>GetQualificationRequests</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptQualificationRequestRequest withQualificationRequestId(String qualificationRequestId) {
        setQualificationRequestId(qualificationRequestId);
        return this;
    }

    /**
     * <p>
     * The value of the Qualification. You can omit this value if you are using the presence or absence of the
     * Qualification as the basis for a HIT requirement.
     * </p>
     * 
     * @param integerValue
     *        The value of the Qualification. You can omit this value if you are using the presence or absence of the
     *        Qualification as the basis for a HIT requirement.
     */

    public void setIntegerValue(Integer integerValue) {
        this.integerValue = integerValue;
    }

    /**
     * <p>
     * The value of the Qualification. You can omit this value if you are using the presence or absence of the
     * Qualification as the basis for a HIT requirement.
     * </p>
     * 
     * @return The value of the Qualification. You can omit this value if you are using the presence or absence of the
     *         Qualification as the basis for a HIT requirement.
     */

    public Integer getIntegerValue() {
        return this.integerValue;
    }

    /**
     * <p>
     * The value of the Qualification. You can omit this value if you are using the presence or absence of the
     * Qualification as the basis for a HIT requirement.
     * </p>
     * 
     * @param integerValue
     *        The value of the Qualification. You can omit this value if you are using the presence or absence of the
     *        Qualification as the basis for a HIT requirement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AcceptQualificationRequestRequest withIntegerValue(Integer integerValue) {
        setIntegerValue(integerValue);
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
        if (getQualificationRequestId() != null)
            sb.append("QualificationRequestId: ").append(getQualificationRequestId()).append(",");
        if (getIntegerValue() != null)
            sb.append("IntegerValue: ").append(getIntegerValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceptQualificationRequestRequest == false)
            return false;
        AcceptQualificationRequestRequest other = (AcceptQualificationRequestRequest) obj;
        if (other.getQualificationRequestId() == null ^ this.getQualificationRequestId() == null)
            return false;
        if (other.getQualificationRequestId() != null && other.getQualificationRequestId().equals(this.getQualificationRequestId()) == false)
            return false;
        if (other.getIntegerValue() == null ^ this.getIntegerValue() == null)
            return false;
        if (other.getIntegerValue() != null && other.getIntegerValue().equals(this.getIntegerValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQualificationRequestId() == null) ? 0 : getQualificationRequestId().hashCode());
        hashCode = prime * hashCode + ((getIntegerValue() == null) ? 0 : getIntegerValue().hashCode());
        return hashCode;
    }

    @Override
    public AcceptQualificationRequestRequest clone() {
        return (AcceptQualificationRequestRequest) super.clone();
    }

}
