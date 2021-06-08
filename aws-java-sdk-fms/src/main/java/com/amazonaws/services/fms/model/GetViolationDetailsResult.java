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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetViolationDetailsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Violation detail for a resource.
     * </p>
     */
    private ViolationDetail violationDetail;

    /**
     * <p>
     * Violation detail for a resource.
     * </p>
     * 
     * @param violationDetail
     *        Violation detail for a resource.
     */

    public void setViolationDetail(ViolationDetail violationDetail) {
        this.violationDetail = violationDetail;
    }

    /**
     * <p>
     * Violation detail for a resource.
     * </p>
     * 
     * @return Violation detail for a resource.
     */

    public ViolationDetail getViolationDetail() {
        return this.violationDetail;
    }

    /**
     * <p>
     * Violation detail for a resource.
     * </p>
     * 
     * @param violationDetail
     *        Violation detail for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetViolationDetailsResult withViolationDetail(ViolationDetail violationDetail) {
        setViolationDetail(violationDetail);
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
        if (getViolationDetail() != null)
            sb.append("ViolationDetail: ").append(getViolationDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetViolationDetailsResult == false)
            return false;
        GetViolationDetailsResult other = (GetViolationDetailsResult) obj;
        if (other.getViolationDetail() == null ^ this.getViolationDetail() == null)
            return false;
        if (other.getViolationDetail() != null && other.getViolationDetail().equals(this.getViolationDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getViolationDetail() == null) ? 0 : getViolationDetail().hashCode());
        return hashCode;
    }

    @Override
    public GetViolationDetailsResult clone() {
        try {
            return (GetViolationDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
