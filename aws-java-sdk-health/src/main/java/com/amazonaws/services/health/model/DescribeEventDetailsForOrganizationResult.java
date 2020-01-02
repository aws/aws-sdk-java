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
package com.amazonaws.services.health.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/health-2016-08-04/DescribeEventDetailsForOrganization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEventDetailsForOrganizationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     */
    private java.util.List<OrganizationEventDetails> successfulSet;
    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     */
    private java.util.List<OrganizationEventDetailsErrorItem> failedSet;

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * 
     * @return Information about the events that could be retrieved.
     */

    public java.util.List<OrganizationEventDetails> getSuccessfulSet() {
        return successfulSet;
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * 
     * @param successfulSet
     *        Information about the events that could be retrieved.
     */

    public void setSuccessfulSet(java.util.Collection<OrganizationEventDetails> successfulSet) {
        if (successfulSet == null) {
            this.successfulSet = null;
            return;
        }

        this.successfulSet = new java.util.ArrayList<OrganizationEventDetails>(successfulSet);
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSuccessfulSet(java.util.Collection)} or {@link #withSuccessfulSet(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param successfulSet
     *        Information about the events that could be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationResult withSuccessfulSet(OrganizationEventDetails... successfulSet) {
        if (this.successfulSet == null) {
            setSuccessfulSet(new java.util.ArrayList<OrganizationEventDetails>(successfulSet.length));
        }
        for (OrganizationEventDetails ele : successfulSet) {
            this.successfulSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the events that could be retrieved.
     * </p>
     * 
     * @param successfulSet
     *        Information about the events that could be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationResult withSuccessfulSet(java.util.Collection<OrganizationEventDetails> successfulSet) {
        setSuccessfulSet(successfulSet);
        return this;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * 
     * @return Error messages for any events that could not be retrieved.
     */

    public java.util.List<OrganizationEventDetailsErrorItem> getFailedSet() {
        return failedSet;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * 
     * @param failedSet
     *        Error messages for any events that could not be retrieved.
     */

    public void setFailedSet(java.util.Collection<OrganizationEventDetailsErrorItem> failedSet) {
        if (failedSet == null) {
            this.failedSet = null;
            return;
        }

        this.failedSet = new java.util.ArrayList<OrganizationEventDetailsErrorItem>(failedSet);
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailedSet(java.util.Collection)} or {@link #withFailedSet(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param failedSet
     *        Error messages for any events that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationResult withFailedSet(OrganizationEventDetailsErrorItem... failedSet) {
        if (this.failedSet == null) {
            setFailedSet(new java.util.ArrayList<OrganizationEventDetailsErrorItem>(failedSet.length));
        }
        for (OrganizationEventDetailsErrorItem ele : failedSet) {
            this.failedSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error messages for any events that could not be retrieved.
     * </p>
     * 
     * @param failedSet
     *        Error messages for any events that could not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEventDetailsForOrganizationResult withFailedSet(java.util.Collection<OrganizationEventDetailsErrorItem> failedSet) {
        setFailedSet(failedSet);
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
        if (getSuccessfulSet() != null)
            sb.append("SuccessfulSet: ").append(getSuccessfulSet()).append(",");
        if (getFailedSet() != null)
            sb.append("FailedSet: ").append(getFailedSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEventDetailsForOrganizationResult == false)
            return false;
        DescribeEventDetailsForOrganizationResult other = (DescribeEventDetailsForOrganizationResult) obj;
        if (other.getSuccessfulSet() == null ^ this.getSuccessfulSet() == null)
            return false;
        if (other.getSuccessfulSet() != null && other.getSuccessfulSet().equals(this.getSuccessfulSet()) == false)
            return false;
        if (other.getFailedSet() == null ^ this.getFailedSet() == null)
            return false;
        if (other.getFailedSet() != null && other.getFailedSet().equals(this.getFailedSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulSet() == null) ? 0 : getSuccessfulSet().hashCode());
        hashCode = prime * hashCode + ((getFailedSet() == null) ? 0 : getFailedSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEventDetailsForOrganizationResult clone() {
        try {
            return (DescribeEventDetailsForOrganizationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
