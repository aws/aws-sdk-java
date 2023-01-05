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
package com.amazonaws.services.cloudcontrolapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResourceRequestStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceRequestStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique token used to track the progress of the resource operation request.
     * </p>
     * <p>
     * Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation request.
     * </p>
     */
    private String requestToken;

    /**
     * <p>
     * A unique token used to track the progress of the resource operation request.
     * </p>
     * <p>
     * Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation request.
     * </p>
     * 
     * @param requestToken
     *        A unique token used to track the progress of the resource operation request.</p>
     *        <p>
     *        Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation
     *        request.
     */

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    /**
     * <p>
     * A unique token used to track the progress of the resource operation request.
     * </p>
     * <p>
     * Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation request.
     * </p>
     * 
     * @return A unique token used to track the progress of the resource operation request.</p>
     *         <p>
     *         Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation
     *         request.
     */

    public String getRequestToken() {
        return this.requestToken;
    }

    /**
     * <p>
     * A unique token used to track the progress of the resource operation request.
     * </p>
     * <p>
     * Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation request.
     * </p>
     * 
     * @param requestToken
     *        A unique token used to track the progress of the resource operation request.</p>
     *        <p>
     *        Request tokens are included in the <code>ProgressEvent</code> type returned by a resource operation
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceRequestStatusRequest withRequestToken(String requestToken) {
        setRequestToken(requestToken);
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
        if (getRequestToken() != null)
            sb.append("RequestToken: ").append(getRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetResourceRequestStatusRequest == false)
            return false;
        GetResourceRequestStatusRequest other = (GetResourceRequestStatusRequest) obj;
        if (other.getRequestToken() == null ^ this.getRequestToken() == null)
            return false;
        if (other.getRequestToken() != null && other.getRequestToken().equals(this.getRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestToken() == null) ? 0 : getRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceRequestStatusRequest clone() {
        return (GetResourceRequestStatusRequest) super.clone();
    }

}
