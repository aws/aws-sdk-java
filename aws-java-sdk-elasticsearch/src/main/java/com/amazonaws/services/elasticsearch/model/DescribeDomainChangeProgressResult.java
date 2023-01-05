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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The result of a <code>DescribeDomainChangeProgress</code> request. Contains the progress information of the requested
 * domain change.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDomainChangeProgressResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Progress information for the configuration change that is requested in the
     * <code>DescribeDomainChangeProgress</code> request.
     * </p>
     */
    private ChangeProgressStatusDetails changeProgressStatus;

    /**
     * <p>
     * Progress information for the configuration change that is requested in the
     * <code>DescribeDomainChangeProgress</code> request.
     * </p>
     * 
     * @param changeProgressStatus
     *        Progress information for the configuration change that is requested in the
     *        <code>DescribeDomainChangeProgress</code> request.
     */

    public void setChangeProgressStatus(ChangeProgressStatusDetails changeProgressStatus) {
        this.changeProgressStatus = changeProgressStatus;
    }

    /**
     * <p>
     * Progress information for the configuration change that is requested in the
     * <code>DescribeDomainChangeProgress</code> request.
     * </p>
     * 
     * @return Progress information for the configuration change that is requested in the
     *         <code>DescribeDomainChangeProgress</code> request.
     */

    public ChangeProgressStatusDetails getChangeProgressStatus() {
        return this.changeProgressStatus;
    }

    /**
     * <p>
     * Progress information for the configuration change that is requested in the
     * <code>DescribeDomainChangeProgress</code> request.
     * </p>
     * 
     * @param changeProgressStatus
     *        Progress information for the configuration change that is requested in the
     *        <code>DescribeDomainChangeProgress</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDomainChangeProgressResult withChangeProgressStatus(ChangeProgressStatusDetails changeProgressStatus) {
        setChangeProgressStatus(changeProgressStatus);
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
        if (getChangeProgressStatus() != null)
            sb.append("ChangeProgressStatus: ").append(getChangeProgressStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDomainChangeProgressResult == false)
            return false;
        DescribeDomainChangeProgressResult other = (DescribeDomainChangeProgressResult) obj;
        if (other.getChangeProgressStatus() == null ^ this.getChangeProgressStatus() == null)
            return false;
        if (other.getChangeProgressStatus() != null && other.getChangeProgressStatus().equals(this.getChangeProgressStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChangeProgressStatus() == null) ? 0 : getChangeProgressStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDomainChangeProgressResult clone() {
        try {
            return (DescribeDomainChangeProgressResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
