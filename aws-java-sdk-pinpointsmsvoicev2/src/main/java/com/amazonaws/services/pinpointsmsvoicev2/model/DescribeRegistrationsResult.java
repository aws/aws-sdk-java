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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-sms-voice-v2-2022-03-31/DescribeRegistrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRegistrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of RegistrationInformation objects.
     * </p>
     */
    private java.util.List<RegistrationInformation> registrations;
    /**
     * <p>
     * The token to be used for the next set of paginated results. You don't need to supply a value for this field in
     * the initial request.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of RegistrationInformation objects.
     * </p>
     * 
     * @return An array of RegistrationInformation objects.
     */

    public java.util.List<RegistrationInformation> getRegistrations() {
        return registrations;
    }

    /**
     * <p>
     * An array of RegistrationInformation objects.
     * </p>
     * 
     * @param registrations
     *        An array of RegistrationInformation objects.
     */

    public void setRegistrations(java.util.Collection<RegistrationInformation> registrations) {
        if (registrations == null) {
            this.registrations = null;
            return;
        }

        this.registrations = new java.util.ArrayList<RegistrationInformation>(registrations);
    }

    /**
     * <p>
     * An array of RegistrationInformation objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegistrations(java.util.Collection)} or {@link #withRegistrations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param registrations
     *        An array of RegistrationInformation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationsResult withRegistrations(RegistrationInformation... registrations) {
        if (this.registrations == null) {
            setRegistrations(new java.util.ArrayList<RegistrationInformation>(registrations.length));
        }
        for (RegistrationInformation ele : registrations) {
            this.registrations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of RegistrationInformation objects.
     * </p>
     * 
     * @param registrations
     *        An array of RegistrationInformation objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRegistrationsResult withRegistrations(java.util.Collection<RegistrationInformation> registrations) {
        setRegistrations(registrations);
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

    public DescribeRegistrationsResult withNextToken(String nextToken) {
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
        if (getRegistrations() != null)
            sb.append("Registrations: ").append(getRegistrations()).append(",");
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

        if (obj instanceof DescribeRegistrationsResult == false)
            return false;
        DescribeRegistrationsResult other = (DescribeRegistrationsResult) obj;
        if (other.getRegistrations() == null ^ this.getRegistrations() == null)
            return false;
        if (other.getRegistrations() != null && other.getRegistrations().equals(this.getRegistrations()) == false)
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

        hashCode = prime * hashCode + ((getRegistrations() == null) ? 0 : getRegistrations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRegistrationsResult clone() {
        try {
            return (DescribeRegistrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
