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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of the case returned by the <a>ResolveCase</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/ResolveCase" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ResolveCaseResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the case when the <a>ResolveCase</a> request was sent.
     * </p>
     */
    private String initialCaseStatus;
    /**
     * <p>
     * The status of the case after the <a>ResolveCase</a> request was processed.
     * </p>
     */
    private String finalCaseStatus;

    /**
     * <p>
     * The status of the case when the <a>ResolveCase</a> request was sent.
     * </p>
     * 
     * @param initialCaseStatus
     *        The status of the case when the <a>ResolveCase</a> request was sent.
     */

    public void setInitialCaseStatus(String initialCaseStatus) {
        this.initialCaseStatus = initialCaseStatus;
    }

    /**
     * <p>
     * The status of the case when the <a>ResolveCase</a> request was sent.
     * </p>
     * 
     * @return The status of the case when the <a>ResolveCase</a> request was sent.
     */

    public String getInitialCaseStatus() {
        return this.initialCaseStatus;
    }

    /**
     * <p>
     * The status of the case when the <a>ResolveCase</a> request was sent.
     * </p>
     * 
     * @param initialCaseStatus
     *        The status of the case when the <a>ResolveCase</a> request was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCaseResult withInitialCaseStatus(String initialCaseStatus) {
        setInitialCaseStatus(initialCaseStatus);
        return this;
    }

    /**
     * <p>
     * The status of the case after the <a>ResolveCase</a> request was processed.
     * </p>
     * 
     * @param finalCaseStatus
     *        The status of the case after the <a>ResolveCase</a> request was processed.
     */

    public void setFinalCaseStatus(String finalCaseStatus) {
        this.finalCaseStatus = finalCaseStatus;
    }

    /**
     * <p>
     * The status of the case after the <a>ResolveCase</a> request was processed.
     * </p>
     * 
     * @return The status of the case after the <a>ResolveCase</a> request was processed.
     */

    public String getFinalCaseStatus() {
        return this.finalCaseStatus;
    }

    /**
     * <p>
     * The status of the case after the <a>ResolveCase</a> request was processed.
     * </p>
     * 
     * @param finalCaseStatus
     *        The status of the case after the <a>ResolveCase</a> request was processed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ResolveCaseResult withFinalCaseStatus(String finalCaseStatus) {
        setFinalCaseStatus(finalCaseStatus);
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
        if (getInitialCaseStatus() != null)
            sb.append("InitialCaseStatus: ").append(getInitialCaseStatus()).append(",");
        if (getFinalCaseStatus() != null)
            sb.append("FinalCaseStatus: ").append(getFinalCaseStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ResolveCaseResult == false)
            return false;
        ResolveCaseResult other = (ResolveCaseResult) obj;
        if (other.getInitialCaseStatus() == null ^ this.getInitialCaseStatus() == null)
            return false;
        if (other.getInitialCaseStatus() != null && other.getInitialCaseStatus().equals(this.getInitialCaseStatus()) == false)
            return false;
        if (other.getFinalCaseStatus() == null ^ this.getFinalCaseStatus() == null)
            return false;
        if (other.getFinalCaseStatus() != null && other.getFinalCaseStatus().equals(this.getFinalCaseStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInitialCaseStatus() == null) ? 0 : getInitialCaseStatus().hashCode());
        hashCode = prime * hashCode + ((getFinalCaseStatus() == null) ? 0 : getFinalCaseStatus().hashCode());
        return hashCode;
    }

    @Override
    public ResolveCaseResult clone() {
        try {
            return (ResolveCaseResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
