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
package com.amazonaws.services.pinpointsmsvoicev2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrationFieldValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegistrationFieldValuesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     */
    private String registrationArn;
    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     */
    private String registrationId;
    /**
     * <p>
     * The current version of the registration.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * </p>
     */
    private java.util.List<RegistrationFieldValueInformation> registrationFieldValues;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     */

    public void setRegistrationArn(String registrationArn) {
        this.registrationArn = registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the registration.
     */

    public String getRegistrationArn() {
        return this.registrationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the registration.
     * </p>
     * 
     * @param registrationArn
     *        The Amazon Resource Name (ARN) for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withRegistrationArn(String registrationArn) {
        setRegistrationArn(registrationArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     */

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @return The unique identifier for the registration.
     */

    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * <p>
     * The unique identifier for the registration.
     * </p>
     * 
     * @param registrationId
     *        The unique identifier for the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withRegistrationId(String registrationId) {
        setRegistrationId(registrationId);
        return this;
    }

    /**
     * <p>
     * The current version of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The current version of the registration.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The current version of the registration.
     * </p>
     * 
     * @return The current version of the registration.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The current version of the registration.
     * </p>
     * 
     * @param versionNumber
     *        The current version of the registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * </p>
     * 
     * @return An array of RegistrationFieldValues objects that contain the values for the requested registration.
     */

    public java.util.List<RegistrationFieldValueInformation> getRegistrationFieldValues() {
        return registrationFieldValues;
    }

    /**
     * <p>
     * An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * </p>
     * 
     * @param registrationFieldValues
     *        An array of RegistrationFieldValues objects that contain the values for the requested registration.
     */

    public void setRegistrationFieldValues(java.util.Collection<RegistrationFieldValueInformation> registrationFieldValues) {
        if (registrationFieldValues == null) {
            this.registrationFieldValues = null;
            return;
        }

        this.registrationFieldValues = new java.util.ArrayList<RegistrationFieldValueInformation>(registrationFieldValues);
    }

    /**
     * <p>
     * An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegistrationFieldValues(java.util.Collection)} or
     * {@link #withRegistrationFieldValues(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param registrationFieldValues
     *        An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withRegistrationFieldValues(RegistrationFieldValueInformation... registrationFieldValues) {
        if (this.registrationFieldValues == null) {
            setRegistrationFieldValues(new java.util.ArrayList<RegistrationFieldValueInformation>(registrationFieldValues.length));
        }
        for (RegistrationFieldValueInformation ele : registrationFieldValues) {
            this.registrationFieldValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * </p>
     * 
     * @param registrationFieldValues
     *        An array of RegistrationFieldValues objects that contain the values for the requested registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withRegistrationFieldValues(java.util.Collection<RegistrationFieldValueInformation> registrationFieldValues) {
        setRegistrationFieldValues(registrationFieldValues);
        return this;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @return The token to be used for the next set of paginated results. You don't need to supply a value for this
     *         field in the initial request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     * 
     * @param nextToken
     *        The token to be used for the next set of paginated results. You don't need to supply a value for this
     *        field in the initial request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationFieldValuesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getRegistrationArn() != null)
            sb.append("RegistrationArn: ").append(getRegistrationArn()).append(",");
        if (getRegistrationId() != null)
            sb.append("RegistrationId: ").append(getRegistrationId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getRegistrationFieldValues() != null)
            sb.append("RegistrationFieldValues: ").append(getRegistrationFieldValues()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRegistrationFieldValuesResult == false)
            return false;
        DescribeRegistrationFieldValuesResult other = (DescribeRegistrationFieldValuesResult) obj;
        if (other.getRegistrationArn() == null ^ this.getRegistrationArn() == null)
            return false;
        if (other.getRegistrationArn() != null && other.getRegistrationArn().equals(this.getRegistrationArn()) == false)
            return false;
        if (other.getRegistrationId() == null ^ this.getRegistrationId() == null)
            return false;
        if (other.getRegistrationId() != null && other.getRegistrationId().equals(this.getRegistrationId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getRegistrationFieldValues() == null ^ this.getRegistrationFieldValues() == null)
            return false;
        if (other.getRegistrationFieldValues() != null && other.getRegistrationFieldValues().equals(this.getRegistrationFieldValues()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistrationArn() == null) ? 0 : getRegistrationArn().hashCode());
        hashCode = prime * hashCode + ((getRegistrationId() == null) ? 0 : getRegistrationId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getRegistrationFieldValues() == null) ? 0 : getRegistrationFieldValues().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegistrationFieldValuesResult clone() {
        try {
            return (DescribeRegistrationFieldValuesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
