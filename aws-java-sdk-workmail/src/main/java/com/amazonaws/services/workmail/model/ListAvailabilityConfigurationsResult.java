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
package com.amazonaws.services.workmail.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workmail-2017-10-01/ListAvailabilityConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAvailabilityConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * </p>
     */
    private java.util.List<AvailabilityConfiguration> availabilityConfigurations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no further
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * </p>
     * 
     * @return The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     */

    public java.util.List<AvailabilityConfiguration> getAvailabilityConfigurations() {
        return availabilityConfigurations;
    }

    /**
     * <p>
     * The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * </p>
     * 
     * @param availabilityConfigurations
     *        The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     */

    public void setAvailabilityConfigurations(java.util.Collection<AvailabilityConfiguration> availabilityConfigurations) {
        if (availabilityConfigurations == null) {
            this.availabilityConfigurations = null;
            return;
        }

        this.availabilityConfigurations = new java.util.ArrayList<AvailabilityConfiguration>(availabilityConfigurations);
    }

    /**
     * <p>
     * The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAvailabilityConfigurations(java.util.Collection)} or
     * {@link #withAvailabilityConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param availabilityConfigurations
     *        The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailabilityConfigurationsResult withAvailabilityConfigurations(AvailabilityConfiguration... availabilityConfigurations) {
        if (this.availabilityConfigurations == null) {
            setAvailabilityConfigurations(new java.util.ArrayList<AvailabilityConfiguration>(availabilityConfigurations.length));
        }
        for (AvailabilityConfiguration ele : availabilityConfigurations) {
            this.availabilityConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * </p>
     * 
     * @param availabilityConfigurations
     *        The list of <code>AvailabilityConfiguration</code>'s that exist for the specified WorkMail organization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailabilityConfigurationsResult withAvailabilityConfigurations(java.util.Collection<AvailabilityConfiguration> availabilityConfigurations) {
        setAvailabilityConfigurations(availabilityConfigurations);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no further
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        further results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no further
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *         further results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. The value is <code>null</code> when there are no further
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. The value is <code>null</code> when there are no
     *        further results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAvailabilityConfigurationsResult withNextToken(String nextToken) {
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
        if (getAvailabilityConfigurations() != null)
            sb.append("AvailabilityConfigurations: ").append(getAvailabilityConfigurations()).append(",");
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

        if (obj instanceof ListAvailabilityConfigurationsResult == false)
            return false;
        ListAvailabilityConfigurationsResult other = (ListAvailabilityConfigurationsResult) obj;
        if (other.getAvailabilityConfigurations() == null ^ this.getAvailabilityConfigurations() == null)
            return false;
        if (other.getAvailabilityConfigurations() != null && other.getAvailabilityConfigurations().equals(this.getAvailabilityConfigurations()) == false)
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

        hashCode = prime * hashCode + ((getAvailabilityConfigurations() == null) ? 0 : getAvailabilityConfigurations().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAvailabilityConfigurationsResult clone() {
        try {
            return (ListAvailabilityConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
