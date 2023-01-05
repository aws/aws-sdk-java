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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A container for the response details that are returned when querying about an asynchronous request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AsyncResponseDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncResponseDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The details for the Multi-Region Access Point.
     * </p>
     */
    private MultiRegionAccessPointsAsyncResponse multiRegionAccessPointDetails;
    /**
     * <p>
     * Error details for an asynchronous request.
     * </p>
     */
    private AsyncErrorDetails errorDetails;

    /**
     * <p>
     * The details for the Multi-Region Access Point.
     * </p>
     * 
     * @param multiRegionAccessPointDetails
     *        The details for the Multi-Region Access Point.
     */

    public void setMultiRegionAccessPointDetails(MultiRegionAccessPointsAsyncResponse multiRegionAccessPointDetails) {
        this.multiRegionAccessPointDetails = multiRegionAccessPointDetails;
    }

    /**
     * <p>
     * The details for the Multi-Region Access Point.
     * </p>
     * 
     * @return The details for the Multi-Region Access Point.
     */

    public MultiRegionAccessPointsAsyncResponse getMultiRegionAccessPointDetails() {
        return this.multiRegionAccessPointDetails;
    }

    /**
     * <p>
     * The details for the Multi-Region Access Point.
     * </p>
     * 
     * @param multiRegionAccessPointDetails
     *        The details for the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncResponseDetails withMultiRegionAccessPointDetails(MultiRegionAccessPointsAsyncResponse multiRegionAccessPointDetails) {
        setMultiRegionAccessPointDetails(multiRegionAccessPointDetails);
        return this;
    }

    /**
     * <p>
     * Error details for an asynchronous request.
     * </p>
     * 
     * @param errorDetails
     *        Error details for an asynchronous request.
     */

    public void setErrorDetails(AsyncErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * Error details for an asynchronous request.
     * </p>
     * 
     * @return Error details for an asynchronous request.
     */

    public AsyncErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * Error details for an asynchronous request.
     * </p>
     * 
     * @param errorDetails
     *        Error details for an asynchronous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncResponseDetails withErrorDetails(AsyncErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
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
        if (getMultiRegionAccessPointDetails() != null)
            sb.append("MultiRegionAccessPointDetails: ").append(getMultiRegionAccessPointDetails()).append(",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: ").append(getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncResponseDetails == false)
            return false;
        AsyncResponseDetails other = (AsyncResponseDetails) obj;
        if (other.getMultiRegionAccessPointDetails() == null ^ this.getMultiRegionAccessPointDetails() == null)
            return false;
        if (other.getMultiRegionAccessPointDetails() != null
                && other.getMultiRegionAccessPointDetails().equals(this.getMultiRegionAccessPointDetails()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiRegionAccessPointDetails() == null) ? 0 : getMultiRegionAccessPointDetails().hashCode());
        hashCode = prime * hashCode + ((getErrorDetails() == null) ? 0 : getErrorDetails().hashCode());
        return hashCode;
    }

    @Override
    public AsyncResponseDetails clone() {
        try {
            return (AsyncResponseDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
