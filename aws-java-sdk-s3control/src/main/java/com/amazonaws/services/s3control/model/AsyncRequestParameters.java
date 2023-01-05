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
 * A container for the request parameters associated with an asynchronous request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AsyncRequestParameters" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncRequestParameters implements Serializable, Cloneable {

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     * >CreateMultiRegionAccessPoint</a> request.
     * </p>
     */
    private CreateMultiRegionAccessPointInput createMultiRegionAccessPointRequest;
    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     * >DeleteMultiRegionAccessPoint</a> request.
     * </p>
     */
    private DeleteMultiRegionAccessPointInput deleteMultiRegionAccessPointRequest;
    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     * >PutMultiRegionAccessPoint</a> request.
     * </p>
     */
    private PutMultiRegionAccessPointPolicyInput putMultiRegionAccessPointPolicyRequest;

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     * >CreateMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param createMultiRegionAccessPointRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     *        >CreateMultiRegionAccessPoint</a> request.
     */

    public void setCreateMultiRegionAccessPointRequest(CreateMultiRegionAccessPointInput createMultiRegionAccessPointRequest) {
        this.createMultiRegionAccessPointRequest = createMultiRegionAccessPointRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     * >CreateMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @return A container of the parameters for a <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     *         >CreateMultiRegionAccessPoint</a> request.
     */

    public CreateMultiRegionAccessPointInput getCreateMultiRegionAccessPointRequest() {
        return this.createMultiRegionAccessPointRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     * >CreateMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param createMultiRegionAccessPointRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_CreateMultiRegionAccessPoint.html"
     *        >CreateMultiRegionAccessPoint</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncRequestParameters withCreateMultiRegionAccessPointRequest(CreateMultiRegionAccessPointInput createMultiRegionAccessPointRequest) {
        setCreateMultiRegionAccessPointRequest(createMultiRegionAccessPointRequest);
        return this;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     * >DeleteMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param deleteMultiRegionAccessPointRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     *        >DeleteMultiRegionAccessPoint</a> request.
     */

    public void setDeleteMultiRegionAccessPointRequest(DeleteMultiRegionAccessPointInput deleteMultiRegionAccessPointRequest) {
        this.deleteMultiRegionAccessPointRequest = deleteMultiRegionAccessPointRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     * >DeleteMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @return A container of the parameters for a <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     *         >DeleteMultiRegionAccessPoint</a> request.
     */

    public DeleteMultiRegionAccessPointInput getDeleteMultiRegionAccessPointRequest() {
        return this.deleteMultiRegionAccessPointRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     * >DeleteMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param deleteMultiRegionAccessPointRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_DeleteMultiRegionAccessPoint.html"
     *        >DeleteMultiRegionAccessPoint</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncRequestParameters withDeleteMultiRegionAccessPointRequest(DeleteMultiRegionAccessPointInput deleteMultiRegionAccessPointRequest) {
        setDeleteMultiRegionAccessPointRequest(deleteMultiRegionAccessPointRequest);
        return this;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     * >PutMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param putMultiRegionAccessPointPolicyRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     *        >PutMultiRegionAccessPoint</a> request.
     */

    public void setPutMultiRegionAccessPointPolicyRequest(PutMultiRegionAccessPointPolicyInput putMultiRegionAccessPointPolicyRequest) {
        this.putMultiRegionAccessPointPolicyRequest = putMultiRegionAccessPointPolicyRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     * >PutMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @return A container of the parameters for a <a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     *         >PutMultiRegionAccessPoint</a> request.
     */

    public PutMultiRegionAccessPointPolicyInput getPutMultiRegionAccessPointPolicyRequest() {
        return this.putMultiRegionAccessPointPolicyRequest;
    }

    /**
     * <p>
     * A container of the parameters for a <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     * >PutMultiRegionAccessPoint</a> request.
     * </p>
     * 
     * @param putMultiRegionAccessPointPolicyRequest
     *        A container of the parameters for a <a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/API/API_control_PutMultiRegionAccessPoint.html"
     *        >PutMultiRegionAccessPoint</a> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncRequestParameters withPutMultiRegionAccessPointPolicyRequest(PutMultiRegionAccessPointPolicyInput putMultiRegionAccessPointPolicyRequest) {
        setPutMultiRegionAccessPointPolicyRequest(putMultiRegionAccessPointPolicyRequest);
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
        if (getCreateMultiRegionAccessPointRequest() != null)
            sb.append("CreateMultiRegionAccessPointRequest: ").append(getCreateMultiRegionAccessPointRequest()).append(",");
        if (getDeleteMultiRegionAccessPointRequest() != null)
            sb.append("DeleteMultiRegionAccessPointRequest: ").append(getDeleteMultiRegionAccessPointRequest()).append(",");
        if (getPutMultiRegionAccessPointPolicyRequest() != null)
            sb.append("PutMultiRegionAccessPointPolicyRequest: ").append(getPutMultiRegionAccessPointPolicyRequest());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncRequestParameters == false)
            return false;
        AsyncRequestParameters other = (AsyncRequestParameters) obj;
        if (other.getCreateMultiRegionAccessPointRequest() == null ^ this.getCreateMultiRegionAccessPointRequest() == null)
            return false;
        if (other.getCreateMultiRegionAccessPointRequest() != null
                && other.getCreateMultiRegionAccessPointRequest().equals(this.getCreateMultiRegionAccessPointRequest()) == false)
            return false;
        if (other.getDeleteMultiRegionAccessPointRequest() == null ^ this.getDeleteMultiRegionAccessPointRequest() == null)
            return false;
        if (other.getDeleteMultiRegionAccessPointRequest() != null
                && other.getDeleteMultiRegionAccessPointRequest().equals(this.getDeleteMultiRegionAccessPointRequest()) == false)
            return false;
        if (other.getPutMultiRegionAccessPointPolicyRequest() == null ^ this.getPutMultiRegionAccessPointPolicyRequest() == null)
            return false;
        if (other.getPutMultiRegionAccessPointPolicyRequest() != null
                && other.getPutMultiRegionAccessPointPolicyRequest().equals(this.getPutMultiRegionAccessPointPolicyRequest()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreateMultiRegionAccessPointRequest() == null) ? 0 : getCreateMultiRegionAccessPointRequest().hashCode());
        hashCode = prime * hashCode + ((getDeleteMultiRegionAccessPointRequest() == null) ? 0 : getDeleteMultiRegionAccessPointRequest().hashCode());
        hashCode = prime * hashCode + ((getPutMultiRegionAccessPointPolicyRequest() == null) ? 0 : getPutMultiRegionAccessPointPolicyRequest().hashCode());
        return hashCode;
    }

    @Override
    public AsyncRequestParameters clone() {
        try {
            return (AsyncRequestParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
